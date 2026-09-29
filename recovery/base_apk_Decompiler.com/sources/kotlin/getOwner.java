package kotlin;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getOwner {
    AnnotationCollector AudioAttributesCompatParcelizer;
    int IconCompatParcelizer;
    int RemoteActionCompatParcelizer;
    private boolean read;
    int write;

    public static int RemoteActionCompatParcelizer(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long write(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract void AudioAttributesCompatParcelizer(int i) throws _add;

    public abstract boolean AudioAttributesCompatParcelizer() throws IOException;

    public abstract int AudioAttributesImplApi21Parcelizer() throws IOException;

    public abstract float AudioAttributesImplApi26Parcelizer() throws IOException;

    public abstract int AudioAttributesImplBaseParcelizer() throws IOException;

    public abstract int IconCompatParcelizer();

    public abstract int IconCompatParcelizer(int i) throws _add;

    public abstract long MediaBrowserCompatCustomActionResultReceiver() throws IOException;

    public abstract int MediaBrowserCompatItemReceiver() throws IOException;

    abstract long MediaBrowserCompatMediaItem() throws IOException;

    public abstract int MediaBrowserCompatSearchResultReceiver() throws IOException;

    public abstract int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException;

    public abstract long MediaDescriptionCompat() throws IOException;

    public abstract int MediaMetadataCompat() throws IOException;

    public abstract long RatingCompat() throws IOException;

    public abstract double RemoteActionCompatParcelizer() throws IOException;

    public abstract long handleMediaPlayPauseIfPendingOnHandler() throws IOException;

    public abstract String onAddQueueItem() throws IOException;

    public abstract int onCommand() throws IOException;

    public abstract String onCustomAction() throws IOException;

    public abstract long onPause() throws IOException;

    public abstract void read(int i);

    public abstract boolean read() throws IOException;

    public abstract AnnotatedWithParams write() throws IOException;

    public abstract boolean write(int i) throws IOException;

    /* synthetic */ getOwner(byte b) {
        this();
    }

    public static getOwner IconCompatParcelizer(InputStream inputStream) {
        return write(inputStream);
    }

    private static getOwner write(InputStream inputStream) {
        if (inputStream == null) {
            return AudioAttributesCompatParcelizer(forDeserialization.AudioAttributesCompatParcelizer);
        }
        return new read(inputStream, 4096, (byte) 0);
    }

    public static getOwner AudioAttributesCompatParcelizer(byte[] bArr) {
        return RemoteActionCompatParcelizer(bArr, bArr.length);
    }

    private static getOwner RemoteActionCompatParcelizer(byte[] bArr, int i) {
        return IconCompatParcelizer(bArr, 0, i, false);
    }

    private static getOwner IconCompatParcelizer(byte[] bArr, int i, int i2, boolean z) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(bArr, 0, i2, false, (byte) 0);
        try {
            audioAttributesCompatParcelizer.IconCompatParcelizer(i2);
            return audioAttributesCompatParcelizer;
        } catch (_add e) {
            throw new IllegalArgumentException(e);
        }
    }

    private getOwner() {
        this.write = 100;
        this.RemoteActionCompatParcelizer = Integer.MAX_VALUE;
        this.read = false;
    }

    static final class AudioAttributesCompatParcelizer extends getOwner {
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private final boolean AudioAttributesImplBaseParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private int MediaDescriptionCompat;
        private int RatingCompat;
        private final byte[] read;

        /* synthetic */ AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2, boolean z, byte b) {
            this(bArr, i, i2, z);
        }

        private AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2, boolean z) {
            super((byte) 0);
            this.MediaBrowserCompatCustomActionResultReceiver = Integer.MAX_VALUE;
            this.read = bArr;
            this.MediaBrowserCompatMediaItem = i2 + i;
            this.MediaDescriptionCompat = i;
            this.RatingCompat = i;
            this.AudioAttributesImplBaseParcelizer = z;
        }

        @Override // kotlin.getOwner
        public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
            if (read()) {
                this.AudioAttributesImplApi26Parcelizer = 0;
                return 0;
            }
            int iOnPrepare = onPrepare();
            this.AudioAttributesImplApi26Parcelizer = iOnPrepare;
            if (_ignorableAnnotation.read(iOnPrepare) == 0) {
                throw _add.read();
            }
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // kotlin.getOwner
        public final void AudioAttributesCompatParcelizer(int i) throws _add {
            if (this.AudioAttributesImplApi26Parcelizer != i) {
                throw _add.IconCompatParcelizer();
            }
        }

        @Override // kotlin.getOwner
        public final boolean write(int i) throws IOException {
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(i);
            if (iRemoteActionCompatParcelizer == 0) {
                onMediaButtonEvent();
                return true;
            }
            if (iRemoteActionCompatParcelizer == 1) {
                MediaBrowserCompatCustomActionResultReceiver(8);
                return true;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                MediaBrowserCompatCustomActionResultReceiver(onPrepare());
                return true;
            }
            if (iRemoteActionCompatParcelizer == 3) {
                onRemoveQueueItemAt();
                AudioAttributesCompatParcelizer(_ignorableAnnotation.RemoteActionCompatParcelizer(_ignorableAnnotation.read(i), 4));
                return true;
            }
            if (iRemoteActionCompatParcelizer == 4) {
                return false;
            }
            if (iRemoteActionCompatParcelizer == 5) {
                MediaBrowserCompatCustomActionResultReceiver(4);
                return true;
            }
            throw _add.write();
        }

        private void onRemoveQueueItemAt() throws IOException {
            int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            do {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
                    return;
                }
            } while (write(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        }

        @Override // kotlin.getOwner
        public final double RemoteActionCompatParcelizer() throws IOException {
            return Double.longBitsToDouble(onPlayFromSearch());
        }

        @Override // kotlin.getOwner
        public final float AudioAttributesImplApi26Parcelizer() throws IOException {
            return Float.intBitsToFloat(onPlayFromUri());
        }

        @Override // kotlin.getOwner
        public final long onPause() throws IOException {
            return onPrepareFromSearch();
        }

        @Override // kotlin.getOwner
        public final long MediaDescriptionCompat() throws IOException {
            return onPrepareFromSearch();
        }

        @Override // kotlin.getOwner
        public final int AudioAttributesImplBaseParcelizer() throws IOException {
            return onPrepare();
        }

        @Override // kotlin.getOwner
        public final long MediaBrowserCompatCustomActionResultReceiver() throws IOException {
            return onPlayFromSearch();
        }

        @Override // kotlin.getOwner
        public final int MediaBrowserCompatItemReceiver() throws IOException {
            return onPlayFromUri();
        }

        @Override // kotlin.getOwner
        public final boolean AudioAttributesCompatParcelizer() throws IOException {
            return onPrepareFromSearch() != 0;
        }

        @Override // kotlin.getOwner
        public final String onCustomAction() throws IOException {
            int iOnPrepare = onPrepare();
            if (iOnPrepare > 0) {
                int i = this.MediaBrowserCompatMediaItem;
                int i2 = this.MediaDescriptionCompat;
                if (iOnPrepare <= i - i2) {
                    String str = new String(this.read, i2, iOnPrepare, forDeserialization.write);
                    this.MediaDescriptionCompat += iOnPrepare;
                    return str;
                }
            }
            if (iOnPrepare == 0) {
                return "";
            }
            if (iOnPrepare < 0) {
                throw _add.MediaBrowserCompatCustomActionResultReceiver();
            }
            throw _add.AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.getOwner
        public final String onAddQueueItem() throws IOException {
            int iOnPrepare = onPrepare();
            if (iOnPrepare > 0) {
                int i = this.MediaBrowserCompatMediaItem;
                int i2 = this.MediaDescriptionCompat;
                if (iOnPrepare <= i - i2) {
                    String strRemoteActionCompatParcelizer = _emptyAnnotationMaps.RemoteActionCompatParcelizer(this.read, i2, iOnPrepare);
                    this.MediaDescriptionCompat += iOnPrepare;
                    return strRemoteActionCompatParcelizer;
                }
            }
            if (iOnPrepare == 0) {
                return "";
            }
            if (iOnPrepare <= 0) {
                throw _add.MediaBrowserCompatCustomActionResultReceiver();
            }
            throw _add.AudioAttributesImplApi26Parcelizer();
        }

        @Override // kotlin.getOwner
        public final AnnotatedWithParams write() throws IOException {
            int iOnPrepare = onPrepare();
            if (iOnPrepare > 0) {
                int i = this.MediaBrowserCompatMediaItem;
                int i2 = this.MediaDescriptionCompat;
                if (iOnPrepare <= i - i2) {
                    AnnotatedWithParams annotatedWithParamsWrite = AnnotatedWithParams.write(this.read, i2, iOnPrepare);
                    this.MediaDescriptionCompat += iOnPrepare;
                    return annotatedWithParamsWrite;
                }
            }
            if (iOnPrepare == 0) {
                return AnnotatedWithParams.AudioAttributesCompatParcelizer;
            }
            return AnnotatedWithParams.IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(iOnPrepare));
        }

        @Override // kotlin.getOwner
        public final int onCommand() throws IOException {
            return onPrepare();
        }

        @Override // kotlin.getOwner
        public final int AudioAttributesImplApi21Parcelizer() throws IOException {
            return onPrepare();
        }

        @Override // kotlin.getOwner
        public final int MediaMetadataCompat() throws IOException {
            return onPlayFromUri();
        }

        @Override // kotlin.getOwner
        public final long RatingCompat() throws IOException {
            return onPlayFromSearch();
        }

        @Override // kotlin.getOwner
        public final int MediaBrowserCompatSearchResultReceiver() throws IOException {
            return RemoteActionCompatParcelizer(onPrepare());
        }

        @Override // kotlin.getOwner
        public final long handleMediaPlayPauseIfPendingOnHandler() throws IOException {
            return write(onPrepareFromSearch());
        }

        private int onPrepare() throws IOException {
            int i;
            int i2 = this.MediaDescriptionCompat;
            int i3 = this.MediaBrowserCompatMediaItem;
            if (i3 != i2) {
                byte[] bArr = this.read;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.MediaDescriptionCompat = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i2 + 10;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.MediaDescriptionCompat = i5;
                    return i;
                }
            }
            return (int) MediaBrowserCompatMediaItem();
        }

        private void onMediaButtonEvent() throws IOException {
            if (this.MediaBrowserCompatMediaItem - this.MediaDescriptionCompat >= 10) {
                onPlay();
            } else {
                onPlayFromMediaId();
            }
        }

        private void onPlay() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.read;
                int i2 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw _add.AudioAttributesCompatParcelizer();
        }

        private void onPlayFromMediaId() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (onPrepareFromMediaId() >= 0) {
                    return;
                }
            }
            throw _add.AudioAttributesCompatParcelizer();
        }

        private long onPrepareFromSearch() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.MediaDescriptionCompat;
            int i2 = this.MediaBrowserCompatMediaItem;
            if (i2 != i) {
                byte[] bArr = this.read;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.MediaDescriptionCompat = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i + 10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.MediaDescriptionCompat = i4;
                    return j;
                }
            }
            return MediaBrowserCompatMediaItem();
        }

        @Override // kotlin.getOwner
        final long MediaBrowserCompatMediaItem() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bOnPrepareFromMediaId = onPrepareFromMediaId();
                j |= ((long) (bOnPrepareFromMediaId & 127)) << i;
                if ((bOnPrepareFromMediaId & 128) == 0) {
                    return j;
                }
            }
            throw _add.AudioAttributesCompatParcelizer();
        }

        private int onPlayFromUri() throws IOException {
            int i = this.MediaDescriptionCompat;
            if (this.MediaBrowserCompatMediaItem - i < 4) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            byte[] bArr = this.read;
            this.MediaDescriptionCompat = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        private long onPlayFromSearch() throws IOException {
            int i = this.MediaDescriptionCompat;
            if (this.MediaBrowserCompatMediaItem - i < 8) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            byte[] bArr = this.read;
            this.MediaDescriptionCompat = i + 8;
            long j = bArr[i];
            long j2 = bArr[i + 1];
            long j3 = bArr[i + 2];
            long j4 = bArr[i + 3];
            long j5 = bArr[i + 4];
            long j6 = bArr[i + 5];
            return ((((long) bArr[i + 7]) & 255) << 56) | ((bArr[i + 6] & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
        }

        @Override // kotlin.getOwner
        public final int IconCompatParcelizer(int i) throws _add {
            if (i < 0) {
                throw _add.MediaBrowserCompatCustomActionResultReceiver();
            }
            int iIconCompatParcelizer = i + IconCompatParcelizer();
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (iIconCompatParcelizer > i2) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            this.MediaBrowserCompatCustomActionResultReceiver = iIconCompatParcelizer;
            onFastForward();
            return i2;
        }

        private void onFastForward() {
            int i = this.MediaBrowserCompatMediaItem + this.AudioAttributesImplApi21Parcelizer;
            this.MediaBrowserCompatMediaItem = i;
            int i2 = i - this.RatingCompat;
            int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.AudioAttributesImplApi21Parcelizer = i4;
                this.MediaBrowserCompatMediaItem = i - i4;
                return;
            }
            this.AudioAttributesImplApi21Parcelizer = 0;
        }

        @Override // kotlin.getOwner
        public final void read(int i) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            onFastForward();
        }

        @Override // kotlin.getOwner
        public final boolean read() throws IOException {
            return this.MediaDescriptionCompat == this.MediaBrowserCompatMediaItem;
        }

        @Override // kotlin.getOwner
        public final int IconCompatParcelizer() {
            return this.MediaDescriptionCompat - this.RatingCompat;
        }

        private byte onPrepareFromMediaId() throws IOException {
            int i = this.MediaDescriptionCompat;
            if (i == this.MediaBrowserCompatMediaItem) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            byte[] bArr = this.read;
            this.MediaDescriptionCompat = i + 1;
            return bArr[i];
        }

        private byte[] AudioAttributesImplApi26Parcelizer(int i) throws IOException {
            if (i > 0) {
                int i2 = this.MediaBrowserCompatMediaItem;
                int i3 = this.MediaDescriptionCompat;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.MediaDescriptionCompat = i4;
                    return Arrays.copyOfRange(this.read, i3, i4);
                }
            }
            if (i > 0) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            if (i == 0) {
                return forDeserialization.AudioAttributesCompatParcelizer;
            }
            throw _add.MediaBrowserCompatCustomActionResultReceiver();
        }

        private void MediaBrowserCompatCustomActionResultReceiver(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.MediaBrowserCompatMediaItem;
                int i3 = this.MediaDescriptionCompat;
                if (i <= i2 - i3) {
                    this.MediaDescriptionCompat = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw _add.MediaBrowserCompatCustomActionResultReceiver();
            }
            throw _add.AudioAttributesImplApi26Parcelizer();
        }
    }

    static final class read extends getOwner {
        private int AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private final InputStream MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private int MediaBrowserCompatSearchResultReceiver;
        private InterfaceC0099read RatingCompat;
        private final byte[] read;

        /* JADX INFO: renamed from: o.getOwner$read$read, reason: collision with other inner class name */
        interface InterfaceC0099read {
        }

        /* synthetic */ read(InputStream inputStream, int i, byte b) {
            this(inputStream, 4096);
        }

        private read(InputStream inputStream, int i) {
            super((byte) 0);
            this.AudioAttributesImplBaseParcelizer = Integer.MAX_VALUE;
            this.RatingCompat = null;
            forDeserialization.read(inputStream, "input");
            this.MediaBrowserCompatItemReceiver = inputStream;
            this.read = new byte[i];
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.MediaBrowserCompatMediaItem = 0;
            this.MediaBrowserCompatSearchResultReceiver = 0;
        }

        @Override // kotlin.getOwner
        public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
            if (read()) {
                this.MediaBrowserCompatCustomActionResultReceiver = 0;
                return 0;
            }
            int iOnPlayFromUri = onPlayFromUri();
            this.MediaBrowserCompatCustomActionResultReceiver = iOnPlayFromUri;
            if (_ignorableAnnotation.read(iOnPlayFromUri) == 0) {
                throw _add.read();
            }
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        @Override // kotlin.getOwner
        public final void AudioAttributesCompatParcelizer(int i) throws _add {
            if (this.MediaBrowserCompatCustomActionResultReceiver != i) {
                throw _add.IconCompatParcelizer();
            }
        }

        @Override // kotlin.getOwner
        public final boolean write(int i) throws IOException {
            int iRemoteActionCompatParcelizer = _ignorableAnnotation.RemoteActionCompatParcelizer(i);
            if (iRemoteActionCompatParcelizer == 0) {
                onPlayFromMediaId();
                return true;
            }
            if (iRemoteActionCompatParcelizer == 1) {
                MediaMetadataCompat(8);
                return true;
            }
            if (iRemoteActionCompatParcelizer == 2) {
                MediaMetadataCompat(onPlayFromUri());
                return true;
            }
            if (iRemoteActionCompatParcelizer == 3) {
                onRewind();
                AudioAttributesCompatParcelizer(_ignorableAnnotation.RemoteActionCompatParcelizer(_ignorableAnnotation.read(i), 4));
                return true;
            }
            if (iRemoteActionCompatParcelizer == 4) {
                return false;
            }
            if (iRemoteActionCompatParcelizer == 5) {
                MediaMetadataCompat(4);
                return true;
            }
            throw _add.write();
        }

        private void onRewind() throws IOException {
            int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            do {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
                    return;
                }
            } while (write(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        }

        @Override // kotlin.getOwner
        public final double RemoteActionCompatParcelizer() throws IOException {
            return Double.longBitsToDouble(onPlayFromSearch());
        }

        @Override // kotlin.getOwner
        public final float AudioAttributesImplApi26Parcelizer() throws IOException {
            return Float.intBitsToFloat(onPrepare());
        }

        @Override // kotlin.getOwner
        public final long onPause() throws IOException {
            return onPrepareFromMediaId();
        }

        @Override // kotlin.getOwner
        public final long MediaDescriptionCompat() throws IOException {
            return onPrepareFromMediaId();
        }

        @Override // kotlin.getOwner
        public final int AudioAttributesImplBaseParcelizer() throws IOException {
            return onPlayFromUri();
        }

        @Override // kotlin.getOwner
        public final long MediaBrowserCompatCustomActionResultReceiver() throws IOException {
            return onPlayFromSearch();
        }

        @Override // kotlin.getOwner
        public final int MediaBrowserCompatItemReceiver() throws IOException {
            return onPrepare();
        }

        @Override // kotlin.getOwner
        public final boolean AudioAttributesCompatParcelizer() throws IOException {
            return onPrepareFromMediaId() != 0;
        }

        @Override // kotlin.getOwner
        public final String onCustomAction() throws IOException {
            int iOnPlayFromUri = onPlayFromUri();
            if (iOnPlayFromUri > 0) {
                int i = this.AudioAttributesImplApi21Parcelizer;
                int i2 = this.MediaBrowserCompatMediaItem;
                if (iOnPlayFromUri <= i - i2) {
                    String str = new String(this.read, i2, iOnPlayFromUri, forDeserialization.write);
                    this.MediaBrowserCompatMediaItem += iOnPlayFromUri;
                    return str;
                }
            }
            if (iOnPlayFromUri == 0) {
                return "";
            }
            if (iOnPlayFromUri <= this.AudioAttributesImplApi21Parcelizer) {
                AudioAttributesImplApi26Parcelizer(iOnPlayFromUri);
                String str2 = new String(this.read, this.MediaBrowserCompatMediaItem, iOnPlayFromUri, forDeserialization.write);
                this.MediaBrowserCompatMediaItem += iOnPlayFromUri;
                return str2;
            }
            return new String(MediaBrowserCompatCustomActionResultReceiver(iOnPlayFromUri), forDeserialization.write);
        }

        @Override // kotlin.getOwner
        public final String onAddQueueItem() throws IOException {
            byte[] bArrMediaBrowserCompatCustomActionResultReceiver;
            int iOnPlayFromUri = onPlayFromUri();
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.AudioAttributesImplApi21Parcelizer;
            if (iOnPlayFromUri <= i2 - i && iOnPlayFromUri > 0) {
                bArrMediaBrowserCompatCustomActionResultReceiver = this.read;
                this.MediaBrowserCompatMediaItem = i + iOnPlayFromUri;
            } else {
                if (iOnPlayFromUri == 0) {
                    return "";
                }
                i = 0;
                if (iOnPlayFromUri <= i2) {
                    AudioAttributesImplApi26Parcelizer(iOnPlayFromUri);
                    bArrMediaBrowserCompatCustomActionResultReceiver = this.read;
                    this.MediaBrowserCompatMediaItem = iOnPlayFromUri;
                } else {
                    bArrMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(iOnPlayFromUri);
                }
            }
            return _emptyAnnotationMaps.RemoteActionCompatParcelizer(bArrMediaBrowserCompatCustomActionResultReceiver, i, iOnPlayFromUri);
        }

        @Override // kotlin.getOwner
        public final AnnotatedWithParams write() throws IOException {
            int iOnPlayFromUri = onPlayFromUri();
            int i = this.AudioAttributesImplApi21Parcelizer;
            int i2 = this.MediaBrowserCompatMediaItem;
            if (iOnPlayFromUri > i - i2 || iOnPlayFromUri <= 0) {
                if (iOnPlayFromUri == 0) {
                    return AnnotatedWithParams.AudioAttributesCompatParcelizer;
                }
                return AudioAttributesImplApi21Parcelizer(iOnPlayFromUri);
            }
            AnnotatedWithParams annotatedWithParamsWrite = AnnotatedWithParams.write(this.read, i2, iOnPlayFromUri);
            this.MediaBrowserCompatMediaItem += iOnPlayFromUri;
            return annotatedWithParamsWrite;
        }

        @Override // kotlin.getOwner
        public final int onCommand() throws IOException {
            return onPlayFromUri();
        }

        @Override // kotlin.getOwner
        public final int AudioAttributesImplApi21Parcelizer() throws IOException {
            return onPlayFromUri();
        }

        @Override // kotlin.getOwner
        public final int MediaMetadataCompat() throws IOException {
            return onPrepare();
        }

        @Override // kotlin.getOwner
        public final long RatingCompat() throws IOException {
            return onPlayFromSearch();
        }

        @Override // kotlin.getOwner
        public final int MediaBrowserCompatSearchResultReceiver() throws IOException {
            return RemoteActionCompatParcelizer(onPlayFromUri());
        }

        @Override // kotlin.getOwner
        public final long handleMediaPlayPauseIfPendingOnHandler() throws IOException {
            return write(onPrepareFromMediaId());
        }

        private int onPlayFromUri() throws IOException {
            int i;
            int i2 = this.MediaBrowserCompatMediaItem;
            int i3 = this.AudioAttributesImplApi21Parcelizer;
            if (i3 != i2) {
                byte[] bArr = this.read;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.MediaBrowserCompatMediaItem = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i2 + 10;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.MediaBrowserCompatMediaItem = i5;
                    return i;
                }
            }
            return (int) MediaBrowserCompatMediaItem();
        }

        private void onPlayFromMediaId() throws IOException {
            if (this.AudioAttributesImplApi21Parcelizer - this.MediaBrowserCompatMediaItem >= 10) {
                onMediaButtonEvent();
            } else {
                onFastForward();
            }
        }

        private void onMediaButtonEvent() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.read;
                int i2 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw _add.AudioAttributesCompatParcelizer();
        }

        private void onFastForward() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (onPrepareFromSearch() >= 0) {
                    return;
                }
            }
            throw _add.AudioAttributesCompatParcelizer();
        }

        private long onPrepareFromMediaId() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.AudioAttributesImplApi21Parcelizer;
            if (i2 != i) {
                byte[] bArr = this.read;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.MediaBrowserCompatMediaItem = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i + 10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.MediaBrowserCompatMediaItem = i4;
                    return j;
                }
            }
            return MediaBrowserCompatMediaItem();
        }

        @Override // kotlin.getOwner
        final long MediaBrowserCompatMediaItem() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bOnPrepareFromSearch = onPrepareFromSearch();
                j |= ((long) (bOnPrepareFromSearch & 127)) << i;
                if ((bOnPrepareFromSearch & 128) == 0) {
                    return j;
                }
            }
            throw _add.AudioAttributesCompatParcelizer();
        }

        private int onPrepare() throws IOException {
            int i = this.MediaBrowserCompatMediaItem;
            if (this.AudioAttributesImplApi21Parcelizer - i < 4) {
                AudioAttributesImplApi26Parcelizer(4);
                i = this.MediaBrowserCompatMediaItem;
            }
            byte[] bArr = this.read;
            this.MediaBrowserCompatMediaItem = i + 4;
            return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
        }

        private long onPlayFromSearch() throws IOException {
            int i = this.MediaBrowserCompatMediaItem;
            if (this.AudioAttributesImplApi21Parcelizer - i < 8) {
                AudioAttributesImplApi26Parcelizer(8);
                i = this.MediaBrowserCompatMediaItem;
            }
            byte[] bArr = this.read;
            this.MediaBrowserCompatMediaItem = i + 8;
            long j = bArr[i];
            long j2 = bArr[i + 1];
            long j3 = bArr[i + 2];
            long j4 = bArr[i + 3];
            long j5 = bArr[i + 4];
            long j6 = bArr[i + 5];
            return ((((long) bArr[i + 7]) & 255) << 56) | ((bArr[i + 6] & 255) << 48) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j6 & 255) << 40);
        }

        @Override // kotlin.getOwner
        public final int IconCompatParcelizer(int i) throws _add {
            if (i < 0) {
                throw _add.MediaBrowserCompatCustomActionResultReceiver();
            }
            int i2 = i + this.MediaBrowserCompatSearchResultReceiver + this.MediaBrowserCompatMediaItem;
            int i3 = this.AudioAttributesImplBaseParcelizer;
            if (i2 > i3) {
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            this.AudioAttributesImplBaseParcelizer = i2;
            onPlay();
            return i3;
        }

        private void onPlay() {
            int i = this.AudioAttributesImplApi21Parcelizer + this.AudioAttributesImplApi26Parcelizer;
            this.AudioAttributesImplApi21Parcelizer = i;
            int i2 = this.MediaBrowserCompatSearchResultReceiver + i;
            int i3 = this.AudioAttributesImplBaseParcelizer;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.AudioAttributesImplApi26Parcelizer = i4;
                this.AudioAttributesImplApi21Parcelizer = i - i4;
                return;
            }
            this.AudioAttributesImplApi26Parcelizer = 0;
        }

        @Override // kotlin.getOwner
        public final void read(int i) {
            this.AudioAttributesImplBaseParcelizer = i;
            onPlay();
        }

        @Override // kotlin.getOwner
        public final boolean read() throws IOException {
            return this.MediaBrowserCompatMediaItem == this.AudioAttributesImplApi21Parcelizer && !MediaDescriptionCompat(1);
        }

        @Override // kotlin.getOwner
        public final int IconCompatParcelizer() {
            return this.MediaBrowserCompatSearchResultReceiver + this.MediaBrowserCompatMediaItem;
        }

        private void AudioAttributesImplApi26Parcelizer(int i) throws IOException {
            if (MediaDescriptionCompat(i)) {
                return;
            }
            if (i > (this.RemoteActionCompatParcelizer - this.MediaBrowserCompatSearchResultReceiver) - this.MediaBrowserCompatMediaItem) {
                throw _add.MediaBrowserCompatItemReceiver();
            }
            throw _add.AudioAttributesImplApi26Parcelizer();
        }

        private boolean MediaDescriptionCompat(int i) throws IOException {
            if (this.MediaBrowserCompatMediaItem + i <= this.AudioAttributesImplApi21Parcelizer) {
                StringBuilder sb = new StringBuilder("refillBuffer() called when ");
                sb.append(i);
                sb.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb.toString());
            }
            int i2 = this.RemoteActionCompatParcelizer;
            int i3 = this.MediaBrowserCompatSearchResultReceiver;
            int i4 = this.MediaBrowserCompatMediaItem;
            if (i > (i2 - i3) - i4 || i3 + i4 + i > this.AudioAttributesImplBaseParcelizer) {
                return false;
            }
            if (i4 > 0) {
                int i5 = this.AudioAttributesImplApi21Parcelizer;
                if (i5 > i4) {
                    byte[] bArr = this.read;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.MediaBrowserCompatSearchResultReceiver += i4;
                this.AudioAttributesImplApi21Parcelizer -= i4;
                this.MediaBrowserCompatMediaItem = 0;
            }
            InputStream inputStream = this.MediaBrowserCompatItemReceiver;
            byte[] bArr2 = this.read;
            int i6 = this.AudioAttributesImplApi21Parcelizer;
            int i7 = inputStream.read(bArr2, i6, Math.min(bArr2.length - i6, (this.RemoteActionCompatParcelizer - this.MediaBrowserCompatSearchResultReceiver) - this.AudioAttributesImplApi21Parcelizer));
            if (i7 == 0 || i7 < -1 || i7 > this.read.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.MediaBrowserCompatItemReceiver.getClass());
                sb2.append("#read(byte[]) returned invalid result: ");
                sb2.append(i7);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (i7 <= 0) {
                return false;
            }
            this.AudioAttributesImplApi21Parcelizer += i7;
            onPlay();
            if (this.AudioAttributesImplApi21Parcelizer >= i) {
                return true;
            }
            return MediaDescriptionCompat(i);
        }

        private byte onPrepareFromSearch() throws IOException {
            if (this.MediaBrowserCompatMediaItem == this.AudioAttributesImplApi21Parcelizer) {
                AudioAttributesImplApi26Parcelizer(1);
            }
            byte[] bArr = this.read;
            int i = this.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatMediaItem = i + 1;
            return bArr[i];
        }

        private byte[] MediaBrowserCompatCustomActionResultReceiver(int i) throws IOException {
            byte[] bArrAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
            if (bArrAudioAttributesImplBaseParcelizer != null) {
                return bArrAudioAttributesImplBaseParcelizer;
            }
            int i2 = this.MediaBrowserCompatMediaItem;
            int i3 = this.AudioAttributesImplApi21Parcelizer;
            int length = i3 - i2;
            this.MediaBrowserCompatSearchResultReceiver += i3;
            this.MediaBrowserCompatMediaItem = 0;
            this.AudioAttributesImplApi21Parcelizer = 0;
            List<byte[]> listMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.read, i2, bArr, 0, length);
            for (byte[] bArr2 : listMediaBrowserCompatItemReceiver) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] AudioAttributesImplBaseParcelizer(int i) throws IOException {
            if (i == 0) {
                return forDeserialization.AudioAttributesCompatParcelizer;
            }
            if (i < 0) {
                throw _add.MediaBrowserCompatCustomActionResultReceiver();
            }
            int i2 = this.MediaBrowserCompatSearchResultReceiver + this.MediaBrowserCompatMediaItem + i;
            if (i2 - this.RemoteActionCompatParcelizer > 0) {
                throw _add.MediaBrowserCompatItemReceiver();
            }
            int i3 = this.AudioAttributesImplBaseParcelizer;
            if (i2 > i3) {
                MediaMetadataCompat((i3 - this.MediaBrowserCompatSearchResultReceiver) - this.MediaBrowserCompatMediaItem);
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            int i4 = this.AudioAttributesImplApi21Parcelizer - this.MediaBrowserCompatMediaItem;
            int i5 = i - i4;
            if (i5 >= 4096 && i5 > this.MediaBrowserCompatItemReceiver.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.read, this.MediaBrowserCompatMediaItem, bArr, 0, i4);
            this.MediaBrowserCompatSearchResultReceiver += this.AudioAttributesImplApi21Parcelizer;
            this.MediaBrowserCompatMediaItem = 0;
            this.AudioAttributesImplApi21Parcelizer = 0;
            while (i4 < i) {
                int i6 = this.MediaBrowserCompatItemReceiver.read(bArr, i4, i - i4);
                if (i6 == -1) {
                    throw _add.AudioAttributesImplApi26Parcelizer();
                }
                this.MediaBrowserCompatSearchResultReceiver += i6;
                i4 += i6;
            }
            return bArr;
        }

        private List<byte[]> MediaBrowserCompatItemReceiver(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.MediaBrowserCompatItemReceiver.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw _add.AudioAttributesImplApi26Parcelizer();
                    }
                    this.MediaBrowserCompatSearchResultReceiver += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private AnnotatedWithParams AudioAttributesImplApi21Parcelizer(int i) throws IOException {
            byte[] bArrAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(i);
            if (bArrAudioAttributesImplBaseParcelizer != null) {
                return AnnotatedWithParams.read(bArrAudioAttributesImplBaseParcelizer);
            }
            int i2 = this.MediaBrowserCompatMediaItem;
            int i3 = this.AudioAttributesImplApi21Parcelizer;
            int length = i3 - i2;
            this.MediaBrowserCompatSearchResultReceiver += i3;
            this.MediaBrowserCompatMediaItem = 0;
            this.AudioAttributesImplApi21Parcelizer = 0;
            List<byte[]> listMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.read, i2, bArr, 0, length);
            for (byte[] bArr2 : listMediaBrowserCompatItemReceiver) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return AnnotatedWithParams.IconCompatParcelizer(bArr);
        }

        private void MediaMetadataCompat(int i) throws IOException {
            int i2 = this.AudioAttributesImplApi21Parcelizer;
            int i3 = this.MediaBrowserCompatMediaItem;
            if (i <= i2 - i3 && i >= 0) {
                this.MediaBrowserCompatMediaItem = i3 + i;
            } else {
                MediaBrowserCompatSearchResultReceiver(i);
            }
        }

        private void MediaBrowserCompatSearchResultReceiver(int i) throws IOException {
            if (i < 0) {
                throw _add.MediaBrowserCompatCustomActionResultReceiver();
            }
            int i2 = this.MediaBrowserCompatSearchResultReceiver;
            int i3 = this.MediaBrowserCompatMediaItem;
            int i4 = this.AudioAttributesImplBaseParcelizer;
            int i5 = i2 + i3;
            if (i5 + i > i4) {
                MediaMetadataCompat((i4 - i2) - i3);
                throw _add.AudioAttributesImplApi26Parcelizer();
            }
            this.MediaBrowserCompatSearchResultReceiver = i5;
            int i6 = this.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplApi21Parcelizer = 0;
            this.MediaBrowserCompatMediaItem = 0;
            int i7 = i6 - i3;
            while (i7 < i) {
                try {
                    long j = i - i7;
                    long jSkip = this.MediaBrowserCompatItemReceiver.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i7 += (int) jSkip;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.MediaBrowserCompatItemReceiver.getClass());
                        sb.append("#skip returned invalid result: ");
                        sb.append(jSkip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                } finally {
                    this.MediaBrowserCompatSearchResultReceiver += i7;
                    onPlay();
                }
            }
            if (i7 >= i) {
                return;
            }
            int i8 = this.AudioAttributesImplApi21Parcelizer;
            int i9 = i8 - this.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatMediaItem = i8;
            AudioAttributesImplApi26Parcelizer(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.AudioAttributesImplApi21Parcelizer;
                if (i10 > i11) {
                    i9 += i11;
                    this.MediaBrowserCompatMediaItem = i11;
                    AudioAttributesImplApi26Parcelizer(1);
                } else {
                    this.MediaBrowserCompatMediaItem = i10;
                    return;
                }
            }
        }
    }
}
