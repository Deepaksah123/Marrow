package kotlin;

import java.io.ByteArrayInputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class createAudioTrackV21 extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ byte[] read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createAudioTrackV21(byte[] bArr) {
        super(0);
        this.read = bArr;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        DeflaterInputStream deflaterInputStream = new DeflaterInputStream(new ByteArrayInputStream(this.read), new Deflater(-1, true));
        try {
            byte[] bArrWrite = getCorrectCount.write(deflaterInputStream);
            MagicModuleMetaLSModel.IconCompatParcelizer(deflaterInputStream, null);
            return bArrWrite;
        } finally {
        }
    }
}
