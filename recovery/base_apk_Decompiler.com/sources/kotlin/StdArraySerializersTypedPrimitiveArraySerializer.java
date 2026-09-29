package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.PolymorphicTypeValidator;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class StdArraySerializersTypedPrimitiveArraySerializer extends ClassStack {
    private StdJdkSerializers AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer IconCompatParcelizer;
    private final PolymorphicTypeValidator.IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private boolean RemoteActionCompatParcelizer;
    private boolean read;
    private boolean write;

    @Override // kotlin.NumberSerializersIntegerSerializer, kotlin.StdKeySerializers
    public final void maybeThrowSourceInfoRefreshError() {
    }

    public StdArraySerializersTypedPrimitiveArraySerializer(StdKeySerializers stdKeySerializers, boolean z) {
        super(stdKeySerializers);
        this.AudioAttributesImplApi26Parcelizer = z && stdKeySerializers.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = new PolymorphicTypeValidator.IconCompatParcelizer();
        this.IconCompatParcelizer = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
        PolymorphicTypeValidator polymorphicTypeValidator = stdKeySerializers.read();
        if (polymorphicTypeValidator != null) {
            this.AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(polymorphicTypeValidator, (Object) null, (Object) null);
            this.RemoteActionCompatParcelizer = true;
        } else {
            this.AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer.read(stdKeySerializers.getMediaItem());
        }
    }

    public final PolymorphicTypeValidator AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.ClassStack, kotlin.StdKeySerializers
    public final boolean canUpdateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        return this.AudioAttributesCompatParcelizer.canUpdateMediaItem(jsonSerializableSchema);
    }

    @Override // kotlin.ClassStack, kotlin.StdKeySerializers
    public final void updateMediaItem(JsonSerializableSchema jsonSerializableSchema) {
        if (this.RemoteActionCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(new ArrayType(this.AudioAttributesImplBaseParcelizer.write, jsonSerializableSchema));
        } else {
            this.AudioAttributesImplBaseParcelizer = AudioAttributesCompatParcelizer.read(jsonSerializableSchema);
        }
        this.AudioAttributesCompatParcelizer.updateMediaItem(jsonSerializableSchema);
    }

    @Override // kotlin.ClassStack
    public final void write() {
        if (this.AudioAttributesImplApi26Parcelizer) {
            return;
        }
        this.write = true;
        IconCompatParcelizer();
    }

    @Override // kotlin.ClassStack, kotlin.StdKeySerializers
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final StdJdkSerializers createPeriod(StdKeySerializers.write writeVar, _findWellKnownSimple _findwellknownsimple, long j) {
        StdJdkSerializers stdJdkSerializers = new StdJdkSerializers(writeVar, _findwellknownsimple, j);
        stdJdkSerializers.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        if (this.read) {
            stdJdkSerializers.RemoteActionCompatParcelizer(writeVar.RemoteActionCompatParcelizer(write(writeVar.AudioAttributesCompatParcelizer)));
            return stdJdkSerializers;
        }
        this.AudioAttributesImplApi21Parcelizer = stdJdkSerializers;
        if (!this.write) {
            this.write = true;
            IconCompatParcelizer();
        }
        return stdJdkSerializers;
    }

    @Override // kotlin.ClassStack, kotlin.StdKeySerializers
    public final void releasePeriod(StdJdkSerializersAtomicIntegerSerializer stdJdkSerializersAtomicIntegerSerializer) {
        ((StdJdkSerializers) stdJdkSerializersAtomicIntegerSerializer).MediaBrowserCompatItemReceiver();
        if (stdJdkSerializersAtomicIntegerSerializer == this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = null;
        }
    }

    @Override // kotlin.NumberSerializersIntegerSerializer, kotlin.NumberSerializers1
    public final void releaseSourceInternal() {
        this.read = false;
        this.write = false;
        super.releaseSourceInternal();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.ClassStack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void read(kotlin.PolymorphicTypeValidator r15) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StdArraySerializersTypedPrimitiveArraySerializer.read(o.PolymorphicTypeValidator):void");
    }

    @Override // kotlin.ClassStack
    protected final StdKeySerializers.write AudioAttributesCompatParcelizer(StdKeySerializers.write writeVar) {
        return writeVar.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer));
    }

    private Object write(Object obj) {
        return (this.AudioAttributesImplBaseParcelizer.read == null || !obj.equals(AudioAttributesCompatParcelizer.IconCompatParcelizer)) ? obj : this.AudioAttributesImplBaseParcelizer.read;
    }

    private Object AudioAttributesCompatParcelizer(Object obj) {
        return (this.AudioAttributesImplBaseParcelizer.read == null || !this.AudioAttributesImplBaseParcelizer.read.equals(obj)) ? obj : AudioAttributesCompatParcelizer.IconCompatParcelizer;
    }

    private boolean IconCompatParcelizer(long j) {
        StdJdkSerializers stdJdkSerializers = this.AudioAttributesImplApi21Parcelizer;
        int i = this.AudioAttributesImplBaseParcelizer.read(stdJdkSerializers.write.AudioAttributesCompatParcelizer);
        if (i == -1) {
            return false;
        }
        long j2 = this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(i, this.IconCompatParcelizer).read;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        stdJdkSerializers.read(j);
        return true;
    }

    static final class AudioAttributesCompatParcelizer extends StdArraySerializersFloatArraySerializer {
        public static final Object IconCompatParcelizer = new Object();
        private final Object AudioAttributesCompatParcelizer;
        private final Object read;

        public static AudioAttributesCompatParcelizer read(JsonSerializableSchema jsonSerializableSchema) {
            return new AudioAttributesCompatParcelizer(new IconCompatParcelizer(jsonSerializableSchema), PolymorphicTypeValidator.IconCompatParcelizer.read, IconCompatParcelizer);
        }

        public static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, Object obj, Object obj2) {
            return new AudioAttributesCompatParcelizer(polymorphicTypeValidator, obj, obj2);
        }

        private AudioAttributesCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, Object obj, Object obj2) {
            super(polymorphicTypeValidator);
            this.AudioAttributesCompatParcelizer = obj;
            this.read = obj2;
        }

        public final AudioAttributesCompatParcelizer IconCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator) {
            return new AudioAttributesCompatParcelizer(polymorphicTypeValidator, this.AudioAttributesCompatParcelizer, this.read);
        }

        @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
            this.write.write(i, iconCompatParcelizer, j);
            if (LaissezFaireSubTypeValidator.read(iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver, this.AudioAttributesCompatParcelizer)) {
                iconCompatParcelizer.MediaBrowserCompatSearchResultReceiver = PolymorphicTypeValidator.IconCompatParcelizer.read;
            }
            return iconCompatParcelizer;
        }

        @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
            this.write.RemoteActionCompatParcelizer(i, audioAttributesCompatParcelizer, z);
            if (LaissezFaireSubTypeValidator.read(audioAttributesCompatParcelizer.write, this.read) && z) {
                audioAttributesCompatParcelizer.write = IconCompatParcelizer;
            }
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
        public final int read(Object obj) {
            Object obj2;
            PolymorphicTypeValidator polymorphicTypeValidator = this.write;
            if (IconCompatParcelizer.equals(obj) && (obj2 = this.read) != null) {
                obj = obj2;
            }
            return polymorphicTypeValidator.read(obj);
        }

        @Override // kotlin.StdArraySerializersFloatArraySerializer, kotlin.PolymorphicTypeValidator
        public final Object write(int i) {
            Object objWrite = this.write.write(i);
            return LaissezFaireSubTypeValidator.read(objWrite, this.read) ? IconCompatParcelizer : objWrite;
        }
    }

    public static final class IconCompatParcelizer extends PolymorphicTypeValidator {
        private final JsonSerializableSchema AudioAttributesCompatParcelizer;

        @Override // kotlin.PolymorphicTypeValidator
        public final int AudioAttributesCompatParcelizer() {
            return 1;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final int IconCompatParcelizer() {
            return 1;
        }

        public IconCompatParcelizer(JsonSerializableSchema jsonSerializableSchema) {
            this.AudioAttributesCompatParcelizer = jsonSerializableSchema;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.IconCompatParcelizer write(int i, PolymorphicTypeValidator.IconCompatParcelizer iconCompatParcelizer, long j) {
            iconCompatParcelizer.write(PolymorphicTypeValidator.IconCompatParcelizer.read, this.AudioAttributesCompatParcelizer, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0L);
            iconCompatParcelizer.MediaBrowserCompatItemReceiver = true;
            return iconCompatParcelizer;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final PolymorphicTypeValidator.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, PolymorphicTypeValidator.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, boolean z) {
            audioAttributesCompatParcelizer.read(z ? 0 : null, z ? AudioAttributesCompatParcelizer.IconCompatParcelizer : null, 0, C.TIME_UNSET, 0L, expectStringFormat.AudioAttributesCompatParcelizer, true);
            return audioAttributesCompatParcelizer;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final int read(Object obj) {
            return obj == AudioAttributesCompatParcelizer.IconCompatParcelizer ? 0 : -1;
        }

        @Override // kotlin.PolymorphicTypeValidator
        public final Object write(int i) {
            return AudioAttributesCompatParcelizer.IconCompatParcelizer;
        }
    }
}
