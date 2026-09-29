package kotlin;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.getDefaultImpl;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class TokenBufferSegment implements withTimeZone {
    private final AsPropertyTypeDeserializer read = new AsPropertyTypeDeserializer();

    @Override // kotlin.withTimeZone
    public final int IconCompatParcelizer() {
        return 2;
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer) {
        this.read.IconCompatParcelizer(bArr, i2 + i);
        this.read.MediaBrowserCompatCustomActionResultReceiver(i);
        ArrayList arrayList = new ArrayList();
        while (this.read.IconCompatParcelizer() > 0) {
            buildTypeSerializer.write(this.read.IconCompatParcelizer() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
            if (this.read.MediaBrowserCompatItemReceiver() == 1987343459) {
                arrayList.add(RemoteActionCompatParcelizer(this.read, iMediaBrowserCompatItemReceiver - 8));
            } else {
                this.read.AudioAttributesImplBaseParcelizer(iMediaBrowserCompatItemReceiver - 8);
            }
        }
        typeSerializer.read(new pad3(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }

    private static getDefaultImpl RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        CharSequence charSequenceIconCompatParcelizer = null;
        getDefaultImpl.write writeVarWrite = null;
        while (i > 0) {
            buildTypeSerializer.write(i >= 8, "Incomplete vtt cue box header found.");
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            int i2 = iMediaBrowserCompatItemReceiver - 8;
            String strWrite = LaissezFaireSubTypeValidator.write(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write(), i2);
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(i2);
            i = (i - 8) - i2;
            if (iMediaBrowserCompatItemReceiver2 == 1937011815) {
                writeVarWrite = _typeIdIndex.write(strWrite);
            } else if (iMediaBrowserCompatItemReceiver2 == 1885436268) {
                charSequenceIconCompatParcelizer = _typeIdIndex.IconCompatParcelizer((String) null, strWrite.trim(), (List<hasIds>) Collections.emptyList());
            }
        }
        if (charSequenceIconCompatParcelizer == null) {
            charSequenceIconCompatParcelizer = "";
        }
        if (writeVarWrite != null) {
            return writeVarWrite.RemoteActionCompatParcelizer(charSequenceIconCompatParcelizer).write();
        }
        return _typeIdIndex.RemoteActionCompatParcelizer(charSequenceIconCompatParcelizer);
    }
}
