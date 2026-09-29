package kotlin;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.initExtraTracks;
import kotlin.onEmsgLeafAtomRead;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes2.dex */
public final class modifyMapSerializer {
    private final int AudioAttributesCompatParcelizer;
    private final SparseArray<read> RemoteActionCompatParcelizer;
    public static final modifyMapSerializer read = new modifyMapSerializer(initExtraTracks.read(read.write));
    private static final initExtraTracks<Integer> write = initExtraTracks.write(2, 5, 6);
    static final onMoovContainerAtomRead<Integer, Integer> IconCompatParcelizer = new onMoovContainerAtomRead.AudioAttributesCompatParcelizer().read(5, 6).read(17, 6).read(7, 6).read(30, 10).read(18, 6).read(6, 8).read(8, 8).read(14, 8).AudioAttributesCompatParcelizer();

    /* synthetic */ modifyMapSerializer(List list, byte b) {
        this(list);
    }

    public static modifyMapSerializer IconCompatParcelizer(Context context, JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        int i = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver;
        return read(context, jsonIntegerFormatVisitor, null);
    }

    static modifyMapSerializer read(Context context, JsonIntegerFormatVisitor jsonIntegerFormatVisitor, modifySerializer modifyserializer) {
        return read(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), jsonIntegerFormatVisitor, modifyserializer);
    }

    static modifyMapSerializer read(Context context, Intent intent, JsonIntegerFormatVisitor jsonIntegerFormatVisitor, modifySerializer modifyserializer) {
        AudioManager audioManager = (AudioManager) buildTypeSerializer.IconCompatParcelizer(context.getSystemService("audio"));
        if (modifyserializer == null) {
            modifyserializer = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 33 ? RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(audioManager, jsonIntegerFormatVisitor) : null;
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 33 && (LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(context) || LaissezFaireSubTypeValidator.read(context))) {
            return RemoteActionCompatParcelizer.read(audioManager, jsonIntegerFormatVisitor);
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && AudioAttributesCompatParcelizer.read(audioManager, modifyserializer)) {
            return read;
        }
        onEmsgLeafAtomRead.IconCompatParcelizer iconCompatParcelizer = new onEmsgLeafAtomRead.IconCompatParcelizer();
        iconCompatParcelizer.RemoteActionCompatParcelizer(2);
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29 && (LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(context) || LaissezFaireSubTypeValidator.read(context))) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer(jsonIntegerFormatVisitor));
            return new modifyMapSerializer(AudioAttributesCompatParcelizer(parseTextAttribute.write(iconCompatParcelizer.write()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || read()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(write);
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(parseTextAttribute.write(intArrayExtra));
            }
            return new modifyMapSerializer(AudioAttributesCompatParcelizer(parseTextAttribute.write(iconCompatParcelizer.write()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new modifyMapSerializer(AudioAttributesCompatParcelizer(parseTextAttribute.write(iconCompatParcelizer.write()), 10));
    }

    static Uri RemoteActionCompatParcelizer() {
        if (read()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private modifyMapSerializer(List<read> list) {
        this.RemoteActionCompatParcelizer = new SparseArray<>();
        for (int i = 0; i < list.size(); i++) {
            read readVar = list.get(i);
            this.RemoteActionCompatParcelizer.put(readVar.read, readVar);
        }
        int iMax = 0;
        for (int i2 = 0; i2 < this.RemoteActionCompatParcelizer.size(); i2++) {
            iMax = Math.max(iMax, this.RemoteActionCompatParcelizer.valueAt(i2).AudioAttributesCompatParcelizer);
        }
        this.AudioAttributesCompatParcelizer = iMax;
    }

    private boolean RemoteActionCompatParcelizer(int i) {
        return LaissezFaireSubTypeValidator.write(this.RemoteActionCompatParcelizer, i);
    }

    public final boolean RemoteActionCompatParcelizer(C0170format c0170format, JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        return write(c0170format, jsonIntegerFormatVisitor) != null;
    }

    public final Pair<Integer, Integer> write(C0170format c0170format, JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
        int iIconCompatParcelizer;
        int i = DefaultBaseTypeLimitingValidator.read((String) buildTypeSerializer.IconCompatParcelizer(c0170format.onPlayFromUri), c0170format.RemoteActionCompatParcelizer);
        if (!IconCompatParcelizer.containsKey(Integer.valueOf(i))) {
            return null;
        }
        if (i == 18 && !RemoteActionCompatParcelizer(18)) {
            i = 6;
        } else if ((i == 8 && !RemoteActionCompatParcelizer(8)) || (i == 30 && !RemoteActionCompatParcelizer(30))) {
            i = 7;
        }
        if (!RemoteActionCompatParcelizer(i)) {
            return null;
        }
        read readVar = (read) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.get(i));
        if (c0170format.AudioAttributesCompatParcelizer == -1 || i == 18) {
            iIconCompatParcelizer = readVar.IconCompatParcelizer(c0170format.onPrepareFromUri != -1 ? c0170format.onPrepareFromUri : OpusUtil.SAMPLE_RATE, jsonIntegerFormatVisitor);
        } else {
            iIconCompatParcelizer = c0170format.AudioAttributesCompatParcelizer;
            if (!c0170format.onPlayFromUri.equals(MimeTypes.AUDIO_DTS_X) || LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 33) {
                if (!readVar.AudioAttributesCompatParcelizer(iIconCompatParcelizer)) {
                    return null;
                }
            } else if (iIconCompatParcelizer > 10) {
                return null;
            }
        }
        int iIconCompatParcelizer2 = IconCompatParcelizer(iIconCompatParcelizer);
        if (iIconCompatParcelizer2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(i), Integer.valueOf(iIconCompatParcelizer2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof modifyMapSerializer)) {
            return false;
        }
        modifyMapSerializer modifymapserializer = (modifyMapSerializer) obj;
        return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, modifymapserializer.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == modifymapserializer.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer + (LaissezFaireSubTypeValidator.IconCompatParcelizer((SparseArray) this.RemoteActionCompatParcelizer) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioCapabilities[maxChannelCount=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", audioProfiles=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("]");
        return sb.toString();
    }

    private static boolean read() {
        return "Amazon".equals(LaissezFaireSubTypeValidator.read) || "Xiaomi".equals(LaissezFaireSubTypeValidator.read);
    }

    private static int IconCompatParcelizer(int i) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 26 && "fugu".equals(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer) && i == 1) {
            i = 2;
        }
        return LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static initExtraTracks<read> IconCompatParcelizer(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(parseTextAttribute.write(12)));
        for (int i = 0; i < list.size(); i++) {
            AudioProfile audioProfile = list.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatMediaItem(format) || IconCompatParcelizer.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) buildTypeSerializer.IconCompatParcelizer((Set) map.get(Integer.valueOf(format)))).addAll(parseTextAttribute.write(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(parseTextAttribute.write(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        for (Map.Entry entry : map.entrySet()) {
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new read(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }

    private static initExtraTracks<read> AudioAttributesCompatParcelizer(int[] iArr, int i) {
        initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(new read(i2, i));
        }
        return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
    }

    static final class read {
        public static final read write;
        public final int AudioAttributesCompatParcelizer;
        private final onEmsgLeafAtomRead<Integer> RemoteActionCompatParcelizer;
        public final int read;

        static {
            read readVar;
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 33) {
                readVar = new read(2, write());
            } else {
                readVar = new read(2, 10);
            }
            write = readVar;
        }

        public read(int i, Set<Integer> set) {
            this.read = i;
            onEmsgLeafAtomRead<Integer> onemsgleafatomreadRemoteActionCompatParcelizer = onEmsgLeafAtomRead.RemoteActionCompatParcelizer((Collection) set);
            this.RemoteActionCompatParcelizer = onemsgleafatomreadRemoteActionCompatParcelizer;
            getCurrentSampleFlags<Integer> it = onemsgleafatomreadRemoteActionCompatParcelizer.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.AudioAttributesCompatParcelizer = iMax;
        }

        public read(int i, int i2) {
            this.read = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.RemoteActionCompatParcelizer = null;
        }

        public final boolean AudioAttributesCompatParcelizer(int i) {
            if (this.RemoteActionCompatParcelizer == null) {
                return i <= this.AudioAttributesCompatParcelizer;
            }
            int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i);
            if (iRemoteActionCompatParcelizer == 0) {
                return false;
            }
            return this.RemoteActionCompatParcelizer.contains(Integer.valueOf(iRemoteActionCompatParcelizer));
        }

        public final int IconCompatParcelizer(int i, JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
            if (this.RemoteActionCompatParcelizer != null) {
                return this.AudioAttributesCompatParcelizer;
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
                return IconCompatParcelizer.IconCompatParcelizer(this.read, i, jsonIntegerFormatVisitor);
            }
            return ((Integer) buildTypeSerializer.IconCompatParcelizer(modifyMapSerializer.IconCompatParcelizer.getOrDefault(Integer.valueOf(this.read), 0))).intValue();
        }

        private static onEmsgLeafAtomRead<Integer> write() {
            onEmsgLeafAtomRead.IconCompatParcelizer iconCompatParcelizer = new onEmsgLeafAtomRead.IconCompatParcelizer();
            for (int i = 1; i <= 10; i++) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(Integer.valueOf(LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i)));
            }
            return iconCompatParcelizer.write();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return this.read == readVar.read && this.AudioAttributesCompatParcelizer == readVar.AudioAttributesCompatParcelizer && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, readVar.RemoteActionCompatParcelizer);
        }

        public final int hashCode() {
            int i = this.read;
            int i2 = this.AudioAttributesCompatParcelizer;
            onEmsgLeafAtomRead<Integer> onemsgleafatomread = this.RemoteActionCompatParcelizer;
            return (((i * 31) + i2) * 31) + (onemsgleafatomread == null ? 0 : onemsgleafatomread.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioProfile[format=");
            sb.append(this.read);
            sb.append(", maxChannelCount=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", channelMasks=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append("]");
            return sb.toString();
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public static boolean read(AudioManager audioManager, modifySerializer modifyserializer) {
            AudioDeviceInfo[] devices;
            if (modifyserializer == null) {
                devices = ((AudioManager) buildTypeSerializer.IconCompatParcelizer(audioManager)).getDevices(2);
            } else {
                devices = new AudioDeviceInfo[]{modifyserializer.IconCompatParcelizer};
            }
            onEmsgLeafAtomRead<Integer> onemsgleafatomreadAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (onemsgleafatomreadAudioAttributesCompatParcelizer.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }

        private static onEmsgLeafAtomRead<Integer> AudioAttributesCompatParcelizer() {
            onEmsgLeafAtomRead.IconCompatParcelizer iconCompatParcelizer = new onEmsgLeafAtomRead.IconCompatParcelizer().read(8, 7);
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 31) {
                iconCompatParcelizer.read(26, 27);
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 33) {
                iconCompatParcelizer.RemoteActionCompatParcelizer(30);
            }
            return iconCompatParcelizer.write();
        }
    }

    static final class IconCompatParcelizer {
        public static initExtraTracks<Integer> RemoteActionCompatParcelizer(JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
            initExtraTracks.IconCompatParcelizer iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver = initExtraTracks.MediaBrowserCompatCustomActionResultReceiver();
            getCurrentSampleFlags<Integer> it = modifyMapSerializer.IconCompatParcelizer.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= LaissezFaireSubTypeValidator.read(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(OpusUtil.SAMPLE_RATE).build(), jsonIntegerFormatVisitor.RemoteActionCompatParcelizer().IconCompatParcelizer)) {
                    iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(Integer.valueOf(iIntValue));
                }
            }
            iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.read(2);
            return iconCompatParcelizerMediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        }

        public static int IconCompatParcelizer(int i, int i2, JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
            for (int i3 = 10; i3 > 0; i3--) {
                int iRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(i3);
                if (iRemoteActionCompatParcelizer != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iRemoteActionCompatParcelizer).build(), jsonIntegerFormatVisitor.RemoteActionCompatParcelizer().IconCompatParcelizer)) {
                    return i3;
                }
            }
            return 0;
        }
    }

    static final class RemoteActionCompatParcelizer {
        public static modifyMapSerializer read(AudioManager audioManager, JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
            return new modifyMapSerializer(modifyMapSerializer.IconCompatParcelizer(audioManager.getDirectProfilesForAttributes(jsonIntegerFormatVisitor.RemoteActionCompatParcelizer().IconCompatParcelizer)), (byte) 0);
        }

        public static modifySerializer AudioAttributesCompatParcelizer(AudioManager audioManager, JsonIntegerFormatVisitor jsonIntegerFormatVisitor) {
            try {
                List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) buildTypeSerializer.IconCompatParcelizer(audioManager)).getAudioDevicesForAttributes(jsonIntegerFormatVisitor.RemoteActionCompatParcelizer().IconCompatParcelizer);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new modifySerializer(audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }
}
