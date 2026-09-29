package kotlin;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class TokenBufferReadContext {
    private static final Pattern read = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern IconCompatParcelizer = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final AsPropertyTypeDeserializer write = new AsPropertyTypeDeserializer();
    private final StringBuilder RemoteActionCompatParcelizer = new StringBuilder();

    public final List<hasIds> IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        this.RemoteActionCompatParcelizer.setLength(0);
        int iWrite = asPropertyTypeDeserializer.write();
        RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
        this.write.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write());
        this.write.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = read(this.write, this.RemoteActionCompatParcelizer);
            if (str == null || !"{".equals(RemoteActionCompatParcelizer(this.write, this.RemoteActionCompatParcelizer))) {
                break;
            }
            hasIds hasids = new hasIds();
            AudioAttributesCompatParcelizer(hasids, str);
            String str2 = null;
            boolean z = false;
            while (!z) {
                int iWrite2 = this.write.write();
                String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.write, this.RemoteActionCompatParcelizer);
                boolean z2 = strRemoteActionCompatParcelizer == null || "}".equals(strRemoteActionCompatParcelizer);
                if (!z2) {
                    this.write.MediaBrowserCompatCustomActionResultReceiver(iWrite2);
                    IconCompatParcelizer(this.write, hasids, this.RemoteActionCompatParcelizer);
                }
                str2 = strRemoteActionCompatParcelizer;
                z = z2;
            }
            if ("}".equals(str2)) {
                arrayList.add(hasids);
            }
        }
        return arrayList;
    }

    private static String read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, StringBuilder sb) {
        AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer);
        if (asPropertyTypeDeserializer.IconCompatParcelizer() < 5 || !"::cue".equals(asPropertyTypeDeserializer.read(5))) {
            return null;
        }
        int iWrite = asPropertyTypeDeserializer.write();
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer, sb);
        if (strRemoteActionCompatParcelizer == null) {
            return null;
        }
        if ("{".equals(strRemoteActionCompatParcelizer)) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            return "";
        }
        String strAudioAttributesCompatParcelizer = "(".equals(strRemoteActionCompatParcelizer) ? AudioAttributesCompatParcelizer(asPropertyTypeDeserializer) : null;
        if (")".equals(RemoteActionCompatParcelizer(asPropertyTypeDeserializer, sb))) {
            return strAudioAttributesCompatParcelizer;
        }
        return null;
    }

    private static String AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iWrite = asPropertyTypeDeserializer.write();
        int i = asPropertyTypeDeserializer.read();
        boolean z = false;
        while (iWrite < i && !z) {
            z = ((char) asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[iWrite]) == ')';
            iWrite++;
        }
        return asPropertyTypeDeserializer.read((iWrite - 1) - asPropertyTypeDeserializer.write()).trim();
    }

    private static void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, hasIds hasids, StringBuilder sb) {
        AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer);
        String strWrite = write(asPropertyTypeDeserializer, sb);
        if ("".equals(strWrite) || !":".equals(RemoteActionCompatParcelizer(asPropertyTypeDeserializer, sb))) {
            return;
        }
        AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer);
        String strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, sb);
        if (strAudioAttributesCompatParcelizer == null || "".equals(strAudioAttributesCompatParcelizer)) {
            return;
        }
        int iWrite = asPropertyTypeDeserializer.write();
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer, sb);
        if (!";".equals(strRemoteActionCompatParcelizer)) {
            if (!"}".equals(strRemoteActionCompatParcelizer)) {
                return;
            } else {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            }
        }
        if (TtmlNode.ATTR_TTS_COLOR.equals(strWrite)) {
            hasids.write(withDefaultImpl.read(strAudioAttributesCompatParcelizer));
            return;
        }
        if ("background-color".equals(strWrite)) {
            hasids.read(withDefaultImpl.read(strAudioAttributesCompatParcelizer));
            return;
        }
        boolean z = true;
        if ("ruby-position".equals(strWrite)) {
            if ("over".equals(strAudioAttributesCompatParcelizer)) {
                hasids.RemoteActionCompatParcelizer(1);
                return;
            } else {
                if ("under".equals(strAudioAttributesCompatParcelizer)) {
                    hasids.RemoteActionCompatParcelizer(2);
                    return;
                }
                return;
            }
        }
        if ("text-combine-upright".equals(strWrite)) {
            if (!"all".equals(strAudioAttributesCompatParcelizer) && !strAudioAttributesCompatParcelizer.startsWith("digits")) {
                z = false;
            }
            hasids.read(z);
            return;
        }
        if ("text-decoration".equals(strWrite)) {
            if (TtmlNode.UNDERLINE.equals(strAudioAttributesCompatParcelizer)) {
                hasids.MediaBrowserCompatSearchResultReceiver();
                return;
            }
            return;
        }
        if ("font-family".equals(strWrite)) {
            hasids.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer);
            return;
        }
        if ("font-weight".equals(strWrite)) {
            if (TtmlNode.BOLD.equals(strAudioAttributesCompatParcelizer)) {
                hasids.RatingCompat();
            }
        } else if ("font-style".equals(strWrite)) {
            if (TtmlNode.ITALIC.equals(strAudioAttributesCompatParcelizer)) {
                hasids.MediaMetadataCompat();
            }
        } else if ("font-size".equals(strWrite)) {
            RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer, hasids);
        }
    }

    private static void AudioAttributesImplBaseParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        while (true) {
            for (boolean z = true; asPropertyTypeDeserializer.IconCompatParcelizer() > 0 && z; z = false) {
                if (read(asPropertyTypeDeserializer) || write(asPropertyTypeDeserializer)) {
                    break;
                }
            }
            return;
        }
    }

    private static String RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, StringBuilder sb) {
        AudioAttributesImplBaseParcelizer(asPropertyTypeDeserializer);
        if (asPropertyTypeDeserializer.IconCompatParcelizer() == 0) {
            return null;
        }
        String strWrite = write(asPropertyTypeDeserializer, sb);
        if (!"".equals(strWrite)) {
            return strWrite;
        }
        StringBuilder sb2 = new StringBuilder("");
        sb2.append((char) asPropertyTypeDeserializer.onPlayFromMediaId());
        return sb2.toString();
    }

    private static boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        char cIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer, asPropertyTypeDeserializer.write());
        if (cIconCompatParcelizer != '\t' && cIconCompatParcelizer != '\n' && cIconCompatParcelizer != '\f' && cIconCompatParcelizer != '\r' && cIconCompatParcelizer != ' ') {
            return false;
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        return true;
    }

    private static void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        while (!TextUtils.isEmpty(asPropertyTypeDeserializer.MediaBrowserCompatMediaItem())) {
        }
    }

    private static char IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        return (char) asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[i];
    }

    private static String AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int iWrite = asPropertyTypeDeserializer.write();
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer, sb);
            if (strRemoteActionCompatParcelizer == null) {
                return null;
            }
            if ("}".equals(strRemoteActionCompatParcelizer) || ";".equals(strRemoteActionCompatParcelizer)) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                z = true;
            } else {
                sb2.append(strRemoteActionCompatParcelizer);
            }
        }
        return sb2.toString();
    }

    private static boolean write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iWrite = asPropertyTypeDeserializer.write();
        int i = asPropertyTypeDeserializer.read();
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        int i2 = iWrite + 2;
        if (i2 > i || bArrRemoteActionCompatParcelizer[iWrite] != 47 || bArrRemoteActionCompatParcelizer[iWrite + 1] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 < i) {
                if (((char) bArrRemoteActionCompatParcelizer[i2]) == '*' && ((char) bArrRemoteActionCompatParcelizer[i3]) == '/') {
                    i2 += 2;
                    i = i2;
                } else {
                    i2 = i3;
                }
            } else {
                asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(i - asPropertyTypeDeserializer.write());
                return true;
            }
        }
    }

    private static String write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int iWrite = asPropertyTypeDeserializer.write();
        int i = asPropertyTypeDeserializer.read();
        while (iWrite < i && !z) {
            char c = (char) asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[iWrite];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                iWrite++;
                sb.append(c);
            }
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(iWrite - asPropertyTypeDeserializer.write());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void RemoteActionCompatParcelizer(java.lang.String r5, kotlin.hasIds r6) {
        /*
            java.util.regex.Pattern r0 = kotlin.TokenBufferReadContext.IconCompatParcelizer
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
            kotlin.prune.RemoteActionCompatParcelizer(r6, r5)
            return
        L29:
            r5 = 2
            java.lang.String r1 = r0.group(r5)
            java.lang.Object r1 = kotlin.buildTypeSerializer.IconCompatParcelizer(r1)
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
            r6.IconCompatParcelizer(r4)
            goto L80
        L72:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L78:
            r6.IconCompatParcelizer(r5)
            goto L80
        L7c:
            r5 = 3
            r6.IconCompatParcelizer(r5)
        L80:
            java.lang.String r5 = r0.group(r4)
            java.lang.Object r5 = kotlin.buildTypeSerializer.IconCompatParcelizer(r5)
            java.lang.String r5 = (java.lang.String) r5
            float r5 = java.lang.Float.parseFloat(r5)
            r6.RemoteActionCompatParcelizer(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TokenBufferReadContext.RemoteActionCompatParcelizer(java.lang.String, o.hasIds):void");
    }

    private static void AudioAttributesCompatParcelizer(hasIds hasids, String str) {
        if ("".equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = read.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                hasids.read((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(str, "\\.");
        String str2 = strArrAudioAttributesCompatParcelizer[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            hasids.write(str2.substring(0, iIndexOf2));
            hasids.RemoteActionCompatParcelizer(str2.substring(iIndexOf2 + 1));
        } else {
            hasids.write(str2);
        }
        if (strArrAudioAttributesCompatParcelizer.length > 1) {
            hasids.AudioAttributesCompatParcelizer((String[]) LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(strArrAudioAttributesCompatParcelizer, strArrAudioAttributesCompatParcelizer.length));
        }
    }
}
