package kotlin;

import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class isStep {
    private final setRatingCount AudioAttributesCompatParcelizer;
    private final setPublishedTime RemoteActionCompatParcelizer;
    private final setActiveRecallQbankId.RemoteActionCompatParcelizer read;
    private final getIntroDurationSeconds write;

    public isStep(setRatingCount setratingcount, setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setPublishedTime setpublishedtime, getIntroDurationSeconds getintrodurationseconds) {
        toMagicModuleMetaRepoModel.write(setratingcount, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(setpublishedtime, "");
        toMagicModuleMetaRepoModel.write(getintrodurationseconds, "");
        this.AudioAttributesCompatParcelizer = setratingcount;
        this.read = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = setpublishedtime;
        this.write = getintrodurationseconds;
    }

    public final setRatingCount IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final setActiveRecallQbankId.RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final setPublishedTime write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final getIntroDurationSeconds RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isStep)) {
            return false;
        }
        isStep isstep = (isStep) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, isstep.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, isstep.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, isstep.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, isstep.write);
    }

    public final int hashCode() {
        return (((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassData(nameResolver=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", classProto=");
        sb.append(this.read);
        sb.append(", metadataVersion=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", sourceElement=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
