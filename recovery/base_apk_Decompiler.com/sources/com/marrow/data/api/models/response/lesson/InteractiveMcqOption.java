package com.marrow.data.api.models.response.lesson;

import kotlin.Metadata;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lcom/marrow/data/api/models/response/lesson/InteractiveMcqOption;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "optionIndex", "I", "getOptionIndex", "()I", "OPTION_A", "OPTION_B", "OPTION_C", "OPTION_D", "INVALID"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InteractiveMcqOption {
    private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
    private static final /* synthetic */ InteractiveMcqOption[] $VALUES;
    private final int optionIndex;
    private final String text;
    public static final InteractiveMcqOption OPTION_A = new InteractiveMcqOption("OPTION_A", 0, "A", 0);
    public static final InteractiveMcqOption OPTION_B = new InteractiveMcqOption("OPTION_B", 1, "B", 1);
    public static final InteractiveMcqOption OPTION_C = new InteractiveMcqOption("OPTION_C", 2, "C", 2);
    public static final InteractiveMcqOption OPTION_D = new InteractiveMcqOption("OPTION_D", 3, "D", 3);
    public static final InteractiveMcqOption INVALID = new InteractiveMcqOption("INVALID", 4, "X", -1);

    private InteractiveMcqOption(String str, int i, String str2, int i2) {
        this.text = str2;
        this.optionIndex = i2;
    }

    public final int getOptionIndex() {
        return this.optionIndex;
    }

    public final String getText() {
        return this.text;
    }

    static {
        InteractiveMcqOption[] interactiveMcqOptionArr$values = $values();
        $VALUES = interactiveMcqOptionArr$values;
        $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(interactiveMcqOptionArr$values);
    }

    private static final /* synthetic */ InteractiveMcqOption[] $values() {
        return new InteractiveMcqOption[]{OPTION_A, OPTION_B, OPTION_C, OPTION_D, INVALID};
    }

    public static getMagicModuleSavedMcqCount<InteractiveMcqOption> getEntries() {
        return $ENTRIES;
    }

    public static InteractiveMcqOption valueOf(String str) {
        return (InteractiveMcqOption) Enum.valueOf(InteractiveMcqOption.class, str);
    }

    public static InteractiveMcqOption[] values() {
        return (InteractiveMcqOption[]) $VALUES.clone();
    }
}
