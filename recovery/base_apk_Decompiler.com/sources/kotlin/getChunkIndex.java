package kotlin;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class getChunkIndex {
    private static final boolean RemoteActionCompatParcelizer = true;
    private ColorStateList AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private final MaterialButton MediaBrowserCompatSearchResultReceiver;
    private ColorStateList MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private ColorStateList MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private Drawable RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private LayerDrawable onCommand;
    private isValidFrameType onCustomAction;
    private PorterDuff.Mode read;
    private boolean write;
    private boolean onAddQueueItem = false;
    private boolean IconCompatParcelizer = false;
    private boolean MediaBrowserCompatCustomActionResultReceiver = false;
    private boolean onPause = true;

    public getChunkIndex(MaterialButton materialButton, isValidFrameType isvalidframetype) {
        this.MediaBrowserCompatSearchResultReceiver = materialButton;
        this.onCustomAction = isvalidframetype;
    }

    public final void AudioAttributesCompatParcelizer(TypedArray typedArray) {
        this.MediaBrowserCompatItemReceiver = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_android_insetLeft, 0);
        this.MediaMetadataCompat = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_android_insetRight, 0);
        this.MediaBrowserCompatMediaItem = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_android_insetTop, 0);
        this.AudioAttributesImplApi21Parcelizer = typedArray.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_cornerRadius, -1);
            this.AudioAttributesImplApi26Parcelizer = dimensionPixelSize;
            AudioAttributesCompatParcelizer(this.onCustomAction.AudioAttributesCompatParcelizer(dimensionPixelSize));
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_strokeWidth, 0);
        this.read = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(typedArray.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.AudioAttributesCompatParcelizer = SeekMap.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.getContext(), typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_backgroundTint);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = SeekMap.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.getContext(), typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_strokeColor);
        this.MediaDescriptionCompat = SeekMap.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.getContext(), typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_rippleColor);
        this.write = typedArray.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_android_checkable, false);
        this.AudioAttributesImplBaseParcelizer = typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_elevation, 0);
        this.onPause = typedArray.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_toggleCheckedStateOnClick, true);
        int iOnCommand = InvalidTypeIdException.onCommand(this.MediaBrowserCompatSearchResultReceiver);
        int paddingTop = this.MediaBrowserCompatSearchResultReceiver.getPaddingTop();
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.MediaBrowserCompatSearchResultReceiver);
        int paddingBottom = this.MediaBrowserCompatSearchResultReceiver.getPaddingBottom();
        if (typedArray.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_android_background)) {
            AudioAttributesImplApi21Parcelizer();
        } else {
            MediaMetadataCompat();
        }
        InvalidTypeIdException.read(this.MediaBrowserCompatSearchResultReceiver, iOnCommand + this.MediaBrowserCompatItemReceiver, paddingTop + this.MediaBrowserCompatMediaItem, iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + this.MediaMetadataCompat, paddingBottom + this.AudioAttributesImplApi21Parcelizer);
    }

    private void MediaMetadataCompat() {
        this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver());
        frameSizeBytesByTypeNb framesizebytesbytypenb = read();
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(this.AudioAttributesImplBaseParcelizer);
            framesizebytesbytypenb.setState(this.MediaBrowserCompatSearchResultReceiver.getDrawableState());
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompatSearchResultReceiver.setSupportBackgroundTintList(this.AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatSearchResultReceiver.setSupportBackgroundTintMode(this.read);
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.IconCompatParcelizer;
    }

    private InsetDrawable IconCompatParcelizer(Drawable drawable) {
        return new InsetDrawable(drawable, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatMediaItem, this.MediaMetadataCompat, this.AudioAttributesImplApi21Parcelizer);
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        if (this.AudioAttributesCompatParcelizer != colorStateList) {
            this.AudioAttributesCompatParcelizer = colorStateList;
            if (read() != null) {
                findFormatOverrides.AudioAttributesCompatParcelizer(read(), this.AudioAttributesCompatParcelizer);
            }
        }
    }

    public final ColorStateList IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(PorterDuff.Mode mode) {
        if (this.read != mode) {
            this.read = mode;
            if (read() == null || this.read == null) {
                return;
            }
            findFormatOverrides.read(read(), this.read);
        }
    }

    public final PorterDuff.Mode AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.onAddQueueItem = true;
        MediaBrowserCompatSearchResultReceiver();
    }

    private Drawable MediaBrowserCompatItemReceiver() {
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(this.onCustomAction);
        framesizebytesbytypenb.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.getContext());
        findFormatOverrides.AudioAttributesCompatParcelizer(framesizebytesbytypenb, this.AudioAttributesCompatParcelizer);
        PorterDuff.Mode mode = this.read;
        if (mode != null) {
            findFormatOverrides.read(framesizebytesbytypenb, mode);
        }
        framesizebytesbytypenb.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        frameSizeBytesByTypeNb framesizebytesbytypenb2 = new frameSizeBytesByTypeNb(this.onCustomAction);
        framesizebytesbytypenb2.setTint(0);
        framesizebytesbytypenb2.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, this.onAddQueueItem ? createExtractors.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface) : 0);
        if (RemoteActionCompatParcelizer) {
            frameSizeBytesByTypeNb framesizebytesbytypenb3 = new frameSizeBytesByTypeNb(this.onCustomAction);
            this.RatingCompat = framesizebytesbytypenb3;
            findFormatOverrides.AudioAttributesCompatParcelizer(framesizebytesbytypenb3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(outputPendingSampleMetadata.RemoteActionCompatParcelizer(this.MediaDescriptionCompat), IconCompatParcelizer(new LayerDrawable(new Drawable[]{framesizebytesbytypenb2, framesizebytesbytypenb})), this.RatingCompat);
            this.onCommand = rippleDrawable;
            return rippleDrawable;
        }
        TrueHdSampleRechunker trueHdSampleRechunker = new TrueHdSampleRechunker(this.onCustomAction);
        this.RatingCompat = trueHdSampleRechunker;
        findFormatOverrides.AudioAttributesCompatParcelizer(trueHdSampleRechunker, outputPendingSampleMetadata.RemoteActionCompatParcelizer(this.MediaDescriptionCompat));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{framesizebytesbytypenb2, framesizebytesbytypenb, this.RatingCompat});
        this.onCommand = layerDrawable;
        return IconCompatParcelizer(layerDrawable);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        if (read() != null) {
            read().setTint(i);
        }
    }

    public final void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        if (this.MediaDescriptionCompat != colorStateList) {
            this.MediaDescriptionCompat = colorStateList;
            boolean z = RemoteActionCompatParcelizer;
            if (z && (this.MediaBrowserCompatSearchResultReceiver.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.MediaBrowserCompatSearchResultReceiver.getBackground()).setColor(outputPendingSampleMetadata.RemoteActionCompatParcelizer(colorStateList));
            } else {
                if (z || !(this.MediaBrowserCompatSearchResultReceiver.getBackground() instanceof TrueHdSampleRechunker)) {
                    return;
                }
                ((TrueHdSampleRechunker) this.MediaBrowserCompatSearchResultReceiver.getBackground()).setTintList(outputPendingSampleMetadata.RemoteActionCompatParcelizer(colorStateList));
            }
        }
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != colorStateList) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = colorStateList;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public final void read(int i) {
        if (this.handleMediaPlayPauseIfPendingOnHandler != i) {
            this.handleMediaPlayPauseIfPendingOnHandler = i;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public final int write() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        frameSizeBytesByTypeNb framesizebytesbytypenb = read();
        frameSizeBytesByTypeNb framesizebytesbytypenbMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            if (framesizebytesbytypenbMediaBrowserCompatMediaItem != null) {
                framesizebytesbytypenbMediaBrowserCompatMediaItem.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, this.onAddQueueItem ? createExtractors.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface) : 0);
            }
        }
    }

    public final void write(int i) {
        if (this.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi26Parcelizer == i) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        AudioAttributesCompatParcelizer(this.onCustomAction.AudioAttributesCompatParcelizer(i));
    }

    private frameSizeBytesByTypeNb RemoteActionCompatParcelizer(boolean z) {
        LayerDrawable layerDrawable = this.onCommand;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (RemoteActionCompatParcelizer) {
            return (frameSizeBytesByTypeNb) ((LayerDrawable) ((InsetDrawable) this.onCommand.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return (frameSizeBytesByTypeNb) this.onCommand.getDrawable(!z ? 1 : 0);
    }

    public final frameSizeBytesByTypeNb read() {
        return RemoteActionCompatParcelizer(false);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.write = z;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPause;
    }

    public final void write(boolean z) {
        this.onPause = z;
    }

    private frameSizeBytesByTypeNb MediaBrowserCompatMediaItem() {
        return RemoteActionCompatParcelizer(true);
    }

    private void IconCompatParcelizer(isValidFrameType isvalidframetype) {
        if (read() != null) {
            read().setShapeAppearanceModel(isvalidframetype);
        }
        if (MediaBrowserCompatMediaItem() != null) {
            MediaBrowserCompatMediaItem().setShapeAppearanceModel(isvalidframetype);
        }
        if (RatingCompat() != null) {
            RatingCompat().setShapeAppearanceModel(isvalidframetype);
        }
    }

    private readSample RatingCompat() {
        LayerDrawable layerDrawable = this.onCommand;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.onCommand.getNumberOfLayers() > 2) {
            return (readSample) this.onCommand.getDrawable(2);
        }
        return (readSample) this.onCommand.getDrawable(1);
    }

    public final void AudioAttributesCompatParcelizer(isValidFrameType isvalidframetype) {
        this.onCustomAction = isvalidframetype;
        IconCompatParcelizer(isvalidframetype);
    }

    public final isValidFrameType RemoteActionCompatParcelizer() {
        return this.onCustomAction;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        read(this.MediaBrowserCompatMediaItem, i);
    }

    public final void IconCompatParcelizer(int i) {
        read(i, this.AudioAttributesImplApi21Parcelizer);
    }

    private void read(int i, int i2) {
        int iOnCommand = InvalidTypeIdException.onCommand(this.MediaBrowserCompatSearchResultReceiver);
        int paddingTop = this.MediaBrowserCompatSearchResultReceiver.getPaddingTop();
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.MediaBrowserCompatSearchResultReceiver);
        int paddingBottom = this.MediaBrowserCompatSearchResultReceiver.getPaddingBottom();
        int i3 = this.MediaBrowserCompatMediaItem;
        int i4 = this.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.MediaBrowserCompatMediaItem = i;
        if (!this.IconCompatParcelizer) {
            MediaMetadataCompat();
        }
        InvalidTypeIdException.read(this.MediaBrowserCompatSearchResultReceiver, iOnCommand, (paddingTop + i) - i3, iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (paddingBottom + i2) - i4);
    }
}
