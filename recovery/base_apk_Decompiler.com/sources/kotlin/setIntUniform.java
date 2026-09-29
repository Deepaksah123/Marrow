package kotlin;

import com.marrow2.data.test.remote.model.GTNudgeRSModel;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setIntUniform {
    public static final setFloatsUniform read(GTNudgeRSModel gTNudgeRSModel) {
        toMagicModuleMetaRepoModel.write(gTNudgeRSModel, "");
        boolean showNudge = gTNudgeRSModel.getShowNudge();
        Integer nudgeType = gTNudgeRSModel.getNudgeType();
        int iIntValue = nudgeType != null ? nudgeType.intValue() : -1;
        String testId = gTNudgeRSModel.getTestId();
        String str = testId == null ? "" : testId;
        String title = gTNudgeRSModel.getTitle();
        String str2 = title == null ? "" : title;
        List<String> body = gTNudgeRSModel.getBody();
        if (body == null) {
            body = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return new setFloatsUniform(showNudge, iIntValue, str, str2, body);
    }
}
