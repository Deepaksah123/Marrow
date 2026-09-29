package kotlin;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes5.dex */
public final class AmrExtractorExternalSyntheticLambda0 extends AviExtractor {
    private SideSheetBehavior<? extends View> read;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final boolean AudioAttributesCompatParcelizer(float f) {
        return f < BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int write() {
        return 0;
    }

    public AmrExtractorExternalSyntheticLambda0(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.read = sideSheetBehavior;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int IconCompatParcelizer() {
        return this.read.MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int read() {
        return Math.max(0, (IconCompatParcelizer() - this.read.AudioAttributesCompatParcelizer()) - this.read.MediaBrowserCompatCustomActionResultReceiver());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final boolean AudioAttributesCompatParcelizer(View view) {
        return view.getLeft() > (IconCompatParcelizer() + read()) / 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final boolean read(float f, float f2) {
        return parseHdrlBody.read(f, f2) && Math.abs(f) > 500.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final boolean RemoteActionCompatParcelizer(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.read.AudioAttributesImplBaseParcelizer())) > 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final <V extends View> int IconCompatParcelizer(V v) {
        return v.getLeft() - this.read.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final float write(int i) {
        float fIconCompatParcelizer = IconCompatParcelizer();
        return (fIconCompatParcelizer - i) / (fIconCompatParcelizer - read());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final void IconCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int iMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
        if (i <= iMediaBrowserCompatItemReceiver) {
            marginLayoutParams.rightMargin = iMediaBrowserCompatItemReceiver - i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final void write(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int read(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // kotlin.AviExtractor
    public final int AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int RemoteActionCompatParcelizer(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int AudioAttributesCompatParcelizer() {
        return read();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // kotlin.AviExtractor
    public final int RemoteActionCompatParcelizer() {
        return this.read.MediaBrowserCompatItemReceiver();
    }
}
