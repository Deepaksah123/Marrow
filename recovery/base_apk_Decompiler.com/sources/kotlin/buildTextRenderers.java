package kotlin;

import android.net.NetworkRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/buildTextRenderers;", "", "p0", "<init>", "(Ljava/lang/Object;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/Object;", "Landroid/net/NetworkRequest;", "IconCompatParcelizer", "()Landroid/net/NetworkRequest;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class buildTextRenderers {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String write;
    private final Object read;

    public buildTextRenderers(Object obj) {
        this.read = obj;
    }

    public /* synthetic */ buildTextRenderers(Object obj, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : obj);
    }

    /* JADX INFO: renamed from: o.buildTextRenderers$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/buildTextRenderers$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "write", "Ljava/lang/String;", "IconCompatParcelizer", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final String IconCompatParcelizer() {
            return buildTextRenderers.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        String strWrite = n.write("NetworkRequestCompat");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strWrite, "");
        write = strWrite;
    }

    public final NetworkRequest IconCompatParcelizer() {
        return (NetworkRequest) this.read;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public buildTextRenderers() {
        MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0 = null;
        this(magicModuleRepositoryImplExternalSyntheticLambda0, 1, magicModuleRepositoryImplExternalSyntheticLambda0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof buildTextRenderers) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((buildTextRenderers) p0).read);
    }

    public final int hashCode() {
        Object obj = this.read;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buildTextRenderers(read=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
