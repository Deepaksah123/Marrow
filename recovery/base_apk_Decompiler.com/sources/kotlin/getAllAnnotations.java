package kotlin;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AnnotatedMethod;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u000fJ&\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0012\u001a\u00020\r2\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00190\u0018\"\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u0012\u0010\u001aJ!\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u000b\u0010\u0014J,\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00132\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u001bJ%\u0010\u001c\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R$\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lo/getAllAnnotations;", "Lo/AnnotatedMethod;", "", "Lo/AnnotatedMethod$RemoteActionCompatParcelizer;", "", "p0", "", "p1", "<init>", "(Ljava/util/Map;Z)V", "", "AudioAttributesCompatParcelizer", "()Ljava/util/Map;", "", "read", "()V", "equals", "(Ljava/lang/Object;)Z", "write", "T", "(Lo/AnnotatedMethod$RemoteActionCompatParcelizer;)Ljava/lang/Object;", "", "hashCode", "()I", "", "Lo/AnnotatedMethod$write;", "([Lo/AnnotatedMethod$write;)V", "(Lo/AnnotatedMethod$RemoteActionCompatParcelizer;Ljava/lang/Object;)V", "RemoteActionCompatParcelizer", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "IconCompatParcelizer", "Ljava/util/Map;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getAllAnnotations extends AnnotatedMethod {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object> read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final AtomicBoolean AudioAttributesCompatParcelizer;

    public /* synthetic */ getAllAnnotations(LinkedHashMap linkedHashMap, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new LinkedHashMap() : linkedHashMap, (i & 2) != 0 ? true : z);
    }

    public getAllAnnotations(Map<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object> map, boolean z) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.read = map;
        this.AudioAttributesCompatParcelizer = new AtomicBoolean(z);
    }

    private void read() {
        if (this.AudioAttributesCompatParcelizer.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void write() {
        this.AudioAttributesCompatParcelizer.set(true);
    }

    @Override // kotlin.AnnotatedMethod
    public final <T> T write(AnnotatedMethod.RemoteActionCompatParcelizer<T> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (T) this.read.get(p0);
    }

    @Override // kotlin.AnnotatedMethod
    public final Map<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object> AudioAttributesCompatParcelizer() {
        Map<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(this.read);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    public final <T> void read(AnnotatedMethod.RemoteActionCompatParcelizer<T> p0, T p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        RemoteActionCompatParcelizer(p0, p1);
    }

    private void RemoteActionCompatParcelizer(AnnotatedMethod.RemoteActionCompatParcelizer<?> p0, Object p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        if (p1 == null) {
            AudioAttributesCompatParcelizer(p0);
            return;
        }
        if (!(p1 instanceof Set)) {
            this.read.put(p0, p1);
            return;
        }
        Map<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object> map = this.read;
        Set setUnmodifiableSet = Collections.unmodifiableSet(IntermediateLoginResponseBody.onPlayFromUri((Iterable) p1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(setUnmodifiableSet, "");
        map.put(p0, setUnmodifiableSet);
    }

    public final void write(AnnotatedMethod.write<?>... p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        for (AnnotatedMethod.write<?> writeVar : p0) {
            RemoteActionCompatParcelizer(writeVar.IconCompatParcelizer(), writeVar.read());
        }
    }

    public final <T> T AudioAttributesCompatParcelizer(AnnotatedMethod.RemoteActionCompatParcelizer<T> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read();
        return (T) this.read.remove(p0);
    }

    public final boolean equals(Object p0) {
        if (p0 instanceof getAllAnnotations) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((getAllAnnotations) p0).read);
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.read.entrySet(), ",\n", "{\n", "\n}", 0, null, AnonymousClass4.write, 24);
    }

    /* JADX INFO: renamed from: o.getAllAnnotations$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lo/AnnotatedMethod$RemoteActionCompatParcelizer;", "", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Map.Entry<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object>, CharSequence> {
        public static final AnonymousClass4 write = new AnonymousClass4();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry<AnnotatedMethod.RemoteActionCompatParcelizer<?>, Object> entry) {
            toMagicModuleMetaRepoModel.write(entry, "");
            StringBuilder sb = new StringBuilder("  ");
            sb.append(entry.getKey().IconCompatParcelizer());
            sb.append(" = ");
            sb.append(entry.getValue());
            return sb.toString();
        }

        AnonymousClass4() {
            super(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getAllAnnotations() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
