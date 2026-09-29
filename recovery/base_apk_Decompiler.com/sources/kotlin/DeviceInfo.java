package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceInfo implements setEnableDecoderFallback {
    private final experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled RemoteActionCompatParcelizer;
    private final getPlatform read;
    final Handler IconCompatParcelizer = new Handler(Looper.getMainLooper());
    private final Executor AudioAttributesCompatParcelizer = new Executor() { // from class: o.DeviceInfo.5
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            DeviceInfo.this.IconCompatParcelizer.post(runnable);
        }
    };

    public DeviceInfo(Executor executor) {
        experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled experimentalsetsynchronizecodecinteractionswithqueueingenabled = new experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(executor);
        this.RemoteActionCompatParcelizer = experimentalsetsynchronizecodecinteractionswithqueueingenabled;
        this.read = getDegree.write(experimentalsetsynchronizecodecinteractionswithqueueingenabled);
    }

    @Override // kotlin.setEnableDecoderFallback
    public final Executor AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setEnableDecoderFallback
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.setEnableDecoderFallback
    public final getPlatform RemoteActionCompatParcelizer() {
        return this.read;
    }
}
