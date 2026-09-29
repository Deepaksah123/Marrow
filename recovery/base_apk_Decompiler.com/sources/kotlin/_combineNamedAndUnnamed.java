package kotlin;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.exoplayer2.PlaybackException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class _combineNamedAndUnnamed extends _collectAndResolveByTypeId {
    private InputStream AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private Uri read;
    private final AssetManager write;

    public static final class RemoteActionCompatParcelizer extends idResolver {
        public RemoteActionCompatParcelizer(Throwable th, int i) {
            super(th, i);
        }
    }

    public _combineNamedAndUnnamed(Context context) {
        super(false);
        this.write = context.getAssets();
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws RemoteActionCompatParcelizer {
        try {
            Uri uri = subTypeValidator.AudioAttributesImplBaseParcelizer;
            this.read = uri;
            String strSubstring = (String) buildTypeSerializer.IconCompatParcelizer(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            write();
            InputStream inputStreamOpen = this.write.open(strSubstring, 1);
            this.AudioAttributesCompatParcelizer = inputStreamOpen;
            if (inputStreamOpen.skip(subTypeValidator.AudioAttributesImplApi21Parcelizer) < subTypeValidator.AudioAttributesImplApi21Parcelizer) {
                throw new RemoteActionCompatParcelizer(null, 2008);
            }
            if (subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1) {
                this.RemoteActionCompatParcelizer = subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
            } else {
                long jAvailable = this.AudioAttributesCompatParcelizer.available();
                this.RemoteActionCompatParcelizer = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.RemoteActionCompatParcelizer = -1L;
                }
            }
            this.IconCompatParcelizer = true;
            IconCompatParcelizer(subTypeValidator);
            return this.RemoteActionCompatParcelizer;
        } catch (RemoteActionCompatParcelizer e) {
            throw e;
        } catch (IOException e2) {
            throw new RemoteActionCompatParcelizer(e2, e2 instanceof FileNotFoundException ? PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws RemoteActionCompatParcelizer {
        if (i2 == 0) {
            return 0;
        }
        long j = this.RemoteActionCompatParcelizer;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RemoteActionCompatParcelizer(e, 2000);
            }
        }
        int i3 = ((InputStream) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.RemoteActionCompatParcelizer;
        if (j2 != -1) {
            this.RemoteActionCompatParcelizer = j2 - ((long) i3);
        }
        AudioAttributesCompatParcelizer(i3);
        return i3;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() throws RemoteActionCompatParcelizer {
        this.read = null;
        try {
            try {
                InputStream inputStream = this.AudioAttributesCompatParcelizer;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new RemoteActionCompatParcelizer(e, 2000);
            }
        } finally {
            this.AudioAttributesCompatParcelizer = null;
            if (this.IconCompatParcelizer) {
                this.IconCompatParcelizer = false;
                RemoteActionCompatParcelizer();
            }
        }
    }
}
