package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setAnswerDescription extends getOption4 {
    protected abstract void read(getTestHeaderTitle gettestheadertitle, getTestHeaderTitle gettestheadertitle2);

    @Override // kotlin.getOption4
    public final void IconCompatParcelizer(getTestHeaderTitle gettestheadertitle, getTestHeaderTitle gettestheadertitle2) {
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        toMagicModuleMetaRepoModel.write(gettestheadertitle2, "");
        read(gettestheadertitle, gettestheadertitle2);
    }

    @Override // kotlin.getOption4
    public final void write(getTestHeaderTitle gettestheadertitle, getTestHeaderTitle gettestheadertitle2) {
        toMagicModuleMetaRepoModel.write(gettestheadertitle, "");
        toMagicModuleMetaRepoModel.write(gettestheadertitle2, "");
        read(gettestheadertitle, gettestheadertitle2);
    }
}
