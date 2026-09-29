package kotlin;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaPeriodQueue {
    private boolean RemoteActionCompatParcelizer;
    private final Set<enqueueNextMediaPeriodHolder> IconCompatParcelizer = Collections.newSetFromMap(new WeakHashMap());
    private final Set<enqueueNextMediaPeriodHolder> write = new HashSet();

    public final void read(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        this.IconCompatParcelizer.add(enqueuenextmediaperiodholder);
        if (!this.RemoteActionCompatParcelizer) {
            enqueuenextmediaperiodholder.IconCompatParcelizer();
        } else {
            enqueuenextmediaperiodholder.read();
            this.write.add(enqueuenextmediaperiodholder);
        }
    }

    public final boolean RemoteActionCompatParcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        boolean z = true;
        if (enqueuenextmediaperiodholder == null) {
            return true;
        }
        boolean zRemove = this.IconCompatParcelizer.remove(enqueuenextmediaperiodholder);
        if (!this.write.remove(enqueuenextmediaperiodholder) && !zRemove) {
            z = false;
        }
        if (z) {
            enqueuenextmediaperiodholder.read();
        }
        return z;
    }

    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer = true;
        for (enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder : moveMediaSourceRange.RemoteActionCompatParcelizer(this.IconCompatParcelizer)) {
            if (enqueuenextmediaperiodholder.MediaBrowserCompatItemReceiver()) {
                enqueuenextmediaperiodholder.AudioAttributesImplApi26Parcelizer();
                this.write.add(enqueuenextmediaperiodholder);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer = false;
        for (enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder : moveMediaSourceRange.RemoteActionCompatParcelizer(this.IconCompatParcelizer)) {
            if (!enqueuenextmediaperiodholder.MediaBrowserCompatCustomActionResultReceiver() && !enqueuenextmediaperiodholder.MediaBrowserCompatItemReceiver()) {
                enqueuenextmediaperiodholder.IconCompatParcelizer();
            }
        }
        this.write.clear();
    }

    public final void write() {
        Iterator it = moveMediaSourceRange.RemoteActionCompatParcelizer(this.IconCompatParcelizer).iterator();
        while (it.hasNext()) {
            RemoteActionCompatParcelizer((enqueueNextMediaPeriodHolder) it.next());
        }
        this.write.clear();
    }

    public final void read() {
        for (enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder : moveMediaSourceRange.RemoteActionCompatParcelizer(this.IconCompatParcelizer)) {
            if (!enqueuenextmediaperiodholder.MediaBrowserCompatCustomActionResultReceiver() && !enqueuenextmediaperiodholder.RemoteActionCompatParcelizer()) {
                enqueuenextmediaperiodholder.read();
                if (!this.RemoteActionCompatParcelizer) {
                    enqueuenextmediaperiodholder.IconCompatParcelizer();
                } else {
                    this.write.add(enqueuenextmediaperiodholder);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.IconCompatParcelizer.size());
        sb.append(", isPaused=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }
}
