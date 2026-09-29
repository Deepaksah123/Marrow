package kotlin;

import android.location.LocationManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class registerStreamEventCallbackV29 extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ DefaultAudioSinkMediaPositionParameters IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public registerStreamEventCallbackV29(DefaultAudioSinkMediaPositionParameters defaultAudioSinkMediaPositionParameters) {
        super(1);
        this.IconCompatParcelizer = defaultAudioSinkMediaPositionParameters;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        LocationManager locationManager = this.IconCompatParcelizer.write;
        toMagicModuleMetaRepoModel.write(locationManager);
        List<String> allProviders = locationManager.getAllProviders();
        toMagicModuleMetaRepoModel.write(allProviders);
        return IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((Iterable) allProviders);
    }
}
