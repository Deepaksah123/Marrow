package kotlin;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin._byteOverflow;
import kotlin._deserializeWrappedValue;

/* JADX INFO: loaded from: classes2.dex */
public class _coercedTypeDesc {
    public static Bitmap IconCompatParcelizer(Context context, Bitmap bitmap) {
        return bitmap;
    }

    public static class AudioAttributesImplBaseParcelizer {
        RemoteViews AudioAttributesCompatParcelizer;
        String AudioAttributesImplApi21Parcelizer;
        String AudioAttributesImplApi26Parcelizer;
        int AudioAttributesImplBaseParcelizer;
        AudioAttributesImplApi26Parcelizer IconCompatParcelizer;
        boolean MediaBrowserCompatCustomActionResultReceiver;
        boolean MediaBrowserCompatItemReceiver;
        boolean MediaBrowserCompatMediaItem;
        CharSequence MediaBrowserCompatSearchResultReceiver;
        public Context MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        PendingIntent MediaDescriptionCompat;
        CharSequence MediaMetadataCompat;
        long MediaSessionCompatQueueItem;
        int MediaSessionCompatResultReceiverWrapper;
        CharSequence MediaSessionCompatToken;
        boolean ParcelableVolumeInfo;
        RemoteViews PlaybackStateCompat;
        CharSequence RatingCompat;
        boolean RemoteActionCompatParcelizer;
        RemoteViews handleMediaPlayPauseIfPendingOnHandler;
        Bundle onAddQueueItem;
        PendingIntent onCommand;
        int onCustomAction;
        int onFastForward;
        RemoteViews onMediaButtonEvent;
        boolean onPause;
        ArrayList<write> onPlay;
        String onPlayFromMediaId;
        int onPlayFromSearch;
        IconCompat onPlayFromUri;
        _nonNullNumber onPrepare;
        Notification onPrepareFromMediaId;
        boolean onPrepareFromSearch;
        int onPrepareFromUri;

        @Deprecated
        public ArrayList<String> onRemoveQueueItem;
        public ArrayList<_deserializeWrappedValue> onRemoveQueueItemAt;
        int onRewind;
        boolean onSeekTo;
        String onSetCaptioningEnabled;
        CharSequence onSetPlaybackSpeed;
        int onSetRating;
        CharSequence[] onSetRepeatMode;
        Notification onSetShuffleMode;
        Object onSkipToNext;
        String onSkipToPrevious;
        RatingCompat onSkipToQueueItem;
        boolean onStop;
        public ArrayList<write> read;
        boolean setSessionImpl;
        int write;

        public AudioAttributesImplBaseParcelizer(Context context, Notification notification) {
            this(context, _coercedTypeDesc.AudioAttributesImplApi21Parcelizer(notification));
            Bundle bundle = notification.extras;
            RatingCompat ratingCompatRemoteActionCompatParcelizer = RatingCompat.RemoteActionCompatParcelizer(notification);
            RemoteActionCompatParcelizer(_coercedTypeDesc.MediaBrowserCompatCustomActionResultReceiver(notification)).read(_coercedTypeDesc.AudioAttributesImplBaseParcelizer(notification)).write(_coercedTypeDesc.AudioAttributesImplApi26Parcelizer(notification)).AudioAttributesImplApi21Parcelizer(_coercedTypeDesc.onPlay(notification)).AudioAttributesCompatParcelizer(_coercedTypeDesc.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(notification)).read(ratingCompatRemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(_coercedTypeDesc.MediaBrowserCompatMediaItem(notification)).IconCompatParcelizer(_coercedTypeDesc.onPlayFromSearch(notification)).read(_coercedTypeDesc.onCommand(notification)).RemoteActionCompatParcelizer(notification.when).AudioAttributesImplApi21Parcelizer(_coercedTypeDesc.onPlayFromMediaId(notification)).AudioAttributesImplApi26Parcelizer(_coercedTypeDesc.onPrepare(notification)).RemoteActionCompatParcelizer(_coercedTypeDesc.read(notification)).AudioAttributesImplBaseParcelizer(_coercedTypeDesc.onAddQueueItem(notification)).MediaBrowserCompatCustomActionResultReceiver(_coercedTypeDesc.handleMediaPlayPauseIfPendingOnHandler(notification)).MediaBrowserCompatItemReceiver(_coercedTypeDesc.MediaDescriptionCompat(notification)).AudioAttributesCompatParcelizer(notification.largeIcon).write(_coercedTypeDesc.AudioAttributesCompatParcelizer(notification)).read(_coercedTypeDesc.write(notification)).write(_coercedTypeDesc.IconCompatParcelizer(notification)).read(notification.number).MediaBrowserCompatItemReceiver(notification.tickerText).read(notification.contentIntent).IconCompatParcelizer(notification.deleteIntent).write(notification.fullScreenIntent, _coercedTypeDesc.MediaBrowserCompatSearchResultReceiver(notification)).RemoteActionCompatParcelizer(notification.sound, notification.audioStreamType).write(notification.vibrate).read(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).RemoteActionCompatParcelizer(notification.defaults).AudioAttributesImplApi26Parcelizer(notification.priority).IconCompatParcelizer(_coercedTypeDesc.MediaBrowserCompatItemReceiver(notification)).AudioAttributesImplApi21Parcelizer(_coercedTypeDesc.onPrepareFromSearch(notification)).IconCompatParcelizer(_coercedTypeDesc.onCustomAction(notification)).MediaBrowserCompatCustomActionResultReceiver(_coercedTypeDesc.onMediaButtonEvent(notification)).IconCompatParcelizer(_coercedTypeDesc.onPause(notification)).RemoteActionCompatParcelizer(_coercedTypeDesc.onFastForward(notification)).IconCompatParcelizer(bundle.getInt("android.progressMax"), bundle.getInt("android.progress"), bundle.getBoolean("android.progressIndeterminate")).write(_coercedTypeDesc.RemoteActionCompatParcelizer(notification)).AudioAttributesCompatParcelizer(notification.icon, notification.iconLevel).IconCompatParcelizer(IconCompatParcelizer(notification, ratingCompatRemoteActionCompatParcelizer));
            this.onSkipToNext = IconCompatParcelizer.write(notification);
            Icon iconAudioAttributesCompatParcelizer = IconCompatParcelizer.AudioAttributesCompatParcelizer(notification);
            if (iconAudioAttributesCompatParcelizer != null) {
                this.onPlayFromUri = IconCompat.RemoteActionCompatParcelizer(iconAudioAttributesCompatParcelizer);
            }
            if (notification.actions != null && notification.actions.length != 0) {
                for (Notification.Action action : notification.actions) {
                    RemoteActionCompatParcelizer(write.AudioAttributesCompatParcelizer.write(action).write());
                }
            }
            List<write> listRatingCompat = _coercedTypeDesc.RatingCompat(notification);
            if (!listRatingCompat.isEmpty()) {
                Iterator<write> it = listRatingCompat.iterator();
                while (it.hasNext()) {
                    IconCompatParcelizer(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    IconCompatParcelizer(str);
                }
            }
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    write(_deserializeWrappedValue.AudioAttributesCompatParcelizer((Person) it2.next()));
                }
            }
            if (bundle.containsKey("android.chronometerCountDown")) {
                read(bundle.getBoolean("android.chronometerCountDown"));
            }
            if (bundle.containsKey("android.colorized")) {
                AudioAttributesCompatParcelizer(bundle.getBoolean("android.colorized"));
            }
        }

        private static Bundle IconCompatParcelizer(Notification notification, RatingCompat ratingCompat) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (ratingCompat != null) {
                ratingCompat.IconCompatParcelizer(bundle);
            }
            return bundle;
        }

        public AudioAttributesImplBaseParcelizer(Context context, String str) {
            this.read = new ArrayList<>();
            this.onRemoveQueueItemAt = new ArrayList<>();
            this.onPlay = new ArrayList<>();
            this.setSessionImpl = true;
            this.onPrepareFromSearch = false;
            this.AudioAttributesImplBaseParcelizer = 0;
            this.MediaSessionCompatResultReceiverWrapper = 0;
            this.write = 0;
            this.onFastForward = 0;
            this.onCustomAction = 0;
            Notification notification = new Notification();
            this.onPrepareFromMediaId = notification;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = context;
            this.AudioAttributesImplApi26Parcelizer = str;
            notification.when = System.currentTimeMillis();
            this.onPrepareFromMediaId.audioStreamType = -1;
            this.onRewind = 0;
            this.onRemoveQueueItem = new ArrayList<>();
            this.RemoteActionCompatParcelizer = true;
        }

        @Deprecated
        public AudioAttributesImplBaseParcelizer(Context context) {
            this(context, (String) null);
        }

