package kotlin;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes4.dex */
public final class DoubleClickConversionReporter extends checkSignatures {
    private float RemoteActionCompatParcelizer = 3.0f;
    private int AudioAttributesCompatParcelizer = 80;

    public final void write(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.Rcolor
    public final long RemoteActionCompatParcelizer(ViewGroup viewGroup, Transition transition, Rstring rstring, Rstring rstring2) {
        int i;
        Rstring rstring3;
        int i2;
        int iCenterY;
        if (rstring == null && rstring2 == null) {
            return 0L;
        }
        Rect rectAudioAttributesImplApi26Parcelizer = transition.AudioAttributesImplApi26Parcelizer();
        if (rstring2 == null || AudioAttributesCompatParcelizer(rstring) == 0) {
            i = -1;
            rstring3 = rstring;
        } else {
            rstring3 = rstring2;
            i = 1;
        }
        int iWrite = write(rstring3);
        int iIconCompatParcelizer = IconCompatParcelizer(rstring3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int iRound = iArr[0] + Math.round(viewGroup.getTranslationX());
        int iRound2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = viewGroup.getWidth() + iRound;
        int height = viewGroup.getHeight() + iRound2;
        if (rectAudioAttributesImplApi26Parcelizer != null) {
            int iCenterX = rectAudioAttributesImplApi26Parcelizer.centerX();
            iCenterY = rectAudioAttributesImplApi26Parcelizer.centerY();
            i2 = iCenterX;
        } else {
            i2 = (iRound + width) / 2;
            iCenterY = (iRound2 + height) / 2;
        }
        float fWrite = write(viewGroup, iWrite, iIconCompatParcelizer, i2, iCenterY, iRound, iRound2, width, height) / RemoteActionCompatParcelizer(viewGroup);
        long jAudioAttributesImplBaseParcelizer = transition.AudioAttributesImplBaseParcelizer();
        if (jAudioAttributesImplBaseParcelizer < 0) {
            jAudioAttributesImplBaseParcelizer = 300;
        }
        return Math.round(((jAudioAttributesImplBaseParcelizer * ((long) i)) / this.RemoteActionCompatParcelizer) * fWrite);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int write(android.view.View r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
        /*
            r4 = this;
            int r4 = r4.AudioAttributesCompatParcelizer
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = 5
            r2 = 3
            r3 = 1
            if (r4 != r0) goto L11
            int r4 = r5.getLayoutDirection()
            if (r4 != r3) goto L1c
            goto L1e
        L11:
            r0 = 8388613(0x800005, float:1.175495E-38)
            if (r4 != r0) goto L1f
            int r4 = r5.getLayoutDirection()
            if (r4 != r3) goto L1e
        L1c:
            r4 = r2
            goto L1f
        L1e:
            r4 = r1
        L1f:
            if (r4 == r2) goto L45
            if (r4 == r1) goto L3d
            r5 = 48
            if (r4 == r5) goto L35
            r5 = 80
            if (r4 == r5) goto L2d
            r4 = 0
            return r4
        L2d:
            int r7 = r7 - r11
            int r8 = r8 - r6
            int r4 = java.lang.Math.abs(r8)
            int r7 = r7 + r4
            return r7
        L35:
            int r13 = r13 - r7
            int r8 = r8 - r6
            int r4 = java.lang.Math.abs(r8)
            int r13 = r13 + r4
            return r13
        L3d:
            int r6 = r6 - r10
            int r9 = r9 - r7
            int r4 = java.lang.Math.abs(r9)
            int r6 = r6 + r4
            return r6
        L45:
            int r12 = r12 - r6
            int r9 = r9 - r7
            int r4 = java.lang.Math.abs(r9)
            int r12 = r12 + r4
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DoubleClickConversionReporter.write(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    private int RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        int i = this.AudioAttributesCompatParcelizer;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }
}
