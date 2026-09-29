package kotlin;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class SubtypeResolver {
    public static final SubtypeResolver RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer().read();
    public final boolean AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi21Parcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final boolean AudioAttributesImplBaseParcelizer;
    public final boolean IconCompatParcelizer;
    public final int MediaBrowserCompatCustomActionResultReceiver;
    public final int MediaBrowserCompatItemReceiver;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaBrowserCompatSearchResultReceiver;
    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public final int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final int RatingCompat;
    public final initExtraTracks<String> handleMediaPlayPauseIfPendingOnHandler;
    public final onMoovContainerAtomRead<setName, TypeDeserializer> onAddQueueItem;
    public final int onCommand;
    public final initExtraTracks<String> onCustomAction;
    public final initExtraTracks<String> onFastForward;
    public final int onMediaButtonEvent;
    public final int onPause;
    public final int onPlay;
    public final initExtraTracks<String> onPlayFromMediaId;
    public final boolean onPlayFromSearch;
    public final int onPlayFromUri;
    public final boolean onPrepare;
    public final int onPrepareFromSearch;
    public final onEmsgLeafAtomRead<Integer> read;
    public final IconCompatParcelizer write;

    public static class AudioAttributesCompatParcelizer {
        private HashSet<Integer> AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private IconCompatParcelizer IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private int MediaBrowserCompatSearchResultReceiver;
        private HashMap<setName, TypeDeserializer> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private int RatingCompat;
        private boolean RemoteActionCompatParcelizer;
        private int handleMediaPlayPauseIfPendingOnHandler;
        private initExtraTracks<String> onAddQueueItem;
        private int onCommand;
        private initExtraTracks<String> onCustomAction;
        private int onFastForward;
        private initExtraTracks<String> onMediaButtonEvent;
        private initExtraTracks<String> onPause;
        private boolean onPlay;
        private int onPlayFromMediaId;
        private int onPlayFromUri;
        private int onPrepare;
        private boolean onPrepareFromMediaId;
        private int read;
        private boolean write;

        @Deprecated
        public AudioAttributesCompatParcelizer() {
            this.MediaMetadataCompat = Integer.MAX_VALUE;
            this.RatingCompat = Integer.MAX_VALUE;
            this.MediaBrowserCompatCustomActionResultReceiver = Integer.MAX_VALUE;
            this.MediaBrowserCompatItemReceiver = Integer.MAX_VALUE;
            this.onPrepare = Integer.MAX_VALUE;
            this.onPlayFromUri = Integer.MAX_VALUE;
            this.onPrepareFromMediaId = true;
            this.onMediaButtonEvent = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            this.onFastForward = 0;
            this.onCustomAction = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            this.handleMediaPlayPauseIfPendingOnHandler = 0;
            this.AudioAttributesImplBaseParcelizer = Integer.MAX_VALUE;
            this.AudioAttributesImplApi26Parcelizer = Integer.MAX_VALUE;
            this.onAddQueueItem = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            this.IconCompatParcelizer = IconCompatParcelizer.IconCompatParcelizer;
            this.onPause = initExtraTracks.AudioAttributesImplApi26Parcelizer();
            this.onPlayFromMediaId = 0;
            this.read = 0;
            this.onPlay = false;
            this.AudioAttributesImplApi21Parcelizer = false;
            this.write = false;
            this.RemoteActionCompatParcelizer = false;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new HashMap<>();
            this.AudioAttributesCompatParcelizer = new HashSet<>();
        }

        public AudioAttributesCompatParcelizer(Context context) {
            this();
            write(context);
            read(context, true);
        }

        public AudioAttributesCompatParcelizer(SubtypeResolver subtypeResolver) {
            AudioAttributesCompatParcelizer(subtypeResolver);
        }

        private void AudioAttributesCompatParcelizer(SubtypeResolver subtypeResolver) {
            this.MediaMetadataCompat = subtypeResolver.MediaBrowserCompatSearchResultReceiver;
            this.RatingCompat = subtypeResolver.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatCustomActionResultReceiver = subtypeResolver.MediaDescriptionCompat;
            this.MediaBrowserCompatItemReceiver = subtypeResolver.AudioAttributesImplApi21Parcelizer;
            this.onCommand = subtypeResolver.onCommand;
            this.MediaDescriptionCompat = subtypeResolver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.MediaBrowserCompatMediaItem = subtypeResolver.RatingCompat;
            this.MediaBrowserCompatSearchResultReceiver = subtypeResolver.MediaMetadataCompat;
            this.onPrepare = subtypeResolver.onPlayFromUri;
            this.onPlayFromUri = subtypeResolver.onPrepareFromSearch;
            this.onPrepareFromMediaId = subtypeResolver.onPrepare;
            this.onMediaButtonEvent = subtypeResolver.onPlayFromMediaId;
            this.onFastForward = subtypeResolver.onMediaButtonEvent;
            this.onCustomAction = subtypeResolver.handleMediaPlayPauseIfPendingOnHandler;
            this.handleMediaPlayPauseIfPendingOnHandler = subtypeResolver.onPlay;
            this.AudioAttributesImplBaseParcelizer = subtypeResolver.MediaBrowserCompatItemReceiver;
            this.AudioAttributesImplApi26Parcelizer = subtypeResolver.AudioAttributesImplApi26Parcelizer;
            this.onAddQueueItem = subtypeResolver.onCustomAction;
            this.IconCompatParcelizer = subtypeResolver.write;
            this.onPause = subtypeResolver.onFastForward;
            this.onPlayFromMediaId = subtypeResolver.onPause;
            this.read = subtypeResolver.MediaBrowserCompatCustomActionResultReceiver;
            this.onPlay = subtypeResolver.onPlayFromSearch;
            this.AudioAttributesImplApi21Parcelizer = subtypeResolver.AudioAttributesImplBaseParcelizer;
            this.write = subtypeResolver.AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = subtypeResolver.IconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = new HashSet<>(subtypeResolver.read);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new HashMap<>(subtypeResolver.onAddQueueItem);
        }

        public AudioAttributesCompatParcelizer read(SubtypeResolver subtypeResolver) {
            AudioAttributesCompatParcelizer(subtypeResolver);
            return this;
        }

        public AudioAttributesCompatParcelizer read(Context context, boolean z) {
            Point pointRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(context);
            return read(pointRemoteActionCompatParcelizer.x, pointRemoteActionCompatParcelizer.y, z);
        }

        public AudioAttributesCompatParcelizer read(int i, int i2, boolean z) {
            this.onPrepare = i;
            this.onPlayFromUri = i2;
            this.onPrepareFromMediaId = z;
            return this;
        }

        public AudioAttributesCompatParcelizer write(Context context) {
            CaptioningManager captioningManager;
            if ((LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.onPlayFromMediaId = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.onPause = initExtraTracks.read(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(locale));
                }
            }
            return this;
        }

        public AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            this.read = i;
            return this;
        }

        public AudioAttributesCompatParcelizer write(TypeDeserializer typeDeserializer) {
            write(typeDeserializer.IconCompatParcelizer());
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.put(typeDeserializer.read, typeDeserializer);
            return this;
        }

        public AudioAttributesCompatParcelizer write(int i) {
            Iterator<TypeDeserializer> it = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.values().iterator();
            while (it.hasNext()) {
                if (it.next().IconCompatParcelizer() == i) {
                    it.remove();
                }
            }
            return this;
        }

        public AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i, boolean z) {
            if (z) {
                this.AudioAttributesCompatParcelizer.add(Integer.valueOf(i));
                return this;
            }
            this.AudioAttributesCompatParcelizer.remove(Integer.valueOf(i));
            return this;
        }

        public SubtypeResolver read() {
            return new SubtypeResolver(this);
        }
    }

    public static final class IconCompatParcelizer {
        public static final IconCompatParcelizer IconCompatParcelizer = new write().write();
        public final boolean AudioAttributesCompatParcelizer;
        public final int read;
        public final boolean write;

        /* synthetic */ IconCompatParcelizer(write writeVar, byte b) {
            this(writeVar);
        }

        public static final class write {
            private int RemoteActionCompatParcelizer = 0;
            private boolean read = false;
            private boolean AudioAttributesCompatParcelizer = false;

            public final IconCompatParcelizer write() {
                return new IconCompatParcelizer(this, (byte) 0);
            }
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        }

        private IconCompatParcelizer(write writeVar) {
            this.read = writeVar.RemoteActionCompatParcelizer;
            this.write = writeVar.read;
            this.AudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return this.read == iconCompatParcelizer.read && this.write == iconCompatParcelizer.write && this.AudioAttributesCompatParcelizer == iconCompatParcelizer.AudioAttributesCompatParcelizer;
        }

        public final int hashCode() {
            return ((((this.read + 31) * 31) + (this.write ? 1 : 0)) * 31) + (this.AudioAttributesCompatParcelizer ? 1 : 0);
        }
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(7);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(8);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(9);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(10);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(11);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(12);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(13);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(14);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(15);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(16);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(17);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(18);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(19);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(20);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(21);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(22);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(23);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(24);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(25);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(26);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(27);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(28);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(29);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(30);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(31);
    }

    public SubtypeResolver(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer.MediaMetadataCompat;
        this.MediaBrowserCompatMediaItem = audioAttributesCompatParcelizer.RatingCompat;
        this.MediaDescriptionCompat = audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
        this.onCommand = audioAttributesCompatParcelizer.onCommand;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = audioAttributesCompatParcelizer.MediaDescriptionCompat;
        this.RatingCompat = audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
        this.onPlayFromUri = audioAttributesCompatParcelizer.onPrepare;
        this.onPrepareFromSearch = audioAttributesCompatParcelizer.onPlayFromUri;
        this.onPrepare = audioAttributesCompatParcelizer.onPrepareFromMediaId;
        this.onPlayFromMediaId = audioAttributesCompatParcelizer.onMediaButtonEvent;
        this.onMediaButtonEvent = audioAttributesCompatParcelizer.onFastForward;
        this.handleMediaPlayPauseIfPendingOnHandler = audioAttributesCompatParcelizer.onCustomAction;
        this.onPlay = audioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler;
        this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
        this.AudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        this.onCustomAction = audioAttributesCompatParcelizer.onAddQueueItem;
        this.write = audioAttributesCompatParcelizer.IconCompatParcelizer;
        this.onFastForward = audioAttributesCompatParcelizer.onPause;
        this.onPause = audioAttributesCompatParcelizer.onPlayFromMediaId;
        this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.read;
        this.onPlayFromSearch = audioAttributesCompatParcelizer.onPlay;
        this.AudioAttributesImplBaseParcelizer = audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.write;
        this.IconCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        this.onAddQueueItem = onMoovContainerAtomRead.write(audioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        this.read = onEmsgLeafAtomRead.RemoteActionCompatParcelizer((Collection) audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
    }

    public AudioAttributesCompatParcelizer write() {
        return new AudioAttributesCompatParcelizer(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubtypeResolver subtypeResolver = (SubtypeResolver) obj;
        return this.MediaBrowserCompatSearchResultReceiver == subtypeResolver.MediaBrowserCompatSearchResultReceiver && this.MediaBrowserCompatMediaItem == subtypeResolver.MediaBrowserCompatMediaItem && this.MediaDescriptionCompat == subtypeResolver.MediaDescriptionCompat && this.AudioAttributesImplApi21Parcelizer == subtypeResolver.AudioAttributesImplApi21Parcelizer && this.onCommand == subtypeResolver.onCommand && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == subtypeResolver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.RatingCompat == subtypeResolver.RatingCompat && this.MediaMetadataCompat == subtypeResolver.MediaMetadataCompat && this.onPrepare == subtypeResolver.onPrepare && this.onPlayFromUri == subtypeResolver.onPlayFromUri && this.onPrepareFromSearch == subtypeResolver.onPrepareFromSearch && this.onPlayFromMediaId.equals(subtypeResolver.onPlayFromMediaId) && this.onMediaButtonEvent == subtypeResolver.onMediaButtonEvent && this.handleMediaPlayPauseIfPendingOnHandler.equals(subtypeResolver.handleMediaPlayPauseIfPendingOnHandler) && this.onPlay == subtypeResolver.onPlay && this.MediaBrowserCompatItemReceiver == subtypeResolver.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi26Parcelizer == subtypeResolver.AudioAttributesImplApi26Parcelizer && this.onCustomAction.equals(subtypeResolver.onCustomAction) && this.write.equals(subtypeResolver.write) && this.onFastForward.equals(subtypeResolver.onFastForward) && this.onPause == subtypeResolver.onPause && this.MediaBrowserCompatCustomActionResultReceiver == subtypeResolver.MediaBrowserCompatCustomActionResultReceiver && this.onPlayFromSearch == subtypeResolver.onPlayFromSearch && this.AudioAttributesImplBaseParcelizer == subtypeResolver.AudioAttributesImplBaseParcelizer && this.AudioAttributesCompatParcelizer == subtypeResolver.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == subtypeResolver.IconCompatParcelizer && this.onAddQueueItem.equals(subtypeResolver.onAddQueueItem) && this.read.equals(subtypeResolver.read);
    }

    public int hashCode() {
        int i = this.MediaBrowserCompatSearchResultReceiver;
        int i2 = this.MediaBrowserCompatMediaItem;
        int i3 = this.MediaDescriptionCompat;
        int i4 = this.AudioAttributesImplApi21Parcelizer;
        int i5 = this.onCommand;
        int i6 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i7 = this.RatingCompat;
        int i8 = this.MediaMetadataCompat;
        boolean z = this.onPrepare;
        int i9 = this.onPlayFromUri;
        int i10 = this.onPrepareFromSearch;
        int iHashCode = this.onPlayFromMediaId.hashCode();
        int i11 = this.onMediaButtonEvent;
        int iHashCode2 = this.handleMediaPlayPauseIfPendingOnHandler.hashCode();
        int i12 = this.onPlay;
        int i13 = this.MediaBrowserCompatItemReceiver;
        int i14 = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode3 = this.onCustomAction.hashCode();
        int iHashCode4 = this.write.hashCode();
        int iHashCode5 = this.onFastForward.hashCode();
        int i15 = this.onPause;
        int i16 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z2 = this.onPlayFromSearch;
        boolean z3 = this.AudioAttributesImplBaseParcelizer;
        boolean z4 = this.AudioAttributesCompatParcelizer;
        boolean z5 = this.IconCompatParcelizer;
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + (z ? 1 : 0)) * 31) + i9) * 31) + i10) * 31) + iHashCode) * 31) + i11) * 31) + iHashCode2) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + i15) * 31) + i16) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + (z5 ? 1 : 0)) * 31) + this.onAddQueueItem.hashCode()) * 31) + this.read.hashCode();
    }
}
