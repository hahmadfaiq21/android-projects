package mobile.security.secretnotesapp.ui.add;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0017J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0002J\f\u0010#\u001a\u00020\u0011*\u00020$H\u0002J\u0014\u0010#\u001a\u00020\u0011*\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lmobile/security/secretnotesapp/ui/add/AddNoteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_activityNoteAddUpdateBinding", "Lmobile/security/secretnotesapp/databinding/ActivityAddNoteBinding;", "addNoteViewModel", "Lmobile/security/secretnotesapp/ui/add/AddNoteViewModel;", "binding", "getBinding", "()Lmobile/security/secretnotesapp/databinding/ActivityAddNoteBinding;", "isEdit", "", "note", "Lmobile/security/secretnotesapp/data/Note;", "obtainViewModel", "activity", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "saveNote", "showAlertDialog", "type", "", "showToast", "message", "", "hideKeyboard", "Landroid/app/Activity;", "Landroid/content/Context;", "view", "Landroid/view/View;", "Companion", "app_debug"})
@kotlin.Suppress(names = {"DEPRECATION"})
public final class AddNoteActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean isEdit = false;
    @org.jetbrains.annotations.Nullable
    private mobile.security.secretnotesapp.data.Note note;
    private mobile.security.secretnotesapp.ui.add.AddNoteViewModel addNoteViewModel;
    @org.jetbrains.annotations.Nullable
    private mobile.security.secretnotesapp.databinding.ActivityAddNoteBinding _activityNoteAddUpdateBinding;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_EDIT_NOTE = "extra_edit_note";
    public static final int ALERT_DIALOG_CLOSE = 10;
    public static final int ALERT_DIALOG_DELETE = 20;
    @org.jetbrains.annotations.NotNull
    public static final mobile.security.secretnotesapp.ui.add.AddNoteActivity.Companion Companion = null;
    
    public AddNoteActivity() {
        super();
    }
    
    private final mobile.security.secretnotesapp.databinding.ActivityAddNoteBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    @java.lang.Override
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onBackPressed() {
    }
    
    private final void saveNote() {
    }
    
    private final void hideKeyboard(android.app.Activity $this$hideKeyboard) {
    }
    
    private final void hideKeyboard(android.content.Context $this$hideKeyboard, android.view.View view) {
    }
    
    private final void showAlertDialog(int type) {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    private final mobile.security.secretnotesapp.ui.add.AddNoteViewModel obtainViewModel(androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lmobile/security/secretnotesapp/ui/add/AddNoteActivity$Companion;", "", "()V", "ALERT_DIALOG_CLOSE", "", "ALERT_DIALOG_DELETE", "EXTRA_EDIT_NOTE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}