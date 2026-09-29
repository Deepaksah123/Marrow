package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.handlePropertyValue;

/* JADX INFO: loaded from: classes4.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\t\u001a\u00020\b2\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\r\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\f2\u001a\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\t\u001a\u0004\u0018\u00010\u000b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\f2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0010J?\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00112\u0016\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0016J\u0017\u0010\r\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\r\u0010\u0017J=\u0010\t\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0018\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\u001a"}, d2 = {"Lo/injection;", "", "<init>", "()V", "", "Ljava/lang/Class;", "p0", "p1", "", "read", "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "Ljava/lang/reflect/Method;", "", "write", "([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lo/_handleUnrecognizedCharacterEscape;", "p2", "AudioAttributesCompatParcelizer", "(Ljava/lang/reflect/Method;Ljava/lang/Object;Lo/_handleUnrecognizedCharacterEscape;[Ljava/lang/Object;)Ljava/lang/Object;", "", "(II)I", "(I)I", "p3", "", "(Ljava/lang/String;Ljava/lang/String;Lo/_handleUnrecognizedCharacterEscape;[Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class injection {
    public static final injection INSTANCE = new injection();

    private injection() {
    }

    private final boolean read(Class<?>[] p0, Class<?>[] p1) {
        if (p0.length == p1.length) {
            ArrayList arrayList = new ArrayList(p0.length);
            int length = p0.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i >= length) {
                    break;
                }
                Class<?> cls = p0[i];
                Class<?> cls2 = p1[i2];
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(MagicModuleFeedbackRequestBody.read(cls), MagicModuleFeedbackRequestBody.read(cls2)) && !cls.isAssignableFrom(cls2)) {
                    z = false;
                }
                arrayList.add(Boolean.valueOf(z));
                i++;
                i2++;
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final Object write(Class<?> cls) {
        String name = cls.getName();
        if (name == null) {
            return null;
        }
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(0.0d);
                }
                return null;
            case 104431:
                return name.equals("int") ? 0 : null;
            case 3039496:
                return name.equals("byte") ? (byte) 0 : null;
            case 3052374:
                return name.equals("char") ? (char) 0 : null;
            case 3327612:
                return name.equals("long") ? 0L : null;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                }
                return null;
            case 109413500:
                return name.equals("short") ? (short) 0 : null;
            default:
                return null;
        }
    }

    private final Object AudioAttributesCompatParcelizer(Method method, Object obj, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Object... objArr) {
        Object objWrite;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        int i = -1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(parameterTypes[length], _handleUnrecognizedCharacterEscape.class)) {
                    i = length;
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        int i3 = i + 1;
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, obj == null ? 0 : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != iAudioAttributesCompatParcelizer ? write(i) : 0) + iAudioAttributesCompatParcelizer != length2) {
            throw new IllegalStateException("params don't add up to total params".toString());
        }
        Object[] objArr2 = new Object[length2];
        int i4 = 0;
        while (i4 < length2) {
            if (i4 >= 0 && i4 < i) {
                objWrite = (i4 < 0 || i4 >= objArr.length) ? INSTANCE.write(method.getParameterTypes()[i4]) : objArr[i4];
            } else if (i4 == i) {
                objWrite = _handleunrecognizedcharacterescape;
            } else if (i3 <= i4 && i4 < iAudioAttributesCompatParcelizer) {
                objWrite = 0;
            } else {
                if (iAudioAttributesCompatParcelizer > i4 || i4 >= length2) {
                    throw new IllegalStateException("Unexpected index".toString());
                }
                objWrite = 2097151;
            }
            objArr2[i4] = objWrite;
            i4++;
        }
        return method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    private final int AudioAttributesCompatParcelizer(int p0, int p1) {
        if (p0 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (p0 + p1)) / 10.0d);
    }

    private final int write(int p0) {
        return (int) Math.ceil(((double) p0) / 31.0d);
    }

    public final void read(String p0, String p1, _handleUnrecognizedCharacterEscape p2, Object... p3) throws Exception {
        try {
            Class<?> cls = Class.forName(p0);
            Method method = read(cls, p1, Arrays.copyOf(p3, p3.length));
            if (method == null) {
                StringBuilder sb = new StringBuilder("Composable ");
                sb.append(p0);
                sb.append('.');
                sb.append(p1);
                sb.append(" not found");
                throw new NoSuchMethodException(sb.toString());
            }
            method.setAccessible(true);
            if (Modifier.isStatic(method.getModifiers())) {
                AudioAttributesCompatParcelizer(method, null, p2, Arrays.copyOf(p3, p3.length));
            } else {
                AudioAttributesCompatParcelizer(method, cls.getConstructor(new Class[0]).newInstance(new Object[0]), p2, Arrays.copyOf(p3, p3.length));
            }
        } catch (Exception e) {
            handlePropertyValue.Companion companion = handlePropertyValue.INSTANCE;
            StringBuilder sb2 = new StringBuilder("Failed to invoke Composable Method '");
            sb2.append(p0);
            sb2.append('.');
            sb2.append(p1);
            sb2.append('\'');
            handlePropertyValue.Companion.AudioAttributesCompatParcelizer$default(companion, sb2.toString(), null, 2, null);
            throw e;
        }
    }

    private final Method write(Method[] methodArr, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Method method;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) method.getName())) {
                String name = method.getName();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('-');
                if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, sb.toString())) {
                    continue;
                }
                i++;
            }
            if (INSTANCE.read(method.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                break;
            }
            i++;
        }
        if (method != null) {
            return method;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" not found");
        throw new NoSuchMethodException(sb2.toString());
    }

    private final Method read(Class<?> cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, iAudioAttributesCompatParcelizer);
                ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(newencryptedobjectIconCompatParcelizer, 10));
                Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    ((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                MagicModuleMetaUcModel magicModuleMetaUcModel = new MagicModuleMetaUcModel(3);
                magicModuleMetaUcModel.write((Object) clsArr);
                magicModuleMetaUcModel.read(_handleUnrecognizedCharacterEscape.class);
                magicModuleMetaUcModel.write((Object) clsArr2);
                return write(declaredMethods, str, (Class[]) magicModuleMetaUcModel.write((Object[]) new Class[magicModuleMetaUcModel.RemoteActionCompatParcelizer()]));
            } catch (ReflectiveOperationException unused) {
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            for (Method method : cls.getDeclaredMethods()) {
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method.getName(), (Object) str)) {
                    String name = method.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('-');
                    if (!TestGroupLSModel.MediaBrowserCompatCustomActionResultReceiver(name, sb.toString())) {
                    }
                }
                return method;
            }
            return null;
        }
    }
}
