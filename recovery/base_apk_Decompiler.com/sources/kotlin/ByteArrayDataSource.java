package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\nj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017"}, d2 = {"Lo/ByteArrayDataSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "onAddQueueItem", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "read", "MediaMetadataCompat", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "write", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "MediaBrowserCompatItemReceiver", "MediaDescriptionCompat", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "RatingCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ByteArrayDataSource {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final /* synthetic */ getMagicModuleSavedMcqCount MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;
    private static final /* synthetic */ ByteArrayDataSource[] onCommand;
    private static int onCustomAction = 0;
    private static int onPause = 0;
    private static int onPlayFromMediaId = 1;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final String read;
    public static final ByteArrayDataSource MediaMetadataCompat = new ByteArrayDataSource("SECURITY_AUDIT", 0, "security_audit");
    public static final ByteArrayDataSource AudioAttributesImplBaseParcelizer = new ByteArrayDataSource("LOG_ATTESTATION", 1, "log_attestation");
    public static final ByteArrayDataSource MediaBrowserCompatSearchResultReceiver = new ByteArrayDataSource("TAGS_SYNC", 2, "tags_sync");
    public static final ByteArrayDataSource write = new ByteArrayDataSource("FIREBASE_SYNC", 3, "firebase_sync");
    public static final ByteArrayDataSource RemoteActionCompatParcelizer = new ByteArrayDataSource("COURSE_SYNC", 4, "course_sync");
    public static final ByteArrayDataSource read = new ByteArrayDataSource("FIREBASE_CONFIG_SYNC", 5, "firebase_config_sync");
    public static final ByteArrayDataSource AudioAttributesImplApi26Parcelizer = new ByteArrayDataSource("PLAN_UPGRADE_SYNC", 6, "plan_upgrade_sync");
    public static final ByteArrayDataSource MediaBrowserCompatCustomActionResultReceiver = new ByteArrayDataSource("PLAN_B_UPGRADE_SYNC", 7, "plan_b_upgrade_sync");
    public static final ByteArrayDataSource MediaBrowserCompatMediaItem = new ByteArrayDataSource("RECENT_UPDATE_LAST_UPDATE_SYNC", 8, "recent_update_last_update_sync");
    public static final ByteArrayDataSource MediaBrowserCompatItemReceiver = new ByteArrayDataSource("PLAYBACK_2X_CONFIG_SYNC", 9, "playback_2x_config_sync");
    public static final ByteArrayDataSource MediaDescriptionCompat = new ByteArrayDataSource("USER_CONFIG_SYNC", 10, "user_config_sync");
    public static final ByteArrayDataSource AudioAttributesImplApi21Parcelizer = new ByteArrayDataSource("LICENSE_CONFIG", 11, "license_config");
    public static final ByteArrayDataSource AudioAttributesCompatParcelizer = new ByteArrayDataSource("IMAGE_TOKEN", 12, "image_token");
    public static final ByteArrayDataSource RatingCompat = new ByteArrayDataSource("PLAY_INTEGRITY_TOKEN", 13, "play_integrity_token");

    private ByteArrayDataSource(String str, int i, String str2) {
        this.read = str2;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 | 113;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 113)) & i3);
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
        int i7 = i6 % 2;
        String str = this.read;
        if (i7 == 0) {
            int i8 = 59 / 0;
        }
        return str;
    }

    static {
        ByteArrayDataSource[] byteArrayDataSourceArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        onCommand = byteArrayDataSourceArrAudioAttributesCompatParcelizer;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getMagicModuleTimeline.IconCompatParcelizer(byteArrayDataSourceArrAudioAttributesCompatParcelizer);
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        INSTANCE = new Companion(magicModuleRepositoryImplExternalSyntheticLambda0);
        int i = onPause + 99;
        onPlayFromMediaId = i % 128;
        if (i % 2 != 0) {
            return;
        }
        magicModuleRepositoryImplExternalSyntheticLambda0.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: o.ByteArrayDataSource$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ByteArrayDataSource$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static final /* synthetic */ ByteArrayDataSource[] AudioAttributesCompatParcelizer() {
        ByteArrayDataSource byteArrayDataSource;
        ByteArrayDataSource byteArrayDataSource2;
        ByteArrayDataSource byteArrayDataSource3;
        ByteArrayDataSource byteArrayDataSource4;
        ByteArrayDataSource byteArrayDataSource5;
        ByteArrayDataSource[] byteArrayDataSourceArr;
        char c;
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 & 11;
        int i4 = (~i3) & (i2 | 11);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i5 | i4);
        onCustomAction = i6 % 128;
        int i7 = i6 % 2;
        ByteArrayDataSource byteArrayDataSource6 = MediaMetadataCompat;
        ByteArrayDataSource byteArrayDataSource7 = AudioAttributesImplBaseParcelizer;
        ByteArrayDataSource byteArrayDataSource8 = MediaBrowserCompatSearchResultReceiver;
        ByteArrayDataSource byteArrayDataSource9 = write;
        ByteArrayDataSource byteArrayDataSource10 = RemoteActionCompatParcelizer;
        int i8 = i2 ^ 113;
        int i9 = (i2 & 113) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        int i11 = i10 % 128;
        onCustomAction = i11;
        if (i10 % 2 != 0) {
            byteArrayDataSource = read;
            byteArrayDataSource2 = AudioAttributesImplApi26Parcelizer;
            byteArrayDataSource3 = MediaBrowserCompatCustomActionResultReceiver;
            byteArrayDataSource4 = MediaBrowserCompatMediaItem;
            byteArrayDataSource5 = MediaBrowserCompatItemReceiver;
            int i12 = 29 / 0;
        } else {
            byteArrayDataSource = read;
            byteArrayDataSource2 = AudioAttributesImplApi26Parcelizer;
            byteArrayDataSource3 = MediaBrowserCompatCustomActionResultReceiver;
            byteArrayDataSource4 = MediaBrowserCompatMediaItem;
            byteArrayDataSource5 = MediaBrowserCompatItemReceiver;
        }
        ByteArrayDataSource byteArrayDataSource11 = MediaDescriptionCompat;
        ByteArrayDataSource byteArrayDataSource12 = AudioAttributesImplApi21Parcelizer;
        ByteArrayDataSource byteArrayDataSource13 = AudioAttributesCompatParcelizer;
        ByteArrayDataSource byteArrayDataSource14 = RatingCompat;
        int i13 = i11 ^ 85;
        int i14 = -(-((i11 & 85) << 1));
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        int i16 = i15 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i16;
        if (i15 % 2 == 0) {
            byteArrayDataSourceArr = new ByteArrayDataSource[20];
            byteArrayDataSourceArr[1] = byteArrayDataSource6;
            byteArrayDataSourceArr[1] = byteArrayDataSource7;
            byteArrayDataSourceArr[4] = byteArrayDataSource8;
        } else {
            byteArrayDataSourceArr = new ByteArrayDataSource[14];
            byteArrayDataSourceArr[0] = byteArrayDataSource6;
            byteArrayDataSourceArr[1] = byteArrayDataSource7;
            byteArrayDataSourceArr[2] = byteArrayDataSource8;
        }
        byteArrayDataSourceArr[3] = byteArrayDataSource9;
        byteArrayDataSourceArr[4] = byteArrayDataSource10;
        byteArrayDataSourceArr[5] = byteArrayDataSource;
        int i17 = (i16 & 7) + (i16 | 7);
        int i18 = i17 % 128;
        onCustomAction = i18;
        int i19 = i17 % 2;
        byteArrayDataSourceArr[6] = byteArrayDataSource2;
        byteArrayDataSourceArr[7] = byteArrayDataSource3;
        byteArrayDataSourceArr[8] = byteArrayDataSource4;
        int i20 = (i18 & (-88)) | ((~i18) & 87);
        int i21 = -(-((i18 & 87) << 1));
        int i22 = (i20 & i21) + (i20 | i21);
        int i23 = i22 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i23;
        if (i22 % 2 == 0) {
            byteArrayDataSourceArr[9] = byteArrayDataSource5;
            byteArrayDataSourceArr[30] = byteArrayDataSource11;
            byteArrayDataSourceArr[121] = byteArrayDataSource12;
            c = '/';
        } else {
            byteArrayDataSourceArr[9] = byteArrayDataSource5;
            byteArrayDataSourceArr[10] = byteArrayDataSource11;
            byteArrayDataSourceArr[11] = byteArrayDataSource12;
            c = '\f';
        }
        byteArrayDataSourceArr[c] = byteArrayDataSource13;
        byteArrayDataSourceArr[13] = byteArrayDataSource14;
        int i24 = (i23 & 29) + (i23 | 29);
        onCustomAction = i24 % 128;
        int i25 = i24 % 2;
        return byteArrayDataSourceArr;
    }

    public static getMagicModuleSavedMcqCount<ByteArrayDataSource> read() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = i2 & 61;
        int i4 = ((i2 ^ 61) | i3) << 1;
        int i5 = -((i2 | 61) & (~i3));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        int i7 = i6 % 128;
        handleMediaPlayPauseIfPendingOnHandler = i7;
        int i8 = i6 % 2;
        getMagicModuleSavedMcqCount<ByteArrayDataSource> getmagicmodulesavedmcqcount = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i9 = (i7 | 95) << 1;
        int i10 = -(((~i7) & 95) | (i7 & (-96)));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        onCustomAction = i11 % 128;
        if (i11 % 2 == 0) {
            return getmagicmodulesavedmcqcount;
        }
        throw null;
    }

    public static ByteArrayDataSource valueOf(String str) {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = (i2 & 53) + (i2 | 53);
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        ByteArrayDataSource byteArrayDataSource = (ByteArrayDataSource) Enum.valueOf(ByteArrayDataSource.class, str);
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        return byteArrayDataSource;
    }

    public static ByteArrayDataSource[] values() {
        int i = 2 % 2;
        int i2 = onCustomAction;
        int i3 = (((i2 ^ 67) | (i2 & 67)) << 1) - (((~i2) & 67) | (i2 & (-68)));
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
        ByteArrayDataSource[] byteArrayDataSourceArr = (ByteArrayDataSource[]) onCommand.clone();
        int i5 = onCustomAction;
        int i6 = i5 & 21;
        int i7 = ((i5 | 21) & (~i6)) + (i6 << 1);
        handleMediaPlayPauseIfPendingOnHandler = i7 % 128;
        if (i7 % 2 != 0) {
            return byteArrayDataSourceArr;
        }
        throw null;
    }
}
