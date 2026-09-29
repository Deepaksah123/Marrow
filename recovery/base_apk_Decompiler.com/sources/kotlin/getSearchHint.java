package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.getSubscriptionDetails;

/* JADX INFO: loaded from: classes4.dex */
public final class getSearchHint {
    public static final getSubscriptionDetails write(CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource, CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource2) {
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource, "");
        toMagicModuleMetaRepoModel.write(courseConfigV2CustomModuleQuestionSource2, "");
        courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatItemReceiver().size();
        courseConfigV2CustomModuleQuestionSource2.MediaBrowserCompatItemReceiver().size();
        getSubscriptionDetails.read readVar = getSubscriptionDetails.read;
        List<getBadgeText> listMediaBrowserCompatItemReceiver = courseConfigV2CustomModuleQuestionSource.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver, "");
        List<getBadgeText> list = listMediaBrowserCompatItemReceiver;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((getBadgeText) it.next()).MediaBrowserCompatSearchResultReceiver());
        }
        ArrayList arrayList2 = arrayList;
        List<getBadgeText> listMediaBrowserCompatItemReceiver2 = courseConfigV2CustomModuleQuestionSource2.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver2, "");
        List<getBadgeText> list2 = listMediaBrowserCompatItemReceiver2;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            getHref gethrefAP_ = ((getBadgeText) it2.next()).aP_();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefAP_, "");
            arrayList3.add(getSearchTimes.write(gethrefAP_));
        }
        return getSubscriptionDetails.read.RemoteActionCompatParcelizer(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.AudioAttributesImplApi26Parcelizer(arrayList2, arrayList3)));
    }
}
