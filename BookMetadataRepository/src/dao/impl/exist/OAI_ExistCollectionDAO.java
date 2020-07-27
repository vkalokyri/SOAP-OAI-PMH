/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl.exist;

import dao.OAI_CollectionDAO;
import gr.tuc.music.xmldb.connector.ExistConnector;
import gr.tuc.music.xmldb.connector.ExistConnectorException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Collection;
import org.apache.xmlbeans.XmlException;
import org.netbeans.xml.schema.myBookListSchema.CollectionListDocument;
import org.netbeans.xml.schema.myBookListSchema.CollectionListDocument.CollectionList;
import org.netbeans.xml.schema.myBookSchema.CollectionDocument;



/**
 * The Collection Data Access Object implementation for the Exist XML database.
 *
 * @author suitcase
 */
public class OAI_ExistCollectionDAO implements OAI_CollectionDAO {

    @Override
    public Calendar getEarliestDatestamp() {
        
        Calendar earliestDatestamp = null;

        ExistCollectionDAO cDAO = new ExistCollectionDAO();
        List<Collection> list = cDAO.getCollectionList();
        if(list!=null){
            if(!list.isEmpty()){
                earliestDatestamp = list.get(0).getLastModifiedOn();
                for(int i=1; i<list.size(); i++){
                    if(list.get(i).getLastModifiedOn().before(earliestDatestamp))
                        earliestDatestamp = list.get(i).getLastModifiedOn();
                }
            }
        }
        return earliestDatestamp;
        
    }

    @Override
    public CollectionDocument getCollection(String collectionID, String bookID) {
        ExistConnector connector = ExistDAOFactory.getConnector();
        String query = null;
        if(collectionID != null){
            query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookSchema';\n" +
                     "for $c in collection(\""+ ExistDAOFactory.METADATA_STORAGE_LOCATION + "\")/Collection[header/id='" + collectionID + "' and header/status!='DELETED']\n" +
                     "return $c");   
        }else{
             query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookSchema';\n" +
                     "for $c in collection(\""+ ExistDAOFactory.METADATA_STORAGE_LOCATION + "\")/Collection/books/book[header/id='" + bookID + "']\n" +
                     "return $c/../..");   
        }
        
        String result = null;
        try {
            result = connector.executeQuery(query);
           // System.out.println(result);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(ExistCollectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        CollectionDocument colDoc = CollectionDocument.Factory.newInstance();
        try {
            colDoc = CollectionDocument.Factory.parse(result);
            return colDoc;
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistCollectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public CollectionList getAllCollections() {
        
        CollectionList collectionList = CollectionList.Factory.newInstance();
        ExistConnector connector = ExistDAOFactory.getConnector();

        String query = ("declare default element namespace 'http://xml.netbeans.org/schema/MyBookListSchema';\n" +
                     " declare namespace myb='http://xml.netbeans.org/schema/MyBookSchema';\n" +
                     "declare function myb:change-element-ns ($elements as element()*, $newns as xs:string, $prefix as xs:string) as element()? {\n" +
                                                    "    for $element in $elements \n" +
                                                    "    return \n" +
                                                    "        element {QName ($newns, fn:concat($prefix, if ($prefix = '') then '' else ':', fn:local-name($element)))}\n" +
                                                    "                {$element/@*, $element/node()}\n" +
                                                    "};"+
                     "    <CollectionList>\n" +
                     "        {for $c in collection('" + ExistDAOFactory.METADATA_STORAGE_LOCATION + "')/myb:Collection[myb:header/myb:status!='DELETED']\n" +
                     "        return \n" +
                     "            <Collection>\n" +
                     "              <header>\n   "+
                     "                {for $h in $c/myb:header/myb:* return myb:change-element-ns($h, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                     "              </header>\n"+
                     "              <metadata>\n" +
                     "                {for $m in $c/myb:metadata/myb:* return myb:change-element-ns($m, 'http://xml.netbeans.org/schema/MyBookListSchema', '')}\n" +
                     "              </metadata>\n" +
                     "            </Collection>}\n" +
                     "    </CollectionList>");
        String queryResult = null;
        //System.out.println(query);
        try {
            queryResult = connector.executeQuery(query);
            System.out.println(queryResult);
        } catch (ExistConnectorException ex) {
            Logger.getLogger(ExistCollectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            CollectionListDocument xmlCollectionList = CollectionListDocument.Factory.parse(queryResult);
            for(int i=0; i<xmlCollectionList.getCollectionList().getCollectionArray().length; i++){                
                collectionList.addNewCollection().set(xmlCollectionList.getCollectionList().getCollectionArray(i));
            }
        } catch (XmlException ex) {
            Logger.getLogger(OAI_ExistCollectionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        return collectionList;
    }

     
   

    
}
