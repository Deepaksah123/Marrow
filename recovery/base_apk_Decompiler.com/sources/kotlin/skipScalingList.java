package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class skipScalingList {
    public static final List<unescapeStream> RemoteActionCompatParcelizer(List<addSample> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<addSample> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(IconCompatParcelizer((addSample) it.next()));
        }
        return arrayList;
    }

    private static unescapeStream IconCompatParcelizer(addSample addsample) {
        toMagicModuleMetaRepoModel.write(addsample, "");
        return new unescapeStream(addsample.AudioAttributesImplApi26Parcelizer(), addsample.MediaBrowserCompatItemReceiver(), addsample.read(), addsample.RemoteActionCompatParcelizer(), addsample.IconCompatParcelizer(), addsample.AudioAttributesCompatParcelizer(), addsample.write());
    }

    public static final addSample RemoteActionCompatParcelizer(unescapeStream unescapestream) {
        toMagicModuleMetaRepoModel.write(unescapestream, "");
        return new addSample(unescapestream.MediaBrowserCompatCustomActionResultReceiver(), unescapestream.AudioAttributesImplApi26Parcelizer(), unescapestream.AudioAttributesCompatParcelizer(), unescapestream.IconCompatParcelizer(), unescapestream.RemoteActionCompatParcelizer(), unescapestream.write(), unescapestream.read());
    }
}
