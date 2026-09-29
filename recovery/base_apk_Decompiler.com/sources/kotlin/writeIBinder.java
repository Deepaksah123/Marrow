package kotlin;

import com.marrow2.data.user.remote.model.onboarding.UserBasicDetails;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface writeIBinder {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/writeIBinder$IconCompatParcelizer;", "Lo/writeIBinder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer implements writeIBinder {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }
    }

    public static final class read implements writeIBinder {
        private final int read;

        public read(int i) {
            this.read = i;
        }

        public final int write() {
            return this.read;
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver implements writeIBinder {
        private final List<UserBasicDetails> AudioAttributesCompatParcelizer;

        public MediaBrowserCompatCustomActionResultReceiver(List<UserBasicDetails> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.AudioAttributesCompatParcelizer = list;
        }

        public final List<UserBasicDetails> RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer implements writeIBinder {
        private final List<UserBasicDetails> AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String write;

        public AudioAttributesImplApi21Parcelizer(String str, String str2, String str3, List<UserBasicDetails> list) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.write = str;
            this.RemoteActionCompatParcelizer = str2;
            this.IconCompatParcelizer = str3;
            this.AudioAttributesCompatParcelizer = list;
        }

        public final String read() {
            return this.write;
        }

        public final String write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final List<UserBasicDetails> IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/writeIBinder$RemoteActionCompatParcelizer;", "Lo/writeIBinder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements writeIBinder {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/writeIBinder$AudioAttributesCompatParcelizer;", "Lo/writeIBinder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements writeIBinder {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/writeIBinder$write;", "Lo/writeIBinder;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write implements writeIBinder {
        public static final write INSTANCE = new write();

        private write() {
        }
    }
}
