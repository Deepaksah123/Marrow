package kotlin;

import android.location.Location;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class SilenceSkippingAudioProcessor extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ FusedLocationProviderClient AudioAttributesCompatParcelizer;
    private /* synthetic */ CurrentLocationRequest RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SilenceSkippingAudioProcessor(FusedLocationProviderClient fusedLocationProviderClient, CurrentLocationRequest currentLocationRequest) {
        super(1);
        this.AudioAttributesCompatParcelizer = fusedLocationProviderClient;
        this.RemoteActionCompatParcelizer = currentLocationRequest;
    }

    private void write(final interpolate interpolateVar) {
        FusedLocationProviderClient fusedLocationProviderClient = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(fusedLocationProviderClient);
        Task<Location> currentLocation = fusedLocationProviderClient.getCurrentLocation(this.RemoteActionCompatParcelizer, (CancellationToken) null);
        toMagicModuleMetaRepoModel.write(currentLocation);
        final OggOpusAudioPacketizer oggOpusAudioPacketizer = new OggOpusAudioPacketizer(interpolateVar);
        currentLocation.addOnSuccessListener(new OnSuccessListener() { // from class: o.parseOggPacketForPreAudioSampleByteCount
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                SilenceSkippingAudioProcessor.write(oggOpusAudioPacketizer, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.parsePacketAudioSampleCount
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                SilenceSkippingAudioProcessor.RemoteActionCompatParcelizer(interpolateVar);
            }
        });
    }

    @Override // kotlin.getAnswerMap
    public final /* synthetic */ Object invoke(Object obj) {
        write((interpolate) obj);
        return getShowPopup.INSTANCE;
    }

    public static final void write(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    public static final void RemoteActionCompatParcelizer(interpolate interpolateVar) {
        interpolateVar.IconCompatParcelizer(null);
    }
}
