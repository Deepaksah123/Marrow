package kotlin;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.getLoadingMediaPeriod;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\rR,\u0010\f\u001a\u001a\u0012\b\u0012\u0006*\u00020\u00010\u0001*\f\u0012\b\u0012\u0006*\u00020\u00010\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/getMinWindowSequenceNumber;", "", "<init>", "()V", "", "write", "", "p0", "p1", "read", "(Ljava/lang/Throwable;Ljava/lang/Object;)V", "", "IconCompatParcelizer", "(Ljava/lang/Object;)Z", "", "", "Ljava/util/Set;", "RemoteActionCompatParcelizer", "Z"}, k = 1, mv = {1, 4, 0})
public final class getMinWindowSequenceNumber {
    private static boolean RemoteActionCompatParcelizer;
    public static final getMinWindowSequenceNumber INSTANCE = new getMinWindowSequenceNumber();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final Set<Object> IconCompatParcelizer = Collections.newSetFromMap(new WeakHashMap());

    private getMinWindowSequenceNumber() {
    }

    @getMagicModuleMeta
    public static final void write() {
        RemoteActionCompatParcelizer = true;
    }

    @getMagicModuleMeta
    public static final void read(Throwable p0, Object p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (RemoteActionCompatParcelizer) {
            IconCompatParcelizer.add(p1);
            if (lambdaonMediaMetadataChanged48.AudioAttributesImplApi26Parcelizer()) {
                isMatchingMediaPeriod.read(p0);
                getLoadingMediaPeriod.read.read(p0, getLoadingMediaPeriod.IconCompatParcelizer.CrashShield).AudioAttributesCompatParcelizer();
            }
        }
    }

    @getMagicModuleMeta
    public static final boolean IconCompatParcelizer(Object p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return IconCompatParcelizer.contains(p0);
    }
}
