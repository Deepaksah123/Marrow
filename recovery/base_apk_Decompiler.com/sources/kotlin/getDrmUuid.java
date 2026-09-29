package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getDrmUuid {
    private final StatsEvent AudioAttributesCompatParcelizer;
    private final setTextAppearanceResource RemoteActionCompatParcelizer;
    private final zzhr read;

    public getDrmUuid(setTextAppearanceResource settextappearanceresource, zzhr zzhrVar, StatsEvent statsEvent) {
        toMagicModuleMetaRepoModel.write(settextappearanceresource, "");
        toMagicModuleMetaRepoModel.write(zzhrVar, "");
        toMagicModuleMetaRepoModel.write(statsEvent, "");
        this.RemoteActionCompatParcelizer = settextappearanceresource;
        this.read = zzhrVar;
        this.AudioAttributesCompatParcelizer = statsEvent;
    }

    public final setTextAppearanceResource RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final zzhr read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDrmUuid)) {
            return false;
        }
        getDrmUuid getdrmuuid = (getDrmUuid) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, getdrmuuid.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getdrmuuid.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getdrmuuid.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        setTextAppearanceResource settextappearanceresource = this.RemoteActionCompatParcelizer;
        zzhr zzhrVar = this.read;
        StatsEvent statsEvent = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("PreviewUserDetails(testMcqUIModel=");
        sb.append(settextappearanceresource);
        sb.append(", mcqReviewUIModel=");
        sb.append(zzhrVar);
        sb.append(", pearlDetails=");
        sb.append(statsEvent);
        sb.append(")");
        return sb.toString();
    }
}
