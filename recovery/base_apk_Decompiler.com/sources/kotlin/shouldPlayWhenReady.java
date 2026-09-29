package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class shouldPlayWhenReady extends setShuffleModeEnabledInternal {
    @Override // kotlin.setShuffleModeEnabledInternal
    final void IconCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
    }

    shouldPlayWhenReady(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, stopRenderers stoprenderers) {
        super(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }
}
