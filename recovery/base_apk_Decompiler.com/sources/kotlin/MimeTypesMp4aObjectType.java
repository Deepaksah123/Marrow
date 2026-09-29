package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MimeTypesMp4aObjectType extends getTopLevelType {
    private final getTrackTypeOfCodec AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final isText MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaMetadataCompat;
    private final List<String> RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MimeTypesMp4aObjectType(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, isText istext, List<String> list, int i) {
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
        this.MediaBrowserCompatItemReceiver = str;
        this.AudioAttributesCompatParcelizer = gettracktypeofcodec;
        this.read = str2;
        this.AudioAttributesImplApi26Parcelizer = str3;
        this.MediaBrowserCompatSearchResultReceiver = str4;
        this.write = str5;
        this.MediaBrowserCompatMediaItem = str6;
        this.AudioAttributesImplBaseParcelizer = str7;
        this.MediaMetadataCompat = str8;
        this.IconCompatParcelizer = str9;
        this.MediaBrowserCompatCustomActionResultReceiver = istext;
        this.RemoteActionCompatParcelizer = list;
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MimeTypesMp4aObjectType)) {
            return false;
        }
        MimeTypesMp4aObjectType mimeTypesMp4aObjectType = (MimeTypesMp4aObjectType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) mimeTypesMp4aObjectType.MediaBrowserCompatItemReceiver) && this.AudioAttributesCompatParcelizer == mimeTypesMp4aObjectType.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) mimeTypesMp4aObjectType.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) mimeTypesMp4aObjectType.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) mimeTypesMp4aObjectType.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) mimeTypesMp4aObjectType.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) mimeTypesMp4aObjectType.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) mimeTypesMp4aObjectType.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) mimeTypesMp4aObjectType.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) mimeTypesMp4aObjectType.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, mimeTypesMp4aObjectType.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, mimeTypesMp4aObjectType.RemoteActionCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer == mimeTypesMp4aObjectType.AudioAttributesImplApi21Parcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.MediaBrowserCompatItemReceiver.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.write.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatItemReceiver;
        getTrackTypeOfCodec gettracktypeofcodec = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        String str3 = this.AudioAttributesImplApi26Parcelizer;
        String str4 = this.MediaBrowserCompatSearchResultReceiver;
        String str5 = this.write;
        String str6 = this.MediaBrowserCompatMediaItem;
        String str7 = this.AudioAttributesImplBaseParcelizer;
        String str8 = this.MediaMetadataCompat;
        String str9 = this.IconCompatParcelizer;
        isText istext = this.MediaBrowserCompatCustomActionResultReceiver;
        List<String> list = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("LiveVideoFeatureCardUCModel(videoId=");
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
        sb.append(")");
        return sb.toString();
    }
}
