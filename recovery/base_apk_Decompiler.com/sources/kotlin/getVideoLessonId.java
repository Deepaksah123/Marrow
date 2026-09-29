package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getVideoLessonId<K, T> extends Subject<K, T> {
    private setSearchTimes<T> IconCompatParcelizer;

    private getVideoLessonId(setSearchTimes<T> setsearchtimes) {
        toMagicModuleMetaRepoModel.write(setsearchtimes, "");
        this.IconCompatParcelizer = setsearchtimes;
    }

    @Override // kotlin.Subject
    protected final setSearchTimes<T> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public getVideoLessonId() {
        getUpdatedStatus getupdatedstatus = getUpdatedStatus.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.read(getupdatedstatus, "");
        this(getupdatedstatus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.Subject
    protected final void AudioAttributesCompatParcelizer(isHdPlaybackError<? extends K> ishdplaybackerror, T t) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        toMagicModuleMetaRepoModel.write(t, "");
        int iAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(ishdplaybackerror);
        int iRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (iRemoteActionCompatParcelizer == 0) {
            this.IconCompatParcelizer = new setIconThumbnail(t, iAudioAttributesCompatParcelizer);
            return;
        }
        if (iRemoteActionCompatParcelizer == 1) {
            setSearchTimes<T> setsearchtimes = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.read(setsearchtimes, "");
            setIconThumbnail seticonthumbnail = (setIconThumbnail) setsearchtimes;
            if (seticonthumbnail.IconCompatParcelizer() == iAudioAttributesCompatParcelizer) {
                this.IconCompatParcelizer = new setIconThumbnail(t, iAudioAttributesCompatParcelizer);
                return;
            } else {
                getIconThumbnail geticonthumbnail = new getIconThumbnail();
                this.IconCompatParcelizer = geticonthumbnail;
                geticonthumbnail.AudioAttributesCompatParcelizer(seticonthumbnail.IconCompatParcelizer(), seticonthumbnail.AudioAttributesCompatParcelizer());
            }
        }
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer, t);
    }
}
