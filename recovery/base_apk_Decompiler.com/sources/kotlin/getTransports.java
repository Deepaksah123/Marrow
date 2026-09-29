package kotlin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.BrowserPublicKeyCredentialCreationOptions;
import kotlin.getPublicKeyCredentialCreationOptions;
import kotlin.getTransports;

/* JADX INFO: loaded from: classes4.dex */
public final class getTransports extends RecyclerView.IconCompatParcelizer<AudioAttributesCompatParcelizer> {
    private final getAnswerMap<BrowserPublicKeyCredentialCreationOptions, getShowPopup> AudioAttributesCompatParcelizer;
    private List<getPublicKeyCredentialCreationOptions.read> read;

    /* JADX WARN: Multi-variable type inference failed */
    public getTransports(getAnswerMap<? super BrowserPublicKeyCredentialCreationOptions, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = getanswermap;
        this.read = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
        return IconCompatParcelizer(viewGroup);
    }

    public final class AudioAttributesCompatParcelizer extends RecyclerView.onMediaButtonEvent {
        private /* synthetic */ getTransports IconCompatParcelizer;
        private final MagicModuleSubmissionRequestBody<String, String, getShowPopup> RemoteActionCompatParcelizer;
        private final setTimestampAdjusterInitializationTimeoutMs read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer(getTransports gettransports, setTimestampAdjusterInitializationTimeoutMs settimestampadjusterinitializationtimeoutms, MagicModuleSubmissionRequestBody<? super String, ? super String, getShowPopup> magicModuleSubmissionRequestBody) {
            super(settimestampadjusterinitializationtimeoutms.IconCompatParcelizer());
            toMagicModuleMetaRepoModel.write(settimestampadjusterinitializationtimeoutms, "");
            toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
            this.IconCompatParcelizer = gettransports;
            this.read = settimestampadjusterinitializationtimeoutms;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        public final void AudioAttributesCompatParcelizer(final getPublicKeyCredentialCreationOptions.read readVar) {
            toMagicModuleMetaRepoModel.write(readVar, "");
            setTimestampAdjusterInitializationTimeoutMs settimestampadjusterinitializationtimeoutms = this.read;
            getTransports gettransports = this.IconCompatParcelizer;
            settimestampadjusterinitializationtimeoutms.RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getErrorCodeAsInt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getTransports.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.write, readVar);
                }
            });
            settimestampadjusterinitializationtimeoutms.AudioAttributesCompatParcelizer.setText(readVar.RemoteActionCompatParcelizer());
            TextView textView = settimestampadjusterinitializationtimeoutms.write;
            int iIconCompatParcelizer = readVar.IconCompatParcelizer();
            int iWrite = readVar.write();
            StringBuilder sb = new StringBuilder();
            sb.append(iIconCompatParcelizer);
            sb.append("/");
            sb.append(iWrite);
            sb.append(" modules");
            textView.setText(sb.toString());
            ImageView imageView = settimestampadjusterinitializationtimeoutms.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            CmcdHeadersFactoryCmcdSessionBuilder.read(imageView, readVar.read(), false);
            settimestampadjusterinitializationtimeoutms.read.setText(String.valueOf(getBindingAdapterPosition() + 1));
            View view = settimestampadjusterinitializationtimeoutms.AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            view.setVisibility(getBindingAdapterPosition() != 0 ? 0 : 8);
            View view2 = settimestampadjusterinitializationtimeoutms.MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
            view2.setVisibility(getBindingAdapterPosition() == gettransports.getItemCount() + (-1) ? 8 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getPublicKeyCredentialCreationOptions.read readVar) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer.invoke(readVar.AudioAttributesCompatParcelizer(), readVar.RemoteActionCompatParcelizer());
        }
    }

    private AudioAttributesCompatParcelizer IconCompatParcelizer(ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        setTimestampAdjusterInitializationTimeoutMs settimestampadjusterinitializationtimeoutmsAudioAttributesCompatParcelizer = setTimestampAdjusterInitializationTimeoutMs.AudioAttributesCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(settimestampadjusterinitializationtimeoutmsAudioAttributesCompatParcelizer, "");
        return new AudioAttributesCompatParcelizer(this, settimestampadjusterinitializationtimeoutmsAudioAttributesCompatParcelizer, new MagicModuleSubmissionRequestBody() { // from class: o.AuthenticatorErrorResponse
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return getTransports.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (String) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getTransports gettransports, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        gettransports.AudioAttributesCompatParcelizer.invoke(new BrowserPublicKeyCredentialCreationOptions.AudioAttributesImplApi21Parcelizer(str, str2));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, int i) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.read.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
    public final int getItemCount() {
        return this.read.size();
    }

    public final void AudioAttributesCompatParcelizer(List<getPublicKeyCredentialCreationOptions.read> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = list;
        notifyDataSetChanged();
    }
}
