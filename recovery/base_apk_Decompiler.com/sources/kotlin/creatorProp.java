package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class creatorProp {
    public static void IconCompatParcelizer(_long _longVar, _getToStringLookup _gettostringlookup, ArrayList<JdkDeserializers> arrayList, int i) {
        int i2;
        JsonLocationInstantiator[] jsonLocationInstantiatorArr;
        int i3;
        if (i == 0) {
            i2 = _longVar.onSkipToQueueItem;
            jsonLocationInstantiatorArr = _longVar.onStop;
            i3 = 0;
        } else {
            i2 = _longVar.ParcelableVolumeInfo;
            jsonLocationInstantiatorArr = _longVar.MediaSessionCompatResultReceiverWrapper;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            JsonLocationInstantiator jsonLocationInstantiator = jsonLocationInstantiatorArr[i4];
            jsonLocationInstantiator.RemoteActionCompatParcelizer();
            if (arrayList == null || arrayList.contains(jsonLocationInstantiator.read)) {
                RemoteActionCompatParcelizer(_longVar, _gettostringlookup, i, i3, jsonLocationInstantiator);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c A[PHI: r8 r15
      0x004c: PHI (r8v3 boolean) = (r8v1 boolean), (r8v44 boolean) binds: [B:28:0x004a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x004c: PHI (r15v3 boolean) = (r15v1 boolean), (r15v34 boolean) binds: [B:28:0x004a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050 A[PHI: r8 r15
      0x0050: PHI (r8v41 boolean) = (r8v1 boolean), (r8v44 boolean) binds: [B:28:0x004a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r15v31 boolean) = (r15v1 boolean), (r15v34 boolean) binds: [B:28:0x004a, B:17:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x03de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void RemoteActionCompatParcelizer(kotlin._long r38, kotlin._getToStringLookup r39, int r40, int r41, kotlin.JsonLocationInstantiator r42) {
        /*
            Method dump skipped, instruction units count: 1413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.creatorProp.RemoteActionCompatParcelizer(o._long, o._getToStringLookup, int, int, o.JsonLocationInstantiator):void");
    }
}
