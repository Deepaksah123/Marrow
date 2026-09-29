package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerExternalSyntheticLambda1 {
    private final SimpleBasePlayerExternalSyntheticLambda13 AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final SimpleBasePlayerExternalSyntheticLambda12 read;

    public SimpleBasePlayerExternalSyntheticLambda1(String str, SimpleBasePlayerExternalSyntheticLambda12 simpleBasePlayerExternalSyntheticLambda12, SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda13) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda12, "");
        toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda13, "");
        this.RemoteActionCompatParcelizer = str;
        this.read = simpleBasePlayerExternalSyntheticLambda12;
        this.AudioAttributesCompatParcelizer = simpleBasePlayerExternalSyntheticLambda13;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final SimpleBasePlayerExternalSyntheticLambda12 RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final SimpleBasePlayerExternalSyntheticLambda13 IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleBasePlayerExternalSyntheticLambda1)) {
            return false;
        }
        SimpleBasePlayerExternalSyntheticLambda1 simpleBasePlayerExternalSyntheticLambda1 = (SimpleBasePlayerExternalSyntheticLambda1) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) simpleBasePlayerExternalSyntheticLambda1.RemoteActionCompatParcelizer) && this.read == simpleBasePlayerExternalSyntheticLambda1.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, simpleBasePlayerExternalSyntheticLambda1.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriggerCondition(propertyName=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", op=");
        sb.append(this.read);
        sb.append(", value=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
