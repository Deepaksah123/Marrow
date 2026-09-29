package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class isParameterRequired implements Closeable {
    private final File AudioAttributesCompatParcelizer;
    private final FileLock IconCompatParcelizer;
    private final long MediaBrowserCompatCustomActionResultReceiver;
    private final FileChannel RemoteActionCompatParcelizer;
    private final File read;
    private final RandomAccessFile write;

    static class read extends File {
        public long write;

        public read(File file, String str) {
            super(file, str);
            this.write = -1L;
        }
    }

    isParameterRequired(File file, File file2) throws IOException {
        file.getPath();
        file2.getPath();
        this.read = file;
        this.AudioAttributesCompatParcelizer = file2;
        this.MediaBrowserCompatCustomActionResultReceiver = write(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.write = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.RemoteActionCompatParcelizer = channel;
            try {
                file3.getPath();
                this.IconCompatParcelizer = channel.lock();
                file3.getPath();
            } catch (IOException | Error | RuntimeException e) {
                RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e2) {
            RemoteActionCompatParcelizer(this.write);
            throw e2;
        }
    }

    final List<? extends File> write(Context context, String str, boolean z) throws IOException {
        List<read> listRemoteActionCompatParcelizer;
        this.read.getPath();
        if (!this.IconCompatParcelizer.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z && !write(context, this.read, this.MediaBrowserCompatCustomActionResultReceiver, str)) {
            try {
                listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, str);
            } catch (IOException unused) {
                List<read> listRemoteActionCompatParcelizer2 = this.RemoteActionCompatParcelizer();
                IconCompatParcelizer(context, str, IconCompatParcelizer(this.read), this.MediaBrowserCompatCustomActionResultReceiver, listRemoteActionCompatParcelizer2);
                listRemoteActionCompatParcelizer = listRemoteActionCompatParcelizer2;
            }
        } else {
            List<read> listRemoteActionCompatParcelizer22 = this.RemoteActionCompatParcelizer();
            IconCompatParcelizer(context, str, IconCompatParcelizer(this.read), this.MediaBrowserCompatCustomActionResultReceiver, listRemoteActionCompatParcelizer22);
            listRemoteActionCompatParcelizer = listRemoteActionCompatParcelizer22;
        }
        listRemoteActionCompatParcelizer.size();
        return listRemoteActionCompatParcelizer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.IconCompatParcelizer.release();
        this.RemoteActionCompatParcelizer.close();
        this.write.close();
    }

    private List<read> RemoteActionCompatParcelizer(Context context, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read.getName());
        sb.append(".classes");
        String string = sb.toString();
        SharedPreferences sharedPreferencesWrite = write(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("dex.number");
        int i = sharedPreferencesWrite.getInt(sb2.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append(i2);
            sb3.append(".zip");
            read readVar = new read(this.AudioAttributesCompatParcelizer, sb3.toString());
            if (readVar.isFile()) {
                readVar.write = write(readVar);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append("dex.crc.");
                sb4.append(i2);
                long j = sharedPreferencesWrite.getLong(sb4.toString(), -1L);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append("dex.time.");
                sb5.append(i2);
                long j2 = sharedPreferencesWrite.getLong(sb5.toString(), -1L);
                long jLastModified = readVar.lastModified();
                if (j2 == jLastModified) {
                    String str2 = string;
                    SharedPreferences sharedPreferences = sharedPreferencesWrite;
                    if (j == readVar.write) {
                        arrayList.add(readVar);
                        i2++;
                        sharedPreferencesWrite = sharedPreferences;
                        string = str2;
                    }
                }
                StringBuilder sb6 = new StringBuilder("Invalid extracted dex: ");
                sb6.append(readVar);
                sb6.append(" (key \"");
                sb6.append(str);
                sb6.append("\"), expected modification time: ");
                sb6.append(j2);
                sb6.append(", modification time: ");
                sb6.append(jLastModified);
                sb6.append(", expected crc: ");
                sb6.append(j);
                sb6.append(", file crc: ");
                sb6.append(readVar.write);
                throw new IOException(sb6.toString());
            }
            StringBuilder sb7 = new StringBuilder("Missing extracted secondary dex file '");
            sb7.append(readVar.getPath());
            sb7.append("'");
            throw new IOException(sb7.toString());
        }
        return arrayList;
    }

    private static boolean write(Context context, File file, long j, String str) {
        SharedPreferences sharedPreferencesWrite = write(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(PaymentConstants.TIMESTAMP);
        if (sharedPreferencesWrite.getLong(sb.toString(), -1L) != IconCompatParcelizer(file)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        return sharedPreferencesWrite.getLong(sb2.toString(), -1L) != j;
    }

    private static long IconCompatParcelizer(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long write(File file) throws IOException {
        long jAudioAttributesCompatParcelizer = isConstructorParameterRequired.AudioAttributesCompatParcelizer(file);
        return jAudioAttributesCompatParcelizer == -1 ? jAudioAttributesCompatParcelizer - 1 : jAudioAttributesCompatParcelizer;
    }

    private List<read> RemoteActionCompatParcelizer() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read.getName());
        sb.append(".classes");
        String string = sb.toString();
        read();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.read);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i = 2;
            while (entry != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(i);
                sb2.append(".zip");
                read readVar = new read(this.AudioAttributesCompatParcelizer, sb2.toString());
                arrayList.add(readVar);
                readVar.toString();
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    RemoteActionCompatParcelizer(zipFile, entry, readVar, string);
                    try {
                        readVar.write = write(readVar);
                        z = true;
                    } catch (IOException unused) {
                        readVar.getAbsolutePath();
                        z = false;
                    }
                    readVar.getAbsolutePath();
                    readVar.length();
                    long j = readVar.write;
                    if (!z) {
                        readVar.delete();
                        if (readVar.exists()) {
                            readVar.getPath();
                        }
                    }
                }
                if (!z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not create zip file ");
                    sb3.append(readVar.getAbsolutePath());
                    sb3.append(" for secondary dex (");
                    sb3.append(i);
                    sb3.append(")");
                    throw new IOException(sb3.toString());
                }
                i++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("classes");
                sb4.append(i);
                sb4.append(".dex");
                entry = zipFile.getEntry(sb4.toString());
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    private static void IconCompatParcelizer(Context context, String str, long j, long j2, List<read> list) {
        SharedPreferences.Editor editorEdit = write(context).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(PaymentConstants.TIMESTAMP);
        editorEdit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        editorEdit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        editorEdit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (read readVar : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(i);
            editorEdit.putLong(sb4.toString(), readVar.write);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(i);
            editorEdit.putLong(sb5.toString(), readVar.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    private static SharedPreferences write(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private void read() {
        File[] fileArrListFiles = this.AudioAttributesCompatParcelizer.listFiles(new FileFilter() { // from class: o.isParameterRequired.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (fileArrListFiles == null) {
            this.AudioAttributesCompatParcelizer.getPath();
            return;
        }
        for (File file : fileArrListFiles) {
            file.getPath();
            file.length();
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void RemoteActionCompatParcelizer(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-".concat(String.valueOf(str)), ".zip", file.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to mark readonly \"");
                    sb.append(fileCreateTempFile.getAbsolutePath());
                    sb.append("\" (tmp of \"");
                    sb.append(file.getAbsolutePath());
                    sb.append("\")");
                    throw new IOException(sb.toString());
                }
                file.getPath();
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to rename \"");
                sb2.append(fileCreateTempFile.getAbsolutePath());
                sb2.append("\" to \"");
                sb2.append(file.getAbsolutePath());
                sb2.append("\"");
                throw new IOException(sb2.toString());
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            RemoteActionCompatParcelizer(inputStream);
            fileCreateTempFile.delete();
        }
    }

    private static void RemoteActionCompatParcelizer(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }
}
