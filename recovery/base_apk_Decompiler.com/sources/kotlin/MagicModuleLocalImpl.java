package kotlin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public class MagicModuleLocalImpl {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/MagicModuleLocalImpl$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Ljava/lang/reflect/Method;", "read", "Ljava/lang/reflect/Method;", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Method write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        public static final Method IconCompatParcelizer;

        private AudioAttributesCompatParcelizer() {
        }

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            toMagicModuleMetaRepoModel.write(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method2.getName(), (Object) "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parameterTypes, "");
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getOrderDetails.onCustomAction(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            IconCompatParcelizer = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method3.getName(), (Object) "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            write = method;
        }
    }

    public void write(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        toMagicModuleMetaRepoModel.write(th, "");
        toMagicModuleMetaRepoModel.write(th2, "");
        Method method = AudioAttributesCompatParcelizer.IconCompatParcelizer;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public List<Throwable> write(Throwable th) {
        Object objInvoke;
        List<Throwable> list;
        toMagicModuleMetaRepoModel.write(th, "");
        Method method = AudioAttributesCompatParcelizer.write;
        return (method == null || (objInvoke = method.invoke(th, new Object[0])) == null || (list = getOrderDetails.read((Throwable[]) objInvoke)) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
    }

    public getFinalData RemoteActionCompatParcelizer() {
        return new PlaybackConfigRsModel();
    }
}
