package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getTappableElementInsets;
import kotlin.isVisible;
import kotlin.setOverriddenInsets;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015"}, d2 = {"Lo/Shimmer;", "Lo/onDetachedFromWindow;", "Lo/assignParameter;", "p0", "p1", "p2", "p3", "<init>", "(FFFFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/inset;", "Lo/parseDouble;", "RemoteActionCompatParcelizer", "(Lo/inset;Lo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "write", "F", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Shimmer implements onDetachedFromWindow {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;
    private final float RemoteActionCompatParcelizer;
    private final float read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    private Shimmer(float f, float f2, float f3, float f4) {
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.read = f4;
    }

    @Override // kotlin.onDetachedFromWindow
    public final parseDouble<assignParameter> RemoteActionCompatParcelizer(inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        _handleunrecognizedcharacterescape.IconCompatParcelizer(-478475335);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-478475335, i, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:259)");
        }
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(insetVar)) || (i & 6) == 4;
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (z || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new onLayout(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        onLayout onlayout = (onLayout) objOnPause;
        boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(onlayout);
        boolean z2 = (((i & 112) ^ 48) > 32 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(this)) || (i & 48) == 32;
        Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer | z2) || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause2 = (MagicModuleSubmissionRequestBody) new write(onlayout, this, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
        }
        StreamReadException.IconCompatParcelizer(this, (MagicModuleSubmissionRequestBody) objOnPause2, _handleunrecognizedcharacterescape, (i >> 3) & 14);
        boolean z3 = (i3 > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(insetVar)) || (i & 6) == 4;
        boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(onlayout);
        Object objOnPause3 = _handleunrecognizedcharacterescape.onPause();
        if ((zIconCompatParcelizer2 | z3) || objOnPause3 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause3 = (MagicModuleSubmissionRequestBody) new read(insetVar, onlayout, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause3);
        }
        StreamReadException.IconCompatParcelizer(insetVar, (MagicModuleSubmissionRequestBody) objOnPause3, _handleunrecognizedcharacterescape, i2);
        parseDouble<assignParameter> parsedoubleWrite = onlayout.write();
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
        return parsedoubleWrite;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ onLayout AudioAttributesCompatParcelizer;
        int IconCompatParcelizer;
        final /* synthetic */ Shimmer RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer, this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer.read, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(onLayout onlayout, Shimmer shimmer, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = onlayout;
            this.RemoteActionCompatParcelizer = shimmer;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int AudioAttributesCompatParcelizer;
        final /* synthetic */ onLayout IconCompatParcelizer;
        final /* synthetic */ inset RemoteActionCompatParcelizer;
        private /* synthetic */ Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final TopUserCompanion topUserCompanion = (TopUserCompanion) this.write;
                final ArrayList arrayList = new ArrayList();
                NewNumberOtpResendRequest<isRound> newNumberOtpResendRequestAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                final onLayout onlayout = this.IconCompatParcelizer;
                this.AudioAttributesCompatParcelizer = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.Shimmer.read.4
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public final Object IconCompatParcelizer(isRound isround, SampleVideos<? super getShowPopup> sampleVideos) {
                        if (isround instanceof isVisible.read) {
                            arrayList.add(isround);
                        } else if (isround instanceof isVisible.IconCompatParcelizer) {
                            arrayList.remove(((isVisible.IconCompatParcelizer) isround).getWrite());
                        } else if (isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
                            arrayList.add(isround);
                        } else if (isround instanceof getTappableElementInsets.AudioAttributesCompatParcelizer) {
                            arrayList.remove(((getTappableElementInsets.AudioAttributesCompatParcelizer) isround).getRemoteActionCompatParcelizer());
                        } else if (isround instanceof setOverriddenInsets.read) {
                            arrayList.add(isround);
                        } else if (isround instanceof setOverriddenInsets.write) {
                            arrayList.remove(((setOverriddenInsets.write) isround).getRead());
                        } else if (isround instanceof setOverriddenInsets.IconCompatParcelizer) {
                            arrayList.remove(((setOverriddenInsets.IconCompatParcelizer) isround).getRemoteActionCompatParcelizer());
                        }
                        C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new C00474(onlayout, (isRound) IntermediateLoginResponseBody.MediaMetadataCompat((List) arrayList), null), 3);
                        return getShowPopup.INSTANCE;
                    }

                    /* JADX INFO: renamed from: o.Shimmer$read$4$4, reason: invalid class name and collision with other inner class name */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    static final class C00474 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                        int AudioAttributesCompatParcelizer;
                        final /* synthetic */ onLayout read;
                        final /* synthetic */ isRound write;

                        @Override // kotlin.getMonthName
                        public final Object invokeSuspend(Object obj) {
                            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                            int i = this.AudioAttributesCompatParcelizer;
                            if (i == 0) {
                                SdkPayloadData.IconCompatParcelizer(obj);
                                this.AudioAttributesCompatParcelizer = 1;
                                if (this.read.RemoteActionCompatParcelizer(this.write, this) == objIconCompatParcelizer) {
                                    return objIconCompatParcelizer;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                SdkPayloadData.IconCompatParcelizer(obj);
                            }
                            return getShowPopup.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00474(onLayout onlayout, isRound isround, SampleVideos<? super C00474> sampleVideos) {
                            super(2, sampleVideos);
                            this.read = onlayout;
                            this.write = isround;
                        }

                        @Override // kotlin.getMonthName
                        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                            return new C00474(this.read, this.write, sampleVideos);
                        }

                        @Override // kotlin.MagicModuleSubmissionRequestBody
                        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                            return ((C00474) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                        }
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(inset insetVar, onLayout onlayout, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = insetVar;
            this.IconCompatParcelizer = onlayout;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = new read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
            readVar.write = obj;
            return readVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Shimmer)) {
            return false;
        }
        Shimmer shimmer = (Shimmer) p0;
        if (assignParameter.IconCompatParcelizer(this.IconCompatParcelizer, shimmer.IconCompatParcelizer) && assignParameter.IconCompatParcelizer(this.RemoteActionCompatParcelizer, shimmer.RemoteActionCompatParcelizer) && assignParameter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, shimmer.AudioAttributesCompatParcelizer)) {
            return assignParameter.IconCompatParcelizer(this.read, shimmer.read);
        }
        return false;
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = assignParameter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        return (((((iAudioAttributesCompatParcelizer * 31) + assignParameter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.read);
    }

    public /* synthetic */ Shimmer(float f, float f2, float f3, float f4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2, f3, f4);
    }
}
