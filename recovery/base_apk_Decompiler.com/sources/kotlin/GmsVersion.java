package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.registerDeadlineEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class GmsVersion {
    public static final registerEvent RemoteActionCompatParcelizer(registerDeadlineEvent.write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        int iIconCompatParcelizer = writeVar.IconCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(iIconCompatParcelizer);
        sb.append(" pearl");
        String string = sb.toString();
        if (writeVar.IconCompatParcelizer() > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(CmcdHeadersFactory.STREAMING_FORMAT_SS);
            string = sb2.toString();
        }
        return new registerEvent(writeVar.read(), writeVar.RemoteActionCompatParcelizer(), string);
    }

    public static final List<setWindow> RemoteActionCompatParcelizer(List<readUnsignedInt24> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<readUnsignedInt24> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (readUnsignedInt24 readunsignedint24 : list2) {
            arrayList.add(new setWindow(readunsignedint24.RemoteActionCompatParcelizer(), readunsignedint24.read()));
        }
        return arrayList;
    }
}
