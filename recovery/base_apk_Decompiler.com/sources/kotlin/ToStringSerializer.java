package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;
import kotlin.StdKeySerializer;
import kotlin._hasTypeResolver;
import kotlin._resolveSuperClass;
import kotlin.constructCollectionType;

/* JADX INFO: loaded from: classes2.dex */
final class ToStringSerializer implements StdJdkSerializersAtomicIntegerSerializer, constructCollectionType.RemoteActionCompatParcelizer<AudioAttributesCompatParcelizer> {
    final C0170format AudioAttributesCompatParcelizer;
    private final StdKeySerializer.read AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    final boolean AudioAttributesImplBaseParcelizer;
    int IconCompatParcelizer;
    private final SubTypeValidator MediaBrowserCompatCustomActionResultReceiver;
    private final _hasTypeResolver.write MediaBrowserCompatItemReceiver;
    private final _resolveSuperClass MediaBrowserCompatMediaItem;
    private final TypeNameIdResolver MediaMetadataCompat;
    private final _writeAsBinary RatingCompat;
    byte[] RemoteActionCompatParcelizer;
    boolean read;
    private final ArrayList<IconCompatParcelizer> MediaDescriptionCompat = new ArrayList<>();
    final constructCollectionType write = new constructCollectionType("SingleSampleMediaPeriod");

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        return C.TIME_UNSET;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() {
    }

    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    public final /* synthetic */ void read(constructCollectionType.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, boolean z) {
        IconCompatParcelizer((AudioAttributesCompatParcelizer) audioAttributesCompatParcelizer, j, j2);
    }

