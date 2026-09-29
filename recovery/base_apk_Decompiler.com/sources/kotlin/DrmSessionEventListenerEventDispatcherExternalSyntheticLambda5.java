package kotlin;

import android.graphics.Bitmap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5 {
    private final InputAccessor AudioAttributesCompatParcelizer;
    private final InputAccessor AudioAttributesImplBaseParcelizer;
    private final InputAccessor IconCompatParcelizer;
    private final InputAccessor RemoteActionCompatParcelizer;
    private final SnapshotStateList<DrmSessionEventListenerEventDispatcherListenerAndHandler> read;
    private final InputAccessor write;

    public DrmSessionEventListenerEventDispatcherExternalSyntheticLambda5(getDummyDrmSessionManager getdummydrmsessionmanager) {
        toMagicModuleMetaRepoModel.write(getdummydrmsessionmanager, "");
        this.IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.write = available.RemoteActionCompatParcelizer$default(getdummydrmsessionmanager, null, 2, null);
        this.AudioAttributesCompatParcelizer = available.RemoteActionCompatParcelizer$default(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0.RemoteActionCompatParcelizer.INSTANCE, null, 2, null);
        this.AudioAttributesImplBaseParcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.read = _qbuf.write();
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.IconCompatParcelizer.write(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getDummyDrmSessionManager AudioAttributesCompatParcelizer() {
        return (getDummyDrmSessionManager) this.write.read();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0 read() {
        return (DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0) this.AudioAttributesCompatParcelizer.read();
    }

    public final void write(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda0 drmSessionEventListenerEventDispatcherExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(drmSessionEventListenerEventDispatcherExternalSyntheticLambda0, "");
        this.AudioAttributesCompatParcelizer.write(drmSessionEventListenerEventDispatcherExternalSyntheticLambda0);
    }

    public final void read(String str) {
        this.AudioAttributesImplBaseParcelizer.write(str);
    }

    public final void RemoteActionCompatParcelizer(Bitmap bitmap) {
        this.RemoteActionCompatParcelizer.write(bitmap);
    }

    public final SnapshotStateList<DrmSessionEventListenerEventDispatcherListenerAndHandler> write() {
        return this.read;
    }
}
