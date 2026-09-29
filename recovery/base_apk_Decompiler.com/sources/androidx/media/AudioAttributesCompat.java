package androidx.media;

import android.media.AudioAttributes;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import kotlin.getApplicationInfo;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesCompat implements getApplicationInfo {
    private static final int[] AudioAttributesCompatParcelizer;
    private static final SparseIntArray RemoteActionCompatParcelizer;
    static boolean read;
    public AudioAttributesImpl write;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        RemoteActionCompatParcelizer = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        AudioAttributesCompatParcelizer = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.write = audioAttributesImpl;
    }

    public static AudioAttributesCompat write(Object obj) {
        if (read) {
            return null;
        }
        return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
    }

    public static class read {
        final AudioAttributesImpl.write AudioAttributesCompatParcelizer;

        public read() {
            if (AudioAttributesCompat.read) {
                this.AudioAttributesCompatParcelizer = new AudioAttributesImplBase.write();
            } else {
                this.AudioAttributesCompatParcelizer = new AudioAttributesImplApi26.read();
            }
        }

        public AudioAttributesCompat read() {
            return new AudioAttributesCompat(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        }

        public read write(int i) {
            this.AudioAttributesCompatParcelizer.read(i);
            return this;
        }
    }

    public int hashCode() {
        return this.write.hashCode();
    }

    public String toString() {
        return this.write.toString();
    }

    static String write(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage ".concat(String.valueOf(i));
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    static int write(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        }
        if ((i & 4) == 4) {
            return z ? 0 : 6;
        }
        switch (i2) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z) {
                    return 3;
                }
                StringBuilder sb = new StringBuilder("Unknown usage value ");
                sb.append(i2);
                sb.append(" in audio attributes");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.write;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.write == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.write);
    }
}
