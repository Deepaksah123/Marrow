package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.customviews.MediaPlayerRecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 extends Fragment {
    MediaPlayerRecyclerView AudioAttributesCompatParcelizer;
    private access3500 AudioAttributesImplApi21Parcelizer;
    private WeakReference<RemoteActionCompatParcelizer> AudioAttributesImplApi26Parcelizer;
    private RecyclerView MediaBrowserCompatCustomActionResultReceiver;
    private LinearLayout MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private CTInboxStyleConfig MediaBrowserCompatSearchResultReceiver;
    private Rarray RemoteActionCompatParcelizer;
    private CleverTapInstanceConfig write;
    private boolean read = lambdaonDownstreamFormatChanged28.IconCompatParcelizer;
    private ArrayList<CTInboxMessage> AudioAttributesImplBaseParcelizer = new ArrayList<>();
    private boolean IconCompatParcelizer = true;

    /* JADX INFO: loaded from: classes.dex */
    interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2);

        void write(CTInboxMessage cTInboxMessage, Bundle bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.write = (CleverTapInstanceConfig) arguments.getParcelable(PaymentConstants.Category.CONFIG);
            this.MediaBrowserCompatSearchResultReceiver = (CTInboxStyleConfig) arguments.getParcelable("styleConfig");
            this.MediaBrowserCompatMediaItem = arguments.getInt("position", -1);
            write();
            if (context instanceof SimpleBasePlayerPlaceholderUid) {
                read((RemoteActionCompatParcelizer) getActivity());
            }
            if (context instanceof Rarray) {
                this.RemoteActionCompatParcelizer = (Rarray) context;
            }
        }
    }

    private void write() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("filter", null);
            PlayerTimelineChangeReason playerTimelineChangeReasonRemoteActionCompatParcelizer = PlayerTimelineChangeReason.RemoteActionCompatParcelizer(getActivity(), this.write);
            if (playerTimelineChangeReasonRemoteActionCompatParcelizer != null) {
                RendererWakeupListener.MediaMetadataCompat();
                ArrayList<CTInboxMessage> arrayListMediaBrowserCompatItemReceiver = playerTimelineChangeReasonRemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver();
                if (string != null) {
                    arrayListMediaBrowserCompatItemReceiver = RemoteActionCompatParcelizer(arrayListMediaBrowserCompatItemReceiver, string);
                }
                this.AudioAttributesImplBaseParcelizer = arrayListMediaBrowserCompatItemReceiver;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(RendererCapabilitiesAdaptiveSupport.IconCompatParcelizer.inbox_list_view, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.list_view_linear_layout);
        this.MediaBrowserCompatItemReceiver = linearLayout;
        linearLayout.setBackgroundColor(Color.parseColor(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer()));
        TextView textView = (TextView) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.list_view_no_message_view);
        if (this.AudioAttributesImplBaseParcelizer.size() <= 0) {
            textView.setVisibility(0);
            textView.setText(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer());
            textView.setTextColor(Color.parseColor(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatItemReceiver()));
            return viewInflate;
        }
        textView.setVisibility(8);
        getActivity();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.AudioAttributesImplApi21Parcelizer = new access3500(this.AudioAttributesImplBaseParcelizer, this);
        if (this.read) {
            MediaPlayerRecyclerView mediaPlayerRecyclerView = new MediaPlayerRecyclerView(getActivity());
            this.AudioAttributesCompatParcelizer = mediaPlayerRecyclerView;
            mediaPlayerRecyclerView.setVisibility(0);
            this.AudioAttributesCompatParcelizer.setLayoutManager(linearLayoutManager);
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(new lambdarelease13());
            this.AudioAttributesCompatParcelizer.setItemAnimator(new RegexDeserializerdeserializeoptions1());
            write(this.AudioAttributesCompatParcelizer);
            this.AudioAttributesCompatParcelizer.setAdapter(this.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesImplApi21Parcelizer.notifyDataSetChanged();
            this.MediaBrowserCompatItemReceiver.addView(this.AudioAttributesCompatParcelizer);
            if (this.IconCompatParcelizer && AudioAttributesCompatParcelizer()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.this.AudioAttributesCompatParcelizer.onCommand();
                    }
                }, 1000L);
                this.IconCompatParcelizer = false;
            }
            return viewInflate;
        }
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(RendererCapabilitiesAdaptiveSupport.write.list_view_recycler_view);
        this.MediaBrowserCompatCustomActionResultReceiver = recyclerView;
        recyclerView.setVisibility(0);
        this.MediaBrowserCompatCustomActionResultReceiver.setLayoutManager(linearLayoutManager);
        this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(new lambdarelease13());
        this.MediaBrowserCompatCustomActionResultReceiver.setItemAnimator(new RegexDeserializerdeserializeoptions1());
        write(this.MediaBrowserCompatCustomActionResultReceiver);
        this.MediaBrowserCompatCustomActionResultReceiver.setAdapter(this.AudioAttributesImplApi21Parcelizer);
        this.AudioAttributesImplApi21Parcelizer.notifyDataSetChanged();
        return viewInflate;
    }

    private static void write(RecyclerView recyclerView) {
        recyclerView.setClipToPadding(false);
        InvalidTypeIdException.read(recyclerView, new finishBranchObject() { // from class: o.SimpleBasePlayerStateBuilder
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.AudioAttributesCompatParcelizer(view, windowInsetsCompat);
            }
        });
    }

    static /* synthetic */ WindowInsetsCompat AudioAttributesCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat) {
        _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
        view.setPadding(_verifyendarrayforsingle.read, 0, _verifyendarrayforsingle.IconCompatParcelizer, _verifyendarrayforsingle.AudioAttributesCompatParcelizer);
        return WindowInsetsCompat.IconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("recyclerLayoutState");
            MediaPlayerRecyclerView mediaPlayerRecyclerView = this.AudioAttributesCompatParcelizer;
            if (mediaPlayerRecyclerView != null && mediaPlayerRecyclerView.AudioAttributesImplApi21Parcelizer() != null) {
                this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(parcelable);
            }
            RecyclerView recyclerView = this.MediaBrowserCompatCustomActionResultReceiver;
            if (recyclerView == null || recyclerView.AudioAttributesImplApi21Parcelizer() == null) {
                return;
            }
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(parcelable);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.AudioAttributesCompatParcelizer;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.onCustomAction();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.AudioAttributesCompatParcelizer;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.AudioAttributesCompatParcelizer;
        if (mediaPlayerRecyclerView != null && mediaPlayerRecyclerView.AudioAttributesImplApi21Parcelizer() != null) {
            bundle.putParcelable("recyclerLayoutState", this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer().onAddQueueItem());
        }
        RecyclerView recyclerView = this.MediaBrowserCompatCustomActionResultReceiver;
        if (recyclerView == null || recyclerView.AudioAttributesImplApi21Parcelizer() == null) {
            return;
        }
        bundle.putParcelable("recyclerLayoutState", this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer().onAddQueueItem());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        MediaPlayerRecyclerView mediaPlayerRecyclerView = this.AudioAttributesCompatParcelizer;
        if (mediaPlayerRecyclerView != null) {
            mediaPlayerRecyclerView.onPlayFromMediaId();
        }
    }

    private void write(Bundle bundle, int i, int i2, HashMap<String, String> map, int i3) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer();
        if (remoteActionCompatParcelizerIconCompatParcelizer != null) {
            getActivity().getBaseContext();
            remoteActionCompatParcelizerIconCompatParcelizer.AudioAttributesCompatParcelizer(i2, this.AudioAttributesImplBaseParcelizer.get(i), bundle, map, i3);
        }
    }

    final void IconCompatParcelizer(int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = IconCompatParcelizer();
        if (remoteActionCompatParcelizerIconCompatParcelizer != null) {
            RendererWakeupListener.MediaMetadataCompat();
            getActivity().getBaseContext();
            remoteActionCompatParcelizerIconCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer.get(i), null);
        }
    }

    private void RemoteActionCompatParcelizer(String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str.replace("\n", "").replace("\r", "")));
            if (getActivity() != null) {
                RendererCapabilitiesListener.RemoteActionCompatParcelizer(getActivity(), intent);
            }
            startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    private RemoteActionCompatParcelizer IconCompatParcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        try {
            remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.get();
        } catch (Throwable unused) {
            remoteActionCompatParcelizer = null;
        }
        if (remoteActionCompatParcelizer == null) {
            RendererWakeupListener.MediaMetadataCompat();
        }
        return remoteActionCompatParcelizer;
    }

    private void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer = new WeakReference<>(remoteActionCompatParcelizer);
    }

    final void write(int i, String str, JSONObject jSONObject, HashMap<String, String> map, int i2) {
        try {
            if (jSONObject != null) {
                this.AudioAttributesImplBaseParcelizer.get(i).RemoteActionCompatParcelizer().get(0);
                String strAudioAttributesImplBaseParcelizer = CTInboxMessageContent.AudioAttributesImplBaseParcelizer(jSONObject);
                if (strAudioAttributesImplBaseParcelizer.equalsIgnoreCase("url")) {
                    this.AudioAttributesImplBaseParcelizer.get(i).RemoteActionCompatParcelizer().get(0);
                    String strAudioAttributesImplApi26Parcelizer = CTInboxMessageContent.AudioAttributesImplApi26Parcelizer(jSONObject);
                    if (strAudioAttributesImplApi26Parcelizer != null) {
                        RemoteActionCompatParcelizer(strAudioAttributesImplApi26Parcelizer);
                    }
                } else if (strAudioAttributesImplBaseParcelizer.contains("rfp") && this.RemoteActionCompatParcelizer != null) {
                    this.AudioAttributesImplBaseParcelizer.get(i).RemoteActionCompatParcelizer().get(0);
                    this.RemoteActionCompatParcelizer.read(CTInboxMessageContent.MediaBrowserCompatItemReceiver(jSONObject));
                }
            } else {
                String strRemoteActionCompatParcelizer = this.AudioAttributesImplBaseParcelizer.get(i).RemoteActionCompatParcelizer().get(0).RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer != null) {
                    RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer);
                }
            }
            Bundle bundle = new Bundle();
            JSONObject jSONObjectMediaBrowserCompatItemReceiver = this.AudioAttributesImplBaseParcelizer.get(i).MediaBrowserCompatItemReceiver();
            Iterator<String> itKeys = jSONObjectMediaBrowserCompatItemReceiver.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("wzrk_")) {
                    bundle.putString(next, jSONObjectMediaBrowserCompatItemReceiver.getString(next));
                }
            }
            if (str != null && !str.isEmpty()) {
                bundle.putString("wzrk_c2a", str);
            }
            write(bundle, i, 0, map, i2);
        } catch (Throwable th) {
            Objects.toString(th.getCause());
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
    }

    final void read(int i, int i2) {
        try {
            Bundle bundle = new Bundle();
            JSONObject jSONObjectMediaBrowserCompatItemReceiver = this.AudioAttributesImplBaseParcelizer.get(i).MediaBrowserCompatItemReceiver();
            Iterator<String> itKeys = jSONObjectMediaBrowserCompatItemReceiver.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("wzrk_")) {
                    bundle.putString(next, jSONObjectMediaBrowserCompatItemReceiver.getString(next));
                }
            }
            write(bundle, i, i2, (HashMap<String, String>) null, -1);
            RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.get(i).RemoteActionCompatParcelizer().get(i2).RemoteActionCompatParcelizer());
        } catch (Throwable th) {
            Objects.toString(th.getCause());
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
    }

    private static ArrayList<CTInboxMessage> RemoteActionCompatParcelizer(ArrayList<CTInboxMessage> arrayList, String str) {
        ArrayList<CTInboxMessage> arrayList2 = new ArrayList<>();
        for (CTInboxMessage cTInboxMessage : arrayList) {
            if (cTInboxMessage.AudioAttributesImplApi21Parcelizer() != null && cTInboxMessage.AudioAttributesImplApi21Parcelizer().size() > 0) {
                Iterator<String> it = cTInboxMessage.AudioAttributesImplApi21Parcelizer().iterator();
                while (it.hasNext()) {
                    if (it.next().equalsIgnoreCase(str)) {
                        arrayList2.add(cTInboxMessage);
                    }
                }
            }
        }
        return arrayList2;
    }

    private boolean AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem <= 0;
    }
}
