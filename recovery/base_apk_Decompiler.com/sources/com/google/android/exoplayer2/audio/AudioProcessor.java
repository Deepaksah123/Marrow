package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.parseSmta;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    AudioFormat configure(AudioFormat audioFormat) throws UnhandledAudioFormatException;

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();

    public static final class AudioFormat {
        public static final AudioFormat NOT_SET = new AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(int i, int i2, int i3) {
            this.sampleRate = i;
            this.channelCount = i2;
            this.encoding = i3;
            this.bytesPerFrame = Util.isEncodingLinearPcm(i3) ? Util.getPcmFrameSize(i3, i2) : -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.sampleRate);
            sb.append(", channelCount=");
            sb.append(this.channelCount);
            sb.append(", encoding=");
            sb.append(this.encoding);
            sb.append(']');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.encoding == audioFormat.encoding;
        }

        public final int hashCode() {
            return parseSmta.read(Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelCount), Integer.valueOf(this.encoding));
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }

        public UnhandledAudioFormatException(String str, AudioFormat audioFormat) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(audioFormat);
            super(sb.toString());
        }
    }
}
