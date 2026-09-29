package com.google.android.exoplayer2.ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin._coercedTypeDesc;
import kotlin._deserializeFromEmpty;
import kotlin.expectBooleanFormat;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class PlayerNotificationManager {
    private static final String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;
    private _coercedTypeDesc.AudioAttributesImplBaseParcelizer builder;
    private List<_coercedTypeDesc.write> builderActions;
    private final String channelId;
    private int color;
    private boolean colorized;
    private final Context context;
    private int currentNotificationTag;
    private final CustomActionReceiver customActionReceiver;
    private final Map<String, _coercedTypeDesc.write> customActions;
    private int defaults;
    private final PendingIntent dismissPendingIntent;
    private String groupKey;
    private final int instanceId;
    private final IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final Handler mainHandler;
    private final MediaDescriptionAdapter mediaDescriptionAdapter;
    private MediaSessionCompat.Token mediaSessionToken;
    private final NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;
    private final NotificationListener notificationListener;
    private final _deserializeFromEmpty notificationManager;
    private final Map<String, _coercedTypeDesc.write> playbackActions;
    private Player player;
    private final Player.Listener playerListener;
    private int priority;
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    public interface CustomActionReceiver {
        Map<String, _coercedTypeDesc.write> createCustomActions(Context context, int i);

        List<String> getCustomActions(Player player);

        void onCustomAction(Player player, String str, Intent intent);
    }

    public interface MediaDescriptionAdapter {
        PendingIntent createCurrentContentIntent(Player player);

        CharSequence getCurrentContentText(Player player);

        CharSequence getCurrentContentTitle(Player player);

        Bitmap getCurrentLargeIcon(Player player, BitmapCallback bitmapCallback);

        default CharSequence getCurrentSubText(Player player) {
            return null;
        }
    }

    public interface NotificationListener {
        default void onNotificationCancelled(int i, boolean z) {
        }

        default void onNotificationPosted(int i, Notification notification, boolean z) {
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    /* JADX INFO: loaded from: classes.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public static class Builder {
        protected int channelDescriptionResourceId;
        protected final String channelId;
        protected int channelImportance;
        protected int channelNameResourceId;
        protected final Context context;
        protected CustomActionReceiver customActionReceiver;
        protected int fastForwardActionIconResourceId;
        protected String groupKey;
        protected MediaDescriptionAdapter mediaDescriptionAdapter;
        protected int nextActionIconResourceId;
        protected final int notificationId;
        protected NotificationListener notificationListener;
        protected int pauseActionIconResourceId;
        protected int playActionIconResourceId;
        protected int previousActionIconResourceId;
        protected int rewindActionIconResourceId;
        protected int smallIconResourceId;
        protected int stopActionIconResourceId;

        @Deprecated
        public Builder(Context context, int i, String str, MediaDescriptionAdapter mediaDescriptionAdapter) {
            this(context, i, str);
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        }

        public Builder(Context context, int i, String str) {
            Assertions.checkArgument(i > 0);
            this.context = context;
            this.notificationId = i;
            this.channelId = str;
            this.channelImportance = 2;
            this.mediaDescriptionAdapter = new DefaultMediaDescriptionAdapter(null);
            this.smallIconResourceId = R.drawable.exo_notification_small_icon;
            this.playActionIconResourceId = R.drawable.exo_notification_play;
            this.pauseActionIconResourceId = R.drawable.exo_notification_pause;
            this.stopActionIconResourceId = R.drawable.exo_notification_stop;
            this.rewindActionIconResourceId = R.drawable.exo_notification_rewind;
            this.fastForwardActionIconResourceId = R.drawable.exo_notification_fastforward;
            this.previousActionIconResourceId = R.drawable.exo_notification_previous;
            this.nextActionIconResourceId = R.drawable.exo_notification_next;
        }

        public Builder setChannelNameResourceId(int i) {
            this.channelNameResourceId = i;
            return this;
        }

        public Builder setChannelDescriptionResourceId(int i) {
            this.channelDescriptionResourceId = i;
            return this;
        }

        public Builder setChannelImportance(int i) {
            this.channelImportance = i;
            return this;
        }

        public Builder setNotificationListener(NotificationListener notificationListener) {
            this.notificationListener = notificationListener;
            return this;
        }

        public Builder setCustomActionReceiver(CustomActionReceiver customActionReceiver) {
            this.customActionReceiver = customActionReceiver;
            return this;
        }

        public Builder setSmallIconResourceId(int i) {
            this.smallIconResourceId = i;
            return this;
        }

        public Builder setPlayActionIconResourceId(int i) {
            this.playActionIconResourceId = i;
            return this;
        }

        public Builder setPauseActionIconResourceId(int i) {
            this.pauseActionIconResourceId = i;
            return this;
        }

        public Builder setStopActionIconResourceId(int i) {
            this.stopActionIconResourceId = i;
            return this;
        }

        public Builder setRewindActionIconResourceId(int i) {
            this.rewindActionIconResourceId = i;
            return this;
        }

        public Builder setFastForwardActionIconResourceId(int i) {
            this.fastForwardActionIconResourceId = i;
            return this;
        }

        public Builder setPreviousActionIconResourceId(int i) {
            this.previousActionIconResourceId = i;
            return this;
        }

        public Builder setNextActionIconResourceId(int i) {
            this.nextActionIconResourceId = i;
            return this;
        }

        public Builder setGroup(String str) {
            this.groupKey = str;
            return this;
        }

        public Builder setMediaDescriptionAdapter(MediaDescriptionAdapter mediaDescriptionAdapter) {
            this.mediaDescriptionAdapter = mediaDescriptionAdapter;
            return this;
        }

        public PlayerNotificationManager build() {
            int i = this.channelNameResourceId;
            if (i != 0) {
                NotificationUtil.createNotificationChannel(this.context, this.channelId, i, this.channelDescriptionResourceId, this.channelImportance);
            }
            return new PlayerNotificationManager(this.context, this.channelId, this.notificationId, this.mediaDescriptionAdapter, this.notificationListener, this.customActionReceiver, this.smallIconResourceId, this.playActionIconResourceId, this.pauseActionIconResourceId, this.stopActionIconResourceId, this.rewindActionIconResourceId, this.fastForwardActionIconResourceId, this.previousActionIconResourceId, this.nextActionIconResourceId, this.groupKey);
        }
    }

    public final class BitmapCallback {
        private final int notificationTag;

        private BitmapCallback(int i) {
            this.notificationTag = i;
        }

        public final void onBitmap(Bitmap bitmap) {
            if (bitmap != null) {
                PlayerNotificationManager.this.postUpdateNotificationBitmap(bitmap, this.notificationTag);
            }
        }
    }

    protected PlayerNotificationManager(Context context, String str, int i, MediaDescriptionAdapter mediaDescriptionAdapter, NotificationListener notificationListener, CustomActionReceiver customActionReceiver, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str2) {
        Map<String, _coercedTypeDesc.write> mapEmptyMap;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.channelId = str;
        this.notificationId = i;
        this.mediaDescriptionAdapter = mediaDescriptionAdapter;
        this.notificationListener = notificationListener;
        this.customActionReceiver = customActionReceiver;
        this.smallIconResourceId = i2;
        this.groupKey = str2;
        int i10 = instanceIdCounter;
        instanceIdCounter = i10 + 1;
        this.instanceId = i10;
        this.mainHandler = Util.createHandler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.exoplayer2.ui.PlayerNotificationManager$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.handleMessage(message);
            }
        });
        this.notificationManager = _deserializeFromEmpty.write(applicationContext);
        this.playerListener = new PlayerListener();
        this.notificationBroadcastReceiver = new NotificationBroadcastReceiver();
        this.intentFilter = new IntentFilter();
        this.usePreviousAction = true;
        this.useNextAction = true;
        this.usePlayPauseActions = true;
        this.useRewindAction = true;
        this.useFastForwardAction = true;
        this.colorized = true;
        this.useChronometer = true;
        this.color = 0;
        this.defaults = 0;
        this.priority = -1;
        this.badgeIconType = 1;
        this.visibility = 1;
        Map<String, _coercedTypeDesc.write> mapCreatePlaybackActions = createPlaybackActions(applicationContext, i10, i3, i4, i5, i6, i7, i8, i9);
        this.playbackActions = mapCreatePlaybackActions;
        Iterator<String> it = mapCreatePlaybackActions.keySet().iterator();
        while (it.hasNext()) {
            this.intentFilter.addAction(it.next());
        }
        if (customActionReceiver != null) {
            mapEmptyMap = customActionReceiver.createCustomActions(applicationContext, this.instanceId);
        } else {
            mapEmptyMap = Collections.emptyMap();
        }
        this.customActions = mapEmptyMap;
        Iterator<String> it2 = mapEmptyMap.keySet().iterator();
        while (it2.hasNext()) {
            this.intentFilter.addAction(it2.next());
        }
        this.dismissPendingIntent = createBroadcastIntent(ACTION_DISMISS, applicationContext, this.instanceId);
        this.intentFilter.addAction(ACTION_DISMISS);
    }

    public final void setPlayer(Player player) {
        boolean z = true;
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != Looper.getMainLooper()) {
            z = false;
        }
        Assertions.checkArgument(z);
        Player player2 = this.player;
        if (player2 != player) {
            if (player2 != null) {
                player2.removeListener(this.playerListener);
                if (player == null) {
                    stopNotification(false);
                }
            }
            this.player = player;
            if (player != null) {
                player.addListener(this.playerListener);
                postStartOrUpdateNotification();
            }
        }
    }

    public final void setUseNextAction(boolean z) {
        if (this.useNextAction != z) {
            this.useNextAction = z;
            invalidate();
        }
    }

    public final void setUsePreviousAction(boolean z) {
        if (this.usePreviousAction != z) {
            this.usePreviousAction = z;
            invalidate();
        }
    }

    public final void setUseNextActionInCompactView(boolean z) {
        if (this.useNextActionInCompactView != z) {
            this.useNextActionInCompactView = z;
            if (z) {
                this.useFastForwardActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePreviousActionInCompactView(boolean z) {
        if (this.usePreviousActionInCompactView != z) {
            this.usePreviousActionInCompactView = z;
            if (z) {
                this.useRewindActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseFastForwardAction(boolean z) {
        if (this.useFastForwardAction != z) {
            this.useFastForwardAction = z;
            invalidate();
        }
    }

    public final void setUseRewindAction(boolean z) {
        if (this.useRewindAction != z) {
            this.useRewindAction = z;
            invalidate();
        }
    }

    public final void setUseFastForwardActionInCompactView(boolean z) {
        if (this.useFastForwardActionInCompactView != z) {
            this.useFastForwardActionInCompactView = z;
            if (z) {
                this.useNextActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUseRewindActionInCompactView(boolean z) {
        if (this.useRewindActionInCompactView != z) {
            this.useRewindActionInCompactView = z;
            if (z) {
                this.usePreviousActionInCompactView = false;
            }
            invalidate();
        }
    }

    public final void setUsePlayPauseActions(boolean z) {
        if (this.usePlayPauseActions != z) {
            this.usePlayPauseActions = z;
            invalidate();
        }
    }

    public final void setUseStopAction(boolean z) {
        if (this.useStopAction == z) {
            return;
        }
        this.useStopAction = z;
        invalidate();
    }

    public final void setMediaSessionToken(MediaSessionCompat.Token token) {
        if (Util.areEqual(this.mediaSessionToken, token)) {
            return;
        }
        this.mediaSessionToken = token;
        invalidate();
    }

    public final void setBadgeIconType(int i) {
        if (this.badgeIconType == i) {
            return;
        }
        if (i == 0 || i == 1 || i == 2) {
            this.badgeIconType = i;
            invalidate();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void setColorized(boolean z) {
        if (this.colorized != z) {
            this.colorized = z;
            invalidate();
        }
    }

    public final void setDefaults(int i) {
        if (this.defaults != i) {
            this.defaults = i;
            invalidate();
        }
    }

    public final void setColor(int i) {
        if (this.color != i) {
            this.color = i;
            invalidate();
        }
    }

    public final void setPriority(int i) {
        if (this.priority == i) {
            return;
        }
        if (i == -2 || i == -1 || i == 0 || i == 1 || i == 2) {
            this.priority = i;
            invalidate();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void setSmallIcon(int i) {
        if (this.smallIconResourceId != i) {
            this.smallIconResourceId = i;
            invalidate();
        }
    }

    public final void setUseChronometer(boolean z) {
        if (this.useChronometer != z) {
            this.useChronometer = z;
            invalidate();
        }
    }

    public final void setVisibility(int i) {
        if (this.visibility == i) {
            return;
        }
        if (i == -1 || i == 0 || i == 1) {
            this.visibility = i;
            invalidate();
            return;
        }
        throw new IllegalStateException();
    }

    public final void invalidate() {
        if (this.isNotificationStarted) {
            postStartOrUpdateNotification();
        }
    }

    private void startOrUpdateNotification(Player player, Bitmap bitmap) {
        boolean ongoing = getOngoing(player);
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerCreateNotification = createNotification(player, this.builder, ongoing, bitmap);
        this.builder = audioAttributesImplBaseParcelizerCreateNotification;
        if (audioAttributesImplBaseParcelizerCreateNotification == null) {
            stopNotification(false);
            return;
        }
        Notification notificationRemoteActionCompatParcelizer = audioAttributesImplBaseParcelizerCreateNotification.RemoteActionCompatParcelizer();
        this.notificationManager.AudioAttributesCompatParcelizer(this.notificationId, notificationRemoteActionCompatParcelizer);
        if (!this.isNotificationStarted) {
            Util.registerReceiverNotExported(this.context, this.notificationBroadcastReceiver, this.intentFilter);
        }
        NotificationListener notificationListener = this.notificationListener;
        if (notificationListener != null) {
            notificationListener.onNotificationPosted(this.notificationId, notificationRemoteActionCompatParcelizer, ongoing || !this.isNotificationStarted);
        }
        this.isNotificationStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopNotification(boolean z) {
        if (this.isNotificationStarted) {
            this.isNotificationStarted = false;
            this.mainHandler.removeMessages(0);
            this.notificationManager.AudioAttributesCompatParcelizer(this.notificationId);
            this.context.unregisterReceiver(this.notificationBroadcastReceiver);
            NotificationListener notificationListener = this.notificationListener;
            if (notificationListener != null) {
                notificationListener.onNotificationCancelled(this.notificationId, z);
            }
        }
    }

    protected _coercedTypeDesc.AudioAttributesImplBaseParcelizer createNotification(Player player, _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, boolean z, Bitmap bitmap) {
        _coercedTypeDesc.write writeVar;
        if (player.getPlaybackState() == 1 && player.isCommandAvailable(17) && player.getCurrentTimeline().isEmpty()) {
            this.builderActions = null;
            return null;
        }
        List<String> actions = getActions(player);
        ArrayList arrayList = new ArrayList(actions.size());
        for (int i = 0; i < actions.size(); i++) {
            String str = actions.get(i);
            if (this.playbackActions.containsKey(str)) {
                writeVar = this.playbackActions.get(str);
            } else {
                writeVar = this.customActions.get(str);
            }
            if (writeVar != null) {
                arrayList.add(writeVar);
            }
        }
        if (audioAttributesImplBaseParcelizer == null || !arrayList.equals(this.builderActions)) {
            audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(this.context, this.channelId);
            this.builderActions = arrayList;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((_coercedTypeDesc.write) arrayList.get(i2));
            }
        }
        expectBooleanFormat.read readVar = new expectBooleanFormat.read();
        MediaSessionCompat.Token token = this.mediaSessionToken;
        if (token != null) {
            readVar.read(token);
        }
        readVar.RemoteActionCompatParcelizer(getActionIndicesForCompactView(actions, player));
        readVar.RemoteActionCompatParcelizer(!z);
        readVar.RemoteActionCompatParcelizer(this.dismissPendingIntent);
        audioAttributesImplBaseParcelizer.read(readVar);
        audioAttributesImplBaseParcelizer.IconCompatParcelizer(this.dismissPendingIntent);
        audioAttributesImplBaseParcelizer.write(this.badgeIconType).MediaBrowserCompatCustomActionResultReceiver(z).IconCompatParcelizer(this.color).AudioAttributesCompatParcelizer(this.colorized).MediaBrowserCompatItemReceiver(this.smallIconResourceId).AudioAttributesImplApi21Parcelizer(this.visibility).AudioAttributesImplApi26Parcelizer(this.priority).RemoteActionCompatParcelizer(this.defaults);
        if (Util.SDK_INT >= 21 && this.useChronometer && player.isCommandAvailable(16) && player.isPlaying() && !player.isPlayingAd() && !player.isCurrentMediaItemDynamic() && player.getPlaybackParameters().speed == 1.0f) {
            audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(System.currentTimeMillis() - player.getContentPosition()).AudioAttributesImplApi21Parcelizer(true).AudioAttributesImplApi26Parcelizer(true);
        } else {
            audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(false).AudioAttributesImplApi26Parcelizer(false);
        }
        audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.mediaDescriptionAdapter.getCurrentContentTitle(player));
        audioAttributesImplBaseParcelizer.read(this.mediaDescriptionAdapter.getCurrentContentText(player));
        audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(this.mediaDescriptionAdapter.getCurrentSubText(player));
        if (bitmap == null) {
            MediaDescriptionAdapter mediaDescriptionAdapter = this.mediaDescriptionAdapter;
            int i3 = this.currentNotificationTag + 1;
            this.currentNotificationTag = i3;
            bitmap = mediaDescriptionAdapter.getCurrentLargeIcon(player, new BitmapCallback(i3));
        }
        setLargeIcon(audioAttributesImplBaseParcelizer, bitmap);
        audioAttributesImplBaseParcelizer.read(this.mediaDescriptionAdapter.createCurrentContentIntent(player));
        String str2 = this.groupKey;
        if (str2 != null) {
            audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(str2);
        }
        audioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer(true);
        return audioAttributesImplBaseParcelizer;
    }

    protected List<String> getActions(Player player) {
        boolean zIsCommandAvailable = player.isCommandAvailable(7);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean zIsCommandAvailable4 = player.isCommandAvailable(9);
        ArrayList arrayList = new ArrayList();
        if (this.usePreviousAction && zIsCommandAvailable) {
            arrayList.add(ACTION_PREVIOUS);
        }
        if (this.useRewindAction && zIsCommandAvailable2) {
            arrayList.add(ACTION_REWIND);
        }
        if (this.usePlayPauseActions) {
            if (Util.shouldShowPlayButton(player)) {
                arrayList.add(ACTION_PLAY);
            } else {
                arrayList.add(ACTION_PAUSE);
            }
        }
        if (this.useFastForwardAction && zIsCommandAvailable3) {
            arrayList.add(ACTION_FAST_FORWARD);
        }
        if (this.useNextAction && zIsCommandAvailable4) {
            arrayList.add(ACTION_NEXT);
        }
        CustomActionReceiver customActionReceiver = this.customActionReceiver;
        if (customActionReceiver != null) {
            arrayList.addAll(customActionReceiver.getCustomActions(player));
        }
        if (this.useStopAction) {
            arrayList.add(ACTION_STOP);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int[] getActionIndicesForCompactView(java.util.List<java.lang.String> r6, com.google.android.exoplayer2.Player r7) {
        /*
            r5 = this;
            java.lang.String r0 = "com.google.android.exoplayer.pause"
            int r0 = r6.indexOf(r0)
            java.lang.String r1 = "com.google.android.exoplayer.play"
            int r1 = r6.indexOf(r1)
            boolean r2 = r5.usePreviousActionInCompactView
            r3 = -1
            if (r2 == 0) goto L18
            java.lang.String r2 = "com.google.android.exoplayer.prev"
            int r2 = r6.indexOf(r2)
            goto L24
        L18:
            boolean r2 = r5.useRewindActionInCompactView
            if (r2 == 0) goto L23
            java.lang.String r2 = "com.google.android.exoplayer.rewind"
            int r2 = r6.indexOf(r2)
            goto L24
        L23:
            r2 = r3
        L24:
            boolean r4 = r5.useNextActionInCompactView
            if (r4 == 0) goto L2f
            java.lang.String r5 = "com.google.android.exoplayer.next"
            int r5 = r6.indexOf(r5)
            goto L3b
        L2f:
            boolean r5 = r5.useFastForwardActionInCompactView
            if (r5 == 0) goto L3a
            java.lang.String r5 = "com.google.android.exoplayer.ffwd"
            int r5 = r6.indexOf(r5)
            goto L3b
        L3a:
            r5 = r3
        L3b:
            r6 = 3
            int[] r6 = new int[r6]
            r4 = 0
            if (r2 == r3) goto L44
            r6[r4] = r2
            r4 = 1
        L44:
            boolean r7 = com.google.android.exoplayer2.util.Util.shouldShowPlayButton(r7)
            if (r0 == r3) goto L52
            if (r7 != 0) goto L52
            int r7 = r4 + 1
            r6[r4] = r0
        L50:
            r4 = r7
            goto L5b
        L52:
            if (r1 == r3) goto L5b
            if (r7 == 0) goto L5b
            int r7 = r4 + 1
            r6[r4] = r1
            goto L50
        L5b:
            if (r5 == r3) goto L61
            r6[r4] = r5
            int r4 = r4 + 1
        L61:
            int[] r5 = java.util.Arrays.copyOf(r6, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerNotificationManager.getActionIndicesForCompactView(java.util.List, com.google.android.exoplayer2.Player):int[]");
    }

    protected boolean getOngoing(Player player) {
        int playbackState = player.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && player.getPlayWhenReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postStartOrUpdateNotification() {
        if (this.mainHandler.hasMessages(0)) {
            return;
        }
        this.mainHandler.sendEmptyMessage(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postUpdateNotificationBitmap(Bitmap bitmap, int i) {
        this.mainHandler.obtainMessage(1, i, -1, bitmap).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Player player = this.player;
            if (player != null) {
                startOrUpdateNotification(player, null);
            }
        } else {
            if (i != 1) {
                return false;
            }
            if (this.player != null && this.isNotificationStarted && this.currentNotificationTag == message.arg1) {
                startOrUpdateNotification(this.player, (Bitmap) message.obj);
            }
        }
        return true;
    }

    private static Map<String, _coercedTypeDesc.write> createPlaybackActions(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        HashMap map = new HashMap();
        map.put(ACTION_PLAY, new _coercedTypeDesc.write(i2, context.getString(R.string.exo_controls_play_description), createBroadcastIntent(ACTION_PLAY, context, i)));
        map.put(ACTION_PAUSE, new _coercedTypeDesc.write(i3, context.getString(R.string.exo_controls_pause_description), createBroadcastIntent(ACTION_PAUSE, context, i)));
        map.put(ACTION_STOP, new _coercedTypeDesc.write(i4, context.getString(R.string.exo_controls_stop_description), createBroadcastIntent(ACTION_STOP, context, i)));
        map.put(ACTION_REWIND, new _coercedTypeDesc.write(i5, context.getString(R.string.exo_controls_rewind_description), createBroadcastIntent(ACTION_REWIND, context, i)));
        map.put(ACTION_FAST_FORWARD, new _coercedTypeDesc.write(i6, context.getString(R.string.exo_controls_fastforward_description), createBroadcastIntent(ACTION_FAST_FORWARD, context, i)));
        map.put(ACTION_PREVIOUS, new _coercedTypeDesc.write(i7, context.getString(R.string.exo_controls_previous_description), createBroadcastIntent(ACTION_PREVIOUS, context, i)));
        map.put(ACTION_NEXT, new _coercedTypeDesc.write(i8, context.getString(R.string.exo_controls_next_description), createBroadcastIntent(ACTION_NEXT, context, i)));
        return map;
    }

    private static PendingIntent createBroadcastIntent(String str, Context context, int i) {
        Intent intent = new Intent(str).setPackage(context.getPackageName());
        intent.putExtra(EXTRA_INSTANCE_ID, i);
        return PendingIntent.getBroadcast(context, i, intent, Util.SDK_INT >= 23 ? 201326592 : C.BUFFER_FLAG_FIRST_SAMPLE);
    }

    private static void setLargeIcon(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, Bitmap bitmap) {
        audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(bitmap);
    }

    class PlayerListener implements Player.Listener {
        private PlayerListener() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5, 7, 0, 12, 11, 8, 9, 14)) {
                PlayerNotificationManager.this.postStartOrUpdateNotification();
            }
        }
    }

    class NotificationBroadcastReceiver extends BroadcastReceiver {
        private NotificationBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Player player = PlayerNotificationManager.this.player;
            if (player != null && PlayerNotificationManager.this.isNotificationStarted && intent.getIntExtra(PlayerNotificationManager.EXTRA_INSTANCE_ID, PlayerNotificationManager.this.instanceId) == PlayerNotificationManager.this.instanceId) {
                String action = intent.getAction();
                if (PlayerNotificationManager.ACTION_PLAY.equals(action)) {
                    Util.handlePlayButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PAUSE.equals(action)) {
                    Util.handlePauseButtonAction(player);
                    return;
                }
                if (PlayerNotificationManager.ACTION_PREVIOUS.equals(action)) {
                    if (player.isCommandAvailable(7)) {
                        player.seekToPrevious();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_REWIND.equals(action)) {
                    if (player.isCommandAvailable(11)) {
                        player.seekBack();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_FAST_FORWARD.equals(action)) {
                    if (player.isCommandAvailable(12)) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_NEXT.equals(action)) {
                    if (player.isCommandAvailable(9)) {
                        player.seekToNext();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_STOP.equals(action)) {
                    if (player.isCommandAvailable(3)) {
                        player.stop();
                    }
                    if (player.isCommandAvailable(20)) {
                        player.clearMediaItems();
                        return;
                    }
                    return;
                }
                if (PlayerNotificationManager.ACTION_DISMISS.equals(action)) {
                    PlayerNotificationManager.this.stopNotification(true);
                } else {
                    if (action == null || PlayerNotificationManager.this.customActionReceiver == null || !PlayerNotificationManager.this.customActions.containsKey(action)) {
                        return;
                    }
                    PlayerNotificationManager.this.customActionReceiver.onCustomAction(player, action, intent);
                }
            }
        }
    }
}
