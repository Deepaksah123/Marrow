package kotlin;

import android.util.Pair;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import kotlin.C0170format;

/* JADX INFO: loaded from: classes2.dex */
public final class unlink implements findConstructor {
    private findRawSuperTypes IconCompatParcelizer;
    private nonNullString MediaBrowserCompatCustomActionResultReceiver;
    private write read;
    private int AudioAttributesImplApi26Parcelizer = 0;
    private long RemoteActionCompatParcelizer = -1;
    private int AudioAttributesCompatParcelizer = -1;
    private long write = -1;

    interface write {
        void AudioAttributesCompatParcelizer(long j);

        void read(int i, long j) throws SchemaAware;

        boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j) throws IOException;
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.removeLastOccurrence
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return unlink.read();
            }
        };
    }

    static /* synthetic */ findConstructor[] read() {
        return new findConstructor[]{new unlink()};
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return LinkedDequeAbstractLinkedIterator.AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.IconCompatParcelizer = findrawsupertypes;
        this.MediaBrowserCompatCustomActionResultReceiver = findrawsupertypes.IconCompatParcelizer(0, 1);
        findrawsupertypes.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.AudioAttributesImplApi26Parcelizer = j == 0 ? 0 : 4;
        write writeVar = this.read;
        if (writeVar != null) {
            writeVar.AudioAttributesCompatParcelizer(j2);
        }
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        IconCompatParcelizer();
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i == 0) {
            AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 1) {
            IconCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 2) {
            RemoteActionCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 3) {
            MediaBrowserCompatCustomActionResultReceiver(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 4) {
            return write(closeonfailandthrowasioe);
        }
        throw new IllegalStateException();
    }

    private void IconCompatParcelizer() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        buildTypeSerializer.write(closeonfailandthrowasioe.IconCompatParcelizer() == 0);
        int i = this.AudioAttributesCompatParcelizer;
        if (i != -1) {
            closeonfailandthrowasioe.IconCompatParcelizer(i);
            this.AudioAttributesImplApi26Parcelizer = 4;
        } else {
            if (!LinkedDequeAbstractLinkedIterator.AudioAttributesCompatParcelizer(closeonfailandthrowasioe)) {
                throw SchemaAware.RemoteActionCompatParcelizer("Unsupported or unrecognized wav file type.", null);
            }
            closeonfailandthrowasioe.IconCompatParcelizer((int) (closeonfailandthrowasioe.write() - closeonfailandthrowasioe.IconCompatParcelizer()));
            this.AudioAttributesImplApi26Parcelizer = 1;
        }
    }

    private void IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.RemoteActionCompatParcelizer = LinkedDequeAbstractLinkedIterator.write(closeonfailandthrowasioe);
        this.AudioAttributesImplApi26Parcelizer = 2;
    }

    private void RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        unlinkLast unlinklast = LinkedDequeAbstractLinkedIterator.read(closeonfailandthrowasioe);
        if (unlinklast.read == 17) {
            this.read = new IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, unlinklast);
        } else if (unlinklast.read == 6) {
            this.read = new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, unlinklast, MimeTypes.AUDIO_ALAW, -1);
        } else if (unlinklast.read == 7) {
            this.read = new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, unlinklast, MimeTypes.AUDIO_MLAW, -1);
        } else {
            int iRemoteActionCompatParcelizer = throwAsIAE.RemoteActionCompatParcelizer(unlinklast.read, unlinklast.write);
            if (iRemoteActionCompatParcelizer == 0) {
                StringBuilder sb = new StringBuilder("Unsupported WAV format type: ");
                sb.append(unlinklast.read);
                throw SchemaAware.RemoteActionCompatParcelizer(sb.toString());
            }
            this.read = new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, unlinklast, MimeTypes.AUDIO_RAW, iRemoteActionCompatParcelizer);
        }
        this.AudioAttributesImplApi26Parcelizer = 3;
    }

    private void MediaBrowserCompatCustomActionResultReceiver(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        Pair<Long, Long> pairIconCompatParcelizer = LinkedDequeAbstractLinkedIterator.IconCompatParcelizer(closeonfailandthrowasioe);
        this.AudioAttributesCompatParcelizer = ((Long) pairIconCompatParcelizer.first).intValue();
        long jLongValue = ((Long) pairIconCompatParcelizer.second).longValue();
        long j = this.RemoteActionCompatParcelizer;
        if (j != -1) {
            long j2 = -1;
            if (jLongValue == ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) {
                jLongValue = j;
            }
        }
        this.write = ((long) this.AudioAttributesCompatParcelizer) + jLongValue;
        long j3 = closeonfailandthrowasioe.read();
        if (j3 != -1 && this.write > j3) {
            StringBuilder sb = new StringBuilder("Data exceeds input length: ");
            sb.append(this.write);
            sb.append(", ");
            sb.append(j3);
            prune.RemoteActionCompatParcelizer("WavExtractor", sb.toString());
            this.write = j3;
        }
        ((write) buildTypeSerializer.IconCompatParcelizer(this.read)).read(this.AudioAttributesCompatParcelizer, this.write);
        this.AudioAttributesImplApi26Parcelizer = 4;
    }

    private int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        buildTypeSerializer.write(this.write != -1);
        return ((write) buildTypeSerializer.IconCompatParcelizer(this.read)).write(closeonfailandthrowasioe, this.write - closeonfailandthrowasioe.IconCompatParcelizer()) ? -1 : 0;
    }

    static final class AudioAttributesCompatParcelizer implements write {
        private long AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private long IconCompatParcelizer;
        private final nonNullString MediaBrowserCompatCustomActionResultReceiver;
        private final unlinkLast MediaBrowserCompatItemReceiver;
        private final C0170format RemoteActionCompatParcelizer;
        private int read;
        private final findRawSuperTypes write;

        public AudioAttributesCompatParcelizer(findRawSuperTypes findrawsupertypes, nonNullString nonnullstring, unlinkLast unlinklast, String str, int i) throws SchemaAware {
            this.write = findrawsupertypes;
            this.MediaBrowserCompatCustomActionResultReceiver = nonnullstring;
            this.MediaBrowserCompatItemReceiver = unlinklast;
            int i2 = (unlinklast.MediaBrowserCompatCustomActionResultReceiver * unlinklast.write) / 8;
            if (unlinklast.RemoteActionCompatParcelizer != i2) {
                StringBuilder sb = new StringBuilder("Expected block size: ");
                sb.append(i2);
                sb.append("; got: ");
                sb.append(unlinklast.RemoteActionCompatParcelizer);
                throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
            }
            int i3 = (unlinklast.MediaBrowserCompatItemReceiver * i2) << 3;
            int iMax = Math.max(i2, (unlinklast.MediaBrowserCompatItemReceiver * i2) / 10);
            this.AudioAttributesImplApi26Parcelizer = iMax;
            this.RemoteActionCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(str).write(i3).MediaDescriptionCompat(i3).AudioAttributesImplApi26Parcelizer(iMax).read(unlinklast.MediaBrowserCompatCustomActionResultReceiver).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(unlinklast.MediaBrowserCompatItemReceiver).RatingCompat(i).IconCompatParcelizer();
        }

        @Override // o.unlink.write
        public final void AudioAttributesCompatParcelizer(long j) {
            this.AudioAttributesCompatParcelizer = j;
            this.read = 0;
            this.IconCompatParcelizer = 0L;
        }

        @Override // o.unlink.write
        public final void read(int i, long j) {
            this.write.read(new LinkedDeque2(this.MediaBrowserCompatItemReceiver, 1, i, j));
            this.MediaBrowserCompatCustomActionResultReceiver.write(this.RemoteActionCompatParcelizer);
        }

        @Override // o.unlink.write
        public final boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, long j) throws IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.read) < (i2 = this.AudioAttributesImplApi26Parcelizer)) {
                int iAudioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, (int) Math.min(i2 - i, j2), true);
                if (iAudioAttributesCompatParcelizer == -1) {
                    j2 = 0;
                } else {
                    this.read += iAudioAttributesCompatParcelizer;
                    j2 -= (long) iAudioAttributesCompatParcelizer;
                }
            }
            int i3 = this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer;
            int i4 = this.read / i3;
            if (i4 > 0) {
                long j3 = this.AudioAttributesCompatParcelizer;
                long jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, 1000000L, this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver);
                int i5 = i4 * i3;
                int i6 = this.read - i5;
                this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(j3 + jAudioAttributesCompatParcelizer, 1, i5, i6, null);
                this.IconCompatParcelizer += (long) i4;
                this.read = i6;
            }
            return j2 <= 0;
        }
    }

    static final class IconCompatParcelizer implements write {
        private final AsPropertyTypeDeserializer AudioAttributesCompatParcelizer;
        private final int AudioAttributesImplApi21Parcelizer;
        private long AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private final C0170format IconCompatParcelizer;
        private final byte[] MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private long MediaBrowserCompatSearchResultReceiver;
        private final nonNullString MediaDescriptionCompat;
        private final unlinkLast MediaMetadataCompat;
        private final int RatingCompat;
        private final findRawSuperTypes read;
        private static final int[] write = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] RemoteActionCompatParcelizer = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        private static int AudioAttributesCompatParcelizer(int i, int i2) {
            return (i << 1) * i2;
        }

        public IconCompatParcelizer(findRawSuperTypes findrawsupertypes, nonNullString nonnullstring, unlinkLast unlinklast) throws SchemaAware {
            this.read = findrawsupertypes;
            this.MediaDescriptionCompat = nonnullstring;
            this.MediaMetadataCompat = unlinklast;
            int iMax = Math.max(1, unlinklast.MediaBrowserCompatItemReceiver / 10);
            this.RatingCompat = iMax;
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(unlinklast.AudioAttributesCompatParcelizer);
            asPropertyTypeDeserializer.onCustomAction();
            int iOnCustomAction = asPropertyTypeDeserializer.onCustomAction();
            this.AudioAttributesImplApi21Parcelizer = iOnCustomAction;
            int i = unlinklast.MediaBrowserCompatCustomActionResultReceiver;
            int i2 = (((unlinklast.RemoteActionCompatParcelizer - (i << 2)) << 3) / (unlinklast.write * i)) + 1;
            if (iOnCustomAction != i2) {
                StringBuilder sb = new StringBuilder("Expected frames per block: ");
                sb.append(i2);
                sb.append("; got: ");
                sb.append(iOnCustomAction);
                throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
            }
            int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(iMax, iOnCustomAction);
            this.MediaBrowserCompatCustomActionResultReceiver = new byte[unlinklast.RemoteActionCompatParcelizer * iRemoteActionCompatParcelizer];
            this.AudioAttributesCompatParcelizer = new AsPropertyTypeDeserializer(iRemoteActionCompatParcelizer * AudioAttributesCompatParcelizer(iOnCustomAction, i));
            int i3 = ((unlinklast.MediaBrowserCompatItemReceiver * unlinklast.RemoteActionCompatParcelizer) << 3) / iOnCustomAction;
            this.IconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_RAW).write(i3).MediaDescriptionCompat(i3).AudioAttributesImplApi26Parcelizer(AudioAttributesCompatParcelizer(iMax, i)).read(unlinklast.MediaBrowserCompatCustomActionResultReceiver).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(unlinklast.MediaBrowserCompatItemReceiver).RatingCompat(2).IconCompatParcelizer();
        }

        @Override // o.unlink.write
        public final void AudioAttributesCompatParcelizer(long j) {
            this.MediaBrowserCompatItemReceiver = 0;
            this.MediaBrowserCompatSearchResultReceiver = j;
            this.AudioAttributesImplBaseParcelizer = 0;
            this.AudioAttributesImplApi26Parcelizer = 0L;
        }

        @Override // o.unlink.write
        public final void read(int i, long j) {
            this.read.read(new LinkedDeque2(this.MediaMetadataCompat, this.AudioAttributesImplApi21Parcelizer, i, j));
            this.MediaDescriptionCompat.write(this.IconCompatParcelizer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x001c, code lost:
        
            r1 = true;
         */
        @Override // o.unlink.write
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean write(kotlin.closeOnFailAndThrowAsIOE r6, long r7) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.RatingCompat
                int r1 = r5.AudioAttributesImplBaseParcelizer
                int r1 = r5.RemoteActionCompatParcelizer(r1)
                int r0 = r0 - r1
                int r1 = r5.AudioAttributesImplApi21Parcelizer
                int r0 = kotlin.LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(r0, r1)
                o.unlinkLast r1 = r5.MediaMetadataCompat
                int r1 = r1.RemoteActionCompatParcelizer
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 != 0) goto L1b
                goto L3b
            L1b:
                r1 = 0
            L1c:
                if (r1 != 0) goto L3d
                int r2 = r5.MediaBrowserCompatItemReceiver
                if (r2 >= r0) goto L3d
                int r2 = r0 - r2
                long r2 = (long) r2
                long r2 = java.lang.Math.min(r2, r7)
                int r2 = (int) r2
                byte[] r3 = r5.MediaBrowserCompatCustomActionResultReceiver
                int r4 = r5.MediaBrowserCompatItemReceiver
                int r2 = r6.AudioAttributesCompatParcelizer(r3, r4, r2)
                r3 = -1
                if (r2 == r3) goto L3b
                int r3 = r5.MediaBrowserCompatItemReceiver
                int r3 = r3 + r2
                r5.MediaBrowserCompatItemReceiver = r3
                goto L1c
            L3b:
                r1 = 1
                goto L1c
            L3d:
                int r6 = r5.MediaBrowserCompatItemReceiver
                o.unlinkLast r7 = r5.MediaMetadataCompat
                int r7 = r7.RemoteActionCompatParcelizer
                int r6 = r6 / r7
                if (r6 <= 0) goto L74
                byte[] r7 = r5.MediaBrowserCompatCustomActionResultReceiver
                o.AsPropertyTypeDeserializer r8 = r5.AudioAttributesCompatParcelizer
                r5.read(r7, r6, r8)
                int r7 = r5.MediaBrowserCompatItemReceiver
                o.unlinkLast r8 = r5.MediaMetadataCompat
                int r8 = r8.RemoteActionCompatParcelizer
                int r6 = r6 * r8
                int r7 = r7 - r6
                r5.MediaBrowserCompatItemReceiver = r7
                o.AsPropertyTypeDeserializer r6 = r5.AudioAttributesCompatParcelizer
                int r6 = r6.read()
                o.nonNullString r7 = r5.MediaDescriptionCompat
                o.AsPropertyTypeDeserializer r8 = r5.AudioAttributesCompatParcelizer
                r7.RemoteActionCompatParcelizer(r8, r6)
                int r7 = r5.AudioAttributesImplBaseParcelizer
                int r7 = r7 + r6
                r5.AudioAttributesImplBaseParcelizer = r7
                int r6 = r5.RemoteActionCompatParcelizer(r7)
                int r7 = r5.RatingCompat
                if (r6 < r7) goto L74
                r5.AudioAttributesCompatParcelizer(r7)
            L74:
                if (r1 == 0) goto L81
                int r6 = r5.AudioAttributesImplBaseParcelizer
                int r6 = r5.RemoteActionCompatParcelizer(r6)
                if (r6 <= 0) goto L81
                r5.AudioAttributesCompatParcelizer(r6)
            L81:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.unlink.IconCompatParcelizer.write(o.closeOnFailAndThrowAsIOE, long):boolean");
        }

        private void AudioAttributesCompatParcelizer(int i) {
            long j = this.MediaBrowserCompatSearchResultReceiver;
            long jAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, 1000000L, this.MediaMetadataCompat.MediaBrowserCompatItemReceiver);
            int iIconCompatParcelizer = IconCompatParcelizer(i);
            this.MediaDescriptionCompat.IconCompatParcelizer(j + jAudioAttributesCompatParcelizer, 1, iIconCompatParcelizer, this.AudioAttributesImplBaseParcelizer - iIconCompatParcelizer, null);
            this.AudioAttributesImplApi26Parcelizer += (long) i;
            this.AudioAttributesImplBaseParcelizer -= iIconCompatParcelizer;
        }

        private void read(byte[] bArr, int i, AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver; i3++) {
                    AudioAttributesCompatParcelizer(bArr, i2, i3, asPropertyTypeDeserializer.RemoteActionCompatParcelizer());
                }
            }
            int iIconCompatParcelizer = IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer * i);
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
            asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
        }

        private void AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2, byte[] bArr2) {
            int i3 = this.MediaMetadataCompat.RemoteActionCompatParcelizer;
            int i4 = this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver;
            int i5 = (i * i3) + (i2 << 2);
            int i6 = i3 / i4;
            int iWrite = (short) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            int iMin = Math.min(bArr[i5 + 2] & 255, 88);
            int i7 = RemoteActionCompatParcelizer[iMin];
            int i8 = (((i * this.AudioAttributesImplApi21Parcelizer) * i4) + i2) << 1;
            bArr2[i8] = (byte) iWrite;
            bArr2[i8 + 1] = (byte) (iWrite >> 8);
            for (int i9 = 0; i9 < ((i6 - 4) << 1); i9++) {
                byte b = bArr[(((i9 / 8) * i4) << 2) + (i4 << 2) + i5 + ((i9 / 2) % 4)];
                int i10 = i9 % 2 == 0 ? b & 15 : (b & 255) >> 4;
                int i11 = ((((i10 & 7) << 1) + 1) * i7) >> 3;
                if ((i10 & 8) != 0) {
                    i11 = -i11;
                }
                iWrite = LaissezFaireSubTypeValidator.write(iWrite + i11, -32768, 32767);
                i8 += i4 << 1;
                bArr2[i8] = (byte) iWrite;
                bArr2[i8 + 1] = (byte) (iWrite >> 8);
                int i12 = write[i10];
                int[] iArr = RemoteActionCompatParcelizer;
                iMin = LaissezFaireSubTypeValidator.write(iMin + i12, 0, iArr.length - 1);
                i7 = iArr[iMin];
            }
        }

        private int RemoteActionCompatParcelizer(int i) {
            return i / (this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver << 1);
        }

        private int IconCompatParcelizer(int i) {
            return AudioAttributesCompatParcelizer(i, this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver);
        }
    }
}
