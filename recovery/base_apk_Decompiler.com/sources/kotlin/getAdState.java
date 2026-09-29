package kotlin;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class getAdState {
    public static String RemoteActionCompatParcelizer(Bundle bundle) {
        return bundle != null ? bundle.getString("wzrk_acct_id", "") : "";
    }

    public static String read(Bundle bundle) {
        return bundle != null ? bundle.getString("wzrk_pid", "") : "";
    }

    public static ArrayList<getAdsId> read() {
        ArrayList<getAdsId> arrayList = new ArrayList<>();
        arrayList.add(getAdGroupIndexAfterPositionUs.IconCompatParcelizer);
        return arrayList;
    }

    public static String RemoteActionCompatParcelizer(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        return sb.toString();
    }
}
