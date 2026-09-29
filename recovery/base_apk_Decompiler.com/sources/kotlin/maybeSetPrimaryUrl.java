package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeSetPrimaryUrl implements getApplicationLabel {
    private LinearLayout AudioAttributesCompatParcelizer;
    private final ConstraintLayout AudioAttributesImplApi21Parcelizer;
    public final TextView IconCompatParcelizer;
    private TextView MediaBrowserCompatItemReceiver;
    public final TextView RemoteActionCompatParcelizer;
    private ImageView read;
    private ImageView write;

    private maybeSetPrimaryUrl(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.AudioAttributesImplApi21Parcelizer = constraintLayout;
        this.read = imageView;
        this.write = imageView2;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.IconCompatParcelizer = textView;
        this.RemoteActionCompatParcelizer = textView2;
        this.MediaBrowserCompatItemReceiver = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public static maybeSetPrimaryUrl RemoteActionCompatParcelizer(View view) {
        int i = R.id.btnDismiss;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnDismiss);
        if (imageView != null) {
            i = R.id.ivPlayPlaceholder;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPlayPlaceholder);
            if (imageView2 != null) {
                i = R.id.layoutVideoInfo;
                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.layoutVideoInfo);
                if (linearLayout != null) {
                    i = R.id.tvVideoRemainingDuration;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoRemainingDuration);
                    if (textView != null) {
                        i = R.id.tvVideoTitle;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoTitle);
                        if (textView2 != null) {
                            i = R.id.tvWatchNext;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvWatchNext);
                            if (textView3 != null) {
                                return new maybeSetPrimaryUrl((ConstraintLayout) view, imageView, imageView2, linearLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
