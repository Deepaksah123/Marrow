package kotlin;

import android.animation.TypeEvaluator;

/* JADX INFO: loaded from: classes5.dex */
public final class getFloorBytePosition implements TypeEvaluator<Integer> {
    private static final getFloorBytePosition IconCompatParcelizer = new getFloorBytePosition();

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return write(f, num, num2);
    }

    public static getFloorBytePosition AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public static Integer write(float f, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f2 = (iIntValue >>> 24) / 255.0f;
        int iIntValue2 = num2.intValue();
        float f3 = (iIntValue2 >>> 24) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fPow7 = (float) Math.pow(fPow + ((fPow4 - fPow) * f), 0.45454545454545453d);
        float fPow8 = (float) Math.pow(fPow2 + ((fPow5 - fPow2) * f), 0.45454545454545453d);
        float fPow9 = (float) Math.pow(fPow3 + ((fPow6 - fPow3) * f), 0.45454545454545453d);
        return Integer.valueOf((Math.round((f2 + ((f3 - f2) * f)) * 255.0f) << 24) | (Math.round(fPow7 * 255.0f) << 16) | (Math.round(fPow8 * 255.0f) << 8) | Math.round(fPow9 * 255.0f));
    }
}
