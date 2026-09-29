package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class findNextUnescapeIndex extends getTopLevelType {
    private final boolean AudioAttributesCompatParcelizer;
    private final List<String> AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final getTrackTypeOfCodec AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final isText MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final String onAddQueueItem;
    private final String onCommand;
    private final String onCustomAction;
    private final int read;
    private final float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public findNextUnescapeIndex(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, isText istext, List<String> list, int i, String str10, boolean z, boolean z2, float f, int i2) {
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
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.AudioAttributesImplBaseParcelizer = gettracktypeofcodec;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaDescriptionCompat = str3;
        this.RatingCompat = str4;
        this.MediaBrowserCompatItemReceiver = str5;
        this.onCustomAction = str6;
        this.MediaBrowserCompatSearchResultReceiver = str7;
        this.onCommand = str8;
        this.AudioAttributesImplApi26Parcelizer = str9;
        this.MediaBrowserCompatMediaItem = istext;
        this.AudioAttributesImplApi21Parcelizer = list;
        this.MediaMetadataCompat = i;
        this.onAddQueueItem = str10;
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.write = f;
        this.read = i2;
    }

    public final String onAddQueueItem() {
        return this.onAddQueueItem;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean onCommand() {
        return this.IconCompatParcelizer;
    }

    public final float MediaDescriptionCompat() {
        return this.write;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof findNextUnescapeIndex)) {
            return false;
        }
        findNextUnescapeIndex findnextunescapeindex = (findNextUnescapeIndex) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) findnextunescapeindex.MediaBrowserCompatCustomActionResultReceiver) && this.AudioAttributesImplBaseParcelizer == findnextunescapeindex.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) findnextunescapeindex.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) findnextunescapeindex.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) findnextunescapeindex.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) findnextunescapeindex.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCustomAction, (Object) findnextunescapeindex.onCustomAction) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) findnextunescapeindex.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) findnextunescapeindex.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) findnextunescapeindex.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, findnextunescapeindex.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, findnextunescapeindex.AudioAttributesImplApi21Parcelizer) && this.MediaMetadataCompat == findnextunescapeindex.MediaMetadataCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onAddQueueItem, (Object) findnextunescapeindex.onAddQueueItem) && this.AudioAttributesCompatParcelizer == findnextunescapeindex.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == findnextunescapeindex.IconCompatParcelizer && Float.compare(this.write, findnextunescapeindex.write) == 0 && this.read == findnextunescapeindex.read;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((this.MediaBrowserCompatCustomActionResultReceiver.hashCode() * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.RatingCompat.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.onCustomAction.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.onCommand.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaMetadataCompat)) * 31) + this.onAddQueueItem.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Float.hashCode(this.write)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        getTrackTypeOfCodec gettracktypeofcodec = this.AudioAttributesImplBaseParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.MediaDescriptionCompat;
        String str4 = this.RatingCompat;
        String str5 = this.MediaBrowserCompatItemReceiver;
        String str6 = this.onCustomAction;
        String str7 = this.MediaBrowserCompatSearchResultReceiver;
        String str8 = this.onCommand;
        String str9 = this.AudioAttributesImplApi26Parcelizer;
        isText istext = this.MediaBrowserCompatMediaItem;
        List<String> list = this.AudioAttributesImplApi21Parcelizer;
        int i = this.MediaMetadataCompat;
        String str10 = this.onAddQueueItem;
        boolean z = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.IconCompatParcelizer;
        float f = this.write;
        int i2 = this.read;
        StringBuilder sb = new StringBuilder("VideoFeatureCardUCModel(videoId=");
        sb.append(str);
        sb.append(", videoContentType=");
        sb.append(gettracktypeofcodec);
        sb.append(", videoContentId=");
        sb.append(str2);
        sb.append(", videoSubContentId=");
        sb.append(str3);
        sb.append(", videoSubContentType=");
        sb.append(str4);
        sb.append(", videoContentTitle=");
        sb.append(str5);
        sb.append(", videoSubTitle=");
        sb.append(str6);
        sb.append(", videoPublishedStatus=");
        sb.append(str7);
        sb.append(", videoThumbnail=");
        sb.append(str8);
        sb.append(", videoCourseId=");
        sb.append(str9);
        sb.append(", videoLabel=");
        sb.append(istext);
        sb.append(", videoContentStepIds=");
        sb.append(list);
        sb.append(", videoSortOrder=");
        sb.append(i);
        sb.append(", videoSubjectTitle=");
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
