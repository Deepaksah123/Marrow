package kotlin;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.C;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultSerializerProviderImpl {
    private long AudioAttributesCompatParcelizer;
    private final RemoteActionCompatParcelizer IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private long RemoteActionCompatParcelizer;
    private long read;
    private long write;

    public DefaultSerializerProviderImpl(AudioTrack audioTrack) {
        this.IconCompatParcelizer = new RemoteActionCompatParcelizer(audioTrack);
        AudioAttributesImplApi26Parcelizer();
    }

    public final boolean write(long j) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (remoteActionCompatParcelizer == null || j - this.RemoteActionCompatParcelizer < this.write) {
            return false;
        }
        this.RemoteActionCompatParcelizer = j;
        boolean zAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zAudioAttributesCompatParcelizer) {
                        AudioAttributesImplApi26Parcelizer();
                        return zAudioAttributesCompatParcelizer;
                    }
                } else if (!zAudioAttributesCompatParcelizer) {
                    AudioAttributesImplApi26Parcelizer();
                    return zAudioAttributesCompatParcelizer;
                }
            } else {
                if (!zAudioAttributesCompatParcelizer) {
                    AudioAttributesImplApi26Parcelizer();
                    return zAudioAttributesCompatParcelizer;
                }
                if (this.IconCompatParcelizer.IconCompatParcelizer() > this.AudioAttributesCompatParcelizer) {
                    IconCompatParcelizer(2);
                    return zAudioAttributesCompatParcelizer;
                }
            }
        } else {
            if (zAudioAttributesCompatParcelizer) {
                if (this.IconCompatParcelizer.RemoteActionCompatParcelizer() < this.read) {
                    return false;
                }
                this.AudioAttributesCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
                IconCompatParcelizer(1);
                return zAudioAttributesCompatParcelizer;
            }
            if (j - this.read > 500000) {
                IconCompatParcelizer(3);
            }
        }
        return zAudioAttributesCompatParcelizer;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer(4);
    }

    public final void IconCompatParcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == 4) {
            AudioAttributesImplApi26Parcelizer();
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver == 2;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        if (this.IconCompatParcelizer != null) {
            IconCompatParcelizer(0);
        }
    }

    public final long AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        return remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.RemoteActionCompatParcelizer() : C.TIME_UNSET;
    }

    public final long read() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            return remoteActionCompatParcelizer.IconCompatParcelizer();
        }
        return -1L;
    }

    public final void write() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.read();
        }
    }

    private void IconCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        if (i == 0) {
            this.RemoteActionCompatParcelizer = 0L;
            this.AudioAttributesCompatParcelizer = -1L;
            this.read = System.nanoTime() / 1000;
            this.write = 10000L;
            return;
        }
        if (i == 1) {
            this.write = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.write = 10000000L;
        } else {
            if (i == 4) {
                this.write = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static final class RemoteActionCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private long IconCompatParcelizer;
        private long MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private final AudioTimestamp RemoteActionCompatParcelizer = new AudioTimestamp();
        private final AudioTrack read;
        private long write;

        public RemoteActionCompatParcelizer(AudioTrack audioTrack) {
            this.read = audioTrack;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            boolean timestamp = this.read.getTimestamp(this.RemoteActionCompatParcelizer);
            if (timestamp) {
                long j = this.RemoteActionCompatParcelizer.framePosition;
                long j2 = this.MediaBrowserCompatItemReceiver;
                if (j2 > j) {
                    if (this.AudioAttributesCompatParcelizer) {
                        this.write += j2;
                        this.AudioAttributesCompatParcelizer = false;
                    } else {
                        this.MediaBrowserCompatCustomActionResultReceiver++;
                    }
                }
                this.MediaBrowserCompatItemReceiver = j;
                this.IconCompatParcelizer = j + this.write + (this.MediaBrowserCompatCustomActionResultReceiver << 32);
            }
            return timestamp;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.nanoTime / 1000;
        }

        public final long IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void read() {
            this.AudioAttributesCompatParcelizer = true;
        }
    }
}
