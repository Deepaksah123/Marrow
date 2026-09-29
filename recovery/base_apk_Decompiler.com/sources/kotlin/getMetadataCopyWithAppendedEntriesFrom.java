package kotlin;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getMetadataCopyWithAppendedEntriesFrom {
    public int AudioAttributesCompatParcelizer;
    public int IconCompatParcelizer;
    public int MediaBrowserCompatCustomActionResultReceiver;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int[] write = new int[0];

    protected abstract void write();

    public getMetadataCopyWithAppendedEntriesFrom(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_progress_track_thickness);
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator, i, i2, new int[0]);
        this.MediaBrowserCompatCustomActionResultReceiver = SeekMap.write(context, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.RemoteActionCompatParcelizer = Math.min(SeekMap.write(context, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_trackCornerRadius, 0), this.MediaBrowserCompatCustomActionResultReceiver / 2);
        this.IconCompatParcelizer = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_showAnimationBehavior, 0);
        this.AudioAttributesCompatParcelizer = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_hideAnimationBehavior, 0);
        RemoteActionCompatParcelizer(context, typedArrayWrite);
        AudioAttributesCompatParcelizer(context, typedArrayWrite);
        typedArrayWrite.recycle();
    }

    private void RemoteActionCompatParcelizer(Context context, TypedArray typedArray) {
        if (!typedArray.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_indicatorColor)) {
            this.write = new int[]{createExtractors.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_indicatorColor).type != 1) {
            this.write = new int[]{typedArray.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_indicatorColor, -1));
        this.write = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void AudioAttributesCompatParcelizer(Context context, TypedArray typedArray) {
        if (typedArray.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_trackColor)) {
            this.read = typedArray.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.BaseProgressIndicator_trackColor, -1);
            return;
        }
        this.read = this.write[0];
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
        float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
        typedArrayObtainStyledAttributes.recycle();
        this.read = createExtractors.IconCompatParcelizer(this.read, (int) (f * 255.0f));
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer != 0;
    }

    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer != 0;
    }
}
