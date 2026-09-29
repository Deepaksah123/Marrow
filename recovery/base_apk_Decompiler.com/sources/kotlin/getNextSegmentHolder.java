package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class getNextSegmentHolder implements getApplicationLabel {
    public final Group AudioAttributesCompatParcelizer;
    public final ProgressBar AudioAttributesImplApi21Parcelizer;
    public final NestedScrollView AudioAttributesImplApi26Parcelizer;
    public final continuePreparing AudioAttributesImplBaseParcelizer;
    public final Group IconCompatParcelizer;
    public final Group MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final MaterialCardView MediaBrowserCompatSearchResultReceiver;
    public final ConstraintLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final RecyclerView MediaMetadataCompat;
    public final ShimmerFrameLayout RatingCompat;
    public final ConstraintLayout RemoteActionCompatParcelizer;
    private Barrier handleMediaPlayPauseIfPendingOnHandler;
    private View onAddQueueItem;
    private LinearLayout onCommand;
    private final ConstraintLayout onCustomAction;
    private View onMediaButtonEvent;
    private ShimmerFrameLayout onPause;
    private TextView onPlay;
    public final CardView read;
    public final ComposeView write;

    private getNextSegmentHolder(ConstraintLayout constraintLayout, Barrier barrier, ConstraintLayout constraintLayout2, CardView cardView, ComposeView composeView, Group group, Group group2, Group group3, LinearLayout linearLayout, View view, continuePreparing continuepreparing, LinearLayout linearLayout2, NestedScrollView nestedScrollView, ProgressBar progressBar, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, View view2, TextView textView, TextView textView2, TextView textView3, MaterialCardView materialCardView, ConstraintLayout constraintLayout3) {
        this.onCustomAction = constraintLayout;
        this.handleMediaPlayPauseIfPendingOnHandler = barrier;
        this.RemoteActionCompatParcelizer = constraintLayout2;
        this.read = cardView;
        this.write = composeView;
        this.AudioAttributesCompatParcelizer = group;
        this.IconCompatParcelizer = group2;
        this.MediaBrowserCompatCustomActionResultReceiver = group3;
        this.onCommand = linearLayout;
        this.onAddQueueItem = view;
        this.AudioAttributesImplBaseParcelizer = continuepreparing;
        this.MediaBrowserCompatItemReceiver = linearLayout2;
        this.AudioAttributesImplApi26Parcelizer = nestedScrollView;
        this.AudioAttributesImplApi21Parcelizer = progressBar;
        this.MediaMetadataCompat = recyclerView;
        this.onPause = shimmerFrameLayout;
        this.RatingCompat = shimmerFrameLayout2;
        this.onMediaButtonEvent = view2;
        this.onPlay = textView;
        this.MediaBrowserCompatMediaItem = textView2;
        this.MediaDescriptionCompat = textView3;
        this.MediaBrowserCompatSearchResultReceiver = materialCardView;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constraintLayout3;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onCustomAction;
    }

    public static getNextSegmentHolder RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_home, viewGroup, false));
    }

    private static getNextSegmentHolder AudioAttributesCompatParcelizer(View view) {
        int i = R.id.barrier;
        Barrier barrier = (Barrier) getApplicationIcon.IconCompatParcelizer(view, R.id.barrier);
        if (barrier != null) {
            i = R.id.clMainInfo;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clMainInfo);
            if (constraintLayout != null) {
                i = R.id.cvGoPro;
                CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvGoPro);
                if (cardView != null) {
                    i = R.id.ed8Zen;
                    ComposeView composeView = (ComposeView) getApplicationIcon.IconCompatParcelizer(view, R.id.ed8Zen);
                    if (composeView != null) {
                        i = R.id.footerGroup;
                        Group group = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.footerGroup);
                        if (group != null) {
                            i = R.id.goProEd5Ed6;
                            Group group2 = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.goProEd5Ed6);
                            if (group2 != null) {
                                i = R.id.groupEd6Views;
                                Group group3 = (Group) getApplicationIcon.IconCompatParcelizer(view, R.id.groupEd6Views);
                                if (group3 != null) {
                                    i = R.id.heartMarrow;
                                    LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.heartMarrow);
                                    if (linearLayout != null) {
                                        i = R.id.ivEd6background;
                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.ivEd6background);
                                        if (viewIconCompatParcelizer != null) {
                                            i = R.id.layoutDynamicZenArea;
                                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.layoutDynamicZenArea);
                                            if (viewIconCompatParcelizer2 != null) {
                                                continuePreparing continuepreparingRemoteActionCompatParcelizer = continuePreparing.RemoteActionCompatParcelizer(viewIconCompatParcelizer2);
                                                i = R.id.llShare;
                                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llShare);
                                                if (linearLayout2 != null) {
                                                    i = R.id.nestedScrollView;
                                                    NestedScrollView nestedScrollView = (NestedScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.nestedScrollView);
                                                    if (nestedScrollView != null) {
                                                        i = R.id.pbModuleCompletion;
                                                        ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbModuleCompletion);
                                                        if (progressBar != null) {
                                                            i = R.id.rvHomeCard;
                                                            RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvHomeCard);
                                                            if (recyclerView != null) {
                                                                i = R.id.shimmerGoPro;
                                                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.shimmerGoPro);
                                                                if (shimmerFrameLayout != null) {
                                                                    i = R.id.shimmerMain;
                                                                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.shimmerMain);
                                                                    if (shimmerFrameLayout2 != null) {
                                                                        i = R.id.spacePro;
                                                                        View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.spacePro);
                                                                        if (viewIconCompatParcelizer3 != null) {
                                                                            i = R.id.tvGoPro;
                                                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvGoPro);
                                                                            if (textView != null) {
                                                                                i = R.id.tvModuleCompletionNumber;
                                                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleCompletionNumber);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.tvModuleCompletionSubText;
                                                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleCompletionSubText);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.tvModuleGenerated;
                                                                                        MaterialCardView materialCardView = (MaterialCardView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleGenerated);
                                                                                        if (materialCardView != null) {
                                                                                            i = R.id.zenAreaContainer;
                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.zenAreaContainer);
                                                                                            if (constraintLayout2 != null) {
                                                                                                return new getNextSegmentHolder((ConstraintLayout) view, barrier, constraintLayout, cardView, composeView, group, group2, group3, linearLayout, viewIconCompatParcelizer, continuepreparingRemoteActionCompatParcelizer, linearLayout2, nestedScrollView, progressBar, recyclerView, shimmerFrameLayout, shimmerFrameLayout2, viewIconCompatParcelizer3, textView, textView2, textView3, materialCardView, constraintLayout2);
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
