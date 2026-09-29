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
import com.marrow2.ui.video.lesson_list.adapter.ClickedLessonDetails;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.bj;

/* JADX INFO: loaded from: classes4.dex */
public final class bj extends RecyclerView.IconCompatParcelizer<RemoteActionCompatParcelizer> {
    private ArrayList<SealedLessonDetailsModel.Lesson> AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private boolean read;
    private final write write;

    public interface write {
        void read(ClickedLessonDetails clickedLessonDetails);
    }

    public final class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private static /* synthetic */ isResolutionNotSupported<Object>[] write = {toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(RemoteActionCompatParcelizer.class, "binding", "getBinding()Lcom/marrow/databinding/ItemQbankLessonCardBinding;", 0))};
        private final MaterialCardView AudioAttributesCompatParcelizer;
        private final ImageView AudioAttributesImplApi21Parcelizer;
        private final ImageView AudioAttributesImplApi26Parcelizer;
        private final ImageView AudioAttributesImplBaseParcelizer;
        private final Group IconCompatParcelizer;
        private final LinearLayout MediaBrowserCompatCustomActionResultReceiver;
        private final ImageView MediaBrowserCompatItemReceiver;
        private /* synthetic */ bj MediaBrowserCompatMediaItem;
        private final LinearLayout MediaBrowserCompatSearchResultReceiver;
        private final TextView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final PieChart MediaDescriptionCompat;
        private final TextView MediaMetadataCompat;
        private final TextView RatingCompat;
        private final setSessionInfo RemoteActionCompatParcelizer;
        private final TextView handleMediaPlayPauseIfPendingOnHandler;
        private final TextView onAddQueueItem;
        private final TextView onCommand;
        private final TextView onCustomAction;
        private final TextView onFastForward;
        private final View onMediaButtonEvent;
        private final TextView onPlay;
        private final TextView onPlayFromMediaId;
        private final ConstraintLayout read;

        public static final class IconCompatParcelizer implements getAnswerMap<RemoteActionCompatParcelizer, HlsMediaSourceMetadataType> {
            /* JADX WARN: Type inference failed for: r0v1, types: [o.HlsMediaSourceMetadataType, o.getApplicationLabel] */
            @Override // kotlin.getAnswerMap
            public final /* synthetic */ HlsMediaSourceMetadataType invoke(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                return RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
            }

            private static HlsMediaSourceMetadataType RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
                return HlsMediaSourceMetadataType.read(remoteActionCompatParcelizer.itemView);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(bj bjVar, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.MediaBrowserCompatMediaItem = bjVar;
            this.RemoteActionCompatParcelizer = new setOrigin(new IconCompatParcelizer());
            TextView textView = RemoteActionCompatParcelizer().MediaDescriptionCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = textView;
            View view2 = RemoteActionCompatParcelizer().onFastForward;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
            this.onMediaButtonEvent = view2;
            ConstraintLayout constraintLayout = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            this.read = constraintLayout;
            MaterialCardView materialCardView = RemoteActionCompatParcelizer().IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
            this.AudioAttributesCompatParcelizer = materialCardView;
            ImageView imageView = RemoteActionCompatParcelizer().read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            this.MediaBrowserCompatItemReceiver = imageView;
            TextView textView2 = RemoteActionCompatParcelizer().MediaMetadataCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            this.onAddQueueItem = textView2;
            LinearLayout linearLayout = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            this.MediaBrowserCompatSearchResultReceiver = linearLayout;
            ImageView imageView2 = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
            this.AudioAttributesImplBaseParcelizer = imageView2;
            TextView textView3 = RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            this.MediaMetadataCompat = textView3;
            TextView textView4 = RemoteActionCompatParcelizer().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
            this.onCommand = textView4;
            TextView textView5 = RemoteActionCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
            this.onPlayFromMediaId = textView5;
            LinearLayout linearLayout2 = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            this.MediaBrowserCompatCustomActionResultReceiver = linearLayout2;
            TextView textView6 = RemoteActionCompatParcelizer().onAddQueueItem;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView6, "");
            this.onPlay = textView6;
            TextView textView7 = RemoteActionCompatParcelizer().onCommand;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView7, "");
            this.onFastForward = textView7;
            ImageView imageView3 = RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
            this.AudioAttributesImplApi26Parcelizer = imageView3;
            TextView textView8 = RemoteActionCompatParcelizer().onCustomAction;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView8, "");
            this.handleMediaPlayPauseIfPendingOnHandler = textView8;
            TextView textView9 = RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView9, "");
            this.onCustomAction = textView9;
            PieChart pieChart = RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(pieChart, "");
            this.MediaDescriptionCompat = pieChart;
            TextView textView10 = RemoteActionCompatParcelizer().RatingCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView10, "");
            this.RatingCompat = textView10;
            ImageView imageView4 = RemoteActionCompatParcelizer().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
            this.AudioAttributesImplApi21Parcelizer = imageView4;
            Group group = RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(group, "");
            this.IconCompatParcelizer = group;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private HlsMediaSourceMetadataType RemoteActionCompatParcelizer() {
            return (HlsMediaSourceMetadataType) this.RemoteActionCompatParcelizer.read(this, write[0]);
        }

        public final void RemoteActionCompatParcelizer(final SealedLessonDetailsModel.Lesson lesson) {
            toMagicModuleMetaRepoModel.write(lesson, "");
            boolean z = false;
            bytesRead.RemoteActionCompatParcelizer((List<? extends View>) IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new View[]{this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onMediaButtonEvent}));
            MaterialCardView materialCardView = this.AudioAttributesCompatParcelizer;
            final bj bjVar = this.MediaBrowserCompatMediaItem;
            materialCardView.setOnClickListener(new View.OnClickListener() { // from class: o.bi
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bj.RemoteActionCompatParcelizer.write(bjVar, lesson);
                }
            });
            setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this.itemView.getContext()).RemoteActionCompatParcelizer(lesson.getMediaMetadataCompat()).MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).IconCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            this.onAddQueueItem.setText(lesson.getRatingCompat());
            if (lesson.getMediaBrowserCompatMediaItem() && this.MediaBrowserCompatMediaItem.IconCompatParcelizer) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplBaseParcelizer);
            } else if (lesson.getMediaBrowserCompatMediaItem()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplBaseParcelizer);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatSearchResultReceiver);
            }
            if (lesson.getMediaDescriptionCompat()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaMetadataCompat);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.read);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaMetadataCompat);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.read);
            }
            if (lesson.getAudioAttributesImplApi21Parcelizer() > 0) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onCommand);
                this.onCommand.setText(String.valueOf(lesson.getAudioAttributesImplApi21Parcelizer()));
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
            }
            if (lesson.getMediaBrowserCompatCustomActionResultReceiver() != 1) {
                if (lesson.getMediaBrowserCompatCustomActionResultReceiver() == 2 && lesson.getAudioAttributesImplApi26Parcelizer() != 0) {
                    z = true;
                }
                if (lesson.getAudioAttributesImplApi21Parcelizer() > 0 && z) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.onCommand);
                    TextView textView = this.onCommand;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                    String str = String.format("%d New", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getAudioAttributesImplApi21Parcelizer())}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                    textView.setText(str);
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.onPlayFromMediaId);
                    TextView textView2 = this.onPlayFromMediaId;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                    String str2 = String.format("%d Revised", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getAudioAttributesImplApi26Parcelizer())}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                    textView2.setText(str2);
                } else if (lesson.getAudioAttributesImplApi21Parcelizer() > 0) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.onCommand);
                    TextView textView3 = this.onCommand;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
                    String str3 = String.format("%d New", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getAudioAttributesImplApi21Parcelizer())}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                    textView3.setText(str3);
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPlayFromMediaId);
                } else if (z) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.onPlayFromMediaId);
                    TextView textView4 = this.onPlayFromMediaId;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
                    String str4 = String.format("%d Revised", Arrays.copyOf(new Object[]{Integer.valueOf(lesson.getAudioAttributesImplApi26Parcelizer())}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
                    textView4.setText(str4);
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
                } else {
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPlayFromMediaId);
                }
            }
            int mediaBrowserCompatCustomActionResultReceiver = lesson.getMediaBrowserCompatCustomActionResultReceiver();
            if (mediaBrowserCompatCustomActionResultReceiver == 1) {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi21Parcelizer);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPlayFromMediaId);
            } else if (mediaBrowserCompatCustomActionResultReceiver == 2) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi21Parcelizer);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi21Parcelizer);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            if (this.MediaBrowserCompatMediaItem.read && lesson.getAudioAttributesImplBaseParcelizer()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onPlay);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPlayFromMediaId);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPlay);
            }
            if (lesson.getMediaBrowserCompatSearchResultReceiver() > BitmapDescriptorFactory.HUE_RED) {
                ImageView imageView = this.AudioAttributesImplApi26Parcelizer;
                imageView.setColorFilter(createExtractors.RemoteActionCompatParcelizer(imageView, R.attr.onSurfaceYellow), PorterDuff.Mode.SRC_IN);
            } else {
                ImageView imageView2 = this.AudioAttributesImplApi26Parcelizer;
                imageView2.setColorFilter(createExtractors.RemoteActionCompatParcelizer(imageView2, R.attr.onSurfaceBgOutline), PorterDuff.Mode.SRC_IN);
            }
            TextView textView5 = this.onFastForward;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
            String str5 = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(lesson.getMediaBrowserCompatSearchResultReceiver())}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
            textView5.setText(str5);
            this.handleMediaPlayPauseIfPendingOnHandler.setText(lesson.getOnAddQueueItem());
            if (lesson.getMediaBrowserCompatCustomActionResultReceiver() == 2 && lesson.getOnPause()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
                dispatchTouchEvent.IconCompatParcelizer(this.MediaDescriptionCompat, lesson.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                TextView textView6 = this.onCustomAction;
                String str6 = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(getOnline.RemoteActionCompatParcelizer(lesson.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()))}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
                textView6.setText(str6);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.RatingCompat);
                this.RatingCompat.setText(this.itemView.getContext().getString(R.string.completed_on, new SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(new Date(lesson.getOnCustomAction()))));
                return;
            }
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.RatingCompat);
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void write(bj bjVar, SealedLessonDetailsModel.Lesson lesson) {
            bjVar.write().read(new ClickedLessonDetails(lesson.getRead(), lesson.getRatingCompat()));
        }
    }

    public bj(write writeVar) {
        toMagicModuleMetaRepoModel.write(writeVar, "");
        this.write = writeVar;
        this.AudioAttributesCompatParcelizer = new ArrayList<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return IconCompatParcelizer(viewGroup);
    }

    public final write write() {
        return this.write;
    }

    public final void AudioAttributesCompatParcelizer(ArrayList<SealedLessonDetailsModel.Lesson> arrayList, boolean z) {
        toMagicModuleMetaRepoModel.write(arrayList, "");
        this.AudioAttributesCompatParcelizer = arrayList;
        this.IconCompatParcelizer = z;
    }

    private RemoteActionCompatParcelizer IconCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_qbank_lesson_card, viewGroup, false);
        toMagicModuleMetaRepoModel.write(viewInflate);
        return new RemoteActionCompatParcelizer(this, viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        SealedLessonDetailsModel.Lesson lesson = this.AudioAttributesCompatParcelizer.get(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lesson, "");
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(lesson);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesCompatParcelizer.size();
    }
}
