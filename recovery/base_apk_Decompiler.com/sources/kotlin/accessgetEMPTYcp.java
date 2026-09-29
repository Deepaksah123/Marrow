package kotlin;

import java.util.Arrays;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetEMPTYcp {
    static final byte[] MediaBrowserCompatItemReceiver = {TarConstants.LF_NORMAL, TarConstants.LF_LINK, TarConstants.LF_DIR, 0};
    static final byte[] MediaBrowserCompatCustomActionResultReceiver = {TarConstants.LF_NORMAL, TarConstants.LF_LINK, TarConstants.LF_NORMAL, 0};
    static final byte[] RemoteActionCompatParcelizer = {TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, 57, 0};
    static final byte[] IconCompatParcelizer = {TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, TarConstants.LF_DIR, 0};
    static final byte[] AudioAttributesCompatParcelizer = {TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, TarConstants.LF_LINK, 0};
    static final byte[] read = {TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, TarConstants.LF_LINK, 0};
    static final byte[] write = {TarConstants.LF_NORMAL, TarConstants.LF_NORMAL, TarConstants.LF_SYMLINK, 0};

    static String IconCompatParcelizer(byte[] bArr) {
        return (Arrays.equals(bArr, AudioAttributesCompatParcelizer) || Arrays.equals(bArr, IconCompatParcelizer)) ? ":" : "!";
    }
}
