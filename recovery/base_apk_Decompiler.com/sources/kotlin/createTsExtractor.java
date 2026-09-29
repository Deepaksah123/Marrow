package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class createTsExtractor implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final ImageView AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final ConstraintLayout IconCompatParcelizer;
    public final ProgressBar MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private ImageView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    private TextView handleMediaPlayPauseIfPendingOnHandler;
    public final ConstraintLayout onAddQueueItem;
    public final TextView onCommand;
    private LinearLayout onCustomAction;
    private LinearLayout onFastForward;
    private ProgressBar onMediaButtonEvent;
    private TextView onPause;
    private LinearLayout onPlay;
    private LinearLayout onPlayFromMediaId;
    private final ScrollView onPlayFromSearch;
    private TextView onPlayFromUri;
    private TextView onPrepareFromMediaId;
    public final ConstraintLayout read;
    public final TextView write;

    private createTsExtractor(ScrollView scrollView, TextView textView, TextView textView2, ConstraintLayout constraintLayout, TextView textView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, TextView textView4, ProgressBar progressBar, ProgressBar progressBar2, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, ConstraintLayout constraintLayout4) {
        this.onPlayFromSearch = scrollView;
        this.RemoteActionCompatParcelizer = textView;
        this.handleMediaPlayPauseIfPendingOnHandler = textView2;
        this.IconCompatParcelizer = constraintLayout;
        this.write = textView3;
        this.AudioAttributesCompatParcelizer = constraintLayout2;
        this.read = constraintLayout3;
        this.AudioAttributesImplApi21Parcelizer = imageView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = imageView2;
        this.onCustomAction = linearLayout;
        this.AudioAttributesImplApi26Parcelizer = linearLayout2;
        this.MediaBrowserCompatItemReceiver = linearLayout3;
        this.onPlay = linearLayout4;
        this.onPlayFromMediaId = linearLayout5;
        this.onFastForward = linearLayout6;
        this.onPause = textView4;
        this.onMediaButtonEvent = progressBar;
        this.MediaBrowserCompatCustomActionResultReceiver = progressBar2;
        this.onPrepareFromMediaId = textView5;
        this.AudioAttributesImplBaseParcelizer = textView6;
        this.onPlayFromUri = textView7;
        this.MediaBrowserCompatMediaItem = textView8;
        this.MediaMetadataCompat = textView9;
        this.RatingCompat = textView10;
        this.MediaBrowserCompatSearchResultReceiver = textView11;
        this.MediaDescriptionCompat = textView12;
        this.onCommand = textView13;
        this.onAddQueueItem = constraintLayout4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ScrollView IconCompatParcelizer() {
        return this.onPlayFromSearch;
    }

    public static createTsExtractor IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_custom_module_score, viewGroup, false));
    }

    private static createTsExtractor write(View view) {
        int i = R.id.btnReview;
        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnReview);
        if (textView != null) {
            i = R.id.cardSubTitle;
            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.cardSubTitle);
            if (textView2 != null) {
                i = R.id.clDoneView;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clDoneView);
                if (constraintLayout != null) {
                    i = R.id.copyCode;
                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.copyCode);
                    if (textView3 != null) {
                        i = R.id.cvAnimeMain;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.cvAnimeMain);
                        if (constraintLayout2 != null) {
                            i = R.id.cvProgress;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.cvProgress);
                            if (constraintLayout3 != null) {
                                i = R.id.ivCloseScore;
                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivCloseScore);
                                if (imageView != null) {
                                    i = R.id.ivGiantTick;
                                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivGiantTick);
                                    if (imageView2 != null) {
                                        i = R.id.linearLayout;
                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.linearLayout);
                                        if (linearLayout != null) {
                                            i = R.id.llCMDetails;
                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llCMDetails);
                                            if (linearLayout2 != null) {
                                                i = R.id.llCMReview;
                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llCMReview);
                                                if (linearLayout3 != null) {
                                                    i = R.id.llInviteCode;
                                                    LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInviteCode);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.llNote;
                                                        LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llNote);
                                                        if (linearLayout5 != null) {
                                                            i = R.id.llScoreContainer;
                                                            LinearLayout linearLayout6 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llScoreContainer);
                                                            if (linearLayout6 != null) {
                                                                i = R.id.note;
                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.note);
                                                                if (textView4 != null) {
                                                                    i = R.id.pbInviteCode;
                                                                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbInviteCode);
                                                                    if (progressBar != null) {
                                                                        i = R.id.pbScoreProgress;
                                                                        ProgressBar progressBar2 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbScoreProgress);
                                                                        if (progressBar2 != null) {
                                                                            i = R.id.tvAllDone;
                                                                            TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAllDone);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvCMCode;
                                                                                TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCMCode);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvCorrect;
                                                                                    TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCorrect);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.tvDiscardAndNew;
                                                                                        TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDiscardAndNew);
                                                                                        if (textView8 != null) {
                                                                                            i = R.id.tvPerformanceText;
                                                                                            TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPerformanceText);
                                                                                            if (textView9 != null) {
                                                                                                TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvQuesCount);
                                                                                                if (textView10 != null) {
                                                                                                    TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvScorePercent);
                                                                                                    if (textView11 != null) {
                                                                                                        TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvScoreText);
                                                                                                        if (textView12 != null) {
                                                                                                            TextView textView13 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvShare);
                                                                                                            if (textView13 != null) {
                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.viewFlipperCMScore);
                                                                                                                if (constraintLayout4 != null) {
                                                                                                                    return new createTsExtractor((ScrollView) view, textView, textView2, constraintLayout, textView3, constraintLayout2, constraintLayout3, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView4, progressBar, progressBar2, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, constraintLayout4);
                                                                                                                }
                                                                                                                i = R.id.viewFlipperCMScore;
                                                                                                            } else {
                                                                                                                i = R.id.tvShare;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvScoreText;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvScorePercent;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvQuesCount;
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
