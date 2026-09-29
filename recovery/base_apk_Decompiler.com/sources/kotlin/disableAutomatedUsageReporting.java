package kotlin;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class disableAutomatedUsageReporting {
    public static PieEntry read(View view, ViewGroup viewGroup, Matrix matrix) {
        return enableAutomatedUsageReporting.read(view, viewGroup, matrix);
    }

    public static void IconCompatParcelizer(View view) {
        enableAutomatedUsageReporting.write(view);
    }
}
