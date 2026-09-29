package kotlin;

import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0085\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0019\u0010\u000e\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0012\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u0001\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0015\"\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019"}, d2 = {"Lo/switchToNext;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "Lo/isFullscreen;", "IconCompatParcelizer", "(JJJJJJJJJJJJ)Lo/isFullscreen;", "AudioAttributesCompatParcelizer", "(Lo/isFullscreen;J)J", "read", "(JLo/_handleUnrecognizedCharacterEscape;I)J", "", "(Lo/isFullscreen;Lo/isFullscreen;)V", "(Lo/isFullscreen;)J", "Lo/CharacterEscapes;", "Lo/CharacterEscapes;", "()Lo/CharacterEscapes;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setJavaScriptInterface {
    private static final CharacterEscapes<isFullscreen> read = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.CTInAppWebView
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return setJavaScriptInterface.IconCompatParcelizer();
        }
    });

    public static /* synthetic */ isFullscreen IconCompatParcelizer$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        return IconCompatParcelizer((i & 1) != 0 ? RequestPayload.read(4284612846L) : j, (i & 2) != 0 ? RequestPayload.read(4281794739L) : j2, (i & 4) != 0 ? RequestPayload.read(4278442694L) : j3, (i & 8) != 0 ? RequestPayload.read(4278290310L) : j4, (i & 16) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer() : j5, (i & 32) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer() : j6, (i & 64) != 0 ? RequestPayload.read(4289724448L) : j7, (i & 128) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer() : j8, (i & 256) != 0 ? switchToNext.INSTANCE.AudioAttributesCompatParcelizer() : j9, (i & 512) != 0 ? switchToNext.INSTANCE.AudioAttributesCompatParcelizer() : j10, (i & 1024) != 0 ? switchToNext.INSTANCE.AudioAttributesCompatParcelizer() : j11, (i & 2048) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer() : j12);
    }

    public static final isFullscreen IconCompatParcelizer(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new isFullscreen(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static /* synthetic */ isFullscreen AudioAttributesCompatParcelizer$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13 = (i & 1) != 0 ? RequestPayload.read(4290479868L) : j;
        long j14 = (i & 2) != 0 ? RequestPayload.read(4281794739L) : j2;
        long j15 = (i & 4) != 0 ? RequestPayload.read(4278442694L) : j3;
        return AudioAttributesCompatParcelizer(j13, j14, j15, (i & 8) != 0 ? j15 : j4, (i & 16) != 0 ? RequestPayload.read(4279374354L) : j5, (i & 32) != 0 ? RequestPayload.read(4279374354L) : j6, (i & 64) != 0 ? RequestPayload.read(4291782265L) : j7, (i & 128) != 0 ? switchToNext.INSTANCE.AudioAttributesCompatParcelizer() : j8, (i & 256) != 0 ? switchToNext.INSTANCE.AudioAttributesCompatParcelizer() : j9, (i & 512) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer() : j10, (i & 1024) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi26Parcelizer() : j11, (i & 2048) != 0 ? switchToNext.INSTANCE.AudioAttributesCompatParcelizer() : j12);
    }

    public static final isFullscreen AudioAttributesCompatParcelizer(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new isFullscreen(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    public static final long IconCompatParcelizer(isFullscreen isfullscreen) {
        return isfullscreen.MediaDescriptionCompat() ? isfullscreen.AudioAttributesImplApi26Parcelizer() : isfullscreen.MediaBrowserCompatSearchResultReceiver();
    }

    public static final long IconCompatParcelizer(isFullscreen isfullscreen, long j) {
        if (!switchToNext.RemoteActionCompatParcelizer(j, isfullscreen.AudioAttributesImplApi26Parcelizer()) && !switchToNext.RemoteActionCompatParcelizer(j, isfullscreen.AudioAttributesImplApi21Parcelizer())) {
            if (!switchToNext.RemoteActionCompatParcelizer(j, isfullscreen.AudioAttributesImplBaseParcelizer()) && !switchToNext.RemoteActionCompatParcelizer(j, isfullscreen.MediaBrowserCompatMediaItem())) {
                return switchToNext.RemoteActionCompatParcelizer(j, isfullscreen.read()) ? isfullscreen.IconCompatParcelizer() : switchToNext.RemoteActionCompatParcelizer(j, isfullscreen.MediaBrowserCompatSearchResultReceiver()) ? isfullscreen.MediaBrowserCompatItemReceiver() : switchToNext.RemoteActionCompatParcelizer(j, isfullscreen.write()) ? isfullscreen.RemoteActionCompatParcelizer() : switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
            }
            return isfullscreen.MediaBrowserCompatCustomActionResultReceiver();
        }
        return isfullscreen.AudioAttributesCompatParcelizer();
    }

    public static final long read(long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:310)");
        }
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-583917585);
        long jIconCompatParcelizer = IconCompatParcelizer(enabled.INSTANCE.write(_handleunrecognizedcharacterescape, 6), j);
        if (jIconCompatParcelizer == 16) {
            jIconCompatParcelizer = ((switchToNext) _handleunrecognizedcharacterescape.write(R.RemoteActionCompatParcelizer())).getIconCompatParcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jIconCompatParcelizer;
    }

    public static final void read(isFullscreen isfullscreen, isFullscreen isfullscreen2) {
        isfullscreen.AudioAttributesImplBaseParcelizer(isfullscreen2.AudioAttributesImplApi26Parcelizer());
        isfullscreen.AudioAttributesImplApi26Parcelizer(isfullscreen2.AudioAttributesImplApi21Parcelizer());
        isfullscreen.MediaBrowserCompatCustomActionResultReceiver(isfullscreen2.AudioAttributesImplBaseParcelizer());
        isfullscreen.MediaBrowserCompatMediaItem(isfullscreen2.MediaBrowserCompatMediaItem());
        isfullscreen.write(isfullscreen2.read());
        isfullscreen.MediaBrowserCompatSearchResultReceiver(isfullscreen2.MediaBrowserCompatSearchResultReceiver());
        isfullscreen.read(isfullscreen2.write());
        isfullscreen.RemoteActionCompatParcelizer(isfullscreen2.AudioAttributesCompatParcelizer());
        isfullscreen.AudioAttributesImplApi21Parcelizer(isfullscreen2.MediaBrowserCompatCustomActionResultReceiver());
        isfullscreen.IconCompatParcelizer(isfullscreen2.IconCompatParcelizer());
        isfullscreen.MediaBrowserCompatItemReceiver(isfullscreen2.MediaBrowserCompatItemReceiver());
        isfullscreen.AudioAttributesCompatParcelizer(isfullscreen2.RemoteActionCompatParcelizer());
        isfullscreen.IconCompatParcelizer(isfullscreen2.MediaDescriptionCompat());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isFullscreen IconCompatParcelizer() {
        return IconCompatParcelizer$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, UnixStat.PERM_MASK, null);
    }

    public static final CharacterEscapes<isFullscreen> read() {
        return read;
    }
}
