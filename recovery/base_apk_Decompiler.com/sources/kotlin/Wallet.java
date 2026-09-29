package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Wallet {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final int read;
    private final List<String> write;

    public Wallet(String str, String str2, String str3, int i, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.read = i;
        this.write = list;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int write() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wallet)) {
            return false;
        }
        Wallet wallet = (Wallet) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) wallet.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) wallet.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) wallet.AudioAttributesCompatParcelizer) && this.read == wallet.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, wallet.write);
    }

    public final int hashCode() {
        return (((((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.AudioAttributesCompatParcelizer;
        int i = this.read;
        List<String> list = this.write;
        StringBuilder sb = new StringBuilder("ActiveDeviceStatusVMModel(testId=");
        sb.append(str);
        sb.append(", activeDeviceId=");
        sb.append(str2);
        sb.append(", platform=");
        sb.append(str3);
        sb.append(", testStatus=");
        sb.append(i);
        sb.append(", instructions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
