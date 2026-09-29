package kotlin;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
final class getLesson<V> extends refreshSubscription<V> {
    private final getAnswerMap<Class<?>, V> AudioAttributesCompatParcelizer;
    private final ConcurrentHashMap<Class<?>, V> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public getLesson(getAnswerMap<? super Class<?>, ? extends V> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap<>();
    }

    @Override // kotlin.refreshSubscription
    public final V write(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.RemoteActionCompatParcelizer;
        V v = (V) concurrentHashMap.get(cls);
        if (v != null) {
            return v;
        }
        V vInvoke = this.AudioAttributesCompatParcelizer.invoke(cls);
        V v2 = (V) concurrentHashMap.putIfAbsent(cls, vInvoke);
        return v2 == null ? vInvoke : v2;
    }
}
