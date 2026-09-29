package kotlin;

import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassUtil {
    public static void read(long j, AsPropertyTypeDeserializer asPropertyTypeDeserializer, nonNullString[] nonnullstringArr) {
        while (true) {
            if (asPropertyTypeDeserializer.IconCompatParcelizer() <= 1) {
                return;
            }
            int iWrite = write(asPropertyTypeDeserializer);
            int iWrite2 = write(asPropertyTypeDeserializer);
            int iWrite3 = asPropertyTypeDeserializer.write() + iWrite2;
            if (iWrite2 == -1 || iWrite2 > asPropertyTypeDeserializer.IconCompatParcelizer()) {
                prune.RemoteActionCompatParcelizer("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iWrite3 = asPropertyTypeDeserializer.read();
            } else if (iWrite == 4 && iWrite2 >= 8) {
                int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
                int iMediaBrowserCompatItemReceiver = iOnPrepare == 49 ? asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() : 0;
                int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
                if (iOnPrepare == 47) {
                    asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
                }
                boolean z = iOnPlayFromMediaId == 181 && (iOnPrepare == 49 || iOnPrepare == 47) && iOnPlayFromMediaId2 == 3;
                if (iOnPrepare == 49) {
                    z &= iMediaBrowserCompatItemReceiver == 1195456820;
                }
                if (z) {
                    AudioAttributesCompatParcelizer(j, asPropertyTypeDeserializer, nonnullstringArr);
                }
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite3);
        }
    }

    public static void AudioAttributesCompatParcelizer(long j, AsPropertyTypeDeserializer asPropertyTypeDeserializer, nonNullString[] nonnullstringArr) {
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        if ((iOnPlayFromMediaId & 64) != 0) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
            int i = (iOnPlayFromMediaId & 31) * 3;
            int iWrite = asPropertyTypeDeserializer.write();
            for (nonNullString nonnullstring : nonnullstringArr) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                nonnullstring.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, i);
                buildTypeSerializer.write(j != C.TIME_UNSET);
                nonnullstring.IconCompatParcelizer(j, 1, i, 0, null);
            }
        }
    }

    private static int write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int i = 0;
        while (asPropertyTypeDeserializer.IconCompatParcelizer() != 0) {
            int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
            i += iOnPlayFromMediaId;
            if (iOnPlayFromMediaId != 255) {
                return i;
            }
        }
        return -1;
    }
}
