package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AudioAttributesImplBaseParcelizer;
import kotlin.JsonFormatVisitorWithSerializerProvider;
import kotlin._checkFromStringCoercion;
import kotlin.expectMapFormat;
import kotlin.getActivityLogo;
import kotlin.getApplicationInfo;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {
    static int IconCompatParcelizer;
    private final ArrayList<MediaBrowserCompatItemReceiver> AudioAttributesCompatParcelizer;
    private final MediaControllerCompat RemoteActionCompatParcelizer;
    private final RemoteActionCompatParcelizer read;

    public interface AudioAttributesImplApi26Parcelizer {
        void AudioAttributesCompatParcelizer(int i, int i2);

        void IconCompatParcelizer(int i, int i2);
    }

    public interface MediaBrowserCompatItemReceiver {
        void read();
    }

    interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Handler handler);

        void AudioAttributesCompatParcelizer(boolean z);

        void IconCompatParcelizer();

        void IconCompatParcelizer(int i);

        void IconCompatParcelizer(PendingIntent pendingIntent);

        void IconCompatParcelizer(MediaMetadataCompat mediaMetadataCompat);

        PlaybackStateCompat RemoteActionCompatParcelizer();

        void RemoteActionCompatParcelizer(int i);

        void RemoteActionCompatParcelizer(List<QueueItem> list);

        Token read();

        AudioAttributesCompatParcelizer write();

        void write(int i);

        void write(PlaybackStateCompat playbackStateCompat);

        void write(JsonFormatVisitorWithSerializerProvider.IconCompatParcelizer iconCompatParcelizer);
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, getApplicationInfo getapplicationinfo) {
        this.AudioAttributesCompatParcelizer = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        componentName = componentName == null ? expectMapFormat.IconCompatParcelizer(context) : componentName;
        if (componentName != null && pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new AudioAttributesImplBaseParcelizer(context, str, getapplicationinfo, bundle);
        this.read = audioAttributesImplBaseParcelizer;
        RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer() { // from class: android.support.v4.media.session.MediaSessionCompat.4
        }, new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
        audioAttributesImplBaseParcelizer.IconCompatParcelizer(pendingIntent);
        this.RemoteActionCompatParcelizer = new MediaControllerCompat(context, this);
        if (IconCompatParcelizer == 0) {
            IconCompatParcelizer = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Handler handler) {
        if (audioAttributesCompatParcelizer == null) {
            this.read.AudioAttributesCompatParcelizer(null, null);
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.read;
        if (handler == null) {
            handler = new Handler();
        }
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, handler);
    }

    public void read(int i) {
        this.read.RemoteActionCompatParcelizer(i);
    }

    public void RemoteActionCompatParcelizer(boolean z) {
        this.read.AudioAttributesCompatParcelizer(z);
        Iterator<MediaBrowserCompatItemReceiver> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().read();
        }
    }

    public void read() {
        this.read.IconCompatParcelizer();
    }

    public Token RemoteActionCompatParcelizer() {
        return this.read.read();
    }

    public MediaControllerCompat write() {
        return this.RemoteActionCompatParcelizer;
    }

    public void IconCompatParcelizer(PlaybackStateCompat playbackStateCompat) {
        this.read.write(playbackStateCompat);
    }

    public void IconCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) {
        this.read.IconCompatParcelizer(mediaMetadataCompat);
    }

    public void AudioAttributesCompatParcelizer(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.RemoteActionCompatParcelizer()))) {
                    queueItem.RemoteActionCompatParcelizer();
                    new IllegalArgumentException("id of each queue item should be unique");
                }
                hashSet.add(Long.valueOf(queueItem.RemoteActionCompatParcelizer()));
            }
        }
        this.read.RemoteActionCompatParcelizer(list);
    }

    public void IconCompatParcelizer(int i) {
        this.read.IconCompatParcelizer(i);
    }

    public void AudioAttributesCompatParcelizer(int i) {
        this.read.write(i);
    }

    public static void IconCompatParcelizer(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static Bundle AudioAttributesCompatParcelizer(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        IconCompatParcelizer(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    static PlaybackStateCompat write(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long jAudioAttributesCompatParcelizer = -1;
        if (playbackStateCompat.MediaBrowserCompatItemReceiver() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.AudioAttributesImplBaseParcelizer() != 3 && playbackStateCompat.AudioAttributesImplBaseParcelizer() != 4 && playbackStateCompat.AudioAttributesImplBaseParcelizer() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.AudioAttributesCompatParcelizer() <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jRemoteActionCompatParcelizer = ((long) (playbackStateCompat.RemoteActionCompatParcelizer() * (jElapsedRealtime - r0))) + playbackStateCompat.MediaBrowserCompatItemReceiver();
        if (mediaMetadataCompat != null && mediaMetadataCompat.RemoteActionCompatParcelizer("android.media.metadata.DURATION")) {
            jAudioAttributesCompatParcelizer = mediaMetadataCompat.AudioAttributesCompatParcelizer("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.read(playbackStateCompat).write(playbackStateCompat.AudioAttributesImplBaseParcelizer(), (jAudioAttributesCompatParcelizer < 0 || jRemoteActionCompatParcelizer <= jAudioAttributesCompatParcelizer) ? jRemoteActionCompatParcelizer < 0 ? 0L : jRemoteActionCompatParcelizer : jAudioAttributesCompatParcelizer, playbackStateCompat.RemoteActionCompatParcelizer(), jElapsedRealtime).IconCompatParcelizer();
    }

    public static abstract class AudioAttributesCompatParcelizer {
        write mCallbackHandler;
        private boolean mMediaPlayPausePendingOnHandler;
        final Object mLock = new Object();
        final MediaSession.Callback mCallbackFwk = new IconCompatParcelizer();
        WeakReference<RemoteActionCompatParcelizer> mSessionImpl = new WeakReference<>(null);

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return false;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSetCaptioningEnabled(boolean z) {
        }

        public void onSetPlaybackSpeed(float f) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void onSetRepeatMode(int i) {
        }

        public void onSetShuffleMode(int i) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        void setSessionImpl(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler) {
            synchronized (this.mLock) {
                this.mSessionImpl = new WeakReference<>(remoteActionCompatParcelizer);
                write writeVar = this.mCallbackHandler;
                write writeVar2 = null;
                if (writeVar != null) {
                    writeVar.removeCallbacksAndMessages(null);
                }
                if (remoteActionCompatParcelizer != null && handler != null) {
                    writeVar2 = new write(handler.getLooper());
                }
                this.mCallbackHandler = writeVar2;
            }
        }

        void handleMediaPlayPauseIfPendingOnHandler(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Handler handler) {
            if (this.mMediaPlayPausePendingOnHandler) {
                this.mMediaPlayPausePendingOnHandler = false;
                handler.removeMessages(1);
                PlaybackStateCompat playbackStateCompatRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                long jIconCompatParcelizer = playbackStateCompatRemoteActionCompatParcelizer == null ? 0L : playbackStateCompatRemoteActionCompatParcelizer.IconCompatParcelizer();
                boolean z = playbackStateCompatRemoteActionCompatParcelizer != null && playbackStateCompatRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer() == 3;
                boolean z2 = (516 & jIconCompatParcelizer) != 0;
                boolean z3 = (jIconCompatParcelizer & 514) != 0;
                if (z && z3) {
                    onPause();
                } else {
                    if (z || !z2) {
                        return;
                    }
                    onPlay();
                }
            }
        }

        class write extends Handler {
            write(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer;
                write writeVar;
                if (message.what == 1) {
                    synchronized (AudioAttributesCompatParcelizer.this.mLock) {
                        remoteActionCompatParcelizer = AudioAttributesCompatParcelizer.this.mSessionImpl.get();
                        writeVar = AudioAttributesCompatParcelizer.this.mCallbackHandler;
                    }
                    if (remoteActionCompatParcelizer == null || AudioAttributesCompatParcelizer.this != remoteActionCompatParcelizer.write() || writeVar == null) {
                        return;
                    }
                    remoteActionCompatParcelizer.write((JsonFormatVisitorWithSerializerProvider.IconCompatParcelizer) message.obj);
                    AudioAttributesCompatParcelizer.this.handleMediaPlayPauseIfPendingOnHandler(remoteActionCompatParcelizer, writeVar);
                    remoteActionCompatParcelizer.write((JsonFormatVisitorWithSerializerProvider.IconCompatParcelizer) null);
                }
            }
        }

        class IconCompatParcelizer extends MediaSession.Callback {
            private void RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            }

            IconCompatParcelizer() {
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                try {
                    QueueItem queueItem = null;
                    IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = writeVarRemoteActionCompatParcelizer.read();
                        kotlin.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer = token.AudioAttributesCompatParcelizer();
                        if (audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer != null) {
                            iBinderAsBinder = audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer.asBinder();
                        }
                        _checkFromStringCoercion.AudioAttributesCompatParcelizer(bundle2, "android.support.v4.media.session.EXTRA_BINDER", iBinderAsBinder);
                        getActivityLogo.write(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", token.read());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        AudioAttributesCompatParcelizer.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        AudioAttributesCompatParcelizer.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        AudioAttributesCompatParcelizer.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        if (writeVarRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver != null) {
                            int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i >= 0 && i < writeVarRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver.size()) {
                                queueItem = writeVarRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver.get(i);
                            }
                            if (queueItem != null) {
                                AudioAttributesCompatParcelizer.this.onRemoveQueueItem(queueItem.write());
                            }
                        }
                    } else {
                        AudioAttributesCompatParcelizer.this.onCommand(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                }
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return false;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                boolean zOnMediaButtonEvent = AudioAttributesCompatParcelizer.this.onMediaButtonEvent(intent);
                write(writeVarRemoteActionCompatParcelizer);
                return zOnMediaButtonEvent || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPlay();
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPlayFromMediaId(str, bundle);
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPlayFromSearch(str, bundle);
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPlayFromUri(uri, bundle);
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onSkipToQueueItem(j);
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPause();
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onSkipToNext();
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onSkipToPrevious();
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onFastForward();
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onRewind();
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onStop();
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onSeekTo(j);
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onSetRating(RatingCompat.AudioAttributesCompatParcelizer(rating));
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.IconCompatParcelizer(bundle2);
                        AudioAttributesCompatParcelizer.this.onPlayFromUri(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        AudioAttributesCompatParcelizer.this.onPrepare();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.IconCompatParcelizer(bundle3);
                        AudioAttributesCompatParcelizer.this.onPrepareFromMediaId(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.IconCompatParcelizer(bundle4);
                        AudioAttributesCompatParcelizer.this.onPrepareFromSearch(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.IconCompatParcelizer(bundle5);
                        AudioAttributesCompatParcelizer.this.onPrepareFromUri(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        AudioAttributesCompatParcelizer.this.onSetCaptioningEnabled(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        AudioAttributesCompatParcelizer.this.onSetRepeatMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        AudioAttributesCompatParcelizer.this.onSetShuffleMode(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.IconCompatParcelizer(bundle6);
                        AudioAttributesCompatParcelizer.this.onSetRating(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        AudioAttributesCompatParcelizer.this.onSetPlaybackSpeed(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        AudioAttributesCompatParcelizer.this.onCustomAction(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                }
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPrepare();
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPrepareFromMediaId(str, bundle);
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPrepareFromSearch(str, bundle);
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                MediaSessionCompat.IconCompatParcelizer(bundle);
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onPrepareFromUri(uri, bundle);
                write(writeVarRemoteActionCompatParcelizer);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f) {
                write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                if (writeVarRemoteActionCompatParcelizer == null) {
                    return;
                }
                RemoteActionCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer.this.onSetPlaybackSpeed(f);
                write(writeVarRemoteActionCompatParcelizer);
            }

            private void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                remoteActionCompatParcelizer.write((JsonFormatVisitorWithSerializerProvider.IconCompatParcelizer) null);
            }

            private write RemoteActionCompatParcelizer() {
                write writeVar;
                synchronized (AudioAttributesCompatParcelizer.this.mLock) {
                    writeVar = (write) AudioAttributesCompatParcelizer.this.mSessionImpl.get();
                }
                if (writeVar == null || AudioAttributesCompatParcelizer.this != writeVar.write()) {
                    return null;
                }
                return writeVar;
            }
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        };
        private final Object IconCompatParcelizer;
        private kotlin.AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer;
        private getApplicationInfo read;
        private final Object write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, kotlin.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            this(obj, audioAttributesImplBaseParcelizer, null);
        }

        Token(Object obj, kotlin.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, getApplicationInfo getapplicationinfo) {
            this.IconCompatParcelizer = new Object();
            this.write = obj;
            this.RemoteActionCompatParcelizer = audioAttributesImplBaseParcelizer;
            this.read = getapplicationinfo;
        }

        public static Token AudioAttributesCompatParcelizer(Object obj) {
            return AudioAttributesCompatParcelizer(obj, null);
        }

        public static Token AudioAttributesCompatParcelizer(Object obj, kotlin.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof MediaSession.Token)) {
                throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
            }
            return new Token(obj, audioAttributesImplBaseParcelizer);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.write, i);
        }

        public final int hashCode() {
            Object obj = this.write;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.write;
            if (obj2 == null) {
                return token.write == null;
            }
            Object obj3 = token.write;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final Object write() {
            return this.write;
        }

        public final kotlin.AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer() {
            kotlin.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer;
            synchronized (this.IconCompatParcelizer) {
                audioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer;
            }
            return audioAttributesImplBaseParcelizer;
        }

        public final void IconCompatParcelizer(kotlin.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            synchronized (this.IconCompatParcelizer) {
                this.RemoteActionCompatParcelizer = audioAttributesImplBaseParcelizer;
            }
        }

        public final getApplicationInfo read() {
            getApplicationInfo getapplicationinfo;
            synchronized (this.IconCompatParcelizer) {
                getapplicationinfo = this.read;
            }
            return getapplicationinfo;
        }

        public final void write(getApplicationInfo getapplicationinfo) {
            synchronized (this.IconCompatParcelizer) {
                this.read = getapplicationinfo;
            }
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.2
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };
        private final long IconCompatParcelizer;
        private MediaSession.QueueItem RemoteActionCompatParcelizer;
        private final MediaDescriptionCompat write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j) {
            this(null, mediaDescriptionCompat, j);
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.write = mediaDescriptionCompat;
            this.IconCompatParcelizer = j;
            this.RemoteActionCompatParcelizer = queueItem;
        }

        QueueItem(Parcel parcel) {
            this.write = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.IconCompatParcelizer = parcel.readLong();
        }

        public final MediaDescriptionCompat write() {
            return this.write;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.write.writeToParcel(parcel, i);
            parcel.writeLong(this.IconCompatParcelizer);
        }

        public final Object AudioAttributesCompatParcelizer() {
            MediaSession.QueueItem queueItem = this.RemoteActionCompatParcelizer;
            if (queueItem != null) {
                return queueItem;
            }
            MediaSession.QueueItem queueItem2 = write.read((MediaDescription) this.write.IconCompatParcelizer(), this.IconCompatParcelizer);
            this.RemoteActionCompatParcelizer = queueItem2;
            return queueItem2;
        }

        public static QueueItem read(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.AudioAttributesCompatParcelizer(write.IconCompatParcelizer(queueItem)), write.read(queueItem));
        }

        public static List<QueueItem> IconCompatParcelizer(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(read(it.next()));
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.write);
            sb.append(", Id=");
            sb.append(this.IconCompatParcelizer);
            sb.append(" }");
            return sb.toString();
        }

        static class write {
            static MediaSession.QueueItem read(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }

            static MediaDescription IconCompatParcelizer(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long read(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.5
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };
        ResultReceiver read;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.read = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.read.writeToParcel(parcel, i);
        }
    }

    static class write implements RemoteActionCompatParcelizer {
        boolean AudioAttributesCompatParcelizer;
        MediaMetadataCompat AudioAttributesImplApi21Parcelizer;
        PlaybackStateCompat AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        AudioAttributesCompatParcelizer IconCompatParcelizer;
        List<QueueItem> MediaBrowserCompatItemReceiver;
        Bundle MediaBrowserCompatMediaItem;
        int MediaBrowserCompatSearchResultReceiver;
        int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        JsonFormatVisitorWithSerializerProvider.IconCompatParcelizer MediaDescriptionCompat;
        MediaBrowserCompatCustomActionResultReceiver MediaMetadataCompat;
        final MediaSession RatingCompat;
        final Token handleMediaPlayPauseIfPendingOnHandler;
        final RemoteActionCompatParcelizer write;
        final Object MediaBrowserCompatCustomActionResultReceiver = new Object();
        boolean RemoteActionCompatParcelizer = false;
        final RemoteCallbackList<kotlin.RemoteActionCompatParcelizer> read = new RemoteCallbackList<>();

        write(Context context, String str, getApplicationInfo getapplicationinfo, Bundle bundle) {
            MediaSession mediaSession = read(context, str, bundle);
            this.RatingCompat = mediaSession;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this);
            this.write = remoteActionCompatParcelizer;
            this.handleMediaPlayPauseIfPendingOnHandler = new Token(mediaSession.getSessionToken(), remoteActionCompatParcelizer, getapplicationinfo);
            this.MediaBrowserCompatMediaItem = bundle;
            RemoteActionCompatParcelizer(3);
        }

        public MediaSession read(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Handler handler) {
            synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
                this.IconCompatParcelizer = audioAttributesCompatParcelizer;
                this.RatingCompat.setCallback(audioAttributesCompatParcelizer == null ? null : audioAttributesCompatParcelizer.mCallbackFwk, handler);
                if (audioAttributesCompatParcelizer != null) {
                    audioAttributesCompatParcelizer.setSessionImpl(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void RemoteActionCompatParcelizer(int i) {
            this.RatingCompat.setFlags(i | 3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void AudioAttributesCompatParcelizer(boolean z) {
            this.RatingCompat.setActive(z);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void IconCompatParcelizer() {
            this.RemoteActionCompatParcelizer = true;
            this.read.kill();
            this.RatingCompat.setCallback(null);
            this.write.onPrepareFromSearch();
            this.RatingCompat.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public Token read() {
            return this.handleMediaPlayPauseIfPendingOnHandler;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void write(PlaybackStateCompat playbackStateCompat) {
            this.AudioAttributesImplApi26Parcelizer = playbackStateCompat;
            synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
                for (int iBeginBroadcast = this.read.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((kotlin.RemoteActionCompatParcelizer) this.read.getBroadcastItem(iBeginBroadcast)).RemoteActionCompatParcelizer(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.read.finishBroadcast();
            }
            this.RatingCompat.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.read());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public PlaybackStateCompat RemoteActionCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void IconCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) {
            this.AudioAttributesImplApi21Parcelizer = mediaMetadataCompat;
            this.RatingCompat.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.IconCompatParcelizer());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void IconCompatParcelizer(PendingIntent pendingIntent) {
            this.RatingCompat.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void RemoteActionCompatParcelizer(List<QueueItem> list) {
            this.MediaBrowserCompatItemReceiver = list;
            if (list == null) {
                this.RatingCompat.setQueue(null);
                return;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<QueueItem> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((MediaSession.QueueItem) it.next().AudioAttributesCompatParcelizer());
            }
            this.RatingCompat.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void IconCompatParcelizer(int i) {
            if (this.MediaBrowserCompatSearchResultReceiver != i) {
                this.MediaBrowserCompatSearchResultReceiver = i;
                synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
                    for (int iBeginBroadcast = this.read.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((kotlin.RemoteActionCompatParcelizer) this.read.getBroadcastItem(iBeginBroadcast)).read(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.read.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void write(int i) {
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != i) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
                synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
                    for (int iBeginBroadcast = this.read.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                        try {
                            ((kotlin.RemoteActionCompatParcelizer) this.read.getBroadcastItem(iBeginBroadcast)).write(i);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.read.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void write(JsonFormatVisitorWithSerializerProvider.IconCompatParcelizer iconCompatParcelizer) {
            synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
                this.MediaDescriptionCompat = iconCompatParcelizer;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public AudioAttributesCompatParcelizer write() {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
            synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
                audioAttributesCompatParcelizer = this.IconCompatParcelizer;
            }
            return audioAttributesCompatParcelizer;
        }

        static class RemoteActionCompatParcelizer extends AudioAttributesImplBaseParcelizer.IconCompatParcelizer {
            private final AtomicReference<write> write;

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void IconCompatParcelizer(boolean z) {
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public List<QueueItem> MediaBrowserCompatCustomActionResultReceiver() {
                return null;
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public boolean onCustomAction() {
                return false;
            }

            RemoteActionCompatParcelizer(write writeVar) {
                this.write = new AtomicReference<>(writeVar);
            }

            public void onPrepareFromSearch() {
                this.write.set(null);
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void read(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public boolean write(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void IconCompatParcelizer(kotlin.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                write writeVar = this.write.get();
                if (writeVar == null) {
                    return;
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                writeVar.read.register(remoteActionCompatParcelizer, new JsonFormatVisitorWithSerializerProvider.IconCompatParcelizer("android.media.session.MediaController", callingPid, callingUid));
                synchronized (writeVar.MediaBrowserCompatCustomActionResultReceiver) {
                    if (writeVar.MediaMetadataCompat != null) {
                        writeVar.MediaMetadataCompat.RemoteActionCompatParcelizer(callingPid, callingUid);
                    }
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void AudioAttributesCompatParcelizer(kotlin.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                write writeVar = this.write.get();
                if (writeVar == null) {
                    return;
                }
                writeVar.read.unregister(remoteActionCompatParcelizer);
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                synchronized (writeVar.MediaBrowserCompatCustomActionResultReceiver) {
                    if (writeVar.MediaMetadataCompat != null) {
                        writeVar.MediaMetadataCompat.IconCompatParcelizer(callingPid, callingUid);
                    }
                }
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public String AudioAttributesImplBaseParcelizer() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public Bundle MediaDescriptionCompat() {
                write writeVar = this.write.get();
                if (writeVar.MediaBrowserCompatMediaItem == null) {
                    return null;
                }
                return new Bundle(writeVar.MediaBrowserCompatMediaItem);
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public String MediaMetadataCompat() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public PendingIntent IconCompatParcelizer() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public long read() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public ParcelableVolumeInfo MediaBrowserCompatSearchResultReceiver() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void read(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void RemoteActionCompatParcelizer(int i, int i2, String str) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void onPlay() throws RemoteException {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void RemoteActionCompatParcelizer(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void read(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void AudioAttributesCompatParcelizer(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void onPlayFromMediaId() throws RemoteException {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void write(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void IconCompatParcelizer(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void IconCompatParcelizer(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void read(long j) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void handleMediaPlayPauseIfPendingOnHandler() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void onMediaButtonEvent() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void onPause() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void AudioAttributesCompatParcelizer() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void onFastForward() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void AudioAttributesCompatParcelizer(long j) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void read(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void write(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void RemoteActionCompatParcelizer(float f) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void write(boolean z) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void IconCompatParcelizer(int i) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void RemoteActionCompatParcelizer(int i) throws RemoteException {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void AudioAttributesCompatParcelizer(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public MediaMetadataCompat RemoteActionCompatParcelizer() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public PlaybackStateCompat AudioAttributesImplApi26Parcelizer() {
                write writeVar = this.write.get();
                if (writeVar != null) {
                    return MediaSessionCompat.write(writeVar.AudioAttributesImplApi26Parcelizer, writeVar.AudioAttributesImplApi21Parcelizer);
                }
                return null;
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void write(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void AudioAttributesCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void IconCompatParcelizer(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public void write(int i) {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public CharSequence MediaBrowserCompatItemReceiver() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public Bundle write() {
                throw new AssertionError();
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public int AudioAttributesImplApi21Parcelizer() {
                write writeVar = this.write.get();
                if (writeVar != null) {
                    return writeVar.AudioAttributesImplBaseParcelizer;
                }
                return 0;
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public boolean onCommand() {
                write writeVar = this.write.get();
                return writeVar != null && writeVar.AudioAttributesCompatParcelizer;
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public int MediaBrowserCompatMediaItem() {
                write writeVar = this.write.get();
                if (writeVar != null) {
                    return writeVar.MediaBrowserCompatSearchResultReceiver;
                }
                return -1;
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public int RatingCompat() {
                write writeVar = this.write.get();
                if (writeVar != null) {
                    return writeVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                return -1;
            }

            @Override // kotlin.AudioAttributesImplBaseParcelizer
            public boolean onAddQueueItem() {
                throw new AssertionError();
            }
        }
    }

    static class read extends write {
        read(Context context, String str, getApplicationInfo getapplicationinfo, Bundle bundle) {
            super(context, str, getapplicationinfo, bundle);
        }
    }

    static class IconCompatParcelizer extends read {
        @Override // android.support.v4.media.session.MediaSessionCompat.write, android.support.v4.media.session.MediaSessionCompat.RemoteActionCompatParcelizer
        public void write(JsonFormatVisitorWithSerializerProvider.IconCompatParcelizer iconCompatParcelizer) {
        }

        IconCompatParcelizer(Context context, String str, getApplicationInfo getapplicationinfo, Bundle bundle) {
            super(context, str, getapplicationinfo, bundle);
        }
    }

    static class AudioAttributesImplBaseParcelizer extends IconCompatParcelizer {
        AudioAttributesImplBaseParcelizer(Context context, String str, getApplicationInfo getapplicationinfo, Bundle bundle) {
            super(context, str, getapplicationinfo, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.write
        public MediaSession read(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends Handler {
        private final AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1001) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(message.arg1, message.arg2);
            } else {
                if (i != 1002) {
                    return;
                }
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(message.arg1, message.arg2);
            }
        }

        public final void RemoteActionCompatParcelizer(int i, int i2) {
            obtainMessage(1001, i, i2).sendToTarget();
        }

        public final void IconCompatParcelizer(int i, int i2) {
            obtainMessage(1002, i, i2).sendToTarget();
        }
    }
}
