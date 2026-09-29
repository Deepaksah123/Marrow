package kotlin;

import com.marrow2.data.tag.local.model.TagLSModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getDiscontinuityReasonString {
    public static final List<TagLSModel> RemoteActionCompatParcelizer(String[] strArr, String str) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        toMagicModuleMetaRepoModel.write(str, "");
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str2 = strArr[i];
            arrayList.add(new TagLSModel(str2, i2, str2, str));
            i++;
            i2++;
        }
        return arrayList;
    }
}
