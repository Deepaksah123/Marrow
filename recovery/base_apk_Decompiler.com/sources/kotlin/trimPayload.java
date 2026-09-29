package kotlin;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class trimPayload<T> {
    private final AudioAttributesCompatParcelizer<T> AudioAttributesCompatParcelizer;
    private final T read;

    /* JADX INFO: loaded from: classes3.dex */
    interface AudioAttributesCompatParcelizer<T> {
        List<String> read(T t);
    }

    public static trimPayload<Context> RemoteActionCompatParcelizer(Context context, Class<? extends Service> cls) {
        return new trimPayload<>(context, new IconCompatParcelizer(cls, (byte) 0));
    }

    private trimPayload(T t, AudioAttributesCompatParcelizer<T> audioAttributesCompatParcelizer) {
        this.read = t;
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
    }

    public final List<onInputBufferAvailable<ComponentRegistrar>> IconCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.AudioAttributesCompatParcelizer.read(this.read)) {
            arrayList.add(new onInputBufferAvailable() { // from class: o.OggPacket
                @Override // kotlin.onInputBufferAvailable
                public final Object write() {
                    return trimPayload.write(str);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ComponentRegistrar write(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (!ComponentRegistrar.class.isAssignableFrom(cls)) {
                throw new StreamReaderSetupData(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
            }
            return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            new Object[]{str};
            return null;
        } catch (IllegalAccessException e) {
            throw new StreamReaderSetupData(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new StreamReaderSetupData(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new StreamReaderSetupData(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new StreamReaderSetupData(String.format("Could not instantiate %s", str), e4);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static class IconCompatParcelizer implements AudioAttributesCompatParcelizer<Context> {
        private final Class<? extends Service> write;

        /* synthetic */ IconCompatParcelizer(Class cls, byte b) {
            this(cls);
        }

        private IconCompatParcelizer(Class<? extends Service> cls) {
            this.write = cls;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.trimPayload.AudioAttributesCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public List<String> read(Context context) {
            Bundle bundle = read2(context);
            if (bundle == null) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        private Bundle read2(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.write), 128);
                if (serviceInfo == null) {
                    Objects.toString(this.write);
                    return null;
                }
                return ((PackageItemInfo) serviceInfo).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }
}
