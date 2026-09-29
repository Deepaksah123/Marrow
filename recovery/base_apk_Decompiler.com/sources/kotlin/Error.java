package kotlin;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow2.ui.qbank.lesson_list.model.SealedLessonDetailsModel;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Error;

/* JADX INFO: loaded from: classes4.dex */
public final class Error extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> implements getProtocolVersion {
    private boolean AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer IconCompatParcelizer;
    private List<? extends SealedLessonDetailsModel> RemoteActionCompatParcelizer;
    private int read;
    private boolean write;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer(SealedLessonDetailsModel.Lesson lesson);
    }

    public Error(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.RemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.read = 1;
    }

    public final IconCompatParcelizer read() {
        return this.IconCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int i) {
        return this.RemoteActionCompatParcelizer.get(i) instanceof SealedLessonDetailsModel.Lesson ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_qbank_lesson_card, viewGroup, false);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
            return new AudioAttributesCompatParcelizer(this, viewInflate);
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.item_qbank_header_card, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate2, "");
        return new read(this, viewInflate2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
        toMagicModuleMetaRepoModel.write(onmediabuttonevent, "");
        if (getItemViewType(i) == 2) {
            SealedLessonDetailsModel sealedLessonDetailsModel = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(sealedLessonDetailsModel, "");
            ((AudioAttributesCompatParcelizer) onmediabuttonevent).AudioAttributesCompatParcelizer((SealedLessonDetailsModel.Lesson) sealedLessonDetailsModel, i);
        } else {
            SealedLessonDetailsModel sealedLessonDetailsModel2 = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(sealedLessonDetailsModel2, "");
            ((read) onmediabuttonevent).read((SealedLessonDetailsModel.AudioAttributesCompatParcelizer) sealedLessonDetailsModel2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.RemoteActionCompatParcelizer.size();
    }

    public class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final MaterialCardView AudioAttributesCompatParcelizer;
        private final ImageView AudioAttributesImplApi21Parcelizer;
        private final LinearLayout AudioAttributesImplApi26Parcelizer;
        private final LinearLayout AudioAttributesImplBaseParcelizer;
        private final Group IconCompatParcelizer;
        private final PieChart MediaBrowserCompatCustomActionResultReceiver;
        private final ImageView MediaBrowserCompatItemReceiver;
        private /* synthetic */ Error MediaBrowserCompatMediaItem;
        private final TextView MediaBrowserCompatSearchResultReceiver;
        private final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final TextView MediaDescriptionCompat;
        private final TextView MediaMetadataCompat;
        private final TextView RatingCompat;
        private final ImageView RemoteActionCompatParcelizer;
        private final TextView handleMediaPlayPauseIfPendingOnHandler;
        private final TextView onAddQueueItem;
        private final TextView onCommand;
        private final TextView onCustomAction;
        private final TextView onPlayFromMediaId;
        private final ConstraintLayout read;
        private final ImageView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(Error error, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.MediaBrowserCompatMediaItem = error;
            this.MediaDescriptionCompat = (TextView) view.findViewById(R.id.tvLessonPosition);
            this.read = (ConstraintLayout) view.findViewById(R.id.clLessonStats);
            this.AudioAttributesCompatParcelizer = (MaterialCardView) view.findViewById(R.id.cvMain);
            this.RemoteActionCompatParcelizer = (ImageView) view.findViewById(R.id.ivLesson);
            this.handleMediaPlayPauseIfPendingOnHandler = (TextView) view.findViewById(R.id.tvLessonTitle);
            this.AudioAttributesImplBaseParcelizer = (LinearLayout) view.findViewById(R.id.llProCard);
            this.MediaBrowserCompatItemReceiver = (ImageView) view.findViewById(R.id.ivProLock);
            this.RatingCompat = (TextView) view.findViewById(R.id.tvComingSoon);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (TextView) view.findViewById(R.id.tvMcqAdded);
            this.onAddQueueItem = (TextView) view.findViewById(R.id.tvMcqUpdated);
            this.AudioAttributesImplApi26Parcelizer = (LinearLayout) view.findViewById(R.id.llContinue);
            this.onCustomAction = (TextView) view.findViewById(R.id.tvOptionalLabel);
            this.onPlayFromMediaId = (TextView) view.findViewById(R.id.tvRating);
            this.AudioAttributesImplApi21Parcelizer = (ImageView) view.findViewById(R.id.ivRating);
            this.onCommand = (TextView) view.findViewById(R.id.tvMcqCount);
            this.MediaMetadataCompat = (TextView) view.findViewById(R.id.tvLessonScore);
            this.MediaBrowserCompatCustomActionResultReceiver = (PieChart) view.findViewById(R.id.pieChart);
            this.MediaBrowserCompatSearchResultReceiver = (TextView) view.findViewById(R.id.tvCompletedOn);
            this.write = (ImageView) view.findViewById(R.id.ivLessonComplete);
            this.IconCompatParcelizer = (Group) view.findViewById(R.id.groupPie);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(Error error, SealedLessonDetailsModel.Lesson lesson) {
            error.read().IconCompatParcelizer(lesson);
        }

        public final void AudioAttributesCompatParcelizer(final SealedLessonDetailsModel.Lesson lesson, int i) {
            String string;
            toMagicModuleMetaRepoModel.write(lesson, "");
            MaterialCardView materialCardView = this.AudioAttributesCompatParcelizer;
            final Error error = this.MediaBrowserCompatMediaItem;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: o.ErrorResponseData
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Error.AudioAttributesCompatParcelizer.write(error, lesson);
                }
            });
            setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this.itemView.getContext()).RemoteActionCompatParcelizer(lesson.getMediaMetadataCompat()).MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).IconCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            this.handleMediaPlayPauseIfPendingOnHandler.setText(lesson.getRatingCompat());
            if (lesson.getMediaBrowserCompatMediaItem() && this.MediaBrowserCompatMediaItem.write) {
                this.AudioAttributesImplBaseParcelizer.setVisibility(0);
                this.MediaBrowserCompatItemReceiver.setVisibility(8);
            } else if (lesson.getMediaBrowserCompatMediaItem()) {
                this.AudioAttributesImplBaseParcelizer.setVisibility(0);
                this.MediaBrowserCompatItemReceiver.setVisibility(0);
            } else {
                this.AudioAttributesImplBaseParcelizer.setVisibility(8);
            }
            if (lesson.getMediaDescriptionCompat()) {
                this.RatingCompat.setVisibility(0);
                this.read.setVisibility(8);
            } else {
                this.RatingCompat.setVisibility(8);
                this.read.setVisibility(0);
            }
            if (lesson.getAudioAttributesImplApi21Parcelizer() > 0) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(0);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setText(String.valueOf(lesson.getAudioAttributesImplApi21Parcelizer()));
            } else {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(8);
            }
            if (lesson.getMediaBrowserCompatCustomActionResultReceiver() != 1) {
                boolean z = lesson.getMediaBrowserCompatCustomActionResultReceiver() == 2 && lesson.getAudioAttributesImplApi26Parcelizer() != 0;
                if (lesson.getAudioAttributesImplApi21Parcelizer() > 0 && z) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(0);
                    TextView textView = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                    String str = String.format("%d New", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getAudioAttributesImplApi21Parcelizer())}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                    textView.setText(str);
                    this.onAddQueueItem.setVisibility(0);
                    TextView textView2 = this.onAddQueueItem;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                    String str2 = String.format("%d Revised", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getAudioAttributesImplApi26Parcelizer())}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                    textView2.setText(str2);
                } else if (lesson.getAudioAttributesImplApi21Parcelizer() > 0) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(0);
                    TextView textView3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
                    String str3 = String.format("%d New", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getAudioAttributesImplApi21Parcelizer())}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                    textView3.setText(str3);
                    this.onAddQueueItem.setVisibility(8);
                } else if (z) {
                    this.onAddQueueItem.setVisibility(0);
                    TextView textView4 = this.onAddQueueItem;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
                    String str4 = String.format("%d Revised", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getAudioAttributesImplApi26Parcelizer())}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
                    textView4.setText(str4);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(8);
                } else {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(8);
                    this.onAddQueueItem.setVisibility(8);
                }
            }
            int mediaBrowserCompatCustomActionResultReceiver = lesson.getMediaBrowserCompatCustomActionResultReceiver();
            if (mediaBrowserCompatCustomActionResultReceiver == 1) {
                this.write.setVisibility(8);
                this.AudioAttributesImplApi26Parcelizer.setVisibility(0);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(8);
                this.onAddQueueItem.setVisibility(8);
            } else if (mediaBrowserCompatCustomActionResultReceiver == 2) {
                this.write.setVisibility(0);
                this.AudioAttributesImplApi26Parcelizer.setVisibility(8);
            } else {
                this.write.setVisibility(8);
                this.AudioAttributesImplApi26Parcelizer.setVisibility(8);
            }
            if (this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer && lesson.getAudioAttributesImplBaseParcelizer()) {
                this.onCustomAction.setVisibility(0);
                this.onAddQueueItem.setVisibility(8);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.setVisibility(8);
            } else {
                this.onCustomAction.setVisibility(8);
            }
            if (lesson.getMediaBrowserCompatSearchResultReceiver() > BitmapDescriptorFactory.HUE_RED) {
                this.AudioAttributesImplApi21Parcelizer.setColorFilter(_isNaN.getColor(this.itemView.getContext(), R.color.yellow), PorterDuff.Mode.SRC_IN);
            } else {
                this.AudioAttributesImplApi21Parcelizer.setColorFilter(_isNaN.getColor(this.itemView.getContext(), R.color.n_15), PorterDuff.Mode.SRC_IN);
            }
            TextView textView5 = this.onPlayFromMediaId;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
            String str5 = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(lesson.getMediaBrowserCompatSearchResultReceiver())}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
            textView5.setText(str5);
            if (lesson.getMediaBrowserCompatCustomActionResultReceiver() == 1 && lesson.getOnPlayFromMediaId() > 0) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel6 = toMagicModuleStatusUcModel.INSTANCE;
                string = String.format(Locale.getDefault(), "%d/%d Completed", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getOnPlayFromMediaId()), Integer.valueOf(lesson.getHandleMediaPlayPauseIfPendingOnHandler())}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            } else {
                int handleMediaPlayPauseIfPendingOnHandler = lesson.getHandleMediaPlayPauseIfPendingOnHandler();
                StringBuilder sb = new StringBuilder();
                sb.append(handleMediaPlayPauseIfPendingOnHandler);
                sb.append(" MCQs");
                string = sb.toString();
            }
            this.onCommand.setText(string);
            if (lesson.getMediaBrowserCompatCustomActionResultReceiver() == 2 && lesson.getOnPause()) {
                this.IconCompatParcelizer.setVisibility(0);
                PieChart pieChart = this.MediaBrowserCompatCustomActionResultReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pieChart, "");
                dispatchTouchEvent.IconCompatParcelizer(pieChart, lesson.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                TextView textView6 = this.MediaMetadataCompat;
                String str6 = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(getOnline.RemoteActionCompatParcelizer(lesson.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()))}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
                textView6.setText(str6);
                this.MediaBrowserCompatSearchResultReceiver.setVisibility(0);
                this.MediaBrowserCompatSearchResultReceiver.setText(this.itemView.getContext().getString(R.string.completed_on, new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(lesson.getOnCustomAction()))));
            } else {
                this.MediaBrowserCompatSearchResultReceiver.setVisibility(8);
                this.IconCompatParcelizer.setVisibility(8);
            }
            if (this.MediaBrowserCompatMediaItem.read == 1) {
                this.MediaDescriptionCompat.setText(String.valueOf(lesson.getAudioAttributesCompatParcelizer() + 1));
            } else {
                this.MediaDescriptionCompat.setText(String.valueOf(i));
            }
        }
    }

    public class read extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ Error AudioAttributesCompatParcelizer;
        private final TextView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Error error, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesCompatParcelizer = error;
            this.write = (TextView) view.findViewById(R.id.tvSubjectTitle);
        }

        public final void read(SealedLessonDetailsModel.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            this.write.setText(audioAttributesCompatParcelizer.getRead());
        }
    }

    public final void RemoteActionCompatParcelizer(List<? extends SealedLessonDetailsModel> list, int i) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
        this.read = i;
        notifyDataSetChanged();
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.write = z;
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
        if (getItemViewType(i) == 1) {
            return R.layout.item_qbank_header_card;
        }
        return -1;
    }

    @Override // kotlin.getProtocolVersion
    public final void write(View view, int i) {
        TextView textView;
        String read2;
        if (view == null || (textView = (TextView) view.findViewById(R.id.tvSubjectTitle)) == null) {
            return;
        }
        if (this.RemoteActionCompatParcelizer.get(i) instanceof SealedLessonDetailsModel.AudioAttributesCompatParcelizer) {
            SealedLessonDetailsModel sealedLessonDetailsModel = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(sealedLessonDetailsModel, "");
            read2 = ((SealedLessonDetailsModel.AudioAttributesCompatParcelizer) sealedLessonDetailsModel).getRead();
        }
        textView.setText(read2);
    }

    @Override // kotlin.getProtocolVersion
    public final boolean RemoteActionCompatParcelizer(int i) {
        return this.RemoteActionCompatParcelizer.get(i) instanceof SealedLessonDetailsModel.AudioAttributesCompatParcelizer;
    }

    public final String read(int i) {
        if (this.RemoteActionCompatParcelizer.get(i) instanceof SealedLessonDetailsModel.AudioAttributesCompatParcelizer) {
            SealedLessonDetailsModel sealedLessonDetailsModel = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(sealedLessonDetailsModel, "");
            return PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(((SealedLessonDetailsModel.AudioAttributesCompatParcelizer) sealedLessonDetailsModel).getWrite());
        }
        if (this.RemoteActionCompatParcelizer.get(i) instanceof SealedLessonDetailsModel.Lesson) {
            SealedLessonDetailsModel sealedLessonDetailsModel2 = this.RemoteActionCompatParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(sealedLessonDetailsModel2, "");
            return PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(((SealedLessonDetailsModel.Lesson) sealedLessonDetailsModel2).getIconCompatParcelizer());
        }
        return IconCompatParcelizer();
    }

    private final String IconCompatParcelizer() {
        if (!(IntermediateLoginResponseBody.RatingCompat((List) this.RemoteActionCompatParcelizer) instanceof SealedLessonDetailsModel.AudioAttributesCompatParcelizer)) {
            return "";
        }
        Object objRatingCompat = IntermediateLoginResponseBody.RatingCompat((List<? extends Object>) this.RemoteActionCompatParcelizer);
        toMagicModuleMetaRepoModel.read(objRatingCompat, "");
        return PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(((SealedLessonDetailsModel.AudioAttributesCompatParcelizer) objRatingCompat).getWrite());
    }

    public final int read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int size = this.RemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (this.RemoteActionCompatParcelizer.get(i) instanceof SealedLessonDetailsModel.AudioAttributesCompatParcelizer) {
                SealedLessonDetailsModel sealedLessonDetailsModel = this.RemoteActionCompatParcelizer.get(i);
                toMagicModuleMetaRepoModel.read(sealedLessonDetailsModel, "");
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((SealedLessonDetailsModel.AudioAttributesCompatParcelizer) sealedLessonDetailsModel).getWrite())) {
                    return i;
                }
            }
        }
        return 0;
    }
}
