package kotlin;

import com.marrow.data.models.mcq.McqIndex;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class unlockRange {
    public static final isOpenEnded read(List<? extends McqIndex> list, String str, String str2, readBlockToCache readblocktocache) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(readblocktocache, "");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (McqIndex mcqIndex : list) {
            mcqIndex.setDontConsider(true);
            arrayList.add(throwIfCanceled.write(mcqIndex));
            int i2 = i + 1;
            Pair<C0162cache, List<addSpan>> pair = read(str, str2, i, mcqIndex, mcqIndex.getMcqId(), readblocktocache);
            arrayList2.add(pair.write());
            arrayList3.addAll(pair.IconCompatParcelizer());
            String rootSubjectId = mcqIndex.getRootSubjectId();
            McqIndex[] childQuestions = mcqIndex.getChildQuestions();
            if (childQuestions != null) {
                int i3 = 0;
                for (int length = childQuestions.length; i3 < length; length = length) {
                    McqIndex mcqIndex2 = childQuestions[i3];
                    mcqIndex2.setDontConsider(true);
                    mcqIndex2.setRootSubjectId(rootSubjectId);
                    arrayList.add(throwIfCanceled.write(mcqIndex2));
                    Pair<C0162cache, List<addSpan>> pair2 = read(str, str2, i2, mcqIndex2, mcqIndex.getMcqId(), readblocktocache);
                    arrayList2.add(pair2.write());
                    arrayList3.addAll(pair2.IconCompatParcelizer());
                    i3++;
                    i2++;
                    rootSubjectId = rootSubjectId;
                    childQuestions = childQuestions;
                }
            }
            i = i2;
        }
        return new isOpenEnded(str, readblocktocache, arrayList, arrayList3, arrayList2);
    }

    private static final Pair<C0162cache, List<addSpan>> read(String str, String str2, int i, McqIndex mcqIndex, String str3, readBlockToCache readblocktocache) {
        C0162cache c0162cache = new C0162cache(mcqIndex.getMcqId(), str, readblocktocache.getRead(), i, str3);
        String[] highYieldIds = mcqIndex.getHighYieldIds();
        if (highYieldIds == null) {
            highYieldIds = new String[0];
        }
        ArrayList arrayList = new ArrayList(highYieldIds.length);
        for (String str4 : highYieldIds) {
            arrayList.add(new addSpan(mcqIndex.getMcqId(), str4, str, str2));
        }
        return new Pair<>(c0162cache, arrayList);
    }
}
