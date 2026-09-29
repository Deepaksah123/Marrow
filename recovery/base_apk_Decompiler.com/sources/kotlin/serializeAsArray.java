package kotlin;

import java.util.Map;
import kotlin.SubTypeValidator;

/* JADX INFO: loaded from: classes4.dex */
public final class serializeAsArray {
    public static SubTypeValidator write(IndexedStringListSerializer indexedStringListSerializer, String str, _withResolved _withresolved, int i, Map<String, String> map) {
        return new SubTypeValidator.write().IconCompatParcelizer(_withresolved.AudioAttributesCompatParcelizer(str)).IconCompatParcelizer(_withresolved.RemoteActionCompatParcelizer).write(_withresolved.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(write(indexedStringListSerializer, _withresolved)).read(i).read(map).write();
    }

    private static String write(IndexedStringListSerializer indexedStringListSerializer, _withResolved _withresolved) {
        String strWrite = indexedStringListSerializer.write();
        return strWrite != null ? strWrite : _withresolved.AudioAttributesCompatParcelizer(indexedStringListSerializer.IconCompatParcelizer.get(0).IconCompatParcelizer).toString();
    }
}
