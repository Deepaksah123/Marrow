package kotlin;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

/* JADX INFO: loaded from: classes2.dex */
public final class canReuseAudioTrack extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ DefaultAudioSinkMediaPositionParameters IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public canReuseAudioTrack(DefaultAudioSinkMediaPositionParameters defaultAudioSinkMediaPositionParameters) {
        super(1);
        this.IconCompatParcelizer = defaultAudioSinkMediaPositionParameters;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this.IconCompatParcelizer.AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(fusedLocationProviderClient);
        return (Location) TeeAudioProcessor.RemoteActionCompatParcelizer(new getBufferSizeInBytes(fusedLocationProviderClient));
    }
}
