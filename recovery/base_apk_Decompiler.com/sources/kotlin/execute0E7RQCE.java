package kotlin;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.marrow.R;
import com.marrow.ui.views.CustomTextView;
import com.marrow.ui.views.MoveableTextView;
import java.util.List;
import kotlin.SequenceSerializer;
import kotlin.execute0E7RQCE;
import kotlin.getClassId;
import kotlin.setCaptionRowCount;

/* JADX INFO: loaded from: classes4.dex */
public final class execute0E7RQCE extends deserializeIymvxus<cs, read> {
    private zwk RemoteActionCompatParcelizer;
    private final MagicModuleSubmissionRequestBody<cs, Exception, getShowPopup> read;
    private int write;

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AudioAttributesCompatParcelizer(viewGroup);
    }

    public final MagicModuleSubmissionRequestBody<cs, Exception, getShowPopup> read() {
        return this.read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public execute0E7RQCE(MagicModuleSubmissionRequestBody<? super cs, ? super Exception, getShowPopup> magicModuleSubmissionRequestBody) {
        super(new IconCompatParcelizer());
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        this.read = magicModuleSubmissionRequestBody;
    }

    public final void RemoteActionCompatParcelizer(zwk zwkVar) {
        toMagicModuleMetaRepoModel.write(zwkVar, "");
        this.RemoteActionCompatParcelizer = zwkVar;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.write = i;
        notifyDataSetChanged();
    }

    static final class IconCompatParcelizer extends SequenceSerializer.RemoteActionCompatParcelizer<cs> {
        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ boolean RemoteActionCompatParcelizer(cs csVar, cs csVar2) {
            return IconCompatParcelizer(csVar, csVar2);
        }

        @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
        public final /* synthetic */ boolean read(cs csVar, cs csVar2) {
            return RemoteActionCompatParcelizer2(csVar, csVar2);
        }

        private static boolean IconCompatParcelizer(cs csVar, cs csVar2) {
            toMagicModuleMetaRepoModel.write(csVar, "");
            toMagicModuleMetaRepoModel.write(csVar2, "");
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) csVar.write(), (Object) csVar2.write());
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: avoid collision after fix types in other method */
        private static boolean RemoteActionCompatParcelizer2(cs csVar, cs csVar2) {
            toMagicModuleMetaRepoModel.write(csVar, "");
            toMagicModuleMetaRepoModel.write(csVar2, "");
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(csVar, csVar2);
        }
    }

    private read AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        checkPlaylistHeader checkplaylistheaderAudioAttributesCompatParcelizer = checkPlaylistHeader.AudioAttributesCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(checkplaylistheaderAudioAttributesCompatParcelizer, "");
        return new read(this, checkplaylistheaderAudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(read readVar, int i) {
        toMagicModuleMetaRepoModel.write(readVar, "");
        cs csVar = RemoteActionCompatParcelizer().get(i);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(csVar, "");
        readVar.AudioAttributesCompatParcelizer(csVar, i);
    }

    public final class read extends RecyclerView.onMediaButtonEvent {
        private final checkPlaylistHeader AudioAttributesCompatParcelizer;
        private /* synthetic */ execute0E7RQCE RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(execute0E7RQCE execute0e7rqce, checkPlaylistHeader checkplaylistheader) throws Throwable {
            super(checkplaylistheader.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(checkplaylistheader, "");
            this.RemoteActionCompatParcelizer = execute0e7rqce;
            this.AudioAttributesCompatParcelizer = checkplaylistheader;
            MoveableTextView moveableTextView = checkplaylistheader.AudioAttributesImplApi21Parcelizer;
            moveableTextView.setTextColor(new int[]{-16777216});
            moveableTextView.setBackground(new int[]{0, 0, 0});
            moveableTextView.setMsDelay(20000L);
            moveableTextView.setDontHide(true);
            moveableTextView.setTextSizes(new float[]{10.0f});
        }

        public final void AudioAttributesCompatParcelizer(final cs csVar, int i) {
            toMagicModuleMetaRepoModel.write(csVar, "");
            Context context = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getContext();
            checkPlaylistHeader checkplaylistheader = this.AudioAttributesCompatParcelizer;
            execute0E7RQCE execute0e7rqce = this.RemoteActionCompatParcelizer;
            ProgressBar progressBar = checkplaylistheader.read;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(progressBar);
            read();
            checkplaylistheader.AudioAttributesCompatParcelizer.setImageDrawable(null);
            checkplaylistheader.AudioAttributesCompatParcelizer.setAlpha(1.0f);
            write(csVar, false);
            ImageView imageView = checkplaylistheader.AudioAttributesCompatParcelizer;
            imageView.getLayoutParams().width = execute0e7rqce.write;
            imageView.getLayoutParams().height = (int) (execute0e7rqce.write * csVar.AudioAttributesCompatParcelizer());
            checkplaylistheader.IconCompatParcelizer.setText(context.getString(R.string.f_notes_counter, Integer.valueOf(i + 1), Integer.valueOf(execute0e7rqce.RemoteActionCompatParcelizer().size())));
            CustomTextView customTextView = checkplaylistheader.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(customTextView);
            LinearLayout linearLayout = checkplaylistheader.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
            checkplaylistheader.write.setOnClickListener(new View.OnClickListener() { // from class: o.RecaptchaException
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    execute0E7RQCE.read.AudioAttributesCompatParcelizer(this.read, csVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(read readVar, cs csVar) {
            readVar.write(csVar, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void write(final cs csVar, boolean z) {
            final checkPlaylistHeader checkplaylistheader = this.AudioAttributesCompatParcelizer;
            final execute0E7RQCE execute0e7rqce = this.RemoteActionCompatParcelizer;
            CustomTextView customTextView = checkplaylistheader.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(customTextView);
            LinearLayout linearLayout = checkplaylistheader.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
            read(zzoid.AudioAttributesCompatParcelizer(csVar, z), new getAnswerMap() { // from class: o.executeTask
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return execute0E7RQCE.read.write(csVar, checkplaylistheader, (PendingResults) obj);
                }
            }, new MagicModuleSubmissionRequestBody() { // from class: o.RecaptchaTasksClient
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return execute0E7RQCE.read.AudioAttributesCompatParcelizer(csVar, execute0e7rqce, checkplaylistheader, (PendingResults) obj, (setLiveMaxPlaybackSpeed) obj2);
                }
            }, new getAnswerMap() { // from class: o.RecaptchaErrorCode
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return execute0E7RQCE.read.read(csVar, checkplaylistheader, execute0e7rqce, this, (PendingResults) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup write(cs csVar, checkPlaylistHeader checkplaylistheader, PendingResults pendingResults) {
            toMagicModuleMetaRepoModel.write(pendingResults, "");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) pendingResults.AudioAttributesCompatParcelizer(), (Object) csVar.write())) {
                return getShowPopup.INSTANCE;
            }
            CustomTextView customTextView = checkplaylistheader.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(customTextView);
            LinearLayout linearLayout = checkplaylistheader.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(cs csVar, execute0E7RQCE execute0e7rqce, checkPlaylistHeader checkplaylistheader, PendingResults pendingResults, setLiveMaxPlaybackSpeed setlivemaxplaybackspeed) {
            toMagicModuleMetaRepoModel.write(pendingResults, "");
            toMagicModuleMetaRepoModel.write(setlivemaxplaybackspeed, "");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) pendingResults.AudioAttributesCompatParcelizer(), (Object) csVar.write())) {
                return getShowPopup.INSTANCE;
            }
            List<Throwable> listIconCompatParcelizer = setlivemaxplaybackspeed.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listIconCompatParcelizer, "");
            setLiveMaxPlaybackSpeed setlivemaxplaybackspeed2 = (Throwable) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver((List) listIconCompatParcelizer);
            if (setlivemaxplaybackspeed2 == null) {
                setlivemaxplaybackspeed2 = setlivemaxplaybackspeed;
            }
            Exception exc = new Exception(setlivemaxplaybackspeed2);
            execute0e7rqce.read().invoke(csVar, exc);
            if (withRequestHeaders.AudioAttributesCompatParcelizer(exc)) {
                CustomTextView customTextView = checkplaylistheader.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(customTextView);
            }
            LinearLayout linearLayout = checkplaylistheader.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(cs csVar, checkPlaylistHeader checkplaylistheader, execute0E7RQCE execute0e7rqce, read readVar, PendingResults pendingResults) throws Throwable {
            toMagicModuleMetaRepoModel.write(pendingResults, "");
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) pendingResults.AudioAttributesCompatParcelizer(), (Object) csVar.write())) {
                return getShowPopup.INSTANCE;
            }
            CustomTextView customTextView = checkplaylistheader.RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(customTextView);
            LinearLayout linearLayout = checkplaylistheader.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout);
            zwk zwkVar = execute0e7rqce.RemoteActionCompatParcelizer;
            zwk zwkVar2 = null;
            if (zwkVar == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                zwkVar = null;
            }
            if (zwkVar.read()) {
                String[] strArr = new String[2];
                zwk zwkVar3 = execute0e7rqce.RemoteActionCompatParcelizer;
                if (zwkVar3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    zwkVar3 = null;
                }
                strArr[0] = zwkVar3.RemoteActionCompatParcelizer();
                zwk zwkVar4 = execute0e7rqce.RemoteActionCompatParcelizer;
                if (zwkVar4 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    zwkVar2 = zwkVar4;
                }
                strArr[1] = zwkVar2.write();
                readVar.IconCompatParcelizer(strArr);
                readVar.IconCompatParcelizer();
            }
            return getShowPopup.INSTANCE;
        }

        private final void IconCompatParcelizer(String[] strArr) throws Throwable {
            MoveableTextView moveableTextView = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.write(moveableTextView);
            bytesRead.AudioAttributesImplApi21Parcelizer(moveableTextView);
            moveableTextView.setBlinkerTexts(strArr);
        }

        private final void IconCompatParcelizer() throws Throwable {
            final MoveableTextView moveableTextView = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            moveableTextView.MediaBrowserCompatCustomActionResultReceiver();
            moveableTextView.setOnMoveListener(new getCreatedOnDateMs() { // from class: o.getEntries
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return execute0E7RQCE.read.AudioAttributesCompatParcelizer(moveableTextView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(MoveableTextView moveableTextView) {
            getProvider getprovider = getProvider.getInstance(moveableTextView.getContext());
            setCaptionRowCount.Companion companion = setCaptionRowCount.INSTANCE;
            getprovider.AudioAttributesCompatParcelizer(setCaptionRowCount.Companion.AudioAttributesCompatParcelizer());
            return getShowPopup.INSTANCE;
        }

        private final void read() {
            MoveableTextView moveableTextView = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            int i = getClassId.AudioAttributesCompatParcelizer.read();
            int i2 = getClassId.AudioAttributesCompatParcelizer.read();
            MoveableTextView.IconCompatParcelizer(getClassId.AudioAttributesCompatParcelizer.read(), getClassId.AudioAttributesCompatParcelizer.read(), new Object[]{moveableTextView}, i, i2, 247168840, -247168839);
            toMagicModuleMetaRepoModel.write(moveableTextView);
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(moveableTextView);
        }

        private final void read(PendingResults pendingResults, getAnswerMap<? super PendingResults, getShowPopup> getanswermap, MagicModuleSubmissionRequestBody<? super PendingResults, ? super setLiveMaxPlaybackSpeed, getShowPopup> magicModuleSubmissionRequestBody, getAnswerMap<? super PendingResults, getShowPopup> getanswermap2) {
            setOffset setoffset = new setOffset(this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getContext());
            setoffset.write(12.0f);
            setoffset.RemoteActionCompatParcelizer();
            setoffset.AudioAttributesCompatParcelizer(_isNaN.getColor(this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getContext(), R.color.colorPrimary));
            setoffset.start();
            Glide.write(this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getContext()).IconCompatParcelizer(pendingResults).IconCompatParcelizer((Drawable) setoffset).read((Drawable) new ColorDrawable(0)).read((getUpdatedMediaPeriodInfo) new write(magicModuleSubmissionRequestBody, pendingResults, getanswermap2)).IconCompatParcelizer(setDrmSessionForClearTypes.RemoteActionCompatParcelizer).read(true).MediaBrowserCompatItemReceiver().read(new RemoteActionCompatParcelizer(getanswermap, pendingResults, this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer));
        }

        public static final class write implements getUpdatedMediaPeriodInfo<Drawable> {
            private /* synthetic */ getAnswerMap<PendingResults, getShowPopup> AudioAttributesCompatParcelizer;
            private /* synthetic */ MagicModuleSubmissionRequestBody<PendingResults, setLiveMaxPlaybackSpeed, getShowPopup> IconCompatParcelizer;
            private /* synthetic */ PendingResults write;

            /* JADX WARN: Multi-variable type inference failed */
            write(MagicModuleSubmissionRequestBody<? super PendingResults, ? super setLiveMaxPlaybackSpeed, getShowPopup> magicModuleSubmissionRequestBody, PendingResults pendingResults, getAnswerMap<? super PendingResults, getShowPopup> getanswermap) {
                this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
                this.write = pendingResults;
                this.AudioAttributesCompatParcelizer = getanswermap;
            }

            @Override // kotlin.getUpdatedMediaPeriodInfo
            public final boolean RemoteActionCompatParcelizer(setLiveMaxPlaybackSpeed setlivemaxplaybackspeed, MediaSourceInfoHolder<Drawable> mediaSourceInfoHolder) {
                toMagicModuleMetaRepoModel.write(mediaSourceInfoHolder, "");
                if (setlivemaxplaybackspeed == null) {
                    return false;
                }
                this.IconCompatParcelizer.invoke(this.write, setlivemaxplaybackspeed);
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.getUpdatedMediaPeriodInfo
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public boolean RemoteActionCompatParcelizer(Drawable drawable, Object obj, onTracksChanged ontrackschanged) {
                toMagicModuleMetaRepoModel.write(drawable, "");
                toMagicModuleMetaRepoModel.write(obj, "");
                toMagicModuleMetaRepoModel.write(ontrackschanged, "");
                this.AudioAttributesCompatParcelizer.invoke(this.write);
                return false;
            }
        }

        public static final class RemoteActionCompatParcelizer extends shouldLoadNextMediaPeriod {
            private /* synthetic */ PendingResults IconCompatParcelizer;
            private /* synthetic */ getAnswerMap<PendingResults, getShowPopup> read;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            RemoteActionCompatParcelizer(getAnswerMap<? super PendingResults, getShowPopup> getanswermap, PendingResults pendingResults, ImageView imageView) {
                super(imageView);
                this.read = getanswermap;
                this.IconCompatParcelizer = pendingResults;
            }

            @Override // kotlin.lambdanotifyQueueUpdate0comgoogleandroidexoplayer2MediaPeriodQueue, kotlin.MediaPeriodQueueExternalSyntheticLambda0, kotlin.removeAfter, kotlin.MediaSourceInfoHolder
            public final void write(Drawable drawable) {
                super.write(drawable);
                this.read.invoke(this.IconCompatParcelizer);
            }
        }
    }
}
