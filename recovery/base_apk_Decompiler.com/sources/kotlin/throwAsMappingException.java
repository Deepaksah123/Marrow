package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import kotlin.C0170format;
import kotlin.isCollectionMapOrArray;

/* JADX INFO: loaded from: classes2.dex */
public final class throwAsMappingException implements findConstructor {
    private static final byte[] AudioAttributesCompatParcelizer;
    private static final int[] IconCompatParcelizer;
    private static final byte[] RemoteActionCompatParcelizer;
    private static final int read;
    private static final int[] write;
    private long AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private findRawSuperTypes MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private int RatingCompat;
    private isCollectionMapOrArray handleMediaPlayPauseIfPendingOnHandler;
    private final byte[] onAddQueueItem;
    private int onCommand;
    private nonNullString onCustomAction;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.rawClass
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return throwAsMappingException.read();
            }
        };
        write = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        IconCompatParcelizer = iArr;
        RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer("#!AMR\n");
        AudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer("#!AMR-WB\n");
        read = iArr[8];
    }

    static /* synthetic */ findConstructor[] read() {
        return new findConstructor[]{new throwAsMappingException()};
    }

    public throwAsMappingException() {
        this(0);
    }

    public throwAsMappingException(int i) {
        this.MediaDescriptionCompat = 0;
        this.onAddQueueItem = new byte[1];
        this.RatingCompat = -1;
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return IconCompatParcelizer(closeonfailandthrowasioe);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.MediaBrowserCompatItemReceiver = findrawsupertypes;
        this.onCustomAction = findrawsupertypes.IconCompatParcelizer(0, 1);
        findrawsupertypes.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        IconCompatParcelizer();
        if (closeonfailandthrowasioe.IconCompatParcelizer() == 0 && !IconCompatParcelizer(closeonfailandthrowasioe)) {
            throw SchemaAware.RemoteActionCompatParcelizer("Could not find AMR header.", null);
        }
        MediaBrowserCompatCustomActionResultReceiver();
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
        AudioAttributesCompatParcelizer(closeonfailandthrowasioe.read(), iAudioAttributesCompatParcelizer);
        return iAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.AudioAttributesImplBaseParcelizer = 0L;
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        if (j != 0) {
            isCollectionMapOrArray iscollectionmaporarray = this.handleMediaPlayPauseIfPendingOnHandler;
            if (iscollectionmaporarray instanceof backticked) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ((backticked) iscollectionmaporarray).AudioAttributesCompatParcelizer(j);
                return;
            }
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0L;
    }

    private boolean IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        byte[] bArr = RemoteActionCompatParcelizer;
        if (write(closeonfailandthrowasioe, bArr)) {
            this.MediaBrowserCompatMediaItem = false;
            closeonfailandthrowasioe.IconCompatParcelizer(bArr.length);
            return true;
        }
        byte[] bArr2 = AudioAttributesCompatParcelizer;
        if (!write(closeonfailandthrowasioe, bArr2)) {
            return false;
        }
        this.MediaBrowserCompatMediaItem = true;
        closeonfailandthrowasioe.IconCompatParcelizer(bArr2.length);
        return true;
    }

    private static boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, byte[] bArr) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        byte[] bArr2 = new byte[bArr.length];
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.MediaMetadataCompat) {
            return;
        }
        this.MediaMetadataCompat = true;
        boolean z = this.MediaBrowserCompatMediaItem;
        this.onCustomAction.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(z ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB).AudioAttributesImplApi26Parcelizer(read).read(1).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(z ? AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND : 8000).IconCompatParcelizer());
    }

    private int AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (this.MediaBrowserCompatCustomActionResultReceiver == 0) {
            try {
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(closeonfailandthrowasioe);
                this.AudioAttributesImplApi26Parcelizer = iRemoteActionCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = iRemoteActionCompatParcelizer;
                if (this.RatingCompat == -1) {
                    this.AudioAttributesImplApi21Parcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
                    this.RatingCompat = this.AudioAttributesImplApi26Parcelizer;
                }
                if (this.RatingCompat == this.AudioAttributesImplApi26Parcelizer) {
                    this.onCommand++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iAudioAttributesCompatParcelizer = this.onCustomAction.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, this.MediaBrowserCompatCustomActionResultReceiver, true);
        if (iAudioAttributesCompatParcelizer == -1) {
            return -1;
        }
        int i = this.MediaBrowserCompatCustomActionResultReceiver - iAudioAttributesCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        if (i > 0) {
            return 0;
        }
        this.onCustomAction.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + this.AudioAttributesImplBaseParcelizer, 1, this.AudioAttributesImplApi26Parcelizer, 0, null);
        this.AudioAttributesImplBaseParcelizer += 20000;
        return 0;
    }

    private int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.onAddQueueItem, 0, 1);
        byte b = this.onAddQueueItem[0];
        if ((b & 131) > 0) {
            throw SchemaAware.RemoteActionCompatParcelizer("Invalid padding bits for frame header ".concat(String.valueOf((int) b)), null);
        }
        return write((b >> 3) & 15);
    }

    private int write(int i) throws SchemaAware {
        if (read(i)) {
            return this.MediaBrowserCompatMediaItem ? IconCompatParcelizer[i] : write[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.MediaBrowserCompatMediaItem ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
    }

    private boolean read(int i) {
        if (i < 0 || i > 15) {
            return false;
        }
        return AudioAttributesCompatParcelizer(i) || IconCompatParcelizer(i);
    }

    private boolean AudioAttributesCompatParcelizer(int i) {
        if (this.MediaBrowserCompatMediaItem) {
            return i < 10 || i > 13;
        }
        return false;
    }

    private boolean IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompatMediaItem) {
            return false;
        }
        return i < 12 || i > 14;
    }

    private void AudioAttributesCompatParcelizer(long j, int i) {
        int i2;
        if (this.MediaBrowserCompatSearchResultReceiver) {
            return;
        }
        int i3 = this.MediaDescriptionCompat;
        if ((i3 & 1) == 0 || j == -1 || ((i2 = this.RatingCompat) != -1 && i2 != this.AudioAttributesImplApi26Parcelizer)) {
            isCollectionMapOrArray.write writeVar = new isCollectionMapOrArray.write(C.TIME_UNSET);
            this.handleMediaPlayPauseIfPendingOnHandler = writeVar;
            this.MediaBrowserCompatItemReceiver.read(writeVar);
            this.MediaBrowserCompatSearchResultReceiver = true;
            return;
        }
        if (this.onCommand >= 20 || i == -1) {
            isCollectionMapOrArray iscollectionmaporarrayIconCompatParcelizer = IconCompatParcelizer(j, (i3 & 2) != 0);
            this.handleMediaPlayPauseIfPendingOnHandler = iscollectionmaporarrayIconCompatParcelizer;
            this.MediaBrowserCompatItemReceiver.read(iscollectionmaporarrayIconCompatParcelizer);
            this.MediaBrowserCompatSearchResultReceiver = true;
        }
    }

    private isCollectionMapOrArray IconCompatParcelizer(long j, boolean z) {
        return new backticked(j, this.AudioAttributesImplApi21Parcelizer, RemoteActionCompatParcelizer(this.RatingCompat), this.RatingCompat, z);
    }

    private void IconCompatParcelizer() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.onCustomAction);
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
    }

    private static int RemoteActionCompatParcelizer(int i) {
        return (int) ((((long) i) * 8000000) / 20000);
    }
}
