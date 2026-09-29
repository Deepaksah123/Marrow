package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsChunkSourceHlsChunkHolder implements getApplicationLabel {
    public final ConstraintLayout AudioAttributesCompatParcelizer;
    private ProgressBar AudioAttributesImplApi21Parcelizer;
    private final FrameLayout AudioAttributesImplApi26Parcelizer;
    public final LottieAnimationView AudioAttributesImplBaseParcelizer;
    public final HlsChunkSourceHlsMediaPlaylistSegmentIterator IconCompatParcelizer;
    private View MediaBrowserCompatCustomActionResultReceiver;
    private TextView MediaBrowserCompatItemReceiver;
    public final ScrollView RemoteActionCompatParcelizer;
    public final ImageView read;
    public final ConstraintLayout write;

    private HlsChunkSourceHlsChunkHolder(FrameLayout frameLayout, View view, ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, HlsChunkSourceHlsMediaPlaylistSegmentIterator hlsChunkSourceHlsMediaPlaylistSegmentIterator, ProgressBar progressBar, TextView textView, ScrollView scrollView, LottieAnimationView lottieAnimationView) {
        this.AudioAttributesImplApi26Parcelizer = frameLayout;
        this.MediaBrowserCompatCustomActionResultReceiver = view;
        this.AudioAttributesCompatParcelizer = constraintLayout;
        this.read = imageView;
        this.write = constraintLayout2;
        this.IconCompatParcelizer = hlsChunkSourceHlsMediaPlaylistSegmentIterator;
        this.AudioAttributesImplApi21Parcelizer = progressBar;
        this.MediaBrowserCompatItemReceiver = textView;
        this.RemoteActionCompatParcelizer = scrollView;
        this.AudioAttributesImplBaseParcelizer = lottieAnimationView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static HlsChunkSourceHlsChunkHolder IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_payment_done_start, viewGroup, false));
    }

    private static HlsChunkSourceHlsChunkHolder write(View view) {
        int i = R.id.background;
        View viewIconCompatParcelizer = getApplicationIcon.IconCompatParcelizer(view, R.id.background);
        if (viewIconCompatParcelizer != null) {
            i = R.id.clLoader;
            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.clLoader);
            if (constraintLayout != null) {
                i = R.id.close_image_view;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.close_image_view);
                if (imageView != null) {
                    i = R.id.main_const;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.main_const);
                    if (constraintLayout2 != null) {
                        i = R.id.payment_footer;
                        View viewIconCompatParcelizer2 = getApplicationIcon.IconCompatParcelizer(view, R.id.payment_footer);
                        if (viewIconCompatParcelizer2 != null) {
                            HlsChunkSourceHlsMediaPlaylistSegmentIterator hlsChunkSourceHlsMediaPlaylistSegmentIteratorRemoteActionCompatParcelizer = HlsChunkSourceHlsMediaPlaylistSegmentIterator.RemoteActionCompatParcelizer(viewIconCompatParcelizer2);
                            i = R.id.pbLoader;
                            ProgressBar progressBar = (ProgressBar) getApplicationIcon.IconCompatParcelizer(view, R.id.pbLoader);
                            if (progressBar != null) {
                                i = R.id.pro_text;
                                TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.pro_text);
                                if (textView != null) {
                                    i = R.id.scroll_root;
                                    ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scroll_root);
                                    if (scrollView != null) {
                                        i = R.id.tick_anim;
                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) getApplicationIcon.IconCompatParcelizer(view, R.id.tick_anim);
                                        if (lottieAnimationView != null) {
                                            return new HlsChunkSourceHlsChunkHolder((FrameLayout) view, viewIconCompatParcelizer, constraintLayout, imageView, constraintLayout2, hlsChunkSourceHlsMediaPlaylistSegmentIteratorRemoteActionCompatParcelizer, progressBar, textView, scrollView, lottieAnimationView);
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
