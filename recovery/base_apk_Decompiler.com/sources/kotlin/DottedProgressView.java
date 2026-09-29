package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class DottedProgressView {
    private static int IconCompatParcelizer(int[] iArr, int i, int i2, int i3) {
        toMagicModuleMetaRepoModel.write(iArr, "");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int AudioAttributesCompatParcelizer(getViewPaint getviewpaint, int i) {
        toMagicModuleMetaRepoModel.write(getviewpaint, "");
        int iIconCompatParcelizer = IconCompatParcelizer(getviewpaint.getRead(), i + 1, 0, getviewpaint.getIconCompatParcelizer().length);
        return iIconCompatParcelizer >= 0 ? iIconCompatParcelizer : ~iIconCompatParcelizer;
    }
}
