package kotlin;

import android.view.View;
import kotlin.setNoDataTextColor;

/* JADX INFO: loaded from: classes.dex */
public final class setCenterTextRadiusPercent {
    public static final void read(View view, PieChart pieChart) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setTag(setNoDataTextColor.RemoteActionCompatParcelizer.view_tree_saved_state_registry_owner, pieChart);
    }

    public static final PieChart IconCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        while (view != null) {
            Object tag = view.getTag(setNoDataTextColor.RemoteActionCompatParcelizer.view_tree_saved_state_registry_owner);
            PieChart pieChart = tag instanceof PieChart ? (PieChart) tag : null;
            if (pieChart != null) {
                return pieChart;
            }
            Object objIconCompatParcelizer = AnnotatedAndMetadata.IconCompatParcelizer(view);
            view = objIconCompatParcelizer instanceof View ? (View) objIconCompatParcelizer : null;
        }
        return null;
    }
}
