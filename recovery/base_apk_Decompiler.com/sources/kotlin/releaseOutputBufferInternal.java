package kotlin;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class releaseOutputBufferInternal implements ensureUpdated {
    public final isInvalidJoinTransition RemoteActionCompatParcelizer;
    public final parseAc3AnnexFFormat write;

    public releaseOutputBufferInternal(isInvalidJoinTransition isinvalidjointransition, parseAc3AnnexFFormat parseac3annexfformat) {
        this.RemoteActionCompatParcelizer = isinvalidjointransition;
        this.write = parseac3annexfformat;
    }

    public final setPreferredDevice write(getInputChannelCount getinputchannelcount, Integer num, Integer num2, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2) {
        Object obj;
        Object obj2;
        setPreferredDevice setpreferreddevice;
        getcreatedondatems.invoke();
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(AudioAttributesCompatParcelizer(getinputchannelcount.RemoteActionCompatParcelizer(), getinputchannelcount.AudioAttributesCompatParcelizer(), getinputchannelcount.read(), new DecoderReuseEvaluation(getinputchannelcount, this), num, num2));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        DefaultAudioSinkApi31 defaultAudioSinkApi31AudioAttributesCompatParcelizer = DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
        getcreatedondatems2.invoke();
        if (defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof Ac4Util) {
            Pair pair = (Pair) ((Ac4Util) defaultAudioSinkApi31AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer;
            byte[] bArr = (byte[]) pair.RemoteActionCompatParcelizer();
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer3 = C0177getRfBanners.IconCompatParcelizer;
                parseAc3AnnexFFormat parseac3annexfformat = this.write;
                if (parseac3annexfformat != null) {
                    byte[] bArrRemoteActionCompatParcelizer = parseac3annexfformat.RemoteActionCompatParcelizer(bArr);
                    setpreferreddevice = bArrRemoteActionCompatParcelizer.length == 0 ? new setPreferredDevice(bArr) : new setPreferredDevice(bArrRemoteActionCompatParcelizer);
                } else {
                    setpreferreddevice = new setPreferredDevice(bArr);
                }
                obj2 = C0177getRfBanners.read(setpreferreddevice);
            } catch (Throwable th2) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer4 = C0177getRfBanners.IconCompatParcelizer;
                obj2 = C0177getRfBanners.read(SdkPayloadData.write(th2));
            }
            defaultAudioSinkApi31AudioAttributesCompatParcelizer = DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj2);
        } else if (!(defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        return (setPreferredDevice) setForHeaderData.read(defaultAudioSinkApi31AudioAttributesCompatParcelizer, new setPreferredDevice(null));
    }

    private Pair AudioAttributesCompatParcelizer(String str, getAudioTrackMinBufferSize getaudiotrackminbuffersize, Map map, DecoderReuseEvaluation decoderReuseEvaluation, Integer num, Integer num2) throws Exception {
        Object obj;
        InputStream dataInputStream;
        List<Integer> listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{num, num2});
        if (!(listRemoteActionCompatParcelizer instanceof Collection) || !listRemoteActionCompatParcelizer.isEmpty()) {
            for (Integer num3 : listRemoteActionCompatParcelizer) {
                if (num3 != null && num3.intValue() <= 0) {
                    throw new Exception();
                }
            }
        }
        URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(new URL(str).openConnection());
        toMagicModuleMetaRepoModel.write(uRLConnection);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        if (num != null) {
            httpsURLConnection.setConnectTimeout(num.intValue());
        }
        if (num2 != null) {
            httpsURLConnection.setReadTimeout(num2.intValue());
        }
        for (String str2 : map.keySet()) {
            httpsURLConnection.setRequestProperty(str2, (String) map.get(str2));
        }
        boolean z = true;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaudiotrackminbuffersize, processEndOfStream.read)) {
            httpsURLConnection.setRequestMethod(copyWithBufferSize.read.write());
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getaudiotrackminbuffersize, getOutputFormat.RemoteActionCompatParcelizer)) {
            httpsURLConnection.setRequestMethod(lambdaaudioSinkError8comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher.RemoteActionCompatParcelizer.write());
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.connect();
            try {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(httpsURLConnection.getServerCertificates());
            } catch (Throwable th) {
                C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
                obj = C0177getRfBanners.read(SdkPayloadData.write(th));
            }
            byte[] bArr = (byte[]) decoderReuseEvaluation.invoke(new PlaybackStatsEventTimeAndPlaybackState((Certificate[]) setForHeaderData.read(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj), null)));
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        }
        httpsURLConnection.getResponseCode();
        if (httpsURLConnection.getResponseCode() != 200) {
            dataInputStream = httpsURLConnection.getErrorStream();
            if (dataInputStream == null) {
                dataInputStream = httpsURLConnection.getInputStream();
                toMagicModuleMetaRepoModel.write(dataInputStream);
            }
        } else {
            dataInputStream = new DataInputStream(httpsURLConnection.getInputStream());
            z = false;
        }
        try {
            byte[] bArrWrite = getCorrectCount.write(dataInputStream);
            new String(bArrWrite, getSubmissionTimestamp.IconCompatParcelizer);
            Pair pair = new Pair(bArrWrite, Boolean.valueOf(z));
            MagicModuleMetaLSModel.IconCompatParcelizer(dataInputStream, null);
            return pair;
        } finally {
        }
    }
}
