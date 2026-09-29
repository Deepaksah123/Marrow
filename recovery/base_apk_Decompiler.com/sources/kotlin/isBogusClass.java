package kotlin;

import java.io.EOFException;
import java.io.IOException;
import kotlin.constructUsingIndex;

/* JADX INFO: loaded from: classes2.dex */
public final class isBogusClass {
    private final AsPropertyTypeDeserializer write = new AsPropertyTypeDeserializer(10);

    public final androidx.media3.common.Metadata read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, constructUsingIndex.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws IOException {
        androidx.media3.common.Metadata metadataWrite = null;
        int i = 0;
        while (true) {
            try {
                closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.write.RemoteActionCompatParcelizer(), 0, 10);
                this.write.MediaBrowserCompatCustomActionResultReceiver(0);
                if (this.write.onPause() != 4801587) {
                    break;
                }
                this.write.AudioAttributesImplBaseParcelizer(3);
                int iOnPlay = this.write.onPlay();
                int i2 = iOnPlay + 10;
                if (metadataWrite == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.write.RemoteActionCompatParcelizer(), 0, bArr, 0, 10);
                    closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr, 10, iOnPlay);
                    metadataWrite = new constructUsingIndex(remoteActionCompatParcelizer).write(bArr, i2);
                } else {
                    closeonfailandthrowasioe.write(iOnPlay);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.write(i);
        return metadataWrite;
    }
}
