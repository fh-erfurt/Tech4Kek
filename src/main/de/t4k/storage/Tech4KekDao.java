package main.de.t4k.storage;

/*
    Data Access Object definition for Models.
 */
@Dao
public interface Tech4KekDao {
    /*
        Basic insert-, update-, delete-methods
     */
    @Insert
    void insert(Folder folders);

    @Update
    void update(Folder folders);

    @Delete
    void delete(Folder folders);

    @Insert
    void insert(Card cards);

    @Update
    void update(Card cards);

    @Delete
    void delete(Card cards);

    @Insert
    void insert(Page page);

    @Update
    void update(Page page);

    @Delete
    void delete(Page page);

    @Query("DELETE FROM Folder WHERE folderID LIKE :folderID OR parentFolderID LIKE :folderID")
    void deleteFolder(long folderID);

    /*
        Folder
    */
    @Query("SELECT * FROM Folder WHERE parentFolderID LIKE :folderID ORDER BY manualOrderID")
    Folder getFirstFolder(long folderID);

    @Query("SELECT * FROM Folder WHERE parentFolderID LIKE :folderID AND manualOrderID LIKE :manualOrderID")
    Folder getFirstFolderByUserOrder(long folderID, long manualOrderID);

    @Query("SELECT * FROM Folder WHERE folderID LIKE :folderID ORDER BY manualOrderID")
    Folder getFolderWithID(long folderID);

    @Query("SELECT * FROM Folder WHERE parentFolderID LIKE :folderID ORDER BY manualOrderID")
    List<Folder> getFoldersActualValue(long folderID);

    @Query("SELECT * FROM Folder WHERE parentFolderID LIKE :folderID ORDER BY manualOrderID")
    LiveData<List<Folder>> getFoldersByUserOrder(long folderID);

    @Query("SELECT * FROM Folder WHERE parentFolderID LIKE :folderID ORDER BY name ASC")
    LiveData<List<Folder>> getFoldersByNameAsc(long folderID);

    @Query("SELECT * FROM Folder WHERE parentFolderID LIKE :folderID ORDER BY name DESC")
    LiveData<List<Folder>> getFoldersByNameDesc(long folderID);

    @Query("SELECT * FROM Folder WHERE parentFolderID LIKE :folderID ORDER BY modified ASC")
    LiveData<List<Folder>> getFoldersByUpdateAsc(long folderID);

    @Query("SELECT * FROM Folder WHERE parentFolderID LIKE :folderID ORDER BY modified DESC")
    LiveData<List<Folder>> getFoldersByUpdateDesc(long folderID);

    /*
        Card
    */
    @Query("SELECT * FROM Card WHERE parentFolderID LIKE :folderID AND manualOrderID LIKE :manualOrderID")
    Card getFirstCardByUserOrder(long folderID, long manualOrderID);

    @Query("SELECT * FROM Card WHERE parentFolderID LIKE :folderID ORDER BY manualOrderID")
    List<Card> getCardsActualValue(long folderID);

    @Query("SELECT * FROM Card WHERE cardID LIKE :cardID")
    Card getCardByCardID(long cardID);

    @Query("SELECT * FROM Card WHERE parentFolderID LIKE :folderID ORDER BY manualOrderID")
    LiveData<List<Card>> getCardsByUserOrder(long folderID);

    @Query("SELECT * FROM Card WHERE parentFolderID LIKE :folderID ORDER BY name ASC")
    LiveData<List<Card>> getCardsByNameAsc(long folderID);

    @Query("SELECT * FROM Card WHERE parentFolderID LIKE :folderID ORDER BY name DESC")
    LiveData<List<Card>> getCardsByNameDesc(long folderID);

    @Query("SELECT * FROM Card WHERE parentFolderID LIKE :folderID ORDER BY modified ASC")
    LiveData<List<Card>> getCardsByUpdateAsc(long folderID);

    @Query("SELECT * FROM Card WHERE parentFolderID LIKE :folderID ORDER BY modified DESC")
    LiveData<List<Card>> getCardsByUpdateDesc(long folderID);

    /*
        Page
    */
    @Query("SELECT * FROM Page")
    List<Page> getPagesActualValue();

    @Query("SELECT * FROM Page WHERE pageID LIKE :pageID")
    Page getPageByID(long pageID);
}


