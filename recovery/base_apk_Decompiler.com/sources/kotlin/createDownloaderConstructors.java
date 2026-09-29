package kotlin;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class createDownloaderConstructors extends getCount {
    private final Object write;

    public createDownloaderConstructors(Boolean bool) {
        this.write = Objects.requireNonNull(bool);
    }

    public createDownloaderConstructors(Number number) {
        this.write = Objects.requireNonNull(number);
    }

    public createDownloaderConstructors(String str) {
        this.write = Objects.requireNonNull(str);
    }

    public final boolean RatingCompat() {
        return this.write instanceof Boolean;
    }

    @Override // kotlin.getCount
    public final boolean read() {
        if (RatingCompat()) {
            return ((Boolean) this.write).booleanValue();
        }
        return Boolean.parseBoolean(AudioAttributesImplApi26Parcelizer());
    }

    public final boolean MediaDescriptionCompat() {
        return this.write instanceof Number;
    }

    @Override // kotlin.getCount
    public final Number write() {
        Object obj = this.write;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new addTrackSelectionInternal((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.write instanceof String;
    }

    @Override // kotlin.getCount
    public final String AudioAttributesImplApi26Parcelizer() {
        Object obj = this.write;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (MediaDescriptionCompat()) {
            return write().toString();
        }
        if (RatingCompat()) {
            return ((Boolean) this.write).toString();
        }
        StringBuilder sb = new StringBuilder("Unexpected value type: ");
        sb.append(this.write.getClass());
        throw new AssertionError(sb.toString());
    }

    @Override // kotlin.getCount
    public final double AudioAttributesCompatParcelizer() {
        return MediaDescriptionCompat() ? write().doubleValue() : Double.parseDouble(AudioAttributesImplApi26Parcelizer());
    }

    @Override // kotlin.getCount
    public final long RemoteActionCompatParcelizer() {
        return MediaDescriptionCompat() ? write().longValue() : Long.parseLong(AudioAttributesImplApi26Parcelizer());
    }

    @Override // kotlin.getCount
    public final int IconCompatParcelizer() {
        return MediaDescriptionCompat() ? write().intValue() : Integer.parseInt(AudioAttributesImplApi26Parcelizer());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        if (this.write == null) {
            return 31;
        }
        if (read(this)) {
            jDoubleToLongBits = write().longValue();
        } else {
            Object obj = this.write;
            if (obj instanceof Number) {
                jDoubleToLongBits = Double.doubleToLongBits(write().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        createDownloaderConstructors createdownloaderconstructors = (createDownloaderConstructors) obj;
        if (this.write == null) {
            return createdownloaderconstructors.write == null;
        }
        if (read(this) && read(createdownloaderconstructors)) {
            return write().longValue() == createdownloaderconstructors.write().longValue();
        }
        Object obj2 = this.write;
        if ((obj2 instanceof Number) && (createdownloaderconstructors.write instanceof Number)) {
            double dDoubleValue = write().doubleValue();
            double dDoubleValue2 = createdownloaderconstructors.write().doubleValue();
            return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
        }
        return obj2.equals(createdownloaderconstructors.write);
    }

    private static boolean read(createDownloaderConstructors createdownloaderconstructors) {
        Object obj = createdownloaderconstructors.write;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }
}
