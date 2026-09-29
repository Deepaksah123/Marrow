package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.List;
import kotlin.BrowserPublicKeyCredentialCreationOptions;
import kotlin.Metadata;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f\u001cB\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/getKeyHandle;", "Lo/deserializeIymvxus;", "Lo/getApiKey;", "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "Lkotlin/Function1;", "Lo/BrowserPublicKeyCredentialCreationOptions;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "Landroid/view/ViewGroup;", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "", "", "p2", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;ILjava/util/List;)V", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V", "getItemViewType", "(I)I", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;)V", "getItemCount", "()I", "read", "Lo/getAnswerMap;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getKeyHandle extends deserializeIymvxus<getApiKey, RecyclerView.onMediaButtonEvent> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<BrowserPublicKeyCredentialCreationOptions, getShowPopup> AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public getKeyHandle(getAnswerMap<? super BrowserPublicKeyCredentialCreationOptions, getShowPopup> getanswermap) {
        super(new read());
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = getanswermap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(p0.getContext());
        if (p1 == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.layout_fc_mcq_of_the_day, p0, false);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
            return new ApiApiOptionsNotRequiredOptions(viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.layout_common_card_empty, p0, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate2, "");
        return new ApiApiOptionsHasAccountOptions(viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1, List<Object> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (!p2.isEmpty()) {
            for (Object obj : p2) {
                ApiApiOptionsNotRequiredOptions apiApiOptionsNotRequiredOptions = p0 instanceof ApiApiOptionsNotRequiredOptions ? (ApiApiOptionsNotRequiredOptions) p0 : null;
                if (apiApiOptionsNotRequiredOptions != null) {
                    apiApiOptionsNotRequiredOptions.RemoteActionCompatParcelizer(obj);
                }
            }
            return;
        }
        onBindViewHolder(p0, p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        getApiKey getapikey = read(p1);
        if (getItemViewType(p1) == 1) {
            toMagicModuleMetaRepoModel.read(getapikey, "");
            ((ApiApiOptionsNotRequiredOptions) p0).IconCompatParcelizer((enqueue) getapikey, new getAnswerMap() { // from class: o.AuthenticatorAttestationResponse
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getKeyHandle.read(this.write, (setMapper) obj);
                }
            }, new getAnswerMap() { // from class: o.getAttestationObject
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return getKeyHandle.read(this.write, (zaq) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getKeyHandle getkeyhandle, setMapper setmapper) {
        toMagicModuleMetaRepoModel.write(setmapper, "");
        getkeyhandle.AudioAttributesCompatParcelizer.invoke(new BrowserPublicKeyCredentialCreationOptions.RemoteActionCompatParcelizer(setmapper));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(getKeyHandle getkeyhandle, zaq zaqVar) {
        toMagicModuleMetaRepoModel.write(zaqVar, "");
        getkeyhandle.AudioAttributesCompatParcelizer.invoke(new BrowserPublicKeyCredentialCreationOptions.read(zaqVar));
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int p0) {
        return read(p0) instanceof enqueue ? 1 : -1;
    }

    public final void RemoteActionCompatParcelizer(List<? extends getApiKey> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read(p0);
    }

    @Override // kotlin.deserializeIymvxus, androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return RemoteActionCompatParcelizer().size();
    }

    public static final class read extends SequenceSerializer.RemoteActionCompatParcelizer<getApiKey> {
        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ boolean RemoteActionCompatParcelizer(getApiKey getapikey, getApiKey getapikey2) {
            return AudioAttributesCompatParcelizer(getapikey, getapikey2);
        }

        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* bridge */ /* synthetic */ boolean read(getApiKey getapikey, getApiKey getapikey2) {
            return read2(getapikey, getapikey2);
        }

        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* bridge */ /* synthetic */ Object write(getApiKey getapikey, getApiKey getapikey2) {
            return write2(getapikey, getapikey2);
        }

        private static boolean AudioAttributesCompatParcelizer(getApiKey getapikey, getApiKey getapikey2) {
            toMagicModuleMetaRepoModel.write(getapikey, "");
            toMagicModuleMetaRepoModel.write(getapikey2, "");
            return getapikey.MediaBrowserCompatCustomActionResultReceiver() == getapikey2.MediaBrowserCompatCustomActionResultReceiver();
        }

        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        private static boolean read2(getApiKey getapikey, getApiKey getapikey2) {
            toMagicModuleMetaRepoModel.write(getapikey, "");
            toMagicModuleMetaRepoModel.write(getapikey2, "");
            if ((getapikey instanceof enqueue) && (getapikey2 instanceof enqueue)) {
                return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((enqueue) getapikey, getapikey2);
            }
            return false;
        }

        /* JADX INFO: renamed from: write, reason: avoid collision after fix types in other method */
        private static Object write2(getApiKey getapikey, getApiKey getapikey2) {
            toMagicModuleMetaRepoModel.write(getapikey, "");
            toMagicModuleMetaRepoModel.write(getapikey2, "");
            if (!(getapikey instanceof enqueue) || !(getapikey2 instanceof enqueue)) {
                return null;
            }
            List listIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer();
            if (((enqueue) getapikey).onCommand() != ((enqueue) getapikey2).onCommand()) {
                listIconCompatParcelizer.add(getapikey2);
            }
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(listIconCompatParcelizer);
        }
    }
}
