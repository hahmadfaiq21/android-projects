package mobile.security.secretnotesapp.ui.main;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0001H\u0002J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\rH\u0014J\b\u0010\u001b\u001a\u00020\rH\u0014J\u0016\u0010\u001c\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\f\u0010 \u001a\u00020\r*\u00020!H\u0002J\u0014\u0010 \u001a\u00020\r*\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lmobile/security/secretnotesapp/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_activityMainBinding", "Lmobile/security/secretnotesapp/databinding/ActivityMainBinding;", "adapter", "Lmobile/security/secretnotesapp/ui/main/MainAdapter;", "binding", "getBinding", "()Lmobile/security/secretnotesapp/databinding/ActivityMainBinding;", "noteDatabase", "Lmobile/security/secretnotesapp/data/NoteRoomDatabase;", "initAction", "", "isNoteEmpty", "state", "", "isValidSearch", "input", "", "obtainViewModel", "Lmobile/security/secretnotesapp/ui/main/MainViewModel;", "activity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "showSnackBar", "eventMessage", "Lmobile/security/secretnotesapp/helper/Event;", "", "hideKeyboard", "Landroid/app/Activity;", "Landroid/content/Context;", "view", "Landroid/view/View;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable
    private mobile.security.secretnotesapp.databinding.ActivityMainBinding _activityMainBinding;
    private mobile.security.secretnotesapp.ui.main.MainAdapter adapter;
    private mobile.security.secretnotesapp.data.NoteRoomDatabase noteDatabase;
    
    public MainActivity() {
        super();
    }
    
    private final mobile.security.secretnotesapp.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void hideKeyboard(android.app.Activity $this$hideKeyboard) {
    }
    
    private final void hideKeyboard(android.content.Context $this$hideKeyboard, android.view.View view) {
    }
    
    private final mobile.security.secretnotesapp.ui.main.MainViewModel obtainViewModel(androidx.appcompat.app.AppCompatActivity activity) {
        return null;
    }
    
    private final void isNoteEmpty(boolean state) {
    }
    
    private final void initAction() {
    }
    
    private final void showSnackBar(mobile.security.secretnotesapp.helper.Event<java.lang.Integer> eventMessage) {
    }
    
    private final boolean isValidSearch(java.lang.String input) {
        return false;
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}