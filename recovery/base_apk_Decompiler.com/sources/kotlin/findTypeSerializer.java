package kotlin;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\t\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/findTypeSerializer;", "Lo/findTypedValueSerializer;", "<init>", "()V", "Landroid/view/View;", "p0", "Lo/resetWithShared;", "p1", "", "AudioAttributesCompatParcelizer", "(Landroid/view/View;[F)V", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "IconCompatParcelizer", "", "write", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findTypeSerializer implements findTypedValueSerializer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Matrix IconCompatParcelizer = new Matrix();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int[] AudioAttributesCompatParcelizer = new int[2];

    @Override // kotlin.findTypedValueSerializer
    public final void AudioAttributesCompatParcelizer(View p0, float[] p1) {
        this.IconCompatParcelizer.reset();
        p0.transformMatrixToGlobal(this.IconCompatParcelizer);
        ViewParent parent = p0.getParent();
        while (parent instanceof View) {
            p0 = parent;
            parent = p0.getParent();
        }
        p0.getLocationOnScreen(this.AudioAttributesCompatParcelizer);
        int[] iArr = this.AudioAttributesCompatParcelizer;
        int i = iArr[0];
        int i2 = iArr[1];
        p0.getLocationInWindow(iArr);
        int[] iArr2 = this.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        appendThreeBytes.AudioAttributesCompatParcelizer(p1, this.IconCompatParcelizer);
    }
}
