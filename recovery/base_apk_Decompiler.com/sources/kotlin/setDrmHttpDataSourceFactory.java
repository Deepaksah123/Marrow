package kotlin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.DefaultDrmSessionProvisioningManager;
import kotlin.createManager;

/* JADX INFO: loaded from: classes4.dex */
public final class setDrmHttpDataSourceFactory extends compare {
    private Path AudioAttributesCompatParcelizer;
    private Path IconCompatParcelizer;
    private float[] MediaBrowserCompatMediaItem;
    private HashMap<setPlayClearSamplesWithoutKeys, AudioAttributesCompatParcelizer> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Bitmap.Config MediaDescriptionCompat;
    private Path MediaMetadataCompat;
    private WeakReference<Bitmap> RatingCompat;
    private Canvas RemoteActionCompatParcelizer;
    private float[] onCustomAction;
    protected undoAcquisition read;
    protected Paint write;

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer() {
    }

    public setDrmHttpDataSourceFactory(undoAcquisition undoacquisition, onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.MediaDescriptionCompat = Bitmap.Config.ARGB_8888;
        this.AudioAttributesCompatParcelizer = new Path();
        this.IconCompatParcelizer = new Path();
        this.onCustomAction = new float[4];
        this.MediaMetadataCompat = new Path();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new HashMap<>();
        this.MediaBrowserCompatMediaItem = new float[2];
        this.read = undoacquisition;
        Paint paint = new Paint(1);
        this.write = paint;
        paint.setStyle(Paint.Style.FILL);
        this.write.setColor(-1);
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void IconCompatParcelizer(Canvas canvas) {
        int iMediaBrowserCompatMediaItem = (int) this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatMediaItem();
        int iMediaDescriptionCompat = (int) this.MediaBrowserCompatSearchResultReceiver.MediaDescriptionCompat();
        WeakReference<Bitmap> weakReference = this.RatingCompat;
        Bitmap bitmapCreateBitmap = weakReference == null ? null : weakReference.get();
        if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != iMediaBrowserCompatMediaItem || bitmapCreateBitmap.getHeight() != iMediaDescriptionCompat) {
            if (iMediaBrowserCompatMediaItem <= 0 || iMediaDescriptionCompat <= 0) {
                return;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(iMediaBrowserCompatMediaItem, iMediaDescriptionCompat, this.MediaDescriptionCompat);
            this.RatingCompat = new WeakReference<>(bitmapCreateBitmap);
            this.RemoteActionCompatParcelizer = new Canvas(bitmapCreateBitmap);
        }
        bitmapCreateBitmap.eraseColor(0);
        for (T t : this.read.MediaSessionCompatToken().IconCompatParcelizer()) {
            if (t.handleMediaPlayPauseIfPendingOnHandler()) {
                AudioAttributesCompatParcelizer(canvas, t);
            }
        }
        canvas.drawBitmap(bitmapCreateBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.AudioAttributesImplBaseParcelizer);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider) {
        if (setuuidandexomediadrmprovider.onMediaButtonEvent() <= 0) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer.setStrokeWidth(setuuidandexomediadrmprovider.onSkipToQueueItem());
        this.AudioAttributesImplBaseParcelizer.setPathEffect(setuuidandexomediadrmprovider.onSeekTo());
        int i = AnonymousClass2.write[setuuidandexomediadrmprovider.onRemoveQueueItemAt().ordinal()];
        if (i == 3) {
            RemoteActionCompatParcelizer(setuuidandexomediadrmprovider);
        } else if (i != 4) {
            IconCompatParcelizer(canvas, setuuidandexomediadrmprovider);
        } else {
            IconCompatParcelizer(setuuidandexomediadrmprovider);
        }
        this.AudioAttributesImplBaseParcelizer.setPathEffect(null);
    }

    /* JADX INFO: renamed from: o.setDrmHttpDataSourceFactory$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[DefaultDrmSessionProvisioningManager.read.values().length];
            write = iArr;
            try {
                iArr[DefaultDrmSessionProvisioningManager.read.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[DefaultDrmSessionProvisioningManager.read.STEPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[DefaultDrmSessionProvisioningManager.read.CUBIC_BEZIER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                write[DefaultDrmSessionProvisioningManager.read.HORIZONTAL_BEZIER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    private void IconCompatParcelizer(setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider) {
        float f = this.MediaBrowserCompatItemReceiver.read();
        drmSessionReleased drmsessionreleasedWrite = this.read.write(setuuidandexomediadrmprovider.IconCompatParcelizer());
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.read, setuuidandexomediadrmprovider);
        this.AudioAttributesCompatParcelizer.reset();
        if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer > 0) {
            ?? IconCompatParcelizer = setuuidandexomediadrmprovider.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer.moveTo(IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), IconCompatParcelizer.read() * f);
            int i = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer + 1;
            ?? r2 = IconCompatParcelizer;
            while (i <= this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer) {
                ?? IconCompatParcelizer2 = setuuidandexomediadrmprovider.IconCompatParcelizer(i);
                float fMediaBrowserCompatCustomActionResultReceiver = r2.MediaBrowserCompatCustomActionResultReceiver() + ((IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver() - r2.MediaBrowserCompatCustomActionResultReceiver()) / 2.0f);
                Path path = this.AudioAttributesCompatParcelizer;
                float f2 = r2.read();
                path.cubicTo(fMediaBrowserCompatCustomActionResultReceiver, f2 * f, fMediaBrowserCompatCustomActionResultReceiver, IconCompatParcelizer2.read() * f, IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver(), IconCompatParcelizer2.read() * f);
                i++;
                r2 = IconCompatParcelizer2;
            }
        }
        if (setuuidandexomediadrmprovider.setSessionImpl()) {
            this.IconCompatParcelizer.reset();
            this.IconCompatParcelizer.addPath(this.AudioAttributesCompatParcelizer);
            write(this.RemoteActionCompatParcelizer, setuuidandexomediadrmprovider, this.IconCompatParcelizer, drmsessionreleasedWrite, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        this.AudioAttributesImplBaseParcelizer.setColor(setuuidandexomediadrmprovider.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer.setStyle(Paint.Style.STROKE);
        drmsessionreleasedWrite.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer.drawPath(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
        this.AudioAttributesImplBaseParcelizer.setPathEffect(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    private void RemoteActionCompatParcelizer(setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider) {
        float f = this.MediaBrowserCompatItemReceiver.read();
        drmSessionReleased drmsessionreleasedWrite = this.read.write(setuuidandexomediadrmprovider.IconCompatParcelizer());
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.read, setuuidandexomediadrmprovider);
        float fOnRewind = setuuidandexomediadrmprovider.onRewind();
        this.AudioAttributesCompatParcelizer.reset();
        if (this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer > 0) {
            int i = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
            int i3 = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            Object objIconCompatParcelizer = setuuidandexomediadrmprovider.IconCompatParcelizer(Math.max(i - 1, 0));
            ?? IconCompatParcelizer = setuuidandexomediadrmprovider.IconCompatParcelizer(Math.max(i, 0));
            if (IconCompatParcelizer != 0) {
                this.AudioAttributesCompatParcelizer.moveTo(IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), IconCompatParcelizer.read() * f);
                int i4 = -1;
                int i5 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer + 1;
                ?? r4 = objIconCompatParcelizer;
                ?? r3 = IconCompatParcelizer;
                ?? r2 = IconCompatParcelizer;
                while (true) {
                    ?? IconCompatParcelizer2 = r2;
                    if (i5 > this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer) {
                        break;
                    }
                    if (i4 != i5) {
                        IconCompatParcelizer2 = setuuidandexomediadrmprovider.IconCompatParcelizer(i5);
                    }
                    int i6 = i5 + 1;
                    if (i6 < setuuidandexomediadrmprovider.onMediaButtonEvent()) {
                        i5 = i6;
                    }
                    ?? IconCompatParcelizer3 = setuuidandexomediadrmprovider.IconCompatParcelizer(i5);
                    float fMediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver();
                    float fMediaBrowserCompatCustomActionResultReceiver2 = r4.MediaBrowserCompatCustomActionResultReceiver();
                    float f2 = IconCompatParcelizer2.read();
                    float f3 = r4.read();
                    float fMediaBrowserCompatCustomActionResultReceiver3 = IconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver();
                    float fMediaBrowserCompatCustomActionResultReceiver4 = r3.MediaBrowserCompatCustomActionResultReceiver();
                    float f4 = IconCompatParcelizer3.read();
                    float f5 = r3.read();
                    int i7 = i5;
                    this.AudioAttributesCompatParcelizer.cubicTo(r3.MediaBrowserCompatCustomActionResultReceiver() + ((fMediaBrowserCompatCustomActionResultReceiver - fMediaBrowserCompatCustomActionResultReceiver2) * fOnRewind), (r3.read() + ((f2 - f3) * fOnRewind)) * f, IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver() - ((fMediaBrowserCompatCustomActionResultReceiver3 - fMediaBrowserCompatCustomActionResultReceiver4) * fOnRewind), (IconCompatParcelizer2.read() - ((f4 - f5) * fOnRewind)) * f, IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver(), IconCompatParcelizer2.read() * f);
                    r4 = r3;
                    i5 = i6;
                    i4 = i7;
                    r3 = IconCompatParcelizer2;
                    r2 = IconCompatParcelizer3;
                }
            } else {
                return;
            }
        }
        if (setuuidandexomediadrmprovider.setSessionImpl()) {
            this.IconCompatParcelizer.reset();
            this.IconCompatParcelizer.addPath(this.AudioAttributesCompatParcelizer);
            write(this.RemoteActionCompatParcelizer, setuuidandexomediadrmprovider, this.IconCompatParcelizer, drmsessionreleasedWrite, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        this.AudioAttributesImplBaseParcelizer.setColor(setuuidandexomediadrmprovider.RemoteActionCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer.setStyle(Paint.Style.STROKE);
        drmsessionreleasedWrite.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer.drawPath(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer);
        this.AudioAttributesImplBaseParcelizer.setPathEffect(null);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.github.mikephil.charting.data.Entry] */
    private void write(Canvas canvas, setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider, Path path, drmSessionReleased drmsessionreleased, createManager.read readVar) {
        float fIconCompatParcelizer = setuuidandexomediadrmprovider.onPrepareFromUri().IconCompatParcelizer();
        path.lineTo(setuuidandexomediadrmprovider.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer + readVar.IconCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver(), fIconCompatParcelizer);
        path.lineTo(setuuidandexomediadrmprovider.IconCompatParcelizer(readVar.AudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver(), fIconCompatParcelizer);
        path.close();
        drmsessionreleased.IconCompatParcelizer(path);
        Drawable drawableOnSetShuffleMode = setuuidandexomediadrmprovider.onSetShuffleMode();
        if (drawableOnSetShuffleMode != null) {
            write(canvas, path, drawableOnSetShuffleMode);
        } else {
            IconCompatParcelizer(canvas, path, setuuidandexomediadrmprovider.onSetPlaybackSpeed(), setuuidandexomediadrmprovider.onSetCaptioningEnabled());
        }
    }

    /* JADX WARN: Type inference failed for: r12v12, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r13v4, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    private void IconCompatParcelizer(Canvas canvas, setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider) {
        int iOnMediaButtonEvent = setuuidandexomediadrmprovider.onMediaButtonEvent();
        boolean z = setuuidandexomediadrmprovider.onRemoveQueueItemAt() == DefaultDrmSessionProvisioningManager.read.STEPPED;
        int i = z ? 4 : 2;
        drmSessionReleased drmsessionreleasedWrite = this.read.write(setuuidandexomediadrmprovider.IconCompatParcelizer());
        float f = this.MediaBrowserCompatItemReceiver.read();
        this.AudioAttributesImplBaseParcelizer.setStyle(Paint.Style.STROKE);
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.read, setuuidandexomediadrmprovider);
        if (setuuidandexomediadrmprovider.setSessionImpl() && iOnMediaButtonEvent > 0) {
            AudioAttributesCompatParcelizer(canvas, setuuidandexomediadrmprovider, drmsessionreleasedWrite, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        if (setuuidandexomediadrmprovider.write().size() > 1) {
            int i2 = i << 1;
            if (this.onCustomAction.length <= i2) {
                this.onCustomAction = new float[i << 2];
            }
            for (int i3 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer; i3 <= this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer; i3++) {
                ?? IconCompatParcelizer = setuuidandexomediadrmprovider.IconCompatParcelizer(i3);
                if (IconCompatParcelizer != 0) {
                    this.onCustomAction[0] = IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                    this.onCustomAction[1] = IconCompatParcelizer.read() * f;
                    if (i3 < this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
                        ?? IconCompatParcelizer2 = setuuidandexomediadrmprovider.IconCompatParcelizer(i3 + 1);
                        if (IconCompatParcelizer2 == 0) {
                            break;
                        }
                        if (z) {
                            this.onCustomAction[2] = IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver();
                            float[] fArr = this.onCustomAction;
                            float f2 = fArr[1];
                            fArr[3] = f2;
                            fArr[4] = fArr[2];
                            fArr[5] = f2;
                            fArr[6] = IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver();
                            this.onCustomAction[7] = IconCompatParcelizer2.read() * f;
                        } else {
                            this.onCustomAction[2] = IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver();
                            this.onCustomAction[3] = IconCompatParcelizer2.read() * f;
                        }
                    } else {
                        float[] fArr2 = this.onCustomAction;
                        fArr2[2] = fArr2[0];
                        fArr2[3] = fArr2[1];
                    }
                    drmsessionreleasedWrite.RemoteActionCompatParcelizer(this.onCustomAction);
                    if (!this.MediaBrowserCompatSearchResultReceiver.write(this.onCustomAction[0])) {
                        break;
                    }
                    if (this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.onCustomAction[2]) && (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(this.onCustomAction[1]) || this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.onCustomAction[3]))) {
                        this.AudioAttributesImplBaseParcelizer.setColor(setuuidandexomediadrmprovider.AudioAttributesCompatParcelizer(i3));
                        canvas.drawLines(this.onCustomAction, 0, i2, this.AudioAttributesImplBaseParcelizer);
                    }
                }
            }
        } else {
            int i4 = iOnMediaButtonEvent * i;
            if (this.onCustomAction.length < (Math.max(i4, i) << 1)) {
                this.onCustomAction = new float[Math.max(i4, i) << 2];
            }
            if (setuuidandexomediadrmprovider.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer) != 0) {
                int i5 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
                int i6 = 0;
                while (i5 <= this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer + this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer) {
                    ?? IconCompatParcelizer3 = setuuidandexomediadrmprovider.IconCompatParcelizer(i5 == 0 ? 0 : i5 - 1);
                    ?? IconCompatParcelizer4 = setuuidandexomediadrmprovider.IconCompatParcelizer(i5);
                    if (IconCompatParcelizer3 != 0 && IconCompatParcelizer4 != 0) {
                        this.onCustomAction[i6] = IconCompatParcelizer3.MediaBrowserCompatCustomActionResultReceiver();
                        int i7 = i6 + 2;
                        this.onCustomAction[i6 + 1] = IconCompatParcelizer3.read() * f;
                        if (z) {
                            this.onCustomAction[i7] = IconCompatParcelizer4.MediaBrowserCompatCustomActionResultReceiver();
                            this.onCustomAction[i6 + 3] = IconCompatParcelizer3.read() * f;
                            this.onCustomAction[i6 + 4] = IconCompatParcelizer4.MediaBrowserCompatCustomActionResultReceiver();
                            i7 = i6 + 6;
                            this.onCustomAction[i6 + 5] = IconCompatParcelizer3.read() * f;
                        }
                        this.onCustomAction[i7] = IconCompatParcelizer4.MediaBrowserCompatCustomActionResultReceiver();
                        this.onCustomAction[i7 + 1] = IconCompatParcelizer4.read() * f;
                        i6 = i7 + 2;
                    }
                    i5++;
                }
                if (i6 > 0) {
                    drmsessionreleasedWrite.RemoteActionCompatParcelizer(this.onCustomAction);
                    int iMax = Math.max((this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer + 1) * i, i);
                    this.AudioAttributesImplBaseParcelizer.setColor(setuuidandexomediadrmprovider.RemoteActionCompatParcelizer());
                    canvas.drawLines(this.onCustomAction, 0, iMax << 1, this.AudioAttributesImplBaseParcelizer);
                }
            }
        }
        this.AudioAttributesImplBaseParcelizer.setPathEffect(null);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider, drmSessionReleased drmsessionreleased, createManager.read readVar) {
        int i;
        int i2;
        Path path = this.MediaMetadataCompat;
        int i3 = readVar.AudioAttributesCompatParcelizer;
        int i4 = readVar.IconCompatParcelizer + readVar.AudioAttributesCompatParcelizer;
        int i5 = 0;
        do {
            i = (i5 << 7) + i3;
            i2 = i + 128;
            if (i2 > i4) {
                i2 = i4;
            }
            if (i <= i2) {
                AudioAttributesCompatParcelizer(setuuidandexomediadrmprovider, i, i2, path);
                drmsessionreleased.IconCompatParcelizer(path);
                Drawable drawableOnSetShuffleMode = setuuidandexomediadrmprovider.onSetShuffleMode();
                if (drawableOnSetShuffleMode != null) {
                    write(canvas, path, drawableOnSetShuffleMode);
                } else {
                    IconCompatParcelizer(canvas, path, setuuidandexomediadrmprovider.onSetPlaybackSpeed(), setuuidandexomediadrmprovider.onSetCaptioningEnabled());
                }
            }
            i5++;
        } while (i <= i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    /* JADX WARN: Type inference failed for: r3v4 */
    private void AudioAttributesCompatParcelizer(setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider, int i, int i2, Path path) {
        float fIconCompatParcelizer = setuuidandexomediadrmprovider.onPrepareFromUri().IconCompatParcelizer();
        float f = this.MediaBrowserCompatItemReceiver.read();
        boolean z = setuuidandexomediadrmprovider.onRemoveQueueItemAt() == DefaultDrmSessionProvisioningManager.read.STEPPED;
        path.reset();
        ?? IconCompatParcelizer = setuuidandexomediadrmprovider.IconCompatParcelizer(i);
        path.moveTo(IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), fIconCompatParcelizer);
        path.lineTo(IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), IconCompatParcelizer.read() * f);
        int i3 = i + 1;
        ?? r3 = 0;
        ?? r2 = IconCompatParcelizer;
        while (i3 <= i2) {
            ?? IconCompatParcelizer2 = setuuidandexomediadrmprovider.IconCompatParcelizer(i3);
            if (z) {
                path.lineTo(IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver(), r2.read() * f);
            }
            path.lineTo(IconCompatParcelizer2.MediaBrowserCompatCustomActionResultReceiver(), IconCompatParcelizer2.read() * f);
            i3++;
            r2 = IconCompatParcelizer2;
            r3 = IconCompatParcelizer2;
        }
        if (r3 != 0) {
            path.lineTo(r3.MediaBrowserCompatCustomActionResultReceiver(), fIconCompatParcelizer);
        }
        path.close();
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void write(Canvas canvas) {
        int i;
        setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider;
        Entry entry;
        if (AudioAttributesCompatParcelizer(this.read)) {
            List<T> listIconCompatParcelizer = this.read.MediaSessionCompatToken().IconCompatParcelizer();
            for (int i2 = 0; i2 < listIconCompatParcelizer.size(); i2++) {
                setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider2 = (setUuidAndExoMediaDrmProvider) listIconCompatParcelizer.get(i2);
                if (IconCompatParcelizer((setPlayClearSamplesWithoutKeys) setuuidandexomediadrmprovider2) && setuuidandexomediadrmprovider2.onMediaButtonEvent() > 0) {
                    RemoteActionCompatParcelizer((setPlayClearSamplesWithoutKeys) setuuidandexomediadrmprovider2);
                    drmSessionReleased drmsessionreleasedWrite = this.read.write(setuuidandexomediadrmprovider2.IconCompatParcelizer());
                    int iOnRemoveQueueItem = (int) (setuuidandexomediadrmprovider2.onRemoveQueueItem() * 1.75f);
                    if (!setuuidandexomediadrmprovider2.onSetRating()) {
                        iOnRemoveQueueItem /= 2;
                    }
                    int i3 = iOnRemoveQueueItem;
                    this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.read, setuuidandexomediadrmprovider2);
                    float[] fArrAudioAttributesCompatParcelizer = drmsessionreleasedWrite.AudioAttributesCompatParcelizer(setuuidandexomediadrmprovider2, this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(), this.MediaBrowserCompatItemReceiver.read(), this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer);
                    DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = setuuidandexomediadrmprovider2.MediaBrowserCompatMediaItem();
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(setuuidandexomediadrmprovider2.MediaDescriptionCompat());
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer);
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write);
                    int i4 = 0;
                    while (i4 < fArrAudioAttributesCompatParcelizer.length) {
                        float f = fArrAudioAttributesCompatParcelizer[i4];
                        float f2 = fArrAudioAttributesCompatParcelizer[i4 + 1];
                        if (!this.MediaBrowserCompatSearchResultReceiver.write(f)) {
                            break;
                        }
                        if (this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(f) && this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(f2)) {
                            int i5 = i4 / 2;
                            Entry entryIconCompatParcelizer = setuuidandexomediadrmprovider2.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer + i5);
                            if (setuuidandexomediadrmprovider2.onAddQueueItem()) {
                                entry = entryIconCompatParcelizer;
                                i = i3;
                                setuuidandexomediadrmprovider = setuuidandexomediadrmprovider2;
                                RemoteActionCompatParcelizer(canvas, defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(entryIconCompatParcelizer), f, f2 - i3, setuuidandexomediadrmprovider2.write(i5));
                            } else {
                                entry = entryIconCompatParcelizer;
                                i = i3;
                                setuuidandexomediadrmprovider = setuuidandexomediadrmprovider2;
                            }
                            if (entry.AudioAttributesImplApi21Parcelizer() != null && setuuidandexomediadrmprovider.onCommand()) {
                                Drawable drawableAudioAttributesImplApi21Parcelizer = entry.AudioAttributesImplApi21Parcelizer();
                                drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer, (int) (f + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer), (int) (f2 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicHeight());
                            }
                        } else {
                            i = i3;
                            setuuidandexomediadrmprovider = setuuidandexomediadrmprovider2;
                        }
                        i4 += 2;
                        setuuidandexomediadrmprovider2 = setuuidandexomediadrmprovider;
                        i3 = i;
                    }
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, String str, float f, float f2, int i) {
        this.AudioAttributesImplApi21Parcelizer.setColor(i);
        canvas.drawText(str, f, f2, this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void read(Canvas canvas) {
        AudioAttributesCompatParcelizer(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    private void AudioAttributesCompatParcelizer(Canvas canvas) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        ?? IconCompatParcelizer;
        Bitmap bitmapRemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer.setStyle(Paint.Style.FILL);
        float f = this.MediaBrowserCompatItemReceiver.read();
        float[] fArr = this.MediaBrowserCompatMediaItem;
        byte b = 0;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        fArr[0] = 0.0f;
        char c = 1;
        fArr[1] = 0.0f;
        List<T> listIconCompatParcelizer = this.read.MediaSessionCompatToken().IconCompatParcelizer();
        int i = 0;
        while (i < listIconCompatParcelizer.size()) {
            setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider = (setUuidAndExoMediaDrmProvider) listIconCompatParcelizer.get(i);
            if (setuuidandexomediadrmprovider.handleMediaPlayPauseIfPendingOnHandler() && setuuidandexomediadrmprovider.onSetRating() && setuuidandexomediadrmprovider.onMediaButtonEvent() != 0) {
                this.write.setColor(setuuidandexomediadrmprovider.onPrepare());
                drmSessionReleased drmsessionreleasedWrite = this.read.write(setuuidandexomediadrmprovider.IconCompatParcelizer());
                this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.read, setuuidandexomediadrmprovider);
                float fOnRemoveQueueItem = setuuidandexomediadrmprovider.onRemoveQueueItem();
                float fOnPrepareFromMediaId = setuuidandexomediadrmprovider.onPrepareFromMediaId();
                boolean z = (!setuuidandexomediadrmprovider.onSetRepeatMode() || fOnPrepareFromMediaId >= fOnRemoveQueueItem || fOnPrepareFromMediaId <= f2) ? b : c;
                boolean z2 = (z == 0 || setuuidandexomediadrmprovider.onPrepare() != 1122867) ? b : c;
                if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.containsKey(setuuidandexomediadrmprovider)) {
                    audioAttributesCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.get(setuuidandexomediadrmprovider);
                } else {
                    AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = new AudioAttributesCompatParcelizer(this, b);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.put(setuuidandexomediadrmprovider, audioAttributesCompatParcelizer2);
                    audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                }
                if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(setuuidandexomediadrmprovider)) {
                    audioAttributesCompatParcelizer.IconCompatParcelizer(setuuidandexomediadrmprovider, z, z2);
                }
                int i2 = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
                int i3 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
                int i4 = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
                while (i4 <= i2 + i3 && (IconCompatParcelizer = setuuidandexomediadrmprovider.IconCompatParcelizer(i4)) != 0) {
                    this.MediaBrowserCompatMediaItem[b] = IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                    this.MediaBrowserCompatMediaItem[c] = IconCompatParcelizer.read() * f;
                    drmsessionreleasedWrite.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
                    if (this.MediaBrowserCompatSearchResultReceiver.write(this.MediaBrowserCompatMediaItem[b])) {
                        if (this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem[b]) && this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatMediaItem[c]) && (bitmapRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i4)) != null) {
                            float[] fArr2 = this.MediaBrowserCompatMediaItem;
                            canvas.drawBitmap(bitmapRemoteActionCompatParcelizer, fArr2[b] - fOnRemoveQueueItem, fArr2[c] - fOnRemoveQueueItem, (Paint) null);
                        }
                        i4++;
                        b = 0;
                        c = 1;
                    }
                }
            }
            i++;
            b = 0;
            f2 = BitmapDescriptorFactory.HUE_RED;
            c = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.github.mikephil.charting.data.Entry, o.playClearSamplesWithoutKeys] */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer(Canvas canvas, createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr) {
        DefaultDrmSessionExternalSyntheticLambda1 defaultDrmSessionExternalSyntheticLambda1MediaSessionCompatToken = this.read.MediaSessionCompatToken();
        for (createAndAcquireSessionWithRetry createandacquiresessionwithretry : createandacquiresessionwithretryArr) {
            setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider = (setUuidAndExoMediaDrmProvider) defaultDrmSessionExternalSyntheticLambda1MediaSessionCompatToken.RemoteActionCompatParcelizer(createandacquiresessionwithretry.RemoteActionCompatParcelizer());
            if (setuuidandexomediadrmprovider != null && setuuidandexomediadrmprovider.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                ?? r5 = setuuidandexomediadrmprovider.read(createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver(), createandacquiresessionwithretry.MediaBrowserCompatItemReceiver());
                if (RemoteActionCompatParcelizer((Entry) r5, setuuidandexomediadrmprovider)) {
                    drmKeysRemoved drmkeysremovedRemoteActionCompatParcelizer = this.read.write(setuuidandexomediadrmprovider.IconCompatParcelizer()).RemoteActionCompatParcelizer(r5.MediaBrowserCompatCustomActionResultReceiver(), r5.read() * this.MediaBrowserCompatItemReceiver.read());
                    createandacquiresessionwithretry.write((float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer, (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
                    read(canvas, (float) drmkeysremovedRemoteActionCompatParcelizer.IconCompatParcelizer, (float) drmkeysremovedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, setuuidandexomediadrmprovider);
                }
            }
        }
    }

    public final void read() {
        Canvas canvas = this.RemoteActionCompatParcelizer;
        if (canvas != null) {
            canvas.setBitmap(null);
            this.RemoteActionCompatParcelizer = null;
        }
        WeakReference<Bitmap> weakReference = this.RatingCompat;
        if (weakReference != null) {
            Bitmap bitmap = weakReference.get();
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.RatingCompat.clear();
            this.RatingCompat = null;
        }
    }

    class AudioAttributesCompatParcelizer {
        private Path AudioAttributesCompatParcelizer;
        private Bitmap[] write;

        private AudioAttributesCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = new Path();
        }

        /* synthetic */ AudioAttributesCompatParcelizer(setDrmHttpDataSourceFactory setdrmhttpdatasourcefactory, byte b) {
            this();
        }

        protected final boolean RemoteActionCompatParcelizer(setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider) {
            int iOnPlayFromUri = setuuidandexomediadrmprovider.onPlayFromUri();
            Bitmap[] bitmapArr = this.write;
            if (bitmapArr == null) {
                this.write = new Bitmap[iOnPlayFromUri];
                return true;
            }
            if (bitmapArr.length == iOnPlayFromUri) {
                return false;
            }
            this.write = new Bitmap[iOnPlayFromUri];
            return true;
        }

        protected final void IconCompatParcelizer(setUuidAndExoMediaDrmProvider setuuidandexomediadrmprovider, boolean z, boolean z2) {
            int iOnPlayFromUri = setuuidandexomediadrmprovider.onPlayFromUri();
            float fOnRemoveQueueItem = setuuidandexomediadrmprovider.onRemoveQueueItem();
            float fOnPrepareFromMediaId = setuuidandexomediadrmprovider.onPrepareFromMediaId();
            for (int i = 0; i < iOnPlayFromUri; i++) {
                int i2 = (int) (((double) fOnRemoveQueueItem) * 2.1d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                this.write[i] = bitmapCreateBitmap;
                setDrmHttpDataSourceFactory.this.AudioAttributesImplBaseParcelizer.setColor(setuuidandexomediadrmprovider.onPrepareFromSearch());
                if (z2) {
                    this.AudioAttributesCompatParcelizer.reset();
                    this.AudioAttributesCompatParcelizer.addCircle(fOnRemoveQueueItem, fOnRemoveQueueItem, fOnRemoveQueueItem, Path.Direction.CW);
                    this.AudioAttributesCompatParcelizer.addCircle(fOnRemoveQueueItem, fOnRemoveQueueItem, fOnPrepareFromMediaId, Path.Direction.CCW);
                    canvas.drawPath(this.AudioAttributesCompatParcelizer, setDrmHttpDataSourceFactory.this.AudioAttributesImplBaseParcelizer);
                } else {
                    canvas.drawCircle(fOnRemoveQueueItem, fOnRemoveQueueItem, fOnRemoveQueueItem, setDrmHttpDataSourceFactory.this.AudioAttributesImplBaseParcelizer);
                    if (z) {
                        canvas.drawCircle(fOnRemoveQueueItem, fOnRemoveQueueItem, fOnPrepareFromMediaId, setDrmHttpDataSourceFactory.this.write);
                    }
                }
            }
        }

        protected final Bitmap RemoteActionCompatParcelizer(int i) {
            Bitmap[] bitmapArr = this.write;
            return bitmapArr[i % bitmapArr.length];
        }
    }
}
