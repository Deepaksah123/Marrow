package kotlin;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public final class setOption5AnsweredCount implements setTags {
    public static final RemoteActionCompatParcelizer RemoteActionCompatParcelizer = new RemoteActionCompatParcelizer(0);
    private final String AudioAttributesCompatParcelizer;
    private final setTags[] write;

    private setOption5AnsweredCount(String str, setTags[] settagsArr) {
        this.AudioAttributesCompatParcelizer = str;
        this.write = settagsArr;
    }

    @Override // kotlin.getMcqContentBody
    public final getQuestionLimit AudioAttributesCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        getQuestionLimit getquestionlimit = null;
        for (setTags settags : this.write) {
            getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = settags.AudioAttributesCompatParcelizer(getrelatedlessonid, gettimestamp);
            if (getquestionlimitAudioAttributesCompatParcelizer != null) {
                if (!(getquestionlimitAudioAttributesCompatParcelizer instanceof getBadge) || !((getBadge) getquestionlimitAudioAttributesCompatParcelizer).onPause()) {
                    return getquestionlimitAudioAttributesCompatParcelizer;
                }
                if (getquestionlimit == null) {
                    getquestionlimit = getquestionlimitAudioAttributesCompatParcelizer;
                }
            }
        }
        return getquestionlimit;
    }

    @Override // kotlin.setTags
    public final Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        setTags[] settagsArr = this.write;
        int length = settagsArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return settagsArr[0].IconCompatParcelizer(getrelatedlessonid, gettimestamp);
        }
        Collection<CourseConfigV2SettingsItems> collectionWrite = null;
        for (setTags settags : settagsArr) {
            collectionWrite = UpdatedStatus.write(collectionWrite, settags.IconCompatParcelizer(getrelatedlessonid, gettimestamp));
        }
        return collectionWrite == null ? getKycMessage.read() : collectionWrite;
    }

    @Override // kotlin.setTags, kotlin.getMcqContentBody
    public final Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        setTags[] settagsArr = this.write;
        int length = settagsArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return settagsArr[0].read(getrelatedlessonid, gettimestamp);
        }
        Collection<CourseConfigV2SupportItem> collectionWrite = null;
        for (setTags settags : settagsArr) {
            collectionWrite = UpdatedStatus.write(collectionWrite, settags.read(getrelatedlessonid, gettimestamp));
        }
        return collectionWrite == null ? getKycMessage.read() : collectionWrite;
    }

    @Override // kotlin.getMcqContentBody
    public final Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        setTags[] settagsArr = this.write;
        int length = settagsArr.length;
        if (length == 0) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (length == 1) {
            return settagsArr[0].read(setoption6answeredcount, getanswermap);
        }
        Collection<getVariant> collectionWrite = null;
        for (setTags settags : settagsArr) {
            collectionWrite = UpdatedStatus.write(collectionWrite, settags.read(setoption6answeredcount, getanswermap));
        }
        return collectionWrite == null ? getKycMessage.read() : collectionWrite;
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> aY_() {
        setTags[] settagsArr = this.write;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (setTags settags : settagsArr) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) settags.aY_());
        }
        return linkedHashSet;
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> AudioAttributesCompatParcelizer() {
        setTags[] settagsArr = this.write;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (setTags settags : settagsArr) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) settags.AudioAttributesCompatParcelizer());
        }
        return linkedHashSet;
    }

    @Override // kotlin.setTags
    public final Set<getRelatedLessonId> aW_() {
        return setMcqIdFromResponse.RemoteActionCompatParcelizer(getOrderDetails.RemoteActionCompatParcelizer(this.write));
    }

    @Override // kotlin.getMcqContentBody
    public final void RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        for (setTags settags : this.write) {
            settags.RemoteActionCompatParcelizer(getrelatedlessonid, gettimestamp);
        }
    }

    public final String toString() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static setTags RemoteActionCompatParcelizer(String str, Iterable<? extends setTags> iterable) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(iterable, "");
            getMonthTimeStamp getmonthtimestamp = new getMonthTimeStamp();
            for (setTags settags : iterable) {
                if (settags != setTags.write.RemoteActionCompatParcelizer) {
                    if (settags instanceof setOption5AnsweredCount) {
                        IntermediateLoginResponseBody.read((Collection) getmonthtimestamp, (Object[]) ((setOption5AnsweredCount) settags).write);
                    } else {
                        getmonthtimestamp.add(settags);
                    }
                }
            }
            return AudioAttributesCompatParcelizer(str, getmonthtimestamp);
        }

        public static setTags AudioAttributesCompatParcelizer(String str, List<? extends setTags> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            int size = list.size();
            if (size == 0) {
                return setTags.write.RemoteActionCompatParcelizer;
            }
            byte b = 0;
            if (size == 1) {
                return list.get(0);
            }
            return new setOption5AnsweredCount(str, (setTags[]) list.toArray(new setTags[0]), b);
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public /* synthetic */ setOption5AnsweredCount(String str, setTags[] settagsArr, byte b) {
        this(str, settagsArr);
    }
}
