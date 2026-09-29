package kotlin;

import android.media.MediaDrmException;
import androidx.media3.common.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.SimpleBeanPropertyFilter1;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeWrappedSerializer implements SimpleBeanPropertyFilter1 {
    @Override // kotlin.SimpleBeanPropertyFilter1
    public final int AudioAttributesCompatParcelizer() {
        return 1;
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void AudioAttributesCompatParcelizer(SimpleBeanPropertyFilter1.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void AudioAttributesCompatParcelizer(byte[] bArr) {
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void write() {
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final byte[] read() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final SimpleBeanPropertyFilter1.read AudioAttributesCompatParcelizer(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> map) {
        throw new IllegalStateException();
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final byte[] AudioAttributesCompatParcelizer(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final SimpleBeanPropertyFilter1.IconCompatParcelizer RemoteActionCompatParcelizer() {
        throw new IllegalStateException();
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void read(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final Map<String, String> write(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final boolean RemoteActionCompatParcelizer(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final void RemoteActionCompatParcelizer(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // kotlin.SimpleBeanPropertyFilter1
    public final handleMissingId IconCompatParcelizer(byte[] bArr) {
        throw new IllegalStateException();
    }
}
