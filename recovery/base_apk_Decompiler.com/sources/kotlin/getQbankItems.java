package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.getZenArea;

/* JADX INFO: loaded from: classes4.dex */
public final class getQbankItems {
    private static final Set<RevisionSubjectStatusModel> IconCompatParcelizer;
    public static final getQbankItems RemoteActionCompatParcelizer = new getQbankItems();

    private getQbankItems() {
    }

    public static Set<RevisionSubjectStatusModel> AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }

    static {
        Set<getShowNotesWatermark> set = getShowNotesWatermark.MediaBrowserCompatCustomActionResultReceiver;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(getZenArea.RemoteActionCompatParcelizer((getShowNotesWatermark) it.next()));
        }
        getNotesCount getnotescountMediaBrowserCompatItemReceiver = getZenArea.RemoteActionCompatParcelizer.onSkipToNext.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountMediaBrowserCompatItemReceiver, "");
        List list = IntermediateLoginResponseBody.read((Collection<? extends getNotesCount>) arrayList, getnotescountMediaBrowserCompatItemReceiver);
        getNotesCount getnotescountMediaBrowserCompatItemReceiver2 = getZenArea.RemoteActionCompatParcelizer.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountMediaBrowserCompatItemReceiver2, "");
        List list2 = IntermediateLoginResponseBody.read((Collection<? extends getNotesCount>) list, getnotescountMediaBrowserCompatItemReceiver2);
        getNotesCount getnotescountMediaBrowserCompatItemReceiver3 = getZenArea.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescountMediaBrowserCompatItemReceiver3, "");
        List list3 = IntermediateLoginResponseBody.read((Collection<? extends getNotesCount>) list2, getnotescountMediaBrowserCompatItemReceiver3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(RevisionSubjectStatusModel.RemoteActionCompatParcelizer((getNotesCount) it2.next()));
        }
        IconCompatParcelizer = linkedHashSet;
    }

    public static Set<RevisionSubjectStatusModel> write() {
        return IconCompatParcelizer;
    }
}
