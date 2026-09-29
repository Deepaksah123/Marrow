package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class checkSignatures extends Rcolor {
    private static final String[] write = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    @Override // kotlin.Rcolor
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        View view = rstring.AudioAttributesCompatParcelizer;
        Integer numValueOf = (Integer) rstring.read.get("android:visibility:visibility");
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(view.getVisibility());
        }
        rstring.read.put("android:visibilityPropagation:visibility", numValueOf);
        int[] iArr = {iRound, 0};
        view.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = iRound + (view.getWidth() / 2);
        int iRound2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = iRound2;
        iArr[1] = iRound2 + (view.getHeight() / 2);
        rstring.read.put("android:visibilityPropagation:center", iArr);
    }

    @Override // kotlin.Rcolor
    public final String[] read() {
        return write;
    }

    public static int AudioAttributesCompatParcelizer(Rstring rstring) {
        Integer num;
        if (rstring == null || (num = (Integer) rstring.read.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public static int write(Rstring rstring) {
        return RemoteActionCompatParcelizer(rstring, 0);
    }

    public static int IconCompatParcelizer(Rstring rstring) {
        return RemoteActionCompatParcelizer(rstring, 1);
    }

    private static int RemoteActionCompatParcelizer(Rstring rstring, int i) {
        int[] iArr;
        if (rstring == null || (iArr = (int[]) rstring.read.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i];
    }
}
