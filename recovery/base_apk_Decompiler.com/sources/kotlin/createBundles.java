package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createBundles implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final TextView IconCompatParcelizer;
    private TextInputLayout MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final Button RemoteActionCompatParcelizer;
    public final EditText read;
    public final TextView write;

    private createBundles(LinearLayout linearLayout, Button button, TextView textView, EditText editText, TextInputLayout textInputLayout, TextView textView2, TextView textView3, TextView textView4) {
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.RemoteActionCompatParcelizer = button;
        this.write = textView;
        this.read = editText;
        this.MediaBrowserCompatCustomActionResultReceiver = textInputLayout;
        this.AudioAttributesCompatParcelizer = textView2;
        this.IconCompatParcelizer = textView3;
        this.MediaBrowserCompatItemReceiver = textView4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static createBundles RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnEmailPasswordLogin;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnEmailPasswordLogin);
        if (button != null) {
            i = R.id.btnForgotPassword;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnForgotPassword);
            if (textView != null) {
                i = R.id.etPassword;
                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etPassword);
                if (editText != null) {
                    i = R.id.etPasswordLayout;
                    TextInputLayout textInputLayout = (TextInputLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.etPasswordLayout);
                    if (textInputLayout != null) {
                        i = R.id.tvPassword;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPassword);
                        if (textView2 != null) {
                            i = R.id.tvPasswordExistingAccountTitle;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPasswordExistingAccountTitle);
                            if (textView3 != null) {
                                i = R.id.tvPasswordTitle;
                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPasswordTitle);
                                if (textView4 != null) {
                                    return new createBundles((LinearLayout) view, button, textView, editText, textInputLayout, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
