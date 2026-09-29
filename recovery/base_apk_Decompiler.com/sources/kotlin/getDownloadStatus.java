package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getDownloadStatus {
    private static final accessgetVideoConfigurationC2cp AudioAttributesCompatParcelizer;
    private static final accessgetVideoConfigurationC2cp RemoteActionCompatParcelizer;
    private static final accessgetVideoConfigurationC2cp read;
    private static final accessgetVideoConfigurationC2cp write;

    static {
        read readVar = read.read;
        read = new accessgetVideoConfigurationC2cp("STATE_REG");
        AudioAttributesCompatParcelizer = new accessgetVideoConfigurationC2cp("STATE_COMPLETED");
        RemoteActionCompatParcelizer = new accessgetVideoConfigurationC2cp("STATE_CANCELLED");
        write = new accessgetVideoConfigurationC2cp("NO_RESULT");
        new accessgetVideoConfigurationC2cp("PARAM_CLAUSE_0");
    }

    static final class read implements getModuleData {
        public static final read read = new read();

        @Override // kotlin.getModuleData
        public final /* synthetic */ Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
            return null;
        }

        read() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getLastUpdatedMs read(int i) {
        if (i == 0) {
            return getLastUpdatedMs.IconCompatParcelizer;
        }
        if (i == 1) {
            return getLastUpdatedMs.read;
        }
        if (i == 2) {
            return getLastUpdatedMs.write;
        }
        if (i == 3) {
            return getLastUpdatedMs.RemoteActionCompatParcelizer;
        }
        throw new IllegalStateException("Unexpected internal result: ".concat(String.valueOf(i)).toString());
    }
}
