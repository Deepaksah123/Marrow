package kotlin;

import kotlin.C0177getRfBanners;
import kotlin.newPrevYearTestContainer;

/* JADX INFO: loaded from: classes2.dex */
public final class getEncodingAndChannelConfigForPassthrough extends MagicModuleUseCase implements getAnswerMap {
    public static final getEncodingAndChannelConfigForPassthrough read = new getEncodingAndChannelConfigForPassthrough();

    public getEncodingAndChannelConfigForPassthrough() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        Object obj2;
        newPrevYearTestContainer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (newPrevYearTestContainer.RemoteActionCompatParcelizer) obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj2 = C0177getRfBanners.read(new decoderInitialized(remoteActionCompatParcelizer.IconCompatParcelizer().write().get(1), remoteActionCompatParcelizer.IconCompatParcelizer().write().get(2)));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj2 = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        return (decoderInitialized) setForHeaderData.read(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj2), null);
    }
}
