package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;
import com.marrow.ui.views.MaxHeightRecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class getResult implements getApplicationLabel {
    public final ImageView AudioAttributesCompatParcelizer;
    public final SwitchMaterial AudioAttributesImplApi21Parcelizer;
    public final RecyclerView AudioAttributesImplApi26Parcelizer;
    public final MaxHeightRecyclerView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final getAdjustedMetadata MediaBrowserCompatCustomActionResultReceiver;
    public final LinearLayout MediaBrowserCompatItemReceiver;
    public final TextView MediaBrowserCompatMediaItem;
    public final CardView MediaBrowserCompatSearchResultReceiver;
    private ConstraintLayout MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final TextView MediaDescriptionCompat;
    public final MaterialToolbar MediaMetadataCompat;
    public final TabLayout RatingCompat;
    public final FrameLayout RemoteActionCompatParcelizer;
    private View handleMediaPlayPauseIfPendingOnHandler;
    public final View onAddQueueItem;
    public final View onCommand;
    private View onCustomAction;
    private LinearLayout onFastForward;
    private ImageView onPause;
    private final ConstraintLayout onPlayFromMediaId;
    public final ImageView read;
    public final CardView write;

    private getResult(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, TextView textView, CardView cardView, View view2, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, getAdjustedMetadata getadjustedmetadata, RecyclerView recyclerView, MaxHeightRecyclerView maxHeightRecyclerView, SwitchMaterial switchMaterial, TabLayout tabLayout, MaterialToolbar materialToolbar, TextView textView2, TextView textView3, CardView cardView2, View view3, View view4) {
        this.onPlayFromMediaId = constraintLayout;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = constraintLayout2;
        this.handleMediaPlayPauseIfPendingOnHandler = view;
        this.IconCompatParcelizer = textView;
        this.write = cardView;
        this.onCustomAction = view2;
        this.RemoteActionCompatParcelizer = frameLayout;
        this.AudioAttributesCompatParcelizer = imageView;
        this.read = imageView2;
        this.onPause = imageView3;
        this.MediaBrowserCompatItemReceiver = linearLayout;
        this.onFastForward = linearLayout2;
        this.MediaBrowserCompatCustomActionResultReceiver = getadjustedmetadata;
        this.AudioAttributesImplApi26Parcelizer = recyclerView;
        this.AudioAttributesImplBaseParcelizer = maxHeightRecyclerView;
        this.AudioAttributesImplApi21Parcelizer = switchMaterial;
        this.RatingCompat = tabLayout;
        this.MediaMetadataCompat = materialToolbar;
        this.MediaBrowserCompatMediaItem = textView2;
        this.MediaDescriptionCompat = textView3;
        this.MediaBrowserCompatSearchResultReceiver = cardView2;
        this.onAddQueueItem = view3;
        this.onCommand = view4;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final ConstraintLayout IconCompatParcelizer() {
        return this.onPlayFromMediaId;
    }

    public static getResult RemoteActionCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return read(layoutInflater.inflate(R.layout.fragment_pearl_list_revamp, viewGroup, false));
    }

    private static getResult read(View view) {
        int i = R.id.app_bar_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.app_bar_root);
        if (constraintLayout != null) {
            i = R.id.bookmark_divider;
            View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.bookmark_divider);
            if (viewIconCompatParcelizer != null) {
                i = R.id.btnIndex;
                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.btnIndex);
                if (textView != null) {
                    i = R.id.cvTopics;
                    CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.cvTopics);
                    if (cardView != null) {
                        i = R.id.divider;
                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.divider);
                        if (viewIconCompatParcelizer2 != null) {
                            i = R.id.fragment_container;
                            FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.fragment_container);
                            if (frameLayout != null) {
                                i = R.id.imgSearch;
                                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.imgSearch);
                                if (imageView != null) {
                                    i = R.id.ivBookmark;
                                    ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBookmark);
                                    if (imageView2 != null) {
                                        i = R.id.ivBookmarkArrow;
                                        ImageView imageView3 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBookmarkArrow);
                                        if (imageView3 != null) {
                                            i = R.id.ivBookmarkContainer;
                                            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBookmarkContainer);
                                            if (linearLayout != null) {
                                                i = R.id.linear_layout;
                                                LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.linear_layout);
                                                if (linearLayout2 != null) {
                                                    i = R.id.multibookmark_filter;
                                                    View viewIconCompatParcelizer3 = getApplicationIcon.IconCompatParcelizer(view, R.id.multibookmark_filter);
                                                    if (viewIconCompatParcelizer3 != null) {
                                                        getAdjustedMetadata getadjustedmetadataWrite = getAdjustedMetadata.write(viewIconCompatParcelizer3);
                                                        i = R.id.recycler_view;
                                                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.recycler_view);
                                                        if (recyclerView != null) {
                                                            i = R.id.rlTopics;
                                                            MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rlTopics);
                                                            if (maxHeightRecyclerView != null) {
                                                                i = R.id.switchBookmark;
                                                                SwitchMaterial switchMaterial = (SwitchMaterial) getApplicationIcon.IconCompatParcelizer(view, R.id.switchBookmark);
                                                                if (switchMaterial != null) {
                                                                    i = R.id.tabs;
                                                                    TabLayout tabLayout = (TabLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.tabs);
                                                                    if (tabLayout != null) {
                                                                        i = R.id.toolbar;
                                                                        MaterialToolbar materialToolbar = (MaterialToolbar) getApplicationIcon.IconCompatParcelizer(view, R.id.toolbar);
                                                                        if (materialToolbar != null) {
                                                                            i = R.id.tvAppbarTitle;
                                                                            TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvAppbarTitle);
                                                                            if (textView2 != null) {
                                                                                i = R.id.tvNoPearlMsg;
                                                                                TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNoPearlMsg);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.vPearlFilter;
                                                                                    CardView cardView2 = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.vPearlFilter);
                                                                                    if (cardView2 != null) {
                                                                                        i = R.id.vPearlFilterBackground;
                                                                                        View viewIconCompatParcelizer4 = getApplicationIcon.IconCompatParcelizer(view, R.id.vPearlFilterBackground);
                                                                                        if (viewIconCompatParcelizer4 != null) {
                                                                                            i = R.id.view_dark;
                                                                                            View viewIconCompatParcelizer5 = getApplicationIcon.IconCompatParcelizer(view, R.id.view_dark);
                                                                                            if (viewIconCompatParcelizer5 != null) {
                                                                                                return new getResult((ConstraintLayout) view, constraintLayout, viewIconCompatParcelizer, textView, cardView, viewIconCompatParcelizer2, frameLayout, imageView, imageView2, imageView3, linearLayout, linearLayout2, getadjustedmetadataWrite, recyclerView, maxHeightRecyclerView, switchMaterial, tabLayout, materialToolbar, textView2, textView3, cardView2, viewIconCompatParcelizer4, viewIconCompatParcelizer5);
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
