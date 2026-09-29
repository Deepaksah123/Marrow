package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPeriodSampleStreamWrapperCallback implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final ProgressBar IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private CardView MediaBrowserCompatMediaItem;
    private final CardView MediaBrowserCompatSearchResultReceiver;
    private View MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    private LinearLayout MediaMetadataCompat;
    private LinearLayout RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    public final TextView read;
    public final TextView write;

    private HlsMediaPeriodSampleStreamWrapperCallback(CardView cardView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, CardView cardView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, View view) {
        this.MediaBrowserCompatSearchResultReceiver = cardView;
        this.MediaMetadataCompat = linearLayout;
        this.RatingCompat = linearLayout2;
        this.AudioAttributesCompatParcelizer = linearLayout3;
        this.IconCompatParcelizer = progressBar;
        this.MediaBrowserCompatMediaItem = cardView2;
        this.read = textView;
        this.RemoteActionCompatParcelizer = textView2;
        this.write = textView3;
        this.MediaBrowserCompatItemReceiver = textView4;
        this.AudioAttributesImplApi21Parcelizer = textView5;
        this.MediaBrowserCompatCustomActionResultReceiver = textView6;
        this.AudioAttributesImplBaseParcelizer = textView7;
        this.AudioAttributesImplApi26Parcelizer = textView8;
        this.MediaDescriptionCompat = textView9;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CardView IconCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public static HlsMediaPeriodSampleStreamWrapperCallback AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.item_analytics_subject_percentile, viewGroup, false));
    }

    private static HlsMediaPeriodSampleStreamWrapperCallback read(View view) {
        int i = R.id.correctAnswerCountContainer;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.correctAnswerCountContainer);
        if (linearLayout != null) {
            i = R.id.countContainer;
            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.countContainer);
            if (linearLayout2 != null) {
                i = R.id.percentileContainer;
                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.percentileContainer);
                if (linearLayout3 != null) {
                    i = R.id.progressSubjectPercentile;
                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressSubjectPercentile);
                    if (progressBar != null) {
                        i = R.id.subjectCard;
                        CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.subjectCard);
                        if (cardView != null) {
                            i = R.id.tvCorrectAnswersPercentage;
                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCorrectAnswersPercentage);
                            if (textView != null) {
                                i = R.id.tvCorrectCount;
                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCorrectCount);
                                if (textView2 != null) {
                                    i = R.id.tvSkippedCount;
                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSkippedCount);
                                    if (textView3 != null) {
                                        i = R.id.tvSubjectLabel;
                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectLabel);
                                        if (textView4 != null) {
                                            i = R.id.tvSubjectName;
                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectName);
                                            if (textView5 != null) {
                                                i = R.id.tvSubjectPercentile;
                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectPercentile);
                                                if (textView6 != null) {
                                                    i = R.id.tvSubjectScore;
                                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectScore);
                                                    if (textView7 != null) {
                                                        i = R.id.tvTotalQuestions;
                                                        TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTotalQuestions);
                                                        if (textView8 != null) {
                                                            i = R.id.tvWrongCount;
                                                            TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvWrongCount);
                                                            if (textView9 != null) {
                                                                i = R.id.vStatsDivider;
                                                                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.vStatsDivider);
                                                                if (viewIconCompatParcelizer != null) {
                                                                    return new HlsMediaPeriodSampleStreamWrapperCallback((CardView) view, linearLayout, linearLayout2, linearLayout3, progressBar, cardView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, viewIconCompatParcelizer);
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
