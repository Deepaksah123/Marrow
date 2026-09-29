package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class _deserializeUsingProperties {
    public abstract void AudioAttributesCompatParcelizer(double d, double[] dArr);

    public abstract void AudioAttributesCompatParcelizer(double d, float[] fArr);

    public abstract double[] AudioAttributesCompatParcelizer();

    public abstract double IconCompatParcelizer(double d, int i);

    public abstract double RemoteActionCompatParcelizer(double d);

    public abstract void read(double d, double[] dArr);

    public static _deserializeUsingProperties AudioAttributesCompatParcelizer(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new deserializeEnumUsingPropertyBased(dArr, dArr2);
        }
        if (i == 2) {
            return new RemoteActionCompatParcelizer(dArr[0], dArr2[0]);
        }
        return new _deserializeEmbedded(dArr, dArr2);
    }

    public static _deserializeUsingProperties RemoteActionCompatParcelizer(int[] iArr, double[] dArr, double[][] dArr2) {
        return new EnumSetDeserializer(iArr, dArr, dArr2);
    }

    static class RemoteActionCompatParcelizer extends _deserializeUsingProperties {
        private double[] AudioAttributesCompatParcelizer;
        private double read;

        @Override // kotlin._deserializeUsingProperties
        public final double IconCompatParcelizer(double d, int i) {
            return 0.0d;
        }

        RemoteActionCompatParcelizer(double d, double[] dArr) {
            this.read = d;
            this.AudioAttributesCompatParcelizer = dArr;
        }

        @Override // kotlin._deserializeUsingProperties
        public final void read(double d, double[] dArr) {
            double[] dArr2 = this.AudioAttributesCompatParcelizer;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // kotlin._deserializeUsingProperties
        public final void AudioAttributesCompatParcelizer(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.AudioAttributesCompatParcelizer;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // kotlin._deserializeUsingProperties
        public final double RemoteActionCompatParcelizer(double d) {
            return this.AudioAttributesCompatParcelizer[0];
        }

        @Override // kotlin._deserializeUsingProperties
        public final void AudioAttributesCompatParcelizer(double d, double[] dArr) {
            for (int i = 0; i < this.AudioAttributesCompatParcelizer.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // kotlin._deserializeUsingProperties
        public final double[] AudioAttributesCompatParcelizer() {
            return new double[]{this.read};
        }
    }
}
