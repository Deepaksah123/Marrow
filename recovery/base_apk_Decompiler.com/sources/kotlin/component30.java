package kotlin;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.setImagesInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class component30 {
    private static final ConcurrentMap<getCustomModuleConfig, WeakReference<setImagesInfo>> AudioAttributesCompatParcelizer = new ConcurrentHashMap();

    public static final setImagesInfo AudioAttributesCompatParcelizer(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        ClassLoader classLoader = getFinalImageUrl.read(cls);
        getCustomModuleConfig getcustommoduleconfig = new getCustomModuleConfig(classLoader);
        ConcurrentMap<getCustomModuleConfig, WeakReference<setImagesInfo>> concurrentMap = AudioAttributesCompatParcelizer;
        WeakReference<setImagesInfo> weakReference = concurrentMap.get(getcustommoduleconfig);
        if (weakReference != null) {
            setImagesInfo setimagesinfo = weakReference.get();
            if (setimagesinfo != null) {
                return setimagesinfo;
            }
            concurrentMap.remove(getcustommoduleconfig, weakReference);
        }
        setImagesInfo.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setImagesInfo.AudioAttributesCompatParcelizer;
        setImagesInfo setimagesinfo2 = setImagesInfo.RemoteActionCompatParcelizer.read(classLoader);
        while (true) {
            ConcurrentMap<getCustomModuleConfig, WeakReference<setImagesInfo>> concurrentMap2 = AudioAttributesCompatParcelizer;
            WeakReference<setImagesInfo> weakReferencePutIfAbsent = concurrentMap2.putIfAbsent(getcustommoduleconfig, new WeakReference<>(setimagesinfo2));
            if (weakReferencePutIfAbsent == null) {
                return setimagesinfo2;
            }
            setImagesInfo setimagesinfo3 = weakReferencePutIfAbsent.get();
            if (setimagesinfo3 != null) {
                return setimagesinfo3;
            }
            concurrentMap2.remove(getcustommoduleconfig, weakReferencePutIfAbsent);
        }
    }
}
