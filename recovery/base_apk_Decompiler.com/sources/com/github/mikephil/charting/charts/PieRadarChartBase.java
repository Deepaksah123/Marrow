package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.data.Entry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.drmSessionAcquired;
import kotlin.lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher;
import kotlin.onSessionFullyReleased;
import kotlin.postKeyRequest;
import kotlin.requiresSecureDecoder;
import kotlin.setPlayClearSamplesWithoutKeys;

/* JADX INFO: loaded from: classes.dex */
public abstract class PieRadarChartBase<T extends requiresSecureDecoder<? extends setPlayClearSamplesWithoutKeys<? extends Entry>>> extends Chart<T> {
    private boolean AudioAttributesCompatParcelizer;
    private float RemoteActionCompatParcelizer;
    private float read;
    private float write;

    protected abstract float MediaDescriptionCompat();

    protected abstract float MediaMetadataCompat();

    public float MediaSessionCompatToken() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public abstract float RatingCompat();

    public abstract int RemoteActionCompatParcelizer(float f);

    @Override // com.github.mikephil.charting.charts.Chart
    protected void read() {
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.write = 270.0f;
        this.read = 270.0f;
        this.AudioAttributesCompatParcelizer = true;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = 270.0f;
        this.read = 270.0f;
        this.AudioAttributesCompatParcelizer = true;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = 270.0f;
        this.read = 270.0f;
        this.AudioAttributesCompatParcelizer = true;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    protected void RemoteActionCompatParcelizer() {
        super.RemoteActionCompatParcelizer();
        this.MediaMetadataCompat = new onSessionFullyReleased(this);
    }

    @Override // kotlin.getCryptoType
    public final int MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem.write();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.onPlayFromMediaId && this.MediaMetadataCompat != null) {
            return this.MediaMetadataCompat.onTouch(this, motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.MediaMetadataCompat instanceof onSessionFullyReleased) {
            ((onSessionFullyReleased) this.MediaMetadataCompat).write();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void onPlay() {
        if (this.MediaBrowserCompatMediaItem == null) {
            return;
        }
        read();
        if (this.onCommand != null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        AudioAttributesImplApi21Parcelizer();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r2 != 2) goto L54;
     */
    @Override // com.github.mikephil.charting.charts.Chart
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AudioAttributesImplApi21Parcelizer() {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.charts.PieRadarChartBase.AudioAttributesImplApi21Parcelizer():void");
    }

    /* JADX INFO: renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        static final /* synthetic */ int[] read;
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[postKeyRequest.IconCompatParcelizer.values().length];
            RemoteActionCompatParcelizer = iArr;
            try {
                iArr[postKeyRequest.IconCompatParcelizer.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RemoteActionCompatParcelizer[postKeyRequest.IconCompatParcelizer.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[postKeyRequest.read.values().length];
            read = iArr2;
            try {
                iArr2[postKeyRequest.read.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[postKeyRequest.read.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                read[postKeyRequest.read.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[postKeyRequest.write.values().length];
            write = iArr3;
            try {
                iArr3[postKeyRequest.write.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[postKeyRequest.write.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public final float RemoteActionCompatParcelizer(float f, float f2) {
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = onPrepareFromMediaId();
        double d = f - lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer;
        double d2 = f2 - lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.write;
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId);
        return f3;
    }

    private static lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher IconCompatParcelizer(lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, float f, float f2) {
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2 = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        write(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, f, f2, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2);
        return lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2;
    }

    private static void write(lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, float f, float f2, lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2) {
        double d = f;
        double d2 = f2;
        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.IconCompatParcelizer = (float) (((double) lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer) + (Math.cos(Math.toRadians(d2)) * d));
        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher2.write = (float) (((double) lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write) + (d * Math.sin(Math.toRadians(d2))));
    }

    public final float IconCompatParcelizer(float f, float f2) {
        float f3;
        float f4;
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId = onPrepareFromMediaId();
        if (f > lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer) {
            f3 = f - lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer;
        } else {
            f3 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.IconCompatParcelizer - f;
        }
        if (f2 > lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.write) {
            f4 = f2 - lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.write;
        } else {
            f4 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId.write - f2;
        }
        float fSqrt = (float) Math.sqrt(Math.pow(f3, 2.0d) + Math.pow(f4, 2.0d));
        lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnPrepareFromMediaId);
        return fSqrt;
    }

    public void setRotationAngle(float f) {
        this.read = f;
        this.write = drmSessionAcquired.IconCompatParcelizer(f);
    }

    public final float onFastForward() {
        return this.read;
    }

    public final float ParcelableVolumeInfo() {
        return this.write;
    }

    public void setRotationEnabled(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public final boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        return this.AudioAttributesCompatParcelizer;
    }

    public void setMinOffset(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    public final float onPlayFromMediaId() {
        RectF rectFMediaBrowserCompatSearchResultReceiver = this.onPause.MediaBrowserCompatSearchResultReceiver();
        rectFMediaBrowserCompatSearchResultReceiver.left += onRewind();
        rectFMediaBrowserCompatSearchResultReceiver.top += onSetPlaybackSpeed();
        rectFMediaBrowserCompatSearchResultReceiver.right -= onSetCaptioningEnabled();
        rectFMediaBrowserCompatSearchResultReceiver.bottom -= onRemoveQueueItem();
        return Math.min(rectFMediaBrowserCompatSearchResultReceiver.width(), rectFMediaBrowserCompatSearchResultReceiver.height());
    }
}
