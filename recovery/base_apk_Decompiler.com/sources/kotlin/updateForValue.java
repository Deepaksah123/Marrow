package kotlin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class updateForValue {
    private static final Pattern write = Pattern.compile("^NOTE([ \t].*)?$");

    public static void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        int iWrite = asPropertyTypeDeserializer.write();
        if (read(asPropertyTypeDeserializer)) {
            return;
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        StringBuilder sb = new StringBuilder("Expected WEBVTT. Got ");
        sb.append(asPropertyTypeDeserializer.MediaBrowserCompatMediaItem());
        throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
    }

    public static boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        String strMediaBrowserCompatMediaItem = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem();
        return strMediaBrowserCompatMediaItem != null && strMediaBrowserCompatMediaItem.startsWith("WEBVTT");
    }

    public static long write(String str) throws NumberFormatException {
        String[] strArrRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(str, "\\.");
        long j = 0;
        for (String str2 : LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strArrRemoteActionCompatParcelizer[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrRemoteActionCompatParcelizer.length == 2) {
            j2 += Long.parseLong(strArrRemoteActionCompatParcelizer[1]);
        }
        return j2 * 1000;
    }

    public static float RemoteActionCompatParcelizer(String str) throws NumberFormatException {
        if (!str.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
    }

    public static Matcher IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        String strMediaBrowserCompatMediaItem;
        while (true) {
            String strMediaBrowserCompatMediaItem2 = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem();
            if (strMediaBrowserCompatMediaItem2 == null) {
                return null;
            }
            if (write.matcher(strMediaBrowserCompatMediaItem2).matches()) {
                do {
                    strMediaBrowserCompatMediaItem = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem();
                    if (strMediaBrowserCompatMediaItem != null) {
                    }
                } while (!strMediaBrowserCompatMediaItem.isEmpty());
            } else {
                Matcher matcher = _typeIdIndex.IconCompatParcelizer.matcher(strMediaBrowserCompatMediaItem2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }
}
