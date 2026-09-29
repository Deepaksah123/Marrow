package kotlin;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hasPendingOutput extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final hasPendingOutput AudioAttributesCompatParcelizer = new hasPendingOutput();

    public hasPendingOutput() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        File[] fileArrListFiles = new File(disableTunneling.IconCompatParcelizer.write()).listFiles();
        toMagicModuleMetaRepoModel.write(fileArrListFiles);
        List listAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(fileArrListFiles);
        ArrayList arrayList = new ArrayList();
        Iterator it = listAudioAttributesImplBaseParcelizer.iterator();
        while (it.hasNext()) {
            File[] fileArrListFiles2 = ((File) it.next()).listFiles();
            toMagicModuleMetaRepoModel.write(fileArrListFiles2);
            List listAudioAttributesImplBaseParcelizer2 = getOrderDetails.AudioAttributesImplBaseParcelizer(fileArrListFiles2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listAudioAttributesImplBaseParcelizer2) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((File) obj).getName(), (Object) downSampleInput.AudioAttributesCompatParcelizer.write())) {
                    arrayList2.add(obj);
                }
            }
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(downloadMagicModuleDetail.AudioAttributesCompatParcelizer((File) it2.next(), getSubmissionTimestamp.IconCompatParcelizer));
        }
        return arrayList3;
    }
}
