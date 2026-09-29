package kotlin;

import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.models.lesson.StepIndex;

/* JADX INFO: loaded from: classes3.dex */
public final class ConditionVariable implements isNalStartCode {
    private final onInitializationFailed IconCompatParcelizer;
    private final onUtcTimestampLoadCompleted write;

    @setSdkPayload
    public ConditionVariable(onUtcTimestampLoadCompleted onutctimestamploadcompleted, onInitializationFailed oninitializationfailed) {
        toMagicModuleMetaRepoModel.write(onutctimestamploadcompleted, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        this.write = onutctimestamploadcompleted;
        this.IconCompatParcelizer = oninitializationfailed;
    }

    @Override // kotlin.isNalStartCode
    public final Object write(String str) {
        StepIndex stepIndexA_ = this.write.a_(str);
        return stepIndexA_ != null ? Consumer.write(stepIndexA_) : new ColorParser(null, null, null, null, 0, 0, null, 0, null, null, null, 0, 0, null, false, 32767, null);
    }

    @Override // kotlin.isNalStartCode
    public final Object IconCompatParcelizer(String str) {
        StepIndex stepIndex;
        StepIndex[] stepIndexArrIconCompatParcelizer = this.write.IconCompatParcelizer("lesson_id", str);
        String id = (stepIndexArrIconCompatParcelizer == null || (stepIndex = (StepIndex) getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(stepIndexArrIconCompatParcelizer)) == null) ? null : stepIndex.getId();
        return id == null ? "" : id;
    }

    @Override // kotlin.isNalStartCode
    public final Object AudioAttributesCompatParcelizer(String str) {
        this.write.AudioAttributesImplApi26Parcelizer(str);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isNalStartCode
    public final Object read(String str) {
        return QBankStatsResponse.RemoteActionCompatParcelizer(this.write.write("lesson_id =? ", new String[]{str}));
    }

    @Override // kotlin.isNalStartCode
    public final Object write(StepResponseBody stepResponseBody) {
        this.write.AudioAttributesCompatParcelizer(stepResponseBody);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isNalStartCode
    public final Object IconCompatParcelizer(String str, boolean z) {
        this.write.AudioAttributesCompatParcelizer(str, z);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isNalStartCode
    public final Object read(String str, int i) {
        this.write.write(str, i);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isNalStartCode
    public final Object write() {
        this.write.MediaDescriptionCompat();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.isNalStartCode
    public final Object AudioAttributesCompatParcelizer(String str, int i) {
        StepIndex stepIndexIconCompatParcelizer = this.write.IconCompatParcelizer(str, i);
        if (stepIndexIconCompatParcelizer != null) {
            return Consumer.write(stepIndexIconCompatParcelizer);
        }
        return null;
    }
}
