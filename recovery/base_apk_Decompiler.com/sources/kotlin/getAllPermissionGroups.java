package kotlin;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getAllPermissionGroups {
    protected final setTitleOptional<String, Method> AudioAttributesCompatParcelizer;
    protected final setTitleOptional<String, Class> IconCompatParcelizer;
    protected final setTitleOptional<String, Method> read;

    public static boolean write() {
        return false;
    }

    protected abstract void AudioAttributesCompatParcelizer(int i);

    protected abstract void AudioAttributesCompatParcelizer(CharSequence charSequence);

    protected abstract boolean AudioAttributesCompatParcelizer();

    protected abstract <T extends Parcelable> T AudioAttributesImplApi21Parcelizer();

    protected abstract String AudioAttributesImplApi26Parcelizer();

    protected abstract int AudioAttributesImplBaseParcelizer();

    protected abstract void IconCompatParcelizer(Parcelable parcelable);

    protected abstract byte[] IconCompatParcelizer();

    protected abstract CharSequence MediaBrowserCompatItemReceiver();

    protected abstract getAllPermissionGroups RemoteActionCompatParcelizer();

    protected abstract void RemoteActionCompatParcelizer(byte[] bArr);

    protected abstract boolean RemoteActionCompatParcelizer(int i);

    protected abstract void read();

    protected abstract void read(String str);

    protected abstract void write(int i);

    protected abstract void write(boolean z);

    public getAllPermissionGroups(setTitleOptional<String, Method> settitleoptional, setTitleOptional<String, Method> settitleoptional2, setTitleOptional<String, Class> settitleoptional3) {
        this.AudioAttributesCompatParcelizer = settitleoptional;
        this.read = settitleoptional2;
        this.IconCompatParcelizer = settitleoptional3;
    }

    public final void AudioAttributesCompatParcelizer(boolean z, int i) {
        AudioAttributesCompatParcelizer(i);
        write(z);
    }

    public final void read(byte[] bArr) {
        AudioAttributesCompatParcelizer(2);
        RemoteActionCompatParcelizer(bArr);
    }

    public final void AudioAttributesCompatParcelizer(CharSequence charSequence, int i) {
        AudioAttributesCompatParcelizer(i);
        AudioAttributesCompatParcelizer(charSequence);
    }

    public final void IconCompatParcelizer(int i, int i2) {
        AudioAttributesCompatParcelizer(i2);
        write(i);
    }

    public final void IconCompatParcelizer(String str, int i) {
        AudioAttributesCompatParcelizer(i);
        read(str);
    }

    public final void read(Parcelable parcelable, int i) {
        AudioAttributesCompatParcelizer(i);
        IconCompatParcelizer(parcelable);
    }

    public final boolean read(boolean z, int i) {
        return !RemoteActionCompatParcelizer(i) ? z : AudioAttributesCompatParcelizer();
    }

    public final int RemoteActionCompatParcelizer(int i, int i2) {
        return !RemoteActionCompatParcelizer(i2) ? i : AudioAttributesImplBaseParcelizer();
    }

    public final String read(String str, int i) {
        return !RemoteActionCompatParcelizer(i) ? str : AudioAttributesImplApi26Parcelizer();
    }

    public final byte[] AudioAttributesCompatParcelizer(byte[] bArr) {
        return !RemoteActionCompatParcelizer(2) ? bArr : IconCompatParcelizer();
    }

    public final <T extends Parcelable> T IconCompatParcelizer(T t, int i) {
        return !RemoteActionCompatParcelizer(i) ? t : (T) AudioAttributesImplApi21Parcelizer();
    }

    public final CharSequence write(CharSequence charSequence, int i) {
        return !RemoteActionCompatParcelizer(i) ? charSequence : MediaBrowserCompatItemReceiver();
    }

    public final void IconCompatParcelizer(getApplicationInfo getapplicationinfo) {
        AudioAttributesCompatParcelizer(1);
        AudioAttributesCompatParcelizer(getapplicationinfo);
    }

    public final void AudioAttributesCompatParcelizer(getApplicationInfo getapplicationinfo) {
        if (getapplicationinfo == null) {
            read((String) null);
            return;
        }
        RemoteActionCompatParcelizer(getapplicationinfo);
        getAllPermissionGroups getallpermissiongroupsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        IconCompatParcelizer(getapplicationinfo, getallpermissiongroupsRemoteActionCompatParcelizer);
        getallpermissiongroupsRemoteActionCompatParcelizer.read();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void RemoteActionCompatParcelizer(getApplicationInfo getapplicationinfo) {
        try {
            read(IconCompatParcelizer((Class<? extends getApplicationInfo>) getapplicationinfo.getClass()).getName());
        } catch (ClassNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(getapplicationinfo.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public final <T extends getApplicationInfo> T read(T t) {
        return !RemoteActionCompatParcelizer(1) ? t : (T) MediaBrowserCompatCustomActionResultReceiver();
    }

    public final <T extends getApplicationInfo> T MediaBrowserCompatCustomActionResultReceiver() {
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        if (strAudioAttributesImplApi26Parcelizer == null) {
            return null;
        }
        return (T) read(strAudioAttributesImplApi26Parcelizer, RemoteActionCompatParcelizer());
    }

    private <T extends getApplicationInfo> T read(String str, getAllPermissionGroups getallpermissiongroups) {
        try {
            return (T) AudioAttributesCompatParcelizer(str).invoke(null, getallpermissiongroups);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    private <T extends getApplicationInfo> void IconCompatParcelizer(T t, getAllPermissionGroups getallpermissiongroups) {
        try {
            read(t.getClass()).invoke(null, t, getallpermissiongroups);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    private Method AudioAttributesCompatParcelizer(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.AudioAttributesCompatParcelizer.get(str);
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName(str, true, getAllPermissionGroups.class.getClassLoader()).getDeclaredMethod("read", getAllPermissionGroups.class);
        this.AudioAttributesCompatParcelizer.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method read(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.read.get(cls.getName());
        if (method != null) {
            return method;
        }
        Method declaredMethod = IconCompatParcelizer((Class<? extends getApplicationInfo>) cls).getDeclaredMethod("write", cls, getAllPermissionGroups.class);
        this.read.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Class IconCompatParcelizer(Class<? extends getApplicationInfo> cls) throws ClassNotFoundException {
        Class cls2 = this.IconCompatParcelizer.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.IconCompatParcelizer.put(cls.getName(), cls3);
        return cls3;
    }
}
