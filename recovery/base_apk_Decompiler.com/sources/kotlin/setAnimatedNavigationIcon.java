package kotlin;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.Chip;
import com.marrow.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.isTrafficRestricted;
import kotlin.setAnimatedNavigationIcon;

/* JADX INFO: loaded from: classes4.dex */
public final class setAnimatedNavigationIcon extends RecyclerView.IconCompatParcelizer<RemoteActionCompatParcelizer> {
    private final getCreatedOnDateMs<Boolean> AudioAttributesCompatParcelizer;
    private List<isTrafficRestricted.RemoteActionCompatParcelizer> AudioAttributesImplApi21Parcelizer;
    private boolean IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private final setThumbStrokeWidthResource read;
    private List<String> write;

    public setAnimatedNavigationIcon(setThumbStrokeWidthResource setthumbstrokewidthresource, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(setthumbstrokewidthresource, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.read = setthumbstrokewidthresource;
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
        this.AudioAttributesImplApi21Parcelizer = new ArrayList();
        this.write = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return RemoteActionCompatParcelizer(viewGroup);
    }

    public final setThumbStrokeWidthResource IconCompatParcelizer() {
        return this.read;
    }

    public final getCreatedOnDateMs<Boolean> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(List<isTrafficRestricted.RemoteActionCompatParcelizer> list, List<String> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.AudioAttributesImplApi21Parcelizer = IntermediateLoginResponseBody.MediaBrowserCompatItemReceiver((Collection) list);
        this.write.clear();
        this.write.addAll(list2);
        notifyDataSetChanged();
    }

    public final void read(setMaxInlineActionWidth setmaxinlineactionwidth) {
        toMagicModuleMetaRepoModel.write(setmaxinlineactionwidth, "");
        this.IconCompatParcelizer = setmaxinlineactionwidth.getRemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = setmaxinlineactionwidth.getAudioAttributesCompatParcelizer();
        notifyDataSetChanged();
    }

    private RemoteActionCompatParcelizer RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_downloaded_video, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
        return new RemoteActionCompatParcelizer(this, viewInflate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesImplApi21Parcelizer.size();
    }

    public class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final TextView AudioAttributesCompatParcelizer;
        private final ConstraintLayout AudioAttributesImplApi21Parcelizer;
        private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
        private final TextView AudioAttributesImplBaseParcelizer;
        private final CheckBox IconCompatParcelizer;
        private final TextView MediaBrowserCompatCustomActionResultReceiver;
        private final TextView MediaBrowserCompatItemReceiver;
        private final Chip MediaBrowserCompatMediaItem;
        private final LinearLayout MediaBrowserCompatSearchResultReceiver;
        private final ImageView MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final ImageView MediaDescriptionCompat;
        private final ImageView MediaMetadataCompat;
        private final ImageView RatingCompat;
        private final LinearLayout RemoteActionCompatParcelizer;
        private final TextView handleMediaPlayPauseIfPendingOnHandler;
        private final ImageView onAddQueueItem;
        private final TextView onCommand;
        private final TextView onCustomAction;
        private final TextView onPause;
        private /* synthetic */ setAnimatedNavigationIcon onPlayFromMediaId;
        private final ImageView read;
        private final ProgressBar write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(setAnimatedNavigationIcon setanimatednavigationicon, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.onPlayFromMediaId = setanimatednavigationicon;
            View viewFindViewById = view.findViewById(R.id.cbDelete);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.IconCompatParcelizer = (CheckBox) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.llMain);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.RemoteActionCompatParcelizer = (LinearLayout) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.clLessonCard);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            this.AudioAttributesImplApi21Parcelizer = (ConstraintLayout) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.ivLesson);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            this.MediaMetadataCompat = (ImageView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.llProCard);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            this.MediaBrowserCompatSearchResultReceiver = (LinearLayout) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.ivProLock);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById6, "");
            this.RatingCompat = (ImageView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.tvProTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById7, "");
            this.onCommand = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.tvLessonTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById8, "");
            this.onPause = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.tvSubjectTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById9, "");
            this.onCustomAction = (TextView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.ivLessonComplete);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById10, "");
            this.MediaDescriptionCompat = (ImageView) viewFindViewById10;
            View viewFindViewById11 = view.findViewById(R.id.ivRating);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById11, "");
            this.onAddQueueItem = (ImageView) viewFindViewById11;
            View viewFindViewById12 = view.findViewById(R.id.tvRatingText);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById12, "");
            this.handleMediaPlayPauseIfPendingOnHandler = (TextView) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(R.id.tvVideoDuration);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById13, "");
            this.MediaBrowserCompatCustomActionResultReceiver = (TextView) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(R.id.ivPytTag);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById14, "");
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (ImageView) viewFindViewById14;
            View viewFindViewById15 = view.findViewById(R.id.tvDownloadActionStatus);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById15, "");
            this.MediaBrowserCompatItemReceiver = (TextView) viewFindViewById15;
            View viewFindViewById16 = view.findViewById(R.id.clDownloadView);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById16, "");
            this.AudioAttributesImplApi26Parcelizer = (ConstraintLayout) viewFindViewById16;
            View viewFindViewById17 = view.findViewById(R.id.pbDownloadProgress);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById17, "");
            this.write = (ProgressBar) viewFindViewById17;
            View viewFindViewById18 = view.findViewById(R.id.ivDownloaded);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById18, "");
            this.read = (ImageView) viewFindViewById18;
            View viewFindViewById19 = view.findViewById(R.id.tvDownloadStatus);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById19, "");
            this.AudioAttributesCompatParcelizer = (TextView) viewFindViewById19;
            View viewFindViewById20 = view.findViewById(R.id.llContinue);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById20, "");
            this.MediaBrowserCompatMediaItem = (Chip) viewFindViewById20;
            View viewFindViewById21 = view.findViewById(R.id.tvDownloadActionStatus);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById21, "");
            this.AudioAttributesImplBaseParcelizer = (TextView) viewFindViewById21;
        }

        public final void RemoteActionCompatParcelizer(final isTrafficRestricted.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            if (this.onPlayFromMediaId.RemoteActionCompatParcelizer) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
                this.IconCompatParcelizer.setChecked(this.onPlayFromMediaId.write.contains(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()));
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplBaseParcelizer);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplBaseParcelizer);
            }
            CheckBox checkBox = this.IconCompatParcelizer;
            final setAnimatedNavigationIcon setanimatednavigationicon = this.onPlayFromMediaId;
            checkBox.setOnClickListener(new View.OnClickListener() { // from class: o.SearchBarSavedState
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setAnimatedNavigationIcon.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(setanimatednavigationicon, remoteActionCompatParcelizer);
                }
            });
            boolean zMediaBrowserCompatSearchResultReceiver = remoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            boolean z = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer() == 2;
            boolean z2 = remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer() == 1;
            this.onPause.setText(remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer());
            this.onCustomAction.setText(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer());
            setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this.itemView.getContext()).RemoteActionCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()).MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).IconCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).RemoteActionCompatParcelizer(this.MediaMetadataCompat);
            if (zMediaBrowserCompatSearchResultReceiver && remoteActionCompatParcelizer.MediaDescriptionCompat()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onCommand);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.RatingCompat);
            } else if (zMediaBrowserCompatSearchResultReceiver) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatSearchResultReceiver);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onCommand);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.RatingCompat);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatSearchResultReceiver);
            }
            TextView textView = this.handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(remoteActionCompatParcelizer.read())}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            textView.setText(str);
            if (remoteActionCompatParcelizer.read() > BitmapDescriptorFactory.HUE_RED) {
                ImageView imageView = this.onAddQueueItem;
                imageView.setColorFilter(createExtractors.RemoteActionCompatParcelizer(imageView, R.attr.onSurfaceYellow), PorterDuff.Mode.SRC_IN);
            } else {
                ImageView imageView2 = this.onAddQueueItem;
                imageView2.setColorFilter(createExtractors.RemoteActionCompatParcelizer(imageView2, R.attr.onSurfaceBgOutline), PorterDuff.Mode.SRC_IN);
            }
            if (z) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaDescriptionCompat);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatMediaItem);
            } else if (z2) {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaDescriptionCompat);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatMediaItem);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaDescriptionCompat);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatMediaItem);
            }
            RemoteActionCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.IconCompatParcelizer());
            this.MediaBrowserCompatCustomActionResultReceiver.setText(remoteActionCompatParcelizer.RemoteActionCompatParcelizer());
            if (this.onPlayFromMediaId.IconCompatParcelizer) {
                if (remoteActionCompatParcelizer.write()) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    LinearLayout linearLayout = this.RemoteActionCompatParcelizer;
                    linearLayout.setBackgroundColor(createExtractors.RemoteActionCompatParcelizer(linearLayout, R.attr.colorSurface));
                } else {
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    LinearLayout linearLayout2 = this.RemoteActionCompatParcelizer;
                    linearLayout2.setBackgroundColor(createExtractors.RemoteActionCompatParcelizer(linearLayout2, R.attr.backgroundColor));
                }
            } else {
                LinearLayout linearLayout3 = this.RemoteActionCompatParcelizer;
                linearLayout3.setBackgroundColor(createExtractors.RemoteActionCompatParcelizer(linearLayout3, R.attr.colorSurface));
            }
            ConstraintLayout constraintLayout = this.AudioAttributesImplApi26Parcelizer;
            final setAnimatedNavigationIcon setanimatednavigationicon2 = this.onPlayFromMediaId;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o.setModalForAccessibility
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setAnimatedNavigationIcon.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(setanimatednavigationicon2, remoteActionCompatParcelizer);
                }
            });
            ConstraintLayout constraintLayout2 = this.AudioAttributesImplApi21Parcelizer;
            final setAnimatedNavigationIcon setanimatednavigationicon3 = this.onPlayFromMediaId;
            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.setSearchPrefixText
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setAnimatedNavigationIcon.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(setanimatednavigationicon3, remoteActionCompatParcelizer);
                }
            });
            TextView textView2 = this.MediaBrowserCompatItemReceiver;
            final setAnimatedNavigationIcon setanimatednavigationicon4 = this.onPlayFromMediaId;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.setStatusBarSpacerEnabled
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    setAnimatedNavigationIcon.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(setanimatednavigationicon4, remoteActionCompatParcelizer);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(setAnimatedNavigationIcon setanimatednavigationicon, isTrafficRestricted.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (!setanimatednavigationicon.write.contains(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver())) {
                setanimatednavigationicon.write.add(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
            } else {
                setanimatednavigationicon.write.remove(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver());
            }
            setThumbStrokeWidthResource setthumbstrokewidthresourceIconCompatParcelizer = setanimatednavigationicon.IconCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(setanimatednavigationicon.write);
            setthumbstrokewidthresourceIconCompatParcelizer.AudioAttributesCompatParcelizer(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void MediaBrowserCompatCustomActionResultReceiver(setAnimatedNavigationIcon setanimatednavigationicon, isTrafficRestricted.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            setanimatednavigationicon.IconCompatParcelizer().IconCompatParcelizer(remoteActionCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesImplBaseParcelizer(setAnimatedNavigationIcon setanimatednavigationicon, isTrafficRestricted.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            setanimatednavigationicon.IconCompatParcelizer().IconCompatParcelizer(remoteActionCompatParcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesImplApi26Parcelizer(setAnimatedNavigationIcon setanimatednavigationicon, isTrafficRestricted.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            setanimatednavigationicon.IconCompatParcelizer().read(remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(), remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer());
        }

        private void RemoteActionCompatParcelizer(int i, int i2) {
            if (i == -2) {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.read);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi26Parcelizer);
                this.write.setProgress(Math.max(0, i2));
                TextView textView = this.AudioAttributesCompatParcelizer;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str = String.format("Downloading %d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Math.max(0, i2))}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                textView.setText(str);
                this.AudioAttributesImplBaseParcelizer.setText("Pause");
                return;
            }
            if (i != -1) {
                if (i == 1) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.read);
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer);
                    this.AudioAttributesCompatParcelizer.setText(this.itemView.getResources().getString(R.string.label_downloaded));
                    return;
                } else {
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer);
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.read);
                    return;
                }
            }
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.read);
            bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi26Parcelizer);
            this.write.setProgress(Math.max(0, i2));
            if (!this.onPlayFromMediaId.RemoteActionCompatParcelizer().invoke().booleanValue()) {
                TextView textView2 = this.AudioAttributesCompatParcelizer;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format("Paused %d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Math.max(0, i2))}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                textView2.setText(str2);
                this.AudioAttributesImplBaseParcelizer.setText("Resume");
                return;
            }
            TextView textView3 = this.AudioAttributesCompatParcelizer;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
            String str3 = String.format("Queued %d%%", Arrays.copyOf(new Object[]{Integer.valueOf(Math.max(0, i2))}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
            textView3.setText(str3);
            this.AudioAttributesImplBaseParcelizer.setText("Discard");
        }
    }
}
