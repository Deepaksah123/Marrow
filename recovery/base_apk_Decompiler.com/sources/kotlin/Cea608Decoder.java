package kotlin;

import kotlin.invokeUpdateOutputInternal;
import kotlin.readFromInput;

/* JADX INFO: loaded from: classes3.dex */
public interface Cea608Decoder<V extends invokeUpdateOutputInternal, T> {

    public interface write {
        void AudioAttributesCompatParcelizer(int i);

        void RemoteActionCompatParcelizer();

        void read(int i, int i2);
    }

    int AudioAttributesCompatParcelizer(int i);

    void AudioAttributesCompatParcelizer(T[] tArr);

    void IconCompatParcelizer(write writeVar);

    void RemoteActionCompatParcelizer(int i);

    void RemoteActionCompatParcelizer(V v, int i);

    void RemoteActionCompatParcelizer(readFromInput.read<T> readVar);

    int read();

    void write(readFromInput.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer);
}
