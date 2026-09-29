package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda34;", "", "<init>", "()V", "", "p0", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "", "p1", "(Landroid/content/Context;)Ljava/lang/String;", "Ljava/io/File;", "RemoteActionCompatParcelizer", "(Ljava/io/File;)Ljava/lang/String;", "Ljava/lang/String;", "", "read", "[Ljava/lang/String;", "IconCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda34 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda34 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda34();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final String[] IconCompatParcelizer;

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("HashUtils", "");
        AudioAttributesCompatParcelizer = "HashUtils";
        IconCompatParcelizer = new String[]{"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"};
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda34() {
    }

    @getMagicModuleMeta
    public static final String AudioAttributesCompatParcelizer(String p0) throws Exception {
        return RemoteActionCompatParcelizer(new File(p0));
    }

    private static String RemoteActionCompatParcelizer(File p0) throws Exception {
        int i;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(p0), 1024);
        try {
            BufferedInputStream bufferedInputStream2 = bufferedInputStream;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            do {
                i = bufferedInputStream2.read(bArr);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                }
            } while (i != -1);
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            MagicModuleMetaLSModel.IconCompatParcelizer(bufferedInputStream, null);
            return string;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @getMagicModuleMeta
    public static final String AudioAttributesCompatParcelizer(Context context) throws CertificateException {
        toMagicModuleMetaRepoModel.write(context, "");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        String[] strArr = IconCompatParcelizer;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(Base64.decode(str, 0))));
        }
        List listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) arrayList);
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        writeVar.write = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        reentrantLock.lock();
        try {
            Class<?> cls = Class.forName("android.content.pm.Checksum");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls, "");
            Field field = cls.getField("TYPE_WHOLE_MD5");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(field, "");
            Object obj = field.get(null);
            Class<?> cls2 = Class.forName("android.content.pm.PackageManager$OnChecksumsReadyListener");
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cls2, "");
            Object objNewProxyInstance = Proxy.newProxyInstance(DefaultAnalyticsCollectorExternalSyntheticLambda34.class.getClassLoader(), new Class[]{cls2}, new IconCompatParcelizer(obj, writeVar, reentrantLock, conditionNewCondition));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objNewProxyInstance, "");
            Method method = PackageManager.class.getMethod("requestChecksums", String.class, Boolean.TYPE, Integer.TYPE, List.class, cls2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method, "");
            method.invoke(context.getPackageManager(), context.getPackageName(), Boolean.FALSE, obj, IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) listMediaBrowserCompatItemReceiver), objNewProxyInstance);
            conditionNewCondition.await();
            String str2 = (String) writeVar.write;
            reentrantLock.unlock();
            return str2;
        } catch (Throwable unused) {
            reentrantLock.unlock();
            return null;
        }
    }

    public static final class IconCompatParcelizer implements InvocationHandler {
        private /* synthetic */ ReentrantLock IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.write read;
        private /* synthetic */ Condition write;

        IconCompatParcelizer(Object obj, MagicModuleUseCaseImplWhenMappings.write writeVar, ReentrantLock reentrantLock, Condition condition) {
            this.RemoteActionCompatParcelizer = obj;
            this.read = writeVar;
            this.IconCompatParcelizer = reentrantLock;
            this.write = condition;
        }

        /* JADX WARN: Type inference failed for: r8v8, types: [T, java.lang.String] */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            toMagicModuleMetaRepoModel.write(method, "");
            toMagicModuleMetaRepoModel.write(objArr, "");
            try {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method.getName(), (Object) "onChecksumsReady") && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                        }
                        for (Object obj3 : (List) obj2) {
                            if (obj3 != null) {
                                Method method2 = obj3.getClass().getMethod("getSplitName", new Class[0]);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method2, "");
                                Method method3 = obj3.getClass().getMethod("getType", new Class[0]);
                                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method3, "");
                                if (method2.invoke(obj3, new Object[0]) == null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(method3.invoke(obj3, new Object[0]), this.RemoteActionCompatParcelizer)) {
                                    Method method4 = obj3.getClass().getMethod("getValue", new Class[0]);
                                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(method4, "");
                                    Object objInvoke = method4.invoke(obj3, new Object[0]);
                                    if (objInvoke == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                    }
                                    this.read.write = new BigInteger(1, (byte[]) objInvoke).toString(16);
                                    this.IconCompatParcelizer.lock();
                                    try {
                                        this.write.signalAll();
                                        return null;
                                    } finally {
                                        this.IconCompatParcelizer.unlock();
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
                DefaultAnalyticsCollectorExternalSyntheticLambda34 defaultAnalyticsCollectorExternalSyntheticLambda34 = DefaultAnalyticsCollectorExternalSyntheticLambda34.INSTANCE;
                String unused2 = DefaultAnalyticsCollectorExternalSyntheticLambda34.AudioAttributesCompatParcelizer;
            }
            return null;
        }
    }
}
