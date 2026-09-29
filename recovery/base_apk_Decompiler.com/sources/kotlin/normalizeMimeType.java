package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class normalizeMimeType {
    private final String AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final float MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final int onAddQueueItem;
    private final String onCommand;
    private final boolean read;
    private final int write;

    public normalizeMimeType(String str, String str2, String str3, String str4, float f, int i, int i2, boolean z, int i3, int i4, int i5, boolean z2, int i6, String str5, String str6, boolean z3, String str7, int i7) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        this.AudioAttributesCompatParcelizer = str;
        this.MediaDescriptionCompat = str2;
        this.onCommand = str3;
        this.MediaMetadataCompat = str4;
        this.MediaBrowserCompatItemReceiver = f;
        this.write = i;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.MediaBrowserCompatSearchResultReceiver = i3;
        this.AudioAttributesImplBaseParcelizer = i4;
        this.onAddQueueItem = i5;
        this.AudioAttributesImplApi21Parcelizer = z2;
        this.AudioAttributesImplApi26Parcelizer = i6;
        this.RatingCompat = str5;
        this.RemoteActionCompatParcelizer = str6;
        this.read = z3;
        this.IconCompatParcelizer = str7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i7;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.onCommand;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final int RatingCompat() {
        return this.onAddQueueItem;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.RatingCompat;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean MediaDescriptionCompat() {
        return this.read;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int MediaMetadataCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof normalizeMimeType)) {
            return false;
        }
        normalizeMimeType normalizemimetype = (normalizeMimeType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) normalizemimetype.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) normalizemimetype.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) normalizemimetype.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) normalizemimetype.MediaMetadataCompat) && Float.compare(this.MediaBrowserCompatItemReceiver, normalizemimetype.MediaBrowserCompatItemReceiver) == 0 && this.write == normalizemimetype.write && this.MediaBrowserCompatMediaItem == normalizemimetype.MediaBrowserCompatMediaItem && this.MediaBrowserCompatCustomActionResultReceiver == normalizemimetype.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatSearchResultReceiver == normalizemimetype.MediaBrowserCompatSearchResultReceiver && this.AudioAttributesImplBaseParcelizer == normalizemimetype.AudioAttributesImplBaseParcelizer && this.onAddQueueItem == normalizemimetype.onAddQueueItem && this.AudioAttributesImplApi21Parcelizer == normalizemimetype.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == normalizemimetype.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) normalizemimetype.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) normalizemimetype.RemoteActionCompatParcelizer) && this.read == normalizemimetype.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) normalizemimetype.IconCompatParcelizer) && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == normalizemimetype.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        String str = this.MediaDescriptionCompat;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.onCommand;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + Float.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.onAddQueueItem)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + this.RatingCompat.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.MediaDescriptionCompat;
        String str3 = this.onCommand;
        String str4 = this.MediaMetadataCompat;
        float f = this.MediaBrowserCompatItemReceiver;
        int i = this.write;
        int i2 = this.MediaBrowserCompatMediaItem;
        boolean z = this.MediaBrowserCompatCustomActionResultReceiver;
        int i3 = this.MediaBrowserCompatSearchResultReceiver;
        int i4 = this.AudioAttributesImplBaseParcelizer;
        int i5 = this.onAddQueueItem;
        boolean z2 = this.AudioAttributesImplApi21Parcelizer;
        int i6 = this.AudioAttributesImplApi26Parcelizer;
        String str5 = this.RatingCompat;
        String str6 = this.RemoteActionCompatParcelizer;
        boolean z3 = this.read;
        String str7 = this.IconCompatParcelizer;
        int i7 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        StringBuilder sb = new StringBuilder("HomeSuggestionUCModel(id=");
        sb.append(str);
        sb.append(", thumbnail=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", rootSubjectTitle=");
        sb.append(str4);
        sb.append(", rating=");
        sb.append(f);
        sb.append(", count=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", isPaid=");
        sb.append(z);
        sb.append(", reason=");
        sb.append(i3);
        sb.append(", newMcqCount=");
        sb.append(i4);
        sb.append(", updatedMcqCount=");
        sb.append(i5);
        sb.append(", isUnlocked=");
        sb.append(z2);
        sb.append(", mcqCount=");
        sb.append(i6);
        sb.append(", rootSubjectId=");
        sb.append(str5);
        sb.append(", childSubjectId=");
        sb.append(str6);
        sb.append(", isDownloaded=");
        sb.append(z3);
        sb.append(", durationText=");
        sb.append(str7);
        sb.append(", videoProgress=");
        sb.append(i7);
        sb.append(")");
        return sb.toString();
    }
}
