package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class UnexpectedSampleTimestampException implements getApplicationLabel {
    public final CustomTextView AudioAttributesCompatParcelizer;
    public final ImageView AudioAttributesImplApi21Parcelizer;
    public final CustomTextView AudioAttributesImplApi26Parcelizer;
    public final RatingBar AudioAttributesImplBaseParcelizer;
    public final MaterialCardView IconCompatParcelizer;
    public final ImageView MediaBrowserCompatCustomActionResultReceiver;
    public final CustomTextView MediaBrowserCompatItemReceiver;
    public final LinearLayout MediaBrowserCompatMediaItem;
    public final LinearLayout MediaBrowserCompatSearchResultReceiver;
    private LinearLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final CustomTextView MediaDescriptionCompat;
    public final ImageView MediaMetadataCompat;
    public final CustomTextView RatingCompat;
    public final CustomTextView RemoteActionCompatParcelizer;
    private final MaterialCardView handleMediaPlayPauseIfPendingOnHandler;
    private ConstraintLayout onAddQueueItem;
    private LinearLayout onCommand;
    private ConstraintLayout onCustomAction;
    private View onFastForward;
    public final CustomTextView read;
    public final ImageView write;

    private UnexpectedSampleTimestampException(MaterialCardView materialCardView, ConstraintLayout constraintLayout, MaterialCardView materialCardView2, CustomTextView customTextView, CustomTextView customTextView2, CustomTextView customTextView3, ImageView imageView, ImageView imageView2, CustomTextView customTextView4, ImageView imageView3, CustomTextView customTextView5, RatingBar ratingBar, ConstraintLayout constraintLayout2, CustomTextView customTextView6, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView4, CustomTextView customTextView7, LinearLayout linearLayout4, View view) {
        this.handleMediaPlayPauseIfPendingOnHandler = materialCardView;
        this.onCustomAction = constraintLayout;
        this.IconCompatParcelizer = materialCardView2;
        this.RemoteActionCompatParcelizer = customTextView;
        this.AudioAttributesCompatParcelizer = customTextView2;
        this.read = customTextView3;
        this.write = imageView;
        this.MediaBrowserCompatCustomActionResultReceiver = imageView2;
        this.AudioAttributesImplApi26Parcelizer = customTextView4;
        this.AudioAttributesImplApi21Parcelizer = imageView3;
        this.MediaBrowserCompatItemReceiver = customTextView5;
        this.AudioAttributesImplBaseParcelizer = ratingBar;
        this.onAddQueueItem = constraintLayout2;
        this.RatingCompat = customTextView6;
        this.MediaBrowserCompatMediaItem = linearLayout;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = linearLayout2;
        this.onCommand = linearLayout3;
        this.MediaMetadataCompat = imageView4;
        this.MediaDescriptionCompat = customTextView7;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout4;
        this.onFastForward = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final MaterialCardView IconCompatParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public static UnexpectedSampleTimestampException IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.layout_related_module_list_item, viewGroup, false));
    }

    private static UnexpectedSampleTimestampException write(View view) {
        int i = R.id.card_lesson_top;
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
                        i = R.id.lesson_completed_view;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_completed_view);
                        if (imageView != null) {
                            i = R.id.lesson_image_view;
                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_image_view);
                            if (imageView2 != null) {
                                i = R.id.lesson_mcq_info;
                                CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_mcq_info);
                                if (customTextView4 != null) {
                                    i = R.id.lesson_paused_view;
                                    ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_paused_view);
                                    if (imageView3 != null) {
                                        i = R.id.lesson_rating_text_view;
                                        CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_rating_text_view);
                                        if (customTextView5 != null) {
                                            i = R.id.lesson_rating_view;
                                            RatingBar ratingBar = (RatingBar) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_rating_view);
                                            if (ratingBar != null) {
                                                i = R.id.lessonStatsView;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.lessonStatsView);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.lesson_title_view;
                                                    CustomTextView customTextView6 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.lesson_title_view);
                                                    if (customTextView6 != null) {
                                                        i = R.id.llProCard;
                                                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llProCard);
                                                        if (linearLayout != null) {
                                                            i = R.id.llRatingContainer;
                                                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llRatingContainer);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.llStatusIconContainer;
                                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llStatusIconContainer);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.pro_lock_view;
                                                                    ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.pro_lock_view);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.tvOptionalLabel;
                                                                        CustomTextView customTextView7 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvOptionalLabel);
                                                                        if (customTextView7 != null) {
                                                                            i = R.id.vLessonMcqUpdateTagContainer;
                                                                            LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vLessonMcqUpdateTagContainer);
                                                                            if (linearLayout4 != null) {
                                                                                i = R.id.verticalDivider;
                                                                                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalDivider);
                                                                                if (viewIconCompatParcelizer != null) {
                                                                                    return new UnexpectedSampleTimestampException(materialCardView, constraintLayout, materialCardView, customTextView, customTextView2, customTextView3, imageView, imageView2, customTextView4, imageView3, customTextView5, ratingBar, constraintLayout2, customTextView6, linearLayout, linearLayout2, linearLayout3, imageView4, customTextView7, linearLayout4, viewIconCompatParcelizer);
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
