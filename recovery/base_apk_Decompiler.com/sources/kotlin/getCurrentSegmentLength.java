package kotlin;

import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/setCurrentLength;", "Landroid/graphics/PathEffect;", "read", "(Lo/setCurrentLength;)Landroid/graphics/PathEffect;", "", "p0", "", "p1", "AudioAttributesCompatParcelizer", "([FF)Lo/setCurrentLength;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getCurrentSegmentLength {
    public static final PathEffect read(setCurrentLength setcurrentlength) {
        toMagicModuleMetaRepoModel.read(setcurrentlength, "");
        return ((finishCurrentSegment) setcurrentlength).getIconCompatParcelizer();
    }

    public static final setCurrentLength AudioAttributesCompatParcelizer(float[] fArr, float f) {
        return new finishCurrentSegment(new DashPathEffect(fArr, f));
    }
}
