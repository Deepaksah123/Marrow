package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class WebvttCssParser {
    private static final String PROPERTY_BGCOLOR = "background-color";
    private static final String PROPERTY_COLOR = "color";
    private static final String PROPERTY_FONT_FAMILY = "font-family";
    private static final String PROPERTY_FONT_SIZE = "font-size";
    private static final String PROPERTY_FONT_STYLE = "font-style";
    private static final String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final String PROPERTY_RUBY_POSITION = "ruby-position";
    private static final String PROPERTY_TEXT_COMBINE_UPRIGHT = "text-combine-upright";
    private static final String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final String RULE_END = "}";
    private static final String RULE_START = "{";
    private static final String TAG = "WebvttCssParser";
    private static final String VALUE_ALL = "all";
    private static final String VALUE_BOLD = "bold";
    private static final String VALUE_DIGITS = "digits";
    private static final String VALUE_ITALIC = "italic";
    private static final String VALUE_OVER = "over";
    private static final String VALUE_UNDER = "under";
    private static final String VALUE_UNDERLINE = "underline";
    private static final Pattern VOICE_NAME_PATTERN = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern FONT_SIZE_PATTERN = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final ParsableByteArray styleInput = new ParsableByteArray();
    private final StringBuilder stringBuilder = new StringBuilder();

    public final List<WebvttCssStyle> parseBlock(ParsableByteArray parsableByteArray) {
        this.stringBuilder.setLength(0);
        int position = parsableByteArray.getPosition();
        skipStyleBlock(parsableByteArray);
        this.styleInput.reset(parsableByteArray.getData(), parsableByteArray.getPosition());
        this.styleInput.setPosition(position);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String selector = parseSelector(this.styleInput, this.stringBuilder);
            if (selector == null || !RULE_START.equals(parseNextToken(this.styleInput, this.stringBuilder))) {
                break;
            }
            WebvttCssStyle webvttCssStyle = new WebvttCssStyle();
            applySelectorToStyle(webvttCssStyle, selector);
            String str = null;
            boolean z = false;
            while (!z) {
                int position2 = this.styleInput.getPosition();
                String nextToken = parseNextToken(this.styleInput, this.stringBuilder);
                boolean z2 = nextToken == null || RULE_END.equals(nextToken);
                if (!z2) {
                    this.styleInput.setPosition(position2);
                    parseStyleDeclaration(this.styleInput, webvttCssStyle, this.stringBuilder);
                }
                str = nextToken;
                z = z2;
            }
            if (RULE_END.equals(str)) {
                arrayList.add(webvttCssStyle);
            }
        }
        return arrayList;
    }

    private static String parseSelector(ParsableByteArray parsableByteArray, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        String nextToken = parseNextToken(parsableByteArray, sb);
        if (nextToken == null) {
            return null;
        }
        if (RULE_START.equals(nextToken)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        String cueTarget = "(".equals(nextToken) ? readCueTarget(parsableByteArray) : null;
        if (")".equals(parseNextToken(parsableByteArray, sb))) {
            return cueTarget;
        }
        return null;
    }

    private static String readCueTarget(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        boolean z = false;
        while (position < iLimit && !z) {
            z = ((char) parsableByteArray.getData()[position]) == ')';
            position++;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    private static void parseStyleDeclaration(ParsableByteArray parsableByteArray, WebvttCssStyle webvttCssStyle, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        String identifier = parseIdentifier(parsableByteArray, sb);
        if ("".equals(identifier) || !":".equals(parseNextToken(parsableByteArray, sb))) {
            return;
        }
        skipWhitespaceAndComments(parsableByteArray);
        String propertyValue = parsePropertyValue(parsableByteArray, sb);
        if (propertyValue == null || "".equals(propertyValue)) {
            return;
        }
        int position = parsableByteArray.getPosition();
        String nextToken = parseNextToken(parsableByteArray, sb);
        if (!";".equals(nextToken)) {
            if (!RULE_END.equals(nextToken)) {
                return;
            } else {
                parsableByteArray.setPosition(position);
            }
        }
        if ("color".equals(identifier)) {
            webvttCssStyle.setFontColor(ColorParser.parseCssColor(propertyValue));
            return;
        }
        if (PROPERTY_BGCOLOR.equals(identifier)) {
            webvttCssStyle.setBackgroundColor(ColorParser.parseCssColor(propertyValue));
            return;
        }
        boolean z = true;
        if (PROPERTY_RUBY_POSITION.equals(identifier)) {
            if (VALUE_OVER.equals(propertyValue)) {
                webvttCssStyle.setRubyPosition(1);
                return;
            } else {
                if (VALUE_UNDER.equals(propertyValue)) {
                    webvttCssStyle.setRubyPosition(2);
                    return;
                }
                return;
            }
        }
        if (PROPERTY_TEXT_COMBINE_UPRIGHT.equals(identifier)) {
            if (!"all".equals(propertyValue) && !propertyValue.startsWith(VALUE_DIGITS)) {
                z = false;
            }
            webvttCssStyle.setCombineUpright(z);
            return;
        }
        if (PROPERTY_TEXT_DECORATION.equals(identifier)) {
            if ("underline".equals(propertyValue)) {
                webvttCssStyle.setUnderline(true);
                return;
            }
            return;
        }
        if (PROPERTY_FONT_FAMILY.equals(identifier)) {
            webvttCssStyle.setFontFamily(propertyValue);
            return;
        }
        if (PROPERTY_FONT_WEIGHT.equals(identifier)) {
            if ("bold".equals(propertyValue)) {
                webvttCssStyle.setBold(true);
            }
        } else if (PROPERTY_FONT_STYLE.equals(identifier)) {
            if ("italic".equals(propertyValue)) {
                webvttCssStyle.setItalic(true);
            }
        } else if (PROPERTY_FONT_SIZE.equals(identifier)) {
            parseFontSize(propertyValue, webvttCssStyle);
        }
    }

    static void skipWhitespaceAndComments(ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z = true; parsableByteArray.bytesLeft() > 0 && z; z = false) {
                if (maybeSkipWhitespace(parsableByteArray) || maybeSkipComment(parsableByteArray)) {
                    break;
                }
            }
            return;
        }
    }

    static String parseNextToken(ParsableByteArray parsableByteArray, StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        String identifier = parseIdentifier(parsableByteArray, sb);
        if (!"".equals(identifier)) {
            return identifier;
        }
        StringBuilder sb2 = new StringBuilder("");
        sb2.append((char) parsableByteArray.readUnsignedByte());
        return sb2.toString();
    }

    private static boolean maybeSkipWhitespace(ParsableByteArray parsableByteArray) {
        char cPeekCharAtPosition = peekCharAtPosition(parsableByteArray, parsableByteArray.getPosition());
        if (cPeekCharAtPosition != '\t' && cPeekCharAtPosition != '\n' && cPeekCharAtPosition != '\f' && cPeekCharAtPosition != '\r' && cPeekCharAtPosition != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    static void skipStyleBlock(ParsableByteArray parsableByteArray) {
        while (!TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    private static char peekCharAtPosition(ParsableByteArray parsableByteArray, int i) {
        return (char) parsableByteArray.getData()[i];
    }

    private static String parsePropertyValue(ParsableByteArray parsableByteArray, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int position = parsableByteArray.getPosition();
            String nextToken = parseNextToken(parsableByteArray, sb);
            if (nextToken == null) {
                return null;
            }
            if (RULE_END.equals(nextToken) || ";".equals(nextToken)) {
                parsableByteArray.setPosition(position);
                z = true;
            } else {
                sb2.append(nextToken);
            }
        }
        return sb2.toString();
    }

    private static boolean maybeSkipComment(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        int i = position + 2;
        if (i > iLimit || data[position] != 47 || data[position + 1] != 42) {
            return false;
        }
        while (true) {
            int i2 = i + 1;
            if (i2 < iLimit) {
                if (((char) data[i]) == '*' && ((char) data[i2]) == '/') {
                    i += 2;
                    iLimit = i;
                } else {
                    i = i2;
                }
            } else {
                parsableByteArray.skipBytes(iLimit - parsableByteArray.getPosition());
                return true;
            }
        }
    }

    private static String parseIdentifier(ParsableByteArray parsableByteArray, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        while (position < iLimit && !z) {
            char c = (char) parsableByteArray.getData()[position];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                position++;
                sb.append(c);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void parseFontSize(java.lang.String r5, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle r6) {
        /*
            java.util.regex.Pattern r0 = com.google.android.exoplayer2.text.webvtt.WebvttCssParser.FONT_SIZE_PATTERN
            java.lang.String r1 = kotlin.parseMdhd.read(r5)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r1 = r0.matches()
            if (r1 != 0) goto L29
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid font-size: '"
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = "'."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCssParser"
            com.google.android.exoplayer2.util.Log.w(r6, r5)
            return
        L29:
            r5 = 2
            java.lang.String r1 = r0.group(r5)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 37
            r4 = 1
            if (r2 == r3) goto L5d
            r3 = 3240(0xca8, float:4.54E-42)
            if (r2 == r3) goto L53
            r3 = 3592(0xe08, float:5.033E-42)
            if (r2 == r3) goto L49
            goto L67
        L49:
            java.lang.String r2 = "px"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
            r1 = r5
            goto L68
        L53:
            java.lang.String r2 = "em"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
            r1 = r4
            goto L68
        L5d:
            java.lang.String r2 = "%"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L67
            r1 = 0
            goto L68
        L67:
            r1 = -1
        L68:
            if (r1 == 0) goto L7c
            if (r1 == r4) goto L78
            if (r1 != r5) goto L72
            r6.setFontSizeUnit(r4)
            goto L80
        L72:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L78:
            r6.setFontSizeUnit(r5)
            goto L80
        L7c:
            r5 = 3
            r6.setFontSizeUnit(r5)
        L80:
            java.lang.String r5 = r0.group(r4)
            java.lang.Object r5 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r5)
            java.lang.String r5 = (java.lang.String) r5
            float r5 = java.lang.Float.parseFloat(r5)
            r6.setFontSize(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttCssParser.parseFontSize(java.lang.String, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle):void");
    }

    private void applySelectorToStyle(WebvttCssStyle webvttCssStyle, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = VOICE_NAME_PATTERN.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice((String) Assertions.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrSplit = Util.split(str, "\\.");
        String str2 = strArrSplit[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, iIndexOf2));
            webvttCssStyle.setTargetId(str2.substring(iIndexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (strArrSplit.length > 1) {
            webvttCssStyle.setTargetClasses((String[]) Util.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length));
        }
    }
}
