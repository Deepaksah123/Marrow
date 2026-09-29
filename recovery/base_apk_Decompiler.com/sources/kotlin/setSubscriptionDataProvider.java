package kotlin;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0002\u0006\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0006\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0006\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0006\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/setSubscriptionDataProvider;", "Lo/CustomTextView;", "<init>", "()V", "Ljava/io/IOException;", "p0", "RemoteActionCompatParcelizer", "(Ljava/io/IOException;)Ljava/io/IOException;", "", "MediaBrowserCompatItemReceiver", "", "AudioAttributesImplApi26Parcelizer", "()Z", "write", "", "(J)J", "Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "read", "(Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;)Lo/setCompoundDrawablesWithIntrinsicBoundsCompatdefault;", "Lo/setLockedFromSeek;", "IconCompatParcelizer", "(Lo/setLockedFromSeek;)Lo/setLockedFromSeek;", "MediaBrowserCompatCustomActionResultReceiver", "Z", "Lo/setSubscriptionDataProvider;", "AudioAttributesCompatParcelizer", "AudioAttributesImplBaseParcelizer", "J"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class setSubscriptionDataProvider extends CustomTextView {
    private static final long AudioAttributesCompatParcelizer;
    private static setSubscriptionDataProvider AudioAttributesImplApi21Parcelizer;
    private static final ReentrantLock MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Condition read;
    private static final long write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private setSubscriptionDataProvider AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private long read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    protected void RemoteActionCompatParcelizer() {
    }

    public final void MediaBrowserCompatItemReceiver() {
        long iconCompatParcelizer = getIconCompatParcelizer();
        boolean remoteActionCompatParcelizer = getRemoteActionCompatParcelizer();
        if (iconCompatParcelizer != 0 || remoteActionCompatParcelizer) {
            Companion.read(this, iconCompatParcelizer, remoteActionCompatParcelizer);
        }
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return Companion.read(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long RemoteActionCompatParcelizer(long p0) {
        return this.read - p0;
    }

    public static final class write implements setCompoundDrawablesWithIntrinsicBoundsCompatdefault {
        private /* synthetic */ setCompoundDrawablesWithIntrinsicBoundsCompatdefault AudioAttributesCompatParcelizer;

        write(setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault) {
            this.AudioAttributesCompatParcelizer = setcompounddrawableswithintrinsicboundscompatdefault;
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        public final void IconCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            isConciseModeOn.write(resetcurrentselectedposition.getSize(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                getMarkerPaint getmarkerpaint = resetcurrentselectedposition.head;
                toMagicModuleMetaRepoModel.write(getmarkerpaint);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += (long) (getmarkerpaint.limit - getmarkerpaint.pos);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        getmarkerpaint = getmarkerpaint.next;
                        toMagicModuleMetaRepoModel.write(getmarkerpaint);
                    }
                }
                setSubscriptionDataProvider setsubscriptiondataprovider = setSubscriptionDataProvider.this;
                setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault = this.AudioAttributesCompatParcelizer;
                setsubscriptiondataprovider.MediaBrowserCompatItemReceiver();
                try {
                    setcompounddrawableswithintrinsicboundscompatdefault.IconCompatParcelizer(resetcurrentselectedposition, j2);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                        throw setsubscriptiondataprovider.RemoteActionCompatParcelizer((IOException) null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    e = e;
                    if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                        e = setsubscriptiondataprovider.RemoteActionCompatParcelizer(e);
                    }
                    throw e;
                } finally {
                    setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer();
                }
            }
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Flushable
        public final void flush() throws IOException {
            setSubscriptionDataProvider setsubscriptiondataprovider = setSubscriptionDataProvider.this;
            setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault = this.AudioAttributesCompatParcelizer;
            setsubscriptiondataprovider.MediaBrowserCompatItemReceiver();
            try {
                setcompounddrawableswithintrinsicboundscompatdefault.flush();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                    throw setsubscriptiondataprovider.RemoteActionCompatParcelizer((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                    e = setsubscriptiondataprovider.RemoteActionCompatParcelizer(e);
                }
                throw e;
            } finally {
                setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer();
            }
        }

        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            setSubscriptionDataProvider setsubscriptiondataprovider = setSubscriptionDataProvider.this;
            setCompoundDrawablesWithIntrinsicBoundsCompatdefault setcompounddrawableswithintrinsicboundscompatdefault = this.AudioAttributesCompatParcelizer;
            setsubscriptiondataprovider.MediaBrowserCompatItemReceiver();
            try {
                setcompounddrawableswithintrinsicboundscompatdefault.close();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                    throw setsubscriptiondataprovider.RemoteActionCompatParcelizer((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                    e = setsubscriptiondataprovider.RemoteActionCompatParcelizer(e);
                }
                throw e;
            } finally {
                setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setCompoundDrawablesWithIntrinsicBoundsCompatdefault
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public setSubscriptionDataProvider RemoteActionCompatParcelizer() {
            return setSubscriptionDataProvider.this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    public final setCompoundDrawablesWithIntrinsicBoundsCompatdefault read(setCompoundDrawablesWithIntrinsicBoundsCompatdefault p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new write(p0);
    }

    public static final class AudioAttributesCompatParcelizer implements setLockedFromSeek {
        private /* synthetic */ setLockedFromSeek AudioAttributesCompatParcelizer;

        AudioAttributesCompatParcelizer(setLockedFromSeek setlockedfromseek) {
            this.AudioAttributesCompatParcelizer = setlockedfromseek;
        }

        @Override // kotlin.setLockedFromSeek
        public final long AudioAttributesCompatParcelizer(resetCurrentSelectedPosition resetcurrentselectedposition, long j) throws IOException {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            setSubscriptionDataProvider setsubscriptiondataprovider = setSubscriptionDataProvider.this;
            setLockedFromSeek setlockedfromseek = this.AudioAttributesCompatParcelizer;
            setsubscriptiondataprovider.MediaBrowserCompatItemReceiver();
            try {
                long jAudioAttributesCompatParcelizer = setlockedfromseek.AudioAttributesCompatParcelizer(resetcurrentselectedposition, j);
                if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                    throw setsubscriptiondataprovider.RemoteActionCompatParcelizer((IOException) null);
                }
                return jAudioAttributesCompatParcelizer;
            } catch (IOException e) {
                e = e;
                if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                    e = setsubscriptiondataprovider.RemoteActionCompatParcelizer(e);
                }
                throw e;
            } finally {
                setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer();
            }
        }

        @Override // kotlin.setLockedFromSeek, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            setSubscriptionDataProvider setsubscriptiondataprovider = setSubscriptionDataProvider.this;
            setLockedFromSeek setlockedfromseek = this.AudioAttributesCompatParcelizer;
            setsubscriptiondataprovider.MediaBrowserCompatItemReceiver();
            try {
                setlockedfromseek.close();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                    throw setsubscriptiondataprovider.RemoteActionCompatParcelizer((IOException) null);
                }
            } catch (IOException e) {
                e = e;
                if (setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer()) {
                    e = setsubscriptiondataprovider.RemoteActionCompatParcelizer(e);
                }
                throw e;
            } finally {
                setsubscriptiondataprovider.AudioAttributesImplApi26Parcelizer();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.setLockedFromSeek
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public setSubscriptionDataProvider RemoteActionCompatParcelizer() {
            return setSubscriptionDataProvider.this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    public final setLockedFromSeek IconCompatParcelizer(setLockedFromSeek p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new AudioAttributesCompatParcelizer(p0);
    }

    public final IOException RemoteActionCompatParcelizer(IOException p0) {
        return write(p0);
    }

    protected IOException write(IOException p0) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (p0 != null) {
            interruptedIOException.initCause(p0);
        }
        return interruptedIOException;
    }

    static final class IconCompatParcelizer extends Thread {
        public IconCompatParcelizer() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            ReentrantLock reentrantLock;
            setSubscriptionDataProvider setsubscriptiondataproviderAudioAttributesCompatParcelizer;
            while (true) {
                try {
                    Companion companion = setSubscriptionDataProvider.INSTANCE;
                    reentrantLock = Companion.read();
                    reentrantLock.lock();
                    try {
                        Companion companion2 = setSubscriptionDataProvider.INSTANCE;
                        setsubscriptiondataproviderAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer();
                    } finally {
                        reentrantLock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (setsubscriptiondataproviderAudioAttributesCompatParcelizer == setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer) {
                    Companion companion3 = setSubscriptionDataProvider.INSTANCE;
                    setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer = null;
                    return;
                } else {
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    reentrantLock.unlock();
                    if (setsubscriptiondataproviderAudioAttributesCompatParcelizer != null) {
                        setsubscriptiondataproviderAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.setSubscriptionDataProvider$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\t\u0010\u001c"}, d2 = {"Lo/setSubscriptionDataProvider$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/setSubscriptionDataProvider;", "AudioAttributesCompatParcelizer", "()Lo/setSubscriptionDataProvider;", "p0", "", "read", "(Lo/setSubscriptionDataProvider;)Z", "", "p1", "p2", "", "(Lo/setSubscriptionDataProvider;JZ)V", "write", "J", "RemoteActionCompatParcelizer", "Ljava/util/concurrent/locks/Condition;", "Ljava/util/concurrent/locks/Condition;", "IconCompatParcelizer", "()Ljava/util/concurrent/locks/Condition;", "AudioAttributesImplApi21Parcelizer", "Lo/setSubscriptionDataProvider;", "Ljava/util/concurrent/locks/ReentrantLock;", "MediaBrowserCompatItemReceiver", "Ljava/util/concurrent/locks/ReentrantLock;", "()Ljava/util/concurrent/locks/ReentrantLock;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static ReentrantLock read() {
            return setSubscriptionDataProvider.MediaBrowserCompatItemReceiver;
        }

        private static Condition IconCompatParcelizer() {
            return setSubscriptionDataProvider.read;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void read(setSubscriptionDataProvider p0, long p1, boolean p2) {
            Companion companion = setSubscriptionDataProvider.INSTANCE;
            ReentrantLock reentrantLock = read();
            reentrantLock.lock();
            try {
                if (!p0.RemoteActionCompatParcelizer) {
                    p0.RemoteActionCompatParcelizer = true;
                    if (setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer == null) {
                        Companion companion2 = setSubscriptionDataProvider.INSTANCE;
                        setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer = new setSubscriptionDataProvider();
                        new IconCompatParcelizer().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (p1 != 0 && p2) {
                        p0.read = Math.min(p1, p0.bo_() - jNanoTime) + jNanoTime;
                    } else if (p1 != 0) {
                        p0.read = p1 + jNanoTime;
                    } else if (p2) {
                        p0.read = p0.bo_();
                    } else {
                        throw new AssertionError();
                    }
                    long jRemoteActionCompatParcelizer = p0.RemoteActionCompatParcelizer(jNanoTime);
                    setSubscriptionDataProvider setsubscriptiondataprovider = setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer;
                    toMagicModuleMetaRepoModel.write(setsubscriptiondataprovider);
                    while (setsubscriptiondataprovider.AudioAttributesCompatParcelizer != null) {
                        setSubscriptionDataProvider setsubscriptiondataprovider2 = setsubscriptiondataprovider.AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(setsubscriptiondataprovider2);
                        if (jRemoteActionCompatParcelizer < setsubscriptiondataprovider2.RemoteActionCompatParcelizer(jNanoTime)) {
                            break;
                        }
                        setsubscriptiondataprovider = setsubscriptiondataprovider.AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.write(setsubscriptiondataprovider);
                    }
                    p0.AudioAttributesCompatParcelizer = setsubscriptiondataprovider.AudioAttributesCompatParcelizer;
                    setsubscriptiondataprovider.AudioAttributesCompatParcelizer = p0;
                    if (setsubscriptiondataprovider == setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer) {
                        Companion companion3 = setSubscriptionDataProvider.INSTANCE;
                        IconCompatParcelizer().signal();
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } finally {
                reentrantLock.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean read(setSubscriptionDataProvider p0) {
            Companion companion = setSubscriptionDataProvider.INSTANCE;
            ReentrantLock reentrantLock = read();
            reentrantLock.lock();
            try {
                if (!p0.RemoteActionCompatParcelizer) {
                    return false;
                }
                p0.RemoteActionCompatParcelizer = false;
                for (setSubscriptionDataProvider setsubscriptiondataprovider = setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer; setsubscriptiondataprovider != null; setsubscriptiondataprovider = setsubscriptiondataprovider.AudioAttributesCompatParcelizer) {
                    if (setsubscriptiondataprovider.AudioAttributesCompatParcelizer == p0) {
                        setsubscriptiondataprovider.AudioAttributesCompatParcelizer = p0.AudioAttributesCompatParcelizer;
                        p0.AudioAttributesCompatParcelizer = null;
                        return false;
                    }
                }
                reentrantLock.unlock();
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public static setSubscriptionDataProvider AudioAttributesCompatParcelizer() throws InterruptedException {
            setSubscriptionDataProvider setsubscriptiondataprovider = setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.write(setsubscriptiondataprovider);
            setSubscriptionDataProvider setsubscriptiondataprovider2 = setsubscriptiondataprovider.AudioAttributesCompatParcelizer;
            if (setsubscriptiondataprovider2 != null) {
                long jRemoteActionCompatParcelizer = setsubscriptiondataprovider2.RemoteActionCompatParcelizer(System.nanoTime());
                if (jRemoteActionCompatParcelizer <= 0) {
                    setSubscriptionDataProvider setsubscriptiondataprovider3 = setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer;
                    toMagicModuleMetaRepoModel.write(setsubscriptiondataprovider3);
                    setsubscriptiondataprovider3.AudioAttributesCompatParcelizer = setsubscriptiondataprovider2.AudioAttributesCompatParcelizer;
                    setsubscriptiondataprovider2.AudioAttributesCompatParcelizer = null;
                    return setsubscriptiondataprovider2;
                }
                IconCompatParcelizer().await(jRemoteActionCompatParcelizer, TimeUnit.NANOSECONDS);
                return null;
            }
            long jNanoTime = System.nanoTime();
            IconCompatParcelizer().await(setSubscriptionDataProvider.write, TimeUnit.MILLISECONDS);
            setSubscriptionDataProvider setsubscriptiondataprovider4 = setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.write(setsubscriptiondataprovider4);
            if (setsubscriptiondataprovider4.AudioAttributesCompatParcelizer != null || System.nanoTime() - jNanoTime < setSubscriptionDataProvider.AudioAttributesCompatParcelizer) {
                return null;
            }
            return setSubscriptionDataProvider.AudioAttributesImplApi21Parcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        MediaBrowserCompatItemReceiver = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(conditionNewCondition, "");
        read = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        write = millis;
        AudioAttributesCompatParcelizer = TimeUnit.MILLISECONDS.toNanos(millis);
    }
}
