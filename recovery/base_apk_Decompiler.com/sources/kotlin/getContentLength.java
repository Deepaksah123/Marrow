package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getContentLength {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final getDocumentSize AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final List<String> read;
    private final String write;

    public getContentLength(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, getDocumentSize getdocumentsize, List<String> list, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        toMagicModuleMetaRepoModel.write(getdocumentsize, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.RemoteActionCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.MediaDescriptionCompat = str5;
        this.AudioAttributesCompatParcelizer = str6;
        this.RatingCompat = str7;
        this.AudioAttributesImplBaseParcelizer = str8;
        this.MediaBrowserCompatSearchResultReceiver = str9;
        this.write = str10;
        this.AudioAttributesImplApi26Parcelizer = getdocumentsize;
        this.read = list;
        this.MediaBrowserCompatItemReceiver = i;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String MediaMetadataCompat() {
        return this.MediaDescriptionCompat;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.RatingCompat;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String MediaDescriptionCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final getDocumentSize AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<String> read() {
        return this.read;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getContentLength)) {
            return false;
        }
        getContentLength getcontentlength = (getContentLength) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) getcontentlength.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getcontentlength.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getcontentlength.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) getcontentlength.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) getcontentlength.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getcontentlength.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) getcontentlength.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) getcontentlength.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) getcontentlength.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getcontentlength.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, getcontentlength.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, getcontentlength.read) && this.MediaBrowserCompatItemReceiver == getcontentlength.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.MediaBrowserCompatCustomActionResultReceiver.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.RatingCompat.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.IconCompatParcelizer;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        String str5 = this.MediaDescriptionCompat;
        String str6 = this.AudioAttributesCompatParcelizer;
        String str7 = this.RatingCompat;
        String str8 = this.AudioAttributesImplBaseParcelizer;
        String str9 = this.MediaBrowserCompatSearchResultReceiver;
        String str10 = this.write;
        getDocumentSize getdocumentsize = this.AudioAttributesImplApi26Parcelizer;
        List<String> list = this.read;
        int i = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("FeatureCardRepoModel(id=");
        sb.append(str);
        sb.append(", contentType=");
        sb.append(str2);
        sb.append(", contentId=");
        sb.append(str3);
        sb.append(", subContentId=");
        sb.append(str4);
        sb.append(", subContentType=");
        sb.append(str5);
        sb.append(", contentTitle=");
        sb.append(str6);
        sb.append(", subTitle=");
        sb.append(str7);
        sb.append(", publishedStatus=");
        sb.append(str8);
        sb.append(", thumbnail=");
        sb.append(str9);
        sb.append(", courseId=");
        sb.append(str10);
        sb.append(", label=");
        sb.append(getdocumentsize);
        sb.append(", contentStepIds=");
        sb.append(list);
        sb.append(", sortOrder=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
