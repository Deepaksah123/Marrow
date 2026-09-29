package kotlin;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class setExtraOffsets {
    public static final void AudioAttributesCompatParcelizer(ReadableByteChannel readableByteChannel, FileChannel fileChannel) throws IOException {
        toMagicModuleMetaRepoModel.write(readableByteChannel, "");
        toMagicModuleMetaRepoModel.write(fileChannel, "");
        try {
            fileChannel.transferFrom(readableByteChannel, 0L, Long.MAX_VALUE);
            fileChannel.force(false);
        } finally {
            readableByteChannel.close();
            fileChannel.close();
        }
    }
}
