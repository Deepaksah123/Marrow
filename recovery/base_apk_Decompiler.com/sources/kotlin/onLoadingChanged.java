package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class onLoadingChanged {
    public static final <ResourceT> NewNumberOtpResendRequest<onPlaybackSuppressionReasonChanged<ResourceT>> read(setTileCountVertical<ResourceT> settilecountvertical, onPlaybackStateChanged onplaybackstatechanged) {
        toMagicModuleMetaRepoModel.write(settilecountvertical, "");
        toMagicModuleMetaRepoModel.write(onplaybackstatechanged, "");
        return AudioAttributesCompatParcelizer(settilecountvertical, onplaybackstatechanged);
    }

    /* JADX INFO: Add missing generic type declarations: [ResourceT] */
    static final class read<ResourceT> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getShowPearlDeletionPopup<? super onPlaybackSuppressionReasonChanged<ResourceT>>, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ onPlaybackStateChanged AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ Object RemoteActionCompatParcelizer;
        private /* synthetic */ ForwardingPlayer read;
        private /* synthetic */ setTileCountVertical<ResourceT> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getShowPearlDeletionPopup getshowpearldeletionpopup = (getShowPearlDeletionPopup) this.RemoteActionCompatParcelizer;
                onPlayWhenReadyChanged onplaywhenreadychanged = new onPlayWhenReadyChanged(getshowpearldeletionpopup, this.AudioAttributesCompatParcelizer);
                setRoleFlags.RemoteActionCompatParcelizer(this.write, onplaywhenreadychanged);
                this.IconCompatParcelizer = 1;
                if (UserConfigResponse.RemoteActionCompatParcelizer(getshowpearldeletionpopup, new AnonymousClass1(this.read, onplaywhenreadychanged), this) == objIconCompatParcelizer) {
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

        /* JADX INFO: renamed from: o.onLoadingChanged$read$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "ResourceT", "", "write", "()V"}, k = 3, mv = {1, 7, 1}, xi = 48)
        static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
            private /* synthetic */ ForwardingPlayer $read;
            private /* synthetic */ onPlayWhenReadyChanged<ResourceT> $write;

            @Override // kotlin.getCreatedOnDateMs
            public final /* synthetic */ getShowPopup invoke() {
                write();
                return getShowPopup.INSTANCE;
            }

            public final void write() {
                this.$read.write(this.$write);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ForwardingPlayer forwardingPlayer, onPlayWhenReadyChanged<ResourceT> onplaywhenreadychanged) {
                super(0);
                this.$read = forwardingPlayer;
                this.$write = onplaywhenreadychanged;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(onPlaybackStateChanged onplaybackstatechanged, setTileCountVertical<ResourceT> settilecountvertical, ForwardingPlayer forwardingPlayer, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = onplaybackstatechanged;
            this.write = settilecountvertical;
            this.read = forwardingPlayer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = new read(this.AudioAttributesCompatParcelizer, this.write, this.read, sampleVideos);
            readVar.RemoteActionCompatParcelizer = obj;
            return readVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(getShowPearlDeletionPopup<? super onPlaybackSuppressionReasonChanged<ResourceT>> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(getshowpearldeletionpopup, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final <ResourceT> NewNumberOtpResendRequest<onPlaybackSuppressionReasonChanged<ResourceT>> AudioAttributesCompatParcelizer(setTileCountVertical<ResourceT> settilecountvertical, onPlaybackStateChanged onplaybackstatechanged) {
        return VerifyNewNumberRequest.write(new read(onplaybackstatechanged, settilecountvertical, setRoleFlags.write((setTileCountVertical<?>) settilecountvertical), null));
    }

    public static final boolean RemoteActionCompatParcelizer(int i) {
        return moveMediaSourceRange.AudioAttributesCompatParcelizer(i);
    }
}
