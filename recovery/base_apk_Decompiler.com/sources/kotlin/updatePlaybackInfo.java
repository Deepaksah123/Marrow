package kotlin;

import android.os.Handler;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes2.dex */
final class updatePlaybackInfo {
    private final read AudioAttributesCompatParcelizer = new read(0);
    private volatile List<? extends getCurrentPeriodIndex<?>> IconCompatParcelizer = Collections.emptyList();
    private final write MediaBrowserCompatCustomActionResultReceiver;
    private volatile List<? extends getCurrentPeriodIndex<?>> RemoteActionCompatParcelizer;
    private final Executor read;
    private final SequenceSerializer.RemoteActionCompatParcelizer<getCurrentPeriodIndex<?>> write;

    interface write {
        void read(getContentPosition getcontentposition);
    }

    updatePlaybackInfo(Handler handler, write writeVar, SequenceSerializer.RemoteActionCompatParcelizer<getCurrentPeriodIndex<?>> remoteActionCompatParcelizer) {
        this.read = new getPlaybackState(handler);
        this.MediaBrowserCompatCustomActionResultReceiver = writeVar;
        this.write = remoteActionCompatParcelizer;
    }

    public final List<? extends getCurrentPeriodIndex<?>> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final boolean write() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final boolean AudioAttributesCompatParcelizer(List<getCurrentPeriodIndex<?>> list) {
        boolean zAudioAttributesCompatParcelizer;
        synchronized (this) {
            zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            RemoteActionCompatParcelizer(list, this.AudioAttributesCompatParcelizer.read());
        }
        return zAudioAttributesCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(final List<? extends getCurrentPeriodIndex<?>> list) {
        final int i;
        final List<? extends getCurrentPeriodIndex<?>> list2;
        synchronized (this) {
            i = this.AudioAttributesCompatParcelizer.read();
            list2 = this.RemoteActionCompatParcelizer;
        }
        if (list == list2) {
            write(i, list, getContentPosition.AudioAttributesCompatParcelizer(list2));
            return;
        }
        if (list == null || list.isEmpty()) {
            write(i, null, (list2 == null || list2.isEmpty()) ? null : getContentPosition.RemoteActionCompatParcelizer(list2));
        } else if (list2 == null || list2.isEmpty()) {
            write(i, list, getContentPosition.write(list));
        } else {
            final AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(list2, list, this.write);
            this.read.execute(new Runnable() { // from class: o.updatePlaybackInfo.1
                @Override // java.lang.Runnable
                public final void run() {
                    SequenceSerializer.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = SequenceSerializer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
                    updatePlaybackInfo updateplaybackinfo = updatePlaybackInfo.this;
                    int i2 = i;
                    List list3 = list;
                    updateplaybackinfo.write(i2, list3, getContentPosition.RemoteActionCompatParcelizer(list2, list3, AudioAttributesCompatParcelizer2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(final int i, final List<? extends getCurrentPeriodIndex<?>> list, final getContentPosition getcontentposition) {
        getSeekBackIncrement.write.execute(new Runnable() { // from class: o.updatePlaybackInfo.5
            @Override // java.lang.Runnable
            public final void run() {
                boolean zRemoteActionCompatParcelizer = updatePlaybackInfo.this.RemoteActionCompatParcelizer(list, i);
                if (getcontentposition == null || !zRemoteActionCompatParcelizer) {
                    return;
                }
                updatePlaybackInfo.this.MediaBrowserCompatCustomActionResultReceiver.read(getcontentposition);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean RemoteActionCompatParcelizer(List<? extends getCurrentPeriodIndex<?>> list, int i) {
        synchronized (this) {
            if (!this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i)) {
                return false;
            }
            this.RemoteActionCompatParcelizer = list;
            if (list == null) {
                this.IconCompatParcelizer = Collections.emptyList();
            } else {
                this.IconCompatParcelizer = Collections.unmodifiableList(list);
            }
            return true;
        }
    }

    static class read {
        private volatile int RemoteActionCompatParcelizer;
        private volatile int read;

        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        final int read() {
            int i;
            synchronized (this) {
                i = this.read + 1;
                this.read = i;
            }
            return i;
        }

        final boolean RemoteActionCompatParcelizer() {
            boolean zAudioAttributesCompatParcelizer;
            synchronized (this) {
                zAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
                this.RemoteActionCompatParcelizer = this.read;
            }
            return zAudioAttributesCompatParcelizer;
        }

        final boolean AudioAttributesCompatParcelizer() {
            boolean z;
            synchronized (this) {
                z = this.read > this.RemoteActionCompatParcelizer;
            }
            return z;
        }

        final boolean AudioAttributesCompatParcelizer(int i) {
            boolean z;
            synchronized (this) {
                z = this.read == i && i > this.RemoteActionCompatParcelizer;
                if (z) {
                    this.RemoteActionCompatParcelizer = i;
                }
            }
            return z;
        }
    }

    static class AudioAttributesCompatParcelizer extends SequenceSerializer.IconCompatParcelizer {
        private List<? extends getCurrentPeriodIndex<?>> AudioAttributesCompatParcelizer;
        private List<? extends getCurrentPeriodIndex<?>> RemoteActionCompatParcelizer;
        private final SequenceSerializer.RemoteActionCompatParcelizer<getCurrentPeriodIndex<?>> read;

        AudioAttributesCompatParcelizer(List<? extends getCurrentPeriodIndex<?>> list, List<? extends getCurrentPeriodIndex<?>> list2, SequenceSerializer.RemoteActionCompatParcelizer<getCurrentPeriodIndex<?>> remoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = list;
            this.AudioAttributesCompatParcelizer = list2;
            this.read = remoteActionCompatParcelizer;
        }

        @Override // o.SequenceSerializer.IconCompatParcelizer
        public final int write() {
            return this.RemoteActionCompatParcelizer.size();
        }

        @Override // o.SequenceSerializer.IconCompatParcelizer
        public final int IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.size();
        }

        @Override // o.SequenceSerializer.IconCompatParcelizer
        public final boolean read(int i, int i2) {
            return this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.get(i), this.AudioAttributesCompatParcelizer.get(i2));
        }

        @Override // o.SequenceSerializer.IconCompatParcelizer
        public final boolean RemoteActionCompatParcelizer(int i, int i2) {
            return this.read.read(this.RemoteActionCompatParcelizer.get(i), this.AudioAttributesCompatParcelizer.get(i2));
        }

        @Override // o.SequenceSerializer.IconCompatParcelizer
        public final Object AudioAttributesCompatParcelizer(int i, int i2) {
            return this.read.write(this.RemoteActionCompatParcelizer.get(i), this.AudioAttributesCompatParcelizer.get(i2));
        }
    }
}
