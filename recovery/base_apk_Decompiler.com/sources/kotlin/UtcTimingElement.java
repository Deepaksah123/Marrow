package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class UtcTimingElement implements getApplicationLabel {
    private LinearLayout AudioAttributesCompatParcelizer;
    private final ScrollView AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    private TextView MediaBrowserCompatCustomActionResultReceiver;
    public final EditText RemoteActionCompatParcelizer;
    public final EditText read;
    private TextView write;

    private UtcTimingElement(ScrollView scrollView, EditText editText, TextView textView, LinearLayout linearLayout, Button button, EditText editText2, TextView textView2) {
        this.AudioAttributesImplBaseParcelizer = scrollView;
        this.RemoteActionCompatParcelizer = editText;
        this.write = textView;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = button;
        this.read = editText2;
        this.MediaBrowserCompatCustomActionResultReceiver = textView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static UtcTimingElement read(View view) {
        int i = R.id.country_code_value;
        EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.country_code_value);
        if (editText != null) {
            i = R.id.description_text_view;
            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.description_text_view);
            if (textView != null) {
                i = R.id.dialog_root;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.dialog_root);
                if (linearLayout != null) {
                    i = R.id.get_otp_button;
                    Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.get_otp_button);
                    if (button != null) {
                        i = R.id.phone_number_value;
                        EditText editText2 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.phone_number_value);
                        if (editText2 != null) {
                            i = R.id.title_text_view;
                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title_text_view);
                            if (textView2 != null) {
                                return new UtcTimingElement((ScrollView) view, editText, textView, linearLayout, button, editText2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
