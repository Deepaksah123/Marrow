package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class onWakeup implements copyWithCryptoType<Float> {
    public static final onWakeup read = new onWakeup();

    @Override // kotlin.copyWithCryptoType
    public final /* synthetic */ Float AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return write(format1, f);
    }

    private onWakeup() {
    }

    private static Float write(Format1 format1, float f) throws IOException {
        return Float.valueOf(setPlayWhenReadyChangeReason.RemoteActionCompatParcelizer(format1) * f);
    }
}
