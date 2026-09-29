package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhi {
    public static final List<zzhj> write(List<isCancelled> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<isCancelled> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AudioAttributesCompatParcelizer((isCancelled) it.next()));
        }
        return arrayList;
    }

    public static final zzhj AudioAttributesCompatParcelizer(isCancelled iscancelled) {
        toMagicModuleMetaRepoModel.write(iscancelled, "");
        String strRemoteActionCompatParcelizer = iscancelled.RemoteActionCompatParcelizer();
        String strWrite = iscancelled.write();
        List<String> listAudioAttributesCompatParcelizer = iscancelled.AudioAttributesCompatParcelizer();
        List<Integer> listIconCompatParcelizer = iscancelled.IconCompatParcelizer();
        long jAudioAttributesImplApi21Parcelizer = iscancelled.AudioAttributesImplApi21Parcelizer();
        String strMediaBrowserCompatCustomActionResultReceiver = iscancelled.MediaBrowserCompatCustomActionResultReceiver();
        checkValidServerReply checkvalidserverreplyAudioAttributesImplBaseParcelizer = iscancelled.AudioAttributesImplBaseParcelizer();
        zzhe zzheVar = new zzhe(checkvalidserverreplyAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(), checkvalidserverreplyAudioAttributesImplBaseParcelizer.IconCompatParcelizer());
        String strAudioAttributesImplApi26Parcelizer = iscancelled.AudioAttributesImplApi26Parcelizer();
        previousIndex previousindex = new previousIndex(iscancelled.read().IconCompatParcelizer());
        List<isDone> listMediaBrowserCompatItemReceiver = iscancelled.MediaBrowserCompatItemReceiver();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listMediaBrowserCompatItemReceiver, 10));
        for (isDone isdone : listMediaBrowserCompatItemReceiver) {
            arrayList.add(new nextIndex(isdone.write(), isdone.IconCompatParcelizer()));
        }
        return new zzhj(strRemoteActionCompatParcelizer, strWrite, listAudioAttributesCompatParcelizer, listIconCompatParcelizer, jAudioAttributesImplApi21Parcelizer, strMediaBrowserCompatCustomActionResultReceiver, zzheVar, strAudioAttributesImplApi26Parcelizer, previousindex, arrayList);
    }
}
