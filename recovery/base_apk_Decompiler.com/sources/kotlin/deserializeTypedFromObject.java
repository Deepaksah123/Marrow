package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class deserializeTypedFromObject {
    public static final deserializeTypedFromObject read = new deserializeTypedFromObject();
    public final int AudioAttributesCompatParcelizer;
    public final float IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int write;

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
    }

    private deserializeTypedFromObject() {
        this(0, 0, 0, 1.0f);
    }

    public deserializeTypedFromObject(int i, int i2, int i3, float f) {
        this.write = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = i3;
        this.IconCompatParcelizer = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deserializeTypedFromObject)) {
            return false;
        }
        deserializeTypedFromObject deserializetypedfromobject = (deserializeTypedFromObject) obj;
        return this.write == deserializetypedfromobject.write && this.AudioAttributesCompatParcelizer == deserializetypedfromobject.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == deserializetypedfromobject.RemoteActionCompatParcelizer && this.IconCompatParcelizer == deserializetypedfromobject.IconCompatParcelizer;
    }

    public final int hashCode() {
        int i = this.write;
        return ((((((i + 217) * 31) + this.AudioAttributesCompatParcelizer) * 31) + this.RemoteActionCompatParcelizer) * 31) + Float.floatToRawIntBits(this.IconCompatParcelizer);
    }
}
