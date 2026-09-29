package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class readLong {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public readLong(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        this.MediaBrowserCompatItemReceiver = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.write = str3;
        this.read = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.IconCompatParcelizer = str6;
        this.RemoteActionCompatParcelizer = str7;
        this.AudioAttributesImplBaseParcelizer = str8;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String read() {
        return this.write;
    }

    public final String write() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readLong)) {
            return false;
        }
        readLong readlong = (readLong) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) readlong.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) readlong.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) readlong.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) readlong.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) readlong.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) readlong.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) readlong.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) readlong.AudioAttributesImplBaseParcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == readlong.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((((((((((((this.MediaBrowserCompatItemReceiver.hashCode() * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatItemReceiver;
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        String str3 = this.write;
        String str4 = this.read;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.IconCompatParcelizer;
        String str7 = this.RemoteActionCompatParcelizer;
        String str8 = this.AudioAttributesImplBaseParcelizer;
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("DeliveryAddressUCModel(name=");
        sb.append(str);
        sb.append(", phone=");
        sb.append(str2);
        sb.append(", alternatePhone=");
        sb.append(str3);
        sb.append(", addressLine1=");
        sb.append(str4);
        sb.append(", addressLine2=");
        sb.append(str5);
        sb.append(", addressLine3=");
        sb.append(str6);
        sb.append(", city=");
        sb.append(str7);
        sb.append(", state=");
        sb.append(str8);
        sb.append(", pinCode=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
