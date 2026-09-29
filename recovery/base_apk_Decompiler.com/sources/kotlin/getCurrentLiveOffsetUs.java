package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class getCurrentLiveOffsetUs<K, A> extends ExoPlayerImplComponentListenerExternalSyntheticLambda5<K, A> {
    private final A write;

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    final float read() {
        return 1.0f;
    }

    public getCurrentLiveOffsetUs(setDrmInitData<A> setdrminitdata) {
        this(setdrminitdata, null);
    }

    public getCurrentLiveOffsetUs(setDrmInitData<A> setdrminitdata, A a) {
        super(Collections.emptyList());
        AudioAttributesCompatParcelizer(setdrminitdata);
        this.write = a;
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    public final void AudioAttributesCompatParcelizer(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    public final void AudioAttributesImplApi21Parcelizer() {
        if (this.IconCompatParcelizer != null) {
            super.AudioAttributesImplApi21Parcelizer();
        }
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    public final A AudioAttributesImplApi26Parcelizer() {
        setDrmInitData<A> setdrminitdata = this.IconCompatParcelizer;
        A a = this.write;
        return setdrminitdata.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, a, a, RemoteActionCompatParcelizer(), RemoteActionCompatParcelizer(), RemoteActionCompatParcelizer());
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    final A read(setEncoderDelay<K> setencoderdelay, float f) {
        return AudioAttributesImplApi26Parcelizer();
    }
}
