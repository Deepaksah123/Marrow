package kotlin;

import com.marrow.data.models.lesson.LessonIndex;

/* JADX INFO: loaded from: classes3.dex */
public final class AdsMediaSourceAdMediaSourceHolder implements initializeWithMediaSource {
    private final onDashManifestPublishTimeExpired IconCompatParcelizer;

    public AdsMediaSourceAdMediaSourceHolder(onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired) {
        toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
        this.IconCompatParcelizer = ondashmanifestpublishtimeexpired;
    }

    @Override // kotlin.initializeWithMediaSource
    public final void AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        LessonIndex lessonIndexA_ = this.IconCompatParcelizer.a_(str);
        if (lessonIndexA_ == null || lessonIndexA_.getStatus() != 0) {
            return;
        }
        this.IconCompatParcelizer.write(str, 1);
    }
}
