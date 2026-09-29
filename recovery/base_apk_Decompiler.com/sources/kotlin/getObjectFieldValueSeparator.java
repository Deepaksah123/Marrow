package kotlin;

import android.graphics.ColorSpace;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getObjectFieldValueSeparator;", "", "<init>", "()V", "Lo/findImplicitPropertyName;", "p0", "Landroid/graphics/ColorSpace;", "AudioAttributesCompatParcelizer", "(Lo/findImplicitPropertyName;)Landroid/graphics/ColorSpace;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getObjectFieldValueSeparator {
    public static final getObjectFieldValueSeparator INSTANCE = new getObjectFieldValueSeparator();

    private getObjectFieldValueSeparator() {
    }

    @getMagicModuleMeta
    public static final ColorSpace AudioAttributesCompatParcelizer(findImplicitPropertyName p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, findFilterId.INSTANCE.IconCompatParcelizer())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, findFilterId.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
