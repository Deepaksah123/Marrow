package kotlin;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public interface onAvailableCommandsChanged {

    public interface write {
        Bitmap AudioAttributesCompatParcelizer(int i, int i2, Bitmap.Config config);

        void AudioAttributesCompatParcelizer(byte[] bArr);

        void AudioAttributesCompatParcelizer(int[] iArr);

        int[] IconCompatParcelizer(int i);

        void read(Bitmap bitmap);

        byte[] write(int i);
    }

    int AudioAttributesCompatParcelizer();

    int AudioAttributesImplApi21Parcelizer();

    Bitmap AudioAttributesImplApi26Parcelizer();

    ByteBuffer IconCompatParcelizer();

    int MediaBrowserCompatItemReceiver();

    void RemoteActionCompatParcelizer();

    void read();

    int write();

    void write(Bitmap.Config config);
}
