package kotlin;

import android.content.Context;
import kotlin.StdKeySerializers;
import kotlin.ThemeKtExternalSyntheticLambda3;
import kotlin.idFromClass;

/* JADX INFO: loaded from: classes3.dex */
public final class isValid {
    private final WebViewSubtitleOutput1 AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private final TrackSelectionViewTrackInfo RemoteActionCompatParcelizer;
    private final RenewEligible read;

    @setSdkPayload
    public isValid(Context context, WebViewSubtitleOutput1 webViewSubtitleOutput1, TrackSelectionViewTrackInfo trackSelectionViewTrackInfo) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(webViewSubtitleOutput1, "");
        toMagicModuleMetaRepoModel.write(trackSelectionViewTrackInfo, "");
        this.IconCompatParcelizer = context;
        this.AudioAttributesCompatParcelizer = webViewSubtitleOutput1;
        this.RemoteActionCompatParcelizer = trackSelectionViewTrackInfo;
        this.read = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.destroy
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return isValid.read(this.RemoteActionCompatParcelizer);
            }
        });
    }

    private final ThemeKtExternalSyntheticLambda3 write() {
        return (ThemeKtExternalSyntheticLambda3) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThemeKtExternalSyntheticLambda3 read(isValid isvalid) {
        return new ThemeKtExternalSyntheticLambda3.AudioAttributesCompatParcelizer().IconCompatParcelizer(isvalid.RemoteActionCompatParcelizer.read()).IconCompatParcelizer(isvalid.RemoteActionCompatParcelizer.onCustomAction()).IconCompatParcelizer(isvalid.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer();
    }

    public final StdKeySerializers.AudioAttributesCompatParcelizer IconCompatParcelizer() {
        ReferenceTypeSerializer referenceTypeSerializerAudioAttributesCompatParcelizer = new ReferenceTypeSerializer(this.IconCompatParcelizer).AudioAttributesCompatParcelizer(new idFromClass.read(write()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(referenceTypeSerializerAudioAttributesCompatParcelizer, "");
        return referenceTypeSerializerAudioAttributesCompatParcelizer;
    }
}
