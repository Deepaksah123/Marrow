package kotlin;

import java.io.Closeable;
import java.util.Map;
import kotlin.VisibilityChecker;
import kotlin.withFieldVisibility;

/* JADX INFO: loaded from: classes4.dex */
public final class setHighlighted implements VisibilityChecker.RemoteActionCompatParcelizer {
    public static final withFieldVisibility.read<getAnswerMap<Object, POJOPropertyBuilderWithMember>> IconCompatParcelizer = new withFieldVisibility.read<getAnswerMap<Object, POJOPropertyBuilderWithMember>>() { // from class: o.setHighlighted.2
    };
    private final VisibilityChecker.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private final VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
    private final Map<Class<?>, Boolean> write;

    public interface IconCompatParcelizer {
        Map<Class<?>, setDescriptionList<POJOPropertyBuilderWithMember>> IconCompatParcelizer();

        Map<Class<?>, Object> write();
    }

    public setHighlighted(Map<Class<?>, Boolean> map, VisibilityChecker.RemoteActionCompatParcelizer remoteActionCompatParcelizer, final GtaModel gtaModel) {
        this.write = map;
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = new VisibilityChecker.RemoteActionCompatParcelizer() { // from class: o.setHighlighted.1
            @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
            public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(Class<T> cls, withFieldVisibility withfieldvisibility) {
                final setNextPercentile setnextpercentile = new setNextPercentile();
                T t = (T) read(gtaModel.read(withoutIgnored.AudioAttributesCompatParcelizer(withfieldvisibility)).AudioAttributesCompatParcelizer(setnextpercentile).read(), cls, withfieldvisibility);
                t.write(new Closeable() { // from class: o.setPercentile
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        setnextpercentile.read();
                    }
                });
                return t;
            }

            private static <T extends POJOPropertyBuilderWithMember> T read(FreeVideoListResponseLessonAuthor freeVideoListResponseLessonAuthor, Class<T> cls, withFieldVisibility withfieldvisibility) {
                setDescriptionList<POJOPropertyBuilderWithMember> setdescriptionlist = ((IconCompatParcelizer) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(freeVideoListResponseLessonAuthor, IconCompatParcelizer.class)).IconCompatParcelizer().get(cls);
                getAnswerMap getanswermap = (getAnswerMap) withfieldvisibility.read(setHighlighted.IconCompatParcelizer);
                Object obj = ((IconCompatParcelizer) FreeVideoListResponseLesson.RemoteActionCompatParcelizer(freeVideoListResponseLessonAuthor, IconCompatParcelizer.class)).write().get(cls);
                if (obj == null) {
                    if (getanswermap != null) {
                        StringBuilder sb = new StringBuilder("Found creation callback but class ");
                        sb.append(cls.getName());
                        sb.append(" does not have an assisted factory specified in @HiltViewModel.");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (setdescriptionlist == null) {
                        StringBuilder sb2 = new StringBuilder("Expected the @HiltViewModel-annotated class ");
                        sb2.append(cls.getName());
                        sb2.append(" to be available in the multi-binding of @HiltViewModelMap but none was found.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    return (T) setdescriptionlist.get();
                }
                if (setdescriptionlist != null) {
                    StringBuilder sb3 = new StringBuilder("Found the @HiltViewModel-annotated class ");
                    sb3.append(cls.getName());
                    sb3.append(" in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    throw new AssertionError(sb3.toString());
                }
                if (getanswermap == null) {
                    StringBuilder sb4 = new StringBuilder("Found @HiltViewModel-annotated class ");
                    sb4.append(cls.getName());
                    sb4.append(" using @AssistedInject but no creation callback was provided in CreationExtras.");
                    throw new IllegalStateException(sb4.toString());
                }
                return (T) getanswermap.invoke(obj);
            }
        };
    }

    @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
    public final <T extends POJOPropertyBuilderWithMember> T AudioAttributesCompatParcelizer(Class<T> cls, withFieldVisibility withfieldvisibility) {
        if (this.write.containsKey(cls)) {
            return (T) this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(cls, withfieldvisibility);
        }
        return (T) this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(cls, withfieldvisibility);
    }

    @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
    public final <T extends POJOPropertyBuilderWithMember> T read(Class<T> cls) {
        if (this.write.containsKey(cls)) {
            return (T) this.RemoteActionCompatParcelizer.read(cls);
        }
        return (T) this.AudioAttributesCompatParcelizer.read(cls);
    }
}
