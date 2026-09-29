package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class isLinebreak {
    private final String AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final String write;

    public isLinebreak(int i, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        this.AudioAttributesImplApi21Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.AudioAttributesCompatParcelizer = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        this.write = str6;
        this.MediaBrowserCompatItemReceiver = str7;
        this.read = z;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String read() {
        return this.write;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isLinebreak)) {
            return false;
        }
        isLinebreak islinebreak = (isLinebreak) obj;
        return this.AudioAttributesImplApi21Parcelizer == islinebreak.AudioAttributesImplApi21Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) islinebreak.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) islinebreak.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) islinebreak.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) islinebreak.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) islinebreak.RemoteActionCompatParcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == islinebreak.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) islinebreak.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) islinebreak.MediaBrowserCompatItemReceiver) && this.read == islinebreak.read;
    }

    public final int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.AudioAttributesImplApi21Parcelizer) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.write.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        int i = this.AudioAttributesImplApi21Parcelizer;
        String str = this.AudioAttributesImplBaseParcelizer;
        String str2 = this.AudioAttributesImplApi26Parcelizer;
        String str3 = this.IconCompatParcelizer;
        String str4 = this.AudioAttributesCompatParcelizer;
        String str5 = this.RemoteActionCompatParcelizer;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str6 = this.write;
        String str7 = this.MediaBrowserCompatItemReceiver;
        boolean z = this.read;
        StringBuilder sb = new StringBuilder("VideoSuggestionUCModel(suggestionReason=");
        sb.append(i);
        sb.append(", suggestedLessonId=");
        sb.append(str);
        sb.append(", suggestedLessonTitle=");
        sb.append(str2);
        sb.append(", rootSubjectId=");
        sb.append(str3);
        sb.append(", subjectId=");
        sb.append(str4);
        sb.append(", durationText=");
        sb.append(str5);
        sb.append(", videoProgress=");
        sb.append(i2);
        sb.append(", remainingTimeMs=");
        sb.append(str6);
        sb.append(", thumbnailUrl=");
        sb.append(str7);
        sb.append(", isLessonUnlocked=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
