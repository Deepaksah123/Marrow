package kotlin;

import kotlin.Metadata;
import kotlin.registerListener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001BM\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R,\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0012\u0010\u0015"}, d2 = {"Lo/performPause;", "Lo/registerListener$AudioAttributesCompatParcelizer;", "Lkotlin/Function1;", "", "", "p0", "p1", "Lkotlin/Function2;", "Lo/performDestroy;", "", "p2", "<init>", "(Lo/getAnswerMap;Lo/getAnswerMap;Lo/getMagicModuleStat;)V", "write", "Lo/getAnswerMap;", "IconCompatParcelizer", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer", "Lo/getMagicModuleStat;", "()Lo/getMagicModuleStat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class performPause implements registerListener.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getMagicModuleStat<performDestroy, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<Integer, Object> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getAnswerMap<Integer, Object> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public performPause(getAnswerMap<? super Integer, ? extends Object> getanswermap, getAnswerMap<? super Integer, ? extends Object> getanswermap2, getMagicModuleStat<? super performDestroy, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat) {
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.IconCompatParcelizer = getanswermap2;
        this.RemoteActionCompatParcelizer = getmagicmodulestat;
    }

    @Override // o.registerListener.AudioAttributesCompatParcelizer
    public final getAnswerMap<Integer, Object> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.registerListener.AudioAttributesCompatParcelizer
    public final getAnswerMap<Integer, Object> RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final getMagicModuleStat<performDestroy, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> read() {
        return this.RemoteActionCompatParcelizer;
    }
}
