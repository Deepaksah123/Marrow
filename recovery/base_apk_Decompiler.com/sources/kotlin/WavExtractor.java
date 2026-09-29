package kotlin;

import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import in.juspay.hyper.constants.LogSubCategory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
final class WavExtractor implements numOutputBytesToFrames {
    private final String IconCompatParcelizer;
    private final TsPayloadReaderDvbSubtitleInfo read;
    private final DvbSubtitleReader write;

    private static boolean read(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public WavExtractor(String str, TsPayloadReaderDvbSubtitleInfo tsPayloadReaderDvbSubtitleInfo) {
        this(str, tsPayloadReaderDvbSubtitleInfo, DvbSubtitleReader.read());
    }

    private WavExtractor(String str, TsPayloadReaderDvbSubtitleInfo tsPayloadReaderDvbSubtitleInfo, DvbSubtitleReader dvbSubtitleReader) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.write = dvbSubtitleReader;
        this.read = tsPayloadReaderDvbSubtitleInfo;
        this.IconCompatParcelizer = str;
    }

    private readEsInfo AudioAttributesCompatParcelizer(Map<String, String> map) {
        readEsInfo readesinfoAudioAttributesCompatParcelizer = TsPayloadReaderDvbSubtitleInfo.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, map);
        StringBuilder sb = new StringBuilder("Crashlytics Android SDK/");
        sb.append(parseMediaFormat.IconCompatParcelizer());
        return readesinfoAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(RtspHeaders.USER_AGENT, sb.toString()).RemoteActionCompatParcelizer("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    @Override // kotlin.numOutputBytesToFrames
    public final JSONObject IconCompatParcelizer(decodeBlockForChannel decodeblockforchannel) {
        try {
            Map<String, String> mapWrite = write(decodeblockforchannel);
            readEsInfo readesinfoRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(mapWrite), decodeblockforchannel);
            DvbSubtitleReader dvbSubtitleReader = this.write;
            StringBuilder sb = new StringBuilder("Requesting settings from ");
            sb.append(this.IconCompatParcelizer);
            dvbSubtitleReader.IconCompatParcelizer(sb.toString());
            DvbSubtitleReader dvbSubtitleReader2 = this.write;
            StringBuilder sb2 = new StringBuilder("Settings query params were: ");
            sb2.append(mapWrite);
            dvbSubtitleReader2.AudioAttributesCompatParcelizer(sb2.toString());
            return RemoteActionCompatParcelizer(readesinfoRemoteActionCompatParcelizer.read());
        } catch (IOException unused) {
            this.write.write();
            return null;
        }
    }

    private JSONObject RemoteActionCompatParcelizer(TsPayloadReader tsPayloadReader) {
        int iWrite = tsPayloadReader.write();
        this.write.AudioAttributesCompatParcelizer("Settings response code was: ".concat(String.valueOf(iWrite)));
        if (read(iWrite)) {
            return RemoteActionCompatParcelizer(tsPayloadReader.RemoteActionCompatParcelizer());
        }
        DvbSubtitleReader dvbSubtitleReader = this.write;
        StringBuilder sb = new StringBuilder("Settings request failed; (status: ");
        sb.append(iWrite);
        sb.append(") from ");
        sb.append(this.IconCompatParcelizer);
        dvbSubtitleReader.RemoteActionCompatParcelizer(sb.toString());
        return null;
    }

    private JSONObject RemoteActionCompatParcelizer(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            this.write.RemoteActionCompatParcelizer();
            this.write.read("Settings response ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static Map<String, String> write(decodeBlockForChannel decodeblockforchannel) {
        HashMap map = new HashMap();
        map.put("build_version", decodeblockforchannel.write);
        map.put("display_version", decodeblockforchannel.AudioAttributesCompatParcelizer);
        map.put("source", Integer.toString(decodeblockforchannel.MediaBrowserCompatCustomActionResultReceiver));
        String str = decodeblockforchannel.MediaBrowserCompatItemReceiver;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    private static readEsInfo RemoteActionCompatParcelizer(readEsInfo readesinfo, decodeBlockForChannel decodeblockforchannel) {
        read(readesinfo, "X-CRASHLYTICS-GOOGLE-APP-ID", decodeblockforchannel.IconCompatParcelizer);
        read(readesinfo, "X-CRASHLYTICS-API-CLIENT-TYPE", LogSubCategory.LifeCycle.ANDROID);
        read(readesinfo, "X-CRASHLYTICS-API-CLIENT-VERSION", parseMediaFormat.IconCompatParcelizer());
        read(readesinfo, RtspHeaders.ACCEPT, "application/json");
        read(readesinfo, "X-CRASHLYTICS-DEVICE-MODEL", decodeblockforchannel.RemoteActionCompatParcelizer);
        read(readesinfo, "X-CRASHLYTICS-OS-BUILD-VERSION", decodeblockforchannel.AudioAttributesImplApi26Parcelizer);
        read(readesinfo, "X-CRASHLYTICS-OS-DISPLAY-VERSION", decodeblockforchannel.AudioAttributesImplApi21Parcelizer);
        read(readesinfo, "X-CRASHLYTICS-INSTALLATION-ID", decodeblockforchannel.read.read().IconCompatParcelizer());
        return readesinfo;
    }

    private static void read(readEsInfo readesinfo, String str, String str2) {
        if (str2 != null) {
            readesinfo.RemoteActionCompatParcelizer(str, str2);
        }
    }
}
