package kotlin;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled implements setMediaCodecSelector {
    private final ArrayDeque<IconCompatParcelizer> AudioAttributesCompatParcelizer = new ArrayDeque<>();
    final Object IconCompatParcelizer = new Object();
    private Runnable RemoteActionCompatParcelizer;
    private final Executor write;

    public experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(Executor executor) {
        this.write = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.IconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.add(new IconCompatParcelizer(this, runnable));
            if (this.RemoteActionCompatParcelizer == null) {
                read();
            }
        }
    }

    final void read() {
        IconCompatParcelizer iconCompatParcelizerPoll = this.AudioAttributesCompatParcelizer.poll();
        this.RemoteActionCompatParcelizer = iconCompatParcelizerPoll;
        if (iconCompatParcelizerPoll != null) {
            this.write.execute(iconCompatParcelizerPoll);
        }
    }

    static class IconCompatParcelizer implements Runnable {
        final Runnable AudioAttributesCompatParcelizer;
        final experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled RemoteActionCompatParcelizer;

        IconCompatParcelizer(experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled experimentalsetsynchronizecodecinteractionswithqueueingenabled, Runnable runnable) {
            this.RemoteActionCompatParcelizer = experimentalsetsynchronizecodecinteractionswithqueueingenabled;
            this.AudioAttributesCompatParcelizer = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.AudioAttributesCompatParcelizer.run();
                synchronized (this.RemoteActionCompatParcelizer.IconCompatParcelizer) {
                    this.RemoteActionCompatParcelizer.read();
                }
            } catch (Throwable th) {
                synchronized (this.RemoteActionCompatParcelizer.IconCompatParcelizer) {
                    this.RemoteActionCompatParcelizer.read();
                    throw th;
                }
            }
        }
    }
}
