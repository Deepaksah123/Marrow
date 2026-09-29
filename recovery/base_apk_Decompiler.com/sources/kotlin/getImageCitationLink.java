package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.setMsInterimHtmlStartTime;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageCitationLink extends setMsInterimHtmlStartTime implements getThumbnail {
    private final Object[] RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getImageCitationLink(getRelatedLessonId getrelatedlessonid, Object[] objArr) {
        super(getrelatedlessonid, (byte) 0);
        toMagicModuleMetaRepoModel.write(objArr, "");
        this.RemoteActionCompatParcelizer = objArr;
    }

    @Override // kotlin.getThumbnail
    public final List<setMsInterimHtmlStartTime> RemoteActionCompatParcelizer() {
        Object[] objArr = this.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            toMagicModuleMetaRepoModel.write(obj);
            arrayList.add(setMsInterimHtmlStartTime.AudioAttributesCompatParcelizer.read(obj, null));
        }
        return arrayList;
    }
}
