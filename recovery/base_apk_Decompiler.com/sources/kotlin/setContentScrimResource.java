package kotlin;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.setContentScrimResource;
import kotlin.setExpandedTitleTextSize;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u001a\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001f"}, d2 = {"Lo/setContentScrimResource;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "Lo/setCollapsedTitleTextSize;", "p0", "<init>", "(Lo/setCollapsedTitleTextSize;)V", "Landroid/view/ViewGroup;", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "", "Lo/setExpandedTitleTextSize;", "read", "(Ljava/util/List;)V", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "Lo/setCollapsedTitleTextSize;", "write", "IconCompatParcelizer", "Ljava/util/List;", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setContentScrimResource extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private List<? extends setExpandedTitleTextSize> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setCollapsedTitleTextSize write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[TileProvider.values().length];
            try {
                iArr[TileProvider.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TileProvider.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TileProvider.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TileProvider.RemoteActionCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TileProvider.IconCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    public setContentScrimResource(setCollapsedTitleTextSize setcollapsedtitletextsize) {
        toMagicModuleMetaRepoModel.write(setcollapsedtitletextsize, "");
        this.write = setcollapsedtitletextsize;
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.AudioAttributesCompatParcelizer = "";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(p0.getContext());
        if (p1 == 1 || p1 == 2 || p1 == 3) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.view_current_user_score_card_2, p0, false);
            toMagicModuleMetaRepoModel.write(viewInflate);
            return new AudioAttributesCompatParcelizer(this, viewInflate);
        }
        if (p1 == 4) {
            HlsMultivariantPlaylistRendition hlsMultivariantPlaylistRendition = HlsMultivariantPlaylistRendition.read(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMultivariantPlaylistRendition, "");
            return new RemoteActionCompatParcelizer(this, hlsMultivariantPlaylistRendition);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setExpandedTitleTextSize setexpandedtitletextsize = this.RemoteActionCompatParcelizer.get(p1);
        int itemViewType = p0.getItemViewType();
        if (itemViewType == 1 || itemViewType == 2 || itemViewType == 3) {
            toMagicModuleMetaRepoModel.read(setexpandedtitletextsize, "");
            ((AudioAttributesCompatParcelizer) p0).IconCompatParcelizer((setExpandedTitleTextSize.RemoteActionCompatParcelizer) setexpandedtitletextsize, p1);
        } else {
            if (itemViewType != 4) {
                return;
            }
            toMagicModuleMetaRepoModel.read(setexpandedtitletextsize, "");
            ((RemoteActionCompatParcelizer) p0).AudioAttributesCompatParcelizer((setExpandedTitleTextSize.IconCompatParcelizer) setexpandedtitletextsize);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int p0) {
        TileProvider audioAttributesImplApi21Parcelizer;
        setExpandedTitleTextSize setexpandedtitletextsize = this.RemoteActionCompatParcelizer.get(p0);
        if (setexpandedtitletextsize instanceof setExpandedTitleTextSize.RemoteActionCompatParcelizer) {
            setExpandedTitleTextSize setexpandedtitletextsize2 = this.RemoteActionCompatParcelizer.get(p0);
            toMagicModuleMetaRepoModel.read(setexpandedtitletextsize2, "");
            audioAttributesImplApi21Parcelizer = ((setExpandedTitleTextSize.RemoteActionCompatParcelizer) setexpandedtitletextsize2).getAudioAttributesImplApi26Parcelizer();
        } else {
            if (!(setexpandedtitletextsize instanceof setExpandedTitleTextSize.IconCompatParcelizer)) {
                throw new RenewEligibleCreator();
            }
            setExpandedTitleTextSize setexpandedtitletextsize3 = this.RemoteActionCompatParcelizer.get(p0);
            toMagicModuleMetaRepoModel.read(setexpandedtitletextsize3, "");
            audioAttributesImplApi21Parcelizer = ((setExpandedTitleTextSize.IconCompatParcelizer) setexpandedtitletextsize3).getAudioAttributesImplApi21Parcelizer();
        }
        int i = write.RemoteActionCompatParcelizer[audioAttributesImplApi21Parcelizer.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 5) {
            return 4;
        }
        throw new RenewEligibleCreator();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public final void read(List<? extends setExpandedTitleTextSize> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = p0;
        notifyDataSetChanged();
    }

    public final void AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = p0;
    }

    public final class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final HlsMultivariantPlaylistRendition AudioAttributesCompatParcelizer;
        private /* synthetic */ setContentScrimResource read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(setContentScrimResource setcontentscrimresource, HlsMultivariantPlaylistRendition hlsMultivariantPlaylistRendition) {
            super(hlsMultivariantPlaylistRendition.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(hlsMultivariantPlaylistRendition, "");
            this.read = setcontentscrimresource;
            this.AudioAttributesCompatParcelizer = hlsMultivariantPlaylistRendition;
        }

        public final void AudioAttributesCompatParcelizer(final setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            int mediaBrowserCompatItemReceiver = iconCompatParcelizer.getMediaBrowserCompatItemReceiver();
            int mediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
            int audioAttributesImplApi26Parcelizer = iconCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
            String mediaBrowserCompatSearchResultReceiver = iconCompatParcelizer.getMediaBrowserCompatSearchResultReceiver();
            int read = iconCompatParcelizer.getRead();
            double iconCompatParcelizer2 = iconCompatParcelizer.getIconCompatParcelizer();
            int i = mediaBrowserCompatItemReceiver + mediaBrowserCompatCustomActionResultReceiver + audioAttributesImplApi26Parcelizer;
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setEnabled(mediaBrowserCompatItemReceiver > 0);
            this.AudioAttributesCompatParcelizer.RatingCompat.setEnabled(mediaBrowserCompatCustomActionResultReceiver > 0);
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver.setEnabled(audioAttributesImplApi26Parcelizer > 0);
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem.setOnClickListener(new View.OnClickListener() { // from class: o.setContentScrimColor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setContentScrimResource.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.write, iconCompatParcelizer);
                }
            });
            this.AudioAttributesCompatParcelizer.RatingCompat.setOnClickListener(new View.OnClickListener() { // from class: o.setExpandedTitleColor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setContentScrimResource.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(this.read, iconCompatParcelizer);
                }
            });
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.setExpandedTitleGravity
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setContentScrimResource.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer, iconCompatParcelizer);
                }
            });
            this.AudioAttributesCompatParcelizer.write.setOnClickListener(new View.OnClickListener() { // from class: o.setContentScrim
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setContentScrimResource.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer, iconCompatParcelizer);
                }
            });
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.setText(String.valueOf(mediaBrowserCompatItemReceiver));
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer.setText(String.valueOf(mediaBrowserCompatCustomActionResultReceiver));
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.setText(String.valueOf(audioAttributesImplApi26Parcelizer));
            if (i > 0) {
                float f = i;
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.setProgress((int) ((mediaBrowserCompatItemReceiver / f) * 100.0f), true);
                this.AudioAttributesCompatParcelizer.MediaDescriptionCompat.setProgress((int) ((mediaBrowserCompatCustomActionResultReceiver / f) * 100.0f), true);
                this.AudioAttributesCompatParcelizer.read.setProgress((int) ((audioAttributesImplApi26Parcelizer / f) * 100.0f), true);
            }
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer.setText(mediaBrowserCompatSearchResultReceiver);
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver.setText(this.itemView.getContext().getString(R.string.f_test_performance_score_out_of, Integer.valueOf(read)));
            if (!iconCompatParcelizer.getWrite() && iconCompatParcelizer2 != 0.0d) {
                this.AudioAttributesCompatParcelizer.MediaMetadataCompat.setVisibility(0);
                this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer.setText(this.itemView.getContext().getString(R.string.f_test_result_percentile, Double.valueOf(iconCompatParcelizer2)));
            } else {
                this.AudioAttributesCompatParcelizer.MediaMetadataCompat.setVisibility(0);
                this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer.setText(this.itemView.getContext().getString(R.string.f_test_result_percentile_na));
            }
            if (iconCompatParcelizer.getRemoteActionCompatParcelizer()) {
                TextView textView = this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
            } else {
                TextView textView2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
            }
            if (iconCompatParcelizer.getAudioAttributesCompatParcelizer()) {
                this.AudioAttributesCompatParcelizer.write.setVisibility(0);
                if (iconCompatParcelizer.getRemoteActionCompatParcelizer()) {
                    this.AudioAttributesCompatParcelizer.write.setAlpha(1.0f);
                    this.AudioAttributesCompatParcelizer.write.setEnabled(true);
                    return;
                } else {
                    this.AudioAttributesCompatParcelizer.write.setAlpha(0.5f);
                    this.AudioAttributesCompatParcelizer.write.setEnabled(false);
                    return;
                }
            }
            TextView textView3 = this.AudioAttributesCompatParcelizer.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            remoteActionCompatParcelizer.IconCompatParcelizer(-4, iconCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesImplApi26Parcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            remoteActionCompatParcelizer.IconCompatParcelizer(-3, iconCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesImplBaseParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            remoteActionCompatParcelizer.IconCompatParcelizer(-5, iconCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            remoteActionCompatParcelizer.IconCompatParcelizer(5, iconCompatParcelizer);
        }

        private void IconCompatParcelizer(int i, setExpandedTitleTextSize.IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.read.write.write(i, iconCompatParcelizer);
        }
    }

    public final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final View AudioAttributesCompatParcelizer;
        private final TextView AudioAttributesImplApi21Parcelizer;
        private final TextView AudioAttributesImplApi26Parcelizer;
        private final View AudioAttributesImplBaseParcelizer;
        private final MaterialCardView IconCompatParcelizer;
        private final TextView MediaBrowserCompatCustomActionResultReceiver;
        private final TextView MediaBrowserCompatItemReceiver;
        private final TextView MediaBrowserCompatMediaItem;
        private final TextView MediaBrowserCompatSearchResultReceiver;
        private final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final TextView MediaDescriptionCompat;
        private final TextView MediaMetadataCompat;
        private final TextView RatingCompat;
        private final TextView RemoteActionCompatParcelizer;
        private final TextView handleMediaPlayPauseIfPendingOnHandler;
        private final TextView onAddQueueItem;
        private final View onCommand;
        private /* synthetic */ setContentScrimResource read;
        private final CircleImageView write;

        public static final /* synthetic */ class write {
            public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

            static {
                int[] iArr = new int[TileProvider.values().length];
                try {
                    iArr[TileProvider.write.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TileProvider.RemoteActionCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TileProvider.AudioAttributesCompatParcelizer.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                RemoteActionCompatParcelizer = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(setContentScrimResource setcontentscrimresource, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.read = setcontentscrimresource;
            View viewFindViewById = view.findViewById(R.id.tvTopperRank);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.MediaBrowserCompatSearchResultReceiver = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.ivTopperPic);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.write = (CircleImageView) viewFindViewById2;
            this.MediaDescriptionCompat = (TextView) view.findViewById(R.id.tvTopperName);
            this.AudioAttributesImplApi21Parcelizer = (TextView) view.findViewById(R.id.tvCorrect);
            this.onAddQueueItem = (TextView) view.findViewById(R.id.tvWrong);
            this.AudioAttributesImplApi26Parcelizer = (TextView) view.findViewById(R.id.tvSkipped);
            this.MediaMetadataCompat = (TextView) view.findViewById(R.id.tvTopperCorrectCount);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (TextView) view.findViewById(R.id.tvTopperWrongCount);
            this.handleMediaPlayPauseIfPendingOnHandler = (TextView) view.findViewById(R.id.tvTopperSkippedCount);
            this.MediaBrowserCompatMediaItem = (TextView) view.findViewById(R.id.tvTopperScore);
            View viewFindViewById3 = view.findViewById(R.id.vTopperStatsContainer);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            this.onCommand = viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.stats_divider);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            this.AudioAttributesCompatParcelizer = viewFindViewById4;
            this.MediaBrowserCompatCustomActionResultReceiver = (TextView) view.findViewById(R.id.tvCorrectCountDropDown);
            View viewFindViewById5 = view.findViewById(R.id.scoreCard);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            this.IconCompatParcelizer = (MaterialCardView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.tvTopRankersHeader);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById6, "");
            this.AudioAttributesImplBaseParcelizer = viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.tvStateName);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById7, "");
            this.MediaBrowserCompatItemReceiver = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.tvTopperRankSuperScript);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById8, "");
            this.RatingCompat = (TextView) viewFindViewById8;
            this.RemoteActionCompatParcelizer = (TextView) view.findViewById(R.id.tvAnonymousInfoText);
        }

        public final void IconCompatParcelizer(final setExpandedTitleTextSize.RemoteActionCompatParcelizer remoteActionCompatParcelizer, final int i) {
            String strWrite;
            TextView textView;
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            if (i == 0) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplBaseParcelizer);
                String str = this.read.AudioAttributesCompatParcelizer;
                if (str != null && str.length() != 0) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatItemReceiver);
                    this.MediaBrowserCompatItemReceiver.setText(this.read.AudioAttributesCompatParcelizer);
                } else {
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatItemReceiver);
                }
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplBaseParcelizer);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatItemReceiver);
            }
            if (TextUtils.isEmpty(remoteActionCompatParcelizer.getRead())) {
                this.write.setImageResource(R.drawable.ic_topper_blank);
            } else {
                this.write.post(new Runnable() { // from class: o.setExpandedTitleMarginTop
                    @Override // java.lang.Runnable
                    public final void run() {
                        setContentScrimResource.AudioAttributesCompatParcelizer.write(this.write, remoteActionCompatParcelizer);
                    }
                });
            }
            if (remoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() == -2) {
                this.MediaBrowserCompatSearchResultReceiver.setText(this.itemView.getContext().getString(R.string.text_rank_list_unavailable));
                this.RatingCompat.setVisibility(8);
            } else {
                this.MediaBrowserCompatSearchResultReceiver.setText(String.valueOf(remoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()));
                this.RatingCompat.setVisibility(0);
            }
            this.RatingCompat.setText(CmcdHeadersFactoryCmcdRequest.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()));
            TextView textView2 = this.MediaDescriptionCompat;
            if (remoteActionCompatParcelizer.getRatingCompat()) {
                strWrite = CmcdHeadersFactoryCmcdRequest.write(this.itemView.getContext().getString(R.string.you));
            } else if (TestGroupLSModel.IconCompatParcelizer((CharSequence) remoteActionCompatParcelizer.getRemoteActionCompatParcelizer())) {
                strWrite = CmcdHeadersFactoryCmcdRequest.write(this.itemView.getContext().getString(R.string.sample_name));
            } else {
                strWrite = CmcdHeadersFactoryCmcdRequest.write(remoteActionCompatParcelizer.getRemoteActionCompatParcelizer());
            }
            textView2.setText(strWrite);
            this.MediaBrowserCompatMediaItem.setText(remoteActionCompatParcelizer.getMediaBrowserCompatSearchResultReceiver());
            if (remoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer() && remoteActionCompatParcelizer.getIconCompatParcelizer()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onCommand);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
                this.MediaMetadataCompat.setText(String.valueOf(remoteActionCompatParcelizer.getAudioAttributesImplApi21Parcelizer()));
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(String.valueOf(remoteActionCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()));
                this.handleMediaPlayPauseIfPendingOnHandler.setText(String.valueOf(remoteActionCompatParcelizer.getMediaBrowserCompatMediaItem()));
                TextView textView3 = this.MediaBrowserCompatCustomActionResultReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView3);
            } else if (remoteActionCompatParcelizer.getAudioAttributesImplBaseParcelizer()) {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
                TextView textView4 = this.MediaBrowserCompatCustomActionResultReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(textView4);
                TextView textView5 = this.MediaBrowserCompatCustomActionResultReceiver;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format("%d correct", Arrays.copyOf(new Object[]{Integer.valueOf(remoteActionCompatParcelizer.getAudioAttributesImplApi21Parcelizer())}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                textView5.setText(str2);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
                TextView textView6 = this.MediaBrowserCompatCustomActionResultReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView6, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView6);
            }
            TextView textView7 = this.MediaBrowserCompatCustomActionResultReceiver;
            final setContentScrimResource setcontentscrimresource = this.read;
            textView7.setOnClickListener(new View.OnClickListener() { // from class: o.setExpandedTitleMarginEnd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setContentScrimResource.AudioAttributesCompatParcelizer.IconCompatParcelizer(remoteActionCompatParcelizer, setcontentscrimresource, i);
                }
            });
            int i2 = write.RemoteActionCompatParcelizer[remoteActionCompatParcelizer.getAudioAttributesImplApi26Parcelizer().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.MediaDescriptionCompat.getPaint().setMaskFilter(null);
                    RemoteActionCompatParcelizer();
                    return;
                }
                float textSize = this.MediaDescriptionCompat.getTextSize() / 2.0f;
                this.MediaDescriptionCompat.setLayerType(1, null);
                this.MediaDescriptionCompat.getPaint().setMaskFilter(new BlurMaskFilter(textSize, BlurMaskFilter.Blur.NORMAL));
                RemoteActionCompatParcelizer();
                return;
            }
            this.MediaDescriptionCompat.getPaint().setMaskFilter(null);
            if (remoteActionCompatParcelizer.getMediaBrowserCompatItemReceiver() && (textView = this.RemoteActionCompatParcelizer) != null) {
                bytesRead.AudioAttributesImplApi21Parcelizer(textView);
            }
            MaterialCardView materialCardView = this.IconCompatParcelizer;
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            materialCardView.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurfaceVariant19, new TypedValue(), true));
            this.IconCompatParcelizer.setStrokeWidth(setObjectType.read(1));
            MaterialCardView materialCardView2 = this.IconCompatParcelizer;
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context context2 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
            materialCardView2.setStrokeColor(shouldEscapeCharacter.Companion.read(context2, R.attr.onSurfaceBgOutline4, new TypedValue(), true));
            TextView textView8 = this.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
            Context context3 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
            textView8.setTextColor(shouldEscapeCharacter.Companion.read(context3, R.attr.onBackgroundSurface7, new TypedValue(), true));
            TextView textView9 = this.MediaDescriptionCompat;
            shouldEscapeCharacter.Companion companion4 = shouldEscapeCharacter.INSTANCE;
            Context context4 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context4, "");
            textView9.setTextColor(shouldEscapeCharacter.Companion.read(context4, R.attr.onBackgroundSurface7, new TypedValue(), true));
            TextView textView10 = this.RatingCompat;
            shouldEscapeCharacter.Companion companion5 = shouldEscapeCharacter.INSTANCE;
            Context context5 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context5, "");
            textView10.setTextColor(shouldEscapeCharacter.Companion.read(context5, R.attr.onBackgroundSurface7, new TypedValue(), true));
            TextView textView11 = this.AudioAttributesImplApi21Parcelizer;
            shouldEscapeCharacter.Companion companion6 = shouldEscapeCharacter.INSTANCE;
            Context context6 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context6, "");
            textView11.setTextColor(shouldEscapeCharacter.Companion.read(context6, R.attr.onBackgroundSurface7, new TypedValue(), true));
            TextView textView12 = this.onAddQueueItem;
            shouldEscapeCharacter.Companion companion7 = shouldEscapeCharacter.INSTANCE;
            Context context7 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context7, "");
            textView12.setTextColor(shouldEscapeCharacter.Companion.read(context7, R.attr.onBackgroundSurface7, new TypedValue(), true));
            TextView textView13 = this.AudioAttributesImplApi26Parcelizer;
            shouldEscapeCharacter.Companion companion8 = shouldEscapeCharacter.INSTANCE;
            Context context8 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context8, "");
            textView13.setTextColor(shouldEscapeCharacter.Companion.read(context8, R.attr.onBackgroundSurface7, new TypedValue(), true));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, setExpandedTitleTextSize.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            buildDownloadCompletedNotification.write(audioAttributesCompatParcelizer.write, remoteActionCompatParcelizer.getRead());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(setExpandedTitleTextSize.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setContentScrimResource setcontentscrimresource, int i) {
            remoteActionCompatParcelizer.RatingCompat();
            setcontentscrimresource.notifyItemChanged(i);
        }

        private void RemoteActionCompatParcelizer() {
            MaterialCardView materialCardView = this.IconCompatParcelizer;
            shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
            Context context = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            materialCardView.setCardBackgroundColor(shouldEscapeCharacter.Companion.read(context, R.attr.colorSurface, new TypedValue(), true));
            this.IconCompatParcelizer.setStrokeWidth(setObjectType.read(0));
            TextView textView = this.MediaBrowserCompatSearchResultReceiver;
            shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
            Context context2 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
            textView.setTextColor(shouldEscapeCharacter.Companion.read(context2, R.attr.colorOnSurface, new TypedValue(), true));
            TextView textView2 = this.MediaDescriptionCompat;
            shouldEscapeCharacter.Companion companion3 = shouldEscapeCharacter.INSTANCE;
            Context context3 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
            textView2.setTextColor(shouldEscapeCharacter.Companion.read(context3, R.attr.colorOnSurface, new TypedValue(), true));
            TextView textView3 = this.RatingCompat;
            shouldEscapeCharacter.Companion companion4 = shouldEscapeCharacter.INSTANCE;
            Context context4 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context4, "");
            textView3.setTextColor(shouldEscapeCharacter.Companion.read(context4, R.attr.colorOnSurface, new TypedValue(), true));
            TextView textView4 = this.AudioAttributesImplApi21Parcelizer;
            shouldEscapeCharacter.Companion companion5 = shouldEscapeCharacter.INSTANCE;
            Context context5 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context5, "");
            textView4.setTextColor(shouldEscapeCharacter.Companion.read(context5, R.attr.colorOnSurface, new TypedValue(), true));
            TextView textView5 = this.onAddQueueItem;
            shouldEscapeCharacter.Companion companion6 = shouldEscapeCharacter.INSTANCE;
            Context context6 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context6, "");
            textView5.setTextColor(shouldEscapeCharacter.Companion.read(context6, R.attr.colorOnSurface, new TypedValue(), true));
            TextView textView6 = this.AudioAttributesImplApi26Parcelizer;
            shouldEscapeCharacter.Companion companion7 = shouldEscapeCharacter.INSTANCE;
            Context context7 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context7, "");
            textView6.setTextColor(shouldEscapeCharacter.Companion.read(context7, R.attr.colorOnSurface, new TypedValue(), true));
        }
    }
}
