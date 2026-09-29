package kotlin;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class setArtworkUri implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType read(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType AudioAttributesCompatParcelizer(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int write(InputStream inputStream, setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        int iWrite = new createEnumNamingStrategyInstance(inputStream).write("Orientation");
        if (iWrite == 0) {
            return -1;
        }
        return iWrite;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int RemoteActionCompatParcelizer(ByteBuffer byteBuffer, setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        return write(maybeReleaseChildSource.RemoteActionCompatParcelizer(byteBuffer), setsubtitleconfigurations);
    }
}
