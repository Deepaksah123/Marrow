package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface SchemaSubjectMap {
    public static final RemoteActionCompatParcelizer read = RemoteActionCompatParcelizer.read;

    CourseConfigV2SearchItem RemoteActionCompatParcelizer(isServerContentUpdated isservercontentupdated, getNotesCount getnotescount, getMini getmini);

    public static final class IconCompatParcelizer implements SchemaSubjectMap {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }

        @Override // kotlin.SchemaSubjectMap
        public final CourseConfigV2SearchItem RemoteActionCompatParcelizer(isServerContentUpdated isservercontentupdated, getNotesCount getnotescount, getMini getmini) {
            toMagicModuleMetaRepoModel.write(isservercontentupdated, "");
            toMagicModuleMetaRepoModel.write(getnotescount, "");
            toMagicModuleMetaRepoModel.write(getmini, "");
            return new getStringMap(isservercontentupdated, getnotescount, getmini);
        }
    }

    public static final class RemoteActionCompatParcelizer {
        static final /* synthetic */ RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();
        private static final getBottomSection<SchemaSubjectMap> write = new getBottomSection<>("PackageViewDescriptorFactory");

        private RemoteActionCompatParcelizer() {
        }

        public static getBottomSection<SchemaSubjectMap> RemoteActionCompatParcelizer() {
            return write;
        }
    }
}
