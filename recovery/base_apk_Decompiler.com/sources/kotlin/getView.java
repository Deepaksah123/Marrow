package kotlin;

import kotlin.Metadata;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/getView;", "Lo/getViewLifecycleOwnerLiveData;", "<init>", "()V", "Lo/_handleOddName;", "", "p0", "", "p1", "RemoteActionCompatParcelizer", "(Lo/_handleOddName;FZ)Lo/_handleOddName;", "Lo/_skipWSOrEnd$read;", "IconCompatParcelizer", "(Lo/_handleOddName;Lo/_skipWSOrEnd$read;)Lo/_handleOddName;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getView implements getViewLifecycleOwnerLiveData {
    public static final getView INSTANCE = new getView();

    private getView() {
    }

    @Override // kotlin.getViewLifecycleOwnerLiveData
    public final _handleOddName IconCompatParcelizer(_handleOddName _handleoddname, _skipWSOrEnd.read readVar) {
        return _handleoddname.AudioAttributesCompatParcelizer(new onCreateAnimation(readVar));
    }

    @Override // kotlin.getViewLifecycleOwnerLiveData
    public final _handleOddName RemoteActionCompatParcelizer(_handleOddName _handleoddname, float f, boolean z) {
        if (f <= 0.0d) {
            performCreate.IconCompatParcelizer("invalid weight; must be greater than zero");
        }
        return _handleoddname.AudioAttributesCompatParcelizer(new getArguments(getQues.write(f, Float.MAX_VALUE), z));
    }
}
