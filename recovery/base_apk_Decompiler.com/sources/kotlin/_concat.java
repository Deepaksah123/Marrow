package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes2.dex */
public class _concat extends deserializeFromBase64 {
    String MediaBrowserCompatSearchResultReceiver = null;
    int AudioAttributesImplBaseParcelizer = -1;
    int MediaBrowserCompatCustomActionResultReceiver = 0;
    float MediaDescriptionCompat = Float.NaN;
    float AudioAttributesImplApi26Parcelizer = Float.NaN;
    float MediaMetadataCompat = Float.NaN;
    float RatingCompat = Float.NaN;
    float AudioAttributesImplApi21Parcelizer = Float.NaN;
    float MediaBrowserCompatItemReceiver = Float.NaN;
    int MediaBrowserCompatMediaItem = 0;
    private float onCommand = Float.NaN;
    private float onAddQueueItem = Float.NaN;

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void read(HashMap<String, NumberDeserializersDoubleDeserializer> map) {
    }

    public _concat() {
        this.RemoteActionCompatParcelizer = 2;
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void write(Context context, AttributeSet attributeSet) {
        read.IconCompatParcelizer(this, context.obtainStyledAttributes(attributeSet, _isBlank.read.KeyPosition));
    }

    public final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatMediaItem = 0;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class read {
        private static SparseIntArray read;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            read = sparseIntArray;
            sparseIntArray.append(_isBlank.read.KeyPosition_motionTarget, 1);
            read.append(_isBlank.read.KeyPosition_framePosition, 2);
            read.append(_isBlank.read.KeyPosition_transitionEasing, 3);
            read.append(_isBlank.read.KeyPosition_curveFit, 4);
            read.append(_isBlank.read.KeyPosition_drawPath, 5);
            read.append(_isBlank.read.KeyPosition_percentX, 6);
            read.append(_isBlank.read.KeyPosition_percentY, 7);
            read.append(_isBlank.read.KeyPosition_keyPositionType, 9);
            read.append(_isBlank.read.KeyPosition_sizePercent, 8);
            read.append(_isBlank.read.KeyPosition_percentWidth, 11);
            read.append(_isBlank.read.KeyPosition_percentHeight, 12);
            read.append(_isBlank.read.KeyPosition_pathMotionArc, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void IconCompatParcelizer(_concat _concatVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (read.get(index)) {
                    case 1:
                        if (MotionLayout.RemoteActionCompatParcelizer) {
                            _concatVar.write = typedArray.getResourceId(index, _concatVar.write);
                            if (_concatVar.write == -1) {
                                _concatVar.IconCompatParcelizer = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            _concatVar.IconCompatParcelizer = typedArray.getString(index);
                        } else {
                            _concatVar.write = typedArray.getResourceId(index, _concatVar.write);
                        }
                        break;
                    case 2:
                        _concatVar.read = typedArray.getInt(index, _concatVar.read);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            _concatVar.MediaBrowserCompatSearchResultReceiver = typedArray.getString(index);
                        } else {
                            _concatVar.MediaBrowserCompatSearchResultReceiver = EnumMapDeserializer.RemoteActionCompatParcelizer[typedArray.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        _concatVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArray.getInteger(index, _concatVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                        break;
                    case 5:
                        _concatVar.MediaBrowserCompatCustomActionResultReceiver = typedArray.getInt(index, _concatVar.MediaBrowserCompatCustomActionResultReceiver);
                        break;
                    case 6:
                        _concatVar.MediaMetadataCompat = typedArray.getFloat(index, _concatVar.MediaMetadataCompat);
                        break;
                    case 7:
                        _concatVar.RatingCompat = typedArray.getFloat(index, _concatVar.RatingCompat);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, _concatVar.AudioAttributesImplApi26Parcelizer);
                        _concatVar.MediaDescriptionCompat = f;
                        _concatVar.AudioAttributesImplApi26Parcelizer = f;
                        break;
                    case 9:
                        _concatVar.MediaBrowserCompatMediaItem = typedArray.getInt(index, _concatVar.MediaBrowserCompatMediaItem);
                        break;
                    case 10:
                        _concatVar.AudioAttributesImplBaseParcelizer = typedArray.getInt(index, _concatVar.AudioAttributesImplBaseParcelizer);
                        break;
                    case 11:
                        _concatVar.MediaDescriptionCompat = typedArray.getFloat(index, _concatVar.MediaDescriptionCompat);
                        break;
                    case 12:
                        _concatVar.AudioAttributesImplApi26Parcelizer = typedArray.getFloat(index, _concatVar.AudioAttributesImplApi26Parcelizer);
                        break;
                    default:
                        Integer.toHexString(index);
                        read.get(index);
                        break;
                }
            }
            int i2 = _concatVar.read;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(java.lang.String r2, java.lang.Object r3) {
        /*
            r1 = this;
            r2.hashCode()
            int r0 = r2.hashCode()
            switch(r0) {
                case -1812823328: goto L47;
                case -1127236479: goto L3d;
                case -1017587252: goto L33;
                case -827014263: goto L29;
                case -200259324: goto L1f;
                case 428090547: goto L15;
                case 428090548: goto Lb;
                default: goto La;
            }
        La:
            goto L51
        Lb:
            java.lang.String r0 = "percentY"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L51
            r2 = 6
            goto L52
        L15:
            java.lang.String r0 = "percentX"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L51
            r2 = 5
            goto L52
        L1f:
            java.lang.String r0 = "sizePercent"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L51
            r2 = 4
            goto L52
        L29:
            java.lang.String r0 = "drawPath"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L51
            r2 = 3
            goto L52
        L33:
            java.lang.String r0 = "percentHeight"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L51
            r2 = 2
            goto L52
        L3d:
            java.lang.String r0 = "percentWidth"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L51
            r2 = 1
            goto L52
        L47:
            java.lang.String r0 = "transitionEasing"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L51
            r2 = 0
            goto L52
        L51:
            r2 = -1
        L52:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L64;
                case 5: goto L5d;
                case 6: goto L56;
                default: goto L55;
            }
        L55:
            return
        L56:
            float r2 = AudioAttributesCompatParcelizer(r3)
            r1.RatingCompat = r2
            return
        L5d:
            float r2 = AudioAttributesCompatParcelizer(r3)
            r1.MediaMetadataCompat = r2
            return
        L64:
            float r2 = AudioAttributesCompatParcelizer(r3)
            r1.MediaDescriptionCompat = r2
            r1.AudioAttributesImplApi26Parcelizer = r2
            return
        L6d:
            int r2 = write(r3)
            r1.MediaBrowserCompatCustomActionResultReceiver = r2
            return
        L74:
            float r2 = AudioAttributesCompatParcelizer(r3)
            r1.AudioAttributesImplApi26Parcelizer = r2
            return
        L7b:
            float r2 = AudioAttributesCompatParcelizer(r3)
            r1.MediaDescriptionCompat = r2
            return
        L82:
            java.lang.String r2 = r3.toString()
            r1.MediaBrowserCompatSearchResultReceiver = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._concat.read(java.lang.String, java.lang.Object):void");
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final NumberDeserializersNumberDeserializer IconCompatParcelizer(NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer) {
        super.IconCompatParcelizer(numberDeserializersNumberDeserializer);
        _concat _concatVar = (_concat) numberDeserializersNumberDeserializer;
        this.MediaBrowserCompatSearchResultReceiver = _concatVar.MediaBrowserCompatSearchResultReceiver;
        this.AudioAttributesImplBaseParcelizer = _concatVar.AudioAttributesImplBaseParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = _concatVar.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaDescriptionCompat = _concatVar.MediaDescriptionCompat;
        this.AudioAttributesImplApi26Parcelizer = Float.NaN;
        this.MediaMetadataCompat = _concatVar.MediaMetadataCompat;
        this.RatingCompat = _concatVar.RatingCompat;
        this.AudioAttributesImplApi21Parcelizer = _concatVar.AudioAttributesImplApi21Parcelizer;
        this.MediaBrowserCompatItemReceiver = _concatVar.MediaBrowserCompatItemReceiver;
        this.onCommand = _concatVar.onCommand;
        this.onAddQueueItem = _concatVar.onAddQueueItem;
        return this;
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final NumberDeserializersNumberDeserializer clone() {
        return new _concat().IconCompatParcelizer(this);
    }
}
