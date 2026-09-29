package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\r\u000f\u000b\u0011B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010\u0082\u0001\u0004\u0012\u0013\u0014\u0015"}, d2 = {"Lo/setPasskeysSignInRequestOptions;", "", "", "p0", "", "p1", "p2", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "I", "write", "()I", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/setPasskeysSignInRequestOptions$write;", "Lo/setPasskeysSignInRequestOptions$read;", "Lo/setPasskeysSignInRequestOptions$IconCompatParcelizer;", "Lo/setPasskeysSignInRequestOptions$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class setPasskeysSignInRequestOptions {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String write;

    public static final class RemoteActionCompatParcelizer extends setPasskeysSignInRequestOptions {
        private final String read;
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(String str, String str2, int i, String str3, String str4) {
            super(i, str3, str4, null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            this.write = str;
            this.read = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    private setPasskeysSignInRequestOptions(int i, String str, String str2) {
        this.RemoteActionCompatParcelizer = i;
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ setPasskeysSignInRequestOptions(int i, String str, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, str, str2);
    }

    public static final class read extends setPasskeysSignInRequestOptions {
        private final String RemoteActionCompatParcelizer;
        private final String read;
        private final String write;

        /* JADX WARN: Illegal instructions before constructor call */
        public read(String str, String str2, String str3) {
            String str4 = "";
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            super(0, str4, str4, null);
            this.RemoteActionCompatParcelizer = str;
            this.write = str2;
            this.read = str3;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String AudioAttributesImplApi21Parcelizer() {
            return this.write;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    public static final class write extends setPasskeysSignInRequestOptions {
        private final String AudioAttributesCompatParcelizer;
        private final String read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(String str, String str2, int i, String str3, String str4) {
            super(i, str3, str4, null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(str4, "");
            this.AudioAttributesCompatParcelizer = str;
            this.read = str2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.read;
        }
    }

    public static final class IconCompatParcelizer extends setPasskeysSignInRequestOptions {
        private final String write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(String str, int i, String str2, String str3) {
            super(i, str2, str3, null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.write = str;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }
}
