package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes2.dex */
public class NumberDeserializersLongDeserializer extends NumberDeserializersNumberDeserializer {
    private String handleMediaPlayPauseIfPendingOnHandler;
    private int MediaBrowserCompatItemReceiver = -1;
    private boolean onPause = false;
    private float AudioAttributesImplApi21Parcelizer = Float.NaN;
    private float AudioAttributesImplBaseParcelizer = Float.NaN;
    private float MediaDescriptionCompat = Float.NaN;
    private float RatingCompat = Float.NaN;
    private float MediaBrowserCompatSearchResultReceiver = Float.NaN;
    private float AudioAttributesImplApi26Parcelizer = Float.NaN;
    private float MediaBrowserCompatCustomActionResultReceiver = Float.NaN;
    private float onCustomAction = Float.NaN;
    private float MediaMetadataCompat = Float.NaN;
    private float onAddQueueItem = Float.NaN;
    private float onCommand = Float.NaN;
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Float.NaN;
    private float onPlayFromMediaId = Float.NaN;
    private float MediaBrowserCompatMediaItem = Float.NaN;

    public NumberDeserializersLongDeserializer() {
        this.RemoteActionCompatParcelizer = 1;
        this.AudioAttributesCompatParcelizer = new HashMap<>();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void write(Context context, AttributeSet attributeSet) {
        write.AudioAttributesCompatParcelizer(this, context.obtainStyledAttributes(attributeSet, _isBlank.read.KeyAttribute));
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void AudioAttributesCompatParcelizer(HashSet<String> hashSet) {
        if (!Float.isNaN(this.AudioAttributesImplApi21Parcelizer)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.AudioAttributesImplBaseParcelizer)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.MediaDescriptionCompat)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.RatingCompat)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.MediaBrowserCompatSearchResultReceiver)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.AudioAttributesImplApi26Parcelizer)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.onCommand)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.onPlayFromMediaId)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.onCustomAction)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.MediaMetadataCompat)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.onAddQueueItem)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.MediaBrowserCompatMediaItem)) {
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
        if (this.MediaBrowserCompatItemReceiver != -1) {
            if (!Float.isNaN(this.AudioAttributesImplApi21Parcelizer)) {
                map.put("alpha", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.AudioAttributesImplBaseParcelizer)) {
                map.put("elevation", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.MediaDescriptionCompat)) {
                map.put("rotation", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.RatingCompat)) {
                map.put("rotationX", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.MediaBrowserCompatSearchResultReceiver)) {
                map.put("rotationY", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.AudioAttributesImplApi26Parcelizer)) {
                map.put("transformPivotX", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.MediaBrowserCompatCustomActionResultReceiver)) {
                map.put("transformPivotY", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.onCommand)) {
                map.put("translationX", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                map.put("translationY", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.onPlayFromMediaId)) {
                map.put("translationZ", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.onCustomAction)) {
                map.put("transitionPathRotate", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.MediaMetadataCompat)) {
                map.put("scaleX", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.onAddQueueItem)) {
                map.put("scaleY", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (!Float.isNaN(this.MediaBrowserCompatMediaItem)) {
                map.put("progress", Integer.valueOf(this.MediaBrowserCompatItemReceiver));
            }
            if (this.AudioAttributesCompatParcelizer.size() > 0) {
                Iterator<String> it = this.AudioAttributesCompatParcelizer.keySet().iterator();
                while (it.hasNext()) {
                    map.put("CUSTOM,".concat(String.valueOf(it.next())), Integer.valueOf(this.MediaBrowserCompatItemReceiver));
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    @Override // kotlin.NumberDeserializersNumberDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(java.util.HashMap<java.lang.String, kotlin.NumberDeserializersDoubleDeserializer> r6) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberDeserializersLongDeserializer.read(java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(java.lang.String r2, java.lang.Object r3) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NumberDeserializersLongDeserializer.IconCompatParcelizer(java.lang.String, java.lang.Object):void");
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class write {
        private static SparseIntArray write;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            write = sparseIntArray;
            sparseIntArray.append(_isBlank.read.KeyAttribute_android_alpha, 1);
            write.append(_isBlank.read.KeyAttribute_android_elevation, 2);
            write.append(_isBlank.read.KeyAttribute_android_rotation, 4);
            write.append(_isBlank.read.KeyAttribute_android_rotationX, 5);
            write.append(_isBlank.read.KeyAttribute_android_rotationY, 6);
            write.append(_isBlank.read.KeyAttribute_android_transformPivotX, 19);
            write.append(_isBlank.read.KeyAttribute_android_transformPivotY, 20);
            write.append(_isBlank.read.KeyAttribute_android_scaleX, 7);
            write.append(_isBlank.read.KeyAttribute_transitionPathRotate, 8);
            write.append(_isBlank.read.KeyAttribute_transitionEasing, 9);
            write.append(_isBlank.read.KeyAttribute_motionTarget, 10);
            write.append(_isBlank.read.KeyAttribute_framePosition, 12);
            write.append(_isBlank.read.KeyAttribute_curveFit, 13);
            write.append(_isBlank.read.KeyAttribute_android_scaleY, 14);
            write.append(_isBlank.read.KeyAttribute_android_translationX, 15);
            write.append(_isBlank.read.KeyAttribute_android_translationY, 16);
            write.append(_isBlank.read.KeyAttribute_android_translationZ, 17);
            write.append(_isBlank.read.KeyAttribute_motionProgress, 18);
        }

        public static void AudioAttributesCompatParcelizer(NumberDeserializersLongDeserializer numberDeserializersLongDeserializer, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (write.get(index)) {
                    case 1:
                        numberDeserializersLongDeserializer.AudioAttributesImplApi21Parcelizer = typedArray.getFloat(index, numberDeserializersLongDeserializer.AudioAttributesImplApi21Parcelizer);
                        break;
                    case 2:
                        numberDeserializersLongDeserializer.AudioAttributesImplBaseParcelizer = typedArray.getDimension(index, numberDeserializersLongDeserializer.AudioAttributesImplBaseParcelizer);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        write.get(index);
                        break;
                    case 4:
                        numberDeserializersLongDeserializer.MediaDescriptionCompat = typedArray.getFloat(index, numberDeserializersLongDeserializer.MediaDescriptionCompat);
                        break;
                    case 5:
                        numberDeserializersLongDeserializer.RatingCompat = typedArray.getFloat(index, numberDeserializersLongDeserializer.RatingCompat);
                        break;
                    case 6:
                        numberDeserializersLongDeserializer.MediaBrowserCompatSearchResultReceiver = typedArray.getFloat(index, numberDeserializersLongDeserializer.MediaBrowserCompatSearchResultReceiver);
                        break;
                    case 7:
                        numberDeserializersLongDeserializer.MediaMetadataCompat = typedArray.getFloat(index, numberDeserializersLongDeserializer.MediaMetadataCompat);
                        break;
                    case 8:
                        numberDeserializersLongDeserializer.onCustomAction = typedArray.getFloat(index, numberDeserializersLongDeserializer.onCustomAction);
                        break;
                    case 9:
                        numberDeserializersLongDeserializer.handleMediaPlayPauseIfPendingOnHandler = typedArray.getString(index);
                        break;
                    case 10:
                        if (MotionLayout.RemoteActionCompatParcelizer) {
                            numberDeserializersLongDeserializer.write = typedArray.getResourceId(index, numberDeserializersLongDeserializer.write);
                            if (numberDeserializersLongDeserializer.write == -1) {
                                numberDeserializersLongDeserializer.IconCompatParcelizer = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            numberDeserializersLongDeserializer.IconCompatParcelizer = typedArray.getString(index);
                        } else {
                            numberDeserializersLongDeserializer.write = typedArray.getResourceId(index, numberDeserializersLongDeserializer.write);
                        }
                        break;
                    case 12:
                        numberDeserializersLongDeserializer.read = typedArray.getInt(index, numberDeserializersLongDeserializer.read);
                        break;
                    case 13:
                        numberDeserializersLongDeserializer.MediaBrowserCompatItemReceiver = typedArray.getInteger(index, numberDeserializersLongDeserializer.MediaBrowserCompatItemReceiver);
                        break;
                    case 14:
                        numberDeserializersLongDeserializer.onAddQueueItem = typedArray.getFloat(index, numberDeserializersLongDeserializer.onAddQueueItem);
                        break;
                    case 15:
                        numberDeserializersLongDeserializer.onCommand = typedArray.getDimension(index, numberDeserializersLongDeserializer.onCommand);
                        break;
                    case 16:
                        numberDeserializersLongDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArray.getDimension(index, numberDeserializersLongDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                        break;
                    case 17:
                        numberDeserializersLongDeserializer.onPlayFromMediaId = typedArray.getDimension(index, numberDeserializersLongDeserializer.onPlayFromMediaId);
                        break;
                    case 18:
                        numberDeserializersLongDeserializer.MediaBrowserCompatMediaItem = typedArray.getFloat(index, numberDeserializersLongDeserializer.MediaBrowserCompatMediaItem);
                        break;
                    case 19:
                        numberDeserializersLongDeserializer.AudioAttributesImplApi26Parcelizer = typedArray.getDimension(index, numberDeserializersLongDeserializer.AudioAttributesImplApi26Parcelizer);
                        break;
                    case 20:
                        numberDeserializersLongDeserializer.MediaBrowserCompatCustomActionResultReceiver = typedArray.getDimension(index, numberDeserializersLongDeserializer.MediaBrowserCompatCustomActionResultReceiver);
                        break;
                }
            }
        }
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final NumberDeserializersNumberDeserializer IconCompatParcelizer(NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer) {
        super.IconCompatParcelizer(numberDeserializersNumberDeserializer);
        NumberDeserializersLongDeserializer numberDeserializersLongDeserializer = (NumberDeserializersLongDeserializer) numberDeserializersNumberDeserializer;
        this.MediaBrowserCompatItemReceiver = numberDeserializersLongDeserializer.MediaBrowserCompatItemReceiver;
        this.onPause = numberDeserializersLongDeserializer.onPause;
        this.AudioAttributesImplApi21Parcelizer = numberDeserializersLongDeserializer.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplBaseParcelizer = numberDeserializersLongDeserializer.AudioAttributesImplBaseParcelizer;
        this.MediaDescriptionCompat = numberDeserializersLongDeserializer.MediaDescriptionCompat;
        this.RatingCompat = numberDeserializersLongDeserializer.RatingCompat;
        this.MediaBrowserCompatSearchResultReceiver = numberDeserializersLongDeserializer.MediaBrowserCompatSearchResultReceiver;
        this.AudioAttributesImplApi26Parcelizer = numberDeserializersLongDeserializer.AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = numberDeserializersLongDeserializer.MediaBrowserCompatCustomActionResultReceiver;
        this.onCustomAction = numberDeserializersLongDeserializer.onCustomAction;
        this.MediaMetadataCompat = numberDeserializersLongDeserializer.MediaMetadataCompat;
        this.onAddQueueItem = numberDeserializersLongDeserializer.onAddQueueItem;
        this.onCommand = numberDeserializersLongDeserializer.onCommand;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = numberDeserializersLongDeserializer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.onPlayFromMediaId = numberDeserializersLongDeserializer.onPlayFromMediaId;
        this.MediaBrowserCompatMediaItem = numberDeserializersLongDeserializer.MediaBrowserCompatMediaItem;
        return this;
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final NumberDeserializersNumberDeserializer clone() {
        return new NumberDeserializersLongDeserializer().IconCompatParcelizer((NumberDeserializersNumberDeserializer) this);
    }
}
