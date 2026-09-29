package kotlin;

import java.io.IOException;
import kotlin.findFirstAnnotatedEnumValue;
import kotlin.getEnclosingClass;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public final class enumTypeFor implements findConstructor {
    private final AsPropertyTypeDeserializer AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private getGenericSuperclass AudioAttributesImplApi26Parcelizer;
    private androidx.media3.common.Metadata AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private nonNullString MediaBrowserCompatSearchResultReceiver;
    private final findFirstAnnotatedEnumValue.write MediaDescriptionCompat;
    private final byte[] RatingCompat;
    private ClassUtilEnumTypeLocator RemoteActionCompatParcelizer;
    private long read;
    private findRawSuperTypes write;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.CompactStringObjectMap
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return enumTypeFor.IconCompatParcelizer();
            }
        };
    }

    static /* synthetic */ findConstructor[] IconCompatParcelizer() {
        return new findConstructor[]{new enumTypeFor()};
    }

    public enumTypeFor() {
        this(0);
    }

    public enumTypeFor(int i) {
        this.RatingCompat = new byte[42];
        this.AudioAttributesCompatParcelizer = new AsPropertyTypeDeserializer(new byte[32768], 0);
        this.MediaBrowserCompatItemReceiver = (i & 1) != 0;
        this.MediaDescriptionCompat = new findFirstAnnotatedEnumValue.write();
        this.MediaBrowserCompatMediaItem = 0;
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        getEnclosingClass.RemoteActionCompatParcelizer(closeonfailandthrowasioe, false);
        return getEnclosingClass.RemoteActionCompatParcelizer(closeonfailandthrowasioe);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.write = findrawsupertypes;
        this.MediaBrowserCompatSearchResultReceiver = findrawsupertypes.IconCompatParcelizer(0, 1);
        findrawsupertypes.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        int i = this.MediaBrowserCompatMediaItem;
        if (i == 0) {
            IconCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 1) {
            AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 2) {
            AudioAttributesImplBaseParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 3) {
            RemoteActionCompatParcelizer(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 4) {
            write(closeonfailandthrowasioe);
            return 0;
        }
        if (i == 5) {
            return AudioAttributesCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
        }
        throw new IllegalStateException();
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        if (j == 0) {
            this.MediaBrowserCompatMediaItem = 0;
        } else {
            ClassUtilEnumTypeLocator classUtilEnumTypeLocator = this.RemoteActionCompatParcelizer;
            if (classUtilEnumTypeLocator != null) {
                classUtilEnumTypeLocator.RemoteActionCompatParcelizer(j2);
            }
        }
        this.read = j2 != 0 ? -1L : 0L;
        this.IconCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer.write(0);
    }

    private void IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.AudioAttributesImplBaseParcelizer = getEnclosingClass.write(closeonfailandthrowasioe, !this.MediaBrowserCompatItemReceiver);
        this.MediaBrowserCompatMediaItem = 1;
    }

    private void AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        byte[] bArr = this.RatingCompat;
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr, 0, bArr.length);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatMediaItem = 2;
    }

    private void AudioAttributesImplBaseParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        getEnclosingClass.read(closeonfailandthrowasioe);
        this.MediaBrowserCompatMediaItem = 3;
    }

    private void RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        getEnclosingClass.read readVar = new getEnclosingClass.read(this.AudioAttributesImplApi26Parcelizer);
        boolean zIconCompatParcelizer = false;
        while (!zIconCompatParcelizer) {
            zIconCompatParcelizer = getEnclosingClass.IconCompatParcelizer(closeonfailandthrowasioe, readVar);
            this.AudioAttributesImplApi26Parcelizer = (getGenericSuperclass) LaissezFaireSubTypeValidator.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer);
        }
        this.AudioAttributesImplApi21Parcelizer = Math.max(this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer, 6);
        ((nonNullString) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver)).write(this.AudioAttributesImplApi26Parcelizer.read(this.RatingCompat, this.AudioAttributesImplBaseParcelizer));
        this.MediaBrowserCompatMediaItem = 4;
    }

    private void write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.MediaBrowserCompatCustomActionResultReceiver = getEnclosingClass.write(closeonfailandthrowasioe);
        ((findRawSuperTypes) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).read(IconCompatParcelizer(closeonfailandthrowasioe.IconCompatParcelizer(), closeonfailandthrowasioe.read()));
        this.MediaBrowserCompatMediaItem = 5;
    }

    private int AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        boolean z;
        ClassUtilEnumTypeLocator classUtilEnumTypeLocator = this.RemoteActionCompatParcelizer;
        if (classUtilEnumTypeLocator != null && classUtilEnumTypeLocator.read()) {
            return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
        }
        if (this.read == -1) {
            this.read = findFirstAnnotatedEnumValue.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, this.AudioAttributesImplApi26Parcelizer);
            return 0;
        }
        int i = this.AudioAttributesCompatParcelizer.read();
        if (i < 32768) {
            int iAudioAttributesCompatParcelizer = closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), i, 32768 - i);
            z = iAudioAttributesCompatParcelizer == -1;
            if (!z) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i + iAudioAttributesCompatParcelizer);
            } else if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer() == 0) {
                read();
                return -1;
            }
        } else {
            z = false;
        }
        int iWrite = this.AudioAttributesCompatParcelizer.write();
        int i2 = this.IconCompatParcelizer;
        int i3 = this.AudioAttributesImplApi21Parcelizer;
        if (i2 < i3) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = this.AudioAttributesCompatParcelizer;
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(Math.min(i3 - i2, asPropertyTypeDeserializer.IconCompatParcelizer()));
        }
        long jWrite = write(this.AudioAttributesCompatParcelizer, z);
        int iWrite2 = this.AudioAttributesCompatParcelizer.write() - iWrite;
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, iWrite2);
        this.IconCompatParcelizer += iWrite2;
        if (jWrite != -1) {
            read();
            this.IconCompatParcelizer = 0;
            this.read = jWrite;
        }
        if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer() < 16) {
            int iIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            System.arraycopy(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), this.AudioAttributesCompatParcelizer.write(), this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), 0, iIconCompatParcelizer);
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
        }
        return 0;
    }

    private isCollectionMapOrArray IconCompatParcelizer(long j, long j2) {
        if (this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver != null) {
            return new getClassMethods(this.AudioAttributesImplApi26Parcelizer, j);
        }
        if (j2 != -1 && this.AudioAttributesImplApi26Parcelizer.RatingCompat > 0) {
            ClassUtilEnumTypeLocator classUtilEnumTypeLocator = new ClassUtilEnumTypeLocator(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, j, j2);
            this.RemoteActionCompatParcelizer = classUtilEnumTypeLocator;
            return classUtilEnumTypeLocator.AudioAttributesCompatParcelizer();
        }
        return new isCollectionMapOrArray.write(this.AudioAttributesImplApi26Parcelizer.write());
    }

    private long write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, boolean z) {
        boolean zAudioAttributesCompatParcelizer;
        int iWrite = asPropertyTypeDeserializer.write();
        while (iWrite <= asPropertyTypeDeserializer.read() - 16) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
            if (findFirstAnnotatedEnumValue.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaDescriptionCompat)) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                return this.MediaDescriptionCompat.read;
            }
            iWrite++;
        }
        if (z) {
            while (iWrite <= asPropertyTypeDeserializer.read() - this.AudioAttributesImplApi21Parcelizer) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                try {
                    zAudioAttributesCompatParcelizer = findFirstAnnotatedEnumValue.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.MediaDescriptionCompat);
                } catch (IndexOutOfBoundsException unused) {
                    zAudioAttributesCompatParcelizer = false;
                }
                if (asPropertyTypeDeserializer.write() <= asPropertyTypeDeserializer.read() && zAudioAttributesCompatParcelizer) {
                    asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                    return this.MediaDescriptionCompat.read;
                }
                iWrite++;
            }
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(asPropertyTypeDeserializer.read());
            return -1L;
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        return -1L;
    }

    private void read() {
        ((nonNullString) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver)).IconCompatParcelizer((this.read * 1000000) / ((long) ((getGenericSuperclass) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer)).MediaBrowserCompatCustomActionResultReceiver), 1, this.IconCompatParcelizer, 0, null);
    }
}
