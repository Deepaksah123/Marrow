package kotlin;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
final class PrimitiveArrayBuilder implements StdDateFormat {
    private long AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private final _findConverterType AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatMediaItem;
    private long MediaMetadataCompat;
    private final RootNameLookup RemoteActionCompatParcelizer;
    private long read;
    private final long write;

    public PrimitiveArrayBuilder(_findConverterType _findconvertertype, long j, long j2, long j3, long j4, boolean z) {
        buildTypeSerializer.IconCompatParcelizer(j >= 0 && j2 > j);
        this.AudioAttributesImplApi26Parcelizer = _findconvertertype;
        this.IconCompatParcelizer = j;
        this.write = j2;
        if (j3 == j2 - j || z) {
            this.MediaMetadataCompat = j4;
            this.MediaBrowserCompatItemReceiver = 4;
        } else {
            this.MediaBrowserCompatItemReceiver = 0;
        }
        this.RemoteActionCompatParcelizer = new RootNameLookup();
    }

    @Override // kotlin.StdDateFormat
    public final long write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int i = this.MediaBrowserCompatItemReceiver;
        if (i == 0) {
            long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = jIconCompatParcelizer;
            this.MediaBrowserCompatItemReceiver = 1;
            long j = this.write - 65307;
            if (j > jIconCompatParcelizer) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long jIconCompatParcelizer2 = IconCompatParcelizer(closeonfailandthrowasioe);
                if (jIconCompatParcelizer2 != -1) {
                    return jIconCompatParcelizer2;
                }
                this.MediaBrowserCompatItemReceiver = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            read(closeonfailandthrowasioe);
            this.MediaBrowserCompatItemReceiver = 4;
            return -(this.MediaBrowserCompatCustomActionResultReceiver + 2);
        }
        this.MediaMetadataCompat = RemoteActionCompatParcelizer(closeonfailandthrowasioe);
        this.MediaBrowserCompatItemReceiver = 4;
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.StdDateFormat
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public AudioAttributesCompatParcelizer write() {
        if (this.MediaMetadataCompat != 0) {
            return new AudioAttributesCompatParcelizer(this, (byte) 0);
        }
        return null;
    }

    @Override // kotlin.StdDateFormat
    public final void write(long j) {
        this.MediaBrowserCompatMediaItem = LaissezFaireSubTypeValidator.read(j, 0L, this.MediaMetadataCompat - 1);
        this.MediaBrowserCompatItemReceiver = 2;
        this.AudioAttributesImplBaseParcelizer = this.IconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = this.write;
        this.MediaBrowserCompatCustomActionResultReceiver = 0L;
        this.read = this.MediaMetadataCompat;
    }

    private long IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (this.AudioAttributesImplBaseParcelizer == this.AudioAttributesCompatParcelizer) {
            return -1L;
        }
        long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
        if (!this.RemoteActionCompatParcelizer.write(closeonfailandthrowasioe, this.AudioAttributesCompatParcelizer)) {
            long j = this.AudioAttributesImplBaseParcelizer;
            if (j != jIconCompatParcelizer) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.RemoteActionCompatParcelizer.read(closeonfailandthrowasioe, false);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        long j2 = this.MediaBrowserCompatMediaItem - this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer.write + this.RemoteActionCompatParcelizer.IconCompatParcelizer;
        if (0 <= j2 && j2 < 72000) {
            return -1L;
        }
        if (j2 < 0) {
            this.AudioAttributesCompatParcelizer = jIconCompatParcelizer;
            this.read = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        } else {
            this.AudioAttributesImplBaseParcelizer = closeonfailandthrowasioe.IconCompatParcelizer() + ((long) i);
            this.MediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
        long j3 = this.AudioAttributesCompatParcelizer;
        long j4 = this.AudioAttributesImplBaseParcelizer;
        if (j3 - j4 < 100000) {
            this.AudioAttributesCompatParcelizer = j4;
            return j4;
        }
        long j5 = i;
        long j6 = j2 <= 0 ? 2L : 1L;
        long jIconCompatParcelizer2 = closeonfailandthrowasioe.IconCompatParcelizer();
        long j7 = this.AudioAttributesCompatParcelizer;
        long j8 = this.AudioAttributesImplBaseParcelizer;
        return LaissezFaireSubTypeValidator.read((jIconCompatParcelizer2 - (j5 * j6)) + ((j2 * (j7 - j8)) / (this.read - this.MediaBrowserCompatCustomActionResultReceiver)), j8, j7 - 1);
    }

    private void read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        while (true) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
            this.RemoteActionCompatParcelizer.read(closeonfailandthrowasioe, false);
            if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer <= this.MediaBrowserCompatMediaItem) {
                closeonfailandthrowasioe.IconCompatParcelizer(this.RemoteActionCompatParcelizer.write + this.RemoteActionCompatParcelizer.IconCompatParcelizer);
                this.AudioAttributesImplBaseParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
                this.MediaBrowserCompatCustomActionResultReceiver = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
            } else {
                closeonfailandthrowasioe.RemoteActionCompatParcelizer();
                return;
            }
        }
    }

    private long RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (!this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(closeonfailandthrowasioe)) {
            throw new EOFException();
        }
        this.RemoteActionCompatParcelizer.read(closeonfailandthrowasioe, false);
        closeonfailandthrowasioe.IconCompatParcelizer(this.RemoteActionCompatParcelizer.write + this.RemoteActionCompatParcelizer.IconCompatParcelizer);
        long j = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        while ((this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer & 4) != 4 && this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(closeonfailandthrowasioe) && closeonfailandthrowasioe.IconCompatParcelizer() < this.write && this.RemoteActionCompatParcelizer.read(closeonfailandthrowasioe, true) && findSuperClasses.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, this.RemoteActionCompatParcelizer.write + this.RemoteActionCompatParcelizer.IconCompatParcelizer)) {
            j = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
        return j;
    }

    final class AudioAttributesCompatParcelizer implements isCollectionMapOrArray {
        @Override // kotlin.isCollectionMapOrArray
        public final boolean IconCompatParcelizer() {
            return true;
        }

        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(PrimitiveArrayBuilder primitiveArrayBuilder, byte b) {
            this();
        }

        @Override // kotlin.isCollectionMapOrArray
        public final isCollectionMapOrArray.read write(long j) {
            long j2 = PrimitiveArrayBuilder.this.AudioAttributesImplApi26Parcelizer.read(j);
            return new isCollectionMapOrArray.read(new isLocalType(j, LaissezFaireSubTypeValidator.read((PrimitiveArrayBuilder.this.IconCompatParcelizer + BigInteger.valueOf(j2).multiply(BigInteger.valueOf(PrimitiveArrayBuilder.this.write - PrimitiveArrayBuilder.this.IconCompatParcelizer)).divide(BigInteger.valueOf(PrimitiveArrayBuilder.this.MediaMetadataCompat)).longValue()) - 30000, PrimitiveArrayBuilder.this.IconCompatParcelizer, PrimitiveArrayBuilder.this.write - 1)));
        }

        @Override // kotlin.isCollectionMapOrArray
        public final long read() {
            return PrimitiveArrayBuilder.this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(PrimitiveArrayBuilder.this.MediaMetadataCompat);
        }
    }
}
