package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.AudioAttributesImplBaseParcelizer;
import kotlin.RemoteActionCompatParcelizer;
import kotlin._checkFromStringCoercion;
import kotlin.getActivityLogo;

/* JADX INFO: loaded from: classes.dex */
public final class MediaControllerCompat {
    private final Set<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer;
    private final IconCompatParcelizer read;
    private final MediaSessionCompat.Token write;

    interface IconCompatParcelizer {
        List<MediaSessionCompat.QueueItem> AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler);

        MediaMetadataCompat IconCompatParcelizer();

        PlaybackStateCompat RemoteActionCompatParcelizer();

        void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

        boolean RemoteActionCompatParcelizer(KeyEvent keyEvent);

        read read();

        PendingIntent write();
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.RemoteActionCompatParcelizer());
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.RemoteActionCompatParcelizer = Collections.synchronizedSet(new HashSet());
        this.write = token;
        this.read = new write(context, token);
    }

    public final read RemoteActionCompatParcelizer() {
        return this.read.read();
    }

    public final boolean IconCompatParcelizer(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        return this.read.RemoteActionCompatParcelizer(keyEvent);
    }

    public final PlaybackStateCompat AudioAttributesCompatParcelizer() {
        return this.read.RemoteActionCompatParcelizer();
    }

    public final MediaMetadataCompat IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    public final List<MediaSessionCompat.QueueItem> write() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    public final PendingIntent read() {
        return this.read.write();
    }

    public final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, null);
    }

    public final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler) {
        if (remoteActionCompatParcelizer == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.RemoteActionCompatParcelizer.add(remoteActionCompatParcelizer)) {
            if (handler == null) {
                handler = new Handler();
            }
            remoteActionCompatParcelizer.write(handler);
            this.read.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, handler);
        }
    }

    public final void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.RemoteActionCompatParcelizer.remove(remoteActionCompatParcelizer)) {
            try {
                this.read.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
            } finally {
                remoteActionCompatParcelizer.write((Handler) null);
            }
        }
    }

    public static abstract class RemoteActionCompatParcelizer implements IBinder.DeathRecipient {
        HandlerC0001RemoteActionCompatParcelizer IconCompatParcelizer;
        kotlin.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        final MediaController.Callback read = new IconCompatParcelizer(this);

        public void AudioAttributesCompatParcelizer(Bundle bundle) {
        }

        public void IconCompatParcelizer(int i) {
        }

        public void IconCompatParcelizer(CharSequence charSequence) {
        }

        public void IconCompatParcelizer(boolean z) {
        }

        public void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        }

        public void RemoteActionCompatParcelizer(PlaybackStateCompat playbackStateCompat) {
        }

        public void read() {
        }

        public void read(int i) {
        }

        public void read(String str, Bundle bundle) {
        }

        public void read(List<MediaSessionCompat.QueueItem> list) {
        }

        public void write() {
        }

        public void write(MediaMetadataCompat mediaMetadataCompat) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            write(8, null, null);
        }

        void write(Handler handler) {
            if (handler == null) {
                HandlerC0001RemoteActionCompatParcelizer handlerC0001RemoteActionCompatParcelizer = this.IconCompatParcelizer;
                if (handlerC0001RemoteActionCompatParcelizer != null) {
                    handlerC0001RemoteActionCompatParcelizer.IconCompatParcelizer = false;
                    this.IconCompatParcelizer.removeCallbacksAndMessages(null);
                    this.IconCompatParcelizer = null;
                    return;
                }
                return;
            }
            HandlerC0001RemoteActionCompatParcelizer handlerC0001RemoteActionCompatParcelizer2 = new HandlerC0001RemoteActionCompatParcelizer(handler.getLooper());
            this.IconCompatParcelizer = handlerC0001RemoteActionCompatParcelizer2;
            handlerC0001RemoteActionCompatParcelizer2.IconCompatParcelizer = true;
        }

        void write(int i, Object obj, Bundle bundle) {
            HandlerC0001RemoteActionCompatParcelizer handlerC0001RemoteActionCompatParcelizer = this.IconCompatParcelizer;
            if (handlerC0001RemoteActionCompatParcelizer != null) {
                Message messageObtainMessage = handlerC0001RemoteActionCompatParcelizer.obtainMessage(i, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        static class IconCompatParcelizer extends MediaController.Callback {
            private final WeakReference<RemoteActionCompatParcelizer> read;

            IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                this.read = new WeakReference<>(remoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get();
                if (remoteActionCompatParcelizer != null) {
                    kotlin.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                    remoteActionCompatParcelizer.read(str, bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get();
                if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.RemoteActionCompatParcelizer != null) {
                    return;
                }
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(PlaybackStateCompat.write(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(MediaMetadataCompat.read(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.read(MediaSessionCompat.QueueItem.IconCompatParcelizer(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.IconCompatParcelizer(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer(playbackInfo.getPlaybackType(), AudioAttributesCompat.write(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }
        }

        static class read extends RemoteActionCompatParcelizer.IconCompatParcelizer {
            private final WeakReference<RemoteActionCompatParcelizer> IconCompatParcelizer;

            @Override // kotlin.RemoteActionCompatParcelizer
            public void write(boolean z) throws RemoteException {
            }

            read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                this.IconCompatParcelizer = new WeakReference<>(remoteActionCompatParcelizer);
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public void RemoteActionCompatParcelizer(String str, Bundle bundle) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(1, str, bundle);
                }
            }

            public void AudioAttributesCompatParcelizer() throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(8, null, null);
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public void RemoteActionCompatParcelizer(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(2, playbackStateCompat, null);
                }
            }

            public void AudioAttributesCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(3, mediaMetadataCompat, null);
                }
            }

            public void RemoteActionCompatParcelizer(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(5, list, null);
                }
            }

            public void write(CharSequence charSequence) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(6, charSequence, null);
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public void RemoteActionCompatParcelizer(boolean z) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(11, Boolean.valueOf(z), null);
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public void read(int i) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(9, Integer.valueOf(i), null);
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public void write(int i) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(12, Integer.valueOf(i), null);
                }
            }

            public void write(Bundle bundle) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(7, bundle, null);
                }
            }

            public void IconCompatParcelizer(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(4, parcelableVolumeInfo != null ? new AudioAttributesCompatParcelizer(parcelableVolumeInfo.AudioAttributesCompatParcelizer, parcelableVolumeInfo.write, parcelableVolumeInfo.IconCompatParcelizer, parcelableVolumeInfo.read, parcelableVolumeInfo.RemoteActionCompatParcelizer) : null, null);
                }
            }

            @Override // kotlin.RemoteActionCompatParcelizer
            public void RemoteActionCompatParcelizer() throws RemoteException {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer.get();
                if (remoteActionCompatParcelizer != null) {
                    remoteActionCompatParcelizer.write(13, null, null);
                }
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer, reason: collision with other inner class name */
        class HandlerC0001RemoteActionCompatParcelizer extends Handler {
            boolean IconCompatParcelizer;

            HandlerC0001RemoteActionCompatParcelizer(Looper looper) {
                super(looper);
                this.IconCompatParcelizer = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.IconCompatParcelizer) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.IconCompatParcelizer(data);
                            RemoteActionCompatParcelizer.this.read((String) message.obj, data);
                            break;
                        case 2:
                            RemoteActionCompatParcelizer.this.RemoteActionCompatParcelizer((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            RemoteActionCompatParcelizer.this.write((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            RemoteActionCompatParcelizer.this.RemoteActionCompatParcelizer((AudioAttributesCompatParcelizer) message.obj);
                            break;
                        case 5:
                            RemoteActionCompatParcelizer.this.read((List<MediaSessionCompat.QueueItem>) message.obj);
                            break;
                        case 6:
                            RemoteActionCompatParcelizer.this.IconCompatParcelizer((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.IconCompatParcelizer(bundle);
                            RemoteActionCompatParcelizer.this.AudioAttributesCompatParcelizer(bundle);
                            break;
                        case 8:
                            RemoteActionCompatParcelizer.this.write();
                            break;
                        case 9:
                            RemoteActionCompatParcelizer.this.IconCompatParcelizer(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            RemoteActionCompatParcelizer.this.IconCompatParcelizer(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            RemoteActionCompatParcelizer.this.read(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            RemoteActionCompatParcelizer.this.read();
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static abstract class read {
        public abstract void AudioAttributesCompatParcelizer();

        public abstract void IconCompatParcelizer();

        public abstract void RemoteActionCompatParcelizer();

        read() {
        }
    }

    public static final class AudioAttributesCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final int IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final AudioAttributesCompat read;
        private final int write;

        AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5) {
            this(i, new AudioAttributesCompat.read().write(i2).read(), i3, i4, i5);
        }

        AudioAttributesCompatParcelizer(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
            this.AudioAttributesCompatParcelizer = i;
            this.read = audioAttributesCompat;
            this.write = i2;
            this.RemoteActionCompatParcelizer = i3;
            this.IconCompatParcelizer = i4;
        }
    }

    static class MediaControllerImplApi21 implements IconCompatParcelizer {
        protected final MediaController IconCompatParcelizer;
        final MediaSessionCompat.Token read;
        final Object RemoteActionCompatParcelizer = new Object();
        private final List<RemoteActionCompatParcelizer> write = new ArrayList();
        private HashMap<RemoteActionCompatParcelizer, RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer = new HashMap<>();

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.read = token;
            this.IconCompatParcelizer = new MediaController(context, (MediaSession.Token) token.write());
            if (token.AudioAttributesCompatParcelizer() == null) {
                AudioAttributesImplApi26Parcelizer();
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler) {
            this.IconCompatParcelizer.registerCallback(remoteActionCompatParcelizer.read, handler);
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.read.AudioAttributesCompatParcelizer() != null) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
                    this.AudioAttributesCompatParcelizer.put(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                    try {
                        this.read.AudioAttributesCompatParcelizer().IconCompatParcelizer(remoteActionCompatParcelizer2);
                        remoteActionCompatParcelizer.write(13, null, null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer = null;
                    this.write.add(remoteActionCompatParcelizer);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.IconCompatParcelizer.unregisterCallback(remoteActionCompatParcelizer.read);
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.read.AudioAttributesCompatParcelizer() != null) {
                    try {
                        RemoteActionCompatParcelizer remoteActionCompatParcelizerRemove = this.AudioAttributesCompatParcelizer.remove(remoteActionCompatParcelizer);
                        if (remoteActionCompatParcelizerRemove != null) {
                            remoteActionCompatParcelizer.RemoteActionCompatParcelizer = null;
                            this.read.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(remoteActionCompatParcelizerRemove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.write.remove(remoteActionCompatParcelizer);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer
        public boolean RemoteActionCompatParcelizer(KeyEvent keyEvent) {
            return this.IconCompatParcelizer.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer
        public read read() {
            return new MediaBrowserCompatItemReceiver(this.IconCompatParcelizer.getTransportControls());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer
        public PlaybackStateCompat RemoteActionCompatParcelizer() {
            if (this.read.AudioAttributesCompatParcelizer() != null) {
                try {
                    return this.read.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer();
                } catch (RemoteException unused) {
                }
            }
            PlaybackState playbackState = this.IconCompatParcelizer.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.write(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer
        public MediaMetadataCompat IconCompatParcelizer() {
            MediaMetadata metadata = this.IconCompatParcelizer.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.read(metadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer
        public List<MediaSessionCompat.QueueItem> AudioAttributesCompatParcelizer() {
            List<MediaSession.QueueItem> queue = this.IconCompatParcelizer.getQueue();
            if (queue != null) {
                return MediaSessionCompat.QueueItem.IconCompatParcelizer(queue);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.IconCompatParcelizer
        public PendingIntent write() {
            return this.IconCompatParcelizer.getSessionActivity();
        }

        public void AudioAttributesCompatParcelizer(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.IconCompatParcelizer.sendCommand(str, bundle, resultReceiver);
        }

        private void AudioAttributesImplApi26Parcelizer() {
            AudioAttributesCompatParcelizer("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        void AudioAttributesImplBaseParcelizer() {
            if (this.read.AudioAttributesCompatParcelizer() == null) {
                return;
            }
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.write) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
                this.AudioAttributesCompatParcelizer.put(remoteActionCompatParcelizer, remoteActionCompatParcelizer2);
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                try {
                    this.read.AudioAttributesCompatParcelizer().IconCompatParcelizer(remoteActionCompatParcelizer2);
                    remoteActionCompatParcelizer.write(13, null, null);
                } catch (RemoteException unused) {
                }
            }
            this.write.clear();
        }

        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> IconCompatParcelizer;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.IconCompatParcelizer = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.IconCompatParcelizer.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.RemoteActionCompatParcelizer) {
                    mediaControllerImplApi21.read.IconCompatParcelizer(AudioAttributesImplBaseParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(_checkFromStringCoercion.read(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.read.write(getActivityLogo.AudioAttributesCompatParcelizer(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.AudioAttributesImplBaseParcelizer();
                }
            }
        }

        static class RemoteActionCompatParcelizer extends RemoteActionCompatParcelizer.read {
            RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                super(remoteActionCompatParcelizer);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.read, kotlin.RemoteActionCompatParcelizer
            public void AudioAttributesCompatParcelizer() throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.read, kotlin.RemoteActionCompatParcelizer
            public void AudioAttributesCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.read, kotlin.RemoteActionCompatParcelizer
            public void RemoteActionCompatParcelizer(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.read, kotlin.RemoteActionCompatParcelizer
            public void write(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.read, kotlin.RemoteActionCompatParcelizer
            public void write(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.RemoteActionCompatParcelizer.read, kotlin.RemoteActionCompatParcelizer
            public void IconCompatParcelizer(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }
    }

    static class write extends MediaControllerImplApi21 {
        write(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class AudioAttributesImplApi26Parcelizer extends read {
        protected final MediaController.TransportControls read;

        AudioAttributesImplApi26Parcelizer(MediaController.TransportControls transportControls) {
            this.read = transportControls;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.read
        public void AudioAttributesCompatParcelizer() {
            this.read.play();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.read
        public void RemoteActionCompatParcelizer() {
            this.read.pause();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.read
        public void IconCompatParcelizer() {
            this.read.stop();
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class MediaBrowserCompatCustomActionResultReceiver extends AudioAttributesImplApi26Parcelizer {
        MediaBrowserCompatCustomActionResultReceiver(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class AudioAttributesImplApi21Parcelizer extends MediaBrowserCompatCustomActionResultReceiver {
        AudioAttributesImplApi21Parcelizer(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class MediaBrowserCompatItemReceiver extends AudioAttributesImplApi21Parcelizer {
        MediaBrowserCompatItemReceiver(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }
}
