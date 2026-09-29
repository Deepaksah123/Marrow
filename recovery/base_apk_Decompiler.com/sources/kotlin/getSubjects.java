package kotlin;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubjects {
    public static final Map<String, String> AudioAttributesCompatParcelizer(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        String strAudioAttributesCompatParcelizer = getPlanName.AudioAttributesCompatParcelizer(th);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        linkedHashMap.put("ex_msg", message);
        String canonicalName = th.getClass().getCanonicalName();
        linkedHashMap.put("ex_title", canonicalName != null ? canonicalName : "");
        int i = 0;
        for (Object obj : IntermediateLoginResponseBody.write((Iterable) TestGroupLSModel.RemoteActionCompatParcelizer((CharSequence) strAudioAttributesCompatParcelizer, 100), 3)) {
            int i2 = i + 1;
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            linkedHashMap.put("stack_".concat(String.valueOf(i2)), (String) obj);
            i = i2;
        }
        return linkedHashMap;
    }
}
