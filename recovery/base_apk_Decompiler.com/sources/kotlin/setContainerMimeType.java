package kotlin;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class setContainerMimeType {
    private static final Matrix write = new Matrix();
    private onSurfaceTextureDestroyed AudioAttributesCompatParcelizer;
    private access3100 AudioAttributesImplApi21Parcelizer;
    private Paint AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
    private Canvas IconCompatParcelizer;
    private IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private Rect MediaBrowserCompatItemReceiver;
    private float[] MediaBrowserCompatMediaItem;
    private write MediaBrowserCompatSearchResultReceiver;
    private Bitmap MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private RectF MediaDescriptionCompat;
    private Canvas MediaMetadataCompat;
    private Matrix RatingCompat;
    private Rect RemoteActionCompatParcelizer;
    private RectF handleMediaPlayPauseIfPendingOnHandler;
    private RenderNode onAddQueueItem;
    private Canvas onCommand;
    private RectF onCustomAction;
    private Rect onFastForward;
    private BlurMaskFilter onMediaButtonEvent;
    private Bitmap onPause;
    private Canvas onPlay;
    private onSurfaceTextureDestroyed onPlayFromMediaId;
    private RenderNode onPrepare;
    private RectF onPrepareFromMediaId;
    private RectF onPrepareFromSearch;
    private Bitmap read;

    protected enum IconCompatParcelizer {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    public static class write {
        public int AudioAttributesCompatParcelizer;
        public _parseString IconCompatParcelizer;
        public access3100 RemoteActionCompatParcelizer;
        public ColorFilter read;

        public write() {
            write();
        }

        private boolean read() {
            return this.AudioAttributesCompatParcelizer < 255;
        }

        public final boolean IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer != null;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return (read() || IconCompatParcelizer()) ? false : true;
        }

        public final void write() {
            this.AudioAttributesCompatParcelizer = 255;
            this.IconCompatParcelizer = null;
            this.read = null;
            this.RemoteActionCompatParcelizer = null;
        }
    }

    private static IconCompatParcelizer IconCompatParcelizer(Canvas canvas, write writeVar) {
        if (writeVar.AudioAttributesCompatParcelizer()) {
            return IconCompatParcelizer.DIRECT;
        }
        if (!writeVar.IconCompatParcelizer()) {
            return IconCompatParcelizer.SAVE_LAYER;
        }
        if (!canvas.isHardwareAccelerated()) {
            return IconCompatParcelizer.BITMAP;
        }
        if (Build.VERSION.SDK_INT <= 31) {
            return IconCompatParcelizer.BITMAP;
        }
        return IconCompatParcelizer.RENDER_NODE;
    }

    private static Bitmap IconCompatParcelizer(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    private static void AudioAttributesCompatParcelizer(Bitmap bitmap) {
        bitmap.recycle();
    }

    private static boolean read(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final Canvas AudioAttributesCompatParcelizer(Canvas canvas, RectF rectF, write writeVar) {
        if (this.MediaMetadataCompat != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = new float[9];
        }
        if (this.RatingCompat == null) {
            this.RatingCompat = new Matrix();
        }
        canvas.getMatrix(this.RatingCompat);
        this.RatingCompat.getValues(this.MediaBrowserCompatMediaItem);
        float[] fArr = this.MediaBrowserCompatMediaItem;
        float f = fArr[0];
        float f2 = fArr[4];
        if (this.onCustomAction == null) {
            this.onCustomAction = new RectF();
        }
        this.onCustomAction.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.MediaMetadataCompat = canvas;
        this.MediaBrowserCompatSearchResultReceiver = writeVar;
        this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer(canvas, writeVar);
        if (this.onPrepareFromMediaId == null) {
            this.onPrepareFromMediaId = new RectF();
        }
        this.onPrepareFromMediaId.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = new onSurfaceTextureDestroyed();
        }
        this.AudioAttributesImplApi26Parcelizer.reset();
        int iOrdinal = this.MediaBrowserCompatCustomActionResultReceiver.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.AudioAttributesImplApi26Parcelizer.setAlpha(writeVar.AudioAttributesCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer.setColorFilter(writeVar.read);
            setEncoderPadding.RemoteActionCompatParcelizer(canvas, rectF, this.AudioAttributesImplApi26Parcelizer);
            return canvas;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.onAddQueueItem == null) {
                    this.onAddQueueItem = new RenderNode("OffscreenLayer.main");
                }
                if (writeVar.IconCompatParcelizer() && this.onPrepare == null) {
                    this.onPrepare = new RenderNode("OffscreenLayer.shadow");
                    this.AudioAttributesImplApi21Parcelizer = null;
                }
                this.onAddQueueItem.setAlpha(writeVar.AudioAttributesCompatParcelizer / 255.0f);
                if (writeVar.IconCompatParcelizer()) {
                    RenderNode renderNode = this.onPrepare;
                    if (renderNode == null) {
                        throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                    }
                    renderNode.setAlpha(writeVar.AudioAttributesCompatParcelizer / 255.0f);
                }
                this.onAddQueueItem.setHasOverlappingRendering(true);
                this.onAddQueueItem.setPosition((int) this.onCustomAction.left, (int) this.onCustomAction.top, (int) this.onCustomAction.right, (int) this.onCustomAction.bottom);
                RecordingCanvas recordingCanvasBeginRecording = this.onAddQueueItem.beginRecording((int) this.onCustomAction.width(), (int) this.onCustomAction.height());
                recordingCanvasBeginRecording.setMatrix(write);
                recordingCanvasBeginRecording.scale(f, f2);
                recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
                return recordingCanvasBeginRecording;
            }
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (this.AudioAttributesCompatParcelizer == null) {
            onSurfaceTextureDestroyed onsurfacetexturedestroyed = new onSurfaceTextureDestroyed();
            this.AudioAttributesCompatParcelizer = onsurfacetexturedestroyed;
            onsurfacetexturedestroyed.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (read(this.read, this.onCustomAction)) {
            Bitmap bitmap = this.read;
            if (bitmap != null) {
                AudioAttributesCompatParcelizer(bitmap);
            }
            this.read = IconCompatParcelizer(this.onCustomAction, Bitmap.Config.ARGB_8888);
            this.IconCompatParcelizer = new Canvas(this.read);
        } else {
            Canvas canvas2 = this.IconCompatParcelizer;
            if (canvas2 == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
            }
            canvas2.setMatrix(write);
            this.IconCompatParcelizer.drawRect(-1.0f, -1.0f, this.onCustomAction.width() + 1.0f, this.onCustomAction.height() + 1.0f, this.AudioAttributesCompatParcelizer);
        }
        _verifyNullForPrimitive.write(this.AudioAttributesImplApi26Parcelizer, writeVar.IconCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer.setColorFilter(writeVar.read);
        this.AudioAttributesImplApi26Parcelizer.setAlpha(writeVar.AudioAttributesCompatParcelizer);
        Canvas canvas3 = this.IconCompatParcelizer;
        canvas3.scale(f, f2);
        canvas3.translate(-rectF.left, -rectF.top);
        return canvas3;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.MediaMetadataCompat == null || this.MediaBrowserCompatSearchResultReceiver == null || this.MediaBrowserCompatMediaItem == null || this.onPrepareFromMediaId == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.MediaBrowserCompatCustomActionResultReceiver.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.MediaMetadataCompat.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.onAddQueueItem == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                this.MediaMetadataCompat.save();
                Canvas canvas = this.MediaMetadataCompat;
                float[] fArr = this.MediaBrowserCompatMediaItem;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.onAddQueueItem.endRecording();
                if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer()) {
                    RemoteActionCompatParcelizer(this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer);
                }
                this.MediaMetadataCompat.drawRenderNode(this.onAddQueueItem);
                this.MediaMetadataCompat.restore();
            }
        } else {
            if (this.read == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer()) {
                AudioAttributesCompatParcelizer(this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer);
            }
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new Rect();
            }
            this.RemoteActionCompatParcelizer.set(0, 0, (int) (this.onPrepareFromMediaId.width() * this.MediaBrowserCompatMediaItem[0]), (int) (this.onPrepareFromMediaId.height() * this.MediaBrowserCompatMediaItem[4]));
            this.MediaMetadataCompat.drawBitmap(this.read, this.RemoteActionCompatParcelizer, this.onPrepareFromMediaId, this.AudioAttributesImplApi26Parcelizer);
        }
        this.MediaMetadataCompat = null;
    }

    private RectF AudioAttributesCompatParcelizer(RectF rectF, access3100 access3100Var) {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new RectF();
        }
        if (this.onPrepareFromSearch == null) {
            this.onPrepareFromSearch = new RectF();
        }
        this.MediaDescriptionCompat.set(rectF);
        this.MediaDescriptionCompat.offsetTo(rectF.left + access3100Var.read(), rectF.top + access3100Var.IconCompatParcelizer());
        this.MediaDescriptionCompat.inset(-access3100Var.AudioAttributesCompatParcelizer(), -access3100Var.AudioAttributesCompatParcelizer());
        this.onPrepareFromSearch.set(rectF);
        this.MediaDescriptionCompat.union(this.onPrepareFromSearch);
        return this.MediaDescriptionCompat;
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, access3100 access3100Var) {
        onSurfaceTextureDestroyed onsurfacetexturedestroyed;
        RectF rectF = this.onPrepareFromMediaId;
        if (rectF == null || this.read == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(rectF, access3100Var);
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new Rect();
        }
        this.MediaBrowserCompatItemReceiver.set((int) Math.floor(rectFAudioAttributesCompatParcelizer.left), (int) Math.floor(rectFAudioAttributesCompatParcelizer.top), (int) Math.ceil(rectFAudioAttributesCompatParcelizer.right), (int) Math.ceil(rectFAudioAttributesCompatParcelizer.bottom));
        float[] fArr = this.MediaBrowserCompatMediaItem;
        float f = fArr != null ? fArr[0] : 1.0f;
        float f2 = fArr != null ? fArr[4] : 1.0f;
        if (this.handleMediaPlayPauseIfPendingOnHandler == null) {
            this.handleMediaPlayPauseIfPendingOnHandler = new RectF();
        }
        this.handleMediaPlayPauseIfPendingOnHandler.set(rectFAudioAttributesCompatParcelizer.left * f, rectFAudioAttributesCompatParcelizer.top * f2, rectFAudioAttributesCompatParcelizer.right * f, rectFAudioAttributesCompatParcelizer.bottom * f2);
        if (this.onFastForward == null) {
            this.onFastForward = new Rect();
        }
        this.onFastForward.set(0, 0, Math.round(this.handleMediaPlayPauseIfPendingOnHandler.width()), Math.round(this.handleMediaPlayPauseIfPendingOnHandler.height()));
        if (read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.handleMediaPlayPauseIfPendingOnHandler)) {
            Bitmap bitmap = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (bitmap != null) {
                AudioAttributesCompatParcelizer(bitmap);
            }
            Bitmap bitmap2 = this.onPause;
            if (bitmap2 != null) {
                AudioAttributesCompatParcelizer(bitmap2);
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, Bitmap.Config.ARGB_8888);
            this.onPause = IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, Bitmap.Config.ALPHA_8);
            this.onCommand = new Canvas(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            this.onPlay = new Canvas(this.onPause);
        } else {
            Canvas canvas2 = this.onCommand;
            if (canvas2 == null || this.onPlay == null || (onsurfacetexturedestroyed = this.AudioAttributesCompatParcelizer) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.onFastForward, onsurfacetexturedestroyed);
            this.onPlay.drawRect(this.onFastForward, this.AudioAttributesCompatParcelizer);
        }
        if (this.onPause == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.onPlayFromMediaId == null) {
            this.onPlayFromMediaId = new onSurfaceTextureDestroyed(1);
        }
        this.onPlay.drawBitmap(this.read, Math.round((this.onPrepareFromMediaId.left - rectFAudioAttributesCompatParcelizer.left) * f), Math.round((this.onPrepareFromMediaId.top - rectFAudioAttributesCompatParcelizer.top) * f2), (Paint) null);
        if (this.onMediaButtonEvent == null || this.AudioAttributesImplBaseParcelizer != access3100Var.AudioAttributesCompatParcelizer()) {
            float fAudioAttributesCompatParcelizer = (access3100Var.AudioAttributesCompatParcelizer() * (f + f2)) / 2.0f;
            if (fAudioAttributesCompatParcelizer > BitmapDescriptorFactory.HUE_RED) {
                this.onMediaButtonEvent = new BlurMaskFilter(fAudioAttributesCompatParcelizer, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.onMediaButtonEvent = null;
            }
            this.AudioAttributesImplBaseParcelizer = access3100Var.AudioAttributesCompatParcelizer();
        }
        this.onPlayFromMediaId.setColor(access3100Var.write());
        if (access3100Var.AudioAttributesCompatParcelizer() > BitmapDescriptorFactory.HUE_RED) {
            this.onPlayFromMediaId.setMaskFilter(this.onMediaButtonEvent);
        } else {
            this.onPlayFromMediaId.setMaskFilter(null);
        }
        this.onPlayFromMediaId.setFilterBitmap(true);
        this.onCommand.drawBitmap(this.onPause, Math.round(access3100Var.read() * f), Math.round(access3100Var.IconCompatParcelizer() * f2), this.onPlayFromMediaId);
        canvas.drawBitmap(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onFastForward, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer);
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, access3100 access3100Var) {
        if (this.onAddQueueItem == null || this.onPrepare == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.MediaBrowserCompatMediaItem;
        float f = fArr != null ? fArr[0] : 1.0f;
        float f2 = fArr != null ? fArr[4] : 1.0f;
        access3100 access3100Var2 = this.AudioAttributesImplApi21Parcelizer;
        if (access3100Var2 == null || !access3100Var.IconCompatParcelizer(access3100Var2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(access3100Var.write(), PorterDuff.Mode.SRC_IN));
            if (access3100Var.AudioAttributesCompatParcelizer() > BitmapDescriptorFactory.HUE_RED) {
                float fAudioAttributesCompatParcelizer = (access3100Var.AudioAttributesCompatParcelizer() * (f + f2)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fAudioAttributesCompatParcelizer, fAudioAttributesCompatParcelizer, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.onPrepare.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.AudioAttributesImplApi21Parcelizer = access3100Var;
        }
        RectF rectFAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onPrepareFromMediaId, access3100Var);
        RectF rectF = new RectF(rectFAudioAttributesCompatParcelizer.left * f, rectFAudioAttributesCompatParcelizer.top * f2, rectFAudioAttributesCompatParcelizer.right * f, rectFAudioAttributesCompatParcelizer.bottom * f2);
        this.onPrepare.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.onPrepare.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (access3100Var.read() * f), (-rectF.top) + (access3100Var.IconCompatParcelizer() * f2));
        recordingCanvasBeginRecording.drawRenderNode(this.onAddQueueItem);
        this.onPrepare.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.onPrepare);
        canvas.restore();
    }

    public final boolean write() {
        return this.MediaBrowserCompatCustomActionResultReceiver == IconCompatParcelizer.RENDER_NODE;
    }
}
