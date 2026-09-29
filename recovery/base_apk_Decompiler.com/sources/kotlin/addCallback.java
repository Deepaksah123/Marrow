package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class addCallback {
    private final String AudioAttributesCompatParcelizer;
    private final List<String> RemoteActionCompatParcelizer;
    private final String write;

    public addCallback(String str, String str2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = list;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final List<String> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addCallback)) {
            return false;
        }
        addCallback addcallback = (addCallback) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) addcallback.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) addcallback.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, addcallback.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.write;
        List<String> list = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("LearnMoreFeaturesModel(iconUrl=");
        sb.append(str);
        sb.append(", cardTitle=");
        sb.append(str2);
        sb.append(", points=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
