package com.marrow.data.models.test;

import kotlin.Metadata;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/marrow/data/models/test/MonthType;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENT", "UPCOMING", "PREVIOUS"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MonthType {
    private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
    private static final /* synthetic */ MonthType[] $VALUES;
    public static final MonthType CURRENT = new MonthType("CURRENT", 0);
    public static final MonthType UPCOMING = new MonthType("UPCOMING", 1);
    public static final MonthType PREVIOUS = new MonthType("PREVIOUS", 2);

    private MonthType(String str, int i) {
    }

    static {
        MonthType[] monthTypeArr$values = $values();
        $VALUES = monthTypeArr$values;
        $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(monthTypeArr$values);
    }

    private static final /* synthetic */ MonthType[] $values() {
        return new MonthType[]{CURRENT, UPCOMING, PREVIOUS};
    }

    public static getMagicModuleSavedMcqCount<MonthType> getEntries() {
        return $ENTRIES;
    }

    public static MonthType valueOf(String str) {
        return (MonthType) Enum.valueOf(MonthType.class, str);
    }

    public static MonthType[] values() {
        return (MonthType[]) $VALUES.clone();
    }
}
