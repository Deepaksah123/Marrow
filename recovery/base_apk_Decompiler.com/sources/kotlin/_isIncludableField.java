package kotlin;

import java.io.IOException;
import java.io.InputStream;
import kotlin.AnnotatedFieldCollectorFieldBuilder;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_isIncludableField;", "", "<init>", "()V", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class _isIncludableField {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o._isIncludableField$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/_isIncludableField$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Ljava/io/InputStream;", "p0", "Lo/AnnotatedFieldCollectorFieldBuilder$RemoteActionCompatParcelizer;", "write", "(Ljava/io/InputStream;)Lo/AnnotatedFieldCollectorFieldBuilder$RemoteActionCompatParcelizer;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AnnotatedFieldCollectorFieldBuilder.RemoteActionCompatParcelizer write(InputStream p0) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                AnnotatedFieldCollectorFieldBuilder.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = AnnotatedFieldCollectorFieldBuilder.RemoteActionCompatParcelizer.write(p0);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerWrite, "");
                return remoteActionCompatParcelizerWrite;
            } catch (_add e) {
                throw new AnnotatedConstructorSerialization("Unable to parse preferences proto.", e);
            }
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
