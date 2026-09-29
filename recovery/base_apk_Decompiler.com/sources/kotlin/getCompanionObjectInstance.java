package kotlin;

import android.graphics.Color;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import kotlin.ReflectionCache;

/* JADX INFO: loaded from: classes4.dex */
final class getCompanionObjectInstance {
    private static final Comparator<AudioAttributesCompatParcelizer> AudioAttributesImplApi21Parcelizer = new Comparator<AudioAttributesCompatParcelizer>() { // from class: o.getCompanionObjectInstance.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
            return IconCompatParcelizer(audioAttributesCompatParcelizer, audioAttributesCompatParcelizer2);
        }

        private static int IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2) {
            return audioAttributesCompatParcelizer2.IconCompatParcelizer() - audioAttributesCompatParcelizer.IconCompatParcelizer();
        }
    };
    final List<ReflectionCache.read> AudioAttributesCompatParcelizer;
    final int[] IconCompatParcelizer;
    final int[] read;
    final ReflectionCache.IconCompatParcelizer[] write;
    private final float[] AudioAttributesImplBaseParcelizer = new float[3];
    final TimingLogger RemoteActionCompatParcelizer = null;

    static int IconCompatParcelizer(int i) {
        return i & 31;
    }

    static int RemoteActionCompatParcelizer(int i) {
        return (i >> 10) & 31;
    }

    private static int read(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    static int write(int i) {
        return (i >> 5) & 31;
    }

    getCompanionObjectInstance(int[] iArr, int i, ReflectionCache.IconCompatParcelizer[] iconCompatParcelizerArr) {
        this.write = iconCompatParcelizerArr;
        int[] iArr2 = new int[32768];
        this.IconCompatParcelizer = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = read(iArr[i2]);
            iArr[i2] = i3;
            iArr2[i3] = iArr2[i3] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0 && AudioAttributesImplApi26Parcelizer(i5)) {
                iArr2[i5] = 0;
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.read = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.AudioAttributesCompatParcelizer = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.AudioAttributesCompatParcelizer.add(new ReflectionCache.read(AudioAttributesCompatParcelizer(i9), iArr2[i9]));
            }
            return;
        }
        this.AudioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver(i);
    }

    final List<ReflectionCache.read> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private List<ReflectionCache.read> MediaBrowserCompatItemReceiver(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, AudioAttributesImplApi21Parcelizer);
        priorityQueue.offer(new AudioAttributesCompatParcelizer(0, this.read.length - 1));
        IconCompatParcelizer(priorityQueue, i);
        return write(priorityQueue);
    }

    private static void IconCompatParcelizer(PriorityQueue<AudioAttributesCompatParcelizer> priorityQueue, int i) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerPoll;
        while (priorityQueue.size() < i && (audioAttributesCompatParcelizerPoll = priorityQueue.poll()) != null && audioAttributesCompatParcelizerPoll.AudioAttributesCompatParcelizer()) {
            priorityQueue.offer(audioAttributesCompatParcelizerPoll.read());
            priorityQueue.offer(audioAttributesCompatParcelizerPoll);
        }
    }

    private List<ReflectionCache.read> write(Collection<AudioAttributesCompatParcelizer> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<AudioAttributesCompatParcelizer> it = collection.iterator();
        while (it.hasNext()) {
            ReflectionCache.read readVarRemoteActionCompatParcelizer = it.next().RemoteActionCompatParcelizer();
            if (!IconCompatParcelizer(readVarRemoteActionCompatParcelizer)) {
                arrayList.add(readVarRemoteActionCompatParcelizer);
            }
        }
        return arrayList;
    }

    class AudioAttributesCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private int write;

        AudioAttributesCompatParcelizer(int i, int i2) {
            this.AudioAttributesCompatParcelizer = i;
            this.AudioAttributesImplBaseParcelizer = i2;
            MediaBrowserCompatCustomActionResultReceiver();
        }

        final int IconCompatParcelizer() {
            return ((this.write - this.AudioAttributesImplApi26Parcelizer) + 1) * ((this.RemoteActionCompatParcelizer - this.MediaBrowserCompatItemReceiver) + 1) * ((this.IconCompatParcelizer - this.MediaBrowserCompatCustomActionResultReceiver) + 1);
        }

        final boolean AudioAttributesCompatParcelizer() {
            return MediaBrowserCompatItemReceiver() > 1;
        }

        private int MediaBrowserCompatItemReceiver() {
            return (this.AudioAttributesImplBaseParcelizer + 1) - this.AudioAttributesCompatParcelizer;
        }

        private void MediaBrowserCompatCustomActionResultReceiver() {
            int[] iArr = getCompanionObjectInstance.this.read;
            int[] iArr2 = getCompanionObjectInstance.this.IconCompatParcelizer;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.AudioAttributesCompatParcelizer; i8 <= this.AudioAttributesImplBaseParcelizer; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int iRemoteActionCompatParcelizer = getCompanionObjectInstance.RemoteActionCompatParcelizer(i9);
                int iWrite = getCompanionObjectInstance.write(i9);
                int iIconCompatParcelizer = getCompanionObjectInstance.IconCompatParcelizer(i9);
                if (iRemoteActionCompatParcelizer > i2) {
                    i2 = iRemoteActionCompatParcelizer;
                }
                if (iRemoteActionCompatParcelizer < i) {
                    i = iRemoteActionCompatParcelizer;
                }
                if (iWrite > i3) {
                    i3 = iWrite;
                }
                if (iWrite < i6) {
                    i6 = iWrite;
                }
                if (iIconCompatParcelizer > i4) {
                    i4 = iIconCompatParcelizer;
                }
                if (iIconCompatParcelizer < i7) {
                    i7 = iIconCompatParcelizer;
                }
            }
            this.AudioAttributesImplApi26Parcelizer = i;
            this.write = i2;
            this.MediaBrowserCompatItemReceiver = i6;
            this.RemoteActionCompatParcelizer = i3;
            this.MediaBrowserCompatCustomActionResultReceiver = i7;
            this.IconCompatParcelizer = i4;
            this.AudioAttributesImplApi21Parcelizer = i5;
        }

        final AudioAttributesCompatParcelizer read() {
            if (!AudioAttributesCompatParcelizer()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iWrite = write();
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getCompanionObjectInstance.this.new AudioAttributesCompatParcelizer(iWrite + 1, this.AudioAttributesImplBaseParcelizer);
            this.AudioAttributesImplBaseParcelizer = iWrite;
            MediaBrowserCompatCustomActionResultReceiver();
            return audioAttributesCompatParcelizer;
        }

        private int AudioAttributesImplBaseParcelizer() {
            int i = this.write - this.AudioAttributesImplApi26Parcelizer;
            int i2 = this.RemoteActionCompatParcelizer - this.MediaBrowserCompatItemReceiver;
            int i3 = this.IconCompatParcelizer - this.MediaBrowserCompatCustomActionResultReceiver;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        private int write() {
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            int[] iArr = getCompanionObjectInstance.this.read;
            int[] iArr2 = getCompanionObjectInstance.this.IconCompatParcelizer;
            getCompanionObjectInstance.read(iArr, iAudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
            Arrays.sort(iArr, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer + 1);
            getCompanionObjectInstance.read(iArr, iAudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
            int i = this.AudioAttributesImplApi21Parcelizer / 2;
            int i2 = this.AudioAttributesCompatParcelizer;
            int i3 = 0;
            while (true) {
                int i4 = this.AudioAttributesImplBaseParcelizer;
                if (i2 <= i4) {
                    i3 += iArr2[iArr[i2]];
                    if (i3 >= i) {
                        return Math.min(i4 - 1, i2);
                    }
                    i2++;
                } else {
                    return this.AudioAttributesCompatParcelizer;
                }
            }
        }

        final ReflectionCache.read RemoteActionCompatParcelizer() {
            int[] iArr = getCompanionObjectInstance.this.read;
            int[] iArr2 = getCompanionObjectInstance.this.IconCompatParcelizer;
            int iRemoteActionCompatParcelizer = 0;
            int i = 0;
            int iWrite = 0;
            int iIconCompatParcelizer = 0;
            for (int i2 = this.AudioAttributesCompatParcelizer; i2 <= this.AudioAttributesImplBaseParcelizer; i2++) {
                int i3 = iArr[i2];
                int i4 = iArr2[i3];
                i += i4;
                iRemoteActionCompatParcelizer += getCompanionObjectInstance.RemoteActionCompatParcelizer(i3) * i4;
                iWrite += getCompanionObjectInstance.write(i3) * i4;
                iIconCompatParcelizer += i4 * getCompanionObjectInstance.IconCompatParcelizer(i3);
            }
            float f = i;
            return new ReflectionCache.read(getCompanionObjectInstance.RemoteActionCompatParcelizer(Math.round(iRemoteActionCompatParcelizer / f), Math.round(iWrite / f), Math.round(iIconCompatParcelizer / f)), i);
        }
    }

    static void read(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = IconCompatParcelizer(i4) | (write(i4) << 10) | (RemoteActionCompatParcelizer(i4) << 5);
                i2++;
            }
            return;
        }
        if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = RemoteActionCompatParcelizer(i5) | (IconCompatParcelizer(i5) << 10) | (write(i5) << 5);
                i2++;
            }
        }
    }

    private boolean AudioAttributesImplApi26Parcelizer(int i) {
        _verifyNumberForScalarCoercion.write(AudioAttributesCompatParcelizer(i), this.AudioAttributesImplBaseParcelizer);
        return AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
    }

    private boolean IconCompatParcelizer(ReflectionCache.read readVar) {
        readVar.AudioAttributesCompatParcelizer();
        return AudioAttributesCompatParcelizer(readVar.IconCompatParcelizer());
    }

    private boolean AudioAttributesCompatParcelizer(float[] fArr) {
        ReflectionCache.IconCompatParcelizer[] iconCompatParcelizerArr = this.write;
        if (iconCompatParcelizerArr != null && iconCompatParcelizerArr.length > 0) {
            int length = iconCompatParcelizerArr.length;
            for (int i = 0; i < length; i++) {
                if (!this.write[i].write(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int read(int i) {
        return read(Color.blue(i), 8, 5) | (read(Color.red(i), 8, 5) << 10) | (read(Color.green(i), 8, 5) << 5);
    }

    static int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        return Color.rgb(read(i, 5, 8), read(i2, 5, 8), read(i3, 5, 8));
    }

    private static int AudioAttributesCompatParcelizer(int i) {
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(i), write(i), IconCompatParcelizer(i));
    }
}
