/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Calendar;
import org.netbeans.xml.schema.myBookListSchema.HeaderInfo;
import org.netbeans.xml.schema.myBookSchema.Book;



/**
 *
 * @author suitcase
 */
public interface OAI_BookDAO {
    
    public Book getBook(String bookId);
    public Book getBookInDCFormat(String bookId, String prefix);
    public HeaderInfo getBookHeader(String bookId);
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooks();
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooksInDCFormat(String prefix);
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooks(Calendar from, Calendar until);
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooksInDCFormat(Calendar from, Calendar until, String prefix);
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooks(Calendar from, Calendar until, String collectionID);
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooksInDCFormat(Calendar from, Calendar until, String collectionID, String prefix);
    
}
