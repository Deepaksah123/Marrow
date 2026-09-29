package kotlin;

import com.marrow2.core.sync.PaginatedSyncTask;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdabandwidthSample0<T> {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static <T> void read(PaginatedSyncTask<T> paginatedSyncTask, Allocator allocator) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        write = i2 % 128;
        int i3 = i2 % 2;
        paginatedSyncTask.eventBus = allocator;
        if (i3 != 0) {
            throw null;
        }
    }
}
