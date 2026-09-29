package kotlin;

import com.marrow.data.models.common.NetworkStat;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getExternalPeriodUid;", "", "<init>", "()V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getExternalPeriodUid {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.getExternalPeriodUid$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J4\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/marrow/Crashlytics$Companion;", "", "<init>", "()V", "log", "", "msg", "", "logException", "throwable", "", "params", "", "stat", "Lcom/marrow/data/models/common/NetworkStat;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            DtsReader dtsReaderRemoteActionCompatParcelizer = DtsReader.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dtsReaderRemoteActionCompatParcelizer, "");
            dtsReaderRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("E/TAG: ".concat(String.valueOf(str)));
        }

        public static /* synthetic */ void read(Throwable th, Map map, int i) {
            if ((i & 2) != 0) {
                map = null;
            }
            RemoteActionCompatParcelizer(th, map, null);
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer(Throwable th, Map<String, String> map, NetworkStat networkStat) {
            toMagicModuleMetaRepoModel.write(th, "");
            DtsReader dtsReaderRemoteActionCompatParcelizer = DtsReader.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dtsReaderRemoteActionCompatParcelizer, "");
            if (map == null) {
                map = VideoTimelineResponseBody.read();
            }
            HashMap<String, String> map2 = networkStat != null ? networkStat.toMap() : null;
            if (map2 == null) {
                map2 = VideoTimelineResponseBody.read();
            }
            for (Map.Entry entry : VideoTimelineResponseBody.read(map, map2).entrySet()) {
                dtsReaderRemoteActionCompatParcelizer.RemoteActionCompatParcelizer((String) entry.getKey(), (String) entry.getValue());
            }
            dtsReaderRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(th);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final void RemoteActionCompatParcelizer(Throwable th, Map<String, String> map, NetworkStat networkStat) {
        Companion.RemoteActionCompatParcelizer(th, map, networkStat);
    }
}
