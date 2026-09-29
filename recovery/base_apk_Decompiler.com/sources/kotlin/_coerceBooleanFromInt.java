package kotlin;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class _coerceBooleanFromInt extends AppComponentFactory {

    public interface AudioAttributesCompatParcelizer {
        Object read();
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Activity) AudioAttributesCompatParcelizer(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Application) AudioAttributesCompatParcelizer(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (BroadcastReceiver) AudioAttributesCompatParcelizer(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (ContentProvider) AudioAttributesCompatParcelizer(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        return (Service) AudioAttributesCompatParcelizer(super.instantiateService(classLoader, str, intent));
    }

    private static <T> T AudioAttributesCompatParcelizer(T t) {
        T t2;
        return (!(t instanceof AudioAttributesCompatParcelizer) || (t2 = (T) ((AudioAttributesCompatParcelizer) t).read()) == null) ? t : t2;
    }
}
