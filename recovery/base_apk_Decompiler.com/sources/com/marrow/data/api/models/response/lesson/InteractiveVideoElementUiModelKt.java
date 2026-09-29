package com.marrow.data.api.models.response.lesson;

import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel;", "Lo/getSubscriptionExpiresOn;", "", "findFirstAndLastInteractiveTime", "(Ljava/util/List;)Lo/getSubscriptionExpiresOn;", "", "p0", "findTheInteractiveElementWhichIsInBetween", "(Ljava/util/List;J)Lcom/marrow/data/api/models/response/lesson/InteractiveVideoElementUiModel;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class InteractiveVideoElementUiModelKt {
    public static final Pair<Integer, Integer> findFirstAndLastInteractiveTime(List<InteractiveVideoElementUiModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        InteractiveVideoElementUiModel interactiveVideoElementUiModel = (InteractiveVideoElementUiModel) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) list);
        int startTime = interactiveVideoElementUiModel != null ? interactiveVideoElementUiModel.getStartTime() : -1;
        InteractiveVideoElementUiModel interactiveVideoElementUiModel2 = (InteractiveVideoElementUiModel) IntermediateLoginResponseBody.MediaMetadataCompat((List) list);
        return new Pair<>(Integer.valueOf(startTime), Integer.valueOf(interactiveVideoElementUiModel2 != null ? interactiveVideoElementUiModel2.getEndTime() : -1));
    }

    public static final InteractiveVideoElementUiModel findTheInteractiveElementWhichIsInBetween(List<InteractiveVideoElementUiModel> list, long j) {
        Object next;
        toMagicModuleMetaRepoModel.write(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InteractiveVideoElementUiModel interactiveVideoElementUiModel = (InteractiveVideoElementUiModel) next;
            if (interactiveVideoElementUiModel.getStartTime() <= j && interactiveVideoElementUiModel.getEndTime() > j) {
                break;
            }
        }
        return (InteractiveVideoElementUiModel) next;
    }
}
