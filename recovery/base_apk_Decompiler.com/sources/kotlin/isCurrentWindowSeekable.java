package kotlin;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.getChildPeriodUidFromConcatenatedUid;
import kotlin.isCurrentWindowSeekable;
import kotlin.j;

/* JADX INFO: loaded from: classes2.dex */
public final class isCurrentWindowSeekable {
    private final fromBundle AudioAttributesCompatParcelizer;
    private final WorkerParameters.RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private final toBundle AudioAttributesImplApi26Parcelizer;
    private final List<String> AudioAttributesImplBaseParcelizer;
    private final b IconCompatParcelizer;
    private final WorkDatabase MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final CVolumeFlags MediaBrowserCompatMediaItem;
    private final setEnableDecoderFallback MediaBrowserCompatSearchResultReceiver;
    private final isMockTest MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final CVideoChangeFrameRateStrategy RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private final j read;
    private final setInstallerPackageName write;

    static final class read extends getTotalMcq {
        Object IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        /* synthetic */ Object read;

        read(SampleVideos<? super read> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return isCurrentWindowSeekable.this.RemoteActionCompatParcelizer(this);
        }
    }

    public isCurrentWindowSeekable(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategyMediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        this.RatingCompat = cVideoChangeFrameRateStrategyMediaBrowserCompatItemReceiver;
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer.read();
        this.MediaMetadataCompat = cVideoChangeFrameRateStrategyMediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer;
        this.AudioAttributesImplApi21Parcelizer = audioAttributesCompatParcelizer.write();
        this.read = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        b bVarAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer = bVarAudioAttributesCompatParcelizer;
        this.write = bVarAudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        WorkDatabase workDatabaseMediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatCustomActionResultReceiver = workDatabaseMediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatMediaItem = workDatabaseMediaBrowserCompatCustomActionResultReceiver.onMediaButtonEvent();
        this.AudioAttributesCompatParcelizer = workDatabaseMediaBrowserCompatCustomActionResultReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        List<String> listAudioAttributesImplApi26Parcelizer = audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        this.AudioAttributesImplBaseParcelizer = listAudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(listAudioAttributesImplApi26Parcelizer);
        this.MediaDescriptionCompat = getUserConfig.RemoteActionCompatParcelizer((setPassingYear) null);
    }

    public final CVideoChangeFrameRateStrategy RemoteActionCompatParcelizer() {
        return this.RatingCompat;
    }

    public final CProjection AudioAttributesCompatParcelizer() {
        return onReleased.read(this.RatingCompat);
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super Boolean>, Object> {
        private int AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            final write.read readVar;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            int i2 = 1;
            j.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.AudioAttributesCompatParcelizer = 1;
                    obj = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(isCurrentWindowSeekable.this.MediaDescriptionCompat, new C0114IconCompatParcelizer(isCurrentWindowSeekable.this, null), this);
                    if (obj == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                readVar = (write) obj;
            } catch (isCurrentMediaItemLive e) {
                readVar = new write.C0115write(e.write());
            } catch (CancellationException unused) {
                readVar = new write.read(remoteActionCompatParcelizer, i2, objArr3 == true ? 1 : 0);
            } catch (Throwable unused2) {
                String unused3 = pause.write;
                n.write();
                readVar = new write.read(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
            }
            WorkDatabase workDatabase = isCurrentWindowSeekable.this.MediaBrowserCompatCustomActionResultReceiver;
            final isCurrentWindowSeekable iscurrentwindowseekable = isCurrentWindowSeekable.this;
            Object objWrite = workDatabase.write((Callable<Object>) new Callable() { // from class: o.play
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return isCurrentWindowSeekable.IconCompatParcelizer.IconCompatParcelizer(readVar, iscurrentwindowseekable);
                }
            });
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objWrite, "");
            return objWrite;
        }

