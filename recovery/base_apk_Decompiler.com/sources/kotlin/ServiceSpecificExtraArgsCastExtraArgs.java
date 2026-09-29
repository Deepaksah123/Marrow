package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lo/ServiceSpecificExtraArgsCastExtraArgs;", "", "<init>", "()V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/ServiceSpecificExtraArgsCastExtraArgs$AudioAttributesCompatParcelizer;", "Lo/ServiceSpecificExtraArgsCastExtraArgs$IconCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ServiceSpecificExtraArgsCastExtraArgs {

    public static final class IconCompatParcelizer extends ServiceSpecificExtraArgsCastExtraArgs {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    private ServiceSpecificExtraArgsCastExtraArgs() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/ServiceSpecificExtraArgsCastExtraArgs$AudioAttributesCompatParcelizer;", "Lo/ServiceSpecificExtraArgsCastExtraArgs;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends ServiceSpecificExtraArgsCastExtraArgs {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public /* synthetic */ ServiceSpecificExtraArgsCastExtraArgs(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
