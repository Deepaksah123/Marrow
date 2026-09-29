package kotlin;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class onPrepareError {

    public static class IconCompatParcelizer implements Externalizable {
        private boolean AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean RemoteActionCompatParcelizer;
        private String MediaDescriptionCompat = "";
        private String read = "";
        private List<String> AudioAttributesImplApi21Parcelizer = new ArrayList();
        private String AudioAttributesImplApi26Parcelizer = "";
        private boolean MediaBrowserCompatItemReceiver = false;
        private String write = "";

        private IconCompatParcelizer read(String str) {
            this.AudioAttributesImplBaseParcelizer = true;
            this.MediaDescriptionCompat = str;
            return this;
        }

        private IconCompatParcelizer IconCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = true;
            this.read = str;
            return this;
        }

        private int RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi21Parcelizer.size();
        }

        private IconCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.IconCompatParcelizer = true;
            this.AudioAttributesImplApi26Parcelizer = str;
            return this;
        }

        private IconCompatParcelizer read(boolean z) {
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            this.MediaBrowserCompatItemReceiver = z;
            return this;
        }

        private IconCompatParcelizer write(String str) {
            this.AudioAttributesCompatParcelizer = true;
            this.write = str;
            return this;
        }

        @Override // java.io.Externalizable
        public final void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this.MediaDescriptionCompat);
            objectOutput.writeUTF(this.read);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            objectOutput.writeInt(iRemoteActionCompatParcelizer);
            for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
                objectOutput.writeUTF(this.AudioAttributesImplApi21Parcelizer.get(i));
            }
            objectOutput.writeBoolean(this.IconCompatParcelizer);
            if (this.IconCompatParcelizer) {
                objectOutput.writeUTF(this.AudioAttributesImplApi26Parcelizer);
            }
            objectOutput.writeBoolean(this.AudioAttributesCompatParcelizer);
            if (this.AudioAttributesCompatParcelizer) {
                objectOutput.writeUTF(this.write);
            }
            objectOutput.writeBoolean(this.MediaBrowserCompatItemReceiver);
        }

        @Override // java.io.Externalizable
        public final void readExternal(ObjectInput objectInput) throws IOException {
            read(objectInput.readUTF());
            IconCompatParcelizer(objectInput.readUTF());
            int i = objectInput.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                this.AudioAttributesImplApi21Parcelizer.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                write(objectInput.readUTF());
            }
            read(objectInput.readBoolean());
        }
    }

    public static class RemoteActionCompatParcelizer implements Externalizable {
        private boolean AudioAttributesCompatParcelizer;
        private boolean RemoteActionCompatParcelizer;
        private String IconCompatParcelizer = "";
        private List<Integer> MediaBrowserCompatItemReceiver = new ArrayList();
        private List<Integer> write = new ArrayList();
        private String read = "";

        public final String read() {
            return this.IconCompatParcelizer;
        }

        private RemoteActionCompatParcelizer write(String str) {
            this.AudioAttributesCompatParcelizer = true;
            this.IconCompatParcelizer = str;
            return this;
        }

        public final List<Integer> IconCompatParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        private int write() {
            return this.MediaBrowserCompatItemReceiver.size();
        }

        private int AudioAttributesCompatParcelizer() {
            return this.write.size();
        }

        private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            this.RemoteActionCompatParcelizer = true;
            this.read = str;
            return this;
        }

        @Override // java.io.Externalizable
        public final void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.AudioAttributesCompatParcelizer);
            if (this.AudioAttributesCompatParcelizer) {
                objectOutput.writeUTF(this.IconCompatParcelizer);
            }
            int iWrite = write();
            objectOutput.writeInt(iWrite);
            for (int i = 0; i < iWrite; i++) {
                objectOutput.writeInt(this.MediaBrowserCompatItemReceiver.get(i).intValue());
            }
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            objectOutput.writeInt(iAudioAttributesCompatParcelizer);
            for (int i2 = 0; i2 < iAudioAttributesCompatParcelizer; i2++) {
                objectOutput.writeInt(this.write.get(i2).intValue());
            }
            objectOutput.writeBoolean(this.RemoteActionCompatParcelizer);
            if (this.RemoteActionCompatParcelizer) {
                objectOutput.writeUTF(this.read);
            }
        }

        @Override // java.io.Externalizable
        public final void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                write(objectInput.readUTF());
            }
            int i = objectInput.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                this.MediaBrowserCompatItemReceiver.add(Integer.valueOf(objectInput.readInt()));
            }
            int i3 = objectInput.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                this.write.add(Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                AudioAttributesCompatParcelizer(objectInput.readUTF());
            }
        }
    }

    public static class AudioAttributesCompatParcelizer implements Externalizable {
        private boolean AudioAttributesImplApi21Parcelizer;
        private boolean AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private boolean MediaBrowserCompatMediaItem;
        private boolean MediaBrowserCompatSearchResultReceiver;
        private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private boolean MediaDescriptionCompat;
        private boolean MediaMetadataCompat;
        private boolean RatingCompat;
        private boolean handleMediaPlayPauseIfPendingOnHandler;
        private boolean onAddQueueItem;
        private boolean onCommand;
        private boolean onCustomAction;
        private boolean onFastForward;
        private boolean onMediaButtonEvent;
        private boolean onPause;
        private boolean onPlay;
        private boolean onPlayFromMediaId;
        private boolean onPlayFromSearch;
        private boolean onPlayFromUri;
        private boolean onPrepare;
        private boolean onPrepareFromMediaId;
        private boolean onPrepareFromSearch;
        private boolean onPrepareFromUri;
        private boolean onRemoveQueueItem;
        private boolean onRemoveQueueItemAt;
        private boolean onRewind;
        private boolean onSeekTo;
        private RemoteActionCompatParcelizer write = null;
        private RemoteActionCompatParcelizer IconCompatParcelizer = null;
        private RemoteActionCompatParcelizer onStop = null;
        private RemoteActionCompatParcelizer r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = null;
        private RemoteActionCompatParcelizer r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
        private RemoteActionCompatParcelizer ResultReceiver = null;
        private RemoteActionCompatParcelizer MediaSessionCompatResultReceiverWrapper = null;
        private RemoteActionCompatParcelizer accessgetReportFullyDrawnExecutorp = null;
        private RemoteActionCompatParcelizer MediaSessionCompatQueueItem = null;
        private RemoteActionCompatParcelizer _init_lambda3 = null;
        private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = null;
        private RemoteActionCompatParcelizer _init_lambda5 = null;
        private RemoteActionCompatParcelizer _init_lambda2 = null;
        private RemoteActionCompatParcelizer r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = null;
        private RemoteActionCompatParcelizer RemoteActionCompatParcelizer = null;
        private RemoteActionCompatParcelizer r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = null;
        private RemoteActionCompatParcelizer PlaybackStateCompat = null;
        private String onSetRating = "";
        private int read = 0;
        private String onSetRepeatMode = "";
        private String r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = "";
        private String MediaSessionCompatToken = "";
        private String r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = "";
        private String onSkipToNext = "";
        private String setSessionImpl = "";
        private boolean PlaybackStateCompatCustomAction = false;
        private List<IconCompatParcelizer> ParcelableVolumeInfo = new ArrayList();
        private List<IconCompatParcelizer> onSetPlaybackSpeed = new ArrayList();
        private boolean onSkipToPrevious = false;
        private String onSetCaptioningEnabled = "";
        private boolean onSetShuffleMode = false;
        private boolean onSkipToQueueItem = false;

        public final RemoteActionCompatParcelizer read() {
            return this.write;
        }

        private AudioAttributesCompatParcelizer IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer = true;
            this.write = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        private AudioAttributesCompatParcelizer read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer = true;
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer write() {
            return this.onStop;
        }

        private AudioAttributesCompatParcelizer write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onCustomAction = true;
            this.onStop = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer RatingCompat() {
            return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        }

        private AudioAttributesCompatParcelizer MediaMetadataCompat(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onPrepareFromUri = true;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer() {
            return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }

        private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onPrepareFromMediaId = true;
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatCustomActionResultReceiver() {
            return this.ResultReceiver;
        }

        private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onPrepare = true;
            this.ResultReceiver = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer() {
            return this.MediaSessionCompatResultReceiverWrapper;
        }

        private AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onPlayFromMediaId = true;
            this.MediaSessionCompatResultReceiverWrapper = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatMediaItem() {
            return this.accessgetReportFullyDrawnExecutorp;
        }

        private AudioAttributesCompatParcelizer onCommand(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onSeekTo = true;
            this.accessgetReportFullyDrawnExecutorp = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer AudioAttributesImplBaseParcelizer() {
            return this.MediaSessionCompatQueueItem;
        }

        private AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onFastForward = true;
            this.MediaSessionCompatQueueItem = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaDescriptionCompat() {
            return this._init_lambda3;
        }

        private AudioAttributesCompatParcelizer RatingCompat(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onRemoveQueueItem = true;
            this._init_lambda3 = remoteActionCompatParcelizer;
            return this;
        }

        private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer = true;
            this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
            return this;
        }

        public final RemoteActionCompatParcelizer MediaBrowserCompatSearchResultReceiver() {
            return this._init_lambda5;
        }

        private AudioAttributesCompatParcelizer handleMediaPlayPauseIfPendingOnHandler(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onRewind = true;
            this._init_lambda5 = remoteActionCompatParcelizer;
            return this;
        }

        private AudioAttributesCompatParcelizer MediaDescriptionCompat(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onPrepareFromSearch = true;
            this._init_lambda2 = remoteActionCompatParcelizer;
            return this;
        }

        private AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onRemoveQueueItemAt = true;
            this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = remoteActionCompatParcelizer;
            return this;
        }

        private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            return this;
        }

        private AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onPlayFromSearch = true;
            this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = remoteActionCompatParcelizer;
            return this;
        }

        private AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.onPlay = true;
            this.PlaybackStateCompat = remoteActionCompatParcelizer;
            return this;
        }

        private AudioAttributesCompatParcelizer read(String str) {
            this.RatingCompat = true;
            this.onSetRating = str;
            return this;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.read;
        }

        private AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
            this.MediaBrowserCompatItemReceiver = true;
            this.read = i;
            return this;
        }

        private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(String str) {
            this.MediaMetadataCompat = true;
            this.onSetRepeatMode = str;
            return this;
        }

        private AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(String str) {
            this.onPause = true;
            this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = str;
            return this;
        }

        private AudioAttributesCompatParcelizer IconCompatParcelizer(String str) {
            this.onCommand = true;
            this.MediaSessionCompatToken = str;
            return this;
        }

        private AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver(String str) {
            this.onMediaButtonEvent = true;
            this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = str;
            return this;
        }

        private AudioAttributesCompatParcelizer write(String str) {
            this.handleMediaPlayPauseIfPendingOnHandler = true;
            this.onSkipToNext = str;
            return this;
        }

        private AudioAttributesCompatParcelizer AudioAttributesImplApi26Parcelizer(String str) {
            this.onAddQueueItem = true;
            this.setSessionImpl = str;
            return this;
        }

        public final boolean MediaBrowserCompatItemReceiver() {
            return this.PlaybackStateCompatCustomAction;
        }

        private AudioAttributesCompatParcelizer read(boolean z) {
            this.onPlayFromUri = true;
            this.PlaybackStateCompatCustomAction = z;
            return this;
        }

        private int handleMediaPlayPauseIfPendingOnHandler() {
            return this.ParcelableVolumeInfo.size();
        }

        private int onAddQueueItem() {
            return this.onSetPlaybackSpeed.size();
        }

        private AudioAttributesCompatParcelizer IconCompatParcelizer(boolean z) {
            this.MediaBrowserCompatMediaItem = true;
            this.onSkipToPrevious = z;
            return this;
        }

        public final boolean MediaMetadataCompat() {
            return this.MediaDescriptionCompat;
        }

        public final String IconCompatParcelizer() {
            return this.onSetCaptioningEnabled;
        }

        private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str) {
            this.MediaDescriptionCompat = true;
            this.onSetCaptioningEnabled = str;
            return this;
        }

        private AudioAttributesCompatParcelizer write(boolean z) {
            this.MediaBrowserCompatSearchResultReceiver = true;
            this.onSetShuffleMode = z;
            return this;
        }

        private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(boolean z) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
            this.onSkipToQueueItem = z;
            return this;
        }

        @Override // java.io.Externalizable
        public final void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.AudioAttributesImplBaseParcelizer);
            if (this.AudioAttributesImplBaseParcelizer) {
                this.write.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.AudioAttributesImplApi26Parcelizer);
            if (this.AudioAttributesImplApi26Parcelizer) {
                this.IconCompatParcelizer.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onCustomAction);
            if (this.onCustomAction) {
                this.onStop.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onPrepareFromUri);
            if (this.onPrepareFromUri) {
                this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onPrepareFromMediaId);
            if (this.onPrepareFromMediaId) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onPrepare);
            if (this.onPrepare) {
                this.ResultReceiver.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onPlayFromMediaId);
            if (this.onPlayFromMediaId) {
                this.MediaSessionCompatResultReceiverWrapper.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onSeekTo);
            if (this.onSeekTo) {
                this.accessgetReportFullyDrawnExecutorp.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onFastForward);
            if (this.onFastForward) {
                this.MediaSessionCompatQueueItem.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onRemoveQueueItem);
            if (this.onRemoveQueueItem) {
                this._init_lambda3.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.AudioAttributesImplApi21Parcelizer);
            if (this.AudioAttributesImplApi21Parcelizer) {
                this.AudioAttributesCompatParcelizer.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onRewind);
            if (this.onRewind) {
                this._init_lambda5.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onPrepareFromSearch);
            if (this.onPrepareFromSearch) {
                this._init_lambda2.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onRemoveQueueItemAt);
            if (this.onRemoveQueueItemAt) {
                this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.MediaBrowserCompatCustomActionResultReceiver);
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                this.RemoteActionCompatParcelizer.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onPlayFromSearch);
            if (this.onPlayFromSearch) {
                this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onPlay);
            if (this.onPlay) {
                this.PlaybackStateCompat.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.onSetRating);
            objectOutput.writeInt(this.read);
            objectOutput.writeUTF(this.onSetRepeatMode);
            objectOutput.writeBoolean(this.onPause);
            if (this.onPause) {
                objectOutput.writeUTF(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw);
            }
            objectOutput.writeBoolean(this.onCommand);
            if (this.onCommand) {
                objectOutput.writeUTF(this.MediaSessionCompatToken);
            }
            objectOutput.writeBoolean(this.onMediaButtonEvent);
            if (this.onMediaButtonEvent) {
                objectOutput.writeUTF(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
            }
            objectOutput.writeBoolean(this.handleMediaPlayPauseIfPendingOnHandler);
            if (this.handleMediaPlayPauseIfPendingOnHandler) {
                objectOutput.writeUTF(this.onSkipToNext);
            }
            objectOutput.writeBoolean(this.onAddQueueItem);
            if (this.onAddQueueItem) {
                objectOutput.writeUTF(this.setSessionImpl);
            }
            objectOutput.writeBoolean(this.PlaybackStateCompatCustomAction);
            int iHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            objectOutput.writeInt(iHandleMediaPlayPauseIfPendingOnHandler);
            for (int i = 0; i < iHandleMediaPlayPauseIfPendingOnHandler; i++) {
                this.ParcelableVolumeInfo.get(i).writeExternal(objectOutput);
            }
            int iOnAddQueueItem = onAddQueueItem();
            objectOutput.writeInt(iOnAddQueueItem);
            for (int i2 = 0; i2 < iOnAddQueueItem; i2++) {
                this.onSetPlaybackSpeed.get(i2).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.onSkipToPrevious);
            objectOutput.writeBoolean(this.MediaDescriptionCompat);
            if (this.MediaDescriptionCompat) {
                objectOutput.writeUTF(this.onSetCaptioningEnabled);
            }
            objectOutput.writeBoolean(this.onSetShuffleMode);
            objectOutput.writeBoolean(this.onSkipToQueueItem);
        }

        @Override // java.io.Externalizable
        public final void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer.readExternal(objectInput);
                IconCompatParcelizer(remoteActionCompatParcelizer);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer2.readExternal(objectInput);
                read(remoteActionCompatParcelizer2);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer3.readExternal(objectInput);
                write(remoteActionCompatParcelizer3);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer4.readExternal(objectInput);
                MediaMetadataCompat(remoteActionCompatParcelizer4);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer5.readExternal(objectInput);
                MediaBrowserCompatItemReceiver(remoteActionCompatParcelizer5);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer6 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer6.readExternal(objectInput);
                AudioAttributesImplApi26Parcelizer(remoteActionCompatParcelizer6);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer7 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer7.readExternal(objectInput);
                MediaBrowserCompatCustomActionResultReceiver(remoteActionCompatParcelizer7);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer8 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer8.readExternal(objectInput);
                onCommand(remoteActionCompatParcelizer8);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer9 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer9.readExternal(objectInput);
                AudioAttributesImplApi21Parcelizer(remoteActionCompatParcelizer9);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer10 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer10.readExternal(objectInput);
                RatingCompat(remoteActionCompatParcelizer10);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer11 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer11.readExternal(objectInput);
                RemoteActionCompatParcelizer(remoteActionCompatParcelizer11);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer12 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer12.readExternal(objectInput);
                handleMediaPlayPauseIfPendingOnHandler(remoteActionCompatParcelizer12);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer13 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer13.readExternal(objectInput);
                MediaDescriptionCompat(remoteActionCompatParcelizer13);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer14 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer14.readExternal(objectInput);
                MediaBrowserCompatMediaItem(remoteActionCompatParcelizer14);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer15 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer15.readExternal(objectInput);
                AudioAttributesCompatParcelizer(remoteActionCompatParcelizer15);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer16 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer16.readExternal(objectInput);
                MediaBrowserCompatSearchResultReceiver(remoteActionCompatParcelizer16);
            }
            if (objectInput.readBoolean()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer17 = new RemoteActionCompatParcelizer();
                remoteActionCompatParcelizer17.readExternal(objectInput);
                AudioAttributesImplBaseParcelizer(remoteActionCompatParcelizer17);
            }
            read(objectInput.readUTF());
            IconCompatParcelizer(objectInput.readInt());
            RemoteActionCompatParcelizer(objectInput.readUTF());
            if (objectInput.readBoolean()) {
                MediaBrowserCompatCustomActionResultReceiver(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                IconCompatParcelizer(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                MediaBrowserCompatItemReceiver(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                write(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                AudioAttributesImplApi26Parcelizer(objectInput.readUTF());
            }
            read(objectInput.readBoolean());
            int i = objectInput.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
                iconCompatParcelizer.readExternal(objectInput);
                this.ParcelableVolumeInfo.add(iconCompatParcelizer);
            }
            int i3 = objectInput.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                IconCompatParcelizer iconCompatParcelizer2 = new IconCompatParcelizer();
                iconCompatParcelizer2.readExternal(objectInput);
                this.onSetPlaybackSpeed.add(iconCompatParcelizer2);
            }
            IconCompatParcelizer(objectInput.readBoolean());
            if (objectInput.readBoolean()) {
                AudioAttributesCompatParcelizer(objectInput.readUTF());
            }
            write(objectInput.readBoolean());
            RemoteActionCompatParcelizer(objectInput.readBoolean());
        }
    }

    public static class write implements Externalizable {
        private List<AudioAttributesCompatParcelizer> read = new ArrayList();

        public final List<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer() {
            return this.read;
        }

        private int write() {
            return this.read.size();
        }

        @Override // java.io.Externalizable
        public final void writeExternal(ObjectOutput objectOutput) throws IOException {
            int iWrite = write();
            objectOutput.writeInt(iWrite);
            for (int i = 0; i < iWrite; i++) {
                this.read.get(i).writeExternal(objectOutput);
            }
        }

        @Override // java.io.Externalizable
        public final void readExternal(ObjectInput objectInput) throws IOException {
            int i = objectInput.readInt();
            for (int i2 = 0; i2 < i; i2++) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
                audioAttributesCompatParcelizer.readExternal(objectInput);
                this.read.add(audioAttributesCompatParcelizer);
            }
        }
    }
}
