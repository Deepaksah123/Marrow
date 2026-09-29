package kotlin;

import android.util.Base64;
import kotlin.ExoMediaDrmKeyRequestRequestType;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ExoMediaDrmProvider {

    public static abstract class RemoteActionCompatParcelizer {
        public abstract RemoteActionCompatParcelizer RemoteActionCompatParcelizer(byte[] bArr);

        public abstract ExoMediaDrmProvider RemoteActionCompatParcelizer();

        public abstract RemoteActionCompatParcelizer read(DrmUtilApi21 drmUtilApi21);

        public abstract RemoteActionCompatParcelizer write(String str);
    }

    public abstract DrmUtilApi21 AudioAttributesCompatParcelizer();

    public abstract String RemoteActionCompatParcelizer();

    public abstract byte[] write();

    public final boolean IconCompatParcelizer() {
        return write() != null;
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", RemoteActionCompatParcelizer(), AudioAttributesCompatParcelizer(), write() == null ? "" : Base64.encodeToString(write(), 2));
    }

    public static RemoteActionCompatParcelizer read() {
        return new ExoMediaDrmKeyRequestRequestType.RemoteActionCompatParcelizer().read(DrmUtilApi21.DEFAULT);
    }

    public final ExoMediaDrmProvider IconCompatParcelizer(DrmUtilApi21 drmUtilApi21) {
        return read().write(RemoteActionCompatParcelizer()).read(drmUtilApi21).RemoteActionCompatParcelizer(write()).RemoteActionCompatParcelizer();
    }
}
