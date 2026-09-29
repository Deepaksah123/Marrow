package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Entry;
import kotlin.Rstring;
import kotlin.addPackageToPreferred;
import kotlin.reportWithConversionId;

/* JADX INFO: loaded from: classes4.dex */
public class Explode extends Visibility {
    private static final TimeInterpolator AudioAttributesImplApi21Parcelizer = new DecelerateInterpolator();
    private static final TimeInterpolator RemoteActionCompatParcelizer = new AccelerateInterpolator();
    private int[] MediaDescriptionCompat;

    @Override // androidx.transition.Transition
    public final boolean read() {
        return true;
    }

    public Explode() {
        this.MediaDescriptionCompat = new int[2];
        read(new Entry());
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaDescriptionCompat = new int[2];
        read(new Entry());
    }

    private void IconCompatParcelizer(Rstring rstring) {
        View view = rstring.AudioAttributesCompatParcelizer;
        view.getLocationOnScreen(this.MediaDescriptionCompat);
        int[] iArr = this.MediaDescriptionCompat;
        int i = iArr[0];
        int i2 = iArr[1];
        rstring.read.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void read(Rstring rstring) {
        super.read(rstring);
        IconCompatParcelizer(rstring);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        super.RemoteActionCompatParcelizer(rstring);
        IconCompatParcelizer(rstring);
    }

    @Override // androidx.transition.Visibility
    public final Animator read(ViewGroup viewGroup, View view, Rstring rstring, Rstring rstring2) {
        if (rstring2 == null) {
            return null;
        }
        Rect rect = (Rect) rstring2.read.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        IconCompatParcelizer(viewGroup, rect, this.MediaDescriptionCompat);
        int[] iArr = this.MediaDescriptionCompat;
        return addPackageToPreferred.RemoteActionCompatParcelizer(view, rstring2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, AudioAttributesImplApi21Parcelizer, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator RemoteActionCompatParcelizer(ViewGroup viewGroup, View view, Rstring rstring, Rstring rstring2) {
        float f;
        float f2;
        if (rstring == null) {
            return null;
        }
        Rect rect = (Rect) rstring.read.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) rstring.AudioAttributesCompatParcelizer.getTag(reportWithConversionId.RemoteActionCompatParcelizer.transition_position);
        if (iArr != null) {
            f = (iArr[0] - rect.left) + translationX;
            f2 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f = translationX;
            f2 = translationY;
        }
        IconCompatParcelizer(viewGroup, rect, this.MediaDescriptionCompat);
        int[] iArr2 = this.MediaDescriptionCompat;
        return addPackageToPreferred.RemoteActionCompatParcelizer(view, rstring, i, i2, translationX, translationY, f + iArr2[0], f2 + iArr2[1], RemoteActionCompatParcelizer, this);
    }

    private void IconCompatParcelizer(View view, Rect rect, int[] iArr) {
        int iCenterY;
        int width;
        view.getLocationOnScreen(this.MediaDescriptionCompat);
        int[] iArr2 = this.MediaDescriptionCompat;
        int i = iArr2[0];
        int i2 = iArr2[1];
        Rect rectAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (rectAudioAttributesImplApi26Parcelizer == null) {
            width = (view.getWidth() / 2) + i + Math.round(view.getTranslationX());
            iCenterY = (view.getHeight() / 2) + i2 + Math.round(view.getTranslationY());
        } else {
            int iCenterX = rectAudioAttributesImplApi26Parcelizer.centerX();
            iCenterY = rectAudioAttributesImplApi26Parcelizer.centerY();
            width = iCenterX;
        }
        float fCenterX = rect.centerX() - width;
        float fCenterY = rect.centerY() - iCenterY;
        if (fCenterX == BitmapDescriptorFactory.HUE_RED && fCenterY == BitmapDescriptorFactory.HUE_RED) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fCenterX, fCenterY);
        float fIconCompatParcelizer = IconCompatParcelizer(view, width - i, iCenterY - i2);
        iArr[0] = Math.round((fCenterX / fRemoteActionCompatParcelizer) * fIconCompatParcelizer);
        iArr[1] = Math.round(fIconCompatParcelizer * (fCenterY / fRemoteActionCompatParcelizer));
    }

    private static float IconCompatParcelizer(View view, int i, int i2) {
        return RemoteActionCompatParcelizer(Math.max(i, view.getWidth() - i), Math.max(i2, view.getHeight() - i2));
    }

    private static float RemoteActionCompatParcelizer(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }
}
