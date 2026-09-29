package kotlin;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes2.dex */
public class setEncoderDelay<T> {
    public PointF AudioAttributesCompatParcelizer;
    private final ExoPlayerImplExternalSyntheticLambda19 AudioAttributesImplApi21Parcelizer;
    public final float AudioAttributesImplApi26Parcelizer;
    public final Interpolator AudioAttributesImplBaseParcelizer;
    public T IconCompatParcelizer;
    public final T MediaBrowserCompatCustomActionResultReceiver;
    public final Interpolator MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private float MediaDescriptionCompat;
    private float MediaMetadataCompat;
    private float RatingCompat;
    public PointF RemoteActionCompatParcelizer;
    public final Interpolator read;
    public Float write;

    public setEncoderDelay(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.MediaDescriptionCompat = -3987645.8f;
        this.RatingCompat = -3987645.8f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 784923401;
        this.MediaBrowserCompatMediaItem = 784923401;
        this.MediaBrowserCompatSearchResultReceiver = Float.MIN_VALUE;
        this.MediaMetadataCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = exoPlayerImplExternalSyntheticLambda19;
        this.MediaBrowserCompatCustomActionResultReceiver = t;
        this.IconCompatParcelizer = t2;
        this.read = interpolator;
        this.AudioAttributesImplBaseParcelizer = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplApi26Parcelizer = f;
        this.write = f2;
    }

    public setEncoderDelay(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f) {
        this.MediaDescriptionCompat = -3987645.8f;
        this.RatingCompat = -3987645.8f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 784923401;
        this.MediaBrowserCompatMediaItem = 784923401;
        this.MediaBrowserCompatSearchResultReceiver = Float.MIN_VALUE;
        this.MediaMetadataCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = exoPlayerImplExternalSyntheticLambda19;
        this.MediaBrowserCompatCustomActionResultReceiver = t;
        this.IconCompatParcelizer = t2;
        this.read = null;
        this.AudioAttributesImplBaseParcelizer = interpolator;
        this.MediaBrowserCompatItemReceiver = interpolator2;
        this.AudioAttributesImplApi26Parcelizer = f;
        this.write = null;
    }

    public setEncoderDelay(ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.MediaDescriptionCompat = -3987645.8f;
        this.RatingCompat = -3987645.8f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 784923401;
        this.MediaBrowserCompatMediaItem = 784923401;
        this.MediaBrowserCompatSearchResultReceiver = Float.MIN_VALUE;
        this.MediaMetadataCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = exoPlayerImplExternalSyntheticLambda19;
        this.MediaBrowserCompatCustomActionResultReceiver = t;
        this.IconCompatParcelizer = t2;
        this.read = interpolator;
        this.AudioAttributesImplBaseParcelizer = interpolator2;
        this.MediaBrowserCompatItemReceiver = interpolator3;
        this.AudioAttributesImplApi26Parcelizer = f;
        this.write = f2;
    }

    public setEncoderDelay(T t) {
        this.MediaDescriptionCompat = -3987645.8f;
        this.RatingCompat = -3987645.8f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 784923401;
        this.MediaBrowserCompatMediaItem = 784923401;
        this.MediaBrowserCompatSearchResultReceiver = Float.MIN_VALUE;
        this.MediaMetadataCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.MediaBrowserCompatCustomActionResultReceiver = t;
        this.IconCompatParcelizer = t;
        this.read = null;
        this.AudioAttributesImplBaseParcelizer = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplApi26Parcelizer = Float.MIN_VALUE;
        this.write = Float.valueOf(Float.MAX_VALUE);
    }

    private setEncoderDelay(T t, T t2) {
        this.MediaDescriptionCompat = -3987645.8f;
        this.RatingCompat = -3987645.8f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 784923401;
        this.MediaBrowserCompatMediaItem = 784923401;
        this.MediaBrowserCompatSearchResultReceiver = Float.MIN_VALUE;
        this.MediaMetadataCompat = Float.MIN_VALUE;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.MediaBrowserCompatCustomActionResultReceiver = t;
        this.IconCompatParcelizer = t2;
        this.read = null;
        this.AudioAttributesImplBaseParcelizer = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.AudioAttributesImplApi26Parcelizer = Float.MIN_VALUE;
        this.write = Float.valueOf(Float.MAX_VALUE);
    }

    public static setEncoderDelay<T> write(T t, T t2) {
        return new setEncoderDelay<>(t, t2);
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19 = this.AudioAttributesImplApi21Parcelizer;
        if (exoPlayerImplExternalSyntheticLambda19 == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.MediaBrowserCompatSearchResultReceiver == Float.MIN_VALUE) {
            this.MediaBrowserCompatSearchResultReceiver = (this.AudioAttributesImplApi26Parcelizer - exoPlayerImplExternalSyntheticLambda19.MediaMetadataCompat()) / this.AudioAttributesImplApi21Parcelizer.read();
        }
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final float RemoteActionCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            return 1.0f;
        }
        if (this.MediaMetadataCompat == Float.MIN_VALUE) {
            if (this.write == null) {
                this.MediaMetadataCompat = 1.0f;
            } else {
                float fMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
                this.MediaMetadataCompat = (float) (((double) fMediaBrowserCompatCustomActionResultReceiver) + (((double) (this.write.floatValue() - this.AudioAttributesImplApi26Parcelizer)) / ((double) this.AudioAttributesImplApi21Parcelizer.read())));
            }
        }
        return this.MediaMetadataCompat;
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.read == null && this.AudioAttributesImplBaseParcelizer == null && this.MediaBrowserCompatItemReceiver == null;
    }

    public final boolean read(float f) {
        return f >= MediaBrowserCompatCustomActionResultReceiver() && f < RemoteActionCompatParcelizer();
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        if (this.MediaDescriptionCompat == -3987645.8f) {
            this.MediaDescriptionCompat = ((Float) this.MediaBrowserCompatCustomActionResultReceiver).floatValue();
        }
        return this.MediaDescriptionCompat;
    }

    public final float IconCompatParcelizer() {
        if (this.RatingCompat == -3987645.8f) {
            this.RatingCompat = ((Float) this.IconCompatParcelizer).floatValue();
        }
        return this.RatingCompat;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 784923401) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ((Integer) this.MediaBrowserCompatCustomActionResultReceiver).intValue();
        }
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int AudioAttributesCompatParcelizer() {
        if (this.MediaBrowserCompatMediaItem == 784923401) {
            this.MediaBrowserCompatMediaItem = ((Integer) this.IconCompatParcelizer).intValue();
        }
        return this.MediaBrowserCompatMediaItem;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Keyframe{startValue=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", endValue=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", startFrame=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", endFrame=");
        sb.append(this.write);
        sb.append(", interpolator=");
        sb.append(this.read);
        sb.append('}');
        return sb.toString();
    }
}
