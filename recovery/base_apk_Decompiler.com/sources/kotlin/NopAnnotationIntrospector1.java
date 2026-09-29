package kotlin;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class NopAnnotationIntrospector1 {
    private static final AppCompatCheckBox<ClassLoader, AppCompatCheckBox<String, Class<?>>> AudioAttributesCompatParcelizer = new AppCompatCheckBox<>();

    private static Class<?> IconCompatParcelizer(ClassLoader classLoader, String str) throws ClassNotFoundException {
        AppCompatCheckBox<ClassLoader, AppCompatCheckBox<String, Class<?>>> appCompatCheckBox = AudioAttributesCompatParcelizer;
        AppCompatCheckBox<String, Class<?>> appCompatCheckBox2 = appCompatCheckBox.get(classLoader);
        if (appCompatCheckBox2 == null) {
            appCompatCheckBox2 = new AppCompatCheckBox<>();
            appCompatCheckBox.put(classLoader, appCompatCheckBox2);
        }
        Class<?> cls = appCompatCheckBox2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        appCompatCheckBox2.put(str, cls2);
        return cls2;
    }

    static boolean write(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(IconCompatParcelizer(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<? extends Fragment> AudioAttributesCompatParcelizer(ClassLoader classLoader, String str) {
        try {
            return IconCompatParcelizer(classLoader, str);
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class is a valid subclass of Fragment");
            throw new Fragment.AudioAttributesCompatParcelizer(sb.toString(), e);
        } catch (ClassNotFoundException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists");
            throw new Fragment.AudioAttributesCompatParcelizer(sb2.toString(), e2);
        }
    }

    public Fragment read(ClassLoader classLoader, String str) {
        try {
            return AudioAttributesCompatParcelizer(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.AudioAttributesCompatParcelizer(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.AudioAttributesCompatParcelizer(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new Fragment.AudioAttributesCompatParcelizer(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new Fragment.AudioAttributesCompatParcelizer(sb4.toString(), e4);
        }
    }
}
