package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioSinkListener extends MagicModuleUseCase implements getAnswerMap {
    public static final AudioSinkListener write = new AudioSinkListener();

    public AudioSinkListener() {
        super(1);
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        AacUtilAacAudioObjectType aacUtilAacAudioObjectType = (AacUtilAacAudioObjectType) obj;
        List list = aacUtilAacAudioObjectType.IconCompatParcelizer;
        int size = aacUtilAacAudioObjectType.RemoteActionCompatParcelizer.size();
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) aacUtilAacAudioObjectType.RemoteActionCompatParcelizer);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : listRemoteActionCompatParcelizer) {
            Pair pair = (Pair) obj2;
            Object arrayList = linkedHashMap.get(pair);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(pair, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() == size) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add((Pair) ((Map.Entry) it.next()).getKey());
        }
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) ((Pair) it2.next()).write());
        }
        Set setOnPlayFromUri = IntermediateLoginResponseBody.onPlayFromUri(arrayList3);
        List<List> list2 = aacUtilAacAudioObjectType.RemoteActionCompatParcelizer;
        ArrayList arrayList4 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (List list3 : list2) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : list3) {
                if (!setOnPlayFromUri.contains(((Pair) obj3).write())) {
                    arrayList5.add(obj3);
                }
            }
            arrayList4.add(arrayList5);
        }
        Pair pairWrite = setAction.write(createAudioTrackV9.RemoteActionCompatParcelizer.write(), VideoTimelineResponseBody.read(list));
        Pair pairWrite2 = setAction.write(updateState.RemoteActionCompatParcelizer.write(), VideoTimelineResponseBody.read(arrayList2));
        String strWrite = getFatalErrorRatio.AudioAttributesCompatParcelizer.write();
        ArrayList arrayList6 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList6.add(VideoTimelineResponseBody.read((List) it3.next()));
        }
        return VideoTimelineResponseBody.RemoteActionCompatParcelizer(pairWrite, pairWrite2, setAction.write(strWrite, arrayList6));
    }
}
