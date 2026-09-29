package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/withClassIntrospector;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "read", "write", "Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class withClassIntrospector {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;
    private final Object write;

    public withClassIntrospector(String str, Object obj) {
        this.read = str;
        this.write = obj;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof withClassIntrospector)) {
            return false;
        }
        withClassIntrospector withclassintrospector = (withClassIntrospector) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) withclassintrospector.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, withclassintrospector.write);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        Object obj = this.write;
        return (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("withClassIntrospector(read=");
        sb.append(this.read);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
