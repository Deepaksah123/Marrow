package kotlin;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setVideoAspectRatio implements Iterable<Byte> {
    public static final setVideoAspectRatio write = new MagicModuleTimeline(new byte[0]);

    public interface AudioAttributesCompatParcelizer extends Iterator<Byte> {
        byte AudioAttributesCompatParcelizer();
    }

    protected abstract int AudioAttributesCompatParcelizer(int i, int i2, int i3);

    abstract void AudioAttributesCompatParcelizer(OutputStream outputStream, int i, int i2) throws IOException;

    protected abstract int AudioAttributesImplBaseParcelizer();

    protected abstract int IconCompatParcelizer();

    public abstract int MediaBrowserCompatCustomActionResultReceiver();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: merged with bridge method [inline-methods] */
    public abstract AudioAttributesCompatParcelizer iterator();

    protected abstract int RemoteActionCompatParcelizer(int i, int i2, int i3);

    protected abstract boolean RemoteActionCompatParcelizer();

    public abstract String read(String str) throws UnsupportedEncodingException;

    public abstract boolean read();

    protected abstract void write(byte[] bArr, int i, int i2, int i3);

    setVideoAspectRatio() {
    }

    public final boolean write() {
        return MediaBrowserCompatCustomActionResultReceiver() == 0;
    }

    public static setVideoAspectRatio write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new MagicModuleTimeline(bArr2);
    }

    public static setVideoAspectRatio read(byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    public static setVideoAspectRatio write(String str) {
        try {
            return new MagicModuleTimeline(str.getBytes(CharsetNames.UTF_8));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public final setVideoAspectRatio RemoteActionCompatParcelizer(setVideoAspectRatio setvideoaspectratio) {
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        int iMediaBrowserCompatCustomActionResultReceiver2 = setvideoaspectratio.MediaBrowserCompatCustomActionResultReceiver();
        if (((long) iMediaBrowserCompatCustomActionResultReceiver) + ((long) iMediaBrowserCompatCustomActionResultReceiver2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(iMediaBrowserCompatCustomActionResultReceiver);
            sb.append("+");
            sb.append(iMediaBrowserCompatCustomActionResultReceiver2);
            throw new IllegalArgumentException(sb.toString());
        }
        return getFirstAnswer.AudioAttributesCompatParcelizer(this, setvideoaspectratio);
    }

    public static setVideoAspectRatio read(Iterable<setVideoAspectRatio> iterable) {
        Collection arrayList;
        if (!(iterable instanceof Collection)) {
            arrayList = new ArrayList();
            Iterator<setVideoAspectRatio> it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList = (Collection) iterable;
        }
        if (arrayList.isEmpty()) {
            return write;
        }
        return AudioAttributesCompatParcelizer(arrayList.iterator(), arrayList.size());
    }

    private static setVideoAspectRatio AudioAttributesCompatParcelizer(Iterator<setVideoAspectRatio> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return AudioAttributesCompatParcelizer(it, i2).RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(it, i - i2));
    }

    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i3 < 0) {
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        int i4 = i + i3;
        if (i4 > MediaBrowserCompatCustomActionResultReceiver()) {
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i4);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        int i5 = i2 + i3;
        if (i5 <= bArr.length) {
            if (i3 > 0) {
                write(bArr, i, i2, i3);
            }
        } else {
            StringBuilder sb5 = new StringBuilder(34);
            sb5.append("Target end offset < 0: ");
            sb5.append(i5);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public final byte[] AudioAttributesImplApi26Parcelizer() {
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (iMediaBrowserCompatCustomActionResultReceiver == 0) {
            return LessonSpinnerItem.RemoteActionCompatParcelizer;
        }
        byte[] bArr = new byte[iMediaBrowserCompatCustomActionResultReceiver];
        write(bArr, 0, 0, iMediaBrowserCompatCustomActionResultReceiver);
        return bArr;
    }

    final void RemoteActionCompatParcelizer(OutputStream outputStream, int i, int i2) throws IOException {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(23);
            sb2.append("Length < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i3 = i + i2;
        if (i3 <= MediaBrowserCompatCustomActionResultReceiver()) {
            if (i2 > 0) {
                AudioAttributesCompatParcelizer(outputStream, i, i2);
            }
        } else {
            StringBuilder sb3 = new StringBuilder(39);
            sb3.append("Source end offset exceeded: ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        try {
            return read(CharsetNames.UTF_8);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    public static IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return new IconCompatParcelizer();
    }

    public static final class IconCompatParcelizer extends OutputStream {
        private static final byte[] write = new byte[0];
        private int IconCompatParcelizer;
        private int read;
        private final int AudioAttributesImplApi26Parcelizer = 128;
        private final ArrayList<setVideoAspectRatio> RemoteActionCompatParcelizer = new ArrayList<>();
        private byte[] AudioAttributesCompatParcelizer = new byte[128];

        IconCompatParcelizer() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            synchronized (this) {
                if (this.IconCompatParcelizer == this.AudioAttributesCompatParcelizer.length) {
                    AudioAttributesCompatParcelizer(1);
                }
                byte[] bArr = this.AudioAttributesCompatParcelizer;
                int i2 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = i2 + 1;
                bArr[i2] = (byte) i;
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            synchronized (this) {
                byte[] bArr2 = this.AudioAttributesCompatParcelizer;
                int length = bArr2.length;
                int i3 = this.IconCompatParcelizer;
                if (i2 <= length - i3) {
                    System.arraycopy(bArr, i, bArr2, i3, i2);
                    this.IconCompatParcelizer += i2;
                } else {
                    int length2 = bArr2.length - i3;
                    System.arraycopy(bArr, i, bArr2, i3, length2);
                    int i4 = i2 - length2;
                    AudioAttributesCompatParcelizer(i4);
                    System.arraycopy(bArr, i + length2, this.AudioAttributesCompatParcelizer, 0, i4);
                    this.IconCompatParcelizer = i4;
                }
            }
        }

        public final setVideoAspectRatio IconCompatParcelizer() {
            setVideoAspectRatio setvideoaspectratio;
            synchronized (this) {
                read();
                setvideoaspectratio = setVideoAspectRatio.read(this.RemoteActionCompatParcelizer);
            }
            return setvideoaspectratio;
        }

        private static byte[] read(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        private int RemoteActionCompatParcelizer() {
            int i;
            int i2;
            synchronized (this) {
                i = this.read;
                i2 = this.IconCompatParcelizer;
            }
            return i + i2;
        }

        public final String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(RemoteActionCompatParcelizer()));
        }

        private void AudioAttributesCompatParcelizer(int i) {
            this.RemoteActionCompatParcelizer.add(new MagicModuleTimeline(this.AudioAttributesCompatParcelizer));
            int length = this.read + this.AudioAttributesCompatParcelizer.length;
            this.read = length;
            this.AudioAttributesCompatParcelizer = new byte[Math.max(this.AudioAttributesImplApi26Parcelizer, Math.max(i, length >>> 1))];
            this.IconCompatParcelizer = 0;
        }

        private void read() {
            int i = this.IconCompatParcelizer;
            byte[] bArr = this.AudioAttributesCompatParcelizer;
            if (i >= bArr.length) {
                this.RemoteActionCompatParcelizer.add(new MagicModuleTimeline(this.AudioAttributesCompatParcelizer));
                this.AudioAttributesCompatParcelizer = write;
            } else if (i > 0) {
                this.RemoteActionCompatParcelizer.add(new MagicModuleTimeline(read(bArr, i)));
            }
            this.read += this.IconCompatParcelizer;
            this.IconCompatParcelizer = 0;
        }
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver()));
    }
}
