package kotlin;

import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class onPlaylistUpdateRequested {
    private static final Format1.AudioAttributesCompatParcelizer write = Format1.AudioAttributesCompatParcelizer.write("ef");
    private static final Format1.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = Format1.AudioAttributesCompatParcelizer.write("ty", "v");

    onPlaylistUpdateRequested() {
    }

    static resolveSeekPositionUs IconCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        resolveSeekPositionUs resolveseekpositionus = null;
        while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
            if (format1.AudioAttributesCompatParcelizer(write) == 0) {
                format1.read();
                while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                    resolveSeekPositionUs resolveseekpositionus2 = read(format1, exoPlayerImplExternalSyntheticLambda19);
                    if (resolveseekpositionus2 != null) {
                        resolveseekpositionus = resolveseekpositionus2;
                    }
                }
                format1.write();
            } else {
                format1.MediaDescriptionCompat();
                format1.RatingCompat();
            }
        }
        return resolveseekpositionus;
    }

    private static resolveSeekPositionUs read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        format1.AudioAttributesCompatParcelizer();
        resolveSeekPositionUs resolveseekpositionus = null;
        while (true) {
            boolean z = false;
            while (format1.MediaBrowserCompatCustomActionResultReceiver()) {
                int iAudioAttributesCompatParcelizer = format1.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer);
                if (iAudioAttributesCompatParcelizer != 0) {
                    if (iAudioAttributesCompatParcelizer != 1) {
                        format1.MediaDescriptionCompat();
                        format1.RatingCompat();
                    } else if (z) {
                        resolveseekpositionus = new resolveSeekPositionUs(onContinueLoadingRequested.RemoteActionCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19));
                    } else {
                        format1.RatingCompat();
                    }
                } else if (format1.AudioAttributesImplBaseParcelizer() == 0) {
                    z = true;
                }
            }
            format1.IconCompatParcelizer();
            return resolveseekpositionus;
        }
    }
}
