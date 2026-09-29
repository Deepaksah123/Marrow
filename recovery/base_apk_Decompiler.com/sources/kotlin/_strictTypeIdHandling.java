package kotlin;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.PlaybackException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes2.dex */
public final class _strictTypeIdHandling extends _collectAndResolveByTypeId {
    private final ContentResolver AudioAttributesCompatParcelizer;
    private Uri AudioAttributesImplApi21Parcelizer;
    private long IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private AssetFileDescriptor read;
    private FileInputStream write;

    public static class write extends idResolver {
        public write(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public _strictTypeIdHandling(Context context) {
        super(false);
        this.AudioAttributesCompatParcelizer = context.getContentResolver();
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws write {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = subTypeValidator.AudioAttributesImplBaseParcelizer.normalizeScheme();
            this.AudioAttributesImplApi21Parcelizer = uriNormalizeScheme;
            write();
            if ("content".equals(uriNormalizeScheme.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.AudioAttributesCompatParcelizer.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.AudioAttributesCompatParcelizer.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.read = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                StringBuilder sb = new StringBuilder("Could not open file descriptor for: ");
                sb.append(uriNormalizeScheme);
                throw new write(new IOException(sb.toString()), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.write = fileInputStream;
            if (length != -1 && subTypeValidator.AudioAttributesImplApi21Parcelizer > length) {
                throw new write(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(subTypeValidator.AudioAttributesImplApi21Parcelizer + startOffset) - startOffset;
            if (jSkip != subTypeValidator.AudioAttributesImplApi21Parcelizer) {
                throw new write(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.IconCompatParcelizer = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.IconCompatParcelizer = jPosition;
                    if (jPosition < 0) {
                        throw new write(null, 2008);
                    }
                }
            } else {
                long j = length - jSkip;
                this.IconCompatParcelizer = j;
                if (j < 0) {
                    throw new write(null, 2008);
                }
            }
            if (subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1) {
                long j2 = this.IconCompatParcelizer;
                this.IconCompatParcelizer = j2 == -1 ? subTypeValidator.MediaBrowserCompatCustomActionResultReceiver : Math.min(j2, subTypeValidator.MediaBrowserCompatCustomActionResultReceiver);
            }
            this.RemoteActionCompatParcelizer = true;
            IconCompatParcelizer(subTypeValidator);
            return subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1 ? subTypeValidator.MediaBrowserCompatCustomActionResultReceiver : this.IconCompatParcelizer;
        } catch (write e) {
            throw e;
        } catch (IOException e2) {
            throw new write(e2, e2 instanceof FileNotFoundException ? PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND : 2000);
        }
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws write {
        if (i2 == 0) {
            return 0;
        }
        long j = this.IconCompatParcelizer;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new write(e, 2000);
            }
        }
        int i3 = ((FileInputStream) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.IconCompatParcelizer;
        if (j2 != -1) {
            this.IconCompatParcelizer = j2 - ((long) i3);
        }
        AudioAttributesCompatParcelizer(i3);
        return i3;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() throws write {
        this.AudioAttributesImplApi21Parcelizer = null;
        try {
            try {
                FileInputStream fileInputStream = this.write;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.write = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.read;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.read = null;
                        if (this.RemoteActionCompatParcelizer) {
                            this.RemoteActionCompatParcelizer = false;
                            RemoteActionCompatParcelizer();
                        }
                    }
                } catch (IOException e) {
                    throw new write(e, 2000);
                }
            } catch (IOException e2) {
                throw new write(e2, 2000);
            }
        } catch (Throwable th) {
            this.write = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.read;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.read = null;
                    if (this.RemoteActionCompatParcelizer) {
                        this.RemoteActionCompatParcelizer = false;
                        RemoteActionCompatParcelizer();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new write(e3, 2000);
                }
            } finally {
                this.read = null;
                if (this.RemoteActionCompatParcelizer) {
                    this.RemoteActionCompatParcelizer = false;
                    RemoteActionCompatParcelizer();
                }
            }
        }
    }
}
