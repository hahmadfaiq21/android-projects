// Generated by view binder compiler. Do not edit!
package mobile.security.secretnotesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mobile.security.secretnotesapp.R;

public final class ActivityAddNoteBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView charCount;

  @NonNull
  public final EditText edtContent;

  @NonNull
  public final EditText edtTitle;

  @NonNull
  public final TextInputLayout tilDesc;

  private ActivityAddNoteBinding(@NonNull LinearLayout rootView, @NonNull TextView charCount,
      @NonNull EditText edtContent, @NonNull EditText edtTitle, @NonNull TextInputLayout tilDesc) {
    this.rootView = rootView;
    this.charCount = charCount;
    this.edtContent = edtContent;
    this.edtTitle = edtTitle;
    this.tilDesc = tilDesc;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.char_count;
      TextView charCount = ViewBindings.findChildViewById(rootView, id);
      if (charCount == null) {
        break missingId;
      }

      id = R.id.edt_content;
      EditText edtContent = ViewBindings.findChildViewById(rootView, id);
      if (edtContent == null) {
        break missingId;
      }

      id = R.id.edt_title;
      EditText edtTitle = ViewBindings.findChildViewById(rootView, id);
      if (edtTitle == null) {
        break missingId;
      }

      id = R.id.til_desc;
      TextInputLayout tilDesc = ViewBindings.findChildViewById(rootView, id);
      if (tilDesc == null) {
        break missingId;
      }

      return new ActivityAddNoteBinding((LinearLayout) rootView, charCount, edtContent, edtTitle,
          tilDesc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
