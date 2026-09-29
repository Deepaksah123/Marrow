package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaChunkExtractor implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final Button AudioAttributesImplApi21Parcelizer;
    private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final MaterialToolbar AudioAttributesImplBaseParcelizer;
    public final Button IconCompatParcelizer;
    public final Button MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final ProgressBar RemoteActionCompatParcelizer;
    public final TextView read;
    public final ScrollView write;

    private HlsMediaChunkExtractor(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, ProgressBar progressBar, ScrollView scrollView, Button button, Button button2, Button button3, TextView textView2, MaterialToolbar materialToolbar) {
        this.AudioAttributesImplApi26Parcelizer = constraintLayout;
        this.read = textView;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.RemoteActionCompatParcelizer = progressBar;
        this.write = scrollView;
        this.IconCompatParcelizer = button;
        this.AudioAttributesImplApi21Parcelizer = button2;
        this.MediaBrowserCompatCustomActionResultReceiver = button3;
        this.MediaBrowserCompatItemReceiver = textView2;
        this.AudioAttributesImplBaseParcelizer = materialToolbar;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static HlsMediaChunkExtractor AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_share_app, viewGroup, false));
    }

    private static HlsMediaChunkExtractor AudioAttributesCompatParcelizer(View view) {
        int i = R.id.description;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.description);
        if (textView != null) {
            i = R.id.inviteContainer;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.inviteContainer);
            if (linearLayout != null) {
                i = R.id.loadingContainer;
                ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.loadingContainer);
                if (progressBar != null) {
                    i = R.id.nestedScrollView;
                    ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.nestedScrollView);
                    if (scrollView != null) {
                        i = R.id.shareEmail;
                        Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.shareEmail);
                        if (button != null) {
                            i = R.id.shareOther;
                            Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.shareOther);
                            if (button2 != null) {
                                i = R.id.shareWhatsapp;
                                Button button3 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.shareWhatsapp);
                                if (button3 != null) {
                                    i = R.id.title;
                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.title);
                                    if (textView2 != null) {
                                        i = R.id.toolbar;
                                        MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                        if (materialToolbar != null) {
                                            return new HlsMediaChunkExtractor((ConstraintLayout) view, textView, linearLayout, progressBar, scrollView, button, button2, button3, textView2, materialToolbar);
                                        }
                                    }
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
