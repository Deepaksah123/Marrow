package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJC\u0010\u000f\u001a\u00020\n*\u00020\n2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012"}, d2 = {"Lo/performDestroyView;", "Lo/performDestroy;", "<init>", "()V", "", "p0", "p1", "", "IconCompatParcelizer", "(II)V", "Lo/_handleOddName;", "Lo/SwitchCompat;", "", "Lo/hasReferringProperties;", "p2", "read", "(Lo/_handleOddName;Lo/SwitchCompat;Lo/SwitchCompat;Lo/SwitchCompat;)Lo/_handleOddName;", "Lo/hasMoreBytes;", "Lo/hasMoreBytes;", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class performDestroyView implements performDestroy {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private hasMoreBytes write = _appendByte.RemoteActionCompatParcelizer(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private hasMoreBytes read = _appendByte.RemoteActionCompatParcelizer(Integer.MAX_VALUE);

    public final void IconCompatParcelizer(int p0, int p1) {
        this.write.read(p0);
        this.read.read(p1);
    }

    @Override // kotlin.performDestroy
    public final _handleOddName read(_handleOddName _handleoddname, SwitchCompat<Float> switchCompat, SwitchCompat<hasReferringProperties> switchCompat2, SwitchCompat<Float> switchCompat3) {
        return (switchCompat == null && switchCompat2 == null && switchCompat3 == null) ? _handleoddname : _handleoddname.AudioAttributesCompatParcelizer(new commitContentChanged(switchCompat, switchCompat2, switchCompat3));
    }
}
