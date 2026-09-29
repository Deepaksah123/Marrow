package kotlin;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.AppMeasurementSdkEventInterceptor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0015\u0019\u0017\u001cB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b"}, d2 = {"Lo/AppMeasurementSdkEventInterceptor;", "Landroidx/recyclerview/widget/RecyclerView$IconCompatParcelizer;", "Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "Lo/AppMeasurementSdkEventInterceptor$AudioAttributesCompatParcelizer;", "p0", "<init>", "(Lo/AppMeasurementSdkEventInterceptor$AudioAttributesCompatParcelizer;)V", "Landroid/view/ViewGroup;", "", "p1", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$onMediaButtonEvent;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", "Lo/uncaughtException;", "read", "(Ljava/util/List;Ljava/util/List;)V", "IconCompatParcelizer", "Lo/AppMeasurementSdkEventInterceptor$AudioAttributesCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/AppMeasurementSdkEventInterceptor$AudioAttributesCompatParcelizer;", "Ljava/util/List;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppMeasurementSdkEventInterceptor extends RecyclerView.IconCompatParcelizer<RecyclerView.onMediaButtonEvent> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private List<uncaughtException> RemoteActionCompatParcelizer;
    private final AudioAttributesCompatParcelizer IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private List<uncaughtException> read;

    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer(String str, String str2, int i);
    }

    public AppMeasurementSdkEventInterceptor(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.IconCompatParcelizer = audioAttributesCompatParcelizer;
        this.read = new ArrayList();
        this.RemoteActionCompatParcelizer = new ArrayList();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final AudioAttributesCompatParcelizer getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(p0.getContext());
        if (p1 == 1) {
            HlsMediaPeriodSampleStreamWrapperCallback hlsMediaPeriodSampleStreamWrapperCallbackAudioAttributesCompatParcelizer = HlsMediaPeriodSampleStreamWrapperCallback.AudioAttributesCompatParcelizer(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsMediaPeriodSampleStreamWrapperCallbackAudioAttributesCompatParcelizer, "");
            return new IconCompatParcelizer(this, hlsMediaPeriodSampleStreamWrapperCallbackAudioAttributesCompatParcelizer);
        }
        if (p1 == 2) {
            FilteringHlsPlaylistParserFactory filteringHlsPlaylistParserFactory = FilteringHlsPlaylistParserFactory.read(layoutInflaterFrom, p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(filteringHlsPlaylistParserFactory, "");
            return new RemoteActionCompatParcelizer(this, filteringHlsPlaylistParserFactory);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final void onBindViewHolder(RecyclerView.onMediaButtonEvent p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        uncaughtException uncaughtexception = this.read.get(p1);
        int itemViewType = p0.getItemViewType();
        if (itemViewType == 1) {
            ((IconCompatParcelizer) p0).IconCompatParcelizer(uncaughtexception);
        } else {
            if (itemViewType != 2) {
                return;
            }
            ((RemoteActionCompatParcelizer) p0).read();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.read.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemViewType(int p0) {
        return this.read.get(p0).getMediaBrowserCompatSearchResultReceiver();
    }

    public final void read(List<uncaughtException> p0, List<uncaughtException> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        List<uncaughtException> list = p0;
        if (list.isEmpty()) {
            list = p1;
        }
        this.read = list;
        this.RemoteActionCompatParcelizer = p1;
        notifyDataSetChanged();
    }

    public final class RemoteActionCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ AppMeasurementSdkEventInterceptor IconCompatParcelizer;
        private final FilteringHlsPlaylistParserFactory write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor, FilteringHlsPlaylistParserFactory filteringHlsPlaylistParserFactory) {
            super(filteringHlsPlaylistParserFactory.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(filteringHlsPlaylistParserFactory, "");
            this.IconCompatParcelizer = appMeasurementSdkEventInterceptor;
            this.write = filteringHlsPlaylistParserFactory;
        }

        public final void read() {
            LinearLayout linearLayout = this.write.IconCompatParcelizer;
            final AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor = this.IconCompatParcelizer;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: o.setException
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppMeasurementSdkEventInterceptor.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(appMeasurementSdkEventInterceptor);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor) {
            appMeasurementSdkEventInterceptor.read = appMeasurementSdkEventInterceptor.RemoteActionCompatParcelizer;
            appMeasurementSdkEventInterceptor.notifyDataSetChanged();
        }
    }

    public final class IconCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private final HlsMediaPeriodSampleStreamWrapperCallback RemoteActionCompatParcelizer;
        private /* synthetic */ AppMeasurementSdkEventInterceptor read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor, HlsMediaPeriodSampleStreamWrapperCallback hlsMediaPeriodSampleStreamWrapperCallback) {
            super(hlsMediaPeriodSampleStreamWrapperCallback.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(hlsMediaPeriodSampleStreamWrapperCallback, "");
            this.read = appMeasurementSdkEventInterceptor;
            this.RemoteActionCompatParcelizer = hlsMediaPeriodSampleStreamWrapperCallback;
        }

        public final void IconCompatParcelizer(final uncaughtException uncaughtexception) {
            toMagicModuleMetaRepoModel.write(uncaughtexception, "");
            HlsMediaPeriodSampleStreamWrapperCallback hlsMediaPeriodSampleStreamWrapperCallback = this.RemoteActionCompatParcelizer;
            final AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor = this.read;
            hlsMediaPeriodSampleStreamWrapperCallback.AudioAttributesImplApi21Parcelizer.setText(uncaughtexception.getAudioAttributesImplApi26Parcelizer());
            if (uncaughtexception.getMediaBrowserCompatCustomActionResultReceiver() > 0) {
                TextView textView = hlsMediaPeriodSampleStreamWrapperCallback.AudioAttributesImplBaseParcelizer;
                String string = this.itemView.getResources().getString(R.string.f_score_out_of_total_score, uncaughtexception.getRead(), Integer.valueOf(uncaughtexception.getMediaBrowserCompatCustomActionResultReceiver()));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                textView.setText(AudioAttributesCompatParcelizer(string, uncaughtexception.getRead(), String.valueOf(uncaughtexception.getMediaBrowserCompatCustomActionResultReceiver())));
            } else {
                TextView textView2 = hlsMediaPeriodSampleStreamWrapperCallback.AudioAttributesImplBaseParcelizer;
                String string2 = this.itemView.getResources().getString(R.string.f_score_out_of_no_total_score, uncaughtexception.getRead());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                textView2.setText(RemoteActionCompatParcelizer(string2, uncaughtexception.getRead()));
            }
            if (uncaughtexception.getMediaBrowserCompatItemReceiver() > 0) {
                LinearLayout linearLayout = hlsMediaPeriodSampleStreamWrapperCallback.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(linearLayout);
                hlsMediaPeriodSampleStreamWrapperCallback.IconCompatParcelizer.setProgress(uncaughtexception.getMediaBrowserCompatItemReceiver());
                hlsMediaPeriodSampleStreamWrapperCallback.MediaBrowserCompatCustomActionResultReceiver.setText(String.valueOf(uncaughtexception.getMediaBrowserCompatItemReceiver()));
            } else {
                LinearLayout linearLayout2 = hlsMediaPeriodSampleStreamWrapperCallback.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(linearLayout2);
            }
            if (uncaughtexception.getMediaDescriptionCompat()) {
                TextView textView3 = hlsMediaPeriodSampleStreamWrapperCallback.MediaBrowserCompatItemReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(textView3);
                hlsMediaPeriodSampleStreamWrapperCallback.MediaBrowserCompatItemReceiver.setText(this.itemView.getResources().getString(R.string.text_subject_percentile_label_strongest));
            } else if (uncaughtexception.getMediaMetadataCompat()) {
                TextView textView4 = hlsMediaPeriodSampleStreamWrapperCallback.MediaBrowserCompatItemReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView4, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(textView4);
                hlsMediaPeriodSampleStreamWrapperCallback.MediaBrowserCompatItemReceiver.setText(this.itemView.getResources().getString(R.string.text_subject_percentile_label_weakest));
            } else {
                TextView textView5 = hlsMediaPeriodSampleStreamWrapperCallback.MediaBrowserCompatItemReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView5, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView5);
            }
            hlsMediaPeriodSampleStreamWrapperCallback.RemoteActionCompatParcelizer.setText(this.itemView.getResources().getString(R.string.f_score_screen_correct_count, Integer.valueOf(uncaughtexception.getWrite())));
            hlsMediaPeriodSampleStreamWrapperCallback.MediaDescriptionCompat.setText(this.itemView.getResources().getString(R.string.f_score_screen_wrong_count, Integer.valueOf(uncaughtexception.getRemoteActionCompatParcelizer())));
            hlsMediaPeriodSampleStreamWrapperCallback.write.setText(this.itemView.getResources().getString(R.string.f_score_screen_skipped_count, Integer.valueOf(uncaughtexception.getAudioAttributesCompatParcelizer())));
            TextView textView6 = hlsMediaPeriodSampleStreamWrapperCallback.read;
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(uncaughtexception.getAudioAttributesImplBaseParcelizer())}, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            textView6.setText(str);
            hlsMediaPeriodSampleStreamWrapperCallback.AudioAttributesImplApi26Parcelizer.setText(String.valueOf(uncaughtexception.getIconCompatParcelizer()));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.zzfmzza
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppMeasurementSdkEventInterceptor.IconCompatParcelizer.AudioAttributesCompatParcelizer(appMeasurementSdkEventInterceptor, uncaughtexception);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(AppMeasurementSdkEventInterceptor appMeasurementSdkEventInterceptor, uncaughtException uncaughtexception) {
            AudioAttributesCompatParcelizer iconCompatParcelizer = appMeasurementSdkEventInterceptor.getIconCompatParcelizer();
            String audioAttributesImplApi21Parcelizer = uncaughtexception.getAudioAttributesImplApi21Parcelizer();
            String ratingCompat = uncaughtexception.getRatingCompat();
            Iterator it = appMeasurementSdkEventInterceptor.RemoteActionCompatParcelizer.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((uncaughtException) it.next()).getAudioAttributesImplApi21Parcelizer(), (Object) uncaughtexception.getAudioAttributesImplApi21Parcelizer())) {
                    break;
                } else {
                    i++;
                }
            }
            iconCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesImplApi21Parcelizer, ratingCompat, i + 1);
        }

        private final SpannableString RemoteActionCompatParcelizer(String str, String str2) {
            String str3 = str;
            SpannableString spannableString = new SpannableString(str3);
            int i = TestGroupLSModel.read((CharSequence) str3, str2, 0, false, 6);
            int length = str2.length() + i;
            Context context = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            dispatchTouchEvent.write(spannableString, context, R.color.very_dark_blue, i, length);
            Context context2 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
            String string = this.itemView.getResources().getString(R.string.font_roboto_bold);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            dispatchTouchEvent.read(spannableString, context2, string, i, length);
            return spannableString;
        }

        private final SpannableString AudioAttributesCompatParcelizer(String str, String str2, String str3) {
            String str4 = str;
            SpannableString spannableString = new SpannableString(str4);
            int i = TestGroupLSModel.read((CharSequence) str4, str2, 0, false, 6);
            int length = str2.length() + i;
            int i2 = TestGroupLSModel.read((CharSequence) str4, str3, length, false, 4);
            int length2 = str3.length() + i2;
            Context context = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context, i, length);
            Context context2 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context2, "");
            CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context2, R.attr.onBackgroundSurface1, i, length);
            Context context3 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context3, "");
            CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context3, i2, length2);
            Context context4 = this.itemView.getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context4, "");
            CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(spannableString, context4, R.attr.onBackgroundSurface1, i2, length2);
            return spannableString;
        }
    }
}
