package kotlin;

import kotlin.updateForPlaybackModeChange;

/* JADX INFO: loaded from: classes2.dex */
public final class isSkippableAdPeriod implements updateForPlaybackModeChange, enqueueNextMediaPeriodHolder {
    private final Object MediaBrowserCompatItemReceiver;
    private final updateForPlaybackModeChange RemoteActionCompatParcelizer;
    private volatile enqueueNextMediaPeriodHolder read;
    private volatile enqueueNextMediaPeriodHolder write;
    private updateForPlaybackModeChange.write IconCompatParcelizer = updateForPlaybackModeChange.write.CLEARED;
    private updateForPlaybackModeChange.write AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.CLEARED;

    public isSkippableAdPeriod(Object obj, updateForPlaybackModeChange updateforplaybackmodechange) {
        this.MediaBrowserCompatItemReceiver = obj;
        this.RemoteActionCompatParcelizer = updateforplaybackmodechange;
    }

    public final void RemoteActionCompatParcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder, enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder2) {
        this.read = enqueuenextmediaperiodholder;
        this.write = enqueuenextmediaperiodholder2;
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void IconCompatParcelizer() {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            if (this.IconCompatParcelizer != updateForPlaybackModeChange.write.RUNNING) {
                this.IconCompatParcelizer = updateForPlaybackModeChange.write.RUNNING;
                this.read.IconCompatParcelizer();
            }
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void read() {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            this.IconCompatParcelizer = updateForPlaybackModeChange.write.CLEARED;
            this.read.read();
            if (this.AudioAttributesCompatParcelizer != updateForPlaybackModeChange.write.CLEARED) {
                this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.CLEARED;
                this.write.read();
            }
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void AudioAttributesImplApi26Parcelizer() {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            if (this.IconCompatParcelizer == updateForPlaybackModeChange.write.RUNNING) {
                this.IconCompatParcelizer = updateForPlaybackModeChange.write.PAUSED;
                this.read.AudioAttributesImplApi26Parcelizer();
            }
            if (this.AudioAttributesCompatParcelizer == updateForPlaybackModeChange.write.RUNNING) {
                this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.PAUSED;
                this.write.AudioAttributesImplApi26Parcelizer();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    @Override // kotlin.enqueueNextMediaPeriodHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MediaBrowserCompatItemReceiver() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.MediaBrowserCompatItemReceiver
            monitor-enter(r0)
            o.updateForPlaybackModeChange$write r1 = r3.IconCompatParcelizer     // Catch: java.lang.Throwable -> L15
            o.updateForPlaybackModeChange$write r2 = o.updateForPlaybackModeChange.write.RUNNING     // Catch: java.lang.Throwable -> L15
            if (r1 == r2) goto L12
            o.updateForPlaybackModeChange$write r3 = r3.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L15
            o.updateForPlaybackModeChange$write r1 = o.updateForPlaybackModeChange.write.RUNNING     // Catch: java.lang.Throwable -> L15
            if (r3 != r1) goto L10
            goto L12
        L10:
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSkippableAdPeriod.MediaBrowserCompatItemReceiver():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012  */
    @Override // kotlin.enqueueNextMediaPeriodHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.MediaBrowserCompatItemReceiver
            monitor-enter(r0)
            o.updateForPlaybackModeChange$write r1 = r3.IconCompatParcelizer     // Catch: java.lang.Throwable -> L15
            o.updateForPlaybackModeChange$write r2 = o.updateForPlaybackModeChange.write.SUCCESS     // Catch: java.lang.Throwable -> L15
            if (r1 == r2) goto L12
            o.updateForPlaybackModeChange$write r3 = r3.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L15
            o.updateForPlaybackModeChange$write r1 = o.updateForPlaybackModeChange.write.SUCCESS     // Catch: java.lang.Throwable -> L15
            if (r3 != r1) goto L10
            goto L12
        L10:
            r3 = 0
            goto L13
        L12:
            r3 = 1
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSkippableAdPeriod.MediaBrowserCompatCustomActionResultReceiver():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // kotlin.enqueueNextMediaPeriodHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean RemoteActionCompatParcelizer() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.MediaBrowserCompatItemReceiver
            monitor-enter(r0)
            o.updateForPlaybackModeChange$write r1 = r3.IconCompatParcelizer     // Catch: java.lang.Throwable -> L14
            o.updateForPlaybackModeChange$write r2 = o.updateForPlaybackModeChange.write.CLEARED     // Catch: java.lang.Throwable -> L14
            if (r1 != r2) goto L11
            o.updateForPlaybackModeChange$write r3 = r3.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L14
            o.updateForPlaybackModeChange$write r1 = o.updateForPlaybackModeChange.write.CLEARED     // Catch: java.lang.Throwable -> L14
            if (r3 != r1) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            monitor-exit(r0)
            return r3
        L14:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSkippableAdPeriod.RemoteActionCompatParcelizer():boolean");
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean read(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        if (!(enqueuenextmediaperiodholder instanceof isSkippableAdPeriod)) {
            return false;
        }
        isSkippableAdPeriod isskippableadperiod = (isSkippableAdPeriod) enqueuenextmediaperiodholder;
        return this.read.read(isskippableadperiod.read) && this.write.read(isskippableadperiod.write);
    }

    @Override // kotlin.updateForPlaybackModeChange
    public final boolean IconCompatParcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        boolean zMediaBrowserCompatSearchResultReceiver;
        synchronized (this.MediaBrowserCompatItemReceiver) {
            zMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        }
        return zMediaBrowserCompatSearchResultReceiver;
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.RemoteActionCompatParcelizer;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.IconCompatParcelizer(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // kotlin.updateForPlaybackModeChange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean RemoteActionCompatParcelizer(kotlin.enqueueNextMediaPeriodHolder r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.MediaBrowserCompatItemReceiver
            monitor-enter(r0)
            boolean r1 = r2.AudioAttributesImplBaseParcelizer()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L11
            boolean r2 = r2.AudioAttributesImplApi21Parcelizer(r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            monitor-exit(r0)
            return r2
        L14:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSkippableAdPeriod.RemoteActionCompatParcelizer(o.enqueueNextMediaPeriodHolder):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // kotlin.updateForPlaybackModeChange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AudioAttributesCompatParcelizer(kotlin.enqueueNextMediaPeriodHolder r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.MediaBrowserCompatItemReceiver
            monitor-enter(r0)
            boolean r1 = r2.AudioAttributesImplApi21Parcelizer()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L13
            o.enqueueNextMediaPeriodHolder r2 = r2.read     // Catch: java.lang.Throwable -> L16
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            monitor-exit(r0)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSkippableAdPeriod.AudioAttributesCompatParcelizer(o.enqueueNextMediaPeriodHolder):boolean");
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.RemoteActionCompatParcelizer;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.AudioAttributesCompatParcelizer(this);
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.RemoteActionCompatParcelizer;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.RemoteActionCompatParcelizer(this);
    }

    private boolean AudioAttributesImplApi21Parcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        if (this.IconCompatParcelizer != updateForPlaybackModeChange.write.FAILED) {
            return enqueuenextmediaperiodholder.equals(this.read);
        }
        if (enqueuenextmediaperiodholder.equals(this.write)) {
            return this.AudioAttributesCompatParcelizer == updateForPlaybackModeChange.write.SUCCESS || this.AudioAttributesCompatParcelizer == updateForPlaybackModeChange.write.FAILED;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // kotlin.updateForPlaybackModeChange, kotlin.enqueueNextMediaPeriodHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean write() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.MediaBrowserCompatItemReceiver
            monitor-enter(r0)
            o.enqueueNextMediaPeriodHolder r1 = r2.read     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.write()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L16
            o.enqueueNextMediaPeriodHolder r2 = r2.write     // Catch: java.lang.Throwable -> L19
            boolean r2 = r2.write()     // Catch: java.lang.Throwable -> L19
            if (r2 == 0) goto L14
            goto L16
        L14:
            r2 = 0
            goto L17
        L16:
            r2 = 1
        L17:
            monitor-exit(r0)
            return r2
        L19:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isSkippableAdPeriod.write():boolean");
    }

    @Override // kotlin.updateForPlaybackModeChange
    public final void AudioAttributesImplApi26Parcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            if (enqueuenextmediaperiodholder.equals(this.read)) {
                this.IconCompatParcelizer = updateForPlaybackModeChange.write.SUCCESS;
            } else if (enqueuenextmediaperiodholder.equals(this.write)) {
                this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.SUCCESS;
            }
            updateForPlaybackModeChange updateforplaybackmodechange = this.RemoteActionCompatParcelizer;
            if (updateforplaybackmodechange != null) {
                updateforplaybackmodechange.AudioAttributesImplApi26Parcelizer(this);
            }
        }
    }

    @Override // kotlin.updateForPlaybackModeChange
    public final void write(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        synchronized (this.MediaBrowserCompatItemReceiver) {
            if (!enqueuenextmediaperiodholder.equals(this.write)) {
                this.IconCompatParcelizer = updateForPlaybackModeChange.write.FAILED;
                if (this.AudioAttributesCompatParcelizer != updateForPlaybackModeChange.write.RUNNING) {
                    this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.RUNNING;
                    this.write.IconCompatParcelizer();
                }
                return;
            }
            this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.FAILED;
            updateForPlaybackModeChange updateforplaybackmodechange = this.RemoteActionCompatParcelizer;
            if (updateforplaybackmodechange != null) {
                updateforplaybackmodechange.write(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.updateForPlaybackModeChange] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // kotlin.updateForPlaybackModeChange
    public final updateForPlaybackModeChange AudioAttributesCompatParcelizer() {
        ?? AudioAttributesCompatParcelizer;
        synchronized (this.MediaBrowserCompatItemReceiver) {
            updateForPlaybackModeChange updateforplaybackmodechange = this.RemoteActionCompatParcelizer;
            this = this;
            if (updateforplaybackmodechange != null) {
                AudioAttributesCompatParcelizer = updateforplaybackmodechange.AudioAttributesCompatParcelizer();
            }
        }
        return AudioAttributesCompatParcelizer;
    }
}
