package kotlin;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import kotlin.MediaItemClippingProperties;
import kotlin.setWidth;

/* JADX INFO: loaded from: classes2.dex */
public final class setNullableScheme implements MediaItemClippingProperties {
    private setWidth IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final File read;
    private final setStartsAtKeyFrame AudioAttributesCompatParcelizer = new setStartsAtKeyFrame();
    private final setKeySetId write = new setKeySetId();

    public static MediaItemClippingProperties read(File file, long j) {
        return new setNullableScheme(file, j);
    }

    @Deprecated
    private setNullableScheme(File file, long j) {
        this.read = file;
        this.RemoteActionCompatParcelizer = j;
    }

    private setWidth write() throws IOException {
        setWidth setwidth;
        synchronized (this) {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = setWidth.IconCompatParcelizer(this.read, this.RemoteActionCompatParcelizer);
            }
            setwidth = this.IconCompatParcelizer;
        }
        return setwidth;
    }

    @Override // kotlin.MediaItemClippingProperties
    public final File RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged) {
        String strIconCompatParcelizer = this.write.IconCompatParcelizer(onvolumechanged);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(onvolumechanged);
        }
        try {
            setWidth.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = write().write(strIconCompatParcelizer);
            if (remoteActionCompatParcelizerWrite != null) {
                return remoteActionCompatParcelizerWrite.read();
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // kotlin.MediaItemClippingProperties
    public final void write(onVolumeChanged onvolumechanged, MediaItemClippingProperties.write writeVar) {
        String strIconCompatParcelizer = this.write.IconCompatParcelizer(onvolumechanged);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(strIconCompatParcelizer);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(onvolumechanged);
            }
            try {
                setWidth setwidthWrite = write();
                if (setwidthWrite.write(strIconCompatParcelizer) == null) {
                    setWidth.write writeVarAudioAttributesCompatParcelizer = setwidthWrite.AudioAttributesCompatParcelizer(strIconCompatParcelizer);
                    if (writeVarAudioAttributesCompatParcelizer == null) {
                        StringBuilder sb = new StringBuilder("Had two simultaneous puts for: ");
                        sb.append(strIconCompatParcelizer);
                        throw new IllegalStateException(sb.toString());
                    }
                    try {
                        if (writeVar.AudioAttributesCompatParcelizer(writeVarAudioAttributesCompatParcelizer.read())) {
                            writeVarAudioAttributesCompatParcelizer.IconCompatParcelizer();
                        }
                        writeVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                    } catch (Throwable th) {
                        writeVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                        throw th;
                    }
                }
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } finally {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(strIconCompatParcelizer);
        }
    }
}
