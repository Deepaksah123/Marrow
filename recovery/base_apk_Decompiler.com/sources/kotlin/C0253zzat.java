package kotlin;

import com.marrow2.data.pref.repo.model.WoqMarrowthonResponse;
import java.util.Date;
import kotlin.AbstractC0251zzar;

/* JADX INFO: renamed from: o.zzat, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0253zzat {
    public static final AbstractC0251zzar.AudioAttributesImplBaseParcelizer IconCompatParcelizer(WoqMarrowthonResponse woqMarrowthonResponse) {
        toMagicModuleMetaRepoModel.write(woqMarrowthonResponse, "");
        return new AbstractC0251zzar.AudioAttributesImplBaseParcelizer(woqMarrowthonResponse.getDate(), woqMarrowthonResponse.getInfo(), woqMarrowthonResponse.getLive(), woqMarrowthonResponse.getLiveTitle(), woqMarrowthonResponse.getTitle(), woqMarrowthonResponse.getUrl(), woqMarrowthonResponse.getShowBanner());
    }

    public static final AbstractC0251zzar.RemoteActionCompatParcelizer IconCompatParcelizer(proceed proceedVar) {
        toMagicModuleMetaRepoModel.write(proceedVar, "");
        return new AbstractC0251zzar.RemoteActionCompatParcelizer(!proceedVar.getWrite() && proceedVar.getAudioAttributesCompatParcelizer().length() > 0 && (proceedVar.getRemoteActionCompatParcelizer() == 0 || parseEac3SupplementalProperties.read(new Date().getTime(), proceedVar.getRemoteActionCompatParcelizer()) > 30), proceedVar.getAudioAttributesCompatParcelizer(), proceedVar.getRead());
    }

    public static final AbstractC0251zzar.MediaBrowserCompatItemReceiver AudioAttributesCompatParcelizer(getNextRepeatMode getnextrepeatmode) {
        toMagicModuleMetaRepoModel.write(getnextrepeatmode, "");
        return new AbstractC0251zzar.MediaBrowserCompatItemReceiver(getnextrepeatmode.getRead(), getnextrepeatmode.getAudioAttributesCompatParcelizer(), getnextrepeatmode.getIconCompatParcelizer(), getnextrepeatmode.getRemoteActionCompatParcelizer(), getnextrepeatmode.getWrite(), getnextrepeatmode.getAudioAttributesImplBaseParcelizer(), getnextrepeatmode.getMediaBrowserCompatItemReceiver(), getnextrepeatmode.getMediaBrowserCompatCustomActionResultReceiver(), getnextrepeatmode.getAudioAttributesImplApi26Parcelizer());
    }

    public static final AbstractC0251zzar.MediaBrowserCompatCustomActionResultReceiver RemoteActionCompatParcelizer(proceedNonBlocking proceednonblocking) {
        toMagicModuleMetaRepoModel.write(proceednonblocking, "");
        return new AbstractC0251zzar.MediaBrowserCompatCustomActionResultReceiver(proceednonblocking.getRemoteActionCompatParcelizer(), proceednonblocking.getAudioAttributesImplApi26Parcelizer(), proceednonblocking.getWrite(), proceednonblocking.getAudioAttributesImplBaseParcelizer(), proceednonblocking.getAudioAttributesCompatParcelizer(), proceednonblocking.getMediaBrowserCompatItemReceiver(), proceednonblocking.getRead());
    }

    public static final AbstractC0251zzar.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(doubleCapacityIfFull doublecapacityiffull) {
        toMagicModuleMetaRepoModel.write(doublecapacityiffull, "");
        return new AbstractC0251zzar.AudioAttributesCompatParcelizer(doublecapacityiffull.getRead(), doublecapacityiffull.getIconCompatParcelizer());
    }
}
