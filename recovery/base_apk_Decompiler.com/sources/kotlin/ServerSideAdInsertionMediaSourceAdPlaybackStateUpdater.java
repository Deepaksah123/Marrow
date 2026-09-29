package kotlin;

import android.app.Application;
import com.marrow.data.models.LessonMcqUpdateInfo;
import com.marrow.data.models.lesson.McqHighYieldRecord;
import com.marrow.data.models.mcq.McqIndex;

/* JADX INFO: loaded from: classes3.dex */
public class ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater implements ServerSideAdInsertionMediaSourceMediaPeriodImpl {
    private final setManifestParser AudioAttributesCompatParcelizer;
    private final DashMediaSourceExternalSyntheticLambda0 AudioAttributesImplApi21Parcelizer;

    @Deprecated
    private final Application IconCompatParcelizer;
    private final getAdjustedWindowDefaultStartPositionUs RemoteActionCompatParcelizer;
    private final onInitializationFailed read;
    private final setCompositeSequenceableLoaderFactory write;

    @setSdkPayload
    public ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater(Application application, onInitializationFailed oninitializationfailed, setCompositeSequenceableLoaderFactory setcompositesequenceableloaderfactory, setManifestParser setmanifestparser, DashMediaSourceExternalSyntheticLambda0 dashMediaSourceExternalSyntheticLambda0, getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus) {
        this.write = setcompositesequenceableloaderfactory;
        this.read = oninitializationfailed;
        this.AudioAttributesCompatParcelizer = setmanifestparser;
        this.AudioAttributesImplApi21Parcelizer = dashMediaSourceExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = getadjustedwindowdefaultstartpositionus;
        this.IconCompatParcelizer = application;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl
    public final boolean RemoteActionCompatParcelizer(String str) {
        return this.write.write("mcq_id =? ", new String[]{str}) > 0;
    }

    public final int AudioAttributesCompatParcelizer(String str) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(str);
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl
    public final McqIndex read(String str) {
        McqIndex mcqIndexA_ = this.write.a_(str);
        if (mcqIndexA_ != null) {
            mcqIndexA_.setHytIds(this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(str));
        }
        return mcqIndexA_;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl
    public final void write(McqIndex mcqIndex) {
        this.write.AudioAttributesCompatParcelizer(mcqIndex);
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl
    public final void IconCompatParcelizer(McqIndex mcqIndex, String str, String str2) {
        String[] highYieldIds = mcqIndex.getHighYieldIds();
        if (highYieldIds == null) {
            return;
        }
        McqHighYieldRecord[] mcqHighYieldRecordArr = new McqHighYieldRecord[highYieldIds.length];
        for (int i = 0; i < highYieldIds.length; i++) {
            mcqHighYieldRecordArr[i] = new McqHighYieldRecord(mcqIndex.getMcqId(), highYieldIds[i], str, str2);
        }
        this.RemoteActionCompatParcelizer.read(LessonMcqUpdateInfo.KEY_MCQ_ID, mcqIndex.getMcqId());
        this.RemoteActionCompatParcelizer.IconCompatParcelizer((Object[]) mcqHighYieldRecordArr);
    }
}
