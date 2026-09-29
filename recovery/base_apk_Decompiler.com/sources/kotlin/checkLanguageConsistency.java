package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class checkLanguageConsistency {
    public static final boolean read(int i) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{1535, 1537, 4102, 4103, 4101, 4104}).contains(Integer.valueOf(i));
    }

    public static final boolean AudioAttributesCompatParcelizer(int i) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{4102, 4103, 4104, 1537}).contains(Integer.valueOf(i));
    }

    public static final boolean write(int i) {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{1539, 1522, 1526, 1520}).contains(Integer.valueOf(i));
    }
}
