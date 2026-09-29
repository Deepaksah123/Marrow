package kotlin;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/withHandlersFrom;", "", "", "onMediaButtonEvent", "()V", "", "onFastForward", "()I", "write", "onAddQueueItem", "IconCompatParcelizer", "", "Lo/weirdNumberException;", "AudioAttributesImplApi26Parcelizer", "()Ljava/util/Map;", "RemoteActionCompatParcelizer", "Lkotlin/Function1;", "Lo/JsonNode;", "onPause", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface withHandlersFrom {
    Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer();

    /* JADX INFO: renamed from: onAddQueueItem */
    int getWrite();

    /* JADX INFO: renamed from: onFastForward */
    int getRemoteActionCompatParcelizer();

    void onMediaButtonEvent();

    default getAnswerMap<JsonNode, getShowPopup> onPause() {
        return null;
    }
}
