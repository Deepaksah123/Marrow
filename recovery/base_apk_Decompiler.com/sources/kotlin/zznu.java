package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/marrow2/ui/schema/incomplete/model/SchemaIncompleteUiState;", "", "schemaTitle", "", "schemaId", "lastLessonSubmittedOn", "", "listOfSchemaQBankItems", "", "Lcom/marrow2/ui/schema/incomplete/model/SchemaIncompleteUiState$SchemaQBankItem;", "schemaCompletionStatus", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Z)V", "getSchemaTitle", "()Ljava/lang/String;", "getSchemaId", "getLastLessonSubmittedOn", "()J", "getListOfSchemaQBankItems", "()Ljava/util/List;", "getSchemaCompletionStatus", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "SchemaQBankItem", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zznu {
    private final String AudioAttributesCompatParcelizer;
    private final List<IconCompatParcelizer> IconCompatParcelizer;
    private final long RemoteActionCompatParcelizer;
    private final String read;
    private final boolean write;

    private zznu(String str, String str2, long j, List<IconCompatParcelizer> list, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = list;
        this.write = z;
    }

    public /* synthetic */ zznu(String str, String str2, long j, List list, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 16) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<IconCompatParcelizer> write() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public static final class IconCompatParcelizer {
        private final String AudioAttributesCompatParcelizer;
        private final String IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final boolean read;
        private final int write;

        public IconCompatParcelizer(String str, String str2, boolean z, int i, int i2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = str2;
            this.read = z;
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
        }

        public final String AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final String RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean read() {
            return this.read;
        }

        public final int IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) iconCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && this.read == iconCompatParcelizer.read && this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && this.write == iconCompatParcelizer.write;
        }

        public final int hashCode() {
            return (((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.write);
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            String str2 = this.IconCompatParcelizer;
            boolean z = this.read;
            int i = this.RemoteActionCompatParcelizer;
            int i2 = this.write;
            StringBuilder sb = new StringBuilder("SchemaQBankItem(lessonId=");
            sb.append(str);
            sb.append(", lessonName=");
            sb.append(str2);
            sb.append(", isLessonSolved=");
            sb.append(z);
            sb.append(", mcqCount=");
            sb.append(i);
            sb.append(", status=");
            sb.append(i2);
            sb.append(")");
            return sb.toString();
        }
    }

    public zznu() {
        this(null, null, 0L, null, false, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zznu write(String str, String str2, long j, List<IconCompatParcelizer> list, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        return new zznu(str, str2, j, list, z);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof zznu)) {
            return false;
        }
        zznu zznuVar = (zznu) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) zznuVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) zznuVar.read) && this.RemoteActionCompatParcelizer == zznuVar.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, zznuVar.IconCompatParcelizer) && this.write == zznuVar.write;
    }

    public final int hashCode() {
        return (((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + Long.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        long j = this.RemoteActionCompatParcelizer;
        List<IconCompatParcelizer> list = this.IconCompatParcelizer;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("SchemaIncompleteUiState(schemaTitle=");
        sb.append(str);
        sb.append(", schemaId=");
        sb.append(str2);
        sb.append(", lastLessonSubmittedOn=");
        sb.append(j);
        sb.append(", listOfSchemaQBankItems=");
        sb.append(list);
        sb.append(", schemaCompletionStatus=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
