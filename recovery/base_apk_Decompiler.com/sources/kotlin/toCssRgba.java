package kotlin;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes3.dex */
public final class toCssRgba implements InputFilter {
    private final getCreatedOnDateMs<getShowPopup> AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    public toCssRgba(int i, getCreatedOnDateMs<getShowPopup> getcreatedondatems, getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        this.RemoteActionCompatParcelizer = 500;
        this.IconCompatParcelizer = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = getcreatedondatems2;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(charSequence, "");
        toMagicModuleMetaRepoModel.write(spanned, "");
        int length = this.RemoteActionCompatParcelizer - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            this.IconCompatParcelizer.invoke();
            return "";
        }
        if (length >= i2 - i) {
            this.AudioAttributesCompatParcelizer.invoke();
            return null;
        }
        this.IconCompatParcelizer.invoke();
        return charSequence.subSequence(i, length + i);
    }
}
