package kotlin;

import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\r\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u001b\u0010\t\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/canCreateFromInt;", "", "Ljava/util/Locale;", "Lo/write;", "p0", "<init>", "(Ljava/util/Locale;)V", "", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "()Ljava/lang/String;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "read", "Ljava/util/Locale;", "IconCompatParcelizer", "()Ljava/util/Locale;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class canCreateFromInt {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Locale RemoteActionCompatParcelizer;

    public canCreateFromInt(Locale locale) {
        this.RemoteActionCompatParcelizer = locale;
    }

    /* JADX INFO: renamed from: o.canCreateFromInt$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/canCreateFromInt$write;", "", "<init>", "()V", "Lo/canCreateFromInt;", "IconCompatParcelizer", "()Lo/canCreateFromInt;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final canCreateFromInt IconCompatParcelizer() {
            return canCreateFromBigInteger.RemoteActionCompatParcelizer().write().read(0);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Locale getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public canCreateFromInt(String str) {
        this(canCreateFromBigInteger.RemoteActionCompatParcelizer().write(str));
    }

    public final String RemoteActionCompatParcelizer() {
        return canCreateFromDouble.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (p0 == null || !(p0 instanceof canCreateFromInt)) {
            return false;
        }
        if (this == p0) {
            return true;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) RemoteActionCompatParcelizer(), (Object) ((canCreateFromInt) p0).RemoteActionCompatParcelizer());
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer().hashCode();
    }

    public final String toString() {
        return RemoteActionCompatParcelizer();
    }
}
