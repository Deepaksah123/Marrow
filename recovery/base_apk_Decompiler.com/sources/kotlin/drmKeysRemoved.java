package kotlin;

import kotlin.drmSessionManagerError;

/* JADX INFO: loaded from: classes2.dex */
public final class drmKeysRemoved extends drmSessionManagerError.read {
    private static drmSessionManagerError<drmKeysRemoved> write;
    public double IconCompatParcelizer = 0.0d;
    public double AudioAttributesCompatParcelizer = 0.0d;

    static {
        drmSessionManagerError<drmKeysRemoved> drmsessionmanagererrorIconCompatParcelizer = drmSessionManagerError.IconCompatParcelizer(64, new drmKeysRemoved());
        write = drmsessionmanagererrorIconCompatParcelizer;
        drmsessionmanagererrorIconCompatParcelizer.IconCompatParcelizer();
    }

    public static drmKeysRemoved read(double d, double d2) {
        drmKeysRemoved drmkeysremoved = (drmKeysRemoved) write.write();
        drmkeysremoved.IconCompatParcelizer = d;
        drmkeysremoved.AudioAttributesCompatParcelizer = d2;
        return drmkeysremoved;
    }

    public static void IconCompatParcelizer(drmKeysRemoved drmkeysremoved) {
        write.AudioAttributesCompatParcelizer(drmkeysremoved);
    }

    @Override // o.drmSessionManagerError.read
    protected final drmSessionManagerError.read RemoteActionCompatParcelizer() {
        return new drmKeysRemoved();
    }

    private drmKeysRemoved() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MPPointD, x: ");
        sb.append(this.IconCompatParcelizer);
        sb.append(", y: ");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }
}
