package kotlin;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public interface getTestModels {
    Set<getRelatedLessonId> AudioAttributesCompatParcelizer();

    Set<getRelatedLessonId> IconCompatParcelizer();

    getStartTimeStamp IconCompatParcelizer(getRelatedLessonId getrelatedlessonid);

    Collection<extract> RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid);

    Set<getRelatedLessonId> RemoteActionCompatParcelizer();

    getExpiryTimeStamp write(getRelatedLessonId getrelatedlessonid);

    public static final class AudioAttributesCompatParcelizer implements getTestModels {
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.getTestModels
        public final /* synthetic */ Collection RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            return read(getrelatedlessonid);
        }

        private static List<extract> read(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.getTestModels
        public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
            return getKycMessage.read();
        }

        @Override // kotlin.getTestModels
        public final Set<getRelatedLessonId> IconCompatParcelizer() {
            return getKycMessage.read();
        }

        @Override // kotlin.getTestModels
        public final Set<getRelatedLessonId> RemoteActionCompatParcelizer() {
            return getKycMessage.read();
        }

        @Override // kotlin.getTestModels
        public final getExpiryTimeStamp write(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return null;
        }

        @Override // kotlin.getTestModels
        public final getStartTimeStamp IconCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            return null;
        }
    }
}
