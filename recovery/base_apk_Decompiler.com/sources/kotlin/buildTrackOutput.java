package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class buildTrackOutput implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView IconCompatParcelizer;
    public final Button RemoteActionCompatParcelizer;
    public final EditText read;
    private final LinearLayout write;

    private buildTrackOutput(LinearLayout linearLayout, Button button, TextView textView, EditText editText, TextView textView2) {
        this.write = linearLayout;
        this.RemoteActionCompatParcelizer = button;
        this.AudioAttributesCompatParcelizer = textView;
        this.read = editText;
        this.IconCompatParcelizer = textView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.write;
    }

    public static buildTrackOutput read(View view) {
        int i = R.id.btnEmailOtp;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnEmailOtp);
        if (button != null) {
            i = R.id.btnResendOtp;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnResendOtp);
            if (textView != null) {
                i = R.id.etOtpEmail;
                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etOtpEmail);
                if (editText != null) {
                    i = R.id.tvOtpHeader;
                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvOtpHeader);
                    if (textView2 != null) {
                        return new buildTrackOutput((LinearLayout) view, button, textView, editText, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
