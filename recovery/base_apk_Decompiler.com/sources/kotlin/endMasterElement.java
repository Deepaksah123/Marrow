package kotlin;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
final class endMasterElement {
    private final Context IconCompatParcelizer;

    private static long RemoteActionCompatParcelizer(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jRemoteActionCompatParcelizer = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jRemoteActionCompatParcelizer += RemoteActionCompatParcelizer(file2);
            }
        }
        return jRemoteActionCompatParcelizer;
    }

    final long write() {
        return RemoteActionCompatParcelizer(new File(this.IconCompatParcelizer.getFilesDir(), "assetpacks"));
    }

    endMasterElement(Context context) {
        this.IconCompatParcelizer = context;
    }
}
