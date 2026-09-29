package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class onTruncatedSegmentParsed implements getApplicationLabel {
    public final Group AudioAttributesCompatParcelizer;
    public final FrameLayout AudioAttributesImplApi21Parcelizer;
    public final Group AudioAttributesImplApi26Parcelizer;
    public final ImageView AudioAttributesImplBaseParcelizer;
    public final CollapsingToolbarLayout IconCompatParcelizer;
    public final CustomTextView MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final View MediaBrowserCompatSearchResultReceiver;
    public final CustomTextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final RecyclerView MediaDescriptionCompat;
    public final getLoadedPlaylistStartTimeUs MediaMetadataCompat;
    public final CustomTextView RatingCompat;
    public final TextView RemoteActionCompatParcelizer;
    public final CustomTextView handleMediaPlayPauseIfPendingOnHandler;
    public final CustomTextView onAddQueueItem;
    public final TextView onCommand;
    public final CustomTextView onCustomAction;
    private AppBarLayout onFastForward;
    private CoordinatorLayout onMediaButtonEvent;
    private ProgressBar onPause;
    private ImageView onPlay;
    private Barrier onPlayFromMediaId;
    private Barrier onPlayFromUri;
    private TextView onPrepare;
    private final CoordinatorLayout onPrepareFromMediaId;
    private Barrier onPrepareFromSearch;
    public final ConstraintLayout read;
    public final ImageView write;

    private onTruncatedSegmentParsed(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout2, TextView textView, Group group, ImageView imageView, ImageView imageView2, ImageView imageView3, Barrier barrier, LinearLayout linearLayout, CustomTextView customTextView, FrameLayout frameLayout, ProgressBar progressBar, Group group2, TextView textView2, RecyclerView recyclerView, View view, Barrier barrier2, getLoadedPlaylistStartTimeUs getloadedplayliststarttimeus, Barrier barrier3, CustomTextView customTextView2, CustomTextView customTextView3, CustomTextView customTextView4, CustomTextView customTextView5, TextView textView3, TextView textView4, CustomTextView customTextView6) {
        this.onPrepareFromMediaId = coordinatorLayout;
        this.onFastForward = appBarLayout;
        this.IconCompatParcelizer = collapsingToolbarLayout;
        this.read = constraintLayout;
        this.onMediaButtonEvent = coordinatorLayout2;
        this.RemoteActionCompatParcelizer = textView;
        this.AudioAttributesCompatParcelizer = group;
        this.onPlay = imageView;
        this.write = imageView2;
        this.AudioAttributesImplBaseParcelizer = imageView3;
        this.onPlayFromMediaId = barrier;
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = customTextView;
        this.AudioAttributesImplApi21Parcelizer = frameLayout;
        this.onPause = progressBar;
        this.AudioAttributesImplApi26Parcelizer = group2;
        this.MediaBrowserCompatMediaItem = textView2;
        this.MediaDescriptionCompat = recyclerView;
        this.MediaBrowserCompatSearchResultReceiver = view;
        this.onPrepareFromSearch = barrier2;
        this.MediaMetadataCompat = getloadedplayliststarttimeus;
        this.onPlayFromUri = barrier3;
        this.RatingCompat = customTextView2;
        this.handleMediaPlayPauseIfPendingOnHandler = customTextView3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = customTextView4;
        this.onAddQueueItem = customTextView5;
        this.onCommand = textView3;
        this.onPrepare = textView4;
        this.onCustomAction = customTextView6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout IconCompatParcelizer() {
        return this.onPrepareFromMediaId;
    }

    public static onTruncatedSegmentParsed IconCompatParcelizer(View view) {
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.appBarLayout);
        if (appBarLayout != null) {
            i = R.id.collapsingToolbar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.collapsingToolbar);
            if (collapsingToolbarLayout != null) {
                i = R.id.container_banner_view;
                ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.container_banner_view);
                if (constraintLayout != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                    i = R.id.defaultBannerTv;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.defaultBannerTv);
                    if (textView != null) {
                        i = R.id.emptyPlanGrp;
                        Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.emptyPlanGrp);
                        if (group != null) {
                            i = R.id.imgEmptyPlanWarning;
                            ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgEmptyPlanWarning);
                            if (imageView != null) {
                                i = R.id.imgGradCap;
                                ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgGradCap);
                                if (imageView2 != null) {
                                    i = R.id.imgRenew;
                                    ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgRenew);
                                    if (imageView3 != null) {
                                        i = R.id.offer_barrier;
                                        Barrier barrier = (Barrier) getApplicationIcon.IconCompatParcelizer(view, R.id.offer_barrier);
                                        if (barrier != null) {
                                            i = R.id.plan_loading_container;
                                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_loading_container);
                                            if (linearLayout != null) {
                                                i = R.id.plan_no_internet_view;
                                                CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.plan_no_internet_view);
                                                if (customTextView != null) {
                                                    i = R.id.progressBannerContainer;
                                                    FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.progressBannerContainer);
                                                    if (frameLayout != null) {
                                                        i = R.id.progress_bar;
                                                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progress_bar);
                                                        if (progressBar != null) {
                                                            i = R.id.renewBannerGrp;
                                                            Group group2 = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.renewBannerGrp);
                                                            if (group2 != null) {
                                                                i = R.id.renewBannerTv;
                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.renewBannerTv);
                                                                if (textView2 != null) {
                                                                    i = R.id.rvPlans;
                                                                    RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvPlans);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.spacer;
                                                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.spacer);
                                                                        if (viewIconCompatParcelizer != null) {
                                                                            i = R.id.stripes_bg_barrier;
                                                                            Barrier barrier2 = (Barrier) getApplicationIcon.IconCompatParcelizer(view, R.id.stripes_bg_barrier);
                                                                            if (barrier2 != null) {
                                                                                i = R.id.subscription_footer;
                                                                                View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.subscription_footer);
                                                                                if (viewIconCompatParcelizer2 != null) {
                                                                                    getLoadedPlaylistStartTimeUs getloadedplayliststarttimeus = getLoadedPlaylistStartTimeUs.read(viewIconCompatParcelizer2);
                                                                                    i = R.id.title_coupon_barrier;
                                                                                    Barrier barrier3 = (Barrier) getApplicationIcon.IconCompatParcelizer(view, R.id.title_coupon_barrier);
                                                                                    if (barrier3 != null) {
                                                                                        i = R.id.tvBannerCoupon;
                                                                                        CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBannerCoupon);
                                                                                        if (customTextView2 != null) {
                                                                                            i = R.id.tvBannerOffer;
                                                                                            CustomTextView customTextView3 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBannerOffer);
                                                                                            if (customTextView3 != null) {
                                                                                                CustomTextView customTextView4 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBannerStrip);
                                                                                                if (customTextView4 != null) {
                                                                                                    CustomTextView customTextView5 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBannerTitle);
                                                                                                    if (customTextView5 != null) {
                                                                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmptyPlanSubText);
                                                                                                        if (textView3 != null) {
                                                                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvEmptyPlanTitle);
                                                                                                            if (textView4 != null) {
                                                                                                                CustomTextView customTextView6 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.view_more_plans);
                                                                                                                if (customTextView6 != null) {
                                                                                                                    return new onTruncatedSegmentParsed(coordinatorLayout, appBarLayout, collapsingToolbarLayout, constraintLayout, coordinatorLayout, textView, group, imageView, imageView2, imageView3, barrier, linearLayout, customTextView, frameLayout, progressBar, group2, textView2, recyclerView, viewIconCompatParcelizer, barrier2, getloadedplayliststarttimeus, barrier3, customTextView2, customTextView3, customTextView4, customTextView5, textView3, textView4, customTextView6);
                                                                                                                }
                                                                                                                i = R.id.view_more_plans;
                                                                                                            } else {
                                                                                                                i = R.id.tvEmptyPlanTitle;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = R.id.tvEmptyPlanSubText;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = R.id.tvBannerTitle;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = R.id.tvBannerStrip;
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
