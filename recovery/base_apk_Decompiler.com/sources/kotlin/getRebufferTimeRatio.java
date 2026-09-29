package kotlin;

import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class getRebufferTimeRatio extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ PlayerId RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRebufferTimeRatio(PlayerId playerId) {
        super(0);
        this.RemoteActionCompatParcelizer = playerId;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        Object obj;
        PlayerId playerId = this.RemoteActionCompatParcelizer;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read((DecoderAudioRendererAudioSinkListener) playerId.write.invoke());
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        return DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
    }
}
