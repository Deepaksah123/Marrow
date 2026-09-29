package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class UrlTemplate {
    private static final String BANDWIDTH = "Bandwidth";
    private static final int BANDWIDTH_ID = 3;
    private static final String DEFAULT_FORMAT_TAG = "%01d";
    private static final String ESCAPED_DOLLAR = "$$";
    private static final String NUMBER = "Number";
    private static final int NUMBER_ID = 2;
    private static final String REPRESENTATION = "RepresentationID";
    private static final int REPRESENTATION_ID = 1;
    private static final String TIME = "Time";
    private static final int TIME_ID = 4;
    private final int identifierCount;
    private final String[] identifierFormatTags;
    private final int[] identifiers;
    private final String[] urlPieces;

    public static UrlTemplate compile(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new UrlTemplate(strArr, iArr, strArr2, parseTemplate(str, strArr, iArr, strArr2));
    }

    private UrlTemplate(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.urlPieces = strArr;
        this.identifiers = iArr;
        this.identifierFormatTags = strArr2;
        this.identifierCount = i;
    }

    public final String buildUri(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.identifierCount;
            if (i2 < i3) {
                sb.append(this.urlPieces[i2]);
                int i4 = this.identifiers[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else if (i4 == 2) {
                    sb.append(String.format(Locale.US, this.identifierFormatTags[i2], Long.valueOf(j)));
                } else if (i4 == 3) {
                    sb.append(String.format(Locale.US, this.identifierFormatTags[i2], Integer.valueOf(i)));
                } else if (i4 == 4) {
                    sb.append(String.format(Locale.US, this.identifierFormatTags[i2], Long.valueOf(j2)));
                }
                i2++;
            } else {
                sb.append(this.urlPieces[i3]);
                return sb.toString();
            }
        }
    }

    private static int parseTemplate(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strSubstring;
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            byte b = -1;
            if (iIndexOf == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i]);
                sb.append(str.substring(length));
                strArr[i] = sb.toString();
                length = str.length();
            } else if (iIndexOf != length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr[i]);
                sb2.append(str.substring(length, iIndexOf));
                strArr[i] = sb2.toString();
                length = iIndexOf;
            } else if (str.startsWith(ESCAPED_DOLLAR, length)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strArr[i]);
                sb3.append("$");
                strArr[i] = sb3.toString();
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = str.indexOf("$", i2);
                String strSubstring2 = str.substring(i2, iIndexOf2);
                if (strSubstring2.equals(REPRESENTATION)) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 == -1) {
                        strSubstring = DEFAULT_FORMAT_TAG;
                    } else {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(strSubstring);
                            sb4.append("d");
                            strSubstring = sb4.toString();
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    }
                    strSubstring2.hashCode();
                    int iHashCode = strSubstring2.hashCode();
                    if (iHashCode != -1950496919) {
                        if (iHashCode != 2606829) {
                            if (iHashCode == 38199441 && strSubstring2.equals("Bandwidth")) {
                                b = 2;
                            }
                        } else if (strSubstring2.equals(TIME)) {
                            b = 1;
                        }
                    } else if (strSubstring2.equals(NUMBER)) {
                        b = 0;
                    }
                    if (b == 0) {
                        iArr[i] = 2;
                    } else if (b == 1) {
                        iArr[i] = 4;
                    } else if (b == 2) {
                        iArr[i] = 3;
                    } else {
                        throw new IllegalArgumentException("Invalid template: ".concat(String.valueOf(str)));
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return i;
    }
}
