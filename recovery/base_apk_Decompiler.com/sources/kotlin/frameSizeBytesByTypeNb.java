package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.BitSet;
import kotlin.calculateNextSearchBytePosition;
import kotlin.isNarrowBandValidFrameType;
import kotlin.isValidFrameType;
import kotlin.peekNextSampleSize;

/* JADX INFO: loaded from: classes3.dex */
public class frameSizeBytesByTypeNb extends Drawable implements readSample {
    private static final Paint AudioAttributesCompatParcelizer;
    private final RectF AudioAttributesImplApi21Parcelizer;
    private final Matrix AudioAttributesImplApi26Parcelizer;
    private final RectF AudioAttributesImplBaseParcelizer;
    private final peekNextSampleSize.AudioAttributesImplApi26Parcelizer[] IconCompatParcelizer;
    private final Path MediaBrowserCompatCustomActionResultReceiver;
    private final Paint MediaBrowserCompatItemReceiver;
    private final Path MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final isNarrowBandValidFrameType.write MediaDescriptionCompat;
    private final RectF MediaMetadataCompat;
    private final isNarrowBandValidFrameType RatingCompat;
    private final BitSet RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private final skipBook onAddQueueItem;
    private final Region onCommand;
    private final Paint onCustomAction;
    private PorterDuffColorFilter onMediaButtonEvent;
    private final Region onPause;
    private isValidFrameType onPlay;
    private PorterDuffColorFilter onPlayFromMediaId;
    private final peekNextSampleSize.AudioAttributesImplApi26Parcelizer[] read;
    private read write;

