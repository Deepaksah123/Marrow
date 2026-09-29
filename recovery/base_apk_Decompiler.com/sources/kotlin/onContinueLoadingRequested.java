package kotlin;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onContinueLoadingRequested {
    public static mediaSourceListUpdateRequestedInternal RemoteActionCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        return read(format1, exoPlayerImplExternalSyntheticLambda19, true);
    }

    public static mediaSourceListUpdateRequestedInternal read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, boolean z) throws IOException {
        return new mediaSourceListUpdateRequestedInternal(IconCompatParcelizer(format1, z ? setEncoderPadding.IconCompatParcelizer() : 1.0f, exoPlayerImplExternalSyntheticLambda19, onWakeup.read));
    }

    static notifyTrackSelectionPlayWhenReadyChanged IconCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        return new notifyTrackSelectionPlayWhenReadyChanged(read(format1, exoPlayerImplExternalSyntheticLambda19, setPlaybackInfo.IconCompatParcelizer));
    }

    static releaseInternal read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        return new releaseInternal(ExoPlayerImplInternalPositionUpdateForPlaylistChange.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19, setEncoderPadding.IconCompatParcelizer(), Format.write, true));
    }

    static releaseRenderers MediaBrowserCompatCustomActionResultReceiver(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        return new releaseRenderers(read(format1, exoPlayerImplExternalSyntheticLambda19, keyForInitializationData.AudioAttributesCompatParcelizer));
    }

    static replaceStreamsOrDisableRendererForTransition MediaBrowserCompatItemReceiver(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        return new replaceStreamsOrDisableRendererForTransition(IconCompatParcelizer(format1, setEncoderPadding.IconCompatParcelizer(), exoPlayerImplExternalSyntheticLambda19, r8lambdaX7nl7LhRRR7vAUSsFRuS_B99As.write));
    }

    static resetRendererPosition write(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        return new resetRendererPosition(IconCompatParcelizer(format1, setEncoderPadding.IconCompatParcelizer(), exoPlayerImplExternalSyntheticLambda19, setPauseAtEndOfWindow.read));
    }

    static maybeUpdateReadingRenderers AudioAttributesCompatParcelizer(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) throws IOException {
        return new maybeUpdateReadingRenderers(read(format1, exoPlayerImplExternalSyntheticLambda19, ExoPlayerImplInternalExternalSyntheticLambda1.RemoteActionCompatParcelizer));
    }

    static notifyTrackSelectionDiscontinuity read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, int i) throws IOException {
        return new notifyTrackSelectionDiscontinuity(read(format1, exoPlayerImplExternalSyntheticLambda19, new ExoPlayerImplInternalMoveMediaItemsMessage(i)));
    }

    private static <T> List<setEncoderDelay<T>> read(Format1 format1, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, copyWithCryptoType<T> copywithcryptotype) throws IOException {
        return ExoPlayerImplInternalPositionUpdateForPlaylistChange.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19, 1.0f, copywithcryptotype, false);
    }

    private static <T> List<setEncoderDelay<T>> IconCompatParcelizer(Format1 format1, float f, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19, copyWithCryptoType<T> copywithcryptotype) throws IOException {
        return ExoPlayerImplInternalPositionUpdateForPlaylistChange.AudioAttributesCompatParcelizer(format1, exoPlayerImplExternalSyntheticLambda19, f, copywithcryptotype, false);
    }
}
