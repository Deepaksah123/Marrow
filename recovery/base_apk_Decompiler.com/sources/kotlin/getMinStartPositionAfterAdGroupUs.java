package kotlin;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class getMinStartPositionAfterAdGroupUs {
    private final Context RemoteActionCompatParcelizer;

    public getMinStartPositionAfterAdGroupUs(Context context) {
        this.RemoteActionCompatParcelizer = context;
    }

    private ApplicationInfo AudioAttributesCompatParcelizer() throws PackageManager.NameNotFoundException {
        return this.RemoteActionCompatParcelizer.getPackageManager().getApplicationInfo(this.RemoteActionCompatParcelizer.getPackageName(), 128);
    }

    public final List<getFirstMediaPeriodInfoOfNextPeriod> RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (applicationInfoAudioAttributesCompatParcelizer != null && ((PackageItemInfo) applicationInfoAudioAttributesCompatParcelizer).metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(((PackageItemInfo) applicationInfoAudioAttributesCompatParcelizer).metaData);
                }
                for (String str : ((PackageItemInfo) applicationInfoAudioAttributesCompatParcelizer).metaData.keySet()) {
                    if ("GlideModule".equals(((PackageItemInfo) applicationInfoAudioAttributesCompatParcelizer).metaData.get(str))) {
                        arrayList.add(AudioAttributesCompatParcelizer(str));
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            Log.isLoggable("ManifestParser", 3);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    private static getFirstMediaPeriodInfoOfNextPeriod AudioAttributesCompatParcelizer(String str) {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                RemoteActionCompatParcelizer(cls, e);
                objNewInstance = null;
            } catch (InstantiationException e2) {
                RemoteActionCompatParcelizer(cls, e2);
                objNewInstance = null;
            } catch (NoSuchMethodException e3) {
                RemoteActionCompatParcelizer(cls, e3);
                objNewInstance = null;
            } catch (InvocationTargetException e4) {
                RemoteActionCompatParcelizer(cls, e4);
                objNewInstance = null;
            }
            if (!(objNewInstance instanceof getFirstMediaPeriodInfoOfNextPeriod)) {
                throw new RuntimeException("Expected instanceof GlideModule, but found: ".concat(String.valueOf(objNewInstance)));
            }
            return (getFirstMediaPeriodInfoOfNextPeriod) objNewInstance;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void RemoteActionCompatParcelizer(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(cls)), exc);
    }
}
