package kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdadecoderReleased5comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher extends deviceDoesntSupportOperatingRate {
    private static Set IconCompatParcelizer = getKycMessage.read("processor");
    private static Set write = getKycMessage.IconCompatParcelizer("bogomips", "cpu mhz");
    private AacUtilAacAudioObjectType AudioAttributesCompatParcelizer;

    public lambdadecoderReleased5comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher(AacUtilAacAudioObjectType aacUtilAacAudioObjectType) {
        List list = aacUtilAacAudioObjectType.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!IconCompatParcelizer.contains(((String) ((Pair) obj).write()).toLowerCase(Locale.ROOT))) {
                arrayList.add(obj);
            }
        }
        List<List> list2 = aacUtilAacAudioObjectType.RemoteActionCompatParcelizer;
        ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (List list3 : list2) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list3) {
                if (!write.contains(((String) ((Pair) obj2).write()).toLowerCase(Locale.ROOT))) {
                    arrayList3.add(obj2);
                }
            }
            arrayList2.add(arrayList3);
        }
        this.AudioAttributesCompatParcelizer = new AacUtilAacAudioObjectType(arrayList, arrayList2);
    }

    @Override // kotlin.deviceDoesntSupportOperatingRate
    public final Object IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
