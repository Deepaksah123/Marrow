package com.marrow.data.models.lesson.home;

import com.marrow.data.models.lesson.LessonIndex;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/marrow/data/models/lesson/home/HomeLessonIndexV2;", "", "Lcom/marrow/data/models/lesson/LessonIndex;", "p0", "", "p1", "<init>", "(Lcom/marrow/data/models/lesson/LessonIndex;I)V", "lessonIndex", "Lcom/marrow/data/models/lesson/LessonIndex;", "getLessonIndex", "()Lcom/marrow/data/models/lesson/LessonIndex;", "tag", "I", "getTag", "()I", "updatedCount", "newCount", "", "videoProgress", "F"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HomeLessonIndexV2 {
    private final LessonIndex lessonIndex;
    public int newCount;
    private final int tag;
    public int updatedCount;
    public float videoProgress;

    public HomeLessonIndexV2(LessonIndex lessonIndex, int i) {
        toMagicModuleMetaRepoModel.write(lessonIndex, "");
        this.lessonIndex = lessonIndex;
        this.tag = i;
    }

    public final LessonIndex getLessonIndex() {
        return this.lessonIndex;
    }

    public final int getTag() {
        return this.tag;
    }
}
