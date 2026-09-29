package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class ArrayBuildersLongBuilder {
    public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    public final boolean IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final RemoteActionCompatParcelizer write;

    public static ArrayBuildersLongBuilder IconCompatParcelizer(int i) {
        return RemoteActionCompatParcelizer(i);
    }

    private static ArrayBuildersLongBuilder RemoteActionCompatParcelizer(int i) {
        float f;
        float f2;
        int i2;
        buildTypeSerializer.IconCompatParcelizer(true);
        buildTypeSerializer.IconCompatParcelizer(true);
        buildTypeSerializer.IconCompatParcelizer(true);
        buildTypeSerializer.IconCompatParcelizer(true);
        buildTypeSerializer.IconCompatParcelizer(true);
        float radians = (float) Math.toRadians(180.0d);
        float radians2 = (float) Math.toRadians(360.0d);
        float f3 = radians / 36.0f;
        float f4 = radians2 / 72.0f;
        float[] fArr = new float[15984];
        float[] fArr2 = new float[10656];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < 36) {
            float f5 = radians / 2.0f;
            float f6 = (i3 * f3) - f5;
            int i6 = i3 + 1;
            float f7 = i6;
            int i7 = 0;
            while (i7 < 73) {
                int i8 = 0;
                while (i8 < 2) {
                    if (i8 == 0) {
                        f = f6;
                        f2 = f;
                    } else {
                        f = (f7 * f3) - f5;
                        f2 = f6;
                    }
                    float f8 = i7 * f4;
                    float f9 = f4;
                    float f10 = f5;
                    int i9 = i6;
                    double d = (f8 + 3.1415927f) - (radians2 / 2.0f);
                    float f11 = f3;
                    double d2 = f;
                    int i10 = i8;
                    float f12 = radians;
                    fArr[i5] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                    int i11 = i7;
                    int i12 = i3;
                    fArr[i5 + 1] = (float) (Math.sin(d2) * 50.0d);
                    int i13 = i5 + 3;
                    fArr[i5 + 2] = (float) (Math.cos(d) * 50.0d * Math.cos(d2));
                    fArr2[i4] = f8 / radians2;
                    int i14 = i4 + 2;
                    fArr2[i4 + 1] = ((i12 + i10) * f11) / f12;
                    if (i11 == 0 && i10 == 0) {
                        i7 = i11;
                        i2 = i10;
                    } else {
                        i7 = i11;
                        if (i7 == 72) {
                            i2 = i10;
                            if (i2 == 1) {
                            }
                            i8 = i2 + 1;
                            i3 = i12;
                            radians = f12;
                            f6 = f2;
                            f5 = f10;
                            i6 = i9;
                            f4 = f9;
                            f3 = f11;
                        } else {
                            i2 = i10;
                        }
                        i5 = i13;
                        i4 = i14;
                        i8 = i2 + 1;
                        i3 = i12;
                        radians = f12;
                        f6 = f2;
                        f5 = f10;
                        i6 = i9;
                        f4 = f9;
                        f3 = f11;
                    }
                    System.arraycopy(fArr, i5, fArr, i13, 3);
                    i5 += 6;
                    System.arraycopy(fArr2, i4, fArr2, i14, 2);
                    i4 += 4;
                    i8 = i2 + 1;
                    i3 = i12;
                    radians = f12;
                    f6 = f2;
                    f5 = f10;
                    i6 = i9;
                    f4 = f9;
                    f3 = f11;
                }
                i7++;
                radians = radians;
            }
            i3 = i6;
        }
        return new ArrayBuildersLongBuilder(new RemoteActionCompatParcelizer(new read(0, fArr, fArr2, 1)), i);
    }

    public ArrayBuildersLongBuilder(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        this(remoteActionCompatParcelizer, remoteActionCompatParcelizer, i);
    }

    public ArrayBuildersLongBuilder(RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2, int i) {
        this.write = remoteActionCompatParcelizer;
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer2;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = remoteActionCompatParcelizer == remoteActionCompatParcelizer2;
    }

    public static final class read {
        public final int AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final float[] read;
        public final float[] write;

        public read(int i, float[] fArr, float[] fArr2, int i2) {
            this.AudioAttributesCompatParcelizer = i;
            buildTypeSerializer.IconCompatParcelizer((((long) fArr.length) << 1) == ((long) fArr2.length) * 3);
            this.read = fArr;
            this.write = fArr2;
            this.IconCompatParcelizer = i2;
        }

        public final int IconCompatParcelizer() {
            return this.read.length / 3;
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private final read[] AudioAttributesCompatParcelizer;

        public RemoteActionCompatParcelizer(read... readVarArr) {
            this.AudioAttributesCompatParcelizer = readVarArr;
        }

        public final int write() {
            return this.AudioAttributesCompatParcelizer.length;
        }

        public final read IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer[0];
        }
    }
}
