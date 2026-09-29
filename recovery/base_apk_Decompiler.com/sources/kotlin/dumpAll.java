package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dumpAll extends getApiFallbackAttributionTag {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final GoogleApiSettingsBuilder AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private final List<String> IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String RatingCompat;
    private final getTrackTypeOfCodec RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dumpAll(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, GoogleApiSettingsBuilder googleApiSettingsBuilder, List<String> list, int i) {
        super(str, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, googleApiSettingsBuilder, list, i, 4);
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
        this.AudioAttributesImplApi21Parcelizer = str;
        this.RemoteActionCompatParcelizer = gettracktypeofcodec;
        this.write = str2;
        this.MediaBrowserCompatItemReceiver = str3;
        this.MediaDescriptionCompat = str4;
        this.AudioAttributesCompatParcelizer = str5;
        this.RatingCompat = str6;
        this.MediaBrowserCompatCustomActionResultReceiver = str7;
        this.MediaBrowserCompatSearchResultReceiver = str8;
        this.read = str9;
        this.AudioAttributesImplApi26Parcelizer = googleApiSettingsBuilder;
        this.IconCompatParcelizer = list;
        this.AudioAttributesImplBaseParcelizer = i;
    }

    public final getTrackTypeOfCodec MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.write;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String RatingCompat() {
        return this.RatingCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dumpAll)) {
            return false;
        }
        dumpAll dumpall = (dumpAll) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) dumpall.AudioAttributesImplApi21Parcelizer) && this.RemoteActionCompatParcelizer == dumpall.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) dumpall.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) dumpall.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) dumpall.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) dumpall.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) dumpall.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) dumpall.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) dumpall.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) dumpall.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, dumpall.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, dumpall.IconCompatParcelizer) && this.AudioAttributesImplBaseParcelizer == dumpall.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.AudioAttributesImplApi21Parcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RatingCompat.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi21Parcelizer;
        getTrackTypeOfCodec gettracktypeofcodec = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        String str3 = this.MediaBrowserCompatItemReceiver;
        String str4 = this.MediaDescriptionCompat;
        String str5 = this.AudioAttributesCompatParcelizer;
        String str6 = this.RatingCompat;
        String str7 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str8 = this.MediaBrowserCompatSearchResultReceiver;
        String str9 = this.read;
        GoogleApiSettingsBuilder googleApiSettingsBuilder = this.AudioAttributesImplApi26Parcelizer;
        List<String> list = this.IconCompatParcelizer;
        int i = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("LinkFeatureCardVMModel(linkId=");
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
        sb.append(googleApiSettingsBuilder);
        sb.append(", linkContentStepIds=");
        sb.append(list);
        sb.append(", linkSortOrder=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
