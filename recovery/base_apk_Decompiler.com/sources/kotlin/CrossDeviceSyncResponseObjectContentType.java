package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public interface CrossDeviceSyncResponseObjectContentType<T, K> {
    K write(T t);

    Iterator<T> write();
}
