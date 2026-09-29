package kotlin;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class associateNoSampleRenderersWithEmptySampleStream implements IllegalSeekPositionException<InputStream, setYear> {
    private final List<ImageHeaderParser> IconCompatParcelizer;
    private final IllegalSeekPositionException<ByteBuffer, setYear> read;
    private final setSubtitleConfigurations write;

    public associateNoSampleRenderersWithEmptySampleStream(List<ImageHeaderParser> list, IllegalSeekPositionException<ByteBuffer, setYear> illegalSeekPositionException, setSubtitleConfigurations setsubtitleconfigurations) {
        this.IconCompatParcelizer = list;
        this.read = illegalSeekPositionException;
        this.write = setsubtitleconfigurations;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public boolean RemoteActionCompatParcelizer(InputStream inputStream, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        return !((Boolean) r8lambda_r106e6zya8q8i_ekunqwrolpk.IconCompatParcelizer(disassociateNoSampleRenderersWithEmptySampleStream.IconCompatParcelizer)).booleanValue() && isHeart.IconCompatParcelizer(this.IconCompatParcelizer, inputStream, this.write) == ImageHeaderParser.ImageType.GIF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.IllegalSeekPositionException
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setMimeType<setYear> AudioAttributesCompatParcelizer(InputStream inputStream, int i, int i2, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) throws IOException {
        byte[] bArrIconCompatParcelizer = IconCompatParcelizer(inputStream);
        if (bArrIconCompatParcelizer == null) {
            return null;
        }
        return this.read.AudioAttributesCompatParcelizer(ByteBuffer.wrap(bArrIconCompatParcelizer), i, i2, r8lambda_r106e6zya8q8i_ekunqwrolpk);
    }

    private static byte[] IconCompatParcelizer(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
