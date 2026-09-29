package kotlin;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class _deserializeFromEmptyStringDefault extends EnumMapDeserializer {
    private deserializeEnumUsingPropertyBased IconCompatParcelizer;

    _deserializeFromEmptyStringDefault(String str) {
        this.read = str;
        double[] dArr = new double[this.read.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i = 0;
        while (iIndexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        this.IconCompatParcelizer = write(Arrays.copyOf(dArr, i + 1));
    }

    private static deserializeEnumUsingPropertyBased write(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i = 0; i < dArr.length; i++) {
            double d2 = dArr[i];
            int i2 = i + length2;
            dArr2[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr3[i2] = d3;
            if (i > 0) {
                int i3 = (length2 << 1) + i;
                dArr2[i3][0] = d2 + 1.0d;
                dArr3[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr2[i4][0] = (d2 - 1.0d) - d;
                dArr3[i4] = (d3 - 1.0d) - d;
            }
        }
        deserializeEnumUsingPropertyBased deserializeenumusingpropertybased = new deserializeEnumUsingPropertyBased(dArr3, dArr2);
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder(" 0 ");
        sb.append(deserializeenumusingpropertybased.RemoteActionCompatParcelizer(0.0d));
        printStream.println(sb.toString());
        PrintStream printStream2 = System.out;
        StringBuilder sb2 = new StringBuilder(" 1 ");
        sb2.append(deserializeenumusingpropertybased.RemoteActionCompatParcelizer(1.0d));
        printStream2.println(sb2.toString());
        return deserializeenumusingpropertybased;
    }

    @Override // kotlin.EnumMapDeserializer
    public final double IconCompatParcelizer(double d) {
        return this.IconCompatParcelizer.IconCompatParcelizer(d, 0);
    }

    @Override // kotlin.EnumMapDeserializer
    public final double AudioAttributesCompatParcelizer(double d) {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer(d);
    }
}
