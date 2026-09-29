package kotlin;

import android.graphics.Bitmap;
import kotlin.onAvailableCommandsChanged;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadataMediaType implements onAvailableCommandsChanged.write {
    private final access3900 read;
    private final setSubtitleConfigurations write;

    public MediaMetadataMediaType(access3900 access3900Var, setSubtitleConfigurations setsubtitleconfigurations) {
        this.read = access3900Var;
        this.write = setsubtitleconfigurations;
    }

    @Override // o.onAvailableCommandsChanged.write
    public final Bitmap AudioAttributesCompatParcelizer(int i, int i2, Bitmap.Config config) {
        return this.read.RemoteActionCompatParcelizer(i, i2, config);
    }

    @Override // o.onAvailableCommandsChanged.write
    public final void read(Bitmap bitmap) {
        this.read.write(bitmap);
    }

    @Override // o.onAvailableCommandsChanged.write
    public final byte[] write(int i) {
        setSubtitleConfigurations setsubtitleconfigurations = this.write;
        if (setsubtitleconfigurations == null) {
            return new byte[i];
        }
        return (byte[]) setsubtitleconfigurations.IconCompatParcelizer(i, byte[].class);
    }

    @Override // o.onAvailableCommandsChanged.write
    public final void AudioAttributesCompatParcelizer(byte[] bArr) {
        setSubtitleConfigurations setsubtitleconfigurations = this.write;
        if (setsubtitleconfigurations == null) {
            return;
        }
        setsubtitleconfigurations.read(bArr);
    }

    @Override // o.onAvailableCommandsChanged.write
    public final int[] IconCompatParcelizer(int i) {
        setSubtitleConfigurations setsubtitleconfigurations = this.write;
        if (setsubtitleconfigurations == null) {
            return new int[i];
        }
        return (int[]) setsubtitleconfigurations.IconCompatParcelizer(i, int[].class);
    }

    @Override // o.onAvailableCommandsChanged.write
    public final void AudioAttributesCompatParcelizer(int[] iArr) {
        setSubtitleConfigurations setsubtitleconfigurations = this.write;
        if (setsubtitleconfigurations == null) {
            return;
        }
        setsubtitleconfigurations.read(iArr);
    }
}
