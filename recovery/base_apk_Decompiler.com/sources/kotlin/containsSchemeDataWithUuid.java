package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.BarEntry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class containsSchemeDataWithUuid extends DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1 {
    private RectF MediaMetadataCompat;

    public containsSchemeDataWithUuid(releaseAllKeepaliveSessions releaseallkeepalivesessions, onKeyResponse onkeyresponse, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        super(releaseallkeepalivesessions, onkeyresponse, lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
        this.MediaMetadataCompat = new RectF();
        this.AudioAttributesImplApi21Parcelizer.setTextAlign(Paint.Align.LEFT);
    }

    @Override // kotlin.DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1, kotlin.lambdaonReferenceCountDecremented0
    public final void RemoteActionCompatParcelizer() {
        getCryptoConfig getcryptoconfigWrite = this.RemoteActionCompatParcelizer.write();
        this.IconCompatParcelizer = new onProvisionResponse[getcryptoconfigWrite.read()];
        for (int i = 0; i < this.IconCompatParcelizer.length; i++) {
            setLoadErrorHandlingPolicy setloaderrorhandlingpolicy = (setLoadErrorHandlingPolicy) getcryptoconfigWrite.RemoteActionCompatParcelizer(i);
            this.IconCompatParcelizer[i] = new onProvisionResponse((setloaderrorhandlingpolicy.onMediaButtonEvent() << 2) * (setloaderrorhandlingpolicy.onRemoveQueueItemAt() ? setloaderrorhandlingpolicy.onRewind() : 1), getcryptoconfigWrite.read(), setloaderrorhandlingpolicy.onRemoveQueueItemAt());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1
    protected final void read(Canvas canvas, setLoadErrorHandlingPolicy setloaderrorhandlingpolicy, int i) {
        drmSessionReleased drmsessionreleasedWrite = this.RemoteActionCompatParcelizer.write(setloaderrorhandlingpolicy.IconCompatParcelizer());
        this.read.setColor(setloaderrorhandlingpolicy.onPrepareFromSearch());
        this.read.setStrokeWidth(drmSessionAcquired.write(setloaderrorhandlingpolicy.onPrepare()));
        boolean z = setloaderrorhandlingpolicy.onPrepare() > BitmapDescriptorFactory.HUE_RED;
        float fIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        float f = this.MediaBrowserCompatItemReceiver.read();
        if (this.RemoteActionCompatParcelizer.K_()) {
            ((DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1) this).write.setColor(setloaderrorhandlingpolicy.onPrepareFromMediaId());
            float fAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.write().AudioAttributesCompatParcelizer() / 2.0f;
            int iMin = Math.min((int) Math.ceil(setloaderrorhandlingpolicy.onMediaButtonEvent() * fIconCompatParcelizer), setloaderrorhandlingpolicy.onMediaButtonEvent());
            for (int i2 = 0; i2 < iMin; i2++) {
                float fMediaBrowserCompatCustomActionResultReceiver = ((BarEntry) setloaderrorhandlingpolicy.IconCompatParcelizer(i2)).MediaBrowserCompatCustomActionResultReceiver();
                this.MediaMetadataCompat.top = fMediaBrowserCompatCustomActionResultReceiver - fAudioAttributesCompatParcelizer;
                this.MediaMetadataCompat.bottom = fMediaBrowserCompatCustomActionResultReceiver + fAudioAttributesCompatParcelizer;
                drmsessionreleasedWrite.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
                if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(this.MediaMetadataCompat.bottom)) {
                    if (!this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.MediaMetadataCompat.top)) {
                        break;
                    }
                    this.MediaMetadataCompat.left = this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer();
                    this.MediaMetadataCompat.right = this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
                    canvas.drawRect(this.MediaMetadataCompat, ((DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1) this).write);
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
            int i4 = i3 + 3;
            if (!this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(onkeysrequired.read[i4])) {
                return;
            }
            int i5 = i3 + 1;
            if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(onkeysrequired.read[i5])) {
                if (!z2) {
                    this.AudioAttributesImplBaseParcelizer.setColor(setloaderrorhandlingpolicy.AudioAttributesCompatParcelizer(i3 / 4));
                }
                int i6 = i3 + 2;
                canvas.drawRect(onkeysrequired.read[i3], onkeysrequired.read[i5], onkeysrequired.read[i6], onkeysrequired.read[i4], this.AudioAttributesImplBaseParcelizer);
                if (z) {
                    canvas.drawRect(onkeysrequired.read[i3], onkeysrequired.read[i5], onkeysrequired.read[i6], onkeysrequired.read[i4], this.read);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1, kotlin.lambdaonReferenceCountDecremented0
    public final void write(Canvas canvas) {
        List list;
        int i;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
        int i2;
        float[] fArr;
        boolean z;
        int i3;
        float[] fArr2;
        float f;
        float f2;
        BarEntry barEntry;
        boolean z2;
        int i4;
        List list2;
        float f3;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2;
        DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandler;
        int i5;
        onKeysRequired onkeysrequired;
        if (AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)) {
            List listIconCompatParcelizer = this.RemoteActionCompatParcelizer.write().IconCompatParcelizer();
            float fWrite = drmSessionAcquired.write(5.0f);
            boolean zAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            int i6 = 0;
            while (i6 < this.RemoteActionCompatParcelizer.write().read()) {
                setLoadErrorHandlingPolicy setloaderrorhandlingpolicy = (setLoadErrorHandlingPolicy) listIconCompatParcelizer.get(i6);
                if (IconCompatParcelizer(setloaderrorhandlingpolicy)) {
                    boolean z3 = this.RemoteActionCompatParcelizer.read(setloaderrorhandlingpolicy.IconCompatParcelizer());
                    RemoteActionCompatParcelizer(setloaderrorhandlingpolicy);
                    float f4 = 2.0f;
                    float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, "10") / 2.0f;
                    DefaultDrmSessionResponseHandler defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = setloaderrorhandlingpolicy.MediaBrowserCompatMediaItem();
                    onKeysRequired onkeysrequired2 = this.IconCompatParcelizer[i6];
                    float f5 = this.MediaBrowserCompatItemReceiver.read();
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(setloaderrorhandlingpolicy.MediaDescriptionCompat());
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.IconCompatParcelizer = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.IconCompatParcelizer);
                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write = drmSessionAcquired.write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3.write);
                    if (setloaderrorhandlingpolicy.onRemoveQueueItemAt()) {
                        list = listIconCompatParcelizer;
                        i = i6;
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                        drmSessionReleased drmsessionreleasedWrite = this.RemoteActionCompatParcelizer.write(setloaderrorhandlingpolicy.IconCompatParcelizer());
                        int i7 = 0;
                        int length = 0;
                        while (i7 < setloaderrorhandlingpolicy.onMediaButtonEvent() * this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
                            BarEntry barEntry2 = (BarEntry) setloaderrorhandlingpolicy.IconCompatParcelizer(i7);
                            int iWrite = setloaderrorhandlingpolicy.write(i7);
                            float[] fArrAudioAttributesCompatParcelizer = barEntry2.AudioAttributesCompatParcelizer();
                            if (fArrAudioAttributesCompatParcelizer == null) {
                                int i8 = length + 1;
                                if (!this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(onkeysrequired2.read[i8])) {
                                    break;
                                }
                                if (this.MediaBrowserCompatSearchResultReceiver.read(onkeysrequired2.read[length]) && this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(onkeysrequired2.read[i8])) {
                                    String str = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.read(barEntry2);
                                    float f6 = drmSessionAcquired.read(this.AudioAttributesImplApi21Parcelizer, str);
                                    float f7 = zAudioAttributesCompatParcelizer ? fWrite : -(f6 + fWrite);
                                    float f8 = zAudioAttributesCompatParcelizer ? -(f6 + fWrite) : fWrite;
                                    if (z3) {
                                        f7 = (-f7) - f6;
                                        f8 = (-f8) - f6;
                                    }
                                    float f9 = f7;
                                    float f10 = f8;
                                    if (setloaderrorhandlingpolicy.onAddQueueItem()) {
                                        i2 = i7;
                                        fArr = fArrAudioAttributesCompatParcelizer;
                                        barEntry = barEntry2;
                                        RemoteActionCompatParcelizer(canvas, str, onkeysrequired2.read[length + 2] + (barEntry2.read() >= BitmapDescriptorFactory.HUE_RED ? f9 : f10), onkeysrequired2.read[i8] + fAudioAttributesCompatParcelizer, iWrite);
                                    } else {
                                        barEntry = barEntry2;
                                        i2 = i7;
                                        fArr = fArrAudioAttributesCompatParcelizer;
                                    }
                                    if (barEntry.AudioAttributesImplApi21Parcelizer() != null && setloaderrorhandlingpolicy.onCommand()) {
                                        Drawable drawableAudioAttributesImplApi21Parcelizer = barEntry.AudioAttributesImplApi21Parcelizer();
                                        float f11 = onkeysrequired2.read[length + 2];
                                        if (barEntry.read() < BitmapDescriptorFactory.HUE_RED) {
                                            f9 = f10;
                                        }
                                        drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer, (int) (f11 + f9 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer), (int) (onkeysrequired2.read[i8] + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer.getIntrinsicHeight());
                                    }
                                } else {
                                    i7 = i7;
                                }
                            } else {
                                i2 = i7;
                                fArr = fArrAudioAttributesCompatParcelizer;
                                int length2 = fArr.length << 1;
                                float[] fArr3 = new float[length2];
                                float f12 = -barEntry2.RemoteActionCompatParcelizer();
                                float f13 = 0.0f;
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < length2) {
                                    float f14 = fArr[i10];
                                    if (f14 == BitmapDescriptorFactory.HUE_RED && (f13 == BitmapDescriptorFactory.HUE_RED || f12 == BitmapDescriptorFactory.HUE_RED)) {
                                        float f15 = f12;
                                        f12 = f14;
                                        f2 = f15;
                                    } else if (f14 >= BitmapDescriptorFactory.HUE_RED) {
                                        f13 += f14;
                                        f2 = f12;
                                        f12 = f13;
                                    } else {
                                        f2 = f12 - f14;
                                    }
                                    fArr3[i9] = f12 * f5;
                                    i9 += 2;
                                    i10++;
                                    f12 = f2;
                                }
                                drmsessionreleasedWrite.RemoteActionCompatParcelizer(fArr3);
                                int i11 = 0;
                                while (i11 < length2) {
                                    float f16 = fArr[i11 / 2];
                                    String strAudioAttributesCompatParcelizer = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(f16);
                                    float f17 = drmSessionAcquired.read(this.AudioAttributesImplApi21Parcelizer, strAudioAttributesCompatParcelizer);
                                    int i12 = length2;
                                    float f18 = zAudioAttributesCompatParcelizer ? fWrite : -(f17 + fWrite);
                                    z = zAudioAttributesCompatParcelizer;
                                    float f19 = zAudioAttributesCompatParcelizer ? -(f17 + fWrite) : fWrite;
                                    if (z3) {
                                        f18 = (-f18) - f17;
                                        f19 = (-f19) - f17;
                                    }
                                    boolean z4 = (f16 == BitmapDescriptorFactory.HUE_RED && f12 == BitmapDescriptorFactory.HUE_RED && f13 > BitmapDescriptorFactory.HUE_RED) || f16 < BitmapDescriptorFactory.HUE_RED;
                                    float f20 = fArr3[i11];
                                    if (z4) {
                                        f18 = f19;
                                    }
                                    float f21 = f20 + f18;
                                    float f22 = (onkeysrequired2.read[length + 1] + onkeysrequired2.read[length + 3]) / 2.0f;
                                    if (!this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(f22)) {
                                        break;
                                    }
                                    if (this.MediaBrowserCompatSearchResultReceiver.read(f21) && this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(f22)) {
                                        if (setloaderrorhandlingpolicy.onAddQueueItem()) {
                                            i3 = i11;
                                            fArr2 = fArr3;
                                            f = f22;
                                            RemoteActionCompatParcelizer(canvas, strAudioAttributesCompatParcelizer, f21, f22 + fAudioAttributesCompatParcelizer, iWrite);
                                        } else {
                                            i3 = i11;
                                            fArr2 = fArr3;
                                            f = f22;
                                        }
                                        if (barEntry2.AudioAttributesImplApi21Parcelizer() != null && setloaderrorhandlingpolicy.onCommand()) {
                                            Drawable drawableAudioAttributesImplApi21Parcelizer2 = barEntry2.AudioAttributesImplApi21Parcelizer();
                                            drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer2, (int) (f21 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer), (int) (f + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write), drawableAudioAttributesImplApi21Parcelizer2.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer2.getIntrinsicHeight());
                                        }
                                    } else {
                                        i3 = i11;
                                        fArr2 = fArr3;
                                    }
                                    i11 = i3 + 2;
                                    length2 = i12;
                                    zAudioAttributesCompatParcelizer = z;
                                    fArr3 = fArr2;
                                }
                            }
                            z = zAudioAttributesCompatParcelizer;
                            length = fArr == null ? length + 4 : length + (fArr.length << 2);
                            i7 = i2 + 1;
                            zAudioAttributesCompatParcelizer = z;
                        }
                    } else {
                        int i13 = 0;
                        while (i13 < onkeysrequired2.read.length * this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
                            int i14 = i13 + 1;
                            float f23 = (onkeysrequired2.read[i14] + onkeysrequired2.read[i13 + 3]) / f4;
                            if (!this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(onkeysrequired2.read[i14])) {
                                break;
                            }
                            if (this.MediaBrowserCompatSearchResultReceiver.read(onkeysrequired2.read[i13]) && this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(onkeysrequired2.read[i14])) {
                                BarEntry barEntry3 = (BarEntry) setloaderrorhandlingpolicy.IconCompatParcelizer(i13 / 4);
                                float f24 = barEntry3.read();
                                String str2 = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem.read(barEntry3);
                                float f25 = drmSessionAcquired.read(this.AudioAttributesImplApi21Parcelizer, str2);
                                float f26 = zAudioAttributesCompatParcelizer ? fWrite : -(f25 + fWrite);
                                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                                float f27 = zAudioAttributesCompatParcelizer ? -(f25 + fWrite) : fWrite;
                                if (z3) {
                                    f26 = (-f26) - f25;
                                    f27 = (-f27) - f25;
                                }
                                float f28 = f26;
                                float f29 = f27;
                                if (setloaderrorhandlingpolicy.onAddQueueItem()) {
                                    float f30 = f23 + fAudioAttributesCompatParcelizer;
                                    i4 = i13;
                                    list2 = listIconCompatParcelizer;
                                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4;
                                    i5 = i6;
                                    onkeysrequired = onkeysrequired2;
                                    f3 = fAudioAttributesCompatParcelizer;
                                    defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                                    RemoteActionCompatParcelizer(canvas, str2, onkeysrequired2.read[i13 + 2] + (f24 >= BitmapDescriptorFactory.HUE_RED ? f28 : f29), f30, setloaderrorhandlingpolicy.write(i13 / 2));
                                } else {
                                    i4 = i13;
                                    list2 = listIconCompatParcelizer;
                                    f3 = fAudioAttributesCompatParcelizer;
                                    lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher4;
                                    defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                                    i5 = i6;
                                    onkeysrequired = onkeysrequired2;
                                }
                                if (barEntry3.AudioAttributesImplApi21Parcelizer() != null && setloaderrorhandlingpolicy.onCommand()) {
                                    Drawable drawableAudioAttributesImplApi21Parcelizer3 = barEntry3.AudioAttributesImplApi21Parcelizer();
                                    float f31 = onkeysrequired.read[i4 + 2];
                                    if (f24 < BitmapDescriptorFactory.HUE_RED) {
                                        f28 = f29;
                                    }
                                    drmSessionAcquired.write(canvas, drawableAudioAttributesImplApi21Parcelizer3, (int) (f31 + f28 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.IconCompatParcelizer), (int) (f23 + lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.write), drawableAudioAttributesImplApi21Parcelizer3.getIntrinsicWidth(), drawableAudioAttributesImplApi21Parcelizer3.getIntrinsicHeight());
                                }
                            } else {
                                i4 = i13;
                                list2 = listIconCompatParcelizer;
                                i5 = i6;
                                f3 = fAudioAttributesCompatParcelizer;
                                lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                                onkeysrequired = onkeysrequired2;
                                defaultDrmSessionResponseHandler = defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem;
                            }
                            i13 = i4 + 4;
                            lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2;
                            onkeysrequired2 = onkeysrequired;
                            defaultDrmSessionResponseHandlerMediaBrowserCompatMediaItem = defaultDrmSessionResponseHandler;
                            listIconCompatParcelizer = list2;
                            i6 = i5;
                            fAudioAttributesCompatParcelizer = f3;
                            f4 = 2.0f;
                        }
                        list = listIconCompatParcelizer;
                        i = i6;
                        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher3;
                    }
                    z2 = zAudioAttributesCompatParcelizer;
                    lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher);
                } else {
                    list = listIconCompatParcelizer;
                    z2 = zAudioAttributesCompatParcelizer;
                    i = i6;
                }
                i6 = i + 1;
                listIconCompatParcelizer = list;
                zAudioAttributesCompatParcelizer = z2;
            }
        }
    }

    @Override // kotlin.DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1
    public final void RemoteActionCompatParcelizer(Canvas canvas, String str, float f, float f2, int i) {
        this.AudioAttributesImplApi21Parcelizer.setColor(i);
        canvas.drawText(str, f, f2, this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // kotlin.DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1
    protected final void IconCompatParcelizer(float f, float f2, float f3, float f4, drmSessionReleased drmsessionreleased) {
        this.AudioAttributesCompatParcelizer.set(f2, f - f4, f3, f + f4);
        drmsessionreleased.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver.read());
    }

    @Override // kotlin.DefaultDrmSessionManagerPreacquiredSessionReferenceExternalSyntheticLambda1
    protected final void AudioAttributesCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry, RectF rectF) {
        createandacquiresessionwithretry.write(rectF.centerY(), rectF.right);
    }

    @Override // kotlin.lambdaonReferenceCountDecremented0
    protected final boolean AudioAttributesCompatParcelizer(getCryptoType getcryptotype) {
        return ((float) getcryptotype.onSeekTo().write()) < ((float) getcryptotype.MediaBrowserCompatMediaItem()) * this.MediaBrowserCompatSearchResultReceiver.onAddQueueItem();
    }
}
