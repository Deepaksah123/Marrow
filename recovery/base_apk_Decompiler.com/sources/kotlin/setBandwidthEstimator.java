package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0006\bB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0016X\u0096\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\t\n"}, d2 = {"Lo/setBandwidthEstimator;", "V", "", "p0", "<init>", "(Ljava/lang/Object;)V", "IconCompatParcelizer", "Ljava/lang/Object;", "read", "Lo/setBandwidthEstimator$read;", "Lo/setBandwidthEstimator$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setBandwidthEstimator<V> {
    private final V IconCompatParcelizer;

    public static final class IconCompatParcelizer<V> extends setBandwidthEstimator<V> {
        private final V read;

        public IconCompatParcelizer(V v) {
            super(v, null);
            this.read = v;
        }
    }

    private setBandwidthEstimator(V v) {
        this.IconCompatParcelizer = v;
    }

    public /* synthetic */ setBandwidthEstimator(Object obj, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(obj);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/marrow2/data/remoteconfig/remote/model/RemoteConfigResponse$Error;", "V", "Lcom/marrow2/data/remoteconfig/remote/model/RemoteConfigResponse;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "data", "<init>", "(Ljava/lang/Exception;Ljava/lang/Object;)V", "getError", "()Ljava/lang/Exception;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read<V> extends setBandwidthEstimator<V> {
        private final Exception AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private read(Exception exc, V v) {
            super(v, null);
            toMagicModuleMetaRepoModel.write(exc, "");
            this.AudioAttributesCompatParcelizer = exc;
        }

        public /* synthetic */ read(Exception exc, Object obj, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(exc, (i & 2) != 0 ? null : obj);
        }
    }
}
