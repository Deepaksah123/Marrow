package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class TokenBuffer1 {
    public final boolean AudioAttributesCompatParcelizer;
    public final boolean AudioAttributesImplApi21Parcelizer;
    public final Integer AudioAttributesImplApi26Parcelizer;
    public final boolean AudioAttributesImplBaseParcelizer;
    public final float IconCompatParcelizer;
    public final String MediaBrowserCompatCustomActionResultReceiver;
    public final Integer MediaBrowserCompatItemReceiver;
    public final int RemoteActionCompatParcelizer;
    public final boolean read;
    public final int write;

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return i == 1 || i == 3;
    }

    private static boolean read(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private TokenBuffer1(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = num;
        this.MediaBrowserCompatItemReceiver = num2;
        this.IconCompatParcelizer = f;
        this.AudioAttributesCompatParcelizer = z;
        this.read = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.AudioAttributesImplBaseParcelizer = z4;
        this.write = i2;
    }

    public static TokenBuffer1 write(String str, write writeVar) {
        buildTypeSerializer.IconCompatParcelizer(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        if (strArrSplit.length != writeVar.AudioAttributesImplApi26Parcelizer) {
            prune.RemoteActionCompatParcelizer("SsaStyle", LaissezFaireSubTypeValidator.read("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(writeVar.AudioAttributesImplApi26Parcelizer), Integer.valueOf(strArrSplit.length), str));
            return null;
        }
        try {
            return new TokenBuffer1(strArrSplit[writeVar.AudioAttributesImplBaseParcelizer].trim(), writeVar.read != -1 ? IconCompatParcelizer(strArrSplit[writeVar.read].trim()) : -1, writeVar.MediaBrowserCompatItemReceiver != -1 ? read(strArrSplit[writeVar.MediaBrowserCompatItemReceiver].trim()) : null, writeVar.MediaBrowserCompatCustomActionResultReceiver != -1 ? read(strArrSplit[writeVar.MediaBrowserCompatCustomActionResultReceiver].trim()) : null, writeVar.RemoteActionCompatParcelizer != -1 ? MediaBrowserCompatItemReceiver(strArrSplit[writeVar.RemoteActionCompatParcelizer].trim()) : -3.4028235E38f, writeVar.IconCompatParcelizer != -1 && AudioAttributesCompatParcelizer(strArrSplit[writeVar.IconCompatParcelizer].trim()), writeVar.AudioAttributesCompatParcelizer != -1 && AudioAttributesCompatParcelizer(strArrSplit[writeVar.AudioAttributesCompatParcelizer].trim()), writeVar.MediaBrowserCompatMediaItem != -1 && AudioAttributesCompatParcelizer(strArrSplit[writeVar.MediaBrowserCompatMediaItem].trim()), writeVar.AudioAttributesImplApi21Parcelizer != -1 && AudioAttributesCompatParcelizer(strArrSplit[writeVar.AudioAttributesImplApi21Parcelizer].trim()), writeVar.write != -1 ? write(strArrSplit[writeVar.write].trim()) : -1);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder("Skipping malformed 'Style:' line: '");
            sb.append(str);
            sb.append("'");
            prune.write("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (read(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        prune.RemoteActionCompatParcelizer("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
        return -1;
    }

    private static int write(String str) {
        try {
            int i = Integer.parseInt(str.trim());
            if (AudioAttributesCompatParcelizer(i)) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        prune.RemoteActionCompatParcelizer("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(str)));
        return -1;
    }

    private static Integer read(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            long j2 = -1;
            buildTypeSerializer.IconCompatParcelizer(j <= ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32))));
            return Integer.valueOf(Color.argb(parseTextAttribute.RemoteActionCompatParcelizer(((j >> 24) & 255) ^ 255), parseTextAttribute.RemoteActionCompatParcelizer(j & 255), parseTextAttribute.RemoteActionCompatParcelizer((j >> 8) & 255), parseTextAttribute.RemoteActionCompatParcelizer((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            prune.write("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    private static float MediaBrowserCompatItemReceiver(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Failed to parse font size: '");
            sb.append(str);
            sb.append("'");
            prune.write("SsaStyle", sb.toString(), e);
            return -3.4028235E38f;
        }
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            prune.write("SsaStyle", sb.toString(), e);
            return false;
        }
    }

    static final class write {
        public final int AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi21Parcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final int AudioAttributesImplBaseParcelizer;
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompatCustomActionResultReceiver;
        public final int MediaBrowserCompatItemReceiver;
        public final int MediaBrowserCompatMediaItem;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        private write(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.AudioAttributesImplBaseParcelizer = i;
            this.read = i2;
            this.MediaBrowserCompatItemReceiver = i3;
            this.MediaBrowserCompatCustomActionResultReceiver = i4;
            this.RemoteActionCompatParcelizer = i5;
            this.IconCompatParcelizer = i6;
            this.AudioAttributesCompatParcelizer = i7;
            this.MediaBrowserCompatMediaItem = i8;
            this.AudioAttributesImplApi21Parcelizer = i9;
            this.write = i10;
            this.AudioAttributesImplApi26Parcelizer = i11;
        }

        public static write write(String str) {
            byte b;
            String[] strArrSplit = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                String str2 = parseMdhd.read(strArrSplit[i11].trim());
                str2.hashCode();
                switch (str2.hashCode()) {
                    case -1178781136:
                        b = str2.equals(TtmlNode.ITALIC) ? (byte) 0 : (byte) -1;
                        break;
                    case -1026963764:
                        b = str2.equals(TtmlNode.UNDERLINE) ? (byte) 1 : (byte) -1;
                        break;
                    case -192095652:
                        b = str2.equals("strikeout") ? (byte) 2 : (byte) -1;
                        break;
                    case -70925746:
                        b = str2.equals("primarycolour") ? (byte) 3 : (byte) -1;
                        break;
                    case 3029637:
                        b = str2.equals(TtmlNode.BOLD) ? (byte) 4 : (byte) -1;
                        break;
                    case 3373707:
                        b = str2.equals("name") ? (byte) 5 : (byte) -1;
                        break;
                    case 366554320:
                        b = str2.equals("fontsize") ? (byte) 6 : (byte) -1;
                        break;
                    case 767321349:
                        b = str2.equals("borderstyle") ? (byte) 7 : (byte) -1;
                        break;
                    case 1767875043:
                        b = str2.equals("alignment") ? (byte) 8 : (byte) -1;
                        break;
                    case 1988365454:
                        b = str2.equals("outlinecolour") ? (byte) 9 : (byte) -1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                        i7 = i11;
                        break;
                    case 1:
                        i8 = i11;
                        break;
                    case 2:
                        i9 = i11;
                        break;
                    case 3:
                        i3 = i11;
                        break;
                    case 4:
                        i6 = i11;
                        break;
                    case 5:
                        i = i11;
                        break;
                    case 6:
                        i5 = i11;
                        break;
                    case 7:
                        i10 = i11;
                        break;
                    case 8:
                        i2 = i11;
                        break;
                    case 9:
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new write(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, strArrSplit.length);
            }
            return null;
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public final PointF IconCompatParcelizer;
        public final int write;
        private static final Pattern read = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern MediaBrowserCompatCustomActionResultReceiver = Pattern.compile(LaissezFaireSubTypeValidator.read("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile(LaissezFaireSubTypeValidator.read("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("\\\\an(\\d+)");

        private AudioAttributesCompatParcelizer(int i, PointF pointF) {
            this.write = i;
            this.IconCompatParcelizer = pointF;
        }

        public static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str) {
            Matcher matcher = read.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1));
                try {
                    PointF pointF2 = read(str2);
                    if (pointF2 != null) {
                        pointF = pointF2;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int iIconCompatParcelizer = IconCompatParcelizer(str2);
                    if (iIconCompatParcelizer != -1) {
                        i = iIconCompatParcelizer;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new AudioAttributesCompatParcelizer(i, pointF);
        }

        public static String write(String str) {
            return read.matcher(str).replaceAll("");
        }

        private static PointF read(String str) {
            String strGroup;
            String strGroup2;
            Matcher matcher = MediaBrowserCompatCustomActionResultReceiver.matcher(str);
            Matcher matcher2 = AudioAttributesCompatParcelizer.matcher(str);
            boolean zFind = matcher.find();
            boolean zFind2 = matcher2.find();
            if (zFind) {
                if (zFind2) {
                    StringBuilder sb = new StringBuilder("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(str);
                    sb.append("'");
                    prune.write("SsaStyle.Overrides", sb.toString());
                }
                strGroup = matcher.group(1);
                strGroup2 = matcher.group(2);
            } else {
                if (!zFind2) {
                    return null;
                }
                strGroup = matcher2.group(1);
                strGroup2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) buildTypeSerializer.IconCompatParcelizer(strGroup)).trim()), Float.parseFloat(((String) buildTypeSerializer.IconCompatParcelizer(strGroup2)).trim()));
        }

        private static int IconCompatParcelizer(String str) {
            Matcher matcher = RemoteActionCompatParcelizer.matcher(str);
            if (matcher.find()) {
                return TokenBuffer1.IconCompatParcelizer((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
            }
            return -1;
        }
    }
}
