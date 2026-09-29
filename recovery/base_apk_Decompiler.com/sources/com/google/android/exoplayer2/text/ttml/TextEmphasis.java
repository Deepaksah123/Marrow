package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import kotlin.onEmsgLeafAtomRead;
import kotlin.parseMdhd;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final onEmsgLeafAtomRead<String> SINGLE_STYLE_VALUES = onEmsgLeafAtomRead.IconCompatParcelizer(TtmlNode.TEXT_EMPHASIS_AUTO, "none");
    private static final onEmsgLeafAtomRead<String> MARK_SHAPE_VALUES = onEmsgLeafAtomRead.write(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final onEmsgLeafAtomRead<String> MARK_FILL_VALUES = onEmsgLeafAtomRead.IconCompatParcelizer(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final onEmsgLeafAtomRead<String> POSITION_VALUES = onEmsgLeafAtomRead.write(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    public static TextEmphasis parse(String str) {
        if (str == null) {
            return null;
        }
        String str2 = parseMdhd.read(str.trim());
        if (str2.isEmpty()) {
            return null;
        }
        return parseWords(onEmsgLeafAtomRead.RemoteActionCompatParcelizer((Object[]) TextUtils.split(str2, WHITESPACE_PATTERN)));
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
    private static com.google.android.exoplayer2.text.ttml.TextEmphasis parseWords(kotlin.onEmsgLeafAtomRead<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TextEmphasis.parseWords(o.onEmsgLeafAtomRead):com.google.android.exoplayer2.text.ttml.TextEmphasis");
    }
}
