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
import kotlin._isBlank;

/* JADX INFO: loaded from: classes2.dex */
public class PrimitiveArrayDeserializers extends NumberDeserializersNumberDeserializer {
    private String onCommand;
    private int AudioAttributesImplBaseParcelizer = -1;
    private float MediaBrowserCompatItemReceiver = Float.NaN;
    private float MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
    private float MediaBrowserCompatSearchResultReceiver = Float.NaN;
    private float RatingCompat = Float.NaN;
    private float MediaMetadataCompat = Float.NaN;
    private float onCustomAction = Float.NaN;
    private float MediaBrowserCompatMediaItem = Float.NaN;
    private float MediaDescriptionCompat = Float.NaN;
    private float handleMediaPlayPauseIfPendingOnHandler = Float.NaN;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
    private float onAddQueueItem = Float.NaN;
    private float AudioAttributesImplApi26Parcelizer = Float.NaN;
    private int onPlay = 0;
    private String AudioAttributesImplApi21Parcelizer = null;
    private float onFastForward = Float.NaN;
    private float onPlayFromMediaId = BitmapDescriptorFactory.HUE_RED;

    public PrimitiveArrayDeserializers() {
        this.RemoteActionCompatParcelizer = 3;
        this.AudioAttributesCompatParcelizer = new HashMap<>();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void write(Context context, AttributeSet attributeSet) {
        AudioAttributesCompatParcelizer.read(this, context.obtainStyledAttributes(attributeSet, _isBlank.read.KeyTimeCycle));
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void AudioAttributesCompatParcelizer(HashSet<String> hashSet) {
        if (!Float.isNaN(this.MediaBrowserCompatItemReceiver)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.MediaBrowserCompatSearchResultReceiver)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.RatingCompat)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.MediaMetadataCompat)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.handleMediaPlayPauseIfPendingOnHandler)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.onAddQueueItem)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.onCustomAction)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.MediaBrowserCompatMediaItem)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.MediaDescriptionCompat)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.AudioAttributesImplApi26Parcelizer)) {
            hashSet.add("progress");
        }
        if (this.AudioAttributesCompatParcelizer.size() > 0) {
            Iterator<String> it = this.AudioAttributesCompatParcelizer.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM,".concat(String.valueOf(it.next())));
            }
        }
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void AudioAttributesCompatParcelizer(HashMap<String, Integer> map) {
        if (this.AudioAttributesImplBaseParcelizer != -1) {
            if (!Float.isNaN(this.MediaBrowserCompatItemReceiver)) {
                map.put("alpha", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver)) {
                map.put("elevation", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.MediaBrowserCompatSearchResultReceiver)) {
                map.put("rotation", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.RatingCompat)) {
                map.put("rotationX", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.MediaMetadataCompat)) {
                map.put("rotationY", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.handleMediaPlayPauseIfPendingOnHandler)) {
                map.put("translationX", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                map.put("translationY", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.onAddQueueItem)) {
                map.put("translationZ", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.onCustomAction)) {
                map.put("transitionPathRotate", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.MediaBrowserCompatMediaItem)) {
                map.put("scaleX", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.MediaBrowserCompatMediaItem)) {
                map.put("scaleY", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (!Float.isNaN(this.AudioAttributesImplApi26Parcelizer)) {
                map.put("progress", Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
            }
            if (this.AudioAttributesCompatParcelizer.size() > 0) {
                Iterator<String> it = this.AudioAttributesCompatParcelizer.keySet().iterator();
                while (it.hasNext()) {
                    map.put("CUSTOM,".concat(String.valueOf(it.next())), Integer.valueOf(this.AudioAttributesImplBaseParcelizer));
                }
            }
        }
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void read(HashMap<String, NumberDeserializersDoubleDeserializer> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(java.util.HashMap<java.lang.String, kotlin._parseShort> r11) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrimitiveArrayDeserializers.RemoteActionCompatParcelizer(java.util.HashMap):void");
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class AudioAttributesCompatParcelizer {
        private static SparseIntArray write;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            write = sparseIntArray;
            sparseIntArray.append(_isBlank.read.KeyTimeCycle_android_alpha, 1);
            write.append(_isBlank.read.KeyTimeCycle_android_elevation, 2);
            write.append(_isBlank.read.KeyTimeCycle_android_rotation, 4);
            write.append(_isBlank.read.KeyTimeCycle_android_rotationX, 5);
            write.append(_isBlank.read.KeyTimeCycle_android_rotationY, 6);
            write.append(_isBlank.read.KeyTimeCycle_android_scaleX, 7);
            write.append(_isBlank.read.KeyTimeCycle_transitionPathRotate, 8);
            write.append(_isBlank.read.KeyTimeCycle_transitionEasing, 9);
            write.append(_isBlank.read.KeyTimeCycle_motionTarget, 10);
            write.append(_isBlank.read.KeyTimeCycle_framePosition, 12);
            write.append(_isBlank.read.KeyTimeCycle_curveFit, 13);
            write.append(_isBlank.read.KeyTimeCycle_android_scaleY, 14);
            write.append(_isBlank.read.KeyTimeCycle_android_translationX, 15);
            write.append(_isBlank.read.KeyTimeCycle_android_translationY, 16);
            write.append(_isBlank.read.KeyTimeCycle_android_translationZ, 17);
            write.append(_isBlank.read.KeyTimeCycle_motionProgress, 18);
            write.append(_isBlank.read.KeyTimeCycle_wavePeriod, 20);
            write.append(_isBlank.read.KeyTimeCycle_waveOffset, 21);
            write.append(_isBlank.read.KeyTimeCycle_waveShape, 19);
        }

        public static void read(PrimitiveArrayDeserializers primitiveArrayDeserializers, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (write.get(index)) {
                    case 1:
                        primitiveArrayDeserializers.MediaBrowserCompatItemReceiver = typedArray.getFloat(index, primitiveArrayDeserializers.MediaBrowserCompatItemReceiver);
                        break;
                    case 2:
                        primitiveArrayDeserializers.MediaBrowserCompatCustomActionResultReceiver = typedArray.getDimension(index, primitiveArrayDeserializers.MediaBrowserCompatCustomActionResultReceiver);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        write.get(index);
                        break;
                    case 4:
                        primitiveArrayDeserializers.MediaBrowserCompatSearchResultReceiver = typedArray.getFloat(index, primitiveArrayDeserializers.MediaBrowserCompatSearchResultReceiver);
                        break;
                    case 5:
                        primitiveArrayDeserializers.RatingCompat = typedArray.getFloat(index, primitiveArrayDeserializers.RatingCompat);
                        break;
                    case 6:
                        primitiveArrayDeserializers.MediaMetadataCompat = typedArray.getFloat(index, primitiveArrayDeserializers.MediaMetadataCompat);
                        break;
                    case 7:
                        primitiveArrayDeserializers.MediaBrowserCompatMediaItem = typedArray.getFloat(index, primitiveArrayDeserializers.MediaBrowserCompatMediaItem);
                        break;
                    case 8:
                        primitiveArrayDeserializers.onCustomAction = typedArray.getFloat(index, primitiveArrayDeserializers.onCustomAction);
                        break;
                    case 9:
                        primitiveArrayDeserializers.onCommand = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.RemoteActionCompatParcelizer) {
                            primitiveArrayDeserializers.write = typedArray.getResourceId(index, primitiveArrayDeserializers.write);
                            if (primitiveArrayDeserializers.write == -1) {
                                primitiveArrayDeserializers.IconCompatParcelizer = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            primitiveArrayDeserializers.IconCompatParcelizer = typedArray.getString(index);
                        } else {
                            primitiveArrayDeserializers.write = typedArray.getResourceId(index, primitiveArrayDeserializers.write);
                        }
                        break;
                    case 12:
                        primitiveArrayDeserializers.read = typedArray.getInt(index, primitiveArrayDeserializers.read);
                        break;
                    case 13:
                        primitiveArrayDeserializers.AudioAttributesImplBaseParcelizer = typedArray.getInteger(index, primitiveArrayDeserializers.AudioAttributesImplBaseParcelizer);
                        break;
                    case 14:
                        primitiveArrayDeserializers.MediaDescriptionCompat = typedArray.getFloat(index, primitiveArrayDeserializers.MediaDescriptionCompat);
                        break;
                    case 15:
                        primitiveArrayDeserializers.handleMediaPlayPauseIfPendingOnHandler = typedArray.getDimension(index, primitiveArrayDeserializers.handleMediaPlayPauseIfPendingOnHandler);
                        break;
                    case 16:
                        primitiveArrayDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArray.getDimension(index, primitiveArrayDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                        break;
                    case 17:
                        primitiveArrayDeserializers.onAddQueueItem = typedArray.getDimension(index, primitiveArrayDeserializers.onAddQueueItem);
                        break;
                    case 18:
                        primitiveArrayDeserializers.AudioAttributesImplApi26Parcelizer = typedArray.getFloat(index, primitiveArrayDeserializers.AudioAttributesImplApi26Parcelizer);
                        break;
                    case 19:
                        if (typedArray.peekValue(index).type == 3) {
                            primitiveArrayDeserializers.AudioAttributesImplApi21Parcelizer = typedArray.getString(index);
                            primitiveArrayDeserializers.onPlay = 7;
                        } else {
                            primitiveArrayDeserializers.onPlay = typedArray.getInt(index, primitiveArrayDeserializers.onPlay);
                        }
                        break;
                    case 20:
                        primitiveArrayDeserializers.onFastForward = typedArray.getFloat(index, primitiveArrayDeserializers.onFastForward);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type == 5) {
                            primitiveArrayDeserializers.onPlayFromMediaId = typedArray.getDimension(index, primitiveArrayDeserializers.onPlayFromMediaId);
                        } else {
                            primitiveArrayDeserializers.onPlayFromMediaId = typedArray.getFloat(index, primitiveArrayDeserializers.onPlayFromMediaId);
                        }
                        break;
                }
            }
        }
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final NumberDeserializersNumberDeserializer IconCompatParcelizer(NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer) {
        super.IconCompatParcelizer(numberDeserializersNumberDeserializer);
        PrimitiveArrayDeserializers primitiveArrayDeserializers = (PrimitiveArrayDeserializers) numberDeserializersNumberDeserializer;
        this.onCommand = primitiveArrayDeserializers.onCommand;
        this.AudioAttributesImplBaseParcelizer = primitiveArrayDeserializers.AudioAttributesImplBaseParcelizer;
        this.onPlay = primitiveArrayDeserializers.onPlay;
        this.onFastForward = primitiveArrayDeserializers.onFastForward;
        this.onPlayFromMediaId = primitiveArrayDeserializers.onPlayFromMediaId;
        this.AudioAttributesImplApi26Parcelizer = primitiveArrayDeserializers.AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompatItemReceiver = primitiveArrayDeserializers.MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatCustomActionResultReceiver = primitiveArrayDeserializers.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatSearchResultReceiver = primitiveArrayDeserializers.MediaBrowserCompatSearchResultReceiver;
        this.onCustomAction = primitiveArrayDeserializers.onCustomAction;
        this.RatingCompat = primitiveArrayDeserializers.RatingCompat;
        this.MediaMetadataCompat = primitiveArrayDeserializers.MediaMetadataCompat;
        this.MediaBrowserCompatMediaItem = primitiveArrayDeserializers.MediaBrowserCompatMediaItem;
        this.MediaDescriptionCompat = primitiveArrayDeserializers.MediaDescriptionCompat;
        this.handleMediaPlayPauseIfPendingOnHandler = primitiveArrayDeserializers.handleMediaPlayPauseIfPendingOnHandler;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = primitiveArrayDeserializers.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.onAddQueueItem = primitiveArrayDeserializers.onAddQueueItem;
        return this;
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final NumberDeserializersNumberDeserializer clone() {
        return new PrimitiveArrayDeserializers().IconCompatParcelizer((NumberDeserializersNumberDeserializer) this);
    }
}
