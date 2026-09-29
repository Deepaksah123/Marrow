package kotlin;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class downloadMagicModuleModule implements MagicModuleMetaRepoModel, Serializable {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final Class AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    public final Object write;

    public downloadMagicModuleModule(int i, Class cls, String str, String str2, int i2) {
        this(i, r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA.MediaBrowserCompatItemReceiver, cls, str, str2, i2);
    }

    public downloadMagicModuleModule(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.write = obj;
        this.AudioAttributesImplApi26Parcelizer = cls;
        this.AudioAttributesCompatParcelizer = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.IconCompatParcelizer = (i2 & 1) == 1;
        this.RemoteActionCompatParcelizer = i;
        this.read = i2 >> 1;
    }

    @Override // kotlin.MagicModuleMetaRepoModel
    public int getArity() {
        return this.RemoteActionCompatParcelizer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof downloadMagicModuleModule)) {
            return false;
        }
        downloadMagicModuleModule downloadmagicmodulemodule = (downloadMagicModuleModule) obj;
        return this.IconCompatParcelizer == downloadmagicmodulemodule.IconCompatParcelizer && this.RemoteActionCompatParcelizer == downloadmagicmodulemodule.RemoteActionCompatParcelizer && this.read == downloadmagicmodulemodule.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, downloadmagicmodulemodule.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, downloadmagicmodulemodule.AudioAttributesImplApi26Parcelizer) && this.AudioAttributesCompatParcelizer.equals(downloadmagicmodulemodule.AudioAttributesCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer.equals(downloadmagicmodulemodule.AudioAttributesImplApi21Parcelizer);
    }

    public int hashCode() {
        Object obj = this.write;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Class cls = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode2 = cls != null ? cls.hashCode() : 0;
        int iHashCode3 = this.AudioAttributesCompatParcelizer.hashCode();
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + (this.IconCompatParcelizer ? 1231 : 1237)) * 31) + this.RemoteActionCompatParcelizer) * 31) + this.read;
    }

    public String toString() {
        return toMagicModuleMetaDataUcModel.RemoteActionCompatParcelizer(this);
    }
}
