package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class readSignedExpGolombCodedInt {
    private final long AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final long IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final float MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final int RatingCompat;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    public readSignedExpGolombCodedInt(String str, String str2, String str3, int i, int i2, long j, String str4, String str5, float f, boolean z, boolean z2, long j2, boolean z3, int i3, int i4, int i5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.AudioAttributesImplApi26Parcelizer = str;
        this.MediaMetadataCompat = str2;
        this.MediaBrowserCompatCustomActionResultReceiver = str3;
        this.MediaBrowserCompatItemReceiver = i;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.AudioAttributesCompatParcelizer = j;
        this.MediaBrowserCompatSearchResultReceiver = str4;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str5;
        this.MediaDescriptionCompat = f;
        this.RemoteActionCompatParcelizer = z;
        this.write = z2;
        this.IconCompatParcelizer = j2;
        this.read = z3;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.MediaBrowserCompatMediaItem = i4;
        this.RatingCompat = i5;
    }

    public final String write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final long IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaDescriptionCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String MediaMetadataCompat() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final boolean RatingCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean onCommand() {
        return this.write;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean read() {
        return this.read;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.RatingCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof readSignedExpGolombCodedInt)) {
            return false;
        }
        readSignedExpGolombCodedInt readsignedexpgolombcodedint = (readSignedExpGolombCodedInt) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) readsignedexpgolombcodedint.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) readsignedexpgolombcodedint.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) readsignedexpgolombcodedint.MediaBrowserCompatCustomActionResultReceiver) && this.MediaBrowserCompatItemReceiver == readsignedexpgolombcodedint.MediaBrowserCompatItemReceiver && this.AudioAttributesImplBaseParcelizer == readsignedexpgolombcodedint.AudioAttributesImplBaseParcelizer && this.AudioAttributesCompatParcelizer == readsignedexpgolombcodedint.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) readsignedexpgolombcodedint.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) readsignedexpgolombcodedint.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && Float.compare(this.MediaDescriptionCompat, readsignedexpgolombcodedint.MediaDescriptionCompat) == 0 && this.RemoteActionCompatParcelizer == readsignedexpgolombcodedint.RemoteActionCompatParcelizer && this.write == readsignedexpgolombcodedint.write && this.IconCompatParcelizer == readsignedexpgolombcodedint.IconCompatParcelizer && this.read == readsignedexpgolombcodedint.read && this.AudioAttributesImplApi21Parcelizer == readsignedexpgolombcodedint.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatMediaItem == readsignedexpgolombcodedint.MediaBrowserCompatMediaItem && this.RatingCompat == readsignedexpgolombcodedint.RatingCompat;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((this.AudioAttributesImplApi26Parcelizer.hashCode() * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Long.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode()) * 31) + Float.hashCode(this.MediaDescriptionCompat)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.write)) * 31) + Long.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.read)) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Integer.hashCode(this.RatingCompat);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.MediaMetadataCompat;
        String str3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i = this.MediaBrowserCompatItemReceiver;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        String str4 = this.MediaBrowserCompatSearchResultReceiver;
        String str5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        float f = this.MediaDescriptionCompat;
        boolean z = this.RemoteActionCompatParcelizer;
        boolean z2 = this.write;
        long j2 = this.IconCompatParcelizer;
        boolean z3 = this.read;
        int i3 = this.AudioAttributesImplApi21Parcelizer;
        int i4 = this.MediaBrowserCompatMediaItem;
        int i5 = this.RatingCompat;
        StringBuilder sb = new StringBuilder("QBankUCModel(lessonId=");
        sb.append(str);
        sb.append(", stepId=");
        sb.append(str2);
        sb.append(", lessonName=");
        sb.append(str3);
        sb.append(", mcqCount=");
        sb.append(i);
        sb.append(", lessonCompletionStatus=");
        sb.append(i2);
        sb.append(", completionTimeMs=");
        sb.append(j);
        sb.append(", rootSubjectId=");
        sb.append(str4);
        sb.append(", subjectId=");
        sb.append(str5);
        sb.append(", percentile=");
        sb.append(f);
        sb.append(", isAvailable=");
        sb.append(z);
        sb.append(", isFreeLesson=");
        sb.append(z2);
        sb.append(", lastAttemptedTimeMs=");
        sb.append(j2);
        sb.append(", hasVideo=");
        sb.append(z3);
        sb.append(", myRating=");
        sb.append(i3);
        sb.append(", score=");
        sb.append(i4);
        sb.append(", possibleScore=");
        sb.append(i5);
        sb.append(")");
        return sb.toString();
    }
}
