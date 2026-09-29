package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public interface UUIDSerializer {

    public interface RemoteActionCompatParcelizer<T extends UUIDSerializer> {
        void RemoteActionCompatParcelizer(T t);
    }

    long AudioAttributesCompatParcelizer();

    boolean IconCompatParcelizer();

    void RemoteActionCompatParcelizer(long j);

    boolean RemoteActionCompatParcelizer(_put _putVar);

    long read();
}
