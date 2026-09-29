package kotlin;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.marrow.R;
import uk.co.senab.photoview.PhotoView;

/* JADX INFO: loaded from: classes3.dex */
public final class parseMediaPresentationDescription implements getApplicationLabel {
    public final PhotoView IconCompatParcelizer;
    public final ImageView RemoteActionCompatParcelizer;
    private final FrameLayout read;

    private parseMediaPresentationDescription(FrameLayout frameLayout, ImageView imageView, PhotoView photoView) {
        this.read = frameLayout;
        this.RemoteActionCompatParcelizer = imageView;
        this.IconCompatParcelizer = photoView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public FrameLayout IconCompatParcelizer() {
        return this.read;
    }

    public static parseMediaPresentationDescription read(View view) {
        int i = R.id.close_image_view;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.close_image_view);
        if (imageView != null) {
            i = R.id.imageView;
            PhotoView photoView = (PhotoView) getApplicationIcon.IconCompatParcelizer(view, R.id.imageView);
            if (photoView != null) {
                return new parseMediaPresentationDescription((FrameLayout) view, imageView, photoView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
