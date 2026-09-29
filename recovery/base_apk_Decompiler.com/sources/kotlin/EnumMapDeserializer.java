package kotlin;

import com.razorpay.a.a.O$$$__o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public class EnumMapDeserializer {
    String read = "identity";
    private static EnumMapDeserializer write = new EnumMapDeserializer();
    public static String[] RemoteActionCompatParcelizer = {O$$$__o0Oo.SDK_TYPE, "accelerate", "decelerate", "linear"};

    public double AudioAttributesCompatParcelizer(double d) {
        return d;
    }

    public double IconCompatParcelizer(double d) {
        return 1.0d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static kotlin.EnumMapDeserializer IconCompatParcelizer(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.EnumMapDeserializer.IconCompatParcelizer(java.lang.String):o.EnumMapDeserializer");
    }

    public String toString() {
        return this.read;
    }

    static class AudioAttributesCompatParcelizer extends EnumMapDeserializer {
        private double AudioAttributesCompatParcelizer;
        private double AudioAttributesImplBaseParcelizer;
        private double IconCompatParcelizer;
        private double write;

        AudioAttributesCompatParcelizer(String str) {
            this.read = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.write = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i);
            this.AudioAttributesCompatParcelizer = Double.parseDouble(str.substring(i, iIndexOf3).trim());
            int i2 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i2);
            this.IconCompatParcelizer = Double.parseDouble(str.substring(i2, iIndexOf4).trim());
            int i3 = iIndexOf4 + 1;
            this.AudioAttributesImplBaseParcelizer = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        private double write(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.write * d2 * d3 * d) + (this.IconCompatParcelizer * d3 * d * d) + (d * d * d);
        }

        private double RemoteActionCompatParcelizer(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.AudioAttributesCompatParcelizer * d2 * d3 * d) + (this.AudioAttributesImplBaseParcelizer * d3 * d * d) + (d * d * d);
        }

        @Override // kotlin.EnumMapDeserializer
        public final double IconCompatParcelizer(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 1.0E-4d) {
                d2 *= 0.5d;
                d3 = write(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (RemoteActionCompatParcelizer(d5) - RemoteActionCompatParcelizer(d4)) / (write(d5) - write(d4));
        }

        @Override // kotlin.EnumMapDeserializer
        public final double AudioAttributesCompatParcelizer(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > 0.01d) {
                d2 *= 0.5d;
                d3 = write(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double dWrite = write(d4);
            double d5 = d3 + d2;
            double dWrite2 = write(d5);
            double dRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(d4);
            return (((RemoteActionCompatParcelizer(d5) - dRemoteActionCompatParcelizer) * (d - dWrite)) / (dWrite2 - dWrite)) + dRemoteActionCompatParcelizer;
        }
    }
}
