package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createTempFile {
    public static final createHandlerForCurrentOrMainLooper IconCompatParcelizer(loadAsset loadasset) {
        toMagicModuleMetaRepoModel.write(loadasset, "");
        List<getHeight> listIconCompatParcelizer = loadasset.IconCompatParcelizer();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listIconCompatParcelizer, 10));
        Iterator<T> it = listIconCompatParcelizer.iterator();
        while (it.hasNext()) {
            arrayList.add(RemoteActionCompatParcelizer((getHeight) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        List<setFloat> listRemoteActionCompatParcelizer = loadasset.RemoteActionCompatParcelizer();
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listRemoteActionCompatParcelizer, 10));
        Iterator<T> it2 = listRemoteActionCompatParcelizer.iterator();
        while (it2.hasNext()) {
            arrayList3.add(IconCompatParcelizer((setFloat) it2.next()));
        }
        return new createHandlerForCurrentOrMainLooper(arrayList2, arrayList3);
    }

    public static final getBytesFromHexString RemoteActionCompatParcelizer(getHeight getheight) {
        toMagicModuleMetaRepoModel.write(getheight, "");
        return new getBytesFromHexString(getheight.getIconCompatParcelizer(), getheight.getRemoteActionCompatParcelizer(), getheight.getAudioAttributesCompatParcelizer(), getheight.getWrite(), getheight.getRead(), getheight.getAudioAttributesImplBaseParcelizer());
    }

    private static final fromUtf8Bytes IconCompatParcelizer(setFloat setfloat) {
        return new fromUtf8Bytes(setfloat.getRead(), setfloat.getRemoteActionCompatParcelizer(), setfloat.getIconCompatParcelizer(), setfloat.getAudioAttributesCompatParcelizer(), setfloat.getWrite());
    }
}
