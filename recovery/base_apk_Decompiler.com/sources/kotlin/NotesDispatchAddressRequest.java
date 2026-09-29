package kotlin;

import kotlin.CurrentQuery;

/* JADX INFO: loaded from: classes4.dex */
public interface NotesDispatchAddressRequest<S> extends CurrentQuery.write {
    void RemoteActionCompatParcelizer(S s);

    S read(CurrentQuery currentQuery);

    public static final class AudioAttributesCompatParcelizer {
        public static <S> CurrentQuery RemoteActionCompatParcelizer(NotesDispatchAddressRequest<S> notesDispatchAddressRequest, CurrentQuery currentQuery) {
            return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(notesDispatchAddressRequest, currentQuery);
        }

        public static <S, R> R read(NotesDispatchAddressRequest<S> notesDispatchAddressRequest, R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
            return (R) CurrentQuery.write.DefaultImpls.fold(notesDispatchAddressRequest, r, magicModuleSubmissionRequestBody);
        }
    }
}
