package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/JsonValueInstantiator;", "", "Lo/valueInstantiatorInstance;", "p0", "Lo/setExpandedActionViewsExclusive;", "Lo/JsonNodeFeature;", "p1", "<init>", "(Lo/valueInstantiatorInstance;Lo/setExpandedActionViewsExclusive;)V", "Lo/valueInstantiators;", "IconCompatParcelizer", "Lo/valueInstantiators;", "()Lo/valueInstantiators;", "RemoteActionCompatParcelizer", "Lo/setBackgroundDrawable;", "read", "Lo/setBackgroundDrawable;", "write", "()Lo/setBackgroundDrawable;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonValueInstantiator {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final C0216valueInstantiators RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final setBackgroundDrawable write;

    public JsonValueInstantiator(valueInstantiatorInstance valueinstantiatorinstance, setExpandedActionViewsExclusive<JsonNodeFeature> setexpandedactionviewsexclusive) {
        this.RemoteActionCompatParcelizer = valueinstantiatorinstance.getWrite();
        this.write = new setBackgroundDrawable(valueinstantiatorinstance.MediaBrowserCompatSearchResultReceiver().size());
        List<valueInstantiatorInstance> listMediaBrowserCompatSearchResultReceiver = valueinstantiatorinstance.MediaBrowserCompatSearchResultReceiver();
        int size = listMediaBrowserCompatSearchResultReceiver.size();
        for (int i = 0; i < size; i++) {
            valueInstantiatorInstance valueinstantiatorinstance2 = listMediaBrowserCompatSearchResultReceiver.get(i);
            if (setexpandedactionviewsexclusive.IconCompatParcelizer(valueinstantiatorinstance2.getAudioAttributesImplApi21Parcelizer())) {
                this.write.RemoteActionCompatParcelizer(valueinstantiatorinstance2.getAudioAttributesImplApi21Parcelizer());
            }
        }
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final C0216valueInstantiators getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final setBackgroundDrawable getWrite() {
        return this.write;
    }
}
