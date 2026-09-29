package kotlin;

import com.marrow.data.models.mcq.McqContentBody;
import com.marrow.data.models.mcq.McqPearlInfo;
import com.marrow.data.models.pearl.Pearl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class parseText {
    private static final String[] AudioAttributesCompatParcelizer = {McqContentBody.KEY_OPTION_1, McqContentBody.KEY_OPTION_2, McqContentBody.KEY_OPTION_3, McqContentBody.KEY_OPTION_4, McqContentBody.KEY_OPTION_5, McqContentBody.KEY_OPTION_6, McqContentBody.KEY_OPTION_7, McqContentBody.KEY_OPTION_8};

    public static int read(String str) {
        return parseDolbyChannelConfiguration.IconCompatParcelizer(AudioAttributesCompatParcelizer, str);
    }

    public static McqPearlInfo[] write(String str, Pearl[] pearlArr) {
        if (pearlArr == null) {
            return null;
        }
        int length = pearlArr.length;
        McqPearlInfo[] mcqPearlInfoArr = new McqPearlInfo[length];
        for (int i = 0; i < length; i++) {
            mcqPearlInfoArr[i] = new McqPearlInfo(str, pearlArr[i].getId());
        }
        return mcqPearlInfoArr;
    }

    public static McqPearlInfo[] AudioAttributesCompatParcelizer(String str, ArrayList<Pearl> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        McqPearlInfo[] mcqPearlInfoArr = new McqPearlInfo[size];
        for (int i = 0; i < size; i++) {
            mcqPearlInfoArr[i] = new McqPearlInfo(str, arrayList.get(i).getId());
        }
        return mcqPearlInfoArr;
    }
}
