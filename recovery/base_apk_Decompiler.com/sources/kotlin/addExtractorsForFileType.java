package kotlin;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getFirstSampleNumber;

/* JADX INFO: loaded from: classes3.dex */
public class addExtractorsForFileType extends frameSizeBytesByTypeNb implements Drawable.Callback, getFirstSampleNumber.read {
    private int AudioAttributesCompatParcelizer;
    private ColorStateList AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private ColorStateList MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private ColorStateList MediaBrowserCompatSearchResultReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Drawable MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private boolean MediaSessionCompatQueueItem;
    private final PointF MediaSessionCompatResultReceiverWrapper;
    private float MediaSessionCompatToken;
    private final RectF ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private boolean PlaybackStateCompatCustomAction;
    private float RatingCompat;
    private ColorStateList ResultReceiver;
    private float _init_lambda2;
    private PorterDuff.Mode _init_lambda3;
    private TextUtils.TruncateAt accessensureViewModelStore;
    private boolean accessgetReportFullyDrawnExecutorp;
    private ColorStateList handleMediaPlayPauseIfPendingOnHandler;
    private ColorStateList onAddQueueItem;
    private final Paint onCommand;
    private float onCustomAction;
    private CharSequence onFastForward;
    private float onMediaButtonEvent;
    private Drawable onPause;
    private Drawable onPlay;
    private float onPlayFromMediaId;
    private ColorStateList onPlayFromSearch;
    private boolean onPlayFromUri;
    private ColorFilter onPrepare;
    private float onPrepareFromMediaId;
    private int[] onPrepareFromSearch;
    private final Context onPrepareFromUri;
    private ColorStateList onRemoveQueueItem;
    private int onRemoveQueueItemAt;
    private int onRewind;
    private boolean onSeekTo;
    private int onSetCaptioningEnabled;
    private int onSetPlaybackSpeed;
    private int onSetRating;
    private int onSetRepeatMode;
    private int onSetShuffleMode;
    private final Paint.FontMetrics onSkipToNext;
    private boolean onSkipToPrevious;
    private WeakReference<write> onSkipToQueueItem;
    private float onStop;
    private final Path r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private CharSequence r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private final getFirstSampleNumber r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private float r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private ColorStateList r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private PorterDuffColorFilter r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private final Paint setSessionImpl;
    private Drawable write;
    private static final int[] read = {R.attr.state_enabled};
    private static final ShapeDrawable RemoteActionCompatParcelizer = new ShapeDrawable(new OvalShape());

    public interface write {
        void MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public static addExtractorsForFileType IconCompatParcelizer(Context context, AttributeSet attributeSet, int i, int i2) {
        addExtractorsForFileType addextractorsforfiletype = new addExtractorsForFileType(context, attributeSet, i, i2);
        addextractorsforfiletype.AudioAttributesCompatParcelizer(attributeSet, i, i2);
        return addextractorsforfiletype;
    }

    private addExtractorsForFileType(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.AudioAttributesImplBaseParcelizer = -1.0f;
        this.onCommand = new Paint(1);
        this.onSkipToNext = new Paint.FontMetrics();
        this.ParcelableVolumeInfo = new RectF();
        this.MediaSessionCompatResultReceiverWrapper = new PointF();
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = new Path();
        this.AudioAttributesCompatParcelizer = 255;
        this._init_lambda3 = PorterDuff.Mode.SRC_IN;
        this.onSkipToQueueItem = new WeakReference<>(null);
        RemoteActionCompatParcelizer(context);
        this.onPrepareFromUri = context;
        getFirstSampleNumber getfirstsamplenumber = new getFirstSampleNumber(this);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getfirstsamplenumber;
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = "";
        getfirstsamplenumber.RemoteActionCompatParcelizer().density = context.getResources().getDisplayMetrics().density;
        this.setSessionImpl = null;
        int[] iArr = read;
        setState(iArr);
        read(iArr);
        this.PlaybackStateCompatCustomAction = true;
        if (outputPendingSampleMetadata.write) {
            RemoteActionCompatParcelizer.setTint(-1);
        }
    }

