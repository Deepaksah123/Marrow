package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class registerCustomMimeType extends getTopLevelType {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final List<String> IconCompatParcelizer;
    private final isText MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RemoteActionCompatParcelizer;
    private final getTrackTypeOfCodec read;
    private final String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public registerCustomMimeType(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, isText istext, List<String> list, int i) {
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
        this.read = gettracktypeofcodec;
        this.RemoteActionCompatParcelizer = str2;
        this.AudioAttributesImplApi21Parcelizer = str3;
        this.MediaMetadataCompat = str4;
        this.write = str5;
        this.MediaDescriptionCompat = str6;
        this.AudioAttributesImplApi26Parcelizer = str7;
        this.MediaBrowserCompatSearchResultReceiver = str8;
        this.AudioAttributesCompatParcelizer = str9;
        this.MediaBrowserCompatCustomActionResultReceiver = istext;
        this.IconCompatParcelizer = list;
        this.AudioAttributesImplBaseParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerCustomMimeType)) {
            return false;
        }
        registerCustomMimeType registercustommimetype = (registerCustomMimeType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) registercustommimetype.MediaBrowserCompatItemReceiver) && this.read == registercustommimetype.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) registercustommimetype.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) registercustommimetype.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) registercustommimetype.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) registercustommimetype.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) registercustommimetype.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) registercustommimetype.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) registercustommimetype.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) registercustommimetype.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, registercustommimetype.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, registercustommimetype.IconCompatParcelizer) && this.AudioAttributesImplBaseParcelizer == registercustommimetype.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.MediaBrowserCompatItemReceiver.hashCode() * 31) + this.read.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.write.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatItemReceiver;
        getTrackTypeOfCodec gettracktypeofcodec = this.read;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.AudioAttributesImplApi21Parcelizer;
        String str4 = this.MediaMetadataCompat;
        String str5 = this.write;
        String str6 = this.MediaDescriptionCompat;
        String str7 = this.AudioAttributesImplApi26Parcelizer;
        String str8 = this.MediaBrowserCompatSearchResultReceiver;
        String str9 = this.AudioAttributesCompatParcelizer;
        isText istext = this.MediaBrowserCompatCustomActionResultReceiver;
        List<String> list = this.IconCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("LinkFeatureCardUCModel(linkId=");
        sb.append(str);
        sb.append(", linkContentType=");
        sb.append(gettracktypeofcodec);
        sb.append(", linkContentId=");
        sb.append(str2);
        sb.append(", linkSubContentId=");
        sb.append(str3);
        sb.append(", linkSubContentType=");
        sb.append(str4);
        sb.append(", linkContentTitle=");
        sb.append(str5);
        sb.append(", linkSubTitle=");
        sb.append(str6);
        sb.append(", linkPublishedStatus=");
        sb.append(str7);
        sb.append(", linkThumbnail=");
        sb.append(str8);
        sb.append(", linkCourseId=");
        sb.append(str9);
        sb.append(", linkLabel=");
        sb.append(istext);
        sb.append(", linkContentStepIds=");
        sb.append(list);
        sb.append(", linkSortOrder=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
