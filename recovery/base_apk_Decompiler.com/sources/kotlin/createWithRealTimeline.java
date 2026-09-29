package kotlin;

import android.media.MediaDrm;
import com.google.android.exoplayer2.C;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/createWithRealTimeline;", "", "<init>", "()V", "", "", "IconCompatParcelizer", "()Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createWithRealTimeline {
    public static final createWithRealTimeline INSTANCE = new createWithRealTimeline();

    private createWithRealTimeline() {
    }

    public static Map<String, String> IconCompatParcelizer() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MediaDrm mediaDrm = null;
        try {
            String[] strArr = {"version", "systemId", "securityLevel", "hdcpLevel", "maxHdcpLevel", "usageReportingSupport", "maxNumberOfSessions", "numberOfOpenSessions"};
            MediaDrm mediaDrm2 = new MediaDrm(C.WIDEVINE_UUID);
            for (int i = 0; i < 8; i++) {
                try {
                    String str = strArr[i];
                    String propertyString = mediaDrm2.getPropertyString(str);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(propertyString, "");
                    linkedHashMap.put(str, propertyString);
                } catch (Exception unused) {
                    mediaDrm = mediaDrm2;
                    if (mediaDrm != null) {
                        mediaDrm.close();
                    }
                    return linkedHashMap;
                } catch (Throwable th) {
                    th = th;
                    mediaDrm = mediaDrm2;
                    if (mediaDrm != null) {
                        mediaDrm.close();
                    }
                    throw th;
                }
            }
            linkedHashMap.put("p_maxHdcpLevel", String.valueOf(mediaDrm2.getMaxHdcpLevel()));
            linkedHashMap.put("p_hdcpLevel", String.valueOf(mediaDrm2.getConnectedHdcpLevel()));
            linkedHashMap.put("p_maxSecurityLevel", String.valueOf(MediaDrm.getMaxSecurityLevel()));
            mediaDrm2.close();
            return linkedHashMap;
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
