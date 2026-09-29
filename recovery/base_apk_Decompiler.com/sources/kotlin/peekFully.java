package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public abstract class peekFully {
    static float AudioAttributesCompatParcelizer(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    public abstract getLength AudioAttributesCompatParcelizer(readFromUpstream readfromupstream, View view);

    public boolean write(readFromUpstream readfromupstream, int i) {
        return false;
    }

    static int[] read(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = iArr[i] << 1;
        }
        return iArr2;
    }
}
