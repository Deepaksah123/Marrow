package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMultivariantPlaylistRendition implements getApplicationLabel {
    public final TextView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    public final LinearLayout MediaBrowserCompatMediaItem;
    public final LinearLayout MediaBrowserCompatSearchResultReceiver;
    private RelativeLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final CircularProgressIndicator MediaDescriptionCompat;
    public final MaterialCardView MediaMetadataCompat;
    public final LinearLayout RatingCompat;
    public final CircularProgressIndicator RemoteActionCompatParcelizer;
    private final RelativeLayout onAddQueueItem;
    private MaterialCardView onCommand;
    public final CircularProgressIndicator read;
    public final TextView write;

    private HlsMultivariantPlaylistRendition(RelativeLayout relativeLayout, TextView textView, CircularProgressIndicator circularProgressIndicator, MaterialCardView materialCardView, RelativeLayout relativeLayout2, CircularProgressIndicator circularProgressIndicator2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, LinearLayout linearLayout, MaterialCardView materialCardView2, LinearLayout linearLayout2, LinearLayout linearLayout3, CircularProgressIndicator circularProgressIndicator3) {
        this.onAddQueueItem = relativeLayout;
        this.write = textView;
        this.RemoteActionCompatParcelizer = circularProgressIndicator;
        this.onCommand = materialCardView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = relativeLayout2;
        this.read = circularProgressIndicator2;
        this.AudioAttributesCompatParcelizer = textView2;
        this.IconCompatParcelizer = textView3;
        this.AudioAttributesImplBaseParcelizer = textView4;
        this.AudioAttributesImplApi26Parcelizer = textView5;
        this.MediaBrowserCompatItemReceiver = textView6;
        this.MediaBrowserCompatCustomActionResultReceiver = textView7;
        this.AudioAttributesImplApi21Parcelizer = textView8;
        this.MediaBrowserCompatMediaItem = linearLayout;
        this.MediaMetadataCompat = materialCardView2;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout2;
        this.RatingCompat = linearLayout3;
        this.MediaDescriptionCompat = circularProgressIndicator3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final RelativeLayout IconCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public static HlsMultivariantPlaylistRendition read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.view_score_card_2, viewGroup, false));
    }

    private static HlsMultivariantPlaylistRendition write(View view) {
        int i = R.id.btnAnalytics;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnAnalytics);
        if (textView != null) {
            i = R.id.correctProgress;
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
                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCorrectCount);
                        if (textView2 != null) {
                            i = R.id.tvDetailAnalyticsAnnounceLater;
                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDetailAnalyticsAnnounceLater);
                            if (textView3 != null) {
                                i = R.id.tvPercentile;
                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPercentile);
                                if (textView4 != null) {
                                    i = R.id.tvPerformaceScore;
                                    TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPerformaceScore);
                                    if (textView5 != null) {
                                        i = R.id.tvPerformanceOutOf;
                                        TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPerformanceOutOf);
                                        if (textView6 != null) {
                                            i = R.id.tvSkippedCount;
                                            TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSkippedCount);
                                            if (textView7 != null) {
                                                i = R.id.tvWrongCount;
                                                TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvWrongCount);
                                                if (textView8 != null) {
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
                                                                        return new HlsMultivariantPlaylistRendition(relativeLayout, textView, circularProgressIndicator, materialCardView, relativeLayout, circularProgressIndicator2, textView2, textView3, textView4, textView5, textView6, textView7, textView8, linearLayout, materialCardView2, linearLayout2, linearLayout3, circularProgressIndicator3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
