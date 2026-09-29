package kotlin;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class serialize_TFR7lA {
    private final ValueClassSerializerStaticJsonValue read;
    private final Set<removeIgnored<?>> write;

    public serialize_TFR7lA(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue) {
        toMagicModuleMetaRepoModel.write(valueClassSerializerStaticJsonValue, "");
        this.read = valueClassSerializerStaticJsonValue;
        Set<removeIgnored<?>> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setNewSetFromMap, "");
        this.write = setNewSetFromMap;
    }
}
