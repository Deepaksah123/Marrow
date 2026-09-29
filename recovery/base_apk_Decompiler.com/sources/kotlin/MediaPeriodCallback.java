package kotlin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MediaPeriodCallback {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List RemoteActionCompatParcelizer(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        for (int i = 0; i <= 0; i++) {
            arrayList.add(Objects.requireNonNull(objArr[0]));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
