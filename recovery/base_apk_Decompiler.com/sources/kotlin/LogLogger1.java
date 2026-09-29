package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LogLogger1 {
    private final String AudioAttributesCompatParcelizer;
    private final List<MediaClock> AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final List<createFormatFromMediaFormat> RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public LogLogger1(String str, boolean z, String str2, String str3, List<createFormatFromMediaFormat> list, String str4, String str5, String str6, List<MediaClock> list2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.MediaBrowserCompatItemReceiver = z;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = list;
        this.read = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.AudioAttributesImplBaseParcelizer = str6;
        this.AudioAttributesImplApi26Parcelizer = list2;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String read() {
        return this.write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final List<createFormatFromMediaFormat> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String write() {
        return this.read;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<MediaClock> AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogLogger1)) {
            return false;
        }
        LogLogger1 logLogger1 = (LogLogger1) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) logLogger1.MediaBrowserCompatCustomActionResultReceiver) && this.MediaBrowserCompatItemReceiver == logLogger1.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) logLogger1.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) logLogger1.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, logLogger1.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) logLogger1.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) logLogger1.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) logLogger1.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, logLogger1.AudioAttributesImplApi26Parcelizer);
    }

    public final int hashCode() {
        return (((((((((((((((this.MediaBrowserCompatCustomActionResultReceiver.hashCode() * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.write.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode();
    }

    public final String toString() {
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z = this.MediaBrowserCompatItemReceiver;
        String str2 = this.write;
        String str3 = this.IconCompatParcelizer;
        List<createFormatFromMediaFormat> list = this.RemoteActionCompatParcelizer;
        String str4 = this.read;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.AudioAttributesImplBaseParcelizer;
        List<MediaClock> list2 = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("LearnMoreUCModel(title=");
        sb.append(str);
        sb.append(", showEditors=");
        sb.append(z);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", oneLiner=");
        sb.append(str3);
        sb.append(", features=");
        sb.append(list);
        sb.append(", primaryButtonText=");
        sb.append(str4);
        sb.append(", secondaryButtonText=");
        sb.append(str5);
        sb.append(", specialQuesHeader=");
        sb.append(str6);
        sb.append(", specials=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
