package kotlin;

import com.marrow2.data.user.remote.model.ResetContentInfoResponse;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class isIndoorLevelPickerEnabled {
    public static final List<isMapToolbarEnabled> AudioAttributesCompatParcelizer(postAtFrontOfQueue postatfrontofqueue) {
        long j;
        long j2;
        ResetContentInfoResponse.UiContentCopy qBankAndBookmarkContentUiCopy;
        ResetContentInfoResponse.UiContentCopy bookmarkContentUiCopy;
        ResetContentInfoResponse.UiContentCopy qBankContentUiCopy;
        ResetContentInfoResponse.ContentResetInfo bookmarkContentResetInfo;
        ResetContentInfoResponse.ContentResetInfo bookmarkContentResetInfo2;
        ResetContentInfoResponse.ContentResetInfo lessonContentResetInfo;
        ResetContentInfoResponse.ContentResetInfo lessonContentResetInfo2;
        toMagicModuleMetaRepoModel.write(postatfrontofqueue, "");
        ResetContentInfoResponse.ContentStatus contentStatus = postatfrontofqueue.read();
        Long allowResetAfter = null;
        long j3 = onKeyDown.read((contentStatus == null || (lessonContentResetInfo2 = contentStatus.getLessonContentResetInfo()) == null) ? null : lessonContentResetInfo2.getLastResettedOn());
        ResetContentInfoResponse.ContentStatus contentStatus2 = postatfrontofqueue.read();
        long j4 = onKeyDown.read((contentStatus2 == null || (lessonContentResetInfo = contentStatus2.getLessonContentResetInfo()) == null) ? null : lessonContentResetInfo.getAllowResetAfter());
        ResetContentInfoResponse.ContentStatus contentStatus3 = postatfrontofqueue.read();
        long j5 = onKeyDown.read((contentStatus3 == null || (bookmarkContentResetInfo2 = contentStatus3.getBookmarkContentResetInfo()) == null) ? null : bookmarkContentResetInfo2.getLastResettedOn());
        ResetContentInfoResponse.ContentStatus contentStatus4 = postatfrontofqueue.read();
        if (contentStatus4 != null && (bookmarkContentResetInfo = contentStatus4.getBookmarkContentResetInfo()) != null) {
            allowResetAfter = bookmarkContentResetInfo.getAllowResetAfter();
        }
        long j6 = onKeyDown.read(allowResetAfter);
        List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
        ResetContentInfoResponse.ScreenCopy screenCopyRemoteActionCompatParcelizer = postatfrontofqueue.RemoteActionCompatParcelizer();
        if (screenCopyRemoteActionCompatParcelizer == null || (qBankContentUiCopy = screenCopyRemoteActionCompatParcelizer.getQBankContentUiCopy()) == null) {
            j = j6;
            j2 = j5;
        } else {
            j = j6;
            j2 = j5;
            listIconCompatParcelizer.add(new isMapToolbarEnabled(qBankContentUiCopy.getTitle(), qBankContentUiCopy.getDescription(), j3, j4, StreetViewPanoramaViewzzb.read));
        }
        ResetContentInfoResponse.ScreenCopy screenCopyRemoteActionCompatParcelizer2 = postatfrontofqueue.RemoteActionCompatParcelizer();
        if (screenCopyRemoteActionCompatParcelizer2 != null && (bookmarkContentUiCopy = screenCopyRemoteActionCompatParcelizer2.getBookmarkContentUiCopy()) != null) {
            listIconCompatParcelizer.add(new isMapToolbarEnabled(bookmarkContentUiCopy.getTitle(), bookmarkContentUiCopy.getDescription(), j2, j, StreetViewPanoramaViewzzb.write));
        }
        ResetContentInfoResponse.ScreenCopy screenCopyRemoteActionCompatParcelizer3 = postatfrontofqueue.RemoteActionCompatParcelizer();
        if (screenCopyRemoteActionCompatParcelizer3 != null && (qBankAndBookmarkContentUiCopy = screenCopyRemoteActionCompatParcelizer3.getQBankAndBookmarkContentUiCopy()) != null) {
            listIconCompatParcelizer.add(new isMapToolbarEnabled(qBankAndBookmarkContentUiCopy.getTitle(), qBankAndBookmarkContentUiCopy.getDescription(), Math.max(j3, j2), Math.max(j4, j), StreetViewPanoramaViewzzb.IconCompatParcelizer));
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer);
    }
}
