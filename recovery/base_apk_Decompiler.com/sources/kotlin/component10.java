package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class component10 extends AbstractC0202setMcqId {
    private final String IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component10(String str) {
        super(null);
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = str;
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof component10) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ((component10) obj).IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SampleVideoSection(title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
