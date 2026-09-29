package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin._explicitClassOrOb;

/* JADX INFO: loaded from: classes4.dex */
final class collectProperties {
    collectProperties() {
    }

    static String RemoteActionCompatParcelizer(constructPropertyCollector constructpropertycollector, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        IconCompatParcelizer(constructpropertycollector, sb, 0);
        return sb.toString();
    }

    private static void IconCompatParcelizer(constructPropertyCollector constructpropertycollector, StringBuilder sb, int i) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : constructpropertycollector.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strReplaceFirst.substring(0, 1).toLowerCase());
                sb2.append(strReplaceFirst.substring(1, strReplaceFirst.length() - 4));
                String string = sb2.toString();
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    read(sb, i, read(string), _explicitClassOrOb.write(method2, constructpropertycollector, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strReplaceFirst.substring(0, 1).toLowerCase());
                sb3.append(strReplaceFirst.substring(1, strReplaceFirst.length() - 3));
                String string2 = sb3.toString();
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    read(sb, i, read(string2), _explicitClassOrOb.write(method3, constructpropertycollector, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(String.valueOf(strReplaceFirst)))) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    StringBuilder sb4 = new StringBuilder("get");
                    sb4.append(strReplaceFirst.substring(0, strReplaceFirst.length() - 5));
                    if (!map.containsKey(sb4.toString())) {
                    }
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(strReplaceFirst.substring(0, 1).toLowerCase());
                sb5.append(strReplaceFirst.substring(1));
                String string3 = sb5.toString();
                Method method4 = (Method) map.get("get".concat(String.valueOf(strReplaceFirst)));
                Method method5 = (Method) map.get("has".concat(String.valueOf(strReplaceFirst)));
                if (method4 != null) {
                    Object objWrite = _explicitClassOrOb.write(method4, constructpropertycollector, new Object[0]);
                    if (method5 == null) {
                        if (!AudioAttributesCompatParcelizer(objWrite)) {
                            read(sb, i, read(string3), objWrite);
                        }
                    } else if (((Boolean) _explicitClassOrOb.write(method5, constructpropertycollector, new Object[0])).booleanValue()) {
                        read(sb, i, read(string3), objWrite);
                    }
                }
            }
        }
        if (constructpropertycollector instanceof _explicitClassOrOb.RemoteActionCompatParcelizer) {
            Iterator<Map.Entry<T, Object>> itAudioAttributesImplApi26Parcelizer = ((_explicitClassOrOb.RemoteActionCompatParcelizer) constructpropertycollector).extensions.AudioAttributesImplApi26Parcelizer();
            while (itAudioAttributesImplApi26Parcelizer.hasNext()) {
                Map.Entry entry = (Map.Entry) itAudioAttributesImplApi26Parcelizer.next();
                StringBuilder sb6 = new StringBuilder("[");
                sb6.append(((_explicitClassOrOb.read) entry.getKey()).read());
                sb6.append("]");
                read(sb, i, sb6.toString(), entry.getValue());
            }
        }
        _explicitClassOrOb _explicitclassorob = (_explicitClassOrOb) constructpropertycollector;
        if (_explicitclassorob.unknownFields != null) {
            _explicitclassorob.unknownFields.AudioAttributesCompatParcelizer(sb, i);
        }
    }

    private static boolean AudioAttributesCompatParcelizer(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == BitmapDescriptorFactory.HUE_RED;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof AnnotatedWithParams) {
            return obj.equals(AnnotatedWithParams.AudioAttributesCompatParcelizer);
        }
        return obj instanceof constructPropertyCollector ? obj == ((constructPropertyCollector) obj).handleMediaPlayPauseIfPendingOnHandler() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    static final void read(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                read(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                read(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(hasConstructorParameter.IconCompatParcelizer((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AnnotatedWithParams) {
            sb.append(": \"");
            sb.append(hasConstructorParameter.RemoteActionCompatParcelizer((AnnotatedWithParams) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof _explicitClassOrOb) {
            sb.append(" {");
            IconCompatParcelizer((_explicitClassOrOb) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i4 = i + 2;
            read(sb, i4, "key", entry.getKey());
            read(sb, i4, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj.toString());
    }

    private static final String read(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
