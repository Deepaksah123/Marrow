package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeUpdateLoadingPeriod {
    private final String AudioAttributesCompatParcelizer;
    public final float IconCompatParcelizer;
    public final float write;

    public maybeUpdateLoadingPeriod(String str, float f, float f2) {
        this.AudioAttributesCompatParcelizer = str;
        this.write = f2;
        this.IconCompatParcelizer = f;
    }

    public final boolean AudioAttributesCompatParcelizer(String str) {
        if (this.AudioAttributesCompatParcelizer.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.AudioAttributesCompatParcelizer.endsWith("\r")) {
            String str2 = this.AudioAttributesCompatParcelizer;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
