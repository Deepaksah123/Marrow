package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class setPlaybackInfo implements copyWithCryptoType<Integer> {
    public static final setPlaybackInfo IconCompatParcelizer = new setPlaybackInfo();

    @Override // kotlin.copyWithCryptoType
    public final /* synthetic */ Integer AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return RemoteActionCompatParcelizer(format1, f);
    }

    private setPlaybackInfo() {
    }

    private static Integer RemoteActionCompatParcelizer(Format1 format1, float f) throws IOException {
        return Integer.valueOf(Math.round(setPlayWhenReadyChangeReason.RemoteActionCompatParcelizer(format1) * f));
    }
}
