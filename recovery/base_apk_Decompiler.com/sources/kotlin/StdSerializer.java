package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.C0170format;
import kotlin.StdJdkSerializersAtomicIntegerSerializer;

/* JADX INFO: loaded from: classes2.dex */
final class StdSerializer implements StdJdkSerializersAtomicIntegerSerializer, StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer {
    private final StdJdkSerializersAtomicIntegerSerializer[] AudioAttributesImplApi21Parcelizer;
    private _writeAsBinary AudioAttributesImplApi26Parcelizer;
    private UUIDSerializer RemoteActionCompatParcelizer;
    private final _useStatic read;
    private StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer write;
    private final ArrayList<StdJdkSerializersAtomicIntegerSerializer> IconCompatParcelizer = new ArrayList<>();
    private final HashMap<setName, setName> AudioAttributesCompatParcelizer = new HashMap<>();
    private final IdentityHashMap<visitStringFormat, Integer> MediaBrowserCompatCustomActionResultReceiver = new IdentityHashMap<>();
    private StdJdkSerializersAtomicIntegerSerializer[] AudioAttributesImplBaseParcelizer = new StdJdkSerializersAtomicIntegerSerializer[0];

    @Override // o.UUIDSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ void RemoteActionCompatParcelizer(UUIDSerializer uUIDSerializer) {
        AudioAttributesImplApi21Parcelizer();
    }

    public StdSerializer(_useStatic _usestatic, long[] jArr, StdJdkSerializersAtomicIntegerSerializer... stdJdkSerializersAtomicIntegerSerializerArr) {
        this.read = _usestatic;
        this.AudioAttributesImplApi21Parcelizer = stdJdkSerializersAtomicIntegerSerializerArr;
        this.RemoteActionCompatParcelizer = _usestatic.read();
        for (int i = 0; i < stdJdkSerializersAtomicIntegerSerializerArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.AudioAttributesImplApi21Parcelizer[i] = new _appendInt(stdJdkSerializersAtomicIntegerSerializerArr[i], j);
            }
        }
    }

    public final StdJdkSerializersAtomicIntegerSerializer RemoteActionCompatParcelizer(int i) {
        StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer = this.AudioAttributesImplApi21Parcelizer[i];
        return stdJdkSerializersAtomicIntegerSerializer instanceof _appendInt ? ((_appendInt) stdJdkSerializersAtomicIntegerSerializer).AudioAttributesImplApi26Parcelizer() : stdJdkSerializersAtomicIntegerSerializer;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, long j) {
        this.write = audioAttributesCompatParcelizer;
        Collections.addAll(this.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
        for (StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer : this.AudioAttributesImplApi21Parcelizer) {
            stdJdkSerializersAtomicIntegerSerializer.IconCompatParcelizer(this, j);
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void write() throws IOException {
        for (StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer : this.AudioAttributesImplApi21Parcelizer) {
            stdJdkSerializersAtomicIntegerSerializer.write();
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final _writeAsBinary D_() {
        return (_writeAsBinary) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(_verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr, boolean[] zArr, visitStringFormat[] visitstringformatArr, boolean[] zArr2, long j) {
        Integer num;
        int[] iArr = new int[_verifyandresolveplaceholdersArr.length];
        int[] iArr2 = new int[_verifyandresolveplaceholdersArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= _verifyandresolveplaceholdersArr.length) {
                break;
            }
            visitStringFormat visitstringformat = visitstringformatArr[i2];
            num = visitstringformat != null ? this.MediaBrowserCompatCustomActionResultReceiver.get(visitstringformat) : null;
            iArr[i2] = num == null ? -1 : num.intValue();
            _verifyAndResolvePlaceholders _verifyandresolveplaceholders = _verifyandresolveplaceholdersArr[i2];
            if (_verifyandresolveplaceholders != null) {
                setName setnameAudioAttributesImplBaseParcelizer = _verifyandresolveplaceholders.AudioAttributesImplBaseParcelizer();
                iArr2[i2] = Integer.parseInt(setnameAudioAttributesImplBaseParcelizer.read.substring(0, setnameAudioAttributesImplBaseParcelizer.read.indexOf(":")));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.clear();
        int length = _verifyandresolveplaceholdersArr.length;
        visitStringFormat[] visitstringformatArr2 = new visitStringFormat[length];
        visitStringFormat[] visitstringformatArr3 = new visitStringFormat[_verifyandresolveplaceholdersArr.length];
        Object[] objArr = new _verifyAndResolvePlaceholders[_verifyandresolveplaceholdersArr.length];
        ArrayList arrayList = new ArrayList(this.AudioAttributesImplApi21Parcelizer.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.AudioAttributesImplApi21Parcelizer.length) {
            for (int i4 = i; i4 < _verifyandresolveplaceholdersArr.length; i4++) {
                visitstringformatArr3[i4] = iArr[i4] == i3 ? visitstringformatArr[i4] : num;
                if (iArr2[i4] == i3) {
                    _verifyAndResolvePlaceholders _verifyandresolveplaceholders2 = (_verifyAndResolvePlaceholders) buildTypeSerializer.IconCompatParcelizer(_verifyandresolveplaceholdersArr[i4]);
                    objArr[i4] = new RemoteActionCompatParcelizer(_verifyandresolveplaceholders2, (setName) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.get(_verifyandresolveplaceholders2.AudioAttributesImplBaseParcelizer())));
                } else {
                    objArr[i4] = num;
                }
            }
            int i5 = i3;
            ArrayList arrayList2 = arrayList;
            Object[] objArr2 = objArr;
            long j3 = this.AudioAttributesImplApi21Parcelizer[i3].read(objArr, zArr, visitstringformatArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = j3;
            } else if (j3 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < _verifyandresolveplaceholdersArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    visitStringFormat visitstringformat2 = (visitStringFormat) buildTypeSerializer.IconCompatParcelizer(visitstringformatArr3[i6]);
                    visitstringformatArr2[i6] = visitstringformatArr3[i6];
                    this.MediaBrowserCompatCustomActionResultReceiver.put(visitstringformat2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    buildTypeSerializer.write(visitstringformatArr3[i6] == 0);
                }
            }
            if (z) {
                arrayList2.add(this.AudioAttributesImplApi21Parcelizer[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            objArr = objArr2;
            i = 0;
            num = null;
        }
        int i7 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(visitstringformatArr2, i7, visitstringformatArr, i7, length);
        this.AudioAttributesImplBaseParcelizer = (StdJdkSerializersAtomicIntegerSerializer[]) arrayList3.toArray(new StdJdkSerializersAtomicIntegerSerializer[i7]);
        this.RemoteActionCompatParcelizer = this.read.write(arrayList3, parseMehd.RemoteActionCompatParcelizer((List) arrayList3, new parseMvhd() { // from class: o.createSchemaNode
            @Override // kotlin.parseMvhd
            public final Object apply(Object obj) {
                return ((StdJdkSerializersAtomicIntegerSerializer) obj).D_().IconCompatParcelizer();
            }
        }));
        return j2;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final void IconCompatParcelizer(long j, boolean z) {
        for (StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer : this.AudioAttributesImplBaseParcelizer) {
            stdJdkSerializersAtomicIntegerSerializer.IconCompatParcelizer(j, z);
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final void RemoteActionCompatParcelizer(long j) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(j);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean RemoteActionCompatParcelizer(_put _putVar) {
        if (!this.IconCompatParcelizer.isEmpty()) {
            int size = this.IconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                this.IconCompatParcelizer.get(i).RemoteActionCompatParcelizer(_putVar);
            }
            return false;
        }
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(_putVar);
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long E_() {
        long j = -9223372036854775807L;
        for (StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer : this.AudioAttributesImplBaseParcelizer) {
            long jE_ = stdJdkSerializersAtomicIntegerSerializer.E_();
            if (jE_ == C.TIME_UNSET) {
                if (j != C.TIME_UNSET && stdJdkSerializersAtomicIntegerSerializer.write(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == C.TIME_UNSET) {
                for (StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer2 : this.AudioAttributesImplBaseParcelizer) {
                    if (stdJdkSerializersAtomicIntegerSerializer2 == stdJdkSerializersAtomicIntegerSerializer) {
                        break;
                    }
                    if (stdJdkSerializersAtomicIntegerSerializer2.write(jE_) != jE_) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jE_;
            } else if (jE_ != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer, kotlin.UUIDSerializer
    public final long read() {
        return this.RemoteActionCompatParcelizer.read();
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long write(long j) {
        long jWrite = this.AudioAttributesImplBaseParcelizer[0].write(j);
        int i = 1;
        while (true) {
            StdJdkSerializersAtomicIntegerSerializer[] stdJdkSerializersAtomicIntegerSerializerArr = this.AudioAttributesImplBaseParcelizer;
            if (i >= stdJdkSerializersAtomicIntegerSerializerArr.length) {
                return jWrite;
            }
            if (stdJdkSerializersAtomicIntegerSerializerArr[i].write(jWrite) != jWrite) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // kotlin.StdJdkSerializersAtomicIntegerSerializer
    public final long read(long j, createKeySerializer createkeyserializer) {
        StdJdkSerializersAtomicIntegerSerializer[] stdJdkSerializersAtomicIntegerSerializerArr = this.AudioAttributesImplBaseParcelizer;
        return (stdJdkSerializersAtomicIntegerSerializerArr.length > 0 ? stdJdkSerializersAtomicIntegerSerializerArr[0] : this.AudioAttributesImplApi21Parcelizer[0]).read(j, createkeyserializer);
    }

    @Override // o.StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer
    public final void write(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        this.IconCompatParcelizer.remove(stdJdkSerializersAtomicIntegerSerializer);
        if (!this.IconCompatParcelizer.isEmpty()) {
            return;
        }
        int i = 0;
        for (StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer2 : this.AudioAttributesImplApi21Parcelizer) {
            i += stdJdkSerializersAtomicIntegerSerializer2.D_().RemoteActionCompatParcelizer;
        }
        setName[] setnameArr = new setName[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            StdJdkSerializersAtomicIntegerSerializer[] stdJdkSerializersAtomicIntegerSerializerArr = this.AudioAttributesImplApi21Parcelizer;
            if (i2 < stdJdkSerializersAtomicIntegerSerializerArr.length) {
                _writeAsBinary _writeasbinaryD_ = stdJdkSerializersAtomicIntegerSerializerArr[i2].D_();
                int i4 = _writeasbinaryD_.RemoteActionCompatParcelizer;
                int i5 = 0;
                while (i5 < i4) {
                    setName setnameRemoteActionCompatParcelizer = _writeasbinaryD_.RemoteActionCompatParcelizer(i5);
                    C0170format[] c0170formatArr = new C0170format[setnameRemoteActionCompatParcelizer.write];
                    for (int i6 = 0; i6 < setnameRemoteActionCompatParcelizer.write; i6++) {
                        C0170format c0170formatAudioAttributesCompatParcelizer = setnameRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(i6);
                        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = c0170formatAudioAttributesCompatParcelizer.write();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i2);
                        sb.append(":");
                        sb.append(c0170formatAudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler == null ? "" : c0170formatAudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler);
                        c0170formatArr[i6] = remoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer(sb.toString()).IconCompatParcelizer();
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i2);
                    sb2.append(":");
                    sb2.append(setnameRemoteActionCompatParcelizer.read);
                    setName setname = new setName(sb2.toString(), c0170formatArr);
                    this.AudioAttributesCompatParcelizer.put(setname, setnameRemoteActionCompatParcelizer);
                    setnameArr[i3] = setname;
                    i5++;
                    i3++;
                }
                i2++;
            } else {
                this.AudioAttributesImplApi26Parcelizer = new _writeAsBinary(setnameArr);
                ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write)).write(this);
                return;
            }
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        ((StdJdkSerializersAtomicIntegerSerializer.AudioAttributesCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(this.write)).RemoteActionCompatParcelizer(this);
    }

    static final class RemoteActionCompatParcelizer implements _verifyAndResolvePlaceholders {
        private final _verifyAndResolvePlaceholders AudioAttributesCompatParcelizer;
        private final setName RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(_verifyAndResolvePlaceholders _verifyandresolveplaceholders, setName setname) {
            this.AudioAttributesCompatParcelizer = _verifyandresolveplaceholders;
            this.RemoteActionCompatParcelizer = setname;
        }

        @Override // kotlin._referenceType
        public final setName AudioAttributesImplBaseParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin._referenceType
        public final int MediaBrowserCompatCustomActionResultReceiver() {
            return this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        }

        @Override // kotlin._referenceType
        public final C0170format read(int i) {
            return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i));
        }

        @Override // kotlin._referenceType
        public final int IconCompatParcelizer(int i) {
            return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(i);
        }

        @Override // kotlin._referenceType
        public final int RemoteActionCompatParcelizer(C0170format c0170format) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.read(c0170format));
        }

        @Override // kotlin._referenceType
        public final int RemoteActionCompatParcelizer(int i) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final void IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final void RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final C0170format MediaBrowserCompatItemReceiver() {
            return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer());
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final int AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final int read() {
            return this.AudioAttributesCompatParcelizer.read();
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final int write() {
            return this.AudioAttributesCompatParcelizer.write();
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final Object AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final void write(float f) {
            this.AudioAttributesCompatParcelizer.write(f);
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final void RemoteActionCompatParcelizer(long j, long j2, long j3, List<? extends getSelfReferencedType> list, ResolvedRecursiveType[] resolvedRecursiveTypeArr) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(j, j2, j3, list, resolvedRecursiveTypeArr);
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final int AudioAttributesCompatParcelizer(long j, List<? extends getSelfReferencedType> list) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(j, list);
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final boolean AudioAttributesCompatParcelizer(long j, CollectionLikeType collectionLikeType, List<? extends getSelfReferencedType> list) {
            return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(j, collectionLikeType, list);
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final boolean RemoteActionCompatParcelizer(int i, long j) {
            return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, j);
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final boolean write(int i, long j) {
            return this.AudioAttributesCompatParcelizer.write(i, j);
        }

        @Override // kotlin._verifyAndResolvePlaceholders
        public final long AudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.AudioAttributesCompatParcelizer.equals(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(remoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            return ((this.RemoteActionCompatParcelizer.hashCode() + 527) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
        }
    }
}
