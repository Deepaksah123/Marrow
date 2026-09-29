package kotlin;

import android.content.Context;
import kotlin.Metadata;
import kotlin.access6100;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/access6100;", "", "<init>", "()V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class access6100 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.access6100$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/access6100$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/RendererWakeupListener;", "p1", "Lo/SimpleBasePlayerPeriodData;", "p2", "Lo/setIsPlaceholder;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/RendererWakeupListener;Lo/SimpleBasePlayerPeriodData;)Lo/setIsPlaceholder;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @getMagicModuleMeta
        public static setIsPlaceholder RemoteActionCompatParcelizer(final Context p0, final RendererWakeupListener p1, SimpleBasePlayerPeriodData p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            setUid iconCompatParcelizer = p2.getIconCompatParcelizer();
            setWindowStartTimeMs read = p2.getRead();
            access6700 remoteActionCompatParcelizer = p2.getRemoteActionCompatParcelizer();
            getCreatedOnDateMs getcreatedondatems = new getCreatedOnDateMs() { // from class: o.setManifest
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return access6100.Companion.RemoteActionCompatParcelizer(p0, p1);
                }
            };
            return new setIsPlaceholder(new SimpleBasePlayerExternalSyntheticLambda9(getcreatedondatems, null, 2, 0 == true ? 1 : 0), new access5100(getcreatedondatems, p1, null, null, 0L, false, 60, null), iconCompatParcelizer, read, remoteActionCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SimpleBasePlayerExternalSyntheticLambda6 RemoteActionCompatParcelizer(Context context, RendererWakeupListener rendererWakeupListener) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
            return SimpleBasePlayerExternalSyntheticLambda6.INSTANCE.read(context, rendererWakeupListener);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final setIsPlaceholder RemoteActionCompatParcelizer(Context context, RendererWakeupListener rendererWakeupListener, SimpleBasePlayerPeriodData simpleBasePlayerPeriodData) {
        return Companion.RemoteActionCompatParcelizer(context, rendererWakeupListener, simpleBasePlayerPeriodData);
    }
}
