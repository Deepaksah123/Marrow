package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class isNotProvisionedException<T> {
    public abstract DrmUtilApi21 RemoteActionCompatParcelizer();

    public abstract Integer read();

    public abstract T write();

    public static <T> isNotProvisionedException<T> AudioAttributesCompatParcelizer(T t) {
        return new DrmSessionManagerProvider(t, DrmUtilApi21.DEFAULT);
    }

    public static <T> isNotProvisionedException<T> write(T t) {
        return new DrmSessionManagerProvider(t, DrmUtilApi21.HIGHEST);
    }
}
