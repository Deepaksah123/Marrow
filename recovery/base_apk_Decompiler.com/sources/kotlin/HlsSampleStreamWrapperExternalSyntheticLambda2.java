package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStreamWrapperExternalSyntheticLambda2 implements getApplicationLabel {
    public final ProgressBar AudioAttributesCompatParcelizer;
    private ConstraintLayout AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private ImageView MediaBrowserCompatMediaItem;
    private ImageView MediaBrowserCompatSearchResultReceiver;
    private ImageView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private CardView MediaDescriptionCompat;
    private ImageView MediaMetadataCompat;
    private ConstraintLayout RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    private LinearLayout handleMediaPlayPauseIfPendingOnHandler;
    private LinearLayout onAddQueueItem;
    private ImageView onCommand;
    private LinearLayout onCustomAction;
    private TextView onFastForward;
    private final ConstraintLayout onPause;
    public final TextView read;
    public final ConstraintLayout write;

    private HlsSampleStreamWrapperExternalSyntheticLambda2(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, CardView cardView, ConstraintLayout constraintLayout4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.onPause = constraintLayout;
        this.AudioAttributesImplApi21Parcelizer = constraintLayout2;
        this.write = constraintLayout3;
        this.MediaDescriptionCompat = cardView;
        this.RatingCompat = constraintLayout4;
        this.MediaMetadataCompat = imageView;
        this.IconCompatParcelizer = imageView2;
        this.MediaBrowserCompatSearchResultReceiver = imageView3;
        this.MediaBrowserCompatMediaItem = imageView4;
        this.onCommand = imageView5;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = imageView6;
        this.handleMediaPlayPauseIfPendingOnHandler = linearLayout;
        this.onAddQueueItem = linearLayout2;
        this.onCustomAction = linearLayout3;
        this.AudioAttributesCompatParcelizer = progressBar;
        this.read = textView;
        this.RemoteActionCompatParcelizer = textView2;
        this.onFastForward = textView3;
        this.AudioAttributesImplBaseParcelizer = textView4;
        this.MediaBrowserCompatItemReceiver = textView5;
        this.MediaBrowserCompatCustomActionResultReceiver = textView6;
        this.AudioAttributesImplApi26Parcelizer = textView7;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onPause;
    }

    public static HlsSampleStreamWrapperExternalSyntheticLambda2 read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return RemoteActionCompatParcelizer(layoutInflater.inflate(R.layout.layout_hc_video_lesson_card, viewGroup, false));
    }

    private static HlsSampleStreamWrapperExternalSyntheticLambda2 RemoteActionCompatParcelizer(View view) {
        int i = R.id.clLessonCard;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clLessonCard);
        if (constraintLayout != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
            i = R.id.cvMain;
            CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvMain);
            if (cardView != null) {
                i = R.id.detailsContainer;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.detailsContainer);
                if (constraintLayout3 != null) {
                    i = R.id.ivDownloaded;
                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivDownloaded);
                    if (imageView != null) {
                        i = R.id.ivLesson;
                        ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLesson);
                        if (imageView2 != null) {
                            i = R.id.ivLessonComplete;
                            ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLessonComplete);
                            if (imageView3 != null) {
                                i = R.id.ivProLock;
                                ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivProLock);
                                if (imageView4 != null) {
                                    i = R.id.ivPytTag;
                                    ImageView imageView5 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivPytTag);
                                    if (imageView5 != null) {
                                        i = R.id.ivRating;
                                        ImageView imageView6 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivRating);
                                        if (imageView6 != null) {
                                            i = R.id.llProCard;
                                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llProCard);
                                            if (linearLayout != null) {
                                                i = R.id.llRatingContainer;
                                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llRatingContainer);
                                                if (linearLayout2 != null) {
                                                    i = R.id.llVideoStats;
                                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llVideoStats);
                                                    if (linearLayout3 != null) {
                                                        i = R.id.pbDownloadProgress;
                                                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbDownloadProgress);
                                                        if (progressBar != null) {
                                                            i = R.id.tvLessonTitle;
                                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonTitle);
                                                            if (textView != null) {
                                                                i = R.id.tvMainHeading;
                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMainHeading);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvProTitle;
                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProTitle);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvRatingText;
                                                                        TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRatingText);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvSecondHeading;
                                                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSecondHeading);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvSubjectTitle;
                                                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSubjectTitle);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvVideoDuration;
                                                                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvVideoDuration);
                                                                                    if (textView7 != null) {
                                                                                        return new HlsSampleStreamWrapperExternalSyntheticLambda2(constraintLayout2, constraintLayout, constraintLayout2, cardView, constraintLayout3, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, linearLayout, linearLayout2, linearLayout3, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
