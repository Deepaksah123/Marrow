package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public abstract class readFlvHeader {

    public static abstract class RemoteActionCompatParcelizer {
        public abstract readFlvHeader read();

        public abstract RemoteActionCompatParcelizer write();
    }

    private static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
        EbmlReader ebmlReader = new EbmlReader();
        ebmlReader.IconCompatParcelizer(i);
        ebmlReader.write();
        return ebmlReader;
    }

    public static readFlvHeader IconCompatParcelizer(int i) {
        return AudioAttributesCompatParcelizer(0).read();
    }

    public abstract int AudioAttributesCompatParcelizer();

    public abstract boolean RemoteActionCompatParcelizer();
}
