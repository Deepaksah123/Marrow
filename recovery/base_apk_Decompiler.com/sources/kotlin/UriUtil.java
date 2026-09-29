package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/UriUtil;", "", "", "p0", "<init>", "(Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UriUtil {
    private final boolean AudioAttributesCompatParcelizer;

    public UriUtil(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public /* synthetic */ UriUtil(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z);
    }

    public UriUtil() {
        this(false, 1, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof UriUtil) && this.AudioAttributesCompatParcelizer == ((UriUtil) p0).AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("UriUtil(AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
