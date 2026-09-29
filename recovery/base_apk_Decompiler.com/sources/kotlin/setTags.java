package kotlin;

import java.util.Collection;
import java.util.Set;
import kotlin.getMcqContentBody;

/* JADX INFO: loaded from: classes4.dex */
public interface setTags extends getMcqContentBody {
    public static final RemoteActionCompatParcelizer read = RemoteActionCompatParcelizer.IconCompatParcelizer;

    Set<getRelatedLessonId> AudioAttributesCompatParcelizer();

    Collection<? extends CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp);

    Set<getRelatedLessonId> aW_();

    Set<getRelatedLessonId> aY_();

    @Override // kotlin.getMcqContentBody
    Collection<? extends CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp);

    public static final class AudioAttributesCompatParcelizer {
        public static void RemoteActionCompatParcelizer(setTags settags, getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
            toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
            toMagicModuleMetaRepoModel.write(gettimestamp, "");
            getMcqContentBody.IconCompatParcelizer.IconCompatParcelizer(settags, getrelatedlessonid, gettimestamp);
        }
    }

    public static final class write extends setStatusUpdateEndTimeMs {
        public static final write RemoteActionCompatParcelizer = new write();

        private write() {
        }

        @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
        public final Set<getRelatedLessonId> aY_() {
            return getKycMessage.read();
        }

        @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
        public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
            return getKycMessage.read();
        }

        @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
        public final Set<getRelatedLessonId> aW_() {
            return getKycMessage.read();
        }
    }

    public static final class RemoteActionCompatParcelizer {
        static final /* synthetic */ RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();
        private static final getAnswerMap<getRelatedLessonId, Boolean> write = C0148RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: o.setTags$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        static final class C0148RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<getRelatedLessonId, Boolean> {
            public static final C0148RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new C0148RemoteActionCompatParcelizer();

            private static Boolean AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
                toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
                return Boolean.TRUE;
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ Boolean invoke(getRelatedLessonId getrelatedlessonid) {
                return AudioAttributesCompatParcelizer(getrelatedlessonid);
            }

            C0148RemoteActionCompatParcelizer() {
                super(1);
            }
        }

        private RemoteActionCompatParcelizer() {
        }

        public static getAnswerMap<getRelatedLessonId, Boolean> write() {
            return write;
        }
    }
}
