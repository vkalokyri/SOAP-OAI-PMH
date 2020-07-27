/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.exist;

import dao.OAI_BookDAO;
import gr.tuc.music.xmldb.connector.ExistConnector;
import gr.tuc.music.xmldb.connector.ExistConnectorException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import org.apache.xmlbeans.XmlException;
import org.netbeans.xml.schema.myBookListSchema.BookListDocument;
import org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList;
import org.netbeans.xml.schema.myBookSchema.Book;



/**
 *
 * @author suitcase
 */
public class OAI_ExistBookDAO implements OAI_BookDAO {

    
    @Override
    public Book getBook(String bookId){
        // get a connector to the Exist-DB
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookSchema';\n" +
                     " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                     " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                    "    for $element in $elements \n" +
                                                    "    return \n" +
                                                    "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                    "                {$element/@*, $element/node()}\n" +
                                                    "};"+
                     "for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection/myb:books/myb:book[myb:header/myb:id='" + bookId + "']\n" +
                     "        return \n" +
                     "            <Book>\n" +
                     "              <header>\n   "+
                     "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookSchema', '')}\n" +
                     "              </header>\n"+
                     "              <metadata>\n" +
                     "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookSchema', '')}\n" +
                     "              </metadata>\n" +
                     "            </Book>");                                                               
       
        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Book book = null;
        try {
            book = Book.Factory.parse(queryResult);
            return book;
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;
        
        
    }
    
    @Override
    public Book getBookInDCFormat(String bookId, String prefix) {
        
       String result = null;
       ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookSchema';\n" +
                     " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                     " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                    "    for $element in $elements \n" +
                                                    "    return \n" +
                                                    "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                    "                {$element/@*, $element/node()}\n" +
                                                    "};"+
                     "\n" +
                     "for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection/myb:books/myb:book[myb:header/myb:id='" + bookId + "']\n" +
                     "        return \n" +
                     "            <Book>\n" +
                     "              <header>\n   "+
                     "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookSchema', '')}\n" +
                     "              </header>\n"+
                     "              <metadata>\n" +
                     "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookSchema', '')}\n" +
                     "              </metadata>\n" +
                     "            </Book>\n" +
                    "");                                                                    
       
        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        try {
            StringReader reader = new StringReader(queryResult);
            StringWriter writer = new StringWriter();
            
            // create a transform factory instance
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            // create a transformer for the stylesheet
            Transformer transformer = null;
            if(prefix.equalsIgnoreCase("dc")){
                transformer = transformerFactory.newTransformer(new StreamSource(new File("src/schemas/book2dc.xsl")));
            }else{
                transformer = transformerFactory.newTransformer(new StreamSource(new File("src/schemas/book2dcterms.xsl")));
            }
                        
            
            // transform the source XML
            transformer.transform(new javax.xml.transform.stream.StreamSource(reader), new javax.xml.transform.stream.StreamResult(writer));
              
            result = writer.toString();            
            
            reader = new StringReader(result);
            writer = new StringWriter();
            transformer = transformerFactory.newTransformer(new StreamSource(new File("src/schemas/pretty-print.xsl")));
            
            // transform the source XML
            transformer.transform(new javax.xml.transform.stream.StreamSource(reader), new javax.xml.transform.stream.StreamResult(writer));
            result = writer.toString();
            //System.out.println(result);
            
        } catch(TransformerException ex) {
            System.out.println("The XML data failed to be transformed.");            
        }
        
