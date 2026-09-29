package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface setFirstAnswerIndex {
    String IconCompatParcelizer(getQuestionLimit getquestionlimit, setGuessed setguessed);

    public static final class read implements setFirstAnswerIndex {
        public static final read AudioAttributesCompatParcelizer = new read();

        private read() {
        }

        @Override // kotlin.setFirstAnswerIndex
        public final String IconCompatParcelizer(getQuestionLimit getquestionlimit, setGuessed setguessed) {
            toMagicModuleMetaRepoModel.write(getquestionlimit, "");
            toMagicModuleMetaRepoModel.write(setguessed, "");
            if (getquestionlimit instanceof getBadgeText) {
                getRelatedLessonId getrelatedlessonidAQ_ = ((getBadgeText) getquestionlimit).aQ_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
                return setguessed.read(getrelatedlessonidAQ_, false);
            }
            ArrayList arrayList = new ArrayList();
            getQuestionLimit getquestionlimitAudioAttributesImplApi21Parcelizer = getquestionlimit;
            do {
                arrayList.add(getquestionlimitAudioAttributesImplApi21Parcelizer.aQ_());
                getquestionlimitAudioAttributesImplApi21Parcelizer = getquestionlimitAudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer();
            } while (getquestionlimitAudioAttributesImplApi21Parcelizer instanceof CourseConfigV2CustomModuleQuestionSource);
            return setSillyMistake.IconCompatParcelizer((List<getRelatedLessonId>) IntermediateLoginResponseBody.MediaBrowserCompatCustomActionResultReceiver((List) arrayList));
        }
    }

    public static final class AudioAttributesCompatParcelizer implements setFirstAnswerIndex {
        public static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.setFirstAnswerIndex
        public final String IconCompatParcelizer(getQuestionLimit getquestionlimit, setGuessed setguessed) {
            toMagicModuleMetaRepoModel.write(getquestionlimit, "");
            toMagicModuleMetaRepoModel.write(setguessed, "");
            if (getquestionlimit instanceof getBadgeText) {
                getRelatedLessonId getrelatedlessonidAQ_ = ((getBadgeText) getquestionlimit).aQ_();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
                return setguessed.read(getrelatedlessonidAQ_, false);
            }
            getSlidesCount getslidescountRemoteActionCompatParcelizer = getAnswerDescription.RemoteActionCompatParcelizer(getquestionlimit);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getslidescountRemoteActionCompatParcelizer, "");
            return setguessed.IconCompatParcelizer(getslidescountRemoteActionCompatParcelizer);
        }
    }

    public static final class write implements setFirstAnswerIndex {
        public static final write IconCompatParcelizer = new write();

        private write() {
        }

        @Override // kotlin.setFirstAnswerIndex
        public final String IconCompatParcelizer(getQuestionLimit getquestionlimit, setGuessed setguessed) {
            toMagicModuleMetaRepoModel.write(getquestionlimit, "");
            toMagicModuleMetaRepoModel.write(setguessed, "");
            return write(getquestionlimit);
        }

        private final String write(getQuestionLimit getquestionlimit) {
            getRelatedLessonId getrelatedlessonidAQ_ = getquestionlimit.aQ_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
            String strRemoteActionCompatParcelizer = setSillyMistake.RemoteActionCompatParcelizer(getrelatedlessonidAQ_);
            if (!(getquestionlimit instanceof getBadgeText)) {
                getVariant getvariantAudioAttributesImplApi21Parcelizer = getquestionlimit.AudioAttributesImplApi21Parcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer, "");
                String str = read(getvariantAudioAttributesImplApi21Parcelizer);
                if (str != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('.');
                    sb.append(strRemoteActionCompatParcelizer);
                    return sb.toString();
                }
            }
            return strRemoteActionCompatParcelizer;
        }

        private final String read(getVariant getvariant) {
            if (getvariant instanceof CourseConfigV2CustomModuleQuestionSource) {
                return write((getQuestionLimit) getvariant);
            }
            if (!(getvariant instanceof getShouldShowEmptyPlanScreen)) {
                return null;
            }
            getSlidesCount getslidescountAudioAttributesImplApi26Parcelizer = ((getShouldShowEmptyPlanScreen) getvariant).IconCompatParcelizer().AudioAttributesImplApi26Parcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getslidescountAudioAttributesImplApi26Parcelizer, "");
            return setSillyMistake.IconCompatParcelizer(getslidescountAudioAttributesImplApi26Parcelizer);
        }
    }
}
