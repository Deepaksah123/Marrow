package kotlin;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSourceFactory {
    public static final String read(long j, int i) {
        String str;
        boolean zRemoteActionCompatParcelizer = parseEac3SupplementalProperties.RemoteActionCompatParcelizer(j, System.currentTimeMillis());
        switch (i) {
            case 1:
                str = RtspHeaders.EXPIRES;
                break;
            case 2:
                str = "Live";
                break;
            case 3:
                str = "Results";
                break;
            case 4:
                str = "Expired";
                break;
            case 5:
                str = "Attempted";
                break;
            case 6:
                str = "Started";
                break;
            case 7:
                str = "Time Remaining ";
                break;
            case 8:
                str = "Submit test to view rank";
                break;
            default:
                str = "";
                break;
        }
        if (IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{7, 8}).contains(Integer.valueOf(i))) {
            return str;
        }
        if (IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{4, 5}).contains(Integer.valueOf(i))) {
            String strWrite = parseEac3SupplementalProperties.write(j, "dd MMM yyyy");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" on ");
            sb.append(strWrite);
            return sb.toString();
        }
        if (zRemoteActionCompatParcelizer && IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{1, 2, 3, 6}).contains(Integer.valueOf(i))) {
            String strWrite2 = parseEac3SupplementalProperties.write(j, "dd MMM'-'h:mm a");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" on ");
            sb2.append(strWrite2);
            return sb2.toString();
        }
        if (zRemoteActionCompatParcelizer || !IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{1, 2, 3, 6}).contains(Integer.valueOf(i))) {
            return "";
        }
        String strWrite3 = parseEac3SupplementalProperties.write(j, "h:mm a");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" today ");
        sb3.append(strWrite3);
        return sb3.toString();
    }
}
