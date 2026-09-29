package kotlin;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getMediaPlaylistUrls implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final LinearLayout MediaBrowserCompatMediaItem;
    private RelativeLayout MediaBrowserCompatSearchResultReceiver;
    private MaterialCardView MediaDescriptionCompat;
    private final RelativeLayout MediaMetadataCompat;
    public final CircularProgressIndicator RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    private MaterialCardView onAddQueueItem;
    public final CircularProgressIndicator read;
    public final CircularProgressIndicator write;

    private getMediaPlaylistUrls(RelativeLayout relativeLayout, CircularProgressIndicator circularProgressIndicator, MaterialCardView materialCardView, RelativeLayout relativeLayout2, CircularProgressIndicator circularProgressIndicator2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout, MaterialCardView materialCardView2, LinearLayout linearLayout2, LinearLayout linearLayout3, CircularProgressIndicator circularProgressIndicator3) {
        this.MediaMetadataCompat = relativeLayout;
        this.write = circularProgressIndicator;
        this.MediaDescriptionCompat = materialCardView;
        this.MediaBrowserCompatSearchResultReceiver = relativeLayout2;
        this.read = circularProgressIndicator2;
        this.IconCompatParcelizer = textView;
        this.AudioAttributesCompatParcelizer = textView2;
        this.RemoteActionCompatParcelizer = textView3;
        this.AudioAttributesImplBaseParcelizer = textView4;
        this.AudioAttributesImplApi21Parcelizer = textView5;
        this.MediaBrowserCompatCustomActionResultReceiver = textView6;
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.onAddQueueItem = materialCardView2;
        this.AudioAttributesImplApi26Parcelizer = linearLayout2;
        this.MediaBrowserCompatMediaItem = linearLayout3;
        this.RatingCompat = circularProgressIndicator3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public RelativeLayout IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public static getMediaPlaylistUrls IconCompatParcelizer(View view) {
        int i = R.id.correctProgress;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) getApplicationIcon.IconCompatParcelizer(view, R.id.correctProgress);
        if (circularProgressIndicator != null) {
            i = R.id.scoreCard;
            MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.scoreCard);
            if (materialCardView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.skippedProgress;
                CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) getApplicationIcon.IconCompatParcelizer(view, R.id.skippedProgress);
                if (circularProgressIndicator2 != null) {
                    i = R.id.tvCorrectCount;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCorrectCount);
                    if (textView != null) {
                        i = R.id.tvPercentile;
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPercentile);
                        if (textView2 != null) {
                            i = R.id.tvPerformaceScore;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPerformaceScore);
                            if (textView3 != null) {
                                i = R.id.tvPerformanceOutOf;
                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPerformanceOutOf);
                                if (textView4 != null) {
                                    i = R.id.tvSkippedCount;
                                    TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSkippedCount);
                                    if (textView5 != null) {
                                        i = R.id.tvWrongCount;
                                        TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvWrongCount);
                                        if (textView6 != null) {
                                            i = R.id.vCorrectLayout;
                                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vCorrectLayout);
                                            if (linearLayout != null) {
                                                i = R.id.vPercentileCard;
                                                MaterialCardView materialCardView2 = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.vPercentileCard);
                                                if (materialCardView2 != null) {
                                                    i = R.id.vSkipLayout;
                                                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vSkipLayout);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.vWrongLayout;
                                                        LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vWrongLayout);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.wrongProgress;
                                                            CircularProgressIndicator circularProgressIndicator3 = (CircularProgressIndicator) getApplicationIcon.IconCompatParcelizer(view, R.id.wrongProgress);
                                                            if (circularProgressIndicator3 != null) {
                                                                return new getMediaPlaylistUrls(relativeLayout, circularProgressIndicator, materialCardView, relativeLayout, circularProgressIndicator2, textView, textView2, textView3, textView4, textView5, textView6, linearLayout, materialCardView2, linearLayout2, linearLayout3, circularProgressIndicator3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
