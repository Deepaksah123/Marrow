package kotlin;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin._emptyAnnotationMaps;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getParameterAnnotations extends _addMethodMixIns {
    replaceParameterAnnotations AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private static final Logger read = Logger.getLogger(getParameterAnnotations.class.getName());
    private static final boolean RemoteActionCompatParcelizer = ClassIntrospectorMixInResolver.AudioAttributesCompatParcelizer();

    public static int AudioAttributesCompatParcelizer() {
        return 1;
    }

    public static int AudioAttributesImplApi21Parcelizer() {
        return 4;
    }

    private static long AudioAttributesImplApi21Parcelizer(long j) {
        return (j << 1) ^ (j >> 63);
    }

    public static int AudioAttributesImplApi26Parcelizer() {
        return 8;
    }

    public static int AudioAttributesImplBaseParcelizer() {
        return 4;
    }

    public static int IconCompatParcelizer() {
        return 8;
    }

    public static int IconCompatParcelizer(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    static int MediaBrowserCompatItemReceiver(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int MediaDescriptionCompat(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int RemoteActionCompatParcelizer() {
        return 8;
    }

    private static int onMediaButtonEvent(int i) {
        return (i << 1) ^ (i >> 31);
    }

    public static int write() {
        return 4;
    }

    public abstract void AudioAttributesCompatParcelizer(byte b) throws IOException;

    public abstract void AudioAttributesCompatParcelizer(int i, long j) throws IOException;

    public abstract void AudioAttributesCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) throws IOException;

    public abstract void AudioAttributesCompatParcelizer(int i, constructPropertyCollector constructpropertycollector) throws IOException;

    public abstract void AudioAttributesCompatParcelizer(long j) throws IOException;

    public abstract void AudioAttributesImplApi21Parcelizer(int i, int i2) throws IOException;

    public abstract void AudioAttributesImplApi26Parcelizer(long j) throws IOException;

    public abstract void AudioAttributesImplBaseParcelizer(int i, int i2) throws IOException;

    abstract void IconCompatParcelizer(int i, constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) throws IOException;

    public abstract void IconCompatParcelizer(int i, boolean z) throws IOException;

    public abstract void IconCompatParcelizer(constructPropertyCollector constructpropertycollector) throws IOException;

    public abstract void MediaBrowserCompatCustomActionResultReceiver() throws IOException;

    public abstract void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) throws IOException;

    public abstract void MediaBrowserCompatItemReceiver(int i, long j) throws IOException;

    public abstract void MediaBrowserCompatMediaItem(int i, int i2) throws IOException;

    public abstract int RatingCompat();

    public abstract void RemoteActionCompatParcelizer(int i, String str) throws IOException;

    public abstract void RemoteActionCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) throws IOException;

    public abstract void onCommand(int i) throws IOException;

    public abstract void onCustomAction(int i) throws IOException;

    public abstract void onFastForward(int i) throws IOException;

    public abstract void read(AnnotatedWithParams annotatedWithParams) throws IOException;

    public abstract void write(String str) throws IOException;

    abstract void write(constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) throws IOException;

    abstract void write(byte[] bArr, int i) throws IOException;

    /* synthetic */ getParameterAnnotations(byte b) {
        this();
    }

    public static getParameterAnnotations IconCompatParcelizer(OutputStream outputStream, int i) {
        return new IconCompatParcelizer(outputStream, i);
    }

    public static getParameterAnnotations AudioAttributesCompatParcelizer(byte[] bArr) {
        return read(bArr, bArr.length);
    }

    private static getParameterAnnotations read(byte[] bArr, int i) {
        return new write(bArr, 0, i);
    }

    final boolean MediaBrowserCompatMediaItem() {
        return this.IconCompatParcelizer;
    }

    private getParameterAnnotations() {
    }

    public final void MediaBrowserCompatItemReceiver(int i, int i2) throws IOException {
        MediaBrowserCompatMediaItem(i, onMediaButtonEvent(i2));
    }

    public final void AudioAttributesImplApi26Parcelizer(int i, int i2) throws IOException {
        MediaBrowserCompatCustomActionResultReceiver(i, i2);
    }

    public final void write(int i, long j) throws IOException {
        MediaBrowserCompatItemReceiver(i, j);
    }

    public final void AudioAttributesImplBaseParcelizer(int i, long j) throws IOException {
        MediaBrowserCompatItemReceiver(i, AudioAttributesImplApi21Parcelizer(j));
    }

    public final void AudioAttributesImplApi26Parcelizer(int i, long j) throws IOException {
        AudioAttributesCompatParcelizer(i, j);
    }

    public final void AudioAttributesCompatParcelizer(int i, float f) throws IOException {
        MediaBrowserCompatCustomActionResultReceiver(i, Float.floatToRawIntBits(f));
    }

    public final void read(int i, double d) throws IOException {
        AudioAttributesCompatParcelizer(i, Double.doubleToRawLongBits(d));
    }

    public final void AudioAttributesCompatParcelizer(int i, int i2) throws IOException {
        AudioAttributesImplApi21Parcelizer(i, i2);
    }

    public final void handleMediaPlayPauseIfPendingOnHandler(int i) throws IOException {
        onFastForward(onMediaButtonEvent(i));
    }

    public final void onAddQueueItem(int i) throws IOException {
        onCustomAction(i);
    }

    public final void read(long j) throws IOException {
        AudioAttributesImplApi26Parcelizer(j);
    }

    public final void AudioAttributesImplBaseParcelizer(long j) throws IOException {
        AudioAttributesImplApi26Parcelizer(AudioAttributesImplApi21Parcelizer(j));
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(long j) throws IOException {
        AudioAttributesCompatParcelizer(j);
    }

    public final void write(float f) throws IOException {
        onCustomAction(Float.floatToRawIntBits(f));
    }

    public final void write(double d) throws IOException {
        AudioAttributesCompatParcelizer(Double.doubleToRawLongBits(d));
    }

    public final void RemoteActionCompatParcelizer(boolean z) throws IOException {
        AudioAttributesCompatParcelizer(z ? (byte) 1 : (byte) 0);
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i) throws IOException {
        onCommand(i);
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, bArr.length);
    }

    public static int write(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i) + MediaBrowserCompatCustomActionResultReceiver(i2);
    }

    public static int RemoteActionCompatParcelizer(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i) + MediaDescriptionCompat(i2);
    }

    public static int read(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i) + MediaBrowserCompatMediaItem(i2);
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 4;
    }

    public static int RatingCompat(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 4;
    }

    public static int IconCompatParcelizer(int i, long j) {
        return MediaBrowserCompatSearchResultReceiver(i) + write(j);
    }

    public static int read(int i, long j) {
        return MediaBrowserCompatSearchResultReceiver(i) + IconCompatParcelizer(j);
    }

    public static int RemoteActionCompatParcelizer(int i, long j) {
        return MediaBrowserCompatSearchResultReceiver(i) + RemoteActionCompatParcelizer(j);
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 8;
    }

    public static int MediaMetadataCompat(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 8;
    }

    public static int AudioAttributesImplBaseParcelizer(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 4;
    }

    public static int IconCompatParcelizer(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 8;
    }

    public static int read(int i) {
        return MediaBrowserCompatSearchResultReceiver(i) + 1;
    }

    public static int IconCompatParcelizer(int i, int i2) {
        return MediaBrowserCompatSearchResultReceiver(i) + write(i2);
    }

    public static int AudioAttributesCompatParcelizer(int i, String str) {
        return MediaBrowserCompatSearchResultReceiver(i) + RemoteActionCompatParcelizer(str);
    }

    public static int IconCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) {
        return MediaBrowserCompatSearchResultReceiver(i) + RemoteActionCompatParcelizer(annotatedWithParams);
    }

    public static int IconCompatParcelizer(int i, BasicBeanDescription basicBeanDescription) {
        return MediaBrowserCompatSearchResultReceiver(i) + AudioAttributesCompatParcelizer(basicBeanDescription);
    }

    private static int read(constructPropertyCollector constructpropertycollector) {
        return MediaBrowserCompatSearchResultReceiver(3) + AudioAttributesCompatParcelizer(constructpropertycollector);
    }

    static int RemoteActionCompatParcelizer(int i, constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) {
        return MediaBrowserCompatSearchResultReceiver(i) + read(constructpropertycollector, getprimarymember);
    }

    public static int write(int i, constructPropertyCollector constructpropertycollector) {
        return (MediaBrowserCompatSearchResultReceiver(1) << 1) + RemoteActionCompatParcelizer(2, i) + read(constructpropertycollector);
    }

    public static int read(int i, AnnotatedWithParams annotatedWithParams) {
        return (MediaBrowserCompatSearchResultReceiver(1) << 1) + RemoteActionCompatParcelizer(2, i) + IconCompatParcelizer(3, annotatedWithParams);
    }

    public static int RemoteActionCompatParcelizer(int i, BasicBeanDescription basicBeanDescription) {
        return (MediaBrowserCompatSearchResultReceiver(1) << 1) + RemoteActionCompatParcelizer(2, i) + IconCompatParcelizer(3, basicBeanDescription);
    }

    public static int MediaBrowserCompatSearchResultReceiver(int i) {
        return MediaDescriptionCompat(_ignorableAnnotation.RemoteActionCompatParcelizer(i, 0));
    }

    public static int MediaBrowserCompatCustomActionResultReceiver(int i) {
        if (i >= 0) {
            return MediaDescriptionCompat(i);
        }
        return 10;
    }

    public static int MediaBrowserCompatMediaItem(int i) {
        return MediaDescriptionCompat(onMediaButtonEvent(i));
    }

    public static int write(long j) {
        return IconCompatParcelizer(j);
    }

    public static int RemoteActionCompatParcelizer(long j) {
        return IconCompatParcelizer(AudioAttributesImplApi21Parcelizer(j));
    }

    public static int write(int i) {
        return MediaBrowserCompatCustomActionResultReceiver(i);
    }

    public static int RemoteActionCompatParcelizer(String str) {
        int length;
        try {
            length = _emptyAnnotationMaps.write(str);
        } catch (_emptyAnnotationMaps.write unused) {
            length = str.getBytes(forDeserialization.write).length;
        }
        return AudioAttributesImplApi21Parcelizer(length);
    }

    public static int AudioAttributesCompatParcelizer(BasicBeanDescription basicBeanDescription) {
        return AudioAttributesImplApi21Parcelizer(basicBeanDescription.IconCompatParcelizer());
    }

    public static int RemoteActionCompatParcelizer(AnnotatedWithParams annotatedWithParams) {
        return AudioAttributesImplApi21Parcelizer(annotatedWithParams.read());
    }

    public static int IconCompatParcelizer(byte[] bArr) {
        return AudioAttributesImplApi21Parcelizer(bArr.length);
    }

    public static int AudioAttributesCompatParcelizer(constructPropertyCollector constructpropertycollector) {
        return AudioAttributesImplApi21Parcelizer(constructpropertycollector.onCustomAction());
    }

    static int read(constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) {
        return AudioAttributesImplApi21Parcelizer(((_isIncludableMemberMethod) constructpropertycollector).read(getprimarymember));
    }

    static int AudioAttributesImplApi21Parcelizer(int i) {
        return MediaDescriptionCompat(i) + i;
    }

    public final void MediaBrowserCompatItemReceiver() {
        if (RatingCompat() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static class RemoteActionCompatParcelizer extends IOException {
        public RemoteActionCompatParcelizer() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        RemoteActionCompatParcelizer(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public RemoteActionCompatParcelizer(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
        }
    }

    final void write(String str, _emptyAnnotationMaps.write writeVar) throws IOException {
        read.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) writeVar);
        byte[] bytes = str.getBytes(forDeserialization.write);
        try {
            onFastForward(bytes.length);
            AudioAttributesCompatParcelizer(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new RemoteActionCompatParcelizer(e);
        } catch (RemoteActionCompatParcelizer e2) {
            throw e2;
        }
    }

    @Deprecated
    public final void RemoteActionCompatParcelizer(int i, constructPropertyCollector constructpropertycollector) throws IOException {
        AudioAttributesImplBaseParcelizer(i, 3);
        RemoteActionCompatParcelizer(constructpropertycollector);
        AudioAttributesImplBaseParcelizer(i, 4);
    }

    @Deprecated
    final void read(int i, constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) throws IOException {
        AudioAttributesImplBaseParcelizer(i, 3);
        AudioAttributesCompatParcelizer(constructpropertycollector, getprimarymember);
        AudioAttributesImplBaseParcelizer(i, 4);
    }

    @Deprecated
    public final void RemoteActionCompatParcelizer(constructPropertyCollector constructpropertycollector) throws IOException {
        constructpropertycollector.AudioAttributesCompatParcelizer(this);
    }

    @Deprecated
    private void AudioAttributesCompatParcelizer(constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) throws IOException {
        getprimarymember.AudioAttributesCompatParcelizer(constructpropertycollector, this.AudioAttributesCompatParcelizer);
    }

    @Deprecated
    static int AudioAttributesCompatParcelizer(int i, constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) {
        return (MediaBrowserCompatSearchResultReceiver(i) << 1) + RemoteActionCompatParcelizer(constructpropertycollector, getprimarymember);
    }

    @Deprecated
    public static int write(constructPropertyCollector constructpropertycollector) {
        return constructpropertycollector.onCustomAction();
    }

    @Deprecated
    private static int RemoteActionCompatParcelizer(constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) {
        return ((_isIncludableMemberMethod) constructpropertycollector).read(getprimarymember);
    }

    @Deprecated
    public static int AudioAttributesImplApi26Parcelizer(int i) {
        return MediaDescriptionCompat(i);
    }

    static class write extends getParameterAnnotations {
        private final byte[] IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private final int read;
        private final int write;

        @Override // kotlin.getParameterAnnotations
        public final void MediaBrowserCompatCustomActionResultReceiver() {
        }

        write(byte[] bArr, int i, int i2) {
            super((byte) 0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i2) | i2) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.IconCompatParcelizer = bArr;
            this.write = 0;
            this.RemoteActionCompatParcelizer = 0;
            this.read = i2;
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesImplBaseParcelizer(int i, int i2) throws IOException {
            onFastForward(_ignorableAnnotation.RemoteActionCompatParcelizer(i, i2));
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesImplApi21Parcelizer(int i, int i2) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 0);
            onCommand(i2);
        }

        @Override // kotlin.getParameterAnnotations
        public final void MediaBrowserCompatMediaItem(int i, int i2) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 0);
            onFastForward(i2);
        }

        @Override // kotlin.getParameterAnnotations
        public final void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 5);
            onCustomAction(i2);
        }

        @Override // kotlin.getParameterAnnotations
        public final void MediaBrowserCompatItemReceiver(int i, long j) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 0);
            AudioAttributesImplApi26Parcelizer(j);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(int i, long j) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 1);
            AudioAttributesCompatParcelizer(j);
        }

        @Override // kotlin.getParameterAnnotations
        public final void IconCompatParcelizer(int i, boolean z) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 0);
            AudioAttributesCompatParcelizer(z ? (byte) 1 : (byte) 0);
        }

        @Override // kotlin.getParameterAnnotations
        public final void RemoteActionCompatParcelizer(int i, String str) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 2);
            write(str);
        }

        @Override // kotlin.getParameterAnnotations
        public final void RemoteActionCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 2);
            read(annotatedWithParams);
        }

        @Override // kotlin.getParameterAnnotations
        public final void read(AnnotatedWithParams annotatedWithParams) throws IOException {
            onFastForward(annotatedWithParams.read());
            annotatedWithParams.AudioAttributesCompatParcelizer(this);
        }

        @Override // kotlin.getParameterAnnotations
        public final void write(byte[] bArr, int i) throws IOException {
            onFastForward(i);
            IconCompatParcelizer(bArr, 0, i);
        }

        private void read(constructPropertyCollector constructpropertycollector) throws IOException {
            AudioAttributesImplBaseParcelizer(3, 2);
            IconCompatParcelizer(constructpropertycollector);
        }

        @Override // kotlin.getParameterAnnotations
        final void IconCompatParcelizer(int i, constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 2);
            onFastForward(((_isIncludableMemberMethod) constructpropertycollector).read(getprimarymember));
            getprimarymember.AudioAttributesCompatParcelizer(constructpropertycollector, this.AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(int i, constructPropertyCollector constructpropertycollector) throws IOException {
            AudioAttributesImplBaseParcelizer(1, 3);
            MediaBrowserCompatMediaItem(2, i);
            read(constructpropertycollector);
            AudioAttributesImplBaseParcelizer(1, 4);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) throws IOException {
            AudioAttributesImplBaseParcelizer(1, 3);
            MediaBrowserCompatMediaItem(2, i);
            RemoteActionCompatParcelizer(3, annotatedWithParams);
            AudioAttributesImplBaseParcelizer(1, 4);
        }

        @Override // kotlin.getParameterAnnotations
        public final void IconCompatParcelizer(constructPropertyCollector constructpropertycollector) throws IOException {
            onFastForward(constructpropertycollector.onCustomAction());
            constructpropertycollector.AudioAttributesCompatParcelizer(this);
        }

        @Override // kotlin.getParameterAnnotations
        final void write(constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) throws IOException {
            onFastForward(((_isIncludableMemberMethod) constructpropertycollector).read(getprimarymember));
            getprimarymember.AudioAttributesCompatParcelizer(constructpropertycollector, this.AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(byte b) throws IOException {
            try {
                byte[] bArr = this.IconCompatParcelizer;
                int i = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new RemoteActionCompatParcelizer(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read), 1), e);
            }
        }

        @Override // kotlin.getParameterAnnotations
        public final void onCommand(int i) throws IOException {
            if (i >= 0) {
                onFastForward(i);
            } else {
                AudioAttributesImplApi26Parcelizer(i);
            }
        }

        @Override // kotlin.getParameterAnnotations
        public final void onFastForward(int i) throws IOException {
            if (!getParameterAnnotations.RemoteActionCompatParcelizer || AnnotatedMethodCollectorMethodBuilder.RemoteActionCompatParcelizer() || RatingCompat() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.IconCompatParcelizer;
                        int i2 = this.RemoteActionCompatParcelizer;
                        this.RemoteActionCompatParcelizer = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new RemoteActionCompatParcelizer(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read), 1), e);
                    }
                }
                byte[] bArr2 = this.IconCompatParcelizer;
                int i3 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.IconCompatParcelizer;
                int i4 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i4 + 1;
                ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.IconCompatParcelizer;
            int i5 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i5 + 1;
            ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.IconCompatParcelizer;
                int i7 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i7 + 1;
                ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.IconCompatParcelizer;
            int i8 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i8 + 1;
            ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr6, i8, (byte) (i6 | 128));
            int i9 = i >>> 14;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.IconCompatParcelizer;
                int i10 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i10 + 1;
                ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.IconCompatParcelizer;
            int i11 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i11 + 1;
            ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr8, i11, (byte) (i9 | 128));
            int i12 = i >>> 21;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.IconCompatParcelizer;
                int i13 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i13 + 1;
                ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.IconCompatParcelizer;
            int i14 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i14 + 1;
            ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.IconCompatParcelizer;
            int i15 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i15 + 1;
            ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr11, i15, (byte) (i >>> 28));
        }

        @Override // kotlin.getParameterAnnotations
        public final void onCustomAction(int i) throws IOException {
            try {
                byte[] bArr = this.IconCompatParcelizer;
                int i2 = this.RemoteActionCompatParcelizer;
                bArr[i2] = (byte) i;
                bArr[i2 + 1] = (byte) (i >> 8);
                bArr[i2 + 2] = (byte) (i >> 16);
                this.RemoteActionCompatParcelizer = i2 + 4;
                bArr[i2 + 3] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new RemoteActionCompatParcelizer(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read), 1), e);
            }
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesImplApi26Parcelizer(long j) throws IOException {
            if (getParameterAnnotations.RemoteActionCompatParcelizer && RatingCompat() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.IconCompatParcelizer;
                    int i = this.RemoteActionCompatParcelizer;
                    this.RemoteActionCompatParcelizer = i + 1;
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.IconCompatParcelizer;
                int i2 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i2 + 1;
                ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.IconCompatParcelizer;
                    int i3 = this.RemoteActionCompatParcelizer;
                    this.RemoteActionCompatParcelizer = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new RemoteActionCompatParcelizer(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read), 1), e);
                }
            }
            byte[] bArr4 = this.IconCompatParcelizer;
            int i4 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(long j) throws IOException {
            try {
                byte[] bArr = this.IconCompatParcelizer;
                int i = this.RemoteActionCompatParcelizer;
                bArr[i] = (byte) j;
                bArr[i + 1] = (byte) (j >> 8);
                bArr[i + 2] = (byte) (j >> 16);
                bArr[i + 3] = (byte) (j >> 24);
                bArr[i + 4] = (byte) (j >> 32);
                bArr[i + 5] = (byte) (j >> 40);
                bArr[i + 6] = (byte) (j >> 48);
                this.RemoteActionCompatParcelizer = i + 8;
                bArr[i + 7] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new RemoteActionCompatParcelizer(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read), 1), e);
            }
        }

        private void IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, i2);
                this.RemoteActionCompatParcelizer += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new RemoteActionCompatParcelizer(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.read), Integer.valueOf(i2)), e);
            }
        }

        @Override // kotlin._addMethodMixIns
        public final void AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
            IconCompatParcelizer(bArr, i, i2);
        }

        @Override // kotlin.getParameterAnnotations
        public final void write(String str) throws IOException {
            int i = this.RemoteActionCompatParcelizer;
            try {
                int iMediaDescriptionCompat = MediaDescriptionCompat(str.length() * 3);
                int iMediaDescriptionCompat2 = MediaDescriptionCompat(str.length());
                if (iMediaDescriptionCompat2 == iMediaDescriptionCompat) {
                    int i2 = i + iMediaDescriptionCompat2;
                    this.RemoteActionCompatParcelizer = i2;
                    int iWrite = _emptyAnnotationMaps.write(str, this.IconCompatParcelizer, i2, RatingCompat());
                    this.RemoteActionCompatParcelizer = i;
                    onFastForward((iWrite - i) - iMediaDescriptionCompat2);
                    this.RemoteActionCompatParcelizer = iWrite;
                    return;
                }
                onFastForward(_emptyAnnotationMaps.write(str));
                this.RemoteActionCompatParcelizer = _emptyAnnotationMaps.write(str, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, RatingCompat());
            } catch (IndexOutOfBoundsException e) {
                throw new RemoteActionCompatParcelizer(e);
            } catch (_emptyAnnotationMaps.write e2) {
                this.RemoteActionCompatParcelizer = i;
                write(str, e2);
            }
        }

        @Override // kotlin.getParameterAnnotations
        public final int RatingCompat() {
            return this.read - this.RemoteActionCompatParcelizer;
        }
    }

    static abstract class AudioAttributesCompatParcelizer extends getParameterAnnotations {
        int IconCompatParcelizer;
        final int RemoteActionCompatParcelizer;
        final byte[] read;
        int write;

        AudioAttributesCompatParcelizer(int i) {
            super((byte) 0);
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            int iMax = Math.max(i, 20);
            this.read = new byte[iMax];
            this.RemoteActionCompatParcelizer = iMax;
        }

        @Override // kotlin.getParameterAnnotations
        public final int RatingCompat() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void write(byte b) {
            byte[] bArr = this.read;
            int i = this.write;
            this.write = i + 1;
            bArr[i] = b;
            this.IconCompatParcelizer++;
        }

        final void MediaDescriptionCompat(int i, int i2) {
            onMediaButtonEvent(_ignorableAnnotation.RemoteActionCompatParcelizer(i, i2));
        }

        final void onPause(int i) {
            if (i >= 0) {
                onMediaButtonEvent(i);
            } else {
                MediaBrowserCompatItemReceiver(i);
            }
        }

        final void onMediaButtonEvent(int i) {
            if (getParameterAnnotations.RemoteActionCompatParcelizer) {
                long j = this.write;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.read;
                    int i2 = this.write;
                    this.write = i2 + 1;
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.read;
                int i3 = this.write;
                this.write = i3 + 1;
                ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr2, i3, (byte) i);
                this.IconCompatParcelizer += (int) (((long) this.write) - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.read;
                int i4 = this.write;
                this.write = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.IconCompatParcelizer++;
                i >>>= 7;
            }
            byte[] bArr4 = this.read;
            int i5 = this.write;
            this.write = i5 + 1;
            bArr4[i5] = (byte) i;
            this.IconCompatParcelizer++;
        }

        final void MediaBrowserCompatItemReceiver(long j) {
            if (getParameterAnnotations.RemoteActionCompatParcelizer) {
                long j2 = this.write;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.read;
                    int i = this.write;
                    this.write = i + 1;
                    ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.read;
                int i2 = this.write;
                this.write = i2 + 1;
                ClassIntrospectorMixInResolver.IconCompatParcelizer(bArr2, i2, (byte) j);
                this.IconCompatParcelizer += (int) (((long) this.write) - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.read;
                int i3 = this.write;
                this.write = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.IconCompatParcelizer++;
                j >>>= 7;
            }
            byte[] bArr4 = this.read;
            int i4 = this.write;
            this.write = i4 + 1;
            bArr4[i4] = (byte) j;
            this.IconCompatParcelizer++;
        }

        final void onPlay(int i) {
            byte[] bArr = this.read;
            int i2 = this.write;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            this.write = i2 + 4;
            bArr[i2 + 3] = (byte) (i >>> 24);
            this.IconCompatParcelizer += 4;
        }

        final void AudioAttributesImplApi21Parcelizer(long j) {
            byte[] bArr = this.read;
            int i = this.write;
            bArr[i] = (byte) (j & 255);
            bArr[i + 1] = (byte) ((j >> 8) & 255);
            bArr[i + 2] = (byte) ((j >> 16) & 255);
            bArr[i + 3] = (byte) (255 & (j >> 24));
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            this.write = i + 8;
            bArr[i + 7] = (byte) (j >> 56);
            this.IconCompatParcelizer += 8;
        }
    }

    static final class IconCompatParcelizer extends AudioAttributesCompatParcelizer {
        private final OutputStream AudioAttributesImplBaseParcelizer;

        IconCompatParcelizer(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.AudioAttributesImplBaseParcelizer = outputStream;
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesImplBaseParcelizer(int i, int i2) throws IOException {
            onFastForward(_ignorableAnnotation.RemoteActionCompatParcelizer(i, i2));
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesImplApi21Parcelizer(int i, int i2) throws IOException {
            onPlayFromMediaId(20);
            MediaDescriptionCompat(i, 0);
            onPause(i2);
        }

        @Override // kotlin.getParameterAnnotations
        public final void MediaBrowserCompatMediaItem(int i, int i2) throws IOException {
            onPlayFromMediaId(20);
            MediaDescriptionCompat(i, 0);
            onMediaButtonEvent(i2);
        }

        @Override // kotlin.getParameterAnnotations
        public final void MediaBrowserCompatCustomActionResultReceiver(int i, int i2) throws IOException {
            onPlayFromMediaId(14);
            MediaDescriptionCompat(i, 5);
            onPlay(i2);
        }

        @Override // kotlin.getParameterAnnotations
        public final void MediaBrowserCompatItemReceiver(int i, long j) throws IOException {
            onPlayFromMediaId(20);
            MediaDescriptionCompat(i, 0);
            MediaBrowserCompatItemReceiver(j);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(int i, long j) throws IOException {
            onPlayFromMediaId(18);
            MediaDescriptionCompat(i, 1);
            AudioAttributesImplApi21Parcelizer(j);
        }

        @Override // kotlin.getParameterAnnotations
        public final void IconCompatParcelizer(int i, boolean z) throws IOException {
            onPlayFromMediaId(11);
            MediaDescriptionCompat(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        @Override // kotlin.getParameterAnnotations
        public final void RemoteActionCompatParcelizer(int i, String str) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 2);
            write(str);
        }

        @Override // kotlin.getParameterAnnotations
        public final void RemoteActionCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 2);
            read(annotatedWithParams);
        }

        @Override // kotlin.getParameterAnnotations
        public final void read(AnnotatedWithParams annotatedWithParams) throws IOException {
            onFastForward(annotatedWithParams.read());
            annotatedWithParams.AudioAttributesCompatParcelizer(this);
        }

        @Override // kotlin.getParameterAnnotations
        public final void write(byte[] bArr, int i) throws IOException {
            onFastForward(i);
            write(bArr, 0, i);
        }

        private void read(constructPropertyCollector constructpropertycollector) throws IOException {
            AudioAttributesImplBaseParcelizer(3, 2);
            IconCompatParcelizer(constructpropertycollector);
        }

        @Override // kotlin.getParameterAnnotations
        final void IconCompatParcelizer(int i, constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) throws IOException {
            AudioAttributesImplBaseParcelizer(i, 2);
            write(constructpropertycollector, getprimarymember);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(int i, constructPropertyCollector constructpropertycollector) throws IOException {
            AudioAttributesImplBaseParcelizer(1, 3);
            MediaBrowserCompatMediaItem(2, i);
            read(constructpropertycollector);
            AudioAttributesImplBaseParcelizer(1, 4);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(int i, AnnotatedWithParams annotatedWithParams) throws IOException {
            AudioAttributesImplBaseParcelizer(1, 3);
            MediaBrowserCompatMediaItem(2, i);
            RemoteActionCompatParcelizer(3, annotatedWithParams);
            AudioAttributesImplBaseParcelizer(1, 4);
        }

        @Override // kotlin.getParameterAnnotations
        public final void IconCompatParcelizer(constructPropertyCollector constructpropertycollector) throws IOException {
            onFastForward(constructpropertycollector.onCustomAction());
            constructpropertycollector.AudioAttributesCompatParcelizer(this);
        }

        @Override // kotlin.getParameterAnnotations
        final void write(constructPropertyCollector constructpropertycollector, getPrimaryMember getprimarymember) throws IOException {
            onFastForward(((_isIncludableMemberMethod) constructpropertycollector).read(getprimarymember));
            getprimarymember.AudioAttributesCompatParcelizer(constructpropertycollector, this.AudioAttributesCompatParcelizer);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(byte b) throws IOException {
            if (this.write == this.RemoteActionCompatParcelizer) {
                MediaDescriptionCompat();
            }
            write(b);
        }

        @Override // kotlin.getParameterAnnotations
        public final void onCommand(int i) throws IOException {
            if (i >= 0) {
                onFastForward(i);
            } else {
                AudioAttributesImplApi26Parcelizer(i);
            }
        }

        @Override // kotlin.getParameterAnnotations
        public final void onFastForward(int i) throws IOException {
            onPlayFromMediaId(5);
            onMediaButtonEvent(i);
        }

        @Override // kotlin.getParameterAnnotations
        public final void onCustomAction(int i) throws IOException {
            onPlayFromMediaId(4);
            onPlay(i);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesImplApi26Parcelizer(long j) throws IOException {
            onPlayFromMediaId(10);
            MediaBrowserCompatItemReceiver(j);
        }

        @Override // kotlin.getParameterAnnotations
        public final void AudioAttributesCompatParcelizer(long j) throws IOException {
            onPlayFromMediaId(8);
            AudioAttributesImplApi21Parcelizer(j);
        }

        @Override // kotlin.getParameterAnnotations
        public final void write(String str) throws IOException {
            int iWrite;
            try {
                int length = str.length() * 3;
                int iMediaDescriptionCompat = MediaDescriptionCompat(length);
                int i = iMediaDescriptionCompat + length;
                if (i > this.RemoteActionCompatParcelizer) {
                    byte[] bArr = new byte[length];
                    int iWrite2 = _emptyAnnotationMaps.write(str, bArr, 0, length);
                    onFastForward(iWrite2);
                    AudioAttributesCompatParcelizer(bArr, 0, iWrite2);
                    return;
                }
                if (i > this.RemoteActionCompatParcelizer - this.write) {
                    MediaDescriptionCompat();
                }
                int iMediaDescriptionCompat2 = MediaDescriptionCompat(str.length());
                int i2 = this.write;
                try {
                    if (iMediaDescriptionCompat2 == iMediaDescriptionCompat) {
                        this.write = i2 + iMediaDescriptionCompat2;
                        int iWrite3 = _emptyAnnotationMaps.write(str, this.read, this.write, this.RemoteActionCompatParcelizer - this.write);
                        this.write = i2;
                        iWrite = (iWrite3 - i2) - iMediaDescriptionCompat2;
                        onMediaButtonEvent(iWrite);
                        this.write = iWrite3;
                    } else {
                        iWrite = _emptyAnnotationMaps.write(str);
                        onMediaButtonEvent(iWrite);
                        this.write = _emptyAnnotationMaps.write(str, this.read, this.write, iWrite);
                    }
                    ((AudioAttributesCompatParcelizer) this).IconCompatParcelizer += iWrite;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new RemoteActionCompatParcelizer(e);
                } catch (_emptyAnnotationMaps.write e2) {
                    ((AudioAttributesCompatParcelizer) this).IconCompatParcelizer -= this.write - i2;
                    this.write = i2;
                    throw e2;
                }
            } catch (_emptyAnnotationMaps.write e3) {
                write(str, e3);
            }
        }

        @Override // kotlin.getParameterAnnotations
        public final void MediaBrowserCompatCustomActionResultReceiver() throws IOException {
            if (this.write > 0) {
                MediaDescriptionCompat();
            }
        }

        private void write(byte[] bArr, int i, int i2) throws IOException {
            if (this.RemoteActionCompatParcelizer - this.write >= i2) {
                System.arraycopy(bArr, i, this.read, this.write, i2);
                this.write += i2;
                ((AudioAttributesCompatParcelizer) this).IconCompatParcelizer += i2;
                return;
            }
            int i3 = this.RemoteActionCompatParcelizer - this.write;
            System.arraycopy(bArr, i, this.read, this.write, i3);
            int i4 = i + i3;
            int i5 = i2 - i3;
            this.write = this.RemoteActionCompatParcelizer;
            ((AudioAttributesCompatParcelizer) this).IconCompatParcelizer += i3;
            MediaDescriptionCompat();
            if (i5 <= this.RemoteActionCompatParcelizer) {
                System.arraycopy(bArr, i4, this.read, 0, i5);
                this.write = i5;
            } else {
                this.AudioAttributesImplBaseParcelizer.write(bArr, i4, i5);
            }
            ((AudioAttributesCompatParcelizer) this).IconCompatParcelizer += i5;
        }

        @Override // kotlin._addMethodMixIns
        public final void AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        private void onPlayFromMediaId(int i) throws IOException {
            if (this.RemoteActionCompatParcelizer - this.write < i) {
                MediaDescriptionCompat();
            }
        }

        private void MediaDescriptionCompat() throws IOException {
            this.AudioAttributesImplBaseParcelizer.write(this.read, 0, this.write);
            this.write = 0;
        }
    }
}
