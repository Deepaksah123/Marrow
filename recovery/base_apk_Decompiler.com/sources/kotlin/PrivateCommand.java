package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/SlowMotionData;", "RemoteActionCompatParcelizer", "()Lo/SlowMotionData;", "Lo/_handleOddName;", "p0", "write", "(Lo/_handleOddName;Lo/SlowMotionData;)Lo/_handleOddName;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "o/UrlLinkFrame")
final /* synthetic */ class PrivateCommand {
    public static final SlowMotionData RemoteActionCompatParcelizer() {
        return new MotionPhotoMetadata();
    }

    public static final _handleOddName write(_handleOddName _handleoddname, SlowMotionData slowMotionData) {
        return _handleoddname.AudioAttributesCompatParcelizer(new SlowMotionDataSegment(slowMotionData));
    }
}
