package kotlin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/sqlite/util/ProcessLock;", "", "name", "", "lockDir", "Ljava/io/File;", "processLock", "", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", "lockFile", "threadLock", "Ljava/util/concurrent/locks/Lock;", "lockChannel", "Ljava/nio/channels/FileChannel;", "lock", "", "unlock", "Companion", "sqlite-framework_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setWebColor {
    private static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(null);
    private static final Map<String, Lock> read = new HashMap();
    private final boolean IconCompatParcelizer;
    private final Lock MediaBrowserCompatItemReceiver;
    private final File RemoteActionCompatParcelizer;
    private FileChannel write;

    public setWebColor(String str, File file, boolean z) {
        File file2;
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = z;
        if (file != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".lck");
            file2 = new File(file, sb.toString());
        } else {
            file2 = null;
        }
        this.RemoteActionCompatParcelizer = file2;
        this.MediaBrowserCompatItemReceiver = IconCompatParcelizer.RemoteActionCompatParcelizer(str);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.lock();
        if (z) {
            try {
                File file = this.RemoteActionCompatParcelizer;
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.RemoteActionCompatParcelizer).getChannel();
                channel.lock();
                this.write = channel;
            } catch (IOException e) {
                this.write = null;
            }
        }
    }

    public final void write() {
        try {
            FileChannel fileChannel = this.write;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.MediaBrowserCompatItemReceiver.unlock();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setWebColor$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "Ljava/util/concurrent/locks/Lock;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Ljava/util/concurrent/locks/Lock;", "", "read", "Ljava/util/Map;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Lock RemoteActionCompatParcelizer(String p0) {
            Lock lock;
            synchronized (setWebColor.read) {
                Map map = setWebColor.read;
                Object obj = map.get(p0);
                if (obj == null) {
                    obj = (Lock) new ReentrantLock();
                    map.put(p0, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
