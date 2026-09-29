package kotlin;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FlacMetadataReaderFlacStreamMetadataHolder<V extends View> {
    protected final int AudioAttributesCompatParcelizer;
    private final TimeInterpolator AudioAttributesImplBaseParcelizer;
    protected final int IconCompatParcelizer;
    protected final int RemoteActionCompatParcelizer;
    private AudioAttributesImplApi26Parcelizer read;
    protected final V write;

    public FlacMetadataReaderFlacStreamMetadataHolder(V v) {
        this.write = v;
        Context context = v.getContext();
        this.AudioAttributesImplBaseParcelizer = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingStandardDecelerateInterpolator, forBuilder.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f));
        this.RemoteActionCompatParcelizer = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium2, 300);
        this.IconCompatParcelizer = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort3, 150);
        this.AudioAttributesCompatParcelizer = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort2, 100);
    }

    protected final float RemoteActionCompatParcelizer(float f) {
        return this.AudioAttributesImplBaseParcelizer.getInterpolation(f);
    }

    protected final void read(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        this.read = audioAttributesImplApi26Parcelizer;
    }

    protected final AudioAttributesImplApi26Parcelizer write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer2 = this.read;
        this.read = audioAttributesImplApi26Parcelizer;
        return audioAttributesImplApi26Parcelizer2;
    }

    public final AudioAttributesImplApi26Parcelizer IconCompatParcelizer() {
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.read;
        this.read = null;
        return audioAttributesImplApi26Parcelizer;
    }

    protected final AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer() {
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.read;
        this.read = null;
        return audioAttributesImplApi26Parcelizer;
    }
}
