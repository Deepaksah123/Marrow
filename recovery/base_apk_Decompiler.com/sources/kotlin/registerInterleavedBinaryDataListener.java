package kotlin;

import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import in.juspay.hyper.constants.LogSubCategory;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class registerInterleavedBinaryDataListener {
    private static JSONObject write(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    private static String IconCompatParcelizer(String str) {
        return str == null ? "" : str;
    }

    public static final int IconCompatParcelizer(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private static long RemoteActionCompatParcelizer(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    private static int read(Boolean bool) {
        if (bool == null) {
            return -1;
        }
        return bool.booleanValue() ? 1 : 0;
    }

    private static String IconCompatParcelizer(byte[] bArr) {
        return IconCompatParcelizer(bArr != null ? getCurrentSampleSize.RemoteActionCompatParcelizer().read(bArr) : null);
    }

    private static String AudioAttributesCompatParcelizer(byte[] bArr) {
        return IconCompatParcelizer(bArr != null ? getCurrentSampleSize.IconCompatParcelizer().read(bArr) : null);
    }

    private static String IconCompatParcelizer(BigInteger bigInteger) {
        toMagicModuleMetaRepoModel.write(bigInteger, "");
        return IconCompatParcelizer(bigInteger.toByteArray());
    }

    private static JSONObject IconCompatParcelizer(addMessageLine addmessageline) throws JSONException {
        if (addmessageline == null) {
            return AudioAttributesCompatParcelizer();
        }
        JSONObject jSONObject = new JSONObject();
        byte[] bArr = addmessageline.read();
        jSONObject.put("verified_boot_key", bArr != null ? IconCompatParcelizer(bArr) : null);
        jSONObject.put("verified_boot_state", addMessageLine.read(addmessageline.AudioAttributesCompatParcelizer()));
        jSONObject.put("verified_boot_hash", IconCompatParcelizer(addmessageline.IconCompatParcelizer()));
        jSONObject.put("is_device_locked", addmessageline.RemoteActionCompatParcelizer());
        jSONObject.put("is_generated", true);
        return jSONObject;
    }

    private static final JSONObject AudioAttributesCompatParcelizer() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("verified_boot_key", "NA");
        jSONObject.put("verified_boot_state", "Unknown");
        jSONObject.put("verified_boot_hash", "NA");
        jSONObject.put("is_device_locked", false);
        jSONObject.put("is_generated", false);
        return jSONObject;
    }

    private static JSONObject RemoteActionCompatParcelizer(RtspMessageChannelMessageListener rtspMessageChannelMessageListener) throws JSONException {
        toMagicModuleMetaRepoModel.write(rtspMessageChannelMessageListener, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("certificate_issuer", rtspMessageChannelMessageListener.write());
        jSONObject.put("certificate_status", rtspMessageChannelMessageListener.MediaBrowserCompatCustomActionResultReceiver());
        BigInteger serialNumber = rtspMessageChannelMessageListener.AudioAttributesCompatParcelizer().getSerialNumber();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(serialNumber, "");
        jSONObject.put("subject_serial_num", IconCompatParcelizer(serialNumber));
        jSONObject.put("subject_name", rtspMessageChannelMessageListener.AudioAttributesCompatParcelizer().getSubjectDN().getName());
        jSONObject.put("subject", rtspMessageChannelMessageListener.AudioAttributesCompatParcelizer().getSubjectDN().toString());
        jSONObject.put("public_key", AudioAttributesCompatParcelizer(rtspMessageChannelMessageListener.AudioAttributesCompatParcelizer().getPublicKey().getEncoded()));
        if (rtspMessageChannelMessageListener.MediaBrowserCompatCustomActionResultReceiver() == 1 && rtspMessageChannelMessageListener.RemoteActionCompatParcelizer() != null) {
            jSONObject.put("cert_ex_title", rtspMessageChannelMessageListener.RemoteActionCompatParcelizer().getClass().getSimpleName());
            jSONObject.put("cert_ex_msg", String.valueOf(rtspMessageChannelMessageListener.RemoteActionCompatParcelizer().getMessage()));
        }
        return jSONObject;
    }

    private static JSONObject read(processMPEG4FmtpAttribute processmpeg4fmtpattribute) throws JSONException {
        toMagicModuleMetaRepoModel.write(processmpeg4fmtpattribute, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("attestation_version", processmpeg4fmtpattribute.read);
        jSONObject.put("keymaster_version", processmpeg4fmtpattribute.write);
        jSONObject.put("keymaster_security_level", processmpeg4fmtpattribute.RemoteActionCompatParcelizer);
        jSONObject.put("attestation_challenge_base64", AudioAttributesCompatParcelizer(processmpeg4fmtpattribute.IconCompatParcelizer));
        jSONObject.put("unique_id_base64", AudioAttributesCompatParcelizer(processmpeg4fmtpattribute.AudioAttributesImplApi21Parcelizer));
        RtspMessageChannelInterleavedBinaryDataListener rtspMessageChannelInterleavedBinaryDataListener = processmpeg4fmtpattribute.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener, "");
        jSONObject.put("software_enforced", AudioAttributesCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener));
        RtspMessageChannelInterleavedBinaryDataListener rtspMessageChannelInterleavedBinaryDataListener2 = processmpeg4fmtpattribute.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener2, "");
        jSONObject.put("tee_enforced", AudioAttributesCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener2));
        return jSONObject;
    }

    private static JSONObject AudioAttributesCompatParcelizer(RtspMessageChannelInterleavedBinaryDataListener rtspMessageChannelInterleavedBinaryDataListener) throws JSONException {
        toMagicModuleMetaRepoModel.write(rtspMessageChannelInterleavedBinaryDataListener, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("algorithm", RtspMessageChannelInterleavedBinaryDataListener.RemoteActionCompatParcelizer(IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.read())));
        jSONObject.put("key_size", IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onAddQueueItem()));
        jSONObject.put("purposes", RtspMessageChannelInterleavedBinaryDataListener.IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onPlayFromUri()));
        jSONObject.put("digests", RtspMessageChannelInterleavedBinaryDataListener.write(rtspMessageChannelInterleavedBinaryDataListener.MediaMetadataCompat()));
        jSONObject.put("padding_modes", RtspMessageChannelInterleavedBinaryDataListener.AudioAttributesCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onPrepareFromMediaId()));
        jSONObject.put("ec_curve", RtspMessageChannelInterleavedBinaryDataListener.write(Integer.valueOf(IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.MediaBrowserCompatSearchResultReceiver()))));
        jSONObject.put("rsa_public_exponent", RemoteActionCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onSeekTo()));
        jSONObject.put("mgf_digests", RtspMessageChannelInterleavedBinaryDataListener.write(rtspMessageChannelInterleavedBinaryDataListener.onPause()));
        Boolean boolRatingCompat = rtspMessageChannelInterleavedBinaryDataListener.RatingCompat();
        jSONObject.put("early_boot_only", boolRatingCompat != null ? Integer.valueOf(read(boolRatingCompat)) : null);
        jSONObject.put("active_date_time", RtspMessageChannelInterleavedBinaryDataListener.IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.AudioAttributesCompatParcelizer()));
        jSONObject.put("origination_expire_date_time", RtspMessageChannelInterleavedBinaryDataListener.IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onPlayFromMediaId()));
        jSONObject.put("usage_expire_date_time", RtspMessageChannelInterleavedBinaryDataListener.IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onStop()));
        jSONObject.put("usage_count_limit", IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onSkipToNext()));
        jSONObject.put("no_auth_required", read(rtspMessageChannelInterleavedBinaryDataListener.onPlay()));
        jSONObject.put("user_auth_type", RtspMessageChannelInterleavedBinaryDataListener.AudioAttributesCompatParcelizer(IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onSkipToQueueItem())));
        jSONObject.put("auth_timeout", IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.AudioAttributesImplApi26Parcelizer()));
        jSONObject.put("allow_while_on_body", read(rtspMessageChannelInterleavedBinaryDataListener.RemoteActionCompatParcelizer()));
        jSONObject.put("all_applications", read(rtspMessageChannelInterleavedBinaryDataListener.IconCompatParcelizer()));
        jSONObject.put("application_id", IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.write()));
        jSONObject.put("creation_date_time", RtspMessageChannelInterleavedBinaryDataListener.IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.AudioAttributesImplApi21Parcelizer()));
        jSONObject.put("origin", RtspMessageChannelInterleavedBinaryDataListener.IconCompatParcelizer(IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onMediaButtonEvent())));
        jSONObject.put("rollback_resistant", read(rtspMessageChannelInterleavedBinaryDataListener.onRewind()));
        jSONObject.put("rollback_resistance", read(rtspMessageChannelInterleavedBinaryDataListener.onRemoveQueueItem()));
        addMessageLine addmessagelineOnRemoveQueueItemAt = rtspMessageChannelInterleavedBinaryDataListener.onRemoveQueueItemAt();
        jSONObject.put("root_of_trust", addmessagelineOnRemoveQueueItemAt != null ? IconCompatParcelizer(addmessagelineOnRemoveQueueItemAt) : null);
        jSONObject.put("os_version", IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onPrepareFromSearch()));
        jSONObject.put("os_patch_level", IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onPrepare()));
        jSONObject.put("vendor_patch_level", IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.onSkipToPrevious()));
        jSONObject.put("boot_patch_level", IconCompatParcelizer(rtspMessageChannelInterleavedBinaryDataListener.MediaBrowserCompatCustomActionResultReceiver()));
        processH265FmtpAttribute processh265fmtpattributeAudioAttributesImplBaseParcelizer = rtspMessageChannelInterleavedBinaryDataListener.AudioAttributesImplBaseParcelizer();
        jSONObject.put("attestation_application_id", IconCompatParcelizer(processh265fmtpattributeAudioAttributesImplBaseParcelizer != null ? processh265fmtpattributeAudioAttributesImplBaseParcelizer.toString() : null));
        jSONObject.put("trusted_user_presence_req", read(rtspMessageChannelInterleavedBinaryDataListener.onSetPlaybackSpeed()));
        jSONObject.put("trusted_confirmation_req", read(rtspMessageChannelInterleavedBinaryDataListener.onSetShuffleMode()));
        jSONObject.put("unlocked_device_req", read(rtspMessageChannelInterleavedBinaryDataListener.onSetRepeatMode()));
        jSONObject.put("device_unique_attestation", read(rtspMessageChannelInterleavedBinaryDataListener.MediaBrowserCompatMediaItem()));
        jSONObject.put("identity_credential_key", read(rtspMessageChannelInterleavedBinaryDataListener.onCustomAction()));
        jSONObject.put("brand", rtspMessageChannelInterleavedBinaryDataListener.MediaBrowserCompatItemReceiver());
        jSONObject.put(LogSubCategory.Context.DEVICE, rtspMessageChannelInterleavedBinaryDataListener.MediaDescriptionCompat());
        jSONObject.put("product", rtspMessageChannelInterleavedBinaryDataListener.onPlayFromSearch());
        jSONObject.put("serial_number", rtspMessageChannelInterleavedBinaryDataListener.onSetRating());
        jSONObject.put("imei", rtspMessageChannelInterleavedBinaryDataListener.onCommand());
        jSONObject.put("second_imei", rtspMessageChannelInterleavedBinaryDataListener.onPrepareFromUri());
        jSONObject.put("meid", rtspMessageChannelInterleavedBinaryDataListener.handleMediaPlayPauseIfPendingOnHandler());
        jSONObject.put("manufacturer", rtspMessageChannelInterleavedBinaryDataListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        jSONObject.put("model", rtspMessageChannelInterleavedBinaryDataListener.onFastForward());
        return jSONObject;
    }

    private static JSONArray IconCompatParcelizer(List<? extends RtspMessageChannelMessageListener> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(RemoteActionCompatParcelizer((RtspMessageChannelMessageListener) it.next()));
        }
        return jSONArray;
    }

    private static JSONObject read(onInterleavedBinaryDataReceived oninterleavedbinarydatareceived) throws JSONException {
        toMagicModuleMetaRepoModel.write(oninterleavedbinarydatareceived, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("root_of_trust", IconCompatParcelizer(oninterleavedbinarydatareceived.AudioAttributesCompatParcelizer()));
        List<RtspMessageChannelMessageListener> list = oninterleavedbinarydatareceived.read();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(list, "");
        jSONObject.put("certificates", IconCompatParcelizer(list));
        processMPEG4FmtpAttribute processmpeg4fmtpattribute = oninterleavedbinarydatareceived.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(processmpeg4fmtpattribute, "");
        jSONObject.put("attestation", read(processmpeg4fmtpattribute));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("status", oninterleavedbinarydatareceived.IconCompatParcelizer());
        jSONObject2.put("full_info", jSONObject);
        return jSONObject2;
    }

    private static JSONObject AudioAttributesCompatParcelizer(parseNextLine parsenextline) throws JSONException {
        Class<?> cls;
        toMagicModuleMetaRepoModel.write(parsenextline, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_code", parsenextline.getWrite());
        jSONObject.put(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, IconCompatParcelizer(parsenextline.getMessage()));
        Throwable cause = parsenextline.getCause();
        jSONObject.put("error_title", IconCompatParcelizer((cause == null || (cls = cause.getClass()) == null) ? null : cls.getSimpleName()));
        return jSONObject;
    }

    public static final JSONObject write(processH264FmtpAttribute processh264fmtpattribute) throws JSONException {
        toMagicModuleMetaRepoModel.write(processh264fmtpattribute, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("generation_is_successful", processh264fmtpattribute.write());
        if (processh264fmtpattribute.write()) {
            onInterleavedBinaryDataReceived oninterleavedbinarydatareceivedRemoteActionCompatParcelizer = processh264fmtpattribute.RemoteActionCompatParcelizer();
            jSONObject.put("data", write(oninterleavedbinarydatareceivedRemoteActionCompatParcelizer != null ? read(oninterleavedbinarydatareceivedRemoteActionCompatParcelizer) : null));
            return jSONObject;
        }
        parseNextLine parsenextline = processh264fmtpattribute.read();
        jSONObject.put("data", write(parsenextline != null ? AudioAttributesCompatParcelizer(parsenextline) : null));
        return jSONObject;
    }

    public static final processH264FmtpAttribute write(onInterleavedBinaryDataReceived oninterleavedbinarydatareceived) {
        toMagicModuleMetaRepoModel.write(oninterleavedbinarydatareceived, "");
        return new processH264FmtpAttribute(oninterleavedbinarydatareceived);
    }

    public static final processH264FmtpAttribute RemoteActionCompatParcelizer(parseNextLine parsenextline) {
        toMagicModuleMetaRepoModel.write(parsenextline, "");
        return new processH264FmtpAttribute(parsenextline);
    }
}
