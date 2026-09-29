package kotlin;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/TileProvider;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TileProvider {
    private static final /* synthetic */ TileProvider[] MediaBrowserCompatCustomActionResultReceiver;
    public static final TileProvider read = new TileProvider(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 0);
    public static final TileProvider AudioAttributesCompatParcelizer = new TileProvider("VIEW_TYPE_TOPPER", 1);
    public static final TileProvider write = new TileProvider("VIEW_TYPE_CURRENT_USER", 2);
    public static final TileProvider RemoteActionCompatParcelizer = new TileProvider("VIEW_TYPE_NON_TOPPER", 3);
    public static final TileProvider IconCompatParcelizer = new TileProvider("VIEW_TYPE_SCORE_CARD", 4);

    private TileProvider(String str, int i) {
    }

    static {
        TileProvider[] tileProviderArr = read();
        MediaBrowserCompatCustomActionResultReceiver = tileProviderArr;
        getMagicModuleTimeline.IconCompatParcelizer(tileProviderArr);
    }

    private static final /* synthetic */ TileProvider[] read() {
        return new TileProvider[]{read, AudioAttributesCompatParcelizer, write, RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static TileProvider valueOf(String str) {
        return (TileProvider) Enum.valueOf(TileProvider.class, str);
    }

    public static TileProvider[] values() {
        return (TileProvider[]) MediaBrowserCompatCustomActionResultReceiver.clone();
    }
}
