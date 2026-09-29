package kotlin;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import com.marrow.R;
import com.marrow.TrainingApplication;
import kotlin.ResolvableApiException;
import kotlin.getLatestBitrateEstimate;
import kotlin.getSampleFormats;

/* JADX INFO: loaded from: classes3.dex */
@getRenewGrpId
public final class getCurrentContentTitle implements View.OnClickListener {
    private final getSampleFormats AudioAttributesCompatParcelizer;
    private final TrainingApplication AudioAttributesImplApi21Parcelizer;
    private final View AudioAttributesImplBaseParcelizer;
    private final RenewEligible IconCompatParcelizer;
    private final ChunkHolder MediaBrowserCompatCustomActionResultReceiver;
    private final getStreamPositionUsForContent RemoteActionCompatParcelizer;
    private final RenewEligible read;
    private final write write;

    public interface write {
        void onSetCaptioningEnabled();
    }

    public getCurrentContentTitle(View view, write writeVar) throws Throwable {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        this.AudioAttributesImplBaseParcelizer = view;
        this.write = writeVar;
        TrainingApplication trainingApplication = TrainingApplication.read();
        this.AudioAttributesImplApi21Parcelizer = trainingApplication;
        this.read = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.drawPlayhead
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getCurrentContentTitle.read(this.AudioAttributesCompatParcelizer);
            }
        });
        this.AudioAttributesCompatParcelizer = trainingApplication.MediaBrowserCompatSearchResultReceiver();
        this.RemoteActionCompatParcelizer = trainingApplication.MediaDescriptionCompat();
        this.MediaBrowserCompatCustomActionResultReceiver = trainingApplication.MediaMetadataCompat();
        this.IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.getCurrentLargeIcon
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getCurrentContentTitle.write(this.RemoteActionCompatParcelizer));
            }
        });
    }

    private final Context IconCompatParcelizer() {
        Object objRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objRemoteActionCompatParcelizer, "");
        return (Context) objRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context read(getCurrentContentTitle getcurrentcontenttitle) {
        return getcurrentcontenttitle.AudioAttributesImplBaseParcelizer.getContext();
    }

    private final boolean read() {
        return ((Boolean) this.IconCompatParcelizer.RemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean write(getCurrentContentTitle getcurrentcontenttitle) {
        return getcurrentcontenttitle.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver();
    }

    public final void RemoteActionCompatParcelizer() {
        String string;
        TextView textView = (TextView) this.AudioAttributesImplBaseParcelizer.findViewById(R.id.plan_get_callback);
        if (read()) {
            string = textView.getContext().getString(R.string.text_get_callback_pro);
        } else {
            string = textView.getContext().getString(R.string.text_get_callback_free);
        }
        textView.setText(string);
        getCurrentContentTitle getcurrentcontenttitle = this;
        textView.setOnClickListener(getcurrentcontenttitle);
        ((TextView) this.AudioAttributesImplBaseParcelizer.findViewById(R.id.plan_faq)).setOnClickListener(getcurrentcontenttitle);
        ((TextView) this.AudioAttributesImplBaseParcelizer.findViewById(R.id.plan_refund_policy)).setOnClickListener(getcurrentcontenttitle);
        ((TextView) this.AudioAttributesImplBaseParcelizer.findViewById(R.id.plan_privacy_policy)).setOnClickListener(getcurrentcontenttitle);
        ((TextView) this.AudioAttributesImplBaseParcelizer.findViewById(R.id.plan_support)).setOnClickListener(getcurrentcontenttitle);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        switch (view.getId()) {
            case R.id.plan_faq /* 2131363498 */:
                String string = IconCompatParcelizer().getString(R.string.f_url_faq);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                ResolvableApiException.Companion companion = ResolvableApiException.INSTANCE;
                IconCompatParcelizer().startActivity(ResolvableApiException.Companion.read(IconCompatParcelizer(), new canceledPendingResult(string, "FAQs", null, 4, null)));
                break;
            case R.id.plan_get_callback /* 2131363500 */:
                getLatestBitrateEstimate.write(!read());
                getLatestBitrateEstimate.write.write();
                if (read()) {
                    write();
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jMediaBrowserCompatItemReceiver = this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver("key_last_callback");
                    getSampleFormats getsampleformats = this.AudioAttributesCompatParcelizer;
                    getSampleFormats.Companion companion2 = getSampleFormats.INSTANCE;
                    if (jCurrentTimeMillis - jMediaBrowserCompatItemReceiver >= parseEac3SupplementalProperties.read(getsampleformats.read(getSampleFormats.Companion.write()))) {
                        this.write.onSetCaptioningEnabled();
                    } else {
                        getLastChunkDurationUs getlastchunkdurationus = new getLastChunkDurationUs(IconCompatParcelizer(), 0, 2, null);
                        String string2 = IconCompatParcelizer().getString(R.string.text_already_callback_active);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                        getlastchunkdurationus.read(string2);
                        getlastchunkdurationus.show();
                    }
                }
                break;
            case R.id.plan_privacy_policy /* 2131363503 */:
                ResolvableApiException.Companion companion3 = ResolvableApiException.INSTANCE;
                IconCompatParcelizer().startActivity(ResolvableApiException.Companion.read(IconCompatParcelizer(), new canceledPendingResult("https://www.marrow.com/home/privacy-policy", "Privacy", null, 4, null)));
                break;
            case R.id.plan_refund_policy /* 2131363506 */:
                String string3 = IconCompatParcelizer().getString(R.string.f_url_refund_policy, Integer.valueOf(this.RemoteActionCompatParcelizer.onRemoveQueueItem()));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                ResolvableApiException.Companion companion4 = ResolvableApiException.INSTANCE;
                IconCompatParcelizer().startActivity(ResolvableApiException.Companion.read(IconCompatParcelizer(), new canceledPendingResult(string3, "Refund Policy", null, 4, null)));
                break;
            case R.id.plan_support /* 2131363507 */:
                String strAudioAttributesCompatParcelizer = DefaultTimeBarExternalSyntheticLambda0.AudioAttributesCompatParcelizer(IconCompatParcelizer(), this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver() ? R.array.app_name_f_send_email_title_support_pro : R.array.app_name_f_send_email_title_support_free, this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
                Context context = this.AudioAttributesImplBaseParcelizer.getContext();
                String strAudioAttributesCompatParcelizer2 = parseDuration.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer.getContext());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer2, "");
                Context applicationContext = IconCompatParcelizer().getApplicationContext();
                toMagicModuleMetaRepoModel.read(applicationContext, "");
                String email = ((TrainingApplication) applicationContext).getLoggedUser().getEmail();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(email, "");
                scheduleUpdate.AudioAttributesCompatParcelizer(context, "support@marrowmed.com", strAudioAttributesCompatParcelizer, populateHttpRequestHeaders.AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer2, email, this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver()));
                break;
        }
    }

    private final void write() {
        Context contextIconCompatParcelizer = IconCompatParcelizer();
        String string = contextIconCompatParcelizer.getString(R.string.support_email);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String string2 = contextIconCompatParcelizer.getString(R.string.f_send_email_title_pro);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        Context applicationContext = contextIconCompatParcelizer.getApplicationContext();
        toMagicModuleMetaRepoModel.read(applicationContext, "");
        String strAsSingleEntity = ((TrainingApplication) applicationContext).getLoggedUser().getInfo().getPhoneNumber().asSingleEntity();
        String string3 = contextIconCompatParcelizer.getString(R.string.f_get_callback, strAsSingleEntity);
        String str = read(strAsSingleEntity);
        StringBuilder sb = new StringBuilder();
        sb.append(string3);
        sb.append("\n\n");
        sb.append(str);
        scheduleUpdate.AudioAttributesCompatParcelizer(IconCompatParcelizer(), string, string2, sb.toString());
    }

    private final String read(String str) {
        String str2 = Build.MANUFACTURER;
        String str3 = Build.DEVICE;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" - ");
        sb.append(str3);
        String string = sb.toString();
        String string2 = this.MediaBrowserCompatCustomActionResultReceiver.write().toString();
        String str4 = Build.VERSION.RELEASE;
        Context applicationContext = IconCompatParcelizer().getApplicationContext();
        toMagicModuleMetaRepoModel.read(applicationContext, "");
        return IconCompatParcelizer().getString(R.string.f_get_callback_email_signature, string, str, string2, "12.0.0", "496", str4, ((TrainingApplication) applicationContext).getLoggedUser().getEmail());
    }
}
