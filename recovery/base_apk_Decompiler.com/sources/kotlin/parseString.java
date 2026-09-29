package kotlin;

import com.marrow.data.models.pearl.Pearl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class parseString {
    public static String[] AudioAttributesCompatParcelizer(List<Pearl> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i).getId();
        }
        return strArr;
    }
}
