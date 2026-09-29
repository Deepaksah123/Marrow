package kotlin;

import java.util.List;
import java.util.Map;
import kotlin.CourseConfigV2CourseStrings;
import kotlin.FilterItemRecord;
import kotlin.ImageUpload;
import kotlin.McqPearlInfo;
import kotlin.getCourseIdInt;
import kotlin.getTagType;
import kotlin.setPlans;

/* JADX INFO: loaded from: classes4.dex */
public final class setComingSoon {
    public static final read read = new read(0);
    private final getPearlId RemoteActionCompatParcelizer;

    public setComingSoon(getMini getmini, getTopSection gettopsection, McqPearlInfo mcqPearlInfo, getCompletionTimeMs getcompletiontimems, getAssociatedLessons getassociatedlessons, fromQbank fromqbank, CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig, getFirstAttemptTime getfirstattempttime, setEncryptKey setencryptkey, McqTimerAnalyticsModel mcqTimerAnalyticsModel, setPlans setplans, setStartedOn setstartedon) {
        ImageUpload imageUpload;
        getCourseIdInt getcourseidint;
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(mcqPearlInfo, "");
        toMagicModuleMetaRepoModel.write(getcompletiontimems, "");
        toMagicModuleMetaRepoModel.write(getassociatedlessons, "");
        toMagicModuleMetaRepoModel.write(fromqbank, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2PlanScreenConfig, "");
        toMagicModuleMetaRepoModel.write(getfirstattempttime, "");
        toMagicModuleMetaRepoModel.write(setencryptkey, "");
        toMagicModuleMetaRepoModel.write(mcqTimerAnalyticsModel, "");
        toMagicModuleMetaRepoModel.write(setplans, "");
        toMagicModuleMetaRepoModel.write(setstartedon, "");
        getTestTabItems gettesttabitemsWrite = gettopsection.write();
        CourseConfigV2CourseStrings courseConfigV2CourseStrings = gettesttabitemsWrite instanceof CourseConfigV2CourseStrings ? (CourseConfigV2CourseStrings) gettesttabitemsWrite : null;
        getCompletionTimeMs getcompletiontimems2 = getcompletiontimems;
        getAssociatedLessons getassociatedlessons2 = getassociatedlessons;
        fromQbank fromqbank2 = fromqbank;
        FilterItemRecord.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = FilterItemRecord.AudioAttributesCompatParcelizer.write;
        getEditionValue geteditionvalue = getEditionValue.AudioAttributesCompatParcelizer;
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        getCourseIdInt getcourseidint2 = (courseConfigV2CourseStrings == null || (getcourseidint = courseConfigV2CourseStrings.read()) == null) ? getCourseIdInt.read.RemoteActionCompatParcelizer : getcourseidint;
        ImageUpload imageUpload2 = (courseConfigV2CourseStrings == null || (imageUpload = courseConfigV2CourseStrings.read()) == null) ? ImageUpload.RemoteActionCompatParcelizer.read : imageUpload;
        getCompletedARQBankCount getcompletedarqbankcount = getCompletedARQBankCount.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = new getPearlId(getmini, gettopsection, mcqPearlInfo, getcompletiontimems2, getassociatedlessons2, fromqbank2, audioAttributesCompatParcelizer, getfirstattempttime, setencryptkey, geteditionvalue, listRemoteActionCompatParcelizer, courseConfigV2PlanScreenConfig, mcqTimerAnalyticsModel, getcourseidint2, imageUpload2, getCompletedARQBankCount.read(), setplans, new setOption7AnsweredCount(getmini, IntermediateLoginResponseBody.RemoteActionCompatParcelizer()), null, setstartedon.write(), 262144);
    }

