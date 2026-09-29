package kotlin;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ExoPlayerImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getDecryptedContent;
import kotlin.newEncryptedObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 9*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00019Be\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\tj\u0002`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00130\u0012¢\u0006\u0002\u0010\u0014Be\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\tj\u0002`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00130\u0012¢\u0006\u0002\u0010\u0017Be\b\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0018\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\tj\u0002`\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u001c\u0010\u0011\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00130\u0012¢\u0006\u0002\u0010\u001aJ \u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020\rJ\u0018\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0010H\u0016J \u00101\u001a\u00020\r2\u0006\u0010.\u001a\u00020/2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u0010H\u0016J\u0010\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\u0010H\u0002J\f\u00106\u001a\u00020\u0010*\u00020\u0010H\u0002J\f\u00107\u001a\u00020+*\u00020\u0010H\u0002J\f\u00108\u001a\u00020+*\u00020\u0010H\u0002R\u000e\u0010\u0015\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030!0 \u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0006\b\u0001\u0012\u00028\u00000\u00130\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "epoxyController", "Lcom/airbnb/epoxy/EpoxyController;", "requestHolderFactory", "Lkotlin/Function0;", "errorHandler", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "maxItemsToPreload", "", "modelPreloaders", "", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "(Lcom/airbnb/epoxy/EpoxyController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILjava/util/List;)V", "adapter", "Lcom/airbnb/epoxy/EpoxyAdapter;", "(Lcom/airbnb/epoxy/EpoxyAdapter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILjava/util/List;)V", "Lcom/airbnb/epoxy/BaseEpoxyAdapter;", "preloadTargetFactory", "(Lcom/airbnb/epoxy/BaseEpoxyAdapter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILjava/util/List;)V", "lastPreloadRange", "Lkotlin/ranges/IntProgression;", "lastVisibleRange", "Lkotlin/ranges/IntRange;", "", "Ljava/lang/Class;", "Lcom/airbnb/epoxy/EpoxyModel;", "Lcom/airbnb/epoxy/preload/PreloadTargetProvider;", "scrollState", "totalItemCount", "viewDataCache", "Lcom/airbnb/epoxy/preload/PreloadableViewDataProvider;", "calculatePreloadRange", "firstVisiblePosition", "lastVisiblePosition", "isIncreasing", "", "cancelPreloadRequests", "onScrollStateChanged", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "onScrolled", "dx", "dy", "preloadAdapterPosition", "position", "clampToAdapterRange", "isFling", "isInvalid", "Companion", "epoxy-adapter_release"}, k = 1, mv = {1, 4, 2})
public final class setThrowsWhenUsingWrongThread<P extends ExoPlayerImplExternalSyntheticLambda0> extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
    public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer(null);
    private final setShuffleModeEnabled<P> AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private final ExoPlayerImplExternalSyntheticLambda1 AudioAttributesImplBaseParcelizer;
    private newEncryptedObject IconCompatParcelizer;
    private final Map<Class<? extends getCurrentPeriodIndex<?>>, setPlaylistMetadata<?, ?, ? extends P>> MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private final updatePriorityTaskManagerForIsLoadingChange read;
    private getDecryptedContent write;

    private setThrowsWhenUsingWrongThread(updatePriorityTaskManagerForIsLoadingChange updateprioritytaskmanagerforisloadingchange, getCreatedOnDateMs<? extends P> getcreatedondatems, MagicModuleSubmissionRequestBody<? super Context, ? super RuntimeException, getShowPopup> magicModuleSubmissionRequestBody, int i, List<? extends setPlaylistMetadata<?, ?, ? extends P>> list) {
        this.read = updateprioritytaskmanagerforisloadingchange;
        this.RemoteActionCompatParcelizer = i;
        newEncryptedObject.Companion companion = newEncryptedObject.INSTANCE;
        this.IconCompatParcelizer = newEncryptedObject.Companion.IconCompatParcelizer();
        newEncryptedObject.Companion companion2 = newEncryptedObject.INSTANCE;
        this.write = newEncryptedObject.Companion.IconCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = -1;
        List<? extends setPlaylistMetadata<?, ?, ? extends P>> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((setPlaylistMetadata) obj).RemoteActionCompatParcelizer(), obj);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = linkedHashMap;
        this.AudioAttributesImplApi21Parcelizer = new setShuffleModeEnabled<>(this.RemoteActionCompatParcelizer, getcreatedondatems);
        this.AudioAttributesImplBaseParcelizer = new ExoPlayerImplExternalSyntheticLambda1(this.read, magicModuleSubmissionRequestBody);
        if (this.RemoteActionCompatParcelizer > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("maxItemsToPreload must be greater than 0. Was ");
        sb.append(this.RemoteActionCompatParcelizer);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setThrowsWhenUsingWrongThread(getContentBufferedPosition getcontentbufferedposition, getCreatedOnDateMs<? extends P> getcreatedondatems, MagicModuleSubmissionRequestBody<? super Context, ? super RuntimeException, getShowPopup> magicModuleSubmissionRequestBody, int i, List<? extends setPlaylistMetadata<?, ?, ? extends P>> list) {
        toMagicModuleMetaRepoModel.write(getcontentbufferedposition, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(list, "");
        getCurrentPosition adapter = getcontentbufferedposition.getAdapter();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(adapter, "");
        this(adapter, getcreatedondatems, magicModuleSubmissionRequestBody, i, list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setThrowsWhenUsingWrongThread(getCurrentAdGroupIndex getcurrentadgroupindex, getCreatedOnDateMs<? extends P> getcreatedondatems, MagicModuleSubmissionRequestBody<? super Context, ? super RuntimeException, getShowPopup> magicModuleSubmissionRequestBody, int i, List<? extends setPlaylistMetadata<?, ?, ? extends P>> list) {
        this((updatePriorityTaskManagerForIsLoadingChange) getcurrentadgroupindex, (getCreatedOnDateMs) getcreatedondatems, magicModuleSubmissionRequestBody, i, (List) list);
        toMagicModuleMetaRepoModel.write(getcurrentadgroupindex, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(list, "");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
    public final void AudioAttributesCompatParcelizer(RecyclerView recyclerView, int i) {
        toMagicModuleMetaRepoModel.write(recyclerView, "");
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
    public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        toMagicModuleMetaRepoModel.write(recyclerView, "");
        if ((i == 0 && i2 == 0) || IconCompatParcelizer(i) || IconCompatParcelizer(i2)) {
            return;
        }
        RecyclerView.IconCompatParcelizer IconCompatParcelizer2 = recyclerView.IconCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = IconCompatParcelizer2 != null ? IconCompatParcelizer2.getItemCount() : 0;
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = recyclerView.AudioAttributesImplApi21Parcelizer();
        if (mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer;
        int iMediaBrowserCompatItemReceiver = linearLayoutManager.MediaBrowserCompatItemReceiver();
        int iMediaMetadataCompat = linearLayoutManager.MediaMetadataCompat();
        if (read(iMediaBrowserCompatItemReceiver) || read(iMediaMetadataCompat)) {
            newEncryptedObject.Companion companion = newEncryptedObject.INSTANCE;
            this.IconCompatParcelizer = newEncryptedObject.Companion.IconCompatParcelizer();
            newEncryptedObject.Companion companion2 = newEncryptedObject.INSTANCE;
            this.write = newEncryptedObject.Companion.IconCompatParcelizer();
            return;
        }
        newEncryptedObject newencryptedobject = new newEncryptedObject(iMediaBrowserCompatItemReceiver, iMediaMetadataCompat);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(newencryptedobject, this.IconCompatParcelizer)) {
            return;
        }
        getDecryptedContent getdecryptedcontentIconCompatParcelizer = IconCompatParcelizer(iMediaBrowserCompatItemReceiver, iMediaMetadataCompat, newencryptedobject.getRead() > this.IconCompatParcelizer.getRead() || newencryptedobject.getAudioAttributesCompatParcelizer() > this.IconCompatParcelizer.getAudioAttributesCompatParcelizer());
        Iterator it = IntermediateLoginResponseBody.IconCompatParcelizer(getdecryptedcontentIconCompatParcelizer, this.write).iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer(((Number) it.next()).intValue());
        }
        this.IconCompatParcelizer = newencryptedobject;
        this.write = getdecryptedcontentIconCompatParcelizer;
    }

    private static boolean IconCompatParcelizer(int i) {
        return Math.abs(i) > 75;
    }

    private final getDecryptedContent IconCompatParcelizer(int i, int i2, boolean z) {
        int i3 = z ? i2 + 1 : i - 1;
        int i4 = this.RemoteActionCompatParcelizer;
        int i5 = z ? i4 - 1 : 1 - i4;
        getDecryptedContent.Companion companion = getDecryptedContent.INSTANCE;
        return getDecryptedContent.Companion.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(i3), RemoteActionCompatParcelizer(i5 + i3), z ? 1 : -1);
    }

    private final boolean read(int i) {
        return i == -1 || i >= this.MediaBrowserCompatItemReceiver;
    }

    private final int RemoteActionCompatParcelizer(int i) {
        return Math.min(this.MediaBrowserCompatItemReceiver - 1, Math.max(i, 0));
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        getCurrentPeriodIndex<?> getcurrentperiodindexAudioAttributesCompatParcelizer = getSeekForwardIncrement.AudioAttributesCompatParcelizer(this.read, i);
        if (!(getcurrentperiodindexAudioAttributesCompatParcelizer instanceof getCurrentPeriodIndex)) {
            getcurrentperiodindexAudioAttributesCompatParcelizer = null;
        }
        if (getcurrentperiodindexAudioAttributesCompatParcelizer != null) {
            setPlaylistMetadata<?, ?, ? extends P> setplaylistmetadata = this.MediaBrowserCompatCustomActionResultReceiver.get(getcurrentperiodindexAudioAttributesCompatParcelizer.getClass());
            setPlaylistMetadata<?, ?, ? extends P> setplaylistmetadata2 = setplaylistmetadata instanceof setPlaylistMetadata ? setplaylistmetadata : null;
            if (setplaylistmetadata2 != null) {
                for (ExoPlayerImplExternalSyntheticLambda11 exoPlayerImplExternalSyntheticLambda11 : this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(setplaylistmetadata2, getcurrentperiodindexAudioAttributesCompatParcelizer, i)) {
                    this.AudioAttributesImplApi21Parcelizer.read();
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0082\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0001\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\f2 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00120\u000ej\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u00042*\u0010\u0015\u001a&\u0012\"\u0012 \u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0019\u0012\u0006\b\u0001\u0012\u0002H\u00070\u00170\u0016J|\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0001\u0010\u0007*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\f2 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00120\u000ej\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u00042$\u0010\u001c\u001a \u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0019\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0017J\u0082\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0001\u0010\u0007*\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\f2 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00120\u000ej\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u00042*\u0010\u0015\u001a&\u0012\"\u0012 \u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0018\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0019\u0012\u0006\b\u0001\u0012\u0002H\u00070\u00170\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/airbnb/epoxy/preload/EpoxyPreloader$Companion;", "", "()V", "FLING_THRESHOLD_PX", "", "with", "Lcom/airbnb/epoxy/preload/EpoxyPreloader;", "P", "Lcom/airbnb/epoxy/preload/PreloadRequestHolder;", "epoxyAdapter", "Lcom/airbnb/epoxy/EpoxyAdapter;", "requestHolderFactory", "Lkotlin/Function0;", "errorHandler", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "maxItemsToPreload", "modelPreloaders", "", "Lcom/airbnb/epoxy/preload/EpoxyModelPreloader;", "Lcom/airbnb/epoxy/EpoxyModel;", "Lcom/airbnb/epoxy/preload/ViewMetadata;", "epoxyController", "Lcom/airbnb/epoxy/EpoxyController;", "modelPreloader", "epoxy-adapter_release"}, k = 1, mv = {1, 4, 2})
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static <P extends ExoPlayerImplExternalSyntheticLambda0> setThrowsWhenUsingWrongThread<P> read(getContentBufferedPosition getcontentbufferedposition, getCreatedOnDateMs<? extends P> getcreatedondatems, MagicModuleSubmissionRequestBody<? super Context, ? super RuntimeException, getShowPopup> magicModuleSubmissionRequestBody, int i, List<? extends setPlaylistMetadata<? extends getCurrentPeriodIndex<?>, ? extends ExoPlayerImplExternalSyntheticLambda13, ? extends P>> list) {
            toMagicModuleMetaRepoModel.write(getcontentbufferedposition, "");
            toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
            toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
            toMagicModuleMetaRepoModel.write(list, "");
            return new setThrowsWhenUsingWrongThread<>(getcontentbufferedposition, getcreatedondatems, magicModuleSubmissionRequestBody, i, list);
        }

        public static <P extends ExoPlayerImplExternalSyntheticLambda0> setThrowsWhenUsingWrongThread<P> IconCompatParcelizer(getCurrentAdGroupIndex getcurrentadgroupindex, getCreatedOnDateMs<? extends P> getcreatedondatems, MagicModuleSubmissionRequestBody<? super Context, ? super RuntimeException, getShowPopup> magicModuleSubmissionRequestBody, int i, List<? extends setPlaylistMetadata<? extends getCurrentPeriodIndex<?>, ? extends ExoPlayerImplExternalSyntheticLambda13, ? extends P>> list) {
            toMagicModuleMetaRepoModel.write(getcurrentadgroupindex, "");
            toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
            toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
            toMagicModuleMetaRepoModel.write(list, "");
            return new setThrowsWhenUsingWrongThread<>(getcurrentadgroupindex, (getCreatedOnDateMs) getcreatedondatems, magicModuleSubmissionRequestBody, i, (List) list);
        }
    }
}
