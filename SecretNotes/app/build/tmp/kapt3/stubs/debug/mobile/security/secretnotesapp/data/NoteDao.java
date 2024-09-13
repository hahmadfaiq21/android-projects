package mobile.security.secretnotesapp.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lmobile/security/secretnotesapp/data/NoteDao;", "", "delete", "", "note", "Lmobile/security/secretnotesapp/data/Note;", "getAllNotes", "Landroidx/lifecycle/LiveData;", "", "insert", "searchNote", "query", "", "update", "app_debug"})
@androidx.room.Dao
public abstract interface NoteDao {
    
    @androidx.room.Insert(onConflict = 5)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    mobile.security.secretnotesapp.data.Note note);
    
    @androidx.room.Update
    public abstract void update(@org.jetbrains.annotations.NotNull
    mobile.security.secretnotesapp.data.Note note);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    mobile.security.secretnotesapp.data.Note note);
    
    @androidx.room.Query(value = "SELECT * from note ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<mobile.security.secretnotesapp.data.Note>> getAllNotes();
    
    @androidx.room.Query(value = "SELECT * from note WHERE title LIKE :query ORDER BY date DESC")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<mobile.security.secretnotesapp.data.Note>> searchNote(@org.jetbrains.annotations.NotNull
    java.lang.String query);
}