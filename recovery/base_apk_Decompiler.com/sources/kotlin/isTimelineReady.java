package kotlin;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes2.dex */
public final class isTimelineReady {
    public PointF AudioAttributesCompatParcelizer;
    public float AudioAttributesImplApi21Parcelizer;
    public int AudioAttributesImplApi26Parcelizer;
    public float AudioAttributesImplBaseParcelizer;
    public float IconCompatParcelizer;
    public boolean MediaBrowserCompatCustomActionResultReceiver;
    public RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver;
    public String MediaBrowserCompatSearchResultReceiver;
    public float MediaDescriptionCompat;
    public int RatingCompat;
    public String RemoteActionCompatParcelizer;
    public int read;
    public PointF write;

    public enum RemoteActionCompatParcelizer {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public isTimelineReady(String str, String str2, float f, RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        RemoteActionCompatParcelizer(str, str2, f, remoteActionCompatParcelizer, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public isTimelineReady() {
    }

    public final void RemoteActionCompatParcelizer(String str, String str2, float f, RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.MediaBrowserCompatSearchResultReceiver = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesImplBaseParcelizer = f;
        this.MediaBrowserCompatItemReceiver = remoteActionCompatParcelizer;
        this.RatingCompat = i;
        this.AudioAttributesImplApi21Parcelizer = f2;
        this.IconCompatParcelizer = f3;
        this.read = i2;
        this.AudioAttributesImplApi26Parcelizer = i3;
        this.MediaDescriptionCompat = f4;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.write = pointF;
        this.AudioAttributesCompatParcelizer = pointF2;
    }

    public final int hashCode() {
        int iHashCode = (int) ((((this.MediaBrowserCompatSearchResultReceiver.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer);
        int iOrdinal = this.MediaBrowserCompatItemReceiver.ordinal();
        int i = this.RatingCompat;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.AudioAttributesImplApi21Parcelizer);
        return (((((((iHashCode * 31) + iOrdinal) * 31) + i) * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.read;
    }
}
