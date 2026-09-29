package kotlin;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampAdjusterProvider implements getApplicationLabel {
    private LinearLayout AudioAttributesCompatParcelizer;
    public final EditText IconCompatParcelizer;
    private final ScrollView MediaBrowserCompatItemReceiver;
    public final EditText RemoteActionCompatParcelizer;
    public final Button read;
    public final Button write;

    private TimestampAdjusterProvider(ScrollView scrollView, Button button, Button button2, EditText editText, EditText editText2, LinearLayout linearLayout) {
        this.MediaBrowserCompatItemReceiver = scrollView;
        this.write = button;
        this.read = button2;
        this.RemoteActionCompatParcelizer = editText;
        this.IconCompatParcelizer = editText2;
        this.AudioAttributesCompatParcelizer = linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ScrollView IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static TimestampAdjusterProvider read(View view) {
        int i = R.id.btnPhoneContinue;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnPhoneContinue);
        if (button != null) {
            i = R.id.btnTryOtherLogin;
            Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnTryOtherLogin);
            if (button2 != null) {
                i = R.id.etCountryCode;
                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etCountryCode);
                if (editText != null) {
                    i = R.id.etPhoneNumber;
                    EditText editText2 = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etPhoneNumber);
                    if (editText2 != null) {
                        i = R.id.llPhoneNumber;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llPhoneNumber);
                        if (linearLayout != null) {
                            return new TimestampAdjusterProvider((ScrollView) view, button, button2, editText, editText2, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
