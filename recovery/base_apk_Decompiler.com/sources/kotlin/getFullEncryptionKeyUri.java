package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getFullEncryptionKeyUri implements getApplicationLabel {
    public final FrameLayout AudioAttributesCompatParcelizer;
    private final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final Button IconCompatParcelizer;
    public final Toolbar MediaBrowserCompatCustomActionResultReceiver;
    public final ProgressBar RemoteActionCompatParcelizer;
    public final FrameLayout read;
    public final WebView write;

    private getFullEncryptionKeyUri(LinearLayout linearLayout, FrameLayout frameLayout, Button button, FrameLayout frameLayout2, WebView webView, ProgressBar progressBar, TextView textView, Toolbar toolbar) {
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.AudioAttributesCompatParcelizer = frameLayout;
        this.IconCompatParcelizer = button;
        this.read = frameLayout2;
        this.write = webView;
        this.RemoteActionCompatParcelizer = progressBar;
        this.AudioAttributesImplApi26Parcelizer = textView;
        this.MediaBrowserCompatCustomActionResultReceiver = toolbar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static getFullEncryptionKeyUri IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_internal_web, viewGroup, false));
    }

    private static getFullEncryptionKeyUri read(View view) {
        int i = R.id.error_container;
        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.error_container);
        if (frameLayout != null) {
            i = R.id.error_retry;
            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.error_retry);
            if (button != null) {
                i = R.id.flContainer;
                FrameLayout frameLayout2 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.flContainer);
                if (frameLayout2 != null) {
                    i = R.id.internal_act_web_view;
                    WebView webView = (WebView) getApplicationIcon.IconCompatParcelizer(view, R.id.internal_act_web_view);
                    if (webView != null) {
                        i = R.id.internal_web_loading_bar;
                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.internal_web_loading_bar);
                        if (progressBar != null) {
                            i = R.id.possible_reason_view;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.possible_reason_view);
                            if (textView != null) {
                                i = R.id.toolbar;
                                Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                if (toolbar != null) {
                                    return new getFullEncryptionKeyUri((LinearLayout) view, frameLayout, button, frameLayout2, webView, progressBar, textView, toolbar);
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
