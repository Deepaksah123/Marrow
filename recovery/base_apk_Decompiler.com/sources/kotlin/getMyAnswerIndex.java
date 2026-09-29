package kotlin;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import kotlin.getMcqContentBody;

/* JADX INFO: loaded from: classes4.dex */
public final class getMyAnswerIndex extends setOption3 {
    public static final getMyAnswerIndex RemoteActionCompatParcelizer = new getMyAnswerIndex();

    private getMyAnswerIndex() {
    }

    public static Collection<CourseConfigV2CustomModuleQuestionSource> read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        if (courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatMediaItem() != CourseConfigV2NavDrawerItems.SEALED) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        getVariant getvariantOnPlayFromMediaId = courseConfigV2CustomModuleQuestionSource.onPlayFromMediaId();
        if (getvariantOnPlayFromMediaId instanceof getShouldShowEmptyPlanScreen) {
            read(courseConfigV2CustomModuleQuestionSource, linkedHashSet, ((getShouldShowEmptyPlanScreen) getvariantOnPlayFromMediaId).write(), false);
        }
        setTags settagsOnSeekTo = courseConfigV2CustomModuleQuestionSource.onSeekTo();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settagsOnSeekTo, "");
        read(courseConfigV2CustomModuleQuestionSource, linkedHashSet, settagsOnSeekTo, true);
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) linkedHashSet, (Comparator) new read());
    }

    private static final void read(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, LinkedHashSet<CourseConfigV2CustomModuleQuestionSource> linkedHashSet, setTags settags, boolean z) {
        for (getVariant getvariant : getMcqContentBody.IconCompatParcelizer.RemoteActionCompatParcelizer(settags, setOption6AnsweredCount.RemoteActionCompatParcelizer, null, 2)) {
            if (getvariant instanceof CourseConfigV2CustomModuleQuestionSource) {
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceWrite = (CourseConfigV2CustomModuleQuestionSource) getvariant;
                if (courseConfigV2CustomModuleQuestionSourceWrite.onPause()) {
                    getRelatedLessonId getrelatedlessonidAQ_ = courseConfigV2CustomModuleQuestionSourceWrite.aQ_();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, "");
                    getQuestionLimit getquestionlimitAudioAttributesCompatParcelizer = settags.AudioAttributesCompatParcelizer(getrelatedlessonidAQ_, isCollapsible.WHEN_GET_ALL_DESCRIPTORS);
                    if (getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource) {
                        courseConfigV2CustomModuleQuestionSourceWrite = (CourseConfigV2CustomModuleQuestionSource) getquestionlimitAudioAttributesCompatParcelizer;
                    } else {
                        courseConfigV2CustomModuleQuestionSourceWrite = getquestionlimitAudioAttributesCompatParcelizer instanceof CourseConfigV2VideoProperties ? ((CourseConfigV2VideoProperties) getquestionlimitAudioAttributesCompatParcelizer).write() : null;
                    }
                }
                if (courseConfigV2CustomModuleQuestionSourceWrite != null) {
                    if (getAnswerDescription.IconCompatParcelizer(courseConfigV2CustomModuleQuestionSourceWrite, courseConfigV2CustomModuleQuestionSource)) {
                        linkedHashSet.add(courseConfigV2CustomModuleQuestionSourceWrite);
                    }
                    if (z) {
                        setTags settagsOnSeekTo = courseConfigV2CustomModuleQuestionSourceWrite.onSeekTo();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settagsOnSeekTo, "");
                        read(courseConfigV2CustomModuleQuestionSource, linkedHashSet, settagsOnSeekTo, z);
                    }
                }
            }
        }
    }

    public static final class read<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(setLocked.write((CourseConfigV2CustomModuleQuestionSource) t).RemoteActionCompatParcelizer(), setLocked.write((CourseConfigV2CustomModuleQuestionSource) t2).RemoteActionCompatParcelizer());
        }
    }
}
