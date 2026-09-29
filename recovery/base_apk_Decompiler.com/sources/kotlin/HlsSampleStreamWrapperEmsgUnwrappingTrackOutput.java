package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.marrow.R;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStreamWrapperEmsgUnwrappingTrackOutput implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    public final CustomTextView AudioAttributesImplApi21Parcelizer;
    public final View AudioAttributesImplApi26Parcelizer;
    public final RelativeLayout AudioAttributesImplBaseParcelizer;
    public final CustomButton IconCompatParcelizer;
    public final ProgressBar MediaBrowserCompatCustomActionResultReceiver;
    public final View MediaBrowserCompatItemReceiver;
    public final ShapeableImageView MediaBrowserCompatMediaItem;
    public final ImageView MediaBrowserCompatSearchResultReceiver;
    public final ConstraintLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final CustomTextView MediaDescriptionCompat;
    public final CustomTextView MediaMetadataCompat;
    public final ImageView RatingCompat;
    public final CustomTextView RemoteActionCompatParcelizer;
    public final RatingBar handleMediaPlayPauseIfPendingOnHandler;
    public final LinearLayout onAddQueueItem;
    public final CustomTextView onCommand;
    public final CustomTextView onCustomAction;
    public final CustomTextView onFastForward;
    public final PieChart onMediaButtonEvent;
    public final Group onPause;
    public final LinearLayout onPlay;
    public final Group onPlayFromMediaId;
    public final CustomTextView onPlayFromSearch;
    public final ImageView onPlayFromUri;
    public final CustomTextView onPrepare;
    public final TextView onPrepareFromMediaId;
    public final Group onPrepareFromSearch;
    private LinearLayout onPrepareFromUri;
    private LinearLayout onRemoveQueueItem;
    private View onRemoveQueueItemAt;
    public final LinearLayout onRewind;
    private ConstraintLayout onSeekTo;
    private final MaterialCardView onSetCaptioningEnabled;
    private View onSetPlaybackSpeed;
    private TextView onSetRating;
    private CustomTextView onSetRepeatMode;
    private ImageView onSetShuffleMode;
    private View onSkipToPrevious;
    private View onSkipToQueueItem;
    public final CustomTextView read;
    public final MaterialCardView write;

    private HlsSampleStreamWrapperEmsgUnwrappingTrackOutput(MaterialCardView materialCardView, CustomButton customButton, ConstraintLayout constraintLayout, MaterialCardView materialCardView2, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, ConstraintLayout constraintLayout2, View view, View view2, ProgressBar progressBar, RelativeLayout relativeLayout, CustomTextView customTextView4, ImageView imageView, ImageView imageView2, ShapeableImageView shapeableImageView, CustomTextView customTextView5, LinearLayout linearLayout, CustomTextView customTextView6, RatingBar ratingBar, CustomTextView customTextView7, ConstraintLayout constraintLayout3, CustomTextView customTextView8, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, Group group, View view3, PieChart pieChart, Group group2, ImageView imageView3, Group group3, CustomTextView customTextView9, TextView textView, CustomTextView customTextView10, CustomTextView customTextView11, TextView textView2, ImageView imageView4, LinearLayout linearLayout5, View view4, View view5, View view6) {
        this.onSetCaptioningEnabled = materialCardView;
        this.IconCompatParcelizer = customButton;
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.write = materialCardView2;
        this.read = customTextView;
        this.RemoteActionCompatParcelizer = customTextView2;
        this.AudioAttributesImplApi21Parcelizer = customTextView3;
        this.onSeekTo = constraintLayout2;
        this.AudioAttributesImplApi26Parcelizer = view;
        this.MediaBrowserCompatItemReceiver = view2;
        this.MediaBrowserCompatCustomActionResultReceiver = progressBar;
        this.AudioAttributesImplBaseParcelizer = relativeLayout;
        this.MediaDescriptionCompat = customTextView4;
        this.RatingCompat = imageView;
        this.MediaBrowserCompatSearchResultReceiver = imageView2;
        this.MediaBrowserCompatMediaItem = shapeableImageView;
        this.MediaMetadataCompat = customTextView5;
        this.onAddQueueItem = linearLayout;
        this.onCustomAction = customTextView6;
        this.handleMediaPlayPauseIfPendingOnHandler = ratingBar;
        this.onCommand = customTextView7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constraintLayout3;
        this.onFastForward = customTextView8;
        this.onPlay = linearLayout2;
        this.onRemoveQueueItem = linearLayout3;
        this.onPrepareFromUri = linearLayout4;
        this.onPlayFromMediaId = group;
        this.onRemoveQueueItemAt = view3;
        this.onMediaButtonEvent = pieChart;
        this.onPause = group2;
        this.onPlayFromUri = imageView3;
        this.onPrepareFromSearch = group3;
        this.onPrepare = customTextView9;
        this.onPrepareFromMediaId = textView;
        this.onSetRepeatMode = customTextView10;
        this.onPlayFromSearch = customTextView11;
        this.onSetRating = textView2;
        this.onSetShuffleMode = imageView4;
        this.onRewind = linearLayout5;
        this.onSetPlaybackSpeed = view4;
        this.onSkipToQueueItem = view5;
        this.onSkipToPrevious = view6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public MaterialCardView IconCompatParcelizer() {
        return this.onSetCaptioningEnabled;
    }

    public static HlsSampleStreamWrapperEmsgUnwrappingTrackOutput AudioAttributesCompatParcelizer(View view) {
        int i = R.id.btnInfo;
        CustomButton customButton = (CustomButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnInfo);
        if (customButton != null) {
            i = R.id.card_lesson_top;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.card_lesson_top);
            if (constraintLayout != null) {
                MaterialCardView materialCardView = (MaterialCardView) view;
                i = R.id.comingSoonTag;
                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.comingSoonTag);
                if (customTextView != null) {
                    i = R.id.ctvMcqAdded;
                    CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ctvMcqAdded);
                    if (customTextView2 != null) {
                        i = R.id.ctvMcqUpdated;
                        CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ctvMcqUpdated);
                        if (customTextView3 != null) {
                            i = R.id.detailsContainer;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.detailsContainer);
                            if (constraintLayout2 != null) {
                                i = R.id.divider;
                                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
                                if (viewIconCompatParcelizer != null) {
                                    i = R.id.downloadContainerDivider;
                                    View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.downloadContainerDivider);
                                    if (viewIconCompatParcelizer2 != null) {
                                        i = R.id.download_progress;
                                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.download_progress);
                                        if (progressBar != null) {
                                            i = R.id.downloadStatusContainer;
                                            RelativeLayout relativeLayout = (RelativeLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.downloadStatusContainer);
                                            if (relativeLayout != null) {
                                                i = R.id.download_update_text;
                                                CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.download_update_text);
                                                if (customTextView4 != null) {
                                                    i = R.id.ivDownloadComplete;
                                                    ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivDownloadComplete);
                                                    if (imageView != null) {
                                                        i = R.id.lesson_completed_view;
                                                        ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_completed_view);
                                                        if (imageView2 != null) {
                                                            i = R.id.lesson_image_view;
                                                            ShapeableImageView shapeableImageView = (ShapeableImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_image_view);
                                                            if (shapeableImageView != null) {
                                                                i = R.id.lesson_mcq_info;
                                                                CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_mcq_info);
                                                                if (customTextView5 != null) {
                                                                    i = R.id.lessonPausedView;
                                                                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.lessonPausedView);
                                                                    if (linearLayout != null) {
                                                                        i = R.id.lesson_rating_text_view;
                                                                        CustomTextView customTextView6 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_rating_text_view);
                                                                        if (customTextView6 != null) {
                                                                            i = R.id.lesson_rating_view;
                                                                            RatingBar ratingBar = (RatingBar) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_rating_view);
                                                                            if (ratingBar != null) {
                                                                                i = R.id.lesson_score;
                                                                                CustomTextView customTextView7 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_score);
                                                                                if (customTextView7 != null) {
                                                                                    i = R.id.lessonStatsView;
                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.lessonStatsView);
                                                                                    if (constraintLayout3 != null) {
                                                                                        i = R.id.lesson_title_view;
                                                                                        CustomTextView customTextView8 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_title_view);
                                                                                        if (customTextView8 != null) {
                                                                                            i = R.id.llProCard;
                                                                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llProCard);
                                                                                            if (linearLayout2 != null) {
                                                                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llRatingContainer);
                                                                                                if (linearLayout3 != null) {
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llStatusIconContainer);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.mcq_info_group);
                                                                                                        if (group != null) {
                                                                                                            View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.pie_background);
                                                                                                            if (viewIconCompatParcelizer3 != null) {
                                                                                                                PieChart pieChart = (PieChart) getApplicationIcon.IconCompatParcelizer(view, R.id.pie_chart);
                                                                                                                if (pieChart != null) {
                                                                                                                    Group group2 = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.pie_group);
                                                                                                                    if (group2 != null) {
                                                                                                                        ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.pro_lock_view);
                                                                                                                        if (imageView3 != null) {
                                                                                                                            Group group3 = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.pytGroup);
                                                                                                                            if (group3 != null) {
                                                                                                                                CustomTextView customTextView9 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCompletedOn);
                                                                                                                                if (customTextView9 != null) {
                                                                                                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvConciseMode);
                                                                                                                                    if (textView != null) {
                                                                                                                                        CustomTextView customTextView10 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContinue);
                                                                                                                                        if (customTextView10 != null) {
                                                                                                                                            CustomTextView customTextView11 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvOptionalLabel);
                                                                                                                                            if (customTextView11 != null) {
                                                                                                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProTitle);
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPytTag);
                                                                                                                                                    if (imageView4 != null) {
                                                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vLessonMcqUpdateTagContainer);
                                                                                                                                                        if (linearLayout5 != null) {
                                                                                                                                                            View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalDivider);
                                                                                                                                                            if (viewIconCompatParcelizer4 != null) {
                                                                                                                                                                View viewIconCompatParcelizer5 = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalDivider1);
                                                                                                                                                                if (viewIconCompatParcelizer5 != null) {
                                                                                                                                                                    View viewIconCompatParcelizer6 = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalDivider2);
                                                                                                                                                                    if (viewIconCompatParcelizer6 != null) {
                                                                                                                                                                        return new HlsSampleStreamWrapperEmsgUnwrappingTrackOutput(materialCardView, customButton, constraintLayout, materialCardView, customTextView, customTextView2, customTextView3, constraintLayout2, viewIconCompatParcelizer, viewIconCompatParcelizer2, progressBar, relativeLayout, customTextView4, imageView, imageView2, shapeableImageView, customTextView5, linearLayout, customTextView6, ratingBar, customTextView7, constraintLayout3, customTextView8, linearLayout2, linearLayout3, linearLayout4, group, viewIconCompatParcelizer3, pieChart, group2, imageView3, group3, customTextView9, textView, customTextView10, customTextView11, textView2, imageView4, linearLayout5, viewIconCompatParcelizer4, viewIconCompatParcelizer5, viewIconCompatParcelizer6);
                                                                                                                                                                    }
                                                                                                                                                                    i = R.id.verticalDivider2;
                                                                                                                                                                } else {
                                                                                                                                                                    i = R.id.verticalDivider1;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i = R.id.verticalDivider;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i = R.id.vLessonMcqUpdateTagContainer;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i = R.id.tvPytTag;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i = R.id.tvProTitle;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = R.id.tvOptionalLabel;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = R.id.tvContinue;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = R.id.tvConciseMode;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = R.id.tvCompletedOn;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = R.id.pytGroup;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = R.id.pro_lock_view;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = R.id.pie_group;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = R.id.pie_chart;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.pie_background;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.mcq_info_group;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.llStatusIconContainer;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.llRatingContainer;
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
