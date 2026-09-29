package kotlin;

import java.util.Map;
import kotlin.setMinRetryCount;

/* JADX INFO: loaded from: classes3.dex */
final class resumeDownloads implements removeAllDownloads {
    resumeDownloads() {
    }

    @Override // kotlin.removeAllDownloads
    public final setMinRetryCount.read<?, ?> write(Object obj) {
        return ((setMinRetryCount) obj).AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.removeAllDownloads
    public final Map<?, ?> RemoteActionCompatParcelizer(Object obj) {
        return (setMaxParallelDownloads) obj;
    }

    @Override // kotlin.removeAllDownloads
    public final Object AudioAttributesCompatParcelizer(Object obj) {
        ((setMaxParallelDownloads) obj).write();
        return obj;
    }

    @Override // kotlin.removeAllDownloads
    public final Object RemoteActionCompatParcelizer(Object obj, Object obj2) {
        return IconCompatParcelizer(obj, obj2);
    }

    private static <K, V> setMaxParallelDownloads<K, V> IconCompatParcelizer(Object obj, Object obj2) {
        setMaxParallelDownloads<K, V> setmaxparalleldownloads = (setMaxParallelDownloads) obj;
        setMaxParallelDownloads<K, V> setmaxparalleldownloads2 = (setMaxParallelDownloads) obj2;
        if (!setmaxparalleldownloads2.isEmpty()) {
            if (!setmaxparalleldownloads.IconCompatParcelizer()) {
                setmaxparalleldownloads = setmaxparalleldownloads.read();
            }
            setmaxparalleldownloads.write(setmaxparalleldownloads2);
        }
        return setmaxparalleldownloads;
    }

    @Override // kotlin.removeAllDownloads
    public final int IconCompatParcelizer(int i, Object obj, Object obj2) {
        return write(i, obj, obj2);
    }

    private static <K, V> int write(int i, Object obj, Object obj2) {
        setMaxParallelDownloads setmaxparalleldownloads = (setMaxParallelDownloads) obj;
        setMinRetryCount setminretrycount = (setMinRetryCount) obj2;
        int iWrite = 0;
        if (setmaxparalleldownloads.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : setmaxparalleldownloads.entrySet()) {
            iWrite += setminretrycount.write(i, entry.getKey(), entry.getValue());
        }
        return iWrite;
    }
}
