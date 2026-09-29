package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getExpiryTimeMs<T> {
    private int IconCompatParcelizer;
    private T RemoteActionCompatParcelizer;
    private final getLastAttemptedTimeMs<T> write;

    public final void IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.IconCompatParcelizer++;
        }
    }

    public final void read(T t) {
        toMagicModuleMetaRepoModel.write(t, "");
        write(t);
    }

    private void write(T t) {
        toMagicModuleMetaRepoModel.write(t, "");
        if (this.RemoteActionCompatParcelizer == null) {
            if (this.IconCompatParcelizer <= 0) {
                this.RemoteActionCompatParcelizer = t;
            } else {
                TestGroupLSModel.read((CharSequence) "[", this.IconCompatParcelizer);
                throw null;
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, T t) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(t, "");
        write(t);
    }
}
