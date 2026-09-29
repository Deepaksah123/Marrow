package kotlin;

import com.marrow.data.models.test.TestIndex;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class getAudioUsageForStreamType {
    public static final boolean IconCompatParcelizer(TestIndex testIndex) {
        toMagicModuleMetaRepoModel.write(testIndex, "");
        return testIndex.getTestPattern() == 6 || testIndex.getTestPattern() == 7;
    }

    public static final String IconCompatParcelizer(boolean z, double d) {
        if (z) {
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str;
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        String str2 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        return str2;
    }
}