    private void AudioAttributesCompatParcelizer(AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayWrite = readId3Metadata.write(this.onPrepareFromUri, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.Chip, i, i2, new int[0]);
        this.MediaSessionCompatQueueItem = typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_shapeAppearance);
        MediaBrowserCompatItemReceiver(SeekMap.IconCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipSurfaceColor));
        IconCompatParcelizer(SeekMap.IconCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipBackgroundColor));
        write(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipMinHeight, BitmapDescriptorFactory.HUE_RED));
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipCornerRadius)) {
            read(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipCornerRadius, BitmapDescriptorFactory.HUE_RED));
        }
        AudioAttributesCompatParcelizer(SeekMap.IconCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipStrokeColor));
        AudioAttributesImplBaseParcelizer(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipStrokeWidth, BitmapDescriptorFactory.HUE_RED));
        AudioAttributesImplApi26Parcelizer(SeekMap.IconCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_rippleColor));
        write(typedArrayWrite.getText(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_android_text));
        TrackOutput trackOutputWrite = SeekMap.write(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_android_textAppearance);
        trackOutputWrite.write(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_android_textSize, trackOutputWrite.IconCompatParcelizer()));
        IconCompatParcelizer(trackOutputWrite);
        int i3 = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            write(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            write(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            write(TextUtils.TruncateAt.END);
        }
        AudioAttributesCompatParcelizer(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            AudioAttributesCompatParcelizer(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipIconEnabled, false));
        }
        read(SeekMap.RemoteActionCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipIcon));
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipIconTint)) {
            read(SeekMap.IconCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipIconTint));
        }
        RemoteActionCompatParcelizer(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipIconSize, -1.0f));
        read(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            read(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_closeIconEnabled, false));
        }
        IconCompatParcelizer(SeekMap.RemoteActionCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_closeIcon));
        RemoteActionCompatParcelizer(SeekMap.IconCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_closeIconTint));
        MediaBrowserCompatItemReceiver(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_closeIconSize, BitmapDescriptorFactory.HUE_RED));
        write(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_android_checkable, false));
        RemoteActionCompatParcelizer(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            RemoteActionCompatParcelizer(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_checkedIconEnabled, false));
        }
        RemoteActionCompatParcelizer(SeekMap.RemoteActionCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_checkedIcon));
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_checkedIconTint)) {
            write(SeekMap.IconCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_checkedIconTint));
        }
        BinarySearchSeekerSeekTimestampConverter.AudioAttributesCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_showMotionSpec);
        BinarySearchSeekerSeekTimestampConverter.AudioAttributesCompatParcelizer(this.onPrepareFromUri, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Chip_hideMotionSpec);
        IconCompatParcelizer(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipStartPadding, BitmapDescriptorFactory.HUE_RED));
        MediaBrowserCompatMediaItem(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_iconStartPadding, BitmapDescriptorFactory.HUE_RED));
        AudioAttributesImplApi21Parcelizer(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_iconEndPadding, BitmapDescriptorFactory.HUE_RED));
        MediaBrowserCompatSearchResultReceiver(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_textStartPadding, BitmapDescriptorFactory.HUE_RED));
        RatingCompat(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_textEndPadding, BitmapDescriptorFactory.HUE_RED));
        AudioAttributesImplApi26Parcelizer(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_closeIconStartPadding, BitmapDescriptorFactory.HUE_RED));
        MediaBrowserCompatCustomActionResultReceiver(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_closeIconEndPadding, BitmapDescriptorFactory.HUE_RED));
        AudioAttributesCompatParcelizer(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_chipEndPadding, BitmapDescriptorFactory.HUE_RED));
        onPlayFromMediaId(typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Chip_android_maxWidth, Integer.MAX_VALUE));
        typedArrayWrite.recycle();
    }

    public final void IconCompatParcelizer(boolean z) {
        if (this.accessgetReportFullyDrawnExecutorp != z) {
            this.accessgetReportFullyDrawnExecutorp = z;
            MediaSessionCompatToken();
            onStateChange(getState());
        }
    }

    public final boolean MediaDescriptionCompat() {
        return this.accessgetReportFullyDrawnExecutorp;
    }

    public final void AudioAttributesCompatParcelizer(write writeVar) {
        this.onSkipToQueueItem = new WeakReference<>(writeVar);
    }

    private void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        write writeVar = this.onSkipToQueueItem.get();
        if (writeVar != null) {
            writeVar.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    public final void write(RectF rectF) {
        read(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f = this.onCustomAction;
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        float f2 = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        float fIconCompatParcelizer = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver().toString());
        float f3 = this._init_lambda2;
        return Math.min(Math.round(f + fRemoteActionCompatParcelizer + f2 + fIconCompatParcelizer + f3 + IconCompatParcelizer() + this.AudioAttributesImplApi26Parcelizer), this.PlaybackStateCompat);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.RatingCompat;
    }

    private boolean onSkipToQueueItem() {
        return this.MediaBrowserCompatMediaItem && this.MediaDescriptionCompat != null;
    }

    private boolean setSessionImpl() {
        return this.MediaBrowserCompatCustomActionResultReceiver && this.write != null && this.onSeekTo;
    }

    private boolean onSkipToNext() {
        return this.onPlayFromUri && this.onPlay != null;
    }

    private boolean onSetRating() {
        return this.MediaBrowserCompatCustomActionResultReceiver && this.write != null && this.IconCompatParcelizer;
    }

    public final float RemoteActionCompatParcelizer() {
        return (onSkipToQueueItem() || setSessionImpl()) ? this.MediaSessionCompatToken + onStop() + this.onStop : BitmapDescriptorFactory.HUE_RED;
    }

    private float onStop() {
        Drawable drawable = this.onSeekTo ? this.write : this.MediaDescriptionCompat;
        float f = this.MediaMetadataCompat;
        return (f > BitmapDescriptorFactory.HUE_RED || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private float onSetShuffleMode() {
        Drawable drawable = this.onSeekTo ? this.write : this.MediaDescriptionCompat;
        float f = this.MediaMetadataCompat;
        if (f > BitmapDescriptorFactory.HUE_RED || drawable == null) {
            return f;
        }
        float fCeil = (float) Math.ceil(checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(this.onPrepareFromUri, 24));
        return ((float) drawable.getIntrinsicHeight()) <= fCeil ? drawable.getIntrinsicHeight() : fCeil;
    }

    public final float IconCompatParcelizer() {
        return onSkipToNext() ? this.onPrepareFromMediaId + this.onMediaButtonEvent + this.onPlayFromMediaId : BitmapDescriptorFactory.HUE_RED;
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int iRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer < 255 ? getTimeUsAtPosition.RemoteActionCompatParcelizer(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, this.AudioAttributesCompatParcelizer) : 0;
        write(canvas, bounds);
        AudioAttributesCompatParcelizer(canvas, bounds);
        if (this.MediaSessionCompatQueueItem) {
            super.draw(canvas);
        }
        IconCompatParcelizer(canvas, bounds);
        AudioAttributesImplApi21Parcelizer(canvas, bounds);
        RemoteActionCompatParcelizer(canvas, bounds);
        read(canvas, bounds);
        if (this.PlaybackStateCompatCustomAction) {
            AudioAttributesImplBaseParcelizer(canvas, bounds);
        }
        MediaBrowserCompatCustomActionResultReceiver(canvas, bounds);
        if (this.AudioAttributesCompatParcelizer < 255) {
            canvas.restoreToCount(iRemoteActionCompatParcelizer);
        }
    }

    private void write(Canvas canvas, Rect rect) {
        if (this.MediaSessionCompatQueueItem) {
            return;
        }
        this.onCommand.setColor(this.onSetPlaybackSpeed);
        this.onCommand.setStyle(Paint.Style.FILL);
        this.ParcelableVolumeInfo.set(rect);
        canvas.drawRoundRect(this.ParcelableVolumeInfo, ParcelableVolumeInfo(), ParcelableVolumeInfo(), this.onCommand);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, Rect rect) {
        if (this.MediaSessionCompatQueueItem) {
            return;
        }
        this.onCommand.setColor(this.onRewind);
        this.onCommand.setStyle(Paint.Style.FILL);
        this.onCommand.setColorFilter(onSkipToPrevious());
        this.ParcelableVolumeInfo.set(rect);
        canvas.drawRoundRect(this.ParcelableVolumeInfo, ParcelableVolumeInfo(), ParcelableVolumeInfo(), this.onCommand);
    }

    private void IconCompatParcelizer(Canvas canvas, Rect rect) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver <= BitmapDescriptorFactory.HUE_RED || this.MediaSessionCompatQueueItem) {
            return;
        }
        this.onCommand.setColor(this.onRemoveQueueItemAt);
        this.onCommand.setStyle(Paint.Style.STROKE);
        if (!this.MediaSessionCompatQueueItem) {
            this.onCommand.setColorFilter(onSkipToPrevious());
        }
        this.ParcelableVolumeInfo.set(rect.left + (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver / 2.0f), rect.top + (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver / 2.0f), rect.right - (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver / 2.0f), rect.bottom - (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver / 2.0f));
        float f = this.AudioAttributesImplBaseParcelizer - (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver / 2.0f);
        canvas.drawRoundRect(this.ParcelableVolumeInfo, f, f, this.onCommand);
    }

    private void AudioAttributesImplApi21Parcelizer(Canvas canvas, Rect rect) {
        this.onCommand.setColor(this.onSetShuffleMode);
        this.onCommand.setStyle(Paint.Style.FILL);
        this.ParcelableVolumeInfo.set(rect);
        if (!this.MediaSessionCompatQueueItem) {
            canvas.drawRoundRect(this.ParcelableVolumeInfo, ParcelableVolumeInfo(), ParcelableVolumeInfo(), this.onCommand);
        } else {
            read(new RectF(rect), this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
            super.AudioAttributesCompatParcelizer(canvas, this.onCommand, this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, onPause());
        }
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, Rect rect) {
        if (onSkipToQueueItem()) {
            AudioAttributesCompatParcelizer(rect, this.ParcelableVolumeInfo);
            float f = this.ParcelableVolumeInfo.left;
            float f2 = this.ParcelableVolumeInfo.top;
            canvas.translate(f, f2);
            this.MediaDescriptionCompat.setBounds(0, 0, (int) this.ParcelableVolumeInfo.width(), (int) this.ParcelableVolumeInfo.height());
            this.MediaDescriptionCompat.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void read(Canvas canvas, Rect rect) {
        if (setSessionImpl()) {
            AudioAttributesCompatParcelizer(rect, this.ParcelableVolumeInfo);
            float f = this.ParcelableVolumeInfo.left;
            float f2 = this.ParcelableVolumeInfo.top;
            canvas.translate(f, f2);
            this.write.setBounds(0, 0, (int) this.ParcelableVolumeInfo.width(), (int) this.ParcelableVolumeInfo.height());
            this.write.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void AudioAttributesImplBaseParcelizer(Canvas canvas, Rect rect) {
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 != null) {
            Paint.Align alignRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(rect, this.MediaSessionCompatResultReceiverWrapper);
            RemoteActionCompatParcelizer(rect, this.ParcelableVolumeInfo);
            if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read() != null) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer().drawableState = getState();
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(this.onPrepareFromUri);
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer().setTextAlign(alignRemoteActionCompatParcelizer);
            int iSave = 0;
            boolean z = Math.round(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver().toString())) > Math.round(this.ParcelableVolumeInfo.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.ParcelableVolumeInfo);
            }
            CharSequence charSequenceEllipsize = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            if (z && this.accessensureViewModelStore != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer(), this.ParcelableVolumeInfo.width(), this.accessensureViewModelStore);
            }
            CharSequence charSequence = charSequenceEllipsize;
            canvas.drawText(charSequence, 0, charSequence.length(), this.MediaSessionCompatResultReceiverWrapper.x, this.MediaSessionCompatResultReceiverWrapper.y, this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(Canvas canvas, Rect rect) {
        if (onSkipToNext()) {
            write(rect, this.ParcelableVolumeInfo);
            float f = this.ParcelableVolumeInfo.left;
            float f2 = this.ParcelableVolumeInfo.top;
            canvas.translate(f, f2);
            this.onPlay.setBounds(0, 0, (int) this.ParcelableVolumeInfo.width(), (int) this.ParcelableVolumeInfo.height());
            if (outputPendingSampleMetadata.write) {
                this.onPause.setBounds(this.onPlay.getBounds());
                this.onPause.jumpToCurrentState();
                this.onPause.draw(canvas);
            } else {
                this.onPlay.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    private void AudioAttributesCompatParcelizer(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (onSkipToQueueItem() || setSessionImpl()) {
            float f = this.onCustomAction + this.MediaSessionCompatToken;
            float fOnStop = onStop();
            if (findFormatOverrides.write(this) == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + fOnStop;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - fOnStop;
            }
            float fOnSetShuffleMode = onSetShuffleMode();
            rectF.top = rect.exactCenterY() - (fOnSetShuffleMode / 2.0f);
            rectF.bottom = rectF.top + fOnSetShuffleMode;
        }
    }

    private Paint.Align RemoteActionCompatParcelizer(Rect rect, PointF pointF) {
        pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Paint.Align align = Paint.Align.LEFT;
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 != null) {
            float fRemoteActionCompatParcelizer = this.onCustomAction + RemoteActionCompatParcelizer() + this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            if (findFormatOverrides.write(this) == 0) {
                pointF.x = rect.left + fRemoteActionCompatParcelizer;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fRemoteActionCompatParcelizer;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - onSetPlaybackSpeed();
        }
        return align;
    }

    private float onSetPlaybackSpeed() {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer().getFontMetrics(this.onSkipToNext);
        return (this.onSkipToNext.descent + this.onSkipToNext.ascent) / 2.0f;
    }

    private void RemoteActionCompatParcelizer(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 != null) {
            float fRemoteActionCompatParcelizer = this.onCustomAction + RemoteActionCompatParcelizer() + this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            float fIconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer + IconCompatParcelizer() + this._init_lambda2;
            if (findFormatOverrides.write(this) == 0) {
                rectF.left = rect.left + fRemoteActionCompatParcelizer;
                rectF.right = rect.right - fIconCompatParcelizer;
            } else {
                rectF.left = rect.left + fIconCompatParcelizer;
                rectF.right = rect.right - fRemoteActionCompatParcelizer;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void write(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (onSkipToNext()) {
            float f = this.AudioAttributesImplApi26Parcelizer + this.onPlayFromMediaId;
            if (findFormatOverrides.write(this) == 0) {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - this.onMediaButtonEvent;
            } else {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + this.onMediaButtonEvent;
            }
            rectF.top = rect.exactCenterY() - (this.onMediaButtonEvent / 2.0f);
            rectF.bottom = rectF.top + this.onMediaButtonEvent;
        }
    }

    private void read(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (onSkipToNext()) {
            float f = this.AudioAttributesImplApi26Parcelizer + this.onPlayFromMediaId + this.onMediaButtonEvent + this.onPrepareFromMediaId + this._init_lambda2;
            if (findFormatOverrides.write(this) == 0) {
                rectF.right = rect.right;
                rectF.left = rectF.right - f;
            } else {
                rectF.left = rect.left;
                rectF.right = rect.left + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (AudioAttributesImplBaseParcelizer(this.handleMediaPlayPauseIfPendingOnHandler) || AudioAttributesImplBaseParcelizer(this.AudioAttributesImplApi21Parcelizer) || AudioAttributesImplBaseParcelizer(this.onAddQueueItem)) {
            return true;
        }
        return (this.accessgetReportFullyDrawnExecutorp && AudioAttributesImplBaseParcelizer(this.onRemoveQueueItem)) || RemoteActionCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read()) || onSetRating() || AudioAttributesCompatParcelizer(this.MediaDescriptionCompat) || AudioAttributesCompatParcelizer(this.write) || AudioAttributesImplBaseParcelizer(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
    }

    public final boolean onAddQueueItem() {
        return AudioAttributesCompatParcelizer(this.onPlay);
    }

    public final boolean read(int[] iArr) {
        if (Arrays.equals(this.onPrepareFromSearch, iArr)) {
            return false;
        }
        this.onPrepareFromSearch = iArr;
        if (onSkipToNext()) {
            return read(getState(), iArr);
        }
        return false;
    }

    private int[] MediaSessionCompatResultReceiverWrapper() {
        return this.onPrepareFromSearch;
    }

    @Override // o.getFirstSampleNumber.read
    public final void AudioAttributesCompatParcelizer() {
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        invalidateSelf();
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable, o.getFirstSampleNumber.read
    public boolean onStateChange(int[] iArr) {
        if (this.MediaSessionCompatQueueItem) {
            super.onStateChange(iArr);
        }
        return read(iArr, MediaSessionCompatResultReceiverWrapper());
    }

    private boolean read(int[] iArr, int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.handleMediaPlayPauseIfPendingOnHandler;
        int iOnPlayFromSearch = onPlayFromSearch(colorStateList != null ? colorStateList.getColorForState(iArr, this.onSetPlaybackSpeed) : 0);
        boolean state = true;
        if (this.onSetPlaybackSpeed != iOnPlayFromSearch) {
            this.onSetPlaybackSpeed = iOnPlayFromSearch;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.AudioAttributesImplApi21Parcelizer;
        int iOnPlayFromSearch2 = onPlayFromSearch(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.onRewind) : 0);
        if (this.onRewind != iOnPlayFromSearch2) {
            this.onRewind = iOnPlayFromSearch2;
            zOnStateChange = true;
        }
        int i = createExtractors.read(iOnPlayFromSearch, iOnPlayFromSearch2);
        if ((this.onSetRepeatMode != i) | (onPlay() == null)) {
            this.onSetRepeatMode = i;
            AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(i));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.onAddQueueItem;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.onRemoveQueueItemAt) : 0;
        if (this.onRemoveQueueItemAt != colorForState) {
            this.onRemoveQueueItemAt = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.onRemoveQueueItem == null || !outputPendingSampleMetadata.read(iArr)) ? 0 : this.onRemoveQueueItem.getColorForState(iArr, this.onSetShuffleMode);
        if (this.onSetShuffleMode != colorForState2) {
            this.onSetShuffleMode = colorForState2;
            if (this.accessgetReportFullyDrawnExecutorp) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read() == null || this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read().RemoteActionCompatParcelizer() == null) ? 0 : this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read().RemoteActionCompatParcelizer().getColorForState(iArr, this.onSetRating);
        if (this.onSetRating != colorForState3) {
            this.onSetRating = colorForState3;
            zOnStateChange = true;
        }
        boolean z2 = IconCompatParcelizer(getState()) && this.IconCompatParcelizer;
        if (this.onSeekTo == z2 || this.write == null) {
            z = false;
        } else {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.onSeekTo = z2;
            if (fRemoteActionCompatParcelizer != RemoteActionCompatParcelizer()) {
                zOnStateChange = true;
                z = true;
            } else {
                z = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.onSetCaptioningEnabled) : 0;
        if (this.onSetCaptioningEnabled != colorForState4) {
            this.onSetCaptioningEnabled = colorForState4;
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = DefaultExtractorsFactoryExtensionLoader.read(this, this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, this._init_lambda3);
        } else {
            state = zOnStateChange;
        }
        if (AudioAttributesCompatParcelizer(this.MediaDescriptionCompat)) {
            state |= this.MediaDescriptionCompat.setState(iArr);
        }
        if (AudioAttributesCompatParcelizer(this.write)) {
            state |= this.write.setState(iArr);
        }
        if (AudioAttributesCompatParcelizer(this.onPlay)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.onPlay.setState(iArr3);
        }
        if (outputPendingSampleMetadata.write && AudioAttributesCompatParcelizer(this.onPause)) {
            state |= this.onPause.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
        return state;
    }

    private static boolean AudioAttributesImplBaseParcelizer(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean AudioAttributesCompatParcelizer(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean RemoteActionCompatParcelizer(TrackOutput trackOutput) {
        return (trackOutput == null || trackOutput.RemoteActionCompatParcelizer() == null || !trackOutput.RemoteActionCompatParcelizer().isStateful()) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (onSkipToQueueItem()) {
            zOnLayoutDirectionChanged |= findFormatOverrides.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, i);
        }
        if (setSessionImpl()) {
            zOnLayoutDirectionChanged |= findFormatOverrides.RemoteActionCompatParcelizer(this.write, i);
        }
        if (onSkipToNext()) {
            zOnLayoutDirectionChanged |= findFormatOverrides.RemoteActionCompatParcelizer(this.onPlay, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (onSkipToQueueItem()) {
            zOnLevelChange |= this.MediaDescriptionCompat.setLevel(i);
        }
        if (setSessionImpl()) {
            zOnLevelChange |= this.write.setLevel(i);
        }
        if (onSkipToNext()) {
            zOnLevelChange |= this.onPlay.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (onSkipToQueueItem()) {
            visible |= this.MediaDescriptionCompat.setVisible(z, z2);
        }
        if (setSessionImpl()) {
            visible |= this.write.setVisible(z, z2);
        }
        if (onSkipToNext()) {
            visible |= this.onPlay.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.AudioAttributesCompatParcelizer != i) {
            this.AudioAttributesCompatParcelizer = i;
            invalidateSelf();
        }
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.onPrepare != colorFilter) {
            this.onPrepare = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.onPrepare;
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 != colorStateList) {
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this._init_lambda3 != mode) {
            this._init_lambda3 = mode;
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = DefaultExtractorsFactoryExtensionLoader.read(this, this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8, mode);
            invalidateSelf();
        }
    }

    @Override // kotlin.frameSizeBytesByTypeNb, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.MediaSessionCompatQueueItem) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.AudioAttributesImplBaseParcelizer);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.AudioAttributesImplBaseParcelizer);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    private static void AudioAttributesImplApi26Parcelizer(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void write(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            findFormatOverrides.RemoteActionCompatParcelizer(drawable, findFormatOverrides.write(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.onPlay) {
                if (drawable.isStateful()) {
                    drawable.setState(MediaSessionCompatResultReceiverWrapper());
                }
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable, this.onPlayFromSearch);
                return;
            }
            Drawable drawable2 = this.MediaDescriptionCompat;
            if (drawable == drawable2 && this.onSkipToPrevious) {
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable2, this.MediaBrowserCompatSearchResultReceiver);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private ColorFilter onSkipToPrevious() {
        ColorFilter colorFilter = this.onPrepare;
        return colorFilter != null ? colorFilter : this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    }

    private void MediaSessionCompatToken() {
        this.onRemoveQueueItem = this.accessgetReportFullyDrawnExecutorp ? outputPendingSampleMetadata.RemoteActionCompatParcelizer(this.ResultReceiver) : null;
    }

    private void MediaBrowserCompatItemReceiver(ColorStateList colorStateList) {
        if (this.handleMediaPlayPauseIfPendingOnHandler != colorStateList) {
            this.handleMediaPlayPauseIfPendingOnHandler = colorStateList;
            onStateChange(getState());
        }
    }

    private static boolean IconCompatParcelizer(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i : iArr) {
            if (i == 16842912) {
                return true;
            }
        }
        return false;
    }

    public final void MediaDescriptionCompat(float f) {
        TrackOutput trackOutputMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        if (trackOutputMediaBrowserCompatMediaItem != null) {
            trackOutputMediaBrowserCompatMediaItem.write(f);
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.RemoteActionCompatParcelizer().setTextSize(f);
            AudioAttributesCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer(int i) {
        IconCompatParcelizer(getDefaultViewModelCreationExtras.IconCompatParcelizer(this.onPrepareFromUri, i));
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        if (this.AudioAttributesImplApi21Parcelizer != colorStateList) {
            this.AudioAttributesImplApi21Parcelizer = colorStateList;
            onStateChange(getState());
        }
    }

    public final float read() {
        return this.RatingCompat;
    }

    public final void RatingCompat(int i) {
        write(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void write(float f) {
        if (this.RatingCompat != f) {
            this.RatingCompat = f;
            invalidateSelf();
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
    }

    private float ParcelableVolumeInfo() {
        return this.MediaSessionCompatQueueItem ? onRemoveQueueItemAt() : this.AudioAttributesImplBaseParcelizer;
    }

    @Deprecated
    public final void MediaBrowserCompatItemReceiver(int i) {
        read(this.onPrepareFromUri.getResources().getDimension(i));
    }

    @Deprecated
    public final void read(float f) {
        if (this.AudioAttributesImplBaseParcelizer != f) {
            this.AudioAttributesImplBaseParcelizer = f;
            setShapeAppearanceModel(onPlayFromUri().AudioAttributesCompatParcelizer(f));
        }
    }

    public final void MediaDescriptionCompat(int i) {
        AudioAttributesCompatParcelizer(getDefaultViewModelCreationExtras.IconCompatParcelizer(this.onPrepareFromUri, i));
    }

    public final void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        if (this.onAddQueueItem != colorStateList) {
            this.onAddQueueItem = colorStateList;
            if (this.MediaSessionCompatQueueItem) {
                MediaBrowserCompatCustomActionResultReceiver(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void MediaBrowserCompatMediaItem(int i) {
        AudioAttributesImplBaseParcelizer(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void AudioAttributesImplBaseParcelizer(float f) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != f) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
            this.onCommand.setStrokeWidth(f);
            if (this.MediaSessionCompatQueueItem) {
                super.onAddQueueItem(f);
            }
            invalidateSelf();
        }
    }

    public final ColorStateList MediaBrowserCompatCustomActionResultReceiver() {
        return this.ResultReceiver;
    }

    public final void onFastForward(int i) {
        AudioAttributesImplApi26Parcelizer(getDefaultViewModelCreationExtras.IconCompatParcelizer(this.onPrepareFromUri, i));
    }

    public final void AudioAttributesImplApi26Parcelizer(ColorStateList colorStateList) {
        if (this.ResultReceiver != colorStateList) {
            this.ResultReceiver = colorStateList;
            MediaSessionCompatToken();
            onStateChange(getState());
        }
    }

    public final CharSequence MediaBrowserCompatSearchResultReceiver() {
        return this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    }

    public final void write(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, charSequence)) {
            return;
        }
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = charSequence;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.AudioAttributesCompatParcelizer();
        invalidateSelf();
        r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
    }

    public final TrackOutput MediaBrowserCompatMediaItem() {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read();
    }

    public final void onPlayFromUri(int i) {
        IconCompatParcelizer(new TrackOutput(this.onPrepareFromUri, i));
    }

    public final void IconCompatParcelizer(TrackOutput trackOutput) {
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.write(trackOutput, this.onPrepareFromUri);
    }

    public final TextUtils.TruncateAt AudioAttributesImplBaseParcelizer() {
        return this.accessensureViewModelStore;
    }

    public final void write(TextUtils.TruncateAt truncateAt) {
        this.accessensureViewModelStore = truncateAt;
    }

    public final void MediaMetadataCompat(int i) {
        AudioAttributesCompatParcelizer(this.onPrepareFromUri.getResources().getBoolean(i));
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (this.MediaBrowserCompatMediaItem != z) {
            boolean zOnSkipToQueueItem = onSkipToQueueItem();
            this.MediaBrowserCompatMediaItem = z;
            boolean zOnSkipToQueueItem2 = onSkipToQueueItem();
            if (zOnSkipToQueueItem != zOnSkipToQueueItem2) {
                if (zOnSkipToQueueItem2) {
                    write(this.MediaDescriptionCompat);
                } else {
                    AudioAttributesImplApi26Parcelizer(this.MediaDescriptionCompat);
                }
                invalidateSelf();
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    private Drawable MediaSessionCompatQueueItem() {
        Drawable drawable = this.MediaDescriptionCompat;
        if (drawable != null) {
            return findFormatOverrides.AudioAttributesImplApi21Parcelizer(drawable);
        }
        return null;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(int i) {
        read(getDefaultViewModelCreationExtras.write(this.onPrepareFromUri, i));
    }

    public final void read(Drawable drawable) {
        Drawable drawableMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
        if (drawableMediaSessionCompatQueueItem != drawable) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.MediaDescriptionCompat = drawable != null ? findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate() : null;
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            AudioAttributesImplApi26Parcelizer(drawableMediaSessionCompatQueueItem);
            if (onSkipToQueueItem()) {
                write(this.MediaDescriptionCompat);
            }
            invalidateSelf();
            if (fRemoteActionCompatParcelizer != fRemoteActionCompatParcelizer2) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final void AudioAttributesImplApi21Parcelizer(int i) {
        read(getDefaultViewModelCreationExtras.IconCompatParcelizer(this.onPrepareFromUri, i));
    }

    public final void read(ColorStateList colorStateList) {
        this.onSkipToPrevious = true;
        if (this.MediaBrowserCompatSearchResultReceiver != colorStateList) {
            this.MediaBrowserCompatSearchResultReceiver = colorStateList;
            if (onSkipToQueueItem()) {
                findFormatOverrides.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void AudioAttributesImplApi26Parcelizer(int i) {
        RemoteActionCompatParcelizer(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void RemoteActionCompatParcelizer(float f) {
        if (this.MediaMetadataCompat != f) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.MediaMetadataCompat = f;
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            invalidateSelf();
            if (fRemoteActionCompatParcelizer != fRemoteActionCompatParcelizer2) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final boolean onCustomAction() {
        return this.onPlayFromUri;
    }

    public final void read(boolean z) {
        if (this.onPlayFromUri != z) {
            boolean zOnSkipToNext = onSkipToNext();
            this.onPlayFromUri = z;
            boolean zOnSkipToNext2 = onSkipToNext();
            if (zOnSkipToNext != zOnSkipToNext2) {
                if (zOnSkipToNext2) {
                    write(this.onPlay);
                } else {
                    AudioAttributesImplApi26Parcelizer(this.onPlay);
                }
                invalidateSelf();
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final Drawable AudioAttributesImplApi26Parcelizer() {
        Drawable drawable = this.onPlay;
        if (drawable != null) {
            return findFormatOverrides.AudioAttributesImplApi21Parcelizer(drawable);
        }
        return null;
    }

    public final void onCommand(int i) {
        IconCompatParcelizer(getDefaultViewModelCreationExtras.write(this.onPrepareFromUri, i));
    }

    public final void IconCompatParcelizer(Drawable drawable) {
        Drawable drawableAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (drawableAudioAttributesImplApi26Parcelizer != drawable) {
            float fIconCompatParcelizer = IconCompatParcelizer();
            this.onPlay = drawable != null ? findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate() : null;
            if (outputPendingSampleMetadata.write) {
                PlaybackStateCompat();
            }
            float fIconCompatParcelizer2 = IconCompatParcelizer();
            AudioAttributesImplApi26Parcelizer(drawableAudioAttributesImplApi26Parcelizer);
            if (onSkipToNext()) {
                write(this.onPlay);
            }
            invalidateSelf();
            if (fIconCompatParcelizer != fIconCompatParcelizer2) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    private void PlaybackStateCompat() {
        this.onPause = new RippleDrawable(outputPendingSampleMetadata.RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver()), this.onPlay, RemoteActionCompatParcelizer);
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int i) {
        RemoteActionCompatParcelizer(getDefaultViewModelCreationExtras.IconCompatParcelizer(this.onPrepareFromUri, i));
    }

    public final void RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        if (this.onPlayFromSearch != colorStateList) {
            this.onPlayFromSearch = colorStateList;
            if (onSkipToNext()) {
                findFormatOverrides.AudioAttributesCompatParcelizer(this.onPlay, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void onCustomAction(int i) {
        MediaBrowserCompatItemReceiver(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void MediaBrowserCompatItemReceiver(float f) {
        if (this.onMediaButtonEvent != f) {
            this.onMediaButtonEvent = f;
            invalidateSelf();
            if (onSkipToNext()) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        if (this.onFastForward != charSequence) {
            this.onFastForward = _createUsingDelegate.IconCompatParcelizer().AudioAttributesCompatParcelizer(charSequence);
            invalidateSelf();
        }
    }

    public final CharSequence AudioAttributesImplApi21Parcelizer() {
        return this.onFastForward;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final void read(int i) {
        write(this.onPrepareFromUri.getResources().getBoolean(i));
    }

    public final void write(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (!z && this.onSeekTo) {
                this.onSeekTo = false;
            }
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            invalidateSelf();
            if (fRemoteActionCompatParcelizer != fRemoteActionCompatParcelizer2) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        RemoteActionCompatParcelizer(this.onPrepareFromUri.getResources().getBoolean(i));
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (this.MediaBrowserCompatCustomActionResultReceiver != z) {
            boolean sessionImpl = setSessionImpl();
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            boolean sessionImpl2 = setSessionImpl();
            if (sessionImpl != sessionImpl2) {
                if (sessionImpl2) {
                    write(this.write);
                } else {
                    AudioAttributesImplApi26Parcelizer(this.write);
                }
                invalidateSelf();
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final void write(int i) {
        RemoteActionCompatParcelizer(getDefaultViewModelCreationExtras.write(this.onPrepareFromUri, i));
    }

    public final void RemoteActionCompatParcelizer(Drawable drawable) {
        if (this.write != drawable) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.write = drawable;
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            AudioAttributesImplApi26Parcelizer(this.write);
            write(this.write);
            invalidateSelf();
            if (fRemoteActionCompatParcelizer != fRemoteActionCompatParcelizer2) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        write(getDefaultViewModelCreationExtras.IconCompatParcelizer(this.onPrepareFromUri, i));
    }

    public final void write(ColorStateList colorStateList) {
        if (this.MediaBrowserCompatItemReceiver != colorStateList) {
            this.MediaBrowserCompatItemReceiver = colorStateList;
            if (onSetRating()) {
                findFormatOverrides.AudioAttributesCompatParcelizer(this.write, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void onPrepareFromSearch(int i) {
        BinarySearchSeekerSeekTimestampConverter.write(this.onPrepareFromUri, i);
    }

    public final void onPause(int i) {
        BinarySearchSeekerSeekTimestampConverter.write(this.onPrepareFromUri, i);
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.onCustomAction;
    }

    public final void MediaBrowserCompatSearchResultReceiver(int i) {
        IconCompatParcelizer(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void IconCompatParcelizer(float f) {
        if (this.onCustomAction != f) {
            this.onCustomAction = f;
            invalidateSelf();
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
    }

    public final void onMediaButtonEvent(int i) {
        MediaBrowserCompatMediaItem(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void MediaBrowserCompatMediaItem(float f) {
        if (this.MediaSessionCompatToken != f) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.MediaSessionCompatToken = f;
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            invalidateSelf();
            if (fRemoteActionCompatParcelizer != fRemoteActionCompatParcelizer2) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final void onPlay(int i) {
        AudioAttributesImplApi21Parcelizer(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void AudioAttributesImplApi21Parcelizer(float f) {
        if (this.onStop != f) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            this.onStop = f;
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
            invalidateSelf();
            if (fRemoteActionCompatParcelizer != fRemoteActionCompatParcelizer2) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final float RatingCompat() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    public final void onPrepare(int i) {
        MediaBrowserCompatSearchResultReceiver(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void MediaBrowserCompatSearchResultReceiver(float f) {
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != f) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = f;
            invalidateSelf();
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
    }

    public final float MediaMetadataCompat() {
        return this._init_lambda2;
    }

    public final void onPrepareFromMediaId(int i) {
        RatingCompat(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void RatingCompat(float f) {
        if (this._init_lambda2 != f) {
            this._init_lambda2 = f;
            invalidateSelf();
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
    }

    public final void onAddQueueItem(int i) {
        AudioAttributesImplApi26Parcelizer(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void AudioAttributesImplApi26Parcelizer(float f) {
        if (this.onPrepareFromMediaId != f) {
            this.onPrepareFromMediaId = f;
            invalidateSelf();
            if (onSkipToNext()) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final void handleMediaPlayPauseIfPendingOnHandler(int i) {
        MediaBrowserCompatCustomActionResultReceiver(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(float f) {
        if (this.onPlayFromMediaId != f) {
            this.onPlayFromMediaId = f;
            invalidateSelf();
            if (onSkipToNext()) {
                r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            }
        }
    }

    public final float write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void AudioAttributesImplBaseParcelizer(int i) {
        AudioAttributesCompatParcelizer(this.onPrepareFromUri.getResources().getDimension(i));
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        if (this.AudioAttributesImplApi26Parcelizer != f) {
            this.AudioAttributesImplApi26Parcelizer = f;
            invalidateSelf();
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        }
    }

    public final void onPlayFromMediaId(int i) {
        this.PlaybackStateCompat = i;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.PlaybackStateCompatCustomAction;
    }

    public final void onCommand() {
        this.PlaybackStateCompatCustomAction = false;
    }
}
