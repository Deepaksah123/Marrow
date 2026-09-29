package kotlin;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class NalUnitUtilSpsData {
    public static final boolean IconCompatParcelizer(boolean z, boolean z2, boolean z3) {
        return !z3 || z || z2;
    }

    public static final List<Integer> write(List<Integer> list) {
        return list == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
    }

    public static final String write(int i, int i2, int i3) {
        if (i != 1 || i3 <= 0) {
            return "";
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String str = String.format(Locale.getDefault(), "%d/%d Completed", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)}, 2));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }
}
