package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultBaseTypeLimitingValidatorUnsafeBaseTypes {
    public static final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes write = new DefaultBaseTypeLimitingValidatorUnsafeBaseTypes();
    public final float AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
    }

    private DefaultBaseTypeLimitingValidatorUnsafeBaseTypes() {
        this(1.0f, 1.0f);
    }

    public DefaultBaseTypeLimitingValidatorUnsafeBaseTypes(float f, float f2) {
        buildTypeSerializer.IconCompatParcelizer(f > BitmapDescriptorFactory.HUE_RED);
        buildTypeSerializer.IconCompatParcelizer(f2 > BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.IconCompatParcelizer = Math.round(f * 1000.0f);
    }

    public final long AudioAttributesCompatParcelizer(long j) {
        return j * ((long) this.IconCompatParcelizer);
    }

    public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes RemoteActionCompatParcelizer(float f) {
        return new DefaultBaseTypeLimitingValidatorUnsafeBaseTypes(f, this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes = (DefaultBaseTypeLimitingValidatorUnsafeBaseTypes) obj;
        return this.AudioAttributesCompatParcelizer == defaultBaseTypeLimitingValidatorUnsafeBaseTypes.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == defaultBaseTypeLimitingValidatorUnsafeBaseTypes.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.AudioAttributesCompatParcelizer) + 527) * 31) + Float.floatToRawIntBits(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        return LaissezFaireSubTypeValidator.read("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.AudioAttributesCompatParcelizer), Float.valueOf(this.RemoteActionCompatParcelizer));
    }
}
