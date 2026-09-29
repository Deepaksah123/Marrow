package kotlin;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b&\u0018\u0000 \u00162\u00020\u0001:\u0003\u0007\u0017\u0016B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015"}, d2 = {"Lo/withFieldVisibility;", "", "<init>", "()V", "T", "Lo/withFieldVisibility$read;", "p0", "read", "(Lo/withFieldVisibility$read;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "AudioAttributesCompatParcelizer", "Ljava/util/Map;", "()Ljava/util/Map;", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class withFieldVisibility {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Map<read<?>, Object> RemoteActionCompatParcelizer = new LinkedHashMap();

    /* JADX INFO: loaded from: classes2.dex */
    public interface read<T> {
    }

    public abstract <T> T read(read<T> p0);

    public final Map<read<?>, Object> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public boolean equals(Object p0) {
        return (p0 instanceof withFieldVisibility) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((withFieldVisibility) p0).RemoteActionCompatParcelizer);
    }

    public int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreationExtras(extras=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/withFieldVisibility$write;", "Lo/withFieldVisibility;", "<init>", "()V", "T", "Lo/withFieldVisibility$read;", "p0", "read", "(Lo/withFieldVisibility$read;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write extends withFieldVisibility {
        public static final write INSTANCE = new write();

        private write() {
        }

        @Override // kotlin.withFieldVisibility
        public final <T> T read(read<T> p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return null;
        }
    }

    /* JADX INFO: renamed from: o.withFieldVisibility$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/withFieldVisibility$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
