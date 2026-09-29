package com.google.android.material.timepicker;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.deserializeUsingCustom;

/* JADX INFO: loaded from: classes5.dex */
public class TimePickerView extends ConstraintLayout {
    private final ClockHandView AudioAttributesCompatParcelizer;
    private final MaterialButtonToggleGroup AudioAttributesImplApi26Parcelizer;
    private RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final Chip IconCompatParcelizer;
    private final View.OnClickListener MediaBrowserCompatCustomActionResultReceiver;
    private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
    private final Chip RemoteActionCompatParcelizer;
    private read read;
    private final ClockFaceView write;

    public interface AudioAttributesCompatParcelizer {
        void IconCompatParcelizer(int i);
    }

    public interface RemoteActionCompatParcelizer {
        void RemoteActionCompatParcelizer(int i);
    }

    public interface read {
        void read();
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatCustomActionResultReceiver = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (TimePickerView.this.AudioAttributesImplBaseParcelizer != null) {
                    TimePickerView.this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(((Integer) view.getTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.selection_type)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.material_timepicker, this);
        this.write = (ClockFaceView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_period_toggle);
        this.AudioAttributesImplApi26Parcelizer = materialButtonToggleGroup;
        materialButtonToggleGroup.RemoteActionCompatParcelizer(new MaterialButtonToggleGroup.AudioAttributesCompatParcelizer() { // from class: o.parsePayload
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.AudioAttributesCompatParcelizer
            public final void AudioAttributesCompatParcelizer(int i2, boolean z) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i2, z);
            }
        });
        this.IconCompatParcelizer = (Chip) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_minute_tv);
        this.RemoteActionCompatParcelizer = (Chip) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_hour_tv);
        this.AudioAttributesCompatParcelizer = (ClockHandView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_hand);
        IconCompatParcelizer();
        read();
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(int i, boolean z) {
        if (!z || this.MediaBrowserCompatItemReceiver == null) {
            return;
        }
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(i == calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_period_pm_button ? 1 : 0);
    }

    private void IconCompatParcelizer() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.5
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                read readVar = TimePickerView.this.read;
                if (readVar == null) {
                    return false;
                }
                readVar.read();
                return true;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.google.android.material.timepicker.TimePickerView.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.IconCompatParcelizer.setOnTouchListener(onTouchListener);
        this.RemoteActionCompatParcelizer.setOnTouchListener(onTouchListener);
    }

    public void setMinuteHourDelegate(deserializeUsingCustom deserializeusingcustom) {
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, deserializeusingcustom);
    }

    public void setHourClickDelegate(deserializeUsingCustom deserializeusingcustom) {
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, deserializeusingcustom);
    }

    private void read() {
        this.IconCompatParcelizer.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.selection_type, 12);
        this.RemoteActionCompatParcelizer.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.selection_type, 10);
        this.IconCompatParcelizer.setOnClickListener(this.MediaBrowserCompatCustomActionResultReceiver);
        this.RemoteActionCompatParcelizer.setOnClickListener(this.MediaBrowserCompatCustomActionResultReceiver);
        this.IconCompatParcelizer.setAccessibilityClassName("android.view.View");
        this.RemoteActionCompatParcelizer.setAccessibilityClassName("android.view.View");
    }

    public void setValues(String[] strArr, int i) {
        this.write.setValues(strArr, i);
    }

    public void setHandRotation(float f) {
        this.AudioAttributesCompatParcelizer.setHandRotation(f);
    }

    public void setHandRotation(float f, boolean z) {
        this.AudioAttributesCompatParcelizer.setHandRotation(f, z);
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.AudioAttributesCompatParcelizer.setAnimateOnTouchUp(z);
    }

    public final void AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        int i4;
        if (i == 1) {
            i4 = calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_period_pm_button;
        } else {
            i4 = calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_period_am_button;
        }
        this.AudioAttributesImplApi26Parcelizer.read(i4);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(i3));
        String str2 = String.format(locale, "%02d", Integer.valueOf(i2));
        if (!TextUtils.equals(this.IconCompatParcelizer.getText(), str)) {
            this.IconCompatParcelizer.setText(str);
        }
        if (TextUtils.equals(this.RemoteActionCompatParcelizer.getText(), str2)) {
            return;
        }
        this.RemoteActionCompatParcelizer.setText(str2);
    }

    public void setActiveSelection(int i) {
        RemoteActionCompatParcelizer(this.IconCompatParcelizer, i == 12);
        RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, i == 10);
    }

    private static void RemoteActionCompatParcelizer(Chip chip, boolean z) {
        chip.setChecked(z);
        InvalidTypeIdException.AudioAttributesImplApi21Parcelizer(chip, z ? 2 : 0);
    }

    public final void RemoteActionCompatParcelizer(ClockHandView.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.read(remoteActionCompatParcelizer);
    }

    public void setOnActionUpListener(ClockHandView.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.setOnActionUpListener(audioAttributesCompatParcelizer);
    }

    public final void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizer;
    }

    public final void read(read readVar) {
        this.read = readVar;
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer.setVisibility(0);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.RemoteActionCompatParcelizer.sendAccessibilityEvent(8);
        }
    }

    public final int write() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    public final void IconCompatParcelizer(int i) {
        this.write.RemoteActionCompatParcelizer(i);
    }
}
