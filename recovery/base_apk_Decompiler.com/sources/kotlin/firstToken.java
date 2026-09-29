package kotlin;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class firstToken implements withTimeZone {
    private static final Pattern IconCompatParcelizer = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern write = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder AudioAttributesCompatParcelizer = new StringBuilder();
    private final ArrayList<String> read = new ArrayList<>();
    private final AsPropertyTypeDeserializer RemoteActionCompatParcelizer = new AsPropertyTypeDeserializer();

    @Override // kotlin.withTimeZone
    public final int IconCompatParcelizer() {
        return 1;
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer) {
        Charset charset;
        String str;
        firstToken firsttoken = this;
        firsttoken.RemoteActionCompatParcelizer.IconCompatParcelizer(bArr, i + i2);
        firsttoken.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i);
        Charset charsetWrite = write(firsttoken.RemoteActionCompatParcelizer);
        ArrayList arrayList = (remoteActionCompatParcelizer.IconCompatParcelizer == C.TIME_UNSET || !remoteActionCompatParcelizer.RemoteActionCompatParcelizer) ? null : new ArrayList();
        while (true) {
            String str2 = firsttoken.RemoteActionCompatParcelizer.read(charsetWrite);
            if (str2 == null) {
                break;
            }
            if (str2.length() != 0) {
                try {
                    Integer.parseInt(str2);
                    String str3 = firsttoken.RemoteActionCompatParcelizer.read(charsetWrite);
                    if (str3 == null) {
                        prune.RemoteActionCompatParcelizer("SubripParser", "Unexpected end");
                        break;
                    }
                    Matcher matcher = IconCompatParcelizer.matcher(str3);
                    if (!matcher.matches()) {
                        charset = charsetWrite;
                        prune.RemoteActionCompatParcelizer("SubripParser", "Skipping invalid timing: ".concat(String.valueOf(str3)));
                    } else {
                        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(matcher, 1);
                        long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(matcher, 6);
                        int i3 = 0;
                        firsttoken.AudioAttributesCompatParcelizer.setLength(0);
                        firsttoken.read.clear();
                        for (String str4 = firsttoken.RemoteActionCompatParcelizer.read(charsetWrite); !TextUtils.isEmpty(str4); str4 = firsttoken.RemoteActionCompatParcelizer.read(charsetWrite)) {
                            if (firsttoken.AudioAttributesCompatParcelizer.length() > 0) {
                                firsttoken.AudioAttributesCompatParcelizer.append("<br>");
                            }
                            firsttoken.AudioAttributesCompatParcelizer.append(AudioAttributesCompatParcelizer(str4, firsttoken.read));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(firsttoken.AudioAttributesCompatParcelizer.toString());
                        while (true) {
                            if (i3 >= firsttoken.read.size()) {
                                charset = charsetWrite;
                                str = null;
                                break;
                            } else {
                                str = firsttoken.read.get(i3);
                                if (str.matches("\\{\\\\an[1-9]\\}")) {
                                    charset = charsetWrite;
                                    break;
                                }
                                i3++;
                            }
                        }
                        if (remoteActionCompatParcelizer.IconCompatParcelizer == C.TIME_UNSET || jRemoteActionCompatParcelizer >= remoteActionCompatParcelizer.IconCompatParcelizer) {
                            typeSerializer.read(new pad3(initExtraTracks.read(read(spannedFromHtml, str)), jRemoteActionCompatParcelizer, jRemoteActionCompatParcelizer2 - jRemoteActionCompatParcelizer));
                        } else if (arrayList != null) {
                            arrayList.add(new pad3(initExtraTracks.read(read(spannedFromHtml, str)), jRemoteActionCompatParcelizer, jRemoteActionCompatParcelizer2 - jRemoteActionCompatParcelizer));
                        }
                    }
                } catch (NumberFormatException unused) {
                    charset = charsetWrite;
                    prune.RemoteActionCompatParcelizer("SubripParser", "Skipping invalid index: ".concat(String.valueOf(str2)));
                }
            } else {
                charset = charsetWrite;
            }
            firsttoken = this;
            charsetWrite = charset;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                typeSerializer.read((pad3) it.next());
            }
        }
    }

    private static Charset write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        Charset charsetOnPrepareFromMediaId = asPropertyTypeDeserializer.onPrepareFromMediaId();
        return charsetOnPrepareFromMediaId != null ? charsetOnPrepareFromMediaId : parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer;
    }

    private static String AudioAttributesCompatParcelizer(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = write.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin.getDefaultImpl read(android.text.Spanned r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.firstToken.read(android.text.Spanned, java.lang.String):o.getDefaultImpl");
    }

    private static long RemoteActionCompatParcelizer(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(i + 3))) * 1000);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    private static float AudioAttributesCompatParcelizer(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }
}
