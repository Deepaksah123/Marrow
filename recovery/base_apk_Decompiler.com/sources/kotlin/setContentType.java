package kotlin;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setContentType extends MagicModuleUseCase implements getCreatedOnDateMs {
    public setContentType() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws SocketException {
        DefaultAudioSinkApi31 codecneedsdiscardchannelsworkaround;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        toMagicModuleMetaRepoModel.write(networkInterfaces);
        List<NetworkInterface> listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer((Iterable) Collections.list(networkInterfaces));
        ArrayList arrayList = new ArrayList();
        for (NetworkInterface networkInterface : listAudioAttributesImplApi26Parcelizer) {
            try {
                String name = networkInterface.getName();
                toMagicModuleMetaRepoModel.write((Object) name);
                codecneedsdiscardchannelsworkaround = new Ac4Util(new AudioAttributes1(name, networkInterface.isUp()));
            } catch (Throwable th) {
                codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(th);
            }
            AudioAttributes1 audioAttributes1 = (AudioAttributes1) setForHeaderData.read(codecneedsdiscardchannelsworkaround, null);
            if (audioAttributes1 != null) {
                arrayList.add(audioAttributes1);
            }
        }
        return arrayList;
    }
}
