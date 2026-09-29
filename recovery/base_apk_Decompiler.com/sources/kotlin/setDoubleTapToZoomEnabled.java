package kotlin;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class setDoubleTapToZoomEnabled {
    private final AtomicBoolean AudioAttributesCompatParcelizer;
    private final AtomicInteger RemoteActionCompatParcelizer;
    private final getCreatedOnDateMs<getShowPopup> write;

    public setDoubleTapToZoomEnabled(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.write = getcreatedondatems;
        this.RemoteActionCompatParcelizer = new AtomicInteger(0);
        this.AudioAttributesCompatParcelizer = new AtomicBoolean(false);
    }

    private final boolean read() {
        return this.AudioAttributesCompatParcelizer.get();
    }

    public final boolean IconCompatParcelizer() {
        synchronized (this) {
            if (read()) {
                return false;
            }
            this.RemoteActionCompatParcelizer.incrementAndGet();
            return true;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.decrementAndGet();
            if (this.RemoteActionCompatParcelizer.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.".toString());
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
