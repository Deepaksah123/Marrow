package kotlin;

import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemRequestMetadata implements onShuffleModeEnabledChanged<InputStream> {
    private final setSubtitleConfigurations RemoteActionCompatParcelizer;

    @Override // kotlin.onShuffleModeEnabledChanged
    public final /* synthetic */ boolean write(InputStream inputStream, File file, r8lambda_r106e6zya8q8i_eKUnQWRolPk r8lambda_r106e6zya8q8i_ekunqwrolpk) {
        return read(inputStream, file);
    }

    public MediaItemRequestMetadata(setSubtitleConfigurations setsubtitleconfigurations) {
        this.RemoteActionCompatParcelizer = setsubtitleconfigurations;
    }

    private boolean read(InputStream inputStream, File file) throws Throwable {
        byte[] bArr = (byte[]) this.RemoteActionCompatParcelizer.IconCompatParcelizer(C.DEFAULT_BUFFER_SEGMENT_SIZE, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, i);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.RemoteActionCompatParcelizer.read(bArr);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    this.RemoteActionCompatParcelizer.read(bArr);
                    throw th;
                }
            }
            fileOutputStream2.close();
            try {
                fileOutputStream2.close();
            } catch (IOException unused4) {
            }
            this.RemoteActionCompatParcelizer.read(bArr);
            return true;
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
