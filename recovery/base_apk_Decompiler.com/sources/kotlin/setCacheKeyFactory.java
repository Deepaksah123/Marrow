package kotlin;

import com.marrow.data.models.lesson.McqHighYieldRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setCacheKeyFactory implements setEventListener {
    private final getAdjustedWindowDefaultStartPositionUs RemoteActionCompatParcelizer;

    @setSdkPayload
    public setCacheKeyFactory(getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus) {
        toMagicModuleMetaRepoModel.write(getadjustedwindowdefaultstartpositionus, "");
        this.RemoteActionCompatParcelizer = getadjustedwindowdefaultstartpositionus;
    }

    @Override // kotlin.setEventListener
    public final void RemoteActionCompatParcelizer(List<addSpan> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus = this.RemoteActionCompatParcelizer;
        List<addSpan> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(CacheWriter.AudioAttributesCompatParcelizer((addSpan) it.next()));
        }
        getadjustedwindowdefaultstartpositionus.IconCompatParcelizer(arrayList.toArray(new McqHighYieldRecord[0]));
    }

    @Override // kotlin.setEventListener
    public final void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(str);
    }

    @Override // kotlin.setEventListener
    public final Object read(String str) {
        List list;
        String[] strArrMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(str);
        return (strArrMediaBrowserCompatItemReceiver == null || (list = getOrderDetails.read(strArrMediaBrowserCompatItemReceiver)) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
    }

    @Override // kotlin.setEventListener
    public final Object IconCompatParcelizer(String str, getMediaMimeType getmediamimetype) {
        return getOrderDetails.read(this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, getCustomMimeTypeForCodec.read(getmediamimetype)));
    }
}
