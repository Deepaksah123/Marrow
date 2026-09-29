package kotlin;

import android.location.LocationManager;

/* JADX INFO: loaded from: classes2.dex */
public final class isAudioTrackDeadObject extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ DefaultAudioSinkMediaPositionParameters RemoteActionCompatParcelizer;
    private /* synthetic */ String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isAudioTrackDeadObject(DefaultAudioSinkMediaPositionParameters defaultAudioSinkMediaPositionParameters, String str) {
        super(1);
        this.RemoteActionCompatParcelizer = defaultAudioSinkMediaPositionParameters;
        this.write = str;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        LocationManager locationManager = this.RemoteActionCompatParcelizer.write;
        toMagicModuleMetaRepoModel.write(locationManager);
        return locationManager.getLastKnownLocation(this.write);
    }
}
