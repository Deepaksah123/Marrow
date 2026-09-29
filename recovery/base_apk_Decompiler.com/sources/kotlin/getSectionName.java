package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getSectionName extends VideoInfo<dummyEditor> {
    @Override // kotlin.VideoInfo
    public final /* synthetic */ getNotesCount IconCompatParcelizer(dummyEditor dummyeditor) {
        return read2(dummyeditor);
    }

    @Override // kotlin.VideoInfo
    public final /* synthetic */ Iterable<dummyEditor> RemoteActionCompatParcelizer(dummyEditor dummyeditor) {
        return IconCompatParcelizer2(dummyeditor);
    }

    @Override // kotlin.VideoInfo
    public final /* synthetic */ Object read(dummyEditor dummyeditor) {
        return AudioAttributesCompatParcelizer(dummyeditor);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSectionName(getMediaId getmediaid) {
        super(getmediaid);
        toMagicModuleMetaRepoModel.write(getmediaid, "");
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
    private static Iterable<dummyEditor> IconCompatParcelizer2(dummyEditor dummyeditor) {
        getQuote getquoteRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(dummyeditor, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer = setLocked.RemoteActionCompatParcelizer(dummyeditor);
        return (courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer == null || (getquoteRemoteActionCompatParcelizer = courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : getquoteRemoteActionCompatParcelizer;
    }

    private static Object AudioAttributesCompatParcelizer(dummyEditor dummyeditor) {
        toMagicModuleMetaRepoModel.write(dummyeditor, "");
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer = setLocked.RemoteActionCompatParcelizer(dummyeditor);
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer);
        return courseConfigV2CustomModuleQuestionSourceRemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
    private static getNotesCount read2(dummyEditor dummyeditor) {
        toMagicModuleMetaRepoModel.write(dummyeditor, "");
        return dummyeditor.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.VideoInfo
    public Iterable<String> write(dummyEditor dummyeditor, boolean z) {
        List<String> listIconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(dummyeditor, "");
        Map<getRelatedLessonId, getMagicLine<?>> map = dummyeditor.read();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<getRelatedLessonId, getMagicLine<?>> entry : map.entrySet()) {
            getRelatedLessonId key = entry.getKey();
            getMagicLine<?> value = entry.getValue();
            if (!z || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(key, getPsshData.IconCompatParcelizer)) {
                listIconCompatParcelizer = IconCompatParcelizer(value);
            } else {
                listIconCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) listIconCompatParcelizer);
        }
        return arrayList;
    }

    private final List<String> IconCompatParcelizer(getMagicLine<?> getmagicline) {
        if (!(getmagicline instanceof getAnswerPointer)) {
            return getmagicline instanceof getMcqType ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer(((getMcqType) getmagicline).read().RemoteActionCompatParcelizer()) : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<? extends getMagicLine<?>> listAudioAttributesCompatParcelizer = ((getAnswerPointer) getmagicline).AudioAttributesCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) IconCompatParcelizer((getMagicLine<?>) it.next()));
        }
        return arrayList;
    }
}
