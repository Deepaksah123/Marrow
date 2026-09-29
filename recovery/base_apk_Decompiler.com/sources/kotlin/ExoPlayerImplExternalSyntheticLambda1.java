package kotlin;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplExternalSyntheticLambda1 {
    private final Map<AudioAttributesCompatParcelizer, List<ExoPlayerImplExternalSyntheticLambda11<?>>> IconCompatParcelizer;
    private final updatePriorityTaskManagerForIsLoadingChange RemoteActionCompatParcelizer;
    private final MagicModuleSubmissionRequestBody<Context, RuntimeException, getShowPopup> read;

    /* JADX WARN: Multi-variable type inference failed */
    public ExoPlayerImplExternalSyntheticLambda1(updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange, MagicModuleSubmissionRequestBody<? super Context, ? super RuntimeException, getShowPopup> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(updateprioritytaskmanagerforisloadingchange, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        this.RemoteActionCompatParcelizer = updateprioritytaskmanagerforisloadingchange;
        this.read = magicModuleSubmissionRequestBody;
        this.IconCompatParcelizer = new LinkedHashMap();
    }

    static final class AudioAttributesCompatParcelizer {
        private final int AudioAttributesCompatParcelizer;
        private final Object RemoteActionCompatParcelizer;
        private final Class<? extends getCurrentPeriodIndex<?>> read;
        private final int write;

        public AudioAttributesCompatParcelizer(Class<? extends getCurrentPeriodIndex<?>> cls, int i, int i2, Object obj) {
            toMagicModuleMetaRepoModel.write(cls, "");
            this.read = cls;
            this.write = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.RemoteActionCompatParcelizer = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, audioAttributesCompatParcelizer.read) && this.write == audioAttributesCompatParcelizer.write && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, audioAttributesCompatParcelizer.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            Class<? extends getCurrentPeriodIndex<?>> cls = this.read;
            int iHashCode = cls != null ? cls.hashCode() : 0;
            int i = this.write;
            int i2 = this.AudioAttributesCompatParcelizer;
            Object obj = this.RemoteActionCompatParcelizer;
            return (((((iHashCode * 31) + i) * 31) + i2) * 31) + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheKey(epoxyModelClass=");
            sb.append(this.read);
            sb.append(", spanSize=");
            sb.append(this.write);
            sb.append(", viewType=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", signature=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    public final <T extends getCurrentPeriodIndex<?>, U extends ExoPlayerImplExternalSyntheticLambda13, P extends ExoPlayerImplExternalSyntheticLambda0> List<ExoPlayerImplExternalSyntheticLambda11<U>> AudioAttributesCompatParcelizer(setPlaylistMetadata<T, U, P> setplaylistmetadata, T t, int i) {
        toMagicModuleMetaRepoModel.write(setplaylistmetadata, "");
        toMagicModuleMetaRepoModel.write(t, "");
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(t, i);
        Map<AudioAttributesCompatParcelizer, List<ExoPlayerImplExternalSyntheticLambda11<?>>> map = this.IconCompatParcelizer;
        Collection collection = map.get(audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
        if (collection == null) {
            collection = read(setplaylistmetadata, t, audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
            map.put(audioAttributesCompatParcelizerRemoteActionCompatParcelizer, (List<ExoPlayerImplExternalSyntheticLambda11<?>>) collection);
        }
        if (!(collection instanceof List)) {
            collection = null;
        }
        List<ExoPlayerImplExternalSyntheticLambda11<U>> list = (List) collection;
        return list != null ? list : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    private final <T extends getCurrentPeriodIndex<?>> AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(T t, int i) {
        int iMediaBrowserCompatCustomActionResultReceiver;
        if (this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer()) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            this.RemoteActionCompatParcelizer.getItemCount();
            iMediaBrowserCompatCustomActionResultReceiver = t.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            iMediaBrowserCompatCustomActionResultReceiver = 1;
        }
        Class<?> cls = t.getClass();
        int i2 = getSeekForwardIncrement.read(t);
        setPlaylistMetadata.write(t);
        return new AudioAttributesCompatParcelizer(cls, iMediaBrowserCompatCustomActionResultReceiver, i2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends getCurrentPeriodIndex<?>, U extends ExoPlayerImplExternalSyntheticLambda13, P extends ExoPlayerImplExternalSyntheticLambda0> List<ExoPlayerImplExternalSyntheticLambda11<U>> read(setPlaylistMetadata<T, U, P> setplaylistmetadata, T t, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        getMaxSeekToPreviousPosition next;
        View view;
        List<View> listRemoteActionCompatParcelizer;
        updateWakeAndWifiLock updatewakeandwifilock = getSeekForwardIncrement.read(this.RemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(updatewakeandwifilock, "");
        Iterator<getMaxSeekToPreviousPosition> it = updatewakeandwifilock.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            getMaxSeekToPreviousPosition getmaxseektopreviousposition = next;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmaxseektopreviousposition, "");
            getCurrentPeriodIndex<?> getcurrentperiodindexWrite = getmaxseektopreviousposition.write();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(getcurrentperiodindexWrite.getClass()), toMagicModuleMetaDataUcModel.write(t.getClass())) && InvalidTypeIdException.onPlayFromSearch(getmaxseektopreviousposition.itemView) && InvalidTypeIdException.onSeekTo(getmaxseektopreviousposition.itemView)) {
                if (getcurrentperiodindexWrite == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T");
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(getcurrentperiodindexWrite, getmaxseektopreviousposition.getAdapterPosition()), audioAttributesCompatParcelizer)) {
                    break;
                }
            }
        }
        getMaxSeekToPreviousPosition getmaxseektopreviousposition2 = next;
        if (getmaxseektopreviousposition2 == null || (view = getmaxseektopreviousposition2.itemView) == 0) {
            return null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
        Object objWrite = getSeekForwardIncrement.write(getmaxseektopreviousposition2);
        if (!setplaylistmetadata.IconCompatParcelizer().isEmpty()) {
            listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view, setplaylistmetadata.IconCompatParcelizer(), t);
        } else if (view instanceof setTrackSelectionParameters) {
            listRemoteActionCompatParcelizer = ((setTrackSelectionParameters) view).read();
        } else {
            listRemoteActionCompatParcelizer = objWrite instanceof setTrackSelectionParameters ? ((setTrackSelectionParameters) objWrite).read() : IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (listRemoteActionCompatParcelizer.isEmpty()) {
            MagicModuleSubmissionRequestBody<Context, RuntimeException, getShowPopup> magicModuleSubmissionRequestBody = this.read;
            Context context = view.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            StringBuilder sb = new StringBuilder("No preloadable views were found in ");
            sb.append(t.getClass().getSimpleName());
            magicModuleSubmissionRequestBody.invoke(context, new removeMediaItems(sb.toString()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listRemoteActionCompatParcelizer.iterator();
        while (it2.hasNext()) {
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) write((View) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ExoPlayerImplExternalSyntheticLambda11 exoPlayerImplExternalSyntheticLambda11RemoteActionCompatParcelizer = RemoteActionCompatParcelizer((View) it3.next(), setplaylistmetadata, t);
            if (exoPlayerImplExternalSyntheticLambda11RemoteActionCompatParcelizer != null) {
                arrayList2.add(exoPlayerImplExternalSyntheticLambda11RemoteActionCompatParcelizer);
            }
        }
        return arrayList2;
    }

    private final <T extends getCurrentPeriodIndex<?>> List<View> RemoteActionCompatParcelizer(View view, List<Integer> list, T t) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            View viewFindViewById = view.findViewById(iIntValue);
            if (viewFindViewById == null) {
                MagicModuleSubmissionRequestBody<Context, RuntimeException, getShowPopup> magicModuleSubmissionRequestBody = this.read;
                Context context = view.getContext();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
                StringBuilder sb = new StringBuilder("View with id ");
                sb.append(iIntValue);
                sb.append(" in ");
                sb.append(t.getClass().getSimpleName());
                sb.append(" could not be found.");
                magicModuleSubmissionRequestBody.invoke(context, new removeMediaItems(sb.toString()));
            }
            if (viewFindViewById != null) {
                arrayList.add(viewFindViewById);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends View> List<View> write(T t) {
        if (t instanceof setTrackSelectionParameters) {
            List<View> list = ((setTrackSelectionParameters) t).read();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) write((View) it.next()));
            }
            return arrayList;
        }
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(t);
    }

    private final <T extends getCurrentPeriodIndex<?>, U extends ExoPlayerImplExternalSyntheticLambda13, P extends ExoPlayerImplExternalSyntheticLambda0> ExoPlayerImplExternalSyntheticLambda11<U> RemoteActionCompatParcelizer(View view, setPlaylistMetadata<T, U, P> setplaylistmetadata, T t) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (width <= 0 || height <= 0) {
            MagicModuleSubmissionRequestBody<Context, RuntimeException, getShowPopup> magicModuleSubmissionRequestBody = this.read;
            Context context = view.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            StringBuilder sb = new StringBuilder();
            sb.append(view.getClass().getSimpleName());
            sb.append(" in ");
            sb.append(t.getClass().getSimpleName());
            sb.append(" has zero size. A size must be set to allow preloading.");
            magicModuleSubmissionRequestBody.invoke(context, new removeMediaItems(sb.toString()));
            return null;
        }
        return new ExoPlayerImplExternalSyntheticLambda11<>(view.getId(), width, height, setplaylistmetadata.AudioAttributesCompatParcelizer());
    }
}
