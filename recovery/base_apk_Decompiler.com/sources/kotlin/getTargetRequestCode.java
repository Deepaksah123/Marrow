package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\b*\u0004\u0018\u00010\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\t\"\u001a\u0010\u0005\u001a\u00020\u000b*\u0004\u0018\u00010\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f\"\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000e\"\u001a\u0010\u0010\u001a\u00020\u000b*\u0004\u0018\u00010\u00018AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\f"}, d2 = {"Lo/hasHandlers;", "Lo/getText;", "RemoteActionCompatParcelizer", "(Lo/hasHandlers;)Lo/getText;", "Lo/_parser;", "IconCompatParcelizer", "(Lo/_parser;)Lo/getText;", "write", "", "(Lo/getText;)F", "AudioAttributesCompatParcelizer", "", "(Lo/getText;)Z", "Lo/BackStackState;", "(Lo/getText;)Lo/BackStackState;", "read", "AudioAttributesImplApi26Parcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getTargetRequestCode {
    public static final getText RemoteActionCompatParcelizer(hasHandlers hashandlers) {
        Object objQ_ = hashandlers.q_();
        if (objQ_ instanceof getText) {
            return (getText) objQ_;
        }
        return null;
    }

    public static final getText IconCompatParcelizer(_parser _parserVar) {
        Object objQ_ = _parserVar.q_();
        if (objQ_ instanceof getText) {
            return (getText) objQ_;
        }
        return null;
    }

    public static final float write(getText gettext) {
        return gettext != null ? gettext.getIconCompatParcelizer() : BitmapDescriptorFactory.HUE_RED;
    }

    public static final boolean AudioAttributesCompatParcelizer(getText gettext) {
        if (gettext != null) {
            return gettext.getWrite();
        }
        return true;
    }

    public static final BackStackState IconCompatParcelizer(getText gettext) {
        if (gettext != null) {
            return gettext.getAudioAttributesCompatParcelizer();
        }
        return null;
    }

    public static final boolean RemoteActionCompatParcelizer(getText gettext) {
        BackStackState backStackStateIconCompatParcelizer = IconCompatParcelizer(gettext);
        if (backStackStateIconCompatParcelizer != null) {
            return backStackStateIconCompatParcelizer.RemoteActionCompatParcelizer();
        }
        return false;
    }
}
