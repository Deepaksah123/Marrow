package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.setMediaItems;

/* JADX INFO: loaded from: classes2.dex */
public final class getState {
    private final List<isSourceReady> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private getState(List<? extends isSourceReady> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getState(Bundleable bundleable) {
        this((List<? extends isSourceReady>) IntermediateLoginResponseBody.read(new getReadingPositionUs(bundleable.AudioAttributesCompatParcelizer()), new handleMessage(bundleable.getRead()), new onPositionReset(bundleable.RemoteActionCompatParcelizer()), new hasReadStreamToEnd(bundleable.read()), new onRendererCapabilitiesChanged(bundleable.read()), new isCurrentStreamFinal(bundleable.read()), new maybeThrowStreamError(bundleable.read()), getTrackType.AudioAttributesCompatParcelizer(bundleable.getRemoteActionCompatParcelizer())));
        toMagicModuleMetaRepoModel.write(bundleable, "");
    }

    public static final class IconCompatParcelizer implements NewNumberOtpResendRequest<setMediaItems> {
        final /* synthetic */ NewNumberOtpResendRequest[] IconCompatParcelizer;

        /* JADX INFO: renamed from: o.getState$IconCompatParcelizer$3, reason: invalid class name */
        public static final class AnonymousClass3 extends getMagicModuleStats implements getModuleData<getValidationToken<? super setMediaItems>, setMediaItems[], SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ Object AudioAttributesCompatParcelizer;
            private /* synthetic */ Object IconCompatParcelizer;
            private int read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                setMediaItems.read readVar;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.read;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    getValidationToken getvalidationtoken = (getValidationToken) this.IconCompatParcelizer;
                    AnonymousClass3 anonymousClass3 = this;
                    setMediaItems[] setmediaitemsArr = (setMediaItems[]) ((Object[]) this.AudioAttributesCompatParcelizer);
                    int length = setmediaitemsArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            readVar = null;
                            break;
                        }
                        readVar = setmediaitemsArr[i2];
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readVar, setMediaItems.read.INSTANCE)) {
                            break;
                        }
                        i2++;
                    }
                    if (readVar == null) {
                        readVar = setMediaItems.read.INSTANCE;
                    }
                    this.read = 1;
                    if (getvalidationtoken.IconCompatParcelizer(readVar, anonymousClass3) == objIconCompatParcelizer) {
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

            public AnonymousClass3(SampleVideos sampleVideos) {
                super(3, sampleVideos);
            }

            @Override // kotlin.getModuleData
            public final /* bridge */ /* synthetic */ Object AudioAttributesCompatParcelizer(getValidationToken<? super setMediaItems> getvalidationtoken, setMediaItems[] setmediaitemsArr, SampleVideos<? super getShowPopup> sampleVideos) {
                return AudioAttributesCompatParcelizer(getvalidationtoken, setmediaitemsArr, sampleVideos);
            }

            private static Object AudioAttributesCompatParcelizer(getValidationToken<? super setMediaItems> getvalidationtoken, setMediaItems[] setmediaitemsArr, SampleVideos<? super getShowPopup> sampleVideos) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(sampleVideos);
                anonymousClass3.IconCompatParcelizer = getvalidationtoken;
                anonymousClass3.AudioAttributesCompatParcelizer = setmediaitemsArr;
                return anonymousClass3.invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        public IconCompatParcelizer(NewNumberOtpResendRequest[] newNumberOtpResendRequestArr) {
            this.IconCompatParcelizer = newNumberOtpResendRequestArr;
        }

        @Override // kotlin.NewNumberOtpResendRequest
        public final Object write(getValidationToken<? super setMediaItems> getvalidationtoken, SampleVideos sampleVideos) {
            NewNumberOtpResendRequest[] newNumberOtpResendRequestArr = this.IconCompatParcelizer;
            final NewNumberOtpResendRequest[] newNumberOtpResendRequestArr2 = this.IconCompatParcelizer;
            Object objIconCompatParcelizer = getPauseCount.IconCompatParcelizer(getvalidationtoken, newNumberOtpResendRequestArr, new getCreatedOnDateMs<setMediaItems[]>() { // from class: o.getState.IconCompatParcelizer.5
                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.getCreatedOnDateMs
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public setMediaItems[] invoke() {
                    return new setMediaItems[newNumberOtpResendRequestArr2.length];
                }
            }, new AnonymousClass3(null), sampleVideos);
            return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
        }
    }

    public final NewNumberOtpResendRequest<setMediaItems> read(CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy) {
        toMagicModuleMetaRepoModel.write(cVideoChangeFrameRateStrategy, "");
        List<isSourceReady> list = this.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((isSourceReady) obj).write(cVideoChangeFrameRateStrategy)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((isSourceReady) it.next()).AudioAttributesCompatParcelizer(cVideoChangeFrameRateStrategy.AudioAttributesCompatParcelizer));
        }
        return VerifyNewNumberRequest.read((NewNumberOtpResendRequest) new IconCompatParcelizer((NewNumberOtpResendRequest[]) IntermediateLoginResponseBody.onPlay(arrayList3).toArray(new NewNumberOtpResendRequest[0])));
    }
}
