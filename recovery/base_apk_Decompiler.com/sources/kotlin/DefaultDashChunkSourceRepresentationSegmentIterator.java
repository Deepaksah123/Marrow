package kotlin;

import com.marrow.data.models.lesson.McqHighYieldRecord;
import com.marrow.data.models.mcq.McqAnswer;
import com.marrow.data.models.mcq.McqIndex;
import com.marrow.data.models.mcq.McqParentInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDashChunkSourceRepresentationSegmentIterator {
    public static final boolean AudioAttributesCompatParcelizer(McqIndex mcqIndex, int i) {
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        return write(mcqIndex, i, -1);
    }

    private static boolean write(McqIndex mcqIndex, int i, int i2) {
        int option1AnsweredCount;
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        if (i2 == i || mcqIndex.getTotalAnswerCount() == 0) {
            return false;
        }
        int totalAnswerCount = mcqIndex.getTotalAnswerCount();
        switch (i) {
            case 0:
                option1AnsweredCount = mcqIndex.getOption1AnsweredCount();
                break;
            case 1:
                option1AnsweredCount = mcqIndex.getOption2AnsweredCount();
                break;
            case 2:
                option1AnsweredCount = mcqIndex.getOption3AnsweredCount();
                break;
            case 3:
                option1AnsweredCount = mcqIndex.getOption4AnsweredCount();
                break;
            case 4:
                option1AnsweredCount = mcqIndex.getOption5AnsweredCount();
                break;
            case 5:
                option1AnsweredCount = mcqIndex.getOption6AnsweredCount();
                break;
            case 6:
                option1AnsweredCount = mcqIndex.getOption7AnsweredCount();
                break;
            case 7:
                option1AnsweredCount = mcqIndex.getOption8AnsweredCount();
                break;
            default:
                option1AnsweredCount = 0;
                break;
        }
        return ((double) ((float) getOnline.RemoteActionCompatParcelizer((((float) option1AnsweredCount) / ((float) totalAnswerCount)) * 100.0f))) >= 85.0d;
    }

    public static final List<McqParentInfo> IconCompatParcelizer(List<? extends McqIndex> list, String str, String str2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        List<? extends McqIndex> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        int i = 0;
        for (Object obj : list2) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            McqIndex mcqIndex = (McqIndex) obj;
            McqParentInfo mcqParentInfo = new McqParentInfo();
            mcqParentInfo.setMCQId(mcqIndex.getMcqId());
            mcqParentInfo.setParentId(str2);
            mcqParentInfo.setParentType(str);
            mcqParentInfo.setSortOrder(i);
            mcqParentInfo.setParentMcqId(mcqIndex.getMcqId());
            arrayList.add(mcqParentInfo);
            i++;
        }
        return arrayList;
    }

    public static final List<McqAnswer> AudioAttributesCompatParcelizer(List<? extends McqIndex> list, String str, Map<String, Integer> map) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        ArrayList arrayList = new ArrayList();
        for (McqIndex mcqIndex : list) {
            Integer num = map.get(mcqIndex.getMcqId());
            McqAnswer mcqAnswerIconCompatParcelizer = num != null ? IconCompatParcelizer(mcqIndex, str, num.intValue()) : null;
            if (mcqAnswerIconCompatParcelizer != null) {
                arrayList.add(mcqAnswerIconCompatParcelizer);
            }
        }
        return arrayList;
    }

    private static McqAnswer IconCompatParcelizer(McqIndex mcqIndex, String str, int i) {
        toMagicModuleMetaRepoModel.write(mcqIndex, "");
        toMagicModuleMetaRepoModel.write(str, "");
        int i2 = parseText.read(mcqIndex.getAnswerPointer());
        String mcqId = mcqIndex.getMcqId();
        McqAnswer mcqAnswer = new McqAnswer();
        mcqAnswer.setServerAnswer(i);
        mcqAnswer.setParentId(str);
        mcqAnswer.setMcqId(mcqId);
        mcqAnswer.setParentMcqId(mcqId);
        mcqAnswer.setRight(i2 == mcqAnswer.getSelectedAnswerIndex());
        mcqAnswer.setSillyMistake(write(mcqIndex, i2, mcqAnswer.getSelectedAnswerIndex()));
        mcqAnswer.setHighYieldIds(mcqIndex.getHighYieldIds());
        return mcqAnswer;
    }

    public static final List<McqHighYieldRecord> read(List<? extends McqIndex> list, String str, String str2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        ArrayList arrayList = new ArrayList();
        for (McqIndex mcqIndex : list) {
            String[] highYieldIds = mcqIndex.getHighYieldIds();
            if (highYieldIds != null) {
                for (String str3 : highYieldIds) {
                    arrayList.add(new McqHighYieldRecord(mcqIndex.getMcqId(), str3, str, str2));
                }
            }
        }
        return arrayList;
    }
}
