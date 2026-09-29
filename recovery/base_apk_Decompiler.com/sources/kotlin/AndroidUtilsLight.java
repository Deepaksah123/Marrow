package kotlin;

import com.marrow.data.models.content.ContentBody;
import java.util.Arrays;
import java.util.List;
import kotlin.buildCacheKey;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidUtilsLight {
    private final int AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final ContentBody[] IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final int MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final List<String> RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private final List<String> onAddQueueItem;
    private final String onCommand;
    private final float read;
    private final List<buildCacheKey.IconCompatParcelizer> write;

    public AndroidUtilsLight(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, List<String> list, List<String> list2, int i3, float f, String str7, String str8, String str9, String str10, ContentBody[] contentBodyArr, List<buildCacheKey.IconCompatParcelizer> list3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(contentBodyArr, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaBrowserCompatSearchResultReceiver = str3;
        this.onCommand = str4;
        this.MediaDescriptionCompat = str5;
        this.AudioAttributesCompatParcelizer = i;
        this.MediaBrowserCompatMediaItem = i2;
        this.MediaBrowserCompatItemReceiver = str6;
        this.RatingCompat = list;
        this.onAddQueueItem = list2;
        this.handleMediaPlayPauseIfPendingOnHandler = i3;
        this.read = f;
        this.AudioAttributesImplApi26Parcelizer = str7;
        this.AudioAttributesImplApi21Parcelizer = str8;
        this.MediaMetadataCompat = str9;
        this.AudioAttributesImplBaseParcelizer = str10;
        this.IconCompatParcelizer = contentBodyArr;
        this.write = list3;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String MediaDescriptionCompat() {
        return this.onCommand;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final float write() {
        return this.read;
    }

    public final List<buildCacheKey.IconCompatParcelizer> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        String str = this.AudioAttributesImplApi21Parcelizer;
        if (str != null && str.length() != 0) {
            return true;
        }
        String str2 = this.MediaMetadataCompat;
        if (str2 != null && str2.length() != 0) {
            return true;
        }
        String str3 = this.AudioAttributesImplBaseParcelizer;
        return (str3 == null || str3.length() == 0) ? false : true;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        StringBuilder sb = new StringBuilder("");
        String str = this.MediaMetadataCompat;
        if (str != null && str.length() != 0) {
            sb.append("Source: ");
            sb.append(this.MediaMetadataCompat);
            sb.append("\n\n");
        }
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        if (str2 != null && str2.length() != 0) {
            sb.append("Author: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            sb.append("\n\n");
        }
        String str3 = this.AudioAttributesImplBaseParcelizer;
        if (str3 != null && str3.length() != 0) {
            sb.append("License: ");
            sb.append(this.AudioAttributesImplBaseParcelizer);
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidUtilsLight)) {
            return false;
        }
        AndroidUtilsLight androidUtilsLight = (AndroidUtilsLight) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) androidUtilsLight.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) androidUtilsLight.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) androidUtilsLight.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) androidUtilsLight.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) androidUtilsLight.MediaDescriptionCompat) && this.AudioAttributesCompatParcelizer == androidUtilsLight.AudioAttributesCompatParcelizer && this.MediaBrowserCompatMediaItem == androidUtilsLight.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) androidUtilsLight.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat, androidUtilsLight.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onAddQueueItem, androidUtilsLight.onAddQueueItem) && this.handleMediaPlayPauseIfPendingOnHandler == androidUtilsLight.handleMediaPlayPauseIfPendingOnHandler && Float.compare(this.read, androidUtilsLight.read) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) androidUtilsLight.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) androidUtilsLight.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) androidUtilsLight.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) androidUtilsLight.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, androidUtilsLight.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, androidUtilsLight.write);
    }

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        int iHashCode4 = this.onCommand.hashCode();
        int iHashCode5 = this.MediaDescriptionCompat.hashCode();
        int iHashCode6 = Integer.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode7 = Integer.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode8 = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode9 = this.RatingCompat.hashCode();
        int iHashCode10 = this.onAddQueueItem.hashCode();
        int iHashCode11 = Integer.hashCode(this.handleMediaPlayPauseIfPendingOnHandler);
        int iHashCode12 = Float.hashCode(this.read);
        String str = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaMetadataCompat;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AudioAttributesImplBaseParcelizer;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Arrays.hashCode(this.IconCompatParcelizer)) * 31) + this.write.hashCode();
    }

    public final String toString() {
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.MediaBrowserCompatSearchResultReceiver;
        String str4 = this.onCommand;
        String str5 = this.MediaDescriptionCompat;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.MediaBrowserCompatMediaItem;
        String str6 = this.MediaBrowserCompatItemReceiver;
        List<String> list = this.RatingCompat;
        List<String> list2 = this.onAddQueueItem;
        int i3 = this.handleMediaPlayPauseIfPendingOnHandler;
        float f = this.read;
        String str7 = this.AudioAttributesImplApi26Parcelizer;
        String str8 = this.AudioAttributesImplApi21Parcelizer;
        String str9 = this.MediaMetadataCompat;
        String str10 = this.AudioAttributesImplBaseParcelizer;
        String string = Arrays.toString(this.IconCompatParcelizer);
        List<buildCacheKey.IconCompatParcelizer> list3 = this.write;
        StringBuilder sb = new StringBuilder("PearlUIModel(id=");
        sb.append(str);
        sb.append(", displayId=");
        sb.append(str2);
        sb.append(", pearlType=");
        sb.append(str3);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", imageUrl=");
        sb.append(str5);
        sb.append(", bookmarkType=");
        sb.append(i);
        sb.append(", relatedMcqCount=");
        sb.append(i2);
        sb.append(", encryptedContent=");
        sb.append(str6);
        sb.append(", rootSubjectIds=");
        sb.append(list);
        sb.append(", subjectIds=");
        sb.append(list2);
        sb.append(", thumbnailWidth=");
        sb.append(i3);
        sb.append(", aspectRatio=");
        sb.append(f);
        sb.append(", imageCitation=");
        sb.append(str7);
        sb.append(", imageCitationAuthor=");
        sb.append(str8);
        sb.append(", imageCitationLink=");
        sb.append(str9);
        sb.append(", imageCitationLicense=");
        sb.append(str10);
        sb.append(", decryptedContent=");
        sb.append(string);
        sb.append(", decryptedContentParsed=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
