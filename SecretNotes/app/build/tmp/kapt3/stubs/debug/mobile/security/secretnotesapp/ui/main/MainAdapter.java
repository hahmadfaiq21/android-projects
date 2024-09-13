package mobile.security.secretnotesapp.ui.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lmobile/security/secretnotesapp/ui/main/MainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lmobile/security/secretnotesapp/ui/main/MainAdapter$NoteViewHolder;", "()V", "listNotes", "Ljava/util/ArrayList;", "Lmobile/security/secretnotesapp/data/Note;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListNotes", "", "NoteViewHolder", "app_debug"})
public final class MainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<mobile.security.secretnotesapp.ui.main.MainAdapter.NoteViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<mobile.security.secretnotesapp.data.Note> listNotes = null;
    
    public MainAdapter() {
        super();
    }
    
    public final void setListNotes(@org.jetbrains.annotations.NotNull
    java.util.List<mobile.security.secretnotesapp.data.Note> listNotes) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public mobile.security.secretnotesapp.ui.main.MainAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    mobile.security.secretnotesapp.ui.main.MainAdapter.NoteViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lmobile/security/secretnotesapp/ui/main/MainAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lmobile/security/secretnotesapp/databinding/ItemNoteBinding;", "(Lmobile/security/secretnotesapp/ui/main/MainAdapter;Lmobile/security/secretnotesapp/databinding/ItemNoteBinding;)V", "getNote", "Lmobile/security/secretnotesapp/data/Note;", "getGetNote", "()Lmobile/security/secretnotesapp/data/Note;", "setGetNote", "(Lmobile/security/secretnotesapp/data/Note;)V", "bind", "", "note", "app_debug"})
    public final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final mobile.security.secretnotesapp.databinding.ItemNoteBinding binding = null;
        public mobile.security.secretnotesapp.data.Note getNote;
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull
        mobile.security.secretnotesapp.databinding.ItemNoteBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final mobile.security.secretnotesapp.data.Note getGetNote() {
            return null;
        }
        
        public final void setGetNote(@org.jetbrains.annotations.NotNull
        mobile.security.secretnotesapp.data.Note p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        mobile.security.secretnotesapp.data.Note note) {
        }
    }
}