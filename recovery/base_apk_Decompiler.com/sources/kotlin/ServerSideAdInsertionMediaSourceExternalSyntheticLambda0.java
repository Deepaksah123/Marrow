package kotlin;

import android.util.LruCache;
import com.marrow.data.models.mcq.McqIndex;

/* JADX INFO: loaded from: classes.dex */
public final class ServerSideAdInsertionMediaSourceExternalSyntheticLambda0 implements ServerSideAdInsertionMediaSourceMediaPeriodImpl {
    private ServerSideAdInsertionMediaSourceMediaPeriodImpl write;
    private static LruCache<String, McqIndex> read = new LruCache<>(500);
    private static LruCache<String[], String[]> IconCompatParcelizer = new LruCache<>(100);

    public ServerSideAdInsertionMediaSourceExternalSyntheticLambda0(ServerSideAdInsertionMediaSourceMediaPeriodImpl serverSideAdInsertionMediaSourceMediaPeriodImpl) {
        this.write = serverSideAdInsertionMediaSourceMediaPeriodImpl;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl
    public final boolean RemoteActionCompatParcelizer(String str) {
        return this.write.RemoteActionCompatParcelizer(str);
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl
    public final McqIndex read(String str) {
        if (parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str)) {
            return null;
        }
        McqIndex mcqIndex = read.get(str);
        if (mcqIndex != null) {
            return mcqIndex;
        }
        McqIndex mcqIndex2 = this.write.read(str);
        if (mcqIndex2 != null) {
            read.put(str, mcqIndex2);
        }
        return mcqIndex2;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl
    public final void write(McqIndex mcqIndex) {
        if (mcqIndex == null) {
            return;
        }
        read.remove(mcqIndex.getMcqId());
        this.write.write(mcqIndex);
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl
    public final void IconCompatParcelizer(McqIndex mcqIndex, String str, String str2) {
        this.write.IconCompatParcelizer(mcqIndex, str, str2);
    }

    public static void write() {
        read.evictAll();
        IconCompatParcelizer.evictAll();
    }

    public static void write(String str) {
        read.remove(str);
    }
}
