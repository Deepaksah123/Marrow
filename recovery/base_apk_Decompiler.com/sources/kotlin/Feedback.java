package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface Feedback {
    getHref RemoteActionCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, getHref gethref);

    public static final class read implements Feedback {
        public static final read IconCompatParcelizer = new read();

        private read() {
        }

        @Override // kotlin.Feedback
        public final getHref RemoteActionCompatParcelizer(RevisionSubjectStatusModel revisionSubjectStatusModel, getHref gethref) {
            toMagicModuleMetaRepoModel.write(revisionSubjectStatusModel, "");
            toMagicModuleMetaRepoModel.write(gethref, "");
            return gethref;
        }
    }
}
