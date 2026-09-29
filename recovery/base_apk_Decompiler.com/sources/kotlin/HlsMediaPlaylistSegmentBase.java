package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPlaylistSegmentBase implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    private ConstraintLayout AudioAttributesImplApi26Parcelizer;
    public final ProgressBar IconCompatParcelizer;
    private TextView MediaBrowserCompatItemReceiver;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    private LinearLayout read;
    public final TextView write;

    private HlsMediaPlaylistSegmentBase(ConstraintLayout constraintLayout, LinearLayout linearLayout, ProgressBar progressBar, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.RemoteActionCompatParcelizer = constraintLayout;
        this.read = linearLayout;
        this.IconCompatParcelizer = progressBar;
        this.AudioAttributesImplApi26Parcelizer = constraintLayout2;
        this.MediaBrowserCompatItemReceiver = textView;
        this.AudioAttributesCompatParcelizer = textView2;
        this.write = textView3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static HlsMediaPlaylistSegmentBase write(View view) {
        int i = R.id.llModuleScore;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llModuleScore);
        if (linearLayout != null) {
            i = R.id.pbScore;
            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbScore);
            if (progressBar != null) {
                i = R.id.scoreViewContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.scoreViewContainer);
                if (constraintLayout != null) {
                    i = R.id.textView3;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.textView3);
                    if (textView != null) {
                        i = R.id.tvQuesStatus;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQuesStatus);
                        if (textView2 != null) {
                            i = R.id.tvScorePercentage;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvScorePercentage);
                            if (textView3 != null) {
                                return new HlsMediaPlaylistSegmentBase((ConstraintLayout) view, linearLayout, progressBar, constraintLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
