package kotlin;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class parseFullAtomFlags {
    public static final List read(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            XingSeeker xingSeeker = (XingSeeker) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", xingSeeker.write());
            bundle.putLong("event_timestamp", xingSeeker.read());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void read(int i, List list) {
        list.add(XingSeeker.RemoteActionCompatParcelizer(i, System.currentTimeMillis()));
    }
}
