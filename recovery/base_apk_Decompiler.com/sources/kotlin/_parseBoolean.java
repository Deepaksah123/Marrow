package kotlin;

import android.graphics.Color;

/* JADX INFO: loaded from: classes2.dex */
final class _parseBoolean {
    static final float[][] AudioAttributesCompatParcelizer = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] IconCompatParcelizer = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] write = {95.047f, 100.0f, 108.883f};
    private static float[][] read = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static float write(float f, float f2, float f3) {
        return 0.69f;
    }

    static int AudioAttributesCompatParcelizer(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = write;
        return _verifyNumberForScalarCoercion.read(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    static float IconCompatParcelizer(int i) {
        return RemoteActionCompatParcelizer(read(i));
    }

    private static float RemoteActionCompatParcelizer(float f) {
        float f2 = f / 100.0f;
        return f2 <= 0.008856452f ? f2 * 903.2963f : (((float) Math.cbrt(f2)) * 116.0f) - 16.0f;
    }

    private static float read(int i) {
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(Color.red(i));
        float fAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(Color.green(i));
        float fAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(Color.blue(i));
        float[] fArr = read[1];
        return (fAudioAttributesCompatParcelizer * fArr[0]) + (fAudioAttributesCompatParcelizer2 * fArr[1]) + (fAudioAttributesCompatParcelizer3 * fArr[2]);
    }

    static void write(int i, float[] fArr) {
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(Color.red(i));
        float fAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(Color.green(i));
        float fAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(Color.blue(i));
        float[][] fArr2 = read;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * fAudioAttributesCompatParcelizer) + (fArr3[1] * fAudioAttributesCompatParcelizer2) + (fArr3[2] * fAudioAttributesCompatParcelizer3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * fAudioAttributesCompatParcelizer) + (fArr4[1] * fAudioAttributesCompatParcelizer2) + (fArr4[2] * fAudioAttributesCompatParcelizer3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (fAudioAttributesCompatParcelizer * fArr5[0]) + (fAudioAttributesCompatParcelizer2 * fArr5[1]) + (fAudioAttributesCompatParcelizer3 * fArr5[2]);
    }

    static float IconCompatParcelizer(float f) {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    private static float AudioAttributesCompatParcelizer(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }
}
