/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Book;
import org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList.Book.Metadata;
import org.netbeans.xml.schema.myBookListSchema.HeaderInfo;



/**
 *
 * @author suitcase
 */
public interface BookDAO {
    
    
    /**
     * Inserts a book to a collection.
     *
     * @param book                      A book.
     * @param collectionId              The collection's identifier.
     * @param userId                    The identifier (username) of the user
     *                                  that submitted the book.
     * @return                          The stored book.
     */
    public abstract Book insertBook(Book book, String collectionId);

    /**
     * Deletes a book from a collection.
     *
     * @param bookId                    The book's identifier.
     * @param collectionId              The collection's identifier.
     * @param userId                    The identifier (username) of the user
     *                                  that deleted the book.
     * @return                          True in case that the book has been
     *                                  deleted successfully, otherwise false.
     */
    public abstract boolean deleteBook(String bookId, String collectionId);

    /**
     * Retrieves a book from a collection.
     *
     * @param bookId                    The book's identifier.
     * @param collectionId              The collection's identifier.
     * @return                          The retrieved book.
     */
    public abstract Book getBook(String bookId);
    
    public HeaderInfo getBookHeader(String bookId);
    public Metadata getBookMetadata(String bookId);
    public Metadata getBookInDCMetadata(String bookId);
    public org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList getAllBooks();
    /**
     * Retrieves a book in DC format from the db.
     *
     * @param bookId                    The book's identifier.
     * @param collectionId              The collection's identifier.
     * @return                          The DC book.
     */
    public abstract String getBookInDCFormat(String bookId);


    /**
     * Updates a book to a collection.
     *
     * @param bookId                    The book's identifier.
     * @param book                      An updated book.
     * @param collectionId              The collection's identifier.
     * @return                          The updated book.
     */
    public abstract Book updateBook(String bookId, Book book, String collectionId);

    /**
     * Retrieves a bookList from a collection.
     *
     * @param bookId                    The book's identifier.
     * @param collectionId              The collection's identifier.
     * @return                          The retrieved book.
     */
    public abstract List<Book> getBookList(String collectionId);
    
    
    /**
     * Retrieves all books with specified criteria from all the collections.
     *
     * @param book                      The desired book metadata values.
     * @return                          The retrieved books.
     */
    public abstract List<Book> searchBook(Book book);

    
}
