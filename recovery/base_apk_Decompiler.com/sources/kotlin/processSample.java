package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class processSample implements getApplicationLabel {
    public final CardView AudioAttributesCompatParcelizer;
    public final EditText IconCompatParcelizer;
    private TextView MediaBrowserCompatCustomActionResultReceiver;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    public final Button read;
    private LinearLayout write;

    private processSample(ConstraintLayout constraintLayout, Button button, CardView cardView, EditText editText, LinearLayout linearLayout, TextView textView) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.read = button;
        this.AudioAttributesCompatParcelizer = cardView;
        this.IconCompatParcelizer = editText;
        this.write = linearLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static processSample IconCompatParcelizer(View view) {
        int i = R.id.btnPhoneContinue;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnPhoneContinue);
        if (button != null) {
            i = R.id.btnSignInGoogle;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnSignInGoogle);
            if (cardView != null) {
                i = R.id.etEmail;
                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etEmail);
                if (editText != null) {
                    i = R.id.orContainer;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.orContainer);
                    if (linearLayout != null) {
                        i = R.id.tvEmailLabel;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmailLabel);
                        if (textView != null) {
                            return new processSample((ConstraintLayout) view, button, cardView, editText, linearLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
