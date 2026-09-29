package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class peekId3PrivTimestamp implements getApplicationLabel {
    public final FrameLayout AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final ProgressBar AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final AppBarLayout IconCompatParcelizer;
    public final Toolbar MediaBrowserCompatCustomActionResultReceiver;
    public final ProgressBar MediaBrowserCompatItemReceiver;
    public final Button MediaBrowserCompatMediaItem;
    public final Button MediaBrowserCompatSearchResultReceiver;
    private LinearLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final LinearLayout MediaMetadataCompat;
    public final TextView RatingCompat;
    public final LinearLayout RemoteActionCompatParcelizer;
    private LinearLayout handleMediaPlayPauseIfPendingOnHandler;
    private TextView onAddQueueItem;
    private CollapsingToolbarLayout onCommand;
    private final CoordinatorLayout onCustomAction;
    private LinearLayout onFastForward;
    public final NestedScrollView read;
    public final FrameLayout write;

    private peekId3PrivTimestamp(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, FrameLayout frameLayout2, CollapsingToolbarLayout collapsingToolbarLayout, LinearLayout linearLayout, LinearLayout linearLayout2, NestedScrollView nestedScrollView, ProgressBar progressBar, ProgressBar progressBar2, TextView textView, LinearLayout linearLayout3, LinearLayout linearLayout4, Toolbar toolbar, Button button, TextView textView2, TextView textView3, Button button2, TextView textView4, LinearLayout linearLayout5, LinearLayout linearLayout6) {
        this.onCustomAction = coordinatorLayout;
        this.IconCompatParcelizer = appBarLayout;
        this.write = frameLayout;
        this.AudioAttributesCompatParcelizer = frameLayout2;
        this.onCommand = collapsingToolbarLayout;
        this.handleMediaPlayPauseIfPendingOnHandler = linearLayout;
        this.RemoteActionCompatParcelizer = linearLayout2;
        this.read = nestedScrollView;
        this.MediaBrowserCompatItemReceiver = progressBar;
        this.AudioAttributesImplApi26Parcelizer = progressBar2;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.AudioAttributesImplApi21Parcelizer = linearLayout3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = linearLayout4;
        this.MediaBrowserCompatCustomActionResultReceiver = toolbar;
        this.MediaBrowserCompatMediaItem = button;
        this.MediaDescriptionCompat = textView2;
        this.onAddQueueItem = textView3;
        this.MediaBrowserCompatSearchResultReceiver = button2;
        this.RatingCompat = textView4;
        this.onFastForward = linearLayout5;
        this.MediaMetadataCompat = linearLayout6;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final CoordinatorLayout IconCompatParcelizer() {
        return this.onCustomAction;
    }

    public static peekId3PrivTimestamp write(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_referral_coupon, viewGroup, false));
    }

    private static peekId3PrivTimestamp read(View view) {
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.benefitContainer;
            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.benefitContainer);
            if (frameLayout != null) {
                i = R.id.codeContainer;
                FrameLayout frameLayout2 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.codeContainer);
                if (frameLayout2 != null) {
                    i = R.id.collapsibleToolbar;
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.collapsibleToolbar);
                    if (collapsingToolbarLayout != null) {
                        i = R.id.llCollapsibleToolbarContent;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llCollapsibleToolbarContent);
                        if (linearLayout != null) {
                            i = R.id.noteContainer;
                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.noteContainer);
                            if (linearLayout2 != null) {
                                i = R.id.nsvOuterContainer;
                                NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.nsvOuterContainer);
                                if (nestedScrollView != null) {
                                    i = R.id.progress;
                                    ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progress);
                                    if (progressBar != null) {
                                        i = R.id.progressShare;
                                        ProgressBar progressBar2 = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.progressShare);
                                        if (progressBar2 != null) {
                                            i = R.id.referalCouponHeader;
                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.referalCouponHeader);
                                            if (textView != null) {
                                                i = R.id.stepsContainer;
                                                LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.stepsContainer);
                                                if (linearLayout3 != null) {
                                                    i = R.id.stepsContainer1;
                                                    LinearLayout linearLayout4 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.stepsContainer1);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.toolbar;
                                                        Toolbar toolbar = (Toolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                        if (toolbar != null) {
                                                            i = R.id.tvCopy;
                                                            Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.tvCopy);
                                                            if (button != null) {
                                                                i = R.id.tvReferalCouponCode;
                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvReferalCouponCode);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvReferalCouponCodeContainerTitle;
                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvReferalCouponCodeContainerTitle);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvShare;
                                                                        Button button2 = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.tvShare);
                                                                        if (button2 != null) {
                                                                            i = R.id.tvUnlockedDaysTitle;
                                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvUnlockedDaysTitle);
                                                                            if (textView4 != null) {
                                                                                i = R.id.vReferalCouponButtonContainer;
                                                                                LinearLayout linearLayout5 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vReferalCouponButtonContainer);
                                                                                if (linearLayout5 != null) {
                                                                                    i = R.id.vUnlockedDaysContainer;
                                                                                    LinearLayout linearLayout6 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.vUnlockedDaysContainer);
                                                                                    if (linearLayout6 != null) {
                                                                                        return new peekId3PrivTimestamp((CoordinatorLayout) view, appBarLayout, frameLayout, frameLayout2, collapsingToolbarLayout, linearLayout, linearLayout2, nestedScrollView, progressBar, progressBar2, textView, linearLayout3, linearLayout4, toolbar, button, textView2, textView3, button2, textView4, linearLayout5, linearLayout6);
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
