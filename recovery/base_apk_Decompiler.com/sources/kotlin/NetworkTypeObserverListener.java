package kotlin;

import com.marrow2.data.mcq.remote.McqFaqResponseBody;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkTypeObserverListener implements NetworkTypeObserverApi31DisplayInfoCallback {
    private final intersects AudioAttributesCompatParcelizer;
    private final putBinder AudioAttributesImplApi21Parcelizer;
    private final getPlayerStateString AudioAttributesImplApi26Parcelizer;
    private final closeCurrentOutputStream IconCompatParcelizer;
    private final r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc MediaBrowserCompatCustomActionResultReceiver;
    private final unlockFolder MediaBrowserCompatItemReceiver;
    private final getPlatform RemoteActionCompatParcelizer;
    private final copyWithMutationsApplied read;
    private final clearFatalError write;

    static final class IconCompatParcelizer extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        Object read;
        Object write;

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer(null, this);
        }
    }

    static final class MediaBrowserCompatMediaItem extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        int MediaBrowserCompatMediaItem;
        /* synthetic */ Object MediaDescriptionCompat;
        Object MediaMetadataCompat;
        Object RatingCompat;
        int RemoteActionCompatParcelizer;
        int read;
        int write;

        MediaBrowserCompatMediaItem(SampleVideos<? super MediaBrowserCompatMediaItem> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaDescriptionCompat = obj;
            this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer((String) null, (List<String>) null, this);
        }
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        int MediaBrowserCompatCustomActionResultReceiver;
        /* synthetic */ Object MediaBrowserCompatItemReceiver;
        int RemoteActionCompatParcelizer;
        int read;
        int write;

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatItemReceiver = obj;
            this.MediaBrowserCompatCustomActionResultReceiver |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.write(null, null, this);
        }
    }

    static final class onCommand extends getTotalMcq {
        long AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        Object RemoteActionCompatParcelizer;
        Object read;
        Object write;

        onCommand(SampleVideos<? super onCommand> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.AudioAttributesImplApi26Parcelizer |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.AudioAttributesImplBaseParcelizer(null, this);
        }
    }

    static final class onCustomAction extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        Object AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        boolean AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        boolean MediaBrowserCompatMediaItem;
        int MediaBrowserCompatSearchResultReceiver;
        boolean MediaMetadataCompat;
        /* synthetic */ Object RatingCompat;
        int RemoteActionCompatParcelizer;
        int read;
        Object write;

        onCustomAction(SampleVideos<? super onCustomAction> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RatingCompat = obj;
            this.MediaBrowserCompatSearchResultReceiver |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.RemoteActionCompatParcelizer((String) null, (String) null, 0, this);
        }
    }

    static final class onFastForward extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        int AudioAttributesImplApi21Parcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        boolean RemoteActionCompatParcelizer;
        Object read;
        Object write;

        onFastForward(SampleVideos<? super onFastForward> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.RemoteActionCompatParcelizer((String) null, (String) null, false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class onPause extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        boolean read;
        Object write;

        onPause(SampleVideos<? super onPause> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.AudioAttributesImplApi26Parcelizer |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.IconCompatParcelizer((String) null, (String) null, false, (SampleVideos<? super getShowPopup>) this);
        }
    }

    static final class onPlay extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        int AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        Object IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        int RemoteActionCompatParcelizer;
        Object read;
        int write;

        onPlay(SampleVideos<? super onPlay> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi21Parcelizer = obj;
            this.AudioAttributesImplApi26Parcelizer |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.write(null, null, 0, this);
        }
    }

    static final class onPlayFromMediaId extends getTotalMcq {
        int AudioAttributesCompatParcelizer;
        boolean AudioAttributesImplApi21Parcelizer;
        Object AudioAttributesImplApi26Parcelizer;
        Object AudioAttributesImplBaseParcelizer;
        int IconCompatParcelizer;
        Object MediaBrowserCompatCustomActionResultReceiver;
        Object MediaBrowserCompatItemReceiver;
        int MediaBrowserCompatMediaItem;
        boolean MediaDescriptionCompat;
        boolean MediaMetadataCompat;
        /* synthetic */ Object RatingCompat;
        int RemoteActionCompatParcelizer;
        int read;
        Object write;

        onPlayFromMediaId(SampleVideos<? super onPlayFromMediaId> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RatingCompat = obj;
            this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.IconCompatParcelizer((String) null, (String) null, 0, this);
        }
    }

    static final class write extends getTotalMcq {
        /* synthetic */ Object RemoteActionCompatParcelizer;
        int read;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            return NetworkTypeObserverListener.this.IconCompatParcelizer(this);
        }
    }

    private static boolean RemoteActionCompatParcelizer(int i, int i2) {
        return i != -1 && i + 1 == i2;
    }

    @setSdkPayload
    public NetworkTypeObserverListener(intersects intersectsVar, getPlayerStateString getplayerstatestring, putBinder putbinder, unlockFolder unlockfolder, r8lambdaPCVErwyXpSEovkAdoO9nP03HIVc r8lambdapcverwyxpseovkadoo9np03hivc, clearFatalError clearfatalerror, closeCurrentOutputStream closecurrentoutputstream, copyWithMutationsApplied copywithmutationsapplied, getPlatform getplatform) {
        toMagicModuleMetaRepoModel.write(intersectsVar, "");
        toMagicModuleMetaRepoModel.write(getplayerstatestring, "");
        toMagicModuleMetaRepoModel.write(putbinder, "");
        toMagicModuleMetaRepoModel.write(unlockfolder, "");
        toMagicModuleMetaRepoModel.write(r8lambdapcverwyxpseovkadoo9np03hivc, "");
        toMagicModuleMetaRepoModel.write(clearfatalerror, "");
        toMagicModuleMetaRepoModel.write(closecurrentoutputstream, "");
        toMagicModuleMetaRepoModel.write(copywithmutationsapplied, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.AudioAttributesCompatParcelizer = intersectsVar;
        this.AudioAttributesImplApi26Parcelizer = getplayerstatestring;
        this.AudioAttributesImplApi21Parcelizer = putbinder;
        this.MediaBrowserCompatItemReceiver = unlockfolder;
        this.MediaBrowserCompatCustomActionResultReceiver = r8lambdapcverwyxpseovkadoo9np03hivc;
        this.write = clearfatalerror;
        this.IconCompatParcelizer = closecurrentoutputstream;
        this.read = copywithmutationsapplied;
        this.RemoteActionCompatParcelizer = getplatform;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c A[PHI: r1 r2 r5 r7 r8
      0x011c: PHI (r1v7 int) = (r1v5 int), (r1v8 int) binds: [B:25:0x011a, B:16:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r2v12 java.lang.Object) = (r2v11 java.lang.Object), (r2v1 java.lang.Object) binds: [B:25:0x011a, B:16:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r5v11 int) = (r5v7 int), (r5v13 int) binds: [B:25:0x011a, B:16:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r7v8 java.lang.String) = (r7v4 java.lang.String), (r7v12 java.lang.String) binds: [B:25:0x011a, B:16:0x009e] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v7 java.lang.String) binds: [B:25:0x011a, B:16:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0159 A[PHI: r1 r2 r5 r7 r8 r9
      0x0159: PHI (r1v11 int) = (r1v9 int), (r1v13 int) binds: [B:30:0x0157, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r2v20 java.lang.Object) = (r2v19 java.lang.Object), (r2v1 java.lang.Object) binds: [B:30:0x0157, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r5v17 int) = (r5v14 int), (r5v19 int) binds: [B:30:0x0157, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r7v16 int) = (r7v13 int), (r7v18 int) binds: [B:30:0x0157, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r8v14 int) = (r8v8 int), (r8v16 int) binds: [B:30:0x0157, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r9v5 java.lang.String) = (r9v3 java.lang.String), (r9v9 java.lang.String) binds: [B:30:0x0157, B:14:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r22, java.lang.String r23, kotlin.SampleVideos<? super kotlin.ParsableByteArray> r24) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.write(java.lang.String, java.lang.String, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object read(String str, SampleVideos<? super List<dropTable>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(str, sampleVideos);
    }

    static final class RatingCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends createNotificationChannel>>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ NetworkTypeObserverListener IconCompatParcelizer;
        private /* synthetic */ Object read;
        private /* synthetic */ List<String> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            TopUserCompanion topUserCompanion = (TopUserCompanion) this.read;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                List<String> list = this.write;
                NetworkTypeObserverListener networkTypeObserverListener = this.IconCompatParcelizer;
                ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(setModifiedEndTimestampMs.IconCompatParcelizer(topUserCompanion, VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new RemoteActionCompatParcelizer(networkTypeObserverListener, (String) it.next(), null)));
                }
                this.read = null;
                this.AudioAttributesCompatParcelizer = 1;
                obj = setEndTimestamp.AudioAttributesCompatParcelizer(arrayList, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) obj, (Comparator) new AudioAttributesCompatParcelizer(this.write));
        }

        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super createNotificationChannel>, Object> {
            private Object AudioAttributesCompatParcelizer;
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ NetworkTypeObserverListener MediaBrowserCompatCustomActionResultReceiver;
            private Object RemoteActionCompatParcelizer;
            private Object read;
            private int write;

            /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instruction units count: 222
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.NetworkTypeObserverListener.RatingCompat.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            RemoteActionCompatParcelizer(NetworkTypeObserverListener networkTypeObserverListener, String str, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.MediaBrowserCompatCustomActionResultReceiver = networkTypeObserverListener;
                this.IconCompatParcelizer = str;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super createNotificationChannel> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        public static final class AudioAttributesCompatParcelizer<T> implements Comparator {
            private /* synthetic */ List IconCompatParcelizer;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return getConfigExpirySeconds.read(Integer.valueOf(this.IconCompatParcelizer.indexOf(((createNotificationChannel) t).getIconCompatParcelizer())), Integer.valueOf(this.IconCompatParcelizer.indexOf(((createNotificationChannel) t2).getIconCompatParcelizer())));
            }

            public AudioAttributesCompatParcelizer(List list) {
                this.IconCompatParcelizer = list;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RatingCompat(List<String> list, NetworkTypeObserverListener networkTypeObserverListener, SampleVideos<? super RatingCompat> sampleVideos) {
            super(2, sampleVideos);
            this.write = list;
            this.IconCompatParcelizer = networkTypeObserverListener;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            RatingCompat ratingCompat = new RatingCompat(this.write, this.IconCompatParcelizer, sampleVideos);
            ratingCompat.read = obj;
            return ratingCompat;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<createNotificationChannel>> sampleVideos) {
            return ((RatingCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object RemoteActionCompatParcelizer(List<String> list, SampleVideos<? super List<createNotificationChannel>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new RatingCompat(list, this, null), sampleVideos);
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends OnInputFrameProcessedListener>>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String write;

        public static final class IconCompatParcelizer<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Integer sortOrder = ((McqFaqResponseBody) t).getSortOrder();
                Integer numValueOf = sortOrder != null ? Integer.valueOf(sortOrder.intValue()) : null;
                Integer sortOrder2 = ((McqFaqResponseBody) t2).getSortOrder();
                return getConfigExpirySeconds.read(numValueOf, sortOrder2 != null ? Integer.valueOf(sortOrder2.intValue()) : null);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem(this.write, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            List<McqFaqResponseBody> listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) obj, (Comparator) new IconCompatParcelizer());
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesCompatParcelizer, 10));
            for (McqFaqResponseBody mcqFaqResponseBody : listAudioAttributesCompatParcelizer) {
                String answer = mcqFaqResponseBody.getAnswer();
                String str = "";
                if (answer == null) {
                    answer = "";
                }
                String question = mcqFaqResponseBody.getQuestion();
                if (question != null) {
                    str = question;
                }
                arrayList.add(new OnInputFrameProcessedListener(answer, str));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(String str, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new MediaBrowserCompatCustomActionResultReceiver(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<OnInputFrameProcessedListener>> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object AudioAttributesImplApi21Parcelizer(String str, SampleVideos<? super List<String>> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.onCustomAction(str, sampleVideos);
    }

    static final class MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super CachedContent>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object MediaBrowserCompatSearchResultReceiver;
        private int MediaDescriptionCompat;
        private Object RatingCompat;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ Object read;
        private /* synthetic */ String write;

        /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01dd A[LOOP:0: B:67:0x01d7->B:69:0x01dd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x026c  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x026f  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02a7  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x02c5  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r47) {
            /*
                Method dump skipped, instruction units count: 718
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.NetworkTypeObserverListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super CachedContent>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ NetworkTypeObserverListener IconCompatParcelizer;
            private /* synthetic */ String RemoteActionCompatParcelizer;
            private /* synthetic */ String write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                Object objIconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, this);
                return objIconCompatParcelizer2 == objIconCompatParcelizer ? objIconCompatParcelizer : objIconCompatParcelizer2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            RemoteActionCompatParcelizer(NetworkTypeObserverListener networkTypeObserverListener, String str, String str2, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = networkTypeObserverListener;
                this.RemoteActionCompatParcelizer = str;
                this.write = str2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super CachedContent> sampleVideos) {
                return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String str, String str2, SampleVideos<? super MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
            this.write = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = NetworkTypeObserverListener.this.new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.RemoteActionCompatParcelizer, this.write, sampleVideos);
            mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read = obj;
            return mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super CachedContent> sampleVideos) {
            return ((MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object IconCompatParcelizer(String str, String str2, SampleVideos<? super CachedContent> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(str, str2, null), sampleVideos);
    }

    static final class handleMediaPlayPauseIfPendingOnHandler extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super CachedContent>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private Object AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private Object MediaBrowserCompatCustomActionResultReceiver;
        private Object MediaBrowserCompatItemReceiver;
        private Object MediaBrowserCompatSearchResultReceiver;
        private int MediaDescriptionCompat;
        private Object RatingCompat;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ String read;
        private /* synthetic */ Object write;

        /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01dd A[LOOP:0: B:67:0x01d7->B:69:0x01dd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0251  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x026c  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x026f  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x029f  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02a7  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x02c5  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r47) {
            /*
                Method dump skipped, instruction units count: 718
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.NetworkTypeObserverListener.handleMediaPlayPauseIfPendingOnHandler.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super CachedContent>, Object> {
            private int AudioAttributesCompatParcelizer;
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ String RemoteActionCompatParcelizer;
            private /* synthetic */ NetworkTypeObserverListener read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.AudioAttributesCompatParcelizer;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return obj;
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                Object objIconCompatParcelizer2 = this.read.IconCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this);
                return objIconCompatParcelizer2 == objIconCompatParcelizer ? objIconCompatParcelizer : objIconCompatParcelizer2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            read(NetworkTypeObserverListener networkTypeObserverListener, String str, String str2, SampleVideos<? super read> sampleVideos) {
                super(2, sampleVideos);
                this.read = networkTypeObserverListener;
                this.IconCompatParcelizer = str;
                this.RemoteActionCompatParcelizer = str2;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new read(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super CachedContent> sampleVideos) {
                return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        handleMediaPlayPauseIfPendingOnHandler(String str, String str2, SampleVideos<? super handleMediaPlayPauseIfPendingOnHandler> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.read = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            handleMediaPlayPauseIfPendingOnHandler handlemediaplaypauseifpendingonhandler = NetworkTypeObserverListener.this.new handleMediaPlayPauseIfPendingOnHandler(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
            handlemediaplaypauseifpendingonhandler.write = obj;
            return handlemediaplaypauseifpendingonhandler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super CachedContent> sampleVideos) {
            return ((handleMediaPlayPauseIfPendingOnHandler) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object AudioAttributesCompatParcelizer(String str, String str2, SampleVideos<? super CachedContent> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new handleMediaPlayPauseIfPendingOnHandler(str, str2, null), sampleVideos);
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super String>, Object> {
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.read = 1;
                    obj = NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.onAddQueueItem(this.RemoteActionCompatParcelizer, this);
                    if (obj != objIconCompatParcelizer) {
                    }
                    return objIconCompatParcelizer;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                    return ((isReadingFromUpstream) obj).RemoteActionCompatParcelizer().getHandleMediaPlayPauseIfPendingOnHandler();
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                isHoleSpan isholespan = (isHoleSpan) obj;
                this.write = null;
                this.read = 2;
                obj = NetworkTypeObserverListener.this.IconCompatParcelizer.MediaBrowserCompatItemReceiver(isholespan.getAudioAttributesCompatParcelizer(), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                return ((isReadingFromUpstream) obj).RemoteActionCompatParcelizer().getHandleMediaPlayPauseIfPendingOnHandler();
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                return "";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(String str, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super String> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super String> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new AudioAttributesCompatParcelizer(str, null), sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        if (r0.IconCompatParcelizer(r5, r3) != r4) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object write(java.lang.String r23, java.lang.String r24, int r25, kotlin.SampleVideos<? super kotlin.getShowPopup> r26) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.write(java.lang.String, java.lang.String, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0151, code lost:
    
        if (r0.write(r1, r3) != r4) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r31, java.lang.String r32, int r33, kotlin.SampleVideos<? super kotlin.getShowPopup> r34) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.IconCompatParcelizer(java.lang.String, java.lang.String, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x015c, code lost:
    
        if (r0.write(r1, r4) != r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r31, java.lang.String r32, int r33, kotlin.SampleVideos<? super kotlin.getShowPopup> r34) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.RemoteActionCompatParcelizer(java.lang.String, java.lang.String, int, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r0.IconCompatParcelizer(r1, r2) == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(java.lang.String r20, java.lang.String r21, boolean r22, kotlin.SampleVideos<? super kotlin.getShowPopup> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof o.NetworkTypeObserverListener.onPause
            if (r2 == 0) goto L18
            r2 = r1
            o.NetworkTypeObserverListener$onPause r2 = (o.NetworkTypeObserverListener.onPause) r2
            int r3 = r2.AudioAttributesImplApi26Parcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.AudioAttributesImplApi26Parcelizer
            int r1 = r1 + r4
            r2.AudioAttributesImplApi26Parcelizer = r1
            goto L1d
        L18:
            o.NetworkTypeObserverListener$onPause r2 = new o.NetworkTypeObserverListener$onPause
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.AudioAttributesImplApi21Parcelizer
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.AudioAttributesImplApi26Parcelizer
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L4e
            if (r4 == r6) goto L44
            if (r4 != r5) goto L3c
            boolean r0 = r2.read
            java.lang.Object r0 = r2.write
            java.lang.Object r0 = r2.IconCompatParcelizer
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer
            java.lang.Object r0 = r2.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L90
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L44:
            boolean r4 = r2.read
            java.lang.Object r6 = r2.AudioAttributesCompatParcelizer
            java.lang.Object r6 = r2.RemoteActionCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L67
        L4e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            o.intersects r1 = r0.AudioAttributesCompatParcelizer
            r2.RemoteActionCompatParcelizer = r7
            r2.AudioAttributesCompatParcelizer = r7
            r4 = r22
            r2.read = r4
            r2.AudioAttributesImplApi26Parcelizer = r6
            r6 = r20
            r8 = r21
            java.lang.Object r1 = r1.AudioAttributesCompatParcelizer(r8, r6)
            if (r1 == r3) goto L93
        L67:
            r8 = r1
            o.dropTable r8 = (kotlin.dropTable) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 495(0x1ef, float:6.94E-43)
            r13 = r4
            o.dropTable r1 = kotlin.dropTable.RemoteActionCompatParcelizer(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            o.intersects r0 = r0.AudioAttributesCompatParcelizer
            r2.RemoteActionCompatParcelizer = r7
            r2.AudioAttributesCompatParcelizer = r7
            r2.IconCompatParcelizer = r7
            r2.write = r7
            r2.read = r4
            r2.AudioAttributesImplApi26Parcelizer = r5
            java.lang.Object r0 = r0.IconCompatParcelizer(r1, r2)
            if (r0 != r3) goto L90
            goto L93
        L90:
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
            return r0
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.IconCompatParcelizer(java.lang.String, java.lang.String, boolean, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r0.IconCompatParcelizer(r1, r2) == r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(java.lang.String r20, java.lang.String r21, boolean r22, kotlin.SampleVideos<? super kotlin.getShowPopup> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof o.NetworkTypeObserverListener.onFastForward
            if (r2 == 0) goto L18
            r2 = r1
            o.NetworkTypeObserverListener$onFastForward r2 = (o.NetworkTypeObserverListener.onFastForward) r2
            int r3 = r2.AudioAttributesImplApi21Parcelizer
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r1 = r2.AudioAttributesImplApi21Parcelizer
            int r1 = r1 + r4
            r2.AudioAttributesImplApi21Parcelizer = r1
            goto L1d
        L18:
            o.NetworkTypeObserverListener$onFastForward r2 = new o.NetworkTypeObserverListener$onFastForward
            r2.<init>(r1)
        L1d:
            java.lang.Object r1 = r2.AudioAttributesImplApi26Parcelizer
            java.lang.Object r3 = kotlin.getYear.IconCompatParcelizer()
            int r4 = r2.AudioAttributesImplApi21Parcelizer
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L4e
            if (r4 == r6) goto L44
            if (r4 != r5) goto L3c
            boolean r0 = r2.RemoteActionCompatParcelizer
            java.lang.Object r0 = r2.AudioAttributesCompatParcelizer
            java.lang.Object r0 = r2.write
            java.lang.Object r0 = r2.read
            java.lang.Object r0 = r2.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L90
        L3c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L44:
            boolean r4 = r2.RemoteActionCompatParcelizer
            java.lang.Object r6 = r2.read
            java.lang.Object r6 = r2.IconCompatParcelizer
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            goto L67
        L4e:
            kotlin.SdkPayloadData.IconCompatParcelizer(r1)
            o.intersects r1 = r0.AudioAttributesCompatParcelizer
            r2.IconCompatParcelizer = r7
            r2.read = r7
            r4 = r22
            r2.RemoteActionCompatParcelizer = r4
            r2.AudioAttributesImplApi21Parcelizer = r6
            r6 = r20
            r8 = r21
            java.lang.Object r1 = r1.AudioAttributesCompatParcelizer(r8, r6)
            if (r1 == r3) goto L93
        L67:
            r8 = r1
            o.dropTable r8 = (kotlin.dropTable) r8
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 447(0x1bf, float:6.26E-43)
            r15 = r4
            o.dropTable r1 = kotlin.dropTable.RemoteActionCompatParcelizer(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            o.intersects r0 = r0.AudioAttributesCompatParcelizer
            r2.IconCompatParcelizer = r7
            r2.read = r7
            r2.write = r7
            r2.AudioAttributesCompatParcelizer = r7
            r2.RemoteActionCompatParcelizer = r4
            r2.AudioAttributesImplApi21Parcelizer = r5
            java.lang.Object r0 = r0.IconCompatParcelizer(r1, r2)
            if (r0 != r3) goto L90
            goto L93
        L90:
            o.getShowPopup r0 = kotlin.getShowPopup.INSTANCE
            return r0
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.RemoteActionCompatParcelizer(java.lang.String, java.lang.String, boolean, o.SampleVideos):java.lang.Object");
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object read(String str, String str2, SampleVideos<? super dropTable> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(str2, str);
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object write(SampleVideos<? super Integer> sampleVideos) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(sampleVideos);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private Object RemoteActionCompatParcelizer;
        private /* synthetic */ onDisplayInfoChanged read;
        private Object write;

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
        
            if (r4.write(r3, r1, ((java.lang.Number) r9).intValue(), r8) == r0) goto L18;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r8.AudioAttributesImplBaseParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                goto L6a
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1a:
                java.lang.Object r1 = r8.IconCompatParcelizer
                o.onDisplayInfoChanged r1 = (kotlin.onDisplayInfoChanged) r1
                java.lang.Object r3 = r8.write
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r8.RemoteActionCompatParcelizer
                o.intersects r4 = (kotlin.intersects) r4
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                goto L51
            L2a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r9)
                o.NetworkTypeObserverListener r9 = kotlin.NetworkTypeObserverListener.this
                o.intersects r4 = kotlin.NetworkTypeObserverListener.read(r9)
                java.lang.String r9 = r8.AudioAttributesCompatParcelizer
                o.onDisplayInfoChanged r1 = r8.read
                o.NetworkTypeObserverListener r5 = kotlin.NetworkTypeObserverListener.this
                o.unlockFolder r5 = kotlin.NetworkTypeObserverListener.IconCompatParcelizer(r5)
                r6 = r8
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r8.RemoteActionCompatParcelizer = r4
                r8.write = r9
                r8.IconCompatParcelizer = r1
                r8.AudioAttributesImplBaseParcelizer = r3
                java.lang.Object r3 = r5.AudioAttributesImplBaseParcelizer(r6)
                if (r3 == r0) goto L6d
                r7 = r3
                r3 = r9
                r9 = r7
            L51:
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                r5 = r8
                o.SampleVideos r5 = (kotlin.SampleVideos) r5
                r6 = 0
                r8.RemoteActionCompatParcelizer = r6
                r8.write = r6
                r8.IconCompatParcelizer = r6
                r8.AudioAttributesImplBaseParcelizer = r2
                java.lang.Object r8 = r4.write(r3, r1, r9, r5)
                if (r8 != r0) goto L6a
                goto L6d
            L6a:
                o.getShowPopup r8 = kotlin.getShowPopup.INSTANCE
                return r8
            L6d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.NetworkTypeObserverListener.RemoteActionCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.read = ondisplayinfochanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object RemoteActionCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new RemoteActionCompatParcelizer(str, ondisplayinfochanged, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ onDisplayInfoChanged IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.IconCompatParcelizer = ondisplayinfochanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new read(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object AudioAttributesCompatParcelizer(String str, onDisplayInfoChanged ondisplayinfochanged, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new read(str, ondisplayinfochanged, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super onDisplayInfoChanged>, Object> {
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.onAddQueueItem(this.RemoteActionCompatParcelizer, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return NonNullApi.AudioAttributesCompatParcelizer((isHoleSpan) obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi26Parcelizer(String str, SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super onDisplayInfoChanged> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object write(String str, SampleVideos<? super onDisplayInfoChanged> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new AudioAttributesImplApi26Parcelizer(str, null), sampleVideos);
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object IconCompatParcelizer() {
        return new Pair(this.MediaBrowserCompatCustomActionResultReceiver.onAddQueueItem(), this.MediaBrowserCompatCustomActionResultReceiver.RatingCompat());
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object write() {
        return QBankStatsResponse.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem());
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object IconCompatParcelizer(String str, SampleVideos<? super List<OnInputFrameProcessedListener>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new MediaBrowserCompatCustomActionResultReceiver(str, null), sampleVideos);
    }

    static final class onAddQueueItem extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ List<Integer> read;
        private /* synthetic */ String write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
        
            if (r1.read(((java.lang.Number) r12).intValue(), r11.IconCompatParcelizer, r11.write, r11.RemoteActionCompatParcelizer, r11.read, kotlin.LoadErrorHandlingPolicyFallbackType.AudioAttributesCompatParcelizer, r11) == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r11.AudioAttributesImplApi21Parcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                goto L5e
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L1a:
                java.lang.Object r1 = r11.AudioAttributesCompatParcelizer
                o.clearFatalError r1 = (kotlin.clearFatalError) r1
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                goto L3e
            L22:
                kotlin.SdkPayloadData.IconCompatParcelizer(r12)
                o.NetworkTypeObserverListener r12 = kotlin.NetworkTypeObserverListener.this
                o.clearFatalError r1 = kotlin.NetworkTypeObserverListener.AudioAttributesCompatParcelizer(r12)
                o.NetworkTypeObserverListener r12 = kotlin.NetworkTypeObserverListener.this
                o.unlockFolder r12 = kotlin.NetworkTypeObserverListener.IconCompatParcelizer(r12)
                r4 = r11
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r11.AudioAttributesCompatParcelizer = r1
                r11.AudioAttributesImplApi21Parcelizer = r3
                java.lang.Object r12 = r12.AudioAttributesImplBaseParcelizer(r4)
                if (r12 == r0) goto L61
            L3e:
                r3 = r1
                java.lang.Number r12 = (java.lang.Number) r12
                int r4 = r12.intValue()
                java.lang.String r5 = r11.IconCompatParcelizer
                java.lang.String r6 = r11.write
                java.lang.String r7 = r11.RemoteActionCompatParcelizer
                java.util.List<java.lang.Integer> r8 = r11.read
                o.LoadErrorHandlingPolicyFallbackType r9 = kotlin.LoadErrorHandlingPolicyFallbackType.AudioAttributesCompatParcelizer
                r10 = r11
                o.SampleVideos r10 = (kotlin.SampleVideos) r10
                r12 = 0
                r11.AudioAttributesCompatParcelizer = r12
                r11.AudioAttributesImplApi21Parcelizer = r2
                java.lang.Object r11 = r3.read(r4, r5, r6, r7, r8, r9, r10)
                if (r11 != r0) goto L5e
                goto L61
            L5e:
                o.getShowPopup r11 = kotlin.getShowPopup.INSTANCE
                return r11
            L61:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.NetworkTypeObserverListener.onAddQueueItem.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onAddQueueItem(String str, String str2, String str3, List<Integer> list, SampleVideos<? super onAddQueueItem> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = str;
            this.write = str2;
            this.RemoteActionCompatParcelizer = str3;
            this.read = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new onAddQueueItem(this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((onAddQueueItem) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object RemoteActionCompatParcelizer(String str, String str2, String str3, List<Integer> list, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new onAddQueueItem(str, str2, str3, list, null), sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x010e -> B:29:0x0116). Please report as a decompilation issue!!! */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r19, java.util.List<java.lang.String> r20, kotlin.SampleVideos<? super java.util.List<kotlin.readBytesAsString>> r21) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.AudioAttributesCompatParcelizer(java.lang.String, java.util.List, o.SampleVideos):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesImplBaseParcelizer(java.lang.String r20, kotlin.SampleVideos<? super java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.AudioAttributesImplBaseParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }

    static final class MediaDescriptionCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends putInt>>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ RepeatModeUtil RemoteActionCompatParcelizer;
        private /* synthetic */ int read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                obj = NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.write(this.write, this.read, RepeatModeUtilRepeatToggleModes.write(this.RemoteActionCompatParcelizer), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(readBitsToLong.RemoteActionCompatParcelizer((CacheWriterProgressListener) it.next()));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(String str, int i, RepeatModeUtil repeatModeUtil, SampleVideos<? super MediaDescriptionCompat> sampleVideos) {
            super(2, sampleVideos);
            this.write = str;
            this.read = i;
            this.RemoteActionCompatParcelizer = repeatModeUtil;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new MediaDescriptionCompat(this.write, this.read, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<putInt>> sampleVideos) {
            return ((MediaDescriptionCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object AudioAttributesCompatParcelizer(String str, int i, RepeatModeUtil repeatModeUtil, SampleVideos<? super List<putInt>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new MediaDescriptionCompat(str, i, repeatModeUtil, null), sampleVideos);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object IconCompatParcelizer(kotlin.SampleVideos<? super java.util.List<kotlin.putInt>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o.NetworkTypeObserverListener.write
            if (r0 == 0) goto L14
            r0 = r5
            o.NetworkTypeObserverListener$write r0 = (o.NetworkTypeObserverListener.write) r0
            int r1 = r0.read
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.read
            int r5 = r5 + r2
            r0.read = r5
            goto L19
        L14:
            o.NetworkTypeObserverListener$write r0 = new o.NetworkTypeObserverListener$write
            r0.<init>(r5)
        L19:
            java.lang.Object r5 = r0.RemoteActionCompatParcelizer
            java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
            int r2 = r0.read
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            kotlin.SdkPayloadData.IconCompatParcelizer(r5)
            o.intersects r4 = r4.AudioAttributesCompatParcelizer
            o.RepeatModeUtil r5 = kotlin.RepeatModeUtil.RemoteActionCompatParcelizer
            o.CopyOnWriteMultiset r5 = kotlin.RepeatModeUtilRepeatToggleModes.write(r5)
            r0.read = r3
            java.lang.Object r5 = r4.write(r5, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r5, r0)
            r4.<init>(r0)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r5 = r5.iterator()
        L59:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r5.next()
            o.CacheWriterProgressListener r0 = (kotlin.CacheWriterProgressListener) r0
            o.putInt r0 = kotlin.readBitsToLong.RemoteActionCompatParcelizer(r0)
            r4.add(r0)
            goto L59
        L6d:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.IconCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends skipBytes>>, Object> {
        private /* synthetic */ int read;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                obj = NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.read(this.read, this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            Iterable<CachedContentIndex> iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterable, 10));
            for (CachedContentIndex cachedContentIndex : iterable) {
                arrayList.add(new skipBytes(cachedContentIndex.read(), cachedContentIndex.write(), cachedContentIndex.IconCompatParcelizer()));
            }
            return arrayList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(int i, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.read = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new AudioAttributesImplApi21Parcelizer(this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<skipBytes>> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super List<skipBytes>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new AudioAttributesImplApi21Parcelizer(0, null), sampleVideos);
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends String>>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.write = 1;
            Object objWrite = NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this);
            return objWrite == objIconCompatParcelizer ? objIconCompatParcelizer : objWrite;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatItemReceiver(String str, int i, SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.RemoteActionCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<String>> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object read(String str, int i, SampleVideos<? super List<String>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new MediaBrowserCompatItemReceiver(str, i, null), sampleVideos);
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends String>>, Object> {
        private /* synthetic */ int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.RemoteActionCompatParcelizer = 1;
            Object objWrite = NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.write(this.IconCompatParcelizer, this);
            return objWrite == objIconCompatParcelizer ? objIconCompatParcelizer : objWrite;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(int i, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<String>> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object write(int i, SampleVideos<? super List<String>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new AudioAttributesImplBaseParcelizer(i, null), sampleVideos);
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super List<? extends String>>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            Object obj2 = NetworkTypeObserverListener.this.AudioAttributesCompatParcelizer.read(this.AudioAttributesCompatParcelizer, this.read, this);
            return obj2 == objIconCompatParcelizer ? objIconCompatParcelizer : obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(String str, int i, SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.read = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return NetworkTypeObserverListener.this.new MediaMetadataCompat(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super List<String>> sampleVideos) {
            return ((MediaMetadataCompat) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    public final Object IconCompatParcelizer(String str, int i, SampleVideos<? super List<String>> sampleVideos) {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, new MediaMetadataCompat(str, i, null), sampleVideos);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        if (r8.RemoteActionCompatParcelizer(r9, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[LOOP:0: B:23:0x0099->B:25:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // kotlin.NetworkTypeObserverApi31DisplayInfoCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object AudioAttributesCompatParcelizer(java.lang.String r9, kotlin.SampleVideos<? super kotlin.getShowPopup> r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NetworkTypeObserverListener.AudioAttributesCompatParcelizer(java.lang.String, o.SampleVideos):java.lang.Object");
    }
}
