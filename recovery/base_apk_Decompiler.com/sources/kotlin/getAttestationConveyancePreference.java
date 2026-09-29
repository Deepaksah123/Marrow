package kotlin;

import android.net.Uri;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lo/getAttestationConveyancePreference;", "", "<init>", "()V", "RemoteActionCompatParcelizer", "write", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "read", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/getAttestationConveyancePreference$read;", "Lo/getAttestationConveyancePreference$RemoteActionCompatParcelizer;", "Lo/getAttestationConveyancePreference$write;", "Lo/getAttestationConveyancePreference$IconCompatParcelizer;", "Lo/getAttestationConveyancePreference$AudioAttributesCompatParcelizer;", "Lo/getAttestationConveyancePreference$AudioAttributesImplBaseParcelizer;", "Lo/getAttestationConveyancePreference$AudioAttributesImplApi21Parcelizer;", "Lo/getAttestationConveyancePreference$AudioAttributesImplApi26Parcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getAttestationConveyancePreference {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAttestationConveyancePreference$RemoteActionCompatParcelizer;", "Lo/getAttestationConveyancePreference;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends getAttestationConveyancePreference {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }

    private getAttestationConveyancePreference() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAttestationConveyancePreference$write;", "Lo/getAttestationConveyancePreference;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends getAttestationConveyancePreference {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public /* synthetic */ getAttestationConveyancePreference(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAttestationConveyancePreference$AudioAttributesImplApi21Parcelizer;", "Lo/getAttestationConveyancePreference;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesImplApi21Parcelizer extends getAttestationConveyancePreference {
        public static final AudioAttributesImplApi21Parcelizer INSTANCE = new AudioAttributesImplApi21Parcelizer();

        private AudioAttributesImplApi21Parcelizer() {
            super(null);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer extends getAttestationConveyancePreference {
        private final setAuthenticatorAttachment IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi26Parcelizer(setAuthenticatorAttachment setauthenticatorattachment) {
            super(null);
            toMagicModuleMetaRepoModel.write(setauthenticatorattachment, "");
            this.IconCompatParcelizer = setauthenticatorattachment;
        }

        public final setAuthenticatorAttachment IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends getAttestationConveyancePreference {
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplBaseParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.read = str;
        }

        public final String IconCompatParcelizer() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getAttestationConveyancePreference$read;", "Lo/getAttestationConveyancePreference;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read extends getAttestationConveyancePreference {
        public static final read INSTANCE = new read();

        private read() {
            super(null);
        }
    }

    public static final class IconCompatParcelizer extends getAttestationConveyancePreference {
        private final String AudioAttributesCompatParcelizer;
        private final Uri IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(Uri uri, boolean z, String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(uri, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = uri;
            this.RemoteActionCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = str;
        }

        public final boolean IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final Uri write() {
            return this.IconCompatParcelizer;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends getAttestationConveyancePreference {
        private final String IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(String str) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            this.IconCompatParcelizer = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }
    }
}
