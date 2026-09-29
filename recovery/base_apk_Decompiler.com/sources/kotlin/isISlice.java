package kotlin;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
public final class isISlice {
    private static String AudioAttributesCompatParcelizer;
    private static final Map<String, Integer> write;
    private final readFormat AudioAttributesImplApi21Parcelizer;
    private final parseAudioMuxElement IconCompatParcelizer;
    private final WavExtractorOutputWriter MediaBrowserCompatItemReceiver;
    private final Context RemoteActionCompatParcelizer;
    private final onDataEnd read;

    static {
        HashMap map = new HashMap();
        write = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        AudioAttributesCompatParcelizer = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.4.0");
    }

    public isISlice(Context context, parseAudioMuxElement parseaudiomuxelement, onDataEnd ondataend, WavExtractorOutputWriter wavExtractorOutputWriter, readFormat readformat) {
        this.RemoteActionCompatParcelizer = context;
        this.IconCompatParcelizer = parseaudiomuxelement;
        this.read = ondataend;
        this.MediaBrowserCompatItemReceiver = wavExtractorOutputWriter;
        this.AudioAttributesImplApi21Parcelizer = readformat;
    }

    public final fillBufferWithAtLeastOnePacket RemoteActionCompatParcelizer(String str, long j) {
        return write().read(read(str, j)).IconCompatParcelizer();
    }

    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read IconCompatParcelizer(Throwable th, Thread thread, String str, long j, boolean z) {
        int i = this.RemoteActionCompatParcelizer.getResources().getConfiguration().orientation;
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.MediaBrowserCompatCustomActionResultReceiver().write(str).IconCompatParcelizer(j).IconCompatParcelizer(AudioAttributesCompatParcelizer(i, new WavFormat(th, this.MediaBrowserCompatItemReceiver), thread, 4, 8, z)).write(AudioAttributesCompatParcelizer(i)).AudioAttributesCompatParcelizer();
    }

    public final fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read AudioAttributesCompatParcelizer(fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer) {
        int i = this.RemoteActionCompatParcelizer.getResources().getConfiguration().orientation;
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.MediaBrowserCompatCustomActionResultReceiver().write("anr").IconCompatParcelizer(iconCompatParcelizer.AudioAttributesImplApi26Parcelizer()).IconCompatParcelizer(read(i, write(iconCompatParcelizer))).write(AudioAttributesCompatParcelizer(i)).AudioAttributesCompatParcelizer();
    }

