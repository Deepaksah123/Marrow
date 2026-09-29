package kotlin;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
public final class getFormatId {
    private static final String IconCompatParcelizer;
    private static final isMediaDrmStateException<fillBufferWithAtLeastOnePacket, byte[]> read;
    private static final String write;
    private final TsUtil AudioAttributesCompatParcelizer;
    private final isMediaDrmStateException<fillBufferWithAtLeastOnePacket, byte[]> RemoteActionCompatParcelizer;

    static {
        new TsExtractor();
        IconCompatParcelizer = read("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
        write = read("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
        read = new isMediaDrmStateException() { // from class: o.getTrackId
            @Override // kotlin.isMediaDrmStateException
            public final Object AudioAttributesCompatParcelizer(Object obj) {
                return TsExtractor.IconCompatParcelizer((fillBufferWithAtLeastOnePacket) obj).getBytes(Charset.forName(CharsetNames.UTF_8));
            }
        };
    }

    public static getFormatId IconCompatParcelizer(Context context, readFormat readformat, parseFrameLength parseframelength) {
        addLaUrlAttributeIfMissing.AudioAttributesCompatParcelizer(context);
        DrmUtilApi18 drmUtilApi18AudioAttributesCompatParcelizer = addLaUrlAttributeIfMissing.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new DrmUtilApi23(IconCompatParcelizer, write));
        DrmSessionManagerDrmSessionReference drmSessionManagerDrmSessionReferenceIconCompatParcelizer = DrmSessionManagerDrmSessionReference.IconCompatParcelizer("json");
        isMediaDrmStateException<fillBufferWithAtLeastOnePacket, byte[]> ismediadrmstateexception = read;
        return new getFormatId(new TsUtil(drmUtilApi18AudioAttributesCompatParcelizer.write("FIREBASE_CRASHLYTICS_REPORT", drmSessionManagerDrmSessionReferenceIconCompatParcelizer, ismediadrmstateexception), readformat.IconCompatParcelizer(), parseframelength), ismediadrmstateexception);
    }

    private getFormatId(TsUtil tsUtil, isMediaDrmStateException<fillBufferWithAtLeastOnePacket, byte[]> ismediadrmstateexception) {
        this.AudioAttributesCompatParcelizer = tsUtil;
        this.RemoteActionCompatParcelizer = ismediadrmstateexception;
    }

    public final Task<readNalUnitData> AudioAttributesCompatParcelizer(readNalUnitData readnalunitdata, boolean z) {
        return this.AudioAttributesCompatParcelizer.read(readnalunitdata, z).getTask();
    }

    private static String read(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
