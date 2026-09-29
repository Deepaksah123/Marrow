package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.SeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getMetadataCopyWithAppendedEntriesFrom;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public final class CircularProgressIndicatorSpec extends getMetadataCopyWithAppendedEntriesFrom {
    public int AudioAttributesImplApi26Parcelizer;
    public int AudioAttributesImplBaseParcelizer;
    public int MediaBrowserCompatItemReceiver;

    @Override // kotlin.getMetadataCopyWithAppendedEntriesFrom
    public final void write() {
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.RemoteActionCompatParcelizer);
    }

    private CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.CircularProgressIndicator, i, i2, new int[0]);
        this.AudioAttributesImplApi26Parcelizer = Math.max(SeekMap.write(context, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.MediaBrowserCompatCustomActionResultReceiver << 1);
        this.MediaBrowserCompatItemReceiver = SeekMap.write(context, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.AudioAttributesImplBaseParcelizer = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayWrite.recycle();
        write();
    }
}
