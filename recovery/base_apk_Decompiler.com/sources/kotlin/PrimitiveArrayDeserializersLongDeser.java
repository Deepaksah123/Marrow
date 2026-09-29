package kotlin;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.ReferenceTypeDeserializer;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveArrayDeserializersLongDeser implements Comparable<PrimitiveArrayDeserializersLongDeser> {
    static String[] write = {"position", "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, StackTraceElementDeserializer> AudioAttributesCompatParcelizer;
    int AudioAttributesImplApi21Parcelizer;
    EnumMapDeserializer AudioAttributesImplApi26Parcelizer;
    int AudioAttributesImplBaseParcelizer;
    int IconCompatParcelizer;
    float MediaBrowserCompatCustomActionResultReceiver;
    float MediaBrowserCompatItemReceiver;
    float MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private handleSingleElementUnwrapped MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    float MediaDescriptionCompat;
    private int MediaMetadataCompat;
    float RatingCompat;
    float RemoteActionCompatParcelizer;
    private double[] handleMediaPlayPauseIfPendingOnHandler;
    private float onAddQueueItem;
    private float onCommand;
    private double[] onCustomAction;
    int read;

    public PrimitiveArrayDeserializersLongDeser() {
        this.IconCompatParcelizer = 0;
        this.MediaBrowserCompatSearchResultReceiver = Float.NaN;
        this.onCommand = Float.NaN;
        this.AudioAttributesImplApi21Parcelizer = -1;
        this.read = -1;
        this.onAddQueueItem = Float.NaN;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.AudioAttributesCompatParcelizer = new LinkedHashMap<>();
        this.AudioAttributesImplBaseParcelizer = 0;
        this.onCustomAction = new double[18];
        this.handleMediaPlayPauseIfPendingOnHandler = new double[18];
    }

    private void IconCompatParcelizer(_concat _concatVar, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser2) {
        float f = _concatVar.read / 100.0f;
        this.MediaBrowserCompatItemReceiver = f;
        this.IconCompatParcelizer = _concatVar.MediaBrowserCompatCustomActionResultReceiver;
        float f2 = Float.isNaN(_concatVar.MediaDescriptionCompat) ? f : _concatVar.MediaDescriptionCompat;
        float f3 = Float.isNaN(_concatVar.AudioAttributesImplApi26Parcelizer) ? f : _concatVar.AudioAttributesImplApi26Parcelizer;
        float f4 = primitiveArrayDeserializersLongDeser2.RatingCompat;
        float f5 = primitiveArrayDeserializersLongDeser.RatingCompat;
        float f6 = primitiveArrayDeserializersLongDeser2.RemoteActionCompatParcelizer;
        float f7 = primitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver;
        float f8 = primitiveArrayDeserializersLongDeser.MediaDescriptionCompat;
        float f9 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem;
        float f10 = (primitiveArrayDeserializersLongDeser2.MediaDescriptionCompat + (f4 / 2.0f)) - ((f5 / 2.0f) + f8);
        float f11 = (primitiveArrayDeserializersLongDeser2.MediaBrowserCompatMediaItem + (f6 / 2.0f)) - ((f7 / 2.0f) + f9);
        float f12 = ((f4 - f5) * f2) / 2.0f;
        this.MediaDescriptionCompat = (int) ((f8 + (f10 * f)) - f12);
        float f13 = ((f6 - f7) * f3) / 2.0f;
        this.MediaBrowserCompatMediaItem = (int) ((f9 + (f11 * f)) - f13);
        this.RatingCompat = (int) (f5 + r7);
        this.RemoteActionCompatParcelizer = (int) (f7 + r9);
        float f14 = Float.isNaN(_concatVar.MediaMetadataCompat) ? f : _concatVar.MediaMetadataCompat;
        boolean zIsNaN = Float.isNaN(_concatVar.MediaBrowserCompatItemReceiver);
        float f15 = BitmapDescriptorFactory.HUE_RED;
        float f16 = zIsNaN ? 0.0f : _concatVar.MediaBrowserCompatItemReceiver;
        if (!Float.isNaN(_concatVar.RatingCompat)) {
            f = _concatVar.RatingCompat;
        }
        if (!Float.isNaN(_concatVar.AudioAttributesImplApi21Parcelizer)) {
            f15 = _concatVar.AudioAttributesImplApi21Parcelizer;
        }
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaDescriptionCompat = (int) (((primitiveArrayDeserializersLongDeser.MediaDescriptionCompat + (f14 * f10)) + (f15 * f11)) - f12);
        this.MediaBrowserCompatMediaItem = (int) (((primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem + (f10 * f16)) + (f11 * f)) - f13);
        this.AudioAttributesImplApi26Parcelizer = EnumMapDeserializer.IconCompatParcelizer(_concatVar.MediaBrowserCompatSearchResultReceiver);
        this.AudioAttributesImplApi21Parcelizer = _concatVar.AudioAttributesImplBaseParcelizer;
    }

    public PrimitiveArrayDeserializersLongDeser(int i, int i2, _concat _concatVar, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser2) {
        this.IconCompatParcelizer = 0;
        this.MediaBrowserCompatSearchResultReceiver = Float.NaN;
        this.onCommand = Float.NaN;
        this.AudioAttributesImplApi21Parcelizer = -1;
        this.read = -1;
        this.onAddQueueItem = Float.NaN;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.AudioAttributesCompatParcelizer = new LinkedHashMap<>();
        this.AudioAttributesImplBaseParcelizer = 0;
        this.onCustomAction = new double[18];
        this.handleMediaPlayPauseIfPendingOnHandler = new double[18];
        if (primitiveArrayDeserializersLongDeser.read != -1) {
            AudioAttributesCompatParcelizer(_concatVar, primitiveArrayDeserializersLongDeser, primitiveArrayDeserializersLongDeser2);
            return;
        }
        int i3 = _concatVar.MediaBrowserCompatMediaItem;
        if (i3 == 1) {
            write(_concatVar, primitiveArrayDeserializersLongDeser, primitiveArrayDeserializersLongDeser2);
        } else if (i3 == 2) {
            RemoteActionCompatParcelizer(i, i2, _concatVar, primitiveArrayDeserializersLongDeser, primitiveArrayDeserializersLongDeser2);
        } else {
            IconCompatParcelizer(_concatVar, primitiveArrayDeserializersLongDeser, primitiveArrayDeserializersLongDeser2);
        }
    }

    private void AudioAttributesCompatParcelizer(_concat _concatVar, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser2) {
        float fMin;
        float f;
        float f2 = _concatVar.read / 100.0f;
        this.MediaBrowserCompatItemReceiver = f2;
        this.IconCompatParcelizer = _concatVar.MediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplBaseParcelizer = _concatVar.MediaBrowserCompatMediaItem;
        float f3 = Float.isNaN(_concatVar.MediaDescriptionCompat) ? f2 : _concatVar.MediaDescriptionCompat;
        float f4 = Float.isNaN(_concatVar.AudioAttributesImplApi26Parcelizer) ? f2 : _concatVar.AudioAttributesImplApi26Parcelizer;
        float f5 = primitiveArrayDeserializersLongDeser2.RatingCompat;
        float f6 = primitiveArrayDeserializersLongDeser.RatingCompat;
        float f7 = primitiveArrayDeserializersLongDeser2.RemoteActionCompatParcelizer;
        float f8 = primitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver;
        this.RatingCompat = (int) (f6 + ((f5 - f6) * f3));
        this.RemoteActionCompatParcelizer = (int) (f8 + ((f7 - f8) * f4));
        int i = _concatVar.MediaBrowserCompatMediaItem;
        if (i == 1) {
            float f9 = Float.isNaN(_concatVar.MediaMetadataCompat) ? f2 : _concatVar.MediaMetadataCompat;
            float f10 = primitiveArrayDeserializersLongDeser2.MediaDescriptionCompat;
            float f11 = primitiveArrayDeserializersLongDeser.MediaDescriptionCompat;
            this.MediaDescriptionCompat = (f9 * (f10 - f11)) + f11;
            if (!Float.isNaN(_concatVar.RatingCompat)) {
                f2 = _concatVar.RatingCompat;
            }
            float f12 = primitiveArrayDeserializersLongDeser2.MediaBrowserCompatMediaItem;
            float f13 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatMediaItem = (f2 * (f12 - f13)) + f13;
        } else if (i == 2) {
            if (Float.isNaN(_concatVar.MediaMetadataCompat)) {
                float f14 = primitiveArrayDeserializersLongDeser2.MediaDescriptionCompat;
                float f15 = primitiveArrayDeserializersLongDeser.MediaDescriptionCompat;
                fMin = ((f14 - f15) * f2) + f15;
            } else {
                fMin = Math.min(f4, f3) * _concatVar.MediaMetadataCompat;
            }
            this.MediaDescriptionCompat = fMin;
            if (Float.isNaN(_concatVar.RatingCompat)) {
                float f16 = primitiveArrayDeserializersLongDeser2.MediaBrowserCompatMediaItem;
                float f17 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem;
                f = (f2 * (f16 - f17)) + f17;
            } else {
                f = _concatVar.RatingCompat;
            }
            this.MediaBrowserCompatMediaItem = f;
        } else {
            float f18 = Float.isNaN(_concatVar.MediaMetadataCompat) ? f2 : _concatVar.MediaMetadataCompat;
            float f19 = primitiveArrayDeserializersLongDeser2.MediaDescriptionCompat;
            float f20 = primitiveArrayDeserializersLongDeser.MediaDescriptionCompat;
            this.MediaDescriptionCompat = (f18 * (f19 - f20)) + f20;
            if (!Float.isNaN(_concatVar.RatingCompat)) {
                f2 = _concatVar.RatingCompat;
            }
            float f21 = primitiveArrayDeserializersLongDeser2.MediaBrowserCompatMediaItem;
            float f22 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatMediaItem = (f2 * (f21 - f22)) + f22;
        }
        this.read = primitiveArrayDeserializersLongDeser.read;
        this.AudioAttributesImplApi26Parcelizer = EnumMapDeserializer.IconCompatParcelizer(_concatVar.MediaBrowserCompatSearchResultReceiver);
        this.AudioAttributesImplApi21Parcelizer = _concatVar.AudioAttributesImplBaseParcelizer;
    }

    public final void RemoteActionCompatParcelizer(handleSingleElementUnwrapped handlesingleelementunwrapped, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser) {
        double d = ((this.MediaDescriptionCompat + (this.RatingCompat / 2.0f)) - primitiveArrayDeserializersLongDeser.MediaDescriptionCompat) - (primitiveArrayDeserializersLongDeser.RatingCompat / 2.0f);
        double d2 = ((this.MediaBrowserCompatMediaItem + (this.RemoteActionCompatParcelizer / 2.0f)) - primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem) - (primitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer / 2.0f);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = handlesingleelementunwrapped;
        this.MediaDescriptionCompat = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.onAddQueueItem)) {
            this.MediaBrowserCompatMediaItem = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.MediaBrowserCompatMediaItem = (float) Math.toRadians(this.onAddQueueItem);
        }
    }

    private void RemoteActionCompatParcelizer(int i, int i2, _concat _concatVar, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser2) {
        float f = _concatVar.read / 100.0f;
        this.MediaBrowserCompatItemReceiver = f;
        this.IconCompatParcelizer = _concatVar.MediaBrowserCompatCustomActionResultReceiver;
        float f2 = Float.isNaN(_concatVar.MediaDescriptionCompat) ? f : _concatVar.MediaDescriptionCompat;
        float f3 = Float.isNaN(_concatVar.AudioAttributesImplApi26Parcelizer) ? f : _concatVar.AudioAttributesImplApi26Parcelizer;
        float f4 = primitiveArrayDeserializersLongDeser2.RatingCompat;
        float f5 = primitiveArrayDeserializersLongDeser.RatingCompat;
        float f6 = primitiveArrayDeserializersLongDeser2.RemoteActionCompatParcelizer;
        float f7 = primitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver;
        float f8 = primitiveArrayDeserializersLongDeser.MediaDescriptionCompat;
        float f9 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem;
        float f10 = primitiveArrayDeserializersLongDeser2.MediaDescriptionCompat;
        float f11 = f4 / 2.0f;
        float f12 = primitiveArrayDeserializersLongDeser2.MediaBrowserCompatMediaItem;
        float f13 = f6 / 2.0f;
        float f14 = (f4 - f5) * f2;
        this.MediaDescriptionCompat = (int) ((f8 + (((f10 + f11) - ((f5 / 2.0f) + f8)) * f)) - (f14 / 2.0f));
        float f15 = (f6 - f7) * f3;
        this.MediaBrowserCompatMediaItem = (int) ((f9 + (((f12 + f13) - ((f7 / 2.0f) + f9)) * f)) - (f15 / 2.0f));
        this.RatingCompat = (int) (f5 + f14);
        this.RemoteActionCompatParcelizer = (int) (f7 + f15);
        this.AudioAttributesImplBaseParcelizer = 2;
        if (!Float.isNaN(_concatVar.MediaMetadataCompat)) {
            this.MediaDescriptionCompat = (int) (_concatVar.MediaMetadataCompat * ((int) (i - this.RatingCompat)));
        }
        if (!Float.isNaN(_concatVar.RatingCompat)) {
            this.MediaBrowserCompatMediaItem = (int) (_concatVar.RatingCompat * ((int) (i2 - this.RemoteActionCompatParcelizer)));
        }
        this.read = this.read;
        this.AudioAttributesImplApi26Parcelizer = EnumMapDeserializer.IconCompatParcelizer(_concatVar.MediaBrowserCompatSearchResultReceiver);
        this.AudioAttributesImplApi21Parcelizer = _concatVar.AudioAttributesImplBaseParcelizer;
    }

    private void write(_concat _concatVar, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser, PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser2) {
        float f = _concatVar.read / 100.0f;
        this.MediaBrowserCompatItemReceiver = f;
        this.IconCompatParcelizer = _concatVar.MediaBrowserCompatCustomActionResultReceiver;
        float f2 = Float.isNaN(_concatVar.MediaDescriptionCompat) ? f : _concatVar.MediaDescriptionCompat;
        float f3 = Float.isNaN(_concatVar.AudioAttributesImplApi26Parcelizer) ? f : _concatVar.AudioAttributesImplApi26Parcelizer;
        float f4 = primitiveArrayDeserializersLongDeser2.RatingCompat;
        float f5 = primitiveArrayDeserializersLongDeser.RatingCompat;
        float f6 = primitiveArrayDeserializersLongDeser2.RemoteActionCompatParcelizer;
        float f7 = primitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver;
        if (!Float.isNaN(_concatVar.MediaMetadataCompat)) {
            f = _concatVar.MediaMetadataCompat;
        }
        float f8 = primitiveArrayDeserializersLongDeser.MediaDescriptionCompat;
        float f9 = primitiveArrayDeserializersLongDeser.RatingCompat;
        float f10 = primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem;
        float f11 = primitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer / 2.0f;
        float f12 = (primitiveArrayDeserializersLongDeser2.MediaDescriptionCompat + (primitiveArrayDeserializersLongDeser2.RatingCompat / 2.0f)) - ((f9 / 2.0f) + f8);
        float f13 = (primitiveArrayDeserializersLongDeser2.MediaBrowserCompatMediaItem + (primitiveArrayDeserializersLongDeser2.RemoteActionCompatParcelizer / 2.0f)) - (f11 + f10);
        float f14 = f12 * f;
        float f15 = ((f4 - f5) * f2) / 2.0f;
        this.MediaDescriptionCompat = (int) ((f8 + f14) - f15);
        float f16 = f * f13;
        float f17 = ((f6 - f7) * f3) / 2.0f;
        this.MediaBrowserCompatMediaItem = (int) ((f10 + f16) - f17);
        this.RatingCompat = (int) (f9 + r7);
        this.RemoteActionCompatParcelizer = (int) (r1 + r9);
        float f18 = Float.isNaN(_concatVar.RatingCompat) ? BitmapDescriptorFactory.HUE_RED : _concatVar.RatingCompat;
        this.AudioAttributesImplBaseParcelizer = 1;
        float f19 = (int) ((primitiveArrayDeserializersLongDeser.MediaDescriptionCompat + f14) - f15);
        this.MediaDescriptionCompat = f19;
        float f20 = (int) ((primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem + f16) - f17);
        this.MediaDescriptionCompat = f19 + ((-f13) * f18);
        this.MediaBrowserCompatMediaItem = f20 + (f12 * f18);
        this.read = this.read;
        this.AudioAttributesImplApi26Parcelizer = EnumMapDeserializer.IconCompatParcelizer(_concatVar.MediaBrowserCompatSearchResultReceiver);
        this.AudioAttributesImplApi21Parcelizer = _concatVar.AudioAttributesImplBaseParcelizer;
    }

    private static boolean RemoteActionCompatParcelizer(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    final void RemoteActionCompatParcelizer(PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser, boolean[] zArr, boolean z) {
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.MediaDescriptionCompat, primitiveArrayDeserializersLongDeser.MediaDescriptionCompat);
        boolean zRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, primitiveArrayDeserializersLongDeser.MediaBrowserCompatMediaItem);
        zArr[0] = zArr[0] | RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, primitiveArrayDeserializersLongDeser.MediaBrowserCompatCustomActionResultReceiver);
        boolean z2 = z | zRemoteActionCompatParcelizer | zRemoteActionCompatParcelizer2;
        zArr[1] = zArr[1] | z2;
        zArr[2] = z2 | zArr[2];
        zArr[3] = zArr[3] | RemoteActionCompatParcelizer(this.RatingCompat, primitiveArrayDeserializersLongDeser.RatingCompat);
        zArr[4] = RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, primitiveArrayDeserializersLongDeser.RemoteActionCompatParcelizer) | zArr[4];
    }

    final void AudioAttributesCompatParcelizer(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.MediaDescriptionCompat;
        float fCos = this.MediaBrowserCompatMediaItem;
        float f2 = this.RatingCompat;
        float f3 = this.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (handlesingleelementunwrapped != null) {
            float[] fArr2 = new float[2];
            handlesingleelementunwrapped.AudioAttributesCompatParcelizer(d, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d2 = f;
            double d3 = fCos;
            float fSin = (float) ((((double) f5) + (Math.sin(d3) * d2)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d2 * Math.cos(d3))) - ((double) (f3 / 2.0f)));
            f = fSin;
        }
        fArr[i] = f + (f2 / 2.0f) + BitmapDescriptorFactory.HUE_RED;
        fArr[i + 1] = fCos + (f3 / 2.0f) + BitmapDescriptorFactory.HUE_RED;
    }

    final void read(double d, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f;
        float f2;
        float f3 = this.MediaDescriptionCompat;
        float f4 = this.MediaBrowserCompatMediaItem;
        float f5 = this.RatingCompat;
        float f6 = this.RemoteActionCompatParcelizer;
        float f7 = BitmapDescriptorFactory.HUE_RED;
        float f8 = BitmapDescriptorFactory.HUE_RED;
        float f9 = BitmapDescriptorFactory.HUE_RED;
        float f10 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < iArr.length; i++) {
            float f11 = (float) dArr[i];
            float f12 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f11;
                f8 = f12;
            } else if (i2 == 2) {
                f4 = f11;
                f10 = f12;
            } else if (i2 == 3) {
                f5 = f11;
                f7 = f12;
            } else if (i2 == 4) {
                f6 = f11;
                f9 = f12;
            }
        }
        float f13 = (f7 / 2.0f) + f8;
        float fCos = (f9 / 2.0f) + f10;
        handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (handlesingleelementunwrapped != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            handlesingleelementunwrapped.AudioAttributesCompatParcelizer(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            f = f5;
            float fSin = (float) ((((double) f14) + (Math.sin(d3) * d2)) - ((double) (f5 / 2.0f)));
            float fCos2 = (float) ((((double) f15) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
            double d4 = f16;
            double d5 = f8;
            double d6 = f10;
            float fSin2 = (float) (d4 + (Math.sin(d3) * d5) + (Math.cos(d3) * d6));
            fCos = (float) ((((double) f17) - (d5 * Math.cos(d3))) + (Math.sin(d3) * d6));
            f3 = fSin;
            f4 = fCos2;
            f13 = fSin2;
            f2 = 2.0f;
        } else {
            f = f5;
            f2 = 2.0f;
        }
        fArr[0] = f3 + (f / f2) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = f4 + (f6 / f2) + BitmapDescriptorFactory.HUE_RED;
        fArr2[0] = f13;
        fArr2[1] = fCos;
    }

    final void AudioAttributesCompatParcelizer(float f, View view, int[] iArr, double[] dArr, double[] dArr2, boolean z) {
        float fCos;
        float f2;
        View view2 = view;
        float f3 = this.MediaDescriptionCompat;
        float f4 = this.MediaBrowserCompatMediaItem;
        float f5 = this.RatingCompat;
        float f6 = this.RemoteActionCompatParcelizer;
        if (iArr.length != 0 && this.onCustomAction.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.onCustomAction = new double[i];
            this.handleMediaPlayPauseIfPendingOnHandler = new double[i];
        }
        Arrays.fill(this.onCustomAction, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr3 = this.onCustomAction;
            int i3 = iArr[i2];
            dArr3[i3] = dArr[i2];
            this.handleMediaPlayPauseIfPendingOnHandler[i3] = dArr2[i2];
        }
        float f7 = BitmapDescriptorFactory.HUE_RED;
        float f8 = f5;
        float f9 = f6;
        float f10 = Float.NaN;
        int i4 = 0;
        float f11 = 0.0f;
        float f12 = f3;
        float f13 = f4;
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (true) {
            double[] dArr4 = this.onCustomAction;
            if (i4 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i4])) {
                f2 = f13;
            } else {
                f2 = f13;
                float f16 = (float) (Double.isNaN(this.onCustomAction[i4]) ? 0.0d : this.onCustomAction[i4] + 0.0d);
                float f17 = (float) this.handleMediaPlayPauseIfPendingOnHandler[i4];
                if (i4 == 1) {
                    f13 = f2;
                    f7 = f17;
                    f12 = f16;
                } else if (i4 == 2) {
                    f14 = f17;
                    f13 = f16;
                } else if (i4 == 3) {
                    f13 = f2;
                    f15 = f17;
                    f8 = f16;
                } else if (i4 == 4) {
                    f13 = f2;
                    f11 = f17;
                    f9 = f16;
                } else if (i4 == 5) {
                    f13 = f2;
                    f10 = f16;
                }
                i4++;
            }
            f13 = f2;
            i4++;
        }
        float f18 = f13;
        handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (handlesingleelementunwrapped != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            handlesingleelementunwrapped.AudioAttributesCompatParcelizer(f, fArr, fArr2);
            float f19 = fArr[0];
            float f20 = fArr[1];
            float f21 = fArr2[0];
            float f22 = fArr2[1];
            double d = f12;
            float f23 = f10;
            double d2 = f18;
            float fSin = (float) ((((double) f19) + (Math.sin(d2) * d)) - ((double) (f8 / 2.0f)));
            fCos = (float) ((((double) f20) - (Math.cos(d2) * d)) - ((double) (f9 / 2.0f)));
            double d3 = f7;
            double d4 = f14;
            float fSin2 = (float) (((double) f21) + (Math.sin(d2) * d3) + (Math.cos(d2) * d * d4));
            float fCos2 = (float) ((((double) f22) - (d3 * Math.cos(d2))) + (Math.sin(d2) * d * d4));
            if (dArr2.length >= 2) {
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            }
            if (Float.isNaN(f23)) {
                view2 = view;
            } else {
                float degrees = (float) (((double) f23) + Math.toDegrees(Math.atan2(fCos2, fSin2)));
                view2 = view;
                view2.setRotation(degrees);
            }
            f12 = fSin;
        } else {
            if (!Float.isNaN(f10)) {
                view2.setRotation((float) (((double) f10) + Math.toDegrees(Math.atan2(f14 + (f11 / 2.0f), f7 + (f15 / 2.0f))) + 0.0d));
            }
            fCos = f18;
        }
        if (view2 instanceof NumberDeserializersPrimitiveOrWrapperDeserializer) {
            ((NumberDeserializersPrimitiveOrWrapperDeserializer) view2).AudioAttributesCompatParcelizer(f12, fCos, f8 + f12, f9 + fCos);
            return;
        }
        float f24 = f12 + 0.5f;
        int i5 = (int) f24;
        float f25 = fCos + 0.5f;
        int i6 = (int) f25;
        int i7 = (int) (f24 + f8);
        int i8 = (int) (f25 + f9);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight() || z) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view2.layout(i5, i6, i7, i8);
    }

    final void write(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.MediaDescriptionCompat;
        float fCos = this.MediaBrowserCompatMediaItem;
        float f2 = this.RatingCompat;
        float f3 = this.RemoteActionCompatParcelizer;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (handlesingleelementunwrapped != null) {
            float fWrite = handlesingleelementunwrapped.write();
            float f5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read();
            double d = fWrite;
            double d2 = f;
            double d3 = fCos;
            float fSin = (float) ((d + (Math.sin(d3) * d2)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f5) - (d2 * Math.cos(d3))) - ((double) (f3 / 2.0f)));
            f = fSin;
        }
        float f6 = f2 + f;
        float f7 = f3 + fCos;
        float f8 = f + BitmapDescriptorFactory.HUE_RED;
        fArr[0] = f8;
        float f9 = fCos + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = f9;
        float f10 = f6 + BitmapDescriptorFactory.HUE_RED;
        fArr[2] = f10;
        fArr[3] = f9;
        fArr[4] = f10;
        float f11 = f7 + BitmapDescriptorFactory.HUE_RED;
        fArr[5] = f11;
        fArr[6] = f8;
        fArr[7] = f11;
    }

    static void RemoteActionCompatParcelizer(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((f4 * BitmapDescriptorFactory.HUE_RED) / 2.0f);
        float f9 = f5 - ((f6 * BitmapDescriptorFactory.HUE_RED) / 2.0f);
        fArr[0] = ((1.0f - f) * f8) + ((f4 + f8) * f) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = ((1.0f - f2) * f9) + ((f6 + f9) * f2) + BitmapDescriptorFactory.HUE_RED;
    }

    final void IconCompatParcelizer(double[] dArr, int[] iArr) {
        float[] fArr = {this.MediaBrowserCompatCustomActionResultReceiver, this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem, this.RatingCompat, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[r0];
                i++;
            }
        }
    }

    final boolean RemoteActionCompatParcelizer(String str) {
        return this.AudioAttributesCompatParcelizer.containsKey(str);
    }

    final int write(String str) {
        StackTraceElementDeserializer stackTraceElementDeserializer = this.AudioAttributesCompatParcelizer.get(str);
        if (stackTraceElementDeserializer == null) {
            return 0;
        }
        return stackTraceElementDeserializer.RemoteActionCompatParcelizer();
    }

    final int write(String str, double[] dArr, int i) {
        StackTraceElementDeserializer stackTraceElementDeserializer = this.AudioAttributesCompatParcelizer.get(str);
        int i2 = 0;
        if (stackTraceElementDeserializer == null) {
            return 0;
        }
        if (stackTraceElementDeserializer.RemoteActionCompatParcelizer() == 1) {
            dArr[0] = stackTraceElementDeserializer.AudioAttributesCompatParcelizer();
            return 1;
        }
        int iRemoteActionCompatParcelizer = stackTraceElementDeserializer.RemoteActionCompatParcelizer();
        stackTraceElementDeserializer.write(new float[iRemoteActionCompatParcelizer]);
        while (i2 < iRemoteActionCompatParcelizer) {
            dArr[i] = r2[i2];
            i2++;
            i++;
        }
        return iRemoteActionCompatParcelizer;
    }

    final void RemoteActionCompatParcelizer(float f, float f2, float f3, float f4) {
        this.MediaDescriptionCompat = f;
        this.MediaBrowserCompatMediaItem = f2;
        this.RatingCompat = f3;
        this.RemoteActionCompatParcelizer = f4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public int compareTo(PrimitiveArrayDeserializersLongDeser primitiveArrayDeserializersLongDeser) {
        return Float.compare(this.MediaBrowserCompatCustomActionResultReceiver, primitiveArrayDeserializersLongDeser.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final void read(ReferenceTypeDeserializer.write writeVar) {
        this.AudioAttributesImplApi26Parcelizer = EnumMapDeserializer.IconCompatParcelizer(writeVar.AudioAttributesImplBaseParcelizer.MediaDescriptionCompat);
        this.AudioAttributesImplApi21Parcelizer = writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer;
        this.read = writeVar.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer;
        this.IconCompatParcelizer = writeVar.AudioAttributesImplBaseParcelizer.read;
        this.MediaMetadataCompat = writeVar.AudioAttributesImplBaseParcelizer.IconCompatParcelizer;
        this.onCommand = writeVar.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
        this.onAddQueueItem = writeVar.write.MediaBrowserCompatCustomActionResultReceiver;
        for (String str : writeVar.read.keySet()) {
            StackTraceElementDeserializer stackTraceElementDeserializer = writeVar.read.get(str);
            if (stackTraceElementDeserializer != null && stackTraceElementDeserializer.IconCompatParcelizer()) {
                this.AudioAttributesCompatParcelizer.put(str, stackTraceElementDeserializer);
            }
        }
    }
}
