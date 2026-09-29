package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.setOption6AnsweredCount;
import kotlin.setReferences;

/* JADX INFO: loaded from: classes4.dex */
public final class getSkippedCount extends setStatusUpdateEndTimeMs {
    private final getTopSection IconCompatParcelizer;
    private final getNotesCount RemoteActionCompatParcelizer;

    public getSkippedCount(getTopSection gettopsection, getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(gettopsection, "");
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        this.IconCompatParcelizer = gettopsection;
        this.RemoteActionCompatParcelizer = getnotescount;
    }

    private CourseConfigV2SearchItem RemoteActionCompatParcelizer(getRelatedLessonId getrelatedlessonid) {
        toMagicModuleMetaRepoModel.write(getrelatedlessonid, "");
        if (getrelatedlessonid.read()) {
            return null;
        }
        getTopSection gettopsection = this.IconCompatParcelizer;
        getNotesCount getnotescountWrite = this.RemoteActionCompatParcelizer.write(getrelatedlessonid);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountWrite, "");
        CourseConfigV2SearchItem courseConfigV2SearchItemRemoteActionCompatParcelizer = gettopsection.RemoteActionCompatParcelizer(getnotescountWrite);
        if (courseConfigV2SearchItemRemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            return null;
        }
        return courseConfigV2SearchItemRemoteActionCompatParcelizer;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.getMcqContentBody
    public final Collection<getVariant> read(setOption6AnsweredCount setoption6answeredcount, getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(setoption6answeredcount, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        setOption6AnsweredCount.write writeVar = setOption6AnsweredCount.IconCompatParcelizer;
        if (!setoption6answeredcount.AudioAttributesCompatParcelizer(setOption6AnsweredCount.write.AudioAttributesImplApi26Parcelizer())) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (this.RemoteActionCompatParcelizer.read() && setoption6answeredcount.AudioAttributesImplBaseParcelizer().contains(setReferences.AudioAttributesCompatParcelizer.IconCompatParcelizer)) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        Collection<getNotesCount> collectionIconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, getanswermap);
        ArrayList arrayList = new ArrayList(collectionIconCompatParcelizer.size());
        Iterator<getNotesCount> it = collectionIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            getRelatedLessonId getrelatedlessonidIconCompatParcelizer = it.next().IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getrelatedlessonidIconCompatParcelizer, "");
            if (getanswermap.invoke(getrelatedlessonidIconCompatParcelizer).booleanValue()) {
                SubjectGroupTypeConstant.write(arrayList, RemoteActionCompatParcelizer(getrelatedlessonidIconCompatParcelizer));
            }
        }
        return arrayList;
    }

    @Override // kotlin.setStatusUpdateEndTimeMs, kotlin.setTags
    public final Set<getRelatedLessonId> aW_() {
        return getKycMessage.read();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("subpackages of ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(" from ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
