package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class AddOnTaxInfoKt extends PlanAddOns {
    private final getMini IconCompatParcelizer;
    private final PageValue<getLink> read;
    private final getCreatedOnDateMs<getLink> write;

    /* JADX WARN: Multi-variable type inference failed */
    public AddOnTaxInfoKt(getMini getmini, getCreatedOnDateMs<? extends getLink> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.IconCompatParcelizer = getmini;
        this.write = getcreatedondatems;
        this.read = getmini.read(getcreatedondatems);
    }

    @Override // kotlin.PlanAddOns
    protected final getLink MediaBrowserCompatItemReceiver() {
        return this.read.invoke();
    }

    @Override // kotlin.PlanAddOns
    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.read.read();
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<getLink> {
        private /* synthetic */ AddOnTaxInfoKt AudioAttributesCompatParcelizer;
        private /* synthetic */ getCheapestPlan RemoteActionCompatParcelizer;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public getLink invoke() {
            return this.RemoteActionCompatParcelizer.read((Preference) this.AudioAttributesCompatParcelizer.write.invoke());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(getCheapestPlan getcheapestplan, AddOnTaxInfoKt addOnTaxInfoKt) {
            super(0);
            this.RemoteActionCompatParcelizer = getcheapestplan;
            this.AudioAttributesCompatParcelizer = addOnTaxInfoKt;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getLink
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public AddOnTaxInfoKt write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        return new AddOnTaxInfoKt(this.IconCompatParcelizer, new AudioAttributesCompatParcelizer(getcheapestplan, this));
    }
}
