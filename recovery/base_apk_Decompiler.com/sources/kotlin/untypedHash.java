package kotlin;

import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class untypedHash implements withTimeZone {
    private final AsPropertyTypeDeserializer AudioAttributesCompatParcelizer = new AsPropertyTypeDeserializer();
    private final TokenBufferReadContext IconCompatParcelizer = new TokenBufferReadContext();

    @Override // kotlin.withTimeZone
    public final int IconCompatParcelizer() {
        return 1;
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer) {
        findTypeId findtypeidRemoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(bArr, i2 + i);
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i);
        ArrayList arrayList = new ArrayList();
        try {
            updateForValue.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            while (!TextUtils.isEmpty(this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
                if (iRemoteActionCompatParcelizer == 0) {
                    _formatBCEYear.RemoteActionCompatParcelizer(new parentOrCopy(arrayList2), remoteActionCompatParcelizer, typeSerializer);
                    return;
                }
                if (iRemoteActionCompatParcelizer == 1) {
                    AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
                } else if (iRemoteActionCompatParcelizer == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
                    arrayList.addAll(this.IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer));
                } else if (iRemoteActionCompatParcelizer == 3 && (findtypeidRemoteActionCompatParcelizer = _typeIdIndex.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, arrayList)) != null) {
                    arrayList2.add(findtypeidRemoteActionCompatParcelizer);
                }
            }
        } catch (SchemaAware e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static int RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int i = -1;
        int iWrite = 0;
        while (i == -1) {
            iWrite = asPropertyTypeDeserializer.write();
            String strMediaBrowserCompatMediaItem = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem();
            if (strMediaBrowserCompatMediaItem == null) {
                i = 0;
            } else if ("STYLE".equals(strMediaBrowserCompatMediaItem)) {
                i = 2;
            } else {
                i = strMediaBrowserCompatMediaItem.startsWith("NOTE") ? 1 : 3;
            }
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        return i;
    }

    private static void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        while (!TextUtils.isEmpty(asPropertyTypeDeserializer.MediaBrowserCompatMediaItem())) {
        }
    }
}
