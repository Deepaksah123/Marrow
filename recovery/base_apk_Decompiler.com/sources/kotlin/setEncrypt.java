package kotlin;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setEncrypt extends setStatusUpdateEndTimeMs {
    private static /* synthetic */ isResolutionNotSupported<Object>[] write = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(setEncrypt.class), "functions", "getFunctions()Ljava/util/List;")), toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(toMagicModuleMetaDataUcModel.write(setEncrypt.class), "properties", "getProperties()Ljava/util/List;"))};
    private final PageValue AudioAttributesCompatParcelizer;
    private final CourseConfigV2CustomModuleQuestionSource IconCompatParcelizer;
    private final PageValue RemoteActionCompatParcelizer;

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final /* synthetic */ getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        write(getrelatedlessonid, gettimestamp);
        return null;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final /* synthetic */ Collection read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap getanswermap) {
        return AudioAttributesCompatParcelizer(setoption6answeredcount, (getAnswerMap<? super getRelatedLessonId, Boolean>) getanswermap);
    }

    public setEncrypt(getMini getmini, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        this.IconCompatParcelizer = courseConfigV2CustomModuleQuestionSource;
        courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer();
        getQuestionSource getquestionsource = getQuestionSource.ENUM_CLASS;
        this.AudioAttributesCompatParcelizer = getmini.read(new AudioAttributesCompatParcelizer());
        this.RemoteActionCompatParcelizer = getmini.read(new RemoteActionCompatParcelizer());
    }

    static final class AudioAttributesCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends CourseConfigV2SupportItem>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<CourseConfigV2SupportItem> invoke() {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new CourseConfigV2SupportItem[]{getOption2.read(setEncrypt.this.IconCompatParcelizer), getOption2.RemoteActionCompatParcelizer(setEncrypt.this.IconCompatParcelizer)});
        }

        AudioAttributesCompatParcelizer() {
            super(0);
        }
    }

    private final List<CourseConfigV2SupportItem> write() {
        return (List) Pearl.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, write[0]);
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getCreatedOnDateMs<List<? extends CourseConfigV2SettingsItems>> {
        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<CourseConfigV2SettingsItems> invoke() {
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(getOption2.IconCompatParcelizer(setEncrypt.this.IconCompatParcelizer));
        }

        RemoteActionCompatParcelizer() {
            super(0);
        }
    }

    private final List<CourseConfigV2SettingsItems> IconCompatParcelizer() {
        return (List) Pearl.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, write[1]);
    }

    private List<getTestHeaderTitle> AudioAttributesCompatParcelizer(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) write(), (Iterable) IconCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags, kotlin.getMcqContentBody
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public getMonthTimeStamp<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        List<CourseConfigV2SupportItem> listWrite = write();
        getMonthTimeStamp getmonthtimestamp = new getMonthTimeStamp();
        for (Object obj : listWrite) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((CourseConfigV2SupportItem) obj).aQ_(), getrelatedlessonid)) {
                getmonthtimestamp.add(obj);
            }
        }
        return getmonthtimestamp;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        List<CourseConfigV2SettingsItems> listIconCompatParcelizer = IconCompatParcelizer();
        getMonthTimeStamp getmonthtimestamp = new getMonthTimeStamp();
        for (Object obj : listIconCompatParcelizer) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((CourseConfigV2SettingsItems) obj).aQ_(), getrelatedlessonid)) {
                getmonthtimestamp.add(obj);
            }
        }
        return getmonthtimestamp;
    }

    private static Void write(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return null;
    }
}
