package kotlin;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerView;
import kotlin.calculateNextSearchBytePosition;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
final class FlacExtractorExternalSyntheticLambda0 implements ClockHandView.RemoteActionCompatParcelizer, TimePickerView.RemoteActionCompatParcelizer, TimePickerView.AudioAttributesCompatParcelizer, ClockHandView.AudioAttributesCompatParcelizer, parseHeader {
    private final TimeModel AudioAttributesImplApi21Parcelizer;
    private final TimePickerView AudioAttributesImplApi26Parcelizer;
    private float MediaBrowserCompatItemReceiver;
    private boolean RemoteActionCompatParcelizer = false;
    private float write;
    private static final String[] read = {"12", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] AudioAttributesCompatParcelizer = {TarConstants.VERSION_POSIX, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private static final String[] IconCompatParcelizer = {TarConstants.VERSION_POSIX, "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    public FlacExtractorExternalSyntheticLambda0(TimePickerView timePickerView, TimeModel timeModel) {
        this.AudioAttributesImplApi26Parcelizer = timePickerView;
        this.AudioAttributesImplApi21Parcelizer = timeModel;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer == 0) {
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
        }
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer((ClockHandView.RemoteActionCompatParcelizer) this);
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer((TimePickerView.RemoteActionCompatParcelizer) this);
        this.AudioAttributesImplApi26Parcelizer.read(this);
        this.AudioAttributesImplApi26Parcelizer.setOnActionUpListener(this);
        AudioAttributesImplBaseParcelizer();
        read();
    }

    @Override // kotlin.parseHeader
    public final void read() {
        this.write = RemoteActionCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer * 6;
        write(this.AudioAttributesImplApi21Parcelizer.read, false);
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.parseHeader
    public final void write() {
        this.AudioAttributesImplApi26Parcelizer.setVisibility(0);
    }

    @Override // kotlin.parseHeader
    public final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer.setVisibility(8);
    }

    private String[] IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer == 1 ? AudioAttributesCompatParcelizer : read;
    }

    @Override // com.google.android.material.timepicker.ClockHandView.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(float f, boolean z) {
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        int i = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer;
        int i2 = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer;
        int iRound = Math.round(f);
        if (this.AudioAttributesImplApi21Parcelizer.read == 12) {
            this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer((iRound + 3) / 6);
            this.MediaBrowserCompatItemReceiver = (float) Math.floor(this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer * 6);
        } else {
            int i3 = (iRound + 15) / 30;
            if (this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer == 1) {
                i3 %= 12;
                if (this.AudioAttributesImplApi26Parcelizer.write() == 2) {
                    i3 += 12;
                }
            }
            this.AudioAttributesImplApi21Parcelizer.read(i3);
            this.write = RemoteActionCompatParcelizer();
        }
        if (z) {
            return;
        }
        AudioAttributesImplApi26Parcelizer();
        read(i, i2);
    }

    private void read(int i, int i2) {
        if (this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer == i2 && this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer == i) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(int i) {
        write(i, true);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(i);
    }

    private void write(int i, boolean z) {
        boolean z2 = i == 12;
        this.AudioAttributesImplApi26Parcelizer.setAnimateOnTouchUp(z2);
        this.AudioAttributesImplApi21Parcelizer.read = i;
        this.AudioAttributesImplApi26Parcelizer.setValues(z2 ? IconCompatParcelizer : IconCompatParcelizer(), z2 ? calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_minute_suffix : this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
        AudioAttributesImplApi21Parcelizer();
        this.AudioAttributesImplApi26Parcelizer.setHandRotation(z2 ? this.MediaBrowserCompatItemReceiver : this.write, z);
        this.AudioAttributesImplApi26Parcelizer.setActiveSelection(i);
        TimePickerView timePickerView = this.AudioAttributesImplApi26Parcelizer;
        timePickerView.setMinuteHourDelegate(new findFrame(timePickerView.getContext(), calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_hour_selection) { // from class: o.FlacExtractorExternalSyntheticLambda0.5
            @Override // kotlin.findFrame, kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.IconCompatParcelizer(view.getResources().getString(FlacExtractorExternalSyntheticLambda0.this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), String.valueOf(FlacExtractorExternalSyntheticLambda0.this.AudioAttributesImplApi21Parcelizer.read())));
            }
        });
        TimePickerView timePickerView2 = this.AudioAttributesImplApi26Parcelizer;
        timePickerView2.setHourClickDelegate(new findFrame(timePickerView2.getContext(), calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_minute_selection) { // from class: o.FlacExtractorExternalSyntheticLambda0.1
            @Override // kotlin.findFrame, kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.IconCompatParcelizer(view.getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_minute_suffix, String.valueOf(FlacExtractorExternalSyntheticLambda0.this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer)));
            }
        });
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 1;
        if (this.AudioAttributesImplApi21Parcelizer.read == 10 && this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer == 1 && this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer >= 12) {
            i = 2;
        }
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.AudioAttributesCompatParcelizer
    public final void write(float f, boolean z) {
        this.RemoteActionCompatParcelizer = true;
        int i = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer;
        int i2 = this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer;
        if (this.AudioAttributesImplApi21Parcelizer.read == 10) {
            this.AudioAttributesImplApi26Parcelizer.setHandRotation(this.write, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) _isNaN.getSystemService(this.AudioAttributesImplApi26Parcelizer.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                write(12, true);
            }
        } else {
            int iRound = Math.round(f);
            if (!z) {
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(((iRound + 15) / 30) * 5);
                this.MediaBrowserCompatItemReceiver = this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer * 6;
            }
            this.AudioAttributesImplApi26Parcelizer.setHandRotation(this.MediaBrowserCompatItemReceiver, z);
        }
        this.RemoteActionCompatParcelizer = false;
        AudioAttributesImplApi26Parcelizer();
        read(i2, i);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.write, this.AudioAttributesImplApi21Parcelizer.read(), this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer);
    }

    private void AudioAttributesImplBaseParcelizer() {
        write(read, "%d");
        write(IconCompatParcelizer, "%02d");
    }

    private void write(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.read(this.AudioAttributesImplApi26Parcelizer.getResources(), strArr[i], str);
        }
    }

    private int RemoteActionCompatParcelizer() {
        return (this.AudioAttributesImplApi21Parcelizer.read() * 30) % 360;
    }
}
