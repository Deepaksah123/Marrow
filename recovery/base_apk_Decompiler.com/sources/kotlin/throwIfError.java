package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.avi.AviExtractor;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.C0170format;
import kotlin.isCollectionMapOrArray;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class throwIfError implements findConstructor {
    private final write AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private throwIfIOE[] IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private findRawSuperTypes MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private long MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final AsPropertyTypeDeserializer RatingCompat;
    private throwIfIOE RemoteActionCompatParcelizer;
    private final withTimeZone.IconCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private throwRootCauseIfIOE read;
    private long write;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    @Deprecated
    public throwIfError() {
        this(1, withTimeZone.IconCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    public throwIfError(int i, withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        this.handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer;
        byte b = 0;
        this.MediaBrowserCompatMediaItem = (i & 1) == 0;
        this.RatingCompat = new AsPropertyTypeDeserializer(12);
        this.AudioAttributesCompatParcelizer = new write(b);
        this.MediaBrowserCompatItemReceiver = new isJDKClass();
        this.IconCompatParcelizer = new throwIfIOE[0];
        this.AudioAttributesImplApi21Parcelizer = -1L;
        this.MediaBrowserCompatCustomActionResultReceiver = -1L;
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.write = C.TIME_UNSET;
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.MediaMetadataCompat = 0;
        if (this.MediaBrowserCompatMediaItem) {
            findrawsupertypes = new _appendNativeIds(findrawsupertypes, this.handleMediaPlayPauseIfPendingOnHandler);
        }
        this.MediaBrowserCompatItemReceiver = findrawsupertypes;
        this.MediaDescriptionCompat = -1L;
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.RatingCompat.RemoteActionCompatParcelizer(), 0, 12);
        this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver(0);
        if (this.RatingCompat.MediaMetadataCompat() != 1179011410) {
            return false;
        }
        this.RatingCompat.AudioAttributesImplBaseParcelizer(4);
        return this.RatingCompat.MediaMetadataCompat() == 541677121;
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        if (read(closeonfailandthrowasioe, isjacksonstdimpl)) {
            return 1;
        }
        switch (this.MediaMetadataCompat) {
            case 0:
                if (read(closeonfailandthrowasioe)) {
                    closeonfailandthrowasioe.IconCompatParcelizer(12);
                    this.MediaMetadataCompat = 1;
                    return 0;
                }
                throw SchemaAware.RemoteActionCompatParcelizer("AVI Header List not found", null);
            case 1:
                closeonfailandthrowasioe.IconCompatParcelizer(this.RatingCompat.RemoteActionCompatParcelizer(), 0, 12);
                this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver(0);
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RatingCompat);
                if (this.AudioAttributesCompatParcelizer.read != 1819436136) {
                    StringBuilder sb = new StringBuilder("hdrl expected, found: ");
                    sb.append(this.AudioAttributesCompatParcelizer.read);
                    throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
                }
                this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.write;
                this.MediaMetadataCompat = 2;
                return 0;
            case 2:
                int i = this.AudioAttributesImplApi26Parcelizer - 4;
                AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(i);
                closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, i);
                read(asPropertyTypeDeserializer);
                this.MediaMetadataCompat = 3;
                return 0;
            case 3:
                if (this.AudioAttributesImplApi21Parcelizer != -1) {
                    long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
                    long j = this.AudioAttributesImplApi21Parcelizer;
                    if (jIconCompatParcelizer != j) {
                        this.MediaDescriptionCompat = j;
                        return 0;
                    }
                }
                closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.RatingCompat.RemoteActionCompatParcelizer(), 0, 12);
                closeonfailandthrowasioe.RemoteActionCompatParcelizer();
                this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver(0);
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.RatingCompat);
                int iMediaMetadataCompat = this.RatingCompat.MediaMetadataCompat();
                if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer == 1179011410) {
                    closeonfailandthrowasioe.IconCompatParcelizer(12);
                    return 0;
                }
                if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer != 1414744396 || iMediaMetadataCompat != 1769369453) {
                    this.MediaDescriptionCompat = closeonfailandthrowasioe.IconCompatParcelizer() + ((long) this.AudioAttributesCompatParcelizer.write) + 8;
                    return 0;
                }
                long jIconCompatParcelizer2 = closeonfailandthrowasioe.IconCompatParcelizer();
                this.AudioAttributesImplApi21Parcelizer = jIconCompatParcelizer2;
                this.MediaBrowserCompatCustomActionResultReceiver = jIconCompatParcelizer2 + ((long) this.AudioAttributesCompatParcelizer.write) + 8;
                if (!this.MediaBrowserCompatSearchResultReceiver) {
                    if (((throwRootCauseIfIOE) buildTypeSerializer.IconCompatParcelizer(this.read)).AudioAttributesCompatParcelizer()) {
                        this.MediaMetadataCompat = 4;
                        this.MediaDescriptionCompat = this.MediaBrowserCompatCustomActionResultReceiver;
                        return 0;
                    }
                    this.MediaBrowserCompatItemReceiver.read(new isCollectionMapOrArray.write(this.write));
                    this.MediaBrowserCompatSearchResultReceiver = true;
                }
                this.MediaDescriptionCompat = closeonfailandthrowasioe.IconCompatParcelizer() + 12;
                this.MediaMetadataCompat = 6;
                return 0;
            case 4:
                closeonfailandthrowasioe.IconCompatParcelizer(this.RatingCompat.RemoteActionCompatParcelizer(), 0, 8);
                this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver(0);
                int iMediaMetadataCompat2 = this.RatingCompat.MediaMetadataCompat();
                int iMediaMetadataCompat3 = this.RatingCompat.MediaMetadataCompat();
                if (iMediaMetadataCompat2 == 829973609) {
                    this.MediaMetadataCompat = 5;
                    this.AudioAttributesImplBaseParcelizer = iMediaMetadataCompat3;
                } else {
                    this.MediaDescriptionCompat = closeonfailandthrowasioe.IconCompatParcelizer() + ((long) iMediaMetadataCompat3);
                }
                return 0;
            case 5:
                AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = new AsPropertyTypeDeserializer(this.AudioAttributesImplBaseParcelizer);
                closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer2.RemoteActionCompatParcelizer(), 0, this.AudioAttributesImplBaseParcelizer);
                RemoteActionCompatParcelizer(asPropertyTypeDeserializer2);
                this.MediaMetadataCompat = 6;
                this.MediaDescriptionCompat = this.AudioAttributesImplApi21Parcelizer;
                return 0;
            case 6:
                return IconCompatParcelizer(closeonfailandthrowasioe);
            default:
                throw new AssertionError();
        }
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.MediaDescriptionCompat = -1L;
        this.RemoteActionCompatParcelizer = null;
        for (throwIfIOE throwifioe : this.IconCompatParcelizer) {
            throwifioe.RemoteActionCompatParcelizer(j);
        }
        if (j == 0) {
            if (this.IconCompatParcelizer.length == 0) {
                this.MediaMetadataCompat = 0;
                return;
            } else {
                this.MediaMetadataCompat = 3;
                return;
            }
        }
        this.MediaMetadataCompat = 6;
    }

    private boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        boolean z;
        if (this.MediaDescriptionCompat != -1) {
            long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
            long j = this.MediaDescriptionCompat;
            if (j < jIconCompatParcelizer || j > 262144 + jIconCompatParcelizer) {
                isjacksonstdimpl.AudioAttributesCompatParcelizer = j;
                z = true;
            } else {
                closeonfailandthrowasioe.IconCompatParcelizer((int) (j - jIconCompatParcelizer));
                z = false;
            }
        } else {
            z = false;
        }
        this.MediaDescriptionCompat = -1L;
        return z;
    }

    private void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws IOException {
        getConstructor getconstructorAudioAttributesCompatParcelizer = getConstructor.AudioAttributesCompatParcelizer(AviExtractor.FOURCC_hdrl, asPropertyTypeDeserializer);
        if (getconstructorAudioAttributesCompatParcelizer.read() != 1819436136) {
            StringBuilder sb = new StringBuilder("Unexpected header list type ");
            sb.append(getconstructorAudioAttributesCompatParcelizer.read());
            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
        }
        throwRootCauseIfIOE throwrootcauseifioe = (throwRootCauseIfIOE) getconstructorAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(throwRootCauseIfIOE.class);
        if (throwrootcauseifioe == null) {
            throw SchemaAware.RemoteActionCompatParcelizer("AviHeader not found", null);
        }
        this.read = throwrootcauseifioe;
        this.write = ((long) throwrootcauseifioe.IconCompatParcelizer) * ((long) throwrootcauseifioe.RemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        getCurrentSampleFlags<unwrapAndThrowAsIAE> it = getconstructorAudioAttributesCompatParcelizer.IconCompatParcelizer.iterator();
        int i = 0;
        while (it.hasNext()) {
            unwrapAndThrowAsIAE next = it.next();
            if (next.read() == 1819440243) {
                throwIfIOE throwifioeRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((getConstructor) next, i);
                if (throwifioeRemoteActionCompatParcelizer != null) {
                    arrayList.add(throwifioeRemoteActionCompatParcelizer);
                }
                i++;
            }
        }
        this.IconCompatParcelizer = (throwIfIOE[]) arrayList.toArray(new throwIfIOE[0]);
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    private void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        long jWrite = write(asPropertyTypeDeserializer);
        while (asPropertyTypeDeserializer.IconCompatParcelizer() >= 16) {
            int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
            int iMediaMetadataCompat2 = asPropertyTypeDeserializer.MediaMetadataCompat();
            long jMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
            asPropertyTypeDeserializer.MediaMetadataCompat();
            throwIfIOE throwifioe = read(iMediaMetadataCompat);
            if (throwifioe != null) {
                if ((iMediaMetadataCompat2 & 16) == 16) {
                    throwifioe.AudioAttributesCompatParcelizer(jMediaMetadataCompat + jWrite);
                }
                throwifioe.write();
            }
        }
        for (throwIfIOE throwifioe2 : this.IconCompatParcelizer) {
            throwifioe2.RemoteActionCompatParcelizer();
        }
        this.MediaBrowserCompatSearchResultReceiver = true;
        this.MediaBrowserCompatItemReceiver.read(new IconCompatParcelizer(this.write));
    }

    private long write(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() < 16) {
            return 0L;
        }
        int iWrite = asPropertyTypeDeserializer.write();
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(8);
        long jMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
        long j = this.AudioAttributesImplApi21Parcelizer;
        long j2 = jMediaMetadataCompat <= j ? j + 8 : 0L;
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        return j2;
    }

    private throwIfIOE read(int i) {
        for (throwIfIOE throwifioe : this.IconCompatParcelizer) {
            if (throwifioe.IconCompatParcelizer(i)) {
                return throwifioe;
            }
        }
        return null;
    }

    private int IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (closeonfailandthrowasioe.IconCompatParcelizer() >= this.MediaBrowserCompatCustomActionResultReceiver) {
            return -1;
        }
        throwIfIOE throwifioe = this.RemoteActionCompatParcelizer;
        if (throwifioe != null) {
            if (throwifioe.write(closeonfailandthrowasioe)) {
                this.RemoteActionCompatParcelizer = null;
            }
        } else {
            write(closeonfailandthrowasioe);
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.RatingCompat.RemoteActionCompatParcelizer(), 0, 12);
            this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver(0);
            int iMediaMetadataCompat = this.RatingCompat.MediaMetadataCompat();
            if (iMediaMetadataCompat == 1414744396) {
                this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver(8);
                closeonfailandthrowasioe.IconCompatParcelizer(this.RatingCompat.MediaMetadataCompat() != 1769369453 ? 8 : 12);
                closeonfailandthrowasioe.RemoteActionCompatParcelizer();
                return 0;
            }
            int iMediaMetadataCompat2 = this.RatingCompat.MediaMetadataCompat();
            if (iMediaMetadataCompat == 1263424842) {
                this.MediaDescriptionCompat = closeonfailandthrowasioe.IconCompatParcelizer() + ((long) iMediaMetadataCompat2) + 8;
                return 0;
            }
            closeonfailandthrowasioe.IconCompatParcelizer(8);
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            throwIfIOE throwifioe2 = read(iMediaMetadataCompat);
            if (throwifioe2 == null) {
                this.MediaDescriptionCompat = closeonfailandthrowasioe.IconCompatParcelizer() + ((long) iMediaMetadataCompat2);
                return 0;
            }
            throwifioe2.AudioAttributesCompatParcelizer(iMediaMetadataCompat2);
            this.RemoteActionCompatParcelizer = throwifioe2;
        }
        return 0;
    }

    private throwIfIOE RemoteActionCompatParcelizer(getConstructor getconstructor, int i) {
        throwIfRTE throwifrte = (throwIfRTE) getconstructor.RemoteActionCompatParcelizer(throwIfRTE.class);
        wrapperType wrappertype = (wrapperType) getconstructor.RemoteActionCompatParcelizer(wrapperType.class);
        if (throwifrte == null) {
            prune.RemoteActionCompatParcelizer("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (wrappertype == null) {
            prune.RemoteActionCompatParcelizer("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jWrite = throwifrte.write();
        C0170format c0170format = wrappertype.RemoteActionCompatParcelizer;
        C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = c0170format.write();
        remoteActionCompatParcelizerWrite.AudioAttributesImplBaseParcelizer(i);
        int i2 = throwifrte.MediaBrowserCompatItemReceiver;
        if (i2 != 0) {
            remoteActionCompatParcelizerWrite.AudioAttributesImplApi26Parcelizer(i2);
        }
        getDeclaredAnnotations getdeclaredannotations = (getDeclaredAnnotations) getconstructor.RemoteActionCompatParcelizer(getDeclaredAnnotations.class);
        if (getdeclaredannotations != null) {
            remoteActionCompatParcelizerWrite.write(getdeclaredannotations.IconCompatParcelizer);
        }
        int iIconCompatParcelizer = DefaultBaseTypeLimitingValidator.IconCompatParcelizer(c0170format.onPlayFromUri);
        if (iIconCompatParcelizer != 1 && iIconCompatParcelizer != 2) {
            return null;
        }
        nonNullString nonnullstringIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(i, iIconCompatParcelizer);
        nonnullstringIconCompatParcelizer.write(remoteActionCompatParcelizerWrite.IconCompatParcelizer());
        throwIfIOE throwifioe = new throwIfIOE(i, iIconCompatParcelizer, jWrite, throwifrte.RemoteActionCompatParcelizer, nonnullstringIconCompatParcelizer);
        this.write = jWrite;
        return throwifioe;
    }

    private static void write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if ((closeonfailandthrowasioe.IconCompatParcelizer() & 1) == 1) {
            closeonfailandthrowasioe.IconCompatParcelizer(1);
        }
    }

    class IconCompatParcelizer implements isCollectionMapOrArray {
        private final long read;

        @Override // kotlin.isCollectionMapOrArray
        public final boolean IconCompatParcelizer() {
            return true;
        }

        public IconCompatParcelizer(long j) {
            this.read = j;
        }

        @Override // kotlin.isCollectionMapOrArray
        public final long read() {
            return this.read;
        }

        @Override // kotlin.isCollectionMapOrArray
        public final isCollectionMapOrArray.read write(long j) {
            isCollectionMapOrArray.read readVar = throwIfError.this.IconCompatParcelizer[0].read(j);
            for (int i = 1; i < throwIfError.this.IconCompatParcelizer.length; i++) {
                isCollectionMapOrArray.read readVar2 = throwIfError.this.IconCompatParcelizer[i].read(j);
                if (readVar2.AudioAttributesCompatParcelizer.write < readVar.AudioAttributesCompatParcelizer.write) {
                    readVar = readVar2;
                }
            }
            return readVar;
        }
    }

    static class write {
        public int RemoteActionCompatParcelizer;
        public int read;
        public int write;

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        public final void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
            RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
            if (this.RemoteActionCompatParcelizer != 1414744396) {
                StringBuilder sb = new StringBuilder("LIST expected, found: ");
                sb.append(this.RemoteActionCompatParcelizer);
                throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
            }
            this.read = asPropertyTypeDeserializer.MediaMetadataCompat();
        }

        public final void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
            this.RemoteActionCompatParcelizer = asPropertyTypeDeserializer.MediaMetadataCompat();
            this.write = asPropertyTypeDeserializer.MediaMetadataCompat();
            this.read = 0;
        }
    }
}
