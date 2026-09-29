package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SerializableSerializer implements _useStatic {
    @Override // kotlin._useStatic
    public final UUIDSerializer read() {
        return new ReferenceTypeSerializer1(initExtraTracks.AudioAttributesImplApi26Parcelizer(), initExtraTracks.AudioAttributesImplApi26Parcelizer());
    }

    @Override // kotlin._useStatic
    public final UUIDSerializer write(List<? extends UUIDSerializer> list, List<List<Integer>> list2) {
        return new ReferenceTypeSerializer1(list, list2);
    }
}
