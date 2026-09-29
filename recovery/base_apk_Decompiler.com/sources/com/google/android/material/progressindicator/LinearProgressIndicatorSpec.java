package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getMetadataCopyWithAppendedEntriesFrom;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public final class LinearProgressIndicatorSpec extends getMetadataCopyWithAppendedEntriesFrom {
    public int AudioAttributesImplApi21Parcelizer;
    public boolean AudioAttributesImplApi26Parcelizer;
    public int AudioAttributesImplBaseParcelizer;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.IconCompatParcelizer);
    }

    private LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.LinearProgressIndicator, calculateNextSearchBytePosition.IconCompatParcelizer.linearProgressIndicatorStyle, LinearProgressIndicator.IconCompatParcelizer, new int[0]);
        this.AudioAttributesImplBaseParcelizer = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.AudioAttributesImplApi21Parcelizer = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.LinearProgressIndicator_indicatorDirectionLinear, 0);
        typedArrayWrite.recycle();
        write();
        this.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi21Parcelizer == 1;
    }

    @Override // kotlin.getMetadataCopyWithAppendedEntriesFrom
    public final void write() {
        if (this.AudioAttributesImplBaseParcelizer == 0) {
            if (this.RemoteActionCompatParcelizer > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.write.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
