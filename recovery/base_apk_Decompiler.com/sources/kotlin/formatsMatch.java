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

/* JADX INFO: loaded from: classes3.dex */
public final class formatsMatch implements getApplicationLabel {
    public final MaterialCardView AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final TextView AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final PieChart MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    private LinearLayout MediaBrowserCompatSearchResultReceiver;
    private ImageView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final CustomTextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    private ConstraintLayout handleMediaPlayPauseIfPendingOnHandler;
    private LinearLayout onAddQueueItem;
    private LinearLayout onCommand;
    private ImageView onCustomAction;
    private View onFastForward;
    private TextView onPause;
    private final ConstraintLayout onPlay;
    public final ConstraintLayout read;
    public final ImageView write;

    private formatsMatch(ConstraintLayout constraintLayout, MaterialCardView materialCardView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ConstraintLayout constraintLayout3, LinearLayout linearLayout2, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView, PieChart pieChart, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, CustomTextView customTextView, TextView textView7, TextView textView8, View view) {
        this.onPlay = constraintLayout;
        this.AudioAttributesCompatParcelizer = materialCardView;
        this.read = constraintLayout2;
        this.MediaBrowserCompatSearchResultReceiver = linearLayout;
        this.handleMediaPlayPauseIfPendingOnHandler = constraintLayout3;
        this.onAddQueueItem = linearLayout2;
        this.onCustomAction = imageView;
        this.write = imageView2;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = imageView3;
        this.IconCompatParcelizer = linearLayout3;
        this.onCommand = linearLayout4;
        this.RemoteActionCompatParcelizer = linearLayout5;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.MediaBrowserCompatItemReceiver = pieChart;
        this.AudioAttributesImplApi21Parcelizer = textView2;
        this.onPause = textView3;
        this.MediaBrowserCompatCustomActionResultReceiver = textView4;
        this.AudioAttributesImplApi26Parcelizer = textView5;
        this.MediaMetadataCompat = textView6;
        this.MediaDescriptionCompat = customTextView;
        this.RatingCompat = textView7;
        this.MediaBrowserCompatMediaItem = textView8;
        this.onFastForward = view;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onPlay;
    }

    public static formatsMatch RemoteActionCompatParcelizer(View view) {
        int i = R.id.activeRecallCardView;
        MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.activeRecallCardView);
        if (materialCardView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.card_container;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.card_container);
            if (linearLayout != null) {
                i = R.id.detailsContainer;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.detailsContainer);
                if (constraintLayout2 != null) {
                    i = R.id.divider;
                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
                    if (linearLayout2 != null) {
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
                                    LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llContinue);
                                    if (linearLayout3 != null) {
                                        i = R.id.llInfoContainer;
                                        LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llInfoContainer);
                                        if (linearLayout4 != null) {
                                            i = R.id.llScore;
                                            LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llScore);
                                            if (linearLayout5 != null) {
                                                i = R.id.newLabel;
                                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.newLabel);
                                                if (textView != null) {
                                                    i = R.id.pieChart;
                                                    PieChart pieChart = (PieChart) getApplicationIcon.IconCompatParcelizer(view, R.id.pieChart);
                                                    if (pieChart != null) {
                                                        i = R.id.tvCompletedDate;
                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCompletedDate);
                                                        if (textView2 != null) {
                                                            i = R.id.tvContinue;
                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContinue);
                                                            if (textView3 != null) {
                                                                i = R.id.tvDescription;
                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvDescription);
                                                                if (textView4 != null) {
                                                                    i = R.id.tvLabel;
                                                                    TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLabel);
                                                                    if (textView5 != null) {
                                                                        i = R.id.tvLessonScore;
                                                                        TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonScore);
                                                                        if (textView6 != null) {
                                                                            i = R.id.tvLessonTitle;
                                                                            CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonTitle);
                                                                            if (customTextView != null) {
                                                                                i = R.id.tvRating;
                                                                                TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRating);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.tvSolveNow;
                                                                                    TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvSolveNow);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.verticalDivider;
                                                                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalDivider);
                                                                                        if (viewIconCompatParcelizer != null) {
                                                                                            return new formatsMatch(constraintLayout, materialCardView, constraintLayout, linearLayout, constraintLayout2, linearLayout2, imageView, imageView2, imageView3, linearLayout3, linearLayout4, linearLayout5, textView, pieChart, textView2, textView3, textView4, textView5, textView6, customTextView, textView7, textView8, viewIconCompatParcelizer);
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
