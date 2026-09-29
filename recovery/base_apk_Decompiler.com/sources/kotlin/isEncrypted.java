package kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C0177getRfBanners;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class isEncrypted {
    private RenewEligible IconCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(flushSinkIfActive.write);
    private RenewEligible AudioAttributesCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(MediaCodecAudioRendererAudioSinkListener.read);
    private RenewEligible RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(addVideoFrameProcessingOffset.read);
    private RenewEligible write = getRenewExpiresOn.RemoteActionCompatParcelizer(TrimmingAudioProcessor.write);
    private RenewEligible read = getRenewExpiresOn.RemoteActionCompatParcelizer(isEndOfStream.IconCompatParcelizer);
    private RenewEligible AudioAttributesImplApi26Parcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(getVersion.write);
    private RenewEligible MediaBrowserCompatItemReceiver = getRenewExpiresOn.RemoteActionCompatParcelizer(findPitchPeriodInRange.IconCompatParcelizer);
    private RenewEligible AudioAttributesImplApi21Parcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(parseOggPacketAudioSampleCount.write);
    private RenewEligible AudioAttributesImplBaseParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(processNoisy.write);
    private RenewEligible MediaBrowserCompatCustomActionResultReceiver = getRenewExpiresOn.RemoteActionCompatParcelizer(writeToParcel.write);

    public final DefaultAudioSinkApi31 IconCompatParcelizer(List list) {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                setPassthroughBufferDurationUs setpassthroughbufferdurationus = (setPassthroughBufferDurationUs) it.next();
                arrayList.add(VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write((String) this.IconCompatParcelizer.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.AudioAttributesCompatParcelizer), setAction.write((String) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.IconCompatParcelizer), setAction.write((String) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.RemoteActionCompatParcelizer), setAction.write((String) this.write.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.write), setAction.write((String) this.read.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.AudioAttributesImplApi26Parcelizer), setAction.write((String) this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.AudioAttributesImplApi21Parcelizer), setAction.write((String) this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.MediaBrowserCompatCustomActionResultReceiver), setAction.write((String) this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.AudioAttributesImplBaseParcelizer), setAction.write((String) this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), Integer.valueOf(setpassthroughbufferdurationus.read)), setAction.write((String) this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(), setpassthroughbufferdurationus.MediaBrowserCompatItemReceiver)));
            }
            obj = C0177getRfBanners.read(new JSONArray((Collection) arrayList).toString().getBytes(getSubmissionTimestamp.IconCompatParcelizer));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        return DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
    }

    public final DefaultAudioSinkApi31 read(byte[] bArr) {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            JSONArray jSONArray = new JSONArray(new String(bArr, getSubmissionTimestamp.IconCompatParcelizer));
            newEncryptedObject newencryptedobjectIconCompatParcelizer = getQues.IconCompatParcelizer(0, jSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList();
            Iterator<Integer> it = newencryptedobjectIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = jSONArray.getJSONObject(((getSINGLE_SYNC_RESULT) it).RemoteActionCompatParcelizer());
                if (jSONObject != null) {
                    arrayList.add(jSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList, 10));
            for (JSONObject jSONObject2 : arrayList) {
                setPassthroughBufferDurationUs setpassthroughbufferdurationus = new setPassthroughBufferDurationUs(buildAacLcAudioSpecificConfig.write((String) this.IconCompatParcelizer.RemoteActionCompatParcelizer(), jSONObject2), buildAacLcAudioSpecificConfig.write((String) this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), jSONObject2), buildAacLcAudioSpecificConfig.IconCompatParcelizer((String) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(), jSONObject2), buildAacLcAudioSpecificConfig.read((String) this.write.RemoteActionCompatParcelizer(), jSONObject2), buildAacLcAudioSpecificConfig.read((String) this.read.RemoteActionCompatParcelizer(), jSONObject2), buildAacLcAudioSpecificConfig.read((String) this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), jSONObject2), buildAacLcAudioSpecificConfig.read((String) this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(), jSONObject2), buildAacLcAudioSpecificConfig.read((String) this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), jSONObject2), buildAacLcAudioSpecificConfig.read((String) this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(), jSONObject2), 8);
                Integer numIconCompatParcelizer = buildAacLcAudioSpecificConfig.IconCompatParcelizer((String) this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(), jSONObject2);
                if (numIconCompatParcelizer != null) {
                    setpassthroughbufferdurationus.read = numIconCompatParcelizer.intValue();
                }
                arrayList2.add(setpassthroughbufferdurationus);
            }
            obj = C0177getRfBanners.read(arrayList2);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        return DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
    }
}
