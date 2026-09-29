package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/MapLifecycleDelegate;", "", "<init>", "(Ljava/lang/String;I)V", "read", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapLifecycleDelegate {
    private static final /* synthetic */ MapLifecycleDelegate[] AudioAttributesCompatParcelizer;
    public static final MapLifecycleDelegate read = new MapLifecycleDelegate("NA", 0);
    public static final MapLifecycleDelegate IconCompatParcelizer = new MapLifecycleDelegate("UG", 1);
    public static final MapLifecycleDelegate write = new MapLifecycleDelegate("PG", 2);
    public static final MapLifecycleDelegate RemoteActionCompatParcelizer = new MapLifecycleDelegate("FMGE", 3);

    private MapLifecycleDelegate(String str, int i) {
    }

    static {
        MapLifecycleDelegate[] mapLifecycleDelegateArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer = mapLifecycleDelegateArrRemoteActionCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(mapLifecycleDelegateArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ MapLifecycleDelegate[] RemoteActionCompatParcelizer() {
        return new MapLifecycleDelegate[]{read, IconCompatParcelizer, write, RemoteActionCompatParcelizer};
    }

    public static MapLifecycleDelegate valueOf(String str) {
        return (MapLifecycleDelegate) Enum.valueOf(MapLifecycleDelegate.class, str);
    }

    public static MapLifecycleDelegate[] values() {
        return (MapLifecycleDelegate[]) AudioAttributesCompatParcelizer.clone();
    }
}
