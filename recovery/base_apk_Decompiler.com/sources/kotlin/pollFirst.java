package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;
import kotlin.C0170format;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class pollFirst {
    private final List<C0170format> IconCompatParcelizer;
    private final nonNullString[] RemoteActionCompatParcelizer;

    public pollFirst(List<C0170format> list) {
        this.IconCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = new nonNullString[list.size()];
    }

    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.length; i++) {
            writeVar.read();
            nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 3);
            C0170format c0170format = this.IconCompatParcelizer.get(i);
            String str = c0170format.onPlayFromUri;
            buildTypeSerializer.write(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            nonnullstringIconCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(c0170format.handleMediaPlayPauseIfPendingOnHandler != null ? c0170format.handleMediaPlayPauseIfPendingOnHandler : writeVar.IconCompatParcelizer()).AudioAttributesImplApi26Parcelizer(str).handleMediaPlayPauseIfPendingOnHandler(c0170format.onRewind).read(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesCompatParcelizer(c0170format.write).RemoteActionCompatParcelizer(c0170format.onAddQueueItem).IconCompatParcelizer());
            this.RemoteActionCompatParcelizer[i] = nonnullstringIconCompatParcelizer;
        }
    }

    public final void IconCompatParcelizer(long j, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        ClassUtil.read(j, asPropertyTypeDeserializer, this.RemoteActionCompatParcelizer);
    }
}
