package com.marrow2.domain.lesson.model;

import kotlin.Metadata;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/marrow2/domain/lesson/model/LessonNavigationCategory;", "", "<init>", "(Ljava/lang/String;I)V", "VIDEO", "QBANK_INTRO", "PRO_DIALOG"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LessonNavigationCategory {
    private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
    private static final /* synthetic */ LessonNavigationCategory[] $VALUES;
    public static final LessonNavigationCategory VIDEO = new LessonNavigationCategory("VIDEO", 0);
    public static final LessonNavigationCategory QBANK_INTRO = new LessonNavigationCategory("QBANK_INTRO", 1);
    public static final LessonNavigationCategory PRO_DIALOG = new LessonNavigationCategory("PRO_DIALOG", 2);

    private LessonNavigationCategory(String str, int i) {
    }

    static {
        LessonNavigationCategory[] lessonNavigationCategoryArr$values = $values();
        $VALUES = lessonNavigationCategoryArr$values;
        $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(lessonNavigationCategoryArr$values);
    }

    private static final /* synthetic */ LessonNavigationCategory[] $values() {
        return new LessonNavigationCategory[]{VIDEO, QBANK_INTRO, PRO_DIALOG};
    }

    public static getMagicModuleSavedMcqCount<LessonNavigationCategory> getEntries() {
        return $ENTRIES;
    }

    public static LessonNavigationCategory valueOf(String str) {
        return (LessonNavigationCategory) Enum.valueOf(LessonNavigationCategory.class, str);
    }

    public static LessonNavigationCategory[] values() {
        return (LessonNavigationCategory[]) $VALUES.clone();
    }
}
