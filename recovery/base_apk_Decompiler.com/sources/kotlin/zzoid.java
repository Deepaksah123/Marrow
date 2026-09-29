package kotlin;

import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzoid {
    public static final cs AudioAttributesCompatParcelizer(nullSafeArrayConcatenation nullsafearrayconcatenation) {
        toMagicModuleMetaRepoModel.write(nullsafearrayconcatenation, "");
        return new cs(nullsafearrayconcatenation.getIconCompatParcelizer(), nullsafearrayconcatenation.getRemoteActionCompatParcelizer(), nullsafearrayconcatenation.getAudioAttributesCompatParcelizer(), nullsafearrayconcatenation.getWrite(), nullsafearrayconcatenation.getRead());
    }

    public static final PendingResults AudioAttributesCompatParcelizer(cs csVar, boolean z) {
        toMagicModuleMetaRepoModel.write(csVar, "");
        return new PendingResults(csVar.write(), csVar.RemoteActionCompatParcelizer(), csVar.read(), z);
    }

    public static final Map<String, String> AudioAttributesCompatParcelizer(cs csVar, String str, Exception exc, String str2) {
        toMagicModuleMetaRepoModel.write(csVar, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(exc, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        HashMap mapAudioAttributesCompatParcelizer = VideoTimelineResponseBody.AudioAttributesCompatParcelizer(setAction.write("img_url_v2", csVar.RemoteActionCompatParcelizer()), setAction.write("l_id_v2", str), setAction.write("er_state_v2", str2));
        if (exc instanceof ResponseErrorException) {
            mapAudioAttributesCompatParcelizer.put("error_code", String.valueOf(((ResponseErrorException) exc).getError().getErrorCode()));
        }
        return mapAudioAttributesCompatParcelizer;
    }
}
