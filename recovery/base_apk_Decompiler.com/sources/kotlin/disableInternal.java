package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018"}, d2 = {"Lo/disableInternal;", "Lo/registerListener;", "Lo/updateMediaItem;", "Lkotlin/Function2;", "Lo/setOutputBuffer;", "", "", "p0", "Lkotlin/Function1;", "", "p1", "p2", "<init>", "(Lo/getMagicModuleStat;Lo/getAnswerMap;I)V", "write", "Lo/getMagicModuleStat;", "RemoteActionCompatParcelizer", "read", "Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "I", "IconCompatParcelizer", "Lo/onForceLoad;", "Lo/onForceLoad;", "()Lo/onForceLoad;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class disableInternal extends registerListener<updateMediaItem> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final onForceLoad<updateMediaItem> read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<Integer, Object> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getMagicModuleStat<setOutputBuffer, Integer, _handleUnrecognizedCharacterEscape, Integer, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public disableInternal(getMagicModuleStat<? super setOutputBuffer, ? super Integer, ? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> getmagicmodulestat, getAnswerMap<? super Integer, ? extends Object> getanswermap, int i) {
        this.RemoteActionCompatParcelizer = getmagicmodulestat;
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.IconCompatParcelizer = i;
        removeAnalyticsListener removeanalyticslistener = new removeAnalyticsListener();
        removeanalyticslistener.IconCompatParcelizer(i, new updateMediaItem(getanswermap, getmagicmodulestat));
        this.read = removeanalyticslistener;
    }

    @Override // kotlin.registerListener
    public final onForceLoad<updateMediaItem> AudioAttributesCompatParcelizer() {
        return this.read;
    }
}
