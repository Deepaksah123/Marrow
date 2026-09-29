package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class GoogleApiActivity extends getApiFallbackAttributionTag {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final GoogleApiSettingsBuilder AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final getTrackTypeOfCodec IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final List<String> write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleApiActivity(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, GoogleApiSettingsBuilder googleApiSettingsBuilder, List<String> list, int i) {
        super(str, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, googleApiSettingsBuilder, list, i, 5);
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
        toMagicModuleMetaRepoModel.write(googleApiSettingsBuilder, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.IconCompatParcelizer = gettracktypeofcodec;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaBrowserCompatItemReceiver = str3;
        this.MediaMetadataCompat = str4;
        this.read = str5;
        this.RatingCompat = str6;
        this.AudioAttributesImplApi21Parcelizer = str7;
        this.MediaBrowserCompatSearchResultReceiver = str8;
        this.AudioAttributesCompatParcelizer = str9;
        this.AudioAttributesImplApi26Parcelizer = googleApiSettingsBuilder;
        this.write = list;
        this.AudioAttributesImplBaseParcelizer = i;
    }

    public final getTrackTypeOfCodec MediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String RatingCompat() {
        return this.MediaMetadataCompat;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.read;
    }

    public final String MediaMetadataCompat() {
        return this.RatingCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleApiActivity)) {
            return false;
        }
        GoogleApiActivity googleApiActivity = (GoogleApiActivity) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) googleApiActivity.MediaBrowserCompatCustomActionResultReceiver) && this.IconCompatParcelizer == googleApiActivity.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) googleApiActivity.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) googleApiActivity.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) googleApiActivity.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) googleApiActivity.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) googleApiActivity.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) googleApiActivity.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) googleApiActivity.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) googleApiActivity.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, googleApiActivity.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, googleApiActivity.write) && this.AudioAttributesImplBaseParcelizer == googleApiActivity.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.MediaBrowserCompatCustomActionResultReceiver.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.read.hashCode()) * 31) + this.RatingCompat.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        getTrackTypeOfCodec gettracktypeofcodec = this.IconCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.MediaBrowserCompatItemReceiver;
        String str4 = this.MediaMetadataCompat;
        String str5 = this.read;
        String str6 = this.RatingCompat;
        String str7 = this.AudioAttributesImplApi21Parcelizer;
        String str8 = this.MediaBrowserCompatSearchResultReceiver;
        String str9 = this.AudioAttributesCompatParcelizer;
        GoogleApiSettingsBuilder googleApiSettingsBuilder = this.AudioAttributesImplApi26Parcelizer;
        List<String> list = this.write;
        int i = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("LiveVideoFeatureCardVMModel(videoId=");
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
        sb.append(googleApiSettingsBuilder);
        sb.append(", videoContentStepIds=");
        sb.append(list);
        sb.append(", videoSortOrder=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
