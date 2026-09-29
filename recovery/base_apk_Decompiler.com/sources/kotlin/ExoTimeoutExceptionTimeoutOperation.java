package kotlin;

import android.graphics.PointF;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoTimeoutExceptionTimeoutOperation implements copyWithCryptoType<PointF> {
    public static final ExoTimeoutExceptionTimeoutOperation IconCompatParcelizer = new ExoTimeoutExceptionTimeoutOperation();

    @Override // kotlin.copyWithCryptoType
    public final /* synthetic */ PointF AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return write(format1, f);
    }

    private ExoTimeoutExceptionTimeoutOperation() {
    }

    private static PointF write(Format1 format1, float f) throws IOException {
        return setPlayWhenReadyChangeReason.read(format1, f);
    }
}
