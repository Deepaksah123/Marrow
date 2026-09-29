package kotlin;

import com.marrow.data.models.lesson.LessonIndex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.CacheListener;

/* JADX INFO: loaded from: classes3.dex */
public final class startReadWriteNonBlocking {
    public static final CacheListener IconCompatParcelizer(LessonIndex lessonIndex, LessonIndex lessonIndex2) {
        List listRemoteActionCompatParcelizer;
        List listRemoteActionCompatParcelizer2;
        int i;
        List list;
        CacheListener.read readVar;
        toMagicModuleMetaRepoModel.write(lessonIndex, "");
        String id = lessonIndex.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String title = lessonIndex.getTitle();
        if (title == null) {
            title = "";
        }
        String imageUrl = lessonIndex.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        String subjectId = lessonIndex.getSubjectId();
        if (subjectId == null) {
            subjectId = "";
        }
        String lessonReadTimeText = lessonIndex.getLessonReadTimeText();
        if (lessonReadTimeText == null) {
            lessonReadTimeText = "";
        }
        int status = lessonIndex.getStatus();
        int myRating = lessonIndex.getMyRating();
        boolean zIsPaid = lessonIndex.isPaid();
        int totalPeopleRated = lessonIndex.getTotalPeopleRated();
        int ratingCount = lessonIndex.getRatingCount();
        String rootSubjectId = lessonIndex.getRootSubjectId();
        if (rootSubjectId == null) {
            rootSubjectId = "";
        }
        int courseId = lessonIndex.getCourseId();
        int booleanFlags = lessonIndex.getBooleanFlags();
        String[] parentIds = lessonIndex.getParentIds();
        if (parentIds == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(parentIds)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        int editionValue = lessonIndex.getEditionValue();
        String[] highYieldIds = lessonIndex.getHighYieldIds();
        if (highYieldIds == null || (listRemoteActionCompatParcelizer2 = getOrderDetails.onCommand(highYieldIds)) == null) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        int pytMcqCount = lessonIndex.getPytMcqCount();
        boolean zIsActiveForNewTag = lessonIndex.isActiveForNewTag();
        boolean zIsComingSoon = lessonIndex.isComingSoon();
        long expiryTimeMs = lessonIndex.getExpiryTimeMs();
        String tagType = lessonIndex.getTagType();
        String str = tagType == null ? "" : tagType;
        boolean zIsTagActive = lessonIndex.isTagActive();
        String tagLabel = lessonIndex.getTagLabel();
        String str2 = tagLabel == null ? "" : tagLabel;
        long tagExpiryMs = lessonIndex.getTagExpiryMs();
        if (lessonIndex.getActiveRecallQbankId() == null || lessonIndex2 == null) {
            i = booleanFlags;
            list = listRemoteActionCompatParcelizer;
            readVar = null;
        } else {
            list = listRemoteActionCompatParcelizer;
            i = booleanFlags;
            readVar = new CacheListener.read(lessonIndex2.getStatus(), lessonIndex2.getScore(), lessonIndex2.getPossibleScore());
        }
        return new CacheListener(id, title, imageUrl, subjectId, lessonReadTimeText, status, myRating, zIsPaid, totalPeopleRated, ratingCount, rootSubjectId, courseId, i, list, editionValue, listRemoteActionCompatParcelizer2, pytMcqCount, false, zIsActiveForNewTag, expiryTimeMs, str, zIsTagActive, str2, tagExpiryMs, zIsComingSoon, readVar, 131072, null);
    }

    public static final HashMap<String, ArrayList<startFile>> IconCompatParcelizer(HashMap<String, ArrayList<LessonIndex>> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        HashMap<String, ArrayList<startFile>> map2 = new HashMap<>();
        for (Map.Entry<String, ArrayList<LessonIndex>> entry : map.entrySet()) {
            String key = entry.getKey();
            ArrayList<LessonIndex> value = entry.getValue();
            ArrayList<startFile> arrayList = new ArrayList<>();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(getCachedSpans.read((LessonIndex) it.next()));
            }
            map2.put(key, arrayList);
        }
        return map2;
    }
}
