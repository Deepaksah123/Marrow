package kotlin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.onPrepareError;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadHelperDownloadTrackSelectionFactory implements DownloadHelperFakeBandwidthMeter {
    private final createTrackSelections AudioAttributesCompatParcelizer = new createTrackSelections();

    public static DownloadHelperFakeBandwidthMeter IconCompatParcelizer() {
        return new DownloadHelperDownloadTrackSelectionFactory();
    }

    private DownloadHelperDownloadTrackSelectionFactory() {
    }

    @Override // kotlin.DownloadHelperFakeBandwidthMeter
    public final boolean read(CharSequence charSequence, onPrepareError.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        String str = remoteActionCompatParcelizer.read();
        if (str.length() == 0) {
            return false;
        }
        return write(charSequence, this.AudioAttributesCompatParcelizer.read(str), false);
    }

    private static boolean write(CharSequence charSequence, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.lookingAt() && matcher.matches();
    }
}
