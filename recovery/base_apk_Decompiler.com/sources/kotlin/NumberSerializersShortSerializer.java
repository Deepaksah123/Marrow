package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.ObjectArraySerializer;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberSerializersShortSerializer implements StdJdkSerializersAtomicIntegerSerializer, StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer {
    long AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private IconCompatParcelizer[] MediaBrowserCompatCustomActionResultReceiver = new IconCompatParcelizer[0];
    long RemoteActionCompatParcelizer;
    private ObjectArraySerializer.AudioAttributesCompatParcelizer read;
    public final StdJdkSerializersAtomicIntegerSerializer write;

    @Override // o.UUIDSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ void RemoteActionCompatParcelizer(UUIDSerializer uUIDSerializer) {
        MediaBrowserCompatItemReceiver();
    }

    public NumberSerializersShortSerializer(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer, boolean z, long j, long j2) {
        this.write = stdJdkSerializersAtomicIntegerSerializer;
        this.AudioAttributesImplApi21Parcelizer = z ? j : C.TIME_UNSET;
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    public final void RemoteActionCompatParcelizer(long j, long j2) {
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    public final void RemoteActionCompatParcelizer(ObjectArraySerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.read = audioAttributesCompatParcelizer;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        this.write.IconCompatParcelizer(this, j);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() throws IOException {
        ObjectArraySerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.read;
        if (audioAttributesCompatParcelizer != null) {
            throw audioAttributesCompatParcelizer;
        }
        this.write.write();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        return this.write.D_();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long read(kotlin._verifyAndResolvePlaceholders[] r13, boolean[] r14, kotlin.visitStringFormat[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            o.NumberSerializersShortSerializer$IconCompatParcelizer[] r2 = new o.NumberSerializersShortSerializer.IconCompatParcelizer[r2]
            r0.MediaBrowserCompatCustomActionResultReceiver = r2
            int r2 = r1.length
            o.visitStringFormat[] r9 = new kotlin.visitStringFormat[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            o.NumberSerializersShortSerializer$IconCompatParcelizer[] r3 = r0.MediaBrowserCompatCustomActionResultReceiver
            r4 = r1[r2]
            o.NumberSerializersShortSerializer$IconCompatParcelizer r4 = (o.NumberSerializersShortSerializer.IconCompatParcelizer) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            o.visitStringFormat r11 = r4.write
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            o.StdJdkSerializersAtomicIntegerSerializer r2 = r0.write
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.read(r3, r4, r5, r6, r7)
            boolean r4 = r12.MediaBrowserCompatCustomActionResultReceiver()
            if (r4 == 0) goto L43
            long r4 = r0.RemoteActionCompatParcelizer
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = AudioAttributesCompatParcelizer(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.AudioAttributesImplApi21Parcelizer = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L62
            long r4 = r0.RemoteActionCompatParcelizer
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L60
            long r4 = r0.AudioAttributesCompatParcelizer
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L62
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L62
        L60:
            r4 = r10
            goto L63
        L62:
            r4 = 1
        L63:
            kotlin.buildTypeSerializer.write(r4)
        L66:
            int r4 = r1.length
            if (r10 >= r4) goto L92
            r4 = r9[r10]
            if (r4 != 0) goto L72
            o.NumberSerializersShortSerializer$IconCompatParcelizer[] r4 = r0.MediaBrowserCompatCustomActionResultReceiver
            r4[r10] = r11
            goto L89
        L72:
            o.NumberSerializersShortSerializer$IconCompatParcelizer[] r4 = r0.MediaBrowserCompatCustomActionResultReceiver
            r4 = r4[r10]
            if (r4 == 0) goto L7e
            o.visitStringFormat r4 = r4.write
            r5 = r9[r10]
            if (r4 == r5) goto L89
        L7e:
            o.NumberSerializersShortSerializer$IconCompatParcelizer[] r4 = r0.MediaBrowserCompatCustomActionResultReceiver
            o.NumberSerializersShortSerializer$IconCompatParcelizer r5 = new o.NumberSerializersShortSerializer$IconCompatParcelizer
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L89:
            o.NumberSerializersShortSerializer$IconCompatParcelizer[] r4 = r0.MediaBrowserCompatCustomActionResultReceiver
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L66
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberSerializersShortSerializer.read(o._verifyAndResolvePlaceholders[], boolean[], o.visitStringFormat[], boolean[], long):long");
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
        this.write.IconCompatParcelizer(j, z);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        this.write.RemoteActionCompatParcelizer(j);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            long j = this.AudioAttributesImplApi21Parcelizer;
            this.AudioAttributesImplApi21Parcelizer = C.TIME_UNSET;
            long jE_ = E_();
            return jE_ != C.TIME_UNSET ? jE_ : j;
        }
        long jE_2 = this.write.E_();
        if (jE_2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        buildTypeSerializer.write(jE_2 >= this.RemoteActionCompatParcelizer);
        long j2 = this.AudioAttributesCompatParcelizer;
        buildTypeSerializer.write(j2 == Long.MIN_VALUE || jE_2 <= j2);
        return jE_2;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        long j = this.write.read();
        if (j != Long.MIN_VALUE) {
            long j2 = this.AudioAttributesCompatParcelizer;
            if (j2 == Long.MIN_VALUE || j < j2) {
                return j;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long write(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.AudioAttributesImplApi21Parcelizer = r0
            o.NumberSerializersShortSerializer$IconCompatParcelizer[] r0 = r5.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.write()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            o.StdJdkSerializersAtomicIntegerSerializer r0 = r5.write
            long r0 = r0.write(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.RemoteActionCompatParcelizer
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r5 = r5.AudioAttributesCompatParcelizer
            r3 = -9223372036854775808
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L34
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L35
        L34:
            r2 = 1
        L35:
            kotlin.buildTypeSerializer.write(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberSerializersShortSerializer.write(long):long");
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        long j2 = this.RemoteActionCompatParcelizer;
        if (j == j2) {
            return j2;
        }
        return this.write.read(j, AudioAttributesCompatParcelizer(j, createkeyserializer));
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        long jAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
        if (jAudioAttributesCompatParcelizer != Long.MIN_VALUE) {
            long j = this.AudioAttributesCompatParcelizer;
            if (j == Long.MIN_VALUE || jAudioAttributesCompatParcelizer < j) {
                return jAudioAttributesCompatParcelizer;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        return this.write.RemoteActionCompatParcelizer(_putVar);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // o.StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer
    public final void write(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        if (this.read != null) {
            return;
        }
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).write(this);
    }

    private void MediaBrowserCompatItemReceiver() {
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.IconCompatParcelizer)).RemoteActionCompatParcelizer(this);
    }

    final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer != C.TIME_UNSET;
    }

    private createKeySerializer AudioAttributesCompatParcelizer(long j, createKeySerializer createkeyserializer) {
        long j2 = LaissezFaireSubTypeValidator.read(createkeyserializer.read, 0L, j - this.RemoteActionCompatParcelizer);
        long j3 = createkeyserializer.AudioAttributesCompatParcelizer;
        long j4 = this.AudioAttributesCompatParcelizer;
        long j5 = LaissezFaireSubTypeValidator.read(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        return (j2 == createkeyserializer.read && j5 == createkeyserializer.AudioAttributesCompatParcelizer) ? createkeyserializer : new createKeySerializer(j2, j5);
    }

    private static boolean AudioAttributesCompatParcelizer(long j, _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr) {
        if (j != 0) {
            for (_verifyAndResolvePlaceholders _verifyandresolveplaceholders : _verifyandresolveplaceholdersArr) {
                if (_verifyandresolveplaceholders != null) {
                    C0170format c0170formatMediaBrowserCompatItemReceiver = _verifyandresolveplaceholders.MediaBrowserCompatItemReceiver();
                    if (!DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170formatMediaBrowserCompatItemReceiver.onPlayFromUri, c0170formatMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    final class IconCompatParcelizer implements visitStringFormat {
        private boolean AudioAttributesCompatParcelizer;
        public final visitStringFormat write;

        public IconCompatParcelizer(visitStringFormat visitstringformat) {
            this.write = visitstringformat;
        }

        public final void write() {
            this.AudioAttributesCompatParcelizer = false;
        }

        @Override // kotlin.visitStringFormat
        public final boolean F_() {
            return !NumberSerializersShortSerializer.this.MediaBrowserCompatCustomActionResultReceiver() && this.write.F_();
        }

        @Override // kotlin.visitStringFormat
        public final void G_() throws IOException {
            this.write.G_();
        }

        @Override // kotlin.visitStringFormat
        public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
            if (NumberSerializersShortSerializer.this.MediaBrowserCompatCustomActionResultReceiver()) {
                return -3;
            }
            if (this.AudioAttributesCompatParcelizer) {
                _findVar.c_(4);
                return -4;
            }
            long j = NumberSerializersShortSerializer.this.read();
            int iAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(objectNode, _findVar, i);
            if (iAudioAttributesCompatParcelizer == -5) {
                C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(objectNode.write);
                if (c0170format.MediaDescriptionCompat != 0 || c0170format.MediaBrowserCompatSearchResultReceiver != 0) {
                    objectNode.write = c0170format.write().MediaBrowserCompatCustomActionResultReceiver(NumberSerializersShortSerializer.this.RemoteActionCompatParcelizer != 0 ? 0 : c0170format.MediaDescriptionCompat).AudioAttributesImplApi21Parcelizer(NumberSerializersShortSerializer.this.AudioAttributesCompatParcelizer == Long.MIN_VALUE ? c0170format.MediaBrowserCompatSearchResultReceiver : 0).IconCompatParcelizer();
                }
                return -5;
            }
            if (NumberSerializersShortSerializer.this.AudioAttributesCompatParcelizer == Long.MIN_VALUE || ((iAudioAttributesCompatParcelizer != -4 || _findVar.RemoteActionCompatParcelizer < NumberSerializersShortSerializer.this.AudioAttributesCompatParcelizer) && !(iAudioAttributesCompatParcelizer == -3 && j == Long.MIN_VALUE && !_findVar.AudioAttributesImplBaseParcelizer))) {
                return iAudioAttributesCompatParcelizer;
            }
            _findVar.write();
            _findVar.c_(4);
            this.AudioAttributesCompatParcelizer = true;
            return -4;
        }

        @Override // kotlin.visitStringFormat
        public final int IconCompatParcelizer(long j) {
            if (NumberSerializersShortSerializer.this.MediaBrowserCompatCustomActionResultReceiver()) {
                return -3;
            }
            return this.write.IconCompatParcelizer(j);
        }
    }
}
