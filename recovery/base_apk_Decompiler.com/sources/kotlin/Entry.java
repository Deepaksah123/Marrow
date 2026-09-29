package kotlin;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class Entry extends checkSignatures {
    private float read = 3.0f;

    @Override // kotlin.Rcolor
    public final long RemoteActionCompatParcelizer(ViewGroup viewGroup, Transition transition, Rstring rstring, Rstring rstring2) {
        int i;
        int iRound;
        int iCenterX;
        if (rstring == null && rstring2 == null) {
            return 0L;
        }
        if (rstring2 == null || AudioAttributesCompatParcelizer(rstring) == 0) {
            i = -1;
        } else {
            rstring = rstring2;
            i = 1;
        }
        int iWrite = write(rstring);
        int iIconCompatParcelizer = IconCompatParcelizer(rstring);
        Rect rectAudioAttributesImplApi26Parcelizer = transition.AudioAttributesImplApi26Parcelizer();
        if (rectAudioAttributesImplApi26Parcelizer != null) {
            iCenterX = rectAudioAttributesImplApi26Parcelizer.centerX();
            iRound = rectAudioAttributesImplApi26Parcelizer.centerY();
        } else {
            viewGroup.getLocationOnScreen(new int[2]);
            int iRound2 = Math.round(r5[0] + (viewGroup.getWidth() / 2) + viewGroup.getTranslationX());
            iRound = Math.round(r5[1] + (viewGroup.getHeight() / 2) + viewGroup.getTranslationY());
            iCenterX = iRound2;
        }
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iWrite, iIconCompatParcelizer, iCenterX, iRound) / AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, viewGroup.getWidth(), viewGroup.getHeight());
        long jAudioAttributesImplBaseParcelizer = transition.AudioAttributesImplBaseParcelizer();
        if (jAudioAttributesImplBaseParcelizer < 0) {
            jAudioAttributesImplBaseParcelizer = 300;
        }
        return Math.round(((jAudioAttributesImplBaseParcelizer * ((long) i)) / this.read) * fAudioAttributesCompatParcelizer);
    }

    private static float AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }
}
