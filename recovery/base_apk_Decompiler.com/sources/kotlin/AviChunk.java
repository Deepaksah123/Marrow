package kotlin;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes5.dex */
public final class AviChunk extends AviExtractor {
    private SideSheetBehavior<? extends View> write;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final boolean AudioAttributesCompatParcelizer(float f) {
        return f > BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int write() {
        return 1;
    }

    public AviChunk(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.write = sideSheetBehavior;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int IconCompatParcelizer() {
        return (-this.write.AudioAttributesCompatParcelizer()) - this.write.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int read() {
        return Math.max(0, this.write.AudioAttributesImplApi26Parcelizer() + this.write.MediaBrowserCompatCustomActionResultReceiver());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final boolean AudioAttributesCompatParcelizer(View view) {
        return view.getRight() < (read() - IconCompatParcelizer()) / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final boolean read(float f, float f2) {
        return parseHdrlBody.read(f, f2) && Math.abs(f) > 500.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final boolean RemoteActionCompatParcelizer(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.write.AudioAttributesImplBaseParcelizer())) > 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final <V extends View> int IconCompatParcelizer(V v) {
        return v.getRight() + this.write.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final float write(int i) {
        float fIconCompatParcelizer = IconCompatParcelizer();
        return (i - fIconCompatParcelizer) / (read() - fIconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final void IconCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.write.MediaBrowserCompatItemReceiver()) {
            marginLayoutParams.leftMargin = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final void write(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int read(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // kotlin.AviExtractor
    public final int AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int RemoteActionCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int AudioAttributesCompatParcelizer() {
        return -this.write.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int RemoteActionCompatParcelizer() {
        return this.write.MediaBrowserCompatCustomActionResultReceiver();
    }
}
