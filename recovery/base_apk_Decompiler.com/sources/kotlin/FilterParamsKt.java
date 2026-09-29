package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class FilterParamsKt {
    private final getCreatedOnDateMs<Boolean> RemoteActionCompatParcelizer;

    public FilterParamsKt(getCreatedOnDateMs<Boolean> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.RemoteActionCompatParcelizer = getcreatedondatems;
    }

    public final getCreatedOnDateMs<Boolean> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterParamsKt) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((FilterParamsKt) obj).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        getCreatedOnDateMs<Boolean> getcreatedondatems = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("NativeAesDecryptionConfig(isRemoteConfigEnabled=");
        sb.append(getcreatedondatems);
        sb.append(")");
        return sb.toString();
    }
}
