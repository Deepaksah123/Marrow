package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getRemoteLastUpdated;", "Lo/VideoCacheInfo;", "<init>", "()V", "", "IconCompatParcelizer", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getRemoteLastUpdated extends VideoCacheInfo {
    public static final getRemoteLastUpdated INSTANCE = new getRemoteLastUpdated();

    private getRemoteLastUpdated() {
    }

    @Override // kotlin.VideoCacheInfo
    public final long IconCompatParcelizer() {
        return System.nanoTime();
    }
}
