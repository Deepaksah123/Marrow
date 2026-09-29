package kotlin;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class setPsshData<T> implements VideoInfoMiniJsonParser<T> {
    private final SchemaQbankItem<getNotesCount, T> AudioAttributesCompatParcelizer;
    private final Map<getNotesCount, T> RemoteActionCompatParcelizer;
    private final getSchemaCompletion write;

    /* JADX WARN: Multi-variable type inference failed */
    public setPsshData(Map<getNotesCount, ? extends T> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.RemoteActionCompatParcelizer = map;
        getSchemaCompletion getschemacompletion = new getSchemaCompletion("Java nullability annotation states");
        this.write = getschemacompletion;
        SchemaQbankItem<getNotesCount, T> schemaQbankItemIconCompatParcelizer = getschemacompletion.IconCompatParcelizer(new read(this));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(schemaQbankItemIconCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = schemaQbankItemIconCompatParcelizer;
    }

    public final Map<getNotesCount, T> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<getNotesCount, T> {
        private /* synthetic */ setPsshData<T> write;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public T invoke(getNotesCount getnotescount) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getnotescount, "");
            return (T) StepIndex.read(getnotescount, this.write.RemoteActionCompatParcelizer());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(setPsshData<T> setpsshdata) {
            super(1);
            this.write = setpsshdata;
        }
    }

    @Override // kotlin.VideoInfoMiniJsonParser
    public final T read(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return this.AudioAttributesCompatParcelizer.invoke(getnotescount);
    }
}
