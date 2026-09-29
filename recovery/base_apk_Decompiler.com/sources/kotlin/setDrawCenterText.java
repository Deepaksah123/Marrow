package kotlin;

import android.database.SQLException;

/* JADX INFO: loaded from: classes2.dex */
public final class setDrawCenterText {
    public static final void read(setDrawHoleEnabled setdrawholeenabled, String str) throws Exception {
        toMagicModuleMetaRepoModel.write(setdrawholeenabled, "");
        toMagicModuleMetaRepoModel.write(str, "");
        setDrawEntryLabels setdrawentrylabelsIconCompatParcelizer = setdrawholeenabled.IconCompatParcelizer(str);
        try {
            setdrawentrylabelsIconCompatParcelizer.write();
            submitFeedback.RemoteActionCompatParcelizer(setdrawentrylabelsIconCompatParcelizer, null);
        } finally {
        }
    }

    public static final Void write(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: ".concat(String.valueOf(i)));
        if (str != null) {
            sb.append(", message: ".concat(String.valueOf(str)));
        }
        throw new SQLException(sb.toString());
    }
}
