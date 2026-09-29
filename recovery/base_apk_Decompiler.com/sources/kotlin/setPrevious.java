package kotlin;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0170format;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class setPrevious implements removeFirstOccurrence.AudioAttributesCompatParcelizer {
    private final List<C0170format> IconCompatParcelizer;
    private final int read;

    public setPrevious() {
        this((byte) 0);
    }

    public setPrevious(byte b) {
        this(0, initExtraTracks.AudioAttributesImplApi26Parcelizer());
    }

    public setPrevious(int i, List<C0170format> list) {
        this.read = i;
        this.IconCompatParcelizer = list;
    }

    @Override // o.removeFirstOccurrence.AudioAttributesCompatParcelizer
    public final SparseArray<removeFirstOccurrence> read() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    @Override // o.removeFirstOccurrence.AudioAttributesCompatParcelizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.removeFirstOccurrence AudioAttributesCompatParcelizer(int r5, o.removeFirstOccurrence.read r6) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPrevious.AudioAttributesCompatParcelizer(int, o.removeFirstOccurrence$read):o.removeFirstOccurrence");
    }

    private pollFirst AudioAttributesCompatParcelizer(removeFirstOccurrence.read readVar) {
        return new pollFirst(write(readVar));
    }

    private removeLast read(removeFirstOccurrence.read readVar) {
        return new removeLast(write(readVar));
    }

    private List<C0170format> write(removeFirstOccurrence.read readVar) {
        String str;
        int i;
        List<byte[]> listIconCompatParcelizer;
        if (RemoteActionCompatParcelizer(32)) {
            return this.IconCompatParcelizer;
        }
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(readVar.read);
        List<C0170format> arrayList = this.IconCompatParcelizer;
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
            int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
            int iWrite = asPropertyTypeDeserializer.write();
            if (iOnPlayFromMediaId == 134) {
                arrayList = new ArrayList<>();
                int iOnPlayFromMediaId3 = asPropertyTypeDeserializer.onPlayFromMediaId();
                for (int i2 = 0; i2 < (iOnPlayFromMediaId3 & 31); i2++) {
                    String str2 = asPropertyTypeDeserializer.read(3);
                    int iOnPlayFromMediaId4 = asPropertyTypeDeserializer.onPlayFromMediaId();
                    boolean z = (iOnPlayFromMediaId4 & 128) != 0;
                    if (z) {
                        i = iOnPlayFromMediaId4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte bOnPlayFromMediaId = (byte) asPropertyTypeDeserializer.onPlayFromMediaId();
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
                    if (z) {
                        listIconCompatParcelizer = inclusion.IconCompatParcelizer((bOnPlayFromMediaId & 64) != 0);
                    } else {
                        listIconCompatParcelizer = null;
                    }
                    arrayList.add(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(str).read(str2).AudioAttributesCompatParcelizer(i).RemoteActionCompatParcelizer(listIconCompatParcelizer).IconCompatParcelizer());
                }
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite + iOnPlayFromMediaId2);
        }
        return arrayList;
    }

    private boolean RemoteActionCompatParcelizer(int i) {
        return (this.read & i) != 0;
    }
}
