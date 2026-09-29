package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class getTotalAttempt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class read<T> implements getTopRankers<T> {
        private /* synthetic */ MagicModuleSubmissionRequestBody IconCompatParcelizer;

        public read(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody) {
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getTopRankers
        public final Iterator<T> write() {
            return StateResult.write(this.IconCompatParcelizer);
        }
    }

    public static final <T> getTopRankers<T> IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super setStateResult<? super T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        return new read(magicModuleSubmissionRequestBody);
    }

    public static final <T> Iterator<T> write(MagicModuleSubmissionRequestBody<? super setStateResult<? super T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        setTopRankers settoprankers = new setTopRankers();
        settoprankers.RemoteActionCompatParcelizer(getYear.RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, settoprankers, settoprankers));
        return settoprankers;
    }
}
