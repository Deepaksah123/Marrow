package kotlin;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class resolvePeriodIndexToWindowSequenceNumber<R> implements advanceReadingPeriod<R>, getUpdatedMediaPeriodInfo<R> {
    private static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
    private boolean AudioAttributesImplApi21Parcelizer;
    private final AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private R AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private enqueueNextMediaPeriodHolder MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatSearchResultReceiver;
    private setLiveMaxPlaybackSpeed RemoteActionCompatParcelizer;
    private final boolean read;
    private boolean write;

    @Override // kotlin.MediaSourceInfoHolder
    public final void AudioAttributesCompatParcelizer(Drawable drawable) {
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi21Parcelizer() {
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi26Parcelizer() {
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void IconCompatParcelizer(updateRepeatMode updaterepeatmode) {
    }

    @Override // kotlin.toRendererTime
    public final void MediaBrowserCompatItemReceiver() {
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void write(Drawable drawable) {
    }

    public resolvePeriodIndexToWindowSequenceNumber(int i, int i2) {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE, AudioAttributesCompatParcelizer);
    }

    private resolvePeriodIndexToWindowSequenceNumber(int i, int i2, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaBrowserCompatSearchResultReceiver = i;
        this.IconCompatParcelizer = i2;
        this.read = true;
        this.AudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.write = true;
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
            enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder = null;
            if (z) {
                enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder2 = this.MediaBrowserCompatItemReceiver;
                this.MediaBrowserCompatItemReceiver = null;
                enqueuenextmediaperiodholder = enqueuenextmediaperiodholder2;
            }
            if (enqueuenextmediaperiodholder != null) {
                enqueuenextmediaperiodholder.read();
            }
            return true;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        boolean z;
        synchronized (this) {
            z = this.write;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.write     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            boolean r0 = r1.AudioAttributesImplApi21Parcelizer     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            boolean r0 = r1.MediaBrowserCompatCustomActionResultReceiver     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            monitor-exit(r1)
            return r0
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.resolvePeriodIndexToWindowSequenceNumber.isDone():boolean");
    }

    @Override // java.util.concurrent.Future
    public final R get() throws ExecutionException, InterruptedException {
        try {
            return RemoteActionCompatParcelizer((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return RemoteActionCompatParcelizer(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void read(updateRepeatMode updaterepeatmode) {
        updaterepeatmode.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, this.IconCompatParcelizer);
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void write(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        synchronized (this) {
            this.MediaBrowserCompatItemReceiver = enqueuenextmediaperiodholder;
        }
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final enqueueNextMediaPeriodHolder AudioAttributesCompatParcelizer() {
        enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder;
        synchronized (this) {
            enqueuenextmediaperiodholder = this.MediaBrowserCompatItemReceiver;
        }
        return enqueuenextmediaperiodholder;
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void RemoteActionCompatParcelizer(Drawable drawable) {
        synchronized (this) {
        }
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void RemoteActionCompatParcelizer(R r) {
        synchronized (this) {
        }
    }

    private R RemoteActionCompatParcelizer(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        synchronized (this) {
            if (this.read && !isDone()) {
                moveMediaSourceRange.RemoteActionCompatParcelizer();
            }
            if (this.write) {
                throw new CancellationException();
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                throw new ExecutionException(this.RemoteActionCompatParcelizer);
            }
            if (this.AudioAttributesImplApi21Parcelizer) {
                return this.AudioAttributesImplBaseParcelizer;
            }
            if (l == null) {
                AudioAttributesCompatParcelizer.write(this, 0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    AudioAttributesCompatParcelizer.write(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                throw new ExecutionException(this.RemoteActionCompatParcelizer);
            }
            if (this.write) {
                throw new CancellationException();
            }
            if (!this.AudioAttributesImplApi21Parcelizer) {
                throw new TimeoutException();
            }
            return this.AudioAttributesImplBaseParcelizer;
        }
    }

    @Override // kotlin.getUpdatedMediaPeriodInfo
    public final boolean RemoteActionCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed, MediaSourceInfoHolder<R> mediaSourceInfoHolder) {
        synchronized (this) {
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            this.RemoteActionCompatParcelizer = setlivemaxplaybackspeed;
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
        }
        return false;
    }

    @Override // kotlin.getUpdatedMediaPeriodInfo
    public final boolean RemoteActionCompatParcelizer(R r, Object obj, onTracksChanged ontrackschanged) {
        synchronized (this) {
            this.AudioAttributesImplApi21Parcelizer = true;
            this.AudioAttributesImplBaseParcelizer = r;
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
        }
        return false;
    }

    public final String toString() {
        enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        String string = sb.toString();
        synchronized (this) {
            enqueuenextmediaperiodholder = null;
            if (this.write) {
                str = "CANCELLED";
            } else if (this.MediaBrowserCompatCustomActionResultReceiver) {
                str = "FAILURE";
            } else if (this.AudioAttributesImplApi21Parcelizer) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                enqueuenextmediaperiodholder = this.MediaBrowserCompatItemReceiver;
            }
        }
        if (enqueuenextmediaperiodholder != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(str);
            sb2.append(", request=[");
            sb2.append(enqueuenextmediaperiodholder);
            sb2.append("]]");
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(str);
        sb3.append("]");
        return sb3.toString();
    }

    static class AudioAttributesCompatParcelizer {
        AudioAttributesCompatParcelizer() {
        }

        static void write(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }

        static void RemoteActionCompatParcelizer(Object obj) {
            obj.notifyAll();
        }
    }
}
