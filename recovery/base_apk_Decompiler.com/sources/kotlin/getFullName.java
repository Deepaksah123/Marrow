package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR+\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028W@WX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000e\"\u0004\b\t\u0010\u000f"}, d2 = {"Lo/getFullName;", "Lo/getMember;", "Lo/BeanPropertyStd;", "p0", "Lkotlin/Function1;", "", "p1", "<init>", "(ILo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;", "read", "RemoteActionCompatParcelizer", "Lo/InputAccessor;", "()I", "(I)V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getFullName implements getMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<BeanPropertyStd, Boolean> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor write;

    /* JADX WARN: Multi-variable type inference failed */
    private getFullName(int i, getAnswerMap<? super BeanPropertyStd, Boolean> getanswermap) {
        this.read = getanswermap;
        this.write = available.RemoteActionCompatParcelizer$default(BeanPropertyStd.read(i), null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getMember
    public final int AudioAttributesCompatParcelizer() {
        return ((BeanPropertyStd) this.write.getRemoteActionCompatParcelizer()).getAudioAttributesCompatParcelizer();
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.write.write(BeanPropertyStd.read(i));
    }

    public /* synthetic */ getFullName(int i, getAnswerMap getanswermap, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, getanswermap);
    }
}
