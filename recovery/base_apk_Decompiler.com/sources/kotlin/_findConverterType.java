package kotlin;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
abstract class _findConverterType {
    private findRawSuperTypes AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private long IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private StdDateFormat MediaBrowserCompatItemReceiver;
    private int MediaDescriptionCompat;
    private nonNullString MediaMetadataCompat;
    private long RatingCompat;
    private long RemoteActionCompatParcelizer;
    private boolean read;
    private final copyData write = new copyData();
    private write AudioAttributesImplApi21Parcelizer = new write();

    protected abstract long read(AsPropertyTypeDeserializer asPropertyTypeDeserializer);

    protected abstract boolean write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j, write writeVar) throws IOException;

    static class write {
        C0170format AudioAttributesCompatParcelizer;
        StdDateFormat read;

        write() {
        }
    }

    final void read(findRawSuperTypes findrawsupertypes, nonNullString nonnullstring) {
        this.AudioAttributesCompatParcelizer = findrawsupertypes;
        this.MediaMetadataCompat = nonnullstring;
        AudioAttributesCompatParcelizer(true);
    }

    protected void AudioAttributesCompatParcelizer(boolean z) {
        if (z) {
            this.AudioAttributesImplApi21Parcelizer = new write();
            this.AudioAttributesImplApi26Parcelizer = 0L;
            this.MediaDescriptionCompat = 0;
        } else {
            this.MediaDescriptionCompat = 1;
        }
        this.RatingCompat = -1L;
        this.RemoteActionCompatParcelizer = 0L;
    }

    final void IconCompatParcelizer(long j, long j2) {
        this.write.AudioAttributesCompatParcelizer();
        if (j == 0) {
            AudioAttributesCompatParcelizer(!this.MediaBrowserCompatCustomActionResultReceiver);
        } else if (this.MediaDescriptionCompat != 0) {
            this.RatingCompat = read(j2);
            ((StdDateFormat) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver)).write(this.RatingCompat);
            this.MediaDescriptionCompat = 2;
        }
    }

    final int read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        write();
        int i = this.MediaDescriptionCompat;
        if (i == 0) {
            return IconCompatParcelizer(closeonfailandthrowasioe);
        }
        if (i == 1) {
            closeonfailandthrowasioe.IconCompatParcelizer((int) this.AudioAttributesImplApi26Parcelizer);
            this.MediaDescriptionCompat = 2;
            return 0;
        }
        if (i == 2) {
            LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            return RemoteActionCompatParcelizer(closeonfailandthrowasioe, isjacksonstdimpl);
        }
        if (i == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    private void write() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    private boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        while (this.write.IconCompatParcelizer(closeonfailandthrowasioe)) {
            this.IconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer() - this.AudioAttributesImplApi26Parcelizer;
            if (!write(this.write.RemoteActionCompatParcelizer(), this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplApi21Parcelizer)) {
                return true;
            }
            this.AudioAttributesImplApi26Parcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
        }
        this.MediaDescriptionCompat = 3;
        return false;
    }

    private int IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (!write(closeonfailandthrowasioe)) {
            return -1;
        }
        this.AudioAttributesImplBaseParcelizer = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer.onPrepareFromUri;
        if (!this.read) {
            this.MediaMetadataCompat.write(this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer);
            this.read = true;
        }
        byte b = 0;
        if (this.AudioAttributesImplApi21Parcelizer.read != null) {
            this.MediaBrowserCompatItemReceiver = this.AudioAttributesImplApi21Parcelizer.read;
        } else if (closeonfailandthrowasioe.read() == -1) {
            this.MediaBrowserCompatItemReceiver = new read(b);
        } else {
            RootNameLookup rootNameLookup = this.write.read();
            this.MediaBrowserCompatItemReceiver = new PrimitiveArrayBuilder(this, this.AudioAttributesImplApi26Parcelizer, closeonfailandthrowasioe.read(), rootNameLookup.write + rootNameLookup.IconCompatParcelizer, rootNameLookup.RemoteActionCompatParcelizer, (rootNameLookup.AudioAttributesImplApi26Parcelizer & 4) != 0);
        }
        this.MediaDescriptionCompat = 2;
        this.write.write();
        return 0;
    }

    private int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        long jWrite = this.MediaBrowserCompatItemReceiver.write(closeonfailandthrowasioe);
        if (jWrite >= 0) {
            isjacksonstdimpl.AudioAttributesCompatParcelizer = jWrite;
            return 1;
        }
        if (jWrite < -1) {
            IconCompatParcelizer(-(jWrite + 2));
        }
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            this.AudioAttributesCompatParcelizer.read((isCollectionMapOrArray) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.write()));
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }
        if (this.IconCompatParcelizer > 0 || this.write.IconCompatParcelizer(closeonfailandthrowasioe)) {
            this.IconCompatParcelizer = 0L;
            AsPropertyTypeDeserializer asPropertyTypeDeserializerRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
            long j = read(asPropertyTypeDeserializerRemoteActionCompatParcelizer);
            if (j >= 0) {
                long j2 = this.RemoteActionCompatParcelizer;
                if (j2 + j >= this.RatingCompat) {
                    long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(j2);
                    this.MediaMetadataCompat.RemoteActionCompatParcelizer(asPropertyTypeDeserializerRemoteActionCompatParcelizer, asPropertyTypeDeserializerRemoteActionCompatParcelizer.read());
                    this.MediaMetadataCompat.IconCompatParcelizer(jAudioAttributesCompatParcelizer, 1, asPropertyTypeDeserializerRemoteActionCompatParcelizer.read(), 0, null);
                    this.RatingCompat = -1L;
                }
            }
            this.RemoteActionCompatParcelizer += j;
            return 0;
        }
        this.MediaDescriptionCompat = 3;
        return -1;
    }

    protected final long AudioAttributesCompatParcelizer(long j) {
        return (j * 1000000) / ((long) this.AudioAttributesImplBaseParcelizer);
    }

    protected final long read(long j) {
        return (((long) this.AudioAttributesImplBaseParcelizer) * j) / 1000000;
    }

    protected void IconCompatParcelizer(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    static final class read implements StdDateFormat {
        @Override // kotlin.StdDateFormat
        public final long write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) {
            return -1L;
        }

        @Override // kotlin.StdDateFormat
        public final void write(long j) {
        }

        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // kotlin.StdDateFormat
        public final isCollectionMapOrArray write() {
            return new isCollectionMapOrArray.write(C.TIME_UNSET);
        }
    }
}