    public ToStringSerializer(SubTypeValidator subTypeValidator, _hasTypeResolver.write writeVar, TypeNameIdResolver typeNameIdResolver, C0170format c0170format, long j, _resolveSuperClass _resolvesuperclass, StdKeySerializer.read readVar, boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = subTypeValidator;
        this.MediaBrowserCompatItemReceiver = writeVar;
        this.MediaMetadataCompat = typeNameIdResolver;
        this.AudioAttributesCompatParcelizer = c0170format;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.MediaBrowserCompatMediaItem = _resolvesuperclass;
        this.AudioAttributesImplApi21Parcelizer = readVar;
        this.AudioAttributesImplBaseParcelizer = z;
        this.RatingCompat = new _writeAsBinary(new setName(c0170format));
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.write.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        audioAttributesCompatParcelizer.write(this);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        return this.RatingCompat;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr, boolean[] zArr2, long j) {
        byte b = 0;
        for (int i = 0; i < _verifyandresolveplaceholdersArr.length; i++) {
            visitStringFormat visitstringformat = visitstringformatArr[i];
            if (visitstringformat != null && (_verifyandresolveplaceholdersArr[i] == null || !zArr[i])) {
                this.MediaDescriptionCompat.remove(visitstringformat);
                visitstringformatArr[i] = null;
            }
            if (visitstringformatArr[i] == null && _verifyandresolveplaceholdersArr[i] != null) {
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, b);
                this.MediaDescriptionCompat.add(iconCompatParcelizer);
                visitstringformatArr[i] = iconCompatParcelizer;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        if (this.read || this.write.RemoteActionCompatParcelizer() || this.write.IconCompatParcelizer()) {
            return false;
        }
        _hasTypeResolver _hastyperesolverWrite = this.MediaBrowserCompatItemReceiver.write();
        TypeNameIdResolver typeNameIdResolver = this.MediaMetadataCompat;
        if (typeNameIdResolver != null) {
            _hastyperesolverWrite.read(typeNameIdResolver);
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, _hastyperesolverWrite);
        this.AudioAttributesImplApi21Parcelizer.write(new StdDelegatingSerializer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.write.read(audioAttributesCompatParcelizer, this, this.MediaBrowserCompatMediaItem.write(1))), 1, -1, this.AudioAttributesCompatParcelizer, 0, null, 0L, this.AudioAttributesImplApi26Parcelizer);
        return true;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        return (this.read || this.write.RemoteActionCompatParcelizer()) ? Long.MIN_VALUE : 0L;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        return this.read ? Long.MIN_VALUE : 0L;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long write(long j) {
        for (int i = 0; i < this.MediaDescriptionCompat.size(); i++) {
            this.MediaDescriptionCompat.get(i).RemoteActionCompatParcelizer();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    public void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2) {
        this.IconCompatParcelizer = (int) audioAttributesCompatParcelizer.write.write();
        this.RemoteActionCompatParcelizer = (byte[]) buildTypeSerializer.IconCompatParcelizer(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        this.read = true;
        _handleUnknownTypeId _handleunknowntypeid = audioAttributesCompatParcelizer.write;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.read, _handleunknowntypeid.RemoteActionCompatParcelizer(), _handleunknowntypeid.AudioAttributesImplApi26Parcelizer(), j, j2, this.IconCompatParcelizer);
        long j3 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(stdDelegatingSerializer, 1, -1, this.AudioAttributesCompatParcelizer, 0, null, 0L, this.AudioAttributesImplApi26Parcelizer);
    }

    private void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2) {
        _handleUnknownTypeId _handleunknowntypeid = audioAttributesCompatParcelizer.write;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.read, _handleunknowntypeid.RemoteActionCompatParcelizer(), _handleunknowntypeid.AudioAttributesImplApi26Parcelizer(), j, j2, _handleunknowntypeid.write());
        long j3 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(stdDelegatingSerializer, 1, -1, null, 0, null, 0L, this.AudioAttributesImplApi26Parcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructCollectionType.RemoteActionCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public constructCollectionType.write AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j, long j2, IOException iOException, int i) {
        constructCollectionType.write writeVarRemoteActionCompatParcelizer;
        _handleUnknownTypeId _handleunknowntypeid = audioAttributesCompatParcelizer.write;
        StdDelegatingSerializer stdDelegatingSerializer = new StdDelegatingSerializer(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.read, _handleunknowntypeid.RemoteActionCompatParcelizer(), _handleunknowntypeid.AudioAttributesImplApi26Parcelizer(), j, j2, _handleunknowntypeid.write());
        long jWrite = this.MediaBrowserCompatMediaItem.write(new _resolveSuperClass.AudioAttributesCompatParcelizer(stdDelegatingSerializer, new StdArraySerializersShortArraySerializer(1, -1, this.AudioAttributesCompatParcelizer, 0, null, 0L, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer)), iOException, i));
        boolean z = jWrite == C.TIME_UNSET || i >= this.MediaBrowserCompatMediaItem.write(1);
        if (this.AudioAttributesImplBaseParcelizer && z) {
            prune.write("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.read = true;
            writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer;
        } else if (jWrite != C.TIME_UNSET) {
            writeVarRemoteActionCompatParcelizer = constructCollectionType.RemoteActionCompatParcelizer(false, jWrite);
        } else {
            writeVarRemoteActionCompatParcelizer = constructCollectionType.IconCompatParcelizer;
        }
        constructCollectionType.write writeVar = writeVarRemoteActionCompatParcelizer;
        boolean z2 = writeVar.read();
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(stdDelegatingSerializer, 1, -1, this.AudioAttributesCompatParcelizer, 0, null, 0L, this.AudioAttributesImplApi26Parcelizer, iOException, !z2);
        if (!z2) {
            long j3 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        }
        return writeVar;
    }

    final class IconCompatParcelizer implements visitStringFormat {
        private boolean RemoteActionCompatParcelizer;
        private int read;

        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(ToStringSerializer toStringSerializer, byte b) {
            this();
        }

        public final void RemoteActionCompatParcelizer() {
            if (this.read == 2) {
                this.read = 1;
            }
        }

        @Override // kotlin.visitStringFormat
        public final boolean F_() {
            return ToStringSerializer.this.read;
        }

        @Override // kotlin.visitStringFormat
        public final void G_() throws IOException {
            if (ToStringSerializer.this.AudioAttributesImplBaseParcelizer) {
                return;
            }
            ToStringSerializer.this.write.read();
        }

        @Override // kotlin.visitStringFormat
        public final int AudioAttributesCompatParcelizer(ObjectNode objectNode, _find _findVar, int i) {
            write();
            if (ToStringSerializer.this.read && ToStringSerializer.this.RemoteActionCompatParcelizer == null) {
                this.read = 2;
            }
            int i2 = this.read;
            if (i2 == 2) {
                _findVar.IconCompatParcelizer(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                objectNode.write = ToStringSerializer.this.AudioAttributesCompatParcelizer;
                this.read = 1;
                return -5;
            }
            if (!ToStringSerializer.this.read) {
                return -3;
            }
            byte[] bArr = ToStringSerializer.this.RemoteActionCompatParcelizer;
            _findVar.IconCompatParcelizer(1);
            _findVar.RemoteActionCompatParcelizer = 0L;
            if ((i & 4) == 0) {
                _findVar.read(ToStringSerializer.this.IconCompatParcelizer);
                _findVar.read.put(ToStringSerializer.this.RemoteActionCompatParcelizer, 0, ToStringSerializer.this.IconCompatParcelizer);
            }
            if ((i & 1) == 0) {
                this.read = 2;
            }
            return -4;
        }

        @Override // kotlin.visitStringFormat
        public final int IconCompatParcelizer(long j) {
            write();
            if (j <= 0 || this.read == 2) {
                return 0;
            }
            this.read = 2;
            return 1;
        }

        private void write() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            ToStringSerializer.this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(DefaultBaseTypeLimitingValidator.IconCompatParcelizer(ToStringSerializer.this.AudioAttributesCompatParcelizer.onPlayFromUri), ToStringSerializer.this.AudioAttributesCompatParcelizer, 0, null, 0L);
            this.RemoteActionCompatParcelizer = true;
        }
    }

    static final class AudioAttributesCompatParcelizer implements constructCollectionType.AudioAttributesCompatParcelizer {
        public final long AudioAttributesCompatParcelizer = StdDelegatingSerializer.AudioAttributesCompatParcelizer();
        private byte[] RemoteActionCompatParcelizer;
        public final SubTypeValidator read;
        private final _handleUnknownTypeId write;

        @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
        public final void B_() {
        }

        public AudioAttributesCompatParcelizer(SubTypeValidator subTypeValidator, _hasTypeResolver _hastyperesolver) {
            this.read = subTypeValidator;
            this.write = new _handleUnknownTypeId(_hastyperesolver);
        }

        @Override // o.constructCollectionType.AudioAttributesCompatParcelizer
        public final void AudioAttributesCompatParcelizer() throws IOException {
            int iWrite;
            _handleUnknownTypeId _handleunknowntypeid;
            byte[] bArr;
            this.write.MediaBrowserCompatCustomActionResultReceiver();
            try {
                this.write.RemoteActionCompatParcelizer(this.read);
                do {
                    iWrite = (int) this.write.write();
                    byte[] bArr2 = this.RemoteActionCompatParcelizer;
                    if (bArr2 == null) {
                        this.RemoteActionCompatParcelizer = new byte[1024];
                    } else if (iWrite == bArr2.length) {
                        this.RemoteActionCompatParcelizer = Arrays.copyOf(bArr2, bArr2.length << 1);
                    }
                    _handleunknowntypeid = this.write;
                    bArr = this.RemoteActionCompatParcelizer;
                } while (_handleunknowntypeid.AudioAttributesCompatParcelizer(bArr, iWrite, bArr.length - iWrite) != -1);
            } finally {
                StdTypeResolverBuilder1.IconCompatParcelizer(this.write);
            }
        }
    }
}
