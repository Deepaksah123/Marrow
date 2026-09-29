package kotlin;

import android.graphics.Paint;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/findCreatorBinding;", "Landroid/graphics/Paint$Join;", "read", "(I)Landroid/graphics/Paint$Join;", "Lo/findAutoDetectVisibility;", "Landroid/graphics/Paint$Cap;", "RemoteActionCompatParcelizer", "(I)Landroid/graphics/Paint$Cap;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _deserializeFromNonArray {
    public static final Paint.Join read(int i) {
        return findCreatorBinding.IconCompatParcelizer(i, findCreatorBinding.INSTANCE.RemoteActionCompatParcelizer()) ? Paint.Join.MITER : findCreatorBinding.IconCompatParcelizer(i, findCreatorBinding.INSTANCE.AudioAttributesCompatParcelizer()) ? Paint.Join.ROUND : findCreatorBinding.IconCompatParcelizer(i, findCreatorBinding.INSTANCE.read()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }

    public static final Paint.Cap RemoteActionCompatParcelizer(int i) {
        return findAutoDetectVisibility.AudioAttributesCompatParcelizer(i, findAutoDetectVisibility.INSTANCE.read()) ? Paint.Cap.BUTT : findAutoDetectVisibility.AudioAttributesCompatParcelizer(i, findAutoDetectVisibility.INSTANCE.RemoteActionCompatParcelizer()) ? Paint.Cap.ROUND : findAutoDetectVisibility.AudioAttributesCompatParcelizer(i, findAutoDetectVisibility.INSTANCE.IconCompatParcelizer()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }
}