        Book book = null;
        try {
            book = Book.Factory.parse(result);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return book;

    }
    
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooks() {
        
        org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList bookList =org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList.Factory.newInstance();
        
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookListSchema';\n" +
                 " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                 " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                "    for $element in $elements \n" +
                                                "    return \n" +
                                                "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                "                {$element/@*, $element/node()}\n" +
                                                "};"+
                 "<BookList>\n" +
                 "{for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection/myb:books/myb:book\n" +
                 "        return \n" +
                 "            <Book>\n" +
                 "              <header>\n   "+
                 "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </header>\n"+
                 "              <metadata>\n" +
                 "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </metadata>\n" +
                 "            </Book>}\n" +
                "</BookList>");   

        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);
            //System.out.println("getBookResultQuery = "+queryResult);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Bind the Resulted Document...    

        BookListDocument xmlBookList = null;
        try {
            xmlBookList = BookListDocument.Factory.parse(queryResult);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){                
            bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
        }
        
        return bookList;
    }
    
    @Override
    public BookList getAllBooksInDCFormat(String prefix) {
        
        String result = null;
        org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList bookList =org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList.Factory.newInstance();
        
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookListSchema';\n" +
                 " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                 " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                "    for $element in $elements \n" +
                                                "    return \n" +
                                                "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                "                {$element/@*, $element/node()}\n" +
                                                "};"+
                 "<BookList>\n" +
                 "{for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection/myb:books/myb:book\n" +
                 "        return \n" +
                 "            <Book>\n" +
                 "              <header>\n   "+
                 "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </header>\n"+
                 "              <metadata>\n" +
                 "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </metadata>\n" +
                 "            </Book>}\n" +
                "</BookList>");   

        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);
            //System.out.println("getBookResultQuery = "+queryResult);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        result = tranformBookListInDCFormat(queryResult, prefix);
        
        //Bind the Resulted Document...    

        BookListDocument xmlBookList = null;
        try {
            xmlBookList = BookListDocument.Factory.parse(result);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){                
                bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        
        return bookList;
    }
    
    @Override
    public BookList getAllBooks(Calendar from, Calendar until) {
        org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList bookList =org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList.Factory.newInstance();
        
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookListSchema';\n" +
                 " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                 " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                "    for $element in $elements \n" +
                                                "    return \n" +
                                                "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                "                {$element/@*, $element/node()}\n" +
                                                "};"+
                 "<BookList>\n" +
                 "{for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection/myb:books/myb:book\n" +
                 "        return \n" +
                 "            <Book>\n" +
                 "              <header>\n   "+
                 "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </header>\n"+
                 "              <metadata>\n" +
                 "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </metadata>\n" +
                 "            </Book>}\n" +
                "</BookList>");   

        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);
            //System.out.println("getBookResultQuery = "+queryResult);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Bind the Resulted Document...    

        BookListDocument xmlBookList = null;
        try {
            xmlBookList = BookListDocument.Factory.parse(queryResult);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if( from!=null && until!=null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().after(from) && xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().before(until)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else if(from==null && until!=null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().before(until)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else if(from!=null && until==null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().after(from)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else{
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){                
                bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }
        
        return bookList;
    }

    @Override
    public BookList getAllBooksInDCFormat(Calendar from, Calendar until, String prefix) {
        
        String result =null;
        
        org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList bookList =org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList.Factory.newInstance();
        
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookListSchema';\n" +
                 " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                 " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                "    for $element in $elements \n" +
                                                "    return \n" +
                                                "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                "                {$element/@*, $element/node()}\n" +
                                                "};"+
                 "<BookList>\n" +
                 "{for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection/myb:books/myb:book\n" +
                 "        return \n" +
                 "            <Book>\n" +
                 "              <header>\n   "+
                 "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </header>\n"+
                 "              <metadata>\n" +
                 "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </metadata>\n" +
                 "            </Book>}\n" +
                "</BookList>");   

        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);
            //System.out.println("getBookResultQuery = "+queryResult);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        result = tranformBookListInDCFormat(queryResult, prefix);

        //Bind the Resulted Document...    

        BookListDocument xmlBookList = null;
        try {
            xmlBookList = BookListDocument.Factory.parse(result);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if( from!=null && until!=null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().after(from) && xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().before(until)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else if(from==null && until!=null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().before(until)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else if(from!=null && until==null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().after(from)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else{
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){  
                bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }
        
        return bookList;
    }

    
    @Override
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooks(Calendar from, Calendar until, String collectionID) {
        
        org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList bookList =org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList.Factory.newInstance();
        
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookListSchema';\n" +
                 " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                 " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                "    for $element in $elements \n" +
                                                "    return \n" +
                                                "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                "                {$element/@*, $element/node()}\n" +
                                                "};"+
                 "<BookList>\n" +
                 "{for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection[myb:header/myb:id='" + collectionID + "']/myb:books/myb:book\n" +
                 "        return \n" +
                 "            <Book>\n" +
                 "              <header>\n   "+
                 "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </header>\n"+
                 "              <metadata>\n" +
                 "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </metadata>\n" +
                 "            </Book>}\n" +
                "</BookList>");   

        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);            
        } catch (ExistConnectorException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Bind the Resulted Document...    

        BookListDocument xmlBookList = null;
        try {
            xmlBookList = BookListDocument.Factory.parse(queryResult);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        if( from!=null && until!=null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().after(from) && xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().before(until)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else if(from==null && until!=null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().before(until)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else if(from!=null && until==null){
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().after(from)) 
                    bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }else{
            for(int i=0; i<xmlBookList.getBookList().getBookArray().length; i++){                
                bookList.addNewBook().set(xmlBookList.getBookList().getBookArray(i));
            }
        }
        
        return bookList;
    }
    
     @Override
    public BookList getAllBooksInDCFormat(Calendar from, Calendar until, String collectionID, String prefix) {
         
        String result = null;
        org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList bookList =org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList.Factory.newInstance();
        
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookListSchema';\n" +
                 " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                 " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                "    for $element in $elements \n" +
                                                "    return \n" +
                                                "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                "                {$element/@*, $element/node()}\n" +
                                                "};"+
                 "<BookList>\n" +
                 "{for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection[myb:header/myb:id='" + collectionID + "']/myb:books/myb:book\n" +
                 "        return \n" +
                 "            <Book>\n" +
                 "              <header>\n   "+
                 "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </header>\n"+
                 "              <metadata>\n" +
                 "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                 "              </metadata>\n" +
                 "            </Book>}\n" +
                "</BookList>");   

        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);            
        } catch (ExistConnectorException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        result = tranformBookListInDCFormat(queryResult, prefix);

        //Bind the Resulted Document... 
        
        BookListDocument xmlBookList = null;
        try {
            xmlBookList = BookListDocument.Factory.parse(queryResult);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        BookListDocument dcxmlBookList = null;
        try {
            dcxmlBookList = BookListDocument.Factory.parse(result);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if( from!=null && until!=null){
            for(int i=0; i<dcxmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().after(from) && xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().before(until)) 
                    bookList.addNewBook().set(dcxmlBookList.getBookList().getBookArray(i));
            }
        }else if(from==null && until!=null){
            for(int i=0; i<dcxmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().before(until)) 
                    bookList.addNewBook().set(dcxmlBookList.getBookList().getBookArray(i));
            }
        }else if(from!=null && until==null){
            for(int i=0; i<dcxmlBookList.getBookList().getBookArray().length; i++){
                if(xmlBookList.getBookList().getBookArray(i).getHeader().getLastModified().getDate().after(from)) 
                    bookList.addNewBook().set(dcxmlBookList.getBookList().getBookArray(i));
            }
        }else{
             for(int i=0; i<dcxmlBookList.getBookList().getBookArray().length; i++){                
                bookList.addNewBook().set(dcxmlBookList.getBookList().getBookArray(i));
            }
        }
        
        return bookList;
    }
    
    
    @Override
    public org.netbeans.xml.schema.myBookListSchema.HeaderInfo getBookHeader(String bookId) {
     
        // get a connector to the Exist-DB
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookListSchema';\n" +
                     " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                     " declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                    "    for $element in $elements \n" +
                                                    "    return \n" +
                                                    "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                    "                {$element/@*, $element/node()}\n" +
                                                    "};"+
                     "<BookList>\n" +
                     "{for $b in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection/myb:books/myb:book[myb:header/myb:id='" + bookId + "']\n" +
                     "        return \n" +
                     "            <Book>\n" +
                     "              <header>\n   "+
                     "                {for $h in $b/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                     "              </header>\n"+
                     "              <metadata>\n" +
                     "                {for $m in $b/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                     "              </metadata>\n" +
                     "            </Book>}\n" +
                    "</BookList>");                                                                    
       
        String queryResult = null;
        try {
            queryResult = connector.executeQuery(query);
            //System.out.println("getBookResultQuery = "+queryResult);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Bind the Resulted Document...    
        org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList.Book xmlBook = null;

        BookListDocument xmlBookList = null;
        try {
            xmlBookList = BookListDocument.Factory.parse(queryResult);
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistBookDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        org.netbeans.xml.schema.myBookListSchema.HeaderInfo header = null;
        if(xmlBookList.getBookList().getBookArray().length==1){
            xmlBook = xmlBookList.getBookList().getBookArray(0);
            header =xmlBook.getHeader();
        }

        return header;
    }

        
    private static String readFileAsString(String filePath)
    throws java.io.IOException{
        StringBuffer fileData = new StringBuffer(1000);
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead=0;
        while((numRead=reader.read(buf)) != -1){
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
        return fileData.toString();
    }
    
    
    private String tranformBookListInDCFormat(String queryResult, String prefix){
        String result = null;
         try {
            StringReader reader = new StringReader(queryResult);
            StringWriter writer = new StringWriter();
            
            // create a transform factory instance
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            // create a transformer for the stylesheet
            Transformer transformer = null;
            if(prefix.equalsIgnoreCase("dc")){
                transformer = transformerFactory.newTransformer(new StreamSource(new File("src/schemas/bookList2dc.xsl")));
            }else{
                transformer = transformerFactory.newTransformer(new StreamSource(new File("src/schemas/bookList2dcterms.xsl")));
            }
            
                        
            
            // transform the source XML
            transformer.transform(new javax.xml.transform.stream.StreamSource(reader), new javax.xml.transform.stream.StreamResult(writer));
              
            result = writer.toString();            
            
            reader = new StringReader(result);
            writer = new StringWriter();
            transformer = transformerFactory.newTransformer(new StreamSource(new File("src/schemas/pretty-print.xsl")));
            
            // transform the source XML
            transformer.transform(new javax.xml.transform.stream.StreamSource(reader), new javax.xml.transform.stream.StreamResult(writer));
            result = writer.toString();
            //System.out.println(result);
            
        } catch(TransformerException ex) {
            System.out.println("The XML data failed to be transformed.");            
        }
        return result;
    }

    

}
