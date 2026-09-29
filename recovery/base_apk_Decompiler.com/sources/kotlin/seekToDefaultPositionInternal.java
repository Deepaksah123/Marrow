package kotlin;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"Lo/seekToDefaultPositionInternal;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)V", "", "Ljava/io/File;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Ljava/util/Map;", "read", "(Landroid/content/Context;)Ljava/io/File;", "IconCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class seekToDefaultPositionInternal {
    public static final seekToDefaultPositionInternal INSTANCE = new seekToDefaultPositionInternal();

    private seekToDefaultPositionInternal() {
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (read(p0).exists()) {
            n.write();
            String unused = seekToNextMediaItemInternal.AudioAttributesCompatParcelizer;
            for (Map.Entry<File, File> entry : RemoteActionCompatParcelizer(p0).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        n.write();
                        String unused2 = seekToNextMediaItemInternal.AudioAttributesCompatParcelizer;
                        Objects.toString(value);
                    }
                    if (key.renameTo(value)) {
                        Objects.toString(key);
                        Objects.toString(value);
                    } else {
                        Objects.toString(key);
                        Objects.toString(value);
                    }
                    n.write();
                    String unused3 = seekToNextMediaItemInternal.AudioAttributesCompatParcelizer;
                }
            }
        }
    }

    private static Map<File, File> RemoteActionCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        File file = read(p0);
        File fileIconCompatParcelizer = IconCompatParcelizer(p0);
        String[] strArr = seekToNextMediaItemInternal.RemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(strArr.length), 16));
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            sb.append(str);
            File file2 = new File(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(fileIconCompatParcelizer.getPath());
            sb2.append(str);
            Pair pairWrite = setAction.write(file2, new File(sb2.toString()));
            linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
        }
        return VideoTimelineResponseBody.read(linkedHashMap, setAction.write(file, fileIconCompatParcelizer));
    }

    private static File read(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        File databasePath = p0.getDatabasePath("androidx.work.workdb");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(databasePath, "");
        return databasePath;
    }

    private static File IconCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        File noBackupFilesDir = p0.getNoBackupFilesDir();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(noBackupFilesDir, "");
        return noBackupFilesDir;
    }
}
