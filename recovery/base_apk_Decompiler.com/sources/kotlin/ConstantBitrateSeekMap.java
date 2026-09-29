package kotlin;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import java.lang.reflect.Method;
import kotlin.calculateNextSearchBytePosition;
import kotlin.isValidFrameType;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class ConstantBitrateSeekMap {
    private static final double write = Math.cos(Math.toRadians(45.0d));
    private final frameSizeBytesByTypeNb AudioAttributesCompatParcelizer;
    private ColorStateList AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private LayerDrawable AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private Drawable MediaBrowserCompatMediaItem;
    private frameSizeBytesByTypeNb MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private frameSizeBytesByTypeNb MediaDescriptionCompat;
    private ValueAnimator MediaMetadataCompat;
    private final frameSizeBytesByTypeNb RatingCompat;
    private Drawable RemoteActionCompatParcelizer;
    private final MaterialCardView handleMediaPlayPauseIfPendingOnHandler;
    private final TimeInterpolator onAddQueueItem;
    private final int onCommand;
    private isValidFrameType onFastForward;
    private ColorStateList onMediaButtonEvent;
    private int onPause;
    private Drawable onPlay;
    private ColorStateList onPlayFromMediaId;
    private boolean read;
    private final Rect onPrepare = new Rect();
    private boolean onCustomAction = false;
    private float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;

    public ConstantBitrateSeekMap(MaterialCardView materialCardView, AttributeSet attributeSet, int i, int i2) {
        this.handleMediaPlayPauseIfPendingOnHandler = materialCardView;
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(materialCardView.getContext(), attributeSet, i, i2);
        this.AudioAttributesCompatParcelizer = framesizebytesbytypenb;
        framesizebytesbytypenb.RemoteActionCompatParcelizer(materialCardView.getContext());
        framesizebytesbytypenb.onSetCaptioningEnabled();
        isValidFrameType.write writeVarMediaDescriptionCompat = framesizebytesbytypenb.onPlayFromUri().MediaDescriptionCompat();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.CardView, i, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CardView_cardCornerRadius)) {
            writeVarMediaDescriptionCompat.IconCompatParcelizer(typedArrayObtainStyledAttributes.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.CardView_cardCornerRadius, BitmapDescriptorFactory.HUE_RED));
        }
        this.RatingCompat = new frameSizeBytesByTypeNb();
        read(writeVarMediaDescriptionCompat.RemoteActionCompatParcelizer());
        this.onAddQueueItem = getSampleRateLookupKey.read(materialCardView.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingLinearInterpolator, BinarySearchSeekerSeekOperationParams.write);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getSampleRateLookupKey.write(materialCardView.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort2, 300);
        this.onCommand = getSampleRateLookupKey.write(materialCardView.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void AudioAttributesCompatParcelizer(TypedArray typedArray) {
        ColorStateList colorStateListIconCompatParcelizer = SeekMap.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getContext(), typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_strokeColor);
        this.onMediaButtonEvent = colorStateListIconCompatParcelizer;
        if (colorStateListIconCompatParcelizer == null) {
            this.onMediaButtonEvent = ColorStateList.valueOf(-1);
        }
        this.onPause = typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_android_checkable, false);
        this.read = z;
        this.handleMediaPlayPauseIfPendingOnHandler.setLongClickable(z);
        this.AudioAttributesImplApi21Parcelizer = SeekMap.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getContext(), typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_checkedIconTint);
        AudioAttributesCompatParcelizer(SeekMap.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getContext(), typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_checkedIcon));
        AudioAttributesCompatParcelizer(typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_checkedIconSize, 0));
        read(typedArray.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_checkedIconMargin, 0));
        this.MediaBrowserCompatCustomActionResultReceiver = typedArray.getInteger(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList colorStateListIconCompatParcelizer2 = SeekMap.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getContext(), typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_rippleColor);
        this.onPlayFromMediaId = colorStateListIconCompatParcelizer2;
        if (colorStateListIconCompatParcelizer2 == null) {
            this.onPlayFromMediaId = ColorStateList.valueOf(createExtractors.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, calculateNextSearchBytePosition.IconCompatParcelizer.colorControlHighlight));
        }
        read(SeekMap.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getContext(), typedArray, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView_cardForegroundColor));
        onPrepare();
        MediaMetadataCompat();
        onPrepareFromMediaId();
        this.handleMediaPlayPauseIfPendingOnHandler.read(IconCompatParcelizer(this.AudioAttributesCompatParcelizer));
        Drawable drawableOnMediaButtonEvent = onPlayFromUri() ? onMediaButtonEvent() : this.RatingCompat;
        this.MediaBrowserCompatMediaItem = drawableOnMediaButtonEvent;
        this.handleMediaPlayPauseIfPendingOnHandler.setForeground(IconCompatParcelizer(drawableOnMediaButtonEvent));
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.onCustomAction;
    }

    public final void AudioAttributesImplBaseParcelizer() {
        this.onCustomAction = true;
    }

    public final void write(ColorStateList colorStateList) {
        if (this.onMediaButtonEvent == colorStateList) {
            return;
        }
        this.onMediaButtonEvent = colorStateList;
        onPrepareFromMediaId();
    }

    public final void IconCompatParcelizer(int i) {
        if (i == this.onPause) {
            return;
        }
        this.onPause = i;
        onPrepareFromMediaId();
    }

    public final frameSizeBytesByTypeNb write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(colorStateList);
    }

    public final ColorStateList read() {
        return this.AudioAttributesCompatParcelizer.onPlay();
    }

    public final void read(ColorStateList colorStateList) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.RatingCompat;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateList);
    }

    public final void AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
        this.onPrepare.set(i, i2, i3, i4);
        RatingCompat();
    }

    public final Rect MediaBrowserCompatItemReceiver() {
        return this.onPrepare;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        Drawable drawable = this.MediaBrowserCompatMediaItem;
        Drawable drawableOnMediaButtonEvent = onPlayFromUri() ? onMediaButtonEvent() : this.RatingCompat;
        this.MediaBrowserCompatMediaItem = drawableOnMediaButtonEvent;
        if (drawable != drawableOnMediaButtonEvent) {
            read(drawableOnMediaButtonEvent);
        }
    }

    private void write(boolean z) {
        int i;
        float f = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        float f2 = z ? 1.0f - this.IconCompatParcelizer : this.IconCompatParcelizer;
        ValueAnimator valueAnimator = this.MediaMetadataCompat;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.MediaMetadataCompat = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.IconCompatParcelizer, f);
        this.MediaMetadataCompat = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.DefaultExtractorInput
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.read.IconCompatParcelizer(valueAnimator2);
            }
        });
        this.MediaMetadataCompat.setInterpolator(this.onAddQueueItem);
        ValueAnimator valueAnimator2 = this.MediaMetadataCompat;
        if (z) {
            i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        } else {
            i = this.onCommand;
        }
        valueAnimator2.setDuration((long) (i * f2));
        this.MediaMetadataCompat.start();
    }

    final /* synthetic */ void IconCompatParcelizer(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.RemoteActionCompatParcelizer.setAlpha((int) (255.0f * fFloatValue));
        this.IconCompatParcelizer = fFloatValue;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        read(this.onFastForward.AudioAttributesCompatParcelizer(f));
        this.MediaBrowserCompatMediaItem.invalidateSelf();
        if (onPlayFromSearch() || onPlay()) {
            RatingCompat();
        }
        if (onPlayFromSearch()) {
            MediaDescriptionCompat();
        }
    }

    public final float IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.onRemoveQueueItemAt();
    }

    public final void read(float f) {
        this.AudioAttributesCompatParcelizer.onCustomAction(f);
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.RatingCompat;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.onCustomAction(f);
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb2 = this.MediaDescriptionCompat;
        if (framesizebytesbytypenb2 != null) {
            framesizebytesbytypenb2.onCustomAction(f);
        }
    }

    public final void MediaMetadataCompat() {
        this.AudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler(this.handleMediaPlayPauseIfPendingOnHandler.X_());
    }

    public final void MediaDescriptionCompat() {
        if (!MediaBrowserCompatCustomActionResultReceiver()) {
            this.handleMediaPlayPauseIfPendingOnHandler.read(IconCompatParcelizer(this.AudioAttributesCompatParcelizer));
        }
        this.handleMediaPlayPauseIfPendingOnHandler.setForeground(IconCompatParcelizer(this.MediaBrowserCompatMediaItem));
    }

    private void onPrepareFromMediaId() {
        this.RatingCompat.IconCompatParcelizer(this.onPause, this.onMediaButtonEvent);
    }

    public final void RatingCompat() {
        int iMediaBrowserCompatMediaItem = (int) (((onPlay() || onPlayFromSearch()) ? MediaBrowserCompatMediaItem() : BitmapDescriptorFactory.HUE_RED) - onPlayFromMediaId());
        this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this.onPrepare.left + iMediaBrowserCompatMediaItem, this.onPrepare.top + iMediaBrowserCompatMediaItem, this.onPrepare.right + iMediaBrowserCompatMediaItem, this.onPrepare.bottom + iMediaBrowserCompatMediaItem);
    }

    public final void read(boolean z) {
        this.read = z;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.read;
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        this.onPlayFromMediaId = colorStateList;
        onPrepare();
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        this.AudioAttributesImplApi21Parcelizer = colorStateList;
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable != null) {
            findFormatOverrides.AudioAttributesCompatParcelizer(drawable, colorStateList);
        }
    }

    public final void AudioAttributesCompatParcelizer(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
            this.RemoteActionCompatParcelizer = drawableMutate;
            findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, this.AudioAttributesImplApi21Parcelizer);
            AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.isChecked());
        } else {
            this.RemoteActionCompatParcelizer = null;
        }
        LayerDrawable layerDrawable = this.AudioAttributesImplBaseParcelizer;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_card_checked_layer_id, this.RemoteActionCompatParcelizer);
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    public final void read(int i) {
        this.MediaBrowserCompatItemReceiver = i;
    }

    public final void read(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.AudioAttributesImplBaseParcelizer != null) {
            if (this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi21Parcelizer()) {
                iCeil = (int) Math.ceil(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() * 2.0f);
                iCeil2 = (int) Math.ceil(MediaBrowserCompatSearchResultReceiver() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            if (onPause()) {
                i3 = ((i - this.MediaBrowserCompatItemReceiver) - this.AudioAttributesImplApi26Parcelizer) - iCeil2;
            } else {
                i3 = this.MediaBrowserCompatItemReceiver;
            }
            if (onFastForward()) {
                i4 = this.MediaBrowserCompatItemReceiver;
            } else {
                i4 = ((i2 - this.MediaBrowserCompatItemReceiver) - this.AudioAttributesImplApi26Parcelizer) - iCeil;
            }
            int i9 = i4;
            if (onPause()) {
                i5 = this.MediaBrowserCompatItemReceiver;
            } else {
                i5 = ((i - this.MediaBrowserCompatItemReceiver) - this.AudioAttributesImplApi26Parcelizer) - iCeil2;
            }
            if (onFastForward()) {
                i6 = ((i2 - this.MediaBrowserCompatItemReceiver) - this.AudioAttributesImplApi26Parcelizer) - iCeil;
            } else {
                i6 = this.MediaBrowserCompatItemReceiver;
            }
            int i10 = i6;
            if (InvalidTypeIdException.MediaBrowserCompatMediaItem(this.handleMediaPlayPauseIfPendingOnHandler) != 1) {
                i8 = i5;
                i7 = i3;
            } else {
                i7 = i5;
                i8 = i3;
            }
            this.AudioAttributesImplBaseParcelizer.setLayerInset(2, i7, i10, i8, i9);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        Drawable drawable = this.onPlay;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.onPlay.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.onPlay.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public final void read(isValidFrameType isvalidframetype) {
        this.onFastForward = isvalidframetype;
        this.AudioAttributesCompatParcelizer.setShapeAppearanceModel(isvalidframetype);
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(!r0.onSetRepeatMode());
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.RatingCompat;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.setShapeAppearanceModel(isvalidframetype);
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb2 = this.MediaDescriptionCompat;
        if (framesizebytesbytypenb2 != null) {
            framesizebytesbytypenb2.setShapeAppearanceModel(isvalidframetype);
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb3 = this.MediaBrowserCompatSearchResultReceiver;
        if (framesizebytesbytypenb3 != null) {
            framesizebytesbytypenb3.setShapeAppearanceModel(isvalidframetype);
        }
    }

    private void read(Drawable drawable) {
        if (this.handleMediaPlayPauseIfPendingOnHandler.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.handleMediaPlayPauseIfPendingOnHandler.getForeground()).setDrawable(drawable);
        } else {
            this.handleMediaPlayPauseIfPendingOnHandler.setForeground(IconCompatParcelizer(drawable));
        }
    }

    private Drawable IconCompatParcelizer(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi21Parcelizer()) {
            iCeil2 = (int) Math.ceil(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            iCeil = (int) Math.ceil(MediaBrowserCompatSearchResultReceiver());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new InsetDrawable(drawable, iCeil, iCeil2, iCeil, iCeil2) { // from class: o.ConstantBitrateSeekMap.5
            private static long AudioAttributesCompatParcelizer;
            private static char AudioAttributesImplApi21Parcelizer;
            private static char AudioAttributesImplBaseParcelizer;
            private static int IconCompatParcelizer;
            private static char MediaBrowserCompatItemReceiver;
            private static int read;
            private static char write;
            private static final byte[] $$c = {121, 72, 116, 113};
            private static final int $$d = 211;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {9, -34, 82, 56, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
            private static final int $$b = 29;
            private static final byte[] MediaBrowserCompatCustomActionResultReceiver = {70, -23, 8, 77, 14, -9, 15, -2, -5, -4, -53, 64, -7, 0, 6, -7, -50, 20, TarConstants.LF_DIR, -16, 6, 7, -26, 31, -16, 3, 9, -1, 16, -38, 29, 6, -23, 26, -2, 10, -7, -7, 14, -9, 15, -2, -5, -4, -53, 66, 5, -68, 35, 35, -2, -11, 3, 15, 1, -1, 16, -46, 40, -10, 16, 4, -13, 0, -32, 46, 6, -32, 22, 5, -7, -8, 22, -20, -50, 63, -10, 14, -6, -56, 38, 34, -1, -8, 6, -6, -2, -3, -2, 12, -8, 22, -20, -50, 63, -10, 14, -6, -56, 28, 38, 7, -14, 3, -1, 14, -20, 12, 10, -15, -21, 24, 6, 7, -29, 12, 12, 10, -15, 14, -9, 15, -2, -5, -4, -53, 66, 5, -68, 38, 39, -5, 2, -14, 9, -41, 42, 4, -11, 9, 8, -10, 16, 4, -13, 0, -17, 20, -3, 12, 9, -10, 5, -7, -8, 22, -20, -50, 63, -10, 14, -6, -56, 39, 21, 11, -2, 9, -21, 2, 11, -6, -1, 16, -48, 31, 21, -1, -13, -8, 22, -20, -50, 63, -10, 14, -6, -56, 34, 20, 9, -4, -1, 18, -8, 22, -20, -50, 63, -10, 14, -6, -56, 31, 36, 0, -6, 6, -8, -10, -8, 22, -20, -50, 63, -10, 14, -6, -56, 69, -12, 2, 7, -6, -1, 18, -69, 20, 35, 1, 3, 15, 1, -9, -6, 11, -6, -21, 20, 9, -4, -1, 18, -13, 16, -50, 35, 1, 3, 15, 1, -9, -6, 11, -6, -8, 22, -20, -50, 63, -10, 14, -6, -56, 69, -12, 2, 7, -6, -1, 18, -69, 32, 25, 16, -11, 8, -10, 6, 9, -6, -3, -5, -14, 31, -8, 22, -20, -50, 63, -10, 14, -6, -56, 34, 20, 9, -4, -1, 18, -56};
            private static final int AudioAttributesImplApi26Parcelizer = 51;

            private static String $$e(int i, short s, short s2) {
                int i2 = 4 - (s * 3);
                int i3 = 122 - (i * 18);
                byte[] bArr = $$c;
                int i4 = s2 * 2;
                byte[] bArr2 = new byte[1 - i4];
                int i5 = 0 - i4;
                int i6 = -1;
                if (bArr == null) {
                    i3 += i2;
                    i2++;
                    i6 = -1;
                }
                while (true) {
                    int i7 = i6 + 1;
                    bArr2[i7] = (byte) i3;
                    if (i7 == i5) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i2;
                    i3 += bArr[i2];
                    i2 = i8 + 1;
                    i6 = i7;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void d(short r7, byte r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 * 2
                    int r8 = 73 - r8
                    int r7 = r7 * 3
                    int r7 = 4 - r7
                    byte[] r0 = kotlin.ConstantBitrateSeekMap.AnonymousClass5.$$a
                    int r9 = r9 * 2
                    int r9 = r9 + 20
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r7]
                    r6 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r6
                L2d:
                    int r7 = r7 + r3
                    int r8 = r8 + 1
                    r3 = r4
                    r6 = r8
                    r8 = r7
                    r7 = r6
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.ConstantBitrateSeekMap.AnonymousClass5.d(short, byte, byte, java.lang.Object[]):void");
            }

            private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
                char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer ^ 4027965449757546139L, cArr, i);
                buildsetrequirementsintent.write = 4;
                int i3 = $10 + 95;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                    int i5 = $10 + 31;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                    int i7 = buildsetrequirementsintent.write;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 12424, 19 - TextUtils.indexOf((CharSequence) "", '0', 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int fadingEdgeLength = 1868 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10;
                            byte b = (byte) ($$d & 5);
                            byte b2 = (byte) (b - 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read(touchSlop, fadingEdgeLength, maximumFlingVelocity, 1983509525, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
                int i8 = $11 + 77;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                objArr[0] = str;
            }

            private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
                isStopped isstopped = new isStopped();
                char[] cArr2 = new char[cArr.length];
                isstopped.read = 0;
                char[] cArr3 = new char[2];
                while (isstopped.read < cArr.length) {
                    cArr3[0] = cArr[isstopped.read];
                    cArr3[1] = cArr[isstopped.read + 1];
                    int i2 = 58224;
                    for (int i3 = 0; i3 < 16; i3++) {
                        char c = cArr3[1];
                        char c2 = cArr3[0];
                        try {
                            Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplBaseParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(MediaBrowserCompatItemReceiver)};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                            if (objRemoteActionCompatParcelizer == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.getMode(0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1505, TextUtils.lastIndexOf("", '0', 0, 0) + 22, 1322448859, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                            cArr3[1] = cCharValue;
                            Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i2) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1505 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 22, 1322448859, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            }
                            cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                            i2 -= 40503;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr2[isstopped.read] = cArr3[0];
                    cArr2[isstopped.read + 1] = cArr3[1];
                    Object[] objArr4 = {isstopped, isstopped};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.getSize(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 9017, 58 - (ViewConfiguration.getLongPressTimeout() >> 16), -1950993821, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            @Override // android.graphics.drawable.Drawable
            public final int getMinimumHeight() {
                int i = 2 % 2;
                int i2 = read;
                int i3 = i2 + 15;
                IconCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 59;
                IconCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                return -1;
            }

            @Override // android.graphics.drawable.Drawable
            public final int getMinimumWidth() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer;
                int i3 = i2 + 43;
                read = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 87 / 0;
                }
                int i5 = i2 + 41;
                read = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 45 / 0;
                }
                return -1;
            }

            @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
            public final boolean getPadding(Rect rect) {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 59;
                int i3 = i2 % 128;
                read = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 61;
                IconCompatParcelizer = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:144:0x05db  */
            /* JADX WARN: Removed duplicated region for block: B:192:0x05ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void read(android.content.Context r17, long r18, long r20) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1967
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.ConstantBitrateSeekMap.AnonymousClass5.read(android.content.Context, long, long):void");
            }

            static {
                AudioAttributesCompatParcelizer();
                read = 0;
                IconCompatParcelizer = 1;
                AudioAttributesCompatParcelizer = 1673009495617439065L;
            }

            static void AudioAttributesCompatParcelizer() {
                write = (char) 51106;
                AudioAttributesImplApi21Parcelizer = (char) 42909;
                AudioAttributesImplBaseParcelizer = (char) 4245;
                MediaBrowserCompatItemReceiver = (char) 23643;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(short r6, short r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = kotlin.ConstantBitrateSeekMap.AnonymousClass5.MediaBrowserCompatCustomActionResultReceiver
                    int r6 = 282 - r6
                    int r1 = 34 - r8
                    int r7 = r7 + 84
                    byte[] r1 = new byte[r1]
                    int r8 = 33 - r8
                    r2 = 0
                    if (r0 != 0) goto L13
                    r7 = r6
                    r4 = r8
                    r3 = r2
                    goto L2a
                L13:
                    r3 = r2
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L17:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    if (r3 != r8) goto L24
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L24:
                    int r3 = r3 + 1
                    int r7 = r7 + 1
                    r4 = r0[r7]
                L2a:
                    int r6 = r6 + r4
                    int r6 = r6 + (-1)
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.ConstantBitrateSeekMap.AnonymousClass5.a(short, short, byte, java.lang.Object[]):void");
            }
        };
    }

    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return (this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplBaseParcelizer() * 1.5f) + (onPlayFromSearch() ? MediaBrowserCompatMediaItem() : BitmapDescriptorFactory.HUE_RED);
    }

    private float MediaBrowserCompatSearchResultReceiver() {
        return this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplBaseParcelizer() + (onPlayFromSearch() ? MediaBrowserCompatMediaItem() : BitmapDescriptorFactory.HUE_RED);
    }

    private boolean onCommand() {
        return this.AudioAttributesCompatParcelizer.onSetRepeatMode();
    }

    private float onPlayFromMediaId() {
        return (this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatItemReceiver() && this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi21Parcelizer()) ? (float) ((1.0d - write) * ((double) this.handleMediaPlayPauseIfPendingOnHandler.RatingCompat())) : BitmapDescriptorFactory.HUE_RED;
    }

    private boolean onPlay() {
        return this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatItemReceiver() && !onCommand();
    }

    private boolean onPlayFromSearch() {
        return this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatItemReceiver() && onCommand() && this.handleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi21Parcelizer();
    }

    private float MediaBrowserCompatMediaItem() {
        return Math.max(Math.max(IconCompatParcelizer(this.onFastForward.AudioAttributesImplApi26Parcelizer(), this.AudioAttributesCompatParcelizer.onRemoveQueueItemAt()), IconCompatParcelizer(this.onFastForward.RatingCompat(), this.AudioAttributesCompatParcelizer.onRewind())), Math.max(IconCompatParcelizer(this.onFastForward.AudioAttributesCompatParcelizer(), this.AudioAttributesCompatParcelizer.onFastForward()), IconCompatParcelizer(this.onFastForward.write(), this.AudioAttributesCompatParcelizer.onMediaButtonEvent())));
    }

    private static float IconCompatParcelizer(amrSignatureWb amrsignaturewb, float f) {
        if (amrsignaturewb instanceof isWideBandValidFrameType) {
            return (float) ((1.0d - write) * ((double) f));
        }
        return amrsignaturewb instanceof frameSizeBytesByTypeWb ? f / 2.0f : BitmapDescriptorFactory.HUE_RED;
    }

    private boolean onPlayFromUri() {
        if (this.handleMediaPlayPauseIfPendingOnHandler.isClickable()) {
            return true;
        }
        View view = this.handleMediaPlayPauseIfPendingOnHandler;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    private Drawable onMediaButtonEvent() {
        if (this.onPlay == null) {
            this.onPlay = onCustomAction();
        }
        if (this.AudioAttributesImplBaseParcelizer == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.onPlay, this.RatingCompat, this.RemoteActionCompatParcelizer});
            this.AudioAttributesImplBaseParcelizer = layerDrawable;
            layerDrawable.setId(2, calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.mtrl_card_checked_layer_id);
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    private Drawable onCustomAction() {
        if (outputPendingSampleMetadata.write) {
            this.MediaDescriptionCompat = handleMediaPlayPauseIfPendingOnHandler();
            return new RippleDrawable(this.onPlayFromMediaId, null, this.MediaDescriptionCompat);
        }
        return onAddQueueItem();
    }

    private Drawable onAddQueueItem() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        frameSizeBytesByTypeNb framesizebytesbytypenbHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        this.MediaBrowserCompatSearchResultReceiver = framesizebytesbytypenbHandleMediaPlayPauseIfPendingOnHandler;
        framesizebytesbytypenbHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesImplApi21Parcelizer(this.onPlayFromMediaId);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.MediaBrowserCompatSearchResultReceiver);
        return stateListDrawable;
    }

    private void onPrepare() {
        Drawable drawable;
        if (outputPendingSampleMetadata.write && (drawable = this.onPlay) != null) {
            ((RippleDrawable) drawable).setColor(this.onPlayFromMediaId);
            return;
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.MediaBrowserCompatSearchResultReceiver;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(this.onPlayFromMediaId);
        }
    }

    private frameSizeBytesByTypeNb handleMediaPlayPauseIfPendingOnHandler() {
        return new frameSizeBytesByTypeNb(this.onFastForward);
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        read(z, false);
    }

    public final void read(boolean z, boolean z2) {
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable != null) {
            if (z2) {
                write(z);
            } else {
                drawable.setAlpha(z ? 255 : 0);
                this.IconCompatParcelizer = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        read(this.handleMediaPlayPauseIfPendingOnHandler.getMeasuredWidth(), this.handleMediaPlayPauseIfPendingOnHandler.getMeasuredHeight());
    }

    private boolean onPause() {
        return (this.MediaBrowserCompatCustomActionResultReceiver & 8388613) == 8388613;
    }

    private boolean onFastForward() {
        return (this.MediaBrowserCompatCustomActionResultReceiver & 80) == 80;
    }
}
