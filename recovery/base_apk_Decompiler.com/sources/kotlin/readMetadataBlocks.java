package kotlin;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes5.dex */
public final class readMetadataBlocks implements InputFilter {
    private int RemoteActionCompatParcelizer;

    public readMetadataBlocks(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.RemoteActionCompatParcelizer) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
