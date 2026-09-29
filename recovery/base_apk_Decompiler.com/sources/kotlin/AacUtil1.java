package kotlin;

import com.fingerprintjs.android.fpjs_pro_internal.D0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class AacUtil1 extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ parseTrueHdSyncframeAudioSampleCount read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AacUtil1(parseTrueHdSyncframeAudioSampleCount parsetruehdsyncframeaudiosamplecount) {
        super(0);
        this.read = parsetruehdsyncframeaudiosamplecount;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws Throwable {
        DefaultAudioSinkApi31 codecneedsdiscardchannelsworkaround;
        parseTrueHdSyncframeAudioSampleCount parsetruehdsyncframeaudiosamplecount = this.read;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (parseAudioSpecificConfig parseaudiospecificconfig : parsetruehdsyncframeaudiosamplecount.RemoteActionCompatParcelizer) {
                int iIconCompatParcelizer = parseaudiospecificconfig.IconCompatParcelizer();
                D0 d0A = parsetruehdsyncframeaudiosamplecount.AudioAttributesCompatParcelizer.a(parseaudiospecificconfig.write());
                linkedHashMap.put(String.valueOf(iIconCompatParcelizer), d0A != null ? new Long[]{Long.valueOf(d0A.read), Long.valueOf(d0A.AudioAttributesCompatParcelizer), Long.valueOf(d0A.IconCompatParcelizer)} : null);
            }
            codecneedsdiscardchannelsworkaround = new Ac4Util(linkedHashMap);
        } catch (Throwable th) {
            codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(th);
        }
        if (codecneedsdiscardchannelsworkaround instanceof Ac4Util) {
            return (Map) ((Ac4Util) codecneedsdiscardchannelsworkaround).RemoteActionCompatParcelizer;
        }
        if (codecneedsdiscardchannelsworkaround instanceof codecNeedsDiscardChannelsWorkaround) {
            throw ((Throwable) ((codecNeedsDiscardChannelsWorkaround) codecneedsdiscardchannelsworkaround).IconCompatParcelizer);
        }
        throw new RenewEligibleCreator();
    }
}
