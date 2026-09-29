package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
interface setNotMetRequirements<T> {
    int AudioAttributesCompatParcelizer(T t);

    void AudioAttributesCompatParcelizer(T t, T t2);

    void AudioAttributesCompatParcelizer(T t, getRetryDelayMillis getretrydelaymillis) throws IOException;

    int IconCompatParcelizer(T t);

    void RemoteActionCompatParcelizer(T t);

    boolean RemoteActionCompatParcelizer(T t, T t2);

    T read();

    boolean write(T t);
}
