package kotlin;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;
import kotlin.getValueClassBoxConverter;

/* JADX INFO: loaded from: classes4.dex */
public final class PackageVersion {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final Executor AudioAttributesImplApi26Parcelizer;
    private final getValueClassBoxConverter.RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final AssetManager IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private javaMemberIsRequired[] MediaBrowserCompatItemReceiver;
    private byte[] MediaDescriptionCompat;
    private final File write;
    private boolean read = false;
    private final byte[] RemoteActionCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();

    private void write(final int i, final Object obj) {
        this.AudioAttributesImplApi26Parcelizer.execute(new Runnable() { // from class: o.findValueClassReturnType
            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.read(i, obj);
            }
        });
    }

    final /* synthetic */ void read(int i, Object obj) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(i, obj);
    }

    public PackageVersion(AssetManager assetManager, Executor executor, getValueClassBoxConverter.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str, String str2, String str3, File file) {
        this.IconCompatParcelizer = assetManager;
        this.AudioAttributesImplApi26Parcelizer = executor;
        this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = str3;
        this.write = file;
    }

    public final boolean IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            write(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.write.exists()) {
            if (!this.write.canWrite()) {
                write(4, null);
                return false;
            }
        } else {
            try {
                if (!this.write.createNewFile()) {
                    write(4, null);
                    return false;
                }
            } catch (IOException unused) {
                write(4, null);
                return false;
            }
        }
        this.read = true;
        return true;
    }

    private void write() {
        if (!this.read) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public final PackageVersion read() {
        PackageVersion packageVersionIconCompatParcelizer;
        write();
        if (this.RemoteActionCompatParcelizer != null) {
            InputStream inputStream = read(this.IconCompatParcelizer);
            if (inputStream != null) {
                this.MediaBrowserCompatItemReceiver = read(inputStream);
            }
            javaMemberIsRequired[] javamemberisrequiredArr = this.MediaBrowserCompatItemReceiver;
            if (javamemberisrequiredArr != null && AudioAttributesImplBaseParcelizer() && (packageVersionIconCompatParcelizer = IconCompatParcelizer(javamemberisrequiredArr, this.RemoteActionCompatParcelizer)) != null) {
                return packageVersionIconCompatParcelizer;
            }
        }
        return this;
    }

    private InputStream IconCompatParcelizer(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(5, null);
            }
            return null;
        }
    }

    private InputStream read(AssetManager assetManager) {
        try {
            return IconCompatParcelizer(assetManager, this.AudioAttributesImplApi21Parcelizer);
        } catch (FileNotFoundException e) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(6, e);
            return null;
        } catch (IOException e2) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(7, e2);
            return null;
        }
    }

    private javaMemberIsRequired[] read(InputStream inputStream) {
        try {
            try {
                javaMemberIsRequired[] javamemberisrequiredArrRemoteActionCompatParcelizer = fromBoolean.RemoteActionCompatParcelizer(inputStream, fromBoolean.IconCompatParcelizer(inputStream, fromBoolean.AudioAttributesCompatParcelizer), this.AudioAttributesCompatParcelizer);
                try {
                    inputStream.close();
                    return javamemberisrequiredArrRemoteActionCompatParcelizer;
                } catch (IOException e) {
                    this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(7, e);
                    return javamemberisrequiredArrRemoteActionCompatParcelizer;
                }
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(7, e2);
                }
            }
        } catch (IOException e3) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(7, e3);
            return null;
        } catch (IllegalStateException e4) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(8, e4);
            return null;
        }
    }

    private PackageVersion IconCompatParcelizer(javaMemberIsRequired[] javamemberisrequiredArr, byte[] bArr) {
        InputStream inputStreamIconCompatParcelizer;
        try {
            inputStreamIconCompatParcelizer = IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
        } catch (FileNotFoundException e) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(9, e);
        } catch (IOException e2) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(7, e2);
        } catch (IllegalStateException e3) {
            this.MediaBrowserCompatItemReceiver = null;
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(8, e3);
        }
        if (inputStreamIconCompatParcelizer == null) {
            if (inputStreamIconCompatParcelizer != null) {
                inputStreamIconCompatParcelizer.close();
            }
            return null;
        }
        try {
            this.MediaBrowserCompatItemReceiver = fromBoolean.write(inputStreamIconCompatParcelizer, fromBoolean.IconCompatParcelizer(inputStreamIconCompatParcelizer, fromBoolean.RemoteActionCompatParcelizer), bArr, javamemberisrequiredArr);
            if (inputStreamIconCompatParcelizer != null) {
                inputStreamIconCompatParcelizer.close();
            }
            return this;
        } catch (Throwable th) {
            if (inputStreamIconCompatParcelizer != null) {
                try {
                    inputStreamIconCompatParcelizer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final PackageVersion AudioAttributesCompatParcelizer() {
        ByteArrayOutputStream byteArrayOutputStream;
        javaMemberIsRequired[] javamemberisrequiredArr = this.MediaBrowserCompatItemReceiver;
        byte[] bArr = this.RemoteActionCompatParcelizer;
        if (javamemberisrequiredArr != null && bArr != null) {
            write();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    fromBoolean.IconCompatParcelizer(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(7, e);
            } catch (IllegalStateException e2) {
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(8, e2);
            }
            if (!fromBoolean.IconCompatParcelizer(byteArrayOutputStream, bArr, javamemberisrequiredArr)) {
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(5, null);
                this.MediaBrowserCompatItemReceiver = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.MediaDescriptionCompat = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.MediaBrowserCompatItemReceiver = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean RemoteActionCompatParcelizer() {
        byte[] bArr = this.MediaDescriptionCompat;
        if (bArr == null) {
            return false;
        }
        write();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.write);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                ReflectionCacheBooleanTriState.IconCompatParcelizer(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                write(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                if (channel != null) {
                                    channel.close();
                                }
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.MediaDescriptionCompat = null;
                this.MediaBrowserCompatItemReceiver = null;
            }
        } catch (FileNotFoundException e) {
            write(6, e);
            return false;
        } catch (IOException e2) {
            write(7, e2);
            return false;
        }
    }

    private static byte[] MediaBrowserCompatCustomActionResultReceiver() {
        if (Build.VERSION.SDK_INT >= 31) {
            return accessgetEMPTYcp.MediaBrowserCompatItemReceiver;
        }
        int i = Build.VERSION.SDK_INT;
        if (i == 29 || i == 30) {
            return accessgetEMPTYcp.MediaBrowserCompatCustomActionResultReceiver;
        }
        return null;
    }

    private static boolean AudioAttributesImplBaseParcelizer() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
