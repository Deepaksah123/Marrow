package kotlin;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import kotlin.C0170format;
import kotlin.constructUsingIndex;
import kotlin.contents;
import kotlin.getTypeDescription;

/* JADX INFO: loaded from: classes2.dex */
public final class IgnorePropertiesUtil implements findConstructor {
    private static final constructUsingIndex.RemoteActionCompatParcelizer IconCompatParcelizer;
    private nonNullString AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private final long AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final hasClass MediaBrowserCompatCustomActionResultReceiver;
    private final isBogusClass MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private androidx.media3.common.Metadata MediaBrowserCompatSearchResultReceiver;
    private contents MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private nonNullString MediaDescriptionCompat;
    private long MediaMetadataCompat;
    private int RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private final getTypeDescription.RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private long onAddQueueItem;
    private final AsPropertyTypeDeserializer onCommand;
    private final nonNullString onCustomAction;
    private int onPause;
    private findRawSuperTypes read;
    private long write;

    static /* synthetic */ boolean AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    private static boolean read(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.LinkedNode
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return IgnorePropertiesUtil.IconCompatParcelizer();
            }
        };
        IconCompatParcelizer = new constructUsingIndex.RemoteActionCompatParcelizer() { // from class: o.putIfAbsent
            @Override // o.constructUsingIndex.RemoteActionCompatParcelizer
            public final boolean write(int i, int i2, int i3, int i4, int i5) {
                return IgnorePropertiesUtil.AudioAttributesCompatParcelizer(i, i2, i3, i4, i5);
            }
        };
    }

    static /* synthetic */ findConstructor[] IconCompatParcelizer() {
        return new findConstructor[]{new IgnorePropertiesUtil()};
    }

    public IgnorePropertiesUtil() {
        this(0);
    }

    public IgnorePropertiesUtil(int i) {
        this(0, C.TIME_UNSET);
    }

    public IgnorePropertiesUtil(int i, long j) {
        this.AudioAttributesImplBaseParcelizer = (i & 2) != 0 ? i | 1 : i;
        this.AudioAttributesImplApi26Parcelizer = j;
        this.onCommand = new AsPropertyTypeDeserializer(10);
        this.handleMediaPlayPauseIfPendingOnHandler = new getTypeDescription.RemoteActionCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = new hasClass();
        this.write = C.TIME_UNSET;
        this.MediaBrowserCompatItemReceiver = new isBogusClass();
        exceptionMessage exceptionmessage = new exceptionMessage();
        this.onCustomAction = exceptionmessage;
        this.AudioAttributesCompatParcelizer = exceptionmessage;
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        return write(closeonfailandthrowasioe, true);
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.read = findrawsupertypes;
        nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(0, 1);
        this.MediaDescriptionCompat = nonnullstringIconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = nonnullstringIconCompatParcelizer;
        this.read.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.onPause = 0;
        this.write = C.TIME_UNSET;
        this.MediaMetadataCompat = 0L;
        this.RatingCompat = 0;
        this.onAddQueueItem = j2;
        contents contentsVar = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (!(contentsVar instanceof combineNamesToInclude) || ((combineNamesToInclude) contentsVar).read(j2)) {
            return;
        }
        this.MediaBrowserCompatMediaItem = true;
        this.AudioAttributesCompatParcelizer = this.onCustomAction;
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        MediaBrowserCompatItemReceiver();
        int iIconCompatParcelizer = IconCompatParcelizer(closeonfailandthrowasioe);
        if (iIconCompatParcelizer == -1 && (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver instanceof combineNamesToInclude)) {
            long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaMetadataCompat);
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read() != jRemoteActionCompatParcelizer) {
                ((combineNamesToInclude) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).AudioAttributesCompatParcelizer(jRemoteActionCompatParcelizer);
                this.read.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            }
        }
        return iIconCompatParcelizer;
    }

    public final void read() {
        this.RemoteActionCompatParcelizer = true;
    }

    private int IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (this.onPause == 0) {
            try {
                write(closeonfailandthrowasioe, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            contents contentsVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(closeonfailandthrowasioe);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = contentsVarRemoteActionCompatParcelizer;
            this.read.read(contentsVarRemoteActionCompatParcelizer);
            C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(4096).read(this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.handleMediaPlayPauseIfPendingOnHandler.write).MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver.read).AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer).read((this.AudioAttributesImplBaseParcelizer & 8) != 0 ? null : this.MediaBrowserCompatSearchResultReceiver);
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer() != -2147483647) {
                remoteActionCompatParcelizer.write(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer());
            }
            this.AudioAttributesCompatParcelizer.write(remoteActionCompatParcelizer.IconCompatParcelizer());
            this.AudioAttributesImplApi21Parcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
        } else if (this.AudioAttributesImplApi21Parcelizer != 0) {
            long jIconCompatParcelizer = closeonfailandthrowasioe.IconCompatParcelizer();
            long j = this.AudioAttributesImplApi21Parcelizer;
            if (jIconCompatParcelizer < j) {
                closeonfailandthrowasioe.IconCompatParcelizer((int) (j - jIconCompatParcelizer));
            }
        }
        return AudioAttributesImplBaseParcelizer(closeonfailandthrowasioe);
    }

    private int AudioAttributesImplBaseParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        if (this.RatingCompat == 0) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            if (write(closeonfailandthrowasioe)) {
                return -1;
            }
            this.onCommand.MediaBrowserCompatCustomActionResultReceiver(0);
            int iMediaBrowserCompatItemReceiver = this.onCommand.MediaBrowserCompatItemReceiver();
            if (!read(iMediaBrowserCompatItemReceiver, this.onPause) || getTypeDescription.AudioAttributesCompatParcelizer(iMediaBrowserCompatItemReceiver) == -1) {
                closeonfailandthrowasioe.IconCompatParcelizer(1);
                this.onPause = 0;
                return 0;
            }
            this.handleMediaPlayPauseIfPendingOnHandler.write(iMediaBrowserCompatItemReceiver);
            if (this.write == C.TIME_UNSET) {
                this.write = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(closeonfailandthrowasioe.IconCompatParcelizer());
                if (this.AudioAttributesImplApi26Parcelizer != C.TIME_UNSET) {
                    this.write += this.AudioAttributesImplApi26Parcelizer - this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.RemoteActionCompatParcelizer(0L);
                }
            }
            this.RatingCompat = this.handleMediaPlayPauseIfPendingOnHandler.read;
            contents contentsVar = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (contentsVar instanceof combineNamesToInclude) {
                combineNamesToInclude combinenamestoinclude = (combineNamesToInclude) contentsVar;
                combinenamestoinclude.IconCompatParcelizer(RemoteActionCompatParcelizer(this.MediaMetadataCompat + ((long) this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi26Parcelizer)), closeonfailandthrowasioe.IconCompatParcelizer() + ((long) this.handleMediaPlayPauseIfPendingOnHandler.read));
                if (this.MediaBrowserCompatMediaItem && combinenamestoinclude.read(this.onAddQueueItem)) {
                    this.MediaBrowserCompatMediaItem = false;
                    this.AudioAttributesCompatParcelizer = this.MediaDescriptionCompat;
                }
            }
        }
        int iAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(closeonfailandthrowasioe, this.RatingCompat, true);
        if (iAudioAttributesCompatParcelizer == -1) {
            return -1;
        }
        int i = this.RatingCompat - iAudioAttributesCompatParcelizer;
        this.RatingCompat = i;
        if (i > 0) {
            return 0;
        }
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(RemoteActionCompatParcelizer(this.MediaMetadataCompat), 1, this.handleMediaPlayPauseIfPendingOnHandler.read, 0, null);
        this.MediaMetadataCompat += (long) this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi26Parcelizer;
        this.RatingCompat = 0;
        return 0;
    }

    private long RemoteActionCompatParcelizer(long j) {
        return this.write + ((j * 1000000) / ((long) this.handleMediaPlayPauseIfPendingOnHandler.write));
    }

    private boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, boolean z) throws IOException {
        int iWrite;
        int iAudioAttributesCompatParcelizer;
        int i = z ? 32768 : 131072;
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        if (closeonfailandthrowasioe.IconCompatParcelizer() == 0) {
            androidx.media3.common.Metadata metadata = this.MediaBrowserCompatItemReceiver.read(closeonfailandthrowasioe, (this.AudioAttributesImplBaseParcelizer & 8) == 0 ? null : IconCompatParcelizer);
            this.MediaBrowserCompatSearchResultReceiver = metadata;
            if (metadata != null) {
                this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(metadata);
            }
            iWrite = (int) closeonfailandthrowasioe.write();
            if (!z) {
                closeonfailandthrowasioe.IconCompatParcelizer(iWrite);
            }
        } else {
            iWrite = 0;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!write(closeonfailandthrowasioe)) {
                this.onCommand.MediaBrowserCompatCustomActionResultReceiver(0);
                int iMediaBrowserCompatItemReceiver = this.onCommand.MediaBrowserCompatItemReceiver();
                if ((i2 == 0 || read(iMediaBrowserCompatItemReceiver, i2)) && (iAudioAttributesCompatParcelizer = getTypeDescription.AudioAttributesCompatParcelizer(iMediaBrowserCompatItemReceiver)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.handleMediaPlayPauseIfPendingOnHandler.write(iMediaBrowserCompatItemReceiver);
                        i2 = iMediaBrowserCompatItemReceiver;
                    }
                    closeonfailandthrowasioe.write(iAudioAttributesCompatParcelizer - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == i) {
                        if (z) {
                            return false;
                        }
                        throw SchemaAware.RemoteActionCompatParcelizer("Searched too many bytes.", null);
                    }
                    if (z) {
                        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
                        closeonfailandthrowasioe.write(iWrite + i5);
                    } else {
                        closeonfailandthrowasioe.IconCompatParcelizer(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            closeonfailandthrowasioe.IconCompatParcelizer(iWrite + i4);
        } else {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        }
        this.onPause = i2;
        return true;
    }

    private boolean write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        contents contentsVar = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (contentsVar != null) {
            long jAudioAttributesCompatParcelizer = contentsVar.AudioAttributesCompatParcelizer();
            if (jAudioAttributesCompatParcelizer != -1 && closeonfailandthrowasioe.write() > jAudioAttributesCompatParcelizer - 4) {
                return true;
            }
        }
        try {
            return !closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.onCommand.RemoteActionCompatParcelizer(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private contents RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        long jIconCompatParcelizer;
        long jAudioAttributesCompatParcelizer;
        contents contentsVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
        isFatal isfatalAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, closeonfailandthrowasioe.IconCompatParcelizer());
        if (this.RemoteActionCompatParcelizer) {
            return new contents.AudioAttributesCompatParcelizer();
        }
        if ((this.AudioAttributesImplBaseParcelizer & 4) != 0) {
            if (isfatalAudioAttributesCompatParcelizer != null) {
                jIconCompatParcelizer = isfatalAudioAttributesCompatParcelizer.read();
                jAudioAttributesCompatParcelizer = isfatalAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            } else if (contentsVarAudioAttributesCompatParcelizer != null) {
                jIconCompatParcelizer = contentsVarAudioAttributesCompatParcelizer.read();
                jAudioAttributesCompatParcelizer = contentsVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            } else {
                jIconCompatParcelizer = IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
                jAudioAttributesCompatParcelizer = -1;
            }
            contentsVarAudioAttributesCompatParcelizer = new combineNamesToInclude(jIconCompatParcelizer, closeonfailandthrowasioe.IconCompatParcelizer(), jAudioAttributesCompatParcelizer);
        } else if (isfatalAudioAttributesCompatParcelizer != null) {
            contentsVarAudioAttributesCompatParcelizer = isfatalAudioAttributesCompatParcelizer;
        } else if (contentsVarAudioAttributesCompatParcelizer == null) {
            contentsVarAudioAttributesCompatParcelizer = null;
        }
        if (contentsVarAudioAttributesCompatParcelizer == null || !(contentsVarAudioAttributesCompatParcelizer.IconCompatParcelizer() || (this.AudioAttributesImplBaseParcelizer & 1) == 0)) {
            return RemoteActionCompatParcelizer(closeonfailandthrowasioe, (this.AudioAttributesImplBaseParcelizer & 2) != 0);
        }
        return contentsVarAudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.contents AudioAttributesCompatParcelizer(kotlin.closeOnFailAndThrowAsIOE r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.IgnorePropertiesUtil.AudioAttributesCompatParcelizer(o.closeOnFailAndThrowAsIOE):o.contents");
    }

    private contents RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, boolean z) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.onCommand.RemoteActionCompatParcelizer(), 0, 4);
        this.onCommand.MediaBrowserCompatCustomActionResultReceiver(0);
        this.handleMediaPlayPauseIfPendingOnHandler.write(this.onCommand.MediaBrowserCompatItemReceiver());
        return new rethrowIfFatal(closeonfailandthrowasioe.read(), closeonfailandthrowasioe.IconCompatParcelizer(), this.handleMediaPlayPauseIfPendingOnHandler, z);
    }

    private static contents RemoteActionCompatParcelizer(long j, LRUMap lRUMap, long j2) {
        long j3;
        long j4;
        long jRemoteActionCompatParcelizer = lRUMap.RemoteActionCompatParcelizer();
        if (jRemoteActionCompatParcelizer == C.TIME_UNSET) {
            return null;
        }
        if (lRUMap.read != -1) {
            long j5 = lRUMap.read;
            j3 = lRUMap.read - ((long) lRUMap.IconCompatParcelizer.read);
            j4 = j5 + j;
        } else {
            if (j2 == -1) {
                return null;
            }
            j3 = (j2 - j) - ((long) lRUMap.IconCompatParcelizer.read);
            j4 = j2;
        }
        long j6 = j3;
        return new rethrowIfFatal(j4, j + ((long) lRUMap.IconCompatParcelizer.read), parseTextAttribute.RemoteActionCompatParcelizer(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(j6, 8000000L, jRemoteActionCompatParcelizer, RoundingMode.HALF_UP)), parseTextAttribute.RemoteActionCompatParcelizer(parseIlstElement.RemoteActionCompatParcelizer(j6, lRUMap.write, RoundingMode.HALF_UP)), false);
    }

    private void MediaBrowserCompatItemReceiver() {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat);
        LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read);
    }

    private static int write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        if (asPropertyTypeDeserializer.read() >= i + 4) {
            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
            int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
            if (iMediaBrowserCompatItemReceiver == 1483304551 || iMediaBrowserCompatItemReceiver == 1231971951) {
                return iMediaBrowserCompatItemReceiver;
            }
        }
        if (asPropertyTypeDeserializer.read() < 40) {
            return 0;
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(36);
        return asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver() == 1447187017 ? 1447187017 : 0;
    }

    private static isFatal AudioAttributesCompatParcelizer(androidx.media3.common.Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int iWrite = metadata.write();
        for (int i = 0; i < iWrite; i++) {
            Metadata.Entry entryIconCompatParcelizer = metadata.IconCompatParcelizer(i);
            if (entryIconCompatParcelizer instanceof MlltFrame) {
                return isFatal.IconCompatParcelizer(j, (MlltFrame) entryIconCompatParcelizer, IconCompatParcelizer(metadata));
            }
        }
        return null;
    }

    private static long IconCompatParcelizer(androidx.media3.common.Metadata metadata) {
        if (metadata == null) {
            return C.TIME_UNSET;
        }
        int iWrite = metadata.write();
        for (int i = 0; i < iWrite; i++) {
            Metadata.Entry entryIconCompatParcelizer = metadata.IconCompatParcelizer(i);
            if (entryIconCompatParcelizer instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entryIconCompatParcelizer;
                if (textInformationFrame.MediaBrowserCompatItemReceiver.equals("TLEN")) {
                    return LaissezFaireSubTypeValidator.IconCompatParcelizer(Long.parseLong(textInformationFrame.AudioAttributesCompatParcelizer.get(0)));
                }
            }
        }
        return C.TIME_UNSET;
    }
}
