package kotlin;

import kotlin.CurrentQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class getBufferMultiplier {
    public static final accessgetVideoConfigurationC2cp read = new accessgetVideoConfigurationC2cp("NO_THREAD_ELEMENTS");
    private static final MagicModuleSubmissionRequestBody<Object, CurrentQuery.write, Object> write = new MagicModuleSubmissionRequestBody() { // from class: o.getVideoPlaybackSettings
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return getBufferMultiplier.IconCompatParcelizer(obj, (CurrentQuery.write) obj2);
        }
    };
    private static final MagicModuleSubmissionRequestBody<NotesDispatchAddressRequest<?>, CurrentQuery.write, NotesDispatchAddressRequest<?>> AudioAttributesCompatParcelizer = new MagicModuleSubmissionRequestBody() { // from class: o.VideoPlaybackConfigurationCompanion
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return getBufferMultiplier.read((NotesDispatchAddressRequest<?>) obj, (CurrentQuery.write) obj2);
        }
    };
    private static final MagicModuleSubmissionRequestBody<getErrCount, CurrentQuery.write, getErrCount> IconCompatParcelizer = new MagicModuleSubmissionRequestBody() { // from class: o.getEnableDecoderFallback
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return getBufferMultiplier.read((getErrCount) obj, (CurrentQuery.write) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(Object obj, CurrentQuery.write writeVar) {
        if (!(writeVar instanceof NotesDispatchAddressRequest)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? writeVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NotesDispatchAddressRequest<?> read(NotesDispatchAddressRequest<?> notesDispatchAddressRequest, CurrentQuery.write writeVar) {
        if (notesDispatchAddressRequest != null) {
            return notesDispatchAddressRequest;
        }
        if (writeVar instanceof NotesDispatchAddressRequest) {
            return (NotesDispatchAddressRequest) writeVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getErrCount read(getErrCount geterrcount, CurrentQuery.write writeVar) {
        if (writeVar instanceof NotesDispatchAddressRequest) {
            NotesDispatchAddressRequest<?> notesDispatchAddressRequest = (NotesDispatchAddressRequest) writeVar;
            geterrcount.AudioAttributesCompatParcelizer(notesDispatchAddressRequest, notesDispatchAddressRequest.read(geterrcount.read));
        }
        return geterrcount;
    }

    public static final Object RemoteActionCompatParcelizer(CurrentQuery currentQuery) {
        Object objFold = currentQuery.fold(0, write);
        toMagicModuleMetaRepoModel.write(objFold);
        return objFold;
    }

    public static final Object RemoteActionCompatParcelizer(CurrentQuery currentQuery, Object obj) {
        if (obj == null) {
            obj = RemoteActionCompatParcelizer(currentQuery);
        }
        if (obj == 0) {
            return read;
        }
        if (obj instanceof Integer) {
            return currentQuery.fold(new getErrCount(currentQuery, ((Number) obj).intValue()), IconCompatParcelizer);
        }
        toMagicModuleMetaRepoModel.read(obj, "");
        return ((NotesDispatchAddressRequest) obj).read(currentQuery);
    }

    public static final void AudioAttributesCompatParcelizer(CurrentQuery currentQuery, Object obj) {
        if (obj == read) {
            return;
        }
        if (obj instanceof getErrCount) {
            ((getErrCount) obj).IconCompatParcelizer(currentQuery);
            return;
        }
        Object objFold = currentQuery.fold(null, AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.read(objFold, "");
        ((NotesDispatchAddressRequest) objFold).RemoteActionCompatParcelizer(obj);
    }
}
