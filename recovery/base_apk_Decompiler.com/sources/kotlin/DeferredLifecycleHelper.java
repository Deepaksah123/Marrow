package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.util.Iterator;
import java.util.List;
import kotlin.DeferredLifecycleHelper;
import kotlin.OnDelegateCreatedListener;

/* JADX INFO: loaded from: classes4.dex */
public final class DeferredLifecycleHelper extends RecyclerView.IconCompatParcelizer<AudioAttributesCompatParcelizer> {
    private final getAnswerMap<String, getShowPopup> AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;
    private List<OnDelegateCreatedListener> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public DeferredLifecycleHelper(getCreatedOnDateMs<getShowPopup> getcreatedondatems, getAnswerMap<? super String, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.IconCompatParcelizer = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AudioAttributesCompatParcelizer(viewGroup);
    }

    public final void RemoteActionCompatParcelizer(List<OnDelegateCreatedListener> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
        notifyDataSetChanged();
    }

    private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_plan_validity, viewGroup, false);
        toMagicModuleMetaRepoModel.write(viewInflate);
        return new AudioAttributesCompatParcelizer(this, viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, final int i) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        final OnDelegateCreatedListener onDelegateCreatedListener = this.RemoteActionCompatParcelizer.get(i);
        audioAttributesCompatParcelizer.IconCompatParcelizer(onDelegateCreatedListener, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, new getCreatedOnDateMs() { // from class: o.createDelegate
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return DeferredLifecycleHelper.AudioAttributesCompatParcelizer(onDelegateCreatedListener, this, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(OnDelegateCreatedListener onDelegateCreatedListener, DeferredLifecycleHelper deferredLifecycleHelper, int i) {
        onDelegateCreatedListener.write(!onDelegateCreatedListener.AudioAttributesImplApi21Parcelizer());
        deferredLifecycleHelper.notifyItemChanged(i);
        Iterator<OnDelegateCreatedListener> it = deferredLifecycleHelper.RemoteActionCompatParcelizer.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            OnDelegateCreatedListener next = it.next();
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(next, onDelegateCreatedListener) && next.AudioAttributesImplApi21Parcelizer()) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return getShowPopup.INSTANCE;
        }
        deferredLifecycleHelper.RemoteActionCompatParcelizer.get(i2).write(false);
        deferredLifecycleHelper.notifyItemChanged(i2);
        return getShowPopup.INSTANCE;
    }

    public final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final View AudioAttributesCompatParcelizer;
        private /* synthetic */ DeferredLifecycleHelper AudioAttributesImplApi21Parcelizer;
        private final LinearLayout AudioAttributesImplApi26Parcelizer;
        private final ImageView AudioAttributesImplBaseParcelizer;
        private final Button IconCompatParcelizer;
        private final View MediaBrowserCompatCustomActionResultReceiver;
        private final TextView MediaBrowserCompatItemReceiver;
        private final TextView MediaBrowserCompatMediaItem;
        private final TextView MediaBrowserCompatSearchResultReceiver;
        private final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final TextView MediaDescriptionCompat;
        private final TextView MediaMetadataCompat;
        private final TextView RatingCompat;
        private final View RemoteActionCompatParcelizer;
        private final CardView read;
        private final TextView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(DeferredLifecycleHelper deferredLifecycleHelper, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesImplApi21Parcelizer = deferredLifecycleHelper;
            View viewFindViewById = view.findViewById(R.id.planItemHeader);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.MediaMetadataCompat = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.addonsLayout);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.RemoteActionCompatParcelizer = viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.addonsLayoutDivider);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            this.AudioAttributesCompatParcelizer = viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.paymentIdLayoutDivider);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            this.MediaBrowserCompatCustomActionResultReceiver = viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.addonTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            this.MediaBrowserCompatItemReceiver = (TextView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.tvPlanVideos);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById6, "");
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (TextView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.tvPlanQbank);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById7, "");
            this.MediaBrowserCompatSearchResultReceiver = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.tvPlanTest);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById8, "");
            this.MediaDescriptionCompat = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.tvPaymentId);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById9, "");
            this.MediaBrowserCompatMediaItem = (TextView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.tvPurchasedOn);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById10, "");
            this.RatingCompat = (TextView) viewFindViewById10;
            View viewFindViewById11 = view.findViewById(R.id.btnAddAddress);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById11, "");
            this.IconCompatParcelizer = (Button) viewFindViewById11;
            View viewFindViewById12 = view.findViewById(R.id.btnViewInvoice);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById12, "");
            this.write = (TextView) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(R.id.cardPlan);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById13, "");
            this.read = (CardView) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(R.id.imgExpandArrow);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById14, "");
            this.AudioAttributesImplBaseParcelizer = (ImageView) viewFindViewById14;
            View viewFindViewById15 = view.findViewById(R.id.paymentInvoiceLayout);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById15, "");
            this.AudioAttributesImplApi26Parcelizer = (LinearLayout) viewFindViewById15;
        }

        public final void IconCompatParcelizer(final OnDelegateCreatedListener onDelegateCreatedListener, final getCreatedOnDateMs<getShowPopup> getcreatedondatems, final getAnswerMap<? super String, getShowPopup> getanswermap, final getCreatedOnDateMs<getShowPopup> getcreatedondatems2) {
            toMagicModuleMetaRepoModel.write(onDelegateCreatedListener, "");
            toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
            this.MediaMetadataCompat.setText(onDelegateCreatedListener.AudioAttributesCompatParcelizer().getRead());
            bytesRead.IconCompatParcelizer(this.IconCompatParcelizer, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.handleGooglePlayUnavailable
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return DeferredLifecycleHelper.AudioAttributesCompatParcelizer.read(getcreatedondatems);
                }
            });
            bytesRead.IconCompatParcelizer(this.write, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.wrap
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return DeferredLifecycleHelper.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getanswermap, onDelegateCreatedListener);
                }
            });
            bytesRead.IconCompatParcelizer(this.read, (getCreatedOnDateMs<getShowPopup>) new getCreatedOnDateMs() { // from class: o.getDelegate
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return DeferredLifecycleHelper.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getcreatedondatems2);
                }
            });
            bytesRead.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.MediaBrowserCompatSearchResultReceiver, this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer);
            Iterator<T> it = onDelegateCreatedListener.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer().iterator();
            while (it.hasNext()) {
                String iconCompatParcelizer = ((OnDelegateCreatedListener.read) it.next()).getIconCompatParcelizer();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) iconCompatParcelizer, (Object) getTrackTypeString.read.getRemoteActionCompatParcelizer())) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) iconCompatParcelizer, (Object) getTrackTypeString.IconCompatParcelizer.getRemoteActionCompatParcelizer())) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver);
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) iconCompatParcelizer, (Object) getTrackTypeString.write.getRemoteActionCompatParcelizer())) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaDescriptionCompat);
                }
            }
            String strRemoteActionCompatParcelizer = loadBitmap.RemoteActionCompatParcelizer(onDelegateCreatedListener.IconCompatParcelizer(), "dd MMM yyyy");
            int i = onDelegateCreatedListener.AudioAttributesImplBaseParcelizer() ? R.string.gifted_on : R.string.purchased_on;
            String string = this.itemView.getContext().getString(R.string.payment_id, onDelegateCreatedListener.RemoteActionCompatParcelizer());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            this.MediaBrowserCompatMediaItem.setText(string);
            String string2 = this.itemView.getContext().getString(i, strRemoteActionCompatParcelizer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            this.RatingCompat.setText(string2);
            if (!onDelegateCreatedListener.write().isEmpty()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatItemReceiver.setText((String) IntermediateLoginResponseBody.RatingCompat((List) onDelegateCreatedListener.write()));
                this.IconCompatParcelizer.setVisibility(!onDelegateCreatedListener.AudioAttributesImplApi26Parcelizer() ? 0 : 8);
            } else {
                bytesRead.read(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
            }
            this.write.setVisibility((onDelegateCreatedListener.AudioAttributesImplApi21Parcelizer() && (onDelegateCreatedListener.read().length() > 0)) ? 0 : 8);
            AudioAttributesCompatParcelizer(onDelegateCreatedListener.AudioAttributesImplApi21Parcelizer());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(getCreatedOnDateMs getcreatedondatems) {
            getcreatedondatems.invoke();
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, OnDelegateCreatedListener onDelegateCreatedListener) {
            getanswermap.invoke(onDelegateCreatedListener.read());
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
            getcreatedondatems.invoke();
            return getShowPopup.INSTANCE;
        }

        private final void AudioAttributesCompatParcelizer(boolean z) {
            Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            Float fValueOf2 = Float.valueOf(180.0f);
            Pair pair = z ? new Pair(fValueOf, fValueOf2) : new Pair(fValueOf2, fValueOf);
            onDraw.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, ((Number) pair.RemoteActionCompatParcelizer()).floatValue(), ((Number) pair.read()).floatValue(), 200L);
            this.AudioAttributesImplApi26Parcelizer.setVisibility(z ? 0 : 8);
            this.MediaBrowserCompatCustomActionResultReceiver.setVisibility(z ? 0 : 8);
        }
    }
}
