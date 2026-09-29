package kotlin;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.rewrapCtorProblem;

/* JADX INFO: loaded from: classes2.dex */
public final class UIntSerializer {
    final AppCompatCheckBox<RecyclerView.onMediaButtonEvent, read> RemoteActionCompatParcelizer = new AppCompatCheckBox<>();
    final setPresenter<RecyclerView.onMediaButtonEvent> IconCompatParcelizer = new setPresenter<>();

    public interface AudioAttributesCompatParcelizer {
        void AudioAttributesCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar2);

        void RemoteActionCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar2);

        void read(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar2);

        void write(RecyclerView.onMediaButtonEvent onmediabuttonevent);
    }

    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer.clear();
        this.IconCompatParcelizer.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar) {
        read readVarIconCompatParcelizer = this.RemoteActionCompatParcelizer.get(onmediabuttonevent);
        if (readVarIconCompatParcelizer == null) {
            readVarIconCompatParcelizer = read.IconCompatParcelizer();
            this.RemoteActionCompatParcelizer.put(onmediabuttonevent, readVarIconCompatParcelizer);
        }
        readVarIconCompatParcelizer.RemoteActionCompatParcelizer = writeVar;
        readVarIconCompatParcelizer.AudioAttributesCompatParcelizer |= 4;
    }

    public final boolean IconCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        read readVar = this.RemoteActionCompatParcelizer.get(onmediabuttonevent);
        return (readVar == null || (readVar.AudioAttributesCompatParcelizer & 1) == 0) ? false : true;
    }

    public final RecyclerView.AudioAttributesImplApi26Parcelizer.write MediaBrowserCompatItemReceiver(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        return AudioAttributesCompatParcelizer(onmediabuttonevent, 4);
    }

    public final RecyclerView.AudioAttributesImplApi26Parcelizer.write RemoteActionCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        return AudioAttributesCompatParcelizer(onmediabuttonevent, 8);
    }

    private RecyclerView.AudioAttributesImplApi26Parcelizer.write AudioAttributesCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
        read readVarIconCompatParcelizer;
        RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar;
        int iWrite = this.RemoteActionCompatParcelizer.write(onmediabuttonevent);
        if (iWrite < 0 || (readVarIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(iWrite)) == null || (readVarIconCompatParcelizer.AudioAttributesCompatParcelizer & i) == 0) {
            return null;
        }
        readVarIconCompatParcelizer.AudioAttributesCompatParcelizer &= ~i;
        if (i == 4) {
            writeVar = readVarIconCompatParcelizer.RemoteActionCompatParcelizer;
        } else if (i == 8) {
            writeVar = readVarIconCompatParcelizer.write;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((readVarIconCompatParcelizer.AudioAttributesCompatParcelizer & 12) == 0) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(iWrite);
            read.RemoteActionCompatParcelizer(readVarIconCompatParcelizer);
        }
        return writeVar;
    }

    public final void write(long j, RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        this.IconCompatParcelizer.write(j, onmediabuttonevent);
    }

    public final void RemoteActionCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar) {
        read readVarIconCompatParcelizer = this.RemoteActionCompatParcelizer.get(onmediabuttonevent);
        if (readVarIconCompatParcelizer == null) {
            readVarIconCompatParcelizer = read.IconCompatParcelizer();
            this.RemoteActionCompatParcelizer.put(onmediabuttonevent, readVarIconCompatParcelizer);
        }
        readVarIconCompatParcelizer.AudioAttributesCompatParcelizer |= 2;
        readVarIconCompatParcelizer.RemoteActionCompatParcelizer = writeVar;
    }

    public final boolean write(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        read readVar = this.RemoteActionCompatParcelizer.get(onmediabuttonevent);
        return (readVar == null || (readVar.AudioAttributesCompatParcelizer & 4) == 0) ? false : true;
    }

    public final RecyclerView.onMediaButtonEvent AudioAttributesCompatParcelizer(long j) {
        return this.IconCompatParcelizer.IconCompatParcelizer(j);
    }

    public final void AudioAttributesCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar) {
        read readVarIconCompatParcelizer = this.RemoteActionCompatParcelizer.get(onmediabuttonevent);
        if (readVarIconCompatParcelizer == null) {
            readVarIconCompatParcelizer = read.IconCompatParcelizer();
            this.RemoteActionCompatParcelizer.put(onmediabuttonevent, readVarIconCompatParcelizer);
        }
        readVarIconCompatParcelizer.write = writeVar;
        readVarIconCompatParcelizer.AudioAttributesCompatParcelizer |= 8;
    }

    public final void read(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        read readVarIconCompatParcelizer = this.RemoteActionCompatParcelizer.get(onmediabuttonevent);
        if (readVarIconCompatParcelizer == null) {
            readVarIconCompatParcelizer = read.IconCompatParcelizer();
            this.RemoteActionCompatParcelizer.put(onmediabuttonevent, readVarIconCompatParcelizer);
        }
        readVarIconCompatParcelizer.AudioAttributesCompatParcelizer |= 1;
    }

    public final void AudioAttributesImplApi26Parcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        read readVar = this.RemoteActionCompatParcelizer.get(onmediabuttonevent);
        if (readVar == null) {
            return;
        }
        readVar.AudioAttributesCompatParcelizer &= -2;
    }

    public final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        for (int remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer() - 1; remoteActionCompatParcelizer >= 0; remoteActionCompatParcelizer--) {
            RecyclerView.onMediaButtonEvent onmediabuttoneventWrite = this.RemoteActionCompatParcelizer.write(remoteActionCompatParcelizer);
            read readVarAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
            if ((readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer & 3) == 3) {
                audioAttributesCompatParcelizer.write(onmediabuttoneventWrite);
            } else if ((readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer & 1) != 0) {
                if (readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == null) {
                    audioAttributesCompatParcelizer.write(onmediabuttoneventWrite);
                } else {
                    audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onmediabuttoneventWrite, readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, readVarAudioAttributesCompatParcelizer.write);
                }
            } else if ((readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer & 14) == 14) {
                audioAttributesCompatParcelizer.read(onmediabuttoneventWrite, readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, readVarAudioAttributesCompatParcelizer.write);
            } else if ((readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer & 12) == 12) {
                audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(onmediabuttoneventWrite, readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, readVarAudioAttributesCompatParcelizer.write);
            } else if ((readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer & 4) != 0) {
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onmediabuttoneventWrite, readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, null);
            } else if ((readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer & 8) != 0) {
                audioAttributesCompatParcelizer.read(onmediabuttoneventWrite, readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, readVarAudioAttributesCompatParcelizer.write);
            } else {
                int i = readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
            }
            read.RemoteActionCompatParcelizer(readVarAudioAttributesCompatParcelizer);
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        int iWrite = this.IconCompatParcelizer.write() - 1;
        while (true) {
            if (iWrite < 0) {
                break;
            }
            if (onmediabuttonevent == this.IconCompatParcelizer.IconCompatParcelizer(iWrite)) {
                this.IconCompatParcelizer.read(iWrite);
                break;
            }
            iWrite--;
        }
        read readVarRemove = this.RemoteActionCompatParcelizer.remove(onmediabuttonevent);
        if (readVarRemove != null) {
            read.RemoteActionCompatParcelizer(readVarRemove);
        }
    }

    public static void IconCompatParcelizer() {
        read.AudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        AudioAttributesImplApi26Parcelizer(onmediabuttonevent);
    }

    static class read {
        private static rewrapCtorProblem.IconCompatParcelizer<read> IconCompatParcelizer = new rewrapCtorProblem.AudioAttributesCompatParcelizer(20);
        int AudioAttributesCompatParcelizer;
        RecyclerView.AudioAttributesImplApi26Parcelizer.write RemoteActionCompatParcelizer;
        RecyclerView.AudioAttributesImplApi26Parcelizer.write write;

        private read() {
        }

        static read IconCompatParcelizer() {
            read readVarRemoteActionCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer();
            return readVarRemoteActionCompatParcelizer == null ? new read() : readVarRemoteActionCompatParcelizer;
        }

        static void RemoteActionCompatParcelizer(read readVar) {
            readVar.AudioAttributesCompatParcelizer = 0;
            readVar.RemoteActionCompatParcelizer = null;
            readVar.write = null;
            IconCompatParcelizer.RemoteActionCompatParcelizer(readVar);
        }

        static void AudioAttributesCompatParcelizer() {
            while (IconCompatParcelizer.RemoteActionCompatParcelizer() != null) {
            }
        }
    }
}
