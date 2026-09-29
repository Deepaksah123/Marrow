package kotlin;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setLayoutInflater;", "Lo/NullsAsEmptyProvider;", "write", "(Lo/setLayoutInflater;)Lo/NullsAsEmptyProvider;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MethodProperty {
    public static final NullsAsEmptyProvider<?> write(setLayoutInflater<?> setlayoutinflater) {
        Set setHandleMediaPlayPauseIfPendingOnHandler;
        Object objRemoteActionCompatParcelizer = setlayoutinflater.RemoteActionCompatParcelizer();
        if (objRemoteActionCompatParcelizer == null) {
            return null;
        }
        Object[] enumConstants = objRemoteActionCompatParcelizer.getClass().getEnumConstants();
        if (enumConstants == null || (setHandleMediaPlayPauseIfPendingOnHandler = getOrderDetails.handleMediaPlayPauseIfPendingOnHandler(enumConstants)) == null) {
            setHandleMediaPlayPauseIfPendingOnHandler = getKycMessage.read(objRemoteActionCompatParcelizer);
        }
        String write = setlayoutinflater.getWrite();
        if (write == null) {
            write = toMagicModuleMetaDataUcModel.write(objRemoteActionCompatParcelizer.getClass()).AudioAttributesImplApi26Parcelizer();
        }
        return new NullsAsEmptyProvider<>(setlayoutinflater, setHandleMediaPlayPauseIfPendingOnHandler, write);
    }
}
