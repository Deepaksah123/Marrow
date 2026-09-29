package kotlin;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdanew13 extends lambdanew14 {
    private final byte[] AudioAttributesCompatParcelizer;

    @Override // kotlin.lambdanew14
    public final /* bridge */ /* synthetic */ lambdanew14 AudioAttributesCompatParcelizer(boolean z) {
        return super.AudioAttributesCompatParcelizer(z);
    }

    @Override // kotlin.lambdanew14
    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer() {
        return super.IconCompatParcelizer();
    }

    public lambdanew13(byte[] bArr) {
        super(lambdanew3.BYTE_STRING);
        if (bArr == null) {
            this.AudioAttributesCompatParcelizer = null;
        } else {
            this.AudioAttributesCompatParcelizer = bArr;
        }
    }

    public final byte[] write() {
        byte[] bArr = this.AudioAttributesCompatParcelizer;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // kotlin.lambdanew14, kotlin.lambdanew10
    public final boolean equals(Object obj) {
        if (obj instanceof lambdanew13) {
            return super.equals(obj) && Arrays.equals(this.AudioAttributesCompatParcelizer, ((lambdanew13) obj).AudioAttributesCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.lambdanew14, kotlin.lambdanew10
    public final int hashCode() {
        return Arrays.hashCode(this.AudioAttributesCompatParcelizer) ^ super.hashCode();
    }
}
