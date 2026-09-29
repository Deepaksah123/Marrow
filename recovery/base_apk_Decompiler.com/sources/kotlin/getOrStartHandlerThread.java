package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getOrStartHandlerThread {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public getOrStartHandlerThread(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        this.AudioAttributesImplApi21Parcelizer = str;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
        this.read = str3;
        this.write = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.RemoteActionCompatParcelizer = str6;
        this.IconCompatParcelizer = str7;
        this.AudioAttributesImplApi26Parcelizer = str8;
        this.AudioAttributesImplBaseParcelizer = str9;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String read() {
        return this.read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOrStartHandlerThread)) {
            return false;
        }
        getOrStartHandlerThread getorstarthandlerthread = (getOrStartHandlerThread) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) getorstarthandlerthread.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) getorstarthandlerthread.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getorstarthandlerthread.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getorstarthandlerthread.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getorstarthandlerthread.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getorstarthandlerthread.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getorstarthandlerthread.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) getorstarthandlerthread.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) getorstarthandlerthread.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        return (((((((((((((((this.AudioAttributesImplApi21Parcelizer.hashCode() * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi21Parcelizer;
        String str2 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str3 = this.read;
        String str4 = this.write;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.RemoteActionCompatParcelizer;
        String str7 = this.IconCompatParcelizer;
        String str8 = this.AudioAttributesImplApi26Parcelizer;
        String str9 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("AddressFormInputData(name=");
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
        sb.append(", pinCode=");
        sb.append(str8);
        sb.append(", state=");
        sb.append(str9);
        sb.append(")");
        return sb.toString();
    }
}
