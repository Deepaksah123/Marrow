package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class updateSampleStreams implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    private LinearLayout AudioAttributesImplApi26Parcelizer;
    private final ConstraintLayout AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    private ImageView MediaBrowserCompatCustomActionResultReceiver;
    private TextView MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    public final ImageView read;
    public final ProgressBar write;

    private updateSampleStreams(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        this.AudioAttributesImplBaseParcelizer = constraintLayout;
        this.AudioAttributesCompatParcelizer = imageView;
        this.MediaBrowserCompatCustomActionResultReceiver = imageView2;
        this.read = imageView3;
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.write = progressBar;
        this.IconCompatParcelizer = textView;
        this.RemoteActionCompatParcelizer = textView2;
        this.MediaBrowserCompatItemReceiver = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static updateSampleStreams read(View view) {
        int i = R.id.btnDismiss;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnDismiss);
        if (imageView != null) {
            i = R.id.ivPlayPlaceholder;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPlayPlaceholder);
            if (imageView2 != null) {
                i = R.id.ivVideoThumbnail;
                ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivVideoThumbnail);
                if (imageView3 != null) {
                    i = R.id.layoutVideoInfo;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.layoutVideoInfo);
                    if (linearLayout != null) {
                        i = R.id.pbSuggestedVideo;
                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbSuggestedVideo);
                        if (progressBar != null) {
                            i = R.id.tvVideoRemainingDuratiom;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoRemainingDuratiom);
                            if (textView != null) {
                                i = R.id.tvVideoTitle;
                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoTitle);
                                if (textView2 != null) {
                                    i = R.id.tvVideoTitlePrefix;
                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoTitlePrefix);
                                    if (textView3 != null) {
                                        return new updateSampleStreams((ConstraintLayout) view, imageView, imageView2, imageView3, linearLayout, progressBar, textView, textView2, textView3);
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
