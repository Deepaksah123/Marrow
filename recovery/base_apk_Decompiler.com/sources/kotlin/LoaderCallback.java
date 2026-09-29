package kotlin;

import com.marrow.data.models.mcq.bookmark.FilterItemRecord;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class LoaderCallback implements isRetry {
    private final setManifestParser RemoteActionCompatParcelizer;

    @setSdkPayload
    public LoaderCallback(setManifestParser setmanifestparser) {
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        this.RemoteActionCompatParcelizer = setmanifestparser;
    }

    @Override // kotlin.isRetry
    public final List<hasFatalError> IconCompatParcelizer(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
        List<hasFatalError> listOnPlay;
        toMagicModuleMetaRepoModel.write(str, "");
        FilterItemRecord[] filterItemRecordArrIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, z, z2, z3, z4, z5, z6, z7, j);
        if (filterItemRecordArrIconCompatParcelizer != null) {
            ArrayList arrayList = new ArrayList();
            for (FilterItemRecord filterItemRecord : filterItemRecordArrIconCompatParcelizer) {
                arrayList.add(new hasFatalError(filterItemRecord.itemId, filterItemRecord.itemTitle, filterItemRecord.count));
            }
            listOnPlay = IntermediateLoginResponseBody.onPlay(arrayList);
        } else {
            listOnPlay = null;
        }
        return listOnPlay == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnPlay;
    }

    @Override // kotlin.isRetry
    public final List<String> write(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
        List listAudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        String[] strArrWrite = this.RemoteActionCompatParcelizer.write(i, str, z, z2, z3, z4, z5, z6, z7, str2, j);
        List<String> listOnPlay = (strArrWrite == null || (listAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(strArrWrite)) == null) ? null : IntermediateLoginResponseBody.onPlay(listAudioAttributesImplBaseParcelizer);
        return listOnPlay == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnPlay;
    }

    @Override // kotlin.isRetry
    public final int IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.RemoteActionCompatParcelizer.MediaMetadataCompat(str);
    }

    @Override // kotlin.isRetry
    public final List<String> IconCompatParcelizer(String str, String str2) {
        List listAudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        String[] strArrAudioAttributesImplApi26Parcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(str, str2);
        List<String> listOnPlay = (strArrAudioAttributesImplApi26Parcelizer == null || (listAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(strArrAudioAttributesImplApi26Parcelizer)) == null) ? null : IntermediateLoginResponseBody.onPlay(listAudioAttributesImplBaseParcelizer);
        return listOnPlay == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnPlay;
    }

    @Override // kotlin.isRetry
    public final List<hasFatalError> write(String str) {
        List<hasFatalError> listOnPlay;
        List listAudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(str, "");
        FilterItemRecord[] filterItemRecordArrMediaBrowserCompatMediaItem = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem(str);
        if (filterItemRecordArrMediaBrowserCompatMediaItem == null || (listAudioAttributesImplBaseParcelizer = getOrderDetails.AudioAttributesImplBaseParcelizer(filterItemRecordArrMediaBrowserCompatMediaItem)) == null) {
            listOnPlay = null;
        } else {
            List<FilterItemRecord> list = listAudioAttributesImplBaseParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            for (FilterItemRecord filterItemRecord : list) {
                arrayList.add(new hasFatalError(filterItemRecord.itemId, filterItemRecord.itemTitle, filterItemRecord.count));
            }
            listOnPlay = IntermediateLoginResponseBody.onPlay(arrayList);
        }
        return listOnPlay == null ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listOnPlay;
    }
}
