package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetRenderersFactory16 extends lambdanew14 {
    private final String AudioAttributesCompatParcelizer;

    @Override // kotlin.lambdanew14
    public final /* bridge */ /* synthetic */ lambdanew14 AudioAttributesCompatParcelizer(boolean z) {
        return super.AudioAttributesCompatParcelizer(z);
    }

    @Override // kotlin.lambdanew14
    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer() {
        return super.IconCompatParcelizer();
    }

    public lambdasetRenderersFactory16(String str) {
        super(lambdanew3.UNICODE_STRING);
        this.AudioAttributesCompatParcelizer = str;
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        return str == null ? "null" : str;
    }

    @Override // kotlin.lambdanew14, kotlin.lambdanew10
    public final boolean equals(Object obj) {
        if (!(obj instanceof lambdasetRenderersFactory16) || !super.equals(obj)) {
            return false;
        }
        lambdasetRenderersFactory16 lambdasetrenderersfactory16 = (lambdasetRenderersFactory16) obj;
        String str = this.AudioAttributesCompatParcelizer;
        if (str == null) {
            return lambdasetrenderersfactory16.AudioAttributesCompatParcelizer == null;
        }
        return str.equals(lambdasetrenderersfactory16.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.lambdanew14, kotlin.lambdanew10
    public final int hashCode() {
        if (this.AudioAttributesCompatParcelizer != null) {
            return super.hashCode() + this.AudioAttributesCompatParcelizer.hashCode();
        }
        return 0;
    }
}