        public AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(long j) {
            this.onPrepareFromMediaId.when = j;
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesImplApi21Parcelizer(boolean z) {
            this.setSessionImpl = z;
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesImplApi26Parcelizer(boolean z) {
            this.ParcelableVolumeInfo = z;
            return this;
        }

        public AudioAttributesImplBaseParcelizer read(boolean z) {
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            read().putBoolean("android.chronometerCountDown", z);
            return this;
        }

        public AudioAttributesImplBaseParcelizer MediaBrowserCompatItemReceiver(int i) {
            this.onPrepareFromMediaId.icon = i;
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(int i, int i2) {
            this.onPrepareFromMediaId.icon = i;
            this.onPrepareFromMediaId.iconLevel = i2;
            return this;
        }

        public AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.RatingCompat = IconCompatParcelizer(charSequence);
            return this;
        }

        public AudioAttributesImplBaseParcelizer read(CharSequence charSequence) {
            this.MediaMetadataCompat = IconCompatParcelizer(charSequence);
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesImplApi21Parcelizer(CharSequence charSequence) {
            this.MediaSessionCompatToken = IconCompatParcelizer(charSequence);
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(CharSequence charSequence) {
            this.onSetPlaybackSpeed = IconCompatParcelizer(charSequence);
            return this;
        }

        public AudioAttributesImplBaseParcelizer read(int i) {
            this.onPlayFromSearch = i;
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(CharSequence charSequence) {
            this.MediaBrowserCompatSearchResultReceiver = IconCompatParcelizer(charSequence);
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(int i, int i2, boolean z) {
            this.onSetRating = i;
            this.onPrepareFromUri = i2;
            this.onSeekTo = z;
            return this;
        }

        public AudioAttributesImplBaseParcelizer read(PendingIntent pendingIntent) {
            this.MediaDescriptionCompat = pendingIntent;
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(PendingIntent pendingIntent) {
            this.onPrepareFromMediaId.deleteIntent = pendingIntent;
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(PendingIntent pendingIntent, boolean z) {
            this.onCommand = pendingIntent;
            read(128, z);
            return this;
        }

        public AudioAttributesImplBaseParcelizer MediaBrowserCompatItemReceiver(CharSequence charSequence) {
            this.onPrepareFromMediaId.tickerText = IconCompatParcelizer(charSequence);
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(Bitmap bitmap) {
            this.onPlayFromUri = bitmap == null ? null : IconCompat.read(_coercedTypeDesc.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, bitmap));
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(Uri uri) {
            this.onPrepareFromMediaId.sound = uri;
            this.onPrepareFromMediaId.audioStreamType = -1;
            AudioAttributes.Builder builderRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(write.AudioAttributesCompatParcelizer(write.RemoteActionCompatParcelizer(), 4), 5);
            this.onPrepareFromMediaId.audioAttributes = write.read(builderRemoteActionCompatParcelizer);
            return this;
        }

        public AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(Uri uri, int i) {
            this.onPrepareFromMediaId.sound = uri;
            this.onPrepareFromMediaId.audioStreamType = i;
            AudioAttributes.Builder builder = write.read(write.AudioAttributesCompatParcelizer(write.RemoteActionCompatParcelizer(), 4), i);
            this.onPrepareFromMediaId.audioAttributes = write.read(builder);
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(long[] jArr) {
            this.onPrepareFromMediaId.vibrate = jArr;
            return this;
        }

        public AudioAttributesImplBaseParcelizer read(int i, int i2, int i3) {
            this.onPrepareFromMediaId.ledARGB = i;
            this.onPrepareFromMediaId.ledOnMS = i2;
            this.onPrepareFromMediaId.ledOffMS = i3;
            int i4 = (this.onPrepareFromMediaId.ledOnMS == 0 || this.onPrepareFromMediaId.ledOffMS == 0) ? 0 : 1;
            Notification notification = this.onPrepareFromMediaId;
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        public AudioAttributesImplBaseParcelizer MediaBrowserCompatCustomActionResultReceiver(boolean z) {
            read(2, z);
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(boolean z) {
            this.MediaBrowserCompatItemReceiver = z;
            this.MediaBrowserCompatMediaItem = true;
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesImplBaseParcelizer(boolean z) {
            read(8, z);
            return this;
        }

        public AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(boolean z) {
            read(16, z);
            return this;
        }

        public AudioAttributesImplBaseParcelizer MediaBrowserCompatItemReceiver(boolean z) {
            this.onPrepareFromSearch = z;
            return this;
        }

        public AudioAttributesImplBaseParcelizer read(String str) {
            this.AudioAttributesImplApi21Parcelizer = str;
            return this;
        }

        public AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(int i) {
            this.onPrepareFromMediaId.defaults = i;
            if ((i & 4) != 0) {
                this.onPrepareFromMediaId.flags |= 1;
            }
            return this;
        }

        private void read(int i, boolean z) {
            if (z) {
                Notification notification = this.onPrepareFromMediaId;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.onPrepareFromMediaId;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesImplApi26Parcelizer(int i) {
            this.onRewind = i;
            return this;
        }

        @Deprecated
        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(String str) {
            if (str != null && !str.isEmpty()) {
                this.onRemoveQueueItem.add(str);
            }
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(_deserializeWrappedValue _deserializewrappedvalue) {
            if (_deserializewrappedvalue != null) {
                this.onRemoveQueueItemAt.add(_deserializewrappedvalue);
            }
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(String str) {
            this.onPlayFromMediaId = str;
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(boolean z) {
            this.onPause = z;
            return this;
        }

        public AudioAttributesImplBaseParcelizer MediaBrowserCompatCustomActionResultReceiver(String str) {
            this.onSkipToPrevious = str;
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.onAddQueueItem;
                if (bundle2 == null) {
                    this.onAddQueueItem = new Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public Bundle read() {
            if (this.onAddQueueItem == null) {
                this.onAddQueueItem = new Bundle();
            }
            return this.onAddQueueItem;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.read.add(new write(i, charSequence, pendingIntent));
            return this;
        }

        public AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(write writeVar) {
            if (writeVar != null) {
                this.read.add(writeVar);
            }
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(write writeVar) {
            if (writeVar != null) {
                this.onPlay.add(writeVar);
            }
            return this;
        }

        public AudioAttributesImplBaseParcelizer read(RatingCompat ratingCompat) {
            if (this.onSkipToQueueItem != ratingCompat) {
                this.onSkipToQueueItem = ratingCompat;
                if (ratingCompat != null) {
                    ratingCompat.IconCompatParcelizer(this);
                }
            }
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(int i) {
            this.AudioAttributesImplBaseParcelizer = i;
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesImplApi21Parcelizer(int i) {
            this.MediaSessionCompatResultReceiverWrapper = i;
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(Notification notification) {
            this.onSetShuffleMode = notification;
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(RemoteViews remoteViews) {
            this.handleMediaPlayPauseIfPendingOnHandler = remoteViews;
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(RemoteViews remoteViews) {
            this.AudioAttributesCompatParcelizer = remoteViews;
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(String str) {
            this.AudioAttributesImplApi26Parcelizer = str;
            return this;
        }

        public AudioAttributesImplBaseParcelizer IconCompatParcelizer(long j) {
            this.MediaSessionCompatQueueItem = j;
            return this;
        }

        public AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(String str) {
            this.onSetCaptioningEnabled = str;
            return this;
        }

        public AudioAttributesImplBaseParcelizer read(_nonNullNumber _nonnullnumber) {
            this.onPrepare = _nonnullnumber;
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(int i) {
            this.write = i;
            return this;
        }

        public AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer(int i) {
            this.onCustomAction = i;
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            this.IconCompatParcelizer = audioAttributesImplApi26Parcelizer;
            return this;
        }

        public AudioAttributesImplBaseParcelizer write(boolean z) {
            this.RemoteActionCompatParcelizer = z;
            return this;
        }

        public Notification RemoteActionCompatParcelizer() {
            return new _coerceIntegral(this).IconCompatParcelizer();
        }

        protected static CharSequence IconCompatParcelizer(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        static class write {
            static AudioAttributes.Builder RemoteActionCompatParcelizer() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder AudioAttributesCompatParcelizer(AudioAttributes.Builder builder, int i) {
                return builder.setContentType(i);
            }

            static AudioAttributes.Builder RemoteActionCompatParcelizer(AudioAttributes.Builder builder, int i) {
                return builder.setUsage(i);
            }

            static AudioAttributes.Builder read(AudioAttributes.Builder builder, int i) {
                return builder.setLegacyStreamType(i);
            }

            static AudioAttributes read(AudioAttributes.Builder builder) {
                return builder.build();
            }
        }

        static class IconCompatParcelizer {
            static Icon write(Notification notification) {
                return notification.getSmallIcon();
            }

            static Icon AudioAttributesCompatParcelizer(Notification notification) {
                return notification.getLargeIcon();
            }
        }
    }

    public static abstract class RatingCompat {
        boolean AudioAttributesCompatParcelizer = false;
        CharSequence RemoteActionCompatParcelizer;
        protected AudioAttributesImplBaseParcelizer read;
        CharSequence write;

        public RemoteViews AudioAttributesCompatParcelizer(_coerceTextualNull _coercetextualnull) {
            return null;
        }

        public RemoteViews IconCompatParcelizer(_coerceTextualNull _coercetextualnull) {
            return null;
        }

        public RemoteViews RemoteActionCompatParcelizer(_coerceTextualNull _coercetextualnull) {
            return null;
        }

        public void read(_coerceTextualNull _coercetextualnull) {
        }

        protected String write() {
            return null;
        }

        public void IconCompatParcelizer(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            if (this.read != audioAttributesImplBaseParcelizer) {
                this.read = audioAttributesImplBaseParcelizer;
                if (audioAttributesImplBaseParcelizer != null) {
                    audioAttributesImplBaseParcelizer.read(this);
                }
            }
        }

        public void AudioAttributesCompatParcelizer(Bundle bundle) {
            if (this.AudioAttributesCompatParcelizer) {
                bundle.putCharSequence("android.summaryText", this.write);
            }
            CharSequence charSequence = this.RemoteActionCompatParcelizer;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strWrite = write();
            if (strWrite != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strWrite);
            }
        }

        protected void read(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.write = bundle.getCharSequence("android.summaryText");
                this.AudioAttributesCompatParcelizer = true;
            }
            this.RemoteActionCompatParcelizer = bundle.getCharSequence("android.title.big");
        }

        protected void IconCompatParcelizer(Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        public static RatingCompat RemoteActionCompatParcelizer(Notification notification) {
            Bundle bundleMediaMetadataCompat = _coercedTypeDesc.MediaMetadataCompat(notification);
            if (bundleMediaMetadataCompat == null) {
                return null;
            }
            return MediaBrowserCompatCustomActionResultReceiver(bundleMediaMetadataCompat);
        }

        private static RatingCompat write(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new read();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new AudioAttributesImplApi21Parcelizer();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new MediaBrowserCompatMediaItem();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new MediaDescriptionCompat();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new MediaBrowserCompatCustomActionResultReceiver();
            }
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static o._coercedTypeDesc.RatingCompat read(java.lang.String r6) {
            /*
                if (r6 == 0) goto L80
                r6.hashCode()
                int r0 = r6.hashCode()
                r1 = 5
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                switch(r0) {
                    case -716705180: goto L44;
                    case -171946061: goto L3a;
                    case 714386739: goto L30;
                    case 912942987: goto L26;
                    case 919595044: goto L1c;
                    case 2090799565: goto L12;
                    default: goto L11;
                }
            L11:
                goto L4e
            L12:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$MessagingStyle"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L4e
                r6 = r1
                goto L4f
            L1c:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L4e
                r6 = r2
                goto L4f
            L26:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$InboxStyle"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L4e
                r6 = r3
                goto L4f
            L30:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$CallStyle"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L4e
                r6 = r4
                goto L4f
            L3a:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L4e
                r6 = r5
                goto L4f
            L44:
                java.lang.String r0 = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L4e
                r6 = 0
                goto L4f
            L4e:
                r6 = -1
            L4f:
                if (r6 == 0) goto L7a
                if (r6 == r5) goto L74
                if (r6 == r4) goto L6e
                if (r6 == r3) goto L68
                if (r6 == r2) goto L62
                if (r6 == r1) goto L5c
                goto L80
            L5c:
                o._coercedTypeDesc$MediaDescriptionCompat r6 = new o._coercedTypeDesc$MediaDescriptionCompat
                r6.<init>()
                return r6
            L62:
                o._coercedTypeDesc$AudioAttributesImplApi21Parcelizer r6 = new o._coercedTypeDesc$AudioAttributesImplApi21Parcelizer
                r6.<init>()
                return r6
            L68:
                o._coercedTypeDesc$MediaBrowserCompatMediaItem r6 = new o._coercedTypeDesc$MediaBrowserCompatMediaItem
                r6.<init>()
                return r6
            L6e:
                o._coercedTypeDesc$MediaBrowserCompatItemReceiver r6 = new o._coercedTypeDesc$MediaBrowserCompatItemReceiver
                r6.<init>()
                return r6
            L74:
                o._coercedTypeDesc$read r6 = new o._coercedTypeDesc$read
                r6.<init>()
                return r6
            L7a:
                o._coercedTypeDesc$MediaBrowserCompatCustomActionResultReceiver r6 = new o._coercedTypeDesc$MediaBrowserCompatCustomActionResultReceiver
                r6.<init>()
                return r6
            L80:
                r6 = 0
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o._coercedTypeDesc.RatingCompat.read(java.lang.String):o._coercedTypeDesc$RatingCompat");
        }

        static RatingCompat write(Bundle bundle) {
            RatingCompat ratingCompat = read(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            if (ratingCompat != null) {
                return ratingCompat;
            }
            if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                return new MediaDescriptionCompat();
            }
            if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
                return new read();
            }
            if (bundle.containsKey("android.bigText")) {
                return new AudioAttributesImplApi21Parcelizer();
            }
            if (bundle.containsKey("android.textLines")) {
                return new MediaBrowserCompatMediaItem();
            }
            if (bundle.containsKey("android.callType")) {
                return new MediaBrowserCompatItemReceiver();
            }
            return write(bundle.getString("android.template"));
        }

        static RatingCompat MediaBrowserCompatCustomActionResultReceiver(Bundle bundle) {
            RatingCompat ratingCompatWrite = write(bundle);
            if (ratingCompatWrite == null) {
                return null;
            }
            try {
                ratingCompatWrite.read(bundle);
                return ratingCompatWrite;
            } catch (ClassCastException unused) {
                return null;
            }
        }
    }

    public static class read extends RatingCompat {
        private CharSequence AudioAttributesImplApi26Parcelizer;
        private IconCompat AudioAttributesImplBaseParcelizer;
        private IconCompat IconCompatParcelizer;
        private boolean MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;

        public read RemoteActionCompatParcelizer(CharSequence charSequence) {
            this.RemoteActionCompatParcelizer = AudioAttributesImplBaseParcelizer.IconCompatParcelizer(charSequence);
            return this;
        }

        public read AudioAttributesCompatParcelizer(CharSequence charSequence) {
            this.write = AudioAttributesImplBaseParcelizer.IconCompatParcelizer(charSequence);
            this.AudioAttributesCompatParcelizer = true;
            return this;
        }

        public read read(CharSequence charSequence) {
            this.AudioAttributesImplApi26Parcelizer = charSequence;
            return this;
        }

        public read write(Bitmap bitmap) {
            this.AudioAttributesImplBaseParcelizer = bitmap == null ? null : IconCompat.read(bitmap);
            return this;
        }

        public read AudioAttributesCompatParcelizer(Icon icon) {
            this.AudioAttributesImplBaseParcelizer = IconCompat.RemoteActionCompatParcelizer(icon);
            return this;
        }

        public read read(Bitmap bitmap) {
            this.IconCompatParcelizer = bitmap == null ? null : IconCompat.read(bitmap);
            this.MediaBrowserCompatCustomActionResultReceiver = true;
            return this;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected String write() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void read(_coerceTextualNull _coercetextualnull) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(_coercetextualnull.AudioAttributesCompatParcelizer()).setBigContentTitle(this.RemoteActionCompatParcelizer);
            if (this.AudioAttributesImplBaseParcelizer != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    IconCompatParcelizer.read(bigContentTitle, this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(_coercetextualnull instanceof _coerceIntegral ? ((_coerceIntegral) _coercetextualnull).read() : null));
                } else if (this.AudioAttributesImplBaseParcelizer.read() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer());
                }
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                if (this.IconCompatParcelizer == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    AudioAttributesCompatParcelizer.read(bigContentTitle, this.IconCompatParcelizer.AudioAttributesCompatParcelizer(_coercetextualnull instanceof _coerceIntegral ? ((_coerceIntegral) _coercetextualnull).read() : null));
                }
            }
            if (this.AudioAttributesCompatParcelizer) {
                bigContentTitle.setSummaryText(this.write);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                IconCompatParcelizer.write(bigContentTitle, this.MediaBrowserCompatItemReceiver);
                IconCompatParcelizer.RemoteActionCompatParcelizer(bigContentTitle, this.AudioAttributesImplApi26Parcelizer);
            }
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected void read(Bundle bundle) {
            super.read(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.IconCompatParcelizer = write(bundle.getParcelable("android.largeIcon.big"));
                this.MediaBrowserCompatCustomActionResultReceiver = true;
            }
            this.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(bundle);
            this.MediaBrowserCompatItemReceiver = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public static IconCompat RemoteActionCompatParcelizer(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            if (parcelable != null) {
                return write(parcelable);
            }
            return write(bundle.getParcelable("android.pictureIcon"));
        }

        private static IconCompat write(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.RemoteActionCompatParcelizer((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.read((Bitmap) parcelable);
            }
            return null;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected void IconCompatParcelizer(Bundle bundle) {
            super.IconCompatParcelizer(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.pictureIcon");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }

        static class AudioAttributesCompatParcelizer {
            static void read(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        static class IconCompatParcelizer {
            static void write(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }

            static void RemoteActionCompatParcelizer(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void read(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }
        }
    }

    public static class AudioAttributesImplApi21Parcelizer extends RatingCompat {
        private CharSequence IconCompatParcelizer;

        public AudioAttributesImplApi21Parcelizer read(CharSequence charSequence) {
            this.RemoteActionCompatParcelizer = AudioAttributesImplBaseParcelizer.IconCompatParcelizer(charSequence);
            return this;
        }

        public AudioAttributesImplApi21Parcelizer IconCompatParcelizer(CharSequence charSequence) {
            this.write = AudioAttributesImplBaseParcelizer.IconCompatParcelizer(charSequence);
            this.AudioAttributesCompatParcelizer = true;
            return this;
        }

        public AudioAttributesImplApi21Parcelizer AudioAttributesCompatParcelizer(CharSequence charSequence) {
            this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer.IconCompatParcelizer(charSequence);
            return this;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected String write() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void read(_coerceTextualNull _coercetextualnull) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(_coercetextualnull.AudioAttributesCompatParcelizer()).setBigContentTitle(this.RemoteActionCompatParcelizer).bigText(this.IconCompatParcelizer);
            if (this.AudioAttributesCompatParcelizer) {
                bigTextStyleBigText.setSummaryText(this.write);
            }
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected void read(Bundle bundle) {
            super.read(bundle);
            this.IconCompatParcelizer = bundle.getCharSequence("android.bigText");
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void AudioAttributesCompatParcelizer(Bundle bundle) {
            super.AudioAttributesCompatParcelizer(bundle);
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected void IconCompatParcelizer(Bundle bundle) {
            super.IconCompatParcelizer(bundle);
            bundle.remove("android.bigText");
        }
    }

    public static class MediaDescriptionCompat extends RatingCompat {
        private final List<AudioAttributesCompatParcelizer> AudioAttributesImplApi21Parcelizer = new ArrayList();
        private final List<AudioAttributesCompatParcelizer> AudioAttributesImplApi26Parcelizer = new ArrayList();
        private _deserializeWrappedValue AudioAttributesImplBaseParcelizer;
        private CharSequence IconCompatParcelizer;
        private Boolean MediaBrowserCompatItemReceiver;

        MediaDescriptionCompat() {
        }

        public MediaDescriptionCompat read(boolean z) {
            this.MediaBrowserCompatItemReceiver = Boolean.valueOf(z);
            return this;
        }

        public boolean AudioAttributesCompatParcelizer() {
            if (this.read != null && this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getApplicationInfo().targetSdkVersion < 28 && this.MediaBrowserCompatItemReceiver == null) {
                return this.IconCompatParcelizer != null;
            }
            Boolean bool = this.MediaBrowserCompatItemReceiver;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected String write() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void read(_coerceTextualNull _coercetextualnull) {
            read(AudioAttributesCompatParcelizer());
            Notification.MessagingStyle messagingStyleWrite = IconCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer());
            Iterator<AudioAttributesCompatParcelizer> it = this.AudioAttributesImplApi21Parcelizer.iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer.write(messagingStyleWrite, it.next().AudioAttributesImplBaseParcelizer());
            }
            Iterator<AudioAttributesCompatParcelizer> it2 = this.AudioAttributesImplApi26Parcelizer.iterator();
            while (it2.hasNext()) {
                read.read(messagingStyleWrite, it2.next().AudioAttributesImplBaseParcelizer());
            }
            RemoteActionCompatParcelizer.write(messagingStyleWrite, this.IconCompatParcelizer);
            IconCompatParcelizer.read(messagingStyleWrite, this.MediaBrowserCompatItemReceiver.booleanValue());
            messagingStyleWrite.setBuilder(_coercetextualnull.AudioAttributesCompatParcelizer());
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void AudioAttributesCompatParcelizer(Bundle bundle) {
            super.AudioAttributesCompatParcelizer(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer());
            bundle.putBundle("android.messagingStyleUser", this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer());
            bundle.putCharSequence("android.hiddenConversationTitle", this.IconCompatParcelizer);
            if (this.IconCompatParcelizer != null && this.MediaBrowserCompatItemReceiver.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.IconCompatParcelizer);
            }
            if (!this.AudioAttributesImplApi21Parcelizer.isEmpty()) {
                bundle.putParcelableArray("android.messages", AudioAttributesCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer));
            }
            if (!this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", AudioAttributesCompatParcelizer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer));
            }
            Boolean bool = this.MediaBrowserCompatItemReceiver;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected void read(Bundle bundle) {
            super.read(bundle);
            this.AudioAttributesImplApi21Parcelizer.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.AudioAttributesImplBaseParcelizer = _deserializeWrappedValue.IconCompatParcelizer(bundle.getBundle("android.messagingStyleUser"));
            } else {
                this.AudioAttributesImplBaseParcelizer = new _deserializeWrappedValue.write().IconCompatParcelizer((CharSequence) bundle.getString("android.selfDisplayName")).RemoteActionCompatParcelizer();
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.IconCompatParcelizer = charSequence;
            if (charSequence == null) {
                this.IconCompatParcelizer = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.AudioAttributesImplApi21Parcelizer.addAll(AudioAttributesCompatParcelizer.write(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.AudioAttributesImplApi26Parcelizer.addAll(AudioAttributesCompatParcelizer.write(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.MediaBrowserCompatItemReceiver = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected void IconCompatParcelizer(Bundle bundle) {
            super.IconCompatParcelizer(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }

        public static final class AudioAttributesCompatParcelizer {
            private Bundle AudioAttributesCompatParcelizer = new Bundle();
            private final long AudioAttributesImplApi21Parcelizer;
            private Uri IconCompatParcelizer;
            private final CharSequence RemoteActionCompatParcelizer;
            private final _deserializeWrappedValue read;
            private String write;

            public AudioAttributesCompatParcelizer(CharSequence charSequence, long j, _deserializeWrappedValue _deserializewrappedvalue) {
                this.RemoteActionCompatParcelizer = charSequence;
                this.AudioAttributesImplApi21Parcelizer = j;
                this.read = _deserializewrappedvalue;
            }

            public final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(String str, Uri uri) {
                this.write = str;
                this.IconCompatParcelizer = uri;
                return this;
            }

            public final CharSequence AudioAttributesCompatParcelizer() {
                return this.RemoteActionCompatParcelizer;
            }

            public final long MediaBrowserCompatItemReceiver() {
                return this.AudioAttributesImplApi21Parcelizer;
            }

            public final Bundle read() {
                return this.AudioAttributesCompatParcelizer;
            }

            public final _deserializeWrappedValue IconCompatParcelizer() {
                return this.read;
            }

            public final String write() {
                return this.write;
            }

            public final Uri RemoteActionCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            private Bundle MediaBrowserCompatCustomActionResultReceiver() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.RemoteActionCompatParcelizer;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.AudioAttributesImplApi21Parcelizer);
                _deserializeWrappedValue _deserializewrappedvalue = this.read;
                if (_deserializewrappedvalue != null) {
                    bundle.putCharSequence("sender", _deserializewrappedvalue.AudioAttributesCompatParcelizer());
                    bundle.putParcelable("sender_person", write.RemoteActionCompatParcelizer(this.read.AudioAttributesImplApi21Parcelizer()));
                }
                String str = this.write;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.IconCompatParcelizer;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.AudioAttributesCompatParcelizer;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            static Bundle[] IconCompatParcelizer(List<AudioAttributesCompatParcelizer> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).MediaBrowserCompatCustomActionResultReceiver();
                }
                return bundleArr;
            }

            static List<AudioAttributesCompatParcelizer> write(Parcelable[] parcelableArr) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (audioAttributesCompatParcelizerWrite = write((Bundle) parcelable)) != null) {
                        arrayList.add(audioAttributesCompatParcelizerWrite);
                    }
                }
                return arrayList;
            }

            static AudioAttributesCompatParcelizer write(Bundle bundle) {
                _deserializeWrappedValue _deserializewrappedvalueRemoteActionCompatParcelizer;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            _deserializewrappedvalueRemoteActionCompatParcelizer = _deserializeWrappedValue.IconCompatParcelizer(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person")) {
                            _deserializewrappedvalueRemoteActionCompatParcelizer = _deserializeWrappedValue.AudioAttributesCompatParcelizer((Person) bundle.getParcelable("sender_person"));
                        } else {
                            _deserializewrappedvalueRemoteActionCompatParcelizer = bundle.containsKey("sender") ? new _deserializeWrappedValue.write().IconCompatParcelizer(bundle.getCharSequence("sender")).RemoteActionCompatParcelizer() : null;
                        }
                        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(bundle.getCharSequence("text"), bundle.getLong("time"), _deserializewrappedvalueRemoteActionCompatParcelizer);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            audioAttributesCompatParcelizer.read().putAll(bundle.getBundle("extras"));
                        }
                        return audioAttributesCompatParcelizer;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            final Notification.MessagingStyle.Message AudioAttributesImplBaseParcelizer() {
                _deserializeWrappedValue _deserializewrappedvalueIconCompatParcelizer = IconCompatParcelizer();
                Notification.MessagingStyle.Message messageRemoteActionCompatParcelizer = write.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(), MediaBrowserCompatItemReceiver(), _deserializewrappedvalueIconCompatParcelizer == null ? null : _deserializewrappedvalueIconCompatParcelizer.AudioAttributesImplApi21Parcelizer());
                if (write() != null) {
                    RemoteActionCompatParcelizer.IconCompatParcelizer(messageRemoteActionCompatParcelizer, write(), RemoteActionCompatParcelizer());
                }
                return messageRemoteActionCompatParcelizer;
            }

            static class RemoteActionCompatParcelizer {
                static Notification.MessagingStyle.Message IconCompatParcelizer(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class write {
                static Parcelable RemoteActionCompatParcelizer(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message RemoteActionCompatParcelizer(CharSequence charSequence, long j, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }
        }

        static class RemoteActionCompatParcelizer {
            static Notification.MessagingStyle write(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle write(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class read {
            static Notification.MessagingStyle read(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class IconCompatParcelizer {
            static Notification.MessagingStyle write(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle read(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }
    }

    public static class MediaBrowserCompatItemReceiver extends RatingCompat {
        private int AudioAttributesImplApi21Parcelizer;
        private Integer AudioAttributesImplApi26Parcelizer;
        private PendingIntent AudioAttributesImplBaseParcelizer;
        private Integer IconCompatParcelizer;
        private PendingIntent MediaBrowserCompatCustomActionResultReceiver;
        private PendingIntent MediaBrowserCompatItemReceiver;
        private CharSequence MediaBrowserCompatMediaItem;
        private IconCompat MediaBrowserCompatSearchResultReceiver;
        private boolean MediaMetadataCompat;
        private _deserializeWrappedValue RatingCompat;

        @Override // o._coercedTypeDesc.RatingCompat
        protected void read(Bundle bundle) {
            super.read(bundle);
            this.AudioAttributesImplApi21Parcelizer = bundle.getInt("android.callType");
            this.MediaMetadataCompat = bundle.getBoolean("android.callIsVideo");
            if (bundle.containsKey("android.callPerson")) {
                this.RatingCompat = _deserializeWrappedValue.AudioAttributesCompatParcelizer((Person) bundle.getParcelable("android.callPerson"));
            } else if (bundle.containsKey("android.callPersonCompat")) {
                this.RatingCompat = _deserializeWrappedValue.IconCompatParcelizer(bundle.getBundle("android.callPersonCompat"));
            }
            if (bundle.containsKey("android.verificationIcon")) {
                this.MediaBrowserCompatSearchResultReceiver = IconCompat.RemoteActionCompatParcelizer((Icon) bundle.getParcelable("android.verificationIcon"));
            } else if (bundle.containsKey("android.verificationIconCompat")) {
                this.MediaBrowserCompatSearchResultReceiver = IconCompat.AudioAttributesCompatParcelizer(bundle.getBundle("android.verificationIconCompat"));
            }
            this.MediaBrowserCompatMediaItem = bundle.getCharSequence("android.verificationText");
            this.MediaBrowserCompatCustomActionResultReceiver = (PendingIntent) bundle.getParcelable("android.answerIntent");
            this.AudioAttributesImplBaseParcelizer = (PendingIntent) bundle.getParcelable("android.declineIntent");
            this.MediaBrowserCompatItemReceiver = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
            this.IconCompatParcelizer = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
            this.AudioAttributesImplApi26Parcelizer = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void AudioAttributesCompatParcelizer(Bundle bundle) {
            super.AudioAttributesCompatParcelizer(bundle);
            bundle.putInt("android.callType", this.AudioAttributesImplApi21Parcelizer);
            bundle.putBoolean("android.callIsVideo", this.MediaMetadataCompat);
            _deserializeWrappedValue _deserializewrappedvalue = this.RatingCompat;
            if (_deserializewrappedvalue != null) {
                bundle.putParcelable("android.callPerson", IconCompatParcelizer.write(_deserializewrappedvalue.AudioAttributesImplApi21Parcelizer()));
            }
            IconCompat iconCompat = this.MediaBrowserCompatSearchResultReceiver;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iconCompat.AudioAttributesCompatParcelizer(this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)));
            }
            bundle.putCharSequence("android.verificationText", this.MediaBrowserCompatMediaItem);
            bundle.putParcelable("android.answerIntent", this.MediaBrowserCompatCustomActionResultReceiver);
            bundle.putParcelable("android.declineIntent", this.AudioAttributesImplBaseParcelizer);
            bundle.putParcelable("android.hangUpIntent", this.MediaBrowserCompatItemReceiver);
            Integer num = this.IconCompatParcelizer;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.AudioAttributesImplApi26Parcelizer;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected String write() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void read(_coerceTextualNull _coercetextualnull) {
            CharSequence charSequenceAudioAttributesCompatParcelizer = null;
            callStyleCj_ = null;
            Notification.CallStyle callStyleCj_ = null;
            charSequenceAudioAttributesCompatParcelizer = null;
            if (Build.VERSION.SDK_INT >= 31) {
                int i = this.AudioAttributesImplApi21Parcelizer;
                if (i == 1) {
                    callStyleCj_ = write.cj_(this.RatingCompat.AudioAttributesImplApi21Parcelizer(), this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
                } else if (i == 2) {
                    callStyleCj_ = write.ck_(this.RatingCompat.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatItemReceiver);
                } else if (i == 3) {
                    callStyleCj_ = write.cl_(this.RatingCompat.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatItemReceiver, this.MediaBrowserCompatCustomActionResultReceiver);
                } else if (Log.isLoggable("NotifCompat", 3)) {
                    String.valueOf(this.AudioAttributesImplApi21Parcelizer);
                }
                if (callStyleCj_ != null) {
                    callStyleCj_.setBuilder(_coercetextualnull.AudioAttributesCompatParcelizer());
                    Integer num = this.IconCompatParcelizer;
                    if (num != null) {
                        write.cm_(callStyleCj_, num.intValue());
                    }
                    Integer num2 = this.AudioAttributesImplApi26Parcelizer;
                    if (num2 != null) {
                        write.cn_(callStyleCj_, num2.intValue());
                    }
                    write.cq_(callStyleCj_, this.MediaBrowserCompatMediaItem);
                    IconCompat iconCompat = this.MediaBrowserCompatSearchResultReceiver;
                    if (iconCompat != null) {
                        write.cp_(callStyleCj_, iconCompat.AudioAttributesCompatParcelizer(this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                    }
                    write.co_(callStyleCj_, this.MediaMetadataCompat);
                    return;
                }
                return;
            }
            Notification.Builder builderAudioAttributesCompatParcelizer = _coercetextualnull.AudioAttributesCompatParcelizer();
            _deserializeWrappedValue _deserializewrappedvalue = this.RatingCompat;
            builderAudioAttributesCompatParcelizer.setContentTitle(_deserializewrappedvalue != null ? _deserializewrappedvalue.AudioAttributesCompatParcelizer() : null);
            if (this.read.onAddQueueItem != null && this.read.onAddQueueItem.containsKey("android.text")) {
                charSequenceAudioAttributesCompatParcelizer = this.read.onAddQueueItem.getCharSequence("android.text");
            }
            if (charSequenceAudioAttributesCompatParcelizer == null) {
                charSequenceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            }
            builderAudioAttributesCompatParcelizer.setContentText(charSequenceAudioAttributesCompatParcelizer);
            _deserializeWrappedValue _deserializewrappedvalue2 = this.RatingCompat;
            if (_deserializewrappedvalue2 != null) {
                if (_deserializewrappedvalue2.write() != null) {
                    AudioAttributesCompatParcelizer.write(builderAudioAttributesCompatParcelizer, this.RatingCompat.write().AudioAttributesCompatParcelizer(this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
                }
                IconCompatParcelizer.AudioAttributesCompatParcelizer(builderAudioAttributesCompatParcelizer, this.RatingCompat.AudioAttributesImplApi21Parcelizer());
            }
            RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(builderAudioAttributesCompatParcelizer, "call");
        }

        private String AudioAttributesCompatParcelizer() {
            int i = this.AudioAttributesImplApi21Parcelizer;
            if (i == 1) {
                return this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getResources().getString(_byteOverflow.write.call_notification_incoming_text);
            }
            if (i == 2) {
                return this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getResources().getString(_byteOverflow.write.call_notification_ongoing_text);
            }
            if (i != 3) {
                return null;
            }
            return this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getResources().getString(_byteOverflow.write.call_notification_screening_text);
        }

        private write read() {
            int i = _byteOverflow.read.ic_call_decline;
            if (this.AudioAttributesImplBaseParcelizer == null) {
                return AudioAttributesCompatParcelizer(i, _byteOverflow.write.call_notification_hang_up_action, this.AudioAttributesImplApi26Parcelizer, _byteOverflow.AudioAttributesCompatParcelizer.call_notification_decline_color, this.MediaBrowserCompatItemReceiver);
            }
            return AudioAttributesCompatParcelizer(i, _byteOverflow.write.call_notification_decline_action, this.AudioAttributesImplApi26Parcelizer, _byteOverflow.AudioAttributesCompatParcelizer.call_notification_decline_color, this.AudioAttributesImplBaseParcelizer);
        }

        private write RemoteActionCompatParcelizer() {
            int i;
            int i2 = _byteOverflow.read.ic_call_answer_video;
            int i3 = _byteOverflow.read.ic_call_answer;
            if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
                return null;
            }
            boolean z = this.MediaMetadataCompat;
            int i4 = !z ? i3 : i2;
            if (z) {
                i = _byteOverflow.write.call_notification_answer_video_action;
            } else {
                i = _byteOverflow.write.call_notification_answer_action;
            }
            return AudioAttributesCompatParcelizer(i4, i, this.IconCompatParcelizer, _byteOverflow.AudioAttributesCompatParcelizer.call_notification_answer_color, this.MediaBrowserCompatCustomActionResultReceiver);
        }

        private write AudioAttributesCompatParcelizer(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(_isNaN.getColor(this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            write writeVarWrite = new write.AudioAttributesCompatParcelizer(IconCompat.AudioAttributesCompatParcelizer(this.read.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, i), spannableStringBuilder, pendingIntent).write();
            writeVarWrite.RemoteActionCompatParcelizer().putBoolean("key_action_priority", true);
            return writeVarWrite;
        }

        private boolean read(write writeVar) {
            return writeVar != null && writeVar.RemoteActionCompatParcelizer().getBoolean("key_action_priority");
        }

        public ArrayList<write> IconCompatParcelizer() {
            write writeVar = read();
            write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            ArrayList<write> arrayList = new ArrayList<>(3);
            arrayList.add(writeVar);
            ArrayList<write> arrayList2 = this.read.read;
            int i = 2;
            if (arrayList2 != null) {
                for (write writeVar2 : arrayList2) {
                    if (writeVar2.MediaBrowserCompatItemReceiver()) {
                        arrayList.add(writeVar2);
                    } else if (!read(writeVar2) && i > 1) {
                        arrayList.add(writeVar2);
                        i--;
                    }
                    if (writeVarRemoteActionCompatParcelizer != null && i == 1) {
                        arrayList.add(writeVarRemoteActionCompatParcelizer);
                        i--;
                    }
                }
            }
            if (writeVarRemoteActionCompatParcelizer != null && i > 0) {
                arrayList.add(writeVarRemoteActionCompatParcelizer);
            }
            return arrayList;
        }

        static class RemoteActionCompatParcelizer {
            static Notification.Builder AudioAttributesCompatParcelizer(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        static class AudioAttributesCompatParcelizer {
            static Parcelable RemoteActionCompatParcelizer(Icon icon) {
                return icon;
            }

            static void write(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        static class IconCompatParcelizer {
            static Parcelable write(Person person) {
                return person;
            }

            static Notification.Builder AudioAttributesCompatParcelizer(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }
        }

        static class write {
            static Notification.CallStyle cj_(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle ck_(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle cl_(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle co_(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            static Notification.CallStyle cp_(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle cq_(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }

            static Notification.CallStyle cm_(Notification.CallStyle callStyle, int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            static Notification.CallStyle cn_(Notification.CallStyle callStyle, int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }
        }
    }

    public static class MediaBrowserCompatMediaItem extends RatingCompat {
        private ArrayList<CharSequence> IconCompatParcelizer = new ArrayList<>();

        @Override // o._coercedTypeDesc.RatingCompat
        protected String write() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void read(_coerceTextualNull _coercetextualnull) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(_coercetextualnull.AudioAttributesCompatParcelizer()).setBigContentTitle(this.RemoteActionCompatParcelizer);
            if (this.AudioAttributesCompatParcelizer) {
                bigContentTitle.setSummaryText(this.write);
            }
            Iterator<CharSequence> it = this.IconCompatParcelizer.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected void read(Bundle bundle) {
            super.read(bundle);
            this.IconCompatParcelizer.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.IconCompatParcelizer, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected void IconCompatParcelizer(Bundle bundle) {
            super.IconCompatParcelizer(bundle);
            bundle.remove("android.textLines");
        }
    }

    public static class MediaBrowserCompatCustomActionResultReceiver extends RatingCompat {
        @Override // o._coercedTypeDesc.RatingCompat
        public RemoteViews AudioAttributesCompatParcelizer(_coerceTextualNull _coercetextualnull) {
            return null;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public RemoteViews IconCompatParcelizer(_coerceTextualNull _coercetextualnull) {
            return null;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public RemoteViews RemoteActionCompatParcelizer(_coerceTextualNull _coercetextualnull) {
            return null;
        }

        @Override // o._coercedTypeDesc.RatingCompat
        protected String write() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // o._coercedTypeDesc.RatingCompat
        public void read(_coerceTextualNull _coercetextualnull) {
            _coercetextualnull.AudioAttributesCompatParcelizer().setStyle(IconCompatParcelizer.read());
        }

        static class IconCompatParcelizer {
            static Notification.Style read() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }
    }

    public static class write {
        public PendingIntent AudioAttributesCompatParcelizer;
        private final _findNullProvider[] AudioAttributesImplApi21Parcelizer;
        private final boolean AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        boolean IconCompatParcelizer;
        private IconCompat MediaBrowserCompatCustomActionResultReceiver;
        private boolean MediaBrowserCompatItemReceiver;
        private final int MediaBrowserCompatMediaItem;
        private final _findNullProvider[] MediaMetadataCompat;
        public CharSequence RemoteActionCompatParcelizer;
        final Bundle read;

        @Deprecated
        public int write;

        public write(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.RemoteActionCompatParcelizer(null, "", i) : null, charSequence, pendingIntent);
        }

        public write(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (_findNullProvider[]) null, (_findNullProvider[]) null, true, 0, true, false, false);
        }

        write(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, _findNullProvider[] _findnullproviderArr, _findNullProvider[] _findnullproviderArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? IconCompat.RemoteActionCompatParcelizer(null, "", i) : null, charSequence, pendingIntent, bundle, _findnullproviderArr, _findnullproviderArr2, z, i2, z2, z3, z4);
        }

        write(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, _findNullProvider[] _findnullproviderArr, _findNullProvider[] _findnullproviderArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.IconCompatParcelizer = true;
            this.MediaBrowserCompatCustomActionResultReceiver = iconCompat;
            if (iconCompat != null && iconCompat.read() == 2) {
                this.write = iconCompat.IconCompatParcelizer();
            }
            this.RemoteActionCompatParcelizer = AudioAttributesImplBaseParcelizer.IconCompatParcelizer(charSequence);
            this.AudioAttributesCompatParcelizer = pendingIntent;
            this.read = bundle == null ? new Bundle() : bundle;
            this.MediaMetadataCompat = _findnullproviderArr;
            this.AudioAttributesImplApi21Parcelizer = _findnullproviderArr2;
            this.AudioAttributesImplBaseParcelizer = z;
            this.MediaBrowserCompatMediaItem = i;
            this.IconCompatParcelizer = z2;
            this.AudioAttributesImplApi26Parcelizer = z3;
            this.MediaBrowserCompatItemReceiver = z4;
        }

        public IconCompat IconCompatParcelizer() {
            int i;
            if (this.MediaBrowserCompatCustomActionResultReceiver == null && (i = this.write) != 0) {
                this.MediaBrowserCompatCustomActionResultReceiver = IconCompat.RemoteActionCompatParcelizer(null, "", i);
            }
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public CharSequence AudioAttributesImplApi26Parcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public PendingIntent read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public Bundle RemoteActionCompatParcelizer() {
            return this.read;
        }

        public boolean AudioAttributesCompatParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public boolean AudioAttributesImplApi21Parcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public _findNullProvider[] write() {
            return this.MediaMetadataCompat;
        }

        public int AudioAttributesImplBaseParcelizer() {
            return this.MediaBrowserCompatMediaItem;
        }

        public boolean MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public boolean MediaBrowserCompatCustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }

        public static final class AudioAttributesCompatParcelizer {
            private final IconCompat AudioAttributesCompatParcelizer;
            private ArrayList<_findNullProvider> AudioAttributesImplApi21Parcelizer;
            private boolean AudioAttributesImplApi26Parcelizer;
            private boolean AudioAttributesImplBaseParcelizer;
            private boolean IconCompatParcelizer;
            private final CharSequence MediaBrowserCompatCustomActionResultReceiver;
            private int MediaBrowserCompatItemReceiver;
            private final Bundle RemoteActionCompatParcelizer;
            private final PendingIntent read;
            private boolean write;

            public static AudioAttributesCompatParcelizer write(Notification.Action action) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
                if (read.RemoteActionCompatParcelizer(action) != null) {
                    audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(IconCompat.AudioAttributesCompatParcelizer(read.RemoteActionCompatParcelizer(action)), action.title, action.actionIntent);
                } else {
                    audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(action.icon, action.title, action.actionIntent);
                }
                RemoteInput[] remoteInputArrWrite = C0053AudioAttributesCompatParcelizer.write(action);
                if (remoteInputArrWrite != null && remoteInputArrWrite.length != 0) {
                    for (RemoteInput remoteInput : remoteInputArrWrite) {
                        audioAttributesCompatParcelizer.write(_findNullProvider.RemoteActionCompatParcelizer(remoteInput));
                    }
                }
                audioAttributesCompatParcelizer.write = C0054write.RemoteActionCompatParcelizer(action);
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer.write(action));
                audioAttributesCompatParcelizer.write(IconCompatParcelizer.IconCompatParcelizer(action));
                if (Build.VERSION.SDK_INT >= 31) {
                    audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer.read(action));
                }
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(C0053AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(action));
                return audioAttributesCompatParcelizer;
            }

            public AudioAttributesCompatParcelizer(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public AudioAttributesCompatParcelizer(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i != 0 ? IconCompat.RemoteActionCompatParcelizer(null, "", i) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private AudioAttributesCompatParcelizer(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, _findNullProvider[] _findnullproviderArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.write = true;
                this.AudioAttributesImplApi26Parcelizer = true;
                this.AudioAttributesCompatParcelizer = iconCompat;
                this.MediaBrowserCompatCustomActionResultReceiver = AudioAttributesImplBaseParcelizer.IconCompatParcelizer(charSequence);
                this.read = pendingIntent;
                this.RemoteActionCompatParcelizer = bundle;
                this.AudioAttributesImplApi21Parcelizer = _findnullproviderArr == null ? null : new ArrayList<>(Arrays.asList(_findnullproviderArr));
                this.write = z;
                this.MediaBrowserCompatItemReceiver = i;
                this.AudioAttributesImplApi26Parcelizer = z2;
                this.AudioAttributesImplBaseParcelizer = z3;
                this.IconCompatParcelizer = z4;
            }

            public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(Bundle bundle) {
                if (bundle != null) {
                    this.RemoteActionCompatParcelizer.putAll(bundle);
                }
                return this;
            }

            public final AudioAttributesCompatParcelizer write(_findNullProvider _findnullprovider) {
                if (this.AudioAttributesImplApi21Parcelizer == null) {
                    this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
                }
                if (_findnullprovider != null) {
                    this.AudioAttributesImplApi21Parcelizer.add(_findnullprovider);
                }
                return this;
            }

            public final AudioAttributesCompatParcelizer read(boolean z) {
                this.write = z;
                return this;
            }

            public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i) {
                this.MediaBrowserCompatItemReceiver = i;
                return this;
            }

            public final AudioAttributesCompatParcelizer write(boolean z) {
                this.AudioAttributesImplBaseParcelizer = z;
                return this;
            }

            public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(boolean z) {
                this.IconCompatParcelizer = z;
                return this;
            }

            private void AudioAttributesCompatParcelizer() {
                if (this.AudioAttributesImplBaseParcelizer && this.read == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public final write write() {
                AudioAttributesCompatParcelizer();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<_findNullProvider> arrayList3 = this.AudioAttributesImplApi21Parcelizer;
                if (arrayList3 != null) {
                    for (_findNullProvider _findnullprovider : arrayList3) {
                        if (_findnullprovider.AudioAttributesImplApi21Parcelizer()) {
                            arrayList.add(_findnullprovider);
                        } else {
                            arrayList2.add(_findnullprovider);
                        }
                    }
                }
                _findNullProvider[] _findnullproviderArr = arrayList.isEmpty() ? null : (_findNullProvider[]) arrayList.toArray(new _findNullProvider[arrayList.size()]);
                return new write(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.read, this.RemoteActionCompatParcelizer, arrayList2.isEmpty() ? null : (_findNullProvider[]) arrayList2.toArray(new _findNullProvider[arrayList2.size()]), _findnullproviderArr, this.write, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer, this.IconCompatParcelizer);
            }

            /* JADX INFO: renamed from: o._coercedTypeDesc$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name */
            static class C0053AudioAttributesCompatParcelizer {
                static RemoteInput[] write(Notification.Action action) {
                    return action.getRemoteInputs();
                }

                static Bundle RemoteActionCompatParcelizer(Notification.Action action) {
                    return action.getExtras();
                }
            }

            static class read {
                static Icon RemoteActionCompatParcelizer(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* JADX INFO: renamed from: o._coercedTypeDesc$write$AudioAttributesCompatParcelizer$write, reason: collision with other inner class name */
            static class C0054write {
                static boolean RemoteActionCompatParcelizer(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            static class RemoteActionCompatParcelizer {
                static int write(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            static class IconCompatParcelizer {
                static boolean IconCompatParcelizer(Notification.Action action) {
                    return action.isContextual();
                }
            }

            static class AudioAttributesImplApi26Parcelizer {
                static boolean read(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer {
        private PendingIntent AudioAttributesCompatParcelizer;
        private PendingIntent AudioAttributesImplApi26Parcelizer;
        private String AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private IconCompat RemoteActionCompatParcelizer;
        private int read;
        private int write;

        private AudioAttributesImplApi26Parcelizer(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
            this.AudioAttributesImplApi26Parcelizer = pendingIntent;
            this.RemoteActionCompatParcelizer = iconCompat;
            this.IconCompatParcelizer = i;
            this.read = i2;
            this.AudioAttributesCompatParcelizer = pendingIntent2;
            this.write = i3;
            this.AudioAttributesImplBaseParcelizer = str;
        }

        public final PendingIntent MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        public final PendingIntent IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final IconCompat write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int read() {
            return this.read;
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return (this.write & 1) != 0;
        }

        public final boolean AudioAttributesImplApi26Parcelizer() {
            return (this.write & 2) != 0;
        }

        public final void write(int i) {
            this.write = i;
        }

        public static Notification.BubbleMetadata RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            if (audioAttributesImplApi26Parcelizer == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return RemoteActionCompatParcelizer.write(audioAttributesImplApi26Parcelizer);
            }
            if (Build.VERSION.SDK_INT == 29) {
                return IconCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer);
            }
            return null;
        }

        public static AudioAttributesImplApi26Parcelizer IconCompatParcelizer(Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                return RemoteActionCompatParcelizer.IconCompatParcelizer(bubbleMetadata);
            }
            if (Build.VERSION.SDK_INT == 29) {
                return IconCompatParcelizer.AudioAttributesCompatParcelizer(bubbleMetadata);
            }
            return null;
        }

        public static final class AudioAttributesCompatParcelizer {
            private int AudioAttributesCompatParcelizer;
            private String AudioAttributesImplBaseParcelizer;
            private IconCompat IconCompatParcelizer;
            private PendingIntent MediaBrowserCompatItemReceiver;
            private int RemoteActionCompatParcelizer;
            private PendingIntent read;
            private int write;

            @Deprecated
            public AudioAttributesCompatParcelizer() {
            }

            public AudioAttributesCompatParcelizer(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.AudioAttributesImplBaseParcelizer = str;
            }

            public AudioAttributesCompatParcelizer(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.MediaBrowserCompatItemReceiver = pendingIntent;
                this.IconCompatParcelizer = iconCompat;
            }

            public final AudioAttributesCompatParcelizer IconCompatParcelizer(int i) {
                this.RemoteActionCompatParcelizer = Math.max(i, 0);
                this.write = 0;
                return this;
            }

            public final AudioAttributesCompatParcelizer read(int i) {
                this.write = i;
                this.RemoteActionCompatParcelizer = 0;
                return this;
            }

            public final AudioAttributesCompatParcelizer IconCompatParcelizer(boolean z) {
                write(1, z);
                return this;
            }

            public final AudioAttributesCompatParcelizer read(boolean z) {
                write(2, z);
                return this;
            }

            public final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(PendingIntent pendingIntent) {
                this.read = pendingIntent;
                return this;
            }

            public final AudioAttributesImplApi26Parcelizer write() {
                String str = this.AudioAttributesImplBaseParcelizer;
                if (str == null && this.MediaBrowserCompatItemReceiver == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.IconCompatParcelizer == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatItemReceiver, this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, str);
                audioAttributesImplApi26Parcelizer.write(this.AudioAttributesCompatParcelizer);
                return audioAttributesImplApi26Parcelizer;
            }

            private AudioAttributesCompatParcelizer write(int i, boolean z) {
                if (z) {
                    this.AudioAttributesCompatParcelizer = i | this.AudioAttributesCompatParcelizer;
                    return this;
                }
                this.AudioAttributesCompatParcelizer = (~i) & this.AudioAttributesCompatParcelizer;
                return this;
            }
        }

        static class IconCompatParcelizer {
            static Notification.BubbleMetadata RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
                if (audioAttributesImplApi26Parcelizer == null || audioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(audioAttributesImplApi26Parcelizer.write().MediaBrowserCompatCustomActionResultReceiver()).setIntent(audioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver()).setDeleteIntent(audioAttributesImplApi26Parcelizer.IconCompatParcelizer()).setAutoExpandBubble(audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer()).setSuppressNotification(audioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer());
                if (audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() != 0) {
                    suppressNotification.setDesiredHeight(audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer());
                }
                if (audioAttributesImplApi26Parcelizer.read() != 0) {
                    suppressNotification.setDesiredHeightResId(audioAttributesImplApi26Parcelizer.read());
                }
                return suppressNotification.build();
            }

            static AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer(Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(bubbleMetadata.getIntent(), IconCompat.RemoteActionCompatParcelizer(bubbleMetadata.getIcon())).IconCompatParcelizer(bubbleMetadata.getAutoExpandBubble()).RemoteActionCompatParcelizer(bubbleMetadata.getDeleteIntent()).read(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    audioAttributesCompatParcelizer.IconCompatParcelizer(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    audioAttributesCompatParcelizer.read(bubbleMetadata.getDesiredHeightResId());
                }
                return audioAttributesCompatParcelizer.write();
            }
        }

        static class RemoteActionCompatParcelizer {
            static Notification.BubbleMetadata write(AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
                Notification.BubbleMetadata.Builder builder;
                if (audioAttributesImplApi26Parcelizer == null) {
                    return null;
                }
                if (audioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver() != null) {
                    builder = new Notification.BubbleMetadata.Builder(audioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver());
                } else {
                    builder = new Notification.BubbleMetadata.Builder(audioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver(), audioAttributesImplApi26Parcelizer.write().MediaBrowserCompatCustomActionResultReceiver());
                }
                builder.setDeleteIntent(audioAttributesImplApi26Parcelizer.IconCompatParcelizer()).setAutoExpandBubble(audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer()).setSuppressNotification(audioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer());
                if (audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() != 0) {
                    builder.setDesiredHeight(audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer());
                }
                if (audioAttributesImplApi26Parcelizer.read() != 0) {
                    builder.setDesiredHeightResId(audioAttributesImplApi26Parcelizer.read());
                }
                return builder.build();
            }

            static AudioAttributesImplApi26Parcelizer IconCompatParcelizer(Notification.BubbleMetadata bubbleMetadata) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(bubbleMetadata.getShortcutId());
                } else {
                    audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(bubbleMetadata.getIntent(), IconCompat.RemoteActionCompatParcelizer(bubbleMetadata.getIcon()));
                }
                audioAttributesCompatParcelizer.IconCompatParcelizer(bubbleMetadata.getAutoExpandBubble()).RemoteActionCompatParcelizer(bubbleMetadata.getDeleteIntent()).read(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    audioAttributesCompatParcelizer.IconCompatParcelizer(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    audioAttributesCompatParcelizer.read(bubbleMetadata.getDesiredHeightResId());
                }
                return audioAttributesCompatParcelizer.write();
            }
        }
    }

    @Deprecated
    public static Bundle MediaMetadataCompat(Notification notification) {
        return notification.extras;
    }

    public static AudioAttributesImplApi26Parcelizer IconCompatParcelizer(Notification notification) {
        return AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(notification));
    }

    public static List<write> RatingCompat(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(_coerceNullToken.IconCompatParcelizer(bundle.getBundle(Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static CharSequence MediaBrowserCompatCustomActionResultReceiver(Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    public static CharSequence AudioAttributesImplBaseParcelizer(Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    public static CharSequence AudioAttributesImplApi26Parcelizer(Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }

    public static CharSequence onPlay(Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static String write(Notification notification) {
        return notification.category;
    }

    public static boolean MediaDescriptionCompat(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static String MediaBrowserCompatMediaItem(Notification notification) {
        return IconCompatParcelizer.write(notification);
    }

    public static boolean onPlayFromMediaId(Notification notification) {
        return notification.extras.getBoolean("android.showWhen");
    }

    public static boolean onPrepare(Notification notification) {
        return notification.extras.getBoolean("android.showChronometer");
    }

    public static boolean onAddQueueItem(Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static boolean read(Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static boolean handleMediaPlayPauseIfPendingOnHandler(Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static int MediaBrowserCompatItemReceiver(Notification notification) {
        return notification.color;
    }

    public static int onPrepareFromSearch(Notification notification) {
        return notification.visibility;
    }

    public static Notification onCustomAction(Notification notification) {
        return notification.publicVersion;
    }

    static boolean MediaBrowserCompatSearchResultReceiver(Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static boolean onPlayFromSearch(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static String onMediaButtonEvent(Notification notification) {
        return IconCompatParcelizer.AudioAttributesCompatParcelizer(notification);
    }

    public static String AudioAttributesImplApi21Parcelizer(Notification notification) {
        return AudioAttributesCompatParcelizer.read(notification);
    }

    public static long onPause(Notification notification) {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(notification);
    }

    public static int AudioAttributesCompatParcelizer(Notification notification) {
        return AudioAttributesCompatParcelizer.IconCompatParcelizer(notification);
    }

    public static String onFastForward(Notification notification) {
        return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(notification);
    }

    public static CharSequence MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Notification notification) {
        return AudioAttributesCompatParcelizer.write(notification);
    }

    public static _nonNullNumber onCommand(Notification notification) {
        LocusId locusIdIconCompatParcelizer = RemoteActionCompatParcelizer.IconCompatParcelizer(notification);
        if (locusIdIconCompatParcelizer == null) {
            return null;
        }
        return _nonNullNumber.write(locusIdIconCompatParcelizer);
    }

    public static boolean RemoteActionCompatParcelizer(Notification notification) {
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(notification);
    }

    @Deprecated
    public _coercedTypeDesc() {
    }

    static class IconCompatParcelizer {
        static String AudioAttributesCompatParcelizer(Notification notification) {
            return notification.getSortKey();
        }

        static String write(Notification notification) {
            return notification.getGroup();
        }
    }

    static class AudioAttributesCompatParcelizer {
        static CharSequence write(Notification notification) {
            return notification.getSettingsText();
        }

        static String RemoteActionCompatParcelizer(Notification notification) {
            return notification.getShortcutId();
        }

        static int IconCompatParcelizer(Notification notification) {
            return notification.getBadgeIconType();
        }

        static long AudioAttributesCompatParcelizer(Notification notification) {
            return notification.getTimeoutAfter();
        }

        static String read(Notification notification) {
            return notification.getChannelId();
        }
    }

    static class RemoteActionCompatParcelizer {
        static boolean AudioAttributesCompatParcelizer(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static LocusId IconCompatParcelizer(Notification notification) {
            return notification.getLocusId();
        }

        static Notification.BubbleMetadata RemoteActionCompatParcelizer(Notification notification) {
            return notification.getBubbleMetadata();
        }
    }
}
