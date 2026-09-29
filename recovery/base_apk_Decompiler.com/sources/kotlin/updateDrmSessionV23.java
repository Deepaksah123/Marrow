package kotlin;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.session.PerfSession;
import java.util.concurrent.Executor;
import kotlin.MediaCodecSelectorExternalSyntheticLambda0;
import kotlin.parseSpliceTime;

/* JADX INFO: loaded from: classes5.dex */
public class updateDrmSessionV23 {
    public updateDrmSessionV23(FirebaseApp firebaseApp, MotionPhotoMetadata1 motionPhotoMetadata1, TrackTransformation trackTransformation, Executor executor) {
        Context contextAudioAttributesCompatParcelizer = firebaseApp.AudioAttributesCompatParcelizer();
        maybeInitCodecOrBypass.IconCompatParcelizer().read(contextAudioAttributesCompatParcelizer);
        getCodecOutputMediaFormat getcodecoutputmediaformatRemoteActionCompatParcelizer = getCodecOutputMediaFormat.RemoteActionCompatParcelizer();
        getcodecoutputmediaformatRemoteActionCompatParcelizer.IconCompatParcelizer(contextAudioAttributesCompatParcelizer);
        getcodecoutputmediaformatRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new flushOrReinitializeCodec());
        if (trackTransformation != null) {
            MediaCodecSelectorExternalSyntheticLambda0 mediaCodecSelectorExternalSyntheticLambda0IconCompatParcelizer = MediaCodecSelectorExternalSyntheticLambda0.IconCompatParcelizer();
            mediaCodecSelectorExternalSyntheticLambda0IconCompatParcelizer.RemoteActionCompatParcelizer(contextAudioAttributesCompatParcelizer);
            executor.execute(new MediaCodecSelectorExternalSyntheticLambda0.AudioAttributesCompatParcelizer(mediaCodecSelectorExternalSyntheticLambda0IconCompatParcelizer));
        }
        motionPhotoMetadata1.AudioAttributesCompatParcelizer(new parseSpliceTime() { // from class: o.updateDrmSessionV23.4
            @Override // kotlin.parseSpliceTime
            public final boolean RemoteActionCompatParcelizer() {
                return false;
            }

            @Override // kotlin.parseSpliceTime
            public final void AudioAttributesCompatParcelizer(parseSpliceTime.write writeVar) {
                getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(PerfSession.AudioAttributesCompatParcelizer(writeVar.write()));
            }

            @Override // kotlin.parseSpliceTime
            public final parseSpliceTime.read IconCompatParcelizer() {
                return parseSpliceTime.read.PERFORMANCE;
            }
        });
        getDecoderInfosInternal.RemoteActionCompatParcelizer().write();
    }
}
