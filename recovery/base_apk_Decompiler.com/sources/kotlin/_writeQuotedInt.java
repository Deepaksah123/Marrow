package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/_writeQuotedInt;", "", "IconCompatParcelizer", "Lo/UTF8JsonGenerator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _writeQuotedInt {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.read;

    /* JADX INFO: renamed from: o._writeQuotedInt$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0006"}, d2 = {"Lo/_writeQuotedInt$IconCompatParcelizer;", "", "<init>", "()V", "Lo/_writeQuotedInt;", "onSetCaptioningEnabled", "Lo/_writeQuotedInt;", "write", "onPlayFromMediaId", "AudioAttributesCompatParcelizer", "()Lo/_writeQuotedInt;", "onCustomAction", "IconCompatParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "read", "onAddQueueItem", "RemoteActionCompatParcelizer", "onRemoveQueueItem", "AudioAttributesImplApi26Parcelizer", "onRewind", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi21Parcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaBrowserCompatCustomActionResultReceiver", "RatingCompat", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "MediaDescriptionCompat", "onCommand", "onPrepareFromUri", "onMediaButtonEvent", "onPause", "onPlay", "onPrepareFromSearch", "onFastForward", "onPlayFromUri", "onPrepare", "onPlayFromSearch", "onRemoveQueueItemAt", "onPrepareFromMediaId", "onSeekTo", "onSetShuffleMode"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion read = new Companion();

        /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
        private static final _writeQuotedInt write = _writeQuotedShort.write("username");

        /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
        private static final _writeQuotedInt AudioAttributesCompatParcelizer = _writeQuotedShort.write("password");

        /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
        private static final _writeQuotedInt IconCompatParcelizer = _writeQuotedShort.write("emailAddress");

        /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
        private static final _writeQuotedInt read = _writeQuotedShort.write("newUsername");

        /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
        private static final _writeQuotedInt RemoteActionCompatParcelizer = _writeQuotedShort.write("newPassword");

        /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
        private static final _writeQuotedInt AudioAttributesImplApi26Parcelizer = _writeQuotedShort.write("postalAddress");

        /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
        private static final _writeQuotedInt AudioAttributesImplBaseParcelizer = _writeQuotedShort.write("postalCode");

        /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
        private static final _writeQuotedInt AudioAttributesImplApi21Parcelizer = _writeQuotedShort.write("creditCardNumber");

        /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
        private static final _writeQuotedInt MediaBrowserCompatCustomActionResultReceiver = _writeQuotedShort.write("creditCardSecurityCode");

        /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
        private static final _writeQuotedInt MediaBrowserCompatItemReceiver = _writeQuotedShort.write("creditCardExpirationDate");

        /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
        private static final _writeQuotedInt RatingCompat = _writeQuotedShort.write("creditCardExpirationMonth");

        /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
        private static final _writeQuotedInt MediaBrowserCompatMediaItem = _writeQuotedShort.write("creditCardExpirationYear");

        /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
        private static final _writeQuotedInt MediaMetadataCompat = _writeQuotedShort.write("creditCardExpirationDay");

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private static final _writeQuotedInt MediaBrowserCompatSearchResultReceiver = _writeQuotedShort.write("addressCountry");

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private static final _writeQuotedInt MediaDescriptionCompat = _writeQuotedShort.write("addressRegion");

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private static final _writeQuotedInt onCommand = _writeQuotedShort.write("addressLocality");

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private static final _writeQuotedInt onCustomAction = _writeQuotedShort.write("streetAddress");

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private static final _writeQuotedInt MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = _writeQuotedShort.write("extendedAddress");

        /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
        private static final _writeQuotedInt onAddQueueItem = _writeQuotedShort.write("extendedPostalCode");

        /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
        private static final _writeQuotedInt handleMediaPlayPauseIfPendingOnHandler = _writeQuotedShort.write("personName");

        /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
        private static final _writeQuotedInt onMediaButtonEvent = _writeQuotedShort.write("personGivenName");

        /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
        private static final _writeQuotedInt onPlayFromMediaId = _writeQuotedShort.write("personFamilyName");

        /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
        private static final _writeQuotedInt onPlay = _writeQuotedShort.write("personMiddleName");
        private static final _writeQuotedInt onFastForward = _writeQuotedShort.write("personMiddleInitial");

        /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
        private static final _writeQuotedInt onPause = _writeQuotedShort.write("personNamePrefix");
        private static final _writeQuotedInt onPrepare = _writeQuotedShort.write("personNameSuffix");
        private static final _writeQuotedInt onPlayFromSearch = _writeQuotedShort.write("phoneNumber");

        /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
        private static final _writeQuotedInt onPrepareFromMediaId = _writeQuotedShort.write("phoneNumberDevice");

        /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
        private static final _writeQuotedInt onPrepareFromSearch = _writeQuotedShort.write("phoneCountryCode");

        /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
        private static final _writeQuotedInt onPlayFromUri = _writeQuotedShort.write("phoneNational");

        /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
        private static final _writeQuotedInt onPrepareFromUri = _writeQuotedShort.write("gender");

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private static final _writeQuotedInt onRewind = _writeQuotedShort.write("birthDateFull");

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private static final _writeQuotedInt onSeekTo = _writeQuotedShort.write("birthDateDay");

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private static final _writeQuotedInt onRemoveQueueItem = _writeQuotedShort.write("birthDateMonth");

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private static final _writeQuotedInt onRemoveQueueItemAt = _writeQuotedShort.write("birthDateYear");

        /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
        private static final _writeQuotedInt onSetCaptioningEnabled = _writeQuotedShort.write("smsOTPCode");

        private Companion() {
        }

        public final _writeQuotedInt AudioAttributesCompatParcelizer() {
            return AudioAttributesCompatParcelizer;
        }

        public final _writeQuotedInt IconCompatParcelizer() {
            return IconCompatParcelizer;
        }

        public final _writeQuotedInt read() {
            return onPlayFromSearch;
        }
    }
}
