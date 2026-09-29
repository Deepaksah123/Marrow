package kotlin;

import android.graphics.Paint;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setSeekParametersInternal implements resolvePositionForPlaylistChange {
    private final boolean AudioAttributesCompatParcelizer;
    private final float AudioAttributesImplApi21Parcelizer;
    private final notifyTrackSelectionPlayWhenReadyChanged AudioAttributesImplApi26Parcelizer;
    private final mediaSourceListUpdateRequestedInternal AudioAttributesImplBaseParcelizer;
    private final RemoteActionCompatParcelizer IconCompatParcelizer;
    private final mediaSourceListUpdateRequestedInternal MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final List<mediaSourceListUpdateRequestedInternal> RemoteActionCompatParcelizer;
    private final maybeUpdateReadingRenderers read;
    private final IconCompatParcelizer write;

    public enum IconCompatParcelizer {
        BUTT,
        ROUND,
        UNKNOWN;

        public final Paint.Cap RemoteActionCompatParcelizer() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return Paint.Cap.BUTT;
            }
            if (iOrdinal == 1) {
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.SQUARE;
        }
    }

    public enum RemoteActionCompatParcelizer {
        MITER,
        ROUND,
        BEVEL;

        public final Paint.Join AudioAttributesCompatParcelizer() {
            int iOrdinal = ordinal();
            if (iOrdinal == 0) {
                return Paint.Join.MITER;
            }
            if (iOrdinal == 1) {
                return Paint.Join.ROUND;
            }
            if (iOrdinal != 2) {
                return null;
            }
            return Paint.Join.BEVEL;
        }
    }

    public setSeekParametersInternal(String str, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, List<mediaSourceListUpdateRequestedInternal> list, maybeUpdateReadingRenderers maybeupdatereadingrenderers, notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2, IconCompatParcelizer iconCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer, float f, boolean z) {
        this.MediaBrowserCompatItemReceiver = str;
        this.MediaBrowserCompatCustomActionResultReceiver = mediasourcelistupdaterequestedinternal;
        this.RemoteActionCompatParcelizer = list;
        this.read = maybeupdatereadingrenderers;
        this.AudioAttributesImplApi26Parcelizer = notifytrackselectionplaywhenreadychanged;
        this.AudioAttributesImplBaseParcelizer = mediasourcelistupdaterequestedinternal2;
        this.write = iconCompatParcelizer;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = f;
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // kotlin.resolvePositionForPlaylistChange
    public final onVideoFrameProcessingOffset RemoteActionCompatParcelizer(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        return new ExoPlayerImplComponentListenerExternalSyntheticLambda7(exoPlayerImplExternalSyntheticLambda6, setshufflemodeenabledinternal, this);
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final maybeUpdateReadingRenderers read() {
        return this.read;
    }

    public final notifyTrackSelectionPlayWhenReadyChanged MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final List<mediaSourceListUpdateRequestedInternal> RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final mediaSourceListUpdateRequestedInternal IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final IconCompatParcelizer write() {
        return this.write;
    }

    public final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }
}
