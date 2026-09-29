package kotlin;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.List;
import kotlin.getContextFeatureId;
import kotlin.isConnected;

/* JADX INFO: loaded from: classes3.dex */
@getRenewGrpId
public final class isConnected extends RecyclerView.IconCompatParcelizer<IconCompatParcelizer> {
    private final SignInButtonButtonSize AudioAttributesCompatParcelizer;
    private List<unregisterConnectionCallbacks> read;

    public isConnected(SignInButtonButtonSize signInButtonButtonSize) {
        toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
        this.AudioAttributesCompatParcelizer = signInButtonButtonSize;
        this.read = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AudioAttributesCompatParcelizer(viewGroup);
    }

    private static IconCompatParcelizer AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_home_test_card, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return new IconCompatParcelizer(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.read.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(IconCompatParcelizer iconCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        iconCompatParcelizer.read(this.read.get(i), this.AudioAttributesCompatParcelizer, false);
    }

    @getRenewGrpId
    public static class IconCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final LinearLayout AudioAttributesCompatParcelizer;
        private final TextView AudioAttributesImplApi21Parcelizer;
        private final TextView AudioAttributesImplApi26Parcelizer;
        private CountDownTimer AudioAttributesImplBaseParcelizer;
        private final ImageView IconCompatParcelizer;
        private final TextView MediaBrowserCompatCustomActionResultReceiver;
        private final LinearLayout MediaBrowserCompatItemReceiver;
        private final TextView MediaBrowserCompatMediaItem;
        private final TextView MediaBrowserCompatSearchResultReceiver;
        private final TextView MediaDescriptionCompat;
        private final TextView MediaMetadataCompat;
        private final TextView RatingCompat;
        private final LinearLayout RemoteActionCompatParcelizer;
        private final View handleMediaPlayPauseIfPendingOnHandler;
        private final TextView onCommand;
        private final ConstraintLayout read;
        private final ImageView write;

        public static final /* synthetic */ class read {
            public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
            public static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[getContextAttributionTag.values().length];
                try {
                    iArr[getContextAttributionTag.read.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getContextAttributionTag.AudioAttributesCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[getContextAttributionTag.IconCompatParcelizer.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[getContextAttributionTag.write.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                IconCompatParcelizer = iArr;
                int[] iArr2 = new int[reconnect.values().length];
                try {
                    iArr2[reconnect.write.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[reconnect.RemoteActionCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[reconnect.IconCompatParcelizer.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[reconnect.AudioAttributesCompatParcelizer.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[reconnect.read.ordinal()] = 5;
                } catch (NoSuchFieldError unused9) {
                }
                AudioAttributesCompatParcelizer = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.read = (ConstraintLayout) view.findViewById(R.id.clMain);
            this.RatingCompat = (TextView) view.findViewById(R.id.tvTestInitials);
            this.onCommand = (TextView) view.findViewById(R.id.tvTestTitle);
            this.MediaBrowserCompatMediaItem = (TextView) view.findViewById(R.id.tvTestSubTitle);
            this.MediaBrowserCompatSearchResultReceiver = (TextView) view.findViewById(R.id.tvTestExtra);
            this.MediaDescriptionCompat = (TextView) view.findViewById(R.id.tvTestInfo);
            this.MediaBrowserCompatCustomActionResultReceiver = (TextView) view.findViewById(R.id.tvComingSoon);
            this.MediaBrowserCompatItemReceiver = (LinearLayout) view.findViewById(R.id.llTestInfo);
            this.AudioAttributesCompatParcelizer = (LinearLayout) view.findViewById(R.id.llProCard);
            this.IconCompatParcelizer = (ImageView) view.findViewById(R.id.ivLock);
            this.AudioAttributesImplApi26Parcelizer = (TextView) view.findViewById(R.id.tvProTag);
            this.MediaMetadataCompat = (TextView) view.findViewById(R.id.tvResultsOut);
            this.RemoteActionCompatParcelizer = (LinearLayout) view.findViewById(R.id.llLiveIndicator);
            this.write = (ImageView) view.findViewById(R.id.ivTestStatus);
            this.handleMediaPlayPauseIfPendingOnHandler = view.findViewById(R.id.view);
            this.AudioAttributesImplApi21Parcelizer = (TextView) view.findViewById(R.id.tvLabel);
        }

        public final void read(final unregisterConnectionCallbacks unregisterconnectioncallbacks, final SignInButtonButtonSize signInButtonButtonSize, final boolean z) {
            String str;
            String string;
            toMagicModuleMetaRepoModel.write(unregisterconnectioncallbacks, "");
            toMagicModuleMetaRepoModel.write(signInButtonButtonSize, "");
            read();
            View view = this.handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            view.setVisibility(z ? 0 : 8);
            TextView textView = this.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            textView.setVisibility(z ? 0 : 8);
            this.read.setOnClickListener(new View.OnClickListener() { // from class: o.getServiceBrokerBinder
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    isConnected.IconCompatParcelizer.RemoteActionCompatParcelizer(signInButtonButtonSize, unregisterconnectioncallbacks, z);
                }
            });
            TextView textView2 = this.RatingCompat;
            int i = read.IconCompatParcelizer[unregisterconnectioncallbacks.getMediaBrowserCompatCustomActionResultReceiver().ordinal()];
            if (i == 1) {
                str = "";
            } else if (i == 2) {
                str = "G";
            } else if (i == 3) {
                str = "M";
            } else {
                if (i != 4) {
                    throw new RenewEligibleCreator();
                }
                str = "S";
            }
            textView2.setText(str);
            this.onCommand.setText(unregisterconnectioncallbacks.getWrite());
            this.MediaBrowserCompatMediaItem.setText(unregisterconnectioncallbacks.getRead());
            this.MediaBrowserCompatSearchResultReceiver.setText(unregisterconnectioncallbacks.getIconCompatParcelizer());
            TextView textView3 = this.MediaDescriptionCompat;
            int i2 = read.AudioAttributesCompatParcelizer[unregisterconnectioncallbacks.getAudioAttributesImplBaseParcelizer().ordinal()];
            if (i2 == 1) {
                string = "";
            } else if (i2 == 2) {
                string = this.itemView.getContext().getResources().getString(R.string.test_info_container_expired_warning);
                toMagicModuleMetaRepoModel.write((Object) string);
            } else if (i2 == 3) {
                string = this.itemView.getContext().getResources().getString(R.string.test_info_container_expired_paused_warning);
                toMagicModuleMetaRepoModel.write((Object) string);
            } else if (i2 == 4) {
                string = this.itemView.getContext().getResources().getString(R.string.test_info_container_live_warning, loadBitmap.RemoteActionCompatParcelizer(unregisterconnectioncallbacks.getHandleMediaPlayPauseIfPendingOnHandler(), "dd MMM'-'h:mm a"), loadBitmap.RemoteActionCompatParcelizer(unregisterconnectioncallbacks.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), "dd MMM'-'h:mm a"));
                toMagicModuleMetaRepoModel.write((Object) string);
            } else {
                if (i2 != 5) {
                    throw new RenewEligibleCreator();
                }
                string = this.itemView.getContext().getResources().getString(R.string.test_info_container_live_unattempted_warning, loadBitmap.RemoteActionCompatParcelizer(unregisterconnectioncallbacks.getHandleMediaPlayPauseIfPendingOnHandler(), "dd MMM'-'h:mm a"), loadBitmap.RemoteActionCompatParcelizer(unregisterconnectioncallbacks.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), "dd MMM'-'h:mm a"));
                toMagicModuleMetaRepoModel.write((Object) string);
            }
            textView3.setText(string);
            TextView textView4 = this.MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            textView4.setVisibility(unregisterconnectioncallbacks.getMediaBrowserCompatMediaItem() ? 0 : 8);
            ImageView imageView = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            imageView.setVisibility(unregisterconnectioncallbacks.getAudioAttributesImplApi26Parcelizer() ? 0 : 8);
            TextView textView5 = this.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
            textView5.setVisibility(unregisterconnectioncallbacks.getAudioAttributesImplApi21Parcelizer() ? 0 : 8);
            LinearLayout linearLayout = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            linearLayout.setVisibility((unregisterconnectioncallbacks.getAudioAttributesImplApi26Parcelizer() || unregisterconnectioncallbacks.getAudioAttributesImplApi21Parcelizer()) ? 0 : 8);
            TextView textView6 = this.MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView6, "");
            textView6.setVisibility(unregisterconnectioncallbacks.getMediaBrowserCompatItemReceiver() ? 0 : 8);
            ImageView imageView2 = this.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            imageView2.setVisibility(unregisterconnectioncallbacks.getRatingCompat() ? 0 : 8);
            LinearLayout linearLayout2 = this.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            linearLayout2.setVisibility(unregisterconnectioncallbacks.getMediaMetadataCompat() ? 0 : 8);
            LinearLayout linearLayout3 = this.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
            linearLayout3.setVisibility(unregisterconnectioncallbacks.getMediaBrowserCompatSearchResultReceiver() ? 0 : 8);
            if (unregisterconnectioncallbacks.getMediaBrowserCompatSearchResultReceiver() || unregisterconnectioncallbacks.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() < System.currentTimeMillis()) {
                if (unregisterconnectioncallbacks.getOnAddQueueItem() == 1) {
                    long onPlay = unregisterconnectioncallbacks.getOnPlay() - System.currentTimeMillis();
                    String string2 = this.itemView.getContext().getString(R.string.test_time_remaining);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    if (onPlay > 0) {
                        CountDownTimerC0113IconCompatParcelizer countDownTimerC0113IconCompatParcelizer = new CountDownTimerC0113IconCompatParcelizer(onPlay, string2, this);
                        this.AudioAttributesImplBaseParcelizer = countDownTimerC0113IconCompatParcelizer;
                        countDownTimerC0113IconCompatParcelizer.start();
                    } else {
                        read();
                        this.MediaBrowserCompatMediaItem.setText(this.itemView.getContext().getResources().getString(R.string.test_time_over));
                    }
                } else {
                    this.MediaBrowserCompatMediaItem.setText(unregisterconnectioncallbacks.getRead());
                }
            }
            TextView textView7 = this.MediaMetadataCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView7, "");
            textView7.setVisibility(unregisterconnectioncallbacks.getOnCustomAction() ? 0 : 8);
            ImageView imageView3 = this.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
            imageView3.setVisibility(unregisterconnectioncallbacks.getOnAddQueueItem() != 1 ? 8 : 0);
            if (unregisterconnectioncallbacks.getOnAddQueueItem() == 1) {
                LinearLayout linearLayout4 = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout4);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(SignInButtonButtonSize signInButtonButtonSize, unregisterConnectionCallbacks unregisterconnectioncallbacks, boolean z) {
            signInButtonButtonSize.RemoteActionCompatParcelizer(new getContextFeatureId.onRemoveQueueItemAt(unregisterconnectioncallbacks, z));
        }

        /* JADX INFO: renamed from: o.isConnected$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        public static final class CountDownTimerC0113IconCompatParcelizer extends CountDownTimer {
            private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;
            private /* synthetic */ String read;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            CountDownTimerC0113IconCompatParcelizer(long j, String str, IconCompatParcelizer iconCompatParcelizer) {
                super(j, 1000L);
                this.read = str;
                this.IconCompatParcelizer = iconCompatParcelizer;
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                String strWrite = loadBitmap.write(j);
                String str = this.read;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                sb.append(strWrite);
                this.IconCompatParcelizer.MediaBrowserCompatMediaItem.setText(sb.toString());
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                this.IconCompatParcelizer.MediaBrowserCompatMediaItem.setText(this.IconCompatParcelizer.itemView.getContext().getResources().getString(R.string.test_time_over));
            }
        }

        public final void write() {
            read();
        }

        private final void read() {
            CountDownTimer countDownTimer = this.AudioAttributesImplBaseParcelizer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.AudioAttributesImplBaseParcelizer = null;
        }
    }

    public final void write(List<unregisterConnectionCallbacks> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        iconCompatParcelizer.write();
        super.onViewRecycled(iconCompatParcelizer);
    }
}
