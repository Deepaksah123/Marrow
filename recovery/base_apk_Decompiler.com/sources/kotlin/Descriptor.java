package kotlin;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class Descriptor implements getApplicationLabel {
    private Guideline AudioAttributesCompatParcelizer;
    public final ImageView IconCompatParcelizer;
    private final ConstraintLayout read;
    public final ImageView write;

    private Descriptor(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, Guideline guideline) {
        this.read = constraintLayout;
        this.write = imageView;
        this.IconCompatParcelizer = imageView2;
        this.AudioAttributesCompatParcelizer = guideline;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getApplicationLabel
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout IconCompatParcelizer() {
        return this.read;
    }

    public static Descriptor AudioAttributesCompatParcelizer(View view) {
        int i = R.id.activity_sync_indicator;
        ImageView imageView = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.activity_sync_indicator);
        if (imageView != null) {
            i = R.id.activity_sync_indicator_bg;
            ImageView imageView2 = (ImageView) getApplicationIcon.IconCompatParcelizer(view, R.id.activity_sync_indicator_bg);
            if (imageView2 != null) {
                i = R.id.guideline;
                Guideline guideline = (Guideline) getApplicationIcon.IconCompatParcelizer(view, R.id.guideline);
                if (guideline != null) {
                    return new Descriptor((ConstraintLayout) view, imageView, imageView2, guideline);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
