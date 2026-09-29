package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \f2\u00020\u0001:\u0001\fB#\b\u0004\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e"}, d2 = {"Lo/weirdNumberException;", "", "Lkotlin/Function2;", "", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "RemoteActionCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "AudioAttributesCompatParcelizer", "()Lo/MagicModuleSubmissionRequestBody;", "read", "write", "Lo/getInterfaces;", "Lo/findValue;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class weirdNumberException {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final MagicModuleSubmissionRequestBody<Integer, Integer, Integer> read;

    /* JADX WARN: Multi-variable type inference failed */
    private weirdNumberException(MagicModuleSubmissionRequestBody<? super Integer, ? super Integer, Integer> magicModuleSubmissionRequestBody) {
        this.read = magicModuleSubmissionRequestBody;
    }

    public final MagicModuleSubmissionRequestBody<Integer, Integer, Integer> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public /* synthetic */ weirdNumberException(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(magicModuleSubmissionRequestBody);
    }
}
