package kotlin;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class postKeyRequest extends openInternal {
    private getSchemeUuid[] MediaMetadataCompat;
    private getSchemeUuid[] AudioAttributesImplBaseParcelizer = new getSchemeUuid[0];
    private boolean onAddQueueItem = false;
    private read handleMediaPlayPauseIfPendingOnHandler = read.LEFT;
    private write onPlay = write.BOTTOM;
    private IconCompatParcelizer onPause = IconCompatParcelizer.HORIZONTAL;
    private boolean AudioAttributesImplApi21Parcelizer = false;
    private AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = AudioAttributesCompatParcelizer.LEFT_TO_RIGHT;
    private RemoteActionCompatParcelizer onFastForward = RemoteActionCompatParcelizer.SQUARE;
    private float onCommand = 8.0f;
    private float MediaDescriptionCompat = 3.0f;
    private DashPathEffect MediaBrowserCompatSearchResultReceiver = null;
    private float onPrepareFromSearch = 6.0f;
    private float onPlayFromUri = BitmapDescriptorFactory.HUE_RED;
    private float onCustomAction = 5.0f;
    private float onMediaButtonEvent = 3.0f;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0.95f;
    public float read = BitmapDescriptorFactory.HUE_RED;
    public float RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    public float AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    private float onPlayFromMediaId = BitmapDescriptorFactory.HUE_RED;
    private boolean onPrepare = false;
    private List<DrmSessionEventListener> write = new ArrayList(16);
    private List<Boolean> IconCompatParcelizer = new ArrayList(16);
    private List<DrmSessionEventListener> AudioAttributesImplApi26Parcelizer = new ArrayList(16);

    public enum AudioAttributesCompatParcelizer {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum IconCompatParcelizer {
        HORIZONTAL,
        VERTICAL
    }

    public enum RemoteActionCompatParcelizer {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum read {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum write {
        TOP,
        CENTER,
        BOTTOM
    }

    public postKeyRequest() {
        this.MediaBrowserCompatItemReceiver = drmSessionAcquired.write(10.0f);
        this.RatingCompat = drmSessionAcquired.write(5.0f);
        this.MediaBrowserCompatMediaItem = drmSessionAcquired.write(3.0f);
    }

    public final void AudioAttributesCompatParcelizer(List<getSchemeUuid> list) {
        this.AudioAttributesImplBaseParcelizer = (getSchemeUuid[]) list.toArray(new getSchemeUuid[list.size()]);
    }

    public final getSchemeUuid[] IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    private float write(Paint paint) {
        float fWrite = drmSessionAcquired.write(this.onCustomAction);
        getSchemeUuid[] getschemeuuidArr = this.AudioAttributesImplBaseParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = 0.0f;
        for (getSchemeUuid getschemeuuid : getschemeuuidArr) {
            float fWrite2 = drmSessionAcquired.write(Float.isNaN(getschemeuuid.IconCompatParcelizer) ? this.onCommand : getschemeuuid.IconCompatParcelizer);
            if (fWrite2 > f2) {
                f2 = fWrite2;
            }
            String str = getschemeuuid.AudioAttributesImplApi26Parcelizer;
            if (str != null) {
                float f3 = drmSessionAcquired.read(paint, str);
                if (f3 > f) {
                    f = f3;
                }
            }
        }
        return f + f2 + fWrite;
    }

    private float AudioAttributesCompatParcelizer(Paint paint) {
        getSchemeUuid[] getschemeuuidArr = this.AudioAttributesImplBaseParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (getSchemeUuid getschemeuuid : getschemeuuidArr) {
            String str = getschemeuuid.AudioAttributesImplApi26Parcelizer;
            if (str != null) {
                float fAudioAttributesCompatParcelizer = drmSessionAcquired.AudioAttributesCompatParcelizer(paint, str);
                if (fAudioAttributesCompatParcelizer > f) {
                    f = fAudioAttributesCompatParcelizer;
                }
            }
        }
        return f;
    }

    public final getSchemeUuid[] AudioAttributesImplApi21Parcelizer() {
        return this.MediaMetadataCompat;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onAddQueueItem;
    }

    public final read MediaBrowserCompatSearchResultReceiver() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final void read(read readVar) {
        this.handleMediaPlayPauseIfPendingOnHandler = readVar;
    }

    public final write handleMediaPlayPauseIfPendingOnHandler() {
        return this.onPlay;
    }

    public final void AudioAttributesCompatParcelizer(write writeVar) {
        this.onPlay = writeVar;
    }

    public final IconCompatParcelizer MediaMetadataCompat() {
        return this.onPause;
    }

    public final void write(IconCompatParcelizer iconCompatParcelizer) {
        this.onPause = iconCompatParcelizer;
    }

    public final boolean onCustomAction() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void onPlayFromMediaId() {
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    public final AudioAttributesCompatParcelizer read() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
        return this.onFastForward;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.onCommand;
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final DashPathEffect AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final float onCommand() {
        return this.onPrepareFromSearch;
    }

    public final float onAddQueueItem() {
        return this.onPlayFromUri;
    }

    public final float MediaBrowserCompatMediaItem() {
        return this.onCustomAction;
    }

    public final float RatingCompat() {
        return this.onMediaButtonEvent;
    }

    public final float MediaDescriptionCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final void onPlay() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0.5f;
    }

    public final List<DrmSessionEventListener> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final List<Boolean> write() {
        return this.IconCompatParcelizer;
    }

    public final List<DrmSessionEventListener> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(Paint paint, lambdadrmSessionAcquired0comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher) {
        float f;
        float f2;
        float fWrite = drmSessionAcquired.write(this.onCommand);
        float fWrite2 = drmSessionAcquired.write(this.onMediaButtonEvent);
        float fWrite3 = drmSessionAcquired.write(this.onCustomAction);
        float fWrite4 = drmSessionAcquired.write(this.onPrepareFromSearch);
        float fWrite5 = drmSessionAcquired.write(this.onPlayFromUri);
        getSchemeUuid[] getschemeuuidArr = this.AudioAttributesImplBaseParcelizer;
        int length = getschemeuuidArr.length;
        this.onPlayFromMediaId = write(paint);
        this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(paint);
        int i = AnonymousClass5.AudioAttributesCompatParcelizer[this.onPause.ordinal()];
        if (i == 1) {
            float fIconCompatParcelizer = drmSessionAcquired.IconCompatParcelizer(paint);
            float fMax = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                getSchemeUuid getschemeuuid = getschemeuuidArr[i2];
                boolean z2 = getschemeuuid.AudioAttributesCompatParcelizer != RemoteActionCompatParcelizer.NONE;
                float fWrite6 = Float.isNaN(getschemeuuid.IconCompatParcelizer) ? fWrite : drmSessionAcquired.write(getschemeuuid.IconCompatParcelizer);
                String str = getschemeuuid.AudioAttributesImplApi26Parcelizer;
                if (!z) {
                    f4 = 0.0f;
                }
                if (z2) {
                    if (z) {
                        f4 += fWrite2;
                    }
                    f4 += fWrite6;
                }
                if (str != null) {
                    if (z2 && !z) {
                        f4 += fWrite3;
                    } else if (z) {
                        fMax = Math.max(fMax, f4);
                        f3 += fIconCompatParcelizer + fWrite5;
                        f4 = 0.0f;
                        z = false;
                    }
                    float f5 = drmSessionAcquired.read(paint, str);
                    if (i2 < length - 1) {
                        f3 += fIconCompatParcelizer + fWrite5;
                    }
                    f4 += f5;
                } else {
                    f4 += fWrite6;
                    if (i2 < length - 1) {
                        f4 += fWrite2;
                    }
                    z = true;
                }
                fMax = Math.max(fMax, f4);
            }
            this.read = fMax;
            this.RemoteActionCompatParcelizer = f3;
        } else if (i == 2) {
            float fIconCompatParcelizer2 = drmSessionAcquired.IconCompatParcelizer(paint);
            float f6 = drmSessionAcquired.read(paint);
            lambdadrmsessionacquired0comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher.MediaBrowserCompatItemReceiver();
            this.IconCompatParcelizer.clear();
            this.write.clear();
            this.AudioAttributesImplApi26Parcelizer.clear();
            float fMax2 = BitmapDescriptorFactory.HUE_RED;
            int i3 = -1;
            int i4 = 0;
            float f7 = BitmapDescriptorFactory.HUE_RED;
            float f8 = BitmapDescriptorFactory.HUE_RED;
            while (i4 < length) {
                getSchemeUuid getschemeuuid2 = getschemeuuidArr[i4];
                float f9 = fWrite;
                boolean z3 = getschemeuuid2.AudioAttributesCompatParcelizer != RemoteActionCompatParcelizer.NONE;
                float fWrite7 = Float.isNaN(getschemeuuid2.IconCompatParcelizer) ? f9 : drmSessionAcquired.write(getschemeuuid2.IconCompatParcelizer);
                String str2 = getschemeuuid2.AudioAttributesImplApi26Parcelizer;
                float f10 = fWrite4;
                getSchemeUuid[] getschemeuuidArr2 = getschemeuuidArr;
                this.IconCompatParcelizer.add(Boolean.FALSE);
                float f11 = i3 == -1 ? BitmapDescriptorFactory.HUE_RED : f7 + fWrite2;
                if (str2 != null) {
                    f = fWrite2;
                    this.write.add(drmSessionAcquired.write(paint, str2));
                    f2 = f11 + (z3 ? fWrite3 + fWrite7 : BitmapDescriptorFactory.HUE_RED) + this.write.get(i4).RemoteActionCompatParcelizer;
                } else {
                    f = fWrite2;
                    float f12 = fWrite7;
                    this.write.add(DrmSessionEventListener.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    f2 = f11 + (!z3 ? BitmapDescriptorFactory.HUE_RED : f12);
                    if (i3 == -1) {
                        i3 = i4;
                    }
                }
                if (str2 != null || i4 == length - 1) {
                    float f13 = f8 + (f8 == BitmapDescriptorFactory.HUE_RED ? 0.0f : f10) + f2;
                    if (i4 == length - 1) {
                        this.AudioAttributesImplApi26Parcelizer.add(DrmSessionEventListener.IconCompatParcelizer(f13, fIconCompatParcelizer2));
                        fMax2 = Math.max(fMax2, f13);
                    }
                    f8 = f13;
                }
                if (str2 != null) {
                    i3 = -1;
                }
                i4++;
                fWrite2 = f;
                fWrite = f9;
                getschemeuuidArr = getschemeuuidArr2;
                f7 = f2;
                fWrite4 = f10;
            }
            this.read = fMax2;
            this.RemoteActionCompatParcelizer = (fIconCompatParcelizer2 * this.AudioAttributesImplApi26Parcelizer.size()) + ((f6 + fWrite5) * (this.AudioAttributesImplApi26Parcelizer.size() == 0 ? 0 : this.AudioAttributesImplApi26Parcelizer.size() - 1));
        }
        this.RemoteActionCompatParcelizer += this.MediaBrowserCompatMediaItem;
        this.read += this.RatingCompat;
    }

    /* JADX INFO: renamed from: o.postKeyRequest$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[IconCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[IconCompatParcelizer.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[IconCompatParcelizer.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
