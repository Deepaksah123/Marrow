package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import com.marrow2.ui.video.notes.custom_view.ZoomableRecyclerViewV2;

/* JADX INFO: loaded from: classes3.dex */
public final class deriveOverridingDrmInitData implements getApplicationLabel {
    public final LinearLayout AudioAttributesCompatParcelizer;
    private final FrameLayout AudioAttributesImplApi26Parcelizer;
    public final CustomTextView IconCompatParcelizer;
    public final ImageView RemoteActionCompatParcelizer;
    public final ZoomableRecyclerViewV2 read;
    public final CustomTextView write;

    private deriveOverridingDrmInitData(FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, ZoomableRecyclerViewV2 zoomableRecyclerViewV2, CustomTextView customTextView, CustomTextView customTextView2) {
        this.AudioAttributesImplApi26Parcelizer = frameLayout;
        this.RemoteActionCompatParcelizer = imageView;
        this.AudioAttributesCompatParcelizer = linearLayout;
        this.read = zoomableRecyclerViewV2;
        this.IconCompatParcelizer = customTextView;
        this.write = customTextView2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final FrameLayout IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public static deriveOverridingDrmInitData RemoteActionCompatParcelizer(View view) {
        int i = R.id.feedbackBtn;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.feedbackBtn);
        if (imageView != null) {
            i = R.id.progressContainer;
            LinearLayout linearLayout = (LinearLayout) getApplicationIcon.IconCompatParcelizer(view, R.id.progressContainer);
            if (linearLayout != null) {
                i = R.id.rlSlides;
                ZoomableRecyclerViewV2 zoomableRecyclerViewV2 = (ZoomableRecyclerViewV2) getApplicationIcon.IconCompatParcelizer(view, R.id.rlSlides);
                if (zoomableRecyclerViewV2 != null) {
                    i = R.id.tvLoadingNotes;
                    CustomTextView customTextView = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvLoadingNotes);
                    if (customTextView != null) {
                        i = R.id.tvNoSlides;
                        CustomTextView customTextView2 = (CustomTextView) getApplicationIcon.IconCompatParcelizer(view, R.id.tvNoSlides);
                        if (customTextView2 != null) {
                            return new deriveOverridingDrmInitData((FrameLayout) view, imageView, linearLayout, zoomableRecyclerViewV2, customTextView, customTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
