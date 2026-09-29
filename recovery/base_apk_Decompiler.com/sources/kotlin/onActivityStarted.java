package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/onActivityPostCreated;", "p0", "", "p1", "Lo/getPauseAtEndOfMediaItems;", "read", "(Lo/onActivityPostCreated;ZLo/_handleUnrecognizedCharacterEscape;I)Lo/getPauseAtEndOfMediaItems;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class onActivityStarted {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000fR\u0014\u0010\r\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/onActivityStarted$RemoteActionCompatParcelizer;", "Lo/getPauseAtEndOfMediaItems;", "", "p0", "", "RemoteActionCompatParcelizer", "(ILo/SampleVideos;)Ljava/lang/Object;", "Lo/deserializerModifiers;", "AudioAttributesCompatParcelizer", "()Lo/deserializerModifiers;", "", "()F", "write", "IconCompatParcelizer", "read", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements getPauseAtEndOfMediaItems {
        final /* synthetic */ onActivityPostCreated read;

        RemoteActionCompatParcelizer(onActivityPostCreated onactivitypostcreated) {
            this.read = onactivitypostcreated;
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final float RemoteActionCompatParcelizer() {
            return getPreloadConfiguration.write(this.read.AudioAttributesImplBaseParcelizer(), this.read.MediaBrowserCompatCustomActionResultReceiver());
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final float IconCompatParcelizer() {
            return getPreloadConfiguration.IconCompatParcelizer(this.read.AudioAttributesImplBaseParcelizer(), this.read.MediaBrowserCompatCustomActionResultReceiver(), this.read.AudioAttributesCompatParcelizer());
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final Object RemoteActionCompatParcelizer(int i, SampleVideos<? super getShowPopup> sampleVideos) {
            Object objWrite$default = onActivityPostCreated.write$default(this.read, i, 0, sampleVideos, 2, null);
            return objWrite$default == getYear.IconCompatParcelizer() ? objWrite$default : getShowPopup.INSTANCE;
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final deserializerModifiers AudioAttributesCompatParcelizer() {
            return new deserializerModifiers(-1, -1);
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final int write() {
            long jMediaBrowserCompatItemReceiver;
            if (this.read.RatingCompat().getHandleMediaPlayPauseIfPendingOnHandler() == superDispatchKeyEvent.write) {
                long j = -1;
                jMediaBrowserCompatItemReceiver = this.read.RatingCompat().MediaBrowserCompatItemReceiver() & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            } else {
                jMediaBrowserCompatItemReceiver = this.read.RatingCompat().MediaBrowserCompatItemReceiver() >> 32;
            }
            return (int) jMediaBrowserCompatItemReceiver;
        }

        @Override // kotlin.getPauseAtEndOfMediaItems
        public final int read() {
            return this.read.RatingCompat().IconCompatParcelizer() + this.read.RatingCompat().getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    public static final getPauseAtEndOfMediaItems read(onActivityPostCreated onactivitypostcreated, boolean z, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1247008005, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:31)");
        }
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(onactivitypostcreated)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !_handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(z)) && (i & 48) != 32) {
            z2 = false;
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((z3 | z2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new RemoteActionCompatParcelizer(onactivitypostcreated);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return remoteActionCompatParcelizer;
    }
}
