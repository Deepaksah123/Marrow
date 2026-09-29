package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class onCues<T> {
    private static Executor RemoteActionCompatParcelizer;
    private final Set<onAudioEnabled<T>> AudioAttributesCompatParcelizer;
    private final Set<onAudioEnabled<Throwable>> IconCompatParcelizer;
    private volatile onDroppedFrames<T> read;
    private final Handler write;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            RemoteActionCompatParcelizer = new ObjectIdWriter();
        } else {
            RemoteActionCompatParcelizer = Executors.newCachedThreadPool(new setChannelCount());
        }
    }

    public onCues(Callable<onDroppedFrames<T>> callable) {
        this(callable, false);
    }

    public onCues(T t) {
        this.AudioAttributesCompatParcelizer = new LinkedHashSet(1);
        this.IconCompatParcelizer = new LinkedHashSet(1);
        this.write = new Handler(Looper.getMainLooper());
        this.read = null;
        read((onDroppedFrames) new onDroppedFrames<>(t));
    }

    public onCues(Callable<onDroppedFrames<T>> callable, boolean z) {
        this.AudioAttributesCompatParcelizer = new LinkedHashSet(1);
        this.IconCompatParcelizer = new LinkedHashSet(1);
        this.write = new Handler(Looper.getMainLooper());
        this.read = null;
        if (z) {
            try {
                read((onDroppedFrames) callable.call());
                return;
            } catch (Throwable th) {
                read((onDroppedFrames) new onDroppedFrames<>(th));
                return;
            }
        }
        RemoteActionCompatParcelizer.execute(new IconCompatParcelizer(this, callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read(onDroppedFrames<T> ondroppedframes) {
        if (this.read != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.read = ondroppedframes;
        IconCompatParcelizer();
    }

    public final onCues<T> write(onAudioEnabled<T> onaudioenabled) {
        synchronized (this) {
            onDroppedFrames<T> ondroppedframes = this.read;
            if (ondroppedframes != null && ondroppedframes.IconCompatParcelizer() != null) {
                onaudioenabled.onResult(ondroppedframes.IconCompatParcelizer());
            }
            this.AudioAttributesCompatParcelizer.add(onaudioenabled);
        }
        return this;
    }

    public final onCues<T> IconCompatParcelizer(onAudioEnabled<T> onaudioenabled) {
        synchronized (this) {
            this.AudioAttributesCompatParcelizer.remove(onaudioenabled);
        }
        return this;
    }

    public final onCues<T> read(onAudioEnabled<Throwable> onaudioenabled) {
        synchronized (this) {
            onDroppedFrames<T> ondroppedframes = this.read;
            if (ondroppedframes != null && ondroppedframes.write() != null) {
                onaudioenabled.onResult(ondroppedframes.write());
            }
            this.IconCompatParcelizer.add(onaudioenabled);
        }
        return this;
    }

    public final onCues<T> RemoteActionCompatParcelizer(onAudioEnabled<Throwable> onaudioenabled) {
        synchronized (this) {
            this.IconCompatParcelizer.remove(onaudioenabled);
        }
        return this;
    }

    public final onDroppedFrames<T> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    private void IconCompatParcelizer() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            read();
        } else {
            this.write.post(new Runnable() { // from class: o.onStreamVolumeChanged
                @Override // java.lang.Runnable
                public final void run() {
                    this.AudioAttributesCompatParcelizer.read();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void read() {
        onDroppedFrames<T> ondroppedframes = this.read;
        if (ondroppedframes == null) {
            return;
        }
        if (ondroppedframes.IconCompatParcelizer() != null) {
            read(ondroppedframes.IconCompatParcelizer());
        } else {
            write(ondroppedframes.write());
        }
    }

    private void read(T t) {
        synchronized (this) {
            Iterator it = new ArrayList(this.AudioAttributesCompatParcelizer).iterator();
            while (it.hasNext()) {
                ((onAudioEnabled) it.next()).onResult(t);
            }
        }
    }

    private void write(Throwable th) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.IconCompatParcelizer);
            if (arrayList.isEmpty()) {
                access3000.IconCompatParcelizer("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((onAudioEnabled) it.next()).onResult(th);
            }
        }
    }

    static class IconCompatParcelizer<T> extends FutureTask<onDroppedFrames<T>> {
        private onCues<T> write;

        IconCompatParcelizer(onCues<T> oncues, Callable<onDroppedFrames<T>> callable) {
            super(callable);
            this.write = oncues;
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            try {
                if (isCancelled()) {
                    return;
                }
                try {
                    this.write.read((onDroppedFrames) get());
                } catch (InterruptedException | ExecutionException e) {
                    this.write.read(new onDroppedFrames(e));
                }
            } finally {
                this.write = null;
            }
        }
    }
}
