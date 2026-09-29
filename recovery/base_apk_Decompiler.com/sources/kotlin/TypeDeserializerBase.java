package kotlin;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeDeserializerBase extends _collectAndResolveByTypeId {
    private RandomAccessFile AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private long read;
    private Uri write;

    public static class IconCompatParcelizer extends idResolver {
        public IconCompatParcelizer(Throwable th, int i) {
            super(th, i);
        }

        public IconCompatParcelizer(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public TypeDeserializerBase() {
        super(false);
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws IconCompatParcelizer {
        Uri uri = subTypeValidator.AudioAttributesImplBaseParcelizer;
        this.write = uri;
        write();
        RandomAccessFile randomAccessFileRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(uri);
        this.AudioAttributesCompatParcelizer = randomAccessFileRemoteActionCompatParcelizer;
        try {
            randomAccessFileRemoteActionCompatParcelizer.seek(subTypeValidator.AudioAttributesImplApi21Parcelizer);
            long length = subTypeValidator.MediaBrowserCompatCustomActionResultReceiver == -1 ? this.AudioAttributesCompatParcelizer.length() - subTypeValidator.AudioAttributesImplApi21Parcelizer : subTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
            this.read = length;
            if (length < 0) {
                throw new IconCompatParcelizer(null, null, 2008);
            }
            this.IconCompatParcelizer = true;
            IconCompatParcelizer(subTypeValidator);
            return this.read;
        } catch (IOException e) {
            throw new IconCompatParcelizer(e, 2000);
        }
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IconCompatParcelizer {
        if (i2 == 0) {
            return 0;
        }
        if (this.read == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).read(bArr, i, (int) Math.min(this.read, i2));
            if (i3 > 0) {
                this.read -= (long) i3;
                AudioAttributesCompatParcelizer(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new IconCompatParcelizer(e, 2000);
        }
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        return this.write;
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() throws IconCompatParcelizer {
        this.write = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.AudioAttributesCompatParcelizer;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new IconCompatParcelizer(e, 2000);
            }
        } finally {
            this.AudioAttributesCompatParcelizer = null;
            if (this.IconCompatParcelizer) {
                this.IconCompatParcelizer = false;
                RemoteActionCompatParcelizer();
            }
        }
    }

    private static RandomAccessFile RemoteActionCompatParcelizer(Uri uri) throws IconCompatParcelizer {
        int i = PlaybackException.ERROR_CODE_IO_NO_PERMISSION;
        try {
            return new RandomAccessFile((String) buildTypeSerializer.IconCompatParcelizer(uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new IconCompatParcelizer(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 21 || !read.RemoteActionCompatParcelizer(e.getCause())) {
                i = PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND;
            }
            throw new IconCompatParcelizer(e, i);
        } catch (SecurityException e2) {
            throw new IconCompatParcelizer(e2, PlaybackException.ERROR_CODE_IO_NO_PERMISSION);
        } catch (RuntimeException e3) {
            throw new IconCompatParcelizer(e3, 2000);
        }
    }

    static final class read {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean RemoteActionCompatParcelizer(Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }
}
