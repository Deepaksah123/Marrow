package kotlin;

import android.location.Location;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class getBufferSizeInBytes extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ FusedLocationProviderClient IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getBufferSizeInBytes(FusedLocationProviderClient fusedLocationProviderClient) {
        super(1);
        this.IconCompatParcelizer = fusedLocationProviderClient;
    }

    private void AudioAttributesCompatParcelizer(final interpolate interpolateVar) {
        FusedLocationProviderClient fusedLocationProviderClient = this.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(fusedLocationProviderClient);
        Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
        toMagicModuleMetaRepoModel.write(lastLocation);
        final shouldApplyAudioProcessorPlaybackParameters shouldapplyaudioprocessorplaybackparameters = new shouldApplyAudioProcessorPlaybackParameters(interpolateVar);
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: o.DefaultAudioSinkBuilder
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                getBufferSizeInBytes.write(shouldapplyaudioprocessorplaybackparameters, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.setAudioCapabilities
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                getBufferSizeInBytes.IconCompatParcelizer(interpolateVar);
            }
        });
    }

    @Override // kotlin.getAnswerMap
    public final /* synthetic */ Object invoke(Object obj) {
        AudioAttributesCompatParcelizer((interpolate) obj);
        return getShowPopup.INSTANCE;
    }

    public static final void write(getAnswerMap getanswermap, Object obj) {
        getanswermap.invoke(obj);
    }

    public static final void IconCompatParcelizer(interpolate interpolateVar) {
        interpolateVar.IconCompatParcelizer(null);
    }
}
