package kotlin;

import java.io.IOException;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class setVideoOutputInternal implements MarrowVideoDownloadException, getAnswerMap<Throwable, getShowPopup> {
    private final toDownloadInfo RemoteActionCompatParcelizer;
    private final setStateRank<C0156TypeKt> read;

    /* JADX WARN: Multi-variable type inference failed */
    public setVideoOutputInternal(toDownloadInfo todownloadinfo, setStateRank<? super C0156TypeKt> setstaterank) {
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
        toMagicModuleMetaRepoModel.write(setstaterank, "");
        this.RemoteActionCompatParcelizer = todownloadinfo;
        this.read = setstaterank;
    }

    @Override // kotlin.getAnswerMap
    public final /* synthetic */ getShowPopup invoke(Throwable th) {
        RemoteActionCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.MarrowVideoDownloadException
    public final void read(toDownloadInfo todownloadinfo, C0156TypeKt c0156TypeKt) {
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
        toMagicModuleMetaRepoModel.write(c0156TypeKt, "");
        setStateRank<C0156TypeKt> setstaterank = this.read;
        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
        setstaterank.resumeWith(C0177getRfBanners.read(c0156TypeKt));
    }

    @Override // kotlin.MarrowVideoDownloadException
    public final void read(toDownloadInfo todownloadinfo, IOException iOException) {
        toMagicModuleMetaRepoModel.write(todownloadinfo, "");
        toMagicModuleMetaRepoModel.write(iOException, "");
        if (todownloadinfo.getCanceled()) {
            return;
        }
        setStateRank<C0156TypeKt> setstaterank = this.read;
        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
        setstaterank.resumeWith(C0177getRfBanners.read(SdkPayloadData.write(iOException)));
    }

    private void RemoteActionCompatParcelizer() {
        try {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        } catch (Throwable unused) {
        }
    }
}
