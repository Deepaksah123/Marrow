package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class copyWithSleepingForOffload {
    public static final boolean AudioAttributesCompatParcelizer(Iterable<? extends MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> iterable) {
        boolean z;
        toMagicModuleMetaRepoModel.write(iterable, "");
        Iterator<? extends MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> it = iterable.iterator();
        while (true) {
            while (it.hasNext()) {
                z = it.next().AudioAttributesCompatParcelizer() && z;
            }
            return z;
        }
    }

    public static final boolean IconCompatParcelizer(Iterable<? extends MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        Iterator<? extends MediaSourceListForwardingEventListenerExternalSyntheticLambda11<? extends Object>> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = it.next().AudioAttributesCompatParcelizer() || z;
            if (z) {
                break;
            }
        }
        return z;
    }
}
