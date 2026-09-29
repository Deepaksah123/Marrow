package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemHandlerWrapper {
    private final long AudioAttributesCompatParcelizer;
    private final boolean read;
    private final List<bundleToStringImmutableMap> write;

    public SystemHandlerWrapper(List<bundleToStringImmutableMap> list, boolean z, long j) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = list;
        this.read = z;
        this.AudioAttributesCompatParcelizer = j;
    }

    public final List<bundleToStringImmutableMap> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemHandlerWrapper)) {
            return false;
        }
        SystemHandlerWrapper systemHandlerWrapper = (SystemHandlerWrapper) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, systemHandlerWrapper.write) && this.read == systemHandlerWrapper.read && this.AudioAttributesCompatParcelizer == systemHandlerWrapper.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.write.hashCode() * 31) + Boolean.hashCode(this.read)) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        List<bundleToStringImmutableMap> list = this.write;
        boolean z = this.read;
        long j = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SchemaCompletionStatusUCModel(listOfSchemaQBankItems=");
        sb.append(list);
        sb.append(", schemaCompletionStatus=");
        sb.append(z);
        sb.append(", lastLessonSubmittedOn=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
