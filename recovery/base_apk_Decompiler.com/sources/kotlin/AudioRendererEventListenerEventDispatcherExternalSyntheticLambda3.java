package kotlin;

import android.location.Location;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioRendererEventListenerEventDispatcherExternalSyntheticLambda3 extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ long AudioAttributesCompatParcelizer;
    private /* synthetic */ hasPendingData read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRendererEventListenerEventDispatcherExternalSyntheticLambda3(hasPendingData haspendingdata, long j) {
        super(1);
        this.read = haspendingdata;
        this.AudioAttributesCompatParcelizer = j;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) throws InterruptedException {
        maybePrepareFile maybepreparefile = this.read.read;
        long j = this.AudioAttributesCompatParcelizer;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(maybepreparefile.AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(fusedLocationProviderClient);
        Location location = (Location) TeeAudioProcessor.RemoteActionCompatParcelizer(new SilenceSkippingAudioProcessor(fusedLocationProviderClient, new CurrentLocationRequest.Builder().setPriority(100).setDurationMillis(j).build()));
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return location;
    }
}
