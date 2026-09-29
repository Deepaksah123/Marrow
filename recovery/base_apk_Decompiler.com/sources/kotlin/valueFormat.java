package kotlin;

import com.google.android.exoplayer2.C;
import java.util.List;
import kotlin.PolymorphicTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class valueFormat implements isUnsafeBaseType {
    public final PolymorphicTypeValidator.IconCompatParcelizer IconCompatParcelizer = new PolymorphicTypeValidator.IconCompatParcelizer();

    public abstract void read(int i, long j, boolean z);

    @Override // kotlin.isUnsafeBaseType
    public final void read(JsonSerializableSchema jsonSerializableSchema) {
        read(initExtraTracks.read(jsonSerializableSchema));
    }

    private void read(List<JsonSerializableSchema> list) {
        RemoteActionCompatParcelizer(list);
    }

    public final void replaceMediaItem(int i, JsonSerializableSchema jsonSerializableSchema) {
        replaceMediaItems(i, i + 1, initExtraTracks.read(jsonSerializableSchema));
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean write(int i) {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read(i);
    }

    @Override // kotlin.isUnsafeBaseType
    public final void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer(true);
    }

    @Override // kotlin.isUnsafeBaseType
    public final void AudioAttributesImplApi21Parcelizer() {
        AudioAttributesCompatParcelizer(false);
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean AudioAttributesImplBaseParcelizer() {
        return onRewind() == 3 && onPrepareFromUri() && onSeekTo() == 0;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void MediaMetadataCompat() {
        read(onMediaButtonEvent());
    }

    @Override // kotlin.isUnsafeBaseType
    public final void MediaBrowserCompatSearchResultReceiver() {
        write(-onSetCaptioningEnabled(), 11);
    }

    @Override // kotlin.isUnsafeBaseType
    public final void MediaDescriptionCompat() {
        write(onSetRepeatMode(), 12);
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean read() {
        return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() != -1;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void MediaBrowserCompatMediaItem() {
        if (onPrepare().RemoteActionCompatParcelizer() || setSessionImpl()) {
            MediaSessionCompatResultReceiverWrapper();
            return;
        }
        boolean z = read();
        if (MediaBrowserCompatCustomActionResultReceiver() && !MediaBrowserCompatItemReceiver()) {
            if (z) {
                r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
                return;
            } else {
                MediaSessionCompatResultReceiverWrapper();
                return;
            }
        }
        if (z && onPlayFromUri() <= onPrepareFromMediaId()) {
            r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        } else {
            RemoteActionCompatParcelizer(0L);
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean write() {
        return ResultReceiver() != -1;
    }

    @Override // kotlin.isUnsafeBaseType
    public final void RatingCompat() {
        if (onPrepare().RemoteActionCompatParcelizer() || setSessionImpl()) {
            MediaSessionCompatResultReceiverWrapper();
            return;
        }
        if (write()) {
            MediaSessionCompatQueueItem();
        } else if (MediaBrowserCompatCustomActionResultReceiver() && AudioAttributesCompatParcelizer()) {
            read(onMediaButtonEvent());
        } else {
            MediaSessionCompatResultReceiverWrapper();
        }
    }

    @Override // kotlin.isUnsafeBaseType
    public final void AudioAttributesCompatParcelizer(long j) {
        RemoteActionCompatParcelizer(j);
    }

    @Override // kotlin.isUnsafeBaseType
    public final void IconCompatParcelizer(int i, long j) {
        read(i, j, false);
    }

    private int ResultReceiver() {
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = onPrepare();
        if (polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer()) {
            return -1;
        }
        return polymorphicTypeValidatorOnPrepare.IconCompatParcelizer(onMediaButtonEvent(), MediaSessionCompatToken(), onSetPlaybackSpeed());
    }

    private int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = onPrepare();
        if (polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer()) {
            return -1;
        }
        return polymorphicTypeValidatorOnPrepare.AudioAttributesCompatParcelizer(onMediaButtonEvent(), MediaSessionCompatToken(), onSetPlaybackSpeed());
    }

    @Override // kotlin.isUnsafeBaseType
    public final int IconCompatParcelizer() {
        long jHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        long jOnPlayFromSearch = onPlayFromSearch();
        if (jHandleMediaPlayPauseIfPendingOnHandler == C.TIME_UNSET || jOnPlayFromSearch == C.TIME_UNSET) {
            return 0;
        }
        if (jOnPlayFromSearch == 0) {
            return 100;
        }
        return LaissezFaireSubTypeValidator.write((int) ((jHandleMediaPlayPauseIfPendingOnHandler * 100) / jOnPlayFromSearch), 0, 100);
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean AudioAttributesCompatParcelizer() {
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = onPrepare();
        return !polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer() && polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(onMediaButtonEvent(), this.IconCompatParcelizer).write;
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = onPrepare();
        return !polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer() && polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(onMediaButtonEvent(), this.IconCompatParcelizer).AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.isUnsafeBaseType
    public final boolean MediaBrowserCompatItemReceiver() {
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = onPrepare();
        return !polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer() && polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(onMediaButtonEvent(), this.IconCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.isUnsafeBaseType
    public final long RemoteActionCompatParcelizer() {
        PolymorphicTypeValidator polymorphicTypeValidatorOnPrepare = onPrepare();
        return polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer() ? C.TIME_UNSET : polymorphicTypeValidatorOnPrepare.RemoteActionCompatParcelizer(onMediaButtonEvent(), this.IconCompatParcelizer).write();
    }

    private int MediaSessionCompatToken() {
        int iOnSetShuffleMode = onSetShuffleMode();
        if (iOnSetShuffleMode == 1) {
            return 0;
        }
        return iOnSetShuffleMode;
    }

    private void MediaSessionCompatResultReceiverWrapper() {
        read(-1, C.TIME_UNSET, false);
    }

    private void RemoteActionCompatParcelizer(long j) {
        read(onMediaButtonEvent(), j, false);
    }

    private void write(long j, int i) {
        long jOnPlayFromUri = onPlayFromUri() + j;
        long jOnPlayFromSearch = onPlayFromSearch();
        if (jOnPlayFromSearch != C.TIME_UNSET) {
            jOnPlayFromUri = Math.min(jOnPlayFromUri, jOnPlayFromSearch);
        }
        RemoteActionCompatParcelizer(Math.max(jOnPlayFromUri, 0L));
    }

    private void read(int i) {
        read(i, C.TIME_UNSET, false);
    }

    private void MediaSessionCompatQueueItem() {
        int iResultReceiver = ResultReceiver();
        if (iResultReceiver == -1) {
            MediaSessionCompatResultReceiverWrapper();
        } else if (iResultReceiver == onMediaButtonEvent()) {
            PlaybackStateCompat();
        } else {
            read(iResultReceiver);
        }
    }

    private void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        int iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == -1) {
            MediaSessionCompatResultReceiverWrapper();
        } else if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == onMediaButtonEvent()) {
            PlaybackStateCompat();
        } else {
            read(iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        }
    }

    private void PlaybackStateCompat() {
        read(onMediaButtonEvent(), C.TIME_UNSET, true);
    }
}
