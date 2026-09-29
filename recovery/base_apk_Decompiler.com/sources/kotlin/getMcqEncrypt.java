package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.setOption5AnsweredCount;

/* JADX INFO: loaded from: classes4.dex */
public final class getMcqEncrypt extends setOption8AnsweredCount {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(0);
    private final setTags RemoteActionCompatParcelizer;
    private final String write;

    private getMcqEncrypt(String str, setTags settags) {
        this.write = str;
        this.RemoteActionCompatParcelizer = settags;
    }

    @Override // kotlin.setOption8AnsweredCount
    protected final setTags write() {
        return this.RemoteActionCompatParcelizer;
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<CourseConfigV2SupportItem, getVideoPageNotesTitle> {
        public static final write read = new write();

        private static getVideoPageNotesTitle read(CourseConfigV2SupportItem courseConfigV2SupportItem) {
            toMagicModuleMetaRepoModel.write(courseConfigV2SupportItem, "");
            return courseConfigV2SupportItem;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getVideoPageNotesTitle invoke(CourseConfigV2SupportItem courseConfigV2SupportItem) {
            return read(courseConfigV2SupportItem);
        }

        write() {
            super(1);
        }
    }

    @Override // kotlin.setOption8AnsweredCount, kotlin.setTags, kotlin.getMcqContentBody
    public final Collection<CourseConfigV2SupportItem> read(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return setOption1.write(super.read(getrelatedlessonid, gettimestamp), write.read);
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<CourseConfigV2SettingsItems, getVideoPageNotesTitle> {
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer();

        private static getVideoPageNotesTitle AudioAttributesCompatParcelizer(CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
            toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
            return courseConfigV2SettingsItems;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getVideoPageNotesTitle invoke(CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
            return AudioAttributesCompatParcelizer(courseConfigV2SettingsItems);
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    @Override // kotlin.setOption8AnsweredCount, kotlin.setTags
    public final Collection<CourseConfigV2SettingsItems> IconCompatParcelizer(getRelatedLessonId getrelatedlessonid, getTimeStamp gettimestamp) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        toMagicModuleMetaRepoModel.write(gettimestamp, "");
        return setOption1.write(super.IconCompatParcelizer(getrelatedlessonid, gettimestamp), IconCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.setOption8AnsweredCount, kotlin.getMcqContentBody
    public final Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        Collection<getVariant> collection = super.read(setoption6answeredcount, getanswermap);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collection) {
            if (((getVariant) obj) instanceof getVideoPageNotesTitle) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.RemoteActionCompatParcelizer();
        List list2 = (List) pair.read();
        toMagicModuleMetaRepoModel.read(list, "");
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(setOption1.write(list, read.IconCompatParcelizer), (Iterable) list2);
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<getVideoPageNotesTitle, getVideoPageNotesTitle> {
        public static final read IconCompatParcelizer = new read();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getVideoPageNotesTitle invoke(getVideoPageNotesTitle getvideopagenotestitle) {
            return read(getvideopagenotestitle);
        }

        read() {
            super(1);
        }

        private static getVideoPageNotesTitle read(getVideoPageNotesTitle getvideopagenotestitle) {
            toMagicModuleMetaRepoModel.write(getvideopagenotestitle, "");
            return getvideopagenotestitle;
        }
    }

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static setTags AudioAttributesCompatParcelizer(String str, Collection<? extends getLink> collection) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(collection, "");
            Collection<? extends getLink> collection2 = collection;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(collection2, 10));
            Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((getLink) it.next()).read());
            }
            getMonthTimeStamp<setTags> getmonthtimestampIconCompatParcelizer = UpdatedStatus.IconCompatParcelizer(arrayList);
            setOption5AnsweredCount.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setOption5AnsweredCount.RemoteActionCompatParcelizer;
            setTags settagsAudioAttributesCompatParcelizer = setOption5AnsweredCount.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str, getmonthtimestampIconCompatParcelizer);
            return getmonthtimestampIconCompatParcelizer.size() <= 1 ? settagsAudioAttributesCompatParcelizer : new getMcqEncrypt(str, settagsAudioAttributesCompatParcelizer, (byte) 0);
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public /* synthetic */ getMcqEncrypt(String str, setTags settags, byte b) {
        this(str, settags);
    }

    @getMagicModuleMeta
    public static final setTags AudioAttributesCompatParcelizer(String str, Collection<? extends getLink> collection) {
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str, collection);
    }
}
