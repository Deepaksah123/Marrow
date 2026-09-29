package kotlin;

import com.marrow.data.models.lesson.LessonIndex;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class buildAdaptationSet {
    public static boolean read(ChunkHolder chunkHolder, boolean z, boolean z2, String str) {
        if (!z) {
            return true;
        }
        if (chunkHolder.IconCompatParcelizer(z2 ? "video" : "mcq")) {
            return true;
        }
        return chunkHolder.read(z2 ? "video_subj" : "mcq_subj", str);
    }

    public static LessonIndex[] write(LessonIndex[] lessonIndexArr) {
        if (lessonIndexArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LessonIndex lessonIndex : lessonIndexArr) {
            if (!lessonIndex.isPublished()) {
                arrayList.add(lessonIndex);
            }
        }
        return (LessonIndex[]) arrayList.toArray(new LessonIndex[arrayList.size()]);
    }

    public static LessonIndex[] AudioAttributesCompatParcelizer(LessonIndex[] lessonIndexArr) {
        if (lessonIndexArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (LessonIndex lessonIndex : lessonIndexArr) {
            if (lessonIndex.isPublished()) {
                arrayList.add(lessonIndex);
            }
            lessonIndex.setLessonActivityStatus(lessonIndex.getStatus());
        }
        return (LessonIndex[]) arrayList.toArray(new LessonIndex[arrayList.size()]);
    }

    public static String[] RemoteActionCompatParcelizer(LessonIndex[] lessonIndexArr) {
        if (lessonIndexArr == null) {
            return null;
        }
        int length = lessonIndexArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = lessonIndexArr[i].getId();
        }
        return strArr;
    }

    public static int[] IconCompatParcelizer(int[] iArr) {
        return iArr == null ? new int[2] : iArr;
    }

    public static String IconCompatParcelizer(LessonIndex lessonIndex, int i, int i2) {
        if (lessonIndex.getStatus() == 1 && i2 > 0) {
            return String.format(Locale.getDefault(), "%d/%d Completed", Integer.valueOf(i2), Integer.valueOf(i));
        }
        return "";
    }
}
