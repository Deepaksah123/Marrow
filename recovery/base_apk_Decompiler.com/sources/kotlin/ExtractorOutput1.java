package kotlin;

import android.R;
import android.content.Context;
import android.view.Window;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtractorOutput1 {
    private static int AudioAttributesCompatParcelizer(Context context, boolean z) {
        return 0;
    }

    private static int write(Context context, boolean z) {
        return 0;
    }

    public static void IconCompatParcelizer(Window window, Integer num) {
        boolean z = num == null || num.intValue() == 0;
        int iWrite = createExtractors.write(window.getContext(), R.attr.colorBackground, -16777216);
        if (z) {
            num = Integer.valueOf(iWrite);
        }
        Integer numValueOf = Integer.valueOf(iWrite);
        _IsXOfY.write(window, false);
        int iWrite2 = write(window.getContext(), true);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(window.getContext(), true);
        window.setStatusBarColor(iWrite2);
        window.setNavigationBarColor(iAudioAttributesCompatParcelizer);
        IconCompatParcelizer(window, IconCompatParcelizer(iWrite2, createExtractors.IconCompatParcelizer(num.intValue())));
        read(window, IconCompatParcelizer(iAudioAttributesCompatParcelizer, createExtractors.IconCompatParcelizer(numValueOf.intValue())));
    }

    public static void IconCompatParcelizer(Window window, boolean z) {
        _IsXOfY.IconCompatParcelizer(window, window.getDecorView()).IconCompatParcelizer(z);
    }

    private static void read(Window window, boolean z) {
        _IsXOfY.IconCompatParcelizer(window, window.getDecorView()).AudioAttributesCompatParcelizer(z);
    }

    private static boolean IconCompatParcelizer(int i, boolean z) {
        if (createExtractors.IconCompatParcelizer(i)) {
            return true;
        }
        return i == 0 && z;
    }
}