    private static int RemoteActionCompatParcelizer(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    static /* synthetic */ boolean write(frameSizeBytesByTypeNb framesizebytesbytypenb) {
        framesizebytesbytypenb.MediaBrowserCompatSearchResultReceiver = true;
        return true;
    }

    static {
        Paint paint = new Paint(1);
        AudioAttributesCompatParcelizer = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public static frameSizeBytesByTypeNb AudioAttributesCompatParcelizer(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(createExtractors.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface, "MaterialShapeDrawable"));
        }
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb();
        framesizebytesbytypenb.RemoteActionCompatParcelizer(context);
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateList);
        framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(f);
        return framesizebytesbytypenb;
    }

    public frameSizeBytesByTypeNb() {
        this(new isValidFrameType());
    }

    public frameSizeBytesByTypeNb(Context context, AttributeSet attributeSet, int i, int i2) {
        this(isValidFrameType.read(context, attributeSet, i, i2).RemoteActionCompatParcelizer());
    }

    public frameSizeBytesByTypeNb(isValidFrameType isvalidframetype) {
        this(new read(isvalidframetype));
    }

    public frameSizeBytesByTypeNb(read readVar) {
        isNarrowBandValidFrameType isnarrowbandvalidframetype;
        this.IconCompatParcelizer = new peekNextSampleSize.AudioAttributesImplApi26Parcelizer[4];
        this.read = new peekNextSampleSize.AudioAttributesImplApi26Parcelizer[4];
        this.RemoteActionCompatParcelizer = new BitSet(8);
        this.AudioAttributesImplApi26Parcelizer = new Matrix();
        this.MediaBrowserCompatCustomActionResultReceiver = new Path();
        this.MediaBrowserCompatMediaItem = new Path();
        this.MediaMetadataCompat = new RectF();
        this.AudioAttributesImplApi21Parcelizer = new RectF();
        this.onPause = new Region();
        this.onCommand = new Region();
        Paint paint = new Paint(1);
        this.MediaBrowserCompatItemReceiver = paint;
        Paint paint2 = new Paint(1);
        this.onCustomAction = paint2;
        this.onAddQueueItem = new skipBook();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            isnarrowbandvalidframetype = isNarrowBandValidFrameType.RemoteActionCompatParcelizer();
        } else {
            isnarrowbandvalidframetype = new isNarrowBandValidFrameType();
        }
        this.RatingCompat = isnarrowbandvalidframetype;
        this.AudioAttributesImplBaseParcelizer = new RectF();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        this.write = readVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        MediaBrowserCompatCustomActionResultReceiver();
        write(getState());
        this.MediaDescriptionCompat = new isNarrowBandValidFrameType.write() { // from class: o.frameSizeBytesByTypeNb.3
            @Override // o.isNarrowBandValidFrameType.write
            public final void AudioAttributesCompatParcelizer(peekNextSampleSize peeknextsamplesize, Matrix matrix, int i) {
                frameSizeBytesByTypeNb.this.RemoteActionCompatParcelizer.set(i, peeknextsamplesize.IconCompatParcelizer());
                frameSizeBytesByTypeNb.this.IconCompatParcelizer[i] = peeknextsamplesize.write(matrix);
            }

            @Override // o.isNarrowBandValidFrameType.write
            public final void write(peekNextSampleSize peeknextsamplesize, Matrix matrix, int i) {
                frameSizeBytesByTypeNb.this.RemoteActionCompatParcelizer.set(i + 4, peeknextsamplesize.IconCompatParcelizer());
                frameSizeBytesByTypeNb.this.read[i] = peeknextsamplesize.write(matrix);
            }
        };
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.write;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.write = new read(this.write);
        return this;
    }

    @Override // kotlin.readSample
    public void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        this.write.MediaBrowserCompatSearchResultReceiver = isvalidframetype;
        invalidateSelf();
    }

    public final isValidFrameType onPlayFromUri() {
        return this.write.MediaBrowserCompatSearchResultReceiver;
    }

    public final void AudioAttributesImplApi21Parcelizer(ColorStateList colorStateList) {
        if (this.write.AudioAttributesCompatParcelizer != colorStateList) {
            this.write.AudioAttributesCompatParcelizer = colorStateList;
            onStateChange(getState());
        }
    }

    public final ColorStateList onPlay() {
        return this.write.AudioAttributesCompatParcelizer;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(ColorStateList colorStateList) {
        if (this.write.onAddQueueItem != colorStateList) {
            this.write.onAddQueueItem = colorStateList;
            onStateChange(getState());
        }
    }

    public final ColorStateList onPrepareFromUri() {
        return this.write.onAddQueueItem;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != mode) {
            this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = mode;
            MediaBrowserCompatCustomActionResultReceiver();
            AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.write.handleMediaPlayPauseIfPendingOnHandler = colorStateList;
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void IconCompatParcelizer(float f, int i) {
        onAddQueueItem(f);
        MediaBrowserCompatCustomActionResultReceiver(ColorStateList.valueOf(i));
    }

    public final void IconCompatParcelizer(float f, ColorStateList colorStateList) {
        onAddQueueItem(f);
        MediaBrowserCompatCustomActionResultReceiver(colorStateList);
    }

    public final float onSeekTo() {
        return this.write.onCustomAction;
    }

    public final void onAddQueueItem(float f) {
        this.write.onCustomAction = f;
        invalidateSelf();
    }

    public final int onPrepare() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.write.read;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.write.read != i) {
            this.write.read = i;
            AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.write.IconCompatParcelizer = colorFilter;
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.onPause.set(getBounds());
        AudioAttributesCompatParcelizer(onPause(), this.MediaBrowserCompatCustomActionResultReceiver);
        this.onCommand.setPath(this.MediaBrowserCompatCustomActionResultReceiver, this.onPause);
        this.onPause.op(this.onCommand, Region.Op.DIFFERENCE);
        return this.onPause;
    }

    protected final RectF onPause() {
        this.MediaMetadataCompat.set(getBounds());
        return this.MediaMetadataCompat;
    }

    public final void MediaMetadataCompat(float f) {
        setShapeAppearanceModel(this.write.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(f));
    }

    public final void write(VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader) {
        setShapeAppearanceModel(this.write.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(vorbisUtilVorbisIdHeader));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.write.AudioAttributesImplApi21Parcelizer != null) {
            rect.set(this.write.AudioAttributesImplApi21Parcelizer);
            return true;
        }
        return super.getPadding(rect);
    }

    public final void write(int i, int i2) {
        if (this.write.AudioAttributesImplApi21Parcelizer == null) {
            this.write.AudioAttributesImplApi21Parcelizer = new Rect();
        }
        this.write.AudioAttributesImplApi21Parcelizer.set(0, i, 0, i2);
        invalidateSelf();
    }

    public final void onSeekTo(int i) {
        if (this.write.RatingCompat != i) {
            this.write.RatingCompat = i;
            AudioAttributesImplApi26Parcelizer();
        }
    }

    public final boolean onRemoveQueueItem() {
        return this.write.write != null && this.write.write.write();
    }

    public final void RemoteActionCompatParcelizer(Context context) {
        this.write.write = new DefaultExtractorsFactoryExtensionLoaderConstructorSupplier(context);
        MediaBrowserCompatItemReceiver();
    }

    protected final int onPlayFromSearch(int i) {
        return this.write.write != null ? this.write.write.RemoteActionCompatParcelizer(i, MediaDescriptionCompat() + AudioAttributesImplApi21Parcelizer()) : i;
    }

    public final float onPrepareFromMediaId() {
        return this.write.AudioAttributesImplBaseParcelizer;
    }

    public final void onCustomAction(float f) {
        if (this.write.AudioAttributesImplBaseParcelizer != f) {
            this.write.AudioAttributesImplBaseParcelizer = f;
            this.MediaBrowserCompatSearchResultReceiver = true;
            invalidateSelf();
        }
    }

    private float AudioAttributesImplApi21Parcelizer() {
        return this.write.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(float f) {
        if (this.write.MediaBrowserCompatCustomActionResultReceiver != f) {
            this.write.MediaBrowserCompatCustomActionResultReceiver = f;
            MediaBrowserCompatItemReceiver();
        }
    }

    public final float onPlayFromMediaId() {
        return this.write.RemoteActionCompatParcelizer;
    }

    public final void handleMediaPlayPauseIfPendingOnHandler(float f) {
        if (this.write.RemoteActionCompatParcelizer != f) {
            this.write.RemoteActionCompatParcelizer = f;
            MediaBrowserCompatItemReceiver();
        }
    }

    private float MediaBrowserCompatSearchResultReceiver() {
        return this.write.onMediaButtonEvent;
    }

    private float MediaDescriptionCompat() {
        return onPlayFromMediaId() + MediaBrowserCompatSearchResultReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        float fMediaDescriptionCompat = MediaDescriptionCompat();
        this.write.MediaDescriptionCompat = (int) Math.ceil(0.75f * fMediaDescriptionCompat);
        this.write.MediaBrowserCompatMediaItem = (int) Math.ceil(fMediaDescriptionCompat * 0.25f);
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi26Parcelizer();
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }

    public final void onRewind(int i) {
        if (this.write.MediaMetadataCompat != i) {
            this.write.MediaMetadataCompat = i;
            AudioAttributesImplApi26Parcelizer();
        }
    }

    public final int onPrepareFromSearch() {
        return this.write.MediaDescriptionCompat;
    }

    private boolean RatingCompat() {
        if (onSetRepeatMode()) {
            return false;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.isConvex();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.MediaBrowserCompatSearchResultReceiver = true;
        super.invalidateSelf();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        super.invalidateSelf();
    }

    public final void onSetCaptioningEnabled() {
        this.onAddQueueItem.read(-12303292);
        this.write.onPlay = false;
        AudioAttributesImplApi26Parcelizer();
    }

    public final void RemoteActionCompatParcelizer(Paint.Style style) {
        this.write.AudioAttributesImplApi26Parcelizer = style;
        AudioAttributesImplApi26Parcelizer();
    }

    private boolean read() {
        if (this.write.RatingCompat == 1 || this.write.MediaDescriptionCompat <= 0) {
            return false;
        }
        if (this.write.RatingCompat == 2) {
            return true;
        }
        RatingCompat();
        return false;
    }

    private boolean RemoteActionCompatParcelizer() {
        return this.write.AudioAttributesImplApi26Parcelizer == Paint.Style.FILL_AND_STROKE || this.write.AudioAttributesImplApi26Parcelizer == Paint.Style.FILL;
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        return (this.write.AudioAttributesImplApi26Parcelizer == Paint.Style.FILL_AND_STROKE || this.write.AudioAttributesImplApi26Parcelizer == Paint.Style.STROKE) && this.onCustomAction.getStrokeWidth() > BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.MediaBrowserCompatSearchResultReceiver = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.MediaBrowserCompatItemReceiver.setColorFilter(this.onMediaButtonEvent);
        int alpha = this.MediaBrowserCompatItemReceiver.getAlpha();
        this.MediaBrowserCompatItemReceiver.setAlpha(RemoteActionCompatParcelizer(alpha, this.write.read));
        this.onCustomAction.setColorFilter(this.onPlayFromMediaId);
        this.onCustomAction.setStrokeWidth(this.write.onCustomAction);
        int alpha2 = this.onCustomAction.getAlpha();
        this.onCustomAction.setAlpha(RemoteActionCompatParcelizer(alpha2, this.write.read));
        if (this.MediaBrowserCompatSearchResultReceiver) {
            IconCompatParcelizer();
            AudioAttributesCompatParcelizer(onPause(), this.MediaBrowserCompatCustomActionResultReceiver);
            this.MediaBrowserCompatSearchResultReceiver = false;
        }
        read(canvas);
        if (RemoteActionCompatParcelizer()) {
            AudioAttributesCompatParcelizer(canvas);
        }
        if (AudioAttributesImplBaseParcelizer()) {
            IconCompatParcelizer(canvas);
        }
        this.MediaBrowserCompatItemReceiver.setAlpha(alpha);
        this.onCustomAction.setAlpha(alpha2);
    }

    private void read(Canvas canvas) {
        if (read()) {
            canvas.save();
            write(canvas);
            if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                RemoteActionCompatParcelizer(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.AudioAttributesImplBaseParcelizer.width() - getBounds().width());
            int iHeight = (int) (this.AudioAttributesImplBaseParcelizer.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.AudioAttributesImplBaseParcelizer.width()) + (this.write.MediaDescriptionCompat << 1) + iWidth, ((int) this.AudioAttributesImplBaseParcelizer.height()) + (this.write.MediaDescriptionCompat << 1) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f = (getBounds().left - this.write.MediaDescriptionCompat) - iWidth;
            float f2 = (getBounds().top - this.write.MediaDescriptionCompat) - iHeight;
            canvas2.translate(-f, -f2);
            RemoteActionCompatParcelizer(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    public final void AudioAttributesCompatParcelizer(Canvas canvas, Paint paint, Path path, RectF rectF) {
        read(canvas, paint, path, this.write.MediaBrowserCompatSearchResultReceiver, rectF);
    }

    private void read(Canvas canvas, Paint paint, Path path, isValidFrameType isvalidframetype, RectF rectF) {
        if (isvalidframetype.read(rectF)) {
            float fIconCompatParcelizer = isvalidframetype.MediaMetadataCompat().IconCompatParcelizer(rectF) * this.write.AudioAttributesImplBaseParcelizer;
            canvas.drawRoundRect(rectF, fIconCompatParcelizer, fIconCompatParcelizer, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas) {
        read(canvas, this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver, this.write.MediaBrowserCompatSearchResultReceiver, onPause());
    }

    public void IconCompatParcelizer(Canvas canvas) {
        read(canvas, this.onCustomAction, this.MediaBrowserCompatMediaItem, this.onPlay, write());
    }

    private void write(Canvas canvas) {
        canvas.translate(MediaMetadataCompat(), onPlayFromSearch());
    }

    private void RemoteActionCompatParcelizer(Canvas canvas) {
        this.RemoteActionCompatParcelizer.cardinality();
        if (this.write.MediaBrowserCompatMediaItem != 0) {
            canvas.drawPath(this.MediaBrowserCompatCustomActionResultReceiver, this.onAddQueueItem.IconCompatParcelizer());
        }
        for (int i = 0; i < 4; i++) {
            this.IconCompatParcelizer[i].RemoteActionCompatParcelizer(this.onAddQueueItem, this.write.MediaDescriptionCompat, canvas);
            this.read[i].RemoteActionCompatParcelizer(this.onAddQueueItem, this.write.MediaDescriptionCompat, canvas);
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            int iMediaMetadataCompat = MediaMetadataCompat();
            int iOnPlayFromSearch = onPlayFromSearch();
            canvas.translate(-iMediaMetadataCompat, -iOnPlayFromSearch);
            canvas.drawPath(this.MediaBrowserCompatCustomActionResultReceiver, AudioAttributesCompatParcelizer);
            canvas.translate(iMediaMetadataCompat, iOnPlayFromSearch);
        }
    }

    private int MediaMetadataCompat() {
        return (int) (((double) this.write.MediaBrowserCompatMediaItem) * Math.sin(Math.toRadians(this.write.MediaMetadataCompat)));
    }

    public final int onPlayFromSearch() {
        return (int) (((double) this.write.MediaBrowserCompatMediaItem) * Math.cos(Math.toRadians(this.write.MediaMetadataCompat)));
    }

    protected final void read(RectF rectF, Path path) {
        this.RatingCompat.write(this.write.MediaBrowserCompatSearchResultReceiver, this.write.AudioAttributesImplBaseParcelizer, rectF, this.MediaDescriptionCompat, path);
    }

    private void IconCompatParcelizer() {
        final float f = -AudioAttributesCompatParcelizer();
        isValidFrameType isvalidframetypeAudioAttributesCompatParcelizer = onPlayFromUri().AudioAttributesCompatParcelizer(new isValidFrameType.read() { // from class: o.frameSizeBytesByTypeNb.5
            @Override // o.isValidFrameType.read
            public final VorbisUtilVorbisIdHeader IconCompatParcelizer(VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader) {
                return vorbisUtilVorbisIdHeader instanceof maybeOutputFormat ? vorbisUtilVorbisIdHeader : new VorbisUtilMode(f, vorbisUtilVorbisIdHeader);
            }
        });
        this.onPlay = isvalidframetypeAudioAttributesCompatParcelizer;
        this.RatingCompat.IconCompatParcelizer(isvalidframetypeAudioAttributesCompatParcelizer, this.write.AudioAttributesImplBaseParcelizer, write(), this.MediaBrowserCompatMediaItem);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.write.RatingCompat == 2) {
            return;
        }
        if (onSetRepeatMode()) {
            outline.setRoundRect(getBounds(), onRemoveQueueItemAt() * this.write.AudioAttributesImplBaseParcelizer);
        } else {
            AudioAttributesCompatParcelizer(onPause(), this.MediaBrowserCompatCustomActionResultReceiver);
            DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer(outline, this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    private void AudioAttributesCompatParcelizer(RectF rectF, Path path) {
        read(rectF, path);
        if (this.write.MediaBrowserCompatItemReceiver != 1.0f) {
            this.AudioAttributesImplApi26Parcelizer.reset();
            this.AudioAttributesImplApi26Parcelizer.setScale(this.write.MediaBrowserCompatItemReceiver, this.write.MediaBrowserCompatItemReceiver, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.AudioAttributesImplApi26Parcelizer);
        }
        path.computeBounds(this.AudioAttributesImplBaseParcelizer, true);
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        PorterDuffColorFilter porterDuffColorFilter = this.onMediaButtonEvent;
        PorterDuffColorFilter porterDuffColorFilter2 = this.onPlayFromMediaId;
        this.onMediaButtonEvent = AudioAttributesCompatParcelizer(this.write.handleMediaPlayPauseIfPendingOnHandler, this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatItemReceiver, true);
        this.onPlayFromMediaId = AudioAttributesCompatParcelizer(this.write.onCommand, this.write.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction, false);
        if (this.write.onPlay) {
            this.onAddQueueItem.read(this.write.handleMediaPlayPauseIfPendingOnHandler.getColorForState(getState(), 0));
        }
        return (configureFromStringCreator.RemoteActionCompatParcelizer(porterDuffColorFilter, this.onMediaButtonEvent) && configureFromStringCreator.RemoteActionCompatParcelizer(porterDuffColorFilter2, this.onPlayFromMediaId)) ? false : true;
    }

    private PorterDuffColorFilter AudioAttributesCompatParcelizer(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList == null || mode == null) {
            return IconCompatParcelizer(paint, z);
        }
        return read(colorStateList, mode, z);
    }

    private PorterDuffColorFilter IconCompatParcelizer(Paint paint, boolean z) {
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iOnPlayFromSearch = onPlayFromSearch(color);
        this.handleMediaPlayPauseIfPendingOnHandler = iOnPlayFromSearch;
        if (iOnPlayFromSearch != color) {
            return new PorterDuffColorFilter(iOnPlayFromSearch, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private PorterDuffColorFilter read(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = onPlayFromSearch(colorForState);
        }
        this.handleMediaPlayPauseIfPendingOnHandler = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        if (this.write.handleMediaPlayPauseIfPendingOnHandler != null && this.write.handleMediaPlayPauseIfPendingOnHandler.isStateful()) {
            return true;
        }
        if (this.write.onCommand != null && this.write.onCommand.isStateful()) {
            return true;
        }
        if (this.write.onAddQueueItem == null || !this.write.onAddQueueItem.isStateful()) {
            return this.write.AudioAttributesCompatParcelizer != null && this.write.AudioAttributesCompatParcelizer.isStateful();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, o.getFirstSampleNumber.read
    public boolean onStateChange(int[] iArr) {
        boolean z = write(iArr) || MediaBrowserCompatCustomActionResultReceiver();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    private boolean write(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.write.AudioAttributesCompatParcelizer == null || color2 == (colorForState2 = this.write.AudioAttributesCompatParcelizer.getColorForState(iArr, (color2 = this.MediaBrowserCompatItemReceiver.getColor())))) {
            z = false;
        } else {
            this.MediaBrowserCompatItemReceiver.setColor(colorForState2);
            z = true;
        }
        if (this.write.onAddQueueItem == null || color == (colorForState = this.write.onAddQueueItem.getColorForState(iArr, (color = this.onCustomAction.getColor())))) {
            return z;
        }
        this.onCustomAction.setColor(colorForState);
        return true;
    }

    private float AudioAttributesCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer() ? this.onCustomAction.getStrokeWidth() / 2.0f : BitmapDescriptorFactory.HUE_RED;
    }

    private RectF write() {
        this.AudioAttributesImplApi21Parcelizer.set(onPause());
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer.inset(fAudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer);
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final float onRemoveQueueItemAt() {
        return this.write.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer(onPause());
    }

    public final float onRewind() {
        return this.write.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat().IconCompatParcelizer(onPause());
    }

    public final float onMediaButtonEvent() {
        return this.write.MediaBrowserCompatSearchResultReceiver.read().IconCompatParcelizer(onPause());
    }

    public final float onFastForward() {
        return this.write.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver().IconCompatParcelizer(onPause());
    }

    public final boolean onSetRepeatMode() {
        return this.write.MediaBrowserCompatSearchResultReceiver.read(onPause());
    }

    public static class read extends Drawable.ConstantState {
        ColorStateList AudioAttributesCompatParcelizer;
        Rect AudioAttributesImplApi21Parcelizer;
        Paint.Style AudioAttributesImplApi26Parcelizer;
        float AudioAttributesImplBaseParcelizer;
        ColorFilter IconCompatParcelizer;
        float MediaBrowserCompatCustomActionResultReceiver;
        float MediaBrowserCompatItemReceiver;
        int MediaBrowserCompatMediaItem;
        isValidFrameType MediaBrowserCompatSearchResultReceiver;
        PorterDuff.Mode MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int MediaDescriptionCompat;
        int MediaMetadataCompat;
        int RatingCompat;
        float RemoteActionCompatParcelizer;
        ColorStateList handleMediaPlayPauseIfPendingOnHandler;
        ColorStateList onAddQueueItem;
        ColorStateList onCommand;
        float onCustomAction;
        float onMediaButtonEvent;
        boolean onPlay;
        int read;
        DefaultExtractorsFactoryExtensionLoaderConstructorSupplier write;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public read(isValidFrameType isvalidframetype) {
            this.AudioAttributesCompatParcelizer = null;
            this.onAddQueueItem = null;
            this.onCommand = null;
            this.handleMediaPlayPauseIfPendingOnHandler = null;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = PorterDuff.Mode.SRC_IN;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.MediaBrowserCompatItemReceiver = 1.0f;
            this.AudioAttributesImplBaseParcelizer = 1.0f;
            this.read = 255;
            this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.onMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
            this.RatingCompat = 0;
            this.MediaDescriptionCompat = 0;
            this.MediaBrowserCompatMediaItem = 0;
            this.MediaMetadataCompat = 0;
            this.onPlay = false;
            this.AudioAttributesImplApi26Parcelizer = Paint.Style.FILL_AND_STROKE;
            this.MediaBrowserCompatSearchResultReceiver = isvalidframetype;
            this.write = null;
        }

        public read(read readVar) {
            this.AudioAttributesCompatParcelizer = null;
            this.onAddQueueItem = null;
            this.onCommand = null;
            this.handleMediaPlayPauseIfPendingOnHandler = null;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = PorterDuff.Mode.SRC_IN;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.MediaBrowserCompatItemReceiver = 1.0f;
            this.AudioAttributesImplBaseParcelizer = 1.0f;
            this.read = 255;
            this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.onMediaButtonEvent = BitmapDescriptorFactory.HUE_RED;
            this.RatingCompat = 0;
            this.MediaDescriptionCompat = 0;
            this.MediaBrowserCompatMediaItem = 0;
            this.MediaMetadataCompat = 0;
            this.onPlay = false;
            this.AudioAttributesImplApi26Parcelizer = Paint.Style.FILL_AND_STROKE;
            this.MediaBrowserCompatSearchResultReceiver = readVar.MediaBrowserCompatSearchResultReceiver;
            this.write = readVar.write;
            this.onCustomAction = readVar.onCustomAction;
            this.IconCompatParcelizer = readVar.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer;
            this.onAddQueueItem = readVar.onAddQueueItem;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = readVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.handleMediaPlayPauseIfPendingOnHandler = readVar.handleMediaPlayPauseIfPendingOnHandler;
            this.read = readVar.read;
            this.MediaBrowserCompatItemReceiver = readVar.MediaBrowserCompatItemReceiver;
            this.MediaBrowserCompatMediaItem = readVar.MediaBrowserCompatMediaItem;
            this.RatingCompat = readVar.RatingCompat;
            this.onPlay = readVar.onPlay;
            this.AudioAttributesImplBaseParcelizer = readVar.AudioAttributesImplBaseParcelizer;
            this.MediaBrowserCompatCustomActionResultReceiver = readVar.MediaBrowserCompatCustomActionResultReceiver;
            this.RemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer;
            this.onMediaButtonEvent = readVar.onMediaButtonEvent;
            this.MediaDescriptionCompat = readVar.MediaDescriptionCompat;
            this.MediaMetadataCompat = readVar.MediaMetadataCompat;
            this.onCommand = readVar.onCommand;
            this.AudioAttributesImplApi26Parcelizer = readVar.AudioAttributesImplApi26Parcelizer;
            if (readVar.AudioAttributesImplApi21Parcelizer != null) {
                this.AudioAttributesImplApi21Parcelizer = new Rect(readVar.AudioAttributesImplApi21Parcelizer);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(this);
            frameSizeBytesByTypeNb.write(framesizebytesbytypenb);
            return framesizebytesbytypenb;
        }
    }
}
