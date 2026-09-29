package kotlin;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.getScore;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getAlternativeCodecMimeType {
    public abstract boolean AudioAttributesCompatParcelizer();

    private static List<getAlternativeCodecMimeType> write(getWrappedMetadataBytes getwrappedmetadatabytes, Context context) {
        ArrayList arrayList = new ArrayList();
        if (getwrappedmetadatabytes.AudioAttributesImplApi26Parcelizer()) {
            arrayList.add(new getAacCodecProfileAndLevel(getwrappedmetadatabytes.AudioAttributesImplApi21Parcelizer()));
        }
        if (getwrappedmetadatabytes.MediaBrowserCompatItemReceiver()) {
            arrayList.add(new clearDecoderInfoCache(getwrappedmetadatabytes.IconCompatParcelizer(), context));
        }
        if (getwrappedmetadatabytes.MediaBrowserCompatCustomActionResultReceiver()) {
            arrayList.add(new applyWorkarounds(getwrappedmetadatabytes.RemoteActionCompatParcelizer()));
        }
        if (getwrappedmetadatabytes.AudioAttributesImplBaseParcelizer()) {
            arrayList.add(new dolbyVisionStringToLevel(getwrappedmetadatabytes.read()));
        }
        return arrayList;
    }

    public static boolean IconCompatParcelizer(getWrappedMetadataBytes getwrappedmetadatabytes, Context context) {
        List<getAlternativeCodecMimeType> listWrite = write(getwrappedmetadatabytes, context);
        if (listWrite.isEmpty()) {
            MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
            return false;
        }
        Iterator<getAlternativeCodecMimeType> it = listWrite.iterator();
        while (it.hasNext()) {
            if (!it.next().AudioAttributesCompatParcelizer()) {
                return false;
            }
        }
        return true;
    }

    public static String write(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (getScore.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : getScore.AudioAttributesCompatParcelizer.values()) {
            if (audioAttributesCompatParcelizer.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public static String read(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (getScore.read readVar : getScore.read.values()) {
            if (readVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static void write(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }
}
