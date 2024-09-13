package mobile.security.secretnotesapp.ui.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u000eJ\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u000e2\u0006\u0010\u001a\u001a\u00020\u001bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lmobile/security/secretnotesapp/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_snackbarText", "Landroidx/lifecycle/MutableLiveData;", "Lmobile/security/secretnotesapp/helper/Event;", "", "_undo", "Lmobile/security/secretnotesapp/data/Note;", "mNoteRepository", "Lmobile/security/secretnotesapp/data/NoteRepository;", "snackbarText", "Landroidx/lifecycle/LiveData;", "getSnackbarText", "()Landroidx/lifecycle/LiveData;", "undo", "getUndo", "deleteNote", "", "note", "getAllNotes", "", "insert", "searchNote", "query", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final mobile.security.secretnotesapp.data.NoteRepository mNoteRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<mobile.security.secretnotesapp.helper.Event<java.lang.Integer>> _snackbarText = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<mobile.security.secretnotesapp.helper.Event<java.lang.Integer>> snackbarText = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<mobile.security.secretnotesapp.helper.Event<mobile.security.secretnotesapp.data.Note>> _undo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<mobile.security.secretnotesapp.helper.Event<mobile.security.secretnotesapp.data.Note>> undo = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<mobile.security.secretnotesapp.data.Note>> getAllNotes() {
        return null;
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull
    mobile.security.secretnotesapp.data.Note note) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<mobile.security.secretnotesapp.helper.Event<java.lang.Integer>> getSnackbarText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<mobile.security.secretnotesapp.helper.Event<mobile.security.secretnotesapp.data.Note>> getUndo() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull
    mobile.security.secretnotesapp.data.Note note) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<mobile.security.secretnotesapp.data.Note>> searchNote(@org.jetbrains.annotations.NotNull
    java.lang.String query) {
        return null;
    }
}