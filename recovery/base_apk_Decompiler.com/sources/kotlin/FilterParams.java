package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class FilterParams {
    public static final getFeaturedCards IconCompatParcelizer(getFeaturedCards getfeaturedcards, getVideoModels getvideomodels) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(getvideomodels, "");
        return new getFeaturedCards(getfeaturedcards.IconCompatParcelizer(), getvideomodels, getfeaturedcards.RemoteActionCompatParcelizer());
    }

    public static final VideoInfoJsonParser IconCompatParcelizer(getFeaturedCards getfeaturedcards, getQuote getquote) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        return getfeaturedcards.IconCompatParcelizer().AudioAttributesCompatParcelizer().IconCompatParcelizer(getfeaturedcards.AudioAttributesCompatParcelizer(), getquote);
    }

    public static final getFeaturedCards write(getFeaturedCards getfeaturedcards, FilterParamsJsonParser filterParamsJsonParser) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(filterParamsJsonParser, "");
        return new getFeaturedCards(filterParamsJsonParser, getfeaturedcards.MediaBrowserCompatItemReceiver(), getfeaturedcards.RemoteActionCompatParcelizer());
    }

    private static final getFeaturedCards write(getFeaturedCards getfeaturedcards, getVariant getvariant, setResultAvailable setresultavailable, int i, RenewEligible<VideoInfoJsonParser> renewEligible) {
        HomeMainModel homeMainModelMediaBrowserCompatItemReceiver;
        FilterParamsJsonParser filterParamsJsonParserIconCompatParcelizer = getfeaturedcards.IconCompatParcelizer();
        if (setresultavailable != null) {
            homeMainModelMediaBrowserCompatItemReceiver = new HomeMainModel(getfeaturedcards, getvariant, setresultavailable, i);
        } else {
            homeMainModelMediaBrowserCompatItemReceiver = getfeaturedcards.MediaBrowserCompatItemReceiver();
        }
        return new getFeaturedCards(filterParamsJsonParserIconCompatParcelizer, homeMainModelMediaBrowserCompatItemReceiver, renewEligible);
    }

    public static final getFeaturedCards IconCompatParcelizer(getFeaturedCards getfeaturedcards, getVariant getvariant, setResultAvailable setresultavailable, int i) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(getvariant, "");
        toMagicModuleMetaRepoModel.write(setresultavailable, "");
        return write(getfeaturedcards, getvariant, setresultavailable, i, getfeaturedcards.RemoteActionCompatParcelizer());
    }

    public static /* synthetic */ getFeaturedCards AudioAttributesCompatParcelizer(getFeaturedCards getfeaturedcards, getCategory getcategory, setResultAvailable setresultavailable, int i) {
        if ((i & 2) != 0) {
            setresultavailable = null;
        }
        return read(getfeaturedcards, getcategory, setresultavailable, 0);
    }

    static final class write extends MagicModuleUseCase implements getCreatedOnDateMs<VideoInfoJsonParser> {
        private /* synthetic */ getCategory RemoteActionCompatParcelizer;
        private /* synthetic */ getFeaturedCards write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public VideoInfoJsonParser invoke() {
            return FilterParams.IconCompatParcelizer(this.write, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(getFeaturedCards getfeaturedcards, getCategory getcategory) {
            super(0);
            this.write = getfeaturedcards;
            this.RemoteActionCompatParcelizer = getcategory;
        }
    }

    private static getFeaturedCards read(getFeaturedCards getfeaturedcards, getCategory getcategory, setResultAvailable setresultavailable, int i) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(getcategory, "");
        return write(getfeaturedcards, getcategory, setresultavailable, 0, getRenewExpiresOn.write(RenewEligibleCompanion.read, new write(getfeaturedcards, getcategory)));
    }

    public static final getFeaturedCards AudioAttributesCompatParcelizer(getFeaturedCards getfeaturedcards, getQuote getquote) {
        toMagicModuleMetaRepoModel.write(getfeaturedcards, "");
        toMagicModuleMetaRepoModel.write(getquote, "");
        return getquote.RemoteActionCompatParcelizer() ? getfeaturedcards : new getFeaturedCards(getfeaturedcards.IconCompatParcelizer(), getfeaturedcards.MediaBrowserCompatItemReceiver(), getRenewExpiresOn.write(RenewEligibleCompanion.read, new read(getfeaturedcards, getquote)));
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<VideoInfoJsonParser> {
        private /* synthetic */ getQuote AudioAttributesCompatParcelizer;
        private /* synthetic */ getFeaturedCards RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public VideoInfoJsonParser invoke() {
            return FilterParams.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(getFeaturedCards getfeaturedcards, getQuote getquote) {
            super(0);
            this.RemoteActionCompatParcelizer = getfeaturedcards;
            this.AudioAttributesCompatParcelizer = getquote;
        }
    }
}
