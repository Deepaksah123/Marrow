package kotlin;

import java.io.IOException;
import kotlin.MarrowTheme;
import kotlin.ThemeAlphaConstantsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMediaSourceRtspUdpUnsupportedTransportException implements MarrowTheme {
    private getStreamPositionUsForContent RemoteActionCompatParcelizer;

    public RtspMediaSourceRtspUdpUnsupportedTransportException(getStreamPositionUsForContent getstreampositionusforcontent) {
        this.RemoteActionCompatParcelizer = getstreampositionusforcontent;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        if ("http://ip-api.com/json".equals(themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl().toString())) {
            return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer);
        }
        String sessionImpl = this.RemoteActionCompatParcelizer.setSessionImpl();
        String strR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = this.RemoteActionCompatParcelizer.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
        String[] strArrSplit = sessionImpl.split(":");
        ThemeAlphaConstantsKt.write writeVarIconCompatParcelizer = themeKtExternalSyntheticLambda0IconCompatParcelizer.getUrl().AudioAttributesImplApi21Parcelizer().read(strR8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0).IconCompatParcelizer(strArrSplit[0]);
        if (strArrSplit.length == 2) {
            writeVarIconCompatParcelizer.IconCompatParcelizer(Integer.parseInt(strArrSplit[1]));
        }
        return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(themeKtExternalSyntheticLambda0IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(writeVarIconCompatParcelizer.read()).RemoteActionCompatParcelizer());
    }
}
