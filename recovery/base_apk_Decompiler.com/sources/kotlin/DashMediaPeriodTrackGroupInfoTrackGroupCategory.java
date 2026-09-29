package kotlin;

import android.content.Context;
import java.util.ArrayList;
import kotlin.PlayerEmsgHandlerManifestExpiryEventInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class DashMediaPeriodTrackGroupInfoTrackGroupCategory<T extends PlayerEmsgHandlerManifestExpiryEventInfo> extends getIntervalUntilNextManifestRefreshMs<T> {
    protected DashMediaPeriodTrackGroupInfoTrackGroupCategory(Context context, String str) {
        super(context, str);
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void AudioAttributesCompatParcelizer(T t) {
        if (t.isPublished()) {
            super.AudioAttributesCompatParcelizer(t);
        } else {
            IconCompatParcelizer(IconCompatParcelizer(t));
        }
    }

    @Override // kotlin.getIntervalUntilNextManifestRefreshMs
    public void IconCompatParcelizer(T[] tArr) {
        if (tArr == null || tArr.length == 0) {
            return;
        }
        ArrayList<T> arrayList = new ArrayList<>();
        boolean z = false;
        for (T t : tArr) {
            if (t.isPublished()) {
                arrayList.add(t);
            } else {
                IconCompatParcelizer(IconCompatParcelizer(t));
                z = true;
            }
        }
        if (z) {
            tArr = IconCompatParcelizer(arrayList);
        }
        super.IconCompatParcelizer(tArr);
    }
}
