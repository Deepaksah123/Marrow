package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.getBody;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentAuthorizationResult extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> implements getProtocolVersion {
    private boolean AudioAttributesCompatParcelizer;
    private List<? extends getBody> RemoteActionCompatParcelizer;
    private final RemoteActionCompatParcelizer write;

    public static final /* synthetic */ class IconCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[LoyaltyPointsBalanceBuilder.values().length];
            try {
                iArr[LoyaltyPointsBalanceBuilder.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoyaltyPointsBalanceBuilder.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface RemoteActionCompatParcelizer {
        void RemoteActionCompatParcelizer();

        void read(getBigEndianInt getbigendianint);

        void read(getBody.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver);

        void write();
    }

    public PaymentAuthorizationResult(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        this.write = remoteActionCompatParcelizer;
        this.RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == setString.write.getWrite()) {
            excludePlaylist excludeplaylistWrite = excludePlaylist.write(layoutInflaterFrom, viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(excludeplaylistWrite, "");
            return new CommonWalletObject(excludeplaylistWrite);
        }
        if (i == setString.AudioAttributesImplApi21Parcelizer.getWrite()) {
            HlsMediaPlaylistPart hlsMediaPlaylistPartRemoteActionCompatParcelizer = HlsMediaPlaylistPart.RemoteActionCompatParcelizer(layoutInflaterFrom, viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMediaPlaylistPartRemoteActionCompatParcelizer, "");
            return new getColumns(hlsMediaPlaylistPartRemoteActionCompatParcelizer, this.write);
        }
        if (i == setString.IconCompatParcelizer.getWrite()) {
            loadPlaylistImmediately loadplaylistimmediatelyWrite = loadPlaylistImmediately.write(layoutInflaterFrom, viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(loadplaylistimmediatelyWrite, "");
            return new IntermediatePaymentData(loadplaylistimmediatelyWrite);
        }
        if (i == setString.RemoteActionCompatParcelizer.getWrite()) {
            loadPlaylist loadplaylist = loadPlaylist.read(layoutInflaterFrom, viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(loadplaylist, "");
            return new getUpdatedSavedState(loadplaylist, this.write);
        }
        if (i == setString.read.getWrite()) {
            getMediaPlaylistUriForReload getmediaplaylisturiforreloadIconCompatParcelizer = getMediaPlaylistUriForReload.IconCompatParcelizer(layoutInflaterFrom, viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmediaplaylisturiforreloadIconCompatParcelizer, "");
            return new PaymentDataRequestUpdate(getmediaplaylisturiforreloadIconCompatParcelizer, this.write);
        }
        if (i == setString.MediaBrowserCompatItemReceiver.getWrite()) {
            processLoadedPlaylist processloadedplaylist = processLoadedPlaylist.read(layoutInflaterFrom, viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(processloadedplaylist, "");
            return new getHexBackgroundColor(processloadedplaylist);
        }
        if (i == setString.AudioAttributesCompatParcelizer.getWrite()) {
            DefaultHlsPlaylistTrackerMediaPlaylistBundle defaultHlsPlaylistTrackerMediaPlaylistBundleWrite = DefaultHlsPlaylistTrackerMediaPlaylistBundle.write(layoutInflaterFrom, viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultHlsPlaylistTrackerMediaPlaylistBundleWrite, "");
            return new LabelValue(defaultHlsPlaylistTrackerMediaPlaylistBundleWrite, this.write);
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.layout_common_card_empty, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return new ApiApiOptionsHasAccountOptions(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) throws Throwable {
        toMagicModuleMetaRepoModel.write(onmediabuttonevent, "");
        int itemViewType = getItemViewType(i);
        if (itemViewType == setString.write.getWrite()) {
            getBody getbody = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(getbody, "");
            ((CommonWalletObject) onmediabuttonevent).IconCompatParcelizer((getBody.AudioAttributesCompatParcelizer) getbody);
            return;
        }
        if (itemViewType == setString.AudioAttributesImplApi21Parcelizer.getWrite()) {
            getBody getbody2 = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(getbody2, "");
            ((getColumns) onmediabuttonevent).RemoteActionCompatParcelizer((getBody.MediaBrowserCompatItemReceiver) getbody2, this.AudioAttributesCompatParcelizer);
            return;
        }
        if (itemViewType == setString.IconCompatParcelizer.getWrite()) {
            getBody getbody3 = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(getbody3, "");
            ((IntermediatePaymentData) onmediabuttonevent).RemoteActionCompatParcelizer((getBody.read) getbody3);
            return;
        }
        if (itemViewType == setString.RemoteActionCompatParcelizer.getWrite()) {
            getBody getbody4 = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(getbody4, "");
            ((getUpdatedSavedState) onmediabuttonevent).IconCompatParcelizer((getBody.write) getbody4);
        } else {
            if (itemViewType == setString.MediaBrowserCompatItemReceiver.getWrite()) {
                ((getHexBackgroundColor) onmediabuttonevent).RemoteActionCompatParcelizer();
                return;
            }
            if (itemViewType == setString.read.getWrite()) {
                getBody getbody5 = this.RemoteActionCompatParcelizer.get(i);
                toMagicModuleMetaRepoModel.read(getbody5, "");
                ((PaymentDataRequestUpdate) onmediabuttonevent).RemoteActionCompatParcelizer((getBody.MediaBrowserCompatCustomActionResultReceiver) getbody5);
            } else if (itemViewType == setString.AudioAttributesCompatParcelizer.getWrite()) {
                getBody getbody6 = this.RemoteActionCompatParcelizer.get(i);
                toMagicModuleMetaRepoModel.read(getbody6, "");
                ((LabelValue) onmediabuttonevent).write((getBody.IconCompatParcelizer) getbody6);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int i) {
        getBody getbody = this.RemoteActionCompatParcelizer.get(i);
        if (getbody instanceof getBody.read) {
            return setString.IconCompatParcelizer.getWrite();
        }
        if (getbody instanceof getBody.AudioAttributesCompatParcelizer) {
            return setString.write.getWrite();
        }
        if (getbody instanceof getBody.MediaBrowserCompatItemReceiver) {
            return setString.AudioAttributesImplApi21Parcelizer.getWrite();
        }
        if (getbody instanceof getBody.write) {
            return setString.RemoteActionCompatParcelizer.getWrite();
        }
        if (getbody instanceof getBody.MediaBrowserCompatCustomActionResultReceiver) {
            return setString.read.getWrite();
        }
        if (getbody instanceof getBody.AudioAttributesImplBaseParcelizer) {
            return setString.MediaBrowserCompatItemReceiver.getWrite();
        }
        if (getbody instanceof getBody.IconCompatParcelizer) {
            return setString.AudioAttributesCompatParcelizer.getWrite();
        }
        return 0;
    }

    public final void RemoteActionCompatParcelizer(List<? extends getBody> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((getBody) obj).getAudioAttributesCompatParcelizer()) {
                arrayList.add(obj);
            }
        }
        this.RemoteActionCompatParcelizer = arrayList;
        notifyDataSetChanged();
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // kotlin.getProtocolVersion
    public final int IconCompatParcelizer(int i) {
        while (!RemoteActionCompatParcelizer(i)) {
            i--;
            if (i < 0) {
                return 0;
            }
        }
        return i;
    }

    @Override // kotlin.getProtocolVersion
    public final int AudioAttributesCompatParcelizer(int i) {
        if (getItemViewType(i) == setString.write.getWrite()) {
            return R.layout.item_test_header_card;
        }
        return -1;
    }

    @Override // kotlin.getProtocolVersion
    public final void write(View view, int i) {
        if (view != null) {
            getBody getbody = this.RemoteActionCompatParcelizer.get(i);
            String string = "";
            toMagicModuleMetaRepoModel.read(getbody, "");
            getBody.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (getBody.AudioAttributesCompatParcelizer) getbody;
            TextView textView = (TextView) view.findViewById(R.id.tvMonthName);
            if (textView != null) {
                String upperCase = audioAttributesCompatParcelizer.getIconCompatParcelizer().toUpperCase(Locale.ROOT);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
                int i2 = IconCompatParcelizer.RemoteActionCompatParcelizer[audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer().ordinal()];
                if (i2 == 1) {
                    string = view.getContext().getString(R.string.test_upcoming_month);
                } else if (i2 == 2) {
                    string = view.getContext().getString(R.string.test_current_month);
                }
                toMagicModuleMetaRepoModel.write((Object) string);
                if (audioAttributesCompatParcelizer.getWrite()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(upperCase);
                    sb.append(" ");
                    sb.append(string);
                    upperCase = sb.toString();
                }
                textView.setText(upperCase);
                textView.setTextColor(_isNaN.getColor(view.getContext(), audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() == LoyaltyPointsBalanceBuilder.RemoteActionCompatParcelizer ? R.color.colorPrimary : R.color.v1_onbackgroundsurface3));
            }
            TextView textView2 = (TextView) view.findViewById(R.id.tvYearName);
            if (textView2 != null) {
                textView2.setText(audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer());
            }
        }
    }

    @Override // kotlin.getProtocolVersion
    public final boolean RemoteActionCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.get(i) instanceof getBody.AudioAttributesCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onViewRecycled(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        toMagicModuleMetaRepoModel.write(onmediabuttonevent, "");
        if (onmediabuttonevent instanceof getColumns) {
            ((getColumns) onmediabuttonevent).AudioAttributesCompatParcelizer();
        }
        super.onViewRecycled(onmediabuttonevent);
    }
}
