package kotlin;

import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class destroyEglSurface {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final PhoneNumberDetails MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final int RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final long onAddQueueItem;
    private final String onCommand;
    private final String onCustomAction;
    private final int onFastForward;
    private final String read;
    private final long write;

    public destroyEglSurface(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, String str6, String str7, String str8, String str9, PhoneNumberDetails phoneNumberDetails, String str10, String str11, String str12, String str13, int i3, int i4, long j2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(phoneNumberDetails, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        toMagicModuleMetaRepoModel.write(str11, "");
        toMagicModuleMetaRepoModel.write(str12, "");
        toMagicModuleMetaRepoModel.write(str13, "");
        this.handleMediaPlayPauseIfPendingOnHandler = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.AudioAttributesImplApi26Parcelizer = str3;
        this.MediaMetadataCompat = str4;
        this.MediaBrowserCompatMediaItem = str5;
        this.AudioAttributesImplBaseParcelizer = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.write = j;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str6;
        this.IconCompatParcelizer = str7;
        this.RemoteActionCompatParcelizer = str8;
        this.onCommand = str9;
        this.MediaDescriptionCompat = phoneNumberDetails;
        this.MediaBrowserCompatSearchResultReceiver = str10;
        this.AudioAttributesCompatParcelizer = str11;
        this.read = str12;
        this.onCustomAction = str13;
        this.onFastForward = i3;
        this.RatingCompat = i4;
        this.onAddQueueItem = j2;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public final String MediaDescriptionCompat() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final String onCommand() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String onCustomAction() {
        return this.onCommand;
    }

    public final PhoneNumberDetails RatingCompat() {
        return this.MediaDescriptionCompat;
    }

    public final String MediaMetadataCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.read;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onCustomAction;
    }

    public final int handleMediaPlayPauseIfPendingOnHandler() {
        return this.onFastForward;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.RatingCompat;
    }

    public final long onAddQueueItem() {
        return this.onAddQueueItem;
    }

    public final boolean onPause() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof destroyEglSurface)) {
            return false;
        }
        destroyEglSurface destroyeglsurface = (destroyEglSurface) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) destroyeglsurface.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) destroyeglsurface.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) destroyeglsurface.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) destroyeglsurface.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) destroyeglsurface.MediaBrowserCompatMediaItem) && this.AudioAttributesImplBaseParcelizer == destroyeglsurface.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatItemReceiver == destroyeglsurface.MediaBrowserCompatItemReceiver && this.write == destroyeglsurface.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) destroyeglsurface.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) destroyeglsurface.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) destroyeglsurface.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) destroyeglsurface.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, destroyeglsurface.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) destroyeglsurface.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) destroyeglsurface.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) destroyeglsurface.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCustomAction, (Object) destroyeglsurface.onCustomAction) && this.onFastForward == destroyeglsurface.onFastForward && this.RatingCompat == destroyeglsurface.RatingCompat && this.onAddQueueItem == destroyeglsurface.onAddQueueItem && this.MediaBrowserCompatCustomActionResultReceiver == destroyeglsurface.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.handleMediaPlayPauseIfPendingOnHandler.hashCode() * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Long.hashCode(this.write)) * 31) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.onCommand.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.onCustomAction.hashCode()) * 31) + Integer.hashCode(this.onFastForward)) * 31) + Integer.hashCode(this.RatingCompat)) * 31) + Long.hashCode(this.onAddQueueItem)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final String toString() {
        String str = this.handleMediaPlayPauseIfPendingOnHandler;
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        String str3 = this.AudioAttributesImplApi26Parcelizer;
        String str4 = this.MediaMetadataCompat;
        String str5 = this.MediaBrowserCompatMediaItem;
        int i = this.AudioAttributesImplBaseParcelizer;
        int i2 = this.MediaBrowserCompatItemReceiver;
        long j = this.write;
        String str6 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        String str7 = this.IconCompatParcelizer;
        String str8 = this.RemoteActionCompatParcelizer;
        String str9 = this.onCommand;
        PhoneNumberDetails phoneNumberDetails = this.MediaDescriptionCompat;
        String str10 = this.MediaBrowserCompatSearchResultReceiver;
        String str11 = this.AudioAttributesCompatParcelizer;
        String str12 = this.read;
        String str13 = this.onCustomAction;
        int i3 = this.onFastForward;
        int i4 = this.RatingCompat;
        long j2 = this.onAddQueueItem;
        boolean z = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("UserLSModel(userId=");
        sb.append(str);
        sb.append(", firstName=");
        sb.append(str2);
        sb.append(", lastName=");
        sb.append(str3);
        sb.append(", profession=");
        sb.append(str4);
        sb.append(", profilePic=");
        sb.append(str5);
        sb.append(", kycStatus=");
        sb.append(i);
        sb.append(", kycFailureCount=");
        sb.append(i2);
        sb.append(", createdOn=");
        sb.append(j);
        sb.append(", userName=");
        sb.append(str6);
        sb.append(", collegeName=");
        sb.append(str7);
        sb.append(", currentYear=");
        sb.append(str8);
        sb.append(", userNameInitials=");
        sb.append(str9);
        sb.append(", phoneNumber=");
        sb.append(phoneNumberDetails);
        sb.append(", stateId=");
        sb.append(str10);
        sb.append(", country=");
        sb.append(str11);
        sb.append(", collegeId=");
        sb.append(str12);
        sb.append(", yearOfAdmission=");
        sb.append(str13);
        sb.append(", yearOfPassout=");
        sb.append(i3);
        sb.append(", mbbsVerificationYear=");
        sb.append(i4);
        sb.append(", verifiedOn=");
        sb.append(j2);
        sb.append(", isUserCollegeDataAvailable=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
