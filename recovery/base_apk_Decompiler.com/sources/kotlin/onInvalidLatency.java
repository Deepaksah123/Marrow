package kotlin;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

/* JADX INFO: loaded from: classes2.dex */
public final class onInvalidLatency extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ ChannelMappingAudioProcessor AudioAttributesCompatParcelizer;
    private /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onInvalidLatency(ChannelMappingAudioProcessor channelMappingAudioProcessor, int i) {
        super(1);
        this.AudioAttributesCompatParcelizer = channelMappingAudioProcessor;
        this.IconCompatParcelizer = i;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) throws InterruptedException {
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.AudioAttributesCompatParcelizer.IconCompatParcelizer.AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(fusedLocationProviderClient);
        Location location = (Location) TeeAudioProcessor.RemoteActionCompatParcelizer(new removePitchFrames(fusedLocationProviderClient));
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return ChannelMappingAudioProcessor.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, location, getCodecOperatingRateV23.IconCompatParcelizer.write(), this.IconCompatParcelizer);
    }
}
