package kotlin;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class getDecoderInfosSortedByFormatSupport {
    private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static void read(avcLevelToMaxFrameSize avcleveltomaxframesize) {
        if (!avcleveltomaxframesize.MediaBrowserCompatItemReceiver()) {
            avcleveltomaxframesize.AudioAttributesImplApi26Parcelizer();
        }
        avcleveltomaxframesize.RemoteActionCompatParcelizer();
    }

    public static boolean read(String str) {
        return str == null || !RemoteActionCompatParcelizer.matcher(str).matches();
    }
}
