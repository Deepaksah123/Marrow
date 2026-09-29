package kotlin;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class PolymorphicTypeValidatorBase {
    public final Surface AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int read;

    public PolymorphicTypeValidatorBase(Surface surface, int i, int i2) {
        this(surface, i, i2, (byte) 0);
    }

    private PolymorphicTypeValidatorBase(Surface surface, int i, int i2, byte b) {
        buildTypeSerializer.write(true, (Object) "orientationDegrees must be 0, 90, 180, or 270");
        this.AudioAttributesCompatParcelizer = surface;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.read = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolymorphicTypeValidatorBase)) {
            return false;
        }
        PolymorphicTypeValidatorBase polymorphicTypeValidatorBase = (PolymorphicTypeValidatorBase) obj;
        return this.RemoteActionCompatParcelizer == polymorphicTypeValidatorBase.RemoteActionCompatParcelizer && this.IconCompatParcelizer == polymorphicTypeValidatorBase.IconCompatParcelizer && this.read == polymorphicTypeValidatorBase.read && this.AudioAttributesCompatParcelizer.equals(polymorphicTypeValidatorBase.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        return (((((iHashCode * 31) + this.RemoteActionCompatParcelizer) * 31) + this.IconCompatParcelizer) * 31) + this.read;
    }
}
