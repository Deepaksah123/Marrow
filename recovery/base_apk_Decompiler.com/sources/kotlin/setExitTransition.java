package kotlin;

import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/setExitTransition;", "", "", "p0", "Lkotlin/Function1;", "Lo/setInitialSavedState;", "", "p1", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "read", "(ILo/getAnswerMap;)Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setExitTransition {
    getCurrentTrackSelections.RemoteActionCompatParcelizer read(int p0, getAnswerMap<? super setInitialSavedState, getShowPopup> p1);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ getCurrentTrackSelections.RemoteActionCompatParcelizer read$default(setExitTransition setexittransition, int i, getAnswerMap getanswermap, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: schedulePrefetch");
        }
        if ((i2 & 2) != 0) {
            getanswermap = null;
        }
        return setexittransition.read(i, getanswermap);
    }
}
