package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class FileTypesType {
    private final int AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final long AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final long MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final int RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final String onAddQueueItem;
    private final String onCommand;
    private final long onCustomAction;
    private final boolean read;
    private final long write;

    public FileTypesType(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, int i4, long j, long j2, long j3, int i5, int i6, long j4, long j5, int i7, boolean z2, int i8) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.RemoteActionCompatParcelizer = str;
        this.onAddQueueItem = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.onCommand = str4;
        this.AudioAttributesCompatParcelizer = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.AudioAttributesImplApi21Parcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.MediaMetadataCompat = i4;
        this.MediaDescriptionCompat = j;
        this.write = j2;
        this.AudioAttributesImplBaseParcelizer = j3;
        this.MediaBrowserCompatSearchResultReceiver = i5;
        this.IconCompatParcelizer = i6;
        this.onCustomAction = j4;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = j5;
        this.RatingCompat = i7;
        this.read = z2;
        this.AudioAttributesImplApi26Parcelizer = i8;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RatingCompat() {
        return this.onAddQueueItem;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.onCommand;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int MediaMetadataCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    public final long onCustomAction() {
        return this.onCustomAction;
    }

    public final long handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int MediaDescriptionCompat() {
        return this.RatingCompat;
    }

    public final boolean onAddQueueItem() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileTypesType)) {
            return false;
        }
        FileTypesType fileTypesType = (FileTypesType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) fileTypesType.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onAddQueueItem, (Object) fileTypesType.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) fileTypesType.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) fileTypesType.onCommand) && this.AudioAttributesCompatParcelizer == fileTypesType.AudioAttributesCompatParcelizer && this.MediaBrowserCompatItemReceiver == fileTypesType.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi21Parcelizer == fileTypesType.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == fileTypesType.MediaBrowserCompatCustomActionResultReceiver && this.MediaMetadataCompat == fileTypesType.MediaMetadataCompat && this.MediaDescriptionCompat == fileTypesType.MediaDescriptionCompat && this.write == fileTypesType.write && this.AudioAttributesImplBaseParcelizer == fileTypesType.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatSearchResultReceiver == fileTypesType.MediaBrowserCompatSearchResultReceiver && this.IconCompatParcelizer == fileTypesType.IconCompatParcelizer && this.onCustomAction == fileTypesType.onCustomAction && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == fileTypesType.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.RatingCompat == fileTypesType.RatingCompat && this.read == fileTypesType.read && this.AudioAttributesImplApi26Parcelizer == fileTypesType.AudioAttributesImplApi26Parcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.onAddQueueItem.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.onCommand.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.MediaMetadataCompat)) * 31) + Long.hashCode(this.MediaDescriptionCompat)) * 31) + Long.hashCode(this.write)) * 31) + Long.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Long.hashCode(this.onCustomAction)) * 31) + Long.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) * 31) + Integer.hashCode(this.RatingCompat)) * 31) + Boolean.hashCode(this.read)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.onAddQueueItem;
        String str3 = this.MediaBrowserCompatMediaItem;
        String str4 = this.onCommand;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.MediaBrowserCompatItemReceiver;
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i4 = this.MediaMetadataCompat;
        long j = this.MediaDescriptionCompat;
        long j2 = this.write;
        long j3 = this.AudioAttributesImplBaseParcelizer;
        int i5 = this.MediaBrowserCompatSearchResultReceiver;
        int i6 = this.IconCompatParcelizer;
        long j4 = this.onCustomAction;
        long j5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i7 = this.RatingCompat;
        boolean z2 = this.read;
        int i8 = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("TestMiniLSModel(id=");
        sb.append(str);
        sb.append(", testType=");
        sb.append(str2);
        sb.append(", subjectId=");
        sb.append(str3);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", duration=");
        sb.append(i);
        sb.append(", mcqCount=");
        sb.append(i2);
        sb.append(", isPaid=");
        sb.append(z);
        sb.append(", rank=");
        sb.append(i3);
        sb.append(", status=");
        sb.append(i4);
        sb.append(", startTimestamp=");
        sb.append(j);
        sb.append(", endTimestamp=");
        sb.append(j2);
        sb.append(", modifiedEndTimestampMs=");
        sb.append(j3);
        sb.append(", testPattern=");
        sb.append(i5);
        sb.append(", availabilityType=");
        sb.append(i6);
        sb.append(", userStartedTimestampMs=");
        sb.append(j4);
        sb.append(", userSubmittedTimestampMs=");
        sb.append(j5);
        sb.append(", testStatus=");
        sb.append(i7);
        sb.append(", isMockTest=");
        sb.append(z2);
        sb.append(", maxMcqCount=");
        sb.append(i8);
        sb.append(")");
        return sb.toString();
    }
}
