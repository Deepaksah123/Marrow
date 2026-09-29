package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lo/getPublicKeyCredentialCreationOptions;", "", "<init>", "()V", "read", "Lo/getPublicKeyCredentialCreationOptions$read;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class getPublicKeyCredentialCreationOptions {

    public static final class read extends getPublicKeyCredentialCreationOptions {
        private String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private String RemoteActionCompatParcelizer;
        private String read;
        private int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(String str, String str2, String str3, int i, int i2) {
            super(null);
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
            this.read = str3;
            this.write = i;
            this.IconCompatParcelizer = i2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final String read() {
            return this.read;
        }

        public final int write() {
            return this.write;
        }

        public final int IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) readVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) readVar.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) readVar.read) && this.write == readVar.write && this.IconCompatParcelizer == readVar.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.RemoteActionCompatParcelizer;
            String str3 = this.read;
            int i = this.write;
            int i2 = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("QBankSubjectInfoModel(id=");
            sb.append(str);
            sb.append(", title=");
            sb.append(str2);
            sb.append(", imageUrl=");
            sb.append(str3);
            sb.append(", totalLessons=");
            sb.append(i);
            sb.append(", completedCount=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    private getPublicKeyCredentialCreationOptions() {
    }

    public /* synthetic */ getPublicKeyCredentialCreationOptions(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }
}
