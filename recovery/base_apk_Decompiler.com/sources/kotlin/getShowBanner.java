package kotlin;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class getShowBanner {
    public static void write(File file) {
        File[] fileArrListFiles;
        try {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    write(file2);
                }
            }
            if (file.getName().contains("MixpanelAPI.Images.") || file.getName().contains("MP_IMG_")) {
                file.delete();
            }
        } catch (Exception unused) {
        }
    }
}
