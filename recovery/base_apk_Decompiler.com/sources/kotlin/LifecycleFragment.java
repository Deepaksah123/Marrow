package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class LifecycleFragment {
    private final String AudioAttributesCompatParcelizer;
    private final String write;

    public LifecycleFragment(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
    }

    public final String read() {
        return this.write;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifecycleFragment)) {
            return false;
        }
        LifecycleFragment lifecycleFragment = (LifecycleFragment) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) lifecycleFragment.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) lifecycleFragment.write);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.write;
        StringBuilder sb = new StringBuilder("LearnMoreSpecialsModel(title=");
        sb.append(str);
        sb.append(", desc=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
