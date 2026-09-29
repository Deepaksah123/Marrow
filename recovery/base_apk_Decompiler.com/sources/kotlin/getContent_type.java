package kotlin;

import android.app.Application;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.ActivityAdapterModule;
import kotlin.FilterParamsCreator;
import kotlin.MarrowTheme;
import kotlin.MediaType;
import kotlin.ThemeKtExternalSyntheticLambda2;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes4.dex */
public final class getContent_type implements MarrowTheme {
    private final boolean AudioAttributesCompatParcelizer;
    private final FilterParamsCreator IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final ComplainRequestBody RemoteActionCompatParcelizer;
    private final Application read;
    private final FilterParamsCreator write;

    public getContent_type(Application application, FilterParamsCreator filterParamsCreator, FilterParamsCreator filterParamsCreator2, String str, ComplainRequestBody complainRequestBody, boolean z) {
        toMagicModuleMetaRepoModel.write(application, "");
        toMagicModuleMetaRepoModel.write(filterParamsCreator, "");
        toMagicModuleMetaRepoModel.write(filterParamsCreator2, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(complainRequestBody, "");
        this.read = application;
        this.write = filterParamsCreator;
        this.IconCompatParcelizer = filterParamsCreator2;
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.RemoteActionCompatParcelizer = complainRequestBody;
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // kotlin.MarrowTheme
    public final C0156TypeKt AudioAttributesCompatParcelizer(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        return read(audioAttributesCompatParcelizer, audioAttributesCompatParcelizer.IconCompatParcelizer());
    }

    public final C0156TypeKt read(MarrowTheme.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) throws JSONException, IOException {
        JSONObject jSONObjectOptJSONObject;
        String strOptString;
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
        C0156TypeKt c0156TypeKtRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(themeKtExternalSyntheticLambda0));
        ActivityAdapterModule body = c0156TypeKtRemoteActionCompatParcelizer.getBody();
        toMagicModuleMetaRepoModel.write(body);
        LessonCompletedDialog lessonCompletedDialogAudioAttributesCompatParcelizer = body.AudioAttributesCompatParcelizer();
        lessonCompletedDialogAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(Long.MAX_VALUE);
        resetCurrentSelectedPosition resetcurrentselectedposition = lessonCompletedDialogAudioAttributesCompatParcelizer.read();
        Charset charsetAudioAttributesCompatParcelizer = getTaskStatus.AudioAttributesCompatParcelizer();
        MediaType mediaTypeWrite = body.write();
        if (mediaTypeWrite != null) {
            charsetAudioAttributesCompatParcelizer = mediaTypeWrite.read(getTaskStatus.AudioAttributesCompatParcelizer());
        }
        resetCurrentSelectedPosition resetcurrentselectedpositionClone = resetcurrentselectedposition.clone();
        toMagicModuleMetaRepoModel.write(charsetAudioAttributesCompatParcelizer);
        try {
            JSONObject jSONObject = new JSONObject(resetcurrentselectedpositionClone.write(charsetAudioAttributesCompatParcelizer));
            if (!jSONObject.has("error_msg") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("data")) != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("data");
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("enc_data") : null;
                String read = FilterParamsCreator.AudioAttributesCompatParcelizer.getRead();
                if (jSONObjectOptJSONObject2 != null && (strOptString = jSONObjectOptJSONObject2.optString("enc_version", FilterParamsCreator.AudioAttributesCompatParcelizer.getRead())) != null) {
                    read = strOptString;
                }
                String str = strOptString2;
                if (str != null && str.length() != 0) {
                    String read2 = this.IconCompatParcelizer.getRead();
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) read, (Object) FilterParamsCreator.AudioAttributesCompatParcelizer.getRead())) {
                        read = read2;
                    }
                }
                themeKtExternalSyntheticLambda0.getUrl();
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) read, (Object) FilterParamsCreator.AudioAttributesCompatParcelizer.getRead())) {
                    getError_types geterror_types = getError_types.INSTANCE;
                    String strWrite = getError_types.write(themeKtExternalSyntheticLambda0.AudioAttributesCompatParcelizer("Dr-Dv"), themeKtExternalSyntheticLambda0.AudioAttributesCompatParcelizer("Dr-Platform"));
                    if (strOptString2 != null && strOptString2.length() > 0) {
                        FilterParamsCreator.Companion companion = FilterParamsCreator.INSTANCE;
                        FilterParamsCreator filterParamsCreatorAudioAttributesCompatParcelizer = FilterParamsCreator.Companion.AudioAttributesCompatParcelizer(read);
                        if (filterParamsCreatorAudioAttributesCompatParcelizer == FilterParamsCreator.MediaBrowserCompatItemReceiver) {
                            strWrite = this.MediaBrowserCompatCustomActionResultReceiver;
                        }
                        jSONObjectOptJSONObject.put("data", new JSONTokener(CustomModuleQuotaModelKt.read.write(this.read, filterParamsCreatorAudioAttributesCompatParcelizer, themeKtExternalSyntheticLambda0.getUrl().toString(), strWrite, strOptString2, this.AudioAttributesCompatParcelizer)).nextValue());
                        jSONObject.put("data", jSONObjectOptJSONObject);
                        ActivityAdapterModule.Companion companion2 = ActivityAdapterModule.INSTANCE;
                        String string = jSONObject.toString();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                        MediaType.write writeVar = MediaType.write;
                        return c0156TypeKtRemoteActionCompatParcelizer.MediaDescriptionCompat().write(ActivityAdapterModule.Companion.read(string, MediaType.write.AudioAttributesCompatParcelizer("media-type"))).IconCompatParcelizer();
                    }
                }
            }
            return c0156TypeKtRemoteActionCompatParcelizer;
        } catch (getNoOfQuestions e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", -44);
            jSONObject2.put("error_msg", message);
            String string2 = jSONObject2.toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            ActivityAdapterModule.Companion companion3 = ActivityAdapterModule.INSTANCE;
            MediaType.write writeVar2 = MediaType.write;
            return c0156TypeKtRemoteActionCompatParcelizer.MediaDescriptionCompat().write(ActivityAdapterModule.Companion.read(string2, MediaType.write.AudioAttributesCompatParcelizer("media-type"))).IconCompatParcelizer();
        }
    }

    private final ThemeKtExternalSyntheticLambda0 AudioAttributesCompatParcelizer(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) throws IOException {
        FilterParamsCreator filterParamsCreator;
        if (TestGroupLSModel.read("POST", themeKtExternalSyntheticLambda0.getMethod(), true) || TestGroupLSModel.read("PUT", themeKtExternalSyntheticLambda0.getMethod(), true)) {
            resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
            ThemeKtExternalSyntheticLambda2 body = themeKtExternalSyntheticLambda0.getBody();
            toMagicModuleMetaRepoModel.write(body);
            body.writeTo(resetcurrentselectedposition);
            Charset charsetAudioAttributesCompatParcelizer = getTaskStatus.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetAudioAttributesCompatParcelizer, "");
            String strWrite = resetcurrentselectedposition.write(charsetAudioAttributesCompatParcelizer);
            try {
                String strAudioAttributesCompatParcelizer = themeKtExternalSyntheticLambda0.AudioAttributesCompatParcelizer("Dr-Dv-Ts");
                JSONObject jSONObject = new JSONObject(strWrite);
                jSONObject.put("dr_dv_ts", strAudioAttributesCompatParcelizer);
                ComplainRequestBody complainRequestBody = this.RemoteActionCompatParcelizer;
                String string = jSONObject.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                String strIconCompatParcelizer = complainRequestBody.read(string, strAudioAttributesCompatParcelizer);
                if (strIconCompatParcelizer != null) {
                    filterParamsCreator = FilterParamsCreator.MediaBrowserCompatCustomActionResultReceiver;
                } else {
                    strIconCompatParcelizer = IconCompatParcelizer(themeKtExternalSyntheticLambda0, jSONObject);
                    filterParamsCreator = this.write;
                }
                String read = filterParamsCreator.getRead();
                StringBuilder sb = new StringBuilder("{\"enc_data\": \"");
                sb.append(strIconCompatParcelizer);
                sb.append("\", \"enc_version\": ");
                sb.append(read);
                sb.append("}");
                String string2 = sb.toString();
                ThemeKtExternalSyntheticLambda2.Companion companion = ThemeKtExternalSyntheticLambda2.INSTANCE;
                MediaType.write writeVar = MediaType.write;
                return themeKtExternalSyntheticLambda0.MediaBrowserCompatItemReceiver().IconCompatParcelizer(RtspHeaders.CONTENT_TYPE, "application/json; charset=utf-8").IconCompatParcelizer(ThemeKtExternalSyntheticLambda2.Companion.write(string2, MediaType.write.AudioAttributesCompatParcelizer("media-type"))).RemoteActionCompatParcelizer();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return themeKtExternalSyntheticLambda0.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer();
    }

    private final String IconCompatParcelizer(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0, JSONObject jSONObject) {
        getError_types geterror_types = getError_types.INSTANCE;
        String strAudioAttributesCompatParcelizer = getError_types.AudioAttributesCompatParcelizer(themeKtExternalSyntheticLambda0);
        CustomModuleQuotaModelKt customModuleQuotaModelKt = CustomModuleQuotaModelKt.read;
        return CustomModuleQuotaModelKt.AudioAttributesCompatParcelizer(this.write, strAudioAttributesCompatParcelizer, jSONObject.toString());
    }
}
