package kotlin;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NumberDeserializersDoubleDeserializer;
import kotlin.NumberDeserializersFloatDeserializer;
import kotlin.ReferenceTypeDeserializer;
import kotlin._parseShort;

/* JADX INFO: loaded from: classes2.dex */
public final class handleSingleElementUnwrapped {
    private HashMap<String, NumberDeserializersDoubleDeserializer> AudioAttributesImplApi21Parcelizer;
    private _deserializeUsingProperties AudioAttributesImplApi26Parcelizer;
    public View IconCompatParcelizer;
    private int[] MediaBrowserCompatCustomActionResultReceiver;
    private String[] MediaBrowserCompatItemReceiver;
    private HashMap<String, NumberDeserializersFloatDeserializer> MediaBrowserCompatSearchResultReceiver;
    private int[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private float MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private float RatingCompat;
    int RemoteActionCompatParcelizer;
    private double[] handleMediaPlayPauseIfPendingOnHandler;
    private double[] onMediaButtonEvent;
    private PrimitiveArrayDeserializersCharDeser[] onPlay;
    private _deserializeUsingProperties[] onPrepareFromSearch;
    private HashMap<String, _parseShort> onRemoveQueueItem;
    private Rect onRemoveQueueItemAt = new Rect();
    private boolean onCustomAction = false;
    private int MediaBrowserCompatMediaItem = -1;
    private PrimitiveArrayDeserializersLongDeser onPrepareFromUri = new PrimitiveArrayDeserializersLongDeser();
    private PrimitiveArrayDeserializersLongDeser onCommand = new PrimitiveArrayDeserializersLongDeser();
    private _constructEmpty onSeekTo = new _constructEmpty();
    private _constructEmpty onAddQueueItem = new _constructEmpty();
    public float read = Float.NaN;
    public float write = BitmapDescriptorFactory.HUE_RED;
    public float AudioAttributesCompatParcelizer = 1.0f;
    private int AudioAttributesImplBaseParcelizer = 4;
    private float[] onSetShuffleMode = new float[4];
    private ArrayList<PrimitiveArrayDeserializersLongDeser> onFastForward = new ArrayList<>();
    private float[] onSetRating = new float[1];
    private ArrayList<NumberDeserializersNumberDeserializer> onPause = new ArrayList<>();
    private int onPrepare = -1;
    private int onRewind = -1;
    private View onSetRepeatMode = null;
    private int onPrepareFromMediaId = -1;
    private float onPlayFromUri = Float.NaN;
    private Interpolator onPlayFromSearch = null;
    private boolean onPlayFromMediaId = false;

    public final PrimitiveArrayDeserializersLongDeser AudioAttributesCompatParcelizer(int i) {
        return this.onFastForward.get(i);
    }

    public handleSingleElementUnwrapped(View view) {
        read(view);
    }

    public final float AudioAttributesImplBaseParcelizer() {
        return this.onPrepareFromUri.MediaDescriptionCompat;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.onPrepareFromUri.MediaBrowserCompatMediaItem;
    }

    public final float IconCompatParcelizer() {
        return this.onCommand.MediaDescriptionCompat;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.onCommand.MediaBrowserCompatMediaItem;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.onPrepareFromUri.read;
    }

    public final void IconCompatParcelizer(handleSingleElementUnwrapped handlesingleelementunwrapped) {
        this.onPrepareFromUri.RemoteActionCompatParcelizer(handlesingleelementunwrapped, handlesingleelementunwrapped.onPrepareFromUri);
        this.onCommand.RemoteActionCompatParcelizer(handlesingleelementunwrapped, handlesingleelementunwrapped.onCommand);
    }

    public final float write() {
        return this.MediaDescriptionCompat;
    }

    public final float read() {
        return this.RatingCompat;
    }

    public final void AudioAttributesCompatParcelizer(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.onPrepareFromSearch[0].read(d, dArr);
        this.onPrepareFromSearch[0].AudioAttributesCompatParcelizer(d, dArr2);
        Arrays.fill(fArr2, BitmapDescriptorFactory.HUE_RED);
        this.onPrepareFromUri.read(d, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, dArr, fArr, dArr2, fArr2);
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.onCustomAction = true;
    }

    public final void AudioAttributesCompatParcelizer(float[] fArr, int i) {
        float f = 1.0f;
        float f2 = 1.0f / (i - 1);
        HashMap<String, NumberDeserializersDoubleDeserializer> map = this.AudioAttributesImplApi21Parcelizer;
        NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer = map == null ? null : map.get("translationX");
        HashMap<String, NumberDeserializersDoubleDeserializer> map2 = this.AudioAttributesImplApi21Parcelizer;
        NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, NumberDeserializersFloatDeserializer> map3 = this.MediaBrowserCompatSearchResultReceiver;
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer = map3 == null ? null : map3.get("translationX");
        HashMap<String, NumberDeserializersFloatDeserializer> map4 = this.MediaBrowserCompatSearchResultReceiver;
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer2 = map4 != null ? map4.get("translationY") : null;
        int i2 = 0;
        while (i2 < i) {
            float fMin = i2 * f2;
            float f3 = this.AudioAttributesCompatParcelizer;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (f3 != f) {
                float f5 = this.write;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, f);
                }
            }
            float f6 = fMin;
            double dAudioAttributesCompatParcelizer = f6;
            EnumMapDeserializer enumMapDeserializer = this.onPrepareFromUri.AudioAttributesImplApi26Parcelizer;
            float f7 = Float.NaN;
            for (PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser : this.onFastForward) {
                if (primitiveArrayDeserializersLongDeser.AudioAttributesImplApi26Parcelizer != null) {
                    if (primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver < f6) {
                        enumMapDeserializer = primitiveArrayDeserializersLongDeser.AudioAttributesImplApi26Parcelizer;
                        f4 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver;
                    } else if (Float.isNaN(f7)) {
                        f7 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver;
                    }
                }
            }
            if (enumMapDeserializer != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                dAudioAttributesCompatParcelizer = (((float) enumMapDeserializer.AudioAttributesCompatParcelizer((f6 - f4) / r16)) * (f7 - f4)) + f4;
            }
            double d = dAudioAttributesCompatParcelizer;
            this.onPrepareFromSearch[0].read(d, this.handleMediaPlayPauseIfPendingOnHandler);
            _deserializeUsingProperties _deserializeusingproperties = this.AudioAttributesImplApi26Parcelizer;
            if (_deserializeusingproperties != null) {
                double[] dArr = this.handleMediaPlayPauseIfPendingOnHandler;
                if (dArr.length > 0) {
                    _deserializeusingproperties.read(d, dArr);
                }
            }
            int i3 = i2 << 1;
            int i4 = i2;
            this.onPrepareFromUri.AudioAttributesCompatParcelizer(d, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.handleMediaPlayPauseIfPendingOnHandler, fArr, i3);
            if (numberDeserializersFloatDeserializer != null) {
                fArr[i3] = fArr[i3] + numberDeserializersFloatDeserializer.AudioAttributesCompatParcelizer(f6);
            } else if (numberDeserializersDoubleDeserializer != null) {
                fArr[i3] = fArr[i3] + numberDeserializersDoubleDeserializer.AudioAttributesCompatParcelizer(f6);
            }
            if (numberDeserializersFloatDeserializer2 != null) {
                int i5 = i3 + 1;
                fArr[i5] = fArr[i5] + numberDeserializersFloatDeserializer2.AudioAttributesCompatParcelizer(f6);
            } else if (numberDeserializersDoubleDeserializer2 != null) {
                int i6 = i3 + 1;
                fArr[i6] = fArr[i6] + numberDeserializersDoubleDeserializer2.AudioAttributesCompatParcelizer(f6);
            }
            i2 = i4 + 1;
            f = 1.0f;
        }
    }

    private float MediaBrowserCompatSearchResultReceiver() {
        char c;
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float fHypot = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < 100; i++) {
            float f = i * 0.01010101f;
            double dAudioAttributesCompatParcelizer = f;
            EnumMapDeserializer enumMapDeserializer = this.onPrepareFromUri.AudioAttributesImplApi26Parcelizer;
            float f2 = Float.NaN;
            float f3 = BitmapDescriptorFactory.HUE_RED;
            for (PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser : this.onFastForward) {
                if (primitiveArrayDeserializersLongDeser.AudioAttributesImplApi26Parcelizer != null) {
                    if (primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver < f) {
                        enumMapDeserializer = primitiveArrayDeserializersLongDeser.AudioAttributesImplApi26Parcelizer;
                        f3 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver;
                    } else if (Float.isNaN(f2)) {
                        f2 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver;
                    }
                }
            }
            if (enumMapDeserializer != null) {
                if (Float.isNaN(f2)) {
                    f2 = 1.0f;
                }
                dAudioAttributesCompatParcelizer = (((float) enumMapDeserializer.AudioAttributesCompatParcelizer((f - f3) / r7)) * (f2 - f3)) + f3;
            }
            this.onPrepareFromSearch[0].read(dAudioAttributesCompatParcelizer, this.handleMediaPlayPauseIfPendingOnHandler);
            float f4 = fHypot;
            this.onPrepareFromUri.AudioAttributesCompatParcelizer(dAudioAttributesCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.handleMediaPlayPauseIfPendingOnHandler, fArr, 0);
            if (i > 0) {
                c = 0;
                fHypot = (float) (((double) f4) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            } else {
                c = 0;
                fHypot = f4;
            }
            d = fArr[c];
            d2 = fArr[1];
        }
        return fHypot;
    }

    public final int RemoteActionCompatParcelizer(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrAudioAttributesCompatParcelizer = this.onPrepareFromSearch[0].AudioAttributesCompatParcelizer();
        if (iArr != null) {
            Iterator<PrimitiveArrayDeserializersLongDeser> it = this.onFastForward.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().AudioAttributesImplBaseParcelizer;
                i++;
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < dArrAudioAttributesCompatParcelizer.length; i3++) {
            this.onPrepareFromSearch[0].read(dArrAudioAttributesCompatParcelizer[i3], this.handleMediaPlayPauseIfPendingOnHandler);
            this.onPrepareFromUri.AudioAttributesCompatParcelizer(dArrAudioAttributesCompatParcelizer[i3], this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.handleMediaPlayPauseIfPendingOnHandler, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    public final void IconCompatParcelizer(float f, float[] fArr) {
        this.onPrepareFromSearch[0].read(AudioAttributesCompatParcelizer(f, (float[]) null), this.handleMediaPlayPauseIfPendingOnHandler);
        this.onPrepareFromUri.write(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.handleMediaPlayPauseIfPendingOnHandler, fArr, 0);
    }

    private void AudioAttributesCompatParcelizer(PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser) {
        if (Collections.binarySearch(this.onFastForward, primitiveArrayDeserializersLongDeser) == 0) {
            float f = primitiveArrayDeserializersLongDeser.MediaBrowserCompatCustomActionResultReceiver;
        }
        this.onFastForward.add((-r0) - 1, primitiveArrayDeserializersLongDeser);
    }

    final void RemoteActionCompatParcelizer(ArrayList<NumberDeserializersNumberDeserializer> arrayList) {
        this.onPause.addAll(arrayList);
    }

    public final void RemoteActionCompatParcelizer(NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer) {
        this.onPause.add(numberDeserializersNumberDeserializer);
    }

    public final void read(int i) {
        this.onPrepare = i;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, long j) {
        ArrayList arrayList;
        double[][] dArr;
        StackTraceElementDeserializer stackTraceElementDeserializer;
        _parseShort _parseshortRemoteActionCompatParcelizer;
        StackTraceElementDeserializer stackTraceElementDeserializer2;
        Integer num;
        NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializerIconCompatParcelizer;
        StackTraceElementDeserializer stackTraceElementDeserializer3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i3 = this.onPrepare;
        if (i3 != -1) {
            this.onPrepareFromUri.AudioAttributesImplApi21Parcelizer = i3;
        }
        this.onSeekTo.RemoteActionCompatParcelizer(this.onAddQueueItem, hashSet2);
        ArrayList<NumberDeserializersNumberDeserializer> arrayList2 = this.onPause;
        if (arrayList2 != null) {
            arrayList = null;
            for (NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer : arrayList2) {
                if (numberDeserializersNumberDeserializer instanceof _concat) {
                    _concat _concatVar = (_concat) numberDeserializersNumberDeserializer;
                    AudioAttributesCompatParcelizer(new PrimitiveArrayDeserializersLongDeser(i, i2, _concatVar, this.onPrepareFromUri, this.onCommand));
                    if (_concatVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != -1) {
                        this.MediaBrowserCompatMediaItem = _concatVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    }
                } else if (numberDeserializersNumberDeserializer instanceof forType) {
                    numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer(hashSet3);
                } else if (numberDeserializersNumberDeserializer instanceof PrimitiveArrayDeserializers) {
                    numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer(hashSet);
                } else if (numberDeserializersNumberDeserializer instanceof PrimitiveArrayDeserializersCharDeser) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((PrimitiveArrayDeserializersCharDeser) numberDeserializersNumberDeserializer);
                } else {
                    numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer(map);
                    numberDeserializersNumberDeserializer.AudioAttributesCompatParcelizer(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.onPlay = (PrimitiveArrayDeserializersCharDeser[]) arrayList.toArray(new PrimitiveArrayDeserializersCharDeser[0]);
        }
        if (!hashSet2.isEmpty()) {
            this.AudioAttributesImplApi21Parcelizer = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str2 = str.split(",")[1];
                    for (NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer2 : this.onPause) {
                        if (numberDeserializersNumberDeserializer2.AudioAttributesCompatParcelizer != null && (stackTraceElementDeserializer3 = numberDeserializersNumberDeserializer2.AudioAttributesCompatParcelizer.get(str2)) != null) {
                            sparseArray.append(numberDeserializersNumberDeserializer2.read, stackTraceElementDeserializer3);
                        }
                    }
                    numberDeserializersDoubleDeserializerIconCompatParcelizer = NumberDeserializersDoubleDeserializer.read(str, sparseArray);
                } else {
                    numberDeserializersDoubleDeserializerIconCompatParcelizer = NumberDeserializersDoubleDeserializer.IconCompatParcelizer(str);
                }
                if (numberDeserializersDoubleDeserializerIconCompatParcelizer != null) {
                    numberDeserializersDoubleDeserializerIconCompatParcelizer.write(str);
                    this.AudioAttributesImplApi21Parcelizer.put(str, numberDeserializersDoubleDeserializerIconCompatParcelizer);
                }
            }
            ArrayList<NumberDeserializersNumberDeserializer> arrayList3 = this.onPause;
            if (arrayList3 != null) {
                for (NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer3 : arrayList3) {
                    if (numberDeserializersNumberDeserializer3 instanceof NumberDeserializersLongDeserializer) {
                        numberDeserializersNumberDeserializer3.read(this.AudioAttributesImplApi21Parcelizer);
                    }
                }
            }
            this.onSeekTo.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 0);
            this.onAddQueueItem.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 100);
            for (String str3 : this.AudioAttributesImplApi21Parcelizer.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer = this.AudioAttributesImplApi21Parcelizer.get(str3);
                if (numberDeserializersDoubleDeserializer != null) {
                    numberDeserializersDoubleDeserializer.write(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.onRemoveQueueItem == null) {
                this.onRemoveQueueItem = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.onRemoveQueueItem.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str5 = str4.split(",")[1];
                        for (NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer4 : this.onPause) {
                            if (numberDeserializersNumberDeserializer4.AudioAttributesCompatParcelizer != null && (stackTraceElementDeserializer2 = numberDeserializersNumberDeserializer4.AudioAttributesCompatParcelizer.get(str5)) != null) {
                                sparseArray2.append(numberDeserializersNumberDeserializer4.read, stackTraceElementDeserializer2);
                            }
                        }
                        _parseshortRemoteActionCompatParcelizer = _parseShort.IconCompatParcelizer(str4, sparseArray2);
                    } else {
                        _parseshortRemoteActionCompatParcelizer = _parseShort.RemoteActionCompatParcelizer(str4);
                    }
                    if (_parseshortRemoteActionCompatParcelizer != null) {
                        _parseshortRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str4);
                        this.onRemoveQueueItem.put(str4, _parseshortRemoteActionCompatParcelizer);
                    }
                }
            }
            ArrayList<NumberDeserializersNumberDeserializer> arrayList4 = this.onPause;
            if (arrayList4 != null) {
                for (NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer5 : arrayList4) {
                    if (numberDeserializersNumberDeserializer5 instanceof PrimitiveArrayDeserializers) {
                        ((PrimitiveArrayDeserializers) numberDeserializersNumberDeserializer5).RemoteActionCompatParcelizer(this.onRemoveQueueItem);
                    }
                }
            }
            for (String str6 : this.onRemoveQueueItem.keySet()) {
                this.onRemoveQueueItem.get(str6).IconCompatParcelizer(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int size = this.onFastForward.size();
        int i4 = size + 2;
        PrimitiveArrayDeserializersLongDeser[] primitiveArrayDeserializersLongDeserArr = new PrimitiveArrayDeserializersLongDeser[i4];
        primitiveArrayDeserializersLongDeserArr[0] = this.onPrepareFromUri;
        primitiveArrayDeserializersLongDeserArr[size + 1] = this.onCommand;
        if (this.onFastForward.size() > 0 && this.MediaBrowserCompatMediaItem == -1) {
            this.MediaBrowserCompatMediaItem = 0;
        }
        Iterator<PrimitiveArrayDeserializersLongDeser> it = this.onFastForward.iterator();
        int i5 = 1;
        while (it.hasNext()) {
            primitiveArrayDeserializersLongDeserArr[i5] = it.next();
            i5++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.onCommand.AudioAttributesCompatParcelizer.keySet()) {
            if (this.onPrepareFromUri.AudioAttributesCompatParcelizer.containsKey(str7) && !hashSet2.contains("CUSTOM,".concat(String.valueOf(str7)))) {
                hashSet4.add(str7);
            }
        }
        String[] strArr = (String[]) hashSet4.toArray(new String[0]);
        this.MediaBrowserCompatItemReceiver = strArr;
        this.MediaBrowserCompatCustomActionResultReceiver = new int[strArr.length];
        int i6 = 0;
        while (true) {
            String[] strArr2 = this.MediaBrowserCompatItemReceiver;
            if (i6 >= strArr2.length) {
                break;
            }
            String str8 = strArr2[i6];
            this.MediaBrowserCompatCustomActionResultReceiver[i6] = 0;
            int i7 = 0;
            while (true) {
                if (i7 >= i4) {
                    break;
                }
                if (primitiveArrayDeserializersLongDeserArr[i7].AudioAttributesCompatParcelizer.containsKey(str8) && (stackTraceElementDeserializer = primitiveArrayDeserializersLongDeserArr[i7].AudioAttributesCompatParcelizer.get(str8)) != null) {
                    int[] iArr = this.MediaBrowserCompatCustomActionResultReceiver;
                    iArr[i6] = iArr[i6] + stackTraceElementDeserializer.RemoteActionCompatParcelizer();
                    break;
                }
                i7++;
            }
            i6++;
        }
        boolean z = primitiveArrayDeserializersLongDeserArr[0].AudioAttributesImplApi21Parcelizer != -1;
        int length = this.MediaBrowserCompatItemReceiver.length + 18;
        boolean[] zArr = new boolean[length];
        for (int i8 = 1; i8 < i4; i8++) {
            primitiveArrayDeserializersLongDeserArr[i8].RemoteActionCompatParcelizer(primitiveArrayDeserializersLongDeserArr[i8 - 1], zArr, z);
        }
        int i9 = 0;
        for (int i10 = 1; i10 < length; i10++) {
            if (zArr[i10]) {
                i9++;
            }
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new int[i9];
        int iMax = Math.max(2, i9);
        this.handleMediaPlayPauseIfPendingOnHandler = new double[iMax];
        this.onMediaButtonEvent = new double[iMax];
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12++) {
            if (zArr[i12]) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[i11] = i12;
                i11++;
            }
        }
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.length);
        double[] dArr3 = new double[i4];
        for (int i13 = 0; i13 < i4; i13++) {
            primitiveArrayDeserializersLongDeserArr[i13].IconCompatParcelizer(dArr2[i13], this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            dArr3[i13] = primitiveArrayDeserializersLongDeserArr[i13].MediaBrowserCompatItemReceiver;
        }
        int i14 = 0;
        while (true) {
            int[] iArr2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (i14 >= iArr2.length) {
                break;
            }
            if (iArr2[i14] < PrimitiveArrayDeserializersLongDeser.write.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(PrimitiveArrayDeserializersLongDeser.write[this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver[i14]]);
                sb.append(" [");
                String string = sb.toString();
                for (int i15 = 0; i15 < i4; i15++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(dArr2[i15][i14]);
                    string = sb2.toString();
                }
            }
            i14++;
        }
        this.onPrepareFromSearch = new _deserializeUsingProperties[this.MediaBrowserCompatItemReceiver.length + 1];
        int i16 = 0;
        while (true) {
            String[] strArr3 = this.MediaBrowserCompatItemReceiver;
            if (i16 >= strArr3.length) {
                break;
            }
            String str9 = strArr3[i16];
            int i17 = 0;
            int i18 = 0;
            double[] dArr4 = null;
            double[][] dArr5 = null;
            while (i17 < i4) {
                if (primitiveArrayDeserializersLongDeserArr[i17].RemoteActionCompatParcelizer(str9)) {
                    if (dArr5 == null) {
                        dArr4 = new double[i4];
                        dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, primitiveArrayDeserializersLongDeserArr[i17].write(str9));
                    }
                    dArr = dArr2;
                    dArr4[i18] = primitiveArrayDeserializersLongDeserArr[i17].MediaBrowserCompatItemReceiver;
                    primitiveArrayDeserializersLongDeserArr[i17].write(str9, dArr5[i18], 0);
                    i18++;
                } else {
                    dArr = dArr2;
                }
                i17++;
                dArr2 = dArr;
            }
            i16++;
            this.onPrepareFromSearch[i16] = _deserializeUsingProperties.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, Arrays.copyOf(dArr4, i18), (double[][]) Arrays.copyOf(dArr5, i18));
            dArr2 = dArr2;
        }
        this.onPrepareFromSearch[0] = _deserializeUsingProperties.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem, dArr3, dArr2);
        if (primitiveArrayDeserializersLongDeserArr[0].AudioAttributesImplApi21Parcelizer != -1) {
            int[] iArr3 = new int[i4];
            double[] dArr6 = new double[i4];
            double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 2);
            for (int i19 = 0; i19 < i4; i19++) {
                iArr3[i19] = primitiveArrayDeserializersLongDeserArr[i19].AudioAttributesImplApi21Parcelizer;
                dArr6[i19] = primitiveArrayDeserializersLongDeserArr[i19].MediaBrowserCompatItemReceiver;
                dArr7[i19][0] = primitiveArrayDeserializersLongDeserArr[i19].MediaDescriptionCompat;
                dArr7[i19][1] = primitiveArrayDeserializersLongDeserArr[i19].MediaBrowserCompatMediaItem;
            }
            this.AudioAttributesImplApi26Parcelizer = _deserializeUsingProperties.RemoteActionCompatParcelizer(iArr3, dArr6, dArr7);
        }
        this.MediaBrowserCompatSearchResultReceiver = new HashMap<>();
        if (this.onPause != null) {
            float fMediaBrowserCompatSearchResultReceiver = Float.NaN;
            for (String str10 : hashSet3) {
                NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializerAudioAttributesCompatParcelizer = NumberDeserializersFloatDeserializer.AudioAttributesCompatParcelizer(str10);
                if (numberDeserializersFloatDeserializerAudioAttributesCompatParcelizer != null) {
                    if (numberDeserializersFloatDeserializerAudioAttributesCompatParcelizer.write() && Float.isNaN(fMediaBrowserCompatSearchResultReceiver)) {
                        fMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
                    }
                    numberDeserializersFloatDeserializerAudioAttributesCompatParcelizer.IconCompatParcelizer(str10);
                    this.MediaBrowserCompatSearchResultReceiver.put(str10, numberDeserializersFloatDeserializerAudioAttributesCompatParcelizer);
                }
            }
            for (NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer6 : this.onPause) {
                if (numberDeserializersNumberDeserializer6 instanceof forType) {
                    ((forType) numberDeserializersNumberDeserializer6).RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
                }
            }
            Iterator<NumberDeserializersFloatDeserializer> it2 = this.MediaBrowserCompatSearchResultReceiver.values().iterator();
            while (it2.hasNext()) {
                it2.next().RemoteActionCompatParcelizer(fMediaBrowserCompatSearchResultReceiver);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        sb.append(this.onPrepareFromUri.MediaDescriptionCompat);
        sb.append(" y: ");
        sb.append(this.onPrepareFromUri.MediaBrowserCompatMediaItem);
        sb.append(" end: x: ");
        sb.append(this.onCommand.MediaDescriptionCompat);
        sb.append(" y: ");
        sb.append(this.onCommand.MediaBrowserCompatMediaItem);
        return sb.toString();
    }

    private void write(PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser) {
        primitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer((int) this.IconCompatParcelizer.getX(), (int) this.IconCompatParcelizer.getY(), this.IconCompatParcelizer.getWidth(), this.IconCompatParcelizer.getHeight());
    }

    private void read(View view) {
        this.IconCompatParcelizer = view;
        this.RemoteActionCompatParcelizer = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            this.MediaMetadataCompat = ((ConstraintLayout.LayoutParams) layoutParams).RemoteActionCompatParcelizer();
        }
    }

    public final View MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(View view) {
        this.onPrepareFromUri.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPrepareFromUri.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPrepareFromUri.RemoteActionCompatParcelizer(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.onSeekTo.write(view);
    }

    public final void IconCompatParcelizer(_parseDouble _parsedouble, View view, int i, int i2, int i3) {
        this.onPrepareFromUri.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPrepareFromUri.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        Rect rect = new Rect();
        this.onPrepareFromUri.RemoteActionCompatParcelizer(rect.left, rect.top, rect.width(), rect.height());
        this.onSeekTo.IconCompatParcelizer(rect, view, 0, _parsedouble.IconCompatParcelizer);
    }

    private static void RemoteActionCompatParcelizer(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left;
            int i5 = rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - (((i4 + i5) + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 2) {
            int i6 = rect.left;
            int i7 = rect.right;
            rect2.left = i2 - (((rect.top + rect.bottom) + rect.width()) / 2);
            rect2.top = ((i6 + i7) - rect.height()) / 2;
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i == 3) {
            int i8 = rect.left + rect.right;
            int i9 = rect.top;
            int i10 = rect.bottom;
            rect2.left = ((rect.height() / 2) + rect.top) - (i8 / 2);
            rect2.top = i3 - ((i8 + rect.height()) / 2);
            rect2.right = rect2.left + rect.width();
            rect2.bottom = rect2.top + rect.height();
            return;
        }
        if (i != 4) {
            return;
        }
        int i11 = rect.left;
        int i12 = rect.right;
        rect2.left = i2 - (((rect.bottom + rect.top) + rect.width()) / 2);
        rect2.top = ((i11 + i12) - rect.height()) / 2;
        rect2.right = rect2.left + rect.width();
        rect2.bottom = rect2.top + rect.height();
    }

    public final void read(Rect rect, ReferenceTypeDeserializer referenceTypeDeserializer, int i, int i2) {
        int i3 = referenceTypeDeserializer.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            RemoteActionCompatParcelizer(rect, this.onRemoveQueueItemAt, i3, i, i2);
        }
        this.onPrepareFromUri.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPrepareFromUri.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        write(this.onPrepareFromUri);
        this.onPrepareFromUri.RemoteActionCompatParcelizer(rect.left, rect.top, rect.width(), rect.height());
        ReferenceTypeDeserializer.write writeVarIconCompatParcelizer = referenceTypeDeserializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        this.onPrepareFromUri.read(writeVarIconCompatParcelizer);
        this.read = writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer;
        this.onSeekTo.RemoteActionCompatParcelizer(rect, referenceTypeDeserializer, i3, this.RemoteActionCompatParcelizer);
        this.onRewind = writeVarIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer;
        this.onPrepareFromMediaId = writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer.MediaBrowserCompatMediaItem;
        this.onPlayFromUri = writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver;
        this.onPlayFromSearch = read(this.IconCompatParcelizer.getContext(), writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver, writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer, writeVarIconCompatParcelizer.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver);
    }

    private static Interpolator read(Context context, int i, String str, int i2) {
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        if (i == -1) {
            final EnumMapDeserializer enumMapDeserializerIconCompatParcelizer = EnumMapDeserializer.IconCompatParcelizer(str);
            return new Interpolator() { // from class: o.handleSingleElementUnwrapped.5
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) enumMapDeserializerIconCompatParcelizer.AudioAttributesCompatParcelizer(f);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new OvershootInterpolator();
    }

    public final void AudioAttributesCompatParcelizer(Rect rect, ReferenceTypeDeserializer referenceTypeDeserializer, int i, int i2) {
        int i3 = referenceTypeDeserializer.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            RemoteActionCompatParcelizer(rect, this.onRemoveQueueItemAt, i3, i, i2);
            rect = this.onRemoveQueueItemAt;
        }
        this.onCommand.MediaBrowserCompatItemReceiver = 1.0f;
        this.onCommand.MediaBrowserCompatCustomActionResultReceiver = 1.0f;
        write(this.onCommand);
        this.onCommand.RemoteActionCompatParcelizer(rect.left, rect.top, rect.width(), rect.height());
        this.onCommand.read(referenceTypeDeserializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer));
        this.onAddQueueItem.RemoteActionCompatParcelizer(rect, referenceTypeDeserializer, i3, this.RemoteActionCompatParcelizer);
    }

    final void AudioAttributesCompatParcelizer(View view) {
        this.onPrepareFromUri.MediaBrowserCompatItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPrepareFromUri.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.onPlayFromMediaId = true;
        this.onPrepareFromUri.RemoteActionCompatParcelizer(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.onCommand.RemoteActionCompatParcelizer(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        this.onSeekTo.write(view);
        this.onAddQueueItem.write(view);
    }

    private float AudioAttributesCompatParcelizer(float f, float[] fArr) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.AudioAttributesCompatParcelizer;
            if (f3 != 1.0d) {
                float f4 = this.write;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        EnumMapDeserializer enumMapDeserializer = this.onPrepareFromUri.AudioAttributesImplApi26Parcelizer;
        float f5 = Float.NaN;
        for (PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser : this.onFastForward) {
            if (primitiveArrayDeserializersLongDeser.AudioAttributesImplApi26Parcelizer != null) {
                if (primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver < f) {
                    enumMapDeserializer = primitiveArrayDeserializersLongDeser.AudioAttributesImplApi26Parcelizer;
                    f2 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver;
                } else if (Float.isNaN(f5)) {
                    f5 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatItemReceiver;
                }
            }
        }
        if (enumMapDeserializer == null) {
            return f;
        }
        float f6 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
        double d = (f - f2) / f6;
        float fAudioAttributesCompatParcelizer = (float) enumMapDeserializer.AudioAttributesCompatParcelizer(d);
        if (fArr != null) {
            fArr[0] = (float) enumMapDeserializer.IconCompatParcelizer(d);
        }
        return (fAudioAttributesCompatParcelizer * f6) + f2;
    }

    public final void write(boolean z) {
        if (!"button".equals(NumberDeserializersShortDeserializer.write(this.IconCompatParcelizer)) || this.onPlay == null) {
            return;
        }
        int i = 0;
        while (true) {
            PrimitiveArrayDeserializersCharDeser[] primitiveArrayDeserializersCharDeserArr = this.onPlay;
            if (i >= primitiveArrayDeserializersCharDeserArr.length) {
                return;
            }
            primitiveArrayDeserializersCharDeserArr[i].RemoteActionCompatParcelizer(z ? -100.0f : 100.0f, this.IconCompatParcelizer);
            i++;
        }
    }

    public final boolean write(View view, float f, long j, FromStringDeserializer fromStringDeserializer) {
        _parseShort.read readVar;
        boolean zRemoteActionCompatParcelizer;
        int i;
        double d;
        float interpolation;
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f, (float[]) null);
        int i2 = this.onPrepareFromMediaId;
        if (i2 != -1) {
            float f2 = 1.0f / i2;
            float fFloor = (float) Math.floor(fAudioAttributesCompatParcelizer / f2);
            float f3 = (fAudioAttributesCompatParcelizer % f2) / f2;
            if (!Float.isNaN(this.onPlayFromUri)) {
                f3 = (f3 + this.onPlayFromUri) % 1.0f;
            }
            Interpolator interpolator = this.onPlayFromSearch;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(f3);
            } else {
                interpolation = ((double) f3) > 0.5d ? 1.0f : BitmapDescriptorFactory.HUE_RED;
            }
            fAudioAttributesCompatParcelizer = (interpolation * f2) + (fFloor * f2);
        }
        float f4 = fAudioAttributesCompatParcelizer;
        HashMap<String, NumberDeserializersDoubleDeserializer> map = this.AudioAttributesImplApi21Parcelizer;
        if (map != null) {
            Iterator<NumberDeserializersDoubleDeserializer> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(view, f4);
            }
        }
        HashMap<String, _parseShort> map2 = this.onRemoveQueueItem;
        if (map2 != null) {
            readVar = null;
            boolean z = false;
            for (_parseShort _parseshort : map2.values()) {
                if (_parseshort instanceof _parseShort.read) {
                    readVar = (_parseShort.read) _parseshort;
                } else {
                    z |= _parseshort.read(view, f4, j, fromStringDeserializer);
                }
            }
            zRemoteActionCompatParcelizer = z;
        } else {
            readVar = null;
            zRemoteActionCompatParcelizer = false;
        }
        _deserializeUsingProperties[] _deserializeusingpropertiesArr = this.onPrepareFromSearch;
        if (_deserializeusingpropertiesArr != null) {
            double d2 = f4;
            _deserializeusingpropertiesArr[0].read(d2, this.handleMediaPlayPauseIfPendingOnHandler);
            this.onPrepareFromSearch[0].AudioAttributesCompatParcelizer(d2, this.onMediaButtonEvent);
            _deserializeUsingProperties _deserializeusingproperties = this.AudioAttributesImplApi26Parcelizer;
            if (_deserializeusingproperties != null) {
                double[] dArr = this.handleMediaPlayPauseIfPendingOnHandler;
                if (dArr.length > 0) {
                    _deserializeusingproperties.read(d2, dArr);
                    this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(d2, this.onMediaButtonEvent);
                }
            }
            if (this.onPlayFromMediaId) {
                d = d2;
            } else {
                d = d2;
                this.onPrepareFromUri.AudioAttributesCompatParcelizer(f4, view, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.handleMediaPlayPauseIfPendingOnHandler, this.onMediaButtonEvent, this.onCustomAction);
                this.onCustomAction = false;
            }
            if (this.onRewind != -1) {
                if (this.onSetRepeatMode == null) {
                    this.onSetRepeatMode = ((View) view.getParent()).findViewById(this.onRewind);
                }
                if (this.onSetRepeatMode != null) {
                    float top = (r1.getTop() + this.onSetRepeatMode.getBottom()) / 2.0f;
                    float left = (this.onSetRepeatMode.getLeft() + this.onSetRepeatMode.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left2 = view.getLeft();
                        float top2 = view.getTop();
                        view.setPivotX(left - left2);
                        view.setPivotY(top - top2);
                    }
                }
            }
            HashMap<String, NumberDeserializersDoubleDeserializer> map3 = this.AudioAttributesImplApi21Parcelizer;
            if (map3 != null) {
                for (NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer : map3.values()) {
                    if (numberDeserializersDoubleDeserializer instanceof NumberDeserializersDoubleDeserializer.read) {
                        double[] dArr2 = this.onMediaButtonEvent;
                        if (dArr2.length > 1) {
                            ((NumberDeserializersDoubleDeserializer.read) numberDeserializersDoubleDeserializer).write(view, f4, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (readVar != null) {
                double[] dArr3 = this.onMediaButtonEvent;
                i = 1;
                zRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer(view, fromStringDeserializer, f4, j, dArr3[0], dArr3[1]) | zRemoteActionCompatParcelizer;
            } else {
                i = 1;
            }
            int i3 = i;
            while (true) {
                _deserializeUsingProperties[] _deserializeusingpropertiesArr2 = this.onPrepareFromSearch;
                if (i3 >= _deserializeusingpropertiesArr2.length) {
                    break;
                }
                _deserializeusingpropertiesArr2[i3].AudioAttributesCompatParcelizer(d, this.onSetShuffleMode);
                NumberDeserializersCharacterDeserializer.IconCompatParcelizer(this.onPrepareFromUri.AudioAttributesCompatParcelizer.get(this.MediaBrowserCompatItemReceiver[i3 - 1]), view, this.onSetShuffleMode);
                i3++;
            }
            if (this.onSeekTo.write == 0) {
                if (f4 <= BitmapDescriptorFactory.HUE_RED) {
                    view.setVisibility(this.onSeekTo.read);
                } else if (f4 >= 1.0f) {
                    view.setVisibility(this.onAddQueueItem.read);
                } else if (this.onAddQueueItem.read != this.onSeekTo.read) {
                    view.setVisibility(0);
                }
            }
            if (this.onPlay != null) {
                int i4 = 0;
                while (true) {
                    PrimitiveArrayDeserializersCharDeser[] primitiveArrayDeserializersCharDeserArr = this.onPlay;
                    if (i4 >= primitiveArrayDeserializersCharDeserArr.length) {
                        break;
                    }
                    primitiveArrayDeserializersCharDeserArr[i4].RemoteActionCompatParcelizer(f4, view);
                    i4++;
                }
            }
        } else {
            i = 1;
            float f5 = this.onPrepareFromUri.MediaDescriptionCompat + ((this.onCommand.MediaDescriptionCompat - this.onPrepareFromUri.MediaDescriptionCompat) * f4) + 0.5f;
            int i5 = (int) f5;
            float f6 = this.onPrepareFromUri.MediaBrowserCompatMediaItem + ((this.onCommand.MediaBrowserCompatMediaItem - this.onPrepareFromUri.MediaBrowserCompatMediaItem) * f4) + 0.5f;
            int i6 = (int) f6;
            int i7 = (int) (f5 + this.onPrepareFromUri.RatingCompat + ((this.onCommand.RatingCompat - this.onPrepareFromUri.RatingCompat) * f4));
            int i8 = (int) (f6 + this.onPrepareFromUri.RemoteActionCompatParcelizer + ((this.onCommand.RemoteActionCompatParcelizer - this.onPrepareFromUri.RemoteActionCompatParcelizer) * f4));
            if (this.onCommand.RatingCompat != this.onPrepareFromUri.RatingCompat || this.onCommand.RemoteActionCompatParcelizer != this.onPrepareFromUri.RemoteActionCompatParcelizer || this.onCustomAction) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i7 - i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i8 - i6, 1073741824));
                this.onCustomAction = false;
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap<String, NumberDeserializersFloatDeserializer> map4 = this.MediaBrowserCompatSearchResultReceiver;
        if (map4 != null) {
            for (NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer : map4.values()) {
                if (numberDeserializersFloatDeserializer instanceof NumberDeserializersFloatDeserializer.RemoteActionCompatParcelizer) {
                    double[] dArr4 = this.onMediaButtonEvent;
                    ((NumberDeserializersFloatDeserializer.RemoteActionCompatParcelizer) numberDeserializersFloatDeserializer).IconCompatParcelizer(view, f4, dArr4[0], dArr4[i]);
                } else {
                    numberDeserializersFloatDeserializer.read(view, f4);
                }
            }
        }
        return zRemoteActionCompatParcelizer;
    }

    public final void write(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f, this.onSetRating);
        _deserializeUsingProperties[] _deserializeusingpropertiesArr = this.onPrepareFromSearch;
        int i = 0;
        if (_deserializeusingpropertiesArr != null) {
            double d = fAudioAttributesCompatParcelizer;
            _deserializeusingpropertiesArr[0].AudioAttributesCompatParcelizer(d, this.onMediaButtonEvent);
            this.onPrepareFromSearch[0].read(d, this.handleMediaPlayPauseIfPendingOnHandler);
            float f4 = this.onSetRating[0];
            while (true) {
                dArr = this.onMediaButtonEvent;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            _deserializeUsingProperties _deserializeusingproperties = this.AudioAttributesImplApi26Parcelizer;
            if (_deserializeusingproperties != null) {
                double[] dArr2 = this.handleMediaPlayPauseIfPendingOnHandler;
                if (dArr2.length > 0) {
                    _deserializeusingproperties.read(d, dArr2);
                    this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(d, this.onMediaButtonEvent);
                    PrimitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer(f2, f3, fArr, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onMediaButtonEvent, this.handleMediaPlayPauseIfPendingOnHandler);
                    return;
                }
                return;
            }
            PrimitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer(f2, f3, fArr, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, dArr, this.handleMediaPlayPauseIfPendingOnHandler);
            return;
        }
        float f5 = this.onCommand.MediaDescriptionCompat - this.onPrepareFromUri.MediaDescriptionCompat;
        float f6 = this.onCommand.MediaBrowserCompatMediaItem - this.onPrepareFromUri.MediaBrowserCompatMediaItem;
        float f7 = this.onCommand.RatingCompat;
        float f8 = this.onPrepareFromUri.RatingCompat;
        float f9 = this.onCommand.RemoteActionCompatParcelizer;
        float f10 = this.onPrepareFromUri.RemoteActionCompatParcelizer;
        fArr[0] = ((1.0f - f2) * f5) + (((f7 - f8) + f5) * f2);
        fArr[1] = ((1.0f - f3) * f6) + (((f9 - f10) + f6) * f3);
    }

    public final void read(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f, this.onSetRating);
        HashMap<String, NumberDeserializersDoubleDeserializer> map = this.AudioAttributesImplApi21Parcelizer;
        NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer = map == null ? null : map.get("translationX");
        HashMap<String, NumberDeserializersDoubleDeserializer> map2 = this.AudioAttributesImplApi21Parcelizer;
        NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, NumberDeserializersDoubleDeserializer> map3 = this.AudioAttributesImplApi21Parcelizer;
        NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer3 = map3 == null ? null : map3.get("rotation");
        HashMap<String, NumberDeserializersDoubleDeserializer> map4 = this.AudioAttributesImplApi21Parcelizer;
        NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, NumberDeserializersDoubleDeserializer> map5 = this.AudioAttributesImplApi21Parcelizer;
        NumberDeserializersDoubleDeserializer numberDeserializersDoubleDeserializer5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, NumberDeserializersFloatDeserializer> map6 = this.MediaBrowserCompatSearchResultReceiver;
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer = map6 == null ? null : map6.get("translationX");
        HashMap<String, NumberDeserializersFloatDeserializer> map7 = this.MediaBrowserCompatSearchResultReceiver;
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, NumberDeserializersFloatDeserializer> map8 = this.MediaBrowserCompatSearchResultReceiver;
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer3 = map8 == null ? null : map8.get("rotation");
        HashMap<String, NumberDeserializersFloatDeserializer> map9 = this.MediaBrowserCompatSearchResultReceiver;
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, NumberDeserializersFloatDeserializer> map10 = this.MediaBrowserCompatSearchResultReceiver;
        NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer5 = map10 != null ? map10.get("scaleY") : null;
        FromStringDeserializerStringBufferDeserializer fromStringDeserializerStringBufferDeserializer = new FromStringDeserializerStringBufferDeserializer();
        fromStringDeserializerStringBufferDeserializer.write();
        fromStringDeserializerStringBufferDeserializer.IconCompatParcelizer(numberDeserializersDoubleDeserializer3, fAudioAttributesCompatParcelizer);
        fromStringDeserializerStringBufferDeserializer.IconCompatParcelizer(numberDeserializersDoubleDeserializer, numberDeserializersDoubleDeserializer2, fAudioAttributesCompatParcelizer);
        fromStringDeserializerStringBufferDeserializer.write(numberDeserializersDoubleDeserializer4, numberDeserializersDoubleDeserializer5, fAudioAttributesCompatParcelizer);
        fromStringDeserializerStringBufferDeserializer.write(numberDeserializersFloatDeserializer3, fAudioAttributesCompatParcelizer);
        fromStringDeserializerStringBufferDeserializer.read(numberDeserializersFloatDeserializer, numberDeserializersFloatDeserializer2, fAudioAttributesCompatParcelizer);
        fromStringDeserializerStringBufferDeserializer.write(numberDeserializersFloatDeserializer4, numberDeserializersFloatDeserializer5, fAudioAttributesCompatParcelizer);
        _deserializeUsingProperties _deserializeusingproperties = this.AudioAttributesImplApi26Parcelizer;
        if (_deserializeusingproperties != null) {
            double[] dArr = this.handleMediaPlayPauseIfPendingOnHandler;
            if (dArr.length > 0) {
                double d = fAudioAttributesCompatParcelizer;
                _deserializeusingproperties.read(d, dArr);
                this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(d, this.onMediaButtonEvent);
                PrimitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer(f2, f3, fArr, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onMediaButtonEvent, this.handleMediaPlayPauseIfPendingOnHandler);
            }
            fromStringDeserializerStringBufferDeserializer.IconCompatParcelizer(f2, f3, i, i2, fArr);
            return;
        }
        int i3 = 0;
        if (this.onPrepareFromSearch != null) {
            double dAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fAudioAttributesCompatParcelizer, this.onSetRating);
            this.onPrepareFromSearch[0].AudioAttributesCompatParcelizer(dAudioAttributesCompatParcelizer, this.onMediaButtonEvent);
            this.onPrepareFromSearch[0].read(dAudioAttributesCompatParcelizer, this.handleMediaPlayPauseIfPendingOnHandler);
            float f4 = this.onSetRating[0];
            while (true) {
                double[] dArr2 = this.onMediaButtonEvent;
                if (i3 < dArr2.length) {
                    dArr2[i3] = dArr2[i3] * ((double) f4);
                    i3++;
                } else {
                    PrimitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer(f2, f3, fArr, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, dArr2, this.handleMediaPlayPauseIfPendingOnHandler);
                    fromStringDeserializerStringBufferDeserializer.IconCompatParcelizer(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            float f5 = this.onCommand.MediaDescriptionCompat - this.onPrepareFromUri.MediaDescriptionCompat;
            float f6 = this.onCommand.MediaBrowserCompatMediaItem - this.onPrepareFromUri.MediaBrowserCompatMediaItem;
            float f7 = this.onCommand.RatingCompat;
            NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer6 = numberDeserializersFloatDeserializer5;
            float f8 = this.onPrepareFromUri.RatingCompat;
            NumberDeserializersFloatDeserializer numberDeserializersFloatDeserializer7 = numberDeserializersFloatDeserializer4;
            float f9 = this.onCommand.RemoteActionCompatParcelizer;
            float f10 = this.onPrepareFromUri.RemoteActionCompatParcelizer;
            fArr[0] = ((1.0f - f2) * f5) + ((f5 + (f7 - f8)) * f2);
            fArr[1] = ((1.0f - f3) * f6) + (((f9 - f10) + f6) * f3);
            fromStringDeserializerStringBufferDeserializer.write();
            fromStringDeserializerStringBufferDeserializer.IconCompatParcelizer(numberDeserializersDoubleDeserializer3, fAudioAttributesCompatParcelizer);
            fromStringDeserializerStringBufferDeserializer.IconCompatParcelizer(numberDeserializersDoubleDeserializer, numberDeserializersDoubleDeserializer2, fAudioAttributesCompatParcelizer);
            fromStringDeserializerStringBufferDeserializer.write(numberDeserializersDoubleDeserializer4, numberDeserializersDoubleDeserializer5, fAudioAttributesCompatParcelizer);
            fromStringDeserializerStringBufferDeserializer.write(numberDeserializersFloatDeserializer3, fAudioAttributesCompatParcelizer);
            fromStringDeserializerStringBufferDeserializer.read(numberDeserializersFloatDeserializer, numberDeserializersFloatDeserializer2, fAudioAttributesCompatParcelizer);
            fromStringDeserializerStringBufferDeserializer.write(numberDeserializersFloatDeserializer7, numberDeserializersFloatDeserializer6, fAudioAttributesCompatParcelizer);
            fromStringDeserializerStringBufferDeserializer.IconCompatParcelizer(f2, f3, i, i2, fArr);
        }
    }

    public final int RemoteActionCompatParcelizer() {
        int iMax = this.onPrepareFromUri.IconCompatParcelizer;
        Iterator<PrimitiveArrayDeserializersLongDeser> it = this.onFastForward.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().IconCompatParcelizer);
        }
        return Math.max(iMax, this.onCommand.IconCompatParcelizer);
    }
}
