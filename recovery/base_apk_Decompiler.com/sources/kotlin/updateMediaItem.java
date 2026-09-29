package kotlin;

import kotlin.Metadata;
import kotlin.registerListener;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/updateMediaItem;", "Lo/registerListener$AudioAttributesCompatParcelizer;", "Lkotlin/Function1;", "", "", "p0", "Lkotlin/Function2;", "Lo/setOutputBuffer;", "", "p1", "<init>", "(Lo/getAnswerMap;Lo/getMagicModuleStat;)V", "RemoteActionCompatParcelizer", "Lo/getAnswerMap;", "IconCompatParcelizer", "()Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "read", "Lo/getMagicModuleStat;", "write", "()Lo/getMagicModuleStat;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updateMediaItem implements registerListener.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<Integer, Object> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getMagicModuleStat<setOutputBuffer, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> IconCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public updateMediaItem(getAnswerMap<? super Integer, ? extends Object> getanswermap, getMagicModuleStat<? super setOutputBuffer, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat) {
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.IconCompatParcelizer = getmagicmodulestat;
    }

    @Override // o.registerListener.AudioAttributesCompatParcelizer
    public final getAnswerMap<Integer, Object> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getMagicModuleStat<setOutputBuffer, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> write() {
        return this.IconCompatParcelizer;
    }
}
