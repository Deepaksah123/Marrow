package kotlin;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.SystemClock;
import com.marrow.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0006*\u00020\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d"}, d2 = {"Lo/setViewForPopups;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "AudioAttributesCompatParcelizer", "()V", "IconCompatParcelizer", "", "read", "()I", "(I)V", "write", "(Ljava/lang/Integer;)I", "RemoteActionCompatParcelizer", "Landroid/content/Context;", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "Landroid/media/SoundPool;", "AudioAttributesImplBaseParcelizer", "Landroid/media/SoundPool;", "", "AudioAttributesImplApi21Parcelizer", "Ljava/util/Set;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/Integer;", "", "J"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setViewForPopups {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private Integer AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Set<Integer> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private SoundPool RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final AudioManager read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private Integer IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Context write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long AudioAttributesImplApi21Parcelizer;

    @setSdkPayload
    public setViewForPopups(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        this.write = context;
        this.read = (AudioManager) context.getSystemService(AudioManager.class);
        this.AudioAttributesCompatParcelizer = new LinkedHashSet();
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer != null) {
            return;
        }
        SoundPool soundPoolBuild = new SoundPool.Builder().setMaxStreams(4).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build()).build();
        soundPoolBuild.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: o.getOptionalFeatures
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
                setViewForPopups.read(this.AudioAttributesCompatParcelizer, i, i2);
            }
        });
        this.RemoteActionCompatParcelizer = soundPoolBuild;
        this.IconCompatParcelizer = Integer.valueOf(soundPoolBuild.load(this.write, R.raw.single_wobble, 1));
        this.AudioAttributesImplBaseParcelizer = Integer.valueOf(soundPoolBuild.load(this.write, R.raw.long_wobble_multiple, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setViewForPopups setviewforpopups, int i, int i2) {
        if (i2 == 0) {
            setviewforpopups.AudioAttributesCompatParcelizer.add(Integer.valueOf(i));
        }
    }

    public final void IconCompatParcelizer() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.AudioAttributesImplApi21Parcelizer < 70) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = jUptimeMillis;
        write(this.IconCompatParcelizer);
    }

    public final int read() {
        return write(this.AudioAttributesImplBaseParcelizer);
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        SoundPool soundPool;
        if (p0 == 0 || (soundPool = this.RemoteActionCompatParcelizer) == null) {
            return;
        }
        soundPool.stop(p0);
    }

    public final void write() {
        SoundPool soundPool = this.RemoteActionCompatParcelizer;
        if (soundPool != null) {
            soundPool.setOnLoadCompleteListener(null);
        }
        SoundPool soundPool2 = this.RemoteActionCompatParcelizer;
        if (soundPool2 != null) {
            soundPool2.release();
        }
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer.clear();
        this.IconCompatParcelizer = null;
        this.AudioAttributesImplBaseParcelizer = null;
    }

    private final int write(Integer p0) {
        AudioManager audioManager;
        SoundPool soundPool = this.RemoteActionCompatParcelizer;
        if (soundPool == null || p0 == null || !this.AudioAttributesCompatParcelizer.contains(p0) || (audioManager = this.read) == null || audioManager.getRingerMode() != 2) {
            return 0;
        }
        return soundPool.play(p0.intValue(), 0.02f, 0.02f, 1, 0, 1.0f);
    }
}
