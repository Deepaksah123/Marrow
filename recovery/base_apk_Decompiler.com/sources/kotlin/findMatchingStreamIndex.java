package kotlin;

import android.util.LruCache;
import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.pearl.PearlMini;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class findMatchingStreamIndex implements ServerSideAdInsertionMediaSourceSharedMediaPeriod {
    private static LruCache<String, Pearl> RemoteActionCompatParcelizer = new LruCache<>(100);
    private static HashMap<String, String[][]> write = new HashMap<>(2);
    private ServerSideAdInsertionMediaSourceSharedMediaPeriod IconCompatParcelizer;

    @setSdkPayload
    public findMatchingStreamIndex(ServerSideAdInsertionMediaSourceSharedMediaPeriod serverSideAdInsertionMediaSourceSharedMediaPeriod) {
        this.IconCompatParcelizer = serverSideAdInsertionMediaSourceSharedMediaPeriod;
    }

    public static void IconCompatParcelizer() {
        RemoteActionCompatParcelizer.evictAll();
        write.clear();
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceSharedMediaPeriod
    public final PearlMini IconCompatParcelizer(String str) {
        return this.IconCompatParcelizer.IconCompatParcelizer(str);
    }
}
