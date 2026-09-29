package kotlin;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Locale;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes5.dex */
final class FlvExtractor implements TimePickerView.RemoteActionCompatParcelizer, parseHeader {
    private final EditText AudioAttributesCompatParcelizer;
    private final LinearLayout AudioAttributesImplApi26Parcelizer;
    private final ChipTextInputComboView AudioAttributesImplBaseParcelizer;
    private final ChipTextInputComboView IconCompatParcelizer;
    private MaterialButtonToggleGroup MediaBrowserCompatCustomActionResultReceiver;
    private final TimeModel MediaBrowserCompatItemReceiver;
    private final EditText read;
    private final prepareTagData write;
    private final TextWatcher AudioAttributesImplApi21Parcelizer = new checkFrameHeaderFromPeek() { // from class: o.FlvExtractor.1
        @Override // kotlin.checkFrameHeaderFromPeek, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    FlvExtractor.this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(0);
                } else {
                    FlvExtractor.this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    };
    private final TextWatcher RemoteActionCompatParcelizer = new checkFrameHeaderFromPeek() { // from class: o.FlvExtractor.4
        @Override // kotlin.checkFrameHeaderFromPeek, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    FlvExtractor.this.MediaBrowserCompatItemReceiver.read(0);
                } else {
                    FlvExtractor.this.MediaBrowserCompatItemReceiver.read(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    };

    public FlvExtractor(LinearLayout linearLayout, final TimeModel timeModel) {
        this.AudioAttributesImplApi26Parcelizer = linearLayout;
        this.MediaBrowserCompatItemReceiver = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_minute_text_input);
        this.AudioAttributesImplBaseParcelizer = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_hour_text_input);
        this.IconCompatParcelizer = chipTextInputComboView2;
        TextView textView = (TextView) chipTextInputComboView.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_label);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_label);
        textView.setText(resources.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_timepicker_minute));
        textView2.setText(resources.getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_timepicker_hour));
        chipTextInputComboView.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.selection_type, 12);
        chipTextInputComboView2.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.selection_type, 10);
        if (timeModel.RemoteActionCompatParcelizer == 0) {
            AudioAttributesImplBaseParcelizer();
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.FlvExtractor.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FlvExtractor.this.RemoteActionCompatParcelizer(((Integer) view.getTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.selection_type)).intValue());
            }
        };
        chipTextInputComboView2.setOnClickListener(onClickListener);
        chipTextInputComboView.setOnClickListener(onClickListener);
        chipTextInputComboView2.write(timeModel.write());
        chipTextInputComboView.write(timeModel.AudioAttributesCompatParcelizer());
        this.AudioAttributesCompatParcelizer = chipTextInputComboView2.read().AudioAttributesCompatParcelizer();
        this.read = chipTextInputComboView.read().AudioAttributesCompatParcelizer();
        this.write = new prepareTagData(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.setChipDelegate(new findFrame(linearLayout.getContext(), calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_hour_selection) { // from class: o.FlvExtractor.3
            @Override // kotlin.findFrame, kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.IconCompatParcelizer(view.getResources().getString(timeModel.RemoteActionCompatParcelizer(), String.valueOf(timeModel.read())));
            }
        });
        chipTextInputComboView.setChipDelegate(new findFrame(linearLayout.getContext(), calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_minute_selection) { // from class: o.FlvExtractor.2
            @Override // kotlin.findFrame, kotlin.deserializeUsingCustom
            public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                hassuperclassstartingwith.IconCompatParcelizer(view.getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_minute_suffix, String.valueOf(timeModel.IconCompatParcelizer)));
            }
        });
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        AudioAttributesImplApi21Parcelizer();
        write(this.MediaBrowserCompatItemReceiver);
        this.write.read();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        this.AudioAttributesCompatParcelizer.addTextChangedListener(this.RemoteActionCompatParcelizer);
        this.read.addTextChangedListener(this.AudioAttributesImplApi21Parcelizer);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesCompatParcelizer.removeTextChangedListener(this.RemoteActionCompatParcelizer);
        this.read.removeTextChangedListener(this.AudioAttributesImplApi21Parcelizer);
    }

    private void write(TimeModel timeModel) {
        AudioAttributesImplApi26Parcelizer();
        Locale locale = this.AudioAttributesImplApi26Parcelizer.getResources().getConfiguration().locale;
        String str = String.format(locale, "%02d", Integer.valueOf(timeModel.IconCompatParcelizer));
        String str2 = String.format(locale, "%02d", Integer.valueOf(timeModel.read()));
        this.AudioAttributesImplBaseParcelizer.setText(str);
        this.IconCompatParcelizer.setText(str2);
        AudioAttributesImplApi21Parcelizer();
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void AudioAttributesImplBaseParcelizer() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.AudioAttributesImplApi26Parcelizer.findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_period_toggle);
        this.MediaBrowserCompatCustomActionResultReceiver = materialButtonToggleGroup;
        materialButtonToggleGroup.RemoteActionCompatParcelizer(new MaterialButtonToggleGroup.AudioAttributesCompatParcelizer() { // from class: o.getCurrentTimestampUs
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.AudioAttributesCompatParcelizer
            public final void AudioAttributesCompatParcelizer(int i, boolean z) {
                this.read.AudioAttributesCompatParcelizer(i, z);
            }
        });
        this.MediaBrowserCompatCustomActionResultReceiver.setVisibility(0);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(int i, boolean z) {
        if (z) {
            this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(i == calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_period_pm_button ? 1 : 0);
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.MediaBrowserCompatCustomActionResultReceiver;
        if (materialButtonToggleGroup == null) {
            return;
        }
        if (this.MediaBrowserCompatItemReceiver.write == 0) {
            i = calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_period_am_button;
        } else {
            i = calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_clock_period_pm_button;
        }
        materialButtonToggleGroup.read(i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatItemReceiver.read = i;
        this.AudioAttributesImplBaseParcelizer.setChecked(i == 12);
        this.IconCompatParcelizer.setChecked(i == 10);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.parseHeader
    public final void write() {
        this.AudioAttributesImplApi26Parcelizer.setVisibility(0);
        RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver.read);
    }

    @Override // kotlin.parseHeader
    public final void AudioAttributesCompatParcelizer() {
        View focusedChild = this.AudioAttributesImplApi26Parcelizer.getFocusedChild();
        if (focusedChild != null) {
            checkAndPeekStreamMarker.read(focusedChild, false);
        }
        this.AudioAttributesImplApi26Parcelizer.setVisibility(8);
    }

    @Override // kotlin.parseHeader
    public final void read() {
        write(this.MediaBrowserCompatItemReceiver);
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.setChecked(this.MediaBrowserCompatItemReceiver.read == 12);
        this.IconCompatParcelizer.setChecked(this.MediaBrowserCompatItemReceiver.read == 10);
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.setChecked(false);
        this.IconCompatParcelizer.setChecked(false);
    }
}
