package kotlin;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueCreator {
    public static final void IconCompatParcelizer(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue, UShortDeserializer uShortDeserializer) {
        callBy.write(valueClassSerializerStaticJsonValue, uShortDeserializer);
    }

    public static final void RemoteActionCompatParcelizer(Set<Integer> set, Set<Integer> set2) {
        callBy.AudioAttributesCompatParcelizer(set, set2);
    }

    public static final void read(ValueClassSerializerStaticJsonValue valueClassSerializerStaticJsonValue, UShortDeserializer uShortDeserializer) {
        callBy.RemoteActionCompatParcelizer(valueClassSerializerStaticJsonValue, uShortDeserializer);
    }
}
