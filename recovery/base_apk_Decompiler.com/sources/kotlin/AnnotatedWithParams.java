package kotlin;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AnnotatedWithParams implements Iterable<Byte>, Serializable {
    public static final AnnotatedWithParams AudioAttributesCompatParcelizer = new AudioAttributesImplBaseParcelizer(forDeserialization.AudioAttributesCompatParcelizer);
    private static final IconCompatParcelizer IconCompatParcelizer;
    private int read = 0;

    interface IconCompatParcelizer {
        byte[] read(byte[] bArr, int i, int i2);
    }

    public interface read extends Iterator<Byte> {
        byte IconCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int IconCompatParcelizer(byte b) {
        return b & 255;
    }

    public abstract AnnotatedWithParams AudioAttributesCompatParcelizer(int i, int i2);

    abstract void AudioAttributesCompatParcelizer(_addMethodMixIns _addmethodmixins) throws IOException;

    public abstract boolean AudioAttributesCompatParcelizer();

    public abstract byte IconCompatParcelizer(int i);

    protected abstract int IconCompatParcelizer(int i, int i2);

    abstract byte RemoteActionCompatParcelizer(int i);

    protected abstract String RemoteActionCompatParcelizer(Charset charset);

    protected abstract void RemoteActionCompatParcelizer(byte[] bArr, int i);

    public abstract int read();

    static {
        byte b = 0;
        IconCompatParcelizer = AnnotatedMethodCollectorMethodBuilder.RemoteActionCompatParcelizer() ? new MediaBrowserCompatCustomActionResultReceiver(b) : new AudioAttributesCompatParcelizer(b);
        new Comparator<AnnotatedWithParams>() { // from class: o.AnnotatedWithParams.3
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
                return AudioAttributesCompatParcelizer(annotatedWithParams, annotatedWithParams2);
            }

            private static int AudioAttributesCompatParcelizer(AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
                read it = annotatedWithParams.iterator();
                read it2 = annotatedWithParams2.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    int iCompare = Integer.compare(AnnotatedWithParams.IconCompatParcelizer(it.IconCompatParcelizer()), AnnotatedWithParams.IconCompatParcelizer(it2.IconCompatParcelizer()));
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return Integer.compare(annotatedWithParams.read(), annotatedWithParams2.read());
            }
        };
    }

    static final class MediaBrowserCompatCustomActionResultReceiver implements IconCompatParcelizer {
        private MediaBrowserCompatCustomActionResultReceiver() {
        }

        /* synthetic */ MediaBrowserCompatCustomActionResultReceiver(byte b) {
            this();
        }

        @Override // o.AnnotatedWithParams.IconCompatParcelizer
        public final byte[] read(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static final class AudioAttributesCompatParcelizer implements IconCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        @Override // o.AnnotatedWithParams.IconCompatParcelizer
        public final byte[] read(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    AnnotatedWithParams() {
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final read iterator() {
        return new RemoteActionCompatParcelizer() { // from class: o.AnnotatedWithParams.4
            private final int AudioAttributesCompatParcelizer;
            private int write = 0;

            {
                this.AudioAttributesCompatParcelizer = AnnotatedWithParams.this.read();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.write < this.AudioAttributesCompatParcelizer;
            }

            @Override // o.AnnotatedWithParams.read
            public final byte IconCompatParcelizer() {
                int i = this.write;
                if (i >= this.AudioAttributesCompatParcelizer) {
                    throw new NoSuchElementException();
                }
                this.write = i + 1;
                return AnnotatedWithParams.this.RemoteActionCompatParcelizer(i);
            }
        };
    }

    static abstract class RemoteActionCompatParcelizer implements read {
        RemoteActionCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(IconCompatParcelizer());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static AnnotatedWithParams write(byte[] bArr, int i, int i2) {
        write(i, i + i2, bArr.length);
        return new AudioAttributesImplBaseParcelizer(IconCompatParcelizer.read(bArr, i, i2));
    }

    public static AnnotatedWithParams read(byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    static AnnotatedWithParams IconCompatParcelizer(byte[] bArr) {
        return new AudioAttributesImplBaseParcelizer(bArr);
    }

    static AnnotatedWithParams RemoteActionCompatParcelizer(byte[] bArr, int i, int i2) {
        return new write(bArr, i, i2);
    }

    public static AnnotatedWithParams AudioAttributesCompatParcelizer(String str) {
        return new AudioAttributesImplBaseParcelizer(str.getBytes(forDeserialization.write));
    }

    public final byte[] IconCompatParcelizer() {
        int i = read();
        if (i == 0) {
            return forDeserialization.AudioAttributesCompatParcelizer;
        }
        byte[] bArr = new byte[i];
        RemoteActionCompatParcelizer(bArr, i);
        return bArr;
    }

    private String IconCompatParcelizer(Charset charset) {
        return read() == 0 ? "" : RemoteActionCompatParcelizer(charset);
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return IconCompatParcelizer(forDeserialization.write);
    }

    static abstract class AudioAttributesImplApi26Parcelizer extends AnnotatedWithParams {
        abstract boolean IconCompatParcelizer(AnnotatedWithParams annotatedWithParams, int i);

        AudioAttributesImplApi26Parcelizer() {
        }

        @Override // kotlin.AnnotatedWithParams, java.lang.Iterable
        public /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    public final int hashCode() {
        int iIconCompatParcelizer = this.read;
        if (iIconCompatParcelizer == 0) {
            int i = read();
            iIconCompatParcelizer = IconCompatParcelizer(i, i);
            if (iIconCompatParcelizer == 0) {
                iIconCompatParcelizer = 1;
            }
            this.read = iIconCompatParcelizer;
        }
        return iIconCompatParcelizer;
    }

    static AudioAttributesImplApi21Parcelizer read(int i) {
        return new AudioAttributesImplApi21Parcelizer(i, (byte) 0);
    }

    static final class AudioAttributesImplApi21Parcelizer {
        private final getParameterAnnotations AudioAttributesCompatParcelizer;
        private final byte[] RemoteActionCompatParcelizer;

        /* synthetic */ AudioAttributesImplApi21Parcelizer(int i, byte b) {
            this(i);
        }

        private AudioAttributesImplApi21Parcelizer(int i) {
            byte[] bArr = new byte[i];
            this.RemoteActionCompatParcelizer = bArr;
            this.AudioAttributesCompatParcelizer = getParameterAnnotations.AudioAttributesCompatParcelizer(bArr);
        }

        public final AnnotatedWithParams RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            return new AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer);
        }

        public final getParameterAnnotations read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    protected final int write() {
        return this.read;
    }

    static void read(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: ".concat(String.valueOf(i)));
            }
            StringBuilder sb = new StringBuilder("Index > length: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    static int write(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(read()));
    }

    static class AudioAttributesImplBaseParcelizer extends AudioAttributesImplApi26Parcelizer {
        protected final byte[] IconCompatParcelizer;

        protected int MediaBrowserCompatItemReceiver() {
            return 0;
        }

        AudioAttributesImplBaseParcelizer(byte[] bArr) {
            this.IconCompatParcelizer = bArr;
        }

        @Override // kotlin.AnnotatedWithParams
        public byte IconCompatParcelizer(int i) {
            return this.IconCompatParcelizer[i];
        }

        @Override // kotlin.AnnotatedWithParams
        byte RemoteActionCompatParcelizer(int i) {
            return this.IconCompatParcelizer[i];
        }

        @Override // kotlin.AnnotatedWithParams
        public int read() {
            return this.IconCompatParcelizer.length;
        }

        @Override // kotlin.AnnotatedWithParams
        public final AnnotatedWithParams AudioAttributesCompatParcelizer(int i, int i2) {
            int iWrite = write(0, i2, read());
            if (iWrite == 0) {
                return AnnotatedWithParams.AudioAttributesCompatParcelizer;
            }
            return new write(this.IconCompatParcelizer, MediaBrowserCompatItemReceiver(), iWrite);
        }

        @Override // kotlin.AnnotatedWithParams
        protected void RemoteActionCompatParcelizer(byte[] bArr, int i) {
            System.arraycopy(this.IconCompatParcelizer, 0, bArr, 0, i);
        }

        @Override // kotlin.AnnotatedWithParams
        final void AudioAttributesCompatParcelizer(_addMethodMixIns _addmethodmixins) throws IOException {
            _addmethodmixins.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, MediaBrowserCompatItemReceiver(), read());
        }

        @Override // kotlin.AnnotatedWithParams
        protected final String RemoteActionCompatParcelizer(Charset charset) {
            return new String(this.IconCompatParcelizer, MediaBrowserCompatItemReceiver(), read(), charset);
        }

        @Override // kotlin.AnnotatedWithParams
        public final boolean AudioAttributesCompatParcelizer() {
            int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
            return _emptyAnnotationMaps.write(this.IconCompatParcelizer, iMediaBrowserCompatItemReceiver, read() + iMediaBrowserCompatItemReceiver);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnnotatedWithParams) || read() != ((AnnotatedWithParams) obj).read()) {
                return false;
            }
            if (read() == 0) {
                return true;
            }
            if (obj instanceof AudioAttributesImplBaseParcelizer) {
                AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (AudioAttributesImplBaseParcelizer) obj;
                int iWrite = write();
                int iWrite2 = audioAttributesImplBaseParcelizer.write();
                if (iWrite == 0 || iWrite2 == 0 || iWrite == iWrite2) {
                    return IconCompatParcelizer(audioAttributesImplBaseParcelizer, read());
                }
                return false;
            }
            return obj.equals(this);
        }

        @Override // o.AnnotatedWithParams.AudioAttributesImplApi26Parcelizer
        final boolean IconCompatParcelizer(AnnotatedWithParams annotatedWithParams, int i) {
            if (i > annotatedWithParams.read()) {
                StringBuilder sb = new StringBuilder("Length too large: ");
                sb.append(i);
                sb.append(read());
                throw new IllegalArgumentException(sb.toString());
            }
            if (i > annotatedWithParams.read()) {
                StringBuilder sb2 = new StringBuilder("Ran off end of other: 0, ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(annotatedWithParams.read());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (annotatedWithParams instanceof AudioAttributesImplBaseParcelizer) {
                AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (AudioAttributesImplBaseParcelizer) annotatedWithParams;
                byte[] bArr = this.IconCompatParcelizer;
                byte[] bArr2 = audioAttributesImplBaseParcelizer.IconCompatParcelizer;
                int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
                int iMediaBrowserCompatItemReceiver2 = MediaBrowserCompatItemReceiver();
                int iMediaBrowserCompatItemReceiver3 = audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver();
                while (iMediaBrowserCompatItemReceiver2 < iMediaBrowserCompatItemReceiver + i) {
                    if (bArr[iMediaBrowserCompatItemReceiver2] != bArr2[iMediaBrowserCompatItemReceiver3]) {
                        return false;
                    }
                    iMediaBrowserCompatItemReceiver2++;
                    iMediaBrowserCompatItemReceiver3++;
                }
                return true;
            }
            return annotatedWithParams.AudioAttributesCompatParcelizer(0, i).equals(AudioAttributesCompatParcelizer(0, i));
        }

        @Override // kotlin.AnnotatedWithParams
        protected final int IconCompatParcelizer(int i, int i2) {
            return forDeserialization.write(i, this.IconCompatParcelizer, MediaBrowserCompatItemReceiver(), i2);
        }
    }

    static final class write extends AudioAttributesImplBaseParcelizer {
        private final int read;
        private final int write;

        write(byte[] bArr, int i, int i2) {
            super(bArr);
            write(i, i + i2, bArr.length);
            this.write = i;
            this.read = i2;
        }

        @Override // o.AnnotatedWithParams.AudioAttributesImplBaseParcelizer, kotlin.AnnotatedWithParams
        public final byte IconCompatParcelizer(int i) {
            read(i, read());
            return this.IconCompatParcelizer[this.write + i];
        }

        @Override // o.AnnotatedWithParams.AudioAttributesImplBaseParcelizer, kotlin.AnnotatedWithParams
        final byte RemoteActionCompatParcelizer(int i) {
            return this.IconCompatParcelizer[this.write + i];
        }

        @Override // o.AnnotatedWithParams.AudioAttributesImplBaseParcelizer, kotlin.AnnotatedWithParams
        public final int read() {
            return this.read;
        }

        @Override // o.AnnotatedWithParams.AudioAttributesImplBaseParcelizer
        protected final int MediaBrowserCompatItemReceiver() {
            return this.write;
        }

        @Override // o.AnnotatedWithParams.AudioAttributesImplBaseParcelizer, kotlin.AnnotatedWithParams
        protected final void RemoteActionCompatParcelizer(byte[] bArr, int i) {
            System.arraycopy(this.IconCompatParcelizer, MediaBrowserCompatItemReceiver(), bArr, 0, i);
        }

        final Object writeReplace() {
            return AnnotatedWithParams.IconCompatParcelizer(IconCompatParcelizer());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }
    }
}
