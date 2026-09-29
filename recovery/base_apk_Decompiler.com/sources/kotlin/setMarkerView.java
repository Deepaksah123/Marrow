package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class setMarkerView {
    public static final int write(setDrawEntryLabels setdrawentrylabels, String str) {
        toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
        toMagicModuleMetaRepoModel.write(str, "");
        int iAudioAttributesCompatParcelizer = setLogEnabled.AudioAttributesCompatParcelizer(setdrawentrylabels, str);
        if (iAudioAttributesCompatParcelizer >= 0) {
            return iAudioAttributesCompatParcelizer;
        }
        int iIconCompatParcelizer = setdrawentrylabels.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList(iIconCompatParcelizer);
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            arrayList.add(setdrawentrylabels.write(i));
        }
        String strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList, null, null, null, 0, null, null, 63);
        StringBuilder sb = new StringBuilder("Column '");
        sb.append(str);
        sb.append("' does not exist. Available columns: [");
        sb.append(strRemoteActionCompatParcelizer);
        sb.append(']');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final int RemoteActionCompatParcelizer(setDrawEntryLabels setdrawentrylabels, String str) {
        toMagicModuleMetaRepoModel.write(setdrawentrylabels, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (setdrawentrylabels instanceof setExtraLeftOffset) {
            return ((setExtraLeftOffset) setdrawentrylabels).write(str);
        }
        int iIconCompatParcelizer = setdrawentrylabels.IconCompatParcelizer();
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) setdrawentrylabels.write(i))) {
                return i;
            }
        }
        return -1;
    }
}
