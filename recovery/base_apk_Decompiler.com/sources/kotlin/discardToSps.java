package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class discardToSps extends getTopLevelType {
    private final List<String> AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final getTrackTypeOfCodec AudioAttributesImplApi26Parcelizer;
    private final isText AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final int RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final float handleMediaPlayPauseIfPendingOnHandler;
    private final String onAddQueueItem;
    private final String read;
    private final boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public discardToSps(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, isText istext, List<String> list, int i, String str10, boolean z, boolean z2, float f, int i2) {
        super(str, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, istext, list, i);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(gettracktypeofcodec, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(istext, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        this.MediaBrowserCompatItemReceiver = str;
        this.AudioAttributesImplApi26Parcelizer = gettracktypeofcodec;
        this.read = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompatSearchResultReceiver = str4;
        this.RemoteActionCompatParcelizer = str5;
        this.MediaMetadataCompat = str6;
        this.MediaBrowserCompatCustomActionResultReceiver = str7;
        this.onAddQueueItem = str8;
        this.AudioAttributesImplApi21Parcelizer = str9;
        this.AudioAttributesImplBaseParcelizer = istext;
        this.AudioAttributesCompatParcelizer = list;
        this.RatingCompat = i;
        this.MediaBrowserCompatMediaItem = str10;
        this.write = z;
        this.IconCompatParcelizer = z2;
        this.handleMediaPlayPauseIfPendingOnHandler = f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2;
    }

    public final String MediaDescriptionCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final boolean onAddQueueItem() {
        return this.write;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final float MediaBrowserCompatMediaItem() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final int onCommand() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof discardToSps)) {
            return false;
        }
        discardToSps discardtosps = (discardToSps) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) discardtosps.MediaBrowserCompatItemReceiver) && this.AudioAttributesImplApi26Parcelizer == discardtosps.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) discardtosps.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) discardtosps.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) discardtosps.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) discardtosps.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) discardtosps.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) discardtosps.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onAddQueueItem, (Object) discardtosps.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) discardtosps.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, discardtosps.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, discardtosps.AudioAttributesCompatParcelizer) && this.RatingCompat == discardtosps.RatingCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) discardtosps.MediaBrowserCompatMediaItem) && this.write == discardtosps.write && this.IconCompatParcelizer == discardtosps.IconCompatParcelizer && Float.compare(this.handleMediaPlayPauseIfPendingOnHandler, discardtosps.handleMediaPlayPauseIfPendingOnHandler) == 0 && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == discardtosps.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((this.MediaBrowserCompatItemReceiver.hashCode() * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.onAddQueueItem.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.RatingCompat)) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Float.hashCode(this.handleMediaPlayPauseIfPendingOnHandler)) * 31) + Integer.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatItemReceiver;
        getTrackTypeOfCodec gettracktypeofcodec = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.read;
        String str3 = this.MediaDescriptionCompat;
        String str4 = this.MediaBrowserCompatSearchResultReceiver;
        String str5 = this.RemoteActionCompatParcelizer;
        String str6 = this.MediaMetadataCompat;
        String str7 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str8 = this.onAddQueueItem;
        String str9 = this.AudioAttributesImplApi21Parcelizer;
        isText istext = this.AudioAttributesImplBaseParcelizer;
        List<String> list = this.AudioAttributesCompatParcelizer;
        int i = this.RatingCompat;
        String str10 = this.MediaBrowserCompatMediaItem;
        boolean z = this.write;
        boolean z2 = this.IconCompatParcelizer;
        float f = this.handleMediaPlayPauseIfPendingOnHandler;
        int i2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        StringBuilder sb = new StringBuilder("QBankFeatureCardUCModel(qBankId=");
        sb.append(str);
        sb.append(", qBankContentType=");
        sb.append(gettracktypeofcodec);
        sb.append(", qBankContentId=");
        sb.append(str2);
        sb.append(", qBankSubContentId=");
        sb.append(str3);
        sb.append(", qBankSubContentType=");
        sb.append(str4);
        sb.append(", qBankContentTitle=");
        sb.append(str5);
        sb.append(", qBankSubTitle=");
        sb.append(str6);
        sb.append(", qBankPublishedStatus=");
        sb.append(str7);
        sb.append(", qBankThumbnail=");
        sb.append(str8);
        sb.append(", qBankCourseId=");
        sb.append(str9);
        sb.append(", qBankLabel=");
        sb.append(istext);
        sb.append(", qBankContentStepIds=");
        sb.append(list);
        sb.append(", qBankSortOrder=");
        sb.append(i);
        sb.append(", qBankSubjectTitle=");
        sb.append(str10);
        sb.append(", isLockVisible=");
        sb.append(z);
        sb.append(", isProVisible=");
        sb.append(z2);
        sb.append(", rating=");
        sb.append(f);
        sb.append(", status=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
