package kotlin;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\nj\u0002\b\fj\u0002\b\bj\u0002\b\r"}, d2 = {"Lo/zzpy;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "write", "IconCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzpy {
    private static final /* synthetic */ zzpy[] AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String write;
    public static final zzpy IconCompatParcelizer = new zzpy(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 0, "Default (A-Z)");
    public static final zzpy write = new zzpy("MOST_COMPLETED", 1, "Most Completed");
    public static final zzpy read = new zzpy("LEAST_COMPLETED", 2, "Least Completed");
    public static final zzpy RemoteActionCompatParcelizer = new zzpy("STRONGEST_TO_WEAKEST", 3, "Strongest to Weakest");
    public static final zzpy AudioAttributesCompatParcelizer = new zzpy("WEAKEST_TO_STRONGEST", 4, "Weakest to Strongest");

    private zzpy(String str, int i, String str2) {
        this.write = str2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    static {
        zzpy[] zzpyVarArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesImplApi26Parcelizer = zzpyVarArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(zzpyVarArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ zzpy[] AudioAttributesCompatParcelizer() {
        return new zzpy[]{IconCompatParcelizer, write, read, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static zzpy valueOf(String str) {
        return (zzpy) Enum.valueOf(zzpy.class, str);
    }

    public static zzpy[] values() {
        return (zzpy[]) AudioAttributesImplApi26Parcelizer.clone();
    }
}
