package kotlin;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.Entry;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.DefaultDrmSessionManagerMode;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultDrmSessionManagerMediaDrmHandler extends DefaultDrmSessionManagerMode<BarLineChartBase<? extends onMediaDrmEvent<? extends setKeyRequestParameters<? extends Entry>>>> {
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher AudioAttributesImplApi21Parcelizer;
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private setPlayClearSamplesWithoutKeys MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private Matrix MediaBrowserCompatMediaItem;
    private Matrix MediaBrowserCompatSearchResultReceiver;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private float MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private float RatingCompat;
    private VelocityTracker onAddQueueItem;
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher onCommand;
    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher onCustomAction;

    public DefaultDrmSessionManagerMediaDrmHandler(BarLineChartBase<? extends onMediaDrmEvent<? extends setKeyRequestParameters<? extends Entry>>> barLineChartBase, Matrix matrix) {
        super(barLineChartBase);
        this.MediaBrowserCompatSearchResultReceiver = new Matrix();
        this.MediaBrowserCompatMediaItem = new Matrix();
        this.onCommand = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onCustomAction = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.MediaMetadataCompat = 1.0f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1.0f;
        this.MediaDescriptionCompat = 1.0f;
        this.AudioAttributesImplBaseParcelizer = 0L;
        this.AudioAttributesImplApi21Parcelizer = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesImplApi26Parcelizer = lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompatSearchResultReceiver = matrix;
        this.MediaBrowserCompatItemReceiver = drmSessionAcquired.write(3.0f);
        this.RatingCompat = drmSessionAcquired.write(3.5f);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.onAddQueueItem == null) {
            this.onAddQueueItem = VelocityTracker.obtain();
        }
        this.onAddQueueItem.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.onAddQueueItem) != null) {
            velocityTracker.recycle();
            this.onAddQueueItem = null;
        }
        if (this.RemoteActionCompatParcelizer == 0) {
            this.IconCompatParcelizer.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.write).RatingCompat() && !((BarLineChartBase) this.write).onPause() && !((BarLineChartBase) this.write).onFastForward()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            AudioAttributesCompatParcelizer();
            IconCompatParcelizer();
            IconCompatParcelizer(motionEvent);
        } else if (action == 1) {
            VelocityTracker velocityTracker2 = this.onAddQueueItem;
            int pointerId = motionEvent.getPointerId(0);
            velocityTracker2.computeCurrentVelocity(1000, drmSessionAcquired.read());
            float yVelocity = velocityTracker2.getYVelocity(pointerId);
            float xVelocity = velocityTracker2.getXVelocity(pointerId);
            if ((Math.abs(xVelocity) > drmSessionAcquired.AudioAttributesCompatParcelizer() || Math.abs(yVelocity) > drmSessionAcquired.AudioAttributesCompatParcelizer()) && this.RemoteActionCompatParcelizer == 1 && ((BarLineChartBase) this.write).onSkipToPrevious()) {
                IconCompatParcelizer();
                this.AudioAttributesImplBaseParcelizer = AnimationUtils.currentAnimationTimeMillis();
                this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer = motionEvent.getX();
                this.AudioAttributesImplApi21Parcelizer.write = motionEvent.getY();
                this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer = xVelocity;
                this.AudioAttributesImplApi26Parcelizer.write = yVelocity;
                drmSessionAcquired.IconCompatParcelizer(this.write);
            }
            if (this.RemoteActionCompatParcelizer == 2 || this.RemoteActionCompatParcelizer == 3 || this.RemoteActionCompatParcelizer == 4 || this.RemoteActionCompatParcelizer == 5) {
                ((BarLineChartBase) this.write).AudioAttributesImplApi21Parcelizer();
                ((BarLineChartBase) this.write).postInvalidate();
            }
            this.RemoteActionCompatParcelizer = 0;
            ((BarLineChartBase) this.write).onPrepare();
            VelocityTracker velocityTracker3 = this.onAddQueueItem;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.onAddQueueItem = null;
            }
            RemoteActionCompatParcelizer();
        } else if (action != 2) {
            if (action == 3) {
                this.RemoteActionCompatParcelizer = 0;
                RemoteActionCompatParcelizer();
            } else if (action != 5) {
                if (action == 6) {
                    drmSessionAcquired.read(motionEvent, this.onAddQueueItem);
                    this.RemoteActionCompatParcelizer = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ((BarLineChartBase) this.write).onPlayFromSearch();
                IconCompatParcelizer(motionEvent);
                this.MediaMetadataCompat = RemoteActionCompatParcelizer(motionEvent);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = AudioAttributesCompatParcelizer(motionEvent);
                float fAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(motionEvent);
                this.MediaDescriptionCompat = fAudioAttributesImplApi21Parcelizer;
                if (fAudioAttributesImplApi21Parcelizer > 10.0f) {
                    if (((BarLineChartBase) this.write).onCustomAction()) {
                        this.RemoteActionCompatParcelizer = 4;
                    } else if (((BarLineChartBase) this.write).onPause() != ((BarLineChartBase) this.write).onFastForward()) {
                        this.RemoteActionCompatParcelizer = ((BarLineChartBase) this.write).onPause() ? 2 : 3;
                    } else {
                        this.RemoteActionCompatParcelizer = this.MediaMetadataCompat > this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver ? 2 : 3;
                    }
                }
                IconCompatParcelizer(this.onCustomAction, motionEvent);
            }
        } else if (this.RemoteActionCompatParcelizer == 1) {
            ((BarLineChartBase) this.write).onPlayFromSearch();
            boolean zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ((BarLineChartBase) this.write).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            float y = BitmapDescriptorFactory.HUE_RED;
            float x = zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver ? motionEvent.getX() - this.onCommand.IconCompatParcelizer : 0.0f;
            if (((BarLineChartBase) this.write).handleMediaPlayPauseIfPendingOnHandler()) {
                y = motionEvent.getY() - this.onCommand.write;
            }
            IconCompatParcelizer(x, y);
        } else if (this.RemoteActionCompatParcelizer == 2 || this.RemoteActionCompatParcelizer == 3 || this.RemoteActionCompatParcelizer == 4) {
            ((BarLineChartBase) this.write).onPlayFromSearch();
            if (((BarLineChartBase) this.write).onPause() || ((BarLineChartBase) this.write).onFastForward()) {
                write(motionEvent);
            }
        } else if (this.RemoteActionCompatParcelizer == 0 && Math.abs(read(motionEvent.getX(), this.onCommand.IconCompatParcelizer, motionEvent.getY(), this.onCommand.write)) > this.MediaBrowserCompatItemReceiver && ((BarLineChartBase) this.write).RatingCompat()) {
            if (!((BarLineChartBase) this.write).onCommand() || !((BarLineChartBase) this.write).MediaDescriptionCompat()) {
                float fAbs = Math.abs(motionEvent.getX() - this.onCommand.IconCompatParcelizer);
                float fAbs2 = Math.abs(motionEvent.getY() - this.onCommand.write);
                if ((((BarLineChartBase) this.write).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() || fAbs2 >= fAbs) && (((BarLineChartBase) this.write).handleMediaPlayPauseIfPendingOnHandler() || fAbs2 <= fAbs)) {
                    this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.DRAG;
                    this.RemoteActionCompatParcelizer = 1;
                }
            } else if (((BarLineChartBase) this.write).onAddQueueItem()) {
                this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.DRAG;
                if (((BarLineChartBase) this.write).onAddQueueItem()) {
                    read(motionEvent);
                }
            }
        }
        this.MediaBrowserCompatSearchResultReceiver = ((BarLineChartBase) this.write).onSkipToQueueItem().AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, this.write, true);
        return true;
    }

    private void IconCompatParcelizer(MotionEvent motionEvent) {
        this.MediaBrowserCompatMediaItem.set(this.MediaBrowserCompatSearchResultReceiver);
        this.onCommand.IconCompatParcelizer = motionEvent.getX();
        this.onCommand.write = motionEvent.getY();
        this.MediaBrowserCompatCustomActionResultReceiver = ((BarLineChartBase) this.write).RemoteActionCompatParcelizer(motionEvent.getX(), motionEvent.getY());
    }

    private void IconCompatParcelizer(float f, float f2) {
        this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.DRAG;
        this.MediaBrowserCompatSearchResultReceiver.set(this.MediaBrowserCompatMediaItem);
        ((BarLineChartBase) this.write).onStop();
        if (write()) {
            if (this.write instanceof HorizontalBarChart) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.MediaBrowserCompatSearchResultReceiver.postTranslate(f, f2);
    }

    private void write(MotionEvent motionEvent) {
        boolean zRemoteActionCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer;
        boolean zAudioAttributesCompatParcelizer2;
        boolean zRemoteActionCompatParcelizer2;
        if (motionEvent.getPointerCount() >= 2) {
            ((BarLineChartBase) this.write).onStop();
            float fAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(motionEvent);
            if (fAudioAttributesImplApi21Parcelizer > this.RatingCompat) {
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onCustomAction.IconCompatParcelizer, this.onCustomAction.write);
                lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem = ((BarLineChartBase) this.write).onSkipToQueueItem();
                if (this.RemoteActionCompatParcelizer == 4) {
                    this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.PINCH_ZOOM;
                    float f = fAudioAttributesImplApi21Parcelizer / this.MediaDescriptionCompat;
                    boolean z = f < 1.0f;
                    if (z) {
                        zAudioAttributesCompatParcelizer2 = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.IconCompatParcelizer();
                    } else {
                        zAudioAttributesCompatParcelizer2 = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.AudioAttributesCompatParcelizer();
                    }
                    if (z) {
                        zRemoteActionCompatParcelizer2 = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.write();
                    } else {
                        zRemoteActionCompatParcelizer2 = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.RemoteActionCompatParcelizer();
                    }
                    float f2 = ((BarLineChartBase) this.write).onPause() ? f : 1.0f;
                    float f3 = ((BarLineChartBase) this.write).onFastForward() ? f : 1.0f;
                    if (zRemoteActionCompatParcelizer2 || zAudioAttributesCompatParcelizer2) {
                        this.MediaBrowserCompatSearchResultReceiver.set(this.MediaBrowserCompatMediaItem);
                        this.MediaBrowserCompatSearchResultReceiver.postScale(f2, f3, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.write);
                    }
                } else if (this.RemoteActionCompatParcelizer == 2 && ((BarLineChartBase) this.write).onPause()) {
                    this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.X_ZOOM;
                    float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(motionEvent) / this.MediaMetadataCompat;
                    if (fRemoteActionCompatParcelizer < 1.0f) {
                        zAudioAttributesCompatParcelizer = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.IconCompatParcelizer();
                    } else {
                        zAudioAttributesCompatParcelizer = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.AudioAttributesCompatParcelizer();
                    }
                    if (zAudioAttributesCompatParcelizer) {
                        this.MediaBrowserCompatSearchResultReceiver.set(this.MediaBrowserCompatMediaItem);
                        this.MediaBrowserCompatSearchResultReceiver.postScale(fRemoteActionCompatParcelizer, 1.0f, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.write);
                    }
                } else if (this.RemoteActionCompatParcelizer == 3 && ((BarLineChartBase) this.write).onFastForward()) {
                    this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.Y_ZOOM;
                    float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent) / this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    if (fAudioAttributesCompatParcelizer < 1.0f) {
                        zRemoteActionCompatParcelizer = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.write();
                    } else {
                        zRemoteActionCompatParcelizer = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.RemoteActionCompatParcelizer();
                    }
                    if (zRemoteActionCompatParcelizer) {
                        this.MediaBrowserCompatSearchResultReceiver.set(this.MediaBrowserCompatMediaItem);
                        this.MediaBrowserCompatSearchResultReceiver.postScale(1.0f, fAudioAttributesCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.write);
                    }
                }
                lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer);
            }
        }
    }

    private void read(MotionEvent motionEvent) {
        createAndAcquireSessionWithRetry createandacquiresessionwithretryAudioAttributesCompatParcelizer = ((BarLineChartBase) this.write).AudioAttributesCompatParcelizer(motionEvent.getX(), motionEvent.getY());
        if (createandacquiresessionwithretryAudioAttributesCompatParcelizer == null || createandacquiresessionwithretryAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.read)) {
            return;
        }
        this.read = createandacquiresessionwithretryAudioAttributesCompatParcelizer;
        ((BarLineChartBase) this.write).RemoteActionCompatParcelizer(createandacquiresessionwithretryAudioAttributesCompatParcelizer);
    }

    private static void IconCompatParcelizer(lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher, MotionEvent motionEvent) {
        float x = motionEvent.getX(0);
        float x2 = motionEvent.getX(1);
        float y = motionEvent.getY(0);
        float y2 = motionEvent.getY(1);
        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.IconCompatParcelizer = (x + x2) / 2.0f;
        lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.write = (y + y2) / 2.0f;
    }

    private static float AudioAttributesImplApi21Parcelizer(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    private static float RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    private static float AudioAttributesCompatParcelizer(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    private lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher AudioAttributesCompatParcelizer(float f, float f2) {
        float f3;
        lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem = ((BarLineChartBase) this.write).onSkipToQueueItem();
        float fOnFastForward = lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.onFastForward();
        if (write()) {
            f3 = -(f2 - lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.onPlayFromUri());
        } else {
            f3 = -((((BarLineChartBase) this.write).getMeasuredHeight() - f2) - lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherOnSkipToQueueItem.onPlayFromMediaId());
        }
        return lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.read(f - fOnFastForward, f3);
    }

    private boolean write() {
        if (this.MediaBrowserCompatCustomActionResultReceiver == null && ((BarLineChartBase) this.write).MediaMetadataCompat()) {
            return true;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver != null && ((BarLineChartBase) this.write).read(this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.DOUBLE_TAP;
        ((BarLineChartBase) this.write).onStop();
        if (((BarLineChartBase) this.write).MediaBrowserCompatSearchResultReceiver() && ((onMediaDrmEvent) ((BarLineChartBase) this.write).onSeekTo()).write() > 0) {
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(motionEvent.getX(), motionEvent.getY());
            ((BarLineChartBase) this.write).AudioAttributesCompatParcelizer(((BarLineChartBase) this.write).onPause() ? 1.4f : 1.0f, ((BarLineChartBase) this.write).onFastForward() ? 1.4f : 1.0f, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.IconCompatParcelizer, lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.write);
            if (((BarLineChartBase) this.write).MediaSessionCompatResultReceiverWrapper()) {
                float f = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.IconCompatParcelizer;
                float f2 = lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer.write;
            }
            lambdadrmKeysRemoved4comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher.AudioAttributesCompatParcelizer(lambdadrmkeysremoved4comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcherAudioAttributesCompatParcelizer);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.LONG_PRESS;
        ((BarLineChartBase) this.write).onStop();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.SINGLE_TAP;
        ((BarLineChartBase) this.write).onStop();
        if (!((BarLineChartBase) this.write).MediaSessionCompatQueueItem()) {
            return false;
        }
        RemoteActionCompatParcelizer(((BarLineChartBase) this.write).AudioAttributesCompatParcelizer(motionEvent.getX(), motionEvent.getY()));
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.AudioAttributesCompatParcelizer = DefaultDrmSessionManagerMode.read.FLING;
        ((BarLineChartBase) this.write).onStop();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    private void IconCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi26Parcelizer.write = BitmapDescriptorFactory.HUE_RED;
    }

    public final void read() {
        float f = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f == BitmapDescriptorFactory.HUE_RED && this.AudioAttributesImplApi26Parcelizer.write == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer *= ((BarLineChartBase) this.write).onRemoveQueueItemAt();
        this.AudioAttributesImplApi26Parcelizer.write *= ((BarLineChartBase) this.write).onRemoveQueueItemAt();
        float f3 = (jCurrentAnimationTimeMillis - this.AudioAttributesImplBaseParcelizer) / 1000.0f;
        float f4 = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer;
        float f5 = this.AudioAttributesImplApi26Parcelizer.write;
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer += f4 * f3;
        this.AudioAttributesImplApi21Parcelizer.write += f5 * f3;
        MotionEvent motionEventObtain = MotionEvent.obtain(jCurrentAnimationTimeMillis, jCurrentAnimationTimeMillis, 2, this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer, this.AudioAttributesImplApi21Parcelizer.write, 0);
        float f6 = ((BarLineChartBase) this.write).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() ? this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer - this.onCommand.IconCompatParcelizer : 0.0f;
        if (((BarLineChartBase) this.write).handleMediaPlayPauseIfPendingOnHandler()) {
            f2 = this.AudioAttributesImplApi21Parcelizer.write - this.onCommand.write;
        }
        IconCompatParcelizer(f6, f2);
        motionEventObtain.recycle();
        this.MediaBrowserCompatSearchResultReceiver = ((BarLineChartBase) this.write).onSkipToQueueItem().AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, this.write, false);
        this.AudioAttributesImplBaseParcelizer = jCurrentAnimationTimeMillis;
        if (Math.abs(this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer) >= 0.01d || Math.abs(this.AudioAttributesImplApi26Parcelizer.write) >= 0.01d) {
            drmSessionAcquired.IconCompatParcelizer(this.write);
            return;
        }
        ((BarLineChartBase) this.write).AudioAttributesImplApi21Parcelizer();
        ((BarLineChartBase) this.write).postInvalidate();
        IconCompatParcelizer();
    }
}
