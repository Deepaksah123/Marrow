package kotlin;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SequenceSerializer {
    private static final Comparator<write> IconCompatParcelizer = new Comparator<write>() { // from class: o.SequenceSerializer.2
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(write writeVar, write writeVar2) {
            return AudioAttributesCompatParcelizer(writeVar, writeVar2);
        }

        private static int AudioAttributesCompatParcelizer(write writeVar, write writeVar2) {
            return writeVar.write - writeVar2.write;
        }
    };

    public static abstract class IconCompatParcelizer {
        public Object AudioAttributesCompatParcelizer(int i, int i2) {
            return null;
        }

        public abstract int IconCompatParcelizer();

        public abstract boolean RemoteActionCompatParcelizer(int i, int i2);

        public abstract boolean read(int i, int i2);

        public abstract int write();
    }

    public static abstract class RemoteActionCompatParcelizer<T> {
        public abstract boolean RemoteActionCompatParcelizer(T t, T t2);

        public abstract boolean read(T t, T t2);

        public Object write(T t, T t2) {
            return null;
        }
    }

    public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        return RemoteActionCompatParcelizer(iconCompatParcelizer);
    }

    private static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        int iWrite = iconCompatParcelizer.write();
        int iIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new AudioAttributesImplApi21Parcelizer(iWrite, iIconCompatParcelizer));
        int i = ((((iWrite + iIconCompatParcelizer) + 1) / 2) << 1) + 1;
        read readVar = new read(i);
        read readVar2 = new read(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer = (AudioAttributesImplApi21Parcelizer) arrayList2.remove(arrayList2.size() - 1);
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer, iconCompatParcelizer, readVar, readVar2);
            if (audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer != null) {
                if (audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer.read() > 0) {
                    arrayList.add(audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer.write());
                }
                AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer2 = arrayList3.isEmpty() ? new AudioAttributesImplApi21Parcelizer() : (AudioAttributesImplApi21Parcelizer) arrayList3.remove(arrayList3.size() - 1);
                audioAttributesImplApi21Parcelizer2.IconCompatParcelizer = audioAttributesImplApi21Parcelizer.IconCompatParcelizer;
                audioAttributesImplApi21Parcelizer2.AudioAttributesCompatParcelizer = audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer;
                audioAttributesImplApi21Parcelizer2.write = audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                audioAttributesImplApi21Parcelizer2.RemoteActionCompatParcelizer = audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer.read;
                arrayList2.add(audioAttributesImplApi21Parcelizer2);
                audioAttributesImplApi21Parcelizer.write = audioAttributesImplApi21Parcelizer.write;
                audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer = audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer;
                audioAttributesImplApi21Parcelizer.IconCompatParcelizer = audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer.IconCompatParcelizer;
                audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer = audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer.write;
                arrayList2.add(audioAttributesImplApi21Parcelizer);
            } else {
                arrayList3.add(audioAttributesImplApi21Parcelizer);
            }
        }
        Collections.sort(arrayList, IconCompatParcelizer);
        return new AudioAttributesCompatParcelizer(iconCompatParcelizer, arrayList, readVar.AudioAttributesCompatParcelizer(), readVar2.AudioAttributesCompatParcelizer(), true);
    }

    private static AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, IconCompatParcelizer iconCompatParcelizer, read readVar, read readVar2) {
        if (audioAttributesImplApi21Parcelizer.write() <= 0 || audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer() <= 0) {
            return null;
        }
        int iWrite = ((audioAttributesImplApi21Parcelizer.write() + audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()) + 1) / 2;
        readVar.read(1, audioAttributesImplApi21Parcelizer.IconCompatParcelizer);
        readVar2.read(1, audioAttributesImplApi21Parcelizer.write);
        for (int i = 0; i < iWrite; i++) {
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer, iconCompatParcelizer, readVar, readVar2, i);
            if (audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer != null) {
                return audioAttributesImplBaseParcelizerRemoteActionCompatParcelizer;
            }
            AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = read(audioAttributesImplApi21Parcelizer, iconCompatParcelizer, readVar, readVar2, i);
            if (audioAttributesImplBaseParcelizer != null) {
                return audioAttributesImplBaseParcelizer;
            }
        }
        return null;
    }

    private static AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, IconCompatParcelizer iconCompatParcelizer, read readVar, read readVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = Math.abs(audioAttributesImplApi21Parcelizer.write() - audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()) % 2 == 1;
        int iWrite = audioAttributesImplApi21Parcelizer.write();
        int iAudioAttributesCompatParcelizer = audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 == i5 || (i6 != i && readVar.read(i6 + 1) > readVar.read(i6 - 1))) {
                i2 = readVar.read(i6 + 1);
                i3 = i2;
            } else {
                i2 = readVar.read(i6 - 1);
                i3 = i2 + 1;
            }
            int i7 = (audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer + (i3 - audioAttributesImplApi21Parcelizer.IconCompatParcelizer)) - i6;
            int i8 = (i == 0 || i3 != i2) ? i7 : i7 - 1;
            while (i3 < audioAttributesImplApi21Parcelizer.write && i7 < audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer) {
                if (!iconCompatParcelizer.read(i3, i7)) {
                    break;
                }
                i3++;
                i7++;
            }
            readVar.read(i6, i3);
            if (z && (i4 = (iWrite - iAudioAttributesCompatParcelizer) - i6) >= i5 + 1 && i4 <= i - 1) {
                if (readVar2.read(i4) <= i3) {
                    AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer();
                    audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer = i2;
                    audioAttributesImplBaseParcelizer.read = i8;
                    audioAttributesImplBaseParcelizer.IconCompatParcelizer = i3;
                    audioAttributesImplBaseParcelizer.write = i7;
                    audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer = false;
                    return audioAttributesImplBaseParcelizer;
                }
            }
        }
        return null;
    }

    private static AudioAttributesImplBaseParcelizer read(AudioAttributesImplApi21Parcelizer audioAttributesImplApi21Parcelizer, IconCompatParcelizer iconCompatParcelizer, read readVar, read readVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = (audioAttributesImplApi21Parcelizer.write() - audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer()) % 2 == 0;
        int iWrite = audioAttributesImplApi21Parcelizer.write();
        int iAudioAttributesCompatParcelizer = audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 == i5 || (i6 != i && readVar2.read(i6 + 1) < readVar2.read(i6 - 1))) {
                i2 = readVar2.read(i6 + 1);
                i3 = i2;
            } else {
                i2 = readVar2.read(i6 - 1);
                i3 = i2 - 1;
            }
            int i7 = audioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer - ((audioAttributesImplApi21Parcelizer.write - i3) - i6);
            int i8 = (i == 0 || i3 != i2) ? i7 : i7 + 1;
            while (i3 > audioAttributesImplApi21Parcelizer.IconCompatParcelizer && i7 > audioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer) {
                if (!iconCompatParcelizer.read(i3 - 1, i7 - 1)) {
                    break;
                }
                i3--;
                i7--;
            }
            readVar2.read(i6, i3);
            if (z && (i4 = (iWrite - iAudioAttributesCompatParcelizer) - i6) >= i5 && i4 <= i) {
                if (readVar.read(i4) >= i3) {
                    AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer();
                    audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer = i3;
                    audioAttributesImplBaseParcelizer.read = i7;
                    audioAttributesImplBaseParcelizer.IconCompatParcelizer = i2;
                    audioAttributesImplBaseParcelizer.write = i8;
                    audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer = true;
                    return audioAttributesImplBaseParcelizer;
                }
            }
        }
        return null;
    }

    static class write {
        public final int IconCompatParcelizer;
        public final int read;
        public final int write;

        write(int i, int i2, int i3) {
            this.write = i;
            this.IconCompatParcelizer = i2;
            this.read = i3;
        }

        final int RemoteActionCompatParcelizer() {
            return this.write + this.read;
        }

        final int write() {
            return this.IconCompatParcelizer + this.read;
        }
    }

    static class AudioAttributesImplBaseParcelizer {
        public boolean AudioAttributesCompatParcelizer;
        public int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public int read;
        public int write;

        AudioAttributesImplBaseParcelizer() {
        }

        private boolean IconCompatParcelizer() {
            return this.write - this.read != this.IconCompatParcelizer - this.RemoteActionCompatParcelizer;
        }

        private boolean AudioAttributesCompatParcelizer() {
            return this.write - this.read > this.IconCompatParcelizer - this.RemoteActionCompatParcelizer;
        }

        final int read() {
            return Math.min(this.IconCompatParcelizer - this.RemoteActionCompatParcelizer, this.write - this.read);
        }

        final write write() {
            if (IconCompatParcelizer()) {
                if (this.AudioAttributesCompatParcelizer) {
                    return new write(this.RemoteActionCompatParcelizer, this.read, read());
                }
                if (AudioAttributesCompatParcelizer()) {
                    return new write(this.RemoteActionCompatParcelizer, this.read + 1, read());
                }
                return new write(this.RemoteActionCompatParcelizer + 1, this.read, read());
            }
            int i = this.RemoteActionCompatParcelizer;
            return new write(i, this.read, this.IconCompatParcelizer - i);
        }
    }

    static class AudioAttributesImplApi21Parcelizer {
        int AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int write;

        public AudioAttributesImplApi21Parcelizer() {
        }

        public AudioAttributesImplApi21Parcelizer(int i, int i2) {
            this.IconCompatParcelizer = 0;
            this.write = i;
            this.AudioAttributesCompatParcelizer = 0;
            this.RemoteActionCompatParcelizer = i2;
        }

        final int write() {
            return this.write - this.IconCompatParcelizer;
        }

        final int AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer - this.AudioAttributesCompatParcelizer;
        }
    }

    public static class AudioAttributesCompatParcelizer {
        private final List<write> AudioAttributesCompatParcelizer;
        private final int[] AudioAttributesImplApi26Parcelizer;
        private final int[] IconCompatParcelizer;
        private final int MediaBrowserCompatCustomActionResultReceiver;
        private final int RemoteActionCompatParcelizer;
        private final IconCompatParcelizer read;
        private final boolean write;

        AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, List<write> list, int[] iArr, int[] iArr2, boolean z) {
            this.AudioAttributesCompatParcelizer = list;
            this.AudioAttributesImplApi26Parcelizer = iArr;
            this.IconCompatParcelizer = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.read = iconCompatParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer.write();
            this.RemoteActionCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
            this.write = true;
            read();
            write();
        }

        private void read() {
            write writeVar = this.AudioAttributesCompatParcelizer.isEmpty() ? null : this.AudioAttributesCompatParcelizer.get(0);
            if (writeVar == null || writeVar.write != 0 || writeVar.IconCompatParcelizer != 0) {
                this.AudioAttributesCompatParcelizer.add(0, new write(0, 0, 0));
            }
            this.AudioAttributesCompatParcelizer.add(new write(this.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer, 0));
        }

        private void write() {
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                for (int i = 0; i < writeVar.read; i++) {
                    int i2 = writeVar.write + i;
                    int i3 = writeVar.IconCompatParcelizer + i;
                    int i4 = this.read.RemoteActionCompatParcelizer(i2, i3) ? 1 : 2;
                    this.AudioAttributesImplApi26Parcelizer[i2] = (i3 << 4) | i4;
                    this.IconCompatParcelizer[i3] = (i2 << 4) | i4;
                }
            }
            if (this.write) {
                IconCompatParcelizer();
            }
        }

        private void IconCompatParcelizer() {
            int iRemoteActionCompatParcelizer = 0;
            for (write writeVar : this.AudioAttributesCompatParcelizer) {
                while (iRemoteActionCompatParcelizer < writeVar.write) {
                    if (this.AudioAttributesImplApi26Parcelizer[iRemoteActionCompatParcelizer] == 0) {
                        write(iRemoteActionCompatParcelizer);
                    }
                    iRemoteActionCompatParcelizer++;
                }
                iRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
            }
        }

        private void write(int i) {
            int size = this.AudioAttributesCompatParcelizer.size();
            int iWrite = 0;
            for (int i2 = 0; i2 < size; i2++) {
                write writeVar = this.AudioAttributesCompatParcelizer.get(i2);
                while (iWrite < writeVar.IconCompatParcelizer) {
                    if (this.IconCompatParcelizer[iWrite] == 0 && this.read.read(i, iWrite)) {
                        int i3 = this.read.RemoteActionCompatParcelizer(i, iWrite) ? 8 : 4;
                        this.AudioAttributesImplApi26Parcelizer[i] = (iWrite << 4) | i3;
                        this.IconCompatParcelizer[iWrite] = (i << 4) | i3;
                        return;
                    }
                    iWrite++;
                }
                iWrite = writeVar.write();
            }
        }

        public final void RemoteActionCompatParcelizer(UByteKeyDeserializer uByteKeyDeserializer) {
            ReflectionCacheBooleanTriStateFalse reflectionCacheBooleanTriStateFalse;
            int i;
            if (uByteKeyDeserializer instanceof ReflectionCacheBooleanTriStateFalse) {
                reflectionCacheBooleanTriStateFalse = (ReflectionCacheBooleanTriStateFalse) uByteKeyDeserializer;
            } else {
                reflectionCacheBooleanTriStateFalse = new ReflectionCacheBooleanTriStateFalse(uByteKeyDeserializer);
            }
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
            int i4 = this.RemoteActionCompatParcelizer;
            for (int size = this.AudioAttributesCompatParcelizer.size() - 1; size >= 0; size--) {
                write writeVar = this.AudioAttributesCompatParcelizer.get(size);
                int iRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer();
                int iWrite = writeVar.write();
                while (true) {
                    if (i3 <= iRemoteActionCompatParcelizer) {
                        break;
                    }
                    i3--;
                    int i5 = this.AudioAttributesImplApi26Parcelizer[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverWrite = write(arrayDeque, i6, false);
                        if (mediaBrowserCompatCustomActionResultReceiverWrite != null) {
                            int i7 = (i2 - mediaBrowserCompatCustomActionResultReceiverWrite.RemoteActionCompatParcelizer) - 1;
                            reflectionCacheBooleanTriStateFalse.RemoteActionCompatParcelizer(i3, i7);
                            if ((i5 & 4) != 0) {
                                reflectionCacheBooleanTriStateFalse.IconCompatParcelizer(i7, 1, this.read.AudioAttributesCompatParcelizer(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new MediaBrowserCompatCustomActionResultReceiver(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        reflectionCacheBooleanTriStateFalse.write(i3, 1);
                        i2--;
                    }
                }
                while (i4 > iWrite) {
                    i4--;
                    int i8 = this.IconCompatParcelizer[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverWrite2 = write(arrayDeque, i9, true);
                        if (mediaBrowserCompatCustomActionResultReceiverWrite2 == null) {
                            arrayDeque.add(new MediaBrowserCompatCustomActionResultReceiver(i4, i2 - i3, false));
                        } else {
                            reflectionCacheBooleanTriStateFalse.RemoteActionCompatParcelizer((i2 - mediaBrowserCompatCustomActionResultReceiverWrite2.RemoteActionCompatParcelizer) - 1, i3);
                            if ((i8 & 4) != 0) {
                                reflectionCacheBooleanTriStateFalse.IconCompatParcelizer(i3, 1, this.read.AudioAttributesCompatParcelizer(i9, i4));
                            }
                        }
                    } else {
                        reflectionCacheBooleanTriStateFalse.read(i3, 1);
                        i2++;
                    }
                }
                int i10 = writeVar.write;
                int i11 = writeVar.IconCompatParcelizer;
                for (i = 0; i < writeVar.read; i++) {
                    if ((this.AudioAttributesImplApi26Parcelizer[i10] & 15) == 2) {
                        reflectionCacheBooleanTriStateFalse.IconCompatParcelizer(i10, 1, this.read.AudioAttributesCompatParcelizer(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = writeVar.write;
                i4 = writeVar.IconCompatParcelizer;
            }
            reflectionCacheBooleanTriStateFalse.RemoteActionCompatParcelizer();
        }

        private static MediaBrowserCompatCustomActionResultReceiver write(Collection<MediaBrowserCompatCustomActionResultReceiver> collection, int i, boolean z) {
            MediaBrowserCompatCustomActionResultReceiver next;
            Iterator<MediaBrowserCompatCustomActionResultReceiver> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.write == i && next.AudioAttributesCompatParcelizer == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                MediaBrowserCompatCustomActionResultReceiver next2 = it.next();
                if (z) {
                    next2.RemoteActionCompatParcelizer--;
                } else {
                    next2.RemoteActionCompatParcelizer++;
                }
            }
            return next;
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver {
        boolean AudioAttributesCompatParcelizer;
        int RemoteActionCompatParcelizer;
        int write;

        MediaBrowserCompatCustomActionResultReceiver(int i, int i2, boolean z) {
            this.write = i;
            this.RemoteActionCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = z;
        }
    }

    static class read {
        private final int[] AudioAttributesCompatParcelizer;
        private final int read;

        read(int i) {
            this.AudioAttributesCompatParcelizer = new int[i];
            this.read = i / 2;
        }

        final int read(int i) {
            return this.AudioAttributesCompatParcelizer[i + this.read];
        }

        final int[] AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        final void read(int i, int i2) {
            this.AudioAttributesCompatParcelizer[i + this.read] = i2;
        }
    }
}
