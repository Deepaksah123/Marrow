package kotlin;

import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.marrow.R;
import com.marrow.ui.views.TimerView;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdjuster implements getApplicationLabel {
    public final AppCompatButton AudioAttributesCompatParcelizer;
    private final ScrollView IconCompatParcelizer;
    public final TimerView RemoteActionCompatParcelizer;
    public final TextView read;
    public final EditText write;

    private getAdjuster(ScrollView scrollView, AppCompatButton appCompatButton, TimerView timerView, EditText editText, TextView textView) {
        this.IconCompatParcelizer = scrollView;
        this.AudioAttributesCompatParcelizer = appCompatButton;
        this.RemoteActionCompatParcelizer = timerView;
        this.write = editText;
        this.read = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public ScrollView IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static getAdjuster IconCompatParcelizer(View view) {
        int i = R.id.btnOtpVerify;
        AppCompatButton appCompatButton = (AppCompatButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnOtpVerify);
        if (appCompatButton != null) {
            i = R.id.btnResendOtpTimer;
            TimerView timerView = (TimerView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnResendOtpTimer);
            if (timerView != null) {
                i = R.id.etOtp;
                EditText editText = (EditText) getApplicationIcon.IconCompatParcelizer(view, R.id.etOtp);
                if (editText != null) {
                    i = R.id.tvOtpHeader;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvOtpHeader);
                    if (textView != null) {
                        return new getAdjuster((ScrollView) view, appCompatButton, timerView, editText, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
