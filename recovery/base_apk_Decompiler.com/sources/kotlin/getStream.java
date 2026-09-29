package kotlin;

import kotlin.getStream;
import kotlin.setMediaItems;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getStream<T> implements isSourceReady {
    private final onStreamChanged<T> AudioAttributesCompatParcelizer;

    protected abstract int AudioAttributesCompatParcelizer();

    protected boolean write(T t) {
        return false;
    }

    public getStream(onStreamChanged<T> onstreamchanged) {
        toMagicModuleMetaRepoModel.write(onstreamchanged, "");
        this.AudioAttributesCompatParcelizer = onstreamchanged;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<getShowPearlDeletionPopup<? super setMediaItems>, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ Object read;
        final /* synthetic */ getStream<T> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                getShowPearlDeletionPopup getshowpearldeletionpopup = (getShowPearlDeletionPopup) this.read;
                final write writeVar = new write(this.write, getshowpearldeletionpopup);
                ((getStream) this.write).AudioAttributesCompatParcelizer.read(writeVar);
                final getStream<T> getstream = this.write;
                this.IconCompatParcelizer = 1;
                if (UserConfigResponse.RemoteActionCompatParcelizer(getshowpearldeletionpopup, new getCreatedOnDateMs() { // from class: o.getStreamFormats
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return getStream.IconCompatParcelizer.AudioAttributesCompatParcelizer(getstream, writeVar);
                    }
                }, this) == objIconCompatParcelizer) {
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

        public static final class write implements seekToPreviousMediaItem<T> {
            final /* synthetic */ getStream<T> AudioAttributesCompatParcelizer;
            final /* synthetic */ getShowPearlDeletionPopup<setMediaItems> IconCompatParcelizer;

            /* JADX WARN: Multi-variable type inference failed */
            write(getStream<T> getstream, getShowPearlDeletionPopup<? super setMediaItems> getshowpearldeletionpopup) {
                this.AudioAttributesCompatParcelizer = getstream;
                this.IconCompatParcelizer = getshowpearldeletionpopup;
            }

            @Override // kotlin.seekToPreviousMediaItem
            public final void RemoteActionCompatParcelizer(T t) {
                this.IconCompatParcelizer.onPlay().read(this.AudioAttributesCompatParcelizer.write(t) ? new setMediaItems.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) : setMediaItems.read.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(getStream getstream, write writeVar) {
            getstream.AudioAttributesCompatParcelizer.write(writeVar);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getStream<T> getstream, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = getstream;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.write, sampleVideos);
            iconCompatParcelizer.read = obj;
            return iconCompatParcelizer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(getShowPearlDeletionPopup<? super setMediaItems> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(getshowpearldeletionpopup, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.isSourceReady
    public final NewNumberOtpResendRequest<setMediaItems> AudioAttributesCompatParcelizer(e eVar) {
        toMagicModuleMetaRepoModel.write(eVar, "");
        return VerifyNewNumberRequest.write(new IconCompatParcelizer(this, null));
    }
}
