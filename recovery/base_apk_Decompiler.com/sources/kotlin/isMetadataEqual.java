package kotlin;

import com.marrow.data.models.content.ContentBody;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class isMetadataEqual {
    private final int AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final List<String> MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final int MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final List<String> RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private final String onAddQueueItem;
    private final float read;
    private final ContentBody[] write;

    public isMetadataEqual(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, List<String> list, List<String> list2, int i3, float f, String str7, String str8, String str9, String str10, ContentBody[] contentBodyArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(contentBodyArr, "");
        this.AudioAttributesImplApi21Parcelizer = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompatSearchResultReceiver = str3;
        this.onAddQueueItem = str4;
        this.MediaMetadataCompat = str5;
        this.AudioAttributesCompatParcelizer = i;
        this.MediaDescriptionCompat = i2;
        this.RemoteActionCompatParcelizer = str6;
        this.MediaBrowserCompatMediaItem = list;
        this.RatingCompat = list2;
        this.handleMediaPlayPauseIfPendingOnHandler = i3;
        this.read = f;
        this.AudioAttributesImplBaseParcelizer = str7;
        this.MediaBrowserCompatCustomActionResultReceiver = str8;
        this.MediaBrowserCompatItemReceiver = str9;
        this.AudioAttributesImplApi26Parcelizer = str10;
        this.write = contentBodyArr;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onAddQueueItem;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int MediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<String> RatingCompat() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final List<String> MediaMetadataCompat() {
        return this.RatingCompat;
    }

    public final int handleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final float RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final ContentBody[] read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isMetadataEqual)) {
            return false;
        }
        isMetadataEqual ismetadataequal = (isMetadataEqual) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) ismetadataequal.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) ismetadataequal.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) ismetadataequal.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onAddQueueItem, (Object) ismetadataequal.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) ismetadataequal.MediaMetadataCompat) && this.AudioAttributesCompatParcelizer == ismetadataequal.AudioAttributesCompatParcelizer && this.MediaDescriptionCompat == ismetadataequal.MediaDescriptionCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) ismetadataequal.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, ismetadataequal.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat, ismetadataequal.RatingCompat) && this.handleMediaPlayPauseIfPendingOnHandler == ismetadataequal.handleMediaPlayPauseIfPendingOnHandler && Float.compare(this.read, ismetadataequal.read) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) ismetadataequal.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) ismetadataequal.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) ismetadataequal.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) ismetadataequal.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ismetadataequal.write);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        int iHashCode3 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        int iHashCode4 = this.onAddQueueItem.hashCode();
        int iHashCode5 = this.MediaMetadataCompat.hashCode();
        int iHashCode6 = Integer.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode7 = Integer.hashCode(this.MediaDescriptionCompat);
        int iHashCode8 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode9 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode10 = this.RatingCompat.hashCode();
        int iHashCode11 = Integer.hashCode(this.handleMediaPlayPauseIfPendingOnHandler);
        int iHashCode12 = Float.hashCode(this.read);
        String str = this.AudioAttributesImplBaseParcelizer;
        int iHashCode13 = str == null ? 0 : str.hashCode();
        String str2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MediaBrowserCompatItemReceiver;
        int iHashCode15 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AudioAttributesImplApi26Parcelizer;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Arrays.hashCode(this.write);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi21Parcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.MediaBrowserCompatSearchResultReceiver;
        String str4 = this.onAddQueueItem;
        String str5 = this.MediaMetadataCompat;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.MediaDescriptionCompat;
        String str6 = this.RemoteActionCompatParcelizer;
        List<String> list = this.MediaBrowserCompatMediaItem;
        List<String> list2 = this.RatingCompat;
        int i3 = this.handleMediaPlayPauseIfPendingOnHandler;
        float f = this.read;
        String str7 = this.AudioAttributesImplBaseParcelizer;
        String str8 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str9 = this.MediaBrowserCompatItemReceiver;
        String str10 = this.AudioAttributesImplApi26Parcelizer;
        String string = Arrays.toString(this.write);
        StringBuilder sb = new StringBuilder("PearlModel(id=");
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
        sb.append(")");
        return sb.toString();
    }
}
