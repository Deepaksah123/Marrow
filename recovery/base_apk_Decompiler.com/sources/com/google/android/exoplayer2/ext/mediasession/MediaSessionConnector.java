package com.google.android.exoplayer2.ext.mediasession;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.setTimelineAdapter;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class MediaSessionConnector {
    public static final long ALL_PLAYBACK_ACTIONS = 6554447;
    private static final int BASE_MEDIA_SESSION_FLAGS = 3;
    private static final long BASE_PLAYBACK_ACTIONS = 6554119;
    public static final long DEFAULT_PLAYBACK_ACTIONS = 2360143;
    private static final int EDITOR_MEDIA_SESSION_FLAGS = 7;
    public static final String EXTRAS_SPEED = "EXO_SPEED";
    private static final MediaMetadataCompat METADATA_EMPTY;
    private CaptionCallback captionCallback;
    private boolean clearMediaItemsOnStop;
    private final ArrayList<CommandReceiver> commandReceivers;
    private final ComponentListener componentListener;
    private Map<String, CustomActionProvider> customActionMap;
    private CustomActionProvider[] customActionProviders;
    private final ArrayList<CommandReceiver> customCommandReceivers;
    private Pair<Integer, CharSequence> customError;
    private Bundle customErrorExtras;
    private boolean dispatchUnsupportedActionsEnabled;
    private long enabledPlaybackActions;
    private ErrorMessageProvider<? super PlaybackException> errorMessageProvider;
    private final Looper looper;
    private boolean mapIdleToStopped;
    private MediaButtonEventHandler mediaButtonEventHandler;
    private MediaMetadataProvider mediaMetadataProvider;
    public final MediaSessionCompat mediaSession;
    private boolean metadataDeduplicationEnabled;
    private PlaybackPreparer playbackPreparer;
    private Player player;
    private QueueEditor queueEditor;
    private QueueNavigator queueNavigator;
    private RatingCallback ratingCallback;

    public interface CaptionCallback extends CommandReceiver {
        boolean hasCaptions(Player player);

        void onSetCaptioningEnabled(Player player, boolean z);
    }

    public interface CommandReceiver {
        boolean onCommand(Player player, String str, Bundle bundle, ResultReceiver resultReceiver);
    }

    public interface CustomActionProvider {
        PlaybackStateCompat.CustomAction getCustomAction(Player player);

        void onCustomAction(Player player, String str, Bundle bundle);
    }

    public interface MediaButtonEventHandler {
        boolean onMediaButtonEvent(Player player, Intent intent);
    }

    /* JADX INFO: loaded from: classes.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackActions {
    }

    public interface PlaybackPreparer extends CommandReceiver {
        public static final long ACTIONS = 257024;

        long getSupportedPrepareActions();

        void onPrepare(boolean z);

        void onPrepareFromMediaId(String str, boolean z, Bundle bundle);

        void onPrepareFromSearch(String str, boolean z, Bundle bundle);

        void onPrepareFromUri(Uri uri, boolean z, Bundle bundle);
    }

    public interface QueueEditor extends CommandReceiver {
        void onAddQueueItem(Player player, MediaDescriptionCompat mediaDescriptionCompat);

        void onAddQueueItem(Player player, MediaDescriptionCompat mediaDescriptionCompat, int i);

        void onRemoveQueueItem(Player player, MediaDescriptionCompat mediaDescriptionCompat);
    }

    public interface QueueNavigator extends CommandReceiver {
        public static final long ACTIONS = 4144;

        long getActiveQueueItemId(Player player);

        long getSupportedQueueNavigatorActions(Player player);

        default void onCurrentMediaItemIndexChanged(Player player) {
        }

        void onSkipToNext(Player player);

        void onSkipToPrevious(Player player);

        void onSkipToQueueItem(Player player, long j);

        void onTimelineChanged(Player player);
    }

    public interface RatingCallback extends CommandReceiver {
        void onSetRating(Player player, RatingCompat ratingCompat);

        void onSetRating(Player player, RatingCompat ratingCompat, Bundle bundle);
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.mediasession");
        METADATA_EMPTY = new MediaMetadataCompat.read().AudioAttributesCompatParcelizer();
    }

    public interface MediaMetadataProvider {
        MediaMetadataCompat getMetadata(Player player);

        default boolean sameAs(MediaMetadataCompat mediaMetadataCompat, MediaMetadataCompat mediaMetadataCompat2) {
            if (mediaMetadataCompat == mediaMetadataCompat2) {
                return true;
            }
            if (mediaMetadataCompat.read() != mediaMetadataCompat2.read()) {
                return false;
            }
            Set<String> setAudioAttributesCompatParcelizer = mediaMetadataCompat.AudioAttributesCompatParcelizer();
            Bundle bundleRemoteActionCompatParcelizer = mediaMetadataCompat.RemoteActionCompatParcelizer();
            Bundle bundleRemoteActionCompatParcelizer2 = mediaMetadataCompat2.RemoteActionCompatParcelizer();
            for (String str : setAudioAttributesCompatParcelizer) {
                Object obj = bundleRemoteActionCompatParcelizer.get(str);
                Object obj2 = bundleRemoteActionCompatParcelizer2.get(str);
                if (obj != obj2) {
                    if ((obj instanceof Bitmap) && (obj2 instanceof Bitmap)) {
                        if (!((Bitmap) obj).sameAs((Bitmap) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof RatingCompat) && (obj2 instanceof RatingCompat)) {
                        RatingCompat ratingCompat = (RatingCompat) obj;
                        RatingCompat ratingCompat2 = (RatingCompat) obj2;
                        if (ratingCompat.AudioAttributesCompatParcelizer() != ratingCompat2.AudioAttributesCompatParcelizer() || ratingCompat.MediaBrowserCompatItemReceiver() != ratingCompat2.MediaBrowserCompatItemReceiver() || ratingCompat.AudioAttributesImplApi21Parcelizer() != ratingCompat2.AudioAttributesImplApi21Parcelizer() || ratingCompat.IconCompatParcelizer() != ratingCompat2.IconCompatParcelizer() || ratingCompat.RemoteActionCompatParcelizer() != ratingCompat2.RemoteActionCompatParcelizer() || ratingCompat.write() != ratingCompat2.write()) {
                            return false;
                        }
                    } else if (!Util.areEqual(obj, obj2)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public MediaSessionConnector(MediaSessionCompat mediaSessionCompat) {
        this.mediaSession = mediaSessionCompat;
        Looper currentOrMainLooper = Util.getCurrentOrMainLooper();
        this.looper = currentOrMainLooper;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.commandReceivers = new ArrayList<>();
        this.customCommandReceivers = new ArrayList<>();
        this.customActionProviders = new CustomActionProvider[0];
        this.customActionMap = Collections.emptyMap();
        this.mediaMetadataProvider = new DefaultMediaMetadataProvider(mediaSessionCompat.write(), null);
        this.enabledPlaybackActions = DEFAULT_PLAYBACK_ACTIONS;
        mediaSessionCompat.read(3);
        mediaSessionCompat.RemoteActionCompatParcelizer(componentListener, new Handler(currentOrMainLooper));
        this.clearMediaItemsOnStop = true;
    }

    public final void setPlayer(Player player) {
        Assertions.checkArgument(player == null || player.getApplicationLooper() == this.looper);
        Player player2 = this.player;
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        invalidateMediaSessionPlaybackState();
        invalidateMediaSessionMetadata();
    }

    public final void setPlaybackPreparer(PlaybackPreparer playbackPreparer) {
        PlaybackPreparer playbackPreparer2 = this.playbackPreparer;
        if (playbackPreparer2 != playbackPreparer) {
            unregisterCommandReceiver(playbackPreparer2);
            this.playbackPreparer = playbackPreparer;
            registerCommandReceiver(playbackPreparer);
            invalidateMediaSessionPlaybackState();
        }
    }

    public final void setMediaButtonEventHandler(MediaButtonEventHandler mediaButtonEventHandler) {
        this.mediaButtonEventHandler = mediaButtonEventHandler;
    }

    public final void setEnabledPlaybackActions(long j) {
        long j2 = j & ALL_PLAYBACK_ACTIONS;
        if (this.enabledPlaybackActions != j2) {
            this.enabledPlaybackActions = j2;
            invalidateMediaSessionPlaybackState();
        }
    }

    public final void setErrorMessageProvider(ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
        if (this.errorMessageProvider != errorMessageProvider) {
            this.errorMessageProvider = errorMessageProvider;
            invalidateMediaSessionPlaybackState();
        }
    }

    public final void setQueueNavigator(QueueNavigator queueNavigator) {
        QueueNavigator queueNavigator2 = this.queueNavigator;
        if (queueNavigator2 != queueNavigator) {
            unregisterCommandReceiver(queueNavigator2);
            this.queueNavigator = queueNavigator;
            registerCommandReceiver(queueNavigator);
        }
    }

    public final void setQueueEditor(QueueEditor queueEditor) {
        QueueEditor queueEditor2 = this.queueEditor;
        if (queueEditor2 != queueEditor) {
            unregisterCommandReceiver(queueEditor2);
            this.queueEditor = queueEditor;
            registerCommandReceiver(queueEditor);
            this.mediaSession.read(queueEditor == null ? 3 : 7);
        }
    }

    public final void setRatingCallback(RatingCallback ratingCallback) {
        RatingCallback ratingCallback2 = this.ratingCallback;
        if (ratingCallback2 != ratingCallback) {
            unregisterCommandReceiver(ratingCallback2);
            this.ratingCallback = ratingCallback;
            registerCommandReceiver(ratingCallback);
        }
    }

    public final void setCaptionCallback(CaptionCallback captionCallback) {
        CaptionCallback captionCallback2 = this.captionCallback;
        if (captionCallback2 != captionCallback) {
            unregisterCommandReceiver(captionCallback2);
            this.captionCallback = captionCallback;
            registerCommandReceiver(captionCallback);
        }
    }

    public final void setCustomErrorMessage(CharSequence charSequence) {
        setCustomErrorMessage(charSequence, charSequence == null ? 0 : 1);
    }

    public final void setCustomErrorMessage(CharSequence charSequence, int i) {
        setCustomErrorMessage(charSequence, i, null);
    }

    public final void setCustomErrorMessage(CharSequence charSequence, int i, Bundle bundle) {
        this.customError = charSequence == null ? null : new Pair<>(Integer.valueOf(i), charSequence);
        if (charSequence == null) {
            bundle = null;
        }
        this.customErrorExtras = bundle;
        invalidateMediaSessionPlaybackState();
    }

    public final void setCustomActionProviders(CustomActionProvider... customActionProviderArr) {
        if (customActionProviderArr == null) {
            customActionProviderArr = new CustomActionProvider[0];
        }
        this.customActionProviders = customActionProviderArr;
        invalidateMediaSessionPlaybackState();
    }

    public final void setMediaMetadataProvider(MediaMetadataProvider mediaMetadataProvider) {
        if (this.mediaMetadataProvider != mediaMetadataProvider) {
            this.mediaMetadataProvider = mediaMetadataProvider;
            invalidateMediaSessionMetadata();
        }
    }

    public final void setDispatchUnsupportedActionsEnabled(boolean z) {
        this.dispatchUnsupportedActionsEnabled = z;
    }

    public final void setClearMediaItemsOnStop(boolean z) {
        this.clearMediaItemsOnStop = z;
    }

    public final void setMapStateIdleToSessionStateStopped(boolean z) {
        this.mapIdleToStopped = z;
    }

    public final void setMetadataDeduplicationEnabled(boolean z) {
        this.metadataDeduplicationEnabled = z;
    }

    public final void invalidateMediaSessionMetadata() {
        MediaMetadataCompat metadata;
        MediaMetadataCompat mediaMetadataCompatIconCompatParcelizer;
        Player player;
        MediaMetadataProvider mediaMetadataProvider = this.mediaMetadataProvider;
        if (mediaMetadataProvider != null && (player = this.player) != null) {
            metadata = mediaMetadataProvider.getMetadata(player);
        } else {
            metadata = METADATA_EMPTY;
        }
        MediaMetadataProvider mediaMetadataProvider2 = this.mediaMetadataProvider;
        if (!this.metadataDeduplicationEnabled || mediaMetadataProvider2 == null || (mediaMetadataCompatIconCompatParcelizer = this.mediaSession.write().IconCompatParcelizer()) == null || !mediaMetadataProvider2.sameAs(mediaMetadataCompatIconCompatParcelizer, metadata)) {
            this.mediaSession.IconCompatParcelizer(metadata);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0114 A[PHI: r5
      0x0114: PHI (r5v10 int) = (r5v9 int), (r5v11 int) binds: [B:40:0x010f, B:42:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invalidateMediaSessionPlaybackState() {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.invalidateMediaSessionPlaybackState():void");
    }

    public final void invalidateMediaSessionQueue() {
        Player player;
        QueueNavigator queueNavigator = this.queueNavigator;
        if (queueNavigator == null || (player = this.player) == null) {
            return;
        }
        queueNavigator.onTimelineChanged(player);
    }

    public final void registerCustomCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver == null || this.customCommandReceivers.contains(commandReceiver)) {
            return;
        }
        this.customCommandReceivers.add(commandReceiver);
    }

    public final void unregisterCustomCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver != null) {
            this.customCommandReceivers.remove(commandReceiver);
        }
    }

    private void registerCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver == null || this.commandReceivers.contains(commandReceiver)) {
            return;
        }
        this.commandReceivers.add(commandReceiver);
    }

    private void unregisterCommandReceiver(CommandReceiver commandReceiver) {
        if (commandReceiver != null) {
            this.commandReceivers.remove(commandReceiver);
        }
    }

    private long buildPrepareActions() {
        PlaybackPreparer playbackPreparer = this.playbackPreparer;
        if (playbackPreparer == null) {
            return 0L;
        }
        return PlaybackPreparer.ACTIONS & playbackPreparer.getSupportedPrepareActions();
    }

    private long buildPlaybackActions(Player player) {
        boolean z;
        boolean zIsCommandAvailable = player.isCommandAvailable(5);
        boolean zIsCommandAvailable2 = player.isCommandAvailable(11);
        boolean zIsCommandAvailable3 = player.isCommandAvailable(12);
        boolean z2 = false;
        if (player.getCurrentTimeline().isEmpty() || player.isPlayingAd()) {
            z = false;
        } else {
            boolean z3 = this.ratingCallback != null;
            CaptionCallback captionCallback = this.captionCallback;
            if (captionCallback != null && captionCallback.hasCaptions(player)) {
                z2 = true;
            }
            boolean z4 = z2;
            z2 = z3;
            z = z4;
        }
        long j = zIsCommandAvailable ? 6554375L : BASE_PLAYBACK_ACTIONS;
        if (zIsCommandAvailable3) {
            j |= 64;
        }
        if (zIsCommandAvailable2) {
            j |= 8;
        }
        long supportedQueueNavigatorActions = this.enabledPlaybackActions & j;
        QueueNavigator queueNavigator = this.queueNavigator;
        if (queueNavigator != null) {
            supportedQueueNavigatorActions |= queueNavigator.getSupportedQueueNavigatorActions(player) & QueueNavigator.ACTIONS;
        }
        if (z2) {
            supportedQueueNavigatorActions |= 128;
        }
        return z ? 1048576 | supportedQueueNavigatorActions : supportedQueueNavigatorActions;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchPlaybackAction(long j) {
        if (this.player != null) {
            return (j & this.enabledPlaybackActions) != 0 || this.dispatchUnsupportedActionsEnabled;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchToPlaybackPreparer(long j) {
        PlaybackPreparer playbackPreparer = this.playbackPreparer;
        if (playbackPreparer != null) {
            return (j & playbackPreparer.getSupportedPrepareActions()) != 0 || this.dispatchUnsupportedActionsEnabled;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchToQueueNavigator(long j) {
        QueueNavigator queueNavigator;
        Player player = this.player;
        if (player == null || (queueNavigator = this.queueNavigator) == null) {
            return false;
        }
        return (j & queueNavigator.getSupportedQueueNavigatorActions(player)) != 0 || this.dispatchUnsupportedActionsEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchSetRating() {
        return (this.player == null || this.ratingCallback == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchSetCaptioningEnabled() {
        return (this.player == null || this.captionCallback == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchQueueEdit() {
        return (this.player == null || this.queueEditor == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canDispatchMediaButtonEvent() {
        return (this.player == null || this.mediaButtonEventHandler == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekTo(Player player, int i, long j) {
        player.seekTo(i, j);
    }

    private int getMediaSessionPlaybackState(int i, boolean z) {
        if (i == 2) {
            return z ? 6 : 2;
        }
        if (i == 3) {
            return z ? 3 : 2;
        }
        if (i != 4) {
            return this.mapIdleToStopped ? 1 : 0;
        }
        return 1;
    }

    public static final class DefaultMediaMetadataProvider implements MediaMetadataProvider {
        private final MediaControllerCompat mediaController;
        private final String metadataExtrasPrefix;

        public DefaultMediaMetadataProvider(MediaControllerCompat mediaControllerCompat, String str) {
            this.mediaController = mediaControllerCompat;
            this.metadataExtrasPrefix = str == null ? "" : str;
        }

        @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.MediaMetadataProvider
        public final MediaMetadataCompat getMetadata(Player player) {
            if (player.getCurrentTimeline().isEmpty()) {
                return MediaSessionConnector.METADATA_EMPTY;
            }
            MediaMetadataCompat.read readVar = new MediaMetadataCompat.read();
            if (player.isPlayingAd()) {
                readVar.RemoteActionCompatParcelizer("android.media.metadata.ADVERTISEMENT", 1L);
            }
            readVar.RemoteActionCompatParcelizer("android.media.metadata.DURATION", (player.isCurrentMediaItemDynamic() || player.getDuration() == C.TIME_UNSET) ? -1L : player.getDuration());
            long jWrite = this.mediaController.AudioAttributesCompatParcelizer().write();
            if (jWrite != -1) {
                List<MediaSessionCompat.QueueItem> listWrite = this.mediaController.write();
                int i = 0;
                while (true) {
                    if (listWrite == null || i >= listWrite.size()) {
                        break;
                    }
                    MediaSessionCompat.QueueItem queueItem = listWrite.get(i);
                    if (queueItem.RemoteActionCompatParcelizer() == jWrite) {
                        MediaDescriptionCompat mediaDescriptionCompatWrite = queueItem.write();
                        Bundle bundleAudioAttributesCompatParcelizer = mediaDescriptionCompatWrite.AudioAttributesCompatParcelizer();
                        if (bundleAudioAttributesCompatParcelizer != null) {
                            for (String str : bundleAudioAttributesCompatParcelizer.keySet()) {
                                Object obj = bundleAudioAttributesCompatParcelizer.get(str);
                                if (obj instanceof String) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(this.metadataExtrasPrefix);
                                    sb.append(str);
                                    readVar.RemoteActionCompatParcelizer(sb.toString(), (String) obj);
                                } else if (obj instanceof CharSequence) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.metadataExtrasPrefix);
                                    sb2.append(str);
                                    readVar.AudioAttributesCompatParcelizer(sb2.toString(), (CharSequence) obj);
                                } else if (obj instanceof Long) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(this.metadataExtrasPrefix);
                                    sb3.append(str);
                                    readVar.RemoteActionCompatParcelizer(sb3.toString(), ((Long) obj).longValue());
                                } else if (obj instanceof Integer) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(this.metadataExtrasPrefix);
                                    sb4.append(str);
                                    readVar.RemoteActionCompatParcelizer(sb4.toString(), ((Integer) obj).intValue());
                                } else if (obj instanceof Bitmap) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(this.metadataExtrasPrefix);
                                    sb5.append(str);
                                    readVar.AudioAttributesCompatParcelizer(sb5.toString(), (Bitmap) obj);
                                } else if (obj instanceof RatingCompat) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append(this.metadataExtrasPrefix);
                                    sb6.append(str);
                                    readVar.AudioAttributesCompatParcelizer(sb6.toString(), (RatingCompat) obj);
                                }
                            }
                        }
                        CharSequence charSequenceMediaBrowserCompatItemReceiver = mediaDescriptionCompatWrite.MediaBrowserCompatItemReceiver();
                        if (charSequenceMediaBrowserCompatItemReceiver != null) {
                            String strValueOf = String.valueOf(charSequenceMediaBrowserCompatItemReceiver);
                            readVar.RemoteActionCompatParcelizer("android.media.metadata.TITLE", strValueOf);
                            readVar.RemoteActionCompatParcelizer("android.media.metadata.DISPLAY_TITLE", strValueOf);
                        }
                        CharSequence charSequenceMediaBrowserCompatCustomActionResultReceiver = mediaDescriptionCompatWrite.MediaBrowserCompatCustomActionResultReceiver();
                        if (charSequenceMediaBrowserCompatCustomActionResultReceiver != null) {
                            readVar.RemoteActionCompatParcelizer("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(charSequenceMediaBrowserCompatCustomActionResultReceiver));
                        }
                        CharSequence charSequence = mediaDescriptionCompatWrite.read();
                        if (charSequence != null) {
                            readVar.RemoteActionCompatParcelizer("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(charSequence));
                        }
                        Bitmap bitmapWrite = mediaDescriptionCompatWrite.write();
                        if (bitmapWrite != null) {
                            readVar.AudioAttributesCompatParcelizer("android.media.metadata.DISPLAY_ICON", bitmapWrite);
                        }
                        Uri uriRemoteActionCompatParcelizer = mediaDescriptionCompatWrite.RemoteActionCompatParcelizer();
                        if (uriRemoteActionCompatParcelizer != null) {
                            readVar.RemoteActionCompatParcelizer("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(uriRemoteActionCompatParcelizer));
                        }
                        String strAudioAttributesImplApi26Parcelizer = mediaDescriptionCompatWrite.AudioAttributesImplApi26Parcelizer();
                        if (strAudioAttributesImplApi26Parcelizer != null) {
                            readVar.RemoteActionCompatParcelizer("android.media.metadata.MEDIA_ID", strAudioAttributesImplApi26Parcelizer);
                        }
                        Uri uriAudioAttributesImplApi21Parcelizer = mediaDescriptionCompatWrite.AudioAttributesImplApi21Parcelizer();
                        if (uriAudioAttributesImplApi21Parcelizer != null) {
                            readVar.RemoteActionCompatParcelizer("android.media.metadata.MEDIA_URI", String.valueOf(uriAudioAttributesImplApi21Parcelizer));
                        }
                    } else {
                        i++;
                    }
                }
            }
            return readVar.AudioAttributesCompatParcelizer();
        }
    }

    class ComponentListener extends MediaSessionCompat.AudioAttributesCompatParcelizer implements Player.Listener {
        private int currentMediaItemIndex;
        private int currentWindowCount;

        private ComponentListener() {
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
        @Override // com.google.android.exoplayer2.Player.Listener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onEvents(com.google.android.exoplayer2.Player r8, com.google.android.exoplayer2.Player.Events r9) {
            /*
                r7 = this;
                r0 = 11
                boolean r0 = r9.contains(r0)
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L28
                int r0 = r7.currentMediaItemIndex
                int r3 = r8.getCurrentMediaItemIndex()
                if (r0 == r3) goto L25
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r0 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$QueueNavigator r0 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.access$200(r0)
                if (r0 == 0) goto L23
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r0 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$QueueNavigator r0 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.access$200(r0)
                r0.onCurrentMediaItemIndexChanged(r8)
            L23:
                r0 = r2
                goto L26
            L25:
                r0 = r1
            L26:
                r3 = r2
                goto L2a
            L28:
                r0 = r1
                r3 = r0
            L2a:
                boolean r1 = r9.contains(r1)
                if (r1 == 0) goto L5b
                com.google.android.exoplayer2.Timeline r0 = r8.getCurrentTimeline()
                int r0 = r0.getWindowCount()
                int r1 = r8.getCurrentMediaItemIndex()
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r4 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$QueueNavigator r4 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.access$200(r4)
                if (r4 == 0) goto L4e
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r1 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$QueueNavigator r1 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.access$200(r1)
                r1.onTimelineChanged(r8)
                goto L57
            L4e:
                int r4 = r7.currentWindowCount
                if (r4 != r0) goto L57
                int r4 = r7.currentMediaItemIndex
                if (r4 != r1) goto L57
                goto L58
            L57:
                r3 = r2
            L58:
                r7.currentWindowCount = r0
                r0 = r2
            L5b:
                int r8 = r8.getCurrentMediaItemIndex()
                r7.currentMediaItemIndex = r8
                r8 = 8
                r1 = 12
                r4 = 4
                r5 = 5
                r6 = 7
                int[] r8 = new int[]{r4, r5, r6, r8, r1}
                boolean r8 = r9.containsAny(r8)
                if (r8 == 0) goto L73
                goto L74
            L73:
                r2 = r3
            L74:
                r8 = 9
                int[] r8 = new int[]{r8}
                boolean r8 = r9.containsAny(r8)
                if (r8 == 0) goto L86
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r8 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                r8.invalidateMediaSessionQueue()
                goto L88
            L86:
                if (r2 == 0) goto L8d
            L88:
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r8 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                r8.invalidateMediaSessionPlaybackState()
            L8d:
                if (r0 == 0) goto L94
                com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector r7 = com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.this
                r7.invalidateMediaSessionMetadata()
            L94:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.ComponentListener.onEvents(com.google.android.exoplayer2.Player, com.google.android.exoplayer2.Player$Events):void");
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPlay() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(4L)) {
                if (MediaSessionConnector.this.player.getPlaybackState() == 1) {
                    if (MediaSessionConnector.this.playbackPreparer != null) {
                        MediaSessionConnector.this.playbackPreparer.onPrepare(true);
                    } else {
                        MediaSessionConnector.this.player.prepare();
                    }
                } else if (MediaSessionConnector.this.player.getPlaybackState() == 4) {
                    MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                    mediaSessionConnector.seekTo(mediaSessionConnector.player, MediaSessionConnector.this.player.getCurrentMediaItemIndex(), C.TIME_UNSET);
                }
                ((Player) Assertions.checkNotNull(MediaSessionConnector.this.player)).play();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPause() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(2L)) {
                MediaSessionConnector.this.player.pause();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSeekTo(long j) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(256L)) {
                MediaSessionConnector mediaSessionConnector = MediaSessionConnector.this;
                mediaSessionConnector.seekTo(mediaSessionConnector.player, MediaSessionConnector.this.player.getCurrentMediaItemIndex(), j);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onFastForward() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(64L)) {
                MediaSessionConnector.this.player.seekForward();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onRewind() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(8L)) {
                MediaSessionConnector.this.player.seekBack();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onStop() {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(1L)) {
                MediaSessionConnector.this.player.stop();
                if (MediaSessionConnector.this.clearMediaItemsOnStop) {
                    MediaSessionConnector.this.player.clearMediaItems();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSetShuffleMode(int i) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(2097152L)) {
                boolean z = true;
                if (i != 1 && i != 2) {
                    z = false;
                }
                MediaSessionConnector.this.player.setShuffleModeEnabled(z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSetRepeatMode(int i) {
            if (MediaSessionConnector.this.canDispatchPlaybackAction(262144L)) {
                int i2 = 1;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2 && i != 3) {
                        i2 = 0;
                    }
                }
                MediaSessionConnector.this.player.setRepeatMode(i2);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSetPlaybackSpeed(float f) {
            if (!MediaSessionConnector.this.canDispatchPlaybackAction(4194304L) || f <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            MediaSessionConnector.this.player.setPlaybackParameters(MediaSessionConnector.this.player.getPlaybackParameters().withSpeed(f));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSkipToNext() {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(32L)) {
                MediaSessionConnector.this.queueNavigator.onSkipToNext(MediaSessionConnector.this.player);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSkipToPrevious() {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(16L)) {
                MediaSessionConnector.this.queueNavigator.onSkipToPrevious(MediaSessionConnector.this.player);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSkipToQueueItem(long j) {
            if (MediaSessionConnector.this.canDispatchToQueueNavigator(4096L)) {
                MediaSessionConnector.this.queueNavigator.onSkipToQueueItem(MediaSessionConnector.this.player, j);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onCustomAction(String str, Bundle bundle) {
            if (MediaSessionConnector.this.player == null || !MediaSessionConnector.this.customActionMap.containsKey(str)) {
                return;
            }
            ((CustomActionProvider) MediaSessionConnector.this.customActionMap.get(str)).onCustomAction(MediaSessionConnector.this.player, str, bundle);
            MediaSessionConnector.this.invalidateMediaSessionPlaybackState();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            if (MediaSessionConnector.this.player != null) {
                for (int i = 0; i < MediaSessionConnector.this.commandReceivers.size(); i++) {
                    if (((CommandReceiver) MediaSessionConnector.this.commandReceivers.get(i)).onCommand(MediaSessionConnector.this.player, str, bundle, resultReceiver)) {
                        return;
                    }
                }
                for (int i2 = 0; i2 < MediaSessionConnector.this.customCommandReceivers.size() && !((CommandReceiver) MediaSessionConnector.this.customCommandReceivers.get(i2)).onCommand(MediaSessionConnector.this.player, str, bundle, resultReceiver); i2++) {
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPrepare() {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(setTimelineAdapter.EMIT_BUFFER_SIZE)) {
                MediaSessionConnector.this.playbackPreparer.onPrepare(false);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(32768L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromMediaId(str, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPrepareFromSearch(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(65536L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromSearch(str, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(131072L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromUri(uri, false, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPlayFromMediaId(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(1024L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromMediaId(str, true, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPlayFromSearch(String str, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(2048L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromSearch(str, true, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onPlayFromUri(Uri uri, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchToPlaybackPreparer(8192L)) {
                MediaSessionConnector.this.playbackPreparer.onPrepareFromUri(uri, true, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSetRating(RatingCompat ratingCompat) {
            if (MediaSessionConnector.this.canDispatchSetRating()) {
                MediaSessionConnector.this.ratingCallback.onSetRating(MediaSessionConnector.this.player, ratingCompat);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
            if (MediaSessionConnector.this.canDispatchSetRating()) {
                MediaSessionConnector.this.ratingCallback.onSetRating(MediaSessionConnector.this.player, ratingCompat, bundle);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onAddQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onAddQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat, i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if (MediaSessionConnector.this.canDispatchQueueEdit()) {
                MediaSessionConnector.this.queueEditor.onRemoveQueueItem(MediaSessionConnector.this.player, mediaDescriptionCompat);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public void onSetCaptioningEnabled(boolean z) {
            if (MediaSessionConnector.this.canDispatchSetCaptioningEnabled()) {
                MediaSessionConnector.this.captionCallback.onSetCaptioningEnabled(MediaSessionConnector.this.player, z);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.AudioAttributesCompatParcelizer
        public boolean onMediaButtonEvent(Intent intent) {
            return (MediaSessionConnector.this.canDispatchMediaButtonEvent() && MediaSessionConnector.this.mediaButtonEventHandler.onMediaButtonEvent(MediaSessionConnector.this.player, intent)) || super.onMediaButtonEvent(intent);
        }
    }
}
