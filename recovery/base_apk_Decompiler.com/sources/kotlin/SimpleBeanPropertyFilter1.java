package kotlin;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.media3.common.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public interface SimpleBeanPropertyFilter1 {

    public interface AudioAttributesCompatParcelizer {
        SimpleBeanPropertyFilter1 AudioAttributesCompatParcelizer(UUID uuid);
    }

    public interface RemoteActionCompatParcelizer {
        void read(byte[] bArr, int i);
    }

    int AudioAttributesCompatParcelizer();

    read AudioAttributesCompatParcelizer(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) throws NotProvisionedException;

    void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void AudioAttributesCompatParcelizer(byte[] bArr);

    default void AudioAttributesCompatParcelizer(byte[] bArr, modifyArraySerializer modifyarrayserializer) {
    }

    byte[] AudioAttributesCompatParcelizer(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    handleMissingId IconCompatParcelizer(byte[] bArr) throws MediaCryptoException;

    IconCompatParcelizer RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2);

    boolean RemoteActionCompatParcelizer(byte[] bArr, String str);

    void read(byte[] bArr) throws DeniedByServerException;

    byte[] read() throws MediaDrmException;

    Map<String, String> write(byte[] bArr);

    void write();

    public static final class read {
        private final byte[] AudioAttributesCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final String write;

        public read(byte[] bArr, String str, int i) {
            this.AudioAttributesCompatParcelizer = bArr;
            this.write = str;
            this.RemoteActionCompatParcelizer = i;
        }

        public final byte[] AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.write;
        }
    }

    public static final class IconCompatParcelizer {
        private final byte[] RemoteActionCompatParcelizer;
        private final String read;

        public IconCompatParcelizer(byte[] bArr, String str) {
            this.RemoteActionCompatParcelizer = bArr;
            this.read = str;
        }

        public final byte[] read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.read;
        }
    }
}
