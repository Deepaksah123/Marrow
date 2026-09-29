package kotlin;

import android.app.Application;
import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class isStartOfTsPacket {
    private final File AudioAttributesCompatParcelizer;
    private final File IconCompatParcelizer;
    private final File MediaBrowserCompatCustomActionResultReceiver;
    private final File RemoteActionCompatParcelizer;
    private final File read;
    private final File write;

    public isStartOfTsPacket(Context context) {
        File filesDir = context.getFilesDir();
        this.AudioAttributesCompatParcelizer = filesDir;
        StringBuilder sb = new StringBuilder(".com.google.firebase.crashlytics.files.v2");
        sb.append(File.pathSeparator);
        sb.append(AudioAttributesImplApi21Parcelizer(Application.getProcessName()));
        File fileIconCompatParcelizer = IconCompatParcelizer(new File(filesDir, sb.toString()));
        this.write = fileIconCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(new File(fileIconCompatParcelizer, "open-sessions"));
        this.read = IconCompatParcelizer(new File(fileIconCompatParcelizer, "reports"));
        this.RemoteActionCompatParcelizer = IconCompatParcelizer(new File(fileIconCompatParcelizer, "priority-reports"));
        this.IconCompatParcelizer = IconCompatParcelizer(new File(fileIconCompatParcelizer, "native-reports"));
    }

    public final void RemoteActionCompatParcelizer() {
        write(new File(this.AudioAttributesCompatParcelizer, ".com.google.firebase.crashlytics"));
        write(new File(this.AudioAttributesCompatParcelizer, ".com.google.firebase.crashlytics-ndk"));
        write(new File(this.AudioAttributesCompatParcelizer, ".com.google.firebase.crashlytics.files.v1"));
    }

    private static void write(File file) {
        if (file.exists() && read(file)) {
            DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
            StringBuilder sb = new StringBuilder("Deleted previous Crashlytics file system: ");
            sb.append(file.getPath());
            dvbSubtitleReader.IconCompatParcelizer(sb.toString());
        }
    }

    static boolean read(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                read(file2);
            }
        }
        return file.delete();
    }

    public final File read(String str) {
        return new File(this.write, str);
    }

    public final List<File> read(FilenameFilter filenameFilter) {
        return AudioAttributesCompatParcelizer(this.write.listFiles(filenameFilter));
    }

    private File write(String str) {
        return AudioAttributesCompatParcelizer(new File(this.MediaBrowserCompatCustomActionResultReceiver, str));
    }

    public final File read(String str, String str2) {
        return new File(write(str), str2);
    }

    public final List<File> AudioAttributesCompatParcelizer(String str, FilenameFilter filenameFilter) {
        return AudioAttributesCompatParcelizer(write(str).listFiles(filenameFilter));
    }

    public final boolean IconCompatParcelizer(String str) {
        return read(new File(this.MediaBrowserCompatCustomActionResultReceiver, str));
    }

    public final List<String> AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.list());
    }

    public final File RemoteActionCompatParcelizer(String str) {
        return new File(this.read, str);
    }

    public final List<File> read() {
        return AudioAttributesCompatParcelizer(this.read.listFiles());
    }

    public final File AudioAttributesCompatParcelizer(String str) {
        return new File(this.RemoteActionCompatParcelizer, str);
    }

    public final List<File> write() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.listFiles());
    }

    public final List<File> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer.listFiles());
    }

    private static File AudioAttributesCompatParcelizer(File file) {
        file.mkdirs();
        return file;
    }

    private static File IconCompatParcelizer(File file) {
        synchronized (isStartOfTsPacket.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                DvbSubtitleReader dvbSubtitleReader = DvbSubtitleReader.read();
                StringBuilder sb = new StringBuilder("Unexpected non-directory file: ");
                sb.append(file);
                sb.append("; deleting file and creating new directory.");
                dvbSubtitleReader.IconCompatParcelizer(sb.toString());
                file.delete();
            }
            if (!file.mkdirs()) {
                DvbSubtitleReader dvbSubtitleReader2 = DvbSubtitleReader.read();
                StringBuilder sb2 = new StringBuilder("Could not create Crashlytics-specific directory: ");
                sb2.append(file);
                dvbSubtitleReader2.RemoteActionCompatParcelizer(sb2.toString());
            }
            return file;
        }
    }

    private static <T> List<T> AudioAttributesCompatParcelizer(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    private static String AudioAttributesImplApi21Parcelizer(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }
}
