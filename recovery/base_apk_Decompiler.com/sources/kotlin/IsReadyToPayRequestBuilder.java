package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class IsReadyToPayRequestBuilder {
    private final String IconCompatParcelizer;
    private final WritableTypeIdInclusion read;

    public IsReadyToPayRequestBuilder(String str, WritableTypeIdInclusion writableTypeIdInclusion) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(writableTypeIdInclusion, "");
        this.IconCompatParcelizer = str;
        this.read = writableTypeIdInclusion;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final WritableTypeIdInclusion RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IsReadyToPayRequestBuilder)) {
            return false;
        }
        IsReadyToPayRequestBuilder isReadyToPayRequestBuilder = (IsReadyToPayRequestBuilder) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) isReadyToPayRequestBuilder.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, isReadyToPayRequestBuilder.read);
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        WritableTypeIdInclusion writableTypeIdInclusion = this.read;
        StringBuilder sb = new StringBuilder("GtaTooltip(text=");
        sb.append(str);
        sb.append(", anchor=");
        sb.append(writableTypeIdInclusion);
        sb.append(")");
        return sb.toString();
    }
}
