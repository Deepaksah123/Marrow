package kotlin;

import com.marrow.data.models.content.ContentBody;
import com.marrow.data.models.content.ContentImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.buildCacheKey;
import kotlin.getEditedValues;
import kotlin.registerDeadlineEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class readUnsignedByte {
    private static readUnsignedInt write(addValues addvalues) {
        toMagicModuleMetaRepoModel.write(addvalues, "");
        return new readUnsignedInt(addvalues.RemoteActionCompatParcelizer(), addvalues.write(), addvalues.IconCompatParcelizer());
    }

    private static readUnsignedFixedPoint1616 RemoteActionCompatParcelizer(ContentMetadataMutations contentMetadataMutations) {
        toMagicModuleMetaRepoModel.write(contentMetadataMutations, "");
        return new readUnsignedFixedPoint1616(contentMetadataMutations.getAudioAttributesCompatParcelizer(), contentMetadataMutations.getRemoteActionCompatParcelizer());
    }

    public static final List<readUnsignedInt> read(List<addValues> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<addValues> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(write((addValues) it.next()));
        }
        return arrayList;
    }

    public static final List<readUnsignedFixedPoint1616> AudioAttributesCompatParcelizer(List<ContentMetadataMutations> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<ContentMetadataMutations> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(RemoteActionCompatParcelizer((ContentMetadataMutations) it.next()));
        }
        return arrayList;
    }

    public static final List<registerDeadlineEvent> write(List<? extends getEditedValues> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        for (getEditedValues geteditedvalues : list) {
            if (geteditedvalues instanceof getEditedValues.IconCompatParcelizer) {
                getEditedValues.IconCompatParcelizer iconCompatParcelizer = (getEditedValues.IconCompatParcelizer) geteditedvalues;
                arrayList.add(new registerDeadlineEvent.RemoteActionCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer(), iconCompatParcelizer.AudioAttributesCompatParcelizer(), iconCompatParcelizer.read(), iconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(), iconCompatParcelizer.write()));
            }
            if (geteditedvalues instanceof getEditedValues.read) {
                getEditedValues.read readVar = (getEditedValues.read) geteditedvalues;
                String strWrite = readVar.write();
                String strAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.read(strAudioAttributesCompatParcelizer, "");
                arrayList.add(new registerDeadlineEvent.write(strWrite, strAudioAttributesCompatParcelizer, readVar.RemoteActionCompatParcelizer()));
            }
        }
        return arrayList;
    }

    public static final List<readUnsignedInt24> IconCompatParcelizer(List<CachedContentIndexStorage> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<CachedContentIndexStorage> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (CachedContentIndexStorage cachedContentIndexStorage : list2) {
            arrayList.add(new readUnsignedInt24(cachedContentIndexStorage.AudioAttributesCompatParcelizer(), cachedContentIndexStorage.read()));
        }
        return arrayList;
    }

    public static final AndroidUtilsLight read(isMetadataEqual ismetadataequal) {
        String str = "";
        toMagicModuleMetaRepoModel.write(ismetadataequal, "");
        String strMediaBrowserCompatItemReceiver = ismetadataequal.MediaBrowserCompatItemReceiver();
        String strIconCompatParcelizer = ismetadataequal.IconCompatParcelizer();
        String strMediaBrowserCompatMediaItem = ismetadataequal.MediaBrowserCompatMediaItem();
        String strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ismetadataequal.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        String strMediaBrowserCompatSearchResultReceiver = ismetadataequal.MediaBrowserCompatSearchResultReceiver();
        int iAudioAttributesCompatParcelizer = ismetadataequal.AudioAttributesCompatParcelizer();
        int iMediaDescriptionCompat = ismetadataequal.MediaDescriptionCompat();
        String strWrite = ismetadataequal.write();
        List<String> listRatingCompat = ismetadataequal.RatingCompat();
        List<String> listMediaMetadataCompat = ismetadataequal.MediaMetadataCompat();
        int iHandleMediaPlayPauseIfPendingOnHandler = ismetadataequal.handleMediaPlayPauseIfPendingOnHandler();
        float fRemoteActionCompatParcelizer = ismetadataequal.RemoteActionCompatParcelizer();
        String strMediaBrowserCompatCustomActionResultReceiver = ismetadataequal.MediaBrowserCompatCustomActionResultReceiver();
        String strAudioAttributesImplApi26Parcelizer = ismetadataequal.AudioAttributesImplApi26Parcelizer();
        String strAudioAttributesImplApi21Parcelizer = ismetadataequal.AudioAttributesImplApi21Parcelizer();
        String strAudioAttributesImplBaseParcelizer = ismetadataequal.AudioAttributesImplBaseParcelizer();
        ContentBody[] contentBodyArr = ismetadataequal.read();
        List listOnCommand = getOrderDetails.onCommand(ismetadataequal.read());
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand, 10));
        Iterator it = listOnCommand.iterator();
        while (it.hasNext()) {
            ContentBody contentBody = (ContentBody) it.next();
            String htmlContent = contentBody.getHtmlContent();
            String str2 = htmlContent == null ? str : htmlContent;
            String bodyType = contentBody.getBodyType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bodyType, str);
            long j = onKeyDown.read(Long.valueOf(contentBody.getMsInterimHtmlEndTime()));
            long j2 = onKeyDown.read(Long.valueOf(contentBody.getMsInterimHtmlStartTime()));
            boolean zIsShowDummyReference = contentBody.isShowDummyReference();
            ContentImage[] imagesInfo = contentBody.getImagesInfo();
            if (imagesInfo == null) {
                imagesInfo = new ContentImage[0];
            }
            List<ContentImage> listOnCommand2 = getOrderDetails.onCommand(imagesInfo);
            String str3 = str;
            Iterator it2 = it;
            int i = iHandleMediaPlayPauseIfPendingOnHandler;
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listOnCommand2, 10));
            for (ContentImage contentImage : listOnCommand2) {
                String imageCitationAuthor = contentImage.getImageCitationAuthor();
                String str4 = imageCitationAuthor == null ? str3 : imageCitationAuthor;
                int thumbnailHeight = contentImage.getThumbnailHeight();
                int thumbnailWidth = contentImage.getThumbnailWidth();
                String imageCitationLicense = contentImage.getImageCitationLicense();
                String str5 = imageCitationLicense == null ? str3 : imageCitationLicense;
                String imageCitationLink = contentImage.getImageCitationLink();
                String str6 = imageCitationLink == null ? str3 : imageCitationLink;
                String imageUrl = contentImage.getImageUrl();
                String str7 = imageUrl == null ? str3 : imageUrl;
                String imageUrlV2 = contentImage.getImageUrlV2();
                arrayList2.add(new buildCacheKey.IconCompatParcelizer.RemoteActionCompatParcelizer(str4, str6, String.valueOf(thumbnailHeight), str5, String.valueOf(thumbnailWidth), str7, imageUrlV2 == null ? str3 : imageUrlV2));
            }
            arrayList.add(new buildCacheKey.IconCompatParcelizer(str2, -1, arrayList2, bodyType, j2, j, zIsShowDummyReference));
            str = str3;
            it = it2;
            iHandleMediaPlayPauseIfPendingOnHandler = i;
        }
        return new AndroidUtilsLight(strMediaBrowserCompatItemReceiver, strIconCompatParcelizer, strMediaBrowserCompatMediaItem, strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, strMediaBrowserCompatSearchResultReceiver, iAudioAttributesCompatParcelizer, iMediaDescriptionCompat, strWrite, listRatingCompat, listMediaMetadataCompat, iHandleMediaPlayPauseIfPendingOnHandler, fRemoteActionCompatParcelizer, strMediaBrowserCompatCustomActionResultReceiver, strAudioAttributesImplApi26Parcelizer, strAudioAttributesImplApi21Parcelizer, strAudioAttributesImplBaseParcelizer, contentBodyArr, arrayList);
    }
}
