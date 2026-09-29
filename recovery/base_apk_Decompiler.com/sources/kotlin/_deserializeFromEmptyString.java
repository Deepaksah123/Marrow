package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class _deserializeFromEmptyString extends EnumMapDeserializer {
    private double IconCompatParcelizer;
    private double write;

    _deserializeFromEmptyString(String str) {
        this.read = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.write = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i = iIndexOf2 + 1;
        this.IconCompatParcelizer = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    private double RemoteActionCompatParcelizer(double d) {
        double d2 = this.IconCompatParcelizer;
        if (d < d2) {
            return (d2 * d) / (d + (this.write * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.write * (d2 - d)));
    }

    private double write(double d) {
        double d2 = this.IconCompatParcelizer;
        if (d < d2) {
            double d3 = this.write;
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = this.write;
        double d7 = d2 - 1.0d;
        double d8 = d7 * d6 * d7;
        double d9 = (((-d6) * (d2 - d)) - d) + 1.0d;
        return d8 / (d9 * d9);
    }

    @Override // kotlin.EnumMapDeserializer
    public final double IconCompatParcelizer(double d) {
        return write(d);
    }

    @Override // kotlin.EnumMapDeserializer
    public final double AudioAttributesCompatParcelizer(double d) {
        return RemoteActionCompatParcelizer(d);
    }
}
