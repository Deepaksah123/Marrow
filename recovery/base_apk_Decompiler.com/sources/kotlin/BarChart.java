package kotlin;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class BarChart implements Executor {
    private Runnable AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer;
    private final Executor RemoteActionCompatParcelizer;
    private final ArrayDeque<Runnable> write;

    public BarChart(Executor executor) {
        toMagicModuleMetaRepoModel.write(executor, "");
        this.RemoteActionCompatParcelizer = executor;
        this.write = new ArrayDeque<>();
        this.IconCompatParcelizer = new Object();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        toMagicModuleMetaRepoModel.write(runnable, "");
        synchronized (this.IconCompatParcelizer) {
            this.write.offer(new Runnable() { // from class: o.setDrawBarShadow
                @Override // java.lang.Runnable
                public final void run() {
                    BarChart.write(runnable, this);
                }
            });
            if (this.AudioAttributesCompatParcelizer == null) {
                write();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(Runnable runnable, BarChart barChart) {
        try {
            runnable.run();
        } finally {
            barChart.write();
        }
    }

    private void write() {
        synchronized (this.IconCompatParcelizer) {
            Runnable runnablePoll = this.write.poll();
            Runnable runnable = runnablePoll;
            this.AudioAttributesCompatParcelizer = runnable;
            if (runnablePoll != null) {
                this.RemoteActionCompatParcelizer.execute(runnable);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
