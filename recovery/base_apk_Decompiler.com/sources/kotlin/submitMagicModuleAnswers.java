package kotlin;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class submitMagicModuleAnswers extends MagicModuleRemoteImpl {
    public static final String AudioAttributesImplApi21Parcelizer(File file) {
        toMagicModuleMetaRepoModel.write(file, "");
        String name = file.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        return TestGroupLSModel.AudioAttributesCompatParcelizer(name, '.', "");
    }

    public static final String AudioAttributesImplApi26Parcelizer(File file) {
        toMagicModuleMetaRepoModel.write(file, "");
        String name = file.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        return TestGroupLSModel.MediaBrowserCompatItemReceiver(name, ".", name);
    }

    public static final boolean AudioAttributesCompatParcelizer(File file) {
        boolean z;
        toMagicModuleMetaRepoModel.write(file, "");
        Iterator<File> itWrite = downloadMagicModuleDetail.write(file).write();
        while (true) {
            while (itWrite.hasNext()) {
                File next = itWrite.next();
                if (next.delete() || !next.exists()) {
                    z = z;
                }
            }
            return z;
        }
    }
}
