package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
interface getPrimaryMember<T> {
    int AudioAttributesCompatParcelizer(T t);

    void AudioAttributesCompatParcelizer(T t, CollectorBase collectorBase) throws IOException;

    void AudioAttributesCompatParcelizer(T t, getGetter getgetter, asAnnotations asannotations) throws IOException;

    void IconCompatParcelizer(T t, T t2);

    void RemoteActionCompatParcelizer(T t);

    boolean RemoteActionCompatParcelizer(T t, T t2);

    int read(T t);

    T write();

    boolean write(T t);
}
