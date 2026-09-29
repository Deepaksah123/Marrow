package kotlin;

import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class needsPassthroughWorkarounds extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ ChannelMappingAudioProcessor RemoteActionCompatParcelizer;
    private /* synthetic */ ArrayList read;
    private /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public needsPassthroughWorkarounds(ChannelMappingAudioProcessor channelMappingAudioProcessor, int i, ArrayList arrayList) {
        super(1);
        this.RemoteActionCompatParcelizer = channelMappingAudioProcessor;
        this.write = i;
        this.read = arrayList;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) throws InterruptedException {
        Object obj2;
        LocationManager locationManager = this.RemoteActionCompatParcelizer.IconCompatParcelizer.read;
        toMagicModuleMetaRepoModel.write(locationManager);
        List<String> allProviders = locationManager.getAllProviders();
        toMagicModuleMetaRepoModel.write(allProviders);
        List<String> listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((Iterable) allProviders);
        ChannelMappingAudioProcessor channelMappingAudioProcessor = this.RemoteActionCompatParcelizer;
        int i = this.write;
        ArrayList arrayList = this.read;
        for (String str : listAudioAttributesImplApi26Parcelizer) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                LocationManager locationManager2 = channelMappingAudioProcessor.IconCompatParcelizer.read;
                toMagicModuleMetaRepoModel.write(locationManager2);
                obj2 = C0177getRfBanners.read(locationManager2.getLastKnownLocation(str));
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                obj2 = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            audioSinkError audiosinkerrorRemoteActionCompatParcelizer = ChannelMappingAudioProcessor.RemoteActionCompatParcelizer(channelMappingAudioProcessor, (Location) setForHeaderData.read(mayHandleBuffer.RemoteActionCompatParcelizer(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj2)), null), str, i);
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (audiosinkerrorRemoteActionCompatParcelizer != null) {
                arrayList.add(audiosinkerrorRemoteActionCompatParcelizer);
            }
        }
        return getShowPopup.INSTANCE;
    }
}
