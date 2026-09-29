package kotlin;

import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/setWorkAuthenticatorEnabledWithResult;", "", "<init>", "()V", "read", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/setWorkAuthenticatorEnabledWithResult$AudioAttributesCompatParcelizer;", "Lo/setWorkAuthenticatorEnabledWithResult$read;", "Lo/setWorkAuthenticatorEnabledWithResult$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setWorkAuthenticatorEnabledWithResult {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setWorkAuthenticatorEnabledWithResult$read;", "Lo/setWorkAuthenticatorEnabledWithResult;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends setWorkAuthenticatorEnabledWithResult {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    private setWorkAuthenticatorEnabledWithResult() {
    }

    public /* synthetic */ setWorkAuthenticatorEnabledWithResult(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setWorkAuthenticatorEnabledWithResult$AudioAttributesCompatParcelizer;", "Lo/setWorkAuthenticatorEnabledWithResult;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends setWorkAuthenticatorEnabledWithResult {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }

    public static final class RemoteActionCompatParcelizer extends setWorkAuthenticatorEnabledWithResult {
        private final CustomModuleUCModel AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(CustomModuleUCModel customModuleUCModel) {
            super(null);
            toMagicModuleMetaRepoModel.write(customModuleUCModel, "");
            this.AudioAttributesCompatParcelizer = customModuleUCModel;
        }

        public final CustomModuleUCModel AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((RemoteActionCompatParcelizer) obj).AudioAttributesCompatParcelizer);
        }

        public final int hashCode() {
            return this.AudioAttributesCompatParcelizer.hashCode();
        }

        public final String toString() {
            CustomModuleUCModel customModuleUCModel = this.AudioAttributesCompatParcelizer;
            StringBuilder sb = new StringBuilder("StartCustomModuleIntroductionActivity(customModule=");
            sb.append(customModuleUCModel);
            sb.append(")");
            return sb.toString();
        }
    }
}
