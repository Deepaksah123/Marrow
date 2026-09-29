package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setIndoorLevelPickerEnabled {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public setIndoorLevelPickerEnabled(String str, String str2, String str3, String str4, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.read = str4;
        this.AudioAttributesImplApi26Parcelizer = str5;
        this.IconCompatParcelizer = str6;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.read;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIndoorLevelPickerEnabled)) {
            return false;
        }
        setIndoorLevelPickerEnabled setindoorlevelpickerenabled = (setIndoorLevelPickerEnabled) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setindoorlevelpickerenabled.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setindoorlevelpickerenabled.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) setindoorlevelpickerenabled.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) setindoorlevelpickerenabled.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) setindoorlevelpickerenabled.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setindoorlevelpickerenabled.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.write;
        String str4 = this.read;
        String str5 = this.AudioAttributesImplApi26Parcelizer;
        String str6 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("ShareCopyVMModel(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", emailBody=");
        sb.append(str3);
        sb.append(", othersMessage=");
        sb.append(str4);
        sb.append(", whatsAppMessage=");
        sb.append(str5);
        sb.append(", emailSubject=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
