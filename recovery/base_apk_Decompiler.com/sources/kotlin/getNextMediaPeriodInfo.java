package kotlin;

import kotlin.updateForPlaybackModeChange;

/* JADX INFO: loaded from: classes2.dex */
public final class getNextMediaPeriodInfo implements updateForPlaybackModeChange, enqueueNextMediaPeriodHolder {
    private volatile enqueueNextMediaPeriodHolder AudioAttributesImplApi26Parcelizer;
    private volatile enqueueNextMediaPeriodHolder IconCompatParcelizer;
    private final Object RemoteActionCompatParcelizer;
    private boolean read;
    private final updateForPlaybackModeChange write;
    private updateForPlaybackModeChange.write AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.CLEARED;
    private updateForPlaybackModeChange.write MediaBrowserCompatCustomActionResultReceiver = updateForPlaybackModeChange.write.CLEARED;

    public getNextMediaPeriodInfo(Object obj, updateForPlaybackModeChange updateforplaybackmodechange) {
        this.RemoteActionCompatParcelizer = obj;
        this.write = updateforplaybackmodechange;
    }

    public final void RemoteActionCompatParcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder, enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder2) {
        this.IconCompatParcelizer = enqueuenextmediaperiodholder;
        this.AudioAttributesImplApi26Parcelizer = enqueuenextmediaperiodholder2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // kotlin.updateForPlaybackModeChange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean IconCompatParcelizer(kotlin.enqueueNextMediaPeriodHolder r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            monitor-enter(r0)
            boolean r1 = r2.MediaBrowserCompatSearchResultReceiver()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L19
            o.enqueueNextMediaPeriodHolder r1 = r2.IconCompatParcelizer     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L17
            o.updateForPlaybackModeChange$write r2 = r2.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L1c
            o.updateForPlaybackModeChange$write r3 = o.updateForPlaybackModeChange.write.SUCCESS     // Catch: java.lang.Throwable -> L1c
            if (r2 == r3) goto L19
        L17:
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            monitor-exit(r0)
            return r2
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getNextMediaPeriodInfo.IconCompatParcelizer(o.enqueueNextMediaPeriodHolder):boolean");
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.write;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.IconCompatParcelizer(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // kotlin.updateForPlaybackModeChange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean RemoteActionCompatParcelizer(kotlin.enqueueNextMediaPeriodHolder r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            monitor-enter(r0)
            boolean r1 = r2.AudioAttributesImplBaseParcelizer()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L19
            o.enqueueNextMediaPeriodHolder r1 = r2.IconCompatParcelizer     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L19
            boolean r2 = r2.write()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            monitor-exit(r0)
            return r2
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getNextMediaPeriodInfo.RemoteActionCompatParcelizer(o.enqueueNextMediaPeriodHolder):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    @Override // kotlin.updateForPlaybackModeChange
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AudioAttributesCompatParcelizer(kotlin.enqueueNextMediaPeriodHolder r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            monitor-enter(r0)
            boolean r1 = r2.AudioAttributesImplApi21Parcelizer()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L19
            o.enqueueNextMediaPeriodHolder r1 = r2.IconCompatParcelizer     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L19
            o.updateForPlaybackModeChange$write r2 = r2.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L1c
            o.updateForPlaybackModeChange$write r3 = o.updateForPlaybackModeChange.write.PAUSED     // Catch: java.lang.Throwable -> L1c
            if (r2 == r3) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            monitor-exit(r0)
            return r2
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getNextMediaPeriodInfo.AudioAttributesCompatParcelizer(o.enqueueNextMediaPeriodHolder):boolean");
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.write;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.AudioAttributesCompatParcelizer(this);
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        updateForPlaybackModeChange updateforplaybackmodechange = this.write;
        return updateforplaybackmodechange == null || updateforplaybackmodechange.RemoteActionCompatParcelizer(this);
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
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            monitor-enter(r0)
            o.enqueueNextMediaPeriodHolder r1 = r2.AudioAttributesImplApi26Parcelizer     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.write()     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L16
            o.enqueueNextMediaPeriodHolder r2 = r2.IconCompatParcelizer     // Catch: java.lang.Throwable -> L19
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getNextMediaPeriodInfo.write():boolean");
    }

    @Override // kotlin.updateForPlaybackModeChange
    public final void AudioAttributesImplApi26Parcelizer(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        synchronized (this.RemoteActionCompatParcelizer) {
            if (enqueuenextmediaperiodholder.equals(this.AudioAttributesImplApi26Parcelizer)) {
                this.MediaBrowserCompatCustomActionResultReceiver = updateForPlaybackModeChange.write.SUCCESS;
                return;
            }
            this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.SUCCESS;
            updateForPlaybackModeChange updateforplaybackmodechange = this.write;
            if (updateforplaybackmodechange != null) {
                updateforplaybackmodechange.AudioAttributesImplApi26Parcelizer(this);
            }
            if (!this.MediaBrowserCompatCustomActionResultReceiver.read()) {
                this.AudioAttributesImplApi26Parcelizer.read();
            }
        }
    }

    @Override // kotlin.updateForPlaybackModeChange
    public final void write(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        synchronized (this.RemoteActionCompatParcelizer) {
            if (!enqueuenextmediaperiodholder.equals(this.IconCompatParcelizer)) {
                this.MediaBrowserCompatCustomActionResultReceiver = updateForPlaybackModeChange.write.FAILED;
                return;
            }
            this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.FAILED;
            updateForPlaybackModeChange updateforplaybackmodechange = this.write;
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
        synchronized (this.RemoteActionCompatParcelizer) {
            updateForPlaybackModeChange updateforplaybackmodechange = this.write;
            this = this;
            if (updateforplaybackmodechange != null) {
                AudioAttributesCompatParcelizer = updateforplaybackmodechange.AudioAttributesCompatParcelizer();
            }
        }
        return AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void IconCompatParcelizer() {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.read = true;
            try {
                if (this.AudioAttributesCompatParcelizer != updateForPlaybackModeChange.write.SUCCESS && this.MediaBrowserCompatCustomActionResultReceiver != updateForPlaybackModeChange.write.RUNNING) {
                    this.MediaBrowserCompatCustomActionResultReceiver = updateForPlaybackModeChange.write.RUNNING;
                    this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
                }
                if (this.read && this.AudioAttributesCompatParcelizer != updateForPlaybackModeChange.write.RUNNING) {
                    this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.RUNNING;
                    this.IconCompatParcelizer.IconCompatParcelizer();
                }
            } finally {
                this.read = false;
            }
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void read() {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.read = false;
            this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.CLEARED;
            this.MediaBrowserCompatCustomActionResultReceiver = updateForPlaybackModeChange.write.CLEARED;
            this.AudioAttributesImplApi26Parcelizer.read();
            this.IconCompatParcelizer.read();
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final void AudioAttributesImplApi26Parcelizer() {
        synchronized (this.RemoteActionCompatParcelizer) {
            if (!this.MediaBrowserCompatCustomActionResultReceiver.read()) {
                this.MediaBrowserCompatCustomActionResultReceiver = updateForPlaybackModeChange.write.PAUSED;
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer();
            }
            if (!this.AudioAttributesCompatParcelizer.read()) {
                this.AudioAttributesCompatParcelizer = updateForPlaybackModeChange.write.PAUSED;
                this.IconCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            }
        }
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean MediaBrowserCompatItemReceiver() {
        boolean z;
        synchronized (this.RemoteActionCompatParcelizer) {
            z = this.AudioAttributesCompatParcelizer == updateForPlaybackModeChange.write.RUNNING;
        }
        return z;
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        boolean z;
        synchronized (this.RemoteActionCompatParcelizer) {
            z = this.AudioAttributesCompatParcelizer == updateForPlaybackModeChange.write.SUCCESS;
        }
        return z;
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this.RemoteActionCompatParcelizer) {
            z = this.AudioAttributesCompatParcelizer == updateForPlaybackModeChange.write.CLEARED;
        }
        return z;
    }

    @Override // kotlin.enqueueNextMediaPeriodHolder
    public final boolean read(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        if (!(enqueuenextmediaperiodholder instanceof getNextMediaPeriodInfo)) {
            return false;
        }
        getNextMediaPeriodInfo getnextmediaperiodinfo = (getNextMediaPeriodInfo) enqueuenextmediaperiodholder;
        if (this.IconCompatParcelizer == null) {
            if (getnextmediaperiodinfo.IconCompatParcelizer != null) {
                return false;
            }
        } else if (!this.IconCompatParcelizer.read(getnextmediaperiodinfo.IconCompatParcelizer)) {
            return false;
        }
        return this.AudioAttributesImplApi26Parcelizer == null ? getnextmediaperiodinfo.AudioAttributesImplApi26Parcelizer == null : this.AudioAttributesImplApi26Parcelizer.read(getnextmediaperiodinfo.AudioAttributesImplApi26Parcelizer);
    }
}
