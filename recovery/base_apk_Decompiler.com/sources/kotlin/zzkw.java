package kotlin;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzkw {
    public static final List<Integer> RemoteActionCompatParcelizer(isHoleSpan isholespan) {
        toMagicModuleMetaRepoModel.write(isholespan, "");
        int onMediaButtonEvent = isholespan.getOnMediaButtonEvent() + isholespan.getOnPrepareFromSearch() + isholespan.getOnPrepareFromMediaId() + isholespan.getOnPlayFromUri() + isholespan.getOnPlayFromSearch() + isholespan.getOnPrepare() + isholespan.getOnRewind() + isholespan.getOnRemoveQueueItemAt();
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (Object obj : IntermediateLoginResponseBody.write(Integer.valueOf(isholespan.getOnMediaButtonEvent()), Integer.valueOf(isholespan.getOnPrepareFromSearch()), Integer.valueOf(isholespan.getOnPrepareFromMediaId()), Integer.valueOf(isholespan.getOnPlayFromUri()), Integer.valueOf(isholespan.getOnPlayFromSearch()), Integer.valueOf(isholespan.getOnPrepare()), Integer.valueOf(isholespan.getOnRewind()), Integer.valueOf(isholespan.getOnRemoveQueueItemAt()))) {
            if (i3 < 0) {
                IntermediateLoginResponseBody.read();
            }
            int iRemoteActionCompatParcelizer = onMediaButtonEvent > 0 ? getOnline.RemoteActionCompatParcelizer((((Number) obj).intValue() / onMediaButtonEvent) * 100.0f) : 0;
            arrayList.add(Integer.valueOf(iRemoteActionCompatParcelizer));
            i2 += iRemoteActionCompatParcelizer;
            if (i == -1 || iRemoteActionCompatParcelizer > i4) {
                i = i3;
                i4 = iRemoteActionCompatParcelizer;
            }
            i3++;
        }
        if (i2 != 100) {
            arrayList.set(i, Integer.valueOf(i4 - (i2 - 100)));
        }
        return arrayList;
    }

    public static final String read(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        StringBuilder sb = new StringBuilder(str);
        sb.append("\n*");
        sb.append(str2);
        sb.append("*\nA. ");
        sb.append(str3);
        sb.append("\nB. ");
        sb.append(str4);
        sb.append("\nC. ");
        String strSubstring = str5.substring(0, getQues.RemoteActionCompatParcelizer(5, str5.length()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
        sb.append(strSubstring);
        sb.append("...\n\n");
        sb.append(str6);
        sb.append("\n");
        sb.append(str7);
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }
}
