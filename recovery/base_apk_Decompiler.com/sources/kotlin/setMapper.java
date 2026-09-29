package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class setMapper {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final String write;

    public setMapper(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, String str7, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesImplBaseParcelizer = str3;
        this.AudioAttributesImplApi26Parcelizer = str4;
        this.AudioAttributesImplApi21Parcelizer = str5;
        this.MediaBrowserCompatItemReceiver = i;
        this.RemoteActionCompatParcelizer = str6;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.write = str7;
        this.read = z;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int read() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMapper)) {
            return false;
        }
        setMapper setmapper = (setMapper) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setmapper.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setmapper.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) setmapper.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) setmapper.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) setmapper.AudioAttributesImplApi21Parcelizer) && this.MediaBrowserCompatItemReceiver == setmapper.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setmapper.RemoteActionCompatParcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == setmapper.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) setmapper.write) && this.read == setmapper.read;
    }

    public final int hashCode() {
        return (((((((((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.write.hashCode()) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.AudioAttributesImplBaseParcelizer;
        String str4 = this.AudioAttributesImplApi26Parcelizer;
        String str5 = this.AudioAttributesImplApi21Parcelizer;
        int i = this.MediaBrowserCompatItemReceiver;
        String str6 = this.RemoteActionCompatParcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str7 = this.write;
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("McqExplanationModel(lessonId=");
        sb.append(str);
        sb.append(", featureCardId=");
        sb.append(str2);
        sb.append(", mcqId=");
        sb.append(str3);
        sb.append(", subjectTitle=");
        sb.append(str4);
        sb.append(", lessonTitle=");
        sb.append(str5);
        sb.append(", lessonNumber=");
        sb.append(i);
        sb.append(", lessonImage=");
        sb.append(str6);
        sb.append(", selectedAnswer=");
        sb.append(i2);
        sb.append(", contentId=");
        sb.append(str7);
        sb.append(", isAnswerCorrectly=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
