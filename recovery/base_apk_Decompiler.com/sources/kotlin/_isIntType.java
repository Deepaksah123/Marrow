package kotlin;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _isIntType implements _enumConstants {
    protected abstract androidx.media3.common.Metadata AudioAttributesCompatParcelizer(_enumDefault _enumdefault, ByteBuffer byteBuffer);

    @Override // kotlin._enumConstants
    public final androidx.media3.common.Metadata write(_enumDefault _enumdefault) {
        ByteBuffer byteBuffer = (ByteBuffer) buildTypeSerializer.IconCompatParcelizer(_enumdefault.read);
        buildTypeSerializer.IconCompatParcelizer(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return AudioAttributesCompatParcelizer(_enumdefault, byteBuffer);
    }
}
