package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.checkFrameHeaderFromPeek;
import kotlin.deserializeUsingCustom;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    private final EditText AudioAttributesCompatParcelizer;
    private final TextInputLayout IconCompatParcelizer;
    private TextView RemoteActionCompatParcelizer;
    private final Chip read;
    private TextWatcher write;

    public ChipTextInputComboView(Context context) {
        this(context, null);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.material_time_chip, (ViewGroup) this, false);
        this.read = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.material_time_input, (ViewGroup) this, false);
        this.IconCompatParcelizer = textInputLayout;
        EditText editTextAudioAttributesCompatParcelizer = textInputLayout.AudioAttributesCompatParcelizer();
        this.AudioAttributesCompatParcelizer = editTextAudioAttributesCompatParcelizer;
        editTextAudioAttributesCompatParcelizer.setVisibility(4);
        read readVar = new read(this, (byte) 0);
        this.write = readVar;
        editTextAudioAttributesCompatParcelizer.addTextChangedListener(readVar);
        RemoteActionCompatParcelizer();
        addView(chip);
        addView(textInputLayout);
        this.RemoteActionCompatParcelizer = (TextView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.material_label);
        editTextAudioAttributesCompatParcelizer.setId(InvalidTypeIdException.read());
        InvalidTypeIdException.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer, editTextAudioAttributesCompatParcelizer.getId());
        editTextAudioAttributesCompatParcelizer.setSaveEnabled(false);
        editTextAudioAttributesCompatParcelizer.setLongClickable(false);
    }

    private void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.read.isChecked();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.read.setChecked(z);
        this.AudioAttributesCompatParcelizer.setVisibility(z ? 0 : 4);
        this.read.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            checkAndPeekStreamMarker.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.read.toggle();
    }

    public void setText(CharSequence charSequence) {
        String strIconCompatParcelizer = IconCompatParcelizer(charSequence);
        this.read.setText(strIconCompatParcelizer);
        if (TextUtils.isEmpty(strIconCompatParcelizer)) {
            return;
        }
        this.AudioAttributesCompatParcelizer.removeTextChangedListener(this.write);
        this.AudioAttributesCompatParcelizer.setText(strIconCompatParcelizer);
        this.AudioAttributesCompatParcelizer.addTextChangedListener(this.write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String IconCompatParcelizer(CharSequence charSequence) {
        return TimeModel.IconCompatParcelizer(getResources(), charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.read.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.read.setTag(i, obj);
    }

    public void setHelperText(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setText(charSequence);
    }

    public void setCursorVisible(boolean z) {
        this.AudioAttributesCompatParcelizer.setCursorVisible(z);
    }

    public final void write(InputFilter inputFilter) {
        InputFilter[] filters = this.AudioAttributesCompatParcelizer.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.AudioAttributesCompatParcelizer.setFilters(inputFilterArr);
    }

    public final TextInputLayout read() {
        return this.IconCompatParcelizer;
    }

    public void setChipDelegate(deserializeUsingCustom deserializeusingcustom) {
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this.read, deserializeusingcustom);
    }

    class read extends checkFrameHeaderFromPeek {
        private read() {
        }

        /* synthetic */ read(ChipTextInputComboView chipTextInputComboView, byte b) {
            this();
        }

        @Override // kotlin.checkFrameHeaderFromPeek, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.read.setText(ChipTextInputComboView.this.IconCompatParcelizer(TarConstants.VERSION_POSIX));
                return;
            }
            String strIconCompatParcelizer = ChipTextInputComboView.this.IconCompatParcelizer(editable);
            Chip chip = ChipTextInputComboView.this.read;
            if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                strIconCompatParcelizer = ChipTextInputComboView.this.IconCompatParcelizer(TarConstants.VERSION_POSIX);
            }
            chip.setText(strIconCompatParcelizer);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RemoteActionCompatParcelizer();
    }
}
