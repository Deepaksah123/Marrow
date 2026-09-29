package kotlin;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public interface ToStringSerializerBase {
    int AudioAttributesCompatParcelizer();

    int IconCompatParcelizer(int i);

    int RemoteActionCompatParcelizer();

    int RemoteActionCompatParcelizer(int i);

    ToStringSerializerBase RemoteActionCompatParcelizer(int i, int i2);

    ToStringSerializerBase read();

    int write();

    ToStringSerializerBase write(int i, int i2);

    public static class RemoteActionCompatParcelizer implements ToStringSerializerBase {
        private final int[] AudioAttributesCompatParcelizer;
        private final int[] IconCompatParcelizer;
        private final Random write;

        public RemoteActionCompatParcelizer() {
            this(0, new Random());
        }

        private RemoteActionCompatParcelizer(int i, Random random) {
            this(RemoteActionCompatParcelizer(0, random), random);
        }

        private RemoteActionCompatParcelizer(int[] iArr, Random random) {
            this.IconCompatParcelizer = iArr;
            this.write = random;
            this.AudioAttributesCompatParcelizer = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.AudioAttributesCompatParcelizer[iArr[i]] = i;
            }
        }

        @Override // kotlin.ToStringSerializerBase
        public final int write() {
            return this.IconCompatParcelizer.length;
        }

        @Override // kotlin.ToStringSerializerBase
        public final int IconCompatParcelizer(int i) {
            int i2 = this.AudioAttributesCompatParcelizer[i] + 1;
            int[] iArr = this.IconCompatParcelizer;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // kotlin.ToStringSerializerBase
        public final int RemoteActionCompatParcelizer(int i) {
            int i2 = this.AudioAttributesCompatParcelizer[i] - 1;
            if (i2 >= 0) {
                return this.IconCompatParcelizer[i2];
            }
            return -1;
        }

        @Override // kotlin.ToStringSerializerBase
        public final int AudioAttributesCompatParcelizer() {
            int[] iArr = this.IconCompatParcelizer;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // kotlin.ToStringSerializerBase
        public final int RemoteActionCompatParcelizer() {
            int[] iArr = this.IconCompatParcelizer;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // kotlin.ToStringSerializerBase
        public final ToStringSerializerBase RemoteActionCompatParcelizer(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.write.nextInt(this.IconCompatParcelizer.length + 1);
                int i5 = i4 + 1;
                int iNextInt = this.write.nextInt(i5);
                iArr2[i4] = iArr2[iNextInt];
                iArr2[iNextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.IconCompatParcelizer.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.IconCompatParcelizer;
                if (i3 < iArr4.length + i2) {
                    if (i6 < i2 && i7 == iArr[i6]) {
                        iArr3[i3] = iArr2[i6];
                        i6++;
                    } else {
                        int i8 = iArr4[i7];
                        iArr3[i3] = i8;
                        if (i8 >= i) {
                            iArr3[i3] = i8 + i2;
                        }
                        i7++;
                    }
                    i3++;
                } else {
                    return new RemoteActionCompatParcelizer(iArr3, new Random(this.write.nextLong()));
                }
            }
        }

        @Override // kotlin.ToStringSerializerBase
        public final ToStringSerializerBase write(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.IconCompatParcelizer.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.IconCompatParcelizer;
                if (i4 < iArr2.length) {
                    int i6 = iArr2[i4];
                    if (i6 < i || i6 >= i2) {
                        if (i6 >= i) {
                            i6 -= i3;
                        }
                        iArr[i4 - i5] = i6;
                    } else {
                        i5++;
                    }
                    i4++;
                } else {
                    return new RemoteActionCompatParcelizer(iArr, new Random(this.write.nextLong()));
                }
            }
        }

        @Override // kotlin.ToStringSerializerBase
        public final ToStringSerializerBase read() {
            return new RemoteActionCompatParcelizer(0, new Random(this.write.nextLong()));
        }

        private static int[] RemoteActionCompatParcelizer(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr[i2] = iArr[iNextInt];
                iArr[iNextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }
    }
}
