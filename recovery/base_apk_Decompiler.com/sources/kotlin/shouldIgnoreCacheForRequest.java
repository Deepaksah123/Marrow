package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/shouldIgnoreCacheForRequest;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class shouldIgnoreCacheForRequest {
    public static final shouldIgnoreCacheForRequest AudioAttributesCompatParcelizer = new shouldIgnoreCacheForRequest("UPCOMING", 0);
    public static final shouldIgnoreCacheForRequest RemoteActionCompatParcelizer = new shouldIgnoreCacheForRequest("NOT_GENERATED", 1);
    private static final /* synthetic */ shouldIgnoreCacheForRequest[] read;

    private shouldIgnoreCacheForRequest(String str, int i) {
    }

    static {
        shouldIgnoreCacheForRequest[] shouldignorecacheforrequestArrWrite = write();
        read = shouldignorecacheforrequestArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(shouldignorecacheforrequestArrWrite);
    }

    private static final /* synthetic */ shouldIgnoreCacheForRequest[] write() {
        return new shouldIgnoreCacheForRequest[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static shouldIgnoreCacheForRequest valueOf(String str) {
        return (shouldIgnoreCacheForRequest) Enum.valueOf(shouldIgnoreCacheForRequest.class, str);
    }

    public static shouldIgnoreCacheForRequest[] values() {
        return (shouldIgnoreCacheForRequest[]) read.clone();
    }
}
