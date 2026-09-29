package kotlin;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class parseInitialization implements getApplicationLabel {
    public final FrameLayout AudioAttributesCompatParcelizer;
    public final HlsMediaPlaylist AudioAttributesImplApi21Parcelizer;
    public final CustomTextView IconCompatParcelizer;
    private final LinearLayout MediaBrowserCompatItemReceiver;
    public final WebView RemoteActionCompatParcelizer;
    public final CustomTextView read;
    public final ProgressBar write;

    private parseInitialization(LinearLayout linearLayout, FrameLayout frameLayout, CustomTextView customTextView, WebView webView, ProgressBar progressBar, CustomTextView customTextView2, HlsMediaPlaylist hlsMediaPlaylist) {
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.AudioAttributesCompatParcelizer = frameLayout;
        this.IconCompatParcelizer = customTextView;
        this.RemoteActionCompatParcelizer = webView;
        this.write = progressBar;
        this.read = customTextView2;
        this.AudioAttributesImplApi21Parcelizer = hlsMediaPlaylist;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public static parseInitialization write(View view) {
        int i = R.id.error_container;
        FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.error_container);
        if (frameLayout != null) {
            i = R.id.error_retry;
            CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.error_retry);
            if (customTextView != null) {
                i = R.id.internal_act_web_view;
                WebView webView = (WebView) getApplicationIcon.IconCompatParcelizer(view, R.id.internal_act_web_view);
                if (webView != null) {
                    i = R.id.internal_web_loading_bar;
                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.internal_web_loading_bar);
                    if (progressBar != null) {
                        i = R.id.possible_reason_view;
                        CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.possible_reason_view);
                        if (customTextView2 != null) {
                            i = R.id.toolbar;
                            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                            if (viewIconCompatParcelizer != null) {
                                return new parseInitialization((LinearLayout) view, frameLayout, customTextView, webView, progressBar, customTextView2, HlsMediaPlaylist.IconCompatParcelizer(viewIconCompatParcelizer));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
