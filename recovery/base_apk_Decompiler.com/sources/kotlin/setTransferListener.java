package kotlin;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class setTransferListener implements getCreatedOnDateMs {
    private /* synthetic */ Object RemoteActionCompatParcelizer;

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws Throwable {
        try {
            Object[] objArr = {this.RemoteActionCompatParcelizer};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-584733297);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 19349, 18 - TextUtils.indexOf((CharSequence) "", '0'), -1553176294, false, "write", new Class[]{(Class) startForeground.IconCompatParcelizer((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 19397 - AndroidCharacter.getMirror('0'), KeyEvent.normalizeMetaState(0) + 19)});
            }
            return ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
