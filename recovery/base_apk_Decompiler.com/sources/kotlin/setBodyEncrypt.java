package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setBodyEncrypt extends getIndividualPlan<setBodyEncrypt> {
    private final getQuote read;

    public setBodyEncrypt(getQuote getquote) {
        toMagicModuleMetaRepoModel.write(getquote, "");
        this.read = getquote;
    }

    public final getQuote write() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIndividualPlan
    public setBodyEncrypt RemoteActionCompatParcelizer(setBodyEncrypt setbodyencrypt) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(setbodyencrypt, this)) {
            return this;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getIndividualPlan
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public setBodyEncrypt AudioAttributesCompatParcelizer(setBodyEncrypt setbodyencrypt) {
        return setbodyencrypt == null ? this : new setBodyEncrypt(getProfilePicture.AudioAttributesCompatParcelizer(this.read, setbodyencrypt.read));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setBodyEncrypt) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((setBodyEncrypt) obj).read, this.read);
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    @Override // kotlin.getIndividualPlan
    public final isHdPlaybackError<? extends setBodyEncrypt> RemoteActionCompatParcelizer() {
        return toMagicModuleMetaDataUcModel.write(setBodyEncrypt.class);
    }
}
