package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\u001aí\u0003\u00102\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000¢\u0006\u0004\b2\u00103\u001a\u0019\u00104\u001a\u00020\u0000*\u0002012\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b4\u00105\u001a\u0015\u00106\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b6\u00107\u001a\u0019\u00102\u001a\u00020\u0000*\u0002012\u0006\u0010\u0001\u001a\u000208¢\u0006\u0004\b2\u00109\u001a\u001b\u00102\u001a\u00020\u0000*\u0002012\u0006\u0010\u0001\u001a\u00020:H\u0000¢\u0006\u0004\b2\u0010;\u001a#\u0010<\u001a\u00020\u0000*\u0002012\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u000208H\u0000¢\u0006\u0004\b<\u0010=\" \u00106\u001a\b\u0012\u0004\u0012\u0002010>8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b<\u0010A\"\u0018\u00102\u001a\u00020\u0000*\u00020:8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010B\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020C0>8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010@"}, d2 = {"Lo/switchToNext;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "p32", "p33", "p34", "p35", "p36", "p37", "p38", "p39", "p40", "p41", "p42", "p43", "p44", "p45", "p46", "p47", "Lo/writeStartArray;", "AudioAttributesCompatParcelizer", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lo/writeStartArray;", "IconCompatParcelizer", "(Lo/writeStartArray;J)J", "RemoteActionCompatParcelizer", "(JLo/_handleUnrecognizedCharacterEscape;I)J", "Lo/assignParameter;", "(Lo/writeStartArray;F)J", "Lo/validateFPLength;", "(Lo/writeStartArray;Lo/validateFPLength;)J", "read", "(Lo/writeStartArray;JFLo/_handleUnrecognizedCharacterEscape;I)J", "Lo/CharacterEscapes;", "write", "Lo/CharacterEscapes;", "()Lo/CharacterEscapes;", "(Lo/validateFPLength;Lo/_handleUnrecognizedCharacterEscape;I)J", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class writeOmittedField {
    private static final CharacterEscapes<writeStartArray> write = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.writeTypeId
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return writeOmittedField.AudioAttributesCompatParcelizer();
        }
    });
    private static final CharacterEscapes<Boolean> RemoteActionCompatParcelizer = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.writeStringField
        @Override // kotlin.getCreatedOnDateMs
        public final Object invoke() {
            return Boolean.valueOf(writeOmittedField.RemoteActionCompatParcelizer());
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[validateFPLength.values().length];
            try {
                iArr[validateFPLength.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[validateFPLength.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[validateFPLength.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[validateFPLength.AudioAttributesCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[validateFPLength.RemoteActionCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[validateFPLength.AudioAttributesImplApi21Parcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[validateFPLength.AudioAttributesImplBaseParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[validateFPLength.MediaBrowserCompatItemReceiver.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[validateFPLength.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[validateFPLength.AudioAttributesImplApi26Parcelizer.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[validateFPLength.MediaDescriptionCompat.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[validateFPLength.MediaMetadataCompat.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[validateFPLength.MediaBrowserCompatSearchResultReceiver.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[validateFPLength.onCommand.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[validateFPLength.onCustomAction.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[validateFPLength.onSkipToQueueItem.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[validateFPLength.handleMediaPlayPauseIfPendingOnHandler.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[validateFPLength.onPlayFromMediaId.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[validateFPLength.onPlay.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[validateFPLength.onMediaButtonEvent.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[validateFPLength.onPlayFromUri.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[validateFPLength.onPrepareFromSearch.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[validateFPLength.onPlayFromSearch.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[validateFPLength.onSeekTo.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[validateFPLength.onPrepareFromUri.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[validateFPLength.onRemoveQueueItemAt.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[validateFPLength.setSessionImpl.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[validateFPLength.onSetCaptioningEnabled.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[validateFPLength.onSetPlaybackSpeed.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[validateFPLength.onSetRating.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[validateFPLength.onSetShuffleMode.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[validateFPLength.onSetRepeatMode.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[validateFPLength.onStop.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[validateFPLength.onSkipToNext.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[validateFPLength.onSkipToPrevious.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[validateFPLength.ParcelableVolumeInfo.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[validateFPLength.onPrepare.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[validateFPLength.onPrepareFromMediaId.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[validateFPLength.MediaBrowserCompatMediaItem.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[validateFPLength.RatingCompat.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[validateFPLength.onRewind.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[validateFPLength.onRemoveQueueItem.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[validateFPLength.onAddQueueItem.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[validateFPLength.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[validateFPLength.MediaSessionCompatQueueItem.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[validateFPLength.MediaSessionCompatResultReceiverWrapper.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[validateFPLength.onFastForward.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[validateFPLength.onPause.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer() {
        return true;
    }

    public static /* synthetic */ writeStartArray AudioAttributesCompatParcelizer$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long jOnPrepareFromMediaId = (i & 1) != 0 ? validateNestingDepth.INSTANCE.onPrepareFromMediaId() : j;
        return AudioAttributesCompatParcelizer(jOnPrepareFromMediaId, (i & 2) != 0 ? validateNestingDepth.INSTANCE.AudioAttributesImplBaseParcelizer() : j2, (i & 4) != 0 ? validateNestingDepth.INSTANCE.onPlayFromUri() : j3, (i & 8) != 0 ? validateNestingDepth.INSTANCE.MediaDescriptionCompat() : j4, (i & 16) != 0 ? validateNestingDepth.INSTANCE.AudioAttributesCompatParcelizer() : j5, (i & 32) != 0 ? validateNestingDepth.INSTANCE.onPrepareFromUri() : j6, (i & 64) != 0 ? validateNestingDepth.INSTANCE.RatingCompat() : j7, (i & 128) != 0 ? validateNestingDepth.INSTANCE.onRemoveQueueItemAt() : j8, (i & 256) != 0 ? validateNestingDepth.INSTANCE.MediaMetadataCompat() : j9, (i & 512) != 0 ? validateNestingDepth.INSTANCE.onSkipToNext() : j10, (i & 1024) != 0 ? validateNestingDepth.INSTANCE.onAddQueueItem() : j11, (i & 2048) != 0 ? validateNestingDepth.INSTANCE.onSkipToPrevious() : j12, (i & 4096) != 0 ? validateNestingDepth.INSTANCE.onFastForward() : j13, (i & 8192) != 0 ? validateNestingDepth.INSTANCE.read() : j14, (i & 16384) != 0 ? validateNestingDepth.INSTANCE.MediaBrowserCompatItemReceiver() : j15, (i & 32768) != 0 ? validateNestingDepth.INSTANCE.onRemoveQueueItem() : j16, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? validateNestingDepth.INSTANCE.onCustomAction() : j17, (i & 131072) != 0 ? validateNestingDepth.INSTANCE.onSkipToQueueItem() : j18, (i & 262144) != 0 ? validateNestingDepth.INSTANCE.handleMediaPlayPauseIfPendingOnHandler() : j19, (i & 524288) != 0 ? jOnPrepareFromMediaId : j20, (i & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? validateNestingDepth.INSTANCE.AudioAttributesImplApi26Parcelizer() : j21, (i & 2097152) != 0 ? validateNestingDepth.INSTANCE.write() : j22, (i & 4194304) != 0 ? validateNestingDepth.INSTANCE.RemoteActionCompatParcelizer() : j23, (i & 8388608) != 0 ? validateNestingDepth.INSTANCE.AudioAttributesImplApi21Parcelizer() : j24, (i & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? validateNestingDepth.INSTANCE.IconCompatParcelizer() : j25, (i & 33554432) != 0 ? validateNestingDepth.INSTANCE.MediaBrowserCompatCustomActionResultReceiver() : j26, (i & 67108864) != 0 ? validateNestingDepth.INSTANCE.onPlayFromMediaId() : j27, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? validateNestingDepth.INSTANCE.onPlay() : j28, (i & 268435456) != 0 ? validateNestingDepth.INSTANCE.onPlayFromSearch() : j29, (i & 536870912) != 0 ? validateNestingDepth.INSTANCE.onSetRepeatMode() : j30, (i & 1073741824) != 0 ? validateNestingDepth.INSTANCE.onSetShuffleMode() : j31, (i & Integer.MIN_VALUE) != 0 ? validateNestingDepth.INSTANCE.onSetCaptioningEnabled() : j32, (i2 & 1) != 0 ? validateNestingDepth.INSTANCE.onSetRating() : j33, (i2 & 2) != 0 ? validateNestingDepth.INSTANCE.onSetPlaybackSpeed() : j34, (i2 & 4) != 0 ? validateNestingDepth.INSTANCE.setSessionImpl() : j35, (i2 & 8) != 0 ? validateNestingDepth.INSTANCE.onStop() : j36, (i2 & 16) != 0 ? validateNestingDepth.INSTANCE.onPrepareFromSearch() : j37, (i2 & 32) != 0 ? validateNestingDepth.INSTANCE.onPrepare() : j38, (i2 & 64) != 0 ? validateNestingDepth.INSTANCE.MediaBrowserCompatMediaItem() : j39, (i2 & 128) != 0 ? validateNestingDepth.INSTANCE.MediaBrowserCompatSearchResultReceiver() : j40, (i2 & 256) != 0 ? validateNestingDepth.INSTANCE.onSeekTo() : j41, (i2 & 512) != 0 ? validateNestingDepth.INSTANCE.onRewind() : j42, (i2 & 1024) != 0 ? validateNestingDepth.INSTANCE.onCommand() : j43, (i2 & 2048) != 0 ? validateNestingDepth.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : j44, (i2 & 4096) != 0 ? validateNestingDepth.INSTANCE.ParcelableVolumeInfo() : j45, (i2 & 8192) != 0 ? validateNestingDepth.INSTANCE.MediaSessionCompatQueueItem() : j46, (i2 & 16384) != 0 ? validateNestingDepth.INSTANCE.onPause() : j47, (i2 & 32768) != 0 ? validateNestingDepth.INSTANCE.onMediaButtonEvent() : j48);
    }

    public static final writeStartArray AudioAttributesCompatParcelizer(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new writeStartArray(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    public static final long IconCompatParcelizer(writeStartArray writestartarray, long j) {
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getAudioAttributesCompatParcelizer())) {
            return writestartarray.getRemoteActionCompatParcelizer();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getMediaBrowserCompatItemReceiver())) {
            return writestartarray.getAudioAttributesImplApi26Parcelizer();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getAudioAttributesImplBaseParcelizer())) {
            return writestartarray.getMediaBrowserCompatMediaItem();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getRatingCompat())) {
            return writestartarray.getMediaDescriptionCompat();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnFastForward())) {
            return writestartarray.getOnPlay();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getWrite())) {
            return writestartarray.getIconCompatParcelizer();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getMediaBrowserCompatCustomActionResultReceiver())) {
            return writestartarray.getAudioAttributesImplApi21Parcelizer();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getMediaMetadataCompat())) {
            return writestartarray.getMediaBrowserCompatSearchResultReceiver();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnMediaButtonEvent())) {
            return writestartarray.getOnPrepareFromSearch();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnPlayFromMediaId())) {
            return writestartarray.getOnPause();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getHandleMediaPlayPauseIfPendingOnHandler())) {
            return writestartarray.getOnAddQueueItem();
        }
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) {
            return writestartarray.getOnCustomAction();
        }
        if (!switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnPlayFromUri()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnSeekTo()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnRewind()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnRemoveQueueItem()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnRemoveQueueItemAt()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnSetCaptioningEnabled()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnPrepareFromUri())) {
            if (!switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnSetPlaybackSpeed()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnSetRating())) {
                if (!switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnSkipToNext()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnSkipToQueueItem())) {
                    if (!switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getOnSkipToPrevious()) && !switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getPlaybackStateCompat())) {
                        return switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
                    }
                    return writestartarray.getParcelableVolumeInfo();
                }
                return writestartarray.getOnStop();
            }
            return writestartarray.getOnSetShuffleMode();
        }
        return writestartarray.getOnAddQueueItem();
    }

    public static final long RemoteActionCompatParcelizer(long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        _handleunrecognizedcharacterescape.IconCompatParcelizer(89374938);
        long jIconCompatParcelizer = IconCompatParcelizer(getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), j);
        if (jIconCompatParcelizer == 16) {
            jIconCompatParcelizer = ((switchToNext) _handleunrecognizedcharacterescape.write(writeTypeSuffix.IconCompatParcelizer())).getIconCompatParcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jIconCompatParcelizer;
    }

    public static final long AudioAttributesCompatParcelizer(writeStartArray writestartarray, validateFPLength validatefplength) {
        switch (WhenMappings.RemoteActionCompatParcelizer[validatefplength.ordinal()]) {
            case 1:
                return writestartarray.getRatingCompat();
            case 2:
                return writestartarray.getOnFastForward();
            case 3:
                return writestartarray.getOnMediaButtonEvent();
            case 4:
                return writestartarray.getOnPause();
            case 5:
                return writestartarray.getRead();
            case 6:
                return writestartarray.getOnPlayFromMediaId();
            case 7:
                return writestartarray.getMediaDescriptionCompat();
            case 8:
                return writestartarray.getOnPlay();
            case 9:
                return writestartarray.getOnPrepareFromSearch();
            case 10:
                return writestartarray.getRemoteActionCompatParcelizer();
            case 11:
                return writestartarray.getIconCompatParcelizer();
            case 12:
                return writestartarray.getAudioAttributesImplApi26Parcelizer();
            case 13:
                return writestartarray.getAudioAttributesImplApi21Parcelizer();
            case 14:
                return writestartarray.getOnAddQueueItem();
            case 15:
                return writestartarray.getOnCustomAction();
            case 16:
                return writestartarray.getOnCommand();
            case 17:
                return writestartarray.getMediaBrowserCompatMediaItem();
            case 18:
                return writestartarray.getMediaBrowserCompatSearchResultReceiver();
            case 19:
                return writestartarray.getOnPrepareFromMediaId();
            case 20:
                return writestartarray.getOnPlayFromSearch();
            case 21:
                return writestartarray.getAudioAttributesCompatParcelizer();
            case 22:
                return writestartarray.getWrite();
            case 23:
                return writestartarray.getOnPrepare();
            case 24:
                return writestartarray.getMediaBrowserCompatItemReceiver();
            case 25:
                return writestartarray.getMediaBrowserCompatCustomActionResultReceiver();
            case 26:
                return writestartarray.getHandleMediaPlayPauseIfPendingOnHandler();
            case 27:
                return writestartarray.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            case 28:
                return writestartarray.getOnPlayFromUri();
            case 29:
                return writestartarray.getOnSeekTo();
            case 30:
                return writestartarray.getOnRewind();
            case 31:
                return writestartarray.getOnRemoveQueueItem();
            case 32:
                return writestartarray.getOnRemoveQueueItemAt();
            case 33:
                return writestartarray.getOnSetCaptioningEnabled();
            case 34:
                return writestartarray.getOnPrepareFromUri();
            case 35:
                return writestartarray.getAudioAttributesImplBaseParcelizer();
            case 36:
                return writestartarray.getMediaMetadataCompat();
            case 37:
                return writestartarray.getOnSetPlaybackSpeed();
            case 38:
                return writestartarray.getOnSetRating();
            case 39:
                return writestartarray.getOnSetShuffleMode();
            case 40:
                return writestartarray.getOnSetRepeatMode();
            case 41:
                return writestartarray.getOnSkipToNext();
            case 42:
                return writestartarray.getOnSkipToQueueItem();
            case 43:
                return writestartarray.getOnStop();
            case 44:
                return writestartarray.getSetSessionImpl();
            case 45:
                return writestartarray.getOnSkipToPrevious();
            case 46:
                return writestartarray.getPlaybackStateCompat();
            case 47:
                return writestartarray.getParcelableVolumeInfo();
            case 48:
                return writestartarray.getMediaSessionCompatQueueItem();
            default:
                throw new RenewEligibleCreator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final writeStartArray AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null);
    }

    public static final CharacterEscapes<writeStartArray> read() {
        return write;
    }

    public static final long IconCompatParcelizer(validateFPLength validatefplength, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getCurrentName.INSTANCE.AudioAttributesCompatParcelizer(_handleunrecognizedcharacterescape, 6), validatefplength);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return jAudioAttributesCompatParcelizer;
    }

    public static final long read(writeStartArray writestartarray, long j, float f, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean zBooleanValue = ((Boolean) _handleunrecognizedcharacterescape.write(RemoteActionCompatParcelizer)).booleanValue();
        if (switchToNext.RemoteActionCompatParcelizer(j, writestartarray.getHandleMediaPlayPauseIfPendingOnHandler()) && zBooleanValue) {
            j = AudioAttributesCompatParcelizer(writestartarray, f);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return j;
    }

    public static final long AudioAttributesCompatParcelizer(writeStartArray writestartarray, float f) {
        if (assignParameter.IconCompatParcelizer(f, assignParameter.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED))) {
            return writestartarray.getHandleMediaPlayPauseIfPendingOnHandler();
        }
        return RequestPayload.RemoteActionCompatParcelizer(switchToNext.AudioAttributesCompatParcelizer$default(writestartarray.getOnCommand(), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), writestartarray.getHandleMediaPlayPauseIfPendingOnHandler());
    }
}
