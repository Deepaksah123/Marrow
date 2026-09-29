package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeResolutionContextBasic {
    private static final JDK14UtilRecordAccessor RemoteActionCompatParcelizer = new JDK14UtilRecordAccessor();

    public static final TopUserCompanion write(POJOPropertyBuilderWithMember pOJOPropertyBuilderWithMember) {
        recordComponents recordcomponents;
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilderWithMember, "");
        synchronized (RemoteActionCompatParcelizer) {
            recordcomponents = (recordComponents) pOJOPropertyBuilderWithMember.IconCompatParcelizer("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (recordcomponents == null) {
                recordcomponents = JsonMapper.read();
                pOJOPropertyBuilderWithMember.AudioAttributesCompatParcelizer("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", recordcomponents);
            }
        }
        return recordcomponents;
    }
}
