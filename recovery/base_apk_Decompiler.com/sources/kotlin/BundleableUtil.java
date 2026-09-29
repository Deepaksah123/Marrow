package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BundleableUtil {
    private final boolean IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final List<bundleToStringImmutableMap> write;

    public BundleableUtil(List<bundleToStringImmutableMap> list, boolean z, long j) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = list;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = j;
    }

    public final List<bundleToStringImmutableMap> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final long read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleableUtil)) {
            return false;
        }
        BundleableUtil bundleableUtil = (BundleableUtil) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, bundleableUtil.write) && this.IconCompatParcelizer == bundleableUtil.IconCompatParcelizer && this.RemoteActionCompatParcelizer == bundleableUtil.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        List<bundleToStringImmutableMap> list = this.write;
        boolean z = this.IconCompatParcelizer;
        long j = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaCompletionStatusRepoModel(listOfSchemaQBankItems=");
        sb.append(list);
        sb.append(", schemaCompletionStatus=");
        sb.append(z);
        sb.append(", lastLessonSubmittedOn=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
