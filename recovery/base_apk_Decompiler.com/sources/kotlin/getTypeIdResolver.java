package kotlin;

import kotlin.deserializeTypedFromArray;

/* JADX INFO: loaded from: classes2.dex */
public final class getTypeIdResolver extends getTypeInclusion {
    @Override // kotlin.getTypeInclusion
    public final deserializeTypedFromArray.IconCompatParcelizer IconCompatParcelizer(deserializeTypedFromArray.IconCompatParcelizer iconCompatParcelizer) throws deserializeTypedFromArray.RemoteActionCompatParcelizer {
        int i = iconCompatParcelizer.write;
        if (i != 3 && i != 2 && i != 268435456 && i != 21 && i != 1342177280 && i != 22 && i != 1610612736 && i != 4) {
            throw new deserializeTypedFromArray.RemoteActionCompatParcelizer(iconCompatParcelizer);
        }
        if (i != 2) {
            return new deserializeTypedFromArray.IconCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer, iconCompatParcelizer.IconCompatParcelizer, 2);
        }
        return deserializeTypedFromArray.IconCompatParcelizer.read;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // kotlin.deserializeTypedFromArray
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTypeIdResolver.read(java.nio.ByteBuffer):void");
    }
}
