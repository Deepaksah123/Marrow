package kotlin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final class deserializerForCreator {
    public static final <T> Object read(Mp4ExtractorExternalSyntheticLambda0<T> mp4ExtractorExternalSyntheticLambda0, SampleVideos<? super T> sampleVideos) throws Throwable {
        try {
            if (mp4ExtractorExternalSyntheticLambda0.isDone()) {
                return DateDeserializersDateDeserializer.AudioAttributesCompatParcelizer((Future) mp4ExtractorExternalSyntheticLambda0);
            }
            setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
            setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
            mp4ExtractorExternalSyntheticLambda0.IconCompatParcelizer(new _enumClass(mp4ExtractorExternalSyntheticLambda0, setstatesolvedcount2), deserializerForNoArgsCreator.INSTANCE);
            setstatesolvedcount2.write((getAnswerMap<? super Throwable, getShowPopup>) new RemoteActionCompatParcelizer(mp4ExtractorExternalSyntheticLambda0));
            Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
            if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objAudioAttributesCompatParcelizer;
        } catch (ExecutionException e) {
            throw read(e);
        }
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
        final /* synthetic */ Mp4ExtractorExternalSyntheticLambda0 IconCompatParcelizer;

        private void IconCompatParcelizer() {
            this.IconCompatParcelizer.cancel(false);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(Mp4ExtractorExternalSyntheticLambda0 mp4ExtractorExternalSyntheticLambda0) {
            super(1);
            this.IconCompatParcelizer = mp4ExtractorExternalSyntheticLambda0;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(Throwable th) {
            IconCompatParcelizer();
            return getShowPopup.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable read(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer();
        }
        return cause;
    }
}
