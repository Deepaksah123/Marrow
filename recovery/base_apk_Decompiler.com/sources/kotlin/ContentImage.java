package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class ContentImage {
    public static final ContentImage RemoteActionCompatParcelizer = new ContentImage();
    private static write read;

    public static final class write {
        private final Method RemoteActionCompatParcelizer;
        private final Method write;

        public write(Method method, Method method2) {
            this.RemoteActionCompatParcelizer = method;
            this.write = method2;
        }

        public final Method AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final Method IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    private ContentImage() {
    }

    private static write IconCompatParcelizer(Member member) {
        toMagicModuleMetaRepoModel.write(member, "");
        Class<?> cls = member.getClass();
        try {
            return new write(cls.getMethod("getParameters", new Class[0]), getFinalImageUrl.read(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return new write(null, null);
        }
    }

    public final List<String> AudioAttributesCompatParcelizer(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(member, "");
        write writeVarIconCompatParcelizer = read;
        if (writeVarIconCompatParcelizer == null) {
            synchronized (this) {
                writeVarIconCompatParcelizer = read;
                if (writeVarIconCompatParcelizer == null) {
                    writeVarIconCompatParcelizer = IconCompatParcelizer(member);
                    read = writeVarIconCompatParcelizer;
                }
            }
        }
        Method methodIconCompatParcelizer = writeVarIconCompatParcelizer.IconCompatParcelizer();
        if (methodIconCompatParcelizer == null || (methodAudioAttributesCompatParcelizer = writeVarIconCompatParcelizer.AudioAttributesCompatParcelizer()) == null) {
            return null;
        }
        Object objInvoke = methodIconCompatParcelizer.invoke(member, new Object[0]);
        toMagicModuleMetaRepoModel.read(objInvoke, "");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodAudioAttributesCompatParcelizer.invoke(obj, new Object[0]);
            toMagicModuleMetaRepoModel.read(objInvoke2, "");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
