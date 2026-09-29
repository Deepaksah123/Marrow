package kotlin;

import android.content.Context;
import kotlin.Metadata;
import kotlin.getSystemAvailableFeatures;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/getSystemAvailableFeatures;", "", "Landroid/content/Context;", "p0", "Lo/getSystemSharedLibraryNames;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Lo/getSystemSharedLibraryNames;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getSystemAvailableFeatures {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;

    default getSystemSharedLibraryNames RemoteActionCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        throw new NotImplementedError("Must override computeCurrentWindowMetrics(context) and provide an implementation.");
    }

    /* JADX INFO: renamed from: o.getSystemAvailableFeatures$read, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();
        private static getAnswerMap<? super getSystemAvailableFeatures, ? extends getSystemAvailableFeatures> read = new getAnswerMap() { // from class: o.getServiceInfo
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getSystemAvailableFeatures.Companion.read((getSystemAvailableFeatures) obj);
            }
        };
        private static final getUserBadgedDrawableForDensity write = new getUserBadgedDrawableForDensity(null, 1, null);

        private Companion() {
        }

        @getMagicModuleMeta
        public static getSystemAvailableFeatures IconCompatParcelizer() {
            return read.invoke(write);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getSystemAvailableFeatures read(getSystemAvailableFeatures getsystemavailablefeatures) {
            toMagicModuleMetaRepoModel.write(getsystemavailablefeatures, "");
            return getsystemavailablefeatures;
        }
    }
}
