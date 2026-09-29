package kotlin;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onSessionFinished {
    public static getJoinTimeRatio AudioAttributesCompatParcelizer(PlaybackStatsEventTimeAndPlaybackState playbackStatsEventTimeAndPlaybackState, releaseOutputBuffer releaseoutputbuffer) {
        Object obj;
        if (!releaseoutputbuffer.MediaBrowserCompatSearchResultReceiver) {
            return new getJoinTimeRatio(null, setSpatializationBehavior.read);
        }
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            Certificate[] certificateArr = playbackStatsEventTimeAndPlaybackState.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(certificateArr);
            ArrayList<byte[]> arrayList = new ArrayList(certificateArr.length);
            int length = 0;
            for (Certificate certificate : certificateArr) {
                toMagicModuleMetaRepoModel.write(certificate);
                byte[] encoded = certificate.getEncoded();
                toMagicModuleMetaRepoModel.write(encoded);
                arrayList.add(encoded);
            }
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList, 10));
            for (byte[] bArr : arrayList) {
                arrayList2.add(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new byte[][]{ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(bArr.length).array(), bArr}));
            }
            List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2);
            Iterator it = listRemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                length += ((byte[]) it.next()).length;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
            Iterator it2 = listRemoteActionCompatParcelizer.iterator();
            while (it2.hasNext()) {
                byteBufferAllocate.put((byte[]) it2.next());
            }
            String strEncodeToString = Base64.encodeToString(byteBufferAllocate.array(), 2);
            toMagicModuleMetaRepoModel.write((Object) strEncodeToString);
            obj = C0177getRfBanners.read(strEncodeToString);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        DefaultAudioSinkApi31 defaultAudioSinkApi31AudioAttributesCompatParcelizer = DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj);
        if (defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof Ac4Util) {
            return new getJoinTimeRatio((String) ((Ac4Util) defaultAudioSinkApi31AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer, onAudioDevicesAdded.AudioAttributesCompatParcelizer);
        }
        if (!(defaultAudioSinkApi31AudioAttributesCompatParcelizer instanceof codecNeedsDiscardChannelsWorkaround)) {
            throw new RenewEligibleCreator();
        }
        return new getJoinTimeRatio(null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer);
    }
}
