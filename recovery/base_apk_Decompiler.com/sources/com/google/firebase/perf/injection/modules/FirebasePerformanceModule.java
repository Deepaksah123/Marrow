package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import kotlin.ChapterTocFrame1;
import kotlin.DrmUtilApi18;
import kotlin.getDecoderInfosInternal;
import kotlin.hasSamples;
import kotlin.maybeInitCodecOrBypass;
import kotlin.onInputBufferAvailable;
import kotlin.onProcessedOutputBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class FirebasePerformanceModule {
    private final onInputBufferAvailable<DrmUtilApi18> AudioAttributesCompatParcelizer;
    private final hasSamples IconCompatParcelizer;
    private final onInputBufferAvailable<ChapterTocFrame1> read;
    private final FirebaseApp write;

    public FirebasePerformanceModule(FirebaseApp firebaseApp, hasSamples hassamples, onInputBufferAvailable<ChapterTocFrame1> oninputbufferavailable, onInputBufferAvailable<DrmUtilApi18> oninputbufferavailable2) {
        this.write = firebaseApp;
        this.IconCompatParcelizer = hassamples;
        this.read = oninputbufferavailable;
        this.AudioAttributesCompatParcelizer = oninputbufferavailable2;
    }

    public FirebaseApp write() {
        return this.write;
    }

    public hasSamples read() {
        return this.IconCompatParcelizer;
    }

    public onInputBufferAvailable<ChapterTocFrame1> IconCompatParcelizer() {
        return this.read;
    }

    public onInputBufferAvailable<DrmUtilApi18> AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public onProcessedOutputBuffer AudioAttributesCompatParcelizer() {
        return onProcessedOutputBuffer.write();
    }

    public maybeInitCodecOrBypass RemoteActionCompatParcelizer() {
        return maybeInitCodecOrBypass.IconCompatParcelizer();
    }

    public getDecoderInfosInternal MediaBrowserCompatItemReceiver() {
        return getDecoderInfosInternal.RemoteActionCompatParcelizer();
    }
}
