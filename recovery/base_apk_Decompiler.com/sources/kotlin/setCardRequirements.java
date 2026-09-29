package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setCardRequirements {
    private final String AudioAttributesCompatParcelizer;
    private final Pair<Integer, Integer> IconCompatParcelizer;
    private final String read;
    private final int write;

    public setCardRequirements(String str, String str2, int i, Pair<Integer, Integer> pair) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(pair, "");
        this.read = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.write = i;
        this.IconCompatParcelizer = pair;
    }

    public final String write() {
        return this.read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCardRequirements)) {
            return false;
        }
        setCardRequirements setcardrequirements = (setCardRequirements) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) setcardrequirements.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setcardrequirements.AudioAttributesCompatParcelizer) && this.write == setcardrequirements.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setcardrequirements.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((this.read.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        Pair<Integer, Integer> pair = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SubjectStatUIModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", percentValue=");
        sb.append(i);
        sb.append(", colorCodes=");
        sb.append(pair);
        sb.append(")");
        return sb.toString();
    }
}
