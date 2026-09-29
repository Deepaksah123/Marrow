package kotlin;

import android.content.Context;
import android.content.Intent;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.marrow.R;
import com.marrow.designsystem.theme.AppThemeManager;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.CeaDecoderExternalSyntheticLambda0;
import kotlin.CmcdHeadersFactoryCmcdStatusBuilder;
import kotlin.Metadata;
import kotlin.buildDownloadCompletedNotification;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiApiOptionsNotRequiredOptions extends RecyclerView.onMediaButtonEvent {
    private ApiApiOptionsNoOptions AudioAttributesCompatParcelizer;
    private final TextView AudioAttributesImplApi21Parcelizer;
    private final TextView AudioAttributesImplApi26Parcelizer;
    private final TextView AudioAttributesImplBaseParcelizer;
    private enqueue IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final View MediaBrowserCompatItemReceiver;
    private final WebView RatingCompat;
    private final ConstraintLayout RemoteActionCompatParcelizer;
    private final ImageView read;
    private final RecyclerView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiApiOptionsNotRequiredOptions(View view) {
        super(view);
        toMagicModuleMetaRepoModel.write(view, "");
        this.AudioAttributesImplApi26Parcelizer = (TextView) view.findViewById(R.id.tvTitle);
        this.AudioAttributesImplBaseParcelizer = (TextView) view.findViewById(R.id.tvQuestion);
        this.read = (ImageView) view.findViewById(R.id.ivImage);
        this.write = (RecyclerView) view.findViewById(R.id.rvOptions);
        this.MediaBrowserCompatItemReceiver = view.findViewById(R.id.viewVerticalDivider);
        this.AudioAttributesImplApi21Parcelizer = (TextView) view.findViewById(R.id.tvSubjectTitle);
        this.RatingCompat = (WebView) view.findViewById(R.id.webView);
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.RemoteActionCompatParcelizer = (ConstraintLayout) view.findViewById(R.id.clSeeExplanation);
    }

    public final void IconCompatParcelizer(final enqueue enqueueVar, final getAnswerMap<? super setMapper, getShowPopup> getanswermap, final getAnswerMap<? super zaq, getShowPopup> getanswermap2) {
        String str;
        toMagicModuleMetaRepoModel.write(enqueueVar, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.IconCompatParcelizer = enqueueVar;
        this.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getEndpointPackageName
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ApiApiOptionsNotRequiredOptions.IconCompatParcelizer(getanswermap, enqueueVar, this);
            }
        });
        if (enqueueVar.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().length() > 0) {
            this.AudioAttributesImplApi26Parcelizer.setText(enqueueVar.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer());
            View view = this.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(view);
            TextView textView = this.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(textView);
        } else {
            this.AudioAttributesImplApi26Parcelizer.setText(this.itemView.getContext().getText(R.string.label_mcq_of_the_day));
            View view2 = this.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(view2);
            TextView textView2 = this.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(textView2);
            this.AudioAttributesImplApi21Parcelizer.setText(this.itemView.getContext().getString(R.string.featured_mcq_header_title_with_lesson_number, enqueueVar.onFastForward(), Integer.valueOf(enqueueVar.MediaBrowserCompatSearchResultReceiver())));
        }
        this.AudioAttributesImplBaseParcelizer.setText(enqueueVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        if (enqueueVar.onAddQueueItem().length() > 0) {
            WebView webView = this.RatingCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(webView, "");
            bytesRead.AudioAttributesImplApi21Parcelizer(webView);
            String strRemoteActionCompatParcelizer = new newYearNameItem("</strong>").RemoteActionCompatParcelizer(new newYearNameItem("<strong>").RemoteActionCompatParcelizer(enqueueVar.onAddQueueItem(), "<b>"), "</b>");
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
            String str2 = String.format(Locale.getDefault(), "<HTML><HEAD><LINK href=\"css/%s\" type=\"text/css\" rel=\"stylesheet\"/></HEAD><body>%s</body></HTML>", Arrays.copyOf(new Object[]{CmcdHeadersFactoryCmcdRequest.IconCompatParcelizer(AppThemeManager.read()), strRemoteActionCompatParcelizer}, 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            this.RatingCompat.addJavascriptInterface(new AudioAttributesCompatParcelizer(), "img");
            if (AppThemeManager.write()) {
                str = "#313434";
            } else {
                str = "#FFFFFF";
            }
            String str3 = TestGroupLSModel.read(str2, "<img ", "<img onclick=\"img.performClick(this.src);\" ", false);
            StringBuilder sb = new StringBuilder("<HTML style=\"background-color: ");
            sb.append(str);
            sb.append(";\">");
            this.RatingCompat.loadDataWithBaseURL("file:///android_asset/", TestGroupLSModel.read(str3, "<HTML>", sb.toString(), false), "text/html", "utf-8", null);
        } else {
            WebView webView2 = this.RatingCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(webView2, "");
            bytesRead.MediaBrowserCompatCustomActionResultReceiver(webView2);
        }
        String strOnMediaButtonEvent = enqueueVar.onMediaButtonEvent();
        if (strOnMediaButtonEvent.length() == 0) {
            strOnMediaButtonEvent = enqueueVar.handleMediaPlayPauseIfPendingOnHandler();
        }
        final String str4 = strOnMediaButtonEvent;
        ImageView imageView = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        imageView.setVisibility(str4.length() > 0 ? 0 : 8);
        buildDownloadCompletedNotification.AudioAttributesCompatParcelizer(this.read, str4, new buildDownloadCompletedNotification.IconCompatParcelizer() { // from class: o.getRemoteService
            @Override // o.buildDownloadCompletedNotification.IconCompatParcelizer
            public final void read(boolean z, ImageView imageView2) {
                ApiApiOptionsNotRequiredOptions.write(enqueueVar, z, imageView2);
            }
        });
        this.read.setOnClickListener(new View.OnClickListener() { // from class: o.getLastDisconnectMessage
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ApiApiOptionsNotRequiredOptions.write(this.IconCompatParcelizer, str4);
            }
        });
        ApiApiOptionsNoOptions apiApiOptionsNoOptions = new ApiApiOptionsNoOptions(new getAnswerMap() { // from class: o.disconnect
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ApiApiOptionsNotRequiredOptions.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, getanswermap2, ((Integer) obj).intValue());
            }
        }, enqueueVar);
        this.AudioAttributesCompatParcelizer = apiApiOptionsNoOptions;
        this.write.setAdapter(apiApiOptionsNoOptions);
        read(enqueueVar.onCustomAction());
        read(enqueueVar.onCommand());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getAnswerMap getanswermap, enqueue enqueueVar, ApiApiOptionsNotRequiredOptions apiApiOptionsNotRequiredOptions) {
        getanswermap.invoke(new setMapper(enqueueVar.AudioAttributesImplBaseParcelizer(), enqueueVar.RatingCompat(), enqueueVar.onPlayFromMediaId(), enqueueVar.onFastForward(), enqueueVar.MediaBrowserCompatMediaItem(), enqueueVar.MediaBrowserCompatSearchResultReceiver(), enqueueVar.MediaBrowserCompatItemReceiver(), apiApiOptionsNotRequiredOptions.MediaBrowserCompatCustomActionResultReceiver, enqueueVar.MediaDescriptionCompat(), enqueueVar.MediaMetadataCompat() == apiApiOptionsNotRequiredOptions.MediaBrowserCompatCustomActionResultReceiver));
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/ApiApiOptionsNotRequiredOptions$AudioAttributesCompatParcelizer;", "", "", "p0", "", "performClick", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        AudioAttributesCompatParcelizer() {
        }

        @JavascriptInterface
        public final void performClick(String p0) {
            Intent intentRemoteActionCompatParcelizer;
            Context context = ApiApiOptionsNotRequiredOptions.this.itemView.getContext();
            if (p0 != null) {
                CeaDecoderExternalSyntheticLambda0.Companion companion = CeaDecoderExternalSyntheticLambda0.INSTANCE;
                toMagicModuleMetaRepoModel.write(context);
                intentRemoteActionCompatParcelizer = CeaDecoderExternalSyntheticLambda0.Companion.RemoteActionCompatParcelizer(context, p0);
            } else {
                intentRemoteActionCompatParcelizer = null;
            }
            context.startActivity(intentRemoteActionCompatParcelizer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(enqueue enqueueVar, boolean z, ImageView imageView) {
        toMagicModuleMetaRepoModel.write(imageView, "");
        if (z) {
            buildDownloadCompletedNotification.read(imageView, enqueueVar.AudioAttributesImplApi21Parcelizer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(ApiApiOptionsNotRequiredOptions apiApiOptionsNotRequiredOptions, String str) {
        CmcdHeadersFactoryCmcdStatusBuilder.Companion companion = CmcdHeadersFactoryCmcdStatusBuilder.INSTANCE;
        Context context = apiApiOptionsNotRequiredOptions.itemView.getContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        CmcdHeadersFactoryCmcdStatusBuilder.Companion.RemoteActionCompatParcelizer(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(ApiApiOptionsNotRequiredOptions apiApiOptionsNotRequiredOptions, getAnswerMap getanswermap, int i) {
        apiApiOptionsNotRequiredOptions.MediaBrowserCompatCustomActionResultReceiver = i;
        ConstraintLayout constraintLayout = apiApiOptionsNotRequiredOptions.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(constraintLayout);
        enqueue enqueueVar = apiApiOptionsNotRequiredOptions.IconCompatParcelizer;
        enqueue enqueueVar2 = null;
        if (enqueueVar == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            enqueueVar = null;
        }
        if (enqueueVar.onPlay()) {
            apiApiOptionsNotRequiredOptions.IconCompatParcelizer();
        }
        enqueue enqueueVar3 = apiApiOptionsNotRequiredOptions.IconCompatParcelizer;
        if (enqueueVar3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            enqueueVar3 = null;
        }
        String strMediaDescriptionCompat = enqueueVar3.MediaDescriptionCompat();
        enqueue enqueueVar4 = apiApiOptionsNotRequiredOptions.IconCompatParcelizer;
        if (enqueueVar4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            enqueueVar4 = null;
        }
        String strRatingCompat = enqueueVar4.RatingCompat();
        enqueue enqueueVar5 = apiApiOptionsNotRequiredOptions.IconCompatParcelizer;
        if (enqueueVar5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            enqueueVar5 = null;
        }
        String strOnPlayFromMediaId = enqueueVar5.onPlayFromMediaId();
        enqueue enqueueVar6 = apiApiOptionsNotRequiredOptions.IconCompatParcelizer;
        if (enqueueVar6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            enqueueVar2 = enqueueVar6;
        }
        getanswermap.invoke(new zaq(strMediaDescriptionCompat, strRatingCompat, strOnPlayFromMediaId, i, i == enqueueVar2.MediaMetadataCompat()));
        return getShowPopup.INSTANCE;
    }

    private final void read(List<GoogleApiClient> list) {
        ApiApiOptionsNoOptions apiApiOptionsNoOptions = this.AudioAttributesCompatParcelizer;
        if (apiApiOptionsNoOptions != null) {
            apiApiOptionsNoOptions.RemoteActionCompatParcelizer(list);
        }
    }

    private final void IconCompatParcelizer() {
        Object systemService = this.itemView.getContext().getSystemService("vibrator");
        toMagicModuleMetaRepoModel.read(systemService, "");
        ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(100L, -1));
    }

    public final void RemoteActionCompatParcelizer(Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        if (obj instanceof enqueue) {
            enqueue enqueueVar = (enqueue) obj;
            RemoteActionCompatParcelizer(enqueueVar.onCustomAction());
            read(enqueueVar.onCommand());
        }
    }

    private final void RemoteActionCompatParcelizer(List<GoogleApiClient> list) {
        if (list != null) {
            read(list);
        }
    }

    private final void read(boolean z) {
        ConstraintLayout constraintLayout = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        constraintLayout.setVisibility(z ? 0 : 8);
    }
}
