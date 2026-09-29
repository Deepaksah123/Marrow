package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getFeaturedCards {
    private final RenewEligible<VideoInfoJsonParser> AudioAttributesCompatParcelizer;
    private final RenewEligible IconCompatParcelizer;
    private final FilterParamsJsonParser RemoteActionCompatParcelizer;
    private final getVideoModels read;
    private final getSubjectDetails write;

    public getFeaturedCards(FilterParamsJsonParser filterParamsJsonParser, getVideoModels getvideomodels, RenewEligible<VideoInfoJsonParser> renewEligible) {
        toMagicModuleMetaRepoModel.write(filterParamsJsonParser, "");
        toMagicModuleMetaRepoModel.write(getvideomodels, "");
        toMagicModuleMetaRepoModel.write(renewEligible, "");
        this.RemoteActionCompatParcelizer = filterParamsJsonParser;
        this.read = getvideomodels;
        this.AudioAttributesCompatParcelizer = renewEligible;
        this.IconCompatParcelizer = renewEligible;
        this.write = new getSubjectDetails(this, getvideomodels);
    }

    public final FilterParamsJsonParser IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getVideoModels MediaBrowserCompatItemReceiver() {
        return this.read;
    }

    public final RenewEligible<VideoInfoJsonParser> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final VideoInfoJsonParser AudioAttributesCompatParcelizer() {
        return (VideoInfoJsonParser) this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final getSubjectDetails AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    public final getMini read() {
        return this.RemoteActionCompatParcelizer.onPlayFromMediaId();
    }

    public final getTopSection write() {
        return this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
    }
}
