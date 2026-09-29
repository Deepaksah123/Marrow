package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class canDownloadsRun {
    private static final char[] RemoteActionCompatParcelizer;

    static {
        char[] cArr = new char[80];
        RemoteActionCompatParcelizer = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String read(DownloadManagerExternalSyntheticLambda0 downloadManagerExternalSyntheticLambda0, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        RemoteActionCompatParcelizer(downloadManagerExternalSyntheticLambda0, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void RemoteActionCompatParcelizer(kotlin.DownloadManagerExternalSyntheticLambda0 r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.canDownloadsRun.RemoteActionCompatParcelizer(o.DownloadManagerExternalSyntheticLambda0, java.lang.StringBuilder, int):void");
    }

    private static boolean write(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof DownloadIndex) {
            return obj.equals(DownloadIndex.RemoteActionCompatParcelizer);
        }
        return obj instanceof DownloadManagerExternalSyntheticLambda0 ? obj == ((DownloadManagerExternalSyntheticLambda0) obj).onRemoveQueueItemAt() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    static void AudioAttributesCompatParcelizer(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                AudioAttributesCompatParcelizer(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                AudioAttributesCompatParcelizer(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        IconCompatParcelizer(i, sb);
        sb.append(AudioAttributesCompatParcelizer(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(DownloadManagerInternalHandlerExternalSyntheticLambda0.IconCompatParcelizer((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof DownloadIndex) {
            sb.append(": \"");
            sb.append(DownloadManagerInternalHandlerExternalSyntheticLambda0.IconCompatParcelizer((DownloadIndex) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof updateWaitingForRequirements) {
            sb.append(" {");
            RemoteActionCompatParcelizer((updateWaitingForRequirements) obj, sb, i + 2);
            sb.append("\n");
            IconCompatParcelizer(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i2 = i + 2;
            AudioAttributesCompatParcelizer(sb, i2, "key", entry.getKey());
            AudioAttributesCompatParcelizer(sb, i2, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            IconCompatParcelizer(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    private static void IconCompatParcelizer(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = RemoteActionCompatParcelizer;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    private static String AudioAttributesCompatParcelizer(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
