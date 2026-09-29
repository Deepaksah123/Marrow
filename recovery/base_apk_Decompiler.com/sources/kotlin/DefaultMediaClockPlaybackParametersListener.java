package kotlin;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultMediaClockPlaybackParametersListener {
    private final WorkDatabase write;

    public DefaultMediaClockPlaybackParametersListener(WorkDatabase workDatabase) {
        toMagicModuleMetaRepoModel.write(workDatabase, "");
        this.write = workDatabase;
    }

    public final int RemoteActionCompatParcelizer(final int i, final int i2) {
        Object objWrite = this.write.write((Callable<Object>) new Callable() { // from class: o.buildAudioRenderers
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DefaultMediaClockPlaybackParametersListener.write(this.read, i, i2);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objWrite, "");
        return ((Number) objWrite).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer write(DefaultMediaClockPlaybackParametersListener defaultMediaClockPlaybackParametersListener, int i, int i2) {
        int i3 = syncAndGetPositionUs.read(defaultMediaClockPlaybackParametersListener.write, "next_job_scheduler_id");
        if (i > i3 || i3 > i2) {
            syncAndGetPositionUs.read(defaultMediaClockPlaybackParametersListener.write, "next_job_scheduler_id", i + 1);
        } else {
            i = i3;
        }
        return Integer.valueOf(i);
    }
}
