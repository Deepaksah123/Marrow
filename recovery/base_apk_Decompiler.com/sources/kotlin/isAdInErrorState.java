package kotlin;

import android.text.TextUtils;
import com.marrow.data.models.content.ImageInfo;
import com.marrow.data.models.content.VideoInfo;
import com.marrow.data.models.content.VideoInfo.JsonParser;
import com.marrow.data.models.lesson.StepIndex;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class isAdInErrorState implements withAdGroupTimeUs {
    @setSdkPayload
    public isAdInErrorState() {
    }

    @Override // kotlin.withAdGroupTimeUs
    public final VideoInfo IconCompatParcelizer(StepIndex stepIndex) {
        String videoEncryptBody = stepIndex.getVideoEncryptBody();
        if (TextUtils.isEmpty(videoEncryptBody)) {
            return null;
        }
        String strRemoteActionCompatParcelizer = filterRedundantIncompleteSchemeDatas.RemoteActionCompatParcelizer(stepIndex.getId(), videoEncryptBody);
        if (TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
            return null;
        }
        JSONObject jSONObjectAudioAttributesCompatParcelizer = parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer);
        VideoInfo videoInfo = new VideoInfo();
        videoInfo.new JsonParser().fromJSON(jSONObjectAudioAttributesCompatParcelizer);
        videoInfo.setPsshData(stepIndex.getPsshData());
        return videoInfo;
    }

    @Override // kotlin.withAdGroupTimeUs
    public final ImageInfo[] IconCompatParcelizer(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return ImageInfo.fromJSON(parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(filterRedundantIncompleteSchemeDatas.RemoteActionCompatParcelizer(str, str2)).optJSONArray(str3));
    }

    @Override // kotlin.withAdGroupTimeUs
    public final String RemoteActionCompatParcelizer(String str, String str2) {
        return filterRedundantIncompleteSchemeDatas.RemoteActionCompatParcelizer(str, str2);
    }
}
