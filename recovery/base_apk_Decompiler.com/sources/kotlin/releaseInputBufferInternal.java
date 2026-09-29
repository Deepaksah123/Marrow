package kotlin;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.C0177getRfBanners;

/* JADX INFO: loaded from: classes2.dex */
public final class releaseInputBufferInternal {
    private SensorManager IconCompatParcelizer;
    public final releaseOutputBuffer write;

    public releaseInputBufferInternal(SensorManager sensorManager, releaseOutputBuffer releaseoutputbuffer) {
        this.IconCompatParcelizer = sensorManager;
        this.write = releaseoutputbuffer;
    }

    public static final List read(releaseInputBufferInternal releaseinputbufferinternal, Sensor sensor, int i, long j, int i2) {
        if (sensor == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        if (releaseinputbufferinternal.IconCompatParcelizer == null) {
            return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        CountDownLatch countDownLatch = new CountDownLatch(i);
        LinkedList linkedList = new LinkedList();
        flip flipVar = new flip(countDownLatch, linkedList);
        releaseinputbufferinternal.IconCompatParcelizer.registerListener(flipVar, sensor, i2);
        try {
            countDownLatch.await(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        releaseinputbufferinternal.IconCompatParcelizer.unregisterListener(flipVar);
        return linkedList;
    }

    public final ClearKeyUtil read() {
        Object obj;
        Object codecneedsdiscardchannelsworkaround;
        Object codecneedsdiscardchannelsworkaround2;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            SensorManager sensorManager = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write(sensorManager);
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor2 = this.IconCompatParcelizer.getDefaultSensor(4);
            try {
                Future futureSubmit = getMeanPlayAndWaitTimeMs.RemoteActionCompatParcelizer.submit(new isDecodeOnly(this, defaultSensor));
                toMagicModuleMetaRepoModel.write(futureSubmit);
                codecneedsdiscardchannelsworkaround = new Ac4Util(futureSubmit);
            } catch (Throwable th) {
                codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(th);
            }
            try {
                Future futureSubmit2 = getMeanPlayAndWaitTimeMs.RemoteActionCompatParcelizer.submit(new addVideoFrameProcessingOffsets(this, defaultSensor2));
                toMagicModuleMetaRepoModel.write(futureSubmit2);
                codecneedsdiscardchannelsworkaround2 = new Ac4Util(futureSubmit2);
            } catch (Throwable th2) {
                codecneedsdiscardchannelsworkaround2 = new codecNeedsDiscardChannelsWorkaround(th2);
            }
            if (codecneedsdiscardchannelsworkaround instanceof Ac4Util) {
                try {
                    codecneedsdiscardchannelsworkaround = new Ac4Util(((Future) ((Ac4Util) codecneedsdiscardchannelsworkaround).RemoteActionCompatParcelizer).get());
                } catch (Throwable th3) {
                    codecneedsdiscardchannelsworkaround = new codecNeedsDiscardChannelsWorkaround(th3);
                }
            } else if (!(codecneedsdiscardchannelsworkaround instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            if (codecneedsdiscardchannelsworkaround2 instanceof Ac4Util) {
                try {
                    codecneedsdiscardchannelsworkaround2 = new Ac4Util(((Future) ((Ac4Util) codecneedsdiscardchannelsworkaround2).RemoteActionCompatParcelizer).get());
                } catch (Throwable th4) {
                    codecneedsdiscardchannelsworkaround2 = new codecNeedsDiscardChannelsWorkaround(th4);
                }
            } else if (!(codecneedsdiscardchannelsworkaround2 instanceof codecNeedsDiscardChannelsWorkaround)) {
                throw new RenewEligibleCreator();
            }
            Pair pair = new Pair(codecneedsdiscardchannelsworkaround, codecneedsdiscardchannelsworkaround2);
            obj = C0177getRfBanners.read(new ClearKeyUtil((List) setForHeaderData.read((DefaultAudioSinkApi31) pair.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer()), (List) setForHeaderData.read((DefaultAudioSinkApi31) pair.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer())));
        } catch (Throwable th5) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th5));
        }
        return (ClearKeyUtil) setForHeaderData.read(DefaultAudioSinkConfiguration.AudioAttributesCompatParcelizer(obj), new ClearKeyUtil(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer()));
    }
}
