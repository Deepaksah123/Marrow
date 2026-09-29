package kotlin;

import com.marrow.data.models.mcq.McqParentInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\nj\u0002\b\bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lo/readBlockToCache;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MediaBrowserCompatSearchResultReceiver", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi26Parcelizer", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class readBlockToCache {
    private static final /* synthetic */ readBlockToCache[] AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final String read;
    public static final readBlockToCache AudioAttributesImplBaseParcelizer = new readBlockToCache("PARENT_TYPE_STEP", 0, McqParentInfo.PARENT_TYPE_STEP);
    public static final readBlockToCache AudioAttributesImplApi26Parcelizer = new readBlockToCache("PARENT_TYPE_TEST", 1, "test");
    public static final readBlockToCache IconCompatParcelizer = new readBlockToCache("PARENT_TYPE_CUSTOM_MODULE", 2, McqParentInfo.PARENT_TYPE_CUSTOM_MODULE);
    public static final readBlockToCache MediaBrowserCompatItemReceiver = new readBlockToCache("PARENT_TYPE_PEARL", 3, "pearl");
    public static final readBlockToCache read = new readBlockToCache("PARENT_TYPE_MCQ", 4, "mcq");
    public static final readBlockToCache RemoteActionCompatParcelizer = new readBlockToCache("PARENT_TYPE_BOOKMARK", 5, "bookmark");
    public static final readBlockToCache AudioAttributesCompatParcelizer = new readBlockToCache("PARENT_MAGIC_MODULE", 6, "smart_recall");
    public static final readBlockToCache MediaBrowserCompatCustomActionResultReceiver = new readBlockToCache("PARENT_TYPE_TEST_GROUP", 7, "test_group");
    public static final readBlockToCache write = new readBlockToCache("PARENT_TYPE_ACTIVE_RECALL", 8, "active_recall");

    private readBlockToCache(String str, int i, String str2) {
        this.read = str2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    static {
        readBlockToCache[] readblocktocacheArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        AudioAttributesImplApi21Parcelizer = readblocktocacheArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(readblocktocacheArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ readBlockToCache[] AudioAttributesCompatParcelizer() {
        return new readBlockToCache[]{AudioAttributesImplBaseParcelizer, AudioAttributesImplApi26Parcelizer, IconCompatParcelizer, MediaBrowserCompatItemReceiver, read, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver, write};
    }

    public static readBlockToCache valueOf(String str) {
        return (readBlockToCache) Enum.valueOf(readBlockToCache.class, str);
    }

    public static readBlockToCache[] values() {
        return (readBlockToCache[]) AudioAttributesImplApi21Parcelizer.clone();
    }
}
