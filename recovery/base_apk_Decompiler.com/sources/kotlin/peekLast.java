package kotlin;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import kotlin.isCollectionMapOrArray;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class peekLast implements findConstructor {
    private boolean AudioAttributesCompatParcelizer;
    private findRawSuperTypes AudioAttributesImplApi21Parcelizer;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi26Parcelizer;
    private linkFirst AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final SparseArray<AudioAttributesCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
    private long MediaBrowserCompatItemReceiver;
    private final MinimalClassNameIdResolver MediaBrowserCompatSearchResultReceiver;
    private boolean RemoteActionCompatParcelizer;
    private final peek read;
    private boolean write;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.peekFirst
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return peekLast.IconCompatParcelizer();
            }
        };
    }

    static /* synthetic */ findConstructor[] IconCompatParcelizer() {
        return new findConstructor[]{new peekLast()};
    }

    public peekLast() {
        this(new MinimalClassNameIdResolver(0L));
    }

    private peekLast(MinimalClassNameIdResolver minimalClassNameIdResolver) {
        this.MediaBrowserCompatSearchResultReceiver = minimalClassNameIdResolver;
        this.AudioAttributesImplApi26Parcelizer = new AsPropertyTypeDeserializer(4096);
        this.MediaBrowserCompatCustomActionResultReceiver = new SparseArray<>();
        this.read = new peek();
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        byte[] bArr = new byte[14];
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        closeonfailandthrowasioe.write(bArr[13] & 7);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.AudioAttributesImplApi21Parcelizer = findrawsupertypes;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // kotlin.findConstructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(long r5, long r7) {
        /*
            r4 = this;
            o.MinimalClassNameIdResolver r5 = r4.MediaBrowserCompatSearchResultReceiver
            long r5 = r5.write()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = r6
        L13:
            if (r5 != 0) goto L2a
            o.MinimalClassNameIdResolver r5 = r4.MediaBrowserCompatSearchResultReceiver
            long r2 = r5.AudioAttributesCompatParcelizer()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r5 == 0) goto L31
        L2c:
            o.MinimalClassNameIdResolver r5 = r4.MediaBrowserCompatSearchResultReceiver
            r5.MediaBrowserCompatCustomActionResultReceiver(r7)
        L31:
            o.linkFirst r5 = r4.AudioAttributesImplBaseParcelizer
            if (r5 == 0) goto L38
            r5.RemoteActionCompatParcelizer(r7)
        L38:
            android.util.SparseArray<o.peekLast$AudioAttributesCompatParcelizer> r5 = r4.MediaBrowserCompatCustomActionResultReceiver
            int r5 = r5.size()
            if (r6 >= r5) goto L4e
            android.util.SparseArray<o.peekLast$AudioAttributesCompatParcelizer> r5 = r4.MediaBrowserCompatCustomActionResultReceiver
            java.lang.Object r5 = r5.valueAt(r6)
            o.peekLast$AudioAttributesCompatParcelizer r5 = (o.peekLast.AudioAttributesCompatParcelizer) r5
            r5.IconCompatParcelizer()
            int r6 = r6 + 1
            goto L38
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.peekLast.write(long, long):void");
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        checkNotEmpty addlast;
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        long j = closeonfailandthrowasioe.read();
        if (j != -1 && !this.read.AudioAttributesCompatParcelizer()) {
            return this.read.IconCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
        }
        write(j);
        linkFirst linkfirst = this.AudioAttributesImplBaseParcelizer;
        if (linkfirst != null && linkfirst.read()) {
            return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        long jWrite = j != -1 ? j - closeonfailandthrowasioe.write() : -1L;
        if ((jWrite != -1 && jWrite < 4) || !closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 4, true)) {
            return -1;
        }
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        int iMediaBrowserCompatItemReceiver = this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
        if (iMediaBrowserCompatItemReceiver == 441) {
            return -1;
        }
        if (iMediaBrowserCompatItemReceiver == 442) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 10);
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(9);
            closeonfailandthrowasioe.IconCompatParcelizer((this.AudioAttributesImplApi26Parcelizer.onPlayFromMediaId() & 7) + 14);
            return 0;
        }
        if (iMediaBrowserCompatItemReceiver == 443) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 2);
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
            closeonfailandthrowasioe.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.onPrepare() + 6);
            return 0;
        }
        if (((iMediaBrowserCompatItemReceiver & (-256)) >> 8) != 1) {
            closeonfailandthrowasioe.IconCompatParcelizer(1);
            return 0;
        }
        int i = iMediaBrowserCompatItemReceiver & 255;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.get(i);
        if (!this.RemoteActionCompatParcelizer) {
            if (audioAttributesCompatParcelizer == null) {
                if (i == 189) {
                    addlast = new ViewMatcher();
                    this.AudioAttributesCompatParcelizer = true;
                    this.MediaBrowserCompatItemReceiver = closeonfailandthrowasioe.IconCompatParcelizer();
                } else if ((iMediaBrowserCompatItemReceiver & 224) == 192) {
                    addlast = new getLast();
                    this.AudioAttributesCompatParcelizer = true;
                    this.MediaBrowserCompatItemReceiver = closeonfailandthrowasioe.IconCompatParcelizer();
                } else if ((iMediaBrowserCompatItemReceiver & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    addlast = new addLast();
                    this.write = true;
                    this.MediaBrowserCompatItemReceiver = closeonfailandthrowasioe.IconCompatParcelizer();
                } else {
                    addlast = null;
                }
                if (addlast != null) {
                    addlast.write(this.AudioAttributesImplApi21Parcelizer, new removeFirstOccurrence.write(i, 256));
                    audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(addlast, this.MediaBrowserCompatSearchResultReceiver);
                    this.MediaBrowserCompatCustomActionResultReceiver.put(i, audioAttributesCompatParcelizer);
                }
            }
            if (closeonfailandthrowasioe.IconCompatParcelizer() > ((this.AudioAttributesCompatParcelizer && this.write) ? this.MediaBrowserCompatItemReceiver + 8192 : 1048576L)) {
                this.RemoteActionCompatParcelizer = true;
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
            }
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 2);
        this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        int iOnPrepare = this.AudioAttributesImplApi26Parcelizer.onPrepare() + 6;
        if (audioAttributesCompatParcelizer == null) {
            closeonfailandthrowasioe.IconCompatParcelizer(iOnPrepare);
        } else {
            this.AudioAttributesImplApi26Parcelizer.write(iOnPrepare);
            closeonfailandthrowasioe.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, iOnPrepare);
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(6);
            audioAttributesCompatParcelizer.write(this.AudioAttributesImplApi26Parcelizer);
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.AudioAttributesImplApi26Parcelizer;
            asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.AudioAttributesCompatParcelizer());
        }
        return 0;
    }

    private void write(long j) {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        if (this.read.RemoteActionCompatParcelizer() != C.TIME_UNSET) {
            linkFirst linkfirst = new linkFirst(this.read.read(), this.read.RemoteActionCompatParcelizer(), j);
            this.AudioAttributesImplBaseParcelizer = linkfirst;
            this.AudioAttributesImplApi21Parcelizer.read(linkfirst.AudioAttributesCompatParcelizer());
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.read(new isCollectionMapOrArray.write(this.read.RemoteActionCompatParcelizer()));
    }

    static final class AudioAttributesCompatParcelizer {
        private final AsExternalTypeSerializer AudioAttributesCompatParcelizer = new AsExternalTypeSerializer(new byte[64]);
        private final MinimalClassNameIdResolver AudioAttributesImplApi26Parcelizer;
        private long AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private int RemoteActionCompatParcelizer;
        private final checkNotEmpty read;
        private boolean write;

        public AudioAttributesCompatParcelizer(checkNotEmpty checknotempty, MinimalClassNameIdResolver minimalClassNameIdResolver) {
            this.read = checknotempty;
            this.AudioAttributesImplApi26Parcelizer = minimalClassNameIdResolver;
        }

        public final void IconCompatParcelizer() {
            this.MediaBrowserCompatCustomActionResultReceiver = false;
            this.read.write();
        }

        public final void write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
            asPropertyTypeDeserializer.write(this.AudioAttributesCompatParcelizer.write, 0, 3);
            this.AudioAttributesCompatParcelizer.read(0);
            read();
            asPropertyTypeDeserializer.write(this.AudioAttributesCompatParcelizer.write, 0, this.RemoteActionCompatParcelizer);
            this.AudioAttributesCompatParcelizer.read(0);
            AudioAttributesCompatParcelizer();
            this.read.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, 4);
            this.read.read(asPropertyTypeDeserializer);
            this.read.write(false);
        }

        private void read() {
            this.AudioAttributesCompatParcelizer.write(8);
            this.IconCompatParcelizer = this.AudioAttributesCompatParcelizer.read();
            this.write = this.AudioAttributesCompatParcelizer.read();
            this.AudioAttributesCompatParcelizer.write(6);
            this.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(8);
        }

        private void AudioAttributesCompatParcelizer() {
            char c;
            this.AudioAttributesImplBaseParcelizer = 0L;
            if (this.IconCompatParcelizer) {
                this.AudioAttributesCompatParcelizer.write(4);
                long jIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(3);
                this.AudioAttributesCompatParcelizer.write(1);
                long jIconCompatParcelizer2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(15) << 15;
                this.AudioAttributesCompatParcelizer.write(1);
                long jIconCompatParcelizer3 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(15);
                this.AudioAttributesCompatParcelizer.write(1);
                if (this.MediaBrowserCompatCustomActionResultReceiver || !this.write) {
                    c = 30;
                } else {
                    this.AudioAttributesCompatParcelizer.write(4);
                    long jIconCompatParcelizer4 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(3);
                    this.AudioAttributesCompatParcelizer.write(1);
                    long jIconCompatParcelizer5 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(15) << 15;
                    this.AudioAttributesCompatParcelizer.write(1);
                    long jIconCompatParcelizer6 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(15);
                    this.AudioAttributesCompatParcelizer.write(1);
                    c = 30;
                    this.AudioAttributesImplApi26Parcelizer.write((jIconCompatParcelizer4 << 30) | jIconCompatParcelizer5 | jIconCompatParcelizer6);
                    this.MediaBrowserCompatCustomActionResultReceiver = true;
                }
                this.AudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi26Parcelizer.write((jIconCompatParcelizer << c) | jIconCompatParcelizer2 | jIconCompatParcelizer3);
            }
        }
    }
}
