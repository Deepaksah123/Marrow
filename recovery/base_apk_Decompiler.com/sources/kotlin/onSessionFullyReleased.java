package kotlin;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.DefaultDrmSessionManagerMode;

/* JADX INFO: loaded from: classes2.dex */
public final class onSessionFullyReleased extends DefaultDrmSessionManagerMode<PieRadarChartBase<?>> {
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private ArrayList<RemoteActionCompatParcelizer> MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public onSessionFullyReleased(PieRadarChartBase<?> pieRadarChartBase) {
        super(pieRadarChartBase);
        this.AudioAttributesImplApi21Parcelizer = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
        this.AudioAttributesImplApi26Parcelizer = 0L;
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.IconCompatParcelizer.onTouchEvent(motionEvent) && ((PieRadarChartBase) this.write).r8lambdaKUbBm7ckfqTc9QCgukC86fguu4()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                AudioAttributesCompatParcelizer();
                MediaBrowserCompatCustomActionResultReceiver();
                IconCompatParcelizer();
                if (((PieRadarChartBase) this.write).onSkipToPrevious()) {
                    read(x, y);
                }
                RemoteActionCompatParcelizer(x, y);
                this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer = x;
                this.AudioAttributesImplApi21Parcelizer.write = y;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.write).onSkipToPrevious()) {
                    MediaBrowserCompatCustomActionResultReceiver();
                    read(x, y);
                    float f = read();
                    this.AudioAttributesImplBaseParcelizer = f;
                    if (f != BitmapDescriptorFactory.HUE_RED) {
                        this.AudioAttributesImplApi26Parcelizer = AnimationUtils.currentAnimationTimeMillis();
                        drmSessionAcquired.IconCompatParcelizer(this.write);
                    }
                }
                ((PieRadarChartBase) this.write).onPrepare();
                this.RemoteActionCompatParcelizer = 0;
                RemoteActionCompatParcelizer();
            } else if (action == 2) {
                if (((PieRadarChartBase) this.write).onSkipToPrevious()) {
                    read(x, y);
                }
                if (this.RemoteActionCompatParcelizer == 0 && read(x, this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer, y, this.AudioAttributesImplApi21Parcelizer.write) > drmSessionAcquired.write(8.0f)) {
                    this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.ROTATE;
                    this.RemoteActionCompatParcelizer = 6;
                    ((PieRadarChartBase) this.write).onPlayFromSearch();
                } else if (this.RemoteActionCompatParcelizer == 6) {
                    AudioAttributesCompatParcelizer(x, y);
                    ((PieRadarChartBase) this.write).invalidate();
                }
                RemoteActionCompatParcelizer();
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.LONG_PRESS;
        ((PieRadarChartBase) this.write).onStop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.SINGLE_TAP;
        ((PieRadarChartBase) this.write).onStop();
        if (!((PieRadarChartBase) this.write).MediaSessionCompatQueueItem()) {
            return false;
        }
        RemoteActionCompatParcelizer(((PieRadarChartBase) this.write).AudioAttributesCompatParcelizer(motionEvent.getX(), motionEvent.getY()));
        return true;
    }

    private void IconCompatParcelizer() {
        this.MediaBrowserCompatCustomActionResultReceiver.clear();
    }

    private void read(float f, float f2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.MediaBrowserCompatCustomActionResultReceiver.add(new RemoteActionCompatParcelizer(jCurrentAnimationTimeMillis, ((PieRadarChartBase) this.write).RemoteActionCompatParcelizer(f, f2)));
        for (int size = this.MediaBrowserCompatCustomActionResultReceiver.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - this.MediaBrowserCompatCustomActionResultReceiver.get(0).write > 1000; size--) {
            this.MediaBrowserCompatCustomActionResultReceiver.remove(0);
        }
    }

    private float read() {
        if (this.MediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.get(0);
        ArrayList<RemoteActionCompatParcelizer> arrayList = this.MediaBrowserCompatCustomActionResultReceiver;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = arrayList.get(arrayList.size() - 1);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = remoteActionCompatParcelizer;
        for (int size = this.MediaBrowserCompatCustomActionResultReceiver.size() - 1; size >= 0; size--) {
            remoteActionCompatParcelizer3 = this.MediaBrowserCompatCustomActionResultReceiver.get(size);
            if (remoteActionCompatParcelizer3.IconCompatParcelizer != remoteActionCompatParcelizer2.IconCompatParcelizer) {
                break;
            }
        }
        float f = (remoteActionCompatParcelizer2.write - remoteActionCompatParcelizer.write) / 1000.0f;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = 0.1f;
        }
        boolean z = remoteActionCompatParcelizer2.IconCompatParcelizer >= remoteActionCompatParcelizer3.IconCompatParcelizer;
        if (Math.abs(remoteActionCompatParcelizer2.IconCompatParcelizer - remoteActionCompatParcelizer3.IconCompatParcelizer) > 270.0d) {
            z = !z;
        }
        if (remoteActionCompatParcelizer2.IconCompatParcelizer - remoteActionCompatParcelizer.IconCompatParcelizer > 180.0d) {
            remoteActionCompatParcelizer.IconCompatParcelizer = (float) (((double) remoteActionCompatParcelizer.IconCompatParcelizer) + 360.0d);
        } else if (remoteActionCompatParcelizer.IconCompatParcelizer - remoteActionCompatParcelizer2.IconCompatParcelizer > 180.0d) {
            remoteActionCompatParcelizer2.IconCompatParcelizer = (float) (((double) remoteActionCompatParcelizer2.IconCompatParcelizer) + 360.0d);
        }
        float fAbs = Math.abs((remoteActionCompatParcelizer2.IconCompatParcelizer - remoteActionCompatParcelizer.IconCompatParcelizer) / f);
        return !z ? -fAbs : fAbs;
    }

    private void RemoteActionCompatParcelizer(float f, float f2) {
        this.MediaBrowserCompatItemReceiver = ((PieRadarChartBase) this.write).RemoteActionCompatParcelizer(f, f2) - ((PieRadarChartBase) this.write).onFastForward();
    }

    private void AudioAttributesCompatParcelizer(float f, float f2) {
        ((PieRadarChartBase) this.write).setRotationAngle(((PieRadarChartBase) this.write).RemoteActionCompatParcelizer(f, f2) - this.MediaBrowserCompatItemReceiver);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public final void write() {
        if (this.AudioAttributesImplBaseParcelizer == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.AudioAttributesImplBaseParcelizer *= ((PieRadarChartBase) this.write).onRemoveQueueItemAt();
        ((PieRadarChartBase) this.write).setRotationAngle(((PieRadarChartBase) this.write).ParcelableVolumeInfo() + (this.AudioAttributesImplBaseParcelizer * ((jCurrentAnimationTimeMillis - this.AudioAttributesImplApi26Parcelizer) / 1000.0f)));
        this.AudioAttributesImplApi26Parcelizer = jCurrentAnimationTimeMillis;
        if (Math.abs(this.AudioAttributesImplBaseParcelizer) >= 0.001d) {
            drmSessionAcquired.IconCompatParcelizer(this.write);
        } else {
            MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    class RemoteActionCompatParcelizer {
        public float IconCompatParcelizer;
        public long write;

        public RemoteActionCompatParcelizer(long j, float f) {
            this.write = j;
            this.IconCompatParcelizer = f;
        }
    }
}
