package kotlin;

import android.util.SparseArray;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlin.C0170format;
import kotlin.CollectionType;
import kotlin.nonNullString;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class IdentityEqualityType implements findRawSuperTypes, CollectionType {
    private final int AudioAttributesImplApi21Parcelizer;
    private C0170format[] AudioAttributesImplApi26Parcelizer;
    private final C0170format AudioAttributesImplBaseParcelizer;
    private final findConstructor MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private CollectionType.write MediaDescriptionCompat;
    private isCollectionMapOrArray RatingCompat;
    private long RemoteActionCompatParcelizer;
    private final SparseArray<read> read = new SparseArray<>();
    public static final write write = new write();
    private static final isJacksonStdImpl AudioAttributesCompatParcelizer = new isJacksonStdImpl();

    public static final class write implements CollectionType.AudioAttributesCompatParcelizer {
        private withTimeZone.IconCompatParcelizer AudioAttributesCompatParcelizer = new _clearFormats();
        private boolean IconCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CollectionType.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public write AudioAttributesCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = (withTimeZone.IconCompatParcelizer) buildTypeSerializer.IconCompatParcelizer(iconCompatParcelizer);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.CollectionType.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public write write(boolean z) {
            this.IconCompatParcelizer = z;
            return this;
        }

        @Override // o.CollectionType.AudioAttributesCompatParcelizer
        public final C0170format IconCompatParcelizer(C0170format c0170format) {
            String string;
            if (!this.IconCompatParcelizer || !this.AudioAttributesCompatParcelizer.write(c0170format)) {
                return c0170format;
            }
            C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = c0170format.write().AudioAttributesImplApi26Parcelizer("application/x-media3-cues").IconCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(c0170format));
            StringBuilder sb = new StringBuilder();
            sb.append(c0170format.onPlayFromUri);
            if (c0170format.RemoteActionCompatParcelizer != null) {
                StringBuilder sb2 = new StringBuilder(" ");
                sb2.append(c0170format.RemoteActionCompatParcelizer);
                string = sb2.toString();
            } else {
                string = "";
            }
            sb.append(string);
            return remoteActionCompatParcelizerIconCompatParcelizer.RemoteActionCompatParcelizer(sb.toString()).write(Long.MAX_VALUE).IconCompatParcelizer();
        }

        @Override // o.CollectionType.AudioAttributesCompatParcelizer
        public final CollectionType RemoteActionCompatParcelizer(int i, C0170format c0170format, boolean z, List<C0170format> list, nonNullString nonnullstring) {
            findConstructor nameTransformerChained;
            String str = c0170format.AudioAttributesImplApi21Parcelizer;
            if (DefaultBaseTypeLimitingValidator.AudioAttributesImplApi26Parcelizer(str)) {
                if (!this.IconCompatParcelizer) {
                    return null;
                }
                nameTransformerChained = new looksLikeISO8601(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(c0170format), c0170format);
            } else {
                if (DefaultBaseTypeLimitingValidator.MediaBrowserCompatCustomActionResultReceiver(str)) {
                    nameTransformerChained = new serializedValueFor(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer ? 1 : 3);
                } else if (Objects.equals(str, MimeTypes.IMAGE_JPEG)) {
                    nameTransformerChained = new _constructUsingEnumNamingStrategy(1);
                } else if (Objects.equals(str, MimeTypes.IMAGE_PNG)) {
                    nameTransformerChained = new StdConverter();
                } else {
                    int i2 = z ? 4 : 0;
                    if (!this.IconCompatParcelizer) {
                        i2 |= 32;
                    }
                    nameTransformerChained = new NameTransformerChained(this.AudioAttributesCompatParcelizer, i2, null, list, nonnullstring);
                }
            }
            if (this.IconCompatParcelizer && !DefaultBaseTypeLimitingValidator.AudioAttributesImplApi26Parcelizer(str) && !(nameTransformerChained.write() instanceof NameTransformerChained) && !(nameTransformerChained.write() instanceof serializedValueFor)) {
                nameTransformerChained = new toPattern(nameTransformerChained, this.AudioAttributesCompatParcelizer);
            }
            return new IdentityEqualityType(nameTransformerChained, i, c0170format);
        }
    }

    public IdentityEqualityType(findConstructor findconstructor, int i, C0170format c0170format) {
        this.MediaBrowserCompatCustomActionResultReceiver = findconstructor;
        this.AudioAttributesImplApi21Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = c0170format;
    }

    @Override // kotlin.CollectionType
    public final _failGetClassMethods IconCompatParcelizer() {
        isCollectionMapOrArray iscollectionmaporarray = this.RatingCompat;
        if (iscollectionmaporarray instanceof _failGetClassMethods) {
            return (_failGetClassMethods) iscollectionmaporarray;
        }
        return null;
    }

    @Override // kotlin.CollectionType
    public final C0170format[] write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.CollectionType
    public final void read(CollectionType.write writeVar, long j, long j2) {
        this.MediaDescriptionCompat = writeVar;
        this.RemoteActionCompatParcelizer = j2;
        if (!this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver.read(this);
            if (j != C.TIME_UNSET) {
                this.MediaBrowserCompatCustomActionResultReceiver.write(0L, j);
            }
            this.MediaBrowserCompatItemReceiver = true;
            return;
        }
        findConstructor findconstructor = this.MediaBrowserCompatCustomActionResultReceiver;
        if (j == C.TIME_UNSET) {
            j = 0;
        }
        findconstructor.write(0L, j);
        for (int i = 0; i < this.read.size(); i++) {
            this.read.valueAt(i).IconCompatParcelizer(writeVar, j2);
        }
    }

    @Override // kotlin.CollectionType
    public final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.CollectionType
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int iRemoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(closeonfailandthrowasioe, AudioAttributesCompatParcelizer);
        buildTypeSerializer.write(iRemoteActionCompatParcelizer != 1);
        return iRemoteActionCompatParcelizer == 0;
    }

    @Override // kotlin.findRawSuperTypes
    public final nonNullString IconCompatParcelizer(int i, int i2) {
        read readVar = this.read.get(i);
        if (readVar != null) {
            return readVar;
        }
        buildTypeSerializer.write(this.AudioAttributesImplApi26Parcelizer == null);
        read readVar2 = new read(i, i2, i2 == this.AudioAttributesImplApi21Parcelizer ? this.AudioAttributesImplBaseParcelizer : null);
        readVar2.IconCompatParcelizer(this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer);
        this.read.put(i, readVar2);
        return readVar2;
    }

    @Override // kotlin.findRawSuperTypes
    public final void RemoteActionCompatParcelizer() {
        C0170format[] c0170formatArr = new C0170format[this.read.size()];
        for (int i = 0; i < this.read.size(); i++) {
            c0170formatArr[i] = (C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.read.valueAt(i).RemoteActionCompatParcelizer);
        }
        this.AudioAttributesImplApi26Parcelizer = c0170formatArr;
    }

    @Override // kotlin.findRawSuperTypes
    public final void read(isCollectionMapOrArray iscollectionmaporarray) {
        this.RatingCompat = iscollectionmaporarray;
    }

    static final class read implements nonNullString {
        private final int AudioAttributesCompatParcelizer;
        private nonNullString AudioAttributesImplApi26Parcelizer;
        private final C0170format IconCompatParcelizer;
        private final int MediaBrowserCompatItemReceiver;
        public C0170format RemoteActionCompatParcelizer;
        private final exceptionMessage read = new exceptionMessage();
        private long write;

        public read(int i, int i2, C0170format c0170format) {
            this.AudioAttributesCompatParcelizer = i;
            this.MediaBrowserCompatItemReceiver = i2;
            this.IconCompatParcelizer = c0170format;
        }

        public final void IconCompatParcelizer(CollectionType.write writeVar, long j) {
            if (writeVar == null) {
                this.AudioAttributesImplApi26Parcelizer = this.read;
                return;
            }
            this.write = j;
            nonNullString nonnullstringRemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            this.AudioAttributesImplApi26Parcelizer = nonnullstringRemoteActionCompatParcelizer;
            C0170format c0170format = this.RemoteActionCompatParcelizer;
            if (c0170format != null) {
                nonnullstringRemoteActionCompatParcelizer.write(c0170format);
            }
        }

        @Override // kotlin.nonNullString
        public final void write(C0170format c0170format) {
            C0170format c0170format2 = this.IconCompatParcelizer;
            if (c0170format2 != null) {
                c0170format = c0170format.read(c0170format2);
            }
            this.RemoteActionCompatParcelizer = c0170format;
            ((nonNullString) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer)).write(this.RemoteActionCompatParcelizer);
        }

        @Override // kotlin.nonNullString
        public final int AudioAttributesCompatParcelizer(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z, int i2) throws IOException {
            return ((nonNullString) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer)).AudioAttributesCompatParcelizer(jsonNullFormatVisitor, i, z);
        }

        @Override // kotlin.nonNullString
        public final void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
            ((nonNullString) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer)).RemoteActionCompatParcelizer(asPropertyTypeDeserializer, i);
        }

        @Override // kotlin.nonNullString
        public final void IconCompatParcelizer(long j, int i, int i2, int i3, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            long j2 = this.write;
            if (j2 != C.TIME_UNSET && j >= j2) {
                this.AudioAttributesImplApi26Parcelizer = this.read;
            }
            ((nonNullString) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer)).IconCompatParcelizer(j, i, i2, i3, audioAttributesCompatParcelizer);
        }
    }
}
