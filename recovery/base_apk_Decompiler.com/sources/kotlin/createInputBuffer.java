package kotlin;

import android.os.Build;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.LinkedList;
import kotlin.getDrmErrorCode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class createInputBuffer extends setOffloadBufferDurationUs {
    public final updateSessionsWithTimelineChange AudioAttributesCompatParcelizer;
    private shouldUseBypass RemoteActionCompatParcelizer;
    private boolean read;
    public final access402 write;

    public createInputBuffer(byte[] bArr, boolean z) {
        String strOptString;
        shouldUseBypass shouldusebypass = new shouldUseBypass();
        super(bArr);
        this.read = z;
        this.RemoteActionCompatParcelizer = shouldusebypass;
        try {
            JSONObject jSONObject = new JSONObject(bArr != null ? new String(bArr, getSubmissionTimestamp.IconCompatParcelizer) : "{}");
            strOptString = jSONObject.optString(DecoderInputBufferInsufficientCapacityException.MediaBrowserCompatMediaItem);
            try {
                if (jSONObject.has(DecoderInputBufferInsufficientCapacityException.MediaMetadataCompat)) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(strOptString, jSONObject);
                } else {
                    this.write = IconCompatParcelizer(strOptString, jSONObject);
                }
            } catch (Exception unused) {
                this.write = null;
                this.AudioAttributesCompatParcelizer = new maybeAddSessions(strOptString, null, 2, null);
            }
        } catch (Exception unused2) {
            strOptString = "";
        }
    }

    private updateSessionsWithTimelineChange AudioAttributesCompatParcelizer(String str, JSONObject jSONObject) throws JSONException {
        String str2 = DecoderInputBufferInsufficientCapacityException.MediaMetadataCompat;
        String strOptString = jSONObject.getJSONObject(str2).optString(DecoderInputBufferInsufficientCapacityException.MediaDescriptionCompat);
        String strWrite = buildAacLcAudioSpecificConfig.write(DecoderInputBufferInsufficientCapacityException.RatingCompat, jSONObject.getJSONObject(str2));
        toMagicModuleMetaRepoModel.write((Object) strOptString);
        switch (strOptString.hashCode()) {
            case -1990169961:
                if (strOptString.equals("TooManyRequests")) {
                    if (strWrite == null) {
                        strWrite = "Too many requests, rate limit exceeded";
                    }
                    return new maybeReportPlaybackStateChange(str, strWrite);
                }
                break;
            case -1303088388:
                if (strOptString.equals("SubscriptionNotActive")) {
                    if (strWrite == null) {
                        strWrite = "Subscription is not active";
                    }
                    return new maybeReportPlaybackError(str, strWrite);
                }
                break;
            case -1156046805:
                if (strOptString.equals("ProxyIntegrationSecretEnvironmentMismatch")) {
                    if (strWrite == null) {
                        strWrite = "Proxy integration secret environment mismatch";
                    }
                    return new getErrorInfo(str, strWrite);
                }
                break;
            case -1101868394:
                if (strOptString.equals("InstallationMethodRestricted")) {
                    if (strWrite == null) {
                        strWrite = "The installation method of the agent is not allowed for the customer";
                    }
                    return new maybeSetWindowSequenceNumber(str, strWrite);
                }
                break;
            case -681021288:
                if (strOptString.equals("TokenRequired")) {
                    if (strWrite == null) {
                        strWrite = "API key required";
                    }
                    return new belongsToSession(str, strWrite);
                }
                break;
            case -93106615:
                if (strOptString.equals("InvalidProxyIntegrationHeaders")) {
                    if (strWrite == null) {
                        strWrite = "Invalid proxy integration headers";
                    }
                    return new isFinishedAtEventTime(str, strWrite);
                }
                break;
            case -20338522:
                if (strOptString.equals("RequestCannotBeParsed")) {
                    if (strWrite == null) {
                        strWrite = "Request cannot be parsed";
                    }
                    return new getNetworkType(str, strWrite);
                }
                break;
            case 122916850:
                if (strOptString.equals("RequestTimeout")) {
                    if (strWrite == null) {
                        strWrite = "Server-side timeout";
                    }
                    return new getDrmType(str, strWrite);
                }
                break;
            case 362177024:
                if (strOptString.equals("NotAvailableForCrawlBots")) {
                    if (strWrite == null) {
                        strWrite = "Not available for crawl bots";
                    }
                    return new finishCurrentSession(str, strWrite);
                }
                break;
            case 624688872:
                if (strOptString.equals("HeaderRestricted")) {
                    if (strWrite == null) {
                        strWrite = "Not available with restricted header";
                    }
                    return new resolveWindowIndexToNewTimeline(str, strWrite);
                }
                break;
            case 690582241:
                if (strOptString.equals("WrongRegion")) {
                    return new maybeUpdateAudioFormat(str, "Wrong region");
                }
                break;
            case 1162785692:
                if (strOptString.equals("OriginNotAvailable")) {
                    if (strWrite == null) {
                        strWrite = "Not available for this origin";
                    }
                    return new getStreamType(str, strWrite);
                }
                break;
            case 1265438056:
                if (strOptString.equals("TokenNotFound")) {
                    if (strWrite == null) {
                        strWrite = "API key not found";
                    }
                    return new getSessionForMediaPeriodId(str, strWrite);
                }
                break;
            case 1281821581:
                if (strOptString.equals("InvalidProxyIntegrationSecret")) {
                    if (strWrite == null) {
                        strWrite = "Invalid proxy integration secret";
                    }
                    return new MediaMetricsListener(str, strWrite);
                }
                break;
            case 1560111262:
                if (strOptString.equals("NotAvailableWithoutUA")) {
                    if (strWrite == null) {
                        strWrite = "Not available when User-Agent is unspecified";
                    }
                    return new getDrmInitData(str, strWrite);
                }
                break;
            case 1574918403:
                if (strOptString.equals("UnsupportedVersion")) {
                    if (strWrite == null) {
                        strWrite = "Android agent version not supported";
                    }
                    return new maybeUpdateTimelineMetadata(str, strWrite);
                }
                break;
            case 1586242120:
                if (strOptString.equals("PackageNotAuthorized")) {
                    if (strWrite == null) {
                        strWrite = "Not available for this package";
                    }
                    return new getLanguageAndRegion(str, strWrite);
                }
                break;
            case 1729519372:
                if (strOptString.equals("TokenExpired")) {
                    return new updateCurrentSession(str, "API key expired");
                }
                break;
            case 2096857181:
                if (strOptString.equals("Failed")) {
                    return new updateSessionsWithDiscontinuity(str, "Request failed");
                }
                break;
        }
        return new getTrackChangeReason(str, "Unknown error.");
    }

    private access402 IconCompatParcelizer(String str, JSONObject jSONObject) throws JSONException {
        String str2;
        String str3;
        String strOptString;
        getDrmErrorCode getdrmerrorcode;
        String strWrite = buildAacLcAudioSpecificConfig.write("sealedResult", jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("products").getJSONObject("identification").getJSONObject("data").getJSONObject("result");
        String string = jSONObject2.getString("visitorId");
        toMagicModuleMetaRepoModel.write(jSONObject2);
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("confidence");
        DefaultPlaybackSessionManagerSessionDescriptor defaultPlaybackSessionManagerSessionDescriptor = new DefaultPlaybackSessionManagerSessionDescriptor(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("score", 0.0d) : 0.0d);
        JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("firstSeenAt");
        String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("global") : null;
        if (strOptString2 == null) {
            strOptString2 = "n\\a";
        }
        String strOptString3 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("subscription") : null;
        if (strOptString3 == null) {
            strOptString3 = "n\\a";
        }
        maybeReportNetworkChange maybereportnetworkchange = new maybeReportNetworkChange(strOptString2, strOptString3);
        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("lastSeenAt");
        String strOptString4 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("global") : null;
        if (strOptString4 == null) {
            strOptString4 = "n\\a";
        }
        String strOptString5 = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("subscription") : null;
        if (strOptString5 == null) {
            strOptString5 = "n\\a";
        }
        maybeReportNetworkChange maybereportnetworkchange2 = new maybeReportNetworkChange(strOptString4, strOptString5);
        boolean zOptBoolean = jSONObject2.optBoolean("visitorFound", false);
        if (this.read) {
            String strOptString6 = jSONObject2.optString("ip", "n\\a");
            JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("ipLocation");
            int iOptInt = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optInt("accuracyRadius", 0) : 0;
            double dOptDouble = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optDouble("latitude", 0.0d) : 0.0d;
            double dOptDouble2 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optDouble("longitude", 0.0d) : 0.0d;
            String strOptString7 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("postalCode", "n\\a") : null;
            String str4 = strOptString7 == null ? "n\\a" : strOptString7;
            String strOptString8 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("timezone", "n\\a") : null;
            String str5 = strOptString8 == null ? "n\\a" : strOptString8;
            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONObject(NotesDispatchAddressRequestKt.KEY_CITY) : null;
            String str6 = "name";
            String strOptString9 = jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optString("name", "n\\a") : null;
            if (strOptString9 == null) {
                strOptString9 = "n\\a";
            }
            getDrmErrorCode.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new getDrmErrorCode.AudioAttributesCompatParcelizer(strOptString9);
            JSONObject jSONObject3 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.getJSONObject("country") : null;
            String strOptString10 = jSONObject3 != null ? jSONObject3.optString("code", "n\\a") : null;
            String str7 = strOptString10 == null ? "n\\a" : strOptString10;
            String strOptString11 = jSONObject3 != null ? jSONObject3.optString("name", "n\\a") : null;
            if (strOptString11 == null) {
                strOptString11 = "n\\a";
            }
            getDrmErrorCode.write writeVar = new getDrmErrorCode.write(str7, strOptString11);
            JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONObject("continent") : null;
            String strOptString12 = jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.optString("code", "n\\a") : null;
            if (strOptString12 == null) {
                strOptString12 = "n\\a";
            }
            String strOptString13 = jSONObjectOptJSONObject6 != null ? jSONObjectOptJSONObject6.optString("name", "n\\a") : null;
            if (strOptString13 == null) {
                strOptString13 = "n\\a";
            }
            getDrmErrorCode.IconCompatParcelizer iconCompatParcelizer = new getDrmErrorCode.IconCompatParcelizer(strOptString12, strOptString13);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optJSONArray("subdivisions") : null;
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray(new JSONObject[0]);
            }
            LinkedList linkedList = new LinkedList();
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (i < length) {
                int i2 = length;
                JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray.optJSONObject(i);
                toMagicModuleMetaRepoModel.write(jSONObjectOptJSONObject7);
                getDrmErrorCode.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
                String strOptString14 = jSONObjectOptJSONObject7.optString("isoCode", "n\\a");
                JSONObject jSONObjectOptJSONObject8 = jSONArrayOptJSONArray.optJSONObject(i);
                toMagicModuleMetaRepoModel.write(jSONObjectOptJSONObject8);
                linkedList.add(new getDrmErrorCode.RemoteActionCompatParcelizer(strOptString14, jSONObjectOptJSONObject8.optString(str6, "n\\a")));
                i++;
                length = i2;
                iconCompatParcelizer = iconCompatParcelizer2;
                str6 = str6;
            }
            getDrmErrorCode getdrmerrorcode2 = new getDrmErrorCode(iOptInt, dOptDouble, dOptDouble2, str4, str5, audioAttributesCompatParcelizer, writeVar, iconCompatParcelizer, linkedList);
            String strOptString15 = jSONObject2.optString("os", "Android");
            String str8 = Build.VERSION.CODENAME;
            if (str8 == null) {
                str8 = "";
            }
            str2 = strOptString6;
            getdrmerrorcode = getdrmerrorcode2;
            str3 = strOptString15;
            strOptString = jSONObject2.optString("osVersion", str8);
        } else {
            str2 = "n\\a";
            str3 = str2;
            strOptString = str3;
            getdrmerrorcode = null;
        }
        toMagicModuleMetaRepoModel.write((Object) string);
        return new access402(str, string, defaultPlaybackSessionManagerSessionDescriptor, zOptBoolean, str2, getdrmerrorcode, str3, strOptString, maybereportnetworkchange, maybereportnetworkchange2, strWrite, jSONObject2.toString(), null, 4096, null);
    }
}
