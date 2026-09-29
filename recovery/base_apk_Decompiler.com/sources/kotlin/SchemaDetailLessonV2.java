package kotlin;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bJ\u0012\u0010\t\u001a\u00020\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0014\u0010\f\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J+\u0010\u0015\u001a\u0002H\u0016\"\u0004\b\u0000\u0010\u00162\n\u0010\u0017\u001a\u00060\u0001j\u0002`\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00160\u001a¢\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u001e\u0012\u0004\u0012\u0002H\u001f0\u001d\"\u0004\b\u0000\u0010\u001e\"\u0004\b\u0001\u0010\u001fJ\u0012\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001e0!\"\u0004\b\u0000\u0010\u001e¨\u0006\""}, d2 = {"Lorg/koin/mp/KoinPlatformTools;", "", "<init>", "()V", "getStackTrace", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getClassName", "kClass", "Lkotlin/reflect/KClass;", "getClassFullNameOrNull", "defaultLazyMode", "Lkotlin/LazyThreadSafetyMode;", "defaultLogger", "Lorg/koin/core/logger/Logger;", "level", "Lorg/koin/core/logger/Level;", "defaultContext", "Lorg/koin/core/context/KoinContext;", "synchronized", "R", "lock", "Lorg/koin/mp/Lockable;", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "safeHashMap", "", "K", "V", "safeSet", "", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SchemaDetailLessonV2 {
    public static final SchemaDetailLessonV2 read = new SchemaDetailLessonV2();

    private SchemaDetailLessonV2() {
    }

    public static String RemoteActionCompatParcelizer(isHdPlaybackError<?> ishdplaybackerror) {
        toMagicModuleMetaRepoModel.write(ishdplaybackerror, "");
        String name = MagicModuleFeedbackRequestBody.IconCompatParcelizer(ishdplaybackerror).getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        return name;
    }

    public static <R> R write(Object obj, getCreatedOnDateMs<? extends R> getcreatedondatems) {
        R rInvoke;
        toMagicModuleMetaRepoModel.write(obj, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        synchronized (obj) {
            rInvoke = getcreatedondatems.invoke();
        }
        return rInvoke;
    }

    public static <K, V> Map<K, V> write() {
        return new ConcurrentHashMap();
    }

    public static <K> Set<K> read() {
        Set<K> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setNewSetFromMap, "");
        return setNewSetFromMap;
    }
}
