package kotlin;

import android.os.Bundle;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lo/excludeTrack;", "Lo/onRebuffer;", "<init>", "()V", "", "", "p0", "", "read", "(Ljava/util/Map;)V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class excludeTrack implements onRebuffer {
    @setSdkPayload
    public excludeTrack() {
    }

    @Override // kotlin.onRebuffer
    public final void read(Map<String, String> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Set<String> setKeySet = p0.keySet();
        Bundle bundle = new Bundle();
        for (String str : setKeySet) {
            String strSubstring = p0.get(str);
            String str2 = strSubstring;
            if (str2 == null || str2.length() == 0) {
                strSubstring = "NA";
            } else if (strSubstring.length() > 80) {
                strSubstring = strSubstring.substring(0, 80);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            }
            bundle.putString(str, strSubstring);
        }
        getTrackGroup.AudioAttributesCompatParcelizer("c_log", bundle);
    }
}
