package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.CColorRange;
import kotlin.CRoleFlags;
import kotlin.CVideoChangeFrameRateStrategy;
import kotlin.CVolumeFlags;
import kotlin.Metadata;
import kotlin.hasPrevious;
import kotlin.j;
import kotlin.lambdastatic0;
import kotlin.n;
import kotlin.shouldStartPlayback;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lo/j$RemoteActionCompatParcelizer;", "write", "()Lo/j$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
    }

    @Override // androidx.work.Worker
    public final j.RemoteActionCompatParcelizer write() {
        hasPrevious hasprevious = hasPrevious.read(IconCompatParcelizer());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hasprevious, "");
        WorkDatabase workDatabaseAudioAttributesImplApi26Parcelizer = hasprevious.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(workDatabaseAudioAttributesImplApi26Parcelizer, "");
        CVolumeFlags cVolumeFlagsOnMediaButtonEvent = workDatabaseAudioAttributesImplApi26Parcelizer.onMediaButtonEvent();
        CRoleFlags cRoleFlagsOnFastForward = workDatabaseAudioAttributesImplApi26Parcelizer.onFastForward();
        shouldStartPlayback shouldstartplaybackOnPrepareFromMediaId = workDatabaseAudioAttributesImplApi26Parcelizer.onPrepareFromMediaId();
        CColorRange cColorRangeOnPause = workDatabaseAudioAttributesImplApi26Parcelizer.onPause();
        List<CVideoChangeFrameRateStrategy> listAudioAttributesCompatParcelizer = cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer(hasprevious.AudioAttributesCompatParcelizer().getAudioAttributesCompatParcelizer().read() - TimeUnit.DAYS.toMillis(1L));
        List<CVideoChangeFrameRateStrategy> listIconCompatParcelizer = cVolumeFlagsOnMediaButtonEvent.IconCompatParcelizer();
        List<CVideoChangeFrameRateStrategy> listAudioAttributesCompatParcelizer2 = cVolumeFlagsOnMediaButtonEvent.AudioAttributesCompatParcelizer();
        if (!listAudioAttributesCompatParcelizer.isEmpty()) {
            n.write();
            String unused = lambdastatic0.write;
            n.write();
            String unused2 = lambdastatic0.write;
            lambdastatic0.write(cRoleFlagsOnFastForward, shouldstartplaybackOnPrepareFromMediaId, cColorRangeOnPause, (List<CVideoChangeFrameRateStrategy>) listAudioAttributesCompatParcelizer);
        }
        if (!listIconCompatParcelizer.isEmpty()) {
            n.write();
            String unused3 = lambdastatic0.write;
            n.write();
            String unused4 = lambdastatic0.write;
            lambdastatic0.write(cRoleFlagsOnFastForward, shouldstartplaybackOnPrepareFromMediaId, cColorRangeOnPause, (List<CVideoChangeFrameRateStrategy>) listIconCompatParcelizer);
        }
        if (!listAudioAttributesCompatParcelizer2.isEmpty()) {
            n.write();
            String unused5 = lambdastatic0.write;
            n.write();
            String unused6 = lambdastatic0.write;
            lambdastatic0.write(cRoleFlagsOnFastForward, shouldstartplaybackOnPrepareFromMediaId, cColorRangeOnPause, (List<CVideoChangeFrameRateStrategy>) listAudioAttributesCompatParcelizer2);
        }
        j.RemoteActionCompatParcelizer remoteActionCompatParcelizer = j.RemoteActionCompatParcelizer.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, "");
        return remoteActionCompatParcelizer;
    }
}