    public final getPearlId RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static final class read {
        private read() {
        }

        public static final class AudioAttributesCompatParcelizer {
            private final setComingSoon IconCompatParcelizer;
            private final getBooleanFlags write;

            public AudioAttributesCompatParcelizer(setComingSoon setcomingsoon, getBooleanFlags getbooleanflags) {
                toMagicModuleMetaRepoModel.write(setcomingsoon, "");
                toMagicModuleMetaRepoModel.write(getbooleanflags, "");
                this.IconCompatParcelizer = setcomingsoon;
                this.write = getbooleanflags;
            }

            public final setComingSoon AudioAttributesCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final getBooleanFlags RemoteActionCompatParcelizer() {
                return this.write;
            }
        }

        public static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(getLessonActivityStatus getlessonactivitystatus, getLessonActivityStatus getlessonactivitystatus2, NestfgetmThumbnailWidth nestfgetmThumbnailWidth, String str, getFirstAttemptTime getfirstattempttime, getDisplayId getdisplayid) {
            toMagicModuleMetaRepoModel.write(getlessonactivitystatus, "");
            toMagicModuleMetaRepoModel.write(getlessonactivitystatus2, "");
            toMagicModuleMetaRepoModel.write(nestfgetmThumbnailWidth, "");
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(getfirstattempttime, "");
            toMagicModuleMetaRepoModel.write(getdisplayid, "");
            getSchemaCompletion getschemacompletion = new getSchemaCompletion("DeserializationComponentsForJava.ModuleData");
            CourseConfigV2CourseStrings courseConfigV2CourseStrings = new CourseConfigV2CourseStrings(getschemacompletion, CourseConfigV2CourseStrings.write.FROM_DEPENDENCIES);
            StringBuilder sb = new StringBuilder("<");
            sb.append(str);
            sb.append('>');
            getRelatedLessonId getrelatedlessonidAudioAttributesCompatParcelizer = getRelatedLessonId.AudioAttributesCompatParcelizer(sb.toString());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAudioAttributesCompatParcelizer, "");
            isServerContentUpdated isservercontentupdated = new isServerContentUpdated(getrelatedlessonidAudioAttributesCompatParcelizer, getschemacompletion, courseConfigV2CourseStrings, (isResumeExplanation) null, (Map) null, 56);
            courseConfigV2CourseStrings.AudioAttributesCompatParcelizer(isservercontentupdated);
            isServerContentUpdated isservercontentupdated2 = isservercontentupdated;
            courseConfigV2CourseStrings.read((getTopSection) isservercontentupdated2);
            getBooleanFlags getbooleanflags = new getBooleanFlags();
            setQbankModels setqbankmodels = new setQbankModels();
            CourseConfigV2PlanScreenConfig courseConfigV2PlanScreenConfig = new CourseConfigV2PlanScreenConfig(getschemacompletion, isservercontentupdated2);
            fromQbank fromqbank = getAverageRating.read(nestfgetmThumbnailWidth, isservercontentupdated2, getschemacompletion, courseConfigV2PlanScreenConfig, getlessonactivitystatus, getbooleanflags, getfirstattempttime, getdisplayid, setqbankmodels, getTagType.AudioAttributesCompatParcelizer.IconCompatParcelizer);
            setComingSoon setcomingsoon = getAverageRating.read(isservercontentupdated2, getschemacompletion, courseConfigV2PlanScreenConfig, fromqbank, getlessonactivitystatus, getbooleanflags, getfirstattempttime, incrementTotalCount.AudioAttributesCompatParcelizer);
            getbooleanflags.read(setcomingsoon);
            setModuleMessage setmodulemessage = setModuleMessage.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setmodulemessage, "");
            setOption3AnsweredCount setoption3answeredcount = new setOption3AnsweredCount(fromqbank, setmodulemessage);
            setqbankmodels.IconCompatParcelizer(setoption3answeredcount);
            getSearchDescription getsearchdescription = courseConfigV2CourseStrings.read();
            getSearchDescription getsearchdescription2 = courseConfigV2CourseStrings.read();
            McqPearlInfo.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = McqPearlInfo.AudioAttributesCompatParcelizer.IconCompatParcelizer;
            setPlans.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setPlans.write;
            CourseConfigV2Companion courseConfigV2Companion = new CourseConfigV2Companion(getschemacompletion, getlessonactivitystatus2, isservercontentupdated2, courseConfigV2PlanScreenConfig, getsearchdescription, getsearchdescription2, audioAttributesCompatParcelizer, setPlans.RemoteActionCompatParcelizer.write(), new setOption7AnsweredCount(getschemacompletion, IntermediateLoginResponseBody.RemoteActionCompatParcelizer()));
            isservercontentupdated.RemoteActionCompatParcelizer(isservercontentupdated);
            isservercontentupdated.read(new getBundleMap(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new CourseConfigV2QbankItem[]{setoption3answeredcount.AudioAttributesCompatParcelizer(), courseConfigV2Companion}), "CompositeProvider@RuntimeModuleData for ".concat(String.valueOf(isservercontentupdated))));
            return new AudioAttributesCompatParcelizer(setcomingsoon, getbooleanflags);
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }
}
