package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/getViewLifecycleOwnerLiveData;", "", "Lo/_handleOddName;", "", "p0", "", "p1", "RemoteActionCompatParcelizer", "(Lo/_handleOddName;FZ)Lo/_handleOddName;", "Lo/_skipWSOrEnd$read;", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/_skipWSOrEnd$read;)Lo/_handleOddName;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getViewLifecycleOwnerLiveData {
    _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, _skipWSOrEnd.read readVar);

    _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, float f, boolean z);

    static /* synthetic */ _handleOddName RemoteActionCompatParcelizer$default(getViewLifecycleOwnerLiveData getviewlifecycleownerlivedata, _handleOddName _handleoddname, float f, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return getviewlifecycleownerlivedata.RemoteActionCompatParcelizer(_handleoddname, f, z);
    }
}
