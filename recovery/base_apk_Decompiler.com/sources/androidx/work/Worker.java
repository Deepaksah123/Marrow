package androidx.work;

import android.content.Context;
import androidx.work.Worker;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Mp4ExtractorExternalSyntheticLambda0;
import kotlin.eb;
import kotlin.getCreatedOnDateMs;
import kotlin.getIndexOfPeriod;
import kotlin.j;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/work/Worker;", "Lo/j;", "Landroid/content/Context;", "p0", "Landroidx/work/WorkerParameters;", "p1", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lo/j$RemoteActionCompatParcelizer;", "write", "()Lo/j$RemoteActionCompatParcelizer;", "Lo/Mp4ExtractorExternalSyntheticLambda0;", "RemoteActionCompatParcelizer", "()Lo/Mp4ExtractorExternalSyntheticLambda0;", "Lo/eb;", "read", "MediaDescriptionCompat", "()Lo/eb;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends j {
    public abstract j.RemoteActionCompatParcelizer write();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(workerParameters, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j.RemoteActionCompatParcelizer read(Worker worker) {
        return worker.write();
    }

    @Override // kotlin.j
    public final Mp4ExtractorExternalSyntheticLambda0<j.RemoteActionCompatParcelizer> RemoteActionCompatParcelizer() {
        Executor executorAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(executorAudioAttributesImplApi21Parcelizer, "");
        return getIndexOfPeriod.AudioAttributesCompatParcelizer(executorAudioAttributesImplApi21Parcelizer, new getCreatedOnDateMs() { // from class: o.getChildUidByChildIndex
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Worker.read(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eb AudioAttributesCompatParcelizer() {
        return MediaDescriptionCompat();
    }

    @Override // kotlin.j
    public final Mp4ExtractorExternalSyntheticLambda0<eb> read() {
        Executor executorAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(executorAudioAttributesImplApi21Parcelizer, "");
        return getIndexOfPeriod.AudioAttributesCompatParcelizer(executorAudioAttributesImplApi21Parcelizer, new getCreatedOnDateMs() { // from class: o.getFirstPeriodIndexByChildIndex
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                Worker worker = this.AudioAttributesCompatParcelizer;
                return Worker.AudioAttributesCompatParcelizer();
            }
        });
    }

    private static eb MediaDescriptionCompat() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }
}
