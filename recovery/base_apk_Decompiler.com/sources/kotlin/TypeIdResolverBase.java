package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeIdResolverBase extends _collectAndResolveByTypeId {
    private SubTypeValidator AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final Context IconCompatParcelizer;
    private AssetFileDescriptor RemoteActionCompatParcelizer;
    private long read;
    private InputStream write;

    public static class IconCompatParcelizer extends idResolver {
        @Deprecated
        public IconCompatParcelizer(String str) {
            super(str, null, 2000);
        }

        public IconCompatParcelizer(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///".concat(String.valueOf(i)));
    }

    public TypeIdResolverBase(Context context) {
        super(false);
        this.IconCompatParcelizer = context.getApplicationContext();
    }

    @Override // kotlin._hasTypeResolver
    public final long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws IconCompatParcelizer {
        this.AudioAttributesCompatParcelizer = subTypeValidator;
        write();
        AssetFileDescriptor assetFileDescriptorWrite = write(this.IconCompatParcelizer, subTypeValidator);
        this.RemoteActionCompatParcelizer = assetFileDescriptorWrite;
        long length = assetFileDescriptorWrite.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.RemoteActionCompatParcelizer.getFileDescriptor());
        this.write = fileInputStream;
        if (length != -1) {
            try {
                if (subTypeValidator.AudioAttributesImplApi21Parcelizer > length) {
                    throw new IconCompatParcelizer(null, null, 2008);
                }
            } catch (IconCompatParcelizer e) {
                throw e;
            } catch (IOException e2) {
                throw new IconCompatParcelizer(null, e2, 2000);
            }
        }
        long startOffset = this.RemoteActionCompatParcelizer.getStartOffset();
        long jSkip = fileInputStream.skip(subTypeValidator.AudioAttributesImplApi21Parcelizer + startOffset) - startOffset;
        if (jSkip != subTypeValidator.AudioAttributesImplApi21Parcelizer) {
            throw new IconCompatParcelizer(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.read = -1L;
            } else {
                long size = channel.size() - channel.position();
                this.read = size;
                if (size < 0) {
                    throw new IconCompatParcelizer(null, null, 2008);
                }
            }
        } else {
            long j = length - jSkip;
            this.read = j;
            if (j < 0) {
                throw new idResolver(2008);
            }
        }
        if (subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1) {
            long j2 = this.read;
            this.read = j2 == -1 ? subTypeValidator.MediaBrowserCompatCustomActionResultReceiver : Math.min(j2, subTypeValidator.MediaBrowserCompatCustomActionResultReceiver);
        }
        this.AudioAttributesImplBaseParcelizer = true;
        IconCompatParcelizer(subTypeValidator);
        return subTypeValidator.MediaBrowserCompatCustomActionResultReceiver != -1 ? subTypeValidator.MediaBrowserCompatCustomActionResultReceiver : this.read;
    }

    private static AssetFileDescriptor write(Context context, SubTypeValidator subTypeValidator) throws IconCompatParcelizer {
        String host;
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = subTypeValidator.AudioAttributesImplBaseParcelizer.normalizeScheme();
        if (TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = RemoteActionCompatParcelizer(pathSegments.get(0));
            } else {
                StringBuilder sb = new StringBuilder("rawresource:// URI must have exactly one path element, found ");
                sb.append(pathSegments.size());
                throw new IconCompatParcelizer(sb.toString());
            }
        } else if (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
            String strSubstring = (String) buildTypeSerializer.IconCompatParcelizer(uriNormalizeScheme.getPath());
            if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            if (TextUtils.isEmpty(uriNormalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = uriNormalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IconCompatParcelizer("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
                }
            }
            if (strSubstring.matches("\\d+")) {
                identifier = RemoteActionCompatParcelizer(strSubstring);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(host);
                sb2.append(":");
                sb2.append(strSubstring);
                identifier = resourcesForApplication.getIdentifier(sb2.toString(), "raw", null);
                if (identifier == 0) {
                    throw new IconCompatParcelizer("Resource not found.", null, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Unsupported URI scheme (");
            sb3.append(uriNormalizeScheme.getScheme());
            sb3.append("). Only android.resource is supported.");
            throw new IconCompatParcelizer(sb3.toString(), null, 1004);
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new IconCompatParcelizer("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new IconCompatParcelizer(null, e2, PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND);
        }
    }

    private static int RemoteActionCompatParcelizer(String str) throws IconCompatParcelizer {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IconCompatParcelizer("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // kotlin.JsonNullFormatVisitor
    public final int AudioAttributesCompatParcelizer(byte[] bArr, int i, int i2) throws IconCompatParcelizer {
        if (i2 == 0) {
            return 0;
        }
        long j = this.read;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new IconCompatParcelizer(null, e, 2000);
            }
        }
        int i3 = ((InputStream) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.read == -1) {
                return -1;
            }
            throw new IconCompatParcelizer("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.read;
        if (j2 != -1) {
            this.read = j2 - ((long) i3);
        }
        AudioAttributesCompatParcelizer(i3);
        return i3;
    }

    @Override // kotlin._hasTypeResolver
    public final Uri IconCompatParcelizer() {
        SubTypeValidator subTypeValidator = this.AudioAttributesCompatParcelizer;
        if (subTypeValidator != null) {
            return subTypeValidator.AudioAttributesImplBaseParcelizer;
        }
        return null;
    }

    @Override // kotlin._hasTypeResolver
    public final void AudioAttributesCompatParcelizer() throws IconCompatParcelizer {
        this.AudioAttributesCompatParcelizer = null;
        try {
            try {
                InputStream inputStream = this.write;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.write = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.RemoteActionCompatParcelizer;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.RemoteActionCompatParcelizer = null;
                        if (this.AudioAttributesImplBaseParcelizer) {
                            this.AudioAttributesImplBaseParcelizer = false;
                            RemoteActionCompatParcelizer();
                        }
                    }
                } catch (IOException e) {
                    throw new IconCompatParcelizer(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new IconCompatParcelizer(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.write = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.RemoteActionCompatParcelizer;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.RemoteActionCompatParcelizer = null;
                    if (this.AudioAttributesImplBaseParcelizer) {
                        this.AudioAttributesImplBaseParcelizer = false;
                        RemoteActionCompatParcelizer();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new IconCompatParcelizer(null, e3, 2000);
                }
            } finally {
                this.RemoteActionCompatParcelizer = null;
                if (this.AudioAttributesImplBaseParcelizer) {
                    this.AudioAttributesImplBaseParcelizer = false;
                    RemoteActionCompatParcelizer();
                }
            }
        }
    }
}
