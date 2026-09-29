package kotlin;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getCheapestPlan extends isImagePearl {
    public abstract Collection<getLink> IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource);

    public abstract boolean IconCompatParcelizer(getTopSection gettopsection);

    public abstract getLink read(Preference preference);

    public abstract CourseConfigV2CustomModuleQuestionSource write(RevisionSubjectStatusModel revisionSubjectStatusModel);

    public abstract getQuestionLimit write(getVariant getvariant);

    public static final class read extends getCheapestPlan {
        public static final read write = new read();

        private read() {
        }

        @Override // kotlin.isImagePearl
        public final /* synthetic */ Preference IconCompatParcelizer(Preference preference) {
            return read(preference);
        }

        @Override // kotlin.getCheapestPlan
        public final /* synthetic */ getQuestionLimit write(getVariant getvariant) {
            IconCompatParcelizer(getvariant);
            return null;
        }

        @Override // kotlin.getCheapestPlan
        public final getLink read(Preference preference) {
            toMagicModuleMetaRepoModel.write(preference, "");
            return (getLink) preference;
        }

        @Override // kotlin.getCheapestPlan
        public final Collection<getLink> IconCompatParcelizer(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
            toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
            Collection<getLink> collectionAV_ = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatSearchResultReceiver().aV_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(collectionAV_, "");
            return collectionAV_;
        }

        @Override // kotlin.getCheapestPlan
        public final CourseConfigV2CustomModuleQuestionSource write(RevisionSubjectStatusModel revisionSubjectStatusModel) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            return null;
        }

        @Override // kotlin.getCheapestPlan
        public final boolean IconCompatParcelizer(getTopSection gettopsection) {
            toMagicModuleMetaRepoModel.write(gettopsection, "");
            return false;
        }

        private static CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer(getVariant getvariant) {
            toMagicModuleMetaRepoModel.write(getvariant, "");
            return null;
        }
    }
}
