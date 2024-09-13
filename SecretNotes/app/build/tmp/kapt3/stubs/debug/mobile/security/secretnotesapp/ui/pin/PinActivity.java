package mobile.security.secretnotesapp.ui.pin;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lmobile/security/secretnotesapp/ui/pin/PinActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_activityPinBinding", "Lmobile/security/secretnotesapp/databinding/ActivityPinBinding;", "binding", "getBinding", "()Lmobile/security/secretnotesapp/databinding/ActivityPinBinding;", "isEdit", "", "note", "Lmobile/security/secretnotesapp/data/Note;", "pinViewModel", "Lmobile/security/secretnotesapp/ui/pin/PinViewModel;", "obtainViewModel", "activity", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveNote", "showToast", "message", "", "Companion", "app_debug"})
public final class PinActivity extends androidx.appcompat.app.AppCompatActivity {
    private boolean isEdit = false;
    @org.jetbrains.annotations.Nullable
    private mobile.security.secretnotesapp.data.Note note;
    private mobile.security.secretnotesapp.ui.pin.PinViewModel pinViewModel;
    @org.jetbrains.annotations.Nullable
    private mobile.security.secretnotesapp.databinding.ActivityPinBinding _activityPinBinding;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_NOTE = "extra_note";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_TITLE = "extra_title";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EXTRA_CONTENT = "extra_content";
    @org.jetbrains.annotations.NotNull
    public static final mobile.security.secretnotesapp.ui.pin.PinActivity.Companion Companion = null;
    
    public PinActivity() {
        super();
    }
    
    private final mobile.security.secretnotesapp.databinding.ActivityPinBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void saveNote() {
    }
    
    private final void showToast(java.lang.String message) {
    }
    
    private final mobile.security.secretnotesapp.ui.pin.PinViewModel obtainViewModel(androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lmobile/security/secretnotesapp/ui/pin/PinActivity$Companion;", "", "()V", "EXTRA_CONTENT", "", "EXTRA_NOTE", "EXTRA_TITLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}