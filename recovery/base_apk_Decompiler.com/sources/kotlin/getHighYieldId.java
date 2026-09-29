package kotlin;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class getHighYieldId {
    private static final String RemoteActionCompatParcelizer;
    private static final Map<String, String> write;

    private getHighYieldId() {
    }

    static {
        new getHighYieldId();
        RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), "", null, null, 0, null, null, 62);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int i = saveMagicModuleTimeline.read(0, listRemoteActionCompatParcelizer.size() - 1, 2);
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = RemoteActionCompatParcelizer;
                sb.append(str);
                sb.append('/');
                sb.append((String) listRemoteActionCompatParcelizer.get(i2));
                int i3 = i2 + 1;
                linkedHashMap.put(sb.toString(), listRemoteActionCompatParcelizer.get(i3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listRemoteActionCompatParcelizer.get(i2));
                sb2.append("Array");
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append((String) listRemoteActionCompatParcelizer.get(i3));
                linkedHashMap.put(string, sb3.toString());
                if (i2 == i) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(RemoteActionCompatParcelizer);
        sb4.append("/Unit");
        linkedHashMap.put(sb4.toString(), "V");
        RemoteActionCompatParcelizer(linkedHashMap, "Any", "java/lang/Object");
        RemoteActionCompatParcelizer(linkedHashMap, "Nothing", "java/lang/Void");
        RemoteActionCompatParcelizer(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            RemoteActionCompatParcelizer(linkedHashMap, str2, "java/lang/".concat(String.valueOf(str2)));
        }
        for (String str3 : IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            RemoteActionCompatParcelizer(linkedHashMap, "collections/".concat(String.valueOf(str3)), "java/util/".concat(String.valueOf(str3)));
            RemoteActionCompatParcelizer(linkedHashMap, "collections/Mutable".concat(String.valueOf(str3)), "java/util/".concat(String.valueOf(str3)));
        }
        RemoteActionCompatParcelizer(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        RemoteActionCompatParcelizer(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        RemoteActionCompatParcelizer(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        RemoteActionCompatParcelizer(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i4 = 0; i4 < 23; i4++) {
            String strConcat = "Function".concat(String.valueOf(i4));
            StringBuilder sb5 = new StringBuilder();
            String str4 = RemoteActionCompatParcelizer;
            sb5.append(str4);
            sb5.append("/jvm/functions/Function");
            sb5.append(i4);
            RemoteActionCompatParcelizer(linkedHashMap, strConcat, sb5.toString());
            String strConcat2 = "reflect/KFunction".concat(String.valueOf(i4));
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str4);
            sb6.append("/reflect/KFunction");
            RemoteActionCompatParcelizer(linkedHashMap, strConcat2, sb6.toString());
        }
        for (String str5 : IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str5);
            sb7.append(".Companion");
            String string2 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(RemoteActionCompatParcelizer);
            sb8.append("/jvm/internal/");
            sb8.append(str5);
            sb8.append("CompanionObject");
            RemoteActionCompatParcelizer(linkedHashMap, string2, sb8.toString());
        }
        write = linkedHashMap;
    }

    private static final void RemoteActionCompatParcelizer(Map<String, String> map, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoteActionCompatParcelizer);
        sb.append('/');
        sb.append(str);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("L");
        sb2.append(str2);
        sb2.append(';');
        map.put(string, sb2.toString());
    }

    @getMagicModuleMeta
    public static final String RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        String str2 = write.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder("L");
        sb.append(TestGroupLSModel.AudioAttributesCompatParcelizer(str, '.', '$', false));
        sb.append(';');
        return sb.toString();
    }
}
