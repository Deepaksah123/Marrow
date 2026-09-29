package kotlin;

import android.util.Pair;
import com.google.android.exoplayer2.audio.WavUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class LinkedDequeAbstractLinkedIterator {
    public static boolean AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(8);
        write writeVar = write.read(closeonfailandthrowasioe, asPropertyTypeDeserializer);
        if (writeVar.IconCompatParcelizer != 1380533830 && writeVar.IconCompatParcelizer != 1380333108) {
            return false;
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 4);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver == 1463899717) {
            return true;
        }
        prune.AudioAttributesCompatParcelizer("WavHeaderReader", "Unsupported form type: ".concat(String.valueOf(iMediaBrowserCompatItemReceiver)));
        return false;
    }

    public static long write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(8);
        write writeVar = write.read(closeonfailandthrowasioe, asPropertyTypeDeserializer);
        if (writeVar.IconCompatParcelizer != 1685272116) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            return -1L;
        }
        closeonfailandthrowasioe.write(8);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 8);
        long jMediaDescriptionCompat = asPropertyTypeDeserializer.MediaDescriptionCompat();
        closeonfailandthrowasioe.IconCompatParcelizer(((int) writeVar.AudioAttributesCompatParcelizer) + 8);
        return jMediaDescriptionCompat;
    }

    public static unlinkLast read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        byte[] bArr;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(16);
        write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(WavUtil.FMT_FOURCC, closeonfailandthrowasioe, asPropertyTypeDeserializer);
        buildTypeSerializer.write(writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer >= 16);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 16);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
        int iOnCustomAction = asPropertyTypeDeserializer.onCustomAction();
        int iOnCustomAction2 = asPropertyTypeDeserializer.onCustomAction();
        int iOnCommand = asPropertyTypeDeserializer.onCommand();
        int iOnCommand2 = asPropertyTypeDeserializer.onCommand();
        int iOnCustomAction3 = asPropertyTypeDeserializer.onCustomAction();
        int iOnCustomAction4 = asPropertyTypeDeserializer.onCustomAction();
        int i = ((int) writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer;
        }
        closeonfailandthrowasioe.IconCompatParcelizer((int) (closeonfailandthrowasioe.write() - closeonfailandthrowasioe.IconCompatParcelizer()));
        return new unlinkLast(iOnCustomAction, iOnCustomAction2, iOnCommand, iOnCommand2, iOnCustomAction3, iOnCustomAction4, bArr);
    }

    public static Pair<Long, Long> IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(1684108385, closeonfailandthrowasioe, new AsPropertyTypeDeserializer(8));
        closeonfailandthrowasioe.IconCompatParcelizer(8);
        return Pair.create(Long.valueOf(closeonfailandthrowasioe.IconCompatParcelizer()), Long.valueOf(writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer));
    }

    private static write RemoteActionCompatParcelizer(int i, closeOnFailAndThrowAsIOE closeonfailandthrowasioe, AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws IOException {
        write writeVar = write.read(closeonfailandthrowasioe, asPropertyTypeDeserializer);
        while (writeVar.IconCompatParcelizer != i) {
            StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
            sb.append(writeVar.IconCompatParcelizer);
            prune.RemoteActionCompatParcelizer("WavHeaderReader", sb.toString());
            long j = writeVar.AudioAttributesCompatParcelizer;
            long j2 = 8 + j;
            if (writeVar.AudioAttributesCompatParcelizer % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                StringBuilder sb2 = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(writeVar.IconCompatParcelizer);
                throw SchemaAware.RemoteActionCompatParcelizer(sb2.toString());
            }
            closeonfailandthrowasioe.IconCompatParcelizer((int) j2);
            writeVar = write.read(closeonfailandthrowasioe, asPropertyTypeDeserializer);
        }
        return writeVar;
    }

    static final class write {
        public final long AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;

        private write(int i, long j) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = j;
        }

        public static write read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws IOException {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 8);
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
            return new write(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver(), asPropertyTypeDeserializer.RatingCompat());
        }
    }
}
