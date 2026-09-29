package kotlin;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.setLiveMinOffsetMs;

/* JADX INFO: loaded from: classes2.dex */
final class setClipStartsAtKeyFrame {
    private volatile boolean AudioAttributesCompatParcelizer;
    private final ReferenceQueue<setLiveMinOffsetMs<?>> AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final Executor MediaBrowserCompatItemReceiver;
    private setLiveMinOffsetMs.IconCompatParcelizer RemoteActionCompatParcelizer;
    private Map<onVolumeChanged, AudioAttributesCompatParcelizer> read;
    private volatile read write;

    interface read {
    }

    setClipStartsAtKeyFrame(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: o.setClipStartsAtKeyFrame.4
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return new Thread(new Runnable() { // from class: o.setClipStartsAtKeyFrame.4.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    private setClipStartsAtKeyFrame(boolean z, Executor executor) {
        this.read = new HashMap();
        this.AudioAttributesImplBaseParcelizer = new ReferenceQueue<>();
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = executor;
        executor.execute(new Runnable() { // from class: o.setClipStartsAtKeyFrame.5
            @Override // java.lang.Runnable
            public final void run() {
                setClipStartsAtKeyFrame.this.AudioAttributesCompatParcelizer();
            }
        });
    }

    final void write(setLiveMinOffsetMs.IconCompatParcelizer iconCompatParcelizer) {
        synchronized (iconCompatParcelizer) {
            synchronized (this) {
                this.RemoteActionCompatParcelizer = iconCompatParcelizer;
            }
        }
    }

    final void IconCompatParcelizer(onVolumeChanged onvolumechanged, setLiveMinOffsetMs<?> setliveminoffsetms) {
        synchronized (this) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerPut = this.read.put(onvolumechanged, new AudioAttributesCompatParcelizer(onvolumechanged, setliveminoffsetms, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer));
            if (audioAttributesCompatParcelizerPut != null) {
                audioAttributesCompatParcelizerPut.read();
            }
        }
    }

    final void read(onVolumeChanged onvolumechanged) {
        synchronized (this) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemove = this.read.remove(onvolumechanged);
            if (audioAttributesCompatParcelizerRemove != null) {
                audioAttributesCompatParcelizerRemove.read();
            }
        }
    }

    final setLiveMinOffsetMs<?> IconCompatParcelizer(onVolumeChanged onvolumechanged) {
        synchronized (this) {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.read.get(onvolumechanged);
            if (audioAttributesCompatParcelizer == null) {
                return null;
            }
            setLiveMinOffsetMs<?> setliveminoffsetms = audioAttributesCompatParcelizer.get();
            if (setliveminoffsetms == null) {
                IconCompatParcelizer(audioAttributesCompatParcelizer);
            }
            return setliveminoffsetms;
        }
    }

    private void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this) {
            this.read.remove(audioAttributesCompatParcelizer.IconCompatParcelizer);
            if (audioAttributesCompatParcelizer.write) {
                if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer != null) {
                    this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer, new setLiveMinOffsetMs<>(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, true, false, audioAttributesCompatParcelizer.IconCompatParcelizer, this.RemoteActionCompatParcelizer));
                }
            }
        }
    }

    final void AudioAttributesCompatParcelizer() {
        while (true) {
            try {
                IconCompatParcelizer((AudioAttributesCompatParcelizer) this.AudioAttributesImplBaseParcelizer.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static final class AudioAttributesCompatParcelizer extends WeakReference<setLiveMinOffsetMs<?>> {
        setMimeType<?> AudioAttributesCompatParcelizer;
        final onVolumeChanged IconCompatParcelizer;
        final boolean write;

        AudioAttributesCompatParcelizer(onVolumeChanged onvolumechanged, setLiveMinOffsetMs<?> setliveminoffsetms, ReferenceQueue<? super setLiveMinOffsetMs<?>> referenceQueue, boolean z) {
            super(setliveminoffsetms, referenceQueue);
            this.IconCompatParcelizer = (onVolumeChanged) moveMediaSource.AudioAttributesCompatParcelizer(onvolumechanged);
            this.AudioAttributesCompatParcelizer = (setliveminoffsetms.AudioAttributesImplApi21Parcelizer() && z) ? (setMimeType) moveMediaSource.AudioAttributesCompatParcelizer(setliveminoffsetms.IconCompatParcelizer()) : null;
            this.write = setliveminoffsetms.AudioAttributesImplApi21Parcelizer();
        }

        final void read() {
            this.AudioAttributesCompatParcelizer = null;
            clear();
        }
    }
}
