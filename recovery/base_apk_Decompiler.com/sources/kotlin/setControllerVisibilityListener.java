package kotlin;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setControllerHideOnTouch;", "write", "Lo/setControllerHideOnTouch;", "RemoteActionCompatParcelizer", "()Lo/setControllerHideOnTouch;", "IconCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setControllerVisibilityListener {
    private static final setControllerHideOnTouch write = new read();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setControllerVisibilityListener$read;", "Lo/setControllerHideOnTouch;", "Lo/constructType;", "p0", "Lo/setControllerAutoShow;", "IconCompatParcelizer", "(Landroid/view/KeyEvent;)Lo/setControllerAutoShow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements setControllerHideOnTouch {
        read() {
        }

        @Override // kotlin.setControllerHideOnTouch
        public final setControllerAutoShow IconCompatParcelizer(KeyEvent p0) {
            setControllerAutoShow setcontrollerautoshow = null;
            if (_throwSubtypeClassNotAllowed.AudioAttributesImplBaseParcelizer(p0) && _throwSubtypeClassNotAllowed.write(p0)) {
                long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
                if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatMediaItem())) {
                    setcontrollerautoshow = setControllerAutoShow.onSetRating;
                } else if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaMetadataCompat())) {
                    setcontrollerautoshow = setControllerAutoShow.onSetShuffleMode;
                } else if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.RatingCompat())) {
                    setcontrollerautoshow = setControllerAutoShow.onSeekTo;
                } else if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
                    setcontrollerautoshow = setControllerAutoShow.onRewind;
                }
            } else if (_throwSubtypeClassNotAllowed.write(p0)) {
                long jIconCompatParcelizer2 = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaBrowserCompatMediaItem())) {
                    setcontrollerautoshow = setControllerAutoShow.onAddQueueItem;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaMetadataCompat())) {
                    setcontrollerautoshow = setControllerAutoShow.handleMediaPlayPauseIfPendingOnHandler;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.RatingCompat())) {
                    setcontrollerautoshow = setControllerAutoShow.MediaMetadataCompat;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
                    setcontrollerautoshow = setControllerAutoShow.MediaDescriptionCompat;
                }
            }
            return setcontrollerautoshow == null ? C0199setControllerOnFullScreenModeChangedListener.read().IconCompatParcelizer(p0) : setcontrollerautoshow;
        }
    }

    public static final setControllerHideOnTouch RemoteActionCompatParcelizer() {
        return write;
    }
}
