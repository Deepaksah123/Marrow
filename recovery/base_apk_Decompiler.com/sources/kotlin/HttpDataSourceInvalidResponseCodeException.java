package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpDataSourceInvalidResponseCodeException {
    private final List<String> AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final HttpDataSourceRequestProperties AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public HttpDataSourceInvalidResponseCodeException(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, HttpDataSourceRequestProperties httpDataSourceRequestProperties, List<String> list, int i) {
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
        toMagicModuleMetaRepoModel.write(httpDataSourceRequestProperties, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.write = str2;
        this.read = str3;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.MediaBrowserCompatMediaItem = str5;
        this.IconCompatParcelizer = str6;
        this.MediaMetadataCompat = str7;
        this.MediaBrowserCompatItemReceiver = str8;
        this.RatingCompat = str9;
        this.RemoteActionCompatParcelizer = str10;
        this.AudioAttributesImplBaseParcelizer = httpDataSourceRequestProperties;
        this.AudioAttributesCompatParcelizer = list;
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String write() {
        return this.IconCompatParcelizer;
    }

    public final String MediaDescriptionCompat() {
        return this.MediaMetadataCompat;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.RatingCompat;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final HttpDataSourceRequestProperties AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<String> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpDataSourceInvalidResponseCodeException)) {
            return false;
        }
        HttpDataSourceInvalidResponseCodeException httpDataSourceInvalidResponseCodeException = (HttpDataSourceInvalidResponseCodeException) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) httpDataSourceInvalidResponseCodeException.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) httpDataSourceInvalidResponseCodeException.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) httpDataSourceInvalidResponseCodeException.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) httpDataSourceInvalidResponseCodeException.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) httpDataSourceInvalidResponseCodeException.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) httpDataSourceInvalidResponseCodeException.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) httpDataSourceInvalidResponseCodeException.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) httpDataSourceInvalidResponseCodeException.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) httpDataSourceInvalidResponseCodeException.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) httpDataSourceInvalidResponseCodeException.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, httpDataSourceInvalidResponseCodeException.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, httpDataSourceInvalidResponseCodeException.AudioAttributesCompatParcelizer) && this.AudioAttributesImplApi26Parcelizer == httpDataSourceInvalidResponseCodeException.AudioAttributesImplApi26Parcelizer;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((this.MediaBrowserCompatCustomActionResultReceiver.hashCode() * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.RatingCompat.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
    }

    public final String toString() {
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        String str2 = this.write;
        String str3 = this.read;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        String str5 = this.MediaBrowserCompatMediaItem;
        String str6 = this.IconCompatParcelizer;
        String str7 = this.MediaMetadataCompat;
        String str8 = this.MediaBrowserCompatItemReceiver;
        String str9 = this.RatingCompat;
        String str10 = this.RemoteActionCompatParcelizer;
        HttpDataSourceRequestProperties httpDataSourceRequestProperties = this.AudioAttributesImplBaseParcelizer;
        List<String> list = this.AudioAttributesCompatParcelizer;
        int i = this.AudioAttributesImplApi26Parcelizer;
        StringBuilder sb = new StringBuilder("FeatureCardLSModel(id=");
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
        sb.append(httpDataSourceRequestProperties);
        sb.append(", contentStepIds=");
        sb.append(list);
        sb.append(", sortOrder=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
