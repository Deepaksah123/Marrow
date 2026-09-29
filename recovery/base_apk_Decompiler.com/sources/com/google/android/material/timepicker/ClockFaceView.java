package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.deserializeUsingCustom;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes5.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.RemoteActionCompatParcelizer {
    private final int AudioAttributesCompatParcelizer;
    private final Rect AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final float[] AudioAttributesImplBaseParcelizer;
    private final int[] IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final RectF MediaBrowserCompatItemReceiver;
    private final ColorStateList MediaBrowserCompatMediaItem;
    private final Rect MediaBrowserCompatSearchResultReceiver;
    private final SparseArray<TextView> MediaDescriptionCompat;
    private final deserializeUsingCustom MediaMetadataCompat;
    private String[] RatingCompat;
    private float RemoteActionCompatParcelizer;
    private final ClockHandView read;
    private final int write;

    public ClockFaceView(Context context) {
        this(context, null);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialClockStyle);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatSearchResultReceiver = new Rect();
        this.MediaBrowserCompatItemReceiver = new RectF();
        this.AudioAttributesImplApi21Parcelizer = new Rect();
        this.MediaDescriptionCompat = new SparseArray<>();
        this.AudioAttributesImplBaseParcelizer = new float[]{BitmapDescriptorFactory.HUE_RED, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ClockFaceView, i, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListIconCompatParcelizer = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.ClockFaceView_clockNumberTextColor);
        this.MediaBrowserCompatMediaItem = colorStateListIconCompatParcelizer;
        LayoutInflater.from(context).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_hand);
        this.read = clockHandView;
        this.write = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.material_clock_hand_padding);
        int colorForState = colorStateListIconCompatParcelizer.getColorForState(new int[]{R.attr.state_selected}, colorStateListIconCompatParcelizer.getDefaultColor());
        this.IconCompatParcelizer = new int[]{colorForState, colorForState, colorStateListIconCompatParcelizer.getDefaultColor()};
        clockHandView.read(this);
        int defaultColor = getDefaultViewModelCreationExtras.IconCompatParcelizer(context, calculateNextSearchBytePosition.read.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListIconCompatParcelizer2 = SeekMap.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListIconCompatParcelizer2 != null ? colorStateListIconCompatParcelizer2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.4
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                int height = ClockFaceView.this.getHeight() / 2;
                int iAudioAttributesCompatParcelizer = ClockFaceView.this.read.AudioAttributesCompatParcelizer();
                ClockFaceView.this.setRadius((height - iAudioAttributesCompatParcelizer) - ClockFaceView.this.write);
                return true;
            }
        });
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.MediaMetadataCompat = new deserializeUsingCustom() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                int iIntValue = ((Integer) view.getTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_value_index)).intValue();
                if (iIntValue > 0) {
                    hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver((View) ClockFaceView.this.MediaDescriptionCompat.get(iIntValue - 1));
                }
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(0, 1, iIntValue, 1, false, view.isSelected()));
                hassuperclassstartingwith.AudioAttributesImplApi26Parcelizer(true);
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.read.write);
            }

            @Override // kotlin.deserializeUsingCustom
            public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
                if (i2 == 16) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    view.getHitRect(ClockFaceView.this.MediaBrowserCompatSearchResultReceiver);
                    float fCenterX = ClockFaceView.this.MediaBrowserCompatSearchResultReceiver.centerX();
                    float fCenterY = ClockFaceView.this.MediaBrowserCompatSearchResultReceiver.centerY();
                    ClockFaceView.this.read.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                    ClockFaceView.this.read.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                    return true;
                }
                return super.performAccessibilityAction(view, i2, bundle);
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.AudioAttributesImplApi26Parcelizer = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.material_time_picker_minimum_screen_height);
        this.MediaBrowserCompatCustomActionResultReceiver = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.material_time_picker_minimum_screen_width);
        this.AudioAttributesCompatParcelizer = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.material_clock_size);
    }

    public void setValues(String[] strArr, int i) {
        this.RatingCompat = strArr;
        AudioAttributesCompatParcelizer(i);
    }

    private void AudioAttributesCompatParcelizer(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.MediaDescriptionCompat.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.RatingCompat.length, size); i2++) {
            TextView textView = this.MediaDescriptionCompat.get(i2);
            if (i2 >= this.RatingCompat.length) {
                removeView(textView);
                this.MediaDescriptionCompat.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.material_clockface_textview, (ViewGroup) this, false);
                    this.MediaDescriptionCompat.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.RatingCompat[i2]);
                textView.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                InvalidTypeIdException.AudioAttributesCompatParcelizer(textView, this.MediaMetadataCompat);
                textView.setTextColor(this.MediaBrowserCompatMediaItem);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.RatingCompat[i2]));
                }
            }
        }
        this.read.read(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void write() {
        super.write();
        for (int i = 0; i < this.MediaDescriptionCompat.size(); i++) {
            this.MediaDescriptionCompat.get(i).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hasSuperClassStartingWith.write(accessibilityNodeInfo).RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(1, this.RatingCompat.length, false, 1));
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i) {
        if (i != read()) {
            super.setRadius(i);
            this.read.setCircleRadius(read());
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        IconCompatParcelizer();
    }

    public void setHandRotation(float f) {
        this.read.setHandRotation(f);
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        RectF rectFRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        TextView textViewIconCompatParcelizer = IconCompatParcelizer(rectFRemoteActionCompatParcelizer);
        for (int i = 0; i < this.MediaDescriptionCompat.size(); i++) {
            TextView textView = this.MediaDescriptionCompat.get(i);
            if (textView != null) {
                textView.setSelected(textView == textViewIconCompatParcelizer);
                textView.getPaint().setShader(RemoteActionCompatParcelizer(rectFRemoteActionCompatParcelizer, textView));
                textView.invalidate();
            }
        }
    }

    private TextView IconCompatParcelizer(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.MediaDescriptionCompat.size(); i++) {
            TextView textView2 = this.MediaDescriptionCompat.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.MediaBrowserCompatSearchResultReceiver);
                this.MediaBrowserCompatItemReceiver.set(this.MediaBrowserCompatSearchResultReceiver);
                this.MediaBrowserCompatItemReceiver.union(rectF);
                float fWidth = this.MediaBrowserCompatItemReceiver.width() * this.MediaBrowserCompatItemReceiver.height();
                if (fWidth < f) {
                    textView = textView2;
                    f = fWidth;
                }
            }
        }
        return textView;
    }

    private RadialGradient RemoteActionCompatParcelizer(RectF rectF, TextView textView) {
        textView.getHitRect(this.MediaBrowserCompatSearchResultReceiver);
        this.MediaBrowserCompatItemReceiver.set(this.MediaBrowserCompatSearchResultReceiver);
        textView.getLineBounds(0, this.AudioAttributesImplApi21Parcelizer);
        this.MediaBrowserCompatItemReceiver.inset(this.AudioAttributesImplApi21Parcelizer.left, this.AudioAttributesImplApi21Parcelizer.top);
        if (!RectF.intersects(rectF, this.MediaBrowserCompatItemReceiver)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.MediaBrowserCompatItemReceiver.left, rectF.centerY() - this.MediaBrowserCompatItemReceiver.top, rectF.width() * 0.5f, this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, Shader.TileMode.CLAMP);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(float f, boolean z) {
        if (Math.abs(this.RemoteActionCompatParcelizer - f) > 0.001f) {
            this.RemoteActionCompatParcelizer = f;
            IconCompatParcelizer();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iWrite = (int) (this.AudioAttributesCompatParcelizer / write(this.AudioAttributesImplApi26Parcelizer / displayMetrics.heightPixels, this.MediaBrowserCompatCustomActionResultReceiver / displayMetrics.widthPixels));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iWrite, 1073741824);
        setMeasuredDimension(iWrite, iWrite);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    private static float write(float f, float f2) {
        return Math.max(Math.max(f, f2), 1.0f);
    }

    final int AudioAttributesCompatParcelizer() {
        return this.read.read();
    }

    final void RemoteActionCompatParcelizer(int i) {
        this.read.IconCompatParcelizer(i);
    }
}
