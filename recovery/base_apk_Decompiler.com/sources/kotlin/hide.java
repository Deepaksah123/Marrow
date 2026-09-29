package kotlin;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;

/* JADX INFO: loaded from: classes.dex */
public final class hide {
    public static final Spannable RemoteActionCompatParcelizer(String str, int[] iArr, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(iArr, "");
        SpannableString spannableString = new SpannableString(str);
        for (int i2 : iArr) {
            if (i2 == 1) {
                spannableString.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
            } else if (i2 != 2) {
                continue;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("color cannot be -1".toString());
                }
                spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
            }
        }
        return spannableString;
    }
}
