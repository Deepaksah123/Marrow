package kotlin;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.Chip;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.ThemeKt;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.bp;
import kotlin.isTrafficRestricted;
import kotlin.withPropertyNamingStrategy;

/* JADX INFO: loaded from: classes4.dex */
public final class bp extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> implements getProtocolVersion {
    private final bk AudioAttributesCompatParcelizer;
    private List<? extends isTrafficRestricted> AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean RemoteActionCompatParcelizer;
    private final getCreatedOnDateMs<Boolean> read;
    private int write;

    public bp(bk bkVar, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(bkVar, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.AudioAttributesCompatParcelizer = bkVar;
        this.read = getcreatedondatems;
        this.AudioAttributesImplBaseParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.write = 6;
    }

    public final bk AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final getCreatedOnDateMs<Boolean> read() {
        return this.read;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int i) {
        isTrafficRestricted istrafficrestricted = this.AudioAttributesImplBaseParcelizer.get(i);
        if (istrafficrestricted instanceof isTrafficRestricted.AudioAttributesImplApi26Parcelizer) {
            return 2;
        }
        if (istrafficrestricted instanceof isTrafficRestricted.read) {
            return 1;
        }
        if (istrafficrestricted instanceof isTrafficRestricted.AudioAttributesImplBaseParcelizer) {
            return 6;
        }
        if (istrafficrestricted instanceof isTrafficRestricted.AudioAttributesCompatParcelizer) {
            return 5;
        }
        if (istrafficrestricted instanceof isTrafficRestricted.IconCompatParcelizer) {
            return 8;
        }
        if (istrafficrestricted instanceof isTrafficRestricted.MediaBrowserCompatItemReceiver) {
            return 9;
        }
        return istrafficrestricted instanceof isTrafficRestricted.write ? 10 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            Context context = viewGroup.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            return new AudioAttributesCompatParcelizer(this, new ComposeView(context, null, 0, 6, null));
        }
        if (i == 5) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.view_video_author_details, viewGroup, false);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate, "");
            return new write(this, viewInflate);
        }
        if (i != 6) {
            switch (i) {
                case 8:
                    View viewInflate2 = layoutInflaterFrom.inflate(R.layout.vh_new_lesson, viewGroup, false);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate2, "");
                    return new AudioAttributesImplApi21Parcelizer(this, viewInflate2);
                case 9:
                    finishedReadingChunk finishedreadingchunkWrite = finishedReadingChunk.write(layoutInflaterFrom, viewGroup);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(finishedreadingchunkWrite, "");
                    return new IconCompatParcelizer(this, finishedreadingchunkWrite);
                case 10:
                    Context context2 = viewGroup.getContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
                    return new read(this, new ComposeView(context2, null, 0, 6, null));
                default:
                    View viewInflate3 = layoutInflaterFrom.inflate(R.layout.item_video_lesson_card, viewGroup, false);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate3, "");
                    return new RemoteActionCompatParcelizer(this, viewInflate3);
            }
        }
        View viewInflate4 = layoutInflaterFrom.inflate(R.layout.view_video_watched_status, viewGroup, false);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewInflate4, "");
        return new MediaBrowserCompatItemReceiver(this, viewInflate4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.AudioAttributesImplBaseParcelizer.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i, List<Object> list) {
        toMagicModuleMetaRepoModel.write(onmediabuttonevent, "");
        toMagicModuleMetaRepoModel.write(list, "");
        if (!list.isEmpty()) {
            Object obj = IntermediateLoginResponseBody.read((List<? extends Object>) list, 0);
            if (obj != null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = onmediabuttonevent instanceof RemoteActionCompatParcelizer ? (RemoteActionCompatParcelizer) onmediabuttonevent : null;
                if (remoteActionCompatParcelizer != null) {
                    boolean z = obj instanceof Pair;
                    Pair pair = z ? (Pair) obj : null;
                    int iIntValue = pair != null ? ((Number) pair.write()).intValue() : 0;
                    Pair pair2 = z ? (Pair) obj : null;
                    remoteActionCompatParcelizer.write(iIntValue, pair2 != null ? ((Number) pair2.IconCompatParcelizer()).intValue() : 0);
                    return;
                }
                return;
            }
            onBindViewHolder(onmediabuttonevent, i);
            return;
        }
        onBindViewHolder(onmediabuttonevent, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i) {
        toMagicModuleMetaRepoModel.write(onmediabuttonevent, "");
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            isTrafficRestricted istrafficrestricted = this.AudioAttributesImplBaseParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(istrafficrestricted, "");
            ((AudioAttributesCompatParcelizer) onmediabuttonevent).read((isTrafficRestricted.read) istrafficrestricted);
            return;
        }
        if (itemViewType == 5) {
            isTrafficRestricted istrafficrestricted2 = this.AudioAttributesImplBaseParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(istrafficrestricted2, "");
            ((write) onmediabuttonevent).AudioAttributesCompatParcelizer((isTrafficRestricted.AudioAttributesCompatParcelizer) istrafficrestricted2);
            return;
        }
        if (itemViewType == 6) {
            isTrafficRestricted istrafficrestricted3 = this.AudioAttributesImplBaseParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(istrafficrestricted3, "");
            ((MediaBrowserCompatItemReceiver) onmediabuttonevent).RemoteActionCompatParcelizer((isTrafficRestricted.AudioAttributesImplBaseParcelizer) istrafficrestricted3);
            return;
        }
        switch (itemViewType) {
            case 8:
                isTrafficRestricted istrafficrestricted4 = this.AudioAttributesImplBaseParcelizer.get(i);
                toMagicModuleMetaRepoModel.read(istrafficrestricted4, "");
                ((AudioAttributesImplApi21Parcelizer) onmediabuttonevent).write((isTrafficRestricted.IconCompatParcelizer) istrafficrestricted4);
                break;
            case 9:
                isTrafficRestricted istrafficrestricted5 = this.AudioAttributesImplBaseParcelizer.get(i);
                toMagicModuleMetaRepoModel.read(istrafficrestricted5, "");
                ((IconCompatParcelizer) onmediabuttonevent).read((isTrafficRestricted.MediaBrowserCompatItemReceiver) istrafficrestricted5);
                break;
            case 10:
                isTrafficRestricted istrafficrestricted6 = this.AudioAttributesImplBaseParcelizer.get(i);
                toMagicModuleMetaRepoModel.read(istrafficrestricted6, "");
                ((read) onmediabuttonevent).read((isTrafficRestricted.write) istrafficrestricted6);
                break;
            default:
                isTrafficRestricted istrafficrestricted7 = this.AudioAttributesImplBaseParcelizer.get(i);
                toMagicModuleMetaRepoModel.read(istrafficrestricted7, "");
                ((RemoteActionCompatParcelizer) onmediabuttonevent).RemoteActionCompatParcelizer((isTrafficRestricted.AudioAttributesImplApi26Parcelizer) istrafficrestricted7);
                break;
        }
    }

    public class AudioAttributesImplApi21Parcelizer extends RecyclerView.onMediaButtonEvent {
        private final TextView AudioAttributesCompatParcelizer;
        private /* synthetic */ bp IconCompatParcelizer;
        private final View RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesImplApi21Parcelizer(bp bpVar, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.IconCompatParcelizer = bpVar;
            View viewFindViewById = view.findViewById(R.id.description);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.AudioAttributesCompatParcelizer = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.root_new_card);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.RemoteActionCompatParcelizer = viewFindViewById2;
        }

        public final void write(isTrafficRestricted.IconCompatParcelizer iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer);
            if (iconCompatParcelizer.IconCompatParcelizer() <= 0) {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
                return;
            }
            if (iconCompatParcelizer.IconCompatParcelizer() > 1) {
                TextView textView = this.AudioAttributesCompatParcelizer;
                int iIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
                StringBuilder sb = new StringBuilder();
                sb.append(iIconCompatParcelizer);
                sb.append(" new video added");
                textView.setText(sb.toString());
            } else {
                TextView textView2 = this.AudioAttributesCompatParcelizer;
                int iIconCompatParcelizer2 = iconCompatParcelizer.IconCompatParcelizer();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iIconCompatParcelizer2);
                sb2.append(" new videos added");
                textView2.setText(sb2.toString());
            }
            View view = this.RemoteActionCompatParcelizer;
            final bp bpVar = this.IconCompatParcelizer;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.StandardIntegrityErrorCode
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    bp.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(bpVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(bp bpVar) {
            bpVar.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    public class MediaBrowserCompatItemReceiver extends RecyclerView.onMediaButtonEvent {
        private final TextView IconCompatParcelizer;
        private /* synthetic */ bp RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MediaBrowserCompatItemReceiver(bp bpVar, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.RemoteActionCompatParcelizer = bpVar;
            View viewFindViewById = view.findViewById(R.id.tvVideoWatchedStatus);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.IconCompatParcelizer = (TextView) viewFindViewById;
        }

        public final void RemoteActionCompatParcelizer(isTrafficRestricted.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesImplBaseParcelizer, "");
            String quantityString = this.itemView.getResources().getQuantityString(R.plurals.plural_subject_video_watched_count, audioAttributesImplBaseParcelizer.getRead(), Integer.valueOf(audioAttributesImplBaseParcelizer.getWrite()), Integer.valueOf(audioAttributesImplBaseParcelizer.getRead()));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString, "");
            this.IconCompatParcelizer.setText(quantityString);
        }
    }

    public class IconCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final finishedReadingChunk AudioAttributesCompatParcelizer;
        private /* synthetic */ bp write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(bp bpVar, finishedReadingChunk finishedreadingchunk) {
            super(finishedreadingchunk.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(finishedreadingchunk, "");
            this.write = bpVar;
            this.AudioAttributesCompatParcelizer = finishedreadingchunk;
        }

        public final void read(isTrafficRestricted.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatItemReceiver, "");
            TextView textView = this.AudioAttributesCompatParcelizer.read;
            Context context = this.AudioAttributesCompatParcelizer.IconCompatParcelizer().getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            textView.setText(read(context));
            TextView textView2 = this.AudioAttributesCompatParcelizer.IconCompatParcelizer;
            final bp bpVar = this.write;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: o.bo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bp.IconCompatParcelizer.IconCompatParcelizer(bpVar);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(bp bpVar) {
            bpVar.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer();
        }

        private static SpannableString read(Context context) {
            String string = context.getString(R.string.old_revision_switch_banner_subtext_prefix);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            String string2 = context.getString(R.string.old_revision_switch_banner_subtext);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            SpannableString spannableString = new SpannableString(string2);
            int length = string.length();
            CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context, R.attr.onSurfaceRed, 0, length - 1);
            CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context, R.attr.colorOnSurface, length, spannableString.length());
            return spannableString;
        }
    }

    public class write extends RecyclerView.onMediaButtonEvent {
        private final TextView AudioAttributesCompatParcelizer;
        private /* synthetic */ bp AudioAttributesImplApi21Parcelizer;
        private final LinearLayout IconCompatParcelizer;
        private final ImageButton RemoteActionCompatParcelizer;
        private final TextView read;
        private final TextView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(bp bpVar, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.AudioAttributesImplApi21Parcelizer = bpVar;
            View viewFindViewById = view.findViewById(R.id.tvAuthor);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.AudioAttributesCompatParcelizer = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tvAuthorDesignation);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.write = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tvAuthorIntro);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            this.read = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.llAuthorIntroduction);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            this.IconCompatParcelizer = (LinearLayout) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.ibAuthorIntro);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            this.RemoteActionCompatParcelizer = (ImageButton) viewFindViewById5;
        }

        public final void AudioAttributesCompatParcelizer(isTrafficRestricted.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            this.AudioAttributesCompatParcelizer.setText(audioAttributesCompatParcelizer.getWrite());
            this.write.setText(audioAttributesCompatParcelizer.getRead());
            this.read.setText(audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer());
            LinearLayout linearLayout = this.IconCompatParcelizer;
            final bp bpVar = this.AudioAttributesImplApi21Parcelizer;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.br
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bp.write.read(bpVar, this);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void read(bp bpVar, write writeVar) {
            bpVar.IconCompatParcelizer = !bpVar.IconCompatParcelizer;
            if (bpVar.IconCompatParcelizer) {
                bpVar.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer();
            } else {
                bpVar.AudioAttributesCompatParcelizer().read();
            }
            if (bpVar.IconCompatParcelizer) {
                writeVar.read.setMaxLines(Integer.MAX_VALUE);
                writeVar.read.setEllipsize(null);
                writeVar.RemoteActionCompatParcelizer.setImageDrawable(writeVar.itemView.getResources().getDrawable(R.drawable.ic_keyboard_arrow_up));
            } else {
                writeVar.read.setMaxLines(1);
                writeVar.read.setEllipsize(TextUtils.TruncateAt.END);
                writeVar.RemoteActionCompatParcelizer.setImageDrawable(writeVar.itemView.getResources().getDrawable(R.drawable.ic_arrow_down));
            }
        }
    }

    public class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ bp read;
        private final ComposeView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(bp bpVar, ComposeView composeView) {
            super(composeView);
            toMagicModuleMetaRepoModel.write(composeView, "");
            this.read = bpVar;
            this.write = composeView;
            composeView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            composeView.setViewCompositionStrategy(withPropertyNamingStrategy.AudioAttributesCompatParcelizer.INSTANCE);
        }

        public final void read(final isTrafficRestricted.read readVar) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            this.write.setContent(multiplyFft.IconCompatParcelizer(1035981859, true, new MagicModuleSubmissionRequestBody() { // from class: o.bt
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return bp.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(readVar, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup RemoteActionCompatParcelizer(final isTrafficRestricted.read readVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(1035981859, i, -1, "com.marrow2.ui.video.lesson_list.adapter.VideoListAdapter.VideoLessonHeaderViewHolder.onBind.<anonymous> (VideoListAdapter.kt:277)");
                }
                ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(342970019, true, new MagicModuleSubmissionRequestBody() { // from class: o.bu
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return bp.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(readVar, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(isTrafficRestricted.read readVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(342970019, i, -1, "com.marrow2.ui.video.lesson_list.adapter.VideoListAdapter.VideoLessonHeaderViewHolder.onBind.<anonymous>.<anonymous> (VideoListAdapter.kt:278)");
                }
                IntegrityDialogTypeCode.AudioAttributesCompatParcelizer(readVar.getAudioAttributesCompatParcelizer(), null, _handleunrecognizedcharacterescape, 0, 2);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
            return getShowPopup.INSTANCE;
        }
    }

    public class read extends RecyclerView.onMediaButtonEvent {
        private final ComposeView RemoteActionCompatParcelizer;
        private /* synthetic */ bp write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(bp bpVar, ComposeView composeView) {
            super(composeView);
            toMagicModuleMetaRepoModel.write(composeView, "");
            this.write = bpVar;
            this.RemoteActionCompatParcelizer = composeView;
            composeView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            composeView.setViewCompositionStrategy(withPropertyNamingStrategy.AudioAttributesCompatParcelizer.INSTANCE);
        }

        public final void read(final isTrafficRestricted.write writeVar) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            ComposeView composeView = this.RemoteActionCompatParcelizer;
            final bp bpVar = this.write;
            composeView.setContent(multiplyFft.IconCompatParcelizer(-1449831813, true, new MagicModuleSubmissionRequestBody() { // from class: o.bm
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return bp.read.read(writeVar, bpVar, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(final isTrafficRestricted.write writeVar, final bp bpVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-1449831813, i, -1, "com.marrow2.ui.video.lesson_list.adapter.VideoListAdapter.AnnouncementBannerViewHolder.onBind.<anonymous> (VideoListAdapter.kt:299)");
                }
                ThemeKt.read((AppTheme) null, false, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) multiplyFft.AudioAttributesCompatParcelizer(-291133445, true, new MagicModuleSubmissionRequestBody() { // from class: o.bl
                    @Override // kotlin.MagicModuleSubmissionRequestBody
                    public final Object invoke(Object obj, Object obj2) {
                        return bp.read.AudioAttributesCompatParcelizer(writeVar, bpVar, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                    }
                }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 3);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup AudioAttributesCompatParcelizer(isTrafficRestricted.write writeVar, final bp bpVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            getCreatedOnDateMs getcreatedondatems;
            if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
                _handleunrecognizedcharacterescape.onPrepareFromSearch();
            } else {
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesCompatParcelizer(-291133445, i, -1, "com.marrow2.ui.video.lesson_list.adapter.VideoListAdapter.AnnouncementBannerViewHolder.onBind.<anonymous>.<anonymous> (VideoListAdapter.kt:300)");
                }
                _handleOddName _handleoddnameAudioAttributesCompatParcelizer$default = getParentFragment.AudioAttributesCompatParcelizer$default(_handleOddName.INSTANCE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, assignParameter.IconCompatParcelizer(10.0f), 7, null);
                String remoteActionCompatParcelizer = writeVar.getRemoteActionCompatParcelizer();
                if (writeVar.getAudioAttributesCompatParcelizer()) {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1617264309);
                    boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(bpVar);
                    Object objOnPause = _handleunrecognizedcharacterescape.onPause();
                    if (zIconCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                        objOnPause = new getCreatedOnDateMs() { // from class: o.bn
                            @Override // kotlin.getCreatedOnDateMs
                            public final Object invoke() {
                                return bp.read.read(bpVar);
                            }
                        };
                        _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
                    }
                    getcreatedondatems = (getCreatedOnDateMs) objOnPause;
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    _handleunrecognizedcharacterescape.IconCompatParcelizer(-1617106581);
                    _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
                    getcreatedondatems = null;
                }
                setErrorIconTintList.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems, _handleoddnameAudioAttributesCompatParcelizer$default, _handleunrecognizedcharacterescape, RendererCapabilities.MODE_SUPPORT_MASK, 0);
                if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                    _validJsonValueList.AudioAttributesImplApi21Parcelizer();
                }
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final getShowPopup read(bp bpVar) {
            bpVar.AudioAttributesCompatParcelizer().write();
            return getShowPopup.INSTANCE;
        }
    }

    public class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final View AudioAttributesCompatParcelizer;
        private final TextView AudioAttributesImplApi21Parcelizer;
        private final ConstraintLayout AudioAttributesImplApi26Parcelizer;
        private final ProgressBar AudioAttributesImplBaseParcelizer;
        private final Chip IconCompatParcelizer;
        private final TextView MediaBrowserCompatCustomActionResultReceiver;
        private final ImageView MediaBrowserCompatItemReceiver;
        private final TextView MediaBrowserCompatMediaItem;
        private final TextView MediaBrowserCompatSearchResultReceiver;
        private final Chip MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private final ImageView MediaDescriptionCompat;
        private final ConstraintLayout MediaMetadataCompat;
        private final ImageView RatingCompat;
        private final View RemoteActionCompatParcelizer;
        private final TextView handleMediaPlayPauseIfPendingOnHandler;
        private final LinearLayout onAddQueueItem;
        private final ImageView onCommand;
        private final View onCustomAction;
        private final TextView onFastForward;
        private final ImageView onMediaButtonEvent;
        private final ImageView onPause;
        private final TextView onPlay;
        private final View onPlayFromMediaId;
        private final TextView onPlayFromSearch;
        private final TextView onPlayFromUri;
        private final LinearLayout onPrepare;
        private /* synthetic */ bp onPrepareFromSearch;
        private final View read;
        private final CardView write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(bp bpVar, View view) {
            super(view);
            toMagicModuleMetaRepoModel.write(view, "");
            this.onPrepareFromSearch = bpVar;
            View viewFindViewById = view.findViewById(R.id.cvMain);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            this.write = (CardView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.clLessonCard);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById2, "");
            this.MediaMetadataCompat = (ConstraintLayout) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tvLessonPosition);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById3, "");
            this.onPlayFromSearch = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.ivLesson);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById4, "");
            this.RatingCompat = (ImageView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.llProCard);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById5, "");
            this.onAddQueueItem = (LinearLayout) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.ivProLock);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById6, "");
            this.onCommand = (ImageView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.tvProTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById7, "");
            this.handleMediaPlayPauseIfPendingOnHandler = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.tvLessonTitle);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById8, "");
            this.onPlayFromUri = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.ivLessonComplete);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById9, "");
            this.MediaDescriptionCompat = (ImageView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.ivRating);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById10, "");
            this.onMediaButtonEvent = (ImageView) viewFindViewById10;
            View viewFindViewById11 = view.findViewById(R.id.tvRatingText);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById11, "");
            this.onPlay = (TextView) viewFindViewById11;
            View viewFindViewById12 = view.findViewById(R.id.tvVideoDuration);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById12, "");
            this.AudioAttributesImplApi21Parcelizer = (TextView) viewFindViewById12;
            View viewFindViewById13 = view.findViewById(R.id.ivPytTag);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById13, "");
            this.onPause = (ImageView) viewFindViewById13;
            View viewFindViewById14 = view.findViewById(R.id.tvMoreInfo);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById14, "");
            this.MediaBrowserCompatSearchResultReceiver = (TextView) viewFindViewById14;
            View viewFindViewById15 = view.findViewById(R.id.clDownloadView);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById15, "");
            this.AudioAttributesImplApi26Parcelizer = (ConstraintLayout) viewFindViewById15;
            View viewFindViewById16 = view.findViewById(R.id.pbDownloadProgress);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById16, "");
            this.AudioAttributesImplBaseParcelizer = (ProgressBar) viewFindViewById16;
            View viewFindViewById17 = view.findViewById(R.id.ivDownloaded);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById17, "");
            this.MediaBrowserCompatItemReceiver = (ImageView) viewFindViewById17;
            View viewFindViewById18 = view.findViewById(R.id.tvDownloadStatus);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById18, "");
            this.MediaBrowserCompatCustomActionResultReceiver = (TextView) viewFindViewById18;
            View viewFindViewById19 = view.findViewById(R.id.tvInternMode);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById19, "");
            this.MediaBrowserCompatMediaItem = (TextView) viewFindViewById19;
            View viewFindViewById20 = view.findViewById(R.id.llContinue);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById20, "");
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (Chip) viewFindViewById20;
            View viewFindViewById21 = view.findViewById(R.id.llComingSoon);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById21, "");
            this.IconCompatParcelizer = (Chip) viewFindViewById21;
            View viewFindViewById22 = view.findViewById(R.id.llVideoStats);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById22, "");
            this.onPrepare = (LinearLayout) viewFindViewById22;
            View viewFindViewById23 = view.findViewById(R.id.newTag);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById23, "");
            this.onCustomAction = viewFindViewById23;
            View viewFindViewById24 = view.findViewById(R.id.tvTagLabel);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById24, "");
            this.onFastForward = (TextView) viewFindViewById24;
            View viewFindViewById25 = view.findViewById(R.id.dividerPytTag);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById25, "");
            this.AudioAttributesCompatParcelizer = viewFindViewById25;
            View viewFindViewById26 = view.findViewById(R.id.dividerNewTag);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById26, "");
            this.read = viewFindViewById26;
            View viewFindViewById27 = view.findViewById(R.id.spaceNewTag);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById27, "");
            this.onPlayFromMediaId = viewFindViewById27;
            View viewFindViewById28 = view.findViewById(R.id.dividerDownloaded);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById28, "");
            this.RemoteActionCompatParcelizer = viewFindViewById28;
        }

        public final void RemoteActionCompatParcelizer(final isTrafficRestricted.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
            boolean ratingCompat = audioAttributesImplApi26Parcelizer.getRatingCompat();
            boolean z = audioAttributesImplApi26Parcelizer.getOnAddQueueItem() == 2;
            boolean z2 = audioAttributesImplApi26Parcelizer.getOnAddQueueItem() == 1;
            this.onPlayFromUri.setText(audioAttributesImplApi26Parcelizer.getHandleMediaPlayPauseIfPendingOnHandler());
            if (audioAttributesImplApi26Parcelizer.getMediaDescriptionCompat()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onCustomAction);
                this.onFastForward.setText(audioAttributesImplApi26Parcelizer.getOnPlay());
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.read);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onPlayFromMediaId);
            } else if (audioAttributesImplApi26Parcelizer.getMediaBrowserCompatMediaItem()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onCustomAction);
                this.onFastForward.setText(this.itemView.getResources().getString(R.string.label_new_tag));
                bytesRead.AudioAttributesImplApi21Parcelizer(this.read);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPlayFromMediaId);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCustomAction);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.read);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPlayFromMediaId);
            }
            setPreparePositionOverrideToUnpreparedMaskingPeriod.RemoteActionCompatParcelizer(this.itemView.getContext()).RemoteActionCompatParcelizer(audioAttributesImplApi26Parcelizer.getMediaMetadataCompat()).MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).IconCompatParcelizer(_isNaN.getDrawable(this.itemView.getContext(), R.drawable.ic_marrow_logo_blue)).RemoteActionCompatParcelizer(this.RatingCompat);
            if (ratingCompat && this.onPrepareFromSearch.RemoteActionCompatParcelizer) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onAddQueueItem);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onCommand);
            } else if (ratingCompat) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onAddQueueItem);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onCommand);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onAddQueueItem);
            }
            TextView textView = this.onPlay;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(audioAttributesImplApi26Parcelizer.getRead())}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            textView.setText(str);
            if (audioAttributesImplApi26Parcelizer.getRead() > BitmapDescriptorFactory.HUE_RED) {
                ImageView imageView = this.onMediaButtonEvent;
                imageView.setColorFilter(createExtractors.RemoteActionCompatParcelizer(imageView, R.attr.onSurfaceYellow), PorterDuff.Mode.SRC_IN);
            } else {
                ImageView imageView2 = this.onMediaButtonEvent;
                imageView2.setColorFilter(createExtractors.RemoteActionCompatParcelizer(imageView2, R.attr.onSurfaceBgOutline), PorterDuff.Mode.SRC_IN);
            }
            if (z) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaDescriptionCompat);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            } else if (z2) {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaDescriptionCompat);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaDescriptionCompat);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            }
            if (audioAttributesImplApi26Parcelizer.getMediaBrowserCompatCustomActionResultReceiver()) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPrepare);
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.onPrepare);
            }
            write(audioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer(), audioAttributesImplApi26Parcelizer.getWrite());
            this.AudioAttributesImplApi21Parcelizer.setText(TestGroupLSModel.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer.getMediaBrowserCompatItemReceiver(), (CharSequence) " video"));
            boolean z3 = this.onPrepareFromSearch.MediaBrowserCompatCustomActionResultReceiver;
            int i = R.attr.colorSurface;
            if (z3) {
                if (audioAttributesImplApi26Parcelizer.getAudioAttributesImplApi26Parcelizer()) {
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.onPause);
                    bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer);
                    CardView cardView = this.write;
                    cardView.setCardBackgroundColor(createExtractors.RemoteActionCompatParcelizer(cardView, R.attr.colorSurface));
                } else {
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.onPause);
                    bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer);
                    CardView cardView2 = this.write;
                    cardView2.setCardBackgroundColor(createExtractors.RemoteActionCompatParcelizer(cardView2, R.attr.backgroundColor));
                }
            } else {
                if (audioAttributesImplApi26Parcelizer.getIconCompatParcelizer() != null && audioAttributesImplApi26Parcelizer.getIconCompatParcelizer().write() == 2 && z) {
                    i = R.attr.colorSurfaceVariant10;
                }
                CardView cardView3 = this.write;
                cardView3.setCardBackgroundColor(createExtractors.RemoteActionCompatParcelizer(cardView3, i));
            }
            if (audioAttributesImplApi26Parcelizer.getOnPause() == 3) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatMediaItem);
                if (this.onPrepareFromSearch.write == 6) {
                    bytesRead.read(this.MediaBrowserCompatMediaItem, R.attr.subtext1);
                } else {
                    bytesRead.read(this.MediaBrowserCompatMediaItem, R.attr.subtext2);
                }
                TextView textView2 = this.MediaBrowserCompatMediaItem;
                textView2.setTextColor(createExtractors.RemoteActionCompatParcelizer(textView2, R.attr.onSurfaceBgLinks));
            } else {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatMediaItem);
            }
            int onFastForward = audioAttributesImplApi26Parcelizer.getOnFastForward() + 1;
            if (String.valueOf(onFastForward).length() >= 3) {
                this.onPlayFromSearch.setTextSize(2, 8.0f);
            } else {
                this.onPlayFromSearch.setTextSize(2, 10.0f);
            }
            this.onPlayFromSearch.setText(String.valueOf(onFastForward));
            ConstraintLayout constraintLayout = this.MediaMetadataCompat;
            final bp bpVar = this.onPrepareFromSearch;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o.bs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bp.RemoteActionCompatParcelizer.IconCompatParcelizer(bpVar, audioAttributesImplApi26Parcelizer);
                }
            });
            ConstraintLayout constraintLayout2 = this.AudioAttributesImplApi26Parcelizer;
            final bp bpVar2 = this.onPrepareFromSearch;
            constraintLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.bq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bp.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(bpVar2, audioAttributesImplApi26Parcelizer);
                }
            });
            TextView textView3 = this.MediaBrowserCompatSearchResultReceiver;
            final bp bpVar3 = this.onPrepareFromSearch;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: o.IntegrityDialogResponseCode
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bp.RemoteActionCompatParcelizer.IconCompatParcelizer(bpVar3);
                }
            });
            TextView textView4 = this.MediaBrowserCompatMediaItem;
            final bp bpVar4 = this.onPrepareFromSearch;
            textView4.setOnClickListener(new View.OnClickListener() { // from class: o.IntegrityErrorCode
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bp.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(bpVar4, audioAttributesImplApi26Parcelizer);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(bp bpVar, isTrafficRestricted.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            bpVar.AudioAttributesCompatParcelizer().write(audioAttributesImplApi26Parcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(bp bpVar, isTrafficRestricted.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            bpVar.AudioAttributesCompatParcelizer().write(audioAttributesImplApi26Parcelizer);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void IconCompatParcelizer(bp bpVar) {
            bpVar.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesImplBaseParcelizer(bp bpVar, isTrafficRestricted.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            bpVar.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer);
        }

        public final void write(int i, int i2) {
            if (i == -2) {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatItemReceiver);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi26Parcelizer);
                this.AudioAttributesImplBaseParcelizer.setProgress(i2);
                TextView textView = this.MediaBrowserCompatCustomActionResultReceiver;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str = String.format("Downloading %d%%", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
                textView.setText(str);
                return;
            }
            if (i == -1) {
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatItemReceiver);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.AudioAttributesImplApi26Parcelizer);
                this.AudioAttributesImplBaseParcelizer.setProgress(i2);
                if (!this.onPrepareFromSearch.read().invoke().booleanValue()) {
                    this.MediaBrowserCompatCustomActionResultReceiver.setText(this.itemView.getResources().getString(R.string.text_paused));
                    return;
                } else {
                    this.MediaBrowserCompatCustomActionResultReceiver.setText(this.itemView.getResources().getString(R.string.text_queued));
                    return;
                }
            }
            if (i == 1) {
                bytesRead.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatItemReceiver);
                bytesRead.AudioAttributesImplApi21Parcelizer(this.RemoteActionCompatParcelizer);
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer);
                this.MediaBrowserCompatCustomActionResultReceiver.setText(this.itemView.getResources().getString(R.string.label_downloaded));
                return;
            }
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesImplApi26Parcelizer);
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatItemReceiver);
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer);
        }
    }

    public final void IconCompatParcelizer(List<? extends isTrafficRestricted> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesImplBaseParcelizer = list;
        notifyDataSetChanged();
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
            return R.layout.item_video_header_card;
        }
        return -1;
    }

    @Override // kotlin.getProtocolVersion
    public final void write(View view, int i) {
        TextView textView;
        String audioAttributesCompatParcelizer;
        if (view == null || (textView = (TextView) view.findViewById(R.id.tvSubjectTitle)) == null) {
            return;
        }
        if (this.AudioAttributesImplBaseParcelizer.get(i) instanceof isTrafficRestricted.read) {
            isTrafficRestricted istrafficrestricted = this.AudioAttributesImplBaseParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(istrafficrestricted, "");
            audioAttributesCompatParcelizer = ((isTrafficRestricted.read) istrafficrestricted).getAudioAttributesCompatParcelizer();
        }
        textView.setText(audioAttributesCompatParcelizer);
    }

    @Override // kotlin.getProtocolVersion
    public final boolean RemoteActionCompatParcelizer(int i) {
        return this.AudioAttributesImplBaseParcelizer.get(i) instanceof isTrafficRestricted.read;
    }

    public final int read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int size = this.AudioAttributesImplBaseParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (this.AudioAttributesImplBaseParcelizer.get(i) instanceof isTrafficRestricted.read) {
                isTrafficRestricted istrafficrestricted = this.AudioAttributesImplBaseParcelizer.get(i);
                toMagicModuleMetaRepoModel.read(istrafficrestricted, "");
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) ((isTrafficRestricted.read) istrafficrestricted).getRemoteActionCompatParcelizer())) {
                    return i;
                }
            }
        }
        return 0;
    }

    public final void AudioAttributesCompatParcelizer(C0195r c0195r) {
        toMagicModuleMetaRepoModel.write(c0195r, "");
        this.MediaBrowserCompatCustomActionResultReceiver = c0195r.getRemoteActionCompatParcelizer();
        this.write = c0195r.getWrite();
        this.RemoteActionCompatParcelizer = c0195r.getAudioAttributesCompatParcelizer();
    }

    public final String write(int i) {
        if (this.AudioAttributesImplBaseParcelizer.get(i) instanceof isTrafficRestricted.read) {
            isTrafficRestricted istrafficrestricted = this.AudioAttributesImplBaseParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(istrafficrestricted, "");
            return PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(((isTrafficRestricted.read) istrafficrestricted).getRemoteActionCompatParcelizer());
        }
        if (this.AudioAttributesImplBaseParcelizer.get(i) instanceof isTrafficRestricted.AudioAttributesImplApi26Parcelizer) {
            isTrafficRestricted istrafficrestricted2 = this.AudioAttributesImplBaseParcelizer.get(i);
            toMagicModuleMetaRepoModel.read(istrafficrestricted2, "");
            return PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(((isTrafficRestricted.AudioAttributesImplApi26Parcelizer) istrafficrestricted2).getOnCustomAction());
        }
        return RemoteActionCompatParcelizer();
    }

    private final String RemoteActionCompatParcelizer() {
        for (isTrafficRestricted istrafficrestricted : this.AudioAttributesImplBaseParcelizer) {
            if (istrafficrestricted instanceof isTrafficRestricted.read) {
                return PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(((isTrafficRestricted.read) istrafficrestricted).getRemoteActionCompatParcelizer());
            }
        }
        return "";
    }

    public final void write(Pair<String, Integer> pair) {
        toMagicModuleMetaRepoModel.write(pair, "");
        for (isTrafficRestricted istrafficrestricted : this.AudioAttributesImplBaseParcelizer) {
            if ((istrafficrestricted instanceof isTrafficRestricted.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((isTrafficRestricted.AudioAttributesImplApi26Parcelizer) istrafficrestricted).getRemoteActionCompatParcelizer(), (Object) pair.write())) {
                int iIndexOf = this.AudioAttributesImplBaseParcelizer.indexOf(istrafficrestricted);
                if (pair.IconCompatParcelizer().intValue() == -2 || pair.IconCompatParcelizer().intValue() == -1) {
                    isTrafficRestricted istrafficrestricted2 = this.AudioAttributesImplBaseParcelizer.get(iIndexOf);
                    toMagicModuleMetaRepoModel.read(istrafficrestricted2, "");
                    ((isTrafficRestricted.AudioAttributesImplApi26Parcelizer) istrafficrestricted2).AudioAttributesCompatParcelizer(-1);
                    isTrafficRestricted istrafficrestricted3 = this.AudioAttributesImplBaseParcelizer.get(iIndexOf);
                    toMagicModuleMetaRepoModel.read(istrafficrestricted3, "");
                    ((isTrafficRestricted.AudioAttributesImplApi26Parcelizer) istrafficrestricted3).write(0);
                    notifyItemChanged(iIndexOf, new Pair(-1, 0));
                    return;
                }
                isTrafficRestricted istrafficrestricted4 = this.AudioAttributesImplBaseParcelizer.get(iIndexOf);
                toMagicModuleMetaRepoModel.read(istrafficrestricted4, "");
                isTrafficRestricted.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (isTrafficRestricted.AudioAttributesImplApi26Parcelizer) istrafficrestricted4;
                audioAttributesImplApi26Parcelizer.write(pair.IconCompatParcelizer().intValue());
                audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(pair.IconCompatParcelizer().intValue() >= 100 ? 1 : -2);
                notifyItemChanged(iIndexOf, new Pair(Integer.valueOf(audioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer()), Integer.valueOf(audioAttributesImplApi26Parcelizer.getWrite())));
                return;
            }
        }
    }

    public final void read(String str, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        for (isTrafficRestricted istrafficrestricted : this.AudioAttributesImplBaseParcelizer) {
            if (istrafficrestricted instanceof isTrafficRestricted.AudioAttributesImplApi26Parcelizer) {
                isTrafficRestricted.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (isTrafficRestricted.AudioAttributesImplApi26Parcelizer) istrafficrestricted;
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) audioAttributesImplApi26Parcelizer.getAudioAttributesImplApi21Parcelizer(), (Object) str)) {
                    audioAttributesImplApi26Parcelizer.read(i);
                    notifyItemChanged(this.AudioAttributesImplBaseParcelizer.indexOf(istrafficrestricted));
                    return;
                }
            }
        }
    }
}
