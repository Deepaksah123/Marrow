package kotlin;

import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/setCustomData;", "", "<init>", "()V", "Ljava/io/File;", "p0", "", "p1", "p2", "", "IconCompatParcelizer", "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z", "read", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setCustomData {
    public static final setCustomData INSTANCE = new setCustomData();

    private setCustomData() {
    }

    public static boolean IconCompatParcelizer(File p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        try {
            if (!p0.exists()) {
                p0.mkdirs();
            }
            downloadMagicModuleDetail.RemoteActionCompatParcelizer(new File(p0, p1), p2, getSubmissionTimestamp.IconCompatParcelizer);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static File read(File p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        File file = new File(p0, p1);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
