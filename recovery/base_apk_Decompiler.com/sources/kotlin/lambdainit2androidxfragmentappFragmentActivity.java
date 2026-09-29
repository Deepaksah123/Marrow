package kotlin;

import kotlin.Metadata;
import kotlin.registerListener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R,\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R,\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a"}, d2 = {"Lo/lambdainit2androidxfragmentappFragmentActivity;", "Lo/registerListener$AudioAttributesCompatParcelizer;", "Lkotlin/Function1;", "", "", "p0", "Lkotlin/Function2;", "Lo/setLayoutTransition;", "Lo/init;", "p1", "p2", "Lo/FragmentContainerView;", "", "p3", "<init>", "(Lo/getAnswerMap;Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;Lo/getMagicModuleStat;)V", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "IconCompatParcelizer", "()Lo/getAnswerMap;", "write", "Lo/MagicModuleSubmissionRequestBody;", "AudioAttributesCompatParcelizer", "()Lo/MagicModuleSubmissionRequestBody;", "read", "Lo/getMagicModuleStat;", "()Lo/getMagicModuleStat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdainit2androidxfragmentappFragmentActivity implements registerListener.AudioAttributesCompatParcelizer {
    private final getAnswerMap<Integer, Object> AudioAttributesCompatParcelizer;
    private final getAnswerMap<Integer, Object> RemoteActionCompatParcelizer;
    private final getMagicModuleStat<FragmentContainerView, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read;
    private final MagicModuleSubmissionRequestBody<setLayoutTransition, Integer, init> write;

    /* JADX WARN: Multi-variable type inference failed */
    public lambdainit2androidxfragmentappFragmentActivity(getAnswerMap<? super Integer, ? extends Object> getanswermap, MagicModuleSubmissionRequestBody<? super setLayoutTransition, ? super Integer, init> magicModuleSubmissionRequestBody, getAnswerMap<? super Integer, ? extends Object> getanswermap2, getMagicModuleStat<? super FragmentContainerView, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat) {
        this.RemoteActionCompatParcelizer = getanswermap;
        this.write = magicModuleSubmissionRequestBody;
        this.AudioAttributesCompatParcelizer = getanswermap2;
        this.read = getmagicmodulestat;
    }

    @Override // o.registerListener.AudioAttributesCompatParcelizer
    public final getAnswerMap<Integer, Object> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final MagicModuleSubmissionRequestBody<setLayoutTransition, Integer, init> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    @Override // o.registerListener.AudioAttributesCompatParcelizer
    public final getAnswerMap<Integer, Object> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getMagicModuleStat<FragmentContainerView, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read() {
        return this.read;
    }
}
