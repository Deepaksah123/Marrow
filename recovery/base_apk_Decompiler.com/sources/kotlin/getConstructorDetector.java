package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0003\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH¦@¢\u0006\u0004\b\u0005\u0010\rJB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0003\u001a\u00020\b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\tH¦@¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/getConstructorDetector;", "Lo/bufferMapProperty;", "Lo/_shapeForToken;", "p0", "Lo/DeserializationContext;", "read", "(Lo/_shapeForToken;Lo/SampleVideos;)Ljava/lang/Object;", "T", "", "Lkotlin/Function2;", "Lo/SampleVideos;", "", "p1", "(JLo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "write", "Lo/getKey;", "RemoteActionCompatParcelizer", "()J", "Lo/calloc;", "AudioAttributesCompatParcelizer", "()Lo/DeserializationContext;", "Lo/CoercionConfig;", "AudioAttributesImplApi26Parcelizer", "()Lo/CoercionConfig;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getConstructorDetector extends bufferMapProperty {
    CoercionConfig AudioAttributesImplApi26Parcelizer();

    long RemoteActionCompatParcelizer();

    Object read(_shapeForToken _shapefortoken, SampleVideos<? super DeserializationContext> sampleVideos);

    DeserializationContext write();

    default long read() {
        return calloc.INSTANCE.AudioAttributesCompatParcelizer();
    }

    static /* synthetic */ Object read$default(getConstructorDetector getconstructordetector, _shapeForToken _shapefortoken, SampleVideos sampleVideos, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            _shapefortoken = _shapeForToken.AudioAttributesCompatParcelizer;
        }
        return getconstructordetector.read(_shapefortoken, sampleVideos);
    }

    static /* synthetic */ <T> Object AudioAttributesCompatParcelizer(getConstructorDetector getconstructordetector, long j, MagicModuleSubmissionRequestBody<? super getConstructorDetector, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super T> sampleVideos) {
        return magicModuleSubmissionRequestBody.invoke(getconstructordetector, sampleVideos);
    }

    static /* synthetic */ <T> Object read(getConstructorDetector getconstructordetector, long j, MagicModuleSubmissionRequestBody<? super getConstructorDetector, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super T> sampleVideos) {
        return magicModuleSubmissionRequestBody.invoke(getconstructordetector, sampleVideos);
    }

    default <T> Object write(long j, MagicModuleSubmissionRequestBody<? super getConstructorDetector, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super T> sampleVideos) {
        return read(this, j, magicModuleSubmissionRequestBody, sampleVideos);
    }

    default <T> Object read(long j, MagicModuleSubmissionRequestBody<? super getConstructorDetector, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super T> sampleVideos) {
        return AudioAttributesCompatParcelizer(this, j, magicModuleSubmissionRequestBody, sampleVideos);
    }
}
