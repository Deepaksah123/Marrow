package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes4.dex */
public class MotionEffect extends MotionHelper {
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private int RatingCompat;

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public MotionEffect(Context context) {
        super(context);
        this.MediaBrowserCompatCustomActionResultReceiver = 0.1f;
        this.AudioAttributesImplBaseParcelizer = 49;
        this.AudioAttributesImplApi26Parcelizer = 50;
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaMetadataCompat = true;
        this.RatingCompat = -1;
        this.AudioAttributesImplApi21Parcelizer = -1;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatCustomActionResultReceiver = 0.1f;
        this.AudioAttributesImplBaseParcelizer = 49;
        this.AudioAttributesImplApi26Parcelizer = 50;
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaMetadataCompat = true;
        this.RatingCompat = -1;
        this.AudioAttributesImplApi21Parcelizer = -1;
        IconCompatParcelizer(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatCustomActionResultReceiver = 0.1f;
        this.AudioAttributesImplBaseParcelizer = 49;
        this.AudioAttributesImplApi26Parcelizer = 50;
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaMetadataCompat = true;
        this.RatingCompat = -1;
        this.AudioAttributesImplApi21Parcelizer = -1;
        IconCompatParcelizer(context, attributeSet);
    }

    private void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.MotionEffect);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.MotionEffect_motionEffect_start) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesImplBaseParcelizer);
                    this.AudioAttributesImplBaseParcelizer = i2;
                    this.AudioAttributesImplBaseParcelizer = Math.max(Math.min(i2, 99), 0);
                } else if (index == _isBlank.read.MotionEffect_motionEffect_end) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesImplApi26Parcelizer);
                    this.AudioAttributesImplApi26Parcelizer = i3;
                    this.AudioAttributesImplApi26Parcelizer = Math.max(Math.min(i3, 99), 0);
                } else if (index == _isBlank.read.MotionEffect_motionEffect_translationX) {
                    this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.MediaBrowserCompatMediaItem);
                } else if (index == _isBlank.read.MotionEffect_motionEffect_translationY) {
                    this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.MediaDescriptionCompat);
                } else if (index == _isBlank.read.MotionEffect_motionEffect_alpha) {
                    this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getFloat(index, this.MediaBrowserCompatCustomActionResultReceiver);
                } else if (index == _isBlank.read.MotionEffect_motionEffect_move) {
                    this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesImplApi21Parcelizer);
                } else if (index == _isBlank.read.MotionEffect_motionEffect_strict) {
                    this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getBoolean(index, this.MediaMetadataCompat);
                } else if (index == _isBlank.read.MotionEffect_motionEffect_viewTransition) {
                    this.RatingCompat = typedArrayObtainStyledAttributes.getResourceId(index, this.RatingCompat);
                }
            }
            int i4 = this.AudioAttributesImplBaseParcelizer;
            int i5 = this.AudioAttributesImplApi26Parcelizer;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.AudioAttributesImplBaseParcelizer = i4 - 1;
                } else {
                    this.AudioAttributesImplApi26Parcelizer = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if (r14 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017e, code lost:
    
        if (r14 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018e, code lost:
    
        if (r15 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cf  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, kotlin.handleSingleElementUnwrapped> r24) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.read(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }
}
