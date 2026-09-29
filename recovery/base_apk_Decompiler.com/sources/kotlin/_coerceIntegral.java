package kotlin;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes2.dex */
class _coerceIntegral implements _coerceTextualNull {
    private final Notification.Builder AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private RemoteViews AudioAttributesImplApi26Parcelizer;
    private final Context AudioAttributesImplBaseParcelizer;
    private final List<Bundle> IconCompatParcelizer = new ArrayList();
    private final Bundle MediaBrowserCompatItemReceiver = new Bundle();
    private final _coercedTypeDesc.AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer;
    private RemoteViews read;
    private RemoteViews write;

    _coerceIntegral(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
        this.RemoteActionCompatParcelizer = audioAttributesImplBaseParcelizer;
        Context context = audioAttributesImplBaseParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.AudioAttributesImplBaseParcelizer = context;
        Notification.Builder builderWrite = write.write(audioAttributesImplBaseParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, audioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer);
        this.AudioAttributesCompatParcelizer = builderWrite;
        Notification notification = audioAttributesImplBaseParcelizer.onPrepareFromMediaId;
        builderWrite.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, audioAttributesImplBaseParcelizer.PlaybackStateCompat).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(audioAttributesImplBaseParcelizer.RatingCompat).setContentText(audioAttributesImplBaseParcelizer.MediaMetadataCompat).setContentInfo(audioAttributesImplBaseParcelizer.MediaBrowserCompatSearchResultReceiver).setContentIntent(audioAttributesImplBaseParcelizer.MediaDescriptionCompat).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(audioAttributesImplBaseParcelizer.onCommand, (notification.flags & 128) != 0).setNumber(audioAttributesImplBaseParcelizer.onPlayFromSearch).setProgress(audioAttributesImplBaseParcelizer.onSetRating, audioAttributesImplBaseParcelizer.onPrepareFromUri, audioAttributesImplBaseParcelizer.onSeekTo);
        read.write(builderWrite, audioAttributesImplBaseParcelizer.onPlayFromUri == null ? null : audioAttributesImplBaseParcelizer.onPlayFromUri.AudioAttributesCompatParcelizer(context));
        builderWrite.setSubText(audioAttributesImplBaseParcelizer.MediaSessionCompatToken).setUsesChronometer(audioAttributesImplBaseParcelizer.ParcelableVolumeInfo).setPriority(audioAttributesImplBaseParcelizer.onRewind);
        if (audioAttributesImplBaseParcelizer.onSkipToQueueItem instanceof _coercedTypeDesc.MediaBrowserCompatItemReceiver) {
            Iterator<_coercedTypeDesc.write> it = ((_coercedTypeDesc.MediaBrowserCompatItemReceiver) audioAttributesImplBaseParcelizer.onSkipToQueueItem).IconCompatParcelizer().iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer(it.next());
            }
        } else {
            Iterator<_coercedTypeDesc.write> it2 = audioAttributesImplBaseParcelizer.read.iterator();
            while (it2.hasNext()) {
                RemoteActionCompatParcelizer(it2.next());
            }
        }
        if (audioAttributesImplBaseParcelizer.onAddQueueItem != null) {
            this.MediaBrowserCompatItemReceiver.putAll(audioAttributesImplBaseParcelizer.onAddQueueItem);
        }
        this.write = audioAttributesImplBaseParcelizer.handleMediaPlayPauseIfPendingOnHandler;
        this.read = audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer.setShowWhen(audioAttributesImplBaseParcelizer.setSessionImpl);
        RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onPrepareFromSearch);
        RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onPlayFromMediaId);
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onSkipToPrevious);
        RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onPause);
        this.AudioAttributesImplApi21Parcelizer = audioAttributesImplBaseParcelizer.onFastForward;
        IconCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer);
        IconCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer);
        IconCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.MediaSessionCompatResultReceiverWrapper);
        IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onSetShuffleMode);
        IconCompatParcelizer.write(this.AudioAttributesCompatParcelizer, notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList = audioAttributesImplBaseParcelizer.onRemoveQueueItem;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                IconCompatParcelizer.read(this.AudioAttributesCompatParcelizer, it3.next());
            }
        }
        this.AudioAttributesImplApi26Parcelizer = audioAttributesImplBaseParcelizer.onMediaButtonEvent;
        if (audioAttributesImplBaseParcelizer.onPlay.size() > 0) {
            Bundle bundle = audioAttributesImplBaseParcelizer.read().getBundle("android.car.EXTENSIONS");
            bundle = bundle == null ? new Bundle() : bundle;
            Bundle bundle2 = new Bundle(bundle);
            Bundle bundle3 = new Bundle();
            for (int i = 0; i < audioAttributesImplBaseParcelizer.onPlay.size(); i++) {
                bundle3.putBundle(Integer.toString(i), _coerceNullToken.IconCompatParcelizer(audioAttributesImplBaseParcelizer.onPlay.get(i)));
            }
            bundle.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            audioAttributesImplBaseParcelizer.read().putBundle("android.car.EXTENSIONS", bundle);
            this.MediaBrowserCompatItemReceiver.putBundle("android.car.EXTENSIONS", bundle2);
        }
        if (audioAttributesImplBaseParcelizer.onSkipToNext != null) {
            read.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onSkipToNext);
        }
        this.AudioAttributesCompatParcelizer.setExtras(audioAttributesImplBaseParcelizer.onAddQueueItem);
        AudioAttributesCompatParcelizer.write(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onSetRepeatMode);
        if (audioAttributesImplBaseParcelizer.handleMediaPlayPauseIfPendingOnHandler != null) {
            AudioAttributesCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.handleMediaPlayPauseIfPendingOnHandler);
        }
        if (audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer != null) {
            AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer);
        }
        if (audioAttributesImplBaseParcelizer.onMediaButtonEvent != null) {
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onMediaButtonEvent);
        }
        write.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.write);
        write.read(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onSetPlaybackSpeed);
        write.write(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onSetCaptioningEnabled);
        write.write(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.MediaSessionCompatQueueItem);
        write.read(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onFastForward);
        if (audioAttributesImplBaseParcelizer.MediaBrowserCompatMediaItem) {
            write.read(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver);
        }
        if (!TextUtils.isEmpty(audioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer)) {
            this.AudioAttributesCompatParcelizer.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator<_deserializeWrappedValue> it4 = audioAttributesImplBaseParcelizer.onRemoveQueueItemAt.iterator();
        while (it4.hasNext()) {
            MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, it4.next().AudioAttributesImplApi21Parcelizer());
        }
        AudioAttributesImplApi21Parcelizer.write(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer);
        AudioAttributesImplApi21Parcelizer.read(this.AudioAttributesCompatParcelizer, _coercedTypeDesc.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(audioAttributesImplBaseParcelizer.IconCompatParcelizer));
        if (audioAttributesImplBaseParcelizer.onPrepare != null) {
            AudioAttributesImplApi21Parcelizer.read(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onPrepare.read());
        }
        if (Build.VERSION.SDK_INT >= 31 && audioAttributesImplBaseParcelizer.onCustomAction != 0) {
            MediaBrowserCompatItemReceiver.read(this.AudioAttributesCompatParcelizer, audioAttributesImplBaseParcelizer.onCustomAction);
        }
        if (audioAttributesImplBaseParcelizer.onStop) {
            if (this.RemoteActionCompatParcelizer.onPause) {
                this.AudioAttributesImplApi21Parcelizer = 2;
            } else {
                this.AudioAttributesImplApi21Parcelizer = 1;
            }
            this.AudioAttributesCompatParcelizer.setVibrate(null);
            this.AudioAttributesCompatParcelizer.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.AudioAttributesCompatParcelizer.setDefaults(notification.defaults);
            if (TextUtils.isEmpty(this.RemoteActionCompatParcelizer.onPlayFromMediaId)) {
                RemoteActionCompatParcelizer.read(this.AudioAttributesCompatParcelizer, "silent");
            }
            write.read(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer);
        }
    }

    @Override // kotlin._coerceTextualNull
    public Notification.Builder AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    Context read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public Notification IconCompatParcelizer() {
        Bundle bundleMediaMetadataCompat;
        RemoteViews remoteViewsRemoteActionCompatParcelizer;
        RemoteViews remoteViewsAudioAttributesCompatParcelizer;
        _coercedTypeDesc.RatingCompat ratingCompat = this.RemoteActionCompatParcelizer.onSkipToQueueItem;
        if (ratingCompat != null) {
            ratingCompat.read(this);
        }
        RemoteViews remoteViewsIconCompatParcelizer = ratingCompat != null ? ratingCompat.IconCompatParcelizer(this) : null;
        Notification notificationRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (remoteViewsIconCompatParcelizer != null) {
            notificationRemoteActionCompatParcelizer.contentView = remoteViewsIconCompatParcelizer;
        } else if (this.RemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler != null) {
            notificationRemoteActionCompatParcelizer.contentView = this.RemoteActionCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler;
        }
        if (ratingCompat != null && (remoteViewsAudioAttributesCompatParcelizer = ratingCompat.AudioAttributesCompatParcelizer(this)) != null) {
            notificationRemoteActionCompatParcelizer.bigContentView = remoteViewsAudioAttributesCompatParcelizer;
        }
        if (ratingCompat != null && (remoteViewsRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.onSkipToQueueItem.RemoteActionCompatParcelizer(this)) != null) {
            notificationRemoteActionCompatParcelizer.headsUpContentView = remoteViewsRemoteActionCompatParcelizer;
        }
        if (ratingCompat != null && (bundleMediaMetadataCompat = _coercedTypeDesc.MediaMetadataCompat(notificationRemoteActionCompatParcelizer)) != null) {
            ratingCompat.AudioAttributesCompatParcelizer(bundleMediaMetadataCompat);
        }
        return notificationRemoteActionCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer(_coercedTypeDesc.write writeVar) {
        Bundle bundle;
        IconCompat iconCompatIconCompatParcelizer = writeVar.IconCompatParcelizer();
        Notification.Action.Builder builderAudioAttributesCompatParcelizer = read.AudioAttributesCompatParcelizer(iconCompatIconCompatParcelizer != null ? iconCompatIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() : null, writeVar.AudioAttributesImplApi26Parcelizer(), writeVar.read());
        if (writeVar.write() != null) {
            for (RemoteInput remoteInput : _findNullProvider.read(writeVar.write())) {
                RemoteActionCompatParcelizer.IconCompatParcelizer(builderAudioAttributesCompatParcelizer, remoteInput);
            }
        }
        if (writeVar.RemoteActionCompatParcelizer() != null) {
            bundle = new Bundle(writeVar.RemoteActionCompatParcelizer());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", writeVar.AudioAttributesCompatParcelizer());
        AudioAttributesCompatParcelizer.IconCompatParcelizer(builderAudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer());
        bundle.putInt("android.support.action.semanticAction", writeVar.AudioAttributesImplBaseParcelizer());
        MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(builderAudioAttributesCompatParcelizer, writeVar.AudioAttributesImplBaseParcelizer());
        AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(builderAudioAttributesCompatParcelizer, writeVar.MediaBrowserCompatItemReceiver());
        if (Build.VERSION.SDK_INT >= 31) {
            MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(builderAudioAttributesCompatParcelizer, writeVar.AudioAttributesImplApi21Parcelizer());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", writeVar.MediaBrowserCompatCustomActionResultReceiver());
        RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(builderAudioAttributesCompatParcelizer, bundle);
        RemoteActionCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer.write(builderAudioAttributesCompatParcelizer));
    }

    protected Notification RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.build();
    }

    static class RemoteActionCompatParcelizer {
        static Notification.Action.Builder IconCompatParcelizer(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action.Builder RemoteActionCompatParcelizer(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Builder IconCompatParcelizer(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action write(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Builder read(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder IconCompatParcelizer(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        static Notification.Builder RemoteActionCompatParcelizer(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        static Notification.Builder AudioAttributesCompatParcelizer(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class IconCompatParcelizer {
        static Notification.Builder read(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder RemoteActionCompatParcelizer(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder RemoteActionCompatParcelizer(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        static Notification.Builder AudioAttributesCompatParcelizer(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }

        static Notification.Builder IconCompatParcelizer(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder write(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }
    }

    static class read {
        static Notification.Action.Builder AudioAttributesCompatParcelizer(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder AudioAttributesCompatParcelizer(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }

        static Notification.Builder write(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    static class AudioAttributesCompatParcelizer {
        static Notification.Action.Builder IconCompatParcelizer(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        static Notification.Builder write(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }

        static Notification.Builder IconCompatParcelizer(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder AudioAttributesCompatParcelizer(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder RemoteActionCompatParcelizer(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }
    }

    static class write {
        static Notification.Builder write(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder read(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        static Notification.Builder read(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        static Notification.Builder AudioAttributesCompatParcelizer(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        static Notification.Builder read(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder write(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder write(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    static class MediaBrowserCompatCustomActionResultReceiver {
        static Notification.Action.Builder AudioAttributesCompatParcelizer(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }

        static Notification.Builder RemoteActionCompatParcelizer(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }
    }

    static class AudioAttributesImplApi21Parcelizer {
        static Notification.Action.Builder AudioAttributesCompatParcelizer(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        static Notification.Builder read(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }

        static Notification.Builder read(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Builder write(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }
    }

    static class MediaBrowserCompatItemReceiver {
        static Notification.Action.Builder RemoteActionCompatParcelizer(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        static Notification.Builder read(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }
}
