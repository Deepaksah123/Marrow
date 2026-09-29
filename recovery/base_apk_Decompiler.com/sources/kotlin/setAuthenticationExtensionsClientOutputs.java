package kotlin;

import android.net.Uri;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lo/setAuthenticationExtensionsClientOutputs;", "", "<init>", "()V", "read", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/setAuthenticationExtensionsClientOutputs$RemoteActionCompatParcelizer;", "Lo/setAuthenticationExtensionsClientOutputs$IconCompatParcelizer;", "Lo/setAuthenticationExtensionsClientOutputs$write;", "Lo/setAuthenticationExtensionsClientOutputs$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setAuthenticationExtensionsClientOutputs {

    public static final class read extends setAuthenticationExtensionsClientOutputs {
        private final setAuthenticatorAttachment IconCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(setAuthenticatorAttachment setauthenticatorattachment) {
            super(null);
            toMagicModuleMetaRepoModel.write(setauthenticatorattachment, "");
            this.IconCompatParcelizer = setauthenticatorattachment;
        }

        public final setAuthenticatorAttachment write() {
            return this.IconCompatParcelizer;
        }
    }

    private setAuthenticationExtensionsClientOutputs() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setAuthenticationExtensionsClientOutputs$write;", "Lo/setAuthenticationExtensionsClientOutputs;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write extends setAuthenticationExtensionsClientOutputs {
        public static final write INSTANCE = new write();

        private write() {
            super(null);
        }
    }

    public /* synthetic */ setAuthenticationExtensionsClientOutputs(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class IconCompatParcelizer extends setAuthenticationExtensionsClientOutputs {
        private final Uri read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(Uri uri) {
            super(null);
            toMagicModuleMetaRepoModel.write(uri, "");
            this.read = uri;
        }

        public final Uri write() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setAuthenticationExtensionsClientOutputs$RemoteActionCompatParcelizer;", "Lo/setAuthenticationExtensionsClientOutputs;", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer extends setAuthenticationExtensionsClientOutputs {
        public static final RemoteActionCompatParcelizer INSTANCE = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super(null);
        }
    }
}
