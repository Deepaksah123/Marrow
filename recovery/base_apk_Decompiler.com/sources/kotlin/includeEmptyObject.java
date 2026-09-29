package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012"}, d2 = {"Lo/includeEmptyObject;", "", "p0", "p1", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;)I", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/Object;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class includeEmptyObject {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object IconCompatParcelizer;

    public includeEmptyObject(Object obj, Object obj2) {
        this.AudioAttributesCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
    }

    public final int hashCode() {
        return (AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer) * 31) + AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    private final int AudioAttributesCompatParcelizer(Object p0) {
        if (p0 instanceof Enum) {
            return ((Enum) p0).ordinal();
        }
        if (p0 != null) {
            return p0.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof includeEmptyObject)) {
            return false;
        }
        includeEmptyObject includeemptyobject = (includeEmptyObject) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, includeemptyobject.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, includeemptyobject.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("includeEmptyObject(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
