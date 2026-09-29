package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class TextInformationFrame1 {
    private final SpliceInfoDecoder AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final Id3DecoderExternalSyntheticLambda0 read;
    private final String write;

    public TextInformationFrame1(String str, String str2, String str3, String str4, SpliceInfoDecoder spliceInfoDecoder, Id3DecoderExternalSyntheticLambda0 id3DecoderExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(spliceInfoDecoder, "");
        toMagicModuleMetaRepoModel.write(id3DecoderExternalSyntheticLambda0, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesImplBaseParcelizer = str3;
        this.IconCompatParcelizer = str4;
        this.AudioAttributesCompatParcelizer = spliceInfoDecoder;
        this.read = id3DecoderExternalSyntheticLambda0;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final SpliceInfoDecoder write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Id3DecoderExternalSyntheticLambda0 IconCompatParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextInformationFrame1)) {
            return false;
        }
        TextInformationFrame1 textInformationFrame1 = (TextInformationFrame1) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) textInformationFrame1.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) textInformationFrame1.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) textInformationFrame1.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) textInformationFrame1.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == textInformationFrame1.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, textInformationFrame1.read);
    }

    public final int hashCode() {
        return (((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationInfo(appId=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", deviceModel=");
        sb.append(this.write);
        sb.append(", sessionSdkVersion=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", osVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", logEnvironment=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", androidAppInfo=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
