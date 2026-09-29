package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioSink;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/google/android/exoplayer2/audio/MarrowAudioSink;", "Lcom/google/android/exoplayer2/audio/ForwardingAudioSink;", "Lcom/google/android/exoplayer2/audio/AudioSink;", "p0", "", "p1", "<init>", "(Lcom/google/android/exoplayer2/audio/AudioSink;I)V", "Lcom/google/android/exoplayer2/Format;", "", "p2", "", "configure", "(Lcom/google/android/exoplayer2/Format;I[I)V", "sink", "Lcom/google/android/exoplayer2/audio/AudioSink;", "bufferMultiplier", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MarrowAudioSink extends ForwardingAudioSink {
    private final int bufferMultiplier;
    private final AudioSink sink;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarrowAudioSink(AudioSink audioSink, int i) {
        super(audioSink);
        toMagicModuleMetaRepoModel.write(audioSink, "");
        this.sink = audioSink;
        this.bufferMultiplier = i;
    }

    @Override // com.google.android.exoplayer2.audio.ForwardingAudioSink, com.google.android.exoplayer2.audio.AudioSink
    public final void configure(Format p0, int p1, int[] p2) throws AudioSink.ConfigurationException {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.sink.configure(p0, p1 * this.bufferMultiplier, p2);
    }
}
