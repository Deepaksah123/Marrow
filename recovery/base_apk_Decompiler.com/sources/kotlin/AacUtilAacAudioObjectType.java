package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AacUtilAacAudioObjectType {
    public static final AacUtilAacAudioObjectType AudioAttributesCompatParcelizer = new AacUtilAacAudioObjectType(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
    public final List IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;

    public AacUtilAacAudioObjectType(List list, List list2) {
        this.IconCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AacUtilAacAudioObjectType)) {
            return false;
        }
        AacUtilAacAudioObjectType aacUtilAacAudioObjectType = (AacUtilAacAudioObjectType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, aacUtilAacAudioObjectType.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, aacUtilAacAudioObjectType.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CpuInfo(commonInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", perProcessorInfo=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
