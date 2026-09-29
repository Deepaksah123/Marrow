package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class buildClippingProperties implements MediaItemClippingConfiguration<int[]> {
    @Override // kotlin.MediaItemClippingConfiguration
    public final int RemoteActionCompatParcelizer() {
        return 4;
    }

    @Override // kotlin.MediaItemClippingConfiguration
    public final /* synthetic */ int[] AudioAttributesCompatParcelizer(int i) {
        return IconCompatParcelizer(i);
    }

    @Override // kotlin.MediaItemClippingConfiguration
    public final /* synthetic */ int IconCompatParcelizer(int[] iArr) {
        return RemoteActionCompatParcelizer(iArr);
    }

    @Override // kotlin.MediaItemClippingConfiguration
    public final String AudioAttributesCompatParcelizer() {
        return "IntegerArrayPool";
    }

    private static int RemoteActionCompatParcelizer(int[] iArr) {
        return iArr.length;
    }

    private static int[] IconCompatParcelizer(int i) {
        return new int[i];
    }
}
