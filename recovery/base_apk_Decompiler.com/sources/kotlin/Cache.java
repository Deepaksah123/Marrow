package kotlin;

import com.marrow.data.models.subject.SubjectCompletionInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Cache implements commitFile {
    private final getSegmentUrl write;

    @setSdkPayload
    public Cache(getSegmentUrl getsegmenturl) {
        toMagicModuleMetaRepoModel.write(getsegmenturl, "");
        this.write = getsegmenturl;
    }

    @Override // kotlin.commitFile
    public final Object RemoteActionCompatParcelizer(CopyOnWriteMultiset copyOnWriteMultiset) {
        SubjectCompletionInfo[] subjectCompletionInfoArrIconCompatParcelizer = this.write.IconCompatParcelizer(copyOnWriteMultiset.read());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectCompletionInfoArrIconCompatParcelizer, "");
        List<SubjectCompletionInfo> listOnCommand = getOrderDetails.onCommand(subjectCompletionInfoArrIconCompatParcelizer);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand, 10));
        for (SubjectCompletionInfo subjectCompletionInfo : listOnCommand) {
            toMagicModuleMetaRepoModel.write(subjectCompletionInfo);
            arrayList.add(removeResource.read(subjectCompletionInfo));
        }
        return arrayList;
    }

    @Override // kotlin.commitFile
    public final Object RemoteActionCompatParcelizer(String str) {
        SubjectCompletionInfo subjectCompletionInfoAudioAttributesImplApi26Parcelizer = this.write.AudioAttributesImplApi26Parcelizer(str);
        if (subjectCompletionInfoAudioAttributesImplApi26Parcelizer != null) {
            return removeResource.read(subjectCompletionInfoAudioAttributesImplApi26Parcelizer);
        }
        return null;
    }
}
