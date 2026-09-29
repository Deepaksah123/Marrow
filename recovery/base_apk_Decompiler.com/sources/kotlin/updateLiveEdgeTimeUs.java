package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class updateLiveEdgeTimeUs implements getApplicationLabel {
    public final Button AudioAttributesCompatParcelizer;
    public final RecyclerView AudioAttributesImplApi21Parcelizer;
    public final LinearLayout AudioAttributesImplApi26Parcelizer;
    public final ScrollView AudioAttributesImplBaseParcelizer;
    public final LinearLayout IconCompatParcelizer;
    public final TextView MediaBrowserCompatCustomActionResultReceiver;
    public final MaterialButton MediaBrowserCompatItemReceiver;
    public final HlsMediaPlaylistServerControl MediaBrowserCompatMediaItem;
    public final TextView MediaBrowserCompatSearchResultReceiver;
    private final FrameLayout MediaDescriptionCompat;
    public final HlsMediaPlaylistSegmentBase MediaMetadataCompat;
    private TextView RatingCompat;
    public final ImageButton RemoteActionCompatParcelizer;
    public final LottieAnimationView read;
    public final CardView write;

    private updateLiveEdgeTimeUs(FrameLayout frameLayout, LottieAnimationView lottieAnimationView, ImageButton imageButton, Button button, CardView cardView, LinearLayout linearLayout, LinearLayout linearLayout2, ScrollView scrollView, MaterialButton materialButton, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, HlsMediaPlaylistSegmentBase hlsMediaPlaylistSegmentBase, HlsMediaPlaylistServerControl hlsMediaPlaylistServerControl) {
        this.MediaDescriptionCompat = frameLayout;
        this.read = lottieAnimationView;
        this.RemoteActionCompatParcelizer = imageButton;
        this.AudioAttributesCompatParcelizer = button;
        this.write = cardView;
        this.IconCompatParcelizer = linearLayout;
        this.AudioAttributesImplApi26Parcelizer = linearLayout2;
        this.AudioAttributesImplBaseParcelizer = scrollView;
        this.MediaBrowserCompatItemReceiver = materialButton;
        this.AudioAttributesImplApi21Parcelizer = recyclerView;
        this.MediaBrowserCompatCustomActionResultReceiver = textView;
        this.RatingCompat = textView2;
        this.MediaBrowserCompatSearchResultReceiver = textView3;
        this.MediaMetadataCompat = hlsMediaPlaylistSegmentBase;
        this.MediaBrowserCompatMediaItem = hlsMediaPlaylistServerControl;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public static updateLiveEdgeTimeUs IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AudioAttributesCompatParcelizer(layoutInflater.inflate(R.layout.fragment_magic_module_done, viewGroup, false));
    }

    private static updateLiveEdgeTimeUs AudioAttributesCompatParcelizer(View view) {
        int i = R.id.animCompletedTick;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.animCompletedTick);
        if (lottieAnimationView != null) {
            i = R.id.btnClose;
            ImageButton imageButton = (ImageButton) getApplicationIcon.IconCompatParcelizer(view, R.id.btnClose);
            if (imageButton != null) {
                i = R.id.btnReviewModule;
                Button button = (Button) getApplicationIcon.IconCompatParcelizer(view, R.id.btnReviewModule);
                if (button != null) {
                    i = R.id.card;
                    CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.card);
                    if (cardView != null) {
                        i = R.id.llProgress;
                        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llProgress);
                        if (linearLayout != null) {
                            i = R.id.llUpperContainer;
                            LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.llUpperContainer);
                            if (linearLayout2 != null) {
                                i = R.id.mainScrollableContainer;
                                ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.mainScrollableContainer);
                                if (scrollView != null) {
                                    i = R.id.rateReview;
                                    MaterialButton materialButton = (MaterialButton) getApplicationIcon.IconCompatParcelizer(view, R.id.rateReview);
                                    if (materialButton != null) {
                                        i = R.id.rvModuleProgress;
                                        RecyclerView recyclerView = (RecyclerView) getApplicationIcon.IconCompatParcelizer(view, R.id.rvModuleProgress);
                                        if (recyclerView != null) {
                                            i = R.id.tvMcqCount;
                                            TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvMcqCount);
                                            if (textView != null) {
                                                i = R.id.tvModuleStatus;
                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvModuleStatus);
                                                if (textView2 != null) {
                                                    i = R.id.tvPerformanceHeader;
                                                    TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPerformanceHeader);
                                                    if (textView3 != null) {
                                                        i = R.id.viewModuleScore;
                                                        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.viewModuleScore);
                                                        if (viewIconCompatParcelizer != null) {
                                                            HlsMediaPlaylistSegmentBase hlsMediaPlaylistSegmentBaseWrite = HlsMediaPlaylistSegmentBase.write(viewIconCompatParcelizer);
                                                            i = R.id.viewModuleStats;
                                                            View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.viewModuleStats);
                                                            if (viewIconCompatParcelizer2 != null) {
                                                                return new updateLiveEdgeTimeUs((FrameLayout) view, lottieAnimationView, imageButton, button, cardView, linearLayout, linearLayout2, scrollView, materialButton, recyclerView, textView, textView2, textView3, hlsMediaPlaylistSegmentBaseWrite, HlsMediaPlaylistServerControl.RemoteActionCompatParcelizer(viewIconCompatParcelizer2));
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
