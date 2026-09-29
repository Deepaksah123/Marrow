package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.SeekMap;
import kotlin.SeekPoint;
import kotlin.calculateNextSearchBytePosition;
import kotlin.readFrames;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, 0), attributeSet, i);
        write(attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AudioAttributesCompatParcelizer(context)) {
            AudioAttributesCompatParcelizer(context.getTheme(), i);
        }
    }

    private void write(AttributeSet attributeSet, int i) {
        int iIconCompatParcelizer;
        Context context = getContext();
        if (AudioAttributesCompatParcelizer(context)) {
            Resources.Theme theme = context.getTheme();
            if (write(context, theme, attributeSet, i, 0) || (iIconCompatParcelizer = IconCompatParcelizer(theme, attributeSet, i, 0)) == -1) {
                return;
            }
            AudioAttributesCompatParcelizer(theme, iIconCompatParcelizer);
        }
    }

    private void AudioAttributesCompatParcelizer(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextAppearance);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getContext(), typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextAppearance_android_lineHeight, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextAppearance_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        if (iAudioAttributesCompatParcelizer >= 0) {
            setLineHeight(iAudioAttributesCompatParcelizer);
        }
    }

    private static boolean AudioAttributesCompatParcelizer(Context context) {
        return SeekPoint.AudioAttributesCompatParcelizer(context, calculateNextSearchBytePosition.IconCompatParcelizer.textAppearanceLineHeightEnabled, true);
    }

    private static int AudioAttributesCompatParcelizer(Context context, TypedArray typedArray, int... iArr) {
        int iWrite = -1;
        for (int i = 0; i < iArr.length && iWrite < 0; i++) {
            iWrite = SeekMap.write(context, typedArray, iArr[i], -1);
        }
        return iWrite;
    }

    private static boolean write(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextView, i, 0);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, typedArrayObtainStyledAttributes, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextView_android_lineHeight, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextView_lineHeight);
        typedArrayObtainStyledAttributes.recycle();
        return iAudioAttributesCompatParcelizer != -1;
    }

    private static int IconCompatParcelizer(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextView, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialTextView_android_textAppearance, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
