package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class setExtractorFactory implements getApplicationLabel {
    private LinearLayout AudioAttributesCompatParcelizer;
    private final LinearLayout IconCompatParcelizer;
    public final ImageView write;

    private setExtractorFactory(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2) {
        this.IconCompatParcelizer = linearLayout;
        this.write = imageView;
        this.AudioAttributesCompatParcelizer = linearLayout2;
    }

    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final LinearLayout IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static setExtractorFactory AudioAttributesCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return write(layoutInflater.inflate(R.layout.item_notes_plan_carousel_image, viewGroup, false));
    }

    private static setExtractorFactory write(View view) {
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.carousel_image);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new setExtractorFactory(linearLayout, imageView, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.carousel_image)));
    }
}
