package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@getPlanOldPrice
final class FrameworkMediaDrmExternalSyntheticLambda1 implements isCryptoSchemeSupported {
    private final Map<String, FrameworkMediaDrmApi31> AudioAttributesCompatParcelizer;
    private final lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm read;
    private final IconCompatParcelizer write;

    @setSdkPayload
    FrameworkMediaDrmExternalSyntheticLambda1(Context context, lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm lambdasetonkeystatuschangelistener2comgoogleandroidexoplayer2drmframeworkmediadrm) {
        this(new IconCompatParcelizer(context), lambdasetonkeystatuschangelistener2comgoogleandroidexoplayer2drmframeworkmediadrm);
    }

    private FrameworkMediaDrmExternalSyntheticLambda1(IconCompatParcelizer iconCompatParcelizer, lambdasetOnKeyStatusChangeListener2comgoogleandroidexoplayer2drmFrameworkMediaDrm lambdasetonkeystatuschangelistener2comgoogleandroidexoplayer2drmframeworkmediadrm) {
        this.AudioAttributesCompatParcelizer = new HashMap();
        this.write = iconCompatParcelizer;
        this.read = lambdasetonkeystatuschangelistener2comgoogleandroidexoplayer2drmframeworkmediadrm;
    }

    @Override // kotlin.isCryptoSchemeSupported
    public final FrameworkMediaDrmApi31 IconCompatParcelizer(String str) {
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer.containsKey(str)) {
                return this.AudioAttributesCompatParcelizer.get(str);
            }
            adjustUuid adjustuuidAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(str);
            if (adjustuuidAudioAttributesCompatParcelizer == null) {
                return null;
            }
            FrameworkMediaDrmApi31 frameworkMediaDrmApi31Create = adjustuuidAudioAttributesCompatParcelizer.create(this.read.AudioAttributesCompatParcelizer(str));
            this.AudioAttributesCompatParcelizer.put(str, frameworkMediaDrmApi31Create);
            return frameworkMediaDrmApi31Create;
        }
    }

    static class IconCompatParcelizer {
        private Map<String, String> IconCompatParcelizer = null;
        private final Context RemoteActionCompatParcelizer;

        IconCompatParcelizer(Context context) {
            this.RemoteActionCompatParcelizer = context;
        }

        final adjustUuid AudioAttributesCompatParcelizer(String str) {
            String str2 = read().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (adjustUuid) Class.forName(str2).asSubclass(adjustUuid.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                new Object[]{str2};
                return null;
            } catch (IllegalAccessException unused2) {
                new Object[]{str2};
                return null;
            } catch (InstantiationException unused3) {
                new Object[]{str2};
                return null;
            } catch (NoSuchMethodException unused4) {
                new Object[]{str2};
                return null;
            } catch (InvocationTargetException unused5) {
                new Object[]{str2};
                return null;
            }
        }

        private Map<String, String> read() {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = read(this.RemoteActionCompatParcelizer);
            }
            return this.IconCompatParcelizer;
        }

        private static Map<String, String> read(Context context) {
            Bundle bundleIconCompatParcelizer = IconCompatParcelizer(context);
            if (bundleIconCompatParcelizer == null) {
                return Collections.emptyMap();
            }
            HashMap map = new HashMap();
            for (String str : bundleIconCompatParcelizer.keySet()) {
                Object obj = bundleIconCompatParcelizer.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private static Bundle IconCompatParcelizer(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return ((PackageItemInfo) serviceInfo).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }
}
