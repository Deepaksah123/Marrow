package kotlin;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class MagicModuleLSModelsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String AudioAttributesCompatParcelizer(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> ".concat(String.valueOf(file2)));
        }
        if (str != null) {
            sb.append(": ".concat(String.valueOf(str)));
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
