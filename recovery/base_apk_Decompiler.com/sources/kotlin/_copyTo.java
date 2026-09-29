package kotlin;

import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes2.dex */
public final class _copyTo {
    public static androidx.media3.common.Metadata RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(12);
        while (asPropertyTypeDeserializer.write() < i) {
            int iWrite = asPropertyTypeDeserializer.write();
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1935766900) {
                if (iMediaBrowserCompatItemReceiver < 16) {
                    return null;
                }
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
                int i2 = -1;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                    int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
                    if (iOnPlayFromMediaId == 0) {
                        i2 = iOnPlayFromMediaId2;
                    } else if (iOnPlayFromMediaId == 1) {
                        i3 = iOnPlayFromMediaId2;
                    }
                }
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i2, asPropertyTypeDeserializer, i);
                if (iRemoteActionCompatParcelizer == -2147483647) {
                    return null;
                }
                return new androidx.media3.common.Metadata(new SmtaMetadataEntry(iRemoteActionCompatParcelizer, i3));
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite + iMediaBrowserCompatItemReceiver);
        }
        return null;
    }

    private static int RemoteActionCompatParcelizer(int i, AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i2) {
        if (i == 12) {
            return PsExtractor.VIDEO_STREAM_MASK;
        }
        if (i == 13) {
            return 120;
        }
        if (i == 21 && asPropertyTypeDeserializer.IconCompatParcelizer() >= 8 && asPropertyTypeDeserializer.write() + 8 <= i2) {
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (iMediaBrowserCompatItemReceiver >= 12 && iMediaBrowserCompatItemReceiver2 == 1936877170) {
                return asPropertyTypeDeserializer.onFastForward();
            }
        }
        return C.RATE_UNSET_INT;
    }
}
