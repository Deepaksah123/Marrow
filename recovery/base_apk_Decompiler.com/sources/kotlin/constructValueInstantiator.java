package kotlin;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/constructValueInstantiator;", "Lo/hasDelegatingCreator;", "<init>", "()V", "", "Lo/JsonReadContext;", "AudioAttributesCompatParcelizer", "Ljava/util/Set;", "write", "()Ljava/util/Set;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class constructValueInstantiator implements hasDelegatingCreator {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Set<JsonReadContext> read = Collections.newSetFromMap(new WeakHashMap());

    @Override // kotlin.hasDelegatingCreator
    public final Set<JsonReadContext> write() {
        return this.read;
    }
}
