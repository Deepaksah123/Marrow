package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setQbankModels implements getQbankModels {
    private setOption3AnsweredCount RemoteActionCompatParcelizer;

    @Override // kotlin.getQbankModels
    public final CourseConfigV2CustomModuleQuestionSource RemoteActionCompatParcelizer(isPaused ispaused) {
        toMagicModuleMetaRepoModel.write(ispaused, "");
        return IconCompatParcelizer().write(ispaused);
    }

    private setOption3AnsweredCount IconCompatParcelizer() {
        setOption3AnsweredCount setoption3answeredcount = this.RemoteActionCompatParcelizer;
        if (setoption3answeredcount != null) {
            return setoption3answeredcount;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        return null;
    }

    public final void IconCompatParcelizer(setOption3AnsweredCount setoption3answeredcount) {
        toMagicModuleMetaRepoModel.write(setoption3answeredcount, "");
        this.RemoteActionCompatParcelizer = setoption3answeredcount;
    }
}
