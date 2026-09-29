package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getErrCount {
    private final NotesDispatchAddressRequest<Object>[] IconCompatParcelizer;
    private final Object[] RemoteActionCompatParcelizer;
    public final CurrentQuery read;
    private int write;

    public getErrCount(CurrentQuery currentQuery, int i) {
        this.read = currentQuery;
        this.RemoteActionCompatParcelizer = new Object[i];
        this.IconCompatParcelizer = new NotesDispatchAddressRequest[i];
    }

    public final void AudioAttributesCompatParcelizer(NotesDispatchAddressRequest<?> notesDispatchAddressRequest, Object obj) {
        Object[] objArr = this.RemoteActionCompatParcelizer;
        int i = this.write;
        objArr[i] = obj;
        NotesDispatchAddressRequest<Object>[] notesDispatchAddressRequestArr = this.IconCompatParcelizer;
        this.write = i + 1;
        toMagicModuleMetaRepoModel.read(notesDispatchAddressRequest, "");
        notesDispatchAddressRequestArr[i] = notesDispatchAddressRequest;
    }

    public final void IconCompatParcelizer(CurrentQuery currentQuery) {
        int length = this.IconCompatParcelizer.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            NotesDispatchAddressRequest<Object> notesDispatchAddressRequest = this.IconCompatParcelizer[length];
            toMagicModuleMetaRepoModel.write(notesDispatchAddressRequest);
            notesDispatchAddressRequest.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
