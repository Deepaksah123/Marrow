package kotlin;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;

/* JADX INFO: loaded from: classes2.dex */
final class onPlayWhenReadyChanged<ResourceT> implements MediaSourceInfoHolder<ResourceT>, getUpdatedMediaPeriodInfo<ResourceT> {
    private volatile enqueueNextMediaPeriodHolder AudioAttributesCompatParcelizer;
    private final List<updateRepeatMode> AudioAttributesImplApi26Parcelizer;
    private final onPlaybackStateChanged IconCompatParcelizer;
    private final getShowPearlDeletionPopup<onPlaybackSuppressionReasonChanged<ResourceT>> RemoteActionCompatParcelizer;
    private volatile onSeekForwardIncrementChanged read;
    private volatile ResourceT write;

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi21Parcelizer() {
    }

    @Override // kotlin.toRendererTime
    public final void AudioAttributesImplApi26Parcelizer() {
    }

    @Override // kotlin.toRendererTime
    public final void MediaBrowserCompatItemReceiver() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onPlayWhenReadyChanged(getShowPearlDeletionPopup<? super onPlaybackSuppressionReasonChanged<ResourceT>> getshowpearldeletionpopup, onPlaybackStateChanged onplaybackstatechanged) {
        toMagicModuleMetaRepoModel.write(getshowpearldeletionpopup, "");
        toMagicModuleMetaRepoModel.write(onplaybackstatechanged, "");
        this.RemoteActionCompatParcelizer = getshowpearldeletionpopup;
        this.IconCompatParcelizer = onplaybackstatechanged;
        this.AudioAttributesImplApi26Parcelizer = new ArrayList();
        if (onplaybackstatechanged instanceof onPlayerError) {
            this.read = ((onPlayerError) onplaybackstatechanged).AudioAttributesCompatParcelizer();
        } else if (onplaybackstatechanged instanceof onMaxSeekToPreviousPositionChanged) {
            C0201setMcqCount.IconCompatParcelizer(getshowpearldeletionpopup, null, null, new AnonymousClass3(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: o.onPlayWhenReadyChanged$3, reason: invalid class name */
    static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ onPlayWhenReadyChanged<ResourceT> IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private int write;

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList] */
        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            TopUserCompanion topUserCompanion;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion2 = (TopUserCompanion) this.RemoteActionCompatParcelizer;
                getAnswerMap<SampleVideos<? super onSeekForwardIncrementChanged>, Object> getanswermapWrite = ((onMaxSeekToPreviousPositionChanged) ((onPlayWhenReadyChanged) this.IconCompatParcelizer).IconCompatParcelizer).write();
                this.RemoteActionCompatParcelizer = topUserCompanion2;
                this.write = 1;
                Object objInvoke = getanswermapWrite.invoke(this);
                if (objInvoke == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                topUserCompanion = topUserCompanion2;
                obj = objInvoke;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                topUserCompanion = (TopUserCompanion) this.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            onSeekForwardIncrementChanged onseekforwardincrementchanged = (onSeekForwardIncrementChanged) obj;
            MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
            onPlayWhenReadyChanged<ResourceT> onplaywhenreadychanged = this.IconCompatParcelizer;
            synchronized (topUserCompanion) {
                ((onPlayWhenReadyChanged) onplaywhenreadychanged).read = onseekforwardincrementchanged;
                writeVar.write = new ArrayList(((onPlayWhenReadyChanged) onplaywhenreadychanged).AudioAttributesImplApi26Parcelizer);
                ((onPlayWhenReadyChanged) onplaywhenreadychanged).AudioAttributesImplApi26Parcelizer.clear();
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
            Iterator it = ((Iterable) writeVar.write).iterator();
            while (it.hasNext()) {
                ((updateRepeatMode) it.next()).RemoteActionCompatParcelizer(onseekforwardincrementchanged.IconCompatParcelizer(), onseekforwardincrementchanged.read());
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(onPlayWhenReadyChanged<ResourceT> onplaywhenreadychanged, SampleVideos<? super AnonymousClass3> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = onplaywhenreadychanged;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.IconCompatParcelizer, sampleVideos);
            anonymousClass3.RemoteActionCompatParcelizer = obj;
            return anonymousClass3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void write(Drawable drawable) {
        this.write = null;
        this.RemoteActionCompatParcelizer.read(new onPlayerStateChanged(onPositionDiscontinuity.RUNNING, drawable));
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void RemoteActionCompatParcelizer(Drawable drawable) {
        this.RemoteActionCompatParcelizer.read(new onPlayerStateChanged(onPositionDiscontinuity.FAILED, drawable));
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void RemoteActionCompatParcelizer(ResourceT resourcet) {
        toMagicModuleMetaRepoModel.write(resourcet, "");
        this.write = resourcet;
        getShowPearlDeletionPopup<onPlaybackSuppressionReasonChanged<ResourceT>> getshowpearldeletionpopup = this.RemoteActionCompatParcelizer;
        enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder = this.AudioAttributesCompatParcelizer;
        getshowpearldeletionpopup.read(new onPlayerErrorChanged((enqueuenextmediaperiodholder == null || !enqueuenextmediaperiodholder.MediaBrowserCompatCustomActionResultReceiver()) ? onPositionDiscontinuity.RUNNING : onPositionDiscontinuity.SUCCEEDED, resourcet));
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void AudioAttributesCompatParcelizer(Drawable drawable) {
        this.write = null;
        this.RemoteActionCompatParcelizer.read(new onPlayerStateChanged(onPositionDiscontinuity.CLEARED, drawable));
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void read(updateRepeatMode updaterepeatmode) {
        toMagicModuleMetaRepoModel.write(updaterepeatmode, "");
        onSeekForwardIncrementChanged onseekforwardincrementchanged = this.read;
        if (onseekforwardincrementchanged != null) {
            updaterepeatmode.RemoteActionCompatParcelizer(onseekforwardincrementchanged.IconCompatParcelizer(), onseekforwardincrementchanged.read());
            return;
        }
        synchronized (this) {
            onSeekForwardIncrementChanged onseekforwardincrementchanged2 = this.read;
            if (onseekforwardincrementchanged2 != null) {
                updaterepeatmode.RemoteActionCompatParcelizer(onseekforwardincrementchanged2.IconCompatParcelizer(), onseekforwardincrementchanged2.read());
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            } else {
                this.AudioAttributesImplApi26Parcelizer.add(updaterepeatmode);
            }
        }
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void IconCompatParcelizer(updateRepeatMode updaterepeatmode) {
        toMagicModuleMetaRepoModel.write(updaterepeatmode, "");
        synchronized (this) {
            this.AudioAttributesImplApi26Parcelizer.remove(updaterepeatmode);
        }
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final void write(enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder) {
        this.AudioAttributesCompatParcelizer = enqueuenextmediaperiodholder;
    }

    @Override // kotlin.MediaSourceInfoHolder
    public final enqueueNextMediaPeriodHolder AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getUpdatedMediaPeriodInfo
    public final boolean RemoteActionCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed, MediaSourceInfoHolder<ResourceT> mediaSourceInfoHolder) {
        ResourceT resourcet = this.write;
        enqueueNextMediaPeriodHolder enqueuenextmediaperiodholder = this.AudioAttributesCompatParcelizer;
        if (resourcet == null || enqueuenextmediaperiodholder == null || enqueuenextmediaperiodholder.MediaBrowserCompatCustomActionResultReceiver() || enqueuenextmediaperiodholder.MediaBrowserCompatItemReceiver()) {
            return false;
        }
        this.RemoteActionCompatParcelizer.onPlay().read(new onPlayerErrorChanged(onPositionDiscontinuity.FAILED, resourcet));
        return false;
    }

    @Override // kotlin.getUpdatedMediaPeriodInfo
    public final boolean RemoteActionCompatParcelizer(ResourceT resourcet, Object obj, onTracksChanged ontrackschanged) {
        toMagicModuleMetaRepoModel.write(resourcet, "");
        return false;
    }
}
