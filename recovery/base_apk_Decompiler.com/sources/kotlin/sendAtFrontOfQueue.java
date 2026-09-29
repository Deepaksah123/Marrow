package kotlin;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sendAtFrontOfQueue {
    public static final List<recycle> write(List<ensureClassLoader> list, List<dropTable> list2) {
        recycle recycleVar;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<dropTable> list3 = list2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap2.put(((dropTable) obj).getMediaBrowserCompatItemReceiver(), obj);
        }
        for (ensureClassLoader ensureclassloader : list) {
            String strAudioAttributesCompatParcelizer = ensureclassloader.AudioAttributesCompatParcelizer();
            dropTable droptable = (dropTable) linkedHashMap2.get(ensureclassloader.write());
            int i = 0;
            if (droptable != null && droptable.getIconCompatParcelizer()) {
                i = 1;
            }
            if (linkedHashMap.containsKey(strAudioAttributesCompatParcelizer)) {
                if (i != 0 && (recycleVar = (recycle) linkedHashMap.get(strAudioAttributesCompatParcelizer)) != null) {
                    Object obj2 = linkedHashMap.get(strAudioAttributesCompatParcelizer);
                    toMagicModuleMetaRepoModel.write(obj2);
                    recycleVar.AudioAttributesCompatParcelizer(((recycle) obj2).read() + 1);
                }
                recycle recycleVar2 = (recycle) linkedHashMap.get(strAudioAttributesCompatParcelizer);
                if (recycleVar2 != null) {
                    Object obj3 = linkedHashMap.get(strAudioAttributesCompatParcelizer);
                    toMagicModuleMetaRepoModel.write(obj3);
                    recycleVar2.RemoteActionCompatParcelizer(((recycle) obj3).IconCompatParcelizer() + 1);
                }
            } else {
                linkedHashMap.put(strAudioAttributesCompatParcelizer, new recycle(strAudioAttributesCompatParcelizer, ensureclassloader.IconCompatParcelizer(), i));
            }
        }
        return IntermediateLoginResponseBody.onPlay(linkedHashMap.values());
    }
}