        /* JADX INFO: renamed from: o.isCurrentWindowSeekable$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        static final class C0114IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super write>, Object> {
            final /* synthetic */ isCurrentWindowSeekable IconCompatParcelizer;
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
                Object objRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
                return objRemoteActionCompatParcelizer == objIconCompatParcelizer ? objIconCompatParcelizer : objRemoteActionCompatParcelizer;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0114IconCompatParcelizer(isCurrentWindowSeekable iscurrentwindowseekable, SampleVideos<? super C0114IconCompatParcelizer> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = iscurrentwindowseekable;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new C0114IconCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super write> sampleVideos) {
                return ((C0114IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Boolean IconCompatParcelizer(write writeVar, isCurrentWindowSeekable iscurrentwindowseekable) {
            boolean zWrite;
            if (writeVar instanceof write.AudioAttributesCompatParcelizer) {
                zWrite = iscurrentwindowseekable.IconCompatParcelizer(((write.AudioAttributesCompatParcelizer) writeVar).read());
            } else if (writeVar instanceof write.read) {
                iscurrentwindowseekable.AudioAttributesCompatParcelizer(((write.read) writeVar).getRemoteActionCompatParcelizer());
                zWrite = false;
            } else {
                if (!(writeVar instanceof write.C0115write)) {
                    throw new RenewEligibleCreator();
                }
                zWrite = iscurrentwindowseekable.write(((write.C0115write) writeVar).getWrite());
            }
            return Boolean.valueOf(zWrite);
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isCurrentWindowSeekable.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super Boolean> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final Mp4ExtractorExternalSyntheticLambda0<Boolean> read() {
        return i.write(this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer().plus(getUserConfig.RemoteActionCompatParcelizer((setPassingYear) null)), getCollegeName.write, new IconCompatParcelizer(null));
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lo/isCurrentWindowSeekable$write;", "", "<init>", "()V", "write", "read", "AudioAttributesCompatParcelizer", "Lo/isCurrentWindowSeekable$write$read;", "Lo/isCurrentWindowSeekable$write$AudioAttributesCompatParcelizer;", "Lo/isCurrentWindowSeekable$write$write;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static abstract class write {

        /* JADX INFO: renamed from: o.isCurrentWindowSeekable$write$write, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lo/isCurrentWindowSeekable$write$write;", "Lo/isCurrentWindowSeekable$write;", "", "p0", "<init>", "(I)V", "RemoteActionCompatParcelizer", "I", "()I", "write"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C0115write extends write {

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
            private final int write;

            public C0115write(int i) {
                super(null);
                this.write = i;
            }

            public /* synthetic */ C0115write(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this((i2 & 1) != 0 ? -256 : i);
            }

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
            public final int getWrite() {
                return this.write;
            }

            public C0115write() {
                this(0, 1, null);
            }
        }

        private write() {
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/isCurrentWindowSeekable$write$read;", "Lo/isCurrentWindowSeekable$write;", "Lo/j$RemoteActionCompatParcelizer;", "p0", "<init>", "(Lo/j$RemoteActionCompatParcelizer;)V", "write", "Lo/j$RemoteActionCompatParcelizer;", "read", "()Lo/j$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class read extends write {

            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            private final j.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private read(j.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                super(null);
                toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
                this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            }

            public /* synthetic */ read(j.RemoteActionCompatParcelizer.IconCompatParcelizer iconCompatParcelizer, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
                this((i & 1) != 0 ? new j.RemoteActionCompatParcelizer.IconCompatParcelizer() : iconCompatParcelizer);
            }

            /* JADX INFO: renamed from: read, reason: from getter */
            public final j.RemoteActionCompatParcelizer getRemoteActionCompatParcelizer() {
                return this.RemoteActionCompatParcelizer;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public read() {
                this(null, 1, 0 == true ? 1 : 0);
            }
        }

        public static final class AudioAttributesCompatParcelizer extends write {
            private final j.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AudioAttributesCompatParcelizer(j.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                super(null);
                toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
                this.RemoteActionCompatParcelizer = remoteActionCompatParcelizer;
            }

            public final j.RemoteActionCompatParcelizer read() {
                return this.RemoteActionCompatParcelizer;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object RemoteActionCompatParcelizer(kotlin.SampleVideos<? super o.isCurrentWindowSeekable.write> r23) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCurrentWindowSeekable.RemoteActionCompatParcelizer(o.SampleVideos):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean MediaBrowserCompatCustomActionResultReceiver(isCurrentWindowSeekable iscurrentwindowseekable) {
        getChildPeriodUidFromConcatenatedUid.write writeVar = iscurrentwindowseekable.RatingCompat.onCommand;
        getChildPeriodUidFromConcatenatedUid.write writeVar2 = getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer;
        Boolean bool = Boolean.TRUE;
        if (writeVar != writeVar2) {
            String unused = pause.write;
            n.write();
            String str = iscurrentwindowseekable.RatingCompat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return bool;
        }
        if ((iscurrentwindowseekable.RatingCompat.MediaDescriptionCompat() || iscurrentwindowseekable.RatingCompat.MediaBrowserCompatCustomActionResultReceiver()) && iscurrentwindowseekable.write.read() < iscurrentwindowseekable.RatingCompat.read()) {
            n.write();
            String unused2 = pause.write;
            String str2 = iscurrentwindowseekable.RatingCompat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            return bool;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(j jVar, boolean z, String str, isCurrentWindowSeekable iscurrentwindowseekable, Throwable th) {
        if (th instanceof isCurrentMediaItemLive) {
            jVar.AudioAttributesCompatParcelizer(((isCurrentMediaItemLive) th).write());
        }
        if (z && str != null) {
            iscurrentwindowseekable.IconCompatParcelizer.getOnFastForward().AudioAttributesCompatParcelizer(str, iscurrentwindowseekable.RatingCompat.hashCode());
        }
        return getShowPopup.INSTANCE;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer>, Object> {
        final /* synthetic */ onUpgrade IconCompatParcelizer;
        private int read;
        final /* synthetic */ j write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (getCodecAdapterFactory.RemoteActionCompatParcelizer(isCurrentWindowSeekable.this.RemoteActionCompatParcelizer, isCurrentWindowSeekable.this.RemoteActionCompatParcelizer(), this.write, this.IconCompatParcelizer, isCurrentWindowSeekable.this.MediaBrowserCompatSearchResultReceiver, this) != objIconCompatParcelizer) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            String unused = pause.write;
            isCurrentWindowSeekable iscurrentwindowseekable = isCurrentWindowSeekable.this;
            n.write();
            String str = iscurrentwindowseekable.RemoteActionCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            Mp4ExtractorExternalSyntheticLambda0<j.RemoteActionCompatParcelizer> mp4ExtractorExternalSyntheticLambda0RemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0RemoteActionCompatParcelizer, "");
            this.read = 2;
            Object obj2 = pause.read(mp4ExtractorExternalSyntheticLambda0RemoteActionCompatParcelizer, this.write, this);
            return obj2 == objIconCompatParcelizer ? objIconCompatParcelizer : obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(j jVar, onUpgrade onupgrade, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = jVar;
            this.IconCompatParcelizer = onupgrade;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return isCurrentWindowSeekable.this.new RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super j.RemoteActionCompatParcelizer> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean IconCompatParcelizer(j.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        getChildPeriodUidFromConcatenatedUid.write writeVarRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
        this.MediaBrowserCompatCustomActionResultReceiver.onPlayFromMediaId().read(this.MediaMetadataCompat);
        if (writeVarRemoteActionCompatParcelizer == null) {
            return false;
        }
        if (writeVarRemoteActionCompatParcelizer == getChildPeriodUidFromConcatenatedUid.write.RemoteActionCompatParcelizer) {
            return read(remoteActionCompatParcelizer);
        }
        if (writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            return false;
        }
        return RemoteActionCompatParcelizer(-512);
    }

    public final void read(int i) {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(new isCurrentMediaItemLive(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean write(int i) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat.getHandleMediaPlayPauseIfPendingOnHandler(), Boolean.TRUE)) {
            String unused = pause.write;
            n.write();
            String str = this.RatingCompat.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            RemoteActionCompatParcelizer(i);
            return true;
        }
        getChildPeriodUidFromConcatenatedUid.write writeVarRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(this.MediaMetadataCompat);
        if (writeVarRemoteActionCompatParcelizer == null || writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            String unused2 = pause.write;
            n.write();
            Objects.toString(writeVarRemoteActionCompatParcelizer);
            return false;
        }
        String unused3 = pause.write;
        n.write();
        Objects.toString(writeVarRemoteActionCompatParcelizer);
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer, this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, i);
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, -1L);
        return true;
    }

    private final boolean read(j.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (remoteActionCompatParcelizer instanceof j.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
            String unused = pause.write;
            n.write();
            if (this.RatingCompat.MediaDescriptionCompat()) {
                return write();
            }
            return write(remoteActionCompatParcelizer);
        }
        if (remoteActionCompatParcelizer instanceof j.RemoteActionCompatParcelizer.write) {
            String unused2 = pause.write;
            n.write();
            return RemoteActionCompatParcelizer(-256);
        }
        String unused3 = pause.write;
        n.write();
        if (this.RatingCompat.MediaDescriptionCompat()) {
            return write();
        }
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = new j.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }
        return AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
    }

    private final boolean IconCompatParcelizer() {
        Object objWrite = this.MediaBrowserCompatCustomActionResultReceiver.write((Callable<Object>) new Callable() { // from class: o.seekBack
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return isCurrentWindowSeekable.AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objWrite, "");
        return ((Boolean) objWrite).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean AudioAttributesImplBaseParcelizer(isCurrentWindowSeekable iscurrentwindowseekable) {
        boolean z;
        if (iscurrentwindowseekable.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(iscurrentwindowseekable.MediaMetadataCompat) == getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer) {
            iscurrentwindowseekable.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write.RemoteActionCompatParcelizer, iscurrentwindowseekable.MediaMetadataCompat);
            iscurrentwindowseekable.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer(iscurrentwindowseekable.MediaMetadataCompat);
            iscurrentwindowseekable.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(iscurrentwindowseekable.MediaMetadataCompat, -256);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final boolean AudioAttributesCompatParcelizer(j.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        RemoteActionCompatParcelizer(this.MediaMetadataCompat);
        e1 e1VarRemoteActionCompatParcelizer = ((j.RemoteActionCompatParcelizer.IconCompatParcelizer) remoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(e1VarRemoteActionCompatParcelizer, "");
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.MediaMetadataCompat, this.RatingCompat.getOnPause());
        this.MediaBrowserCompatMediaItem.read(this.MediaMetadataCompat, e1VarRemoteActionCompatParcelizer);
        return false;
    }

    private final void RemoteActionCompatParcelizer(String str) {
        List listWrite = IntermediateLoginResponseBody.write(str);
        while (!listWrite.isEmpty()) {
            String str2 = (String) IntermediateLoginResponseBody.AudioAttributesImplBaseParcelizer(listWrite);
            if (this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(str2) != getChildPeriodUidFromConcatenatedUid.write.IconCompatParcelizer) {
                this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write.read, str2);
            }
            listWrite.addAll(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(str2));
        }
    }

    private final boolean RemoteActionCompatParcelizer(int i) {
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer, this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem.read(this.MediaMetadataCompat, this.write.read());
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.MediaMetadataCompat, this.RatingCompat.getOnPause());
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, -1L);
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, i);
        return true;
    }

    private final boolean write() {
        this.MediaBrowserCompatMediaItem.read(this.MediaMetadataCompat, this.write.read());
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer, this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem.AudioAttributesImplBaseParcelizer(this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(this.MediaMetadataCompat, this.RatingCompat.getOnPause());
        this.MediaBrowserCompatMediaItem.MediaBrowserCompatItemReceiver(this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(this.MediaMetadataCompat, -1L);
        return false;
    }

    private final boolean write(j.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write.AudioAttributesImplBaseParcelizer, this.MediaMetadataCompat);
        toMagicModuleMetaRepoModel.read(remoteActionCompatParcelizer, "");
        e1 e1VarIconCompatParcelizer = ((j.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) remoteActionCompatParcelizer).IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(e1VarIconCompatParcelizer, "");
        this.MediaBrowserCompatMediaItem.read(this.MediaMetadataCompat, e1VarIconCompatParcelizer);
        long j = this.write.read();
        for (String str : this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.MediaMetadataCompat)) {
            if (this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(str) == getChildPeriodUidFromConcatenatedUid.write.write && this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str)) {
                String unused = pause.write;
                n.write();
                this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(getChildPeriodUidFromConcatenatedUid.write.AudioAttributesCompatParcelizer, str);
                this.MediaBrowserCompatMediaItem.read(str, j);
            }
        }
        return false;
    }

    private final String AudioAttributesCompatParcelizer(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", tags={ ");
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(list, ",", null, null, 0, null, null, 62));
        sb.append(" } ]");
        return sb.toString();
    }

    public static final class AudioAttributesCompatParcelizer {
        private final Context AudioAttributesCompatParcelizer;
        private final setEnableDecoderFallback AudioAttributesImplApi21Parcelizer;
        private final CVideoChangeFrameRateStrategy AudioAttributesImplApi26Parcelizer;
        private final toBundle IconCompatParcelizer;
        private final WorkDatabase MediaBrowserCompatCustomActionResultReceiver;
        private j MediaBrowserCompatItemReceiver;
        private final List<String> RemoteActionCompatParcelizer;
        private final b read;
        private WorkerParameters.RemoteActionCompatParcelizer write;

        public AudioAttributesCompatParcelizer(Context context, b bVar, setEnableDecoderFallback setenabledecoderfallback, toBundle tobundle, WorkDatabase workDatabase, CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, List<String> list) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(bVar, "");
            toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
            toMagicModuleMetaRepoModel.write(tobundle, "");
            toMagicModuleMetaRepoModel.write(workDatabase, "");
            toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.read = bVar;
            this.AudioAttributesImplApi21Parcelizer = setenabledecoderfallback;
            this.IconCompatParcelizer = tobundle;
            this.MediaBrowserCompatCustomActionResultReceiver = workDatabase;
            this.AudioAttributesImplApi26Parcelizer = cVideoChangeFrameRateStrategy;
            this.RemoteActionCompatParcelizer = list;
            Context applicationContext = context.getApplicationContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
            this.AudioAttributesCompatParcelizer = applicationContext;
            this.write = new WorkerParameters.RemoteActionCompatParcelizer();
        }

        public final b AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final setEnableDecoderFallback AudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        public final toBundle IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final WorkDatabase MediaBrowserCompatCustomActionResultReceiver() {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final CVideoChangeFrameRateStrategy MediaBrowserCompatItemReceiver() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final List<String> AudioAttributesImplApi26Parcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final Context read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final j AudioAttributesImplBaseParcelizer() {
            return this.MediaBrowserCompatItemReceiver;
        }

        public final WorkerParameters.RemoteActionCompatParcelizer write() {
            return this.write;
        }

        public final AudioAttributesCompatParcelizer write(WorkerParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (remoteActionCompatParcelizer != null) {
                this.write = remoteActionCompatParcelizer;
            }
            return this;
        }

        public final isCurrentWindowSeekable RemoteActionCompatParcelizer() {
            return new isCurrentWindowSeekable(this);
        }
    }
}
