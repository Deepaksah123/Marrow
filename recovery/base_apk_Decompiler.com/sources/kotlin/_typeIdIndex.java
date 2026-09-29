package kotlin;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin._typeIdIndex;
import kotlin.getDefaultImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class _typeIdIndex {
    private static final Map<String, Integer> AudioAttributesCompatParcelizer;
    public static final Pattern IconCompatParcelizer = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern read = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> write;

    private static int AudioAttributesCompatParcelizer(int i, int i2) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        return 1;
    }

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        write = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        AudioAttributesCompatParcelizer = Collections.unmodifiableMap(map2);
    }

    public static findTypeId RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, List<hasIds> list) {
        String strMediaBrowserCompatMediaItem = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem();
        if (strMediaBrowserCompatMediaItem == null) {
            return null;
        }
        Pattern pattern = IconCompatParcelizer;
        Matcher matcher = pattern.matcher(strMediaBrowserCompatMediaItem);
        if (matcher.matches()) {
            return IconCompatParcelizer((String) null, matcher, asPropertyTypeDeserializer, list);
        }
        String strMediaBrowserCompatMediaItem2 = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem();
        if (strMediaBrowserCompatMediaItem2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(strMediaBrowserCompatMediaItem2);
        if (matcher2.matches()) {
            return IconCompatParcelizer(strMediaBrowserCompatMediaItem.trim(), matcher2, asPropertyTypeDeserializer, list);
        }
        return null;
    }

    static getDefaultImpl.write write(String str) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(str, remoteActionCompatParcelizer);
        return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public static getDefaultImpl RemoteActionCompatParcelizer(CharSequence charSequence) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = charSequence;
        return remoteActionCompatParcelizer.AudioAttributesCompatParcelizer().write();
    }

    static SpannedString IconCompatParcelizer(String str, String str2, List<hasIds> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        byte b = 0;
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    write(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt == '<') {
                int iWrite = i + 1;
                if (iWrite < str2.length()) {
                    boolean z = str2.charAt(iWrite) == '/';
                    iWrite = write(str2, iWrite);
                    int i2 = iWrite - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = z ? 2 : 1;
                    if (!z2) {
                        i2 = iWrite - 1;
                    }
                    String strSubstring = str2.substring(i + i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(strSubstring);
                        if (IconCompatParcelizer(strRemoteActionCompatParcelizer)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) arrayDeque.pop();
                                    RemoteActionCompatParcelizer(str, iconCompatParcelizer, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new read(iconCompatParcelizer, spannableStringBuilder.length(), b));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (iconCompatParcelizer.IconCompatParcelizer.equals(strRemoteActionCompatParcelizer)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(IconCompatParcelizer.RemoteActionCompatParcelizer(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iWrite;
            } else {
                spannableStringBuilder.append(cCharAt);
                i++;
            }
        }
        while (!arrayDeque.isEmpty()) {
            RemoteActionCompatParcelizer(str, (IconCompatParcelizer) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        RemoteActionCompatParcelizer(str, IconCompatParcelizer.AudioAttributesCompatParcelizer(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    private static findTypeId IconCompatParcelizer(String str, Matcher matcher, AsPropertyTypeDeserializer asPropertyTypeDeserializer, List<hasIds> list) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        try {
            remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = updateForValue.write((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1)));
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer = updateForValue.write((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(2)));
            RemoteActionCompatParcelizer((String) buildTypeSerializer.IconCompatParcelizer(matcher.group(3)), remoteActionCompatParcelizer);
            StringBuilder sb = new StringBuilder();
            String strMediaBrowserCompatMediaItem = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem();
            while (!TextUtils.isEmpty(strMediaBrowserCompatMediaItem)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strMediaBrowserCompatMediaItem.trim());
                strMediaBrowserCompatMediaItem = asPropertyTypeDeserializer.MediaBrowserCompatMediaItem();
            }
            remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer = IconCompatParcelizer(str, sb.toString(), list);
            return remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            prune.RemoteActionCompatParcelizer("WebvttCueParser", sb2.toString());
            return null;
        }
    }

    private static void RemoteActionCompatParcelizer(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Matcher matcher = read.matcher(str);
        while (matcher.find()) {
            String str2 = (String) buildTypeSerializer.IconCompatParcelizer(matcher.group(1));
            String str3 = (String) buildTypeSerializer.IconCompatParcelizer(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    IconCompatParcelizer(str3, remoteActionCompatParcelizer);
                } else if ("align".equals(str2)) {
                    remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer = MediaBrowserCompatItemReceiver(str3);
                } else if ("position".equals(str2)) {
                    write(str3, remoteActionCompatParcelizer);
                } else if ("size".equals(str2)) {
                    remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver = updateForValue.RemoteActionCompatParcelizer(str3);
                } else if ("vertical".equals(str2)) {
                    remoteActionCompatParcelizer.MediaMetadataCompat = AudioAttributesImplBaseParcelizer(str3);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cue setting ");
                    sb.append(str2);
                    sb.append(":");
                    sb.append(str3);
                    prune.RemoteActionCompatParcelizer("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder("Skipping bad cue setting: ");
                sb2.append(matcher.group());
                prune.RemoteActionCompatParcelizer("WebvttCueParser", sb2.toString());
            }
        }
    }

    private static void IconCompatParcelizer(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            remoteActionCompatParcelizer.write = read(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            remoteActionCompatParcelizer.IconCompatParcelizer = updateForValue.RemoteActionCompatParcelizer(str);
            remoteActionCompatParcelizer.read = 0;
        } else {
            remoteActionCompatParcelizer.IconCompatParcelizer = Integer.parseInt(str);
            remoteActionCompatParcelizer.read = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int read(java.lang.String r5) {
        /*
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L2d;
                case -1074341483: goto L23;
                case 100571: goto L19;
                case 109757538: goto Lf;
                default: goto Le;
            }
        Le:
            goto L37
        Lf:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            r0 = r2
            goto L38
        L19:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            r0 = r3
            goto L38
        L23:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            r0 = r4
            goto L38
        L2d:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            r0 = r1
            goto L38
        L37:
            r0 = -1
        L38:
            if (r0 == 0) goto L54
            if (r0 == r4) goto L54
            if (r0 == r3) goto L53
            if (r0 == r2) goto L52
            java.lang.String r0 = "Invalid anchor value: "
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r0.concat(r5)
            java.lang.String r0 = "WebvttCueParser"
            kotlin.prune.RemoteActionCompatParcelizer(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L52:
            return r1
        L53:
            return r3
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._typeIdIndex.read(java.lang.String):int");
    }

    private static void write(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer = AudioAttributesCompatParcelizer(str.substring(iIndexOf + 1));
            str = str.substring(0, iIndexOf);
        }
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer = updateForValue.RemoteActionCompatParcelizer(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int AudioAttributesCompatParcelizer(java.lang.String r7) {
        /*
            r7.hashCode()
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1842484672: goto L43;
                case -1364013995: goto L39;
                case -1276788989: goto L2f;
                case -1074341483: goto L25;
                case 100571: goto L1b;
                case 109757538: goto L11;
                default: goto L10;
            }
        L10:
            goto L4d
        L11:
            java.lang.String r0 = "start"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4d
            r0 = r2
            goto L4e
        L1b:
            java.lang.String r0 = "end"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4d
            r0 = r3
            goto L4e
        L25:
            java.lang.String r0 = "middle"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4d
            r0 = r4
            goto L4e
        L2f:
            java.lang.String r0 = "line-right"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4d
            r0 = r5
            goto L4e
        L39:
            java.lang.String r0 = "center"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4d
            r0 = r6
            goto L4e
        L43:
            java.lang.String r0 = "line-left"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4d
            r0 = r1
            goto L4e
        L4d:
            r0 = -1
        L4e:
            if (r0 == 0) goto L6e
            if (r0 == r6) goto L6d
            if (r0 == r5) goto L6c
            if (r0 == r4) goto L6d
            if (r0 == r3) goto L6c
            if (r0 == r2) goto L6e
            java.lang.String r0 = "Invalid anchor value: "
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r0.concat(r7)
            java.lang.String r0 = "WebvttCueParser"
            kotlin.prune.RemoteActionCompatParcelizer(r0, r7)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            return r7
        L6c:
            return r5
        L6d:
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._typeIdIndex.AudioAttributesCompatParcelizer(java.lang.String):int");
    }

    private static int AudioAttributesImplBaseParcelizer(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        prune.RemoteActionCompatParcelizer("WebvttCueParser", "Invalid 'vertical' value: ".concat(String.valueOf(str)));
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int MediaBrowserCompatItemReceiver(java.lang.String r6) {
        /*
            r6.hashCode()
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            switch(r0) {
                case -1364013995: goto L42;
                case -1074341483: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L4c
        L10:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4c
            r0 = r1
            goto L4d
        L1a:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4c
            r0 = r2
            goto L4d
        L24:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4c
            r0 = r3
            goto L4d
        L2e:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4c
            r0 = r5
            goto L4d
        L38:
            java.lang.String r0 = "middle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4c
            r0 = r4
            goto L4d
        L42:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4c
            r0 = 0
            goto L4d
        L4c:
            r0 = -1
        L4d:
            if (r0 == 0) goto L6d
            if (r0 == r4) goto L6d
            if (r0 == r5) goto L6c
            if (r0 == r3) goto L6b
            if (r0 == r2) goto L6a
            if (r0 == r1) goto L69
            java.lang.String r0 = "Invalid alignment value: "
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r0.concat(r6)
            java.lang.String r0 = "WebvttCueParser"
            kotlin.prune.RemoteActionCompatParcelizer(r0, r6)
            return r5
        L69:
            return r4
        L6a:
            return r1
        L6b:
            return r2
        L6c:
            return r3
        L6d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._typeIdIndex.MediaBrowserCompatItemReceiver(java.lang.String):int");
    }

    private static int write(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void write(java.lang.String r5, android.text.SpannableStringBuilder r6) {
        /*
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L3b
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L31
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L27
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L1d
            goto L45
        L1d:
            java.lang.String r0 = "nbsp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L45
            r0 = r2
            goto L46
        L27:
            java.lang.String r0 = "amp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L45
            r0 = r3
            goto L46
        L31:
            java.lang.String r0 = "lt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L45
            r0 = r4
            goto L46
        L3b:
            java.lang.String r0 = "gt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L45
            r0 = 0
            goto L46
        L45:
            r0 = -1
        L46:
            if (r0 == 0) goto L79
            if (r0 == r4) goto L73
            if (r0 == r3) goto L6d
            if (r0 == r2) goto L67
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = ";'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCueParser"
            kotlin.prune.RemoteActionCompatParcelizer(r6, r5)
            return
        L67:
            r5 = 32
            r6.append(r5)
            return
        L6d:
            r5 = 38
            r6.append(r5)
            return
        L73:
            r5 = 60
            r6.append(r5)
            return
        L79:
            r5 = 62
            r6.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._typeIdIndex.write(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean IconCompatParcelizer(java.lang.String r4) {
        /*
            r4.hashCode()
            int r0 = r4.hashCode()
            r1 = 98
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L72
            r1 = 99
            if (r0 == r1) goto L68
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L5e
            r1 = 3650(0xe42, float:5.115E-42)
            if (r0 == r1) goto L54
            r1 = 3314158(0x3291ee, float:4.644125E-39)
            if (r0 == r1) goto L4a
            r1 = 3511770(0x3595da, float:4.921038E-39)
            if (r0 == r1) goto L40
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L36
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L2c
            goto L7c
        L2c:
            java.lang.String r0 = "v"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7c
            r4 = 4
            goto L7d
        L36:
            java.lang.String r0 = "u"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7c
            r4 = 3
            goto L7d
        L40:
            java.lang.String r0 = "ruby"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7c
            r4 = 7
            goto L7d
        L4a:
            java.lang.String r0 = "lang"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7c
            r4 = 6
            goto L7d
        L54:
            java.lang.String r0 = "rt"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7c
            r4 = 5
            goto L7d
        L5e:
            java.lang.String r0 = "i"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7c
            r4 = 2
            goto L7d
        L68:
            java.lang.String r0 = "c"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7c
            r4 = r2
            goto L7d
        L72:
            java.lang.String r0 = "b"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L7c
            r4 = r3
            goto L7d
        L7c:
            r4 = -1
        L7d:
            switch(r4) {
                case 0: goto L81;
                case 1: goto L81;
                case 2: goto L81;
                case 3: goto L81;
                case 4: goto L81;
                case 5: goto L81;
                case 6: goto L81;
                case 7: goto L81;
                default: goto L80;
            }
        L80:
            return r3
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._typeIdIndex.IconCompatParcelizer(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void RemoteActionCompatParcelizer(java.lang.String r8, o._typeIdIndex.IconCompatParcelizer r9, java.util.List<o._typeIdIndex.read> r10, android.text.SpannableStringBuilder r11, java.util.List<kotlin.hasIds> r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._typeIdIndex.RemoteActionCompatParcelizer(java.lang.String, o._typeIdIndex$IconCompatParcelizer, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    private static void write(SpannableStringBuilder spannableStringBuilder, String str, IconCompatParcelizer iconCompatParcelizer, List<read> list, List<hasIds> list2) {
        int iIconCompatParcelizer = IconCompatParcelizer(list2, str, iconCompatParcelizer);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, read.RemoteActionCompatParcelizer);
        int i = iconCompatParcelizer.read;
        int length = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if ("rt".equals(((read) arrayList.get(i2)).write.IconCompatParcelizer)) {
                read readVar = (read) arrayList.get(i2);
                int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(IconCompatParcelizer(list2, str, readVar.write), iIconCompatParcelizer);
                int i3 = readVar.write.read - length;
                int i4 = readVar.IconCompatParcelizer - length;
                CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i3, i4);
                spannableStringBuilder.delete(i3, i4);
                spannableStringBuilder.setSpan(new getDescForKnownTypeIds(charSequenceSubSequence.toString(), iAudioAttributesCompatParcelizer), i, i3, 33);
                length += charSequenceSubSequence.length();
                i = i3;
            }
        }
    }

    private static int IconCompatParcelizer(List<hasIds> list, String str, IconCompatParcelizer iconCompatParcelizer) {
        List<AudioAttributesCompatParcelizer> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(list, str, iconCompatParcelizer);
        for (int i = 0; i < listAudioAttributesCompatParcelizer.size(); i++) {
            hasIds hasids = listAudioAttributesCompatParcelizer.get(i).IconCompatParcelizer;
            if (hasids.MediaBrowserCompatItemReceiver() != -1) {
                return hasids.MediaBrowserCompatItemReceiver();
            }
        }
        return -1;
    }

    private static void IconCompatParcelizer(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String str : set) {
            Map<String, Integer> map = write;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = AudioAttributesCompatParcelizer;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str).intValue()), i, i2, 33);
                }
            }
        }
    }

    private static void RemoteActionCompatParcelizer(SpannableStringBuilder spannableStringBuilder, hasIds hasids, int i, int i2) {
        if (hasids != null) {
            if (hasids.MediaBrowserCompatCustomActionResultReceiver() != -1) {
                idFromValueAndType.RemoteActionCompatParcelizer(spannableStringBuilder, new StyleSpan(hasids.MediaBrowserCompatCustomActionResultReceiver()), i, i2);
            }
            if (hasids.MediaBrowserCompatMediaItem()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (hasids.MediaDescriptionCompat()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (hasids.AudioAttributesImplBaseParcelizer()) {
                idFromValueAndType.RemoteActionCompatParcelizer(spannableStringBuilder, new ForegroundColorSpan(hasids.read()), i, i2);
            }
            if (hasids.AudioAttributesImplApi21Parcelizer()) {
                idFromValueAndType.RemoteActionCompatParcelizer(spannableStringBuilder, new BackgroundColorSpan(hasids.IconCompatParcelizer()), i, i2);
            }
            if (hasids.write() != null) {
                idFromValueAndType.RemoteActionCompatParcelizer(spannableStringBuilder, new TypefaceSpan(hasids.write()), i, i2);
            }
            int iAudioAttributesImplApi26Parcelizer = hasids.AudioAttributesImplApi26Parcelizer();
            if (iAudioAttributesImplApi26Parcelizer == 1) {
                idFromValueAndType.RemoteActionCompatParcelizer(spannableStringBuilder, new AbsoluteSizeSpan((int) hasids.RemoteActionCompatParcelizer(), true), i, i2);
            } else if (iAudioAttributesImplApi26Parcelizer == 2) {
                idFromValueAndType.RemoteActionCompatParcelizer(spannableStringBuilder, new RelativeSizeSpan(hasids.RemoteActionCompatParcelizer()), i, i2);
            } else if (iAudioAttributesImplApi26Parcelizer == 3) {
                idFromValueAndType.RemoteActionCompatParcelizer(spannableStringBuilder, new RelativeSizeSpan(hasids.RemoteActionCompatParcelizer() / 100.0f), i, i2);
            }
            if (hasids.AudioAttributesCompatParcelizer()) {
                spannableStringBuilder.setSpan(new TypeDeserializer1(), i, i2, 33);
            }
        }
    }

    private static String RemoteActionCompatParcelizer(String str) {
        String strTrim = str.trim();
        buildTypeSerializer.IconCompatParcelizer(!strTrim.isEmpty());
        return LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(strTrim, "[ \\.]")[0];
    }

    private static List<AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer(List<hasIds> list, String str, IconCompatParcelizer iconCompatParcelizer) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            hasIds hasids = list.get(i);
            int iAudioAttributesCompatParcelizer = hasids.AudioAttributesCompatParcelizer(str, iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer);
            if (iAudioAttributesCompatParcelizer > 0) {
                arrayList.add(new AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, hasids));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    static final class RemoteActionCompatParcelizer {
        public CharSequence AudioAttributesImplBaseParcelizer;
        public long MediaBrowserCompatCustomActionResultReceiver = 0;
        public long RemoteActionCompatParcelizer = 0;
        public int AudioAttributesImplApi21Parcelizer = 2;
        public float IconCompatParcelizer = -3.4028235E38f;
        public int read = 1;
        public int write = 0;
        public float AudioAttributesCompatParcelizer = -3.4028235E38f;
        public int AudioAttributesImplApi26Parcelizer = Integer.MIN_VALUE;
        public float MediaBrowserCompatItemReceiver = 1.0f;
        public int MediaMetadataCompat = Integer.MIN_VALUE;

        private static float AudioAttributesCompatParcelizer(float f, int i) {
            if (f == -3.4028235E38f || i != 0 || (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static int AudioAttributesCompatParcelizer(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        private static float read(int i) {
            return i != 4 ? i != 5 ? 0.5f : 1.0f : BitmapDescriptorFactory.HUE_RED;
        }

        public final findTypeId RemoteActionCompatParcelizer() {
            return new findTypeId(AudioAttributesCompatParcelizer().write(), this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer);
        }

        public final getDefaultImpl.write AudioAttributesCompatParcelizer() {
            float f = this.AudioAttributesCompatParcelizer;
            if (f == -3.4028235E38f) {
                f = read(this.AudioAttributesImplApi21Parcelizer);
            }
            int iAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
            if (iAudioAttributesCompatParcelizer == Integer.MIN_VALUE) {
                iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            }
            getDefaultImpl.write writeVarRemoteActionCompatParcelizer = new getDefaultImpl.write().AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)).write(AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.read), this.read).read(this.write).RemoteActionCompatParcelizer(f).IconCompatParcelizer(iAudioAttributesCompatParcelizer).read(Math.min(this.MediaBrowserCompatItemReceiver, IconCompatParcelizer(iAudioAttributesCompatParcelizer, f))).RemoteActionCompatParcelizer(this.MediaMetadataCompat);
            CharSequence charSequence = this.AudioAttributesImplBaseParcelizer;
            if (charSequence != null) {
                writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(charSequence);
            }
            return writeVarRemoteActionCompatParcelizer;
        }

        private static Layout.Alignment RemoteActionCompatParcelizer(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            prune.RemoteActionCompatParcelizer("WebvttCueParser", "Unknown textAlignment: ".concat(String.valueOf(i)));
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        private static float IconCompatParcelizer(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }
    }

    static final class AudioAttributesCompatParcelizer implements Comparable<AudioAttributesCompatParcelizer> {
        public final hasIds IconCompatParcelizer;
        public final int write;

        public AudioAttributesCompatParcelizer(int i, hasIds hasids) {
            this.write = i;
            this.IconCompatParcelizer = hasids;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int compareTo(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            return Integer.compare(this.write, audioAttributesCompatParcelizer.write);
        }
    }

    static final class IconCompatParcelizer {
        public final String AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        public final Set<String> RemoteActionCompatParcelizer;
        public final int read;

        private IconCompatParcelizer(String str, int i, String str2, Set<String> set) {
            this.read = i;
            this.IconCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = str2;
            this.RemoteActionCompatParcelizer = set;
        }

        public static IconCompatParcelizer RemoteActionCompatParcelizer(String str, int i) {
            String str2;
            String strTrim = str.trim();
            buildTypeSerializer.IconCompatParcelizer(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(strTrim, "\\.");
            String str3 = strArrAudioAttributesCompatParcelizer[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < strArrAudioAttributesCompatParcelizer.length; i2++) {
                hashSet.add(strArrAudioAttributesCompatParcelizer[i2]);
            }
            return new IconCompatParcelizer(str3, i, str2, hashSet);
        }

        public static IconCompatParcelizer AudioAttributesCompatParcelizer() {
            return new IconCompatParcelizer("", 0, "", Collections.emptySet());
        }
    }

    static class read {
        private static final Comparator<read> RemoteActionCompatParcelizer = new Comparator() { // from class: o.assignNativeIds
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((_typeIdIndex.read) obj).write.read, ((_typeIdIndex.read) obj2).write.read);
            }
        };
        private final int IconCompatParcelizer;
        private final IconCompatParcelizer write;

        /* synthetic */ read(IconCompatParcelizer iconCompatParcelizer, int i, byte b) {
            this(iconCompatParcelizer, i);
        }

        private read(IconCompatParcelizer iconCompatParcelizer, int i) {
            this.write = iconCompatParcelizer;
            this.IconCompatParcelizer = i;
        }
    }
}
