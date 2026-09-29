package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getTagsList extends getTopicId implements Link {
    private getTagsList(getHref gethref, getHref gethref2, boolean z) {
        super(gethref, gethref2);
        if (z) {
            return;
        }
        PlanData.AudioAttributesCompatParcelizer.read(gethref, gethref2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getTagsList(getHref gethref, getHref gethref2) {
        this(gethref, gethref2, false);
        toMagicModuleMetaRepoModel.write(gethref, "");
        toMagicModuleMetaRepoModel.write(gethref2, "");
    }

    @Override // kotlin.getTopicId
    public final getHref IconCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.getTopicId, kotlin.getLink
    public final setTags read() {
        getQuestionLimit getquestionlimitRemoteActionCompatParcelizer = AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer();
        CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = getquestionlimitRemoteActionCompatParcelizer instanceof CourseConfigV2CustomModuleQuestionSource ? (CourseConfigV2CustomModuleQuestionSource) getquestionlimitRemoteActionCompatParcelizer : null;
        if (courseConfigV2CustomModuleQuestionSource == null) {
            StringBuilder sb = new StringBuilder("Incorrect classifier: ");
            sb.append(AudioAttributesImplApi21Parcelizer().RemoteActionCompatParcelizer());
            throw new IllegalStateException(sb.toString().toString());
        }
        setTags settagsWrite = courseConfigV2CustomModuleQuestionSource.write(new setPearlList((byte) 0));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settagsWrite, "");
        return settagsWrite;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getTagsList read(getGroupDescription getgroupdescription) {
        toMagicModuleMetaRepoModel.write(getgroupdescription, "");
        return new getTagsList(AudioAttributesImplBaseParcelizer().read(getgroupdescription), AudioAttributesImplApi26Parcelizer().read(getgroupdescription));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public getTagsList write(boolean z) {
        return new getTagsList(AudioAttributesImplBaseParcelizer().write(z), AudioAttributesImplApi26Parcelizer().write(z));
    }

    private static final boolean write(String str, String str2) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) TestGroupLSModel.IconCompatParcelizer(str2, (CharSequence) "out ")) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) "*");
    }

    private static final List<String> read(setGuessed setguessed, getLink getlink) {
        List<setDefault> listBb_ = getlink.bb_();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listBb_, 10));
        Iterator<T> it = listBb_.iterator();
        while (it.hasNext()) {
            arrayList.add(setguessed.write((setDefault) it.next()));
        }
        return arrayList;
    }

    private static final String read(String str, String str2) {
        if (!TestGroupLSModel.RemoteActionCompatParcelizer((CharSequence) str, '<', false)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TestGroupLSModel.IconCompatParcelizer(str, '<', str));
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        sb.append(TestGroupLSModel.AudioAttributesCompatParcelizer(str, '>', str));
        return sb.toString();
    }

    @Override // kotlin.getTopicId
    public final String read(setGuessed setguessed, setFirstAnswer setfirstanswer) {
        toMagicModuleMetaRepoModel.write(setguessed, "");
        toMagicModuleMetaRepoModel.write(setfirstanswer, "");
        String str = setguessed.read(AudioAttributesImplBaseParcelizer());
        String str2 = setguessed.read(AudioAttributesImplApi26Parcelizer());
        if (setfirstanswer.IconCompatParcelizer()) {
            StringBuilder sb = new StringBuilder("raw (");
            sb.append(str);
            sb.append("..");
            sb.append(str2);
            sb.append(')');
            return sb.toString();
        }
        if (AudioAttributesImplApi26Parcelizer().bb_().isEmpty()) {
            return setguessed.read(str, str2, getSearchTimes.read(this));
        }
        List<String> list = read(setguessed, AudioAttributesImplBaseParcelizer());
        List<String> list2 = read(setguessed, AudioAttributesImplApi26Parcelizer());
        List<String> list3 = list;
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(list3, ", ", null, null, 0, null, read.IconCompatParcelizer, 30);
        List<Pair> listAudioAttributesImplApi26Parcelizer = IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(list3, list2);
        if (listAudioAttributesImplApi26Parcelizer.isEmpty()) {
            str2 = read(str2, strRemoteActionCompatParcelizer);
        } else {
            for (Pair pair : listAudioAttributesImplApi26Parcelizer) {
                if (!write((String) pair.write(), (String) pair.IconCompatParcelizer())) {
                    break;
                }
            }
            str2 = read(str2, strRemoteActionCompatParcelizer);
        }
        String str3 = read(str, strRemoteActionCompatParcelizer);
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str3, (Object) str2) ? str3 : setguessed.read(str3, str2, getSearchTimes.read(this));
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<String, CharSequence> {
        public static final read IconCompatParcelizer = new read();

        private static CharSequence IconCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            return "(raw) ".concat(String.valueOf(str));
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ CharSequence invoke(String str) {
            return IconCompatParcelizer(str);
        }

        read() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanAddOnsCompanion
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getTopicId write(getCheapestPlan getcheapestplan) {
        toMagicModuleMetaRepoModel.write(getcheapestplan, "");
        getLink getlink = getcheapestplan.read(AudioAttributesImplBaseParcelizer());
        toMagicModuleMetaRepoModel.read(getlink, "");
        getLink getlink2 = getcheapestplan.read(AudioAttributesImplApi26Parcelizer());
        toMagicModuleMetaRepoModel.read(getlink2, "");
        return new getTagsList((getHref) getlink, (getHref) getlink2, true);
    }
}
