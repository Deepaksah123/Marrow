package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class addMediaPlaylistDataSpecs implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    public final EditText RemoteActionCompatParcelizer;
    private final LinearLayout read;

    private addMediaPlaylistDataSpecs(LinearLayout linearLayout, Button button, EditText editText) {
        this.read = linearLayout;
        this.AudioAttributesCompatParcelizer = button;
        this.RemoteActionCompatParcelizer = editText;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.read;
    }

    public static addMediaPlaylistDataSpecs read(View view) {
        int i = R.id.btnGetNewPassword;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnGetNewPassword);
        if (button != null) {
            i = R.id.etEmail;
            EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etEmail);
            if (editText != null) {
                return new addMediaPlaylistDataSpecs((LinearLayout) view, button, editText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
