package kotlin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.SettingsItem;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0002\u0012\rB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017"}, d2 = {"Lo/SettingsResult;", "Lo/SettingsItem;", "Ljava/lang/reflect/Method;", "p0", "p1", "p2", "Ljava/lang/Class;", "p3", "p4", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "Ljavax/net/ssl/SSLSocket;", "", "write", "(Ljavax/net/ssl/SSLSocket;)V", "", "", "Lo/ThemeKtExternalSyntheticLambda1;", "RemoteActionCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "AudioAttributesCompatParcelizer", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "read", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SettingsResult extends SettingsItem {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Class<?> write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Method AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Class<?> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Method read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Method RemoteActionCompatParcelizer;

    public SettingsResult(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        toMagicModuleMetaRepoModel.write(method, "");
        toMagicModuleMetaRepoModel.write(method2, "");
        toMagicModuleMetaRepoModel.write(method3, "");
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(cls2, "");
        this.RemoteActionCompatParcelizer = method;
        this.read = method2;
        this.AudioAttributesCompatParcelizer = method3;
        this.write = cls;
        this.IconCompatParcelizer = cls2;
    }

    @Override // kotlin.SettingsItem
    public final void RemoteActionCompatParcelizer(SSLSocket p0, String p1, List<? extends ThemeKtExternalSyntheticLambda1> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        try {
            this.RemoteActionCompatParcelizer.invoke(null, p0, Proxy.newProxyInstance(SettingsItem.class.getClassLoader(), new Class[]{this.write, this.IconCompatParcelizer}, new RemoteActionCompatParcelizer(SettingsItem.IconCompatParcelizer.IconCompatParcelizer(p2))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // kotlin.SettingsItem
    public final void write(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            this.AudioAttributesCompatParcelizer.invoke(null, p0);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // kotlin.SettingsItem
    public final String AudioAttributesCompatParcelizer(SSLSocket p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.read.invoke(null, p0));
            toMagicModuleMetaRepoModel.read(invocationHandler, "");
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) invocationHandler;
            if (!remoteActionCompatParcelizer.read() && remoteActionCompatParcelizer.IconCompatParcelizer() == null) {
                SettingsResult settingsResult = this;
                SettingsItem.RemoteActionCompatParcelizer("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, 6);
                return null;
            }
            if (remoteActionCompatParcelizer.read()) {
                return null;
            }
            return remoteActionCompatParcelizer.IconCompatParcelizer();
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    static final class RemoteActionCompatParcelizer implements InvocationHandler {
        private String IconCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private final List<String> write;

        public RemoteActionCompatParcelizer(List<String> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.write = list;
        }

        public final boolean read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            toMagicModuleMetaRepoModel.write(obj, "");
            toMagicModuleMetaRepoModel.write(method, "");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) "supports") && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) "unsupported") && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Void.TYPE, returnType)) {
                this.RemoteActionCompatParcelizer = true;
                return null;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) "protocols") && objArr.length == 0) {
                return this.write;
            }
            if ((toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) "selectProtocol") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) "select")) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(String.class, returnType) && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    toMagicModuleMetaRepoModel.read(obj2, "");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            toMagicModuleMetaRepoModel.read(obj3, "");
                            String str = (String) obj3;
                            if (!this.write.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.IconCompatParcelizer = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.write.get(0);
                    this.IconCompatParcelizer = str2;
                    return str2;
                }
            }
            if ((toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) "protocolSelected") || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) name, (Object) "selected")) && objArr.length == 1) {
                Object obj4 = objArr[0];
                toMagicModuleMetaRepoModel.read(obj4, "");
                this.IconCompatParcelizer = (String) obj4;
                return null;
            }
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* JADX INFO: renamed from: o.SettingsResult$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/SettingsResult$write;", "", "<init>", "()V", "Lo/SettingsItem;", "read", "()Lo/SettingsItem;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static SettingsItem read() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(property, "");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod("remove", SSLSocket.class);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method, "");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method2, "");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method3, "");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls3, "");
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls4, "");
                return new SettingsResult(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
