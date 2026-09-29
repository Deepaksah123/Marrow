package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class FullSegmentEncryptionKeyCache implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    private TextView AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final ProgressBar IconCompatParcelizer;
    public final WebView RemoteActionCompatParcelizer;
    public final Button read;
    public final LinearLayout write;

    private FullSegmentEncryptionKeyCache(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, WebView webView, LinearLayout linearLayout, ProgressBar progressBar, TextView textView) {
        this.AudioAttributesImplBaseParcelizer = constraintLayout;
        this.read = button;
        this.AudioAttributesCompatParcelizer = constraintLayout2;
        this.RemoteActionCompatParcelizer = webView;
        this.write = linearLayout;
        this.IconCompatParcelizer = progressBar;
        this.AudioAttributesImplApi21Parcelizer = textView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static FullSegmentEncryptionKeyCache IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_device_level_kyc_web, viewGroup, false));
    }

    private static FullSegmentEncryptionKeyCache write(View view) {
        int i = R.id.btnRetry;
        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnRetry);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.kyc_webview;
            WebView webView = (WebView) getApplicationIcon.IconCompatParcelizer(view, R.id.kyc_webview);
            if (webView != null) {
                i = R.id.llErrorContainer;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llErrorContainer);
                if (linearLayout != null) {
                    i = R.id.pbWebviewLoader;
                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbWebviewLoader);
                    if (progressBar != null) {
                        i = R.id.tvErrorMessage;
                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvErrorMessage);
                        if (textView != null) {
                            return new FullSegmentEncryptionKeyCache(constraintLayout, button, constraintLayout, webView, linearLayout, progressBar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
