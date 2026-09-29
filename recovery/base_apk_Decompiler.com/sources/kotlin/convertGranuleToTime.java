package kotlin;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* JADX INFO: loaded from: classes3.dex */
public final class convertGranuleToTime {
    private final packetFinished<?> IconCompatParcelizer;
    private final int read;
    private final int write;

    private convertGranuleToTime(Class<?> cls, int i, int i2) {
        this((packetFinished<?>) packetFinished.read(cls), i, i2);
    }

    private convertGranuleToTime(packetFinished<?> packetfinished, int i, int i2) {
        this.IconCompatParcelizer = (packetFinished) skipToNextSync.write(packetfinished, "Null dependency anInterface.");
        this.read = i;
        this.write = i2;
    }

    @Deprecated
    public static convertGranuleToTime RemoteActionCompatParcelizer(Class<?> cls) {
        return new convertGranuleToTime(cls, 0, 0);
    }

    public static convertGranuleToTime IconCompatParcelizer(Class<?> cls) {
        return new convertGranuleToTime(cls, 0, 2);
    }

    public static convertGranuleToTime read(Class<?> cls) {
        return new convertGranuleToTime(cls, 1, 0);
    }

    public static convertGranuleToTime write(packetFinished<?> packetfinished) {
        return new convertGranuleToTime(packetfinished, 1, 0);
    }

    public static convertGranuleToTime MediaBrowserCompatItemReceiver(Class<?> cls) {
        return new convertGranuleToTime(cls, 2, 0);
    }

    public static convertGranuleToTime write(Class<?> cls) {
        return new convertGranuleToTime(cls, 0, 1);
    }

    public static convertGranuleToTime AudioAttributesCompatParcelizer(Class<?> cls) {
        return new convertGranuleToTime(cls, 1, 1);
    }

    public static convertGranuleToTime RemoteActionCompatParcelizer(packetFinished<?> packetfinished) {
        return new convertGranuleToTime(packetfinished, 1, 1);
    }

    public final packetFinished<?> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.read == 1;
    }

    public final boolean read() {
        return this.read == 2;
    }

    public final boolean write() {
        return this.write == 0;
    }

    public final boolean IconCompatParcelizer() {
        return this.write == 2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof convertGranuleToTime)) {
            return false;
        }
        convertGranuleToTime convertgranuletotime = (convertGranuleToTime) obj;
        return this.IconCompatParcelizer.equals(convertgranuletotime.IconCompatParcelizer) && this.read == convertgranuletotime.read && this.write == convertgranuletotime.write;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        return this.write ^ ((((iHashCode ^ 1000003) * 1000003) ^ this.read) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", type=");
        int i = this.read;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(read(this.write));
        sb.append("}");
        return sb.toString();
    }

    private static String read(int i) {
        if (i == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: ".concat(String.valueOf(i)));
    }
}