    private fillBufferWithAtLeastOnePacket.IconCompatParcelizer write(fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer) {
        access102<fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read> access102VarIconCompatParcelizer;
        if (!this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read.read || this.read.read.size() <= 0) {
            access102VarIconCompatParcelizer = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (H264ReaderSampleReader h264ReaderSampleReader : this.read.read) {
                arrayList.add(fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.read().RemoteActionCompatParcelizer(h264ReaderSampleReader.RemoteActionCompatParcelizer()).write(h264ReaderSampleReader.write()).read(h264ReaderSampleReader.read()).IconCompatParcelizer());
            }
            access102VarIconCompatParcelizer = access102.IconCompatParcelizer(arrayList);
        }
        return fillBufferWithAtLeastOnePacket.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer().IconCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer()).RemoteActionCompatParcelizer(iconCompatParcelizer.IconCompatParcelizer()).write(iconCompatParcelizer.MediaBrowserCompatItemReceiver()).AudioAttributesCompatParcelizer(iconCompatParcelizer.AudioAttributesImplApi26Parcelizer()).AudioAttributesCompatParcelizer(iconCompatParcelizer.write()).IconCompatParcelizer(iconCompatParcelizer.read()).read(iconCompatParcelizer.AudioAttributesImplBaseParcelizer()).write(iconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()).RemoteActionCompatParcelizer(access102VarIconCompatParcelizer).RemoteActionCompatParcelizer();
    }

    private fillBufferWithAtLeastOnePacket.AudioAttributesCompatParcelizer write() {
        return fillBufferWithAtLeastOnePacket.RatingCompat().AudioAttributesImplApi26Parcelizer("18.4.0").IconCompatParcelizer(this.read.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(this.IconCompatParcelizer.read().IconCompatParcelizer()).read(this.IconCompatParcelizer.read().AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(this.read.MediaBrowserCompatItemReceiver).write(this.read.AudioAttributesImplBaseParcelizer).RemoteActionCompatParcelizer(4);
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer read(String str, long j) {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem().read(j).write(str).RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer).write(AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver()).write(AudioAttributesImplApi21Parcelizer()).read(3).RemoteActionCompatParcelizer();
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.MediaBrowserCompatItemReceiver().read(this.IconCompatParcelizer.AudioAttributesCompatParcelizer()).AudioAttributesImplApi26Parcelizer(this.read.MediaBrowserCompatItemReceiver).IconCompatParcelizer(this.read.AudioAttributesImplBaseParcelizer).write(this.IconCompatParcelizer.read().IconCompatParcelizer()).AudioAttributesCompatParcelizer(this.read.RemoteActionCompatParcelizer.read()).RemoteActionCompatParcelizer(this.read.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()).AudioAttributesCompatParcelizer();
    }

    private static fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write MediaBrowserCompatCustomActionResultReceiver() {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.read().IconCompatParcelizer(3).AudioAttributesCompatParcelizer(Build.VERSION.RELEASE).RemoteActionCompatParcelizer(Build.VERSION.CODENAME).write(putSps.write()).write();
    }

    private static fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int iIconCompatParcelizer = IconCompatParcelizer();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long j = putSps.read();
        long blockCount = statFs.getBlockCount();
        long blockSize = statFs.getBlockSize();
        boolean zRemoteActionCompatParcelizer = putSps.RemoteActionCompatParcelizer();
        int iAudioAttributesCompatParcelizer = putSps.AudioAttributesCompatParcelizer();
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().read(iIconCompatParcelizer).AudioAttributesCompatParcelizer(Build.MODEL).write(iAvailableProcessors).RemoteActionCompatParcelizer(j).read(blockCount * blockSize).read(zRemoteActionCompatParcelizer).RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer).read(Build.MANUFACTURER).IconCompatParcelizer(Build.PRODUCT).AudioAttributesCompatParcelizer();
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write AudioAttributesCompatParcelizer(int i, WavFormat wavFormat, Thread thread, int i2, int i3, boolean z) {
        Boolean boolValueOf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfoWrite = putSps.write(this.read.MediaBrowserCompatCustomActionResultReceiver, this.RemoteActionCompatParcelizer);
        if (runningAppProcessInfoWrite != null) {
            boolValueOf = Boolean.valueOf(runningAppProcessInfoWrite.importance != 100);
        } else {
            boolValueOf = null;
        }
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(boolValueOf).AudioAttributesCompatParcelizer(i).RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(wavFormat, thread, 4, 8, z)).RemoteActionCompatParcelizer();
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write read(int i, fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer) {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(Boolean.valueOf(iconCompatParcelizer.RemoteActionCompatParcelizer() != 100)).AudioAttributesCompatParcelizer(i).RemoteActionCompatParcelizer(read(iconCompatParcelizer)).RemoteActionCompatParcelizer();
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i) {
        outputSample outputsampleWrite = outputSample.write(this.RemoteActionCompatParcelizer);
        Float fWrite = outputsampleWrite.write();
        Double dValueOf = fWrite != null ? Double.valueOf(fWrite.doubleValue()) : null;
        int iIconCompatParcelizer = outputsampleWrite.IconCompatParcelizer();
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(dValueOf).read(iIconCompatParcelizer).IconCompatParcelizer(putSps.write(this.RemoteActionCompatParcelizer)).RemoteActionCompatParcelizer(i).read(putSps.read() - putSps.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer)).write(putSps.read(Environment.getDataDirectory().getPath())).AudioAttributesCompatParcelizer();
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(WavFormat wavFormat, Thread thread, int i, int i2, boolean z) {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().RemoteActionCompatParcelizer(read(wavFormat, thread, i, z)).read(IconCompatParcelizer(wavFormat, i, i2)).IconCompatParcelizer(MediaBrowserCompatItemReceiver()).read(read()).write();
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer read(fillBufferWithAtLeastOnePacket.IconCompatParcelizer iconCompatParcelizer) {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer(iconCompatParcelizer).IconCompatParcelizer(MediaBrowserCompatItemReceiver()).read(read()).write();
    }

    private access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer> read(WavFormat wavFormat, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AudioAttributesCompatParcelizer(thread, wavFormat.RemoteActionCompatParcelizer, i));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(write(key, this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(entry.getValue())));
                }
            }
        }
        return access102.IconCompatParcelizer(arrayList);
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer write(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return AudioAttributesCompatParcelizer(thread, stackTraceElementArr, 0);
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.read().write(thread.getName()).RemoteActionCompatParcelizer(i).AudioAttributesCompatParcelizer(access102.IconCompatParcelizer(AudioAttributesCompatParcelizer(stackTraceElementArr, i))).AudioAttributesCompatParcelizer();
    }

    private static access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer> AudioAttributesCompatParcelizer(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(write(stackTraceElement, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer().read(i)));
        }
        return access102.IconCompatParcelizer(arrayList);
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write IconCompatParcelizer(WavFormat wavFormat, int i, int i2) {
        return RemoteActionCompatParcelizer(wavFormat, i, i2, 0);
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write RemoteActionCompatParcelizer(WavFormat wavFormat, int i, int i2, int i3) {
        String str = wavFormat.read;
        String str2 = wavFormat.AudioAttributesCompatParcelizer;
        int i4 = 0;
        StackTraceElement[] stackTraceElementArr = wavFormat.RemoteActionCompatParcelizer != null ? wavFormat.RemoteActionCompatParcelizer : new StackTraceElement[0];
        WavFormat wavFormat2 = wavFormat.IconCompatParcelizer;
        if (i3 >= i2) {
            WavFormat wavFormat3 = wavFormat2;
            while (wavFormat3 != null) {
                wavFormat3 = wavFormat3.IconCompatParcelizer;
                i4++;
            }
        }
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AbstractC0082RemoteActionCompatParcelizer abstractC0082RemoteActionCompatParcelizerWrite = fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(str).read(str2).AudioAttributesCompatParcelizer(access102.IconCompatParcelizer(AudioAttributesCompatParcelizer(stackTraceElementArr, i))).write(i4);
        if (wavFormat2 != null && i4 == 0) {
            abstractC0082RemoteActionCompatParcelizerWrite.IconCompatParcelizer(RemoteActionCompatParcelizer(wavFormat2, i, i2, i3 + 1));
        }
        return abstractC0082RemoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer();
    }

    private static fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer write(StackTraceElement stackTraceElement, fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AbstractC0075read abstractC0075read) {
        long lineNumber = 0;
        long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        String string = sb.toString();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            lineNumber = stackTraceElement.getLineNumber();
        }
        return abstractC0075read.RemoteActionCompatParcelizer(jMax).IconCompatParcelizer(string).AudioAttributesCompatParcelizer(fileName).write(lineNumber).read();
    }

    private access102<fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read> read() {
        return access102.write(RemoteActionCompatParcelizer());
    }

    private fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read RemoteActionCompatParcelizer() {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AudioAttributesCompatParcelizer().read(0L).RemoteActionCompatParcelizer(0L).AudioAttributesCompatParcelizer(this.read.MediaBrowserCompatCustomActionResultReceiver).RemoteActionCompatParcelizer(this.read.IconCompatParcelizer).read();
    }

    private static fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer MediaBrowserCompatItemReceiver() {
        return fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer().write(SessionDescription.SUPPORTED_SDP_VERSION).RemoteActionCompatParcelizer(SessionDescription.SUPPORTED_SDP_VERSION).RemoteActionCompatParcelizer(0L).read();
    }

    private static int IconCompatParcelizer() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = write.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }
}
