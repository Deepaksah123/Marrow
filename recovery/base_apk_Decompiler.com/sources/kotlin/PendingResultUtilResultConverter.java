package kotlin;

import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class PendingResultUtilResultConverter {
    public static final String write(Double d) {
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
            double d2 = dDoubleValue - ((double) ((int) dDoubleValue));
            currencyInstance.setMinimumFractionDigits((d2 == 0.0d ? 1 : 0) ^ 1);
            currencyInstance.setMaximumFractionDigits((d2 * 10.0d) % 1.0d != 0.0d ? 2 : 1);
            String str = currencyInstance.format(dDoubleValue);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            return str != null ? str : "-";
        }
        return "-";
    }
}
