package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u001d\u0010\u0006\u001a\u00020\f8W@VX\u0096\u008c\u0002¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lo/findCoercion;", "Lo/ConfigFeature;", "<init>", "()V", "Lo/InputAccessor;", "Lo/getKey;", "RemoteActionCompatParcelizer", "Lo/InputAccessor;", "write", "Lo/handleIdValue;", "read", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findCoercion implements ConfigFeature {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InputAccessor<handleSecondaryContextualization> write = available.RemoteActionCompatParcelizer$default(handleSecondaryContextualization.IconCompatParcelizer(canOverrideAccessModifiers.RemoteActionCompatParcelizer()), null, 2, null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor<getKey> write = available.RemoteActionCompatParcelizer$default(getKey.AudioAttributesCompatParcelizer(getKey.INSTANCE.RemoteActionCompatParcelizer()), null, 2, null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final InputAccessor<handleIdValue> IconCompatParcelizer = available.RemoteActionCompatParcelizer$default(handleIdValue.read(handleIdValue.INSTANCE.AudioAttributesCompatParcelizer()), null, 2, null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor RemoteActionCompatParcelizer = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ConfigFeature
    public final boolean AudioAttributesCompatParcelizer() {
        return ((Boolean) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: renamed from: o.findCoercion$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/findCoercion$IconCompatParcelizer;", "", "<init>", "()V", "Lo/InputAccessor;", "Lo/handleSecondaryContextualization;", "write", "Lo/InputAccessor;", "AudioAttributesCompatParcelizer", "()Lo/InputAccessor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final InputAccessor<handleSecondaryContextualization> AudioAttributesCompatParcelizer() {
            return findCoercion.write;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
