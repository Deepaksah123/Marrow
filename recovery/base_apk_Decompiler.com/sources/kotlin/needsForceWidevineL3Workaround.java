package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public abstract class needsForceWidevineL3Workaround {

    public enum write {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public abstract write AudioAttributesCompatParcelizer();

    public abstract long RemoteActionCompatParcelizer();

    public static needsForceWidevineL3Workaround write() {
        return new forceWidevineL3(write.TRANSIENT_ERROR, -1L);
    }

    public static needsForceWidevineL3Workaround IconCompatParcelizer() {
        return new forceWidevineL3(write.FATAL_ERROR, -1L);
    }

    public static needsForceWidevineL3Workaround read() {
        return new forceWidevineL3(write.INVALID_PAYLOAD, -1L);
    }

    public static needsForceWidevineL3Workaround read(long j) {
        return new forceWidevineL3(write.OK, j);
    }
}
