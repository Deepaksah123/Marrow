package kotlin;

import com.marrow.data.models.content.ContentBody;
import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import com.marrow.data.models.mcq.bookmark.MultiBookmarkCounter;
import com.marrow.data.models.pearl.Pearl;
import com.marrow.data.models.pearl.PearlListItem;
import com.marrow.data.models.pearl.PearlListModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.getEditedValues;

/* JADX INFO: loaded from: classes3.dex */
public final class getBytes {
    public static final <T> List<getEditedValues> RemoteActionCompatParcelizer(PearlListItem<T>[] pearlListItemArr) {
        toMagicModuleMetaRepoModel.write(pearlListItemArr, "");
        ArrayList arrayList = new ArrayList();
        for (PearlListItem<T> pearlListItem : pearlListItemArr) {
            if (pearlListItem.type == 2) {
                T t = pearlListItem.item;
                toMagicModuleMetaRepoModel.read(t, "");
                PearlListModel pearlListModel = (PearlListModel) t;
                String str = pearlListItem.id;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                arrayList.add(new getEditedValues.IconCompatParcelizer(str, pearlListModel.getPearId(), pearlListModel.getPearlDisplayId(), pearlListModel.getPearlTitle(), pearlListModel.isBookmarked(), pearlListModel.getSubjectTitle()));
            } else {
                String str2 = pearlListItem.id;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                T t2 = pearlListItem.item;
                toMagicModuleMetaRepoModel.read(t2, "");
                arrayList.add(new getEditedValues.read(str2, (String) t2, pearlListItem.count));
            }
        }
        return arrayList;
    }

    public static final isMetadataEqual IconCompatParcelizer(Pearl pearl) {
        String imageUrl;
        List listRemoteActionCompatParcelizer;
        List listRemoteActionCompatParcelizer2;
        ContentBody[] contentBodyArr;
        toMagicModuleMetaRepoModel.write(pearl, "");
        String id = pearl.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String pearlDisplayId = pearl.getPearlDisplayId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pearlDisplayId, "");
        String pearlType = pearl.getPearlType();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pearlType, "");
        String title = pearl.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        String imageV2Url = pearl.getImageV2Url();
        if (imageV2Url == null || imageV2Url.length() == 0) {
            imageUrl = pearl.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
        } else {
            setMaximumRequestedThroughputKbps setmaximumrequestedthroughputkbps = setMaximumRequestedThroughputKbps.INSTANCE;
            String imageV2Url2 = pearl.getImageV2Url();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageV2Url2, "");
            imageUrl = setMaximumRequestedThroughputKbps.read(imageV2Url2);
        }
        int iIsBookmarked = pearl.isBookmarked();
        int relatedMcqCount = pearl.getRelatedMcqCount();
        String encryptedContent = pearl.getEncryptedContent();
        String encryptedContent2 = (encryptedContent == null || encryptedContent.length() == 0) ? "" : pearl.getEncryptedContent();
        toMagicModuleMetaRepoModel.write((Object) encryptedContent2);
        String[] rootSubjectIds = pearl.getRootSubjectIds();
        if (rootSubjectIds == null || rootSubjectIds.length == 0) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            String[] rootSubjectIds2 = pearl.getRootSubjectIds();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectIds2, "");
            listRemoteActionCompatParcelizer = getOrderDetails.onCommand(rootSubjectIds2);
        }
        String[] subjectIds = pearl.getSubjectIds();
        if (subjectIds == null || subjectIds.length == 0) {
            listRemoteActionCompatParcelizer2 = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            String[] subjectIds2 = pearl.getSubjectIds();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectIds2, "");
            listRemoteActionCompatParcelizer2 = getOrderDetails.onCommand(subjectIds2);
        }
        int thumbnailWidth = pearl.getThumbnailWidth();
        float aspectRatio = pearl.getAspectRatio();
        String imageCitation = pearl.getImageCitation();
        String imageCitationAuthor = pearl.getImageCitationAuthor();
        String imageCitationLink = pearl.getImageCitationLink();
        String imageCitationLicense = pearl.getImageCitationLicense();
        ContentBody[] decryptedContent = pearl.getDecryptedContent();
        if (decryptedContent == null || decryptedContent.length == 0) {
            contentBodyArr = new ContentBody[0];
        } else {
            ContentBody[] decryptedContent2 = pearl.getDecryptedContent();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(decryptedContent2, "");
            contentBodyArr = decryptedContent2;
        }
        return new isMetadataEqual(id, pearlDisplayId, pearlType, title, imageUrl, iIsBookmarked, relatedMcqCount, encryptedContent2, listRemoteActionCompatParcelizer, listRemoteActionCompatParcelizer2, thumbnailWidth, aspectRatio, imageCitation, imageCitationAuthor, imageCitationLink, imageCitationLicense, contentBodyArr);
    }

    public static final List<CachedContentIndexStorage> read(String[][] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        ArrayList arrayList = new ArrayList();
        for (String[] strArr2 : strArr) {
            arrayList.add(new CachedContentIndexStorage(strArr2[0], strArr2[1]));
        }
        return arrayList;
    }

    public static final List<addValues> write(FilterItemRecord[] filterItemRecordArr) {
        toMagicModuleMetaRepoModel.write(filterItemRecordArr, "");
        ArrayList arrayList = new ArrayList(filterItemRecordArr.length);
        for (FilterItemRecord filterItemRecord : filterItemRecordArr) {
            arrayList.add(new addValues(filterItemRecord.itemId, filterItemRecord.itemTitle, filterItemRecord.count));
        }
        return arrayList;
    }

    public static final List<ContentMetadataMutations> AudioAttributesCompatParcelizer(MultiBookmarkCounter[] multiBookmarkCounterArr) {
        toMagicModuleMetaRepoModel.write(multiBookmarkCounterArr, "");
        ArrayList arrayList = new ArrayList(multiBookmarkCounterArr.length);
        for (MultiBookmarkCounter multiBookmarkCounter : multiBookmarkCounterArr) {
            arrayList.add(new ContentMetadataMutations(multiBookmarkCounter.getBookmarkType(), multiBookmarkCounter.getBookmarkCount()));
        }
        return arrayList;
    }
}
