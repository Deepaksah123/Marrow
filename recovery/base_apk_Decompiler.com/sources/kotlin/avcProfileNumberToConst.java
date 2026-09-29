package kotlin;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class avcProfileNumberToConst {

    public static class AudioAttributesCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private int write;

        public AudioAttributesCompatParcelizer(int i, int i2, int i3) {
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
            this.AudioAttributesCompatParcelizer = i3;
        }

        public final int read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int IconCompatParcelizer() {
            return this.write;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final AudioAttributesCompatParcelizer read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            return new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer - audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), this.write - audioAttributesCompatParcelizer.IconCompatParcelizer(), this.AudioAttributesCompatParcelizer - audioAttributesCompatParcelizer.read());
        }
    }

    public static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(SparseIntArray[] sparseIntArrayArr) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int i3 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            int i4 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i += iValueAt;
                }
                if (iKeyAt > 16) {
                    i2 += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new AudioAttributesCompatParcelizer(i3, i2, i);
    }
}
