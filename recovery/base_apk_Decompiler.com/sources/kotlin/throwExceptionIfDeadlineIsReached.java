package kotlin;

import java.io.ByteArrayInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class throwExceptionIfDeadlineIsReached extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ byte[] AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public throwExceptionIfDeadlineIsReached(byte[] bArr) {
        super(0);
        this.AudioAttributesCompatParcelizer = bArr;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(this.AudioAttributesCompatParcelizer), new Inflater(true));
        try {
            byte[] bArrWrite = getCorrectCount.write(inflaterInputStream);
            MagicModuleMetaLSModel.IconCompatParcelizer(inflaterInputStream, null);
            return bArrWrite;
        } finally {
        }
    }
}
