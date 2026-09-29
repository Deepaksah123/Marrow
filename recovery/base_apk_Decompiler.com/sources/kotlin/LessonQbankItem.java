package kotlin;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class LessonQbankItem implements isTest {
    private final setRatingCount AudioAttributesCompatParcelizer;
    private final setPublishedTime IconCompatParcelizer;
    private final Map<RevisionSubjectStatusModel, setActiveRecallQbankId.RemoteActionCompatParcelizer> read;
    private final getAnswerMap<RevisionSubjectStatusModel, getIntroDurationSeconds> write;

    /* JADX WARN: Multi-variable type inference failed */
    public LessonQbankItem(setActiveRecallQbankId.MediaMetadataCompat mediaMetadataCompat, setRatingCount setratingcount, setPublishedTime setpublishedtime, getAnswerMap<? super RevisionSubjectStatusModel, ? extends getIntroDurationSeconds> getanswermap) {
        toMagicModuleMetaRepoModel.write(mediaMetadataCompat, "");
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = setratingcount;
        this.IconCompatParcelizer = setpublishedtime;
        this.write = getanswermap;
        List<setActiveRecallQbankId.RemoteActionCompatParcelizer> listRemoteActionCompatParcelizer = mediaMetadataCompat.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listRemoteActionCompatParcelizer, "");
        List<setActiveRecallQbankId.RemoteActionCompatParcelizer> list = listRemoteActionCompatParcelizer;
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(FilterItemRecordCreator.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, ((setActiveRecallQbankId.RemoteActionCompatParcelizer) obj).MediaMetadataCompat()), obj);
        }
        this.read = linkedHashMap;
    }

    public final Collection<RevisionSubjectStatusModel> read() {
        return this.read.keySet();
    }

    @Override // kotlin.isTest
    public final isStep write(RevisionSubjectStatusModel revisionSubjectStatusModel) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get(revisionSubjectStatusModel);
        if (remoteActionCompatParcelizer == null) {
            return null;
        }
        return new isStep(this.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer, this.IconCompatParcelizer, this.write.invoke(revisionSubjectStatusModel));
    }
}
