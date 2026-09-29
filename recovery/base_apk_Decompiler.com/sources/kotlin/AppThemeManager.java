package kotlin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.PlaybackDrmModule;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006R\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0005\u0010\u000eJ+\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006R\u00020\u0007H\u0000¢\u0006\u0004\b\u0005\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\t\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u001d8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8F@FX\u0087\f¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u001a8F@FX\u0087\f¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u001a8F@FX\u0087\f¢\u0006\u0006\n\u0004\b&\u0010%R\u001e\u0010(\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001e\u0010*\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u00070'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070'8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010)"}, d2 = {"Lo/AppThemeManager;", "", "<init>", "()V", "", "AudioAttributesCompatParcelizer", "Lo/PlaybackDrmModule$read;", "Lo/PlaybackDrmModule;", "p0", "RemoteActionCompatParcelizer", "(Lo/PlaybackDrmModule$read;)V", "read", "(Lo/PlaybackDrmModule;)V", "", "(Ljava/lang/String;)Lo/PlaybackDrmModule$read;", "T", "Ljava/util/Deque;", "p1", "(Ljava/util/Deque;Ljava/lang/Object;)V", "", "write", "()Z", "", "Lo/toDownloadInfo;", "IconCompatParcelizer", "()Ljava/util/List;", "", "MediaBrowserCompatItemReceiver", "()I", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/concurrent/ExecutorService;", "Ljava/lang/Runnable;", "idleCallback", "Ljava/lang/Runnable;", "maxRequests", "I", "maxRequestsPerHost", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "Ljava/util/ArrayDeque;", "runningAsyncCalls", "runningSyncCalls"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AppThemeManager {
    private ExecutorService executorServiceOrNull;
    public Runnable idleCallback;
    public int maxRequests = 64;
    public int maxRequestsPerHost = 5;
    private final ArrayDeque<PlaybackDrmModule.read> readyAsyncCalls = new ArrayDeque<>();
    private final ArrayDeque<PlaybackDrmModule.read> runningAsyncCalls = new ArrayDeque<>();
    private final ArrayDeque<PlaybackDrmModule> runningSyncCalls = new ArrayDeque<>();

    private ExecutorService read() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.executorServiceOrNull == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                StringBuilder sb = new StringBuilder();
                sb.append(FirebaseDataModule.AudioAttributesImplApi21Parcelizer);
                sb.append(" Dispatcher");
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, FirebaseDataModule.RemoteActionCompatParcelizer(sb.toString(), false));
            }
            executorService = this.executorServiceOrNull;
            toMagicModuleMetaRepoModel.write(executorService);
        }
        return executorService;
    }

    public final void RemoteActionCompatParcelizer(PlaybackDrmModule.read p0) {
        PlaybackDrmModule.read readVarAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        synchronized (this) {
            this.readyAsyncCalls.add(p0);
            if (!p0.getThis$0().getForWebSocket() && (readVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0.RemoteActionCompatParcelizer())) != null) {
                p0.RemoteActionCompatParcelizer(readVarAudioAttributesCompatParcelizer);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        write();
    }

    private final PlaybackDrmModule.read AudioAttributesCompatParcelizer(String p0) {
        for (PlaybackDrmModule.read readVar : this.runningAsyncCalls) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) readVar.RemoteActionCompatParcelizer(), (Object) p0)) {
                return readVar;
            }
        }
        for (PlaybackDrmModule.read readVar2 : this.readyAsyncCalls) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) readVar2.RemoteActionCompatParcelizer(), (Object) p0)) {
                return readVar2;
            }
        }
        return null;
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            Iterator<PlaybackDrmModule.read> it = this.readyAsyncCalls.iterator();
            while (it.hasNext()) {
                it.next().getThis$0().RemoteActionCompatParcelizer();
            }
            Iterator<PlaybackDrmModule.read> it2 = this.runningAsyncCalls.iterator();
            while (it2.hasNext()) {
                it2.next().getThis$0().RemoteActionCompatParcelizer();
            }
            Iterator<PlaybackDrmModule> it3 = this.runningSyncCalls.iterator();
            while (it3.hasNext()) {
                it3.next().RemoteActionCompatParcelizer();
            }
        }
    }

    public final void read(PlaybackDrmModule p0) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.runningSyncCalls.add(p0);
        }
    }

    public final void AudioAttributesCompatParcelizer(PlaybackDrmModule.read p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.getCallsPerHost().decrementAndGet();
        AudioAttributesCompatParcelizer(this.runningAsyncCalls, p0);
    }

    public final void AudioAttributesCompatParcelizer(PlaybackDrmModule p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        AudioAttributesCompatParcelizer(this.runningSyncCalls, p0);
    }

    private final <T> void AudioAttributesCompatParcelizer(Deque<T> p0, T p1) {
        Runnable runnable;
        synchronized (this) {
            if (!p0.remove(p1)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        if (write() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public final List<toDownloadInfo> IconCompatParcelizer() {
        List<toDownloadInfo> listUnmodifiableList;
        synchronized (this) {
            ArrayDeque<PlaybackDrmModule.read> arrayDeque = this.readyAsyncCalls;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayDeque, 10));
            Iterator<T> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlaybackDrmModule.read) it.next()).getThis$0());
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listUnmodifiableList, "");
        }
        return listUnmodifiableList;
    }

    public final List<toDownloadInfo> RemoteActionCompatParcelizer() {
        List<toDownloadInfo> listUnmodifiableList;
        synchronized (this) {
            ArrayDeque<PlaybackDrmModule> arrayDeque = this.runningSyncCalls;
            ArrayDeque<PlaybackDrmModule.read> arrayDeque2 = this.runningAsyncCalls;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayDeque2, 10));
            Iterator<T> it = arrayDeque2.iterator();
            while (it.hasNext()) {
                arrayList.add(((PlaybackDrmModule.read) it.next()).getThis$0());
            }
            listUnmodifiableList = Collections.unmodifiableList(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayDeque, (Iterable) arrayList));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listUnmodifiableList, "");
        }
        return listUnmodifiableList;
    }

    private int MediaBrowserCompatItemReceiver() {
        int size;
        int size2;
        synchronized (this) {
            size = this.runningAsyncCalls.size();
            size2 = this.runningSyncCalls.size();
        }
        return size + size2;
    }

    private final boolean write() {
        int i;
        boolean z;
        boolean z2 = FirebaseDataModule.AudioAttributesCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<PlaybackDrmModule.read> it = this.readyAsyncCalls.iterator();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(it, "");
            while (it.hasNext()) {
                PlaybackDrmModule.read next = it.next();
                if (this.runningAsyncCalls.size() >= this.maxRequests) {
                    break;
                }
                if (next.getCallsPerHost().get() < this.maxRequestsPerHost) {
                    it.remove();
                    next.getCallsPerHost().incrementAndGet();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                    arrayList.add(next);
                    this.runningAsyncCalls.add(next);
                }
            }
            z = MediaBrowserCompatItemReceiver() > 0;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((PlaybackDrmModule.read) arrayList.get(i)).RemoteActionCompatParcelizer(read());
        }
        return z;
    }
}
