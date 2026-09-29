package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class BinderWrapper {
    private final getApplicableScopes AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean write;

    public BinderWrapper(boolean z, boolean z2, boolean z3, getApplicableScopes getapplicablescopes) {
        toMagicModuleMetaRepoModel.write(getapplicablescopes, "");
        this.write = z;
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.AudioAttributesCompatParcelizer = getapplicablescopes;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getApplicableScopes write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BinderWrapper)) {
            return false;
        }
        BinderWrapper binderWrapper = (BinderWrapper) obj;
        return this.write == binderWrapper.write && this.IconCompatParcelizer == binderWrapper.IconCompatParcelizer && this.RemoteActionCompatParcelizer == binderWrapper.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == binderWrapper.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.write) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        boolean z = this.write;
        boolean z2 = this.IconCompatParcelizer;
        boolean z3 = this.RemoteActionCompatParcelizer;
        getApplicableScopes getapplicablescopes = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqVideoTapContext(isCurrentPage=");
        sb.append(z);
        sb.append(", isInViewport=");
        sb.append(z2);
        sb.append(", isForeground=");
        sb.append(z3);
        sb.append(", displayMode=");
        sb.append(getapplicablescopes);
        sb.append(")");
        return sb.toString();
    }
}
