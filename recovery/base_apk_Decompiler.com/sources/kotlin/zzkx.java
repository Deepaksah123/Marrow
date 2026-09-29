package kotlin;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lo/zzkx;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzkx {
    private static final /* synthetic */ zzkx[] MediaDescriptionCompat;
    public static final zzkx AudioAttributesImplApi21Parcelizer = new zzkx(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 0);
    public static final zzkx MediaBrowserCompatItemReceiver = new zzkx("QBANK_SOLVE", 1);
    public static final zzkx AudioAttributesImplBaseParcelizer = new zzkx("QBANK_REVIEW_LIST", 2);
    public static final zzkx AudioAttributesImplApi26Parcelizer = new zzkx("QBANK_REVIEW_DETAIL", 3);
    public static final zzkx MediaBrowserCompatCustomActionResultReceiver = new zzkx("CM_SOLVE", 4);
    public static final zzkx IconCompatParcelizer = new zzkx("CM_REVIEW_LIST", 5);
    public static final zzkx AudioAttributesCompatParcelizer = new zzkx("CM_REVIEW_DETAIL", 6);
    public static final zzkx write = new zzkx("BM_SOLVE", 7);
    public static final zzkx RemoteActionCompatParcelizer = new zzkx("BM_REVIEW_LIST", 8);
    public static final zzkx read = new zzkx("BM_REVIEW_DETAIL", 9);

    private zzkx(String str, int i) {
    }

    static {
        zzkx[] zzkxVarArrWrite = write();
        MediaDescriptionCompat = zzkxVarArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(zzkxVarArrWrite);
    }

    private static final /* synthetic */ zzkx[] write() {
        return new zzkx[]{AudioAttributesImplApi21Parcelizer, MediaBrowserCompatItemReceiver, AudioAttributesImplBaseParcelizer, AudioAttributesImplApi26Parcelizer, MediaBrowserCompatCustomActionResultReceiver, IconCompatParcelizer, AudioAttributesCompatParcelizer, write, RemoteActionCompatParcelizer, read};
    }

    public static zzkx valueOf(String str) {
        return (zzkx) Enum.valueOf(zzkx.class, str);
    }

    public static zzkx[] values() {
        return (zzkx[]) MediaDescriptionCompat.clone();
    }
}
