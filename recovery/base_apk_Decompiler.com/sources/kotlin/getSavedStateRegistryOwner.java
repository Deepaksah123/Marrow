package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/_handleOddName;", "", "p0", "Lo/hashCode;", "p1", "AudioAttributesCompatParcelizer", "(Lo/_handleOddName;ZLo/hashCode;)Lo/_handleOddName;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSavedStateRegistryOwner {
    public static /* synthetic */ _handleOddName AudioAttributesCompatParcelizer$default(_handleOddName _handleoddname, boolean z, hashCode hashcode, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            hashcode = null;
        }
        return AudioAttributesCompatParcelizer(_handleoddname, z, hashcode);
    }

    public static final _handleOddName AudioAttributesCompatParcelizer(_handleOddName _handleoddname, boolean z, hashCode hashcode) {
        _handleOddName.Companion getonmodifierchangedui;
        if (z) {
            getonmodifierchangedui = new getOnModifierChangedui(hashcode);
        } else {
            getonmodifierchangedui = _handleOddName.INSTANCE;
        }
        return _handleoddname.AudioAttributesCompatParcelizer(getonmodifierchangedui);
    }
}
