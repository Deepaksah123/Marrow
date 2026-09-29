package kotlin;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultRenderersFactoryExtensionRendererMode implements s {
    final WorkDatabase IconCompatParcelizer;
    final setEnableDecoderFallback RemoteActionCompatParcelizer;

    static {
        n.write("WorkProgressUpdater");
    }

    public DefaultRenderersFactoryExtensionRendererMode(WorkDatabase workDatabase, setEnableDecoderFallback setenabledecoderfallback) {
        this.IconCompatParcelizer = workDatabase;
        this.RemoteActionCompatParcelizer = setenabledecoderfallback;
    }
}
