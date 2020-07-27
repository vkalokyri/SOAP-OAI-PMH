/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.Calendar;
import org.netbeans.xml.schema.myBookListSchema.CollectionListDocument.CollectionList;
import org.netbeans.xml.schema.myBookSchema.CollectionDocument;


/**
 *
 * @author suitcase
 */
public interface OAI_CollectionDAO {
    
   public Calendar getEarliestDatestamp();
   public CollectionDocument getCollection(String collectionID, String bookID);
   public CollectionList getAllCollections();
    
}
