package kotlin;

import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lo/removeWorkAccount;", "", "<init>", "()V", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "write", "AudioAttributesImplApi26Parcelizer", "AudioAttributesCompatParcelizer", "Lo/removeWorkAccount$write;", "Lo/removeWorkAccount$AudioAttributesCompatParcelizer;", "Lo/removeWorkAccount$read;", "Lo/removeWorkAccount$RemoteActionCompatParcelizer;", "Lo/removeWorkAccount$IconCompatParcelizer;", "Lo/removeWorkAccount$MediaBrowserCompatCustomActionResultReceiver;", "Lo/removeWorkAccount$AudioAttributesImplApi21Parcelizer;", "Lo/removeWorkAccount$AudioAttributesImplApi26Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class removeWorkAccount {

    public static final class MediaBrowserCompatCustomActionResultReceiver extends removeWorkAccount {
        private final WorkAccountClient read;

        public final WorkAccountClient AudioAttributesCompatParcelizer() {
            return this.read;
        }
    }

    private removeWorkAccount() {
    }

    public /* synthetic */ removeWorkAccount(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/removeWorkAccount$AudioAttributesImplApi21Parcelizer;", "Lo/removeWorkAccount;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends removeWorkAccount {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/removeWorkAccount$RemoteActionCompatParcelizer;", "Lo/removeWorkAccount;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends removeWorkAccount {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    public static final class IconCompatParcelizer extends removeWorkAccount {
        private final Integer read;

        public IconCompatParcelizer(Integer num) {
            super(null);
            this.read = num;
        }

        public final Integer read() {
            return this.read;
        }
    }

    public static final class read extends removeWorkAccount {
        private final String AudioAttributesCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class write extends removeWorkAccount {
        private final String AudioAttributesCompatParcelizer;
        private final List<AccountTransferClient> read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public write(String str, List<? extends AccountTransferClient> list) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.AudioAttributesCompatParcelizer = str;
            this.read = list;
        }

        public final List<AccountTransferClient> IconCompatParcelizer() {
            return this.read;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends removeWorkAccount {
        private final CustomModuleUCModel read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(CustomModuleUCModel customModuleUCModel) {
            super(null);
            toMagicModuleMetaRepoModel.write(customModuleUCModel, "");
            this.read = customModuleUCModel;
        }

        public final CustomModuleUCModel IconCompatParcelizer() {
            return this.read;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, ((AudioAttributesImplApi26Parcelizer) obj).read);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final String toString() {
            CustomModuleUCModel customModuleUCModel = this.read;
            StringBuilder sb = new StringBuilder("StartCustomModuleIntroductionActivity(customModule=");
            sb.append(customModuleUCModel);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/removeWorkAccount$AudioAttributesCompatParcelizer;", "Lo/removeWorkAccount;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer extends removeWorkAccount {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
            super(null);
        }
    }
}
