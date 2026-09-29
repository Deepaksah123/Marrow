package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class getLength {
    private final int IconCompatParcelizer;
    private final List<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;
    private final float read;
    private final int write;

    /* synthetic */ getLength(float f, List list, int i, int i2, byte b) {
        this(f, list, i, i2);
    }

    private getLength(float f, List<RemoteActionCompatParcelizer> list, int i, int i2) {
        this.read = f;
        this.RemoteActionCompatParcelizer = Collections.unmodifiableList(list);
        this.IconCompatParcelizer = i;
        this.write = i2;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.read;
    }

    public final List<RemoteActionCompatParcelizer> AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final RemoteActionCompatParcelizer read() {
        return this.RemoteActionCompatParcelizer.get(this.IconCompatParcelizer);
    }

    final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer.get(this.write);
    }

    final int AudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    public final List<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.subList(this.IconCompatParcelizer, this.write + 1);
    }

    public final RemoteActionCompatParcelizer write() {
        return this.RemoteActionCompatParcelizer.get(0);
    }

    public final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer.get(r1.size() - 1);
    }

    final RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.get(i);
            if (!remoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                return remoteActionCompatParcelizer;
            }
        }
        return null;
    }

    final RemoteActionCompatParcelizer MediaMetadataCompat() {
        for (int size = this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.get(size);
            if (!remoteActionCompatParcelizer.RemoteActionCompatParcelizer) {
                return remoteActionCompatParcelizer;
            }
        }
        return null;
    }

    static getLength AudioAttributesCompatParcelizer(getLength getlength, getLength getlength2, float f) {
        if (getlength.MediaBrowserCompatItemReceiver() != getlength2.MediaBrowserCompatItemReceiver()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<RemoteActionCompatParcelizer> listAudioAttributesImplApi21Parcelizer = getlength.AudioAttributesImplApi21Parcelizer();
        List<RemoteActionCompatParcelizer> listAudioAttributesImplApi21Parcelizer2 = getlength2.AudioAttributesImplApi21Parcelizer();
        if (listAudioAttributesImplApi21Parcelizer.size() != listAudioAttributesImplApi21Parcelizer2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getlength.AudioAttributesImplApi21Parcelizer().size(); i++) {
            arrayList.add(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(listAudioAttributesImplApi21Parcelizer.get(i), listAudioAttributesImplApi21Parcelizer2.get(i), f));
        }
        return new getLength(getlength.MediaBrowserCompatItemReceiver(), arrayList, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(getlength.IconCompatParcelizer(), getlength2.IconCompatParcelizer(), f), BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(getlength.AudioAttributesImplBaseParcelizer(), getlength2.AudioAttributesImplBaseParcelizer(), f));
    }

    public static getLength read(getLength getlength, float f) {
        write writeVar = new write(getlength.MediaBrowserCompatItemReceiver(), f);
        float f2 = (f - getlength.MediaBrowserCompatCustomActionResultReceiver().write) - (getlength.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer / 2.0f);
        int size = getlength.AudioAttributesImplApi21Parcelizer().size() - 1;
        while (size >= 0) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = getlength.AudioAttributesImplApi21Parcelizer().get(size);
            writeVar.write((remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer / 2.0f) + f2, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, size >= getlength.IconCompatParcelizer() && size <= getlength.AudioAttributesImplBaseParcelizer(), remoteActionCompatParcelizer.RemoteActionCompatParcelizer);
            f2 += remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            size--;
        }
        return writeVar.AudioAttributesCompatParcelizer();
    }

    static final class write {
        private RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
        private RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer;
        private final float IconCompatParcelizer;
        private final float read;
        private final List<RemoteActionCompatParcelizer> MediaBrowserCompatItemReceiver = new ArrayList();
        private int AudioAttributesCompatParcelizer = -1;
        private int RemoteActionCompatParcelizer = -1;
        private float write = BitmapDescriptorFactory.HUE_RED;
        private int MediaBrowserCompatCustomActionResultReceiver = -1;

        private static float write(float f, float f2, int i, int i2) {
            return (f - (i * f2)) + (i2 * f2);
        }

        write(float f, float f2) {
            this.read = f;
            this.IconCompatParcelizer = f2;
        }

        private write RemoteActionCompatParcelizer(float f, float f2, float f3, boolean z) {
            return write(f, f2, f3, z, false);
        }

        final write write(float f, float f2, float f3) {
            return RemoteActionCompatParcelizer(f, f2, f3, false);
        }

        final write IconCompatParcelizer(float f, float f2, float f3, boolean z, boolean z2, float f4) {
            if (f3 <= BitmapDescriptorFactory.HUE_RED) {
                return this;
            }
            if (z2) {
                if (z) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i = this.MediaBrowserCompatCustomActionResultReceiver;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.MediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver.size();
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(Float.MIN_VALUE, f, f2, f3, z2, f4);
            if (z) {
                if (this.AudioAttributesImplBaseParcelizer == null) {
                    this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer;
                    this.AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.size();
                }
                if (this.RemoteActionCompatParcelizer != -1 && this.MediaBrowserCompatItemReceiver.size() - this.RemoteActionCompatParcelizer > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f3 != this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.size();
            } else {
                if (this.AudioAttributesImplBaseParcelizer == null && remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer < this.write) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.AudioAttributesImplApi21Parcelizer != null && remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer > this.write) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.write = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            this.MediaBrowserCompatItemReceiver.add(remoteActionCompatParcelizer);
            return this;
        }

        final write write(float f, float f2, float f3, boolean z, boolean z2) {
            float fAbs;
            float f4 = f3 / 2.0f;
            float f5 = f - f4;
            float f6 = f4 + f;
            float f7 = this.IconCompatParcelizer;
            if (f6 > f7) {
                fAbs = Math.abs(f6 - Math.max(f6 - f3, f7));
            } else {
                fAbs = BitmapDescriptorFactory.HUE_RED;
                if (f5 < BitmapDescriptorFactory.HUE_RED) {
                    fAbs = Math.abs(f5 - Math.min(f5 + f3, BitmapDescriptorFactory.HUE_RED));
                }
            }
            return IconCompatParcelizer(f, f2, f3, z, z2, fAbs);
        }

        final write AudioAttributesCompatParcelizer(float f, float f2, float f3) {
            return write(f, f2, f3, false, true);
        }

        final write write(float f, float f2, float f3, int i) {
            return RemoteActionCompatParcelizer(f, f2, f3, i, false);
        }

        final write RemoteActionCompatParcelizer(float f, float f2, float f3, int i, boolean z) {
            if (i > 0 && f3 > BitmapDescriptorFactory.HUE_RED) {
                for (int i2 = 0; i2 < i; i2++) {
                    RemoteActionCompatParcelizer((i2 * f3) + f, f2, f3, z);
                }
            }
            return this;
        }

        final getLength AudioAttributesCompatParcelizer() {
            if (this.AudioAttributesImplBaseParcelizer == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.MediaBrowserCompatItemReceiver.size(); i++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.get(i);
                arrayList.add(new RemoteActionCompatParcelizer(write(this.AudioAttributesImplBaseParcelizer.write, this.read, this.AudioAttributesCompatParcelizer, i), remoteActionCompatParcelizer.write, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.IconCompatParcelizer));
            }
            return new getLength(this.read, arrayList, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, (byte) 0);
        }
    }

    public static final class RemoteActionCompatParcelizer {
        public final float AudioAttributesCompatParcelizer;
        public final float AudioAttributesImplApi26Parcelizer;
        final float IconCompatParcelizer;
        final boolean RemoteActionCompatParcelizer;
        public final float read;
        public final float write;

        private RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
            this(f, f2, f3, f4, false, BitmapDescriptorFactory.HUE_RED);
        }

        RemoteActionCompatParcelizer(float f, float f2, float f3, float f4, boolean z, float f5) {
            this.read = f;
            this.write = f2;
            this.AudioAttributesCompatParcelizer = f3;
            this.AudioAttributesImplApi26Parcelizer = f4;
            this.RemoteActionCompatParcelizer = z;
            this.IconCompatParcelizer = f5;
        }

        static RemoteActionCompatParcelizer RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2, float f) {
            return new RemoteActionCompatParcelizer(BinarySearchSeekerSeekOperationParams.read(remoteActionCompatParcelizer.read, remoteActionCompatParcelizer2.read, f), BinarySearchSeekerSeekOperationParams.read(remoteActionCompatParcelizer.write, remoteActionCompatParcelizer2.write, f), BinarySearchSeekerSeekOperationParams.read(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer2.AudioAttributesCompatParcelizer, f), BinarySearchSeekerSeekOperationParams.read(remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer, remoteActionCompatParcelizer2.AudioAttributesImplApi26Parcelizer, f));
        }
    }
}
