package kotlin;

import com.marrow.data.api.models.response.Data;
import com.marrow2.data.recentUpdates.remote.model.RecentUpdateSubjectDetailsResponse;
import com.marrow2.data.recentUpdates.remote.model.RecentUpdatesFilterResponse;
import com.marrow2.data.recentUpdates.remote.model.RecentUpdatesImageResponse;
import com.marrow2.data.recentUpdates.remote.model.RecentUpdatesReferencesResponse;
import com.marrow2.data.recentUpdates.remote.model.RecentUpdatesResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getInitializationVector {
    public static final ExperimentalBandwidthMeter read(Data<List<RecentUpdatesResponse>> data) {
        toMagicModuleMetaRepoModel.write(data, "");
        String nextUrl = data.pageInfo.getNextUrl();
        List<RecentUpdatesResponse> list = data.data;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
        List<RecentUpdatesResponse> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(read((RecentUpdatesResponse) it.next()));
        }
        return new ExperimentalBandwidthMeter(nextUrl, arrayList);
    }

    public static final getBandwidthEstimate read(RecentUpdatesResponse recentUpdatesResponse) {
        BandwidthStatistic bandwidthStatistic;
        List listRemoteActionCompatParcelizer;
        String imageUrl;
        toMagicModuleMetaRepoModel.write(recentUpdatesResponse, "");
        String id = recentUpdatesResponse.getId();
        String description = recentUpdatesResponse.getDescription();
        List<String> mcqList = recentUpdatesResponse.getMcqList();
        if (mcqList == null) {
            mcqList = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<String> list = mcqList;
        List<Integer> pearlList = recentUpdatesResponse.getPearlList();
        if (pearlList == null) {
            pearlList = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        List<Integer> list2 = pearlList;
        long publishedOnMs = recentUpdatesResponse.getPublishedOnMs();
        String referenceLink = recentUpdatesResponse.getReferenceLink();
        String str = referenceLink == null ? "" : referenceLink;
        RecentUpdateSubjectDetailsResponse subjectDetails = recentUpdatesResponse.getSubjectDetails();
        if (subjectDetails != null) {
            String id2 = subjectDetails.getId();
            if (id2 == null) {
                id2 = "";
            }
            String title = subjectDetails.getTitle();
            if (title == null) {
                title = "";
            }
            bandwidthStatistic = new BandwidthStatistic(id2, title);
        } else {
            bandwidthStatistic = new BandwidthStatistic(null, null, 3, null);
        }
        String title2 = recentUpdatesResponse.getTitle();
        RecentUpdatesImageResponse image = recentUpdatesResponse.getImage();
        onNetworkTypeChange onnetworktypechange = (image == null || (imageUrl = image.getImageUrl()) == null) ? new onNetworkTypeChange(null, 1, null) : new onNetworkTypeChange(imageUrl);
        List<RecentUpdatesReferencesResponse> tagsList = recentUpdatesResponse.getTagsList();
        if (tagsList == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        } else {
            List<RecentUpdatesReferencesResponse> list3 = tagsList;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list3, 10));
            for (RecentUpdatesReferencesResponse recentUpdatesReferencesResponse : list3) {
                int type = recentUpdatesReferencesResponse.getType();
                String displayId = recentUpdatesReferencesResponse.getDisplayId();
                if (displayId == null) {
                    displayId = "";
                }
                arrayList.add(new CombinedParallelSampleBandwidthEstimator1(type, displayId));
            }
            listRemoteActionCompatParcelizer = arrayList;
        }
        return new getBandwidthEstimate(id, description, list, list2, publishedOnMs, str, bandwidthStatistic, title2, onnetworktypechange, listRemoteActionCompatParcelizer);
    }

    public static final CombinedParallelSampleBandwidthEstimator RemoteActionCompatParcelizer(RecentUpdatesFilterResponse recentUpdatesFilterResponse) {
        toMagicModuleMetaRepoModel.write(recentUpdatesFilterResponse, "");
        return new CombinedParallelSampleBandwidthEstimator(recentUpdatesFilterResponse.getSubjectIds());
    }
}
