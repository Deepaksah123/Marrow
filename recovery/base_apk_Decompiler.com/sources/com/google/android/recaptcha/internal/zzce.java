package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.getShowPopup;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzce implements InvocationHandler {
    private final Object zza;

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method.getName(), (Object) "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method.getName(), (Object) "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method.getName(), (Object) "equals") && method.getParameterTypes().length != 0) {
            boolean z = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if ((obj3 != null ? obj3.hashCode() : 0) == obj.hashCode()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        if (!zza(obj, method, objArr)) {
            return getShowPopup.INSTANCE;
        }
        if ((this.zza == null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(zzgd.zza(obj2.getClass()), zzgd.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            return obj4 == null ? getShowPopup.INSTANCE : obj4;
        }
        Object obj5 = this.zza;
        Class<?> returnType = method.getReturnType();
        StringBuilder sb = new StringBuilder();
        sb.append(obj5);
        sb.append(" cannot be returned from method with return type ");
        sb.append(returnType);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);

    public zzce(Object obj) {
        this.zza = obj;
    }
}
