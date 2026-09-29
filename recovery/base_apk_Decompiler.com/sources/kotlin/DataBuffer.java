package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001e\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010$\u001a\u0006\u0012\u0002\b\u00030\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u001c\u0010!\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b$\u0010\u0019R\"\u0010\u001d\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010&\u001a\u0004\b\u001c\u0010'\"\u0004\b\u001c\u0010(R\"\u0010%\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010&\u001a\u0004\b\u001a\u0010'\"\u0004\b$\u0010(j\u0002\b$j\u0002\b\u001cj\u0002\b\u001ej\u0002\b\u001a"}, d2 = {"Lo/DataBuffer;", "", "", "p0", "", "p1", "p2", "Lo/maybeSkipTag;", "p3", "Ljava/lang/Class;", "p4", "p5", "", "p6", "p7", "<init>", "(Ljava/lang/String;IILjava/lang/String;ILo/maybeSkipTag;Ljava/lang/Class;Ljava/lang/String;ZZ)V", "MediaDescriptionCompat", "I", "AudioAttributesImplApi21Parcelizer", "()I", "IconCompatParcelizer", "MediaMetadataCompat", "Ljava/lang/String;", "AudioAttributesImplBaseParcelizer", "()Ljava/lang/String;", "read", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "write", "MediaBrowserCompatMediaItem", "Lo/maybeSkipTag;", "MediaBrowserCompatItemReceiver", "Ljava/lang/Class;", "()Ljava/lang/Class;", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Z", "()Z", "(Z)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DataBuffer {
    public static final DataBuffer AudioAttributesCompatParcelizer;
    private static final /* synthetic */ DataBuffer[] IconCompatParcelizer;
    public static final DataBuffer RemoteActionCompatParcelizer;
    public static final DataBuffer read;
    public static final DataBuffer write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Class<?> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final maybeSkipTag read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    private DataBuffer(String str, int i, int i2, String str2, int i3, maybeSkipTag maybeskiptag, Class cls, String str3, boolean z, boolean z2) {
        this.IconCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = str2;
        this.write = i3;
        this.read = maybeskiptag;
        this.AudioAttributesCompatParcelizer = cls;
        this.MediaBrowserCompatItemReceiver = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.AudioAttributesImplApi26Parcelizer = z2;
    }

    /* synthetic */ DataBuffer(String str, int i, int i2, String str2, int i3, maybeSkipTag maybeskiptag, Class cls, String str3, boolean z, boolean z2, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, i2, str2, i3, maybeskiptag, cls, str3, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public final Class<?> write() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    static {
        boolean z = false;
        AudioAttributesCompatParcelizer = new DataBuffer("HOME", 0, R.string.tab_home, "", R.drawable.ic_home_tab_home, maybeSkipTag.write, makeGooglePlayServicesAvailable.class, CourseConfigKeyConstantsKt.KEY_HOME, true, z, 128, null);
        maybeSkipTag maybeskiptag = maybeSkipTag.RemoteActionCompatParcelizer;
        boolean z2 = false;
        boolean z3 = false;
        int i = PsExtractor.AUDIO_STREAM;
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        RemoteActionCompatParcelizer = new DataBuffer("QBANK", 1, R.string.tab_qbank, "", R.drawable.ic_home_tab_qbank, maybeskiptag, ResidentKeyRequirementUnsupportedResidentKeyRequirementException.class, "qbank", z2, z3, i, magicModuleRepositoryImplExternalSyntheticLambda0);
        write = new DataBuffer("TESTS", 2, R.string.tab_tests, "", R.drawable.ic_home_tab_tests, maybeSkipTag.AudioAttributesCompatParcelizer, WalletConstantsCardNetwork.class, "test", z, false, PsExtractor.AUDIO_STREAM, null);
        read = new DataBuffer("VIDEOS", 3, R.string.tab_video, "", R.drawable.ic_home_tab_videos, maybeSkipTag.read, setScrollPosition.class, "video", z2, z3, i, magicModuleRepositoryImplExternalSyntheticLambda0);
        DataBuffer[] dataBufferArrMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        IconCompatParcelizer = dataBufferArrMediaBrowserCompatItemReceiver;
        getMagicModuleTimeline.IconCompatParcelizer(dataBufferArrMediaBrowserCompatItemReceiver);
    }

    private static final /* synthetic */ DataBuffer[] MediaBrowserCompatItemReceiver() {
        return new DataBuffer[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, write, read};
    }

    public static DataBuffer valueOf(String str) {
        return (DataBuffer) Enum.valueOf(DataBuffer.class, str);
    }

    public static DataBuffer[] values() {
        return (DataBuffer[]) IconCompatParcelizer.clone();
    }
}
