package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class component11 extends AbstractC0202setMcqId {
    private final String AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public component11(String str, String str2, String str3, String str4, String str5) {
        super(null);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
        this.read = str4;
        this.AudioAttributesCompatParcelizer = str5;
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String read() {
        return this.read;
    }

    public final String write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof component11)) {
            return false;
        }
        component11 component11Var = (component11) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) component11Var.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) component11Var.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) component11Var.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) component11Var.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) component11Var.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((this.IconCompatParcelizer.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.write;
        String str4 = this.read;
        String str5 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("SampleVideoLesson(authorImageUrl=");
        sb.append(str);
        sb.append(", lessonId=");
        sb.append(str2);
        sb.append(", subjectName=");
        sb.append(str3);
        sb.append(", lessonTitle=");
        sb.append(str4);
        sb.append(", authorName=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
