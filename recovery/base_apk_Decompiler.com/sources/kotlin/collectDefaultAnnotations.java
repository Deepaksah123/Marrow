package kotlin;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class collectDefaultAnnotations {
    private static ThreadLocal<collectDefaultAnnotations> IconCompatParcelizer = new ThreadLocal<>();
    private AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final AppCompatCheckBox<read, Long> RemoteActionCompatParcelizer = new AppCompatCheckBox<>();
    final ArrayList<read> write = new ArrayList<>();
    private final IconCompatParcelizer read = new IconCompatParcelizer();
    long AudioAttributesCompatParcelizer = 0;
    private boolean MediaBrowserCompatItemReceiver = false;

    interface read {
        boolean AudioAttributesCompatParcelizer(long j);
    }

    collectDefaultAnnotations() {
    }

    class IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        final void AudioAttributesCompatParcelizer() {
            collectDefaultAnnotations.this.AudioAttributesCompatParcelizer = SystemClock.uptimeMillis();
            collectDefaultAnnotations collectdefaultannotations = collectDefaultAnnotations.this;
            collectdefaultannotations.write(collectdefaultannotations.AudioAttributesCompatParcelizer);
            if (collectDefaultAnnotations.this.write.size() > 0) {
                collectDefaultAnnotations.this.write().read();
            }
        }
    }

    public static collectDefaultAnnotations RemoteActionCompatParcelizer() {
        ThreadLocal<collectDefaultAnnotations> threadLocal = IconCompatParcelizer;
        if (threadLocal.get() == null) {
            threadLocal.set(new collectDefaultAnnotations());
        }
        return threadLocal.get();
    }

    final AudioAttributesCompatParcelizer write() {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new write(this.read);
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void read(read readVar) {
        if (this.write.size() == 0) {
            write().read();
        }
        if (this.write.contains(readVar)) {
            return;
        }
        this.write.add(readVar);
    }

    public final void RemoteActionCompatParcelizer(read readVar) {
        this.RemoteActionCompatParcelizer.remove(readVar);
        int iIndexOf = this.write.indexOf(readVar);
        if (iIndexOf >= 0) {
            this.write.set(iIndexOf, null);
            this.MediaBrowserCompatItemReceiver = true;
        }
    }

    final void write(long j) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.write.size(); i++) {
            read readVar = this.write.get(i);
            if (readVar != null && read(readVar, jUptimeMillis)) {
                readVar.AudioAttributesCompatParcelizer(j);
            }
        }
        read();
    }

    private boolean read(read readVar, long j) {
        Long l = this.RemoteActionCompatParcelizer.get(readVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.RemoteActionCompatParcelizer.remove(readVar);
        return true;
    }

    private void read() {
        if (this.MediaBrowserCompatItemReceiver) {
            for (int size = this.write.size() - 1; size >= 0; size--) {
                if (this.write.get(size) == null) {
                    this.write.remove(size);
                }
            }
            this.MediaBrowserCompatItemReceiver = false;
        }
    }

    static class write extends AudioAttributesCompatParcelizer {
        private final Choreographer.FrameCallback read;
        private final Choreographer write;

        write(IconCompatParcelizer iconCompatParcelizer) {
            super(iconCompatParcelizer);
            this.write = Choreographer.getInstance();
            this.read = new Choreographer.FrameCallback() { // from class: o.collectDefaultAnnotations.write.5
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    write.this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
                }
            };
        }

        @Override // o.collectDefaultAnnotations.AudioAttributesCompatParcelizer
        final void read() {
            this.write.postFrameCallback(this.read);
        }
    }

    static abstract class AudioAttributesCompatParcelizer {
        final IconCompatParcelizer IconCompatParcelizer;

        abstract void read();

        AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = iconCompatParcelizer;
        }
    }
}
