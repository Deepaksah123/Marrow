package kotlin;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1 extends createManager {
    protected RectF AudioAttributesCompatParcelizer;
    protected onKeysRequired[] IconCompatParcelizer;
    private RectF RatingCompat;
    protected releaseAllKeepaliveSessions RemoteActionCompatParcelizer;
    protected Paint read;
    protected Paint write;

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void read(Canvas canvas) {
    }

    public DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1(releaseAllKeepaliveSessions releaseallkeepalivesessions, onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.AudioAttributesCompatParcelizer = new RectF();
        this.RatingCompat = new RectF();
        this.RemoteActionCompatParcelizer = releaseallkeepalivesessions;
        this.AudioAttributesImplApi26Parcelizer = new Paint(1);
        this.AudioAttributesImplApi26Parcelizer.setStyle(Paint.Style.FILL);
        this.AudioAttributesImplApi26Parcelizer.setColor(Color.rgb(0, 0, 0));
        this.AudioAttributesImplApi26Parcelizer.setAlpha(120);
        Paint paint = new Paint(1);
        this.write = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.read = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public void RemoteActionCompatParcelizer() {
        getCryptoConfig getcryptoconfigWrite = this.RemoteActionCompatParcelizer.write();
        this.IconCompatParcelizer = new onKeysRequired[getcryptoconfigWrite.read()];
        for (int i = 0; i < this.IconCompatParcelizer.length; i++) {
            setLoadErrorHandlingPolicy setloaderrorhandlingpolicy = (setLoadErrorHandlingPolicy) getcryptoconfigWrite.RemoteActionCompatParcelizer(i);
            this.IconCompatParcelizer[i] = new onKeysRequired((setloaderrorhandlingpolicy.onMediaButtonEvent() << 2) * (setloaderrorhandlingpolicy.onRemoveQueueItemAt() ? setloaderrorhandlingpolicy.onRewind() : 1), getcryptoconfigWrite.read(), setloaderrorhandlingpolicy.onRemoveQueueItemAt());
        }
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void IconCompatParcelizer(Canvas canvas) {
        getCryptoConfig getcryptoconfigWrite = this.RemoteActionCompatParcelizer.write();
        for (int i = 0; i < getcryptoconfigWrite.read(); i++) {
            setLoadErrorHandlingPolicy setloaderrorhandlingpolicy = (setLoadErrorHandlingPolicy) getcryptoconfigWrite.RemoteActionCompatParcelizer(i);
            if (setloaderrorhandlingpolicy.handleMediaPlayPauseIfPendingOnHandler()) {
                read(canvas, setloaderrorhandlingpolicy, i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void read(Canvas canvas, setLoadErrorHandlingPolicy setloaderrorhandlingpolicy, int i) {
        drmSessionReleased drmsessionreleasedWrite = this.RemoteActionCompatParcelizer.write(setloaderrorhandlingpolicy.IconCompatParcelizer());
        this.read.setColor(setloaderrorhandlingpolicy.onPrepareFromSearch());
        this.read.setStrokeWidth(drmSessionAcquired.write(setloaderrorhandlingpolicy.onPrepare()));
        boolean z = setloaderrorhandlingpolicy.onPrepare() > BitmapDescriptorFactory.HUE_RED;
        float fIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        float f = this.MediaBrowserCompatItemReceiver.read();
        if (this.RemoteActionCompatParcelizer.K_()) {
            this.write.setColor(setloaderrorhandlingpolicy.onPrepareFromMediaId());
            float fAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.write().AudioAttributesCompatParcelizer() / 2.0f;
            int iMin = Math.min((int) Math.ceil(setloaderrorhandlingpolicy.onMediaButtonEvent() * fIconCompatParcelizer), setloaderrorhandlingpolicy.onMediaButtonEvent());
            for (int i2 = 0; i2 < iMin; i2++) {
                float fMediaBrowserCompatCustomActionResultReceiver = ((BarEntry) setloaderrorhandlingpolicy.IconCompatParcelizer(i2)).MediaBrowserCompatCustomActionResultReceiver();
                this.RatingCompat.left = fMediaBrowserCompatCustomActionResultReceiver - fAudioAttributesCompatParcelizer;
                this.RatingCompat.right = fMediaBrowserCompatCustomActionResultReceiver + fAudioAttributesCompatParcelizer;
                drmsessionreleasedWrite.AudioAttributesCompatParcelizer(this.RatingCompat);
                if (this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.RatingCompat.right)) {
                    if (!this.MediaBrowserCompatSearchResultReceiver.write(this.RatingCompat.left)) {
                        break;
                    }
                    this.RatingCompat.top = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi21Parcelizer();
                    this.RatingCompat.bottom = this.MediaBrowserCompatSearchResultReceiver.read();
                    canvas.drawRect(this.RatingCompat, this.write);
                }
            }
        }
        onKeysRequired onkeysrequired = this.IconCompatParcelizer[i];
        onkeysrequired.write(fIconCompatParcelizer, f);
        onkeysrequired.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.read(setloaderrorhandlingpolicy.IconCompatParcelizer()));
        onkeysrequired.read(this.RemoteActionCompatParcelizer.write().AudioAttributesCompatParcelizer());
        onkeysrequired.IconCompatParcelizer(setloaderrorhandlingpolicy);
        drmsessionreleasedWrite.RemoteActionCompatParcelizer(onkeysrequired.read);
        boolean z2 = setloaderrorhandlingpolicy.write().size() == 1;
        if (z2) {
            this.AudioAttributesImplBaseParcelizer.setColor(setloaderrorhandlingpolicy.RemoteActionCompatParcelizer());
        }
        for (int i3 = 0; i3 < onkeysrequired.read(); i3 += 4) {
            int i4 = i3 + 2;
            if (this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(onkeysrequired.read[i4])) {
                if (!this.MediaBrowserCompatSearchResultReceiver.write(onkeysrequired.read[i3])) {
                    return;
                }
                if (!z2) {
                    this.AudioAttributesImplBaseParcelizer.setColor(setloaderrorhandlingpolicy.AudioAttributesCompatParcelizer(i3 / 4));
                }
                if (setloaderrorhandlingpolicy.AudioAttributesImplBaseParcelizer() != null) {
                    DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0 defaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0AudioAttributesImplBaseParcelizer = setloaderrorhandlingpolicy.AudioAttributesImplBaseParcelizer();
                    this.AudioAttributesImplBaseParcelizer.setShader(new LinearGradient(onkeysrequired.read[i3], onkeysrequired.read[i3 + 3], onkeysrequired.read[i3], onkeysrequired.read[i3 + 1], defaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(), defaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda0AudioAttributesImplBaseParcelizer.IconCompatParcelizer(), Shader.TileMode.MIRROR));
                }
                if (setloaderrorhandlingpolicy.MediaMetadataCompat() != null) {
                    int i5 = i3 / 4;
                    this.AudioAttributesImplBaseParcelizer.setShader(new LinearGradient(onkeysrequired.read[i3], onkeysrequired.read[i3 + 3], onkeysrequired.read[i3], onkeysrequired.read[i3 + 1], setloaderrorhandlingpolicy.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(), setloaderrorhandlingpolicy.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(), Shader.TileMode.MIRROR));
                }
                int i6 = i3 + 1;
                int i7 = i3 + 3;
                canvas.drawRect(onkeysrequired.read[i3], onkeysrequired.read[i6], onkeysrequired.read[i4], onkeysrequired.read[i7], this.AudioAttributesImplBaseParcelizer);
                if (z) {
                    canvas.drawRect(onkeysrequired.read[i3], onkeysrequired.read[i6], onkeysrequired.read[i4], onkeysrequired.read[i7], this.read);
                }
            }
        }
    }

    protected void IconCompatParcelizer(float f, float f2, float f3, float f4, drmSessionReleased drmsessionreleased) {
        this.AudioAttributesCompatParcelizer.set(f - f4, f2, f + f4, f3);
        drmsessionreleased.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.read());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public void write(Canvas canvas) {
        List list;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
        int i;
        float f;
        boolean z;
        float[] fArr;
        drmSessionReleased drmsessionreleased;
        float[] fArr2;
        int i2;
        float f2;
        float f3;
        float f4;
        float f5;
        BarEntry barEntry;
        float f6;
        boolean z2;
        int i3;
        DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandler;
        List list2;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2;
        BarEntry barEntry2;
        float f7;
        if (AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)) {
            List listIconCompatParcelizer = this.RemoteActionCompatParcelizer.write().IconCompatParcelizer();
            float fWrite = drmSessionAcquired.write(4.5f);
            boolean zAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            int i4 = 0;
            while (i4 < this.RemoteActionCompatParcelizer.write().read()) {
                setLoadErrorHandlingPolicy setloaderrorhandlingpolicy = (setLoadErrorHandlingPolicy) listIconCompatParcelizer.get(i4);
                if (IconCompatParcelizer(setloaderrorhandlingpolicy)) {
                    RemoteActionCompatParcelizer(setloaderrorhandlingpolicy);
                    boolean z3 = this.RemoteActionCompatParcelizer.read(setloaderrorhandlingpolicy.IconCompatParcelizer());
                    float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, "8");
                    float f8 = zAudioAttributesCompatParcelizer ? -fWrite : fAudioAttributesCompatParcelizer + fWrite;
                    float f9 = zAudioAttributesCompatParcelizer ? fAudioAttributesCompatParcelizer + fWrite : -fWrite;
                    if (z3) {
                        f8 = (-f8) - fAudioAttributesCompatParcelizer;
                        f9 = (-f9) - fAudioAttributesCompatParcelizer;
                    }
                    float f10 = f8;
                    float f11 = f9;
                    onKeysRequired onkeysrequired = this.IconCompatParcelizer[i4];
                    float f12 = this.MediaBrowserCompatItemReceiver.read();
                    DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = setloaderrorhandlingpolicy.MediaBrowserCompatMediaItem();
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(setloaderrorhandlingpolicy.MediaDescriptionCompat());
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.IconCompatParcelizer = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.IconCompatParcelizer);
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write);
                    if (setloaderrorhandlingpolicy.onRemoveQueueItemAt()) {
                        list = listIconCompatParcelizer;
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                        drmSessionReleased drmsessionreleasedWrite = this.RemoteActionCompatParcelizer.write(setloaderrorhandlingpolicy.IconCompatParcelizer());
                        int i5 = 0;
                        int length = 0;
                        while (i5 < setloaderrorhandlingpolicy.onMediaButtonEvent() * this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
                            BarEntry barEntry3 = (BarEntry) setloaderrorhandlingpolicy.IconCompatParcelizer(i5);
                            float[] fArrAudioAttributesCompatParcelizer = barEntry3.AudioAttributesCompatParcelizer();
                            float f13 = (onkeysrequired.read[length] + onkeysrequired.read[length + 2]) / 2.0f;
                            int iWrite = setloaderrorhandlingpolicy.write(i5);
                            if (fArrAudioAttributesCompatParcelizer == null) {
                                if (!this.MediaBrowserCompatSearchResultReceiver.write(f13)) {
                                    break;
                                }
                                int i6 = length + 1;
                                if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(onkeysrequired.read[i6]) && this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(f13)) {
                                    if (setloaderrorhandlingpolicy.onAddQueueItem()) {
                                        f5 = f13;
                                        f = fWrite;
                                        fArr = fArrAudioAttributesCompatParcelizer;
                                        barEntry = barEntry3;
                                        i = i5;
                                        z = zAudioAttributesCompatParcelizer;
                                        drmsessionreleased = drmsessionreleasedWrite;
                                        RemoteActionCompatParcelizer(canvas, defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.read(barEntry3), f5, onkeysrequired.read[i6] + (barEntry3.read() >= BitmapDescriptorFactory.HUE_RED ? f10 : f11), iWrite);
                                    } else {
                                        f5 = f13;
                                        i = i5;
                                        f = fWrite;
                                        z = zAudioAttributesCompatParcelizer;
                                        fArr = fArrAudioAttributesCompatParcelizer;
                                        barEntry = barEntry3;
                                        drmsessionreleased = drmsessionreleasedWrite;
                                    }
                                    if (barEntry.AudioAttributesImplApi21Parcelizer() != null && setloaderrorhandlingpolicy.onCommand()) {
                                        Drawable drawableAudioAttributesImplApi21Parcelizer = barEntry.AudioAttributesImplApi21Parcelizer();
                                        drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer, (int) (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer + f5), (int) (onkeysrequired.read[i6] + (barEntry.read() >= BitmapDescriptorFactory.HUE_RED ? f10 : f11) + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicHeight());
                                    }
                                } else {
                                    f = fWrite;
                                    z = zAudioAttributesCompatParcelizer;
                                    drmsessionreleased = drmsessionreleasedWrite;
                                    i5 = i5;
                                    drmsessionreleasedWrite = drmsessionreleased;
                                    zAudioAttributesCompatParcelizer = z;
                                    fWrite = f;
                                }
                            } else {
                                i = i5;
                                f = fWrite;
                                z = zAudioAttributesCompatParcelizer;
                                fArr = fArrAudioAttributesCompatParcelizer;
                                drmsessionreleased = drmsessionreleasedWrite;
                                float f14 = f13;
                                int length2 = fArr.length << 1;
                                float[] fArr3 = new float[length2];
                                float f15 = -barEntry3.RemoteActionCompatParcelizer();
                                float f16 = 0.0f;
                                int i7 = 0;
                                int i8 = 0;
                                while (i7 < length2) {
                                    float f17 = fArr[i8];
                                    if (f17 == BitmapDescriptorFactory.HUE_RED && (f16 == BitmapDescriptorFactory.HUE_RED || f15 == BitmapDescriptorFactory.HUE_RED)) {
                                        float f18 = f15;
                                        f15 = f17;
                                        f4 = f18;
                                    } else if (f17 >= BitmapDescriptorFactory.HUE_RED) {
                                        f16 += f17;
                                        f4 = f15;
                                        f15 = f16;
                                    } else {
                                        f4 = f15 - f17;
                                    }
                                    fArr3[i7 + 1] = f15 * f12;
                                    i7 += 2;
                                    i8++;
                                    f15 = f4;
                                }
                                drmsessionreleased.RemoteActionCompatParcelizer(fArr3);
                                int i9 = 0;
                                while (i9 < length2) {
                                    float f19 = fArr[i9 / 2];
                                    float f20 = fArr3[i9 + 1] + (((f19 > BitmapDescriptorFactory.HUE_RED ? 1 : (f19 == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) == 0 && (f15 > BitmapDescriptorFactory.HUE_RED ? 1 : (f15 == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) == 0 && (f16 > BitmapDescriptorFactory.HUE_RED ? 1 : (f16 == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) > 0) || (f19 > BitmapDescriptorFactory.HUE_RED ? 1 : (f19 == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) < 0 ? f11 : f10);
                                    int i10 = i9;
                                    if (!this.MediaBrowserCompatSearchResultReceiver.write(f14)) {
                                        break;
                                    }
                                    if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(f20) && this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(f14)) {
                                        if (setloaderrorhandlingpolicy.onAddQueueItem()) {
                                            f3 = f20;
                                            fArr2 = fArr3;
                                            i2 = length2;
                                            f2 = f14;
                                            RemoteActionCompatParcelizer(canvas, defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(f19), f14, f3, iWrite);
                                        } else {
                                            f3 = f20;
                                            fArr2 = fArr3;
                                            i2 = length2;
                                            f2 = f14;
                                        }
                                        if (barEntry3.AudioAttributesImplApi21Parcelizer() != null && setloaderrorhandlingpolicy.onCommand()) {
                                            Drawable drawableAudioAttributesImplApi21Parcelizer2 = barEntry3.AudioAttributesImplApi21Parcelizer();
                                            drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer2, (int) (f2 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer), (int) (lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write + f3), drawableAudioAttributesImplApi21Parcelizer2.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer2.getIntrinsicHeight());
                                        }
                                    } else {
                                        fArr2 = fArr3;
                                        i2 = length2;
                                        f2 = f14;
                                    }
                                    i9 = i10 + 2;
                                    fArr3 = fArr2;
                                    length2 = i2;
                                    f14 = f2;
                                }
                            }
                            length = fArr == null ? length + 4 : length + (fArr.length << 2);
                            i5 = i + 1;
                            drmsessionreleasedWrite = drmsessionreleased;
                            zAudioAttributesCompatParcelizer = z;
                            fWrite = f;
                        }
                    } else {
                        int i11 = 0;
                        while (i11 < onkeysrequired.read.length * this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
                            float f21 = (onkeysrequired.read[i11] + onkeysrequired.read[i11 + 2]) / 2.0f;
                            if (!this.MediaBrowserCompatSearchResultReceiver.write(f21)) {
                                break;
                            }
                            int i12 = i11 + 1;
                            if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(onkeysrequired.read[i12]) && this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(f21)) {
                                int i13 = i11 / 4;
                                BarEntry barEntry4 = (BarEntry) setloaderrorhandlingpolicy.IconCompatParcelizer(i13);
                                float f22 = barEntry4.read();
                                if (setloaderrorhandlingpolicy.onAddQueueItem()) {
                                    String str = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.read(barEntry4);
                                    float[] fArr4 = onkeysrequired.read;
                                    barEntry2 = barEntry4;
                                    f7 = f21;
                                    i3 = i11;
                                    list2 = listIconCompatParcelizer;
                                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                                    float f23 = f22 >= BitmapDescriptorFactory.HUE_RED ? fArr4[i12] + f10 : fArr4[i11 + 3] + f11;
                                    defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                                    RemoteActionCompatParcelizer(canvas, str, f7, f23, setloaderrorhandlingpolicy.write(i13));
                                } else {
                                    barEntry2 = barEntry4;
                                    f7 = f21;
                                    i3 = i11;
                                    defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                                    list2 = listIconCompatParcelizer;
                                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                                }
                                if (barEntry2.AudioAttributesImplApi21Parcelizer() != null && setloaderrorhandlingpolicy.onCommand()) {
                                    Drawable drawableAudioAttributesImplApi21Parcelizer3 = barEntry2.AudioAttributesImplApi21Parcelizer();
                                    drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer3, (int) (f7 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.IconCompatParcelizer), (int) ((f22 >= BitmapDescriptorFactory.HUE_RED ? onkeysrequired.read[i12] + f10 : onkeysrequired.read[i3 + 3] + f11) + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.write), drawableAudioAttributesImplApi21Parcelizer3.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer3.getIntrinsicHeight());
                                }
                            } else {
                                i3 = i11;
                                defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                                list2 = listIconCompatParcelizer;
                                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                            }
                            i11 = i3 + 4;
                            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2;
                            defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = defaultDrmSessionResponseHandler;
                            listIconCompatParcelizer = list2;
                        }
                        list = listIconCompatParcelizer;
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                    }
                    f6 = fWrite;
                    z2 = zAudioAttributesCompatParcelizer;
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
                } else {
                    list = listIconCompatParcelizer;
                    f6 = fWrite;
                    z2 = zAudioAttributesCompatParcelizer;
                }
                i4++;
                zAudioAttributesCompatParcelizer = z2;
                listIconCompatParcelizer = list;
                fWrite = f6;
            }
        }
    }

    public void RemoteActionCompatParcelizer(Canvas canvas, String str, float f, float f2, int i) {
        this.AudioAttributesImplApi21Parcelizer.setColor(i);
        canvas.drawText(str, f, f2, this.AudioAttributesImplApi21Parcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer(Canvas canvas, createAndAcquireSessionWithRetry[] createandacquiresessionwithretryArr) {
        getCryptoConfig getcryptoconfigWrite = this.RemoteActionCompatParcelizer.write();
        for (createAndAcquireSessionWithRetry createandacquiresessionwithretry : createandacquiresessionwithretryArr) {
            setLoadErrorHandlingPolicy setloaderrorhandlingpolicy = (setLoadErrorHandlingPolicy) getcryptoconfigWrite.RemoteActionCompatParcelizer(createandacquiresessionwithretry.RemoteActionCompatParcelizer());
            if (setloaderrorhandlingpolicy != null && setloaderrorhandlingpolicy.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
                Entry entry = (BarEntry) setloaderrorhandlingpolicy.read(createandacquiresessionwithretry.MediaBrowserCompatCustomActionResultReceiver(), createandacquiresessionwithretry.MediaBrowserCompatItemReceiver());
                if (RemoteActionCompatParcelizer(entry, setloaderrorhandlingpolicy)) {
                    drmSessionReleased drmsessionreleasedWrite = this.RemoteActionCompatParcelizer.write(setloaderrorhandlingpolicy.IconCompatParcelizer());
                    this.AudioAttributesImplApi26Parcelizer.setColor(setloaderrorhandlingpolicy.AudioAttributesCompatParcelizer());
                    this.AudioAttributesImplApi26Parcelizer.setAlpha(setloaderrorhandlingpolicy.onPlayFromUri());
                    createandacquiresessionwithretry.AudioAttributesImplApi26Parcelizer();
                    IconCompatParcelizer(entry.MediaBrowserCompatCustomActionResultReceiver(), entry.read(), BitmapDescriptorFactory.HUE_RED, getcryptoconfigWrite.AudioAttributesCompatParcelizer() / 2.0f, drmsessionreleasedWrite);
                    AudioAttributesCompatParcelizer(createandacquiresessionwithretry, this.AudioAttributesCompatParcelizer);
                    canvas.drawRect(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
                }
            }
        }
    }

    protected void AudioAttributesCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry, RectF rectF) {
        createandacquiresessionwithretry.write(rectF.centerX(), rectF.top);
    }
}
