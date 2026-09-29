package kotlin;

import kotlin.LessonSpinnerItem;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class setPeopleSolved {
    public static final RemoteActionCompatParcelizer<setActiveRecallQbankId.RemoteActionCompatParcelizer.write> AudioAttributesCompatParcelizer;
    public static final read AudioAttributesImplApi21Parcelizer;
    public static final read AudioAttributesImplApi26Parcelizer;
    public static final read AudioAttributesImplBaseParcelizer;
    public static final read IconCompatParcelizer;
    public static final read MediaBrowserCompatCustomActionResultReceiver;
    public static final read MediaBrowserCompatItemReceiver;
    public static final read MediaBrowserCompatMediaItem;
    public static final read MediaBrowserCompatSearchResultReceiver;
    public static final read MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public static final read MediaDescriptionCompat;
    public static final read MediaMetadataCompat;
    public static final read RatingCompat;
    public static final read RemoteActionCompatParcelizer;
    public static final read handleMediaPlayPauseIfPendingOnHandler;
    public static final read onAddQueueItem;
    public static final read onCommand;
    public static final read onCustomAction;
    public static final read onFastForward;
    public static final read onMediaButtonEvent;
    public static final read onPause;
    public static final read onPlay;
    public static final read onPlayFromMediaId;
    public static final read onPlayFromSearch;
    public static final read onPlayFromUri;
    public static final read onPrepare;
    public static final read onPrepareFromMediaId;
    public static final read onPrepareFromSearch;
    public static final read onPrepareFromUri;
    public static final read onRemoveQueueItem;
    public static final read onRemoveQueueItemAt;
    public static final read onRewind;
    public static final read onSeekTo;
    public static final read onSetPlaybackSpeed;
    public static final RemoteActionCompatParcelizer<setActiveRecallQbankId.onMediaButtonEvent> onSetRating;
    public static final RemoteActionCompatParcelizer<setActiveRecallQbankId.AudioAttributesImplBaseParcelizer> onSetRepeatMode;
    public static final RemoteActionCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatCustomActionResultReceiver> onSetShuffleMode;
    public static final read read;
    public static final read write;

    static {
        read readVarAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        onSetPlaybackSpeed = readVarAudioAttributesCompatParcelizer;
        write = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer);
        read readVarAudioAttributesCompatParcelizer2 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        read = readVarAudioAttributesCompatParcelizer2;
        RemoteActionCompatParcelizer<setActiveRecallQbankId.onMediaButtonEvent> remoteActionCompatParcelizerAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(readVarAudioAttributesCompatParcelizer2, setActiveRecallQbankId.onMediaButtonEvent.values());
        onSetRating = remoteActionCompatParcelizerAudioAttributesCompatParcelizer;
        RemoteActionCompatParcelizer<setActiveRecallQbankId.MediaBrowserCompatCustomActionResultReceiver> remoteActionCompatParcelizerAudioAttributesCompatParcelizer2 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerAudioAttributesCompatParcelizer, setActiveRecallQbankId.MediaBrowserCompatCustomActionResultReceiver.values());
        onSetShuffleMode = remoteActionCompatParcelizerAudioAttributesCompatParcelizer2;
        RemoteActionCompatParcelizer<setActiveRecallQbankId.RemoteActionCompatParcelizer.write> remoteActionCompatParcelizerAudioAttributesCompatParcelizer3 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerAudioAttributesCompatParcelizer2, setActiveRecallQbankId.RemoteActionCompatParcelizer.write.values());
        AudioAttributesCompatParcelizer = remoteActionCompatParcelizerAudioAttributesCompatParcelizer3;
        read readVarAudioAttributesCompatParcelizer3 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) remoteActionCompatParcelizerAudioAttributesCompatParcelizer3);
        onPlayFromMediaId = readVarAudioAttributesCompatParcelizer3;
        read readVarAudioAttributesCompatParcelizer4 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer3);
        MediaBrowserCompatMediaItem = readVarAudioAttributesCompatParcelizer4;
        read readVarAudioAttributesCompatParcelizer5 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer4);
        handleMediaPlayPauseIfPendingOnHandler = readVarAudioAttributesCompatParcelizer5;
        read readVarAudioAttributesCompatParcelizer6 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer5);
        MediaMetadataCompat = readVarAudioAttributesCompatParcelizer6;
        read readVarAudioAttributesCompatParcelizer7 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer6);
        onSeekTo = readVarAudioAttributesCompatParcelizer7;
        onPause = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer7);
        read readVarAudioAttributesCompatParcelizer8 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) remoteActionCompatParcelizerAudioAttributesCompatParcelizer);
        onPrepare = readVarAudioAttributesCompatParcelizer8;
        MediaBrowserCompatCustomActionResultReceiver = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer8);
        RemoteActionCompatParcelizer<setActiveRecallQbankId.AudioAttributesImplBaseParcelizer> remoteActionCompatParcelizerAudioAttributesCompatParcelizer4 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerAudioAttributesCompatParcelizer2, setActiveRecallQbankId.AudioAttributesImplBaseParcelizer.values());
        onSetRepeatMode = remoteActionCompatParcelizerAudioAttributesCompatParcelizer4;
        read readVarAudioAttributesCompatParcelizer9 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) remoteActionCompatParcelizerAudioAttributesCompatParcelizer4);
        onPlayFromSearch = readVarAudioAttributesCompatParcelizer9;
        read readVarAudioAttributesCompatParcelizer10 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer9);
        onMediaButtonEvent = readVarAudioAttributesCompatParcelizer10;
        read readVarAudioAttributesCompatParcelizer11 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer10);
        onFastForward = readVarAudioAttributesCompatParcelizer11;
        read readVarAudioAttributesCompatParcelizer12 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer11);
        onRemoveQueueItem = readVarAudioAttributesCompatParcelizer12;
        read readVarAudioAttributesCompatParcelizer13 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer12);
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = readVarAudioAttributesCompatParcelizer13;
        read readVarAudioAttributesCompatParcelizer14 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer13);
        onRewind = readVarAudioAttributesCompatParcelizer14;
        read readVarAudioAttributesCompatParcelizer15 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer14);
        RatingCompat = readVarAudioAttributesCompatParcelizer15;
        onAddQueueItem = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer15);
        read readVarAudioAttributesCompatParcelizer16 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) remoteActionCompatParcelizerAudioAttributesCompatParcelizer4);
        onPrepareFromUri = readVarAudioAttributesCompatParcelizer16;
        read readVarAudioAttributesCompatParcelizer17 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer16);
        AudioAttributesImplApi21Parcelizer = readVarAudioAttributesCompatParcelizer17;
        read readVarAudioAttributesCompatParcelizer18 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer17);
        MediaBrowserCompatItemReceiver = readVarAudioAttributesCompatParcelizer18;
        read readVarAudioAttributesCompatParcelizer19 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer18);
        AudioAttributesImplBaseParcelizer = readVarAudioAttributesCompatParcelizer19;
        read readVarAudioAttributesCompatParcelizer20 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer19);
        onPrepareFromMediaId = readVarAudioAttributesCompatParcelizer20;
        read readVarAudioAttributesCompatParcelizer21 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer20);
        IconCompatParcelizer = readVarAudioAttributesCompatParcelizer21;
        read readVarAudioAttributesCompatParcelizer22 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer21);
        onCommand = readVarAudioAttributesCompatParcelizer22;
        read readVarAudioAttributesCompatParcelizer23 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer22);
        MediaBrowserCompatSearchResultReceiver = readVarAudioAttributesCompatParcelizer23;
        MediaDescriptionCompat = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer23);
        read readVarAudioAttributesCompatParcelizer24 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer2);
        RemoteActionCompatParcelizer = readVarAudioAttributesCompatParcelizer24;
        read readVarAudioAttributesCompatParcelizer25 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer24);
        AudioAttributesImplApi26Parcelizer = readVarAudioAttributesCompatParcelizer25;
        onPlayFromUri = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer25);
        read readVarAudioAttributesCompatParcelizer26 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) remoteActionCompatParcelizerAudioAttributesCompatParcelizer2);
        onPrepareFromSearch = readVarAudioAttributesCompatParcelizer26;
        read readVarAudioAttributesCompatParcelizer27 = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer26);
        onCustomAction = readVarAudioAttributesCompatParcelizer27;
        onPlay = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) readVarAudioAttributesCompatParcelizer27);
        RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer((RemoteActionCompatParcelizer<?>) RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer());
        onRemoveQueueItemAt = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public static int read(boolean z, setActiveRecallQbankId.onMediaButtonEvent onmediabuttonevent, setActiveRecallQbankId.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        if (onmediabuttonevent == null) {
            read(10);
        }
        if (mediaBrowserCompatCustomActionResultReceiver == null) {
            read(11);
        }
        int iAudioAttributesCompatParcelizer = read.AudioAttributesCompatParcelizer(Boolean.valueOf(z));
        int iAudioAttributesCompatParcelizer2 = onSetShuffleMode.AudioAttributesCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver);
        int iAudioAttributesCompatParcelizer3 = onSetRating.AudioAttributesCompatParcelizer(onmediabuttonevent);
        int iAudioAttributesCompatParcelizer4 = onPrepareFromSearch.AudioAttributesCompatParcelizer(Boolean.FALSE);
        return iAudioAttributesCompatParcelizer | iAudioAttributesCompatParcelizer2 | iAudioAttributesCompatParcelizer3 | iAudioAttributesCompatParcelizer4 | onCustomAction.AudioAttributesCompatParcelizer(Boolean.FALSE) | onPlay.AudioAttributesCompatParcelizer(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void read(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPeopleSolved.read(int):void");
    }

    public static abstract class RemoteActionCompatParcelizer<E> {
        public final int RemoteActionCompatParcelizer;
        public final int write;

        public abstract int AudioAttributesCompatParcelizer(E e);

        public abstract E IconCompatParcelizer(int i);

        /* synthetic */ RemoteActionCompatParcelizer(int i, int i2, byte b) {
            this(i, i2);
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lo/LessonSpinnerItem$AudioAttributesCompatParcelizer;>(Lo/setPeopleSolved$RemoteActionCompatParcelizer<*>;[TE;)Lo/setPeopleSolved$RemoteActionCompatParcelizer<TE;>; */
        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, LessonSpinnerItem.AudioAttributesCompatParcelizer[] audioAttributesCompatParcelizerArr) {
            return new IconCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer + remoteActionCompatParcelizer.write, audioAttributesCompatParcelizerArr);
        }

        public static read AudioAttributesCompatParcelizer() {
            return new read(0);
        }

        public static read AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer) {
            return new read(remoteActionCompatParcelizer.RemoteActionCompatParcelizer + remoteActionCompatParcelizer.write);
        }

        private RemoteActionCompatParcelizer(int i, int i2) {
            this.RemoteActionCompatParcelizer = i;
            this.write = i2;
        }
    }

    public static class read extends RemoteActionCompatParcelizer<Boolean> {
        public read(int i) {
            super(i, 1, (byte) 0);
        }

        @Override // o.setPeopleSolved.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean IconCompatParcelizer(int i) {
            Boolean boolValueOf = Boolean.valueOf(((1 << this.RemoteActionCompatParcelizer) & i) != 0);
            if (boolValueOf == null) {
                IconCompatParcelizer();
            }
            return boolValueOf;
        }

        @Override // o.setPeopleSolved.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final int AudioAttributesCompatParcelizer(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.RemoteActionCompatParcelizer;
            }
            return 0;
        }

        private static /* synthetic */ void IconCompatParcelizer() {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }
    }

    static class IconCompatParcelizer<E extends LessonSpinnerItem.AudioAttributesCompatParcelizer> extends RemoteActionCompatParcelizer<E> {
        private final E[] read;

        public IconCompatParcelizer(int i, E[] eArr) {
            super(i, AudioAttributesCompatParcelizer((Object[]) eArr), (byte) 0);
            this.read = eArr;
        }

        private static <E> int AudioAttributesCompatParcelizer(E[] eArr) {
            if (eArr == null) {
                IconCompatParcelizer();
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            StringBuilder sb = new StringBuilder("Empty enum: ");
            sb.append(eArr.getClass());
            throw new IllegalStateException(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.setPeopleSolved.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public E IconCompatParcelizer(int i) {
            int i2 = this.write;
            int i3 = this.RemoteActionCompatParcelizer;
            int i4 = this.RemoteActionCompatParcelizer;
            for (E e : this.read) {
                if (e.RemoteActionCompatParcelizer() == (((((1 << i2) - 1) << i3) & i) >> i4)) {
                    return e;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // o.setPeopleSolved.RemoteActionCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public int AudioAttributesCompatParcelizer(E e) {
            return e.RemoteActionCompatParcelizer() << this.RemoteActionCompatParcelizer;
        }

        private static /* synthetic */ void IconCompatParcelizer() {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }
    }
}
