package kotlin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaSourceMetadataType implements getApplicationLabel {
    public final Group AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final ImageView AudioAttributesImplApi26Parcelizer;
    public final LinearLayout AudioAttributesImplBaseParcelizer;
    public final MaterialCardView IconCompatParcelizer;
    public final ImageView MediaBrowserCompatCustomActionResultReceiver;
    public final PieChart MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final TextView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final TextView onAddQueueItem;
    public final TextView onCommand;
    public final TextView onCustomAction;
    public final View onFastForward;
    private ConstraintLayout onMediaButtonEvent;
    private LinearLayout onPause;
    private Group onPlay;
    private ConstraintLayout onPlayFromMediaId;
    private View onPlayFromSearch;
    private LinearLayout onPlayFromUri;
    private TextView onPrepare;
    private TextView onPrepareFromMediaId;
    private final ConstraintLayout onPrepareFromSearch;
    private View onRemoveQueueItem;
    private View onRemoveQueueItemAt;
    public final ImageView read;
    public final ImageView write;

    private HlsMediaSourceMetadataType(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, MaterialCardView materialCardView, ConstraintLayout constraintLayout4, Group group, Group group2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, View view, PieChart pieChart, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, LinearLayout linearLayout4, View view2, View view3, View view4) {
        this.onPrepareFromSearch = constraintLayout;
        this.onPlayFromMediaId = constraintLayout2;
        this.RemoteActionCompatParcelizer = constraintLayout3;
        this.IconCompatParcelizer = materialCardView;
        this.onMediaButtonEvent = constraintLayout4;
        this.onPlay = group;
        this.AudioAttributesCompatParcelizer = group2;
        this.read = imageView;
        this.write = imageView2;
        this.MediaBrowserCompatCustomActionResultReceiver = imageView3;
        this.AudioAttributesImplApi26Parcelizer = imageView4;
        this.AudioAttributesImplApi21Parcelizer = linearLayout;
        this.AudioAttributesImplBaseParcelizer = linearLayout2;
        this.onPause = linearLayout3;
        this.onPlayFromSearch = view;
        this.MediaBrowserCompatItemReceiver = pieChart;
        this.MediaBrowserCompatMediaItem = textView;
        this.RatingCompat = textView2;
        this.onPrepareFromMediaId = textView3;
        this.MediaDescriptionCompat = textView4;
        this.MediaBrowserCompatSearchResultReceiver = textView5;
        this.MediaMetadataCompat = textView6;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView7;
        this.onCustomAction = textView8;
        this.handleMediaPlayPauseIfPendingOnHandler = textView9;
        this.onAddQueueItem = textView10;
        this.onPrepare = textView11;
        this.onCommand = textView12;
        this.onPlayFromUri = linearLayout4;
        this.onRemoveQueueItem = view2;
        this.onRemoveQueueItemAt = view3;
        this.onFastForward = view4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.onPrepareFromSearch;
    }

    public static HlsMediaSourceMetadataType read(View view) {
        int i = R.id.card_lesson_top;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.card_lesson_top);
        if (constraintLayout != null) {
            i = R.id.clLessonStats;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clLessonStats);
            if (constraintLayout2 != null) {
                i = R.id.cvMain;
                MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvMain);
                if (materialCardView != null) {
                    i = R.id.detailsContainer;
                    ConstraintLayout constraintLayout3 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.detailsContainer);
                    if (constraintLayout3 != null) {
                        i = R.id.groupMcq;
                        Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.groupMcq);
                        if (group != null) {
                            i = R.id.groupPie;
                            Group group2 = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.groupPie);
                            if (group2 != null) {
                                i = R.id.ivLesson;
                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLesson);
                                if (imageView != null) {
                                    i = R.id.ivLessonComplete;
                                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivLessonComplete);
                                    if (imageView2 != null) {
                                        i = R.id.ivProLock;
                                        ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivProLock);
                                        if (imageView3 != null) {
                                            i = R.id.ivRating;
                                            ImageView imageView4 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivRating);
                                            if (imageView4 != null) {
                                                i = R.id.llContinue;
                                                LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llContinue);
                                                if (linearLayout != null) {
                                                    i = R.id.llProCard;
                                                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llProCard);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.llRatingContainer;
                                                        LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llRatingContainer);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.pie_background;
                                                            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.pie_background);
                                                            if (viewIconCompatParcelizer != null) {
                                                                i = R.id.pieChart;
                                                                PieChart pieChart = (PieChart) getApplicationIcon.IconCompatParcelizer(view, R.id.pieChart);
                                                                if (pieChart != null) {
                                                                    i = R.id.tvComingSoon;
                                                                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvComingSoon);
                                                                    if (textView != null) {
                                                                        i = R.id.tvCompletedOn;
                                                                        TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCompletedOn);
                                                                        if (textView2 != null) {
                                                                            i = R.id.tvContinue;
                                                                            TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvContinue);
                                                                            if (textView3 != null) {
                                                                                i = R.id.tvLessonPosition;
                                                                                TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonPosition);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.tvLessonScore;
                                                                                    TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonScore);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.tvLessonTitle;
                                                                                        TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLessonTitle);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.tvMcqAdded;
                                                                                            TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMcqAdded);
                                                                                            if (textView7 != null) {
                                                                                                TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMcqCount);
                                                                                                if (textView8 != null) {
                                                                                                    TextView textView9 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMcqUpdated);
                                                                                                    if (textView9 != null) {
                                                                                                        TextView textView10 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvOptionalLabel);
                                                                                                        if (textView10 != null) {
                                                                                                            TextView textView11 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvProTitle);
                                                                                                            if (textView11 != null) {
                                                                                                                TextView textView12 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRating);
                                                                                                                if (textView12 != null) {
                                                                                                                    LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vLessonMcqUpdateTagContainer);
                                                                                                                    if (linearLayout4 != null) {
                                                                                                                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalDivider);
                                                                                                                        if (viewIconCompatParcelizer2 != null) {
                                                                                                                            View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.verticalDivider1);
                                                                                                                            if (viewIconCompatParcelizer3 != null) {
                                                                                                                                View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewDash);
                                                                                                                                if (viewIconCompatParcelizer4 != null) {
                                                                                                                                    return new HlsMediaSourceMetadataType((ConstraintLayout) view, constraintLayout, constraintLayout2, materialCardView, constraintLayout3, group, group2, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, linearLayout3, viewIconCompatParcelizer, pieChart, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, linearLayout4, viewIconCompatParcelizer2, viewIconCompatParcelizer3, viewIconCompatParcelizer4);
                                                                                                                                }
                                                                                                                                i = R.id.viewDash;
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
                                                                                                                    i = R.id.tvRating;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = R.id.tvProTitle;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvOptionalLabel;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvMcqUpdated;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvMcqCount;
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
