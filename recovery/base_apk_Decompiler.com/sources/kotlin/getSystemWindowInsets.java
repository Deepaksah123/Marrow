package kotlin;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.getTappableElementInsets;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/inset;", "Lo/parseDouble;", "", "AudioAttributesCompatParcelizer", "(Lo/inset;Lo/_handleUnrecognizedCharacterEscape;I)Lo/parseDouble;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSystemWindowInsets {
    public static final parseDouble<Boolean> AudioAttributesCompatParcelizer(inset insetVar, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-1805515472, i, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:63)");
        }
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = available.RemoteActionCompatParcelizer$default(Boolean.FALSE, null, 2, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        InputAccessor inputAccessor = (InputAccessor) objOnPause;
        int i2 = i & 14;
        boolean z = ((i2 ^ 6) > 4 && _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(insetVar)) || (i & 6) == 4;
        IconCompatParcelizer iconCompatParcelizerOnPause = _handleunrecognizedcharacterescape.onPause();
        if (z || iconCompatParcelizerOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            iconCompatParcelizerOnPause = new IconCompatParcelizer(insetVar, inputAccessor, null);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(iconCompatParcelizerOnPause);
        }
        StreamReadException.IconCompatParcelizer(insetVar, (MagicModuleSubmissionRequestBody) iconCompatParcelizerOnPause, _handleunrecognizedcharacterescape, i2);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return inputAccessor;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ inset AudioAttributesCompatParcelizer;
        final /* synthetic */ InputAccessor<Boolean> read;
        int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                final ArrayList arrayList = new ArrayList();
                NewNumberOtpResendRequest<isRound> newNumberOtpResendRequestAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
                final InputAccessor<Boolean> inputAccessor = this.read;
                this.write = 1;
                if (newNumberOtpResendRequestAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.getSystemWindowInsets.IconCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
                    public final Object IconCompatParcelizer(isRound isround, SampleVideos<? super getShowPopup> sampleVideos) {
                        if (isround instanceof getTappableElementInsets.RemoteActionCompatParcelizer) {
                            arrayList.add(isround);
                        } else if (isround instanceof getTappableElementInsets.AudioAttributesCompatParcelizer) {
                            arrayList.remove(((getTappableElementInsets.AudioAttributesCompatParcelizer) isround).getRemoteActionCompatParcelizer());
                        }
                        inputAccessor.write(QBankStatsResponse.AudioAttributesCompatParcelizer(!arrayList.isEmpty()));
                        return getShowPopup.INSTANCE;
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
        IconCompatParcelizer(inset insetVar, InputAccessor<Boolean> inputAccessor, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = insetVar;
            this.read = inputAccessor;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }
}
