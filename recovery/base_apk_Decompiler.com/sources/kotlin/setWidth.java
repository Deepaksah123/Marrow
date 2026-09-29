package kotlin;

import android.os.StrictMode;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class setWidth implements Closeable {
    private final File AudioAttributesCompatParcelizer;
    private final File AudioAttributesImplApi21Parcelizer;
    private final File AudioAttributesImplBaseParcelizer;
    private final File IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private Writer MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private long RatingCompat = 0;
    private final LinkedHashMap<String, IconCompatParcelizer> AudioAttributesImplApi26Parcelizer = new LinkedHashMap<>(0, 0.75f, true);
    private long MediaBrowserCompatSearchResultReceiver = 0;
    private ThreadPoolExecutor write = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new read(0));
    private final Callable<Void> RemoteActionCompatParcelizer = new Callable<Void>() { // from class: o.setWidth.3
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (setWidth.this) {
                if (setWidth.this.MediaBrowserCompatItemReceiver == null) {
                    return null;
                }
                setWidth.this.AudioAttributesImplApi26Parcelizer();
                if (setWidth.this.read()) {
                    setWidth.this.AudioAttributesCompatParcelizer();
                    setWidth.MediaBrowserCompatItemReceiver(setWidth.this);
                }
                return null;
            }
        }
    };
    private final int read = 1;
    private final int MediaDescriptionCompat = 1;

    static /* synthetic */ int MediaBrowserCompatItemReceiver(setWidth setwidth) {
        setwidth.MediaBrowserCompatMediaItem = 0;
        return 0;
    }

    private setWidth(File file, int i, int i2, long j) {
        this.AudioAttributesCompatParcelizer = file;
        this.IconCompatParcelizer = new File(file, "journal");
        this.AudioAttributesImplApi21Parcelizer = new File(file, "journal.tmp");
        this.AudioAttributesImplBaseParcelizer = new File(file, "journal.bkp");
        this.MediaBrowserCompatCustomActionResultReceiver = j;
    }

    public static setWidth IconCompatParcelizer(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                IconCompatParcelizer(file2, file3, false);
            }
        }
        setWidth setwidth = new setWidth(file, 1, 1, j);
        if (setwidth.IconCompatParcelizer.exists()) {
            try {
                setwidth.write();
                setwidth.RemoteActionCompatParcelizer();
                return setwidth;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("DiskLruCache ");
                sb.append(file);
                sb.append(" is corrupt: ");
                sb.append(e.getMessage());
                sb.append(", removing");
                printStream.println(sb.toString());
                setwidth.AudioAttributesImplApi21Parcelizer();
            }
        }
        file.mkdirs();
        setWidth setwidth2 = new setWidth(file, 1, 1, j);
        setwidth2.AudioAttributesCompatParcelizer();
        return setwidth2;
    }

    private void write() throws IOException {
        FormatHolder formatHolder = new FormatHolder(new FileInputStream(this.IconCompatParcelizer), onAudioSessionIdChanged.write);
        try {
            String strRemoteActionCompatParcelizer = formatHolder.RemoteActionCompatParcelizer();
            String strRemoteActionCompatParcelizer2 = formatHolder.RemoteActionCompatParcelizer();
            String strRemoteActionCompatParcelizer3 = formatHolder.RemoteActionCompatParcelizer();
            String strRemoteActionCompatParcelizer4 = formatHolder.RemoteActionCompatParcelizer();
            String strRemoteActionCompatParcelizer5 = formatHolder.RemoteActionCompatParcelizer();
            if (!"libcore.io.DiskLruCache".equals(strRemoteActionCompatParcelizer) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strRemoteActionCompatParcelizer2) || !Integer.toString(this.read).equals(strRemoteActionCompatParcelizer3) || !Integer.toString(this.MediaDescriptionCompat).equals(strRemoteActionCompatParcelizer4) || !"".equals(strRemoteActionCompatParcelizer5)) {
                StringBuilder sb = new StringBuilder("unexpected journal header: [");
                sb.append(strRemoteActionCompatParcelizer);
                sb.append(", ");
                sb.append(strRemoteActionCompatParcelizer2);
                sb.append(", ");
                sb.append(strRemoteActionCompatParcelizer4);
                sb.append(", ");
                sb.append(strRemoteActionCompatParcelizer5);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            int i = 0;
            while (true) {
                try {
                    RemoteActionCompatParcelizer(formatHolder.RemoteActionCompatParcelizer());
                    i++;
                } catch (EOFException unused) {
                    this.MediaBrowserCompatMediaItem = i - this.AudioAttributesImplApi26Parcelizer.size();
                    if (formatHolder.read()) {
                        AudioAttributesCompatParcelizer();
                    } else {
                        this.MediaBrowserCompatItemReceiver = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.IconCompatParcelizer, true), onAudioSessionIdChanged.write));
                    }
                    onAudioSessionIdChanged.IconCompatParcelizer(formatHolder);
                    return;
                }
            }
        } catch (Throwable th) {
            onAudioSessionIdChanged.IconCompatParcelizer(formatHolder);
            throw th;
        }
    }

    private void RemoteActionCompatParcelizer(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.AudioAttributesImplApi26Parcelizer.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(strSubstring);
        byte b = 0;
        if (iconCompatParcelizer == null) {
            iconCompatParcelizer = new IconCompatParcelizer(this, strSubstring, b);
            this.AudioAttributesImplApi26Parcelizer.put(strSubstring, iconCompatParcelizer);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            IconCompatParcelizer.IconCompatParcelizer(iconCompatParcelizer);
            iconCompatParcelizer.write = null;
            iconCompatParcelizer.read(strArrSplit);
            return;
        }
        if (iIndexOf2 != -1 || iIndexOf != 5 || !str.startsWith("DIRTY")) {
            if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(String.valueOf(str)));
            }
            return;
        }
        iconCompatParcelizer.write = new write(this, iconCompatParcelizer, b);
    }

    private void RemoteActionCompatParcelizer() throws IOException {
        read(this.AudioAttributesImplApi21Parcelizer);
        Iterator<IconCompatParcelizer> it = this.AudioAttributesImplApi26Parcelizer.values().iterator();
        while (it.hasNext()) {
            IconCompatParcelizer next = it.next();
            int i = 0;
            if (next.write == null) {
                while (i < this.MediaDescriptionCompat) {
                    this.RatingCompat += next.read[i];
                    i++;
                }
            } else {
                next.write = null;
                while (i < this.MediaDescriptionCompat) {
                    read(next.RemoteActionCompatParcelizer(i));
                    read(next.write(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesCompatParcelizer() throws IOException {
        synchronized (this) {
            Writer writer = this.MediaBrowserCompatItemReceiver;
            if (writer != null) {
                RemoteActionCompatParcelizer(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.AudioAttributesImplApi21Parcelizer), onAudioSessionIdChanged.write));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.read));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.MediaDescriptionCompat));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (IconCompatParcelizer iconCompatParcelizer : this.AudioAttributesImplApi26Parcelizer.values()) {
                    if (iconCompatParcelizer.write != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DIRTY ");
                        sb.append(iconCompatParcelizer.RemoteActionCompatParcelizer);
                        sb.append('\n');
                        bufferedWriter.write(sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(iconCompatParcelizer.RemoteActionCompatParcelizer);
                        sb2.append(iconCompatParcelizer.AudioAttributesCompatParcelizer());
                        sb2.append('\n');
                        bufferedWriter.write(sb2.toString());
                    }
                }
                RemoteActionCompatParcelizer(bufferedWriter);
                if (this.IconCompatParcelizer.exists()) {
                    IconCompatParcelizer(this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, true);
                }
                IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, false);
                this.AudioAttributesImplBaseParcelizer.delete();
                this.MediaBrowserCompatItemReceiver = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.IconCompatParcelizer, true), onAudioSessionIdChanged.write));
            } catch (Throwable th) {
                RemoteActionCompatParcelizer(bufferedWriter);
                throw th;
            }
        }
    }

    private static void read(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void IconCompatParcelizer(File file, File file2, boolean z) throws IOException {
        if (z) {
            read(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final RemoteActionCompatParcelizer write(String str) throws IOException {
        synchronized (this) {
            IconCompatParcelizer();
            IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(str);
            if (iconCompatParcelizer == null) {
                return null;
            }
            if (!iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) {
                return null;
            }
            for (File file : iconCompatParcelizer.AudioAttributesCompatParcelizer) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.MediaBrowserCompatMediaItem++;
            this.MediaBrowserCompatItemReceiver.append((CharSequence) "READ");
            this.MediaBrowserCompatItemReceiver.append(' ');
            this.MediaBrowserCompatItemReceiver.append((CharSequence) str);
            this.MediaBrowserCompatItemReceiver.append('\n');
            if (read()) {
                this.write.submit(this.RemoteActionCompatParcelizer);
            }
            return new RemoteActionCompatParcelizer(this, str, iconCompatParcelizer.MediaBrowserCompatItemReceiver, iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer.read, (byte) 0);
        }
    }

    public final write AudioAttributesCompatParcelizer(String str) throws IOException {
        return IconCompatParcelizer(str);
    }

    private write IconCompatParcelizer(String str) throws IOException {
        synchronized (this) {
            IconCompatParcelizer();
            IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(str);
            byte b = 0;
            if (iconCompatParcelizer == null) {
                iconCompatParcelizer = new IconCompatParcelizer(this, str, b);
                this.AudioAttributesImplApi26Parcelizer.put(str, iconCompatParcelizer);
            } else if (iconCompatParcelizer.write != null) {
                return null;
            }
            write writeVar = new write(this, iconCompatParcelizer, b);
            iconCompatParcelizer.write = writeVar;
            this.MediaBrowserCompatItemReceiver.append((CharSequence) "DIRTY");
            this.MediaBrowserCompatItemReceiver.append(' ');
            this.MediaBrowserCompatItemReceiver.append((CharSequence) str);
            this.MediaBrowserCompatItemReceiver.append('\n');
            write(this.MediaBrowserCompatItemReceiver);
            return writeVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(write writeVar, boolean z) throws IOException {
        synchronized (this) {
            IconCompatParcelizer iconCompatParcelizer = writeVar.write;
            if (iconCompatParcelizer.write != writeVar) {
                throw new IllegalStateException();
            }
            if (z && !iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) {
                for (int i = 0; i < this.MediaDescriptionCompat; i++) {
                    if (!writeVar.IconCompatParcelizer[i]) {
                        writeVar.AudioAttributesCompatParcelizer();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }
                    if (!iconCompatParcelizer.write(i).exists()) {
                        writeVar.AudioAttributesCompatParcelizer();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.MediaDescriptionCompat; i2++) {
                File fileWrite = iconCompatParcelizer.write(i2);
                if (z) {
                    if (fileWrite.exists()) {
                        File fileRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer(i2);
                        fileWrite.renameTo(fileRemoteActionCompatParcelizer);
                        long j = iconCompatParcelizer.read[i2];
                        long length = fileRemoteActionCompatParcelizer.length();
                        iconCompatParcelizer.read[i2] = length;
                        this.RatingCompat = (this.RatingCompat - j) + length;
                    }
                } else {
                    read(fileWrite);
                }
            }
            this.MediaBrowserCompatMediaItem++;
            iconCompatParcelizer.write = null;
            if (iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver | z) {
                IconCompatParcelizer.IconCompatParcelizer(iconCompatParcelizer);
                this.MediaBrowserCompatItemReceiver.append((CharSequence) "CLEAN");
                this.MediaBrowserCompatItemReceiver.append(' ');
                this.MediaBrowserCompatItemReceiver.append((CharSequence) iconCompatParcelizer.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatItemReceiver.append((CharSequence) iconCompatParcelizer.AudioAttributesCompatParcelizer());
                this.MediaBrowserCompatItemReceiver.append('\n');
                if (z) {
                    long j2 = this.MediaBrowserCompatSearchResultReceiver;
                    this.MediaBrowserCompatSearchResultReceiver = 1 + j2;
                    iconCompatParcelizer.MediaBrowserCompatItemReceiver = j2;
                }
            } else {
                this.AudioAttributesImplApi26Parcelizer.remove(iconCompatParcelizer.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatItemReceiver.append((CharSequence) "REMOVE");
                this.MediaBrowserCompatItemReceiver.append(' ');
                this.MediaBrowserCompatItemReceiver.append((CharSequence) iconCompatParcelizer.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatItemReceiver.append('\n');
            }
            write(this.MediaBrowserCompatItemReceiver);
            if (this.RatingCompat > this.MediaBrowserCompatCustomActionResultReceiver || read()) {
                this.write.submit(this.RemoteActionCompatParcelizer);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean read() {
        int i = this.MediaBrowserCompatMediaItem;
        return i >= 2000 && i >= this.AudioAttributesImplApi26Parcelizer.size();
    }

    private boolean read(String str) throws IOException {
        synchronized (this) {
            IconCompatParcelizer();
            IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get(str);
            if (iconCompatParcelizer != null && iconCompatParcelizer.write == null) {
                for (int i = 0; i < this.MediaDescriptionCompat; i++) {
                    File fileRemoteActionCompatParcelizer = iconCompatParcelizer.RemoteActionCompatParcelizer(i);
                    if (fileRemoteActionCompatParcelizer.exists() && !fileRemoteActionCompatParcelizer.delete()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
                        sb.append(fileRemoteActionCompatParcelizer);
                        throw new IOException(sb.toString());
                    }
                    this.RatingCompat -= iconCompatParcelizer.read[i];
                    iconCompatParcelizer.read[i] = 0;
                }
                this.MediaBrowserCompatMediaItem++;
                this.MediaBrowserCompatItemReceiver.append((CharSequence) "REMOVE");
                this.MediaBrowserCompatItemReceiver.append(' ');
                this.MediaBrowserCompatItemReceiver.append((CharSequence) str);
                this.MediaBrowserCompatItemReceiver.append('\n');
                this.AudioAttributesImplApi26Parcelizer.remove(str);
                if (read()) {
                    this.write.submit(this.RemoteActionCompatParcelizer);
                }
                return true;
            }
            return false;
        }
    }

    private void IconCompatParcelizer() {
        if (this.MediaBrowserCompatItemReceiver == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.MediaBrowserCompatItemReceiver == null) {
                return;
            }
            for (IconCompatParcelizer iconCompatParcelizer : new ArrayList(this.AudioAttributesImplApi26Parcelizer.values())) {
                if (iconCompatParcelizer.write != null) {
                    iconCompatParcelizer.write.AudioAttributesCompatParcelizer();
                }
            }
            AudioAttributesImplApi26Parcelizer();
            RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatItemReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AudioAttributesImplApi26Parcelizer() throws IOException {
        while (this.RatingCompat > this.MediaBrowserCompatCustomActionResultReceiver) {
            read(this.AudioAttributesImplApi26Parcelizer.entrySet().iterator().next().getKey());
        }
    }

    private void AudioAttributesImplApi21Parcelizer() throws IOException {
        close();
        onAudioSessionIdChanged.write(this.AudioAttributesCompatParcelizer);
    }

    private static void RemoteActionCompatParcelizer(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void write(Writer writer) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final class RemoteActionCompatParcelizer {
        private final File[] AudioAttributesCompatParcelizer;
        private final long IconCompatParcelizer;
        private final long[] RemoteActionCompatParcelizer;
        private final String read;

        /* synthetic */ RemoteActionCompatParcelizer(setWidth setwidth, String str, long j, File[] fileArr, long[] jArr, byte b) {
            this(str, j, fileArr, jArr);
        }

        private RemoteActionCompatParcelizer(String str, long j, File[] fileArr, long[] jArr) {
            this.read = str;
            this.IconCompatParcelizer = j;
            this.AudioAttributesCompatParcelizer = fileArr;
            this.RemoteActionCompatParcelizer = jArr;
        }

        public final File read() {
            return this.AudioAttributesCompatParcelizer[0];
        }
    }

    public final class write {
        private final boolean[] IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private final IconCompatParcelizer write;

        /* synthetic */ write(setWidth setwidth, IconCompatParcelizer iconCompatParcelizer, byte b) {
            this(iconCompatParcelizer);
        }

        private write(IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
            this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver ? null : new boolean[setWidth.this.MediaDescriptionCompat];
        }

        public final File read() throws IOException {
            File fileWrite;
            synchronized (setWidth.this) {
                if (this.write.write != this) {
                    throw new IllegalStateException();
                }
                if (!this.write.MediaBrowserCompatCustomActionResultReceiver) {
                    this.IconCompatParcelizer[0] = true;
                }
                fileWrite = this.write.write(0);
                setWidth.this.AudioAttributesCompatParcelizer.mkdirs();
            }
            return fileWrite;
        }

        public final void IconCompatParcelizer() throws IOException {
            setWidth.this.write(this, true);
            this.RemoteActionCompatParcelizer = true;
        }

        public final void AudioAttributesCompatParcelizer() throws IOException {
            setWidth.this.write(this, false);
        }

        public final void RemoteActionCompatParcelizer() {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            try {
                AudioAttributesCompatParcelizer();
            } catch (IOException unused) {
            }
        }
    }

    final class IconCompatParcelizer {
        File[] AudioAttributesCompatParcelizer;
        private File[] IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private final String RemoteActionCompatParcelizer;
        private final long[] read;
        private write write;

        /* synthetic */ IconCompatParcelizer(setWidth setwidth, String str, byte b) {
            this(str);
        }

        static /* synthetic */ boolean IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = true;
            return true;
        }

        private IconCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = str;
            this.read = new long[setWidth.this.MediaDescriptionCompat];
            this.AudioAttributesCompatParcelizer = new File[setWidth.this.MediaDescriptionCompat];
            this.IconCompatParcelizer = new File[setWidth.this.MediaDescriptionCompat];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < setWidth.this.MediaDescriptionCompat; i++) {
                sb.append(i);
                this.AudioAttributesCompatParcelizer[i] = new File(setWidth.this.AudioAttributesCompatParcelizer, sb.toString());
                sb.append(".tmp");
                this.IconCompatParcelizer[i] = new File(setWidth.this.AudioAttributesCompatParcelizer, sb.toString());
                sb.setLength(length);
            }
        }

        public final String AudioAttributesCompatParcelizer() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.read) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void read(String[] strArr) throws IOException {
            if (strArr.length != setWidth.this.MediaDescriptionCompat) {
                throw RemoteActionCompatParcelizer(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.read[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw RemoteActionCompatParcelizer(strArr);
                }
            }
        }

        private static IOException RemoteActionCompatParcelizer(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        public final File RemoteActionCompatParcelizer(int i) {
            return this.AudioAttributesCompatParcelizer[i];
        }

        public final File write(int i) {
            return this.IconCompatParcelizer[i];
        }
    }

    static final class read implements ThreadFactory {
        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread;
            synchronized (this) {
                thread = new Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
            }
            return thread;
        }
    }
}
