package kotlin;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class TokenBufferParser {
    public final int AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int read;
    private static final Pattern AudioAttributesImplApi21Parcelizer = Pattern.compile("\\s+");
    private static final onEmsgLeafAtomRead<String> MediaBrowserCompatItemReceiver = onEmsgLeafAtomRead.IconCompatParcelizer(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final onEmsgLeafAtomRead<String> write = onEmsgLeafAtomRead.write(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final onEmsgLeafAtomRead<String> RemoteActionCompatParcelizer = onEmsgLeafAtomRead.IconCompatParcelizer(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final onEmsgLeafAtomRead<String> MediaBrowserCompatCustomActionResultReceiver = onEmsgLeafAtomRead.write(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    private TokenBufferParser(int i, int i2, int i3) {
        this.AudioAttributesCompatParcelizer = i;
        this.read = i2;
        this.IconCompatParcelizer = i3;
    }

    public static TokenBufferParser RemoteActionCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        String str2 = parseMdhd.read(str.trim());
        if (str2.isEmpty()) {
            return null;
        }
        return AudioAttributesCompatParcelizer(onEmsgLeafAtomRead.RemoteActionCompatParcelizer((Object[]) TextUtils.split(str2, AudioAttributesImplApi21Parcelizer)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin.TokenBufferParser AudioAttributesCompatParcelizer(kotlin.onEmsgLeafAtomRead<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TokenBufferParser.AudioAttributesCompatParcelizer(o.onEmsgLeafAtomRead):o.TokenBufferParser");
    }
}
