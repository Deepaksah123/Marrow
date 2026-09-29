package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import kotlin.C0170format;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
final class removeLast {
    private final nonNullString[] AudioAttributesCompatParcelizer;
    private final List<C0170format> write;

    public removeLast(List<C0170format> list) {
        this.write = list;
        this.AudioAttributesCompatParcelizer = new nonNullString[list.size()];
    }

    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        for (int i = 0; i < this.AudioAttributesCompatParcelizer.length; i++) {
            writeVar.read();
            nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 3);
            C0170format c0170format = this.write.get(i);
            String str = c0170format.onPlayFromUri;
            buildTypeSerializer.write(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            nonnullstringIconCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(writeVar.IconCompatParcelizer()).AudioAttributesImplApi26Parcelizer(str).handleMediaPlayPauseIfPendingOnHandler(c0170format.onRewind).read(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesCompatParcelizer(c0170format.write).RemoteActionCompatParcelizer(c0170format.onAddQueueItem).IconCompatParcelizer());
            this.AudioAttributesCompatParcelizer[i] = nonnullstringIconCompatParcelizer;
        }
    }

    public final void read(long j, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() >= 9) {
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
            if (iMediaBrowserCompatItemReceiver == 434 && iMediaBrowserCompatItemReceiver2 == 1195456820 && iOnPlayFromMediaId == 3) {
                ClassUtil.AudioAttributesCompatParcelizer(j, asPropertyTypeDeserializer, this.AudioAttributesCompatParcelizer);
            }
        }
    }
}
