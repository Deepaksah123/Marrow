package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import kotlin.SeekMap;
import kotlin._methods;
import kotlin.calculateNextSearchBytePosition;
import kotlin.createExtractors;
import kotlin.readFrames;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    private static final int AudioAttributesCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] RemoteActionCompatParcelizer = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private boolean IconCompatParcelizer;
    private ColorStateList read;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesCompatParcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialRadioButton_buttonTint)) {
            _methods.write(this, SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialRadioButton_buttonTint));
        }
        this.IconCompatParcelizer = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayWrite.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.IconCompatParcelizer && _methods.write(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.IconCompatParcelizer = z;
        if (z) {
            _methods.write(this, RemoteActionCompatParcelizer());
        } else {
            _methods.write(this, null);
        }
    }

    private ColorStateList RemoteActionCompatParcelizer() {
        if (this.read == null) {
            int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorControlActivated);
            int iRemoteActionCompatParcelizer2 = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorOnSurface);
            int iRemoteActionCompatParcelizer3 = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface);
            int[][] iArr = RemoteActionCompatParcelizer;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer, 1.0f);
            iArr2[1] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2, 0.54f);
            iArr2[2] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2, 0.38f);
            iArr2[3] = createExtractors.write(iRemoteActionCompatParcelizer3, iRemoteActionCompatParcelizer2, 0.38f);
            this.read = new ColorStateList(iArr, iArr2);
        }
        return this.read;
    }
}
