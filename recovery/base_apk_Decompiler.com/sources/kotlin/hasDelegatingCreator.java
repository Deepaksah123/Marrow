package kotlin;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/hasDelegatingCreator;", "", "", "Lo/JsonReadContext;", "write", "()Ljava/util/Set;", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface hasDelegatingCreator {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.IconCompatParcelizer;

    Set<JsonReadContext> write();

    /* JADX INFO: renamed from: o.hasDelegatingCreator$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/hasDelegatingCreator$IconCompatParcelizer;", "", "<init>", "()V", "Lo/hasDelegatingCreator;", "IconCompatParcelizer", "()Lo/hasDelegatingCreator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

        private Companion() {
        }

        public final hasDelegatingCreator IconCompatParcelizer() {
            return new constructValueInstantiator();
        }
    }
}
