package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
abstract class DownloadManagerTask<T, B> {
    abstract T AudioAttributesCompatParcelizer(Object obj);

    abstract int IconCompatParcelizer(T t);

    abstract T IconCompatParcelizer(T t, T t2);

    abstract void IconCompatParcelizer(T t, getRetryDelayMillis getretrydelaymillis) throws IOException;

    abstract int RemoteActionCompatParcelizer(T t);

    abstract void RemoteActionCompatParcelizer(Object obj, T t);

    abstract void RemoteActionCompatParcelizer(T t, getRetryDelayMillis getretrydelaymillis) throws IOException;

    abstract void write(Object obj);

    DownloadManagerTask() {
    }
}
