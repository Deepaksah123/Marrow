package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/parseTextAlignment;", "", "", "p0", "Lo/WebvttCueParserElement;", "p1", "<init>", "(ZLo/WebvttCueParserElement;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Z", "()Z", "RemoteActionCompatParcelizer", "Lo/WebvttCueParserElement;", "write", "()Lo/WebvttCueParserElement;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class parseTextAlignment {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final WebvttCueParserElement write;
    private final boolean read;

    public parseTextAlignment(boolean z, WebvttCueParserElement webvttCueParserElement) {
        this.read = z;
        this.write = webvttCueParserElement;
    }

    public /* synthetic */ parseTextAlignment(boolean z, WebvttCueParserElement webvttCueParserElement, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : webvttCueParserElement);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final WebvttCueParserElement getWrite() {
        return this.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public parseTextAlignment() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof parseTextAlignment)) {
            return false;
        }
        parseTextAlignment parsetextalignment = (parseTextAlignment) p0;
        return this.read == parsetextalignment.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, parsetextalignment.write);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.read);
        WebvttCueParserElement webvttCueParserElement = this.write;
        return (iHashCode * 31) + (webvttCueParserElement == null ? 0 : webvttCueParserElement.hashCode());
    }

    public final String toString() {
        boolean z = this.read;
        WebvttCueParserElement webvttCueParserElement = this.write;
        StringBuilder sb = new StringBuilder("parseTextAlignment(read=");
        sb.append(z);
        sb.append(", write=");
        sb.append(webvttCueParserElement);
        sb.append(")");
        return sb.toString();
    }
}
