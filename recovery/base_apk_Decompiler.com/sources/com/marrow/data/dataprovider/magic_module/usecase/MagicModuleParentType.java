package com.marrow.data.dataprovider.magic_module.usecase;

import kotlin.Metadata;
import kotlin.getMagicModuleSavedMcqCount;
import kotlin.getMagicModuleTimeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleParentType;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "CUSTOM_MODULE"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleParentType {
    private static final /* synthetic */ getMagicModuleSavedMcqCount $ENTRIES;
    private static final /* synthetic */ MagicModuleParentType[] $VALUES;
    public static final MagicModuleParentType HOME = new MagicModuleParentType("HOME", 0);
    public static final MagicModuleParentType CUSTOM_MODULE = new MagicModuleParentType("CUSTOM_MODULE", 1);

    private MagicModuleParentType(String str, int i) {
    }

    static {
        MagicModuleParentType[] magicModuleParentTypeArr$values = $values();
        $VALUES = magicModuleParentTypeArr$values;
        $ENTRIES = getMagicModuleTimeline.IconCompatParcelizer(magicModuleParentTypeArr$values);
    }

    private static final /* synthetic */ MagicModuleParentType[] $values() {
        return new MagicModuleParentType[]{HOME, CUSTOM_MODULE};
    }

    public static getMagicModuleSavedMcqCount<MagicModuleParentType> getEntries() {
        return $ENTRIES;
    }

    public static MagicModuleParentType valueOf(String str) {
        return (MagicModuleParentType) Enum.valueOf(MagicModuleParentType.class, str);
    }

    public static MagicModuleParentType[] values() {
        return (MagicModuleParentType[]) $VALUES.clone();
    }
}
