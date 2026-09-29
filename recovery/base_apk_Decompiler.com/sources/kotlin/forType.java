package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.StackTraceElementDeserializer;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes2.dex */
public class forType extends NumberDeserializersNumberDeserializer {
    private String onCustomAction = null;
    private int MediaBrowserCompatItemReceiver = 0;
    private int onPlay = -1;
    private String AudioAttributesImplApi21Parcelizer = null;
    private float onMediaButtonEvent = Float.NaN;
    private float onFastForward = BitmapDescriptorFactory.HUE_RED;
    private float onPause = BitmapDescriptorFactory.HUE_RED;
    private float MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
    private int onPlayFromMediaId = -1;
    private float AudioAttributesImplApi26Parcelizer = Float.NaN;
    private float AudioAttributesImplBaseParcelizer = Float.NaN;
    private float MediaDescriptionCompat = Float.NaN;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
    private float MediaBrowserCompatSearchResultReceiver = Float.NaN;
    private float MediaBrowserCompatMediaItem = Float.NaN;
    private float RatingCompat = Float.NaN;
    private float MediaMetadataCompat = Float.NaN;
    private float handleMediaPlayPauseIfPendingOnHandler = Float.NaN;
    private float onAddQueueItem = Float.NaN;
    private float onCommand = Float.NaN;

