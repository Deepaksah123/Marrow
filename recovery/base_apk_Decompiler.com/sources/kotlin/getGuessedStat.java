package kotlin;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getGuessedStat implements getMyStat, View.OnTouchListener, setMyStat, ViewTreeObserver.OnGlobalLayoutListener {
    private static final boolean RemoteActionCompatParcelizer = Log.isLoggable("PhotoViewAttacher", 3);
    static int read = 1;
    private final Matrix AudioAttributesCompatParcelizer;
    private final Matrix AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private read AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final RectF MediaBrowserCompatItemReceiver;
    private WeakReference<ImageView> MediaBrowserCompatMediaItem;
    private Interpolator MediaBrowserCompatSearchResultReceiver;
    private final float[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private GestureDetector MediaMetadataCompat;
    private int RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private IconCompatParcelizer onAddQueueItem;
    private View.OnLongClickListener onCommand;
    private int onCustomAction;
    private float onFastForward;
    private float onMediaButtonEvent;
    private AudioAttributesCompatParcelizer onPause;
    private float onPlay;
    private write onPlayFromMediaId;
    private ImageView.ScaleType onPlayFromSearch;
    private MediaBrowserCompatCustomActionResultReceiver onPlayFromUri;
    private int onPrepare;
    private final Matrix onPrepareFromMediaId;
    private getTopUserStat onPrepareFromSearch;
    private AudioAttributesImplBaseParcelizer onRemoveQueueItem;
    private boolean onRewind;
    int write;

    public interface AudioAttributesCompatParcelizer {
    }

    public interface AudioAttributesImplBaseParcelizer {
    }

    public interface IconCompatParcelizer {
    }

    public interface MediaBrowserCompatCustomActionResultReceiver {
        boolean read();
    }

    public interface write {
    }

    private static void write(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    private static boolean read(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    /* JADX INFO: renamed from: o.getGuessedStat$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            write = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                write[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private static boolean read(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass2.write[scaleType.ordinal()] != 1) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(scaleType.name());
        sb.append(" is not supported in PhotoView");
        throw new IllegalArgumentException(sb.toString());
    }

    private static void write(ImageView imageView) {
        if (imageView == null || (imageView instanceof getMyStat) || ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public getGuessedStat(ImageView imageView) {
        this(imageView, (byte) 0);
    }

    private getGuessedStat(ImageView imageView, byte b) {
        this.MediaBrowserCompatSearchResultReceiver = new AccelerateDecelerateInterpolator();
        this.write = 200;
        this.onPlay = 1.0f;
        this.onFastForward = 1.75f;
        this.onMediaButtonEvent = 3.0f;
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.AudioAttributesCompatParcelizer = new Matrix();
        this.AudioAttributesImplApi21Parcelizer = new Matrix();
        this.onPrepareFromMediaId = new Matrix();
        this.MediaBrowserCompatItemReceiver = new RectF();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new float[9];
        this.onPrepare = 2;
        this.onPlayFromSearch = ImageView.ScaleType.FIT_CENTER;
        this.MediaBrowserCompatMediaItem = new WeakReference<>(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        write(imageView);
        if (imageView.isInEditMode()) {
            return;
        }
        this.onPrepareFromSearch = getNeetRanks.RemoteActionCompatParcelizer(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: o.getGuessedStat.5
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                if (getGuessedStat.this.onCommand != null) {
                    getGuessedStat.this.onCommand.onLongClick(getGuessedStat.this.IconCompatParcelizer());
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (getGuessedStat.this.onPlayFromUri == null || getGuessedStat.this.MediaDescriptionCompat() > 1.0f || emptyList.read(motionEvent) > getGuessedStat.read || emptyList.read(motionEvent2) > getGuessedStat.read) {
                    return false;
                }
                return getGuessedStat.this.onPlayFromUri.read();
            }
        });
        this.MediaMetadataCompat = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new getChangeWrong(this));
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        read(true);
    }

    public final void AudioAttributesCompatParcelizer(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.MediaMetadataCompat.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.MediaMetadataCompat.setOnDoubleTapListener(new getChangeWrong(this));
        }
    }

    public final void IconCompatParcelizer(write writeVar) {
        this.onPlayFromMediaId = writeVar;
    }

    public final void write(MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        this.onPlayFromUri = mediaBrowserCompatCustomActionResultReceiver;
    }

    public final void read() {
        WeakReference<ImageView> weakReference = this.MediaBrowserCompatMediaItem;
        if (weakReference == null) {
            return;
        }
        ImageView imageView = weakReference.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            MediaMetadataCompat();
        }
        GestureDetector gestureDetector = this.MediaMetadataCompat;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
        this.onAddQueueItem = null;
        this.onPause = null;
        this.onRemoveQueueItem = null;
        this.MediaBrowserCompatMediaItem = null;
    }

    public final RectF RemoteActionCompatParcelizer() {
        handleMediaPlayPauseIfPendingOnHandler();
        return IconCompatParcelizer(onAddQueueItem());
    }

    public final void IconCompatParcelizer(float f) {
        this.onPrepareFromMediaId.setRotate(f % 360.0f);
        MediaBrowserCompatMediaItem();
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.onPrepareFromMediaId.postRotate(f % 360.0f);
        MediaBrowserCompatMediaItem();
    }

    public final ImageView IconCompatParcelizer() {
        WeakReference<ImageView> weakReference = this.MediaBrowserCompatMediaItem;
        ImageView imageView = weakReference != null ? weakReference.get() : null;
        if (imageView == null) {
            read();
            setNeetRanks.IconCompatParcelizer();
        }
        return imageView;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.onPlay;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.onFastForward;
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.onMediaButtonEvent;
    }

    public final float MediaDescriptionCompat() {
        return (float) Math.sqrt(((float) Math.pow(IconCompatParcelizer(this.onPrepareFromMediaId, 0), 2.0d)) + ((float) Math.pow(IconCompatParcelizer(this.onPrepareFromMediaId, 3), 2.0d)));
    }

    public final ImageView.ScaleType MediaBrowserCompatSearchResultReceiver() {
        return this.onPlayFromSearch;
    }

    @Override // kotlin.setMyStat
    public final void read(float f, float f2) {
        if (this.onPrepareFromSearch.write()) {
            return;
        }
        if (RemoteActionCompatParcelizer) {
            setNeetRanks.IconCompatParcelizer();
            new Object[]{Float.valueOf(f), Float.valueOf(f2)};
        }
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        this.onPrepareFromMediaId.postTranslate(f, f2);
        MediaBrowserCompatMediaItem();
        ViewParent parent = imageViewIconCompatParcelizer.getParent();
        if (!this.IconCompatParcelizer || this.onPrepareFromSearch.write() || this.MediaBrowserCompatCustomActionResultReceiver) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        int i = this.onPrepare;
        if ((i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // kotlin.setMyStat
    public final void AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4) {
        if (RemoteActionCompatParcelizer) {
            setNeetRanks.IconCompatParcelizer();
        }
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        read readVar = new read(imageViewIconCompatParcelizer.getContext());
        this.AudioAttributesImplBaseParcelizer = readVar;
        readVar.AudioAttributesCompatParcelizer(IconCompatParcelizer(imageViewIconCompatParcelizer), AudioAttributesCompatParcelizer(imageViewIconCompatParcelizer), (int) f3, (int) f4);
        imageViewIconCompatParcelizer.post(this.AudioAttributesImplBaseParcelizer);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        if (imageViewIconCompatParcelizer != null) {
            if (this.onRewind) {
                int top = imageViewIconCompatParcelizer.getTop();
                int right = imageViewIconCompatParcelizer.getRight();
                int bottom = imageViewIconCompatParcelizer.getBottom();
                int left = imageViewIconCompatParcelizer.getLeft();
                if (top == this.onCustomAction && bottom == this.RatingCompat && left == this.MediaDescriptionCompat && right == this.handleMediaPlayPauseIfPendingOnHandler) {
                    return;
                }
                AudioAttributesCompatParcelizer(imageViewIconCompatParcelizer.getDrawable());
                this.onCustomAction = top;
                this.handleMediaPlayPauseIfPendingOnHandler = right;
                this.RatingCompat = bottom;
                this.MediaDescriptionCompat = left;
                return;
            }
            AudioAttributesCompatParcelizer(imageViewIconCompatParcelizer.getDrawable());
        }
    }

    @Override // kotlin.setMyStat
    public final void IconCompatParcelizer(float f, float f2, float f3) {
        if (RemoteActionCompatParcelizer) {
            setNeetRanks.IconCompatParcelizer();
            new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        }
        if (MediaDescriptionCompat() < this.onMediaButtonEvent || f < 1.0f) {
            if (MediaDescriptionCompat() > this.onPlay || f > 1.0f) {
                this.onPrepareFromMediaId.postScale(f, f, f2, f3);
                MediaBrowserCompatMediaItem();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.onRewind
            r1 = 0
            if (r0 == 0) goto L98
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = read(r0)
            if (r0 == 0) goto L98
            android.view.ViewParent r0 = r11.getParent()
            int r2 = r12.getAction()
            r3 = 1
            if (r2 == 0) goto L49
            if (r2 == r3) goto L1f
            r0 = 3
            if (r2 == r0) goto L1f
            goto L55
        L1f:
            float r0 = r10.MediaDescriptionCompat()
            float r2 = r10.onPlay
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L55
            android.graphics.RectF r0 = r10.RemoteActionCompatParcelizer()
            if (r0 == 0) goto L55
            float r6 = r10.MediaDescriptionCompat()
            float r7 = r10.onPlay
            o.getGuessedStat$RemoteActionCompatParcelizer r2 = new o.getGuessedStat$RemoteActionCompatParcelizer
            float r8 = r0.centerX()
            float r9 = r0.centerY()
            r4 = r2
            r5 = r10
            r4.<init>(r6, r7, r8, r9)
            r11.post(r2)
            r11 = r3
            goto L56
        L49:
            if (r0 == 0) goto L4f
            r0.requestDisallowInterceptTouchEvent(r3)
            goto L52
        L4f:
            kotlin.setNeetRanks.IconCompatParcelizer()
        L52:
            r10.MediaMetadataCompat()
        L55:
            r11 = r1
        L56:
            o.getTopUserStat r0 = r10.onPrepareFromSearch
            if (r0 == 0) goto L8c
            boolean r11 = r0.write()
            o.getTopUserStat r0 = r10.onPrepareFromSearch
            boolean r0 = r0.read()
            o.getTopUserStat r2 = r10.onPrepareFromSearch
            boolean r2 = r2.RemoteActionCompatParcelizer(r12)
            if (r11 != 0) goto L76
            o.getTopUserStat r11 = r10.onPrepareFromSearch
            boolean r11 = r11.write()
            if (r11 != 0) goto L76
            r11 = r3
            goto L77
        L76:
            r11 = r1
        L77:
            if (r0 != 0) goto L83
            o.getTopUserStat r0 = r10.onPrepareFromSearch
            boolean r0 = r0.read()
            if (r0 != 0) goto L83
            r0 = r3
            goto L84
        L83:
            r0 = r1
        L84:
            if (r11 == 0) goto L89
            if (r0 == 0) goto L89
            r1 = r3
        L89:
            r10.MediaBrowserCompatCustomActionResultReceiver = r1
            r11 = r2
        L8c:
            android.view.GestureDetector r10 = r10.MediaMetadataCompat
            if (r10 == 0) goto L97
            boolean r10 = r10.onTouchEvent(r12)
            if (r10 == 0) goto L97
            return r3
        L97:
            return r11
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getGuessedStat.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        write(f, this.onFastForward, this.onMediaButtonEvent);
        this.onPlay = f;
    }

    public final void read(float f) {
        write(this.onPlay, f, this.onMediaButtonEvent);
        this.onFastForward = f;
    }

    public final void write(float f) {
        write(this.onPlay, this.onFastForward, f);
        this.onMediaButtonEvent = f;
    }

    public final void AudioAttributesCompatParcelizer(float f, float f2, float f3) {
        write(f, f2, f3);
        this.onPlay = f;
        this.onFastForward = f2;
        this.onMediaButtonEvent = f3;
    }

    public final void write(View.OnLongClickListener onLongClickListener) {
        this.onCommand = onLongClickListener;
    }

    public final void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        this.onAddQueueItem = iconCompatParcelizer;
    }

    public final void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.onPause = audioAttributesCompatParcelizer;
    }

    final AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
        return this.onPause;
    }

    public final void IconCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        this.onRemoveQueueItem = audioAttributesImplBaseParcelizer;
    }

    final AudioAttributesImplBaseParcelizer AudioAttributesImplBaseParcelizer() {
        return this.onRemoveQueueItem;
    }

    public final void AudioAttributesImplBaseParcelizer(float f) {
        RemoteActionCompatParcelizer(f, false);
    }

    public final void RemoteActionCompatParcelizer(float f, boolean z) {
        if (IconCompatParcelizer() != null) {
            RemoteActionCompatParcelizer(f, r0.getRight() / 2, r0.getBottom() / 2, z);
        }
    }

    public final void RemoteActionCompatParcelizer(float f, float f2, float f3, boolean z) {
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        if (imageViewIconCompatParcelizer != null) {
            if (f < this.onPlay || f > this.onMediaButtonEvent) {
                setNeetRanks.IconCompatParcelizer();
            } else if (z) {
                imageViewIconCompatParcelizer.post(new RemoteActionCompatParcelizer(MediaDescriptionCompat(), f, f2, f3));
            } else {
                this.onPrepareFromMediaId.setScale(f, f, f2, f3);
                MediaBrowserCompatMediaItem();
            }
        }
    }

    public final void write(ImageView.ScaleType scaleType) {
        if (!read(scaleType) || scaleType == this.onPlayFromSearch) {
            return;
        }
        this.onPlayFromSearch = scaleType;
        RatingCompat();
    }

    public final void read(boolean z) {
        this.onRewind = z;
        RatingCompat();
    }

    public final void RatingCompat() {
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        if (imageViewIconCompatParcelizer != null) {
            if (this.onRewind) {
                write(imageViewIconCompatParcelizer);
                AudioAttributesCompatParcelizer(imageViewIconCompatParcelizer.getDrawable());
            } else {
                onCommand();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Matrix onAddQueueItem() {
        this.AudioAttributesImplApi21Parcelizer.set(this.AudioAttributesCompatParcelizer);
        this.AudioAttributesImplApi21Parcelizer.postConcat(this.onPrepareFromMediaId);
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private void MediaMetadataCompat() {
        read readVar = this.AudioAttributesImplBaseParcelizer;
        if (readVar != null) {
            readVar.RemoteActionCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer = null;
        }
    }

    public final Matrix write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private void MediaBrowserCompatMediaItem() {
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            write(onAddQueueItem());
        }
    }

    private void onCustomAction() {
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        if (imageViewIconCompatParcelizer != null && !(imageViewIconCompatParcelizer instanceof getMyStat) && !ImageView.ScaleType.MATRIX.equals(imageViewIconCompatParcelizer.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    private boolean handleMediaPlayPauseIfPendingOnHandler() {
        RectF rectFIconCompatParcelizer;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        if (imageViewIconCompatParcelizer == null || (rectFIconCompatParcelizer = IconCompatParcelizer(onAddQueueItem())) == null) {
            return false;
        }
        float fHeight = rectFIconCompatParcelizer.height();
        float fWidth = rectFIconCompatParcelizer.width();
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(imageViewIconCompatParcelizer);
        float f7 = BitmapDescriptorFactory.HUE_RED;
        if (fHeight <= fAudioAttributesCompatParcelizer) {
            int i = AnonymousClass2.write[this.onPlayFromSearch.ordinal()];
            if (i != 2) {
                if (i == 3) {
                    fAudioAttributesCompatParcelizer -= fHeight;
                    f2 = rectFIconCompatParcelizer.top;
                } else {
                    fAudioAttributesCompatParcelizer = (fAudioAttributesCompatParcelizer - fHeight) / 2.0f;
                    f2 = rectFIconCompatParcelizer.top;
                }
                f = fAudioAttributesCompatParcelizer - f2;
            } else {
                f3 = rectFIconCompatParcelizer.top;
                f = -f3;
            }
        } else if (rectFIconCompatParcelizer.top > BitmapDescriptorFactory.HUE_RED) {
            f3 = rectFIconCompatParcelizer.top;
            f = -f3;
        } else if (rectFIconCompatParcelizer.bottom < fAudioAttributesCompatParcelizer) {
            f2 = rectFIconCompatParcelizer.bottom;
            f = fAudioAttributesCompatParcelizer - f2;
        } else {
            f = 0.0f;
        }
        float fIconCompatParcelizer = IconCompatParcelizer(imageViewIconCompatParcelizer);
        if (fWidth <= fIconCompatParcelizer) {
            int i2 = AnonymousClass2.write[this.onPlayFromSearch.ordinal()];
            if (i2 != 2) {
                if (i2 == 3) {
                    f5 = fIconCompatParcelizer - fWidth;
                    f6 = rectFIconCompatParcelizer.left;
                } else {
                    f5 = (fIconCompatParcelizer - fWidth) / 2.0f;
                    f6 = rectFIconCompatParcelizer.left;
                }
                f4 = f5 - f6;
            } else {
                f4 = -rectFIconCompatParcelizer.left;
            }
            f7 = f4;
            this.onPrepare = 2;
        } else if (rectFIconCompatParcelizer.left > BitmapDescriptorFactory.HUE_RED) {
            this.onPrepare = 0;
            f7 = -rectFIconCompatParcelizer.left;
        } else if (rectFIconCompatParcelizer.right < fIconCompatParcelizer) {
            f7 = fIconCompatParcelizer - rectFIconCompatParcelizer.right;
            this.onPrepare = 1;
        } else {
            this.onPrepare = -1;
        }
        this.onPrepareFromMediaId.postTranslate(f7, f);
        return true;
    }

    private RectF IconCompatParcelizer(Matrix matrix) {
        Drawable drawable;
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        if (imageViewIconCompatParcelizer == null || (drawable = imageViewIconCompatParcelizer.getDrawable()) == null) {
            return null;
        }
        this.MediaBrowserCompatItemReceiver.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.MediaBrowserCompatItemReceiver);
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        if (i < 0) {
            i = 200;
        }
        this.write = i;
    }

    private float IconCompatParcelizer(Matrix matrix, int i) {
        matrix.getValues(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[i];
    }

    private void onCommand() {
        this.onPrepareFromMediaId.reset();
        RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        write(onAddQueueItem());
        handleMediaPlayPauseIfPendingOnHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(Matrix matrix) {
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        if (imageViewIconCompatParcelizer != null) {
            onCustomAction();
            imageViewIconCompatParcelizer.setImageMatrix(matrix);
            if (this.onAddQueueItem != null) {
                IconCompatParcelizer(matrix);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(Drawable drawable) {
        ImageView imageViewIconCompatParcelizer = IconCompatParcelizer();
        if (imageViewIconCompatParcelizer == null || drawable == null) {
            return;
        }
        float fIconCompatParcelizer = IconCompatParcelizer(imageViewIconCompatParcelizer);
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(imageViewIconCompatParcelizer);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.AudioAttributesCompatParcelizer.reset();
        float f = intrinsicWidth;
        float f2 = fIconCompatParcelizer / f;
        float f3 = intrinsicHeight;
        float f4 = fAudioAttributesCompatParcelizer / f3;
        if (this.onPlayFromSearch == ImageView.ScaleType.CENTER) {
            this.AudioAttributesCompatParcelizer.postTranslate((fIconCompatParcelizer - f) / 2.0f, (fAudioAttributesCompatParcelizer - f3) / 2.0f);
        } else if (this.onPlayFromSearch == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            this.AudioAttributesCompatParcelizer.postScale(fMax, fMax);
            this.AudioAttributesCompatParcelizer.postTranslate((fIconCompatParcelizer - (f * fMax)) / 2.0f, (fAudioAttributesCompatParcelizer - (f3 * fMax)) / 2.0f);
        } else if (this.onPlayFromSearch == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            this.AudioAttributesCompatParcelizer.postScale(fMin, fMin);
            this.AudioAttributesCompatParcelizer.postTranslate((fIconCompatParcelizer - (f * fMin)) / 2.0f, (fAudioAttributesCompatParcelizer - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f3);
            RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIconCompatParcelizer, fAudioAttributesCompatParcelizer);
            int i = 0 % 180;
            int i2 = AnonymousClass2.write[this.onPlayFromSearch.ordinal()];
            if (i2 == 2) {
                this.AudioAttributesCompatParcelizer.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i2 == 3) {
                this.AudioAttributesCompatParcelizer.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i2 == 4) {
                this.AudioAttributesCompatParcelizer.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i2 == 5) {
                this.AudioAttributesCompatParcelizer.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        onCommand();
    }

    private static int IconCompatParcelizer(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private static int AudioAttributesCompatParcelizer(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    class RemoteActionCompatParcelizer implements Runnable {
        private final float AudioAttributesCompatParcelizer;
        private final long IconCompatParcelizer = System.currentTimeMillis();
        private final float RemoteActionCompatParcelizer;
        private final float read;
        private final float write;

        public RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
            this.write = f3;
            this.AudioAttributesCompatParcelizer = f4;
            this.RemoteActionCompatParcelizer = f;
            this.read = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ImageView imageViewIconCompatParcelizer = getGuessedStat.this.IconCompatParcelizer();
            if (imageViewIconCompatParcelizer != null) {
                float f = read();
                float f2 = this.RemoteActionCompatParcelizer;
                getGuessedStat.this.IconCompatParcelizer((f2 + ((this.read - f2) * f)) / getGuessedStat.this.MediaDescriptionCompat(), this.write, this.AudioAttributesCompatParcelizer);
                if (f < 1.0f) {
                    SubjectStatV2RSModel.write(imageViewIconCompatParcelizer, this);
                }
            }
        }

        private float read() {
            return getGuessedStat.this.MediaBrowserCompatSearchResultReceiver.getInterpolation(Math.min(1.0f, (System.currentTimeMillis() - this.IconCompatParcelizer) / getGuessedStat.this.write));
        }
    }

    class read implements Runnable {
        private int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private final TestScoreRSModel read;

        public read(Context context) {
            this.read = TestScoreRSModel.IconCompatParcelizer(context);
        }

        public final void RemoteActionCompatParcelizer() {
            if (getGuessedStat.RemoteActionCompatParcelizer) {
                setNeetRanks.IconCompatParcelizer();
            }
            this.read.write();
        }

        public final void AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4) {
            int i5;
            int iRound;
            int i6;
            int iRound2;
            RectF rectFRemoteActionCompatParcelizer = getGuessedStat.this.RemoteActionCompatParcelizer();
            if (rectFRemoteActionCompatParcelizer != null) {
                int iRound3 = Math.round(-rectFRemoteActionCompatParcelizer.left);
                float f = i;
                if (f < rectFRemoteActionCompatParcelizer.width()) {
                    iRound = Math.round(rectFRemoteActionCompatParcelizer.width() - f);
                    i5 = 0;
                } else {
                    i5 = iRound3;
                    iRound = i5;
                }
                int iRound4 = Math.round(-rectFRemoteActionCompatParcelizer.top);
                float f2 = i2;
                if (f2 < rectFRemoteActionCompatParcelizer.height()) {
                    iRound2 = Math.round(rectFRemoteActionCompatParcelizer.height() - f2);
                    i6 = 0;
                } else {
                    i6 = iRound4;
                    iRound2 = i6;
                }
                this.AudioAttributesCompatParcelizer = iRound3;
                this.IconCompatParcelizer = iRound4;
                if (getGuessedStat.RemoteActionCompatParcelizer) {
                    setNeetRanks.IconCompatParcelizer();
                }
                if (iRound3 == iRound && iRound4 == iRound2) {
                    return;
                }
                this.read.RemoteActionCompatParcelizer(iRound3, iRound4, i3, i4, i5, iRound, i6, iRound2);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ImageView imageViewIconCompatParcelizer;
            if (this.read.AudioAttributesCompatParcelizer() || (imageViewIconCompatParcelizer = getGuessedStat.this.IconCompatParcelizer()) == null || !this.read.read()) {
                return;
            }
            int iIconCompatParcelizer = this.read.IconCompatParcelizer();
            int iRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
            if (getGuessedStat.RemoteActionCompatParcelizer) {
                setNeetRanks.IconCompatParcelizer();
            }
            getGuessedStat.this.onPrepareFromMediaId.postTranslate(this.AudioAttributesCompatParcelizer - iIconCompatParcelizer, this.IconCompatParcelizer - iRemoteActionCompatParcelizer);
            getGuessedStat getguessedstat = getGuessedStat.this;
            getguessedstat.write(getguessedstat.onAddQueueItem());
            this.AudioAttributesCompatParcelizer = iIconCompatParcelizer;
            this.IconCompatParcelizer = iRemoteActionCompatParcelizer;
            SubjectStatV2RSModel.write(imageViewIconCompatParcelizer, this);
        }
    }
}
