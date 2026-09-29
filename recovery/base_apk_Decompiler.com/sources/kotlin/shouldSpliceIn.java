package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldSpliceIn implements getApplicationLabel {
    public final FrameLayout AudioAttributesCompatParcelizer;
    public final LinearLayout AudioAttributesImplApi21Parcelizer;
    public final CircularProgressIndicator AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final ImageView IconCompatParcelizer;
    public final ImageView MediaBrowserCompatCustomActionResultReceiver;
    public final NestedScrollView MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final ImageView MediaBrowserCompatSearchResultReceiver;
    public final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final MaterialButton MediaDescriptionCompat;
    public final MaterialToolbar MediaMetadataCompat;
    public final TextView RatingCompat;
    public final FrameLayout RemoteActionCompatParcelizer;
    public final TextView handleMediaPlayPauseIfPendingOnHandler;
    public final ConstraintLayout onAddQueueItem;
    public final TextView onCommand;
    public final TextView onCustomAction;
    private final LinearLayout onFastForward;
    private View onPause;
    private TextView onPlay;
    private ConstraintLayout onPlayFromMediaId;
    public final LinearLayout read;
    public final RecyclerView write;

    private shouldSpliceIn(LinearLayout linearLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, RecyclerView recyclerView, View view, LinearLayout linearLayout2, ImageView imageView, CircularProgressIndicator circularProgressIndicator, TextView textView, ImageView imageView2, NestedScrollView nestedScrollView, LinearLayout linearLayout3, ImageView imageView3, MaterialButton materialButton, MaterialToolbar materialToolbar, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, ConstraintLayout constraintLayout2) {
        this.onFastForward = linearLayout;
        this.onPlayFromMediaId = constraintLayout;
        this.RemoteActionCompatParcelizer = frameLayout;
        this.AudioAttributesCompatParcelizer = frameLayout2;
        this.write = recyclerView;
        this.onPause = view;
        this.read = linearLayout2;
        this.IconCompatParcelizer = imageView;
        this.AudioAttributesImplApi26Parcelizer = circularProgressIndicator;
        this.AudioAttributesImplBaseParcelizer = textView;
        this.MediaBrowserCompatCustomActionResultReceiver = imageView2;
        this.MediaBrowserCompatItemReceiver = nestedScrollView;
        this.AudioAttributesImplApi21Parcelizer = linearLayout3;
        this.MediaBrowserCompatSearchResultReceiver = imageView3;
        this.MediaDescriptionCompat = materialButton;
        this.MediaMetadataCompat = materialToolbar;
        this.onPlay = textView2;
        this.MediaBrowserCompatMediaItem = textView3;
        this.RatingCompat = textView4;
        this.onCustomAction = textView5;
        this.onCommand = textView6;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView7;
        this.handleMediaPlayPauseIfPendingOnHandler = textView8;
        this.onAddQueueItem = constraintLayout2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LinearLayout IconCompatParcelizer() {
        return this.onFastForward;
    }

    public static shouldSpliceIn RemoteActionCompatParcelizer(View view) {
        int i = R.id.app_bar_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.app_bar_root);
        if (constraintLayout != null) {
            i = R.id.bottomContainer;
            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.bottomContainer);
            if (frameLayout != null) {
                i = R.id.calendarProgress;
                FrameLayout frameLayout2 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.calendarProgress);
                if (frameLayout2 != null) {
                    i = R.id.calendarView;
                    RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.calendarView);
                    if (recyclerView != null) {
                        i = R.id.divider;
                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
                        if (viewIconCompatParcelizer != null) {
                            i = R.id.headerContainer;
                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.headerContainer);
                            if (linearLayout != null) {
                                i = R.id.marrowLogo;
                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.marrowLogo);
                                if (imageView != null) {
                                    i = R.id.moduleCompletionProgress;
                                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) getApplicationIcon.IconCompatParcelizer(view, R.id.moduleCompletionProgress);
                                    if (circularProgressIndicator != null) {
                                        i = R.id.month;
                                        TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.month);
                                        if (textView != null) {
                                            i = R.id.next;
                                            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.next);
                                            if (imageView2 != null) {
                                                i = R.id.nsvOuterContainer;
                                                NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.nsvOuterContainer);
                                                if (nestedScrollView != null) {
                                                    i = R.id.parentContainer;
                                                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.parentContainer);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.previous;
                                                        ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.previous);
                                                        if (imageView3 != null) {
                                                            i = R.id.share;
                                                            MaterialButton materialButton = (MaterialButton) getApplicationIcon.IconCompatParcelizer(view, R.id.share);
                                                            if (materialButton != null) {
                                                                i = R.id.toolbar;
                                                                MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                if (materialToolbar != null) {
                                                                    i = R.id.tvAppbarTitle;
                                                                    TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAppbarTitle);
                                                                    if (textView2 != null) {
                                                                        i = R.id.tvMarrowthonDate;
                                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMarrowthonDate);
                                                                        if (textView3 != null) {
                                                                            i = R.id.tvMarrowthonInfo;
                                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMarrowthonInfo);
                                                                            if (textView4 != null) {
                                                                                i = R.id.tvMarrowthonTitle;
                                                                                TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMarrowthonTitle);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.tvModuleCompletionNumber;
                                                                                    TextView textView6 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleCompletionNumber);
                                                                                    if (textView6 != null) {
                                                                                        i = R.id.tvModuleCompletionSubText;
                                                                                        TextView textView7 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleCompletionSubText);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.tvTotalModuleCountSubText;
                                                                                            TextView textView8 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvTotalModuleCountSubText);
                                                                                            if (textView8 != null) {
                                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.woqBanner);
                                                                                                if (constraintLayout2 != null) {
                                                                                                    return new shouldSpliceIn((LinearLayout) view, constraintLayout, frameLayout, frameLayout2, recyclerView, viewIconCompatParcelizer, linearLayout, imageView, circularProgressIndicator, textView, imageView2, nestedScrollView, linearLayout2, imageView3, materialButton, materialToolbar, textView2, textView3, textView4, textView5, textView6, textView7, textView8, constraintLayout2);
                                                                                                }
                                                                                                i = R.id.woqBanner;
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