    public forType() {
        this.RemoteActionCompatParcelizer = 4;
        this.AudioAttributesCompatParcelizer = new HashMap<>();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void write(Context context, AttributeSet attributeSet) {
        AudioAttributesCompatParcelizer.write(this, context.obtainStyledAttributes(attributeSet, _isBlank.read.KeyCycle));
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void AudioAttributesCompatParcelizer(HashSet<String> hashSet) {
        if (!Float.isNaN(this.AudioAttributesImplApi26Parcelizer)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.AudioAttributesImplBaseParcelizer)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.MediaDescriptionCompat)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.MediaBrowserCompatSearchResultReceiver)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.MediaBrowserCompatMediaItem)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.RatingCompat)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.MediaMetadataCompat)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.handleMediaPlayPauseIfPendingOnHandler)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.onAddQueueItem)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.onCommand)) {
            hashSet.add("translationZ");
        }
        if (this.AudioAttributesCompatParcelizer.size() > 0) {
            Iterator<String> it = this.AudioAttributesCompatParcelizer.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM,".concat(String.valueOf(it.next())));
            }
        }
    }

    public final void RemoteActionCompatParcelizer(HashMap<String, NumberDeserializersFloatDeserializer> map) {
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer;
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                StackTraceElementDeserializer stackTraceElementDeserializer = this.AudioAttributesCompatParcelizer.get(str.substring(7));
                if (stackTraceElementDeserializer != null && stackTraceElementDeserializer.read() == StackTraceElementDeserializer.RemoteActionCompatParcelizer.FLOAT_TYPE && (numberDeserializersFloatDeserializer = map.get(str)) != null) {
                    numberDeserializersFloatDeserializer.RemoteActionCompatParcelizer(this.read, this.onPlay, this.AudioAttributesImplApi21Parcelizer, this.onPlayFromMediaId, this.onMediaButtonEvent, this.onFastForward, this.onPause, stackTraceElementDeserializer.AudioAttributesCompatParcelizer(), stackTraceElementDeserializer);
                }
            } else {
                float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str);
                if (!Float.isNaN(fRemoteActionCompatParcelizer) && (numberDeserializersFloatDeserializer2 = map.get(str)) != null) {
                    numberDeserializersFloatDeserializer2.read(this.read, this.onPlay, this.AudioAttributesImplApi21Parcelizer, this.onPlayFromMediaId, this.onMediaButtonEvent, this.onFastForward, this.onPause, fRemoteActionCompatParcelizer);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float RemoteActionCompatParcelizer(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.forType.RemoteActionCompatParcelizer(java.lang.String):float");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    @Override // kotlin.NumberDeserializersNumberDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(java.util.HashMap<java.lang.String, kotlin.NumberDeserializersDoubleDeserializer> r5) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.forType.read(java.util.HashMap):void");
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class AudioAttributesCompatParcelizer {
        private static SparseIntArray RemoteActionCompatParcelizer;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            RemoteActionCompatParcelizer = sparseIntArray;
            sparseIntArray.append(_isBlank.read.KeyCycle_motionTarget, 1);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_framePosition, 2);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_transitionEasing, 3);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_curveFit, 4);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_waveShape, 5);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_wavePeriod, 6);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_waveOffset, 7);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_waveVariesBy, 8);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_alpha, 9);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_elevation, 10);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_rotation, 11);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_rotationX, 12);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_rotationY, 13);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_transitionPathRotate, 14);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_scaleX, 15);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_scaleY, 16);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_translationX, 17);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_translationY, 18);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_android_translationZ, 19);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_motionProgress, 20);
            RemoteActionCompatParcelizer.append(_isBlank.read.KeyCycle_wavePhase, 21);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void write(forType fortype, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (RemoteActionCompatParcelizer.get(index)) {
                    case 1:
                        if (MotionLayout.RemoteActionCompatParcelizer) {
                            fortype.write = typedArray.getResourceId(index, fortype.write);
                            if (fortype.write == -1) {
                                fortype.IconCompatParcelizer = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            fortype.IconCompatParcelizer = typedArray.getString(index);
                        } else {
                            fortype.write = typedArray.getResourceId(index, fortype.write);
                        }
                        break;
                    case 2:
                        fortype.read = typedArray.getInt(index, fortype.read);
                        break;
                    case 3:
                        fortype.onCustomAction = typedArray.getString(index);
                        break;
                    case 4:
                        fortype.MediaBrowserCompatItemReceiver = typedArray.getInteger(index, fortype.MediaBrowserCompatItemReceiver);
                        break;
                    case 5:
                        if (typedArray.peekValue(index).type == 3) {
                            fortype.AudioAttributesImplApi21Parcelizer = typedArray.getString(index);
                            fortype.onPlay = 7;
                        } else {
                            fortype.onPlay = typedArray.getInt(index, fortype.onPlay);
                        }
                        break;
                    case 6:
                        fortype.onMediaButtonEvent = typedArray.getFloat(index, fortype.onMediaButtonEvent);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type == 5) {
                            fortype.onFastForward = typedArray.getDimension(index, fortype.onFastForward);
                        } else {
                            fortype.onFastForward = typedArray.getFloat(index, fortype.onFastForward);
                        }
                        break;
                    case 8:
                        fortype.onPlayFromMediaId = typedArray.getInt(index, fortype.onPlayFromMediaId);
                        break;
                    case 9:
                        fortype.AudioAttributesImplApi26Parcelizer = typedArray.getFloat(index, fortype.AudioAttributesImplApi26Parcelizer);
                        break;
                    case 10:
                        fortype.AudioAttributesImplBaseParcelizer = typedArray.getDimension(index, fortype.AudioAttributesImplBaseParcelizer);
                        break;
                    case 11:
                        fortype.MediaDescriptionCompat = typedArray.getFloat(index, fortype.MediaDescriptionCompat);
                        break;
                    case 12:
                        fortype.MediaBrowserCompatSearchResultReceiver = typedArray.getFloat(index, fortype.MediaBrowserCompatSearchResultReceiver);
                        break;
                    case 13:
                        fortype.MediaBrowserCompatMediaItem = typedArray.getFloat(index, fortype.MediaBrowserCompatMediaItem);
                        break;
                    case 14:
                        fortype.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArray.getFloat(index, fortype.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                        break;
                    case 15:
                        fortype.RatingCompat = typedArray.getFloat(index, fortype.RatingCompat);
                        break;
                    case 16:
                        fortype.MediaMetadataCompat = typedArray.getFloat(index, fortype.MediaMetadataCompat);
                        break;
                    case 17:
                        fortype.handleMediaPlayPauseIfPendingOnHandler = typedArray.getDimension(index, fortype.handleMediaPlayPauseIfPendingOnHandler);
                        break;
                    case 18:
                        fortype.onAddQueueItem = typedArray.getDimension(index, fortype.onAddQueueItem);
                        break;
                    case 19:
                        fortype.onCommand = typedArray.getDimension(index, fortype.onCommand);
                        break;
                    case 20:
                        fortype.MediaBrowserCompatCustomActionResultReceiver = typedArray.getFloat(index, fortype.MediaBrowserCompatCustomActionResultReceiver);
                        break;
                    case 21:
                        fortype.onPause = typedArray.getFloat(index, fortype.onPause) / 360.0f;
                        break;
                    default:
                        Integer.toHexString(index);
                        RemoteActionCompatParcelizer.get(index);
                        break;
                }
            }
        }
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final NumberDeserializersNumberDeserializer IconCompatParcelizer(NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer) {
        super.IconCompatParcelizer(numberDeserializersNumberDeserializer);
        forType fortype = (forType) numberDeserializersNumberDeserializer;
        this.onCustomAction = fortype.onCustomAction;
        this.MediaBrowserCompatItemReceiver = fortype.MediaBrowserCompatItemReceiver;
        this.onPlay = fortype.onPlay;
        this.AudioAttributesImplApi21Parcelizer = fortype.AudioAttributesImplApi21Parcelizer;
        this.onMediaButtonEvent = fortype.onMediaButtonEvent;
        this.onFastForward = fortype.onFastForward;
        this.onPause = fortype.onPause;
        this.MediaBrowserCompatCustomActionResultReceiver = fortype.MediaBrowserCompatCustomActionResultReceiver;
        this.onPlayFromMediaId = fortype.onPlayFromMediaId;
        this.AudioAttributesImplApi26Parcelizer = fortype.AudioAttributesImplApi26Parcelizer;
        this.AudioAttributesImplBaseParcelizer = fortype.AudioAttributesImplBaseParcelizer;
        this.MediaDescriptionCompat = fortype.MediaDescriptionCompat;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = fortype.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.MediaBrowserCompatSearchResultReceiver = fortype.MediaBrowserCompatSearchResultReceiver;
        this.MediaBrowserCompatMediaItem = fortype.MediaBrowserCompatMediaItem;
        this.RatingCompat = fortype.RatingCompat;
        this.MediaMetadataCompat = fortype.MediaMetadataCompat;
        this.handleMediaPlayPauseIfPendingOnHandler = fortype.handleMediaPlayPauseIfPendingOnHandler;
        this.onAddQueueItem = fortype.onAddQueueItem;
        this.onCommand = fortype.onCommand;
        return this;
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final NumberDeserializersNumberDeserializer clone() {
        return new forType().IconCompatParcelizer((NumberDeserializersNumberDeserializer) this);
    }
}
