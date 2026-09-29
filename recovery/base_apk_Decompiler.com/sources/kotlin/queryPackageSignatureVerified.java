package kotlin;

import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.marrow.R;
import com.marrow.data.models.common.CourseConfigV2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.SequenceSerializer;
import kotlin.getContextFeatureId;
import kotlin.isConnected;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 62\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000267B4\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012#\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\bH\u0016J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\bH\u0016J&\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\u0010\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\bH\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0002H\u0002J\u0016\u0010*\u001a\u00020\f2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0002J\u0010\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0002H\u0002J\u000e\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0002J\u000e\u00100\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0002J\u0014\u00102\u001a\u00020\f2\f\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0014J\u0014\u00105\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010)\u001a\u00020\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0006\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00020&j\b\u0012\u0004\u0012\u00020\u0002`'X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/marrow2/ui/home/adapter/HomeCardAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/marrow2/ui/home/model/HomeCardVMModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/marrow2/ui/home/adapter/ItemClickListener;", "onItemCountChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "count", "", "<init>", "(Lcom/marrow2/ui/home/adapter/ItemClickListener;Lkotlin/jvm/functions/Function1;)V", "homePageItemsSortOrderMap", "", "Lcom/marrow/data/models/common/CourseConfigV2$HomePageItems;", "setHomePageOrderedList", "orderedList", "", "homeCardList", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "safeInflateMcqViewHolder", "inflater", "Landroid/view/LayoutInflater;", "getItemCount", "onBindViewHolder", "holder", "position", "payloads", "", "", "getItemViewType", "homeCardOrderComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getHomePageItem", "item", "updateCurrentList", "modifiedList", "addItem", "newItem", "updateItem", "updatedItem", "removeItem", "itemToRemove", "setFeatureCards", "newFeatureCards", "Lcom/marrow2/ui/home/model/FeatureCardVMModel;", "getItemIndices", "Companion", "HomeCardDiffCallback", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class queryPackageSignatureVerified extends deserializeIymvxus<getApiKey, RecyclerView.onMediaButtonEvent> {
    public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer(null);
    private final SignInButtonButtonSize AudioAttributesImplBaseParcelizer;
    private final getAnswerMap<Integer, getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
    private Map<CourseConfigV2.HomePageItems, Integer> RemoteActionCompatParcelizer;
    private final Comparator<getApiKey> read;
    private volatile List<? extends getApiKey> write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public queryPackageSignatureVerified(SignInButtonButtonSize signInButtonButtonSize, getAnswerMap<? super Integer, getShowPopup> getanswermap) {
        super(new AudioAttributesCompatParcelizer());
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        this.AudioAttributesImplBaseParcelizer = signInButtonButtonSize;
        this.MediaBrowserCompatCustomActionResultReceiver = getanswermap;
        this.RemoteActionCompatParcelizer = VideoTimelineResponseBody.read();
        this.write = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.read = new Comparator() { // from class: o.Scopes
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return queryPackageSignatureVerified.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (getApiKey) obj, (getApiKey) obj2);
            }
        };
    }

    public final void RemoteActionCompatParcelizer(List<? extends CourseConfigV2.HomePageItems> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        Iterable<SyncResult> iterableOnPlayFromSearch = IntermediateLoginResponseBody.onPlayFromSearch(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(iterableOnPlayFromSearch, 10)), 16));
        for (SyncResult syncResult : iterableOnPlayFromSearch) {
            Pair pairWrite = setAction.write(syncResult.write(), Integer.valueOf(syncResult.AudioAttributesCompatParcelizer()));
            linkedHashMap.put(pairWrite.write(), pairWrite.IconCompatParcelizer());
        }
        this.RemoteActionCompatParcelizer = linkedHashMap;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/queryPackageSignatureVerified$RemoteActionCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        switch (i) {
            case 1:
                View viewInflate = layoutInflaterFrom.inflate(R.layout.layout_fc_qbank, viewGroup, false);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
                return new getAvailableFeatures(viewInflate);
            case 2:
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.layout_fc_video, viewGroup, false);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate2, "");
                return new getRequiredFeatures(viewInflate2);
            case 3:
                View viewInflate3 = layoutInflaterFrom.inflate(R.layout.item_home_test_card, viewGroup, false);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate3, "");
                return new isConnected.IconCompatParcelizer(viewInflate3);
            case 4:
                View viewInflate4 = layoutInflaterFrom.inflate(R.layout.layout_fc_hyper_link, viewGroup, false);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate4, "");
                return new connect(viewInflate4);
            case 5:
                View viewInflate5 = layoutInflaterFrom.inflate(R.layout.layout_fc_live_video, viewGroup, false);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate5, "");
                return new ApiBaseClientBuilder(viewInflate5);
            case 6:
                toMagicModuleMetaRepoModel.write(layoutInflaterFrom);
                return read(layoutInflaterFrom, viewGroup);
            case 7:
                HlsSampleStreamWrapperExternalSyntheticLambda0 hlsSampleStreamWrapperExternalSyntheticLambda0RemoteActionCompatParcelizer = HlsSampleStreamWrapperExternalSyntheticLambda0.RemoteActionCompatParcelizer(layoutInflaterFrom, viewGroup);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsSampleStreamWrapperExternalSyntheticLambda0RemoteActionCompatParcelizer, "");
                return new UserRecoverableException(hlsSampleStreamWrapperExternalSyntheticLambda0RemoteActionCompatParcelizer);
            case 8:
                prepareWithMultivariantPlaylistInfo preparewithmultivariantplaylistinfoIconCompatParcelizer = prepareWithMultivariantPlaylistInfo.IconCompatParcelizer(layoutInflaterFrom, viewGroup);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(preparewithmultivariantplaylistinfoIconCompatParcelizer, "");
                return new ApiApiOptions(preparewithmultivariantplaylistinfoIconCompatParcelizer);
            case 9:
                HlsSampleStreamWrapperExternalSyntheticLambda2 hlsSampleStreamWrapperExternalSyntheticLambda2 = HlsSampleStreamWrapperExternalSyntheticLambda2.read(layoutInflaterFrom, viewGroup);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsSampleStreamWrapperExternalSyntheticLambda2, "");
                return new Api(hlsSampleStreamWrapperExternalSyntheticLambda2);
            case 10:
                HlsSampleStreamWrapperExternalSyntheticLambda2 hlsSampleStreamWrapperExternalSyntheticLambda22 = HlsSampleStreamWrapperExternalSyntheticLambda2.read(layoutInflaterFrom, viewGroup);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsSampleStreamWrapperExternalSyntheticLambda22, "");
                return new ApiApiOptionsHasOptions(hlsSampleStreamWrapperExternalSyntheticLambda22);
            case 11:
                HlsSampleStreamWrapperExternalSyntheticLambda1 hlsSampleStreamWrapperExternalSyntheticLambda1 = HlsSampleStreamWrapperExternalSyntheticLambda1.read(layoutInflaterFrom, viewGroup);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsSampleStreamWrapperExternalSyntheticLambda1, "");
                return new KeepName(hlsSampleStreamWrapperExternalSyntheticLambda1);
            case 12:
                onPlaylistUpdated onplaylistupdatedAudioAttributesCompatParcelizer = onPlaylistUpdated.AudioAttributesCompatParcelizer(layoutInflaterFrom, viewGroup);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onplaylistupdatedAudioAttributesCompatParcelizer, "");
                return new ApiAnyClientKey(onplaylistupdatedAudioAttributesCompatParcelizer);
            case 13:
                getPrimaryTrackGroupIndex getprimarytrackgroupindexRemoteActionCompatParcelizer = getPrimaryTrackGroupIndex.RemoteActionCompatParcelizer(layoutInflaterFrom, viewGroup);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getprimarytrackgroupindexRemoteActionCompatParcelizer, "");
                return new SignInButtonColorScheme(getprimarytrackgroupindexRemoteActionCompatParcelizer);
            default:
                View viewInflate6 = layoutInflaterFrom.inflate(R.layout.layout_common_card_empty, viewGroup, false);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate6, "");
                return new ApiApiOptionsHasAccountOptions(viewInflate6);
        }
    }

    private static RecyclerView.onMediaButtonEvent read(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            View viewInflate = layoutInflater.inflate(R.layout.layout_fc_mcq_of_the_day, viewGroup, false);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
            return new ApiApiOptionsNotRequiredOptions(viewInflate);
        } catch (InflateException e) {
            DtsReader.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(e);
            View viewInflate2 = layoutInflater.inflate(R.layout.layout_common_card_empty, viewGroup, false);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate2, "");
            return new ApiApiOptionsHasAccountOptions(viewInflate2);
        }
    }

    @Override // kotlin.deserializeIymvxus, androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return RemoteActionCompatParcelizer().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
        toMagicModuleMetaRepoModel.write(onmediabuttonevent, "");
        getApiKey getapikey = RemoteActionCompatParcelizer().get(i);
        switch (getItemViewType(i)) {
            case 1:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((getAvailableFeatures) onmediabuttonevent).IconCompatParcelizer((hasConnectedApi) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 2:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((getRequiredFeatures) onmediabuttonevent).RemoteActionCompatParcelizer((unregisterConnectionFailedListener) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 3:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((isConnected.IconCompatParcelizer) onmediabuttonevent).read(stopAutoManage.read((registerConnectionCallbacks) getapikey), this.AudioAttributesImplBaseParcelizer, true);
                break;
            case 4:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((connect) onmediabuttonevent).read((dumpAll) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 5:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((ApiBaseClientBuilder) onmediabuttonevent).write((GoogleApiActivity) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 6:
                if (onmediabuttonevent instanceof ApiApiOptionsNotRequiredOptions) {
                    toMagicModuleMetaRepoModel.read(getapikey, "");
                    ((ApiApiOptionsNotRequiredOptions) onmediabuttonevent).IconCompatParcelizer((enqueue) getapikey, new getAnswerMap() { // from class: o.SignInButton
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return queryPackageSignatureVerified.IconCompatParcelizer(this.IconCompatParcelizer, (setMapper) obj);
                        }
                    }, new getAnswerMap() { // from class: o.SupportErrorDialogFragment
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return queryPackageSignatureVerified.IconCompatParcelizer(this.write, (zaq) obj);
                        }
                    });
                } else if (onmediabuttonevent instanceof ApiApiOptionsHasAccountOptions) {
                }
                break;
            case 7:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((UserRecoverableException) onmediabuttonevent).IconCompatParcelizer((clearDefaultAccountAndReconnect) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 8:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((ApiApiOptions) onmediabuttonevent).AudioAttributesCompatParcelizer((registerConnectionFailedListener) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 9:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((Api) onmediabuttonevent).read((maybeSignIn) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 10:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((ApiApiOptionsHasOptions) onmediabuttonevent).write((zap) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 11:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((KeepName) onmediabuttonevent).AudioAttributesCompatParcelizer((hasApi) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 12:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((ApiAnyClientKey) onmediabuttonevent).IconCompatParcelizer((isConnectionCallbacksRegistered) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            case 13:
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((SignInButtonColorScheme) onmediabuttonevent).AudioAttributesCompatParcelizer((getAllClients) getapikey, this.AudioAttributesImplBaseParcelizer);
                break;
            default:
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(queryPackageSignatureVerified querypackagesignatureverified, setMapper setmapper) {
        toMagicModuleMetaRepoModel.write(setmapper, "");
        querypackagesignatureverified.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(new getContextFeatureId.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(setmapper));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(queryPackageSignatureVerified querypackagesignatureverified, zaq zaqVar) {
        toMagicModuleMetaRepoModel.write(zaqVar, "");
        querypackagesignatureverified.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(new getContextFeatureId.onFastForward(zaqVar));
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i, List<Object> list) {
        toMagicModuleMetaRepoModel.write(onmediabuttonevent, "");
        toMagicModuleMetaRepoModel.write(list, "");
        if (!list.isEmpty()) {
            getApiKey getapikey = RemoteActionCompatParcelizer().get(i);
            if (getItemViewType(i) == 11) {
                toMagicModuleMetaRepoModel.read(getapikey, "");
                ((KeepName) onmediabuttonevent).AudioAttributesCompatParcelizer((hasApi) getapikey, this.AudioAttributesImplBaseParcelizer);
            }
            for (Object obj : list) {
                KeepName keepName = onmediabuttonevent instanceof KeepName ? (KeepName) onmediabuttonevent : null;
                if (keepName != null) {
                    keepName.IconCompatParcelizer(obj);
                }
            }
            return;
        }
        onBindViewHolder(onmediabuttonevent, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int position) {
        return RemoteActionCompatParcelizer().get(position).MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(queryPackageSignatureVerified querypackagesignatureverified, getApiKey getapikey, getApiKey getapikey2) {
        Map<CourseConfigV2.HomePageItems, Integer> map = querypackagesignatureverified.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getapikey);
        Integer num = map.get(read(getapikey));
        int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        Map<CourseConfigV2.HomePageItems, Integer> map2 = querypackagesignatureverified.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getapikey2);
        Integer num2 = map2.get(read(getapikey2));
        int i = toMagicModuleMetaRepoModel.read(iIntValue, num2 != null ? num2.intValue() : Integer.MAX_VALUE);
        if (i != 0) {
            return i;
        }
        if ((getapikey instanceof getApiFallbackAttributionTag) && (getapikey2 instanceof getApiFallbackAttributionTag)) {
            return toMagicModuleMetaRepoModel.read(((getApiFallbackAttributionTag) getapikey).write(), ((getApiFallbackAttributionTag) getapikey2).write());
        }
        return toMagicModuleMetaRepoModel.read(getapikey.MediaBrowserCompatCustomActionResultReceiver(), getapikey2.MediaBrowserCompatCustomActionResultReceiver());
    }

    private static CourseConfigV2.HomePageItems read(getApiKey getapikey) {
        switch (getapikey.MediaBrowserCompatCustomActionResultReceiver()) {
            case 7:
                return CourseConfigV2.HomePageItems.RENEW_CARD;
            case 8:
                return CourseConfigV2.HomePageItems.SUGGESTED_TEST;
            case 9:
                return CourseConfigV2.HomePageItems.SUGGESTED_QBANK;
            case 10:
                return CourseConfigV2.HomePageItems.SUGGESTED_VIDEO;
            case 11:
                return CourseConfigV2.HomePageItems.PEARLS;
            case 12:
                return CourseConfigV2.HomePageItems.RECENT_UPDATES;
            case 13:
                return CourseConfigV2.HomePageItems.MAGIC_MODULE;
            default:
                return CourseConfigV2.HomePageItems.FEATURED_CARD;
        }
    }

    private final void AudioAttributesCompatParcelizer(List<? extends getApiKey> list) {
        getAnswerMap<Integer, getShowPopup> getanswermap;
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    IntermediateLoginResponseBody.read();
                }
                getApiKey getapikey = (getApiKey) obj;
                if ((getapikey instanceof getApiFallbackAttributionTag) || list.indexOf(getapikey) == i) {
                    arrayList.add(obj);
                }
                i++;
            }
            this.write = arrayList;
            if (this.write.size() != RemoteActionCompatParcelizer().size() && (getanswermap = this.MediaBrowserCompatCustomActionResultReceiver) != null) {
                getanswermap.invoke(Integer.valueOf(this.write.size()));
            }
            read(list);
        }
    }

    private final void AudioAttributesCompatParcelizer(getApiKey getapikey) {
        synchronized (this) {
            List<? extends getApiKey> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.write);
            int iBinarySearch = Collections.binarySearch(listMediaBrowserCompatItemReceiver, getapikey, this.read);
            if (iBinarySearch < 0) {
                iBinarySearch = -(iBinarySearch + 1);
            }
            listMediaBrowserCompatItemReceiver.add(iBinarySearch, getapikey);
            AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver);
        }
    }

    public final void write(final getApiKey getapikey) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(getapikey, "");
            List<? extends getApiKey> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.write);
            List<Integer> listIconCompatParcelizer = IconCompatParcelizer(getapikey);
            if (listIconCompatParcelizer.size() > 1) {
                IntermediateLoginResponseBody.read((List) listMediaBrowserCompatItemReceiver, new getAnswerMap() { // from class: o.queryPackageSignatureVerifiedWithRetry
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(queryPackageSignatureVerified.write(getapikey, (getApiKey) obj));
                    }
                });
                AudioAttributesCompatParcelizer(getapikey);
            } else if (listIconCompatParcelizer.size() == 1) {
                listMediaBrowserCompatItemReceiver.set(((Number) IntermediateLoginResponseBody.RatingCompat((List) listIconCompatParcelizer)).intValue(), getapikey);
                AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver);
            } else {
                AudioAttributesCompatParcelizer(getapikey);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(getApiKey getapikey, getApiKey getapikey2) {
        toMagicModuleMetaRepoModel.write(getapikey2, "");
        return getapikey2.MediaBrowserCompatCustomActionResultReceiver() == getapikey.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final void RemoteActionCompatParcelizer(getApiKey getapikey) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(getapikey, "");
            List<? extends getApiKey> listMediaBrowserCompatItemReceiver = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) this.write);
            Iterator<T> it = IconCompatParcelizer(getapikey).iterator();
            while (it.hasNext()) {
                listMediaBrowserCompatItemReceiver.remove(((Number) it.next()).intValue());
            }
            AudioAttributesCompatParcelizer(listMediaBrowserCompatItemReceiver);
        }
    }

    public final void IconCompatParcelizer(List<? extends getApiFallbackAttributionTag> list) {
        synchronized (this) {
            toMagicModuleMetaRepoModel.write(list, "");
            List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{1, 2, 3, 4, 6, 5});
            List<? extends getApiKey> list2 = this.write;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!listRemoteActionCompatParcelizer.contains(Integer.valueOf(((getApiKey) obj).MediaBrowserCompatCustomActionResultReceiver()))) {
                    arrayList.add(obj);
                }
            }
            AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) arrayList, (Iterable) list), (Comparator) this.read));
        }
    }

    public final List<Integer> IconCompatParcelizer(getApiKey getapikey) {
        toMagicModuleMetaRepoModel.write(getapikey, "");
        Iterable iterableOnPlayFromSearch = IntermediateLoginResponseBody.onPlayFromSearch(this.write);
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterableOnPlayFromSearch) {
            getApiKey getapikey2 = (getApiKey) ((SyncResult) obj).read();
            if (getapikey instanceof getApiFallbackAttributionTag) {
                if ((getapikey2 instanceof getApiFallbackAttributionTag) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((getApiFallbackAttributionTag) getapikey2).read(), (Object) ((getApiFallbackAttributionTag) getapikey).read())) {
                    arrayList.add(obj);
                }
            } else if (getapikey2.MediaBrowserCompatCustomActionResultReceiver() == getapikey.MediaBrowserCompatCustomActionResultReceiver()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Integer.valueOf(((SyncResult) it.next()).AudioAttributesCompatParcelizer()));
        }
        return arrayList3;
    }

    public static final class AudioAttributesCompatParcelizer extends SequenceSerializer.RemoteActionCompatParcelizer<getApiKey> {
        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ boolean RemoteActionCompatParcelizer(getApiKey getapikey, getApiKey getapikey2) {
            return IconCompatParcelizer(getapikey, getapikey2);
        }

        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* bridge */ /* synthetic */ boolean read(getApiKey getapikey, getApiKey getapikey2) {
            return read2(getapikey, getapikey2);
        }

        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ Object write(getApiKey getapikey, getApiKey getapikey2) {
            return RemoteActionCompatParcelizer2(getapikey, getapikey2);
        }

        private static boolean IconCompatParcelizer(getApiKey getapikey, getApiKey getapikey2) {
            toMagicModuleMetaRepoModel.write(getapikey, "");
            toMagicModuleMetaRepoModel.write(getapikey2, "");
            return getapikey.MediaBrowserCompatCustomActionResultReceiver() == getapikey2.MediaBrowserCompatCustomActionResultReceiver();
        }

        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        private static boolean read2(getApiKey getapikey, getApiKey getapikey2) {
            toMagicModuleMetaRepoModel.write(getapikey, "");
            toMagicModuleMetaRepoModel.write(getapikey2, "");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getapikey.getClass(), getapikey2.getClass())) {
                return false;
            }
            if ((getapikey instanceof GoogleApiActivity) && (getapikey2 instanceof GoogleApiActivity)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((GoogleApiActivity) getapikey, getapikey2);
            }
            if ((getapikey instanceof dumpAll) && (getapikey2 instanceof dumpAll)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((dumpAll) getapikey, getapikey2);
            }
            if ((getapikey instanceof unregisterConnectionFailedListener) && (getapikey2 instanceof unregisterConnectionFailedListener)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((unregisterConnectionFailedListener) getapikey, getapikey2);
            }
            if ((getapikey instanceof hasConnectedApi) && (getapikey2 instanceof hasConnectedApi)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((hasConnectedApi) getapikey, getapikey2);
            }
            if ((getapikey instanceof registerConnectionCallbacks) && (getapikey2 instanceof registerConnectionCallbacks)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((registerConnectionCallbacks) getapikey, getapikey2);
            }
            if ((getapikey instanceof enqueue) && (getapikey2 instanceof enqueue)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((enqueue) getapikey, getapikey2);
            }
            if ((getapikey instanceof clearDefaultAccountAndReconnect) && (getapikey2 instanceof clearDefaultAccountAndReconnect)) {
                return ((clearDefaultAccountAndReconnect) getapikey).getRead() == ((clearDefaultAccountAndReconnect) getapikey2).getRead();
            }
            if ((getapikey instanceof registerConnectionFailedListener) && (getapikey2 instanceof registerConnectionFailedListener)) {
                registerConnectionFailedListener registerconnectionfailedlistener = (registerConnectionFailedListener) getapikey;
                registerConnectionFailedListener registerconnectionfailedlistener2 = (registerConnectionFailedListener) getapikey2;
                return registerconnectionfailedlistener.AudioAttributesCompatParcelizer().size() == registerconnectionfailedlistener2.AudioAttributesCompatParcelizer().size() && CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(registerconnectionfailedlistener.AudioAttributesCompatParcelizer(), registerconnectionfailedlistener2.AudioAttributesCompatParcelizer());
            }
            if ((getapikey instanceof maybeSignIn) && (getapikey2 instanceof maybeSignIn)) {
                maybeSignIn maybesignin = (maybeSignIn) getapikey;
                maybeSignIn maybesignin2 = (maybeSignIn) getapikey2;
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) maybesignin.getRemoteActionCompatParcelizer(), (Object) maybesignin2.getRemoteActionCompatParcelizer()) && maybesignin.getAudioAttributesImplBaseParcelizer() == maybesignin2.getAudioAttributesImplBaseParcelizer();
            }
            if ((getapikey instanceof zap) && (getapikey2 instanceof zap)) {
                zap zapVar = (zap) getapikey;
                zap zapVar2 = (zap) getapikey2;
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) zapVar.getRead(), (Object) zapVar2.getRead()) && zapVar.getAudioAttributesImplApi26Parcelizer() == zapVar2.getAudioAttributesImplApi26Parcelizer();
            }
            if ((getapikey instanceof hasApi) && (getapikey2 instanceof hasApi)) {
                hasApi hasapi = (hasApi) getapikey;
                hasApi hasapi2 = (hasApi) getapikey2;
                return hasapi.getWrite() == hasapi2.getWrite() && hasapi.getRemoteActionCompatParcelizer() == hasapi2.getRemoteActionCompatParcelizer();
            }
            if ((getapikey instanceof isConnectionCallbacksRegistered) && (getapikey2 instanceof isConnectionCallbacksRegistered)) {
                isConnectionCallbacksRegistered isconnectioncallbacksregistered = (isConnectionCallbacksRegistered) getapikey;
                isConnectionCallbacksRegistered isconnectioncallbacksregistered2 = (isConnectionCallbacksRegistered) getapikey2;
                return isconnectioncallbacksregistered.getWrite() == isconnectioncallbacksregistered2.getWrite() && isconnectioncallbacksregistered.getIconCompatParcelizer() == isconnectioncallbacksregistered2.getIconCompatParcelizer();
            }
            if ((getapikey instanceof getAllClients) && (getapikey2 instanceof getAllClients)) {
                getAllClients getallclients = (getAllClients) getapikey;
                getAllClients getallclients2 = (getAllClients) getapikey2;
                if (getallclients.getWrite() == getallclients2.getWrite() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) getallclients.getIconCompatParcelizer(), (Object) getallclients2.getIconCompatParcelizer()) && getallclients.getAudioAttributesCompatParcelizer() == getallclients2.getAudioAttributesCompatParcelizer()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
        private static Object RemoteActionCompatParcelizer2(getApiKey getapikey, getApiKey getapikey2) {
            toMagicModuleMetaRepoModel.write(getapikey, "");
            toMagicModuleMetaRepoModel.write(getapikey2, "");
            if (!(getapikey instanceof hasApi) || !(getapikey2 instanceof hasApi)) {
                return null;
            }
            List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
            hasApi hasapi = (hasApi) getapikey;
            hasApi hasapi2 = (hasApi) getapikey2;
            if (hasapi.getWrite() != hasapi2.getWrite()) {
                listIconCompatParcelizer.add(Integer.valueOf(hasapi2.getWrite()));
            }
            if (hasapi.getRemoteActionCompatParcelizer() != hasapi2.getRemoteActionCompatParcelizer()) {
                listIconCompatParcelizer.add(Boolean.valueOf(hasapi2.getRemoteActionCompatParcelizer()));
            }
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer);
        }
    }
}
