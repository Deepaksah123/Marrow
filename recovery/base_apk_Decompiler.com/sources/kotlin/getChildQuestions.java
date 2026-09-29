package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getChildQuestions {
    private final RevisionSubjectStatusModel AudioAttributesCompatParcelizer;
    private final int write;

    public getChildQuestions(RevisionSubjectStatusModel revisionSubjectStatusModel, int i) {
        toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
        this.AudioAttributesCompatParcelizer = revisionSubjectStatusModel;
        this.write = i;
    }

    public final RevisionSubjectStatusModel RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int read() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.write;
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.AudioAttributesCompatParcelizer);
        int i3 = this.write;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        String string = sb.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    public final RevisionSubjectStatusModel AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getChildQuestions)) {
            return false;
        }
        getChildQuestions getchildquestions = (getChildQuestions) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getchildquestions.AudioAttributesCompatParcelizer) && this.write == getchildquestions.write;
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.write);
    }
}
