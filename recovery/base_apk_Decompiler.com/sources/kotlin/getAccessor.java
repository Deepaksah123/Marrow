package kotlin;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes4.dex */
final class getAccessor {
    private static final getAccessor IconCompatParcelizer = new getAccessor();
    private final ConcurrentMap<Class<?>, getPrimaryMember<?>> read = new ConcurrentHashMap();
    private final getSetter AudioAttributesCompatParcelizer = new _createConverter();

    public static getAccessor IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public final <T> void RemoteActionCompatParcelizer(T t, getGetter getgetter, asAnnotations asannotations) throws IOException {
        AudioAttributesCompatParcelizer(t).AudioAttributesCompatParcelizer(t, getgetter, asannotations);
    }

    public final <T> getPrimaryMember<T> read(Class<T> cls) {
        forDeserialization.read(cls, "messageType");
        getPrimaryMember<T> getprimarymemberIconCompatParcelizer = (getPrimaryMember) this.read.get(cls);
        if (getprimarymemberIconCompatParcelizer == null) {
            getprimarymemberIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer(cls);
            getPrimaryMember<T> getprimarymember = (getPrimaryMember<T>) AudioAttributesCompatParcelizer(cls, getprimarymemberIconCompatParcelizer);
            if (getprimarymember != null) {
                return getprimarymember;
            }
        }
        return getprimarymemberIconCompatParcelizer;
    }

    public final <T> getPrimaryMember<T> AudioAttributesCompatParcelizer(T t) {
        return read(t.getClass());
    }

    private getPrimaryMember<?> AudioAttributesCompatParcelizer(Class<?> cls, getPrimaryMember<?> getprimarymember) {
        forDeserialization.read(cls, "messageType");
        forDeserialization.read(getprimarymember, "schema");
        return this.read.putIfAbsent(cls, getprimarymember);
    }

    private getAccessor() {
    }
}
