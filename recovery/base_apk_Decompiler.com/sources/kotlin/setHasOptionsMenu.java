package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\b\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0004\u001a\u00020\rH&¢\u0006\u0004\b\b\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u000f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/setHasOptionsMenu;", "", "Lo/setExitTransition;", "", "p0", "Lo/requireParentFragment;", "p1", "", "read", "(Lo/setExitTransition;FLo/requireParentFragment;)V", "write", "(Lo/setExitTransition;Lo/requireParentFragment;)V", "Lo/setForegroundMode;", "", "(Lo/setForegroundMode;I)V", "Lo/setPriority;", "RemoteActionCompatParcelizer", "()Lo/setPriority;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setHasOptionsMenu {
    default setPriority RemoteActionCompatParcelizer() {
        return null;
    }

    void read(setExitTransition setexittransition, float f, requireParentFragment requireparentfragment);

    void read(setForegroundMode setforegroundmode, int i);

    void write(setExitTransition setexittransition, requireParentFragment requireparentfragment);
}
