package kotlin;

import com.google.android.exoplayer2.extractor.mp4.Atom;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class appendCompletedChunk {
    public static byte[] write(UUID uuid, byte[] bArr) {
        return IconCompatParcelizer(uuid, null, bArr);
    }

    public static byte[] IconCompatParcelizer(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length << 4) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(Atom.TYPE_pssh);
        byteBufferAllocate.putInt(uuidArr != null ? BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        } else {
            byteBufferAllocate.putInt(0);
        }
        return byteBufferAllocate.array();
    }

    public static boolean read(byte[] bArr) {
        return write(bArr) != null;
    }

    public static UUID RemoteActionCompatParcelizer(byte[] bArr) {
        read readVarWrite = write(bArr);
        if (readVarWrite == null) {
            return null;
        }
        return readVarWrite.IconCompatParcelizer;
    }

    public static int AudioAttributesCompatParcelizer(byte[] bArr) {
        read readVarWrite = write(bArr);
        if (readVarWrite == null) {
            return -1;
        }
        return readVarWrite.write;
    }

    public static byte[] write(byte[] bArr, UUID uuid) {
        read readVarWrite = write(bArr);
        if (readVarWrite == null) {
            return null;
        }
        if (!uuid.equals(readVarWrite.IconCompatParcelizer)) {
            StringBuilder sb = new StringBuilder("UUID mismatch. Expected: ");
            sb.append(uuid);
            sb.append(", got: ");
            sb.append(readVarWrite.IconCompatParcelizer);
            sb.append(".");
            prune.RemoteActionCompatParcelizer("PsshAtomUtil", sb.toString());
            return null;
        }
        return readVarWrite.AudioAttributesCompatParcelizer;
    }

    private static read write(byte[] bArr) {
        UUID[] uuidArr;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(bArr);
        if (asPropertyTypeDeserializer.read() < 32) {
            return null;
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
        int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver != iIconCompatParcelizer) {
            StringBuilder sb = new StringBuilder("Advertised atom size (");
            sb.append(iMediaBrowserCompatItemReceiver);
            sb.append(") does not match buffer size: ");
            sb.append(iIconCompatParcelizer);
            prune.RemoteActionCompatParcelizer("PsshAtomUtil", sb.toString());
            return null;
        }
        int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver2 != 1886614376) {
            prune.RemoteActionCompatParcelizer("PsshAtomUtil", "Atom type is not pssh: ".concat(String.valueOf(iMediaBrowserCompatItemReceiver2)));
            return null;
        }
        int iAudioAttributesCompatParcelizer = chainedTransformer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        if (iAudioAttributesCompatParcelizer > 1) {
            prune.RemoteActionCompatParcelizer("PsshAtomUtil", "Unsupported pssh version: ".concat(String.valueOf(iAudioAttributesCompatParcelizer)));
            return null;
        }
        UUID uuid = new UUID(asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler(), asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler());
        if (iAudioAttributesCompatParcelizer == 1) {
            int iOnPrepareFromSearch = asPropertyTypeDeserializer.onPrepareFromSearch();
            uuidArr = new UUID[iOnPrepareFromSearch];
            for (int i = 0; i < iOnPrepareFromSearch; i++) {
                uuidArr[i] = new UUID(asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler(), asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler());
            }
        } else {
            uuidArr = null;
        }
        int iOnPrepareFromSearch2 = asPropertyTypeDeserializer.onPrepareFromSearch();
        int iIconCompatParcelizer2 = asPropertyTypeDeserializer.IconCompatParcelizer();
        if (iOnPrepareFromSearch2 != iIconCompatParcelizer2) {
            StringBuilder sb2 = new StringBuilder("Atom data size (");
            sb2.append(iOnPrepareFromSearch2);
            sb2.append(") does not match the bytes left: ");
            sb2.append(iIconCompatParcelizer2);
            prune.RemoteActionCompatParcelizer("PsshAtomUtil", sb2.toString());
            return null;
        }
        byte[] bArr2 = new byte[iOnPrepareFromSearch2];
        asPropertyTypeDeserializer.write(bArr2, 0, iOnPrepareFromSearch2);
        return new read(uuid, iAudioAttributesCompatParcelizer, bArr2, uuidArr);
    }

    public static final class read {
        public final byte[] AudioAttributesCompatParcelizer;
        public final UUID IconCompatParcelizer;
        public final UUID[] RemoteActionCompatParcelizer;
        public final int write;

        read(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
            this.IconCompatParcelizer = uuid;
            this.write = i;
            this.AudioAttributesCompatParcelizer = bArr;
            this.RemoteActionCompatParcelizer = uuidArr;
        }
    }
}
