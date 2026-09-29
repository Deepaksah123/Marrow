package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsChunkSourceEncryptionKeyChunk implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    public final TextView AudioAttributesImplApi21Parcelizer;
    public final FrameLayout AudioAttributesImplApi26Parcelizer;
    public final TextView AudioAttributesImplBaseParcelizer;
    public final TextView IconCompatParcelizer;
    public final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
    public final TextView MediaBrowserCompatItemReceiver;
    private LinearLayout MediaBrowserCompatMediaItem;
    private FrameLayout MediaBrowserCompatSearchResultReceiver;
    private ScrollView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final CardView MediaDescriptionCompat;
    private ImageView MediaMetadataCompat;
    public final TextView RatingCompat;
    public final RelativeLayout RemoteActionCompatParcelizer;
    private final LinearLayout onCommand;
    public final ConstraintLayout read;
    public final ImageView write;

    private HlsChunkSourceEncryptionKeyChunk(LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, ImageView imageView, TextView textView, ImageView imageView2, ConstraintLayout constraintLayout, FrameLayout frameLayout, LinearLayout linearLayout3, LinearLayout linearLayout4, ScrollView scrollView, TextView textView2, FrameLayout frameLayout2, TextView textView3, TextView textView4, TextView textView5, CardView cardView) {
        this.onCommand = linearLayout;
        this.MediaBrowserCompatMediaItem = linearLayout2;
        this.RemoteActionCompatParcelizer = relativeLayout;
        this.write = imageView;
        this.IconCompatParcelizer = textView;
        this.MediaMetadataCompat = imageView2;
        this.read = constraintLayout;
        this.MediaBrowserCompatSearchResultReceiver = frameLayout;
        this.AudioAttributesCompatParcelizer = linearLayout3;
        this.MediaBrowserCompatCustomActionResultReceiver = linearLayout4;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = scrollView;
        this.AudioAttributesImplApi21Parcelizer = textView2;
        this.AudioAttributesImplApi26Parcelizer = frameLayout2;
        this.AudioAttributesImplBaseParcelizer = textView3;
        this.MediaBrowserCompatItemReceiver = textView4;
        this.RatingCompat = textView5;
        this.MediaDescriptionCompat = cardView;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.onCommand;
    }

    public static HlsChunkSourceEncryptionKeyChunk AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.fragment_pearl_detail_inner, viewGroup, false));
    }

    private static HlsChunkSourceEncryptionKeyChunk write(View view) {
        int i = R.id.background;
        LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.background);
        if (linearLayout != null) {
            i = R.id.bookmark_container;
            RelativeLayout relativeLayout = (RelativeLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.bookmark_container);
            if (relativeLayout != null) {
                i = R.id.ivBookmarkIcon;
                ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivBookmarkIcon);
                if (imageView != null) {
                    i = R.id.ivReportIcon;
                    TextView textView = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.ivReportIcon);
                    if (textView != null) {
                        i = R.id.marrowLogo;
                        ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.marrowLogo);
                        if (imageView2 != null) {
                            i = R.id.pearlActionContainer;
                            ConstraintLayout constraintLayout = (ConstraintLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.pearlActionContainer);
                            if (constraintLayout != null) {
                                i = R.id.pearl_content_container;
                                FrameLayout frameLayout = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.pearl_content_container);
                                if (frameLayout != null) {
                                    i = R.id.pearlDisplayIdContainer;
                                    LinearLayout linearLayout2 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.pearlDisplayIdContainer);
                                    if (linearLayout2 != null) {
                                        i = R.id.pearl_parent_layout;
                                        LinearLayout linearLayout3 = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.pearl_parent_layout);
                                        if (linearLayout3 != null) {
                                            i = R.id.scroll;
                                            ScrollView scrollView = (ScrollView) getApplicationIcon.IconCompatParcelizer(view, R.id.scroll);
                                            if (scrollView != null) {
                                                i = R.id.share;
                                                TextView textView2 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.share);
                                                if (textView2 != null) {
                                                    i = R.id.shareloadingcontainer;
                                                    FrameLayout frameLayout2 = (FrameLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.shareloadingcontainer);
                                                    if (frameLayout2 != null) {
                                                        i = R.id.tvBookmark;
                                                        TextView textView3 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvBookmark);
                                                        if (textView3 != null) {
                                                            i = R.id.tvPearlDisplayId;
                                                            TextView textView4 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvPearlDisplayId);
                                                            if (textView4 != null) {
                                                                i = R.id.tv_related_mcq;
                                                                TextView textView5 = (TextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tv_related_mcq);
                                                                if (textView5 != null) {
                                                                    i = R.id.tvRelatedMcqCount;
                                                                    CardView cardView = (CardView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvRelatedMcqCount);
                                                                    if (cardView != null) {
                                                                        return new HlsChunkSourceEncryptionKeyChunk((LinearLayout) view, linearLayout, relativeLayout, imageView, textView, imageView2, constraintLayout, frameLayout, linearLayout2, linearLayout3, scrollView, textView2, frameLayout2, textView3, textView4, textView5, cardView);
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
