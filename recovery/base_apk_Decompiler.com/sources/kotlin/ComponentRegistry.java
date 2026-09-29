package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.setClock, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B¿\u0001\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012P\u0010\u0006\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\n\u0012H\u0010\u000b\u001aD\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011RV\u0010\u000b\u001aD\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\f\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R^\u0010\u0006\u001aL\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t0\u00070\u0004j\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t`\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcoil/ComponentRegistry;", "", "()V", "interceptors", "", "Lcoil/intercept/Interceptor;", "mappers", "Lkotlin/Pair;", "Lcoil/map/Mapper;", "Ljava/lang/Class;", "Lcoil/util/MultiList;", "fetchers", "Lcoil/fetch/Fetcher;", "decoders", "Lcoil/decode/Decoder;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDecoders$coil_base_release", "()Ljava/util/List;", "getFetchers$coil_base_release", "getInterceptors$coil_base_release", "getMappers$coil_base_release", "newBuilder", "Lcoil/ComponentRegistry$Builder;", "Builder", "coil-base_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ComponentRegistry {
    private final List<Pair<setDeviceVolume<? extends Object, ?>, Class<? extends Object>>> AudioAttributesCompatParcelizer;
    private final List<ExoPlayerTextComponent> IconCompatParcelizer;
    private final List<Pair<ExoPlayerBuilderExternalSyntheticLambda9<? extends Object>, Class<? extends Object>>> RemoteActionCompatParcelizer;
    private final List<ExoPlayerBuilderExternalSyntheticLambda21> read;

    /* JADX WARN: Multi-variable type inference failed */
    private ComponentRegistry(List<? extends ExoPlayerTextComponent> list, List<? extends Pair<? extends setDeviceVolume<? extends Object, ?>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends ExoPlayerBuilderExternalSyntheticLambda9<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends ExoPlayerBuilderExternalSyntheticLambda21> list4) {
        this.IconCompatParcelizer = list;
        this.AudioAttributesCompatParcelizer = list2;
        this.RemoteActionCompatParcelizer = list3;
        this.read = list4;
    }

    public final List<ExoPlayerTextComponent> read() {
        return this.IconCompatParcelizer;
    }

    public final List<Pair<setDeviceVolume<? extends Object, ?>, Class<? extends Object>>> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final List<Pair<ExoPlayerBuilderExternalSyntheticLambda9<? extends Object>, Class<? extends Object>>> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<ExoPlayerBuilderExternalSyntheticLambda21> write() {
        return this.read;
    }

    public ComponentRegistry() {
        this(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
    }

    public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
        return new RemoteActionCompatParcelizer(this);
    }

    public /* synthetic */ ComponentRegistry(List list, List list2, List list3, List list4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(list, list2, list3, list4);
    }

    /* JADX INFO: renamed from: o.setClock$RemoteActionCompatParcelizer */
    public static final class RemoteActionCompatParcelizer {
        private final List<ExoPlayerTextComponent> AudioAttributesCompatParcelizer;
        private final List<Pair<ExoPlayerBuilderExternalSyntheticLambda9<? extends Object>, Class<? extends Object>>> RemoteActionCompatParcelizer;
        private final List<Pair<setDeviceVolume<? extends Object, ?>, Class<? extends Object>>> read;
        private final List<ExoPlayerBuilderExternalSyntheticLambda21> write;

        public RemoteActionCompatParcelizer() {
            this.AudioAttributesCompatParcelizer = new ArrayList();
            this.read = new ArrayList();
            this.RemoteActionCompatParcelizer = new ArrayList();
            this.write = new ArrayList();
        }

        public RemoteActionCompatParcelizer(ComponentRegistry componentRegistry) {
            toMagicModuleMetaRepoModel.write(componentRegistry, "");
            this.AudioAttributesCompatParcelizer = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) componentRegistry.read());
            this.read = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) componentRegistry.RemoteActionCompatParcelizer());
            this.RemoteActionCompatParcelizer = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) componentRegistry.IconCompatParcelizer());
            this.write = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) componentRegistry.write());
        }

        public final <T> RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(setDeviceVolume<T, ?> setdevicevolume, Class<T> cls) {
            toMagicModuleMetaRepoModel.write(setdevicevolume, "");
            toMagicModuleMetaRepoModel.write(cls, "");
            this.read.add(setAction.write(setdevicevolume, cls));
            return this;
        }

        public final <T> RemoteActionCompatParcelizer write(ExoPlayerBuilderExternalSyntheticLambda9<T> exoPlayerBuilderExternalSyntheticLambda9, Class<T> cls) {
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda9, "");
            toMagicModuleMetaRepoModel.write(cls, "");
            this.RemoteActionCompatParcelizer.add(setAction.write(exoPlayerBuilderExternalSyntheticLambda9, cls));
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21) {
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda21, "");
            this.write.add(exoPlayerBuilderExternalSyntheticLambda21);
            return this;
        }

        public final ComponentRegistry RemoteActionCompatParcelizer() {
            return new ComponentRegistry(IntermediateLoginResponseBody.onPlay(this.AudioAttributesCompatParcelizer), IntermediateLoginResponseBody.onPlay(this.read), IntermediateLoginResponseBody.onPlay(this.RemoteActionCompatParcelizer), IntermediateLoginResponseBody.onPlay(this.write), null);
        }
    }
}
