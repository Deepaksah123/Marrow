package kotlin;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0014J\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0015\u0010\u0017J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00160\u00182\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR(\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001f0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!"}, d2 = {"Lo/lambdaupdateStateAndInformListeners37;", "", "Lo/SimpleBasePlayerPeriodData;", "p0", "Lo/onDroppedVideoFrames;", "p1", "Ljava/util/Locale;", "p2", "<init>", "(Lo/SimpleBasePlayerPeriodData;Lo/onDroppedVideoFrames;Ljava/util/Locale;)V", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "", "IconCompatParcelizer", "(Ljava/lang/String;)I", "write", "()I", "read", "(Ljava/lang/String;I)I", "AudioAttributesCompatParcelizer", "", "(Ljava/lang/String;J)I", "", "(Ljava/lang/String;)Ljava/util/List;", "()V", "Lo/SimpleBasePlayerPeriodData;", "Lo/onDroppedVideoFrames;", "Ljava/util/Locale;", "", "", "Ljava/util/Map;", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class lambdaupdateStateAndInformListeners37 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Locale RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final SimpleBasePlayerPeriodData AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Map<String, List<Long>> IconCompatParcelizer;
    private final onDroppedVideoFrames read;
    private int write;

    private lambdaupdateStateAndInformListeners37(SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, onDroppedVideoFrames ondroppedvideoframes, Locale locale) {
        toMagicModuleMetaRepoModel.write(simpleBasePlayerPeriodData, "");
        toMagicModuleMetaRepoModel.write(ondroppedvideoframes, "");
        toMagicModuleMetaRepoModel.write(locale, "");
        this.AudioAttributesCompatParcelizer = simpleBasePlayerPeriodData;
        this.read = ondroppedvideoframes;
        this.RemoteActionCompatParcelizer = locale;
        this.IconCompatParcelizer = new LinkedHashMap();
    }

    public /* synthetic */ lambdaupdateStateAndInformListeners37(SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, onDroppedVideoFrames ondroppedvideoframes, Locale locale, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(simpleBasePlayerPeriodData, (i & 2) != 0 ? onDroppedVideoFrames.IconCompatParcelizer : ondroppedvideoframes, (i & 4) != 0 ? Locale.getDefault() : locale);
    }

    public final void RemoteActionCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write++;
        long jRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        Map<String, List<Long>> map = this.IconCompatParcelizer;
        ArrayList arrayList = map.get(p0);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(p0, arrayList);
        }
        arrayList.add(Long.valueOf(jRemoteActionCompatParcelizer));
        setTracks audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.read(p0, jRemoteActionCompatParcelizer);
        }
    }

    public final int IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<Long> list = this.IconCompatParcelizer.get(p0);
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public final int read(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(p0, this.read.RemoteActionCompatParcelizer() - ((long) p1));
    }

    public final int RemoteActionCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(p0, this.read.RemoteActionCompatParcelizer() - TimeUnit.MINUTES.toSeconds(p1));
    }

    public final int AudioAttributesCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return AudioAttributesCompatParcelizer(p0, this.read.RemoteActionCompatParcelizer() - TimeUnit.HOURS.toSeconds(p1));
    }

    public final int write(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Calendar calendar = Calendar.getInstance(this.RemoteActionCompatParcelizer);
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -p1);
        return AudioAttributesCompatParcelizer(p0, TimeUnit.MILLISECONDS.toSeconds(calendar.getTime().getTime()));
    }

    public final int IconCompatParcelizer(String p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Calendar calendar = Calendar.getInstance(this.RemoteActionCompatParcelizer);
        calendar.setTime(new Date());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -(((calendar.get(7) - calendar.getFirstDayOfWeek()) + 7) % 7));
        if (p1 > 1) {
            calendar.add(3, -p1);
        }
        return AudioAttributesCompatParcelizer(p0, TimeUnit.MILLISECONDS.toSeconds(calendar.getTimeInMillis()));
    }

    private int AudioAttributesCompatParcelizer(String p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        List<Long> list = read(p0);
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            if (list.get(i2).longValue() < p1) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return list.size() - i;
    }

    public final List<Long> read(String p0) {
        List<Long> listWrite;
        toMagicModuleMetaRepoModel.write(p0, "");
        setTracks audioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
        return (audioAttributesCompatParcelizer == null || (listWrite = audioAttributesCompatParcelizer.write(p0)) == null) ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : listWrite;
    }

    public final void read() {
        this.IconCompatParcelizer.clear();
        this.write = 0;
    }
}
