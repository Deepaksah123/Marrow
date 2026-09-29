package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class AudioProcessingPipeline {
    private final initExtraTracks<AudioProcessor> audioProcessors;
    private final List<AudioProcessor> activeAudioProcessors = new ArrayList();
    private ByteBuffer[] outputBuffers = new ByteBuffer[0];
    private AudioProcessor.AudioFormat outputAudioFormat = AudioProcessor.AudioFormat.NOT_SET;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat = AudioProcessor.AudioFormat.NOT_SET;
    private boolean inputEnded = false;

    public AudioProcessingPipeline(initExtraTracks<AudioProcessor> initextratracks) {
        this.audioProcessors = initextratracks;
    }

    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.equals(AudioProcessor.AudioFormat.NOT_SET)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i);
            AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
            if (audioProcessor.isActive()) {
                Assertions.checkState(!audioFormatConfigure.equals(AudioProcessor.AudioFormat.NOT_SET));
                audioFormat = audioFormatConfigure;
            }
        }
        this.pendingOutputAudioFormat = audioFormat;
        return audioFormat;
    }

    public final void flush() {
        this.activeAudioProcessors.clear();
        this.outputAudioFormat = this.pendingOutputAudioFormat;
        this.inputEnded = false;
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                this.activeAudioProcessors.add(audioProcessor);
            }
        }
        this.outputBuffers = new ByteBuffer[this.activeAudioProcessors.size()];
        for (int i2 = 0; i2 <= getFinalOutputBufferIndex(); i2++) {
            this.outputBuffers[i2] = this.activeAudioProcessors.get(i2).getOutput();
        }
    }

    public final AudioProcessor.AudioFormat getOutputAudioFormat() {
        return this.outputAudioFormat;
    }

    public final boolean isOperational() {
        return !this.activeAudioProcessors.isEmpty();
    }

    public final void queueInput(ByteBuffer byteBuffer) {
        if (!isOperational() || this.inputEnded) {
            return;
        }
        processData(byteBuffer);
    }

    public final ByteBuffer getOutput() {
        if (!isOperational()) {
            return AudioProcessor.EMPTY_BUFFER;
        }
        ByteBuffer byteBuffer = this.outputBuffers[getFinalOutputBufferIndex()];
        if (!byteBuffer.hasRemaining()) {
            processData(AudioProcessor.EMPTY_BUFFER);
        }
        return byteBuffer;
    }

    public final void queueEndOfStream() {
        if (!isOperational() || this.inputEnded) {
            return;
        }
        this.inputEnded = true;
        this.activeAudioProcessors.get(0).queueEndOfStream();
    }

    public final boolean isEnded() {
        return this.inputEnded && this.activeAudioProcessors.get(getFinalOutputBufferIndex()).isEnded() && !this.outputBuffers[getFinalOutputBufferIndex()].hasRemaining();
    }

    public final void reset() {
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            AudioProcessor audioProcessor = this.audioProcessors.get(i);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.outputBuffers = new ByteBuffer[0];
        this.outputAudioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingOutputAudioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.inputEnded = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) obj;
        if (this.audioProcessors.size() != audioProcessingPipeline.audioProcessors.size()) {
            return false;
        }
        for (int i = 0; i < this.audioProcessors.size(); i++) {
            if (this.audioProcessors.get(i) != audioProcessingPipeline.audioProcessors.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.audioProcessors.hashCode();
    }

    private void processData(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            z = false;
            for (int i = 0; i <= getFinalOutputBufferIndex(); i++) {
                if (!this.outputBuffers[i].hasRemaining()) {
                    AudioProcessor audioProcessor = this.activeAudioProcessors.get(i);
                    if (audioProcessor.isEnded()) {
                        if (!this.outputBuffers[i].hasRemaining() && i < getFinalOutputBufferIndex()) {
                            this.activeAudioProcessors.get(i + 1).queueEndOfStream();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.outputBuffers[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.EMPTY_BUFFER;
                        }
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.queueInput(byteBuffer2);
                        this.outputBuffers[i] = audioProcessor.getOutput();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.outputBuffers[i].hasRemaining();
                    }
                }
            }
        } while (z);
    }

    private int getFinalOutputBufferIndex() {
        return this.outputBuffers.length - 1;
    }
}
