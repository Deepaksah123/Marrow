package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class getMappedTrackOutput implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    private ConstraintLayout AudioAttributesImplApi21Parcelizer;
    public final CustomTextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    private ConstraintLayout MediaBrowserCompatItemReceiver;
    private ImageView MediaBrowserCompatMediaItem;
    private ImageView MediaBrowserCompatSearchResultReceiver;
    private TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private LinearLayout MediaDescriptionCompat;
    private LinearLayout MediaMetadataCompat;
    private ImageView RatingCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    private View handleMediaPlayPauseIfPendingOnHandler;
    private TextView onAddQueueItem;
    private final ConstraintLayout onCommand;
    private TextView onCustomAction;
    public final PieChart read;
    public final MaterialCardView write;

    private getMappedTrackOutput(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, PieChart pieChart, TextView textView2, TextView textView3, TextView textView4, CustomTextView customTextView, TextView textView5, TextView textView6, View view) {
        this.onCommand = constraintLayout;
        this.write = materialCardView;
        this.AudioAttributesImplApi21Parcelizer = constraintLayout2;
        this.MediaBrowserCompatItemReceiver = constraintLayout3;
        this.MediaDescriptionCompat = linearLayout;
        this.MediaBrowserCompatMediaItem = imageView;
        this.MediaBrowserCompatSearchResultReceiver = imageView2;
        this.RatingCompat = imageView3;
        this.AudioAttributesCompatParcelizer = linearLayout2;
        this.MediaMetadataCompat = linearLayout3;
        this.RemoteActionCompatParcelizer = linearLayout4;
        this.onCustomAction = textView;
        this.read = pieChart;
        this.onAddQueueItem = textView2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView3;
        this.IconCompatParcelizer = textView4;
        this.AudioAttributesImplApi26Parcelizer = customTextView;
        this.MediaBrowserCompatCustomActionResultReceiver = textView5;
        this.AudioAttributesImplBaseParcelizer = textView6;
        this.handleMediaPlayPauseIfPendingOnHandler = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onCommand;
    }

    public static getMappedTrackOutput IconCompatParcelizer(View view) {
        int i = R.id.activeRecallCardView;
        MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.activeRecallCardView);
        if (materialCardView != null) {
            i = R.id.card_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.card_container);
            if (constraintLayout != null) {
                i = R.id.detailsContainer;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.detailsContainer);
                if (constraintLayout2 != null) {
                    i = R.id.divider;
                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
                    if (linearLayout != null) {
                        i = R.id.ivAction;
                        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivAction);
                        if (imageView != null) {
                            i = R.id.ivLogo;
                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLogo);
                            if (imageView2 != null) {
                                i = R.id.ivRating;
                                ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivRating);
                                if (imageView3 != null) {
                                    i = R.id.llContinue;
                                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llContinue);
                                    if (linearLayout2 != null) {
                                        i = R.id.llInfoContainer;
                                        LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInfoContainer);
                                        if (linearLayout3 != null) {
                                            i = R.id.llScore;
                                            LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llScore);
                                            if (linearLayout4 != null) {
                                                i = R.id.newLabel;
                                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.newLabel);
                                                if (textView != null) {
                                                    i = R.id.pieChart;
                                                    PieChart pieChart = (PieChart) getApplicationIcon.IconCompatParcelizer(view, R.id.pieChart);
                                                    if (pieChart != null) {
                                                        i = R.id.tvContinue;
                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContinue);
                                                        if (textView2 != null) {
                                                            i = R.id.tvLabel;
                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLabel);
                                                            if (textView3 != null) {
                                                                i = R.id.tvLessonScore;
                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonScore);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvLessonTitle;
                                                                    CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonTitle);
                                                                    if (customTextView != null) {
                                                                        i = R.id.tvRating;
                                                                        TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRating);
                                                                        if (textView5 != null) {
                                                                            i = R.id.tvSolveNow;
                                                                            TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSolveNow);
                                                                            if (textView6 != null) {
                                                                                i = R.id.verticalDivider;
                                                                                View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalDivider);
                                                                                if (viewIconCompatParcelizer != null) {
                                                                                    return new getMappedTrackOutput((ConstraintLayout) view, materialCardView, constraintLayout, constraintLayout2, linearLayout, imageView, imageView2, imageView3, linearLayout2, linearLayout3, linearLayout4, textView, pieChart, textView2, textView3, textView4, customTextView, textView5, textView6, viewIconCompatParcelizer);
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
