package kotlin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class accessgetFALSEcp {
    private static final _fromInteger<write> RemoteActionCompatParcelizer = _fromInteger.RemoteActionCompatParcelizer();
    private static final Object write = new Object();
    private static write IconCompatParcelizer = null;

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030 A[Catch: all -> 0x0012, IOException -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:9:0x000c, B:16:0x0019, B:23:0x0030, B:35:0x0043, B:37:0x0049, B:38:0x004f, B:40:0x0051, B:46:0x0074, B:52:0x0097, B:53:0x009b, B:55:0x00ac, B:64:0x00bd, B:66:0x00c3, B:69:0x00c8, B:81:0x00e0, B:84:0x00e6, B:87:0x00ed, B:89:0x00f7, B:94:0x0103, B:95:0x0107, B:91:0x00fd, B:58:0x00b3, B:59:0x00b7, B:97:0x0109, B:98:0x010f, B:33:0x0041, B:32:0x003e), top: B:104:0x000c, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0049 A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:9:0x000c, B:16:0x0019, B:23:0x0030, B:35:0x0043, B:37:0x0049, B:38:0x004f, B:40:0x0051, B:46:0x0074, B:52:0x0097, B:53:0x009b, B:55:0x00ac, B:64:0x00bd, B:66:0x00c3, B:69:0x00c8, B:81:0x00e0, B:84:0x00e6, B:87:0x00ed, B:89:0x00f7, B:94:0x0103, B:95:0x0107, B:91:0x00fd, B:58:0x00b3, B:59:0x00b7, B:97:0x0109, B:98:0x010f, B:33:0x0041, B:32:0x003e), top: B:104:0x000c, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0051 A[Catch: all -> 0x0012, TryCatch #1 {, blocks: (B:9:0x000c, B:16:0x0019, B:23:0x0030, B:35:0x0043, B:37:0x0049, B:38:0x004f, B:40:0x0051, B:46:0x0074, B:52:0x0097, B:53:0x009b, B:55:0x00ac, B:64:0x00bd, B:66:0x00c3, B:69:0x00c8, B:81:0x00e0, B:84:0x00e6, B:87:0x00ed, B:89:0x00f7, B:94:0x0103, B:95:0x0107, B:91:0x00fd, B:58:0x00b3, B:59:0x00b7, B:97:0x0109, B:98:0x010f, B:33:0x0041, B:32:0x003e), top: B:104:0x000c, inners: #0, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static o.accessgetFALSEcp.write read(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.accessgetFALSEcp.read(android.content.Context, boolean):o.accessgetFALSEcp$write");
    }

    private static write RemoteActionCompatParcelizer(int i, boolean z, boolean z2, boolean z3) {
        write writeVar = new write(i, z, z2, z3);
        IconCompatParcelizer = writeVar;
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(writeVar);
        return IconCompatParcelizer;
    }

    private static long write(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return IconCompatParcelizer.AudioAttributesCompatParcelizer(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    static class read {
        final long AudioAttributesCompatParcelizer;
        final int RemoteActionCompatParcelizer;
        final int read;
        final long write;

        read(int i, int i2, long j, long j2) {
            this.read = i;
            this.RemoteActionCompatParcelizer = i2;
            this.AudioAttributesCompatParcelizer = j;
            this.write = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return this.RemoteActionCompatParcelizer == readVar.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == readVar.AudioAttributesCompatParcelizer && this.read == readVar.read && this.write == readVar.write;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.RemoteActionCompatParcelizer), Long.valueOf(this.AudioAttributesCompatParcelizer), Integer.valueOf(this.read), Long.valueOf(this.write));
        }

        final void AudioAttributesCompatParcelizer(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.read);
                dataOutputStream.writeInt(this.RemoteActionCompatParcelizer);
                dataOutputStream.writeLong(this.AudioAttributesCompatParcelizer);
                dataOutputStream.writeLong(this.write);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        static read RemoteActionCompatParcelizer(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                read readVar = new read(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return readVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static class write {
        final int AudioAttributesCompatParcelizer;
        private final boolean IconCompatParcelizer;
        private final boolean read;
        private final boolean write;

        write(int i, boolean z, boolean z2, boolean z3) {
            this.AudioAttributesCompatParcelizer = i;
            this.write = z2;
            this.read = z;
            this.IconCompatParcelizer = z3;
        }
    }

    static class IconCompatParcelizer {
        static PackageInfo AudioAttributesCompatParcelizer(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }
}
